package com.sporty.android.core.model.dateofbirth;

import defpackage.gpp;
import defpackage.ml5;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/sporty/android/core/model/dateofbirth/DobVerificationStatus;", "", "userId", "", "dobVerifyStatus", "", "minQualifiedTier", "<init>", "(Ljava/lang/String;II)V", "getUserId", "()Ljava/lang/String;", "getDobVerifyStatus", "()I", "getMinQualifiedTier", "isVerified", "", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DobVerificationStatus {
    private final int dobVerifyStatus;
    private final int minQualifiedTier;
    private final String userId;

    public DobVerificationStatus(String str, int i, int i2) {
        str.getClass();
        this.userId = str;
        this.dobVerifyStatus = i;
        this.minQualifiedTier = i2;
    }

    public static /* synthetic */ DobVerificationStatus copy$default(DobVerificationStatus dobVerificationStatus, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = dobVerificationStatus.userId;
        }
        if ((i3 & 2) != 0) {
            i = dobVerificationStatus.dobVerifyStatus;
        }
        if ((i3 & 4) != 0) {
            i2 = dobVerificationStatus.minQualifiedTier;
        }
        return dobVerificationStatus.copy(str, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDobVerifyStatus() {
        return this.dobVerifyStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMinQualifiedTier() {
        return this.minQualifiedTier;
    }

    public final DobVerificationStatus copy(String userId, int dobVerifyStatus, int minQualifiedTier) {
        userId.getClass();
        return new DobVerificationStatus(userId, dobVerifyStatus, minQualifiedTier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DobVerificationStatus)) {
            return false;
        }
        DobVerificationStatus dobVerificationStatus = (DobVerificationStatus) other;
        return Intrinsics.g(this.userId, dobVerificationStatus.userId) && this.dobVerifyStatus == dobVerificationStatus.dobVerifyStatus && this.minQualifiedTier == dobVerificationStatus.minQualifiedTier;
    }

    public final int getDobVerifyStatus() {
        return this.dobVerifyStatus;
    }

    public final int getMinQualifiedTier() {
        return this.minQualifiedTier;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Integer.hashCode(this.minQualifiedTier) + gpp.a(this.dobVerifyStatus, this.userId.hashCode() * 31, 31);
    }

    public final boolean isVerified() {
        return this.dobVerifyStatus == 1;
    }

    public String toString() {
        String str = this.userId;
        return zk1.a(this.minQualifiedTier, ")", ml5.a(this.dobVerifyStatus, "DobVerificationStatus(userId=", str, ", dobVerifyStatus=", ", minQualifiedTier="));
    }
}
