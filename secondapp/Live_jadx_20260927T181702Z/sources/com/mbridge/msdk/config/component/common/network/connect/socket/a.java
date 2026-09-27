package com.mbridge.msdk.config.component.common.network.connect.socket;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f65210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f65211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f65212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.a f65213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f65214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.a f65215f;

    public a(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2, com.mbridge.msdk.config.component.common.network.a aVar3) {
        this.f65210a = aVar;
        this.f65211b = aVar2;
        this.f65212c = aVar3;
        this.f65215f = aVar2.b();
    }

    public com.mbridge.msdk.config.component.common.network.result.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return a(1008, 1008, "URL cannot be empty");
        }
        b bVar = new b(this.f65210a, this.f65211b, this.f65212c);
        this.f65214e = bVar;
        bVar.c(str);
        this.f65214e.a(this.f65213d);
        c.a().a(this.f65214e, this.f65215f);
        return this.f65211b;
    }

    public void a() {
        b bVar = this.f65214e;
        if (bVar != null) {
            bVar.a();
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.a aVar) {
        this.f65213d = aVar;
    }

    private com.mbridge.msdk.config.component.common.network.result.a a(int i10, int i11, String str) {
        this.f65211b.a(str);
        this.f65211b.c(i10);
        this.f65211b.a(i11);
        this.f65211b.b(2);
        return this.f65211b;
    }
}
