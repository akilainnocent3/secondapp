package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/* JADX INFO: loaded from: classes8.dex */
public final class ms60 {
    public static String a(File file) {
        Certificate[] certificates;
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        JarFile jarFile = new JarFile(file);
        try {
            JarEntry jarEntry = jarFile.getJarEntry("AndroidManifest.xml");
            byte[] bArr = new byte[8192];
            try {
                InputStream inputStream = jarFile.getInputStream(jarEntry);
                while (inputStream.read(bArr, 0, 8192) != -1) {
                }
                inputStream.close();
                certificates = jarEntry != null ? jarEntry.getCertificates() : null;
            } catch (IOException unused) {
            }
            if (certificates != null) {
                for (Certificate certificate : certificates) {
                    byte[] encoded = certificate.getEncoded();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.reset();
                        messageDigest.update(encoded);
                        byte[] bArrDigest = messageDigest.digest();
                        int length = bArrDigest.length;
                        char[] cArr = new char[length * 2];
                        for (int i = 0; i < length; i++) {
                            byte b = bArrDigest[i];
                            int i2 = (b >> 4) & 15;
                            int i3 = i * 2;
                            cArr[i3] = (char) (i2 >= 10 ? i2 + 87 : i2 + 48);
                            int i4 = b & 15;
                            cArr[i3 + 1] = (char) (i4 >= 10 ? i4 + 87 : i4 + 48);
                        }
                        str = new String(cArr);
                    } catch (NoSuchAlgorithmException e) {
                        e.printStackTrace();
                        str = null;
                    }
                    stringBuffer.append(str + "|");
                }
            }
        } catch (Exception unused2) {
        }
        return stringBuffer.toString();
    }
}
