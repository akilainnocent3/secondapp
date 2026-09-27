package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdRequest f45031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.e f45032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.global.r f45033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.config.s0 f45034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45035e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45036f = false;

    public x(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f45034d = s0Var;
        this.f45033c = rVar;
    }

    public com.fyber.inneractive.sdk.web.v0 a() {
        return null;
    }

    public com.fyber.inneractive.sdk.response.e b() {
        return this.f45032b;
    }

    public boolean c() {
        com.fyber.inneractive.sdk.config.s0 s0Var = this.f45034d;
        if (s0Var == null) {
            IAlog.f("%s : isFullscreenAd() called with unit config null", IAlog.a(this));
            return false;
        }
        return false;
    }

    public boolean d() {
        return false;
    }

    public abstract void destroy();

    public abstract boolean e();

    public abstract boolean isVideoAd();

    public void a(String str) {
    }

    public boolean a(boolean z10, com.fyber.inneractive.sdk.util.g gVar) {
        return false;
    }

    public void f() {
    }
}
