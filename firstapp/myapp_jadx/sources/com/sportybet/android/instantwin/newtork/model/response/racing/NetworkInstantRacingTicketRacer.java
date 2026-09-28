package com.sportybet.android.instantwin.newtork.model.response.racing;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.dy5;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.kwi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003JM\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0006HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR'\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R'\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R'\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R'\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012Ê\u0001\f\b#\u0012\b\b$\u0012\u0004\b\u0003\u0010\u0002¨\u0006\""}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingTicketRacer;", "", AnalyticsParam.EVENT_PARAM_ID, "", "number", "name", "", "logoUrl", "numberUrl", "numberCapeUrl", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getNumber", "getName", "()Ljava/lang/String;", "getLogoUrl", "getNumberUrl", "getNumberCapeUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantRacingTicketRacer {
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

    public NetworkInstantRacingTicketRacer(int i, int i2, String str, String str2, String str3, String str4) {
        this.id = i;
        this.number = i2;
        this.name = str;
        this.logoUrl = str2;
        this.numberUrl = str3;
        this.numberCapeUrl = str4;
    }

    public static /* synthetic */ NetworkInstantRacingTicketRacer copy$default(NetworkInstantRacingTicketRacer networkInstantRacingTicketRacer, int i, int i2, String str, String str2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = networkInstantRacingTicketRacer.id;
        }
        if ((i3 & 2) != 0) {
            i2 = networkInstantRacingTicketRacer.number;
        }
        if ((i3 & 4) != 0) {
            str = networkInstantRacingTicketRacer.name;
        }
        if ((i3 & 8) != 0) {
            str2 = networkInstantRacingTicketRacer.logoUrl;
        }
        if ((i3 & 16) != 0) {
            str3 = networkInstantRacingTicketRacer.numberUrl;
        }
        if ((i3 & 32) != 0) {
            str4 = networkInstantRacingTicketRacer.numberCapeUrl;
        }
        String str5 = str3;
        String str6 = str4;
        return networkInstantRacingTicketRacer.copy(i, i2, str, str2, str5, str6);
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

    public final NetworkInstantRacingTicketRacer copy(int id, int number, String name, String logoUrl, String numberUrl, String numberCapeUrl) {
        return new NetworkInstantRacingTicketRacer(id, number, name, logoUrl, numberUrl, numberCapeUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantRacingTicketRacer)) {
            return false;
        }
        NetworkInstantRacingTicketRacer networkInstantRacingTicketRacer = (NetworkInstantRacingTicketRacer) other;
        return this.id == networkInstantRacingTicketRacer.id && this.number == networkInstantRacingTicketRacer.number && Intrinsics.g(this.name, networkInstantRacingTicketRacer.name) && Intrinsics.g(this.logoUrl, networkInstantRacingTicketRacer.logoUrl) && Intrinsics.g(this.numberUrl, networkInstantRacingTicketRacer.numberUrl) && Intrinsics.g(this.numberCapeUrl, networkInstantRacingTicketRacer.numberCapeUrl);
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

    public int hashCode() {
        int iA = gpp.a(this.number, Integer.hashCode(this.id) * 31, 31);
        String str = this.name;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.logoUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.numberUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.numberCapeUrl;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        int i = this.id;
        int i2 = this.number;
        String str = this.name;
        String str2 = this.logoUrl;
        String str3 = this.numberUrl;
        String str4 = this.numberCapeUrl;
        StringBuilder sbA = dy5.a("NetworkInstantRacingTicketRacer(id=", i, i2, ", number=", ", name=");
        hxa.c(sbA, str, ", logoUrl=", str2, ", numberUrl=");
        return kwi.a(sbA, str3, ", numberCapeUrl=", str4, ")");
    }
}
