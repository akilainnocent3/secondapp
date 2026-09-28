package com.sporty.android.core.model.security.otp;

import com.appsflyer.internal.m;
import com.twilio.voice.EventKeys;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/security/otp/OtpResultV2;", "", EventKeys.ERROR_CODE, "", "providerPhone", "remaining", "", "createdAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getProviderPhone", "getRemaining", "()I", "getCreatedAt", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OtpResultV2 {
    private final String code;
    private final String createdAt;
    private final String providerPhone;
    private final int remaining;

    public OtpResultV2(String str, String str2, int i, String str3) {
        m.a(str, str2, str3);
        this.code = str;
        this.providerPhone = str2;
        this.remaining = i;
        this.createdAt = str3;
    }

    public static /* synthetic */ OtpResultV2 copy$default(OtpResultV2 otpResultV2, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = otpResultV2.code;
        }
        if ((i2 & 2) != 0) {
            str2 = otpResultV2.providerPhone;
        }
        if ((i2 & 4) != 0) {
            i = otpResultV2.remaining;
        }
        if ((i2 & 8) != 0) {
            str3 = otpResultV2.createdAt;
        }
        return otpResultV2.copy(str, str2, i, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProviderPhone() {
        return this.providerPhone;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRemaining() {
        return this.remaining;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final OtpResultV2 copy(String code, String providerPhone, int remaining, String createdAt) {
        code.getClass();
        providerPhone.getClass();
        createdAt.getClass();
        return new OtpResultV2(code, providerPhone, remaining, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtpResultV2)) {
            return false;
        }
        OtpResultV2 otpResultV2 = (OtpResultV2) other;
        return Intrinsics.g(this.code, otpResultV2.code) && Intrinsics.g(this.providerPhone, otpResultV2.providerPhone) && this.remaining == otpResultV2.remaining && Intrinsics.g(this.createdAt, otpResultV2.createdAt);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getProviderPhone() {
        return this.providerPhone;
    }

    public final int getRemaining() {
        return this.remaining;
    }

    public int hashCode() {
        return this.createdAt.hashCode() + gpp.a(this.remaining, gmf0.a(this.code.hashCode() * 31, 31, this.providerPhone), 31);
    }

    public String toString() {
        String str = this.code;
        String str2 = this.providerPhone;
        int i = this.remaining;
        String str3 = this.createdAt;
        StringBuilder sbA = ux5.a("OtpResultV2(code=", str, ", providerPhone=", str2, ", remaining=");
        sbA.append(i);
        sbA.append(", createdAt=");
        sbA.append(str3);
        sbA.append(")");
        return sbA.toString();
    }
}
