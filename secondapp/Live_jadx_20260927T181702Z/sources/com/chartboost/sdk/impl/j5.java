package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class j5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f39552c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39554b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public final j5 a(JSONObject jsonObject) {
            kotlin.jvm.internal.m0.p(jsonObject, "jsonObject");
            return new j5(jsonObject.optLong("duration", 30L), jsonObject.optLong("delay"));
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    public j5(long j10, long j11) {
        this.f39553a = j10;
        this.f39554b = j11;
    }

    public final long a() {
        return this.f39554b;
    }

    public final long b() {
        return this.f39553a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj;
        return this.f39553a == j5Var.f39553a && this.f39554b == j5Var.f39554b;
    }

    public int hashCode() {
        return (f0.p.a(this.f39553a) * 31) + f0.p.a(this.f39554b);
    }

    public String toString() {
        return "Countdown(duration=" + this.f39553a + ", delay=" + this.f39554b + gi.j.f86771d;
    }
}
