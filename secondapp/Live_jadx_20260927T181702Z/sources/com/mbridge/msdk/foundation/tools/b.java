package com.mbridge.msdk.foundation.tools;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f67356a = new byte[32];

    static {
        a(k0.a("HkzwDFeD4QuyLdx5igfZYcu9xTM9NN=="));
    }

    private static void a(String str) {
        try {
            System.arraycopy(MessageDigest.getInstance("SHA-384").digest(str.getBytes()), 0, f67356a, 0, 32);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @k.t0(api = 19)
    public static String a(String str, byte[] bArr) {
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(f67356a, to.c.asp);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpec, new GCMParameterSpec(128, bArr));
            return new String(cipher.doFinal(bArrDecode), "UTF-8");
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @k.t0(api = 19)
    public static String a(String str, byte[] bArr, byte[] bArr2) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, new SecretKeySpec(bArr, to.c.asp), new GCMParameterSpec(128, bArr2));
        return Base64.encodeToString(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)), 2);
    }
}
