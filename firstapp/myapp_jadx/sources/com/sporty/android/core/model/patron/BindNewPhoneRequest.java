package com.sporty.android.core.model.patron;

import defpackage.gmf0;
import defpackage.hxa;
import defpackage.uf80;
import defpackage.ux5;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bÊ\u0001\u0002\b\u001d¨\u0006\u001c"}, d2 = {"Lcom/sporty/android/core/model/patron/BindNewPhoneRequest;", "", "phone", "", "phoneCountryCode", "newPhoneOTPCode", "newPhoneOTPToken", "primaryPhoneCertificateToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "getPhoneCountryCode", "getNewPhoneOTPCode", "getNewPhoneOTPToken", "getPrimaryPhoneCertificateToken", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BindNewPhoneRequest {
    private final String newPhoneOTPCode;
    private final String newPhoneOTPToken;
    private final String phone;
    private final String phoneCountryCode;
    private final String primaryPhoneCertificateToken;

    public BindNewPhoneRequest(String str, String str2, String str3, String str4, String str5) {
        wd7.a(str, str2, str3, str4);
        this.phone = str;
        this.phoneCountryCode = str2;
        this.newPhoneOTPCode = str3;
        this.newPhoneOTPToken = str4;
        this.primaryPhoneCertificateToken = str5;
    }

    public static /* synthetic */ BindNewPhoneRequest copy$default(BindNewPhoneRequest bindNewPhoneRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindNewPhoneRequest.phone;
        }
        if ((i & 2) != 0) {
            str2 = bindNewPhoneRequest.phoneCountryCode;
        }
        if ((i & 4) != 0) {
            str3 = bindNewPhoneRequest.newPhoneOTPCode;
        }
        if ((i & 8) != 0) {
            str4 = bindNewPhoneRequest.newPhoneOTPToken;
        }
        if ((i & 16) != 0) {
            str5 = bindNewPhoneRequest.primaryPhoneCertificateToken;
        }
        String str6 = str5;
        String str7 = str3;
        return bindNewPhoneRequest.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNewPhoneOTPCode() {
        return this.newPhoneOTPCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNewPhoneOTPToken() {
        return this.newPhoneOTPToken;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPrimaryPhoneCertificateToken() {
        return this.primaryPhoneCertificateToken;
    }

    public final BindNewPhoneRequest copy(String phone, String phoneCountryCode, String newPhoneOTPCode, String newPhoneOTPToken, String primaryPhoneCertificateToken) {
        phone.getClass();
        phoneCountryCode.getClass();
        newPhoneOTPCode.getClass();
        newPhoneOTPToken.getClass();
        return new BindNewPhoneRequest(phone, phoneCountryCode, newPhoneOTPCode, newPhoneOTPToken, primaryPhoneCertificateToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindNewPhoneRequest)) {
            return false;
        }
        BindNewPhoneRequest bindNewPhoneRequest = (BindNewPhoneRequest) other;
        return Intrinsics.g(this.phone, bindNewPhoneRequest.phone) && Intrinsics.g(this.phoneCountryCode, bindNewPhoneRequest.phoneCountryCode) && Intrinsics.g(this.newPhoneOTPCode, bindNewPhoneRequest.newPhoneOTPCode) && Intrinsics.g(this.newPhoneOTPToken, bindNewPhoneRequest.newPhoneOTPToken) && Intrinsics.g(this.primaryPhoneCertificateToken, bindNewPhoneRequest.primaryPhoneCertificateToken);
    }

    public final String getNewPhoneOTPCode() {
        return this.newPhoneOTPCode;
    }

    public final String getNewPhoneOTPToken() {
        return this.newPhoneOTPToken;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public final String getPrimaryPhoneCertificateToken() {
        return this.primaryPhoneCertificateToken;
    }

    public int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(this.phone.hashCode() * 31, 31, this.phoneCountryCode), 31, this.newPhoneOTPCode), 31, this.newPhoneOTPToken);
        String str = this.primaryPhoneCertificateToken;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.phone;
        String str2 = this.phoneCountryCode;
        String str3 = this.newPhoneOTPCode;
        String str4 = this.newPhoneOTPToken;
        String str5 = this.primaryPhoneCertificateToken;
        StringBuilder sbA = ux5.a("BindNewPhoneRequest(phone=", str, ", phoneCountryCode=", str2, ", newPhoneOTPCode=");
        hxa.c(sbA, str3, ", newPhoneOTPToken=", str4, ", primaryPhoneCertificateToken=");
        return uf80.a(sbA, str5, ")");
    }
}
