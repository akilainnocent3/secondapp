package com.monetization.ads.mediation.base.prefetch.model;

import gi.j;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class MediatedPrefetchNetworkWinner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f71878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f71879b;

    public MediatedPrefetchNetworkWinner(@l String str, @l String str2) {
        this.f71878a = str;
        this.f71879b = str2;
    }

    public static /* synthetic */ MediatedPrefetchNetworkWinner copy$default(MediatedPrefetchNetworkWinner mediatedPrefetchNetworkWinner, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mediatedPrefetchNetworkWinner.f71878a;
        }
        if ((i10 & 2) != 0) {
            str2 = mediatedPrefetchNetworkWinner.f71879b;
        }
        return mediatedPrefetchNetworkWinner.copy(str, str2);
    }

    @l
    public final String component1() {
        return this.f71878a;
    }

    @l
    public final String component2() {
        return this.f71879b;
    }

    @l
    public final MediatedPrefetchNetworkWinner copy(@l String str, @l String str2) {
        return new MediatedPrefetchNetworkWinner(str, str2);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediatedPrefetchNetworkWinner)) {
            return false;
        }
        MediatedPrefetchNetworkWinner mediatedPrefetchNetworkWinner = (MediatedPrefetchNetworkWinner) obj;
        return m0.g(this.f71878a, mediatedPrefetchNetworkWinner.f71878a) && m0.g(this.f71879b, mediatedPrefetchNetworkWinner.f71879b);
    }

    @l
    public final String getNetworkAdUnit() {
        return this.f71879b;
    }

    @l
    public final String getNetworkName() {
        return this.f71878a;
    }

    public int hashCode() {
        return this.f71879b.hashCode() + (this.f71878a.hashCode() * 31);
    }

    @l
    public String toString() {
        return "MediatedPrefetchNetworkWinner(networkName=" + this.f71878a + ", networkAdUnit=" + this.f71879b + j.f86771d;
    }
}
