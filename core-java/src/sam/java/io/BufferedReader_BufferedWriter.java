package sam.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * BufferedReader��BufferedWriter���ַ���������
 */
public class BufferedReader_BufferedWriter {
	
	public static void main(String[] args) throws IOException {
		File file = new File("D:/test.txt");
		write(file);
		System.out.println(read(file));
	}

	public static void write(File file) throws IOException {
		// BufferedWriter fw = new BufferedWriter(new OutputStreamWriter(new
		// FileOutputStream(file, true), "UTF-8"));
		// FileWriter���Դ���ȼ򻯴���
		BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));

		// Ҫд����ַ���
		String string = "We will we will rock you!";
		bw.write(string);
		bw.close();
	}

	public static String read(File file) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));
		// �������ն�ȡ���ֽ�����
		StringBuilder sb = new StringBuilder();

		// ���ж�����
		String line;
		// ѭ��ȡ����
		while ((line = br.readLine()) != null) {
			// ����ȡ������ת�����ַ���
			sb.append(line);
		}
		// �ر���
		br.close();

		return sb.toString();
	}
}