package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5080gm {
    public final Map A;
    public final C9 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f97440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5183km f97442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f97443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f97444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f97445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f97446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f97447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f97448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f97449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f97450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f97451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f97452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C5216m4 f97453n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f97454o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f97455p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f97456q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f97457r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C5525ye f97458s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RetryPolicyConfig f97459t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f97460u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f97461v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f97462w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C5009e3 f97463x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C5239n2 f97464y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Dm f97465z;

    public C5080gm(String str, String str2, C5183km c5183km) {
        this.f97440a = str;
        this.f97441b = str2;
        this.f97442c = c5183km;
        this.f97443d = c5183km.f97748a;
        this.f97444e = c5183km.f97749b;
        this.f97445f = c5183km.f97753f;
        this.f97446g = c5183km.f97754g;
        this.f97447h = c5183km.f97756i;
        this.f97448i = c5183km.f97750c;
        this.f97449j = c5183km.f97751d;
        this.f97450k = c5183km.f97757j;
        this.f97451l = c5183km.f97758k;
        this.f97452m = c5183km.f97759l;
        this.f97453n = c5183km.f97760m;
        this.f97454o = c5183km.f97761n;
        this.f97455p = c5183km.f97762o;
        this.f97456q = c5183km.f97763p;
        this.f97457r = c5183km.f97764q;
        this.f97458s = c5183km.f97766s;
        this.f97459t = c5183km.f97767t;
        this.f97460u = c5183km.f97768u;
        this.f97461v = c5183km.f97769v;
        this.f97462w = c5183km.f97770w;
        this.f97463x = c5183km.f97771x;
        this.f97464y = c5183km.f97772y;
        this.f97465z = c5183km.f97773z;
        this.A = c5183km.A;
        this.B = c5183km.B;
    }

    public final String a() {
        return this.f97440a;
    }

    public final String b() {
        return this.f97441b;
    }

    public final String c() {
        return this.f97443d;
    }

    public final String toString() {
        return "StartupState(deviceId=" + this.f97440a + ", deviceIdHash=" + this.f97441b + ", startupStateModel=" + this.f97442c + ')';
    }
}
