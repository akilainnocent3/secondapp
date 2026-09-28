package com.sportygames.commons.remote.model;

import defpackage.pq6;
import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/sportygames/commons/remote/model/ChatErrorResponse;", "", "errorCode", "", "errorName", "", "causeMsg", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorName", "()Ljava/lang/String;", "getCauseMsg", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/sportygames/commons/remote/model/ChatErrorResponse;", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChatErrorResponse {
    public static final int $stable = 0;
    private final String causeMsg;
    private final Integer errorCode;
    private final String errorName;

    public ChatErrorResponse(Integer num, String str, String str2) {
        this.errorCode = num;
        this.errorName = str;
        this.causeMsg = str2;
    }

    public static /* synthetic */ ChatErrorResponse copy$default(ChatErrorResponse chatErrorResponse, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = chatErrorResponse.errorCode;
        }
        if ((i & 2) != 0) {
            str = chatErrorResponse.errorName;
        }
        if ((i & 4) != 0) {
            str2 = chatErrorResponse.causeMsg;
        }
        return chatErrorResponse.copy(num, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrorName() {
        return this.errorName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCauseMsg() {
        return this.causeMsg;
    }

    public final ChatErrorResponse copy(Integer errorCode, String errorName, String causeMsg) {
        return new ChatErrorResponse(errorCode, errorName, causeMsg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatErrorResponse)) {
            return false;
        }
        ChatErrorResponse chatErrorResponse = (ChatErrorResponse) other;
        return Intrinsics.g(this.errorCode, chatErrorResponse.errorCode) && Intrinsics.g(this.errorName, chatErrorResponse.errorName) && Intrinsics.g(this.causeMsg, chatErrorResponse.causeMsg);
    }

    public final String getCauseMsg() {
        return this.causeMsg;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorName() {
        return this.errorName;
    }

    public int hashCode() {
        Integer num = this.errorCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.errorName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.causeMsg;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.errorCode;
        String str = this.errorName;
        return uf80.a(pq6.a(num, "ChatErrorResponse(errorCode=", ", errorName=", str, ", causeMsg="), this.causeMsg, ")");
    }
}
