package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class w1 implements wd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f75742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zd f75743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f75744c;

    /* JADX WARN: Multi-variable type inference failed */
    public w1(x1 x1Var, wd wdVar) {
        this.f75744c = x1Var;
        this.f75743b = (zd) wdVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.startapp.sdk.internal.wd, com.startapp.sdk.internal.zd] */
    @Override // com.startapp.sdk.internal.wd
    public final synchronized void a(Object obj) {
        if (this.f75742a) {
            return;
        }
        this.f75742a = true;
        this.f75744c.f75810c.removeCallbacksAndMessages(null);
        this.f75743b.a(obj);
    }
}
