package com.applovin.impl;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class w2 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f29433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g3 f29434d;

    public w2(String str, String str2, boolean z10, g3 g3Var) {
        this.f29431a = str;
        this.f29432b = str2;
        this.f29433c = z10;
        this.f29434d = g3Var;
    }

    public String a() {
        return this.f29432b;
    }

    public List b() {
        List listL = this.f29434d.l();
        return (listL == null || listL.isEmpty()) ? Collections.singletonList(this.f29431a) : listL;
    }

    public String c() {
        return this.f29431a;
    }

    public g3 d() {
        return this.f29434d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            w2 w2Var = (w2) obj;
            String str = this.f29431a;
            if (str == null ? w2Var.f29431a != null : !str.equals(w2Var.f29431a)) {
                return false;
            }
            String str2 = this.f29432b;
            if (str2 == null ? w2Var.f29432b != null : !str2.equals(w2Var.f29432b)) {
                return false;
            }
            if (this.f29433c == w2Var.f29433c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f29431a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f29432b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f29433c ? 1 : 0);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(w2 w2Var) {
        return this.f29432b.compareToIgnoreCase(w2Var.f29432b);
    }
}
