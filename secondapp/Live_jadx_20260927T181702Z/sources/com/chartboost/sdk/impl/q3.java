package com.chartboost.sdk.impl;

import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q3 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends q3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i8 f40481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final URL f40482b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i8 reason, URL url) {
            super(null);
            kotlin.jvm.internal.m0.p(reason, "reason");
            kotlin.jvm.internal.m0.p(url, "url");
            this.f40481a = reason;
            this.f40482b = url;
        }

        public final i8 a() {
            return this.f40481a;
        }

        public final URL b() {
            return this.f40482b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f40481a == aVar.f40481a && kotlin.jvm.internal.m0.g(this.f40482b, aVar.f40482b);
        }

        public int hashCode() {
            return (this.f40481a.hashCode() * 31) + this.f40482b.hashCode();
        }

        public String toString() {
            return "Evicted(reason=" + this.f40481a + ", url=" + this.f40482b + gi.j.f86771d;
        }
    }

    public q3() {
    }

    public /* synthetic */ q3(kotlin.jvm.internal.x xVar) {
        this();
    }
}
