package com.mbridge.msdk.click.retry;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f65038k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f65039l = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f65040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f65041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashSet<String> f65042c = new HashSet<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f65043d = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CampaignEx f65044e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f65045f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f65046g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f65047h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f65048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f65049j;

    public b(String str, String str2) {
        this.f65040a = str;
        a(str2);
    }

    public void a(boolean z10) {
        this.f65047h = z10;
    }

    public void b(boolean z10) {
        this.f65048i = z10;
    }

    public long c() {
        return this.f65043d;
    }

    public int d() {
        return this.f65049j;
    }

    public int e() {
        return this.f65041b;
    }

    public String f() {
        return this.f65045f;
    }

    public String g() {
        return this.f65040a;
    }

    public int h() {
        return this.f65046g;
    }

    public boolean i() {
        return this.f65047h;
    }

    public boolean j() {
        return this.f65048i;
    }

    public void a(int i10) {
        this.f65049j = i10;
    }

    public void b(int i10) {
        this.f65046g = i10;
    }

    public CampaignEx a() {
        return this.f65044e;
    }

    public void b(String str) {
        this.f65045f = str;
    }

    public void a(CampaignEx campaignEx) {
        this.f65044e = campaignEx;
    }

    public HashSet<String> b() {
        return this.f65042c;
    }

    public void a(String str) {
        this.f65041b++;
        this.f65042c.add(str);
    }
}
