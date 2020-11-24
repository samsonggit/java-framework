package sam.java.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ַ��������

Java�ṩ��FileWriter��FileReader���ַ����Ķ�д��new FileWriter��ͬ��new OutputStreamWriter(new FileOutputStream(file, true))
 */
public class FileWriter_FileReader {
	
	public static void write(File file) throws IOException {
		FileWriter fw = new FileWriter(file, true);

		// Ҫд����ַ���
		String string = "We will we will rock you!";
		fw.write(string);
		fw.close();
	}

	public static String read(File file) throws IOException {
		FileReader fr = new FileReader(file);
		// һ����ȡ���ٸ��ֽ�
		char[] chars = new char[1024];
		// �������ն�ȡ���ֽ�����
		StringBuilder sb = new StringBuilder();
		// ��ȡ�����ֽ����鳤�ȣ�Ϊ-1ʱ��ʾû������
		int length;
		// ѭ��ȡ����
		while ((length = fr.read(chars)) != -1) {
			// ����ȡ������ת�����ַ���
			sb.append(chars, 0, length);
		}
		// �ر���
		fr.close();

		return sb.toString();
	}
}