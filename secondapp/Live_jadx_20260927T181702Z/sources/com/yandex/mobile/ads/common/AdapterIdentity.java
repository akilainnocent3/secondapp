package com.yandex.mobile.ads.common;

import gi.j;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class AdapterIdentity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f76811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f76812b;

    public AdapterIdentity(@l String str, @l String str2) {
        this.f76811a = str;
        this.f76812b = str2;
    }

    public static /* synthetic */ AdapterIdentity copy$default(AdapterIdentity adapterIdentity, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = adapterIdentity.f76811a;
        }
        if ((i10 & 2) != 0) {
            str2 = adapterIdentity.f76812b;
        }
        return adapterIdentity.copy(str, str2);
    }

    @l
    public final String component1() {
        return this.f76811a;
    }

    @l
    public final String component2() {
        return this.f76812b;
    }

    @l
    public final AdapterIdentity copy(@l String str, @l String str2) {
        return new AdapterIdentity(str, str2);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdapterIdentity)) {
            return false;
        }
        AdapterIdentity adapterIdentity = (AdapterIdentity) obj;
        return m0.g(this.f76811a, adapterIdentity.f76811a) && m0.g(this.f76812b, adapterIdentity.f76812b);
    }

    @l
    public final String getAdapterNetworkName() {
        return this.f76811a;
    }

    @l
    public final String getAdapterVersion() {
        return this.f76812b;
    }

    public int hashCode() {
        return this.f76812b.hashCode() + (this.f76811a.hashCode() * 31);
    }

    @l
    public String toString() {
        return "AdapterIdentity(adapterNetworkName=" + this.f76811a + ", adapterVersion=" + this.f76812b + j.f86771d;
    }
}
