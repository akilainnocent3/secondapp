package com.cleveradssolutions.internal.integration;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f43549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f43550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f43551d;

    public i(String name, d version, d sdk, d config) {
        m0.p(name, "name");
        m0.p(version, "version");
        m0.p(sdk, "sdk");
        m0.p(config, "config");
        this.f43548a = name;
        this.f43549b = version;
        this.f43550c = sdk;
        this.f43551d = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return m0.g(this.f43548a, iVar.f43548a) && m0.g(this.f43549b, iVar.f43549b) && m0.g(this.f43550c, iVar.f43550c) && m0.g(this.f43551d, iVar.f43551d);
    }

    public final int hashCode() {
        return this.f43551d.hashCode() + ((this.f43550c.hashCode() + ((this.f43549b.hashCode() + (this.f43548a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "IPAdaptersItem(name=" + this.f43548a + ", version=" + this.f43549b + ", sdk=" + this.f43550c + ", config=" + this.f43551d + ')';
    }

    public /* synthetic */ i(String str, d dVar, int i10) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? new d(null, null, (byte) 0, null, 15) : dVar, (i10 & 4) != 0 ? new d(null, null, (byte) 0, null, 15) : null, (i10 & 8) != 0 ? new d(null, null, (byte) 0, null, 15) : null);
    }
}
