package com.monetization.ads.mediation.base.prefetch.model;

import gi.j;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class MediatedPrefetchAdapterData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediatedPrefetchNetworkWinner f71875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediatedPrefetchRevenue f71876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f71877c;

    public MediatedPrefetchAdapterData(@l MediatedPrefetchNetworkWinner mediatedPrefetchNetworkWinner, @l MediatedPrefetchRevenue mediatedPrefetchRevenue, @l String str) {
        this.f71875a = mediatedPrefetchNetworkWinner;
        this.f71876b = mediatedPrefetchRevenue;
        this.f71877c = str;
    }

    public static /* synthetic */ MediatedPrefetchAdapterData copy$default(MediatedPrefetchAdapterData mediatedPrefetchAdapterData, MediatedPrefetchNetworkWinner mediatedPrefetchNetworkWinner, MediatedPrefetchRevenue mediatedPrefetchRevenue, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mediatedPrefetchNetworkWinner = mediatedPrefetchAdapterData.f71875a;
        }
        if ((i10 & 2) != 0) {
            mediatedPrefetchRevenue = mediatedPrefetchAdapterData.f71876b;
        }
        if ((i10 & 4) != 0) {
            str = mediatedPrefetchAdapterData.f71877c;
        }
        return mediatedPrefetchAdapterData.copy(mediatedPrefetchNetworkWinner, mediatedPrefetchRevenue, str);
    }

    @l
    public final MediatedPrefetchNetworkWinner component1() {
        return this.f71875a;
    }

    @l
    public final MediatedPrefetchRevenue component2() {
        return this.f71876b;
    }

    @l
    public final String component3() {
        return this.f71877c;
    }

    @l
    public final MediatedPrefetchAdapterData copy(@l MediatedPrefetchNetworkWinner mediatedPrefetchNetworkWinner, @l MediatedPrefetchRevenue mediatedPrefetchRevenue, @l String str) {
        return new MediatedPrefetchAdapterData(mediatedPrefetchNetworkWinner, mediatedPrefetchRevenue, str);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediatedPrefetchAdapterData)) {
            return false;
        }
        MediatedPrefetchAdapterData mediatedPrefetchAdapterData = (MediatedPrefetchAdapterData) obj;
        return m0.g(this.f71875a, mediatedPrefetchAdapterData.f71875a) && m0.g(this.f71876b, mediatedPrefetchAdapterData.f71876b) && m0.g(this.f71877c, mediatedPrefetchAdapterData.f71877c);
    }

    @l
    public final String getNetworkAdInfo() {
        return this.f71877c;
    }

    @l
    public final MediatedPrefetchNetworkWinner getNetworkWinner() {
        return this.f71875a;
    }

    @l
    public final MediatedPrefetchRevenue getRevenue() {
        return this.f71876b;
    }

    public int hashCode() {
        return this.f71877c.hashCode() + ((this.f71876b.hashCode() + (this.f71875a.hashCode() * 31)) * 31);
    }

    @l
    public String toString() {
        return "MediatedPrefetchAdapterData(networkWinner=" + this.f71875a + ", revenue=" + this.f71876b + ", networkAdInfo=" + this.f71877c + j.f86771d;
    }
}
