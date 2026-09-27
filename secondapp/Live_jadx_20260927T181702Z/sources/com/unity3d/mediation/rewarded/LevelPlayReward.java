package com.unity3d.mediation.rewarded;

import gi.j;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlayReward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    private final String f76318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f76319b;

    public LevelPlayReward(@l String name, int i10) {
        m0.p(name, "name");
        this.f76318a = name;
        this.f76319b = i10;
    }

    public static /* synthetic */ LevelPlayReward copy$default(LevelPlayReward levelPlayReward, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = levelPlayReward.f76318a;
        }
        if ((i11 & 2) != 0) {
            i10 = levelPlayReward.f76319b;
        }
        return levelPlayReward.copy(str, i10);
    }

    @l
    public final String component1() {
        return this.f76318a;
    }

    public final int component2() {
        return this.f76319b;
    }

    @l
    public final LevelPlayReward copy(@l String name, int i10) {
        m0.p(name, "name");
        return new LevelPlayReward(name, i10);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayReward)) {
            return false;
        }
        LevelPlayReward levelPlayReward = (LevelPlayReward) obj;
        return m0.g(this.f76318a, levelPlayReward.f76318a) && this.f76319b == levelPlayReward.f76319b;
    }

    public final int getAmount() {
        return this.f76319b;
    }

    @l
    public final String getName() {
        return this.f76318a;
    }

    public int hashCode() {
        return (this.f76318a.hashCode() * 31) + this.f76319b;
    }

    @l
    public String toString() {
        return "LevelPlayReward(name=" + this.f76318a + ", amount=" + this.f76319b + j.f86771d;
    }
}
