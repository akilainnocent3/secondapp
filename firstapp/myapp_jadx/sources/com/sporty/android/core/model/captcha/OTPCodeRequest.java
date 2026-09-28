package com.sporty.android.core.model.captcha;

import com.appsflyer.AppsFlyerProperties;
import com.google.gson.annotations.SerializedName;
import defpackage.hxa;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR'\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/sporty/android/core/model/captcha/OTPCodeRequest;", "", "token", "", "phone", "phoneCountryCode", AppsFlyerProperties.CHANNEL, "template", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getPhone", "getPhoneCountryCode", "getChannel", "getTemplate", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OTPCodeRequest {

    @SerializedName(AppsFlyerProperties.CHANNEL)
    private final String channel;

    @SerializedName("phone")
    private final String phone;

    @SerializedName("phoneCountryCode")
    private final String phoneCountryCode;

    @SerializedName("template")
    private final String template;

    @SerializedName("token")
    private final String token;

    public /* synthetic */ OTPCodeRequest(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5);
    }

    public static /* synthetic */ OTPCodeRequest copy$default(OTPCodeRequest oTPCodeRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oTPCodeRequest.token;
        }
        if ((i & 2) != 0) {
            str2 = oTPCodeRequest.phone;
        }
        if ((i & 4) != 0) {
            str3 = oTPCodeRequest.phoneCountryCode;
        }
        if ((i & 8) != 0) {
            str4 = oTPCodeRequest.channel;
        }
        if ((i & 16) != 0) {
            str5 = oTPCodeRequest.template;
        }
        String str6 = str5;
        String str7 = str3;
        return oTPCodeRequest.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTemplate() {
        return this.template;
    }

    public final OTPCodeRequest copy(String token, String phone, String phoneCountryCode, String channel, String template) {
        return new OTPCodeRequest(token, phone, phoneCountryCode, channel, template);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OTPCodeRequest)) {
            return false;
        }
        OTPCodeRequest oTPCodeRequest = (OTPCodeRequest) other;
        return Intrinsics.g(this.token, oTPCodeRequest.token) && Intrinsics.g(this.phone, oTPCodeRequest.phone) && Intrinsics.g(this.phoneCountryCode, oTPCodeRequest.phoneCountryCode) && Intrinsics.g(this.channel, oTPCodeRequest.channel) && Intrinsics.g(this.template, oTPCodeRequest.template);
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public final String getTemplate() {
        return this.template;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        String str = this.token;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phone;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneCountryCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.channel;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.template;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.token;
        String str2 = this.phone;
        String str3 = this.phoneCountryCode;
        String str4 = this.channel;
        String str5 = this.template;
        StringBuilder sbA = ux5.a("OTPCodeRequest(token=", str, ", phone=", str2, ", phoneCountryCode=");
        hxa.c(sbA, str3, ", channel=", str4, ", template=");
        return uf80.a(sbA, str5, ")");
    }

    public OTPCodeRequest(String str, String str2, String str3, String str4, String str5) {
        this.token = str;
        this.phone = str2;
        this.phoneCountryCode = str3;
        this.channel = str4;
        this.template = str5;
    }
}
