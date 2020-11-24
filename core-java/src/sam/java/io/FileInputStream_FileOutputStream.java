package sam.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


/*
 * FileInputStream��FileOutputStream���ֽ�����
�ֽ����ķ�ʽЧ�ʽϵͣ�������ʹ��
 */
public class FileInputStream_FileOutputStream {
	public static void main(String[] args) throws IOException {
		File file = new File("D:/test.txt");
		write(file);
		System.out.println(read(file));
	}

	public static void write(File file) throws IOException {
		OutputStream os = new FileOutputStream(file, true);

		// Ҫд����ַ���
		String string = "We will we will rock you!";
		// д���ļ�
		System.out.println(string.getBytes());
		os.write(string.getBytes());
		// �ر���
		os.close();
	}

	public static String read(File file) throws IOException {
		InputStream in = new FileInputStream(file);

		// һ����ȡ���ٸ��ֽ�
		byte[] bytes = new byte[1024];
		// �������ն�ȡ���ֽ�����
		StringBuilder sb = new StringBuilder();
		// ��ȡ�����ֽ����鳤�ȣ�Ϊ-1ʱ��ʾû������
		int length = 0;
		// ѭ��ȡ����
		while ((length = in.read(bytes)) != -1) {
			// ����ȡ������ת�����ַ���
			sb.append(new String(bytes, 0, length));
		}
		// �ر���
		in.close();

		return sb.toString();
	}
}