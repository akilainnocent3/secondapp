package com.sporty.android.core.model.realsports;

import defpackage.kwi;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nÊ\u0001\u0002\b\u001a¨\u0006\u0019"}, d2 = {"Lcom/sporty/android/core/model/realsports/EarlyPayoutMarketMapping;", "", "sourceMarketId", "", "sourceSpecifier", "mappedMarketId", "mappedSpecifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSourceMarketId", "()Ljava/lang/String;", "getSourceSpecifier", "getMappedMarketId", "getMappedSpecifier", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EarlyPayoutMarketMapping {
    private final String mappedMarketId;
    private final String mappedSpecifier;
    private final String sourceMarketId;
    private final String sourceSpecifier;

    public /* synthetic */ EarlyPayoutMarketMapping(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ EarlyPayoutMarketMapping copy$default(EarlyPayoutMarketMapping earlyPayoutMarketMapping, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = earlyPayoutMarketMapping.sourceMarketId;
        }
        if ((i & 2) != 0) {
            str2 = earlyPayoutMarketMapping.sourceSpecifier;
        }
        if ((i & 4) != 0) {
            str3 = earlyPayoutMarketMapping.mappedMarketId;
        }
        if ((i & 8) != 0) {
            str4 = earlyPayoutMarketMapping.mappedSpecifier;
        }
        return earlyPayoutMarketMapping.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSourceMarketId() {
        return this.sourceMarketId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSourceSpecifier() {
        return this.sourceSpecifier;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMappedMarketId() {
        return this.mappedMarketId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMappedSpecifier() {
        return this.mappedSpecifier;
    }

    public final EarlyPayoutMarketMapping copy(String sourceMarketId, String sourceSpecifier, String mappedMarketId, String mappedSpecifier) {
        return new EarlyPayoutMarketMapping(sourceMarketId, sourceSpecifier, mappedMarketId, mappedSpecifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarlyPayoutMarketMapping)) {
            return false;
        }
        EarlyPayoutMarketMapping earlyPayoutMarketMapping = (EarlyPayoutMarketMapping) other;
        return Intrinsics.g(this.sourceMarketId, earlyPayoutMarketMapping.sourceMarketId) && Intrinsics.g(this.sourceSpecifier, earlyPayoutMarketMapping.sourceSpecifier) && Intrinsics.g(this.mappedMarketId, earlyPayoutMarketMapping.mappedMarketId) && Intrinsics.g(this.mappedSpecifier, earlyPayoutMarketMapping.mappedSpecifier);
    }

    public final String getMappedMarketId() {
        return this.mappedMarketId;
    }

    public final String getMappedSpecifier() {
        return this.mappedSpecifier;
    }

    public final String getSourceMarketId() {
        return this.sourceMarketId;
    }

    public final String getSourceSpecifier() {
        return this.sourceSpecifier;
    }

    public int hashCode() {
        String str = this.sourceMarketId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sourceSpecifier;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mappedMarketId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mappedSpecifier;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.sourceMarketId;
        String str2 = this.sourceSpecifier;
        return kwi.a(ux5.a("EarlyPayoutMarketMapping(sourceMarketId=", str, ", sourceSpecifier=", str2, ", mappedMarketId="), this.mappedMarketId, ", mappedSpecifier=", this.mappedSpecifier, ")");
    }

    public EarlyPayoutMarketMapping(String str, String str2, String str3, String str4) {
        this.sourceMarketId = str;
        this.sourceSpecifier = str2;
        this.mappedMarketId = str3;
        this.mappedSpecifier = str4;
    }

    public EarlyPayoutMarketMapping() {
        this(null, null, null, null, 15, null);
    }
}
