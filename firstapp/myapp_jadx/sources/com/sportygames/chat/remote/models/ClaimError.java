package com.sportygames.chat.remote.models;

import com.twilio.voice.EventKeys;
import defpackage.pq6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/sportygames/chat/remote/models/ClaimError;", "", "bizCode", "", EventKeys.ERROR_MESSAGE, "", "params", "Lcom/sportygames/chat/remote/models/ClaimErrorParams;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/sportygames/chat/remote/models/ClaimErrorParams;)V", "getBizCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessage", "()Ljava/lang/String;", "getParams", "()Lcom/sportygames/chat/remote/models/ClaimErrorParams;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/sportygames/chat/remote/models/ClaimErrorParams;)Lcom/sportygames/chat/remote/models/ClaimError;", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ClaimError {
    public static final int $stable = 0;
    private final Integer bizCode;
    private final String message;
    private final ClaimErrorParams params;

    public ClaimError(Integer num, String str, ClaimErrorParams claimErrorParams) {
        this.bizCode = num;
        this.message = str;
        this.params = claimErrorParams;
    }

    public static /* synthetic */ ClaimError copy$default(ClaimError claimError, Integer num, String str, ClaimErrorParams claimErrorParams, int i, Object obj) {
        if ((i & 1) != 0) {
            num = claimError.bizCode;
        }
        if ((i & 2) != 0) {
            str = claimError.message;
        }
        if ((i & 4) != 0) {
            claimErrorParams = claimError.params;
        }
        return claimError.copy(num, str, claimErrorParams);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getBizCode() {
        return this.bizCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ClaimErrorParams getParams() {
        return this.params;
    }

    public final ClaimError copy(Integer bizCode, String message, ClaimErrorParams params) {
        return new ClaimError(bizCode, message, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClaimError)) {
            return false;
        }
        ClaimError claimError = (ClaimError) other;
        return Intrinsics.g(this.bizCode, claimError.bizCode) && Intrinsics.g(this.message, claimError.message) && Intrinsics.g(this.params, claimError.params);
    }

    public final Integer getBizCode() {
        return this.bizCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public final ClaimErrorParams getParams() {
        return this.params;
    }

    public int hashCode() {
        Integer num = this.bizCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ClaimErrorParams claimErrorParams = this.params;
        return iHashCode2 + (claimErrorParams != null ? claimErrorParams.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.bizCode;
        String str = this.message;
        ClaimErrorParams claimErrorParams = this.params;
        StringBuilder sbA = pq6.a(num, "ClaimError(bizCode=", ", message=", str, ", params=");
        sbA.append(claimErrorParams);
        sbA.append(")");
        return sbA.toString();
    }
}
