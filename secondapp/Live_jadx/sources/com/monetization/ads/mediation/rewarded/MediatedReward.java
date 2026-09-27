package com.monetization.ads.mediation.rewarded;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class MediatedReward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f71935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f71936b;

    public MediatedReward(int i10, @l String str) {
        this.f71935a = i10;
        this.f71936b = str;
    }

    public final int getAmount() {
        return this.f71935a;
    }

    @l
    public final String getType() {
        return this.f71936b;
    }
}
