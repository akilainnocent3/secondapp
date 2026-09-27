package com.ironsource.sdk.controller;

import com.ironsource.C4485r4;
import com.ironsource.Jb;
import com.ironsource.mediationsdk.logger.IronLog;
import java.security.MessageDigest;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f63908b = "MD5";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63909a;

    public s(String str) {
        this.f63909a = str;
    }

    public static String a() {
        return UUID.randomUUID().toString();
    }

    private String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }

    private String a(String str) {
        try {
            return Jb.a(str);
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return b(str);
        }
    }

    private String a(byte[] bArr) throws Exception {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() < 2) {
                hexString = "0" + hexString;
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    public String b() {
        return this.f63909a;
    }

    public boolean a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(a(str + str2 + this.f63909a));
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }
}
