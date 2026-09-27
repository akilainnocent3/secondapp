package com.fyber.inneractive.sdk.util;

import com.ironsource.Q6;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class q1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f47889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f47890b;

    public q1(s1 s1Var, String str) {
        this.f47890b = s1Var;
        this.f47889a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47890b.f47901c.getSharedPreferences("fyber.ua", 0).edit().putString(Q6.f59861d0, this.f47889a).apply();
    }
}
