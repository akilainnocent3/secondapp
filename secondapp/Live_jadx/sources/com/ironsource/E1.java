package com.ironsource;

import android.text.TextUtils;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class E1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f58865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f58866d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f58868f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashSet<String> f58864b = new HashSet<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f58863a = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f58867e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f58869g = true;

    public void a(boolean z10) {
        this.f58863a = z10;
    }

    public HashSet<String> b() {
        return this.f58864b;
    }

    public void c(String str) {
        this.f58865c = str;
    }

    public String d() {
        return this.f58865c;
    }

    public boolean e() {
        return this.f58867e;
    }

    public boolean f() {
        return this.f58863a;
    }

    public boolean g() {
        return this.f58869g;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f58864b.add(str);
    }

    public void b(String str) {
        this.f58866d = str;
    }

    public String c() {
        return this.f58866d;
    }

    public void b(boolean z10) {
        this.f58869g = z10;
    }

    public void c(boolean z10) {
        this.f58867e = z10;
    }

    public int a() {
        return this.f58868f;
    }

    public void a(int i10) {
        this.f58868f = i10;
    }
}
