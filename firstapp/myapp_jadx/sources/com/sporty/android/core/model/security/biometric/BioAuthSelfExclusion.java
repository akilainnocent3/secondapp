package com.sporty.android.core.model.security.biometric;

import com.appsflyer.internal.l;
import com.google.gson.annotations.SerializedName;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.zug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0018\u001a\u00020\u0005J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0014\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004J\n\u0010$\u001a\u00020\bHÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R%\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R%\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R%\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R%\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012Ê\u0001\u0002\b&¨\u0006%"}, d2 = {"Lcom/sporty/android/core/model/security/biometric/BioAuthSelfExclusion;", "", "coolDown", "", "remainingTimeForNextBlocking", "", "remainingTimeForUnblocking", "selfExclusionType", "", "startDate", "endDate", "<init>", "(ZJJLjava/lang/String;JJ)V", "getCoolDown", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "getRemainingTimeForNextBlocking", "()J", "getRemainingTimeForUnblocking", "getSelfExclusionType", "()Ljava/lang/String;", "getStartDate", "getEndDate", "resolveLoginTime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BioAuthSelfExclusion {

    @SerializedName("coolDown")
    private final boolean coolDown;

    @SerializedName("endDate")
    private final long endDate;

    @SerializedName("remainingTimeForNextBlocking")
    private final long remainingTimeForNextBlocking;

    @SerializedName("remainingTimeForUnblocking")
    private final long remainingTimeForUnblocking;

    @SerializedName("selfExclusionType")
    private final String selfExclusionType;

    @SerializedName("startDate")
    private final long startDate;

    public BioAuthSelfExclusion(boolean z, long j, long j2, String str, long j3, long j4) {
        str.getClass();
        this.coolDown = z;
        this.remainingTimeForNextBlocking = j;
        this.remainingTimeForUnblocking = j2;
        this.selfExclusionType = str;
        this.startDate = j3;
        this.endDate = j4;
    }

    public static /* synthetic */ BioAuthSelfExclusion copy$default(BioAuthSelfExclusion bioAuthSelfExclusion, boolean z, long j, long j2, String str, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bioAuthSelfExclusion.coolDown;
        }
        if ((i & 2) != 0) {
            j = bioAuthSelfExclusion.remainingTimeForNextBlocking;
        }
        if ((i & 4) != 0) {
            j2 = bioAuthSelfExclusion.remainingTimeForUnblocking;
        }
        if ((i & 8) != 0) {
            str = bioAuthSelfExclusion.selfExclusionType;
        }
        if ((i & 16) != 0) {
            j3 = bioAuthSelfExclusion.startDate;
        }
        if ((i & 32) != 0) {
            j4 = bioAuthSelfExclusion.endDate;
        }
        String str2 = str;
        long j5 = j2;
        return bioAuthSelfExclusion.copy(z, j, j5, str2, j3, j4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getCoolDown() {
        return this.coolDown;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getRemainingTimeForNextBlocking() {
        return this.remainingTimeForNextBlocking;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getRemainingTimeForUnblocking() {
        return this.remainingTimeForUnblocking;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSelfExclusionType() {
        return this.selfExclusionType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getEndDate() {
        return this.endDate;
    }

    public final BioAuthSelfExclusion copy(boolean coolDown, long remainingTimeForNextBlocking, long remainingTimeForUnblocking, String selfExclusionType, long startDate, long endDate) {
        selfExclusionType.getClass();
        return new BioAuthSelfExclusion(coolDown, remainingTimeForNextBlocking, remainingTimeForUnblocking, selfExclusionType, startDate, endDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BioAuthSelfExclusion)) {
            return false;
        }
        BioAuthSelfExclusion bioAuthSelfExclusion = (BioAuthSelfExclusion) other;
        return this.coolDown == bioAuthSelfExclusion.coolDown && this.remainingTimeForNextBlocking == bioAuthSelfExclusion.remainingTimeForNextBlocking && this.remainingTimeForUnblocking == bioAuthSelfExclusion.remainingTimeForUnblocking && Intrinsics.g(this.selfExclusionType, bioAuthSelfExclusion.selfExclusionType) && this.startDate == bioAuthSelfExclusion.startDate && this.endDate == bioAuthSelfExclusion.endDate;
    }

    public final boolean getCoolDown() {
        return this.coolDown;
    }

    public final long getEndDate() {
        return this.endDate;
    }

    public final long getRemainingTimeForNextBlocking() {
        return this.remainingTimeForNextBlocking;
    }

    public final long getRemainingTimeForUnblocking() {
        return this.remainingTimeForUnblocking;
    }

    public final String getSelfExclusionType() {
        return this.selfExclusionType;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        return Long.hashCode(this.endDate) + f87.a(gmf0.a(f87.a(f87.a(Boolean.hashCode(this.coolDown) * 31, this.remainingTimeForNextBlocking, 31), this.remainingTimeForUnblocking, 31), 31, this.selfExclusionType), this.startDate, 31);
    }

    public final long resolveLoginTime() {
        if (StringsKt.U(this.selfExclusionType) && this.startDate == 0 && this.endDate == 0) {
            return System.currentTimeMillis();
        }
        return 0L;
    }

    public String toString() {
        boolean z = this.coolDown;
        long j = this.remainingTimeForNextBlocking;
        long j2 = this.remainingTimeForUnblocking;
        String str = this.selfExclusionType;
        long j3 = this.startDate;
        long j4 = this.endDate;
        StringBuilder sb = new StringBuilder("BioAuthSelfExclusion(coolDown=");
        sb.append(z);
        sb.append(", remainingTimeForNextBlocking=");
        sb.append(j);
        g41.a(j2, ", remainingTimeForUnblocking=", ", selfExclusionType=", sb);
        l.a(j3, str, ", startDate=", sb);
        return zug.a(j4, ", endDate=", ")", sb);
    }
}
