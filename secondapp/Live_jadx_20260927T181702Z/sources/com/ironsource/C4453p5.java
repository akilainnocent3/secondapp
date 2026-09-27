package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Random;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.p5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4453p5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f63277d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f63278e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f63279f = "C38FB23A402222A0C17D34A92F971D1F";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f63280g = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f63281h = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f63282i = 32;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C4453p5 f63283j = new C4453p5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63284a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63285b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f63286c = "";

    private String a(String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        Random random = new Random();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(str.charAt(random.nextInt(str.length())));
        }
        return sb2.toString();
    }

    public static C4453p5 b() {
        return f63283j;
    }

    public String c() {
        if (TextUtils.isEmpty(this.f63284a)) {
            this.f63284a = f63279f;
        }
        return this.f63284a;
    }

    public synchronized String d() {
        try {
            if (TextUtils.isEmpty(this.f63285b)) {
                this.f63285b = a(f63281h, 32);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f63285b;
    }

    public String a() throws JSONException {
        if (TextUtils.isEmpty(this.f63286c)) {
            try {
                this.f63286c = C4241da.a(d(), f63280g);
            } catch (Exception e10) {
                C4485r4.d().a(e10);
                String str = "Session key encryption exception: " + e10.getLocalizedMessage();
                IronLog.INTERNAL.error(str);
                throw new JSONException(str);
            }
        }
        return this.f63286c;
    }
}
