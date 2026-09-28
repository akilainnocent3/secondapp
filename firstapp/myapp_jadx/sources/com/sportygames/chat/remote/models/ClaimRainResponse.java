package com.sportygames.chat.remote.models;

import defpackage.ng1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/sportygames/chat/remote/models/ClaimRainResponse;", "", "giftClaimId", "", "claimLimit", "Lcom/sportygames/chat/remote/models/ClaimLimit;", "errors", "", "Lcom/sportygames/chat/remote/models/ClaimError;", "<init>", "(Ljava/lang/String;Lcom/sportygames/chat/remote/models/ClaimLimit;Ljava/util/List;)V", "getGiftClaimId", "()Ljava/lang/String;", "getClaimLimit", "()Lcom/sportygames/chat/remote/models/ClaimLimit;", "getErrors", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ClaimRainResponse {
    public static final int $stable = 8;
    private final ClaimLimit claimLimit;
    private final List<ClaimError> errors;
    private final String giftClaimId;

    public ClaimRainResponse(String str, ClaimLimit claimLimit, List<ClaimError> list) {
        this.giftClaimId = str;
        this.claimLimit = claimLimit;
        this.errors = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClaimRainResponse copy$default(ClaimRainResponse claimRainResponse, String str, ClaimLimit claimLimit, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = claimRainResponse.giftClaimId;
        }
        if ((i & 2) != 0) {
            claimLimit = claimRainResponse.claimLimit;
        }
        if ((i & 4) != 0) {
            list = claimRainResponse.errors;
        }
        return claimRainResponse.copy(str, claimLimit, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGiftClaimId() {
        return this.giftClaimId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ClaimLimit getClaimLimit() {
        return this.claimLimit;
    }

    public final List<ClaimError> component3() {
        return this.errors;
    }

    public final ClaimRainResponse copy(String giftClaimId, ClaimLimit claimLimit, List<ClaimError> errors) {
        return new ClaimRainResponse(giftClaimId, claimLimit, errors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClaimRainResponse)) {
            return false;
        }
        ClaimRainResponse claimRainResponse = (ClaimRainResponse) other;
        return Intrinsics.g(this.giftClaimId, claimRainResponse.giftClaimId) && Intrinsics.g(this.claimLimit, claimRainResponse.claimLimit) && Intrinsics.g(this.errors, claimRainResponse.errors);
    }

    public final ClaimLimit getClaimLimit() {
        return this.claimLimit;
    }

    public final List<ClaimError> getErrors() {
        return this.errors;
    }

    public final String getGiftClaimId() {
        return this.giftClaimId;
    }

    public int hashCode() {
        String str = this.giftClaimId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ClaimLimit claimLimit = this.claimLimit;
        int iHashCode2 = (iHashCode + (claimLimit == null ? 0 : claimLimit.hashCode())) * 31;
        List<ClaimError> list = this.errors;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.giftClaimId;
        ClaimLimit claimLimit = this.claimLimit;
        List<ClaimError> list = this.errors;
        StringBuilder sb = new StringBuilder("ClaimRainResponse(giftClaimId=");
        sb.append(str);
        sb.append(", claimLimit=");
        sb.append(claimLimit);
        sb.append(", errors=");
        return ng1.a(sb, list, ")");
    }
}
