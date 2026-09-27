package com.monetization.ads.mediation.base.prefetch.model;

import f0.i;
import gi.j;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class MediatedPrefetchRevenue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f71880a;

    public MediatedPrefetchRevenue(double d10) {
        this.f71880a = d10;
    }

    public static /* synthetic */ MediatedPrefetchRevenue copy$default(MediatedPrefetchRevenue mediatedPrefetchRevenue, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = mediatedPrefetchRevenue.f71880a;
        }
        return mediatedPrefetchRevenue.copy(d10);
    }

    public final double component1() {
        return this.f71880a;
    }

    @l
    public final MediatedPrefetchRevenue copy(double d10) {
        return new MediatedPrefetchRevenue(d10);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MediatedPrefetchRevenue) && Double.compare(this.f71880a, ((MediatedPrefetchRevenue) obj).f71880a) == 0;
    }

    public final double getValue() {
        return this.f71880a;
    }

    public int hashCode() {
        return i.a(this.f71880a);
    }

    @l
    public String toString() {
        return "MediatedPrefetchRevenue(value=" + this.f71880a + j.f86771d;
    }
}
