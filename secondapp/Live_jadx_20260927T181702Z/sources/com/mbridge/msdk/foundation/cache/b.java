package com.mbridge.msdk.foundation.cache;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.k0;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f66643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f66644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f66645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f66646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f66647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f66648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f66649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f66650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f66651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f66652j;

    public void a(long j10) {
        this.f66652j = j10;
    }

    public double b() {
        return this.f66644b;
    }

    public long c() {
        return this.f66652j;
    }

    public String d() {
        return this.f66645c;
    }

    public String e() {
        return this.f66646d;
    }

    public int f() {
        return this.f66647e;
    }

    public int g() {
        return this.f66649g;
    }

    public long h() {
        return this.f66650h;
    }

    public CopyOnWriteArrayList<CampaignEx> a() {
        return this.f66643a;
    }

    public void b(String str) {
        this.f66645c = str;
    }

    public void c(String str) {
        this.f66646d = str;
    }

    public void d(String str) {
        this.f66651i = str;
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f66643a = copyOnWriteArrayList;
    }

    public void b(int i10) {
        this.f66649g = i10;
    }

    public void c(long j10) {
        this.f66650h = j10;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strA = k0.a(str);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        try {
            double d10 = Double.parseDouble(strA);
            if (d10 <= 0.0d) {
                return;
            }
            this.f66644b = d10;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(long j10) {
        this.f66648f = j10;
    }

    public void a(int i10) {
        this.f66647e = i10;
    }
}
