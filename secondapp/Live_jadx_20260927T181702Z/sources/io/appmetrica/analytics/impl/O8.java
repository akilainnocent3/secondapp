package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class O8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f96265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f96266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f96267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f96268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f96269f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C5142j7 f96270g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EnumC4966cb f96271h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f96272i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f96273j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f96274k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f96275l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f96276m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f96277n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final J8 f96278o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EnumC5016ea f96279p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final EnumC5246n9 f96280q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Boolean f96281r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Integer f96282s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[] f96283t;

    /* JADX WARN: Multi-variable type inference failed */
    public O8(ContentValues contentValues) {
        C5039f7 model = new C5065g7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.f96264a = model.a().j();
        this.f96265b = model.a().p();
        this.f96266c = model.c();
        this.f96267d = model.b();
        this.f96268e = model.a().k();
        this.f96269f = model.d();
        this.f96270g = model.a().i();
        this.f96271h = model.e();
        this.f96272i = model.a().d();
        this.f96273j = model.a().f();
        this.f96274k = model.a().o();
        this.f96275l = model.a().c();
        this.f96276m = model.a().b();
        this.f96277n = model.a().m();
        J8 j8E = model.a().e();
        this.f96278o = j8E == null ? J8.a(null) : j8E;
        EnumC5016ea enumC5016eaH = model.a().h();
        this.f96279p = enumC5016eaH == null ? EnumC5016ea.a(null) : enumC5016eaH;
        this.f96280q = model.a().n();
        this.f96281r = model.a().a();
        this.f96282s = model.a().l();
        this.f96283t = model.a().g();
    }
}
