package kp;

import android.util.Base64;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class a {
    public static String a(String message) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(dp.c.k().getBytes(), "HmacSHA256");
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(secretKeySpec);
            return Base64.encodeToString(mac.doFinal(message.getBytes()), 2);
        } catch (Throwable unused) {
            return "";
        }
    }
}
