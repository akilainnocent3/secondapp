package com.cleveradssolutions.internal.mediation;

import android.app.Activity;
import kotlin.jvm.internal.m0;
import wc.u;
import wc.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.cleveradssolutions.sdk.base.b f43676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f43677c;

    public l(String managerID) {
        m0.p(managerID, "managerID");
        this.f43675a = managerID;
        this.f43676b = new com.cleveradssolutions.sdk.base.b();
    }

    @Override // wc.x
    public final boolean a() {
        return false;
    }

    @Override // wc.x
    public final com.cleveradssolutions.sdk.base.b c() {
        return this.f43676b;
    }

    @Override // wc.x
    public final void d(wc.a callback) {
        m0.p(callback, "callback");
    }

    @Override // wc.x
    public final boolean e() {
        return false;
    }

    @Override // wc.x
    public final void g(Activity activity, wc.a aVar) {
        m0.p(activity, "activity");
    }

    @Override // wc.x
    public final void i(u uVar) {
        this.f43677c = uVar;
    }

    @Override // wc.x
    public final boolean k(wc.i type) {
        m0.p(type, "type");
        return false;
    }

    @Override // wc.x
    public final u l() {
        return this.f43677c;
    }

    @Override // wc.x
    public final void m(Activity activity, wc.a aVar) {
        m0.p(activity, "activity");
    }

    @Override // wc.x
    public final boolean n() {
        return true;
    }

    @Override // wc.x
    public final String o() {
        return this.f43675a;
    }

    @Override // wc.x
    public final void p(wc.i type, boolean z10) {
        m0.p(type, "type");
    }

    @Override // wc.x
    public final boolean q() {
        return false;
    }

    @Override // wc.x
    public final void b() {
    }

    @Override // wc.x
    public final void f() {
    }

    @Override // wc.x
    public final void h() {
    }

    @Override // wc.x
    public final void j() {
    }
}
