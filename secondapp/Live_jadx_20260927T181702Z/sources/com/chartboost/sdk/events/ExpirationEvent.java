package com.chartboost.sdk.events;

import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.impl.i8;
import gi.j;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class ExpirationEvent {

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    @l
    private final Ad f38140ad;

    @l
    private final i8 reason;

    public ExpirationEvent(@l Ad ad2, @l i8 reason) {
        m0.p(ad2, "ad");
        m0.p(reason, "reason");
        this.f38140ad = ad2;
        this.reason = reason;
    }

    public static /* synthetic */ ExpirationEvent copy$default(ExpirationEvent expirationEvent, Ad ad2, i8 i8Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            ad2 = expirationEvent.f38140ad;
        }
        if ((i10 & 2) != 0) {
            i8Var = expirationEvent.reason;
        }
        return expirationEvent.copy(ad2, i8Var);
    }

    @l
    public final Ad component1() {
        return this.f38140ad;
    }

    @l
    public final i8 component2() {
        return this.reason;
    }

    @l
    public final ExpirationEvent copy(@l Ad ad2, @l i8 reason) {
        m0.p(ad2, "ad");
        m0.p(reason, "reason");
        return new ExpirationEvent(ad2, reason);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpirationEvent)) {
            return false;
        }
        ExpirationEvent expirationEvent = (ExpirationEvent) obj;
        return m0.g(this.f38140ad, expirationEvent.f38140ad) && this.reason == expirationEvent.reason;
    }

    @l
    public final Ad getAd() {
        return this.f38140ad;
    }

    @l
    public final i8 getReason() {
        return this.reason;
    }

    public int hashCode() {
        return (this.f38140ad.hashCode() * 31) + this.reason.hashCode();
    }

    @l
    public String toString() {
        return "ExpirationEvent(ad=" + this.f38140ad + ", reason=" + this.reason + j.f86771d;
    }
}
