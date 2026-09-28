package com.sporty.android.core.model.loyalty;

import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/sporty/android/core/model/loyalty/RewardShowOffUploadResult;", "", "redirectCode", "", "fileUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRedirectCode", "()Ljava/lang/String;", "getFileUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RewardShowOffUploadResult {
    private final String fileUrl;
    private final String redirectCode;

    public RewardShowOffUploadResult(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.redirectCode = str;
        this.fileUrl = str2;
    }

    public static /* synthetic */ RewardShowOffUploadResult copy$default(RewardShowOffUploadResult rewardShowOffUploadResult, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardShowOffUploadResult.redirectCode;
        }
        if ((i & 2) != 0) {
            str2 = rewardShowOffUploadResult.fileUrl;
        }
        return rewardShowOffUploadResult.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRedirectCode() {
        return this.redirectCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final RewardShowOffUploadResult copy(String redirectCode, String fileUrl) {
        redirectCode.getClass();
        fileUrl.getClass();
        return new RewardShowOffUploadResult(redirectCode, fileUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardShowOffUploadResult)) {
            return false;
        }
        RewardShowOffUploadResult rewardShowOffUploadResult = (RewardShowOffUploadResult) other;
        return Intrinsics.g(this.redirectCode, rewardShowOffUploadResult.redirectCode) && Intrinsics.g(this.fileUrl, rewardShowOffUploadResult.fileUrl);
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final String getRedirectCode() {
        return this.redirectCode;
    }

    public int hashCode() {
        return this.fileUrl.hashCode() + (this.redirectCode.hashCode() * 31);
    }

    public String toString() {
        return tx5.a("RewardShowOffUploadResult(redirectCode=", this.redirectCode, ", fileUrl=", this.fileUrl, ")");
    }
}
