package com.tianma.BI_Process.Util;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

import org.apache.commons.codec.binary.Base64;

public class EncodeUtil {
	/**
	 * 默认编码
	 */
	private final static String DEFAULT_CHARSET = "UTF-8";
	private final static String[] hexDigits = { "g", "h", "i", "j", "k", "l",
			"m", "n", "p", "o", "a", "b", "c", "d", "e", "f" };
	 /**
     * 加密/解密算法-工作模式-填充模式
     */
    private  final static String CIPHER_ALGORITHM = "DESede/CBC/PKCS5Padding";

	/**
	 * 生成3des key,随机生成一个24位的key值
	 *
	 * @return
	 */
	public static String createKey() {
		String key = "";
		for (int i = 0; i < 24; i++) {
			int j = ((Double) (Math.random() * 16)).intValue();
			key = key + hexDigits[j];
		}
		return key;
	}

	public static byte[] des3Encrypt(String message, String key)
			throws Exception {
//		Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
        Cipher cipher=Cipher.getInstance(CIPHER_ALGORITHM);
		DESedeKeySpec desKeySpec = new DESedeKeySpec(
				key.getBytes(DEFAULT_CHARSET));

		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DESede");
		SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
		IvParameterSpec iv = new IvParameterSpec(key.substring(0, 8).getBytes(
				DEFAULT_CHARSET));
		cipher.init(Cipher.ENCRYPT_MODE, secretKey, iv);

		return cipher.doFinal(message.getBytes(DEFAULT_CHARSET));
	}


	public static String des3Encrypt3Base64(String message)
			throws Exception {
		//创建key
		String key = createKey();
		String data = base64Encode(des3Encrypt(message, key));
		return base64Encode(key + data);
	}

	public static byte[] des3Decrypt(byte[] message, String key)
			throws Exception {
		Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
		DESedeKeySpec desKeySpec = new DESedeKeySpec(
				key.getBytes(DEFAULT_CHARSET));
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DESede");
		SecretKey secretKey = keyFactory.generateSecret(desKeySpec);
		IvParameterSpec iv = new IvParameterSpec(key.substring(0, 8).getBytes(
				DEFAULT_CHARSET));
		cipher.init(Cipher.DECRYPT_MODE, secretKey, iv);

		return cipher.doFinal(message);
	}

	public static String des3Decrypt3Base64(String message) throws Exception {
		String temp = base64Decode(message);
		if (temp != null) {
			return new String(des3Decrypt(base64DecodeToBytes(temp.substring(24)), temp.substring(0, 24)),
					DEFAULT_CHARSET);
		} else {
			return null;
		}
	}
	/**
	 * BASE64 编码.
	 *
	 * @param src
	 *            String inputed string
	 * @return String returned string
	 */
	public static String base64Encode(String src) {
		Base64 base64 = new Base64();
		return new String(base64.encode(src.getBytes()));
	}

	/**
	 * BASE64 编码(byte[]).
	 *
	 * @param src
	 *            byte[] inputed string
	 * @return String returned string
	 */
	public static String base64Encode(byte[] src) {
		Base64 base64 = new Base64();
		return new String(base64.encode(src));
	}

	/**
	 * BASE64 解码.
	 *
	 * @param src
	 *            String inputed string
	 * @return String returned string
	 */
	public static String base64Decode(String src) {
		Base64 base64 = new Base64();
		return new String(base64.decode(src.getBytes()));
	}

	/**
	 * BASE64 解码(to byte[]).
	 *
	 * @param src
	 *            String inputed string
	 * @return String returned string
	 */
	public static byte[] base64DecodeToBytes(String src) {
		Base64 base64 = new Base64();
		return base64.decode(src.getBytes());

	}


}
