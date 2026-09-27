package io.appmetrica.analytics.identifiers.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentifierStatus f95420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f95421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f95422c;

    public c(IdentifierStatus identifierStatus, a aVar, String str) {
        this.f95420a = identifierStatus;
        this.f95421b = aVar;
        this.f95422c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f95420a == cVar.f95420a && m0.g(this.f95421b, cVar.f95421b) && m0.g(this.f95422c, cVar.f95422c);
    }

    public final int hashCode() {
        int iHashCode = this.f95420a.hashCode() * 31;
        a aVar = this.f95421b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f95422c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdResult(status=" + this.f95420a + ", advIdInfo=" + this.f95421b + ", errorExplanation=" + this.f95422c + ')';
    }

    public /* synthetic */ c(IdentifierStatus identifierStatus, a aVar, String str, int i10) {
        this(identifierStatus, (i10 & 2) != 0 ? null : aVar, (i10 & 4) != 0 ? null : str);
    }
}
