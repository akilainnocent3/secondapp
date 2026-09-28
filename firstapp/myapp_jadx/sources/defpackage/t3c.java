package defpackage;

import java.security.MessageDigest;
import java.util.Locale;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class t3c {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final String a(String str) {
        str.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            bytes.getClass();
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            bArrDigest.getClass();
            bArrDigest.getClass();
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b : bArrDigest) {
                char[] cArr = a;
                sb.append(cArr[(b & 240) >>> 4]);
                sb.append(cArr[b & 15]);
            }
            String string = sb.toString();
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = string.toLowerCase(locale);
            lowerCase.getClass();
            return lowerCase;
        } catch (Exception unused) {
            return str;
        }
    }
}
