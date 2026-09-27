package com.chartboost.sdk.internal.interruption;

import gi.j;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0419a f41878b = new C0419a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f41879c = new a("APP_LIFECYCLE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f41880d = new a("AUDIO");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f41881e = new a("CUSTOM");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41882a;

    /* JADX INFO: renamed from: com.chartboost.sdk.internal.interruption.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0419a {
        public /* synthetic */ C0419a(x xVar) {
            this();
        }

        public final a a() {
            return a.f41879c;
        }

        public final a b() {
            return a.f41880d;
        }

        public C0419a() {
        }
    }

    public a(String name) {
        m0.p(name, "name");
        this.f41882a = name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && m0.g(this.f41882a, ((a) obj).f41882a);
    }

    public int hashCode() {
        return this.f41882a.hashCode();
    }

    public String toString() {
        return "InterruptionType(name=" + this.f41882a + j.f86771d;
    }
}
