package com.chartboost.sdk.impl;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class qd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f40560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f40561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f40562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dr.i0 f40563f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.a {
        public a() {
            super(0);
        }

        @Override // ds.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            byte[] bArrB = qd.this.b();
            if (bArrB == null) {
                return null;
            }
            String strC = qd.this.c();
            if (strC == null) {
                strC = cv.g.f77202b.name();
            }
            try {
                kotlin.jvm.internal.m0.m(strC);
                Charset charsetForName = Charset.forName(strC);
                kotlin.jvm.internal.m0.o(charsetForName, "forName(...)");
                return new String(bArrB, charsetForName);
            } catch (Exception unused) {
                return new String(bArrB, cv.g.f77202b);
            }
        }
    }

    public qd(boolean z10, int i10, byte[] bArr, Throwable th2, String str) {
        this.f40558a = z10;
        this.f40559b = i10;
        this.f40560c = bArr;
        this.f40561d = th2;
        this.f40562e = str;
        this.f40563f = dr.k0.b(new a());
    }

    public final String a() {
        return (String) this.f40563f.getValue();
    }

    public final byte[] b() {
        return this.f40560c;
    }

    public final String c() {
        return this.f40562e;
    }

    public final Throwable d() {
        return this.f40561d;
    }

    public final int e() {
        return this.f40559b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd)) {
            return false;
        }
        qd qdVar = (qd) obj;
        return this.f40558a == qdVar.f40558a && this.f40559b == qdVar.f40559b && kotlin.jvm.internal.m0.g(this.f40560c, qdVar.f40560c) && kotlin.jvm.internal.m0.g(this.f40561d, qdVar.f40561d) && kotlin.jvm.internal.m0.g(this.f40562e, qdVar.f40562e);
    }

    public final boolean f() {
        return this.f40558a;
    }

    public int hashCode() {
        int iA = ((g8.a.a(this.f40558a) * 31) + this.f40559b) * 31;
        byte[] bArr = this.f40560c;
        int iHashCode = (iA + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        Throwable th2 = this.f40561d;
        int iHashCode2 = (iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31;
        String str = this.f40562e;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "NetworkResponse(isSuccessful=" + this.f40558a + ", statusCode=" + this.f40559b + ", bytes=" + Arrays.toString(this.f40560c) + ", error=" + this.f40561d + ", charset=" + this.f40562e + gi.j.f86771d;
    }

    public /* synthetic */ qd(boolean z10, int i10, byte[] bArr, Throwable th2, String str, int i11, kotlin.jvm.internal.x xVar) {
        this(z10, i10, (i11 & 4) != 0 ? null : bArr, (i11 & 8) != 0 ? null : th2, (i11 & 16) != 0 ? null : str);
    }
}
