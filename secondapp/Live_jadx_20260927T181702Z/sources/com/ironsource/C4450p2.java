package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.p2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4450p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f63254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f63255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f63256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f63257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f63258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f63259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f63260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f63261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f63262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f63263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f63264k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f63265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f63266m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ArrayList<String> f63267n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f63268o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f63269p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f63270q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f63271r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f63272s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f63273t;

    public C4450p2() {
        this.f63255b = "";
        this.f63256c = "";
        this.f63257d = "";
        this.f63262i = 0L;
        this.f63263j = 0L;
        this.f63264k = 0L;
        this.f63265l = 0L;
        this.f63266m = true;
        this.f63267n = new ArrayList<>();
        this.f63260g = 0;
        this.f63268o = false;
        this.f63269p = false;
        this.f63270q = 1;
    }

    public String a() {
        return this.f63255b;
    }

    public long b() {
        return this.f63263j;
    }

    public int c() {
        return this.f63259f;
    }

    public int d() {
        return this.f63270q;
    }

    public boolean e() {
        return this.f63266m;
    }

    public ArrayList<String> f() {
        return this.f63267n;
    }

    public int g() {
        return this.f63258e;
    }

    public boolean h() {
        return this.f63254a;
    }

    public int i() {
        return this.f63260g;
    }

    public long j() {
        return this.f63264k;
    }

    public long k() {
        return this.f63262i;
    }

    public long l() {
        return this.f63265l;
    }

    public long m() {
        return this.f63261h;
    }

    public boolean n() {
        return this.f63273t;
    }

    public boolean o() {
        return this.f63268o;
    }

    public boolean p() {
        return this.f63269p;
    }

    public boolean q() {
        return this.f63272s;
    }

    public boolean r() {
        return this.f63271r;
    }

    public String a(boolean z10) {
        return z10 ? this.f63257d : this.f63256c;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f63267n.add(str);
    }

    public C4450p2(String str, String str2, String str3, int i10, int i11, long j10, long j11, long j12, long j13, long j14, boolean z10, int i12, boolean z11, boolean z12, boolean z13, int i13, boolean z14, boolean z15, boolean z16) {
        this.f63255b = str;
        this.f63256c = str2;
        this.f63257d = str3;
        this.f63258e = i10;
        this.f63259f = i11;
        this.f63261h = j10;
        this.f63254a = z13;
        this.f63262i = j11;
        this.f63263j = j12;
        this.f63264k = j13;
        this.f63265l = j14;
        this.f63266m = z10;
        this.f63260g = i12;
        this.f63267n = new ArrayList<>();
        this.f63268o = z11;
        this.f63269p = z12;
        this.f63270q = i13;
        this.f63271r = z14;
        this.f63272s = z15;
        this.f63273t = z16;
    }
}
