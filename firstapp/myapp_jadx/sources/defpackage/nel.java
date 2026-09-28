package defpackage;

import java.security.MessageDigest;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes6.dex */
public final class nel {
    public static String a(String str) {
        byte[] bArrDigest;
        str.getClass();
        byte[] bytes = str.concat("NzgyM0FGMDExN0M5QjRDNzJFMjA1MTYyMzI2MEZFNzQ=").getBytes(Charsets.UTF_8);
        bytes.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes);
            bArrDigest = messageDigest.digest();
        } catch (Exception unused) {
            bArrDigest = new byte[0];
        }
        return uel.d(bArrDigest);
    }
}
