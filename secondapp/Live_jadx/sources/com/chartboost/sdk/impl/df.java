package com.chartboost.sdk.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class df {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends df {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f38552a;

        public a(double d10) {
            super(null);
            this.f38552a = d10;
        }

        public final double a() {
            return this.f38552a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Double.compare(this.f38552a, ((a) obj).f38552a) == 0;
        }

        public int hashCode() {
            return f0.i.a(this.f38552a);
        }

        public String toString() {
            return "Fraction(fraction=" + this.f38552a + gi.j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends df {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f38553a;

        public b(long j10) {
            super(null);
            this.f38553a = j10;
        }

        public final long a() {
            return this.f38553a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f38553a == ((b) obj).f38553a;
        }

        public int hashCode() {
            return f0.p.a(this.f38553a);
        }

        public String toString() {
            return "TimeMs(ms=" + this.f38553a + gi.j.f86771d;
        }
    }

    public df() {
    }

    public /* synthetic */ df(kotlin.jvm.internal.x xVar) {
        this();
    }
}
