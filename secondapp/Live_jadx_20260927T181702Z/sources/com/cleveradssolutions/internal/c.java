package com.cleveradssolutions.internal;

import fr.q;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.u1;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {
    public static final String a(String str, byte[] bArr) throws NoSuchAlgorithmException {
        m0.p(str, "<this>");
        byte[] bytes = str.getBytes(cv.g.f77202b);
        m0.o(bytes, "getBytes(...)");
        if (bArr != null) {
            bytes = q.g3(bytes, bArr);
        }
        int i10 = 0;
        while (true) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(bytes);
                byte[] bArrDigest = messageDigest.digest();
                try {
                    char[] charArray = cv.k.f77221a.toCharArray();
                    m0.o(charArray, "toCharArray(...)");
                    StringBuilder sb2 = new StringBuilder(bArrDigest.length * 2);
                    for (byte b10 : bArrDigest) {
                        sb2.append(charArray[(b10 >> 4) & 15]);
                        sb2.append(charArray[b10 & zi.c.f161639q]);
                    }
                    return sb2.toString();
                } catch (Throwable unused) {
                    u1 u1Var = u1.f102789a;
                    String str2 = String.format("%032X", Arrays.copyOf(new Object[]{new BigInteger(1, bArrDigest)}, 1));
                    m0.o(str2, "format(...)");
                    String lowerCase = str2.toLowerCase(Locale.ROOT);
                    m0.o(lowerCase, "toLowerCase(...)");
                    return lowerCase;
                }
            } catch (NoSuchAlgorithmException e10) {
                if (i10 >= 3) {
                    throw e10;
                }
                i10++;
            }
        }
    }

    public static final HashMap b(JSONObject jSONObject) {
        m0.p(jSONObject, "<this>");
        HashMap map = new HashMap(jSONObject.length());
        Iterator<String> itKeys = jSONObject.keys();
        m0.o(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            m0.m(next);
            String lowerCase = next.toLowerCase(Locale.ROOT);
            m0.o(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, jSONObject.get(next));
        }
        return map;
    }
}
