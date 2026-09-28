package com.sportygames.spin2win.model.response;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\t\u0010\u0015¨\u0006#"}, d2 = {"Lcom/sportygames/spin2win/model/response/NumberBetDetails;", "", AnalyticsParam.EVENT_PARAM_ID, "", "number", "colour", "", "sector", "dozen", "isActive", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNumber", "getColour", "()Ljava/lang/String;", "getSector", "getDozen", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/sportygames/spin2win/model/response/NumberBetDetails;", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NumberBetDetails {
    public static final int $stable = 0;
    private final String colour;
    private final String dozen;
    private final Integer id;
    private final Boolean isActive;
    private final Integer number;
    private final String sector;

    public NumberBetDetails(Integer num, Integer num2, String str, String str2, String str3, Boolean bool) {
        this.id = num;
        this.number = num2;
        this.colour = str;
        this.sector = str2;
        this.dozen = str3;
        this.isActive = bool;
    }

    public static /* synthetic */ NumberBetDetails copy$default(NumberBetDetails numberBetDetails, Integer num, Integer num2, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            num = numberBetDetails.id;
        }
        if ((i & 2) != 0) {
            num2 = numberBetDetails.number;
        }
        if ((i & 4) != 0) {
            str = numberBetDetails.colour;
        }
        if ((i & 8) != 0) {
            str2 = numberBetDetails.sector;
        }
        if ((i & 16) != 0) {
            str3 = numberBetDetails.dozen;
        }
        if ((i & 32) != 0) {
            bool = numberBetDetails.isActive;
        }
        String str4 = str3;
        Boolean bool2 = bool;
        return numberBetDetails.copy(num, num2, str, str2, str4, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getColour() {
        return this.colour;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSector() {
        return this.sector;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDozen() {
        return this.dozen;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsActive() {
        return this.isActive;
    }

    public final NumberBetDetails copy(Integer id, Integer number, String colour, String sector, String dozen, Boolean isActive) {
        return new NumberBetDetails(id, number, colour, sector, dozen, isActive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NumberBetDetails)) {
            return false;
        }
        NumberBetDetails numberBetDetails = (NumberBetDetails) other;
        return Intrinsics.g(this.id, numberBetDetails.id) && Intrinsics.g(this.number, numberBetDetails.number) && Intrinsics.g(this.colour, numberBetDetails.colour) && Intrinsics.g(this.sector, numberBetDetails.sector) && Intrinsics.g(this.dozen, numberBetDetails.dozen) && Intrinsics.g(this.isActive, numberBetDetails.isActive);
    }

    public final String getColour() {
        return this.colour;
    }

    public final String getDozen() {
        return this.dozen;
    }

    public final Integer getId() {
        return this.id;
    }

    public final Integer getNumber() {
        return this.number;
    }

    public final String getSector() {
        return this.sector;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.number;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.colour;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sector;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dozen;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isActive;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        Integer num = this.id;
        Integer num2 = this.number;
        String str = this.colour;
        String str2 = this.sector;
        String str3 = this.dozen;
        Boolean bool = this.isActive;
        StringBuilder sb = new StringBuilder("NumberBetDetails(id=");
        sb.append(num);
        sb.append(", number=");
        sb.append(num2);
        sb.append(", colour=");
        hxa.c(sb, str, ", sector=", str2, ", dozen=");
        sb.append(str3);
        sb.append(", isActive=");
        sb.append(bool);
        sb.append(")");
        return sb.toString();
    }
}
