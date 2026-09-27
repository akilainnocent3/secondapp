package com.cleveradssolutions.internal.integration;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f43537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f43538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f43539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f43540d;

    public d(String state, String message, byte b10, String str) {
        m0.p(state, "state");
        m0.p(message, "message");
        this.f43537a = state;
        this.f43538b = message;
        this.f43539c = b10;
        this.f43540d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return m0.g(this.f43537a, dVar.f43537a) && m0.g(this.f43538b, dVar.f43538b) && this.f43539c == dVar.f43539c && m0.g(this.f43540d, dVar.f43540d);
    }

    public final int hashCode() {
        int iHashCode = (this.f43539c + ((this.f43538b.hashCode() + (this.f43537a.hashCode() * 31)) * 31)) * 31;
        String str = this.f43540d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "IntegrationStep(state=" + this.f43537a + ", message=" + this.f43538b + ", mark=" + ((int) this.f43539c) + ", title=" + this.f43540d + ')';
    }

    public /* synthetic */ d(String str, String str2, byte b10, String str3, int i10) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? (byte) 0 : b10, (i10 & 8) != 0 ? null : str3);
    }
}
