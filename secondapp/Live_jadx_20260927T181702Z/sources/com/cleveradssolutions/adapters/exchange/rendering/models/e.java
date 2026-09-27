package com.cleveradssolutions.adapters.exchange.rendering.models;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static String f42186o = "zs";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.cleveradssolutions.adapters.exchange.configuration.a f42187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f42188b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f42192f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.cleveradssolutions.adapters.exchange.rendering.networking.tracking.a f42194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.cleveradssolutions.adapters.exchange.rendering.video.i f42195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f42196j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f42198l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f42199m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42189c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42190d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42191e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashMap f42193g = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f42197k = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f42200n = false;

    public e(com.cleveradssolutions.adapters.exchange.rendering.networking.tracking.a aVar, com.cleveradssolutions.adapters.exchange.rendering.video.i iVar, com.cleveradssolutions.adapters.exchange.configuration.a aVar2) {
        this.f42194h = aVar;
        this.f42187a = aVar2;
        this.f42195i = iVar;
    }

    public String a() {
        return this.f42198l;
    }

    public void b(int i10) {
        this.f42190d = i10;
    }

    public void c(b bVar) {
        r(bVar);
        g(bVar);
    }

    public void d(String str) {
        this.f42192f = str;
    }

    public void e(boolean z10) {
        this.f42197k = z10;
    }

    public int f() {
        return this.f42191e;
    }

    public void g(b bVar) {
        ArrayList arrayList = (ArrayList) this.f42193g.get(bVar);
        if (arrayList != null && !arrayList.isEmpty()) {
            if (bVar.equals(b.IMPRESSION)) {
                this.f42194h.b(arrayList);
                return;
            } else {
                this.f42194h.c(arrayList);
                return;
            }
        }
        com.cleveradssolutions.adapters.exchange.b.h(f42186o, "Event " + bVar + ": url not found for tracking");
    }

    public void h(String str) {
        this.f42188b = str;
    }

    public String i() {
        return this.f42192f;
    }

    public String j() {
        return this.f42196j;
    }

    public String k() {
        return this.f42199m;
    }

    public int l() {
        return this.f42190d;
    }

    public boolean m() {
        return this.f42200n;
    }

    public boolean n() {
        return this.f42197k;
    }

    public com.cleveradssolutions.adapters.exchange.configuration.a o() {
        return this.f42187a;
    }

    public void p(int i10) {
        this.f42191e = i10;
    }

    public void q(com.cleveradssolutions.adapters.exchange.configuration.a aVar) {
        this.f42187a = aVar;
    }

    public final void r(b bVar) {
        if (this.f42200n && bVar == b.CLICK) {
            this.f42195i.e(com.cleveradssolutions.adapters.exchange.rendering.video.k.AD_CLICK);
        } else {
            this.f42195i.c(bVar);
        }
    }

    public void s(b bVar, ArrayList arrayList) {
        this.f42193g.put(bVar, arrayList);
    }

    public void t(com.cleveradssolutions.adapters.exchange.rendering.session.manager.b bVar) {
        this.f42195i.d(bVar);
    }

    public void u(String str) {
        this.f42198l = str;
    }

    public void v(boolean z10) {
        this.f42200n = z10;
    }
}
