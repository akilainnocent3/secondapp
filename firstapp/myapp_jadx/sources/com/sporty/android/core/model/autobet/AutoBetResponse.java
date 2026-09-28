package com.sporty.android.core.model.autobet;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/autobet/AutoBetResponse;", "", "settingId", "", "maxDaysBeforeMatch", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getSettingId", "()Ljava/lang/String;", "getMaxDaysBeforeMatch", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/sporty/android/core/model/autobet/AutoBetResponse;", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AutoBetResponse {
    private final Integer maxDaysBeforeMatch;
    private final String settingId;

    public /* synthetic */ AutoBetResponse(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num);
    }

    public static /* synthetic */ AutoBetResponse copy$default(AutoBetResponse autoBetResponse, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoBetResponse.settingId;
        }
        if ((i & 2) != 0) {
            num = autoBetResponse.maxDaysBeforeMatch;
        }
        return autoBetResponse.copy(str, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSettingId() {
        return this.settingId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getMaxDaysBeforeMatch() {
        return this.maxDaysBeforeMatch;
    }

    public final AutoBetResponse copy(String settingId, Integer maxDaysBeforeMatch) {
        return new AutoBetResponse(settingId, maxDaysBeforeMatch);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoBetResponse)) {
            return false;
        }
        AutoBetResponse autoBetResponse = (AutoBetResponse) other;
        return Intrinsics.g(this.settingId, autoBetResponse.settingId) && Intrinsics.g(this.maxDaysBeforeMatch, autoBetResponse.maxDaysBeforeMatch);
    }

    public final Integer getMaxDaysBeforeMatch() {
        return this.maxDaysBeforeMatch;
    }

    public final String getSettingId() {
        return this.settingId;
    }

    public int hashCode() {
        String str = this.settingId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.maxDaysBeforeMatch;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AutoBetResponse(settingId=" + this.settingId + ", maxDaysBeforeMatch=" + this.maxDaysBeforeMatch + ")";
    }

    public AutoBetResponse(String str, Integer num) {
        this.settingId = str;
        this.maxDaysBeforeMatch = num;
    }
}
