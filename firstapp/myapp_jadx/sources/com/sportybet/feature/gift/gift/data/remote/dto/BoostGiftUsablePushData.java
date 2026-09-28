package com.sportybet.feature.gift.gift.data.remote.dto;

import com.google.gson.annotations.SerializedName;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.qn4;
import defpackage.uf80;
import defpackage.ux5;
import defpackage.wxa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR%\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR%\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R%\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR%\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR%\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eÊ\u0001\u0002\b&Ê\u0001\f\b'\u0012\b\b(\u0012\u0004\b\u0003\u0010\u0002¨\u0006%"}, d2 = {"Lcom/sportybet/feature/gift/gift/data/remote/dto/BoostGiftUsablePushData;", "", "title", "", "text", "linkUrl", "boostKind", "", "usableTime", "expireTime", "srcCtt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getText", "getLinkUrl", "getBoostKind", "()I", "getUsableTime", "getExpireTime", "getSrcCtt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "gift", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BoostGiftUsablePushData {
    public static final int $stable = 0;

    @SerializedName("boostKind")
    private final int boostKind;

    @SerializedName("expireTime")
    private final String expireTime;

    @SerializedName("linkUrl")
    private final String linkUrl;

    @SerializedName("srcCtt")
    private final String srcCtt;

    @SerializedName("text")
    private final String text;

    @SerializedName("title")
    private final String title;

    @SerializedName("usableTime")
    private final String usableTime;

    public BoostGiftUsablePushData(String str, String str2, String str3, int i, String str4, String str5, String str6) {
        qn4.b(str, str2, str3, str4, str5);
        str6.getClass();
        this.title = str;
        this.text = str2;
        this.linkUrl = str3;
        this.boostKind = i;
        this.usableTime = str4;
        this.expireTime = str5;
        this.srcCtt = str6;
    }

    public static /* synthetic */ BoostGiftUsablePushData copy$default(BoostGiftUsablePushData boostGiftUsablePushData, String str, String str2, String str3, int i, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = boostGiftUsablePushData.title;
        }
        if ((i2 & 2) != 0) {
            str2 = boostGiftUsablePushData.text;
        }
        if ((i2 & 4) != 0) {
            str3 = boostGiftUsablePushData.linkUrl;
        }
        if ((i2 & 8) != 0) {
            i = boostGiftUsablePushData.boostKind;
        }
        if ((i2 & 16) != 0) {
            str4 = boostGiftUsablePushData.usableTime;
        }
        if ((i2 & 32) != 0) {
            str5 = boostGiftUsablePushData.expireTime;
        }
        if ((i2 & 64) != 0) {
            str6 = boostGiftUsablePushData.srcCtt;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str3;
        return boostGiftUsablePushData.copy(str, str2, str10, i, str9, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBoostKind() {
        return this.boostKind;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUsableTime() {
        return this.usableTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getExpireTime() {
        return this.expireTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSrcCtt() {
        return this.srcCtt;
    }

    public final BoostGiftUsablePushData copy(String title, String text, String linkUrl, int boostKind, String usableTime, String expireTime, String srcCtt) {
        qn4.b(title, text, linkUrl, usableTime, expireTime);
        srcCtt.getClass();
        return new BoostGiftUsablePushData(title, text, linkUrl, boostKind, usableTime, expireTime, srcCtt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoostGiftUsablePushData)) {
            return false;
        }
        BoostGiftUsablePushData boostGiftUsablePushData = (BoostGiftUsablePushData) other;
        return Intrinsics.g(this.title, boostGiftUsablePushData.title) && Intrinsics.g(this.text, boostGiftUsablePushData.text) && Intrinsics.g(this.linkUrl, boostGiftUsablePushData.linkUrl) && this.boostKind == boostGiftUsablePushData.boostKind && Intrinsics.g(this.usableTime, boostGiftUsablePushData.usableTime) && Intrinsics.g(this.expireTime, boostGiftUsablePushData.expireTime) && Intrinsics.g(this.srcCtt, boostGiftUsablePushData.srcCtt);
    }

    public final int getBoostKind() {
        return this.boostKind;
    }

    public final String getExpireTime() {
        return this.expireTime;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final String getSrcCtt() {
        return this.srcCtt;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUsableTime() {
        return this.usableTime;
    }

    public int hashCode() {
        return this.srcCtt.hashCode() + gmf0.a(gmf0.a(gpp.a(this.boostKind, gmf0.a(gmf0.a(this.title.hashCode() * 31, 31, this.text), 31, this.linkUrl), 31), 31, this.usableTime), 31, this.expireTime);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.text;
        String str3 = this.linkUrl;
        int i = this.boostKind;
        String str4 = this.usableTime;
        String str5 = this.expireTime;
        String str6 = this.srcCtt;
        StringBuilder sbA = ux5.a("BoostGiftUsablePushData(title=", str, ", text=", str2, ", linkUrl=");
        wxa.b(i, str3, ", boostKind=", ", usableTime=", sbA);
        hxa.c(sbA, str4, ", expireTime=", str5, ", srcCtt=");
        return uf80.a(sbA, str6, ")");
    }
}
