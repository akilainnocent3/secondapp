package com.sportybet.android.instantwin.newtork.model.response.racing;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.dy5;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003Jo\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0014\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010*\u001a\u00020\u0006HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R'\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R'\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R'\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R'\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R'\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R'\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R%\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010Ê\u0001\f\b,\u0012\b\b-\u0012\u0004\b\u0003\u0010\u0002¨\u0006+"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingRacer;", "", AnalyticsParam.EVENT_PARAM_ID, "", "number", "name", "", "logoUrl", "numberUrl", "numberCapeUrl", "runningLogoUrl", "previousResult", AnalyticsParam.EVENT_STATUS, "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getNumber", "getName", "()Ljava/lang/String;", "getLogoUrl", "getNumberUrl", "getNumberCapeUrl", "getRunningLogoUrl", "getPreviousResult", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantRacingRacer {
    public static final int $stable = 0;

    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final int id;

    @SerializedName("logoUrl")
    private final String logoUrl;

    @SerializedName("name")
    private final String name;

    @SerializedName("number")
    private final int number;

    @SerializedName("numberCapeUrl")
    private final String numberCapeUrl;

    @SerializedName("numberUrl")
    private final String numberUrl;

    @SerializedName("previousResult")
    private final String previousResult;

    @SerializedName("runningLogoUrl")
    private final String runningLogoUrl;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final int status;

    public NetworkInstantRacingRacer(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3) {
        this.id = i;
        this.number = i2;
        this.name = str;
        this.logoUrl = str2;
        this.numberUrl = str3;
        this.numberCapeUrl = str4;
        this.runningLogoUrl = str5;
        this.previousResult = str6;
        this.status = i3;
    }

    public static /* synthetic */ NetworkInstantRacingRacer copy$default(NetworkInstantRacingRacer networkInstantRacingRacer, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = networkInstantRacingRacer.id;
        }
        if ((i4 & 2) != 0) {
            i2 = networkInstantRacingRacer.number;
        }
        if ((i4 & 4) != 0) {
            str = networkInstantRacingRacer.name;
        }
        if ((i4 & 8) != 0) {
            str2 = networkInstantRacingRacer.logoUrl;
        }
        if ((i4 & 16) != 0) {
            str3 = networkInstantRacingRacer.numberUrl;
        }
        if ((i4 & 32) != 0) {
            str4 = networkInstantRacingRacer.numberCapeUrl;
        }
        if ((i4 & 64) != 0) {
            str5 = networkInstantRacingRacer.runningLogoUrl;
        }
        if ((i4 & 128) != 0) {
            str6 = networkInstantRacingRacer.previousResult;
        }
        if ((i4 & 256) != 0) {
            i3 = networkInstantRacingRacer.status;
        }
        String str7 = str6;
        int i5 = i3;
        String str8 = str4;
        String str9 = str5;
        String str10 = str3;
        String str11 = str;
        return networkInstantRacingRacer.copy(i, i2, str11, str2, str10, str8, str9, str7, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNumberUrl() {
        return this.numberUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNumberCapeUrl() {
        return this.numberCapeUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRunningLogoUrl() {
        return this.runningLogoUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPreviousResult() {
        return this.previousResult;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final NetworkInstantRacingRacer copy(int id, int number, String name, String logoUrl, String numberUrl, String numberCapeUrl, String runningLogoUrl, String previousResult, int status) {
        return new NetworkInstantRacingRacer(id, number, name, logoUrl, numberUrl, numberCapeUrl, runningLogoUrl, previousResult, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantRacingRacer)) {
            return false;
        }
        NetworkInstantRacingRacer networkInstantRacingRacer = (NetworkInstantRacingRacer) other;
        return this.id == networkInstantRacingRacer.id && this.number == networkInstantRacingRacer.number && Intrinsics.g(this.name, networkInstantRacingRacer.name) && Intrinsics.g(this.logoUrl, networkInstantRacingRacer.logoUrl) && Intrinsics.g(this.numberUrl, networkInstantRacingRacer.numberUrl) && Intrinsics.g(this.numberCapeUrl, networkInstantRacingRacer.numberCapeUrl) && Intrinsics.g(this.runningLogoUrl, networkInstantRacingRacer.runningLogoUrl) && Intrinsics.g(this.previousResult, networkInstantRacingRacer.previousResult) && this.status == networkInstantRacingRacer.status;
    }

    public final int getId() {
        return this.id;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final int getNumber() {
        return this.number;
    }

    public final String getNumberCapeUrl() {
        return this.numberCapeUrl;
    }

    public final String getNumberUrl() {
        return this.numberUrl;
    }

    public final String getPreviousResult() {
        return this.previousResult;
    }

    public final String getRunningLogoUrl() {
        return this.runningLogoUrl;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iA = gpp.a(this.number, Integer.hashCode(this.id) * 31, 31);
        String str = this.name;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.logoUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.numberUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.numberCapeUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.runningLogoUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.previousResult;
        return Integer.hashCode(this.status) + ((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public String toString() {
        int i = this.id;
        int i2 = this.number;
        String str = this.name;
        String str2 = this.logoUrl;
        String str3 = this.numberUrl;
        String str4 = this.numberCapeUrl;
        String str5 = this.runningLogoUrl;
        String str6 = this.previousResult;
        int i3 = this.status;
        StringBuilder sbA = dy5.a("NetworkInstantRacingRacer(id=", i, i2, ", number=", ", name=");
        hxa.c(sbA, str, ", logoUrl=", str2, ", numberUrl=");
        hxa.c(sbA, str3, ", numberCapeUrl=", str4, ", runningLogoUrl=");
        hxa.c(sbA, str5, ", previousResult=", str6, ", status=");
        return zk1.a(i3, ")", sbA);
    }
}
