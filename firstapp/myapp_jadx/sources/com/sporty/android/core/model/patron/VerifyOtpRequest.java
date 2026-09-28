package com.sporty.android.core.model.patron;

import com.twilio.voice.EventKeys;
import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\u0002\b\u0014¨\u0006\u0013"}, d2 = {"Lcom/sporty/android/core/model/patron/VerifyOtpRequest;", "", EventKeys.ERROR_CODE, "", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getToken", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class VerifyOtpRequest {
    private final String code;
    private final String token;

    public VerifyOtpRequest(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.code = str;
        this.token = str2;
    }

    public static /* synthetic */ VerifyOtpRequest copy$default(VerifyOtpRequest verifyOtpRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyOtpRequest.code;
        }
        if ((i & 2) != 0) {
            str2 = verifyOtpRequest.token;
        }
        return verifyOtpRequest.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final VerifyOtpRequest copy(String code, String token) {
        code.getClass();
        token.getClass();
        return new VerifyOtpRequest(code, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyOtpRequest)) {
            return false;
        }
        VerifyOtpRequest verifyOtpRequest = (VerifyOtpRequest) other;
        return Intrinsics.g(this.code, verifyOtpRequest.code) && Intrinsics.g(this.token, verifyOtpRequest.token);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.token.hashCode() + (this.code.hashCode() * 31);
    }

    public String toString() {
        return tx5.a("VerifyOtpRequest(code=", this.code, ", token=", this.token, ")");
    }
}
