package sam.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * InputStreamReader��OutputStreamWriter���ַ�����

�ַ����������ı��ļ��Ķ�д��������ʾָ���ַ���. OutputStreamWriter����ʵҲ�ǽ���FileOutputStream��ʵ�ֵģ����乹�췽����FileOutputStream�Ķ���
 */
public class InputStreamReader_OutputStreamWriter {
	
	public static void write(File file) throws IOException {
		// OutputStreamWriter������ʾָ���ַ���������ʹ��Ĭ���ַ���
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8");

		// Ҫд����ַ���
		String string = "We will we will rock you.";
		osw.write(string);
		osw.close();
	}

	public static String read(File file) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8");
		// �ַ����飺һ�ζ�ȡ���ٸ��ַ�
		char[] chars = new char[1024];
		// ÿ�ζ�ȡ���ַ�������append��StringBuilder��
		StringBuilder sb = new StringBuilder();
		// ��ȡ�����ַ����鳤�ȣ�Ϊ-1ʱ��ʾû������
		int length;
		// ѭ��ȡ����
		while ((length = isr.read(chars)) != -1) {
			// ����ȡ������ת�����ַ���
			sb.append(chars, 0, length);
		}
		// �ر���
		isr.close();

		return sb.toString();
	}
}