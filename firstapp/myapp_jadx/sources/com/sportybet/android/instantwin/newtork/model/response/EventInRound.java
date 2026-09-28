package com.sportybet.android.instantwin.newtork.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.hxa;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J½\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010'\u001a\u00020(J\u0014\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0083\u0004J\n\u0010-\u001a\u00020(HÖ\u0081\u0004J\n\u0010.\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020(R&\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0014\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0002¢\u0006\u0002\n\u0000R&\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0014\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0004¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0014\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0005¢\u0006\u0002\n\u0000R&\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0014\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0006¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0014\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0007¢\u0006\u0002\n\u0000R&\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0014\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\b¢\u0006\u0002\n\u0000R&\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0014\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\t¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0014\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\n¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0014\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000b¢\u0006\u0002\n\u0000R&\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0014\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\f¢\u0006\u0002\n\u0000R&\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0014\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\r¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0014\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000e¢\u0006\u0002\n\u0000R&\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0014\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u000f¢\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0014\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010¢\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0014\u0092\u0002\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0011¢\u0006\u0002\n\u0000Ê\u0001\u0002\b5Ê\u0001\f\b6\u0012\b\b7\u0012\u0004\b\u0003\u0010\u0000¨\u00064"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/EventInRound;", "Landroid/os/Parcelable;", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "homeTeamName", "homeTeamLogo", "homeTeamBaseColor", "homeTeamSleeveColor", "awayTeamName", "awayTeamLogo", "awayTeamBaseColor", "awayTeamSleeveColor", "leagueId", "leagueName", "leagueUrl", "homeTeamScore", "awayTeamScore", "resultSequence", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/jvm/JvmField;", "Lcom/google/gson/annotations/SerializedName;", "value", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "instantWin", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EventInRound implements Parcelable {

    @SerializedName("awayTeamBaseColor")
    public final String awayTeamBaseColor;

    @SerializedName("awayTeamLogo")
    public final String awayTeamLogo;

    @SerializedName("awayTeamName")
    public final String awayTeamName;

    @SerializedName("awayTeamScore")
    public final String awayTeamScore;

    @SerializedName("awayTeamSleeveColor")
    public final String awayTeamSleeveColor;

    @SerializedName(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)
    public final String eventId;

    @SerializedName("homeTeamBaseColor")
    public final String homeTeamBaseColor;

    @SerializedName("homeTeamLogo")
    public final String homeTeamLogo;

    @SerializedName("homeTeamName")
    public final String homeTeamName;

    @SerializedName("homeTeamScore")
    public final String homeTeamScore;

    @SerializedName("homeTeamSleeveColor")
    public final String homeTeamSleeveColor;

    @SerializedName("leagueId")
    public final String leagueId;

    @SerializedName("leagueName")
    public final String leagueName;

    @SerializedName("leagueUrl")
    public final String leagueUrl;

    @SerializedName("resultSequence")
    public final String resultSequence;
    public static final Parcelable.Creator<EventInRound> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EventInRound> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventInRound createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new EventInRound(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventInRound[] newArray(int i) {
            return new EventInRound[i];
        }
    }

    public EventInRound(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.eventId = str;
        this.homeTeamName = str2;
        this.homeTeamLogo = str3;
        this.homeTeamBaseColor = str4;
        this.homeTeamSleeveColor = str5;
        this.awayTeamName = str6;
        this.awayTeamLogo = str7;
        this.awayTeamBaseColor = str8;
        this.awayTeamSleeveColor = str9;
        this.leagueId = str10;
        this.leagueName = str11;
        this.leagueUrl = str12;
        this.homeTeamScore = str13;
        this.awayTeamScore = str14;
        this.resultSequence = str15;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getLeagueId() {
        return this.leagueId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getLeagueName() {
        return this.leagueName;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getLeagueUrl() {
        return this.leagueUrl;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getHomeTeamScore() {
        return this.homeTeamScore;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getAwayTeamScore() {
        return this.awayTeamScore;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getResultSequence() {
        return this.resultSequence;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHomeTeamLogo() {
        return this.homeTeamLogo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHomeTeamBaseColor() {
        return this.homeTeamBaseColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHomeTeamSleeveColor() {
        return this.homeTeamSleeveColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAwayTeamLogo() {
        return this.awayTeamLogo;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAwayTeamBaseColor() {
        return this.awayTeamBaseColor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAwayTeamSleeveColor() {
        return this.awayTeamSleeveColor;
    }

    public final EventInRound copy(String eventId, String homeTeamName, String homeTeamLogo, String homeTeamBaseColor, String homeTeamSleeveColor, String awayTeamName, String awayTeamLogo, String awayTeamBaseColor, String awayTeamSleeveColor, String leagueId, String leagueName, String leagueUrl, String homeTeamScore, String awayTeamScore, String resultSequence) {
        return new EventInRound(eventId, homeTeamName, homeTeamLogo, homeTeamBaseColor, homeTeamSleeveColor, awayTeamName, awayTeamLogo, awayTeamBaseColor, awayTeamSleeveColor, leagueId, leagueName, leagueUrl, homeTeamScore, awayTeamScore, resultSequence);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventInRound)) {
            return false;
        }
        EventInRound eventInRound = (EventInRound) other;
        return Intrinsics.g(this.eventId, eventInRound.eventId) && Intrinsics.g(this.homeTeamName, eventInRound.homeTeamName) && Intrinsics.g(this.homeTeamLogo, eventInRound.homeTeamLogo) && Intrinsics.g(this.homeTeamBaseColor, eventInRound.homeTeamBaseColor) && Intrinsics.g(this.homeTeamSleeveColor, eventInRound.homeTeamSleeveColor) && Intrinsics.g(this.awayTeamName, eventInRound.awayTeamName) && Intrinsics.g(this.awayTeamLogo, eventInRound.awayTeamLogo) && Intrinsics.g(this.awayTeamBaseColor, eventInRound.awayTeamBaseColor) && Intrinsics.g(this.awayTeamSleeveColor, eventInRound.awayTeamSleeveColor) && Intrinsics.g(this.leagueId, eventInRound.leagueId) && Intrinsics.g(this.leagueName, eventInRound.leagueName) && Intrinsics.g(this.leagueUrl, eventInRound.leagueUrl) && Intrinsics.g(this.homeTeamScore, eventInRound.homeTeamScore) && Intrinsics.g(this.awayTeamScore, eventInRound.awayTeamScore) && Intrinsics.g(this.resultSequence, eventInRound.resultSequence);
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.homeTeamName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.homeTeamLogo;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.homeTeamBaseColor;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.homeTeamSleeveColor;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.awayTeamName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.awayTeamLogo;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.awayTeamBaseColor;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.awayTeamSleeveColor;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.leagueId;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.leagueName;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.leagueUrl;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.homeTeamScore;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.awayTeamScore;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.resultSequence;
        return iHashCode14 + (str15 != null ? str15.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.homeTeamName;
        String str3 = this.homeTeamLogo;
        String str4 = this.homeTeamBaseColor;
        String str5 = this.homeTeamSleeveColor;
        String str6 = this.awayTeamName;
        String str7 = this.awayTeamLogo;
        String str8 = this.awayTeamBaseColor;
        String str9 = this.awayTeamSleeveColor;
        String str10 = this.leagueId;
        String str11 = this.leagueName;
        String str12 = this.leagueUrl;
        String str13 = this.homeTeamScore;
        String str14 = this.awayTeamScore;
        String str15 = this.resultSequence;
        StringBuilder sbA = ux5.a("EventInRound(eventId=", str, ", homeTeamName=", str2, ", homeTeamLogo=");
        hxa.c(sbA, str3, ", homeTeamBaseColor=", str4, ", homeTeamSleeveColor=");
        hxa.c(sbA, str5, ", awayTeamName=", str6, ", awayTeamLogo=");
        hxa.c(sbA, str7, ", awayTeamBaseColor=", str8, ", awayTeamSleeveColor=");
        hxa.c(sbA, str9, ", leagueId=", str10, ", leagueName=");
        hxa.c(sbA, str11, ", leagueUrl=", str12, ", homeTeamScore=");
        hxa.c(sbA, str13, ", awayTeamScore=", str14, ", resultSequence=");
        return uf80.a(sbA, str15, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.eventId);
        dest.writeString(this.homeTeamName);
        dest.writeString(this.homeTeamLogo);
        dest.writeString(this.homeTeamBaseColor);
        dest.writeString(this.homeTeamSleeveColor);
        dest.writeString(this.awayTeamName);
        dest.writeString(this.awayTeamLogo);
        dest.writeString(this.awayTeamBaseColor);
        dest.writeString(this.awayTeamSleeveColor);
        dest.writeString(this.leagueId);
        dest.writeString(this.leagueName);
        dest.writeString(this.leagueUrl);
        dest.writeString(this.homeTeamScore);
        dest.writeString(this.awayTeamScore);
        dest.writeString(this.resultSequence);
    }
}
