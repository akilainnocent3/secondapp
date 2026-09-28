package com.sporty.android.book.domain.entity;

import defpackage.gmf0;
import defpackage.hxa;
import defpackage.qn4;
import defpackage.ux5;
import defpackage.x9d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0002¨\u0006 "}, d2 = {"Lcom/sporty/android/book/domain/entity/EarlyPayoutMarket;", "", "name", "", "sourceMarketId", "sourceSpecifier", "mappedMarketId", "mappedSpecifier", "supported", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getSourceMarketId", "getSourceSpecifier", "getMappedMarketId", "getMappedSpecifier", "getSupported", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EarlyPayoutMarket {
    public static final int $stable = 0;
    private final String mappedMarketId;
    private final String mappedSpecifier;
    private final String name;
    private final String sourceMarketId;
    private final String sourceSpecifier;
    private final boolean supported;

    public EarlyPayoutMarket(String str, String str2, String str3, String str4, String str5, boolean z) {
        qn4.b(str, str2, str3, str4, str5);
        this.name = str;
        this.sourceMarketId = str2;
        this.sourceSpecifier = str3;
        this.mappedMarketId = str4;
        this.mappedSpecifier = str5;
        this.supported = z;
    }

    public static /* synthetic */ EarlyPayoutMarket copy$default(EarlyPayoutMarket earlyPayoutMarket, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = earlyPayoutMarket.name;
        }
        if ((i & 2) != 0) {
            str2 = earlyPayoutMarket.sourceMarketId;
        }
        if ((i & 4) != 0) {
            str3 = earlyPayoutMarket.sourceSpecifier;
        }
        if ((i & 8) != 0) {
            str4 = earlyPayoutMarket.mappedMarketId;
        }
        if ((i & 16) != 0) {
            str5 = earlyPayoutMarket.mappedSpecifier;
        }
        if ((i & 32) != 0) {
            z = earlyPayoutMarket.supported;
        }
        String str6 = str5;
        boolean z2 = z;
        return earlyPayoutMarket.copy(str, str2, str3, str4, str6, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSourceMarketId() {
        return this.sourceMarketId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSourceSpecifier() {
        return this.sourceSpecifier;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMappedMarketId() {
        return this.mappedMarketId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMappedSpecifier() {
        return this.mappedSpecifier;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getSupported() {
        return this.supported;
    }

    public final EarlyPayoutMarket copy(String name, String sourceMarketId, String sourceSpecifier, String mappedMarketId, String mappedSpecifier, boolean supported) {
        name.getClass();
        sourceMarketId.getClass();
        sourceSpecifier.getClass();
        mappedMarketId.getClass();
        mappedSpecifier.getClass();
        return new EarlyPayoutMarket(name, sourceMarketId, sourceSpecifier, mappedMarketId, mappedSpecifier, supported);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarlyPayoutMarket)) {
            return false;
        }
        EarlyPayoutMarket earlyPayoutMarket = (EarlyPayoutMarket) other;
        return Intrinsics.g(this.name, earlyPayoutMarket.name) && Intrinsics.g(this.sourceMarketId, earlyPayoutMarket.sourceMarketId) && Intrinsics.g(this.sourceSpecifier, earlyPayoutMarket.sourceSpecifier) && Intrinsics.g(this.mappedMarketId, earlyPayoutMarket.mappedMarketId) && Intrinsics.g(this.mappedSpecifier, earlyPayoutMarket.mappedSpecifier) && this.supported == earlyPayoutMarket.supported;
    }

    public final String getMappedMarketId() {
        return this.mappedMarketId;
    }

    public final String getMappedSpecifier() {
        return this.mappedSpecifier;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSourceMarketId() {
        return this.sourceMarketId;
    }

    public final String getSourceSpecifier() {
        return this.sourceSpecifier;
    }

    public final boolean getSupported() {
        return this.supported;
    }

    public int hashCode() {
        return Boolean.hashCode(this.supported) + gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.name.hashCode() * 31, 31, this.sourceMarketId), 31, this.sourceSpecifier), 31, this.mappedMarketId), 31, this.mappedSpecifier);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.sourceMarketId;
        String str3 = this.sourceSpecifier;
        String str4 = this.mappedMarketId;
        String str5 = this.mappedSpecifier;
        boolean z = this.supported;
        StringBuilder sbA = ux5.a("EarlyPayoutMarket(name=", str, ", sourceMarketId=", str2, ", sourceSpecifier=");
        hxa.c(sbA, str3, ", mappedMarketId=", str4, ", mappedSpecifier=");
        return x9d.a(str5, ", supported=", ")", sbA, z);
    }
}
