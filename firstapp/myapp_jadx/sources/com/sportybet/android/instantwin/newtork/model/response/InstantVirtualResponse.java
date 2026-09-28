package com.sportybet.android.instantwin.newtork.model.response;

import com.google.gson.annotations.SerializedName;
import defpackage.gpp;
import defpackage.ml5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR%\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001b"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/InstantVirtualResponse;", "", "roundId", "", "openBetsCount", "", "wrapEventList", "Lcom/sportybet/android/instantwin/newtork/model/response/InstantVirtualEventListRawData;", "<init>", "(Ljava/lang/String;ILcom/sportybet/android/instantwin/newtork/model/response/InstantVirtualEventListRawData;)V", "getRoundId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getOpenBetsCount", "()I", "getWrapEventList", "()Lcom/sportybet/android/instantwin/newtork/model/response/InstantVirtualEventListRawData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class InstantVirtualResponse {
    public static final int $stable = InstantVirtualEventListRawData.$stable;

    @SerializedName("openBetsCount")
    private final int openBetsCount;

    @SerializedName("roundId")
    private final String roundId;

    @SerializedName("wrapEventList")
    private final InstantVirtualEventListRawData wrapEventList;

    public InstantVirtualResponse(String str, int i, InstantVirtualEventListRawData instantVirtualEventListRawData) {
        str.getClass();
        instantVirtualEventListRawData.getClass();
        this.roundId = str;
        this.openBetsCount = i;
        this.wrapEventList = instantVirtualEventListRawData;
    }

    public static /* synthetic */ InstantVirtualResponse copy$default(InstantVirtualResponse instantVirtualResponse, String str, int i, InstantVirtualEventListRawData instantVirtualEventListRawData, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = instantVirtualResponse.roundId;
        }
        if ((i2 & 2) != 0) {
            i = instantVirtualResponse.openBetsCount;
        }
        if ((i2 & 4) != 0) {
            instantVirtualEventListRawData = instantVirtualResponse.wrapEventList;
        }
        return instantVirtualResponse.copy(str, i, instantVirtualEventListRawData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOpenBetsCount() {
        return this.openBetsCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final InstantVirtualEventListRawData getWrapEventList() {
        return this.wrapEventList;
    }

    public final InstantVirtualResponse copy(String roundId, int openBetsCount, InstantVirtualEventListRawData wrapEventList) {
        roundId.getClass();
        wrapEventList.getClass();
        return new InstantVirtualResponse(roundId, openBetsCount, wrapEventList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstantVirtualResponse)) {
            return false;
        }
        InstantVirtualResponse instantVirtualResponse = (InstantVirtualResponse) other;
        return Intrinsics.g(this.roundId, instantVirtualResponse.roundId) && this.openBetsCount == instantVirtualResponse.openBetsCount && Intrinsics.g(this.wrapEventList, instantVirtualResponse.wrapEventList);
    }

    public final int getOpenBetsCount() {
        return this.openBetsCount;
    }

    public final String getRoundId() {
        return this.roundId;
    }

    public final InstantVirtualEventListRawData getWrapEventList() {
        return this.wrapEventList;
    }

    public int hashCode() {
        return this.wrapEventList.hashCode() + gpp.a(this.openBetsCount, this.roundId.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.roundId;
        int i = this.openBetsCount;
        InstantVirtualEventListRawData instantVirtualEventListRawData = this.wrapEventList;
        StringBuilder sbA = ml5.a(i, "InstantVirtualResponse(roundId=", str, ", openBetsCount=", ", wrapEventList=");
        sbA.append(instantVirtualEventListRawData);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ InstantVirtualResponse(String str, int i, InstantVirtualEventListRawData instantVirtualEventListRawData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i, instantVirtualEventListRawData);
    }
}
