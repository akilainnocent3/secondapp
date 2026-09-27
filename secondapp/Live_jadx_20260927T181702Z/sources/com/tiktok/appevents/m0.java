package com.tiktok.appevents;

import android.content.Context;
import java.io.Serializable;
import java.security.MessageDigest;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class m0 implements Cloneable, Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f76107h = "com.tiktok.appevents.m0";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile m0 f76108i = new m0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f76109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f76110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f76111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f76112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f76113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient boolean f76114g = false;

    public static void j(Context context, boolean forceGenerateAnoId) {
        f76108i.f76109b = kp.i.e(context, forceGenerateAnoId);
        f76108i.f76110c = null;
        f76108i.f76111d = null;
        f76108i.f76112e = null;
        f76108i.f76113f = null;
        f76108i.f76114g = false;
    }

    public static String q(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(to.c.algoTypeS2);
            messageDigest.update(str.getBytes());
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : messageDigest.digest()) {
                sb2.append(Integer.toString((b10 & 255) + 256, 16).substring(1));
            }
            return sb2.toString();
        } catch (Exception e10) {
            c0.b(f76107h, e10, 2);
            return null;
        }
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public m0 clone() {
        try {
            return (m0) super.clone();
        } catch (Exception unused) {
            return new m0();
        }
    }

    public boolean i() {
        return this.f76114g;
    }

    public void k(String email) {
        this.f76113f = q(email);
    }

    public void l(String externalId) {
        this.f76110c = q(externalId);
    }

    public void m(String externalUserName) {
        this.f76111d = q(externalUserName);
    }

    public void n() {
        this.f76114g = true;
    }

    public void o(String phoneNumber) {
        this.f76112e = q(phoneNumber);
    }

    public JSONObject p() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f76110c;
            if (str != null) {
                jSONObject.put("external_id", str);
            }
            String str2 = this.f76111d;
            if (str2 != null) {
                jSONObject.put("external_username", str2);
            }
            String str3 = this.f76112e;
            if (str3 != null) {
                jSONObject.put("phone_number", str3);
            }
            String str4 = this.f76113f;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            return jSONObject;
        } catch (Exception e10) {
            c0.b(f76107h, e10, 2);
            return jSONObject;
        }
    }
}
