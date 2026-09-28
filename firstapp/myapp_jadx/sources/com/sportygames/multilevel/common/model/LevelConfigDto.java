package com.sportygames.multilevel.common.model;

import com.google.gson.annotations.SerializedName;
import com.sportygames.crash.models.header.snc.OdQr;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/sportygames/multilevel/common/model/LevelConfigDto;", "", "isUpdated", "", "messageType", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getMessageType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LevelConfigDto {
    public static final int $stable = 0;

    @SerializedName("isUpdated")
    private final boolean isUpdated;

    @SerializedName("messageType")
    private final String messageType;

    public /* synthetic */ LevelConfigDto(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ LevelConfigDto copy$default(LevelConfigDto levelConfigDto, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = levelConfigDto.isUpdated;
        }
        if ((i & 2) != 0) {
            str = levelConfigDto.messageType;
        }
        return levelConfigDto.copy(z, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsUpdated() {
        return this.isUpdated;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    public final LevelConfigDto copy(boolean isUpdated, String messageType) {
        return new LevelConfigDto(isUpdated, messageType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LevelConfigDto)) {
            return false;
        }
        LevelConfigDto levelConfigDto = (LevelConfigDto) other;
        return this.isUpdated == levelConfigDto.isUpdated && Intrinsics.g(this.messageType, levelConfigDto.messageType);
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isUpdated) * 31;
        String str = this.messageType;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isUpdated() {
        return this.isUpdated;
    }

    public String toString() {
        return "LevelConfigDto(isUpdated=" + this.isUpdated + ", messageType=" + this.messageType + OdQr.hGAxhaP;
    }

    public LevelConfigDto(boolean z, String str) {
        this.isUpdated = z;
        this.messageType = str;
    }
}
