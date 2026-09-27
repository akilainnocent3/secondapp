package com.chartboost.sdk.impl;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f41190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f41191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f41192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f41193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f41194f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        TOP_LEFT(0),
        TOP_RIGHT(1),
        BOTTOM_LEFT(2),
        BOTTOM_RIGHT(3);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41204b;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ sr.a f41203i = sr.c.c(a());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41197c = new a(null);

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {
            public a() {
            }

            public final b a(int i10) {
                Object next;
                Iterator<E> it = b.b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((b) next).c() != i10);
                b bVar = (b) next;
                return bVar == null ? b.TOP_LEFT : bVar;
            }

            public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
                this();
            }
        }

        b(int i10) {
            this.f41204b = i10;
        }

        public static sr.a b() {
            return f41203i;
        }

        public final int c() {
            return this.f41204b;
        }
    }

    public va(String imageUrl, String clickthroughUrl, b position, a margin, a padding, a size) {
        kotlin.jvm.internal.m0.p(imageUrl, "imageUrl");
        kotlin.jvm.internal.m0.p(clickthroughUrl, "clickthroughUrl");
        kotlin.jvm.internal.m0.p(position, "position");
        kotlin.jvm.internal.m0.p(margin, "margin");
        kotlin.jvm.internal.m0.p(padding, "padding");
        kotlin.jvm.internal.m0.p(size, "size");
        this.f41189a = imageUrl;
        this.f41190b = clickthroughUrl;
        this.f41191c = position;
        this.f41192d = margin;
        this.f41193e = padding;
        this.f41194f = size;
    }

    public final String a() {
        return this.f41190b;
    }

    public final String b() {
        return this.f41189a;
    }

    public final a c() {
        return this.f41192d;
    }

    public final b d() {
        return this.f41191c;
    }

    public final a e() {
        return this.f41194f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va)) {
            return false;
        }
        va vaVar = (va) obj;
        return kotlin.jvm.internal.m0.g(this.f41189a, vaVar.f41189a) && kotlin.jvm.internal.m0.g(this.f41190b, vaVar.f41190b) && this.f41191c == vaVar.f41191c && kotlin.jvm.internal.m0.g(this.f41192d, vaVar.f41192d) && kotlin.jvm.internal.m0.g(this.f41193e, vaVar.f41193e) && kotlin.jvm.internal.m0.g(this.f41194f, vaVar.f41194f);
    }

    public int hashCode() {
        return (((((((((this.f41189a.hashCode() * 31) + this.f41190b.hashCode()) * 31) + this.f41191c.hashCode()) * 31) + this.f41192d.hashCode()) * 31) + this.f41193e.hashCode()) * 31) + this.f41194f.hashCode();
    }

    public String toString() {
        return "InfoIcon(imageUrl=" + this.f41189a + ", clickthroughUrl=" + this.f41190b + ", position=" + this.f41191c + ", margin=" + this.f41192d + ", padding=" + this.f41193e + ", size=" + this.f41194f + gi.j.f86771d;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f41195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f41196b;

        public a(double d10, double d11) {
            this.f41195a = d10;
            this.f41196b = d11;
        }

        public final double a() {
            return this.f41196b;
        }

        public final double b() {
            return this.f41195a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Double.compare(this.f41195a, aVar.f41195a) == 0 && Double.compare(this.f41196b, aVar.f41196b) == 0;
        }

        public int hashCode() {
            return (f0.i.a(this.f41195a) * 31) + f0.i.a(this.f41196b);
        }

        public String toString() {
            return "DoubleSize(width=" + this.f41195a + ", height=" + this.f41196b + gi.j.f86771d;
        }

        public /* synthetic */ a(double d10, double d11, int i10, kotlin.jvm.internal.x xVar) {
            this((i10 & 1) != 0 ? 0.0d : d10, (i10 & 2) != 0 ? 0.0d : d11);
        }
    }

    public /* synthetic */ va(String str, String str2, b bVar, a aVar, a aVar2, a aVar3, int i10, kotlin.jvm.internal.x xVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? b.TOP_LEFT : bVar, (i10 & 8) != 0 ? new a(0.0d, 0.0d, 3, null) : aVar, (i10 & 16) != 0 ? new a(0.0d, 0.0d, 3, null) : aVar2, (i10 & 32) != 0 ? new a(0.0d, 0.0d, 3, null) : aVar3);
    }
}
