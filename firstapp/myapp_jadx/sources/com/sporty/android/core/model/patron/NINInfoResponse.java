package com.sporty.android.core.model.patron;

import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u0007¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\u0002\b\u001c¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/core/model/patron/NINInfoResponse;", "", "ninDescription", "", "ninInfo", "Lcom/sporty/android/core/model/patron/NINInfo;", "ninStatus", "", "<init>", "(Ljava/lang/String;Lcom/sporty/android/core/model/patron/NINInfo;I)V", "getNinDescription", "()Ljava/lang/String;", "getNinInfo", "()Lcom/sporty/android/core/model/patron/NINInfo;", "getNinStatus$annotations", "()V", "getNinStatus", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NINInfoResponse {
    private final String ninDescription;
    private final NINInfo ninInfo;
    private final int ninStatus;

    public NINInfoResponse(String str, NINInfo nINInfo, int i) {
        this.ninDescription = str;
        this.ninInfo = nINInfo;
        this.ninStatus = i;
    }

    public static /* synthetic */ NINInfoResponse copy$default(NINInfoResponse nINInfoResponse, String str, NINInfo nINInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = nINInfoResponse.ninDescription;
        }
        if ((i2 & 2) != 0) {
            nINInfo = nINInfoResponse.ninInfo;
        }
        if ((i2 & 4) != 0) {
            i = nINInfoResponse.ninStatus;
        }
        return nINInfoResponse.copy(str, nINInfo, i);
    }

    public static /* synthetic */ void getNinStatus$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNinDescription() {
        return this.ninDescription;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NINInfo getNinInfo() {
        return this.ninInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNinStatus() {
        return this.ninStatus;
    }

    public final NINInfoResponse copy(String ninDescription, NINInfo ninInfo, int ninStatus) {
        return new NINInfoResponse(ninDescription, ninInfo, ninStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NINInfoResponse)) {
            return false;
        }
        NINInfoResponse nINInfoResponse = (NINInfoResponse) other;
        return Intrinsics.g(this.ninDescription, nINInfoResponse.ninDescription) && Intrinsics.g(this.ninInfo, nINInfoResponse.ninInfo) && this.ninStatus == nINInfoResponse.ninStatus;
    }

    public final String getNinDescription() {
        return this.ninDescription;
    }

    public final NINInfo getNinInfo() {
        return this.ninInfo;
    }

    public final int getNinStatus() {
        return this.ninStatus;
    }

    public int hashCode() {
        String str = this.ninDescription;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        NINInfo nINInfo = this.ninInfo;
        return Integer.hashCode(this.ninStatus) + ((iHashCode + (nINInfo != null ? nINInfo.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.ninDescription;
        NINInfo nINInfo = this.ninInfo;
        int i = this.ninStatus;
        StringBuilder sb = new StringBuilder("NINInfoResponse(ninDescription=");
        sb.append(str);
        sb.append(", ninInfo=");
        sb.append(nINInfo);
        sb.append(", ninStatus=");
        return zk1.a(i, ")", sb);
    }
}
