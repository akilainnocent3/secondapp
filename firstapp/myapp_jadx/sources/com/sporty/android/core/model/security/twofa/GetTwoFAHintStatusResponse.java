package com.sporty.android.core.model.security.twofa;

import com.google.gson.annotations.SerializedName;
import defpackage.mq0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR%\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/sporty/android/core/model/security/twofa/GetTwoFAHintStatusResponse;", "", "userId", "", "twoFAHintInfo", "Lcom/sporty/android/core/model/security/twofa/TwoFAHintInfo;", "shouldDisplayReminder", "", "<init>", "(Ljava/lang/String;Lcom/sporty/android/core/model/security/twofa/TwoFAHintInfo;Z)V", "getUserId", "()Ljava/lang/String;", "getTwoFAHintInfo", "()Lcom/sporty/android/core/model/security/twofa/TwoFAHintInfo;", "Lcom/google/gson/annotations/SerializedName;", "value", "displayIndicator", "getShouldDisplayReminder", "()Z", "displayPopupNotice", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GetTwoFAHintStatusResponse {

    @SerializedName("displayPopupNotice")
    private final boolean shouldDisplayReminder;

    @SerializedName("displayIndicator")
    private final TwoFAHintInfo twoFAHintInfo;
    private final String userId;

    public GetTwoFAHintStatusResponse(String str, TwoFAHintInfo twoFAHintInfo, boolean z) {
        str.getClass();
        twoFAHintInfo.getClass();
        this.userId = str;
        this.twoFAHintInfo = twoFAHintInfo;
        this.shouldDisplayReminder = z;
    }

    public static /* synthetic */ GetTwoFAHintStatusResponse copy$default(GetTwoFAHintStatusResponse getTwoFAHintStatusResponse, String str, TwoFAHintInfo twoFAHintInfo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getTwoFAHintStatusResponse.userId;
        }
        if ((i & 2) != 0) {
            twoFAHintInfo = getTwoFAHintStatusResponse.twoFAHintInfo;
        }
        if ((i & 4) != 0) {
            z = getTwoFAHintStatusResponse.shouldDisplayReminder;
        }
        return getTwoFAHintStatusResponse.copy(str, twoFAHintInfo, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TwoFAHintInfo getTwoFAHintInfo() {
        return this.twoFAHintInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShouldDisplayReminder() {
        return this.shouldDisplayReminder;
    }

    public final GetTwoFAHintStatusResponse copy(String userId, TwoFAHintInfo twoFAHintInfo, boolean shouldDisplayReminder) {
        userId.getClass();
        twoFAHintInfo.getClass();
        return new GetTwoFAHintStatusResponse(userId, twoFAHintInfo, shouldDisplayReminder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetTwoFAHintStatusResponse)) {
            return false;
        }
        GetTwoFAHintStatusResponse getTwoFAHintStatusResponse = (GetTwoFAHintStatusResponse) other;
        return Intrinsics.g(this.userId, getTwoFAHintStatusResponse.userId) && Intrinsics.g(this.twoFAHintInfo, getTwoFAHintStatusResponse.twoFAHintInfo) && this.shouldDisplayReminder == getTwoFAHintStatusResponse.shouldDisplayReminder;
    }

    public final boolean getShouldDisplayReminder() {
        return this.shouldDisplayReminder;
    }

    public final TwoFAHintInfo getTwoFAHintInfo() {
        return this.twoFAHintInfo;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldDisplayReminder) + ((this.twoFAHintInfo.hashCode() + (this.userId.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.userId;
        TwoFAHintInfo twoFAHintInfo = this.twoFAHintInfo;
        boolean z = this.shouldDisplayReminder;
        StringBuilder sb = new StringBuilder("GetTwoFAHintStatusResponse(userId=");
        sb.append(str);
        sb.append(", twoFAHintInfo=");
        sb.append(twoFAHintInfo);
        sb.append(", shouldDisplayReminder=");
        return mq0.a(sb, z, ")");
    }
}
