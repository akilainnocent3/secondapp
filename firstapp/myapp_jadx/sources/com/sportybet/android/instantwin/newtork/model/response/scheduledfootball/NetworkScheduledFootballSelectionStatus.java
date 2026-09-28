package com.sportybet.android.instantwin.newtork.model.response.scheduledfootball;

import com.google.gson.annotations.SerializedName;
import defpackage.d830;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/scheduledfootball/NetworkScheduledFootballSelectionStatus;", "", "selectionId", "", "selectionStatus", "", "<init>", "(Ljava/lang/String;I)V", "getSelectionId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getSelectionStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkScheduledFootballSelectionStatus {
    public static final int $stable = 0;

    @SerializedName("selectionId")
    private final String selectionId;

    @SerializedName("selectionStatus")
    private final int selectionStatus;

    public NetworkScheduledFootballSelectionStatus(String str, int i) {
        this.selectionId = str;
        this.selectionStatus = i;
    }

    public static /* synthetic */ NetworkScheduledFootballSelectionStatus copy$default(NetworkScheduledFootballSelectionStatus networkScheduledFootballSelectionStatus, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = networkScheduledFootballSelectionStatus.selectionId;
        }
        if ((i2 & 2) != 0) {
            i = networkScheduledFootballSelectionStatus.selectionStatus;
        }
        return networkScheduledFootballSelectionStatus.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSelectionId() {
        return this.selectionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSelectionStatus() {
        return this.selectionStatus;
    }

    public final NetworkScheduledFootballSelectionStatus copy(String selectionId, int selectionStatus) {
        return new NetworkScheduledFootballSelectionStatus(selectionId, selectionStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkScheduledFootballSelectionStatus)) {
            return false;
        }
        NetworkScheduledFootballSelectionStatus networkScheduledFootballSelectionStatus = (NetworkScheduledFootballSelectionStatus) other;
        return Intrinsics.g(this.selectionId, networkScheduledFootballSelectionStatus.selectionId) && this.selectionStatus == networkScheduledFootballSelectionStatus.selectionStatus;
    }

    public final String getSelectionId() {
        return this.selectionId;
    }

    public final int getSelectionStatus() {
        return this.selectionStatus;
    }

    public int hashCode() {
        String str = this.selectionId;
        return Integer.hashCode(this.selectionStatus) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return d830.a(this.selectionStatus, "NetworkScheduledFootballSelectionStatus(selectionId=", this.selectionId, ", selectionStatus=", ")");
    }
}
