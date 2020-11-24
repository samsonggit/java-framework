package sam.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStream_BufferedOutputStream {

	public static void write(File file) throws IOException {
		// �����ֽ����������Ч��
		BufferedOutputStream bis = new BufferedOutputStream(new FileOutputStream(file, true));

		// Ҫд����ַ���
		String string = "We will we will rock you!";
		// д���ļ�
		bis.write(string.getBytes());
		// �ر���
		bis.close();
	}

	public static String read(File file) throws IOException {
		BufferedInputStream fis = new BufferedInputStream(new FileInputStream(file));

		// һ����ȡ���ٸ��ֽ�
		byte[] bytes = new byte[1024];
		// �������ն�ȡ���ֽ�����
		StringBuilder sb = new StringBuilder();
		// ��ȡ�����ֽ����鳤�ȣ�Ϊ-1ʱ��ʾû������
		int length = 0;
		// ѭ��ȡ����
		while ((length = fis.read(bytes)) != -1) {
			// ����ȡ������ת�����ַ���
			sb.append(new String(bytes, 0, length));
		}
		// �ر���
		fis.close();

		return sb.toString();
	}
}