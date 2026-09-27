package com.cleveradssolutions.adapters.exchange.rendering.video;

import com.cleveradssolutions.adapters.exchange.rendering.video.vast.b0;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class n extends com.cleveradssolutions.adapters.exchange.rendering.models.e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static String f42621w = "zx";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public HashMap f42622p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f42623q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f42624r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f42625s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f42626t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f42627u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b0 f42628v;

    public n(com.cleveradssolutions.adapters.exchange.rendering.networking.tracking.a aVar, i iVar, com.cleveradssolutions.adapters.exchange.configuration.a aVar2) {
        super(aVar, iVar, aVar2);
        this.f42622p = new HashMap();
    }

    public String A() {
        return this.f42627u;
    }

    public HashMap B() {
        return this.f42622p;
    }

    public void C(long j10) {
        this.f42626t = j10;
    }

    public void D(boolean z10) {
        this.f42195i.f(z10);
    }

    public void E(String str) {
        this.f42625s = str;
    }

    public void F(String str) {
        this.f42623q = str;
    }

    public void G(String str) {
        this.f42627u = str;
    }

    public void H(float f10, float f11) {
        this.f42195i.a(f10, f11);
    }

    public void I(long j10) {
        this.f42624r = j10;
    }

    public void J(com.cleveradssolutions.adapters.exchange.rendering.models.internal.a aVar) {
        this.f42195i.b(aVar);
    }

    public void K(b0 b0Var) {
        this.f42628v = b0Var;
    }

    public void L(k kVar) {
        this.f42195i.e(kVar);
        ArrayList arrayList = (ArrayList) this.f42622p.get(kVar);
        if (arrayList == null) {
            com.cleveradssolutions.adapters.exchange.b.h(f42621w, "Event" + kVar + " not found");
            return;
        }
        this.f42194h.c(arrayList);
        com.cleveradssolutions.adapters.exchange.b.b(f42621w, "Video event '" + kVar.name() + "' was fired with urls: " + arrayList.toString());
    }

    public void M(k kVar, ArrayList arrayList) {
        this.f42622p.put(kVar, arrayList);
    }

    public b0 w() {
        return this.f42628v;
    }

    public long x() {
        return this.f42624r;
    }

    public String y() {
        return this.f42623q;
    }

    public long z() {
        return this.f42626t;
    }
}
