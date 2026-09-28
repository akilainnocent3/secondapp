package com.sportybet.android.account.international.data.model;

import defpackage.tug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0012"}, d2 = {"Lcom/sportybet/android/account/international/data/model/INTRegisterResendResponse;", "", "data", "Lcom/sportybet/android/account/international/data/model/INTRegisterResendResponse$ResponseData;", "<init>", "(Lcom/sportybet/android/account/international/data/model/INTRegisterResendResponse$ResponseData;)V", "getData", "()Lcom/sportybet/android/account/international/data/model/INTRegisterResendResponse$ResponseData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ResponseData", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class INTRegisterResendResponse {
    public static final int $stable = 0;
    private final ResponseData data;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0010"}, d2 = {"Lcom/sportybet/android/account/international/data/model/INTRegisterResendResponse$ResponseData;", "", "token", "", "<init>", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ResponseData {
        public static final int $stable = 0;
        private final String token;

        public ResponseData(String str) {
            str.getClass();
            this.token = str;
        }

        public static /* synthetic */ ResponseData copy$default(ResponseData responseData, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = responseData.token;
            }
            return responseData.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        public final ResponseData copy(String token) {
            token.getClass();
            return new ResponseData(token);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ResponseData) && Intrinsics.g(this.token, ((ResponseData) other).token);
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            return this.token.hashCode();
        }

        public String toString() {
            return tug.a("ResponseData(token=", this.token, ")");
        }
    }

    public INTRegisterResendResponse(ResponseData responseData) {
        responseData.getClass();
        this.data = responseData;
    }

    public static /* synthetic */ INTRegisterResendResponse copy$default(INTRegisterResendResponse iNTRegisterResendResponse, ResponseData responseData, int i, Object obj) {
        if ((i & 1) != 0) {
            responseData = iNTRegisterResendResponse.data;
        }
        return iNTRegisterResendResponse.copy(responseData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ResponseData getData() {
        return this.data;
    }

    public final INTRegisterResendResponse copy(ResponseData data) {
        data.getClass();
        return new INTRegisterResendResponse(data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof INTRegisterResendResponse) && Intrinsics.g(this.data, ((INTRegisterResendResponse) other).data);
    }

    public final ResponseData getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "INTRegisterResendResponse(data=" + this.data + ")";
    }
}
