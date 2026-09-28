package com.sporty.android.core.model.captcha;

import com.google.gson.annotations.SerializedName;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.uf80;
import defpackage.zug0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0007HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R%\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R'\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R%\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006 "}, d2 = {"Lcom/sporty/android/core/model/captcha/CaptchaConfigInfo;", "", "enable", "", "providerId", "", "providerName", "", "siteKey", "captchaUuid", "<init>", "(ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEnable", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "getProviderId", "()I", "getProviderName", "()Ljava/lang/String;", "getSiteKey", "getCaptchaUuid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CaptchaConfigInfo {

    @SerializedName("captchaUuid")
    private final String captchaUuid;

    @SerializedName("enable")
    private final boolean enable;

    @SerializedName("providerId")
    private final int providerId;

    @SerializedName("providerName")
    private final String providerName;

    @SerializedName("siteKey")
    private final String siteKey;

    public CaptchaConfigInfo(boolean z, int i, String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.enable = z;
        this.providerId = i;
        this.providerName = str;
        this.siteKey = str2;
        this.captchaUuid = str3;
    }

    public static /* synthetic */ CaptchaConfigInfo copy$default(CaptchaConfigInfo captchaConfigInfo, boolean z, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = captchaConfigInfo.enable;
        }
        if ((i2 & 2) != 0) {
            i = captchaConfigInfo.providerId;
        }
        if ((i2 & 4) != 0) {
            str = captchaConfigInfo.providerName;
        }
        if ((i2 & 8) != 0) {
            str2 = captchaConfigInfo.siteKey;
        }
        if ((i2 & 16) != 0) {
            str3 = captchaConfigInfo.captchaUuid;
        }
        String str4 = str3;
        String str5 = str;
        return captchaConfigInfo.copy(z, i, str5, str2, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getProviderId() {
        return this.providerId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProviderName() {
        return this.providerName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSiteKey() {
        return this.siteKey;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCaptchaUuid() {
        return this.captchaUuid;
    }

    public final CaptchaConfigInfo copy(boolean enable, int providerId, String providerName, String siteKey, String captchaUuid) {
        providerName.getClass();
        captchaUuid.getClass();
        return new CaptchaConfigInfo(enable, providerId, providerName, siteKey, captchaUuid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptchaConfigInfo)) {
            return false;
        }
        CaptchaConfigInfo captchaConfigInfo = (CaptchaConfigInfo) other;
        return this.enable == captchaConfigInfo.enable && this.providerId == captchaConfigInfo.providerId && Intrinsics.g(this.providerName, captchaConfigInfo.providerName) && Intrinsics.g(this.siteKey, captchaConfigInfo.siteKey) && Intrinsics.g(this.captchaUuid, captchaConfigInfo.captchaUuid);
    }

    public final String getCaptchaUuid() {
        return this.captchaUuid;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getProviderId() {
        return this.providerId;
    }

    public final String getProviderName() {
        return this.providerName;
    }

    public final String getSiteKey() {
        return this.siteKey;
    }

    public int hashCode() {
        int iA = gmf0.a(gpp.a(this.providerId, Boolean.hashCode(this.enable) * 31, 31), 31, this.providerName);
        String str = this.siteKey;
        return this.captchaUuid.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        boolean z = this.enable;
        int i = this.providerId;
        String str = this.providerName;
        String str2 = this.siteKey;
        String str3 = this.captchaUuid;
        StringBuilder sbA = zug0.a("CaptchaConfigInfo(enable=", ", providerId=", ", providerName=", i, z);
        hxa.c(sbA, str, ", siteKey=", str2, ", captchaUuid=");
        return uf80.a(sbA, str3, ")");
    }
}
