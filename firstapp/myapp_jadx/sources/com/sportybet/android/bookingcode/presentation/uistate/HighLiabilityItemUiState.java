package com.sportybet.android.bookingcode.presentation.uistate;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import defpackage.bwf0;
import defpackage.f78;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.nrg0;
import defpackage.oxc;
import defpackage.qn4;
import defpackage.ux5;
import defpackage.vch0;
import defpackage.vjt;
import defpackage.wxa;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\r\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0007HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0007HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u000fHÆ\u0003J\t\u0010J\u001a\u00020\u0007HÆ\u0003J\t\u0010K\u001a\u00020\u0007HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0016HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0018HÆ\u0003J¿\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001J\u0006\u0010R\u001a\u00020\u0007J\u0014\u0010S\u001a\u00020=2\b\u0010T\u001a\u0004\u0018\u00010UHÖ\u0083\u0004J\n\u0010V\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010W\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0011\u0010\u0011\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u00102\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b3\u0010\u001cR\u0011\u00104\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b5\u0010\u001cR\u0011\u00106\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b7\u0010\u001cR\u0011\u00108\u001a\u0002098F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010<\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\b<\u0010>Ê\u0001\u0002\b^Ê\u0001\u0002\b_Ê\u0001\f\b`\u0012\b\ba\u0012\u0004\b\u0003\u0010\u0002¨\u0006]"}, d2 = {"Lcom/sportybet/android/bookingcode/presentation/uistate/HighLiabilityItemUiState;", "Landroid/os/Parcelable;", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "sportId", "marketId", "marketProduct", "", "specifier", "outComeId", "marketStatus", "marketDesc", "outComeDesc", "outComeOdds", "outComeProbability", "", "outComeIsActive", "oddsChangesFlag", "homeTeamName", "awayTeamName", "tournamentName", "estimateStartTime", "", "betBuilderChildren", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/CharSequence;)V", "getEventId", "()Ljava/lang/String;", "getSportId", "getMarketId", "getMarketProduct", "()I", "getSpecifier", "getOutComeId", "getMarketStatus", "getMarketDesc", "getOutComeDesc", "getOutComeOdds", "getOutComeProbability", "()D", "getOutComeIsActive", "getOddsChangesFlag", "getHomeTeamName", "getAwayTeamName", "getTournamentName", "getEstimateStartTime", "()J", "getBetBuilderChildren", "()Ljava/lang/CharSequence;", "eventName", "getEventName", "displayDateTime", "getDisplayDateTime", "displayTime", "getDisplayTime", "displayDate", "Lcom/sporty/android/common_ui/uitext/UiText;", "getDisplayDate", "()Lcom/sporty/android/common_ui/uitext/UiText;", "isBetBuilder", "", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "africa-bet-android", "Landroidx/annotation/Keep;", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class HighLiabilityItemUiState implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<HighLiabilityItemUiState> CREATOR = new a();
    private final String awayTeamName;
    private final CharSequence betBuilderChildren;
    private final long estimateStartTime;
    private final String eventId;
    private final String homeTeamName;
    private final String marketDesc;
    private final String marketId;
    private final int marketProduct;
    private final int marketStatus;
    private final int oddsChangesFlag;
    private final String outComeDesc;
    private final String outComeId;
    private final int outComeIsActive;
    private final String outComeOdds;
    private final double outComeProbability;
    private final String specifier;
    private final String sportId;
    private final String tournamentName;

    public static final class a implements Parcelable.Creator<HighLiabilityItemUiState> {
        @Override // android.os.Parcelable.Creator
        public final HighLiabilityItemUiState createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new HighLiabilityItemUiState(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final HighLiabilityItemUiState[] newArray(int i) {
            return new HighLiabilityItemUiState[i];
        }
    }

    public /* synthetic */ HighLiabilityItemUiState(String str, String str2, String str3, int i, String str4, String str5, int i2, String str6, String str7, String str8, double d, int i3, int i4, String str9, String str10, String str11, long j, CharSequence charSequence, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? "" : str3, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? "" : str4, (i5 & 32) != 0 ? "" : str5, (i5 & 64) != 0 ? 0 : i2, (i5 & 128) != 0 ? "" : str6, (i5 & 256) != 0 ? "" : str7, (i5 & 512) != 0 ? "" : str8, (i5 & 1024) != 0 ? 0.0d : d, (i5 & 2048) != 0 ? 0 : i3, (i5 & 4096) != 0 ? 0 : i4, (i5 & 8192) != 0 ? "" : str9, (i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? "" : str10, (i5 & 32768) == 0 ? str11 : "", (i5 & 65536) != 0 ? 0L : j, (i5 & 131072) != 0 ? null : charSequence);
    }

    public static /* synthetic */ HighLiabilityItemUiState copy$default(HighLiabilityItemUiState highLiabilityItemUiState, String str, String str2, String str3, int i, String str4, String str5, int i2, String str6, String str7, String str8, double d, int i3, int i4, String str9, String str10, String str11, long j, CharSequence charSequence, int i5, Object obj) {
        CharSequence charSequence2;
        long j2;
        String str12 = (i5 & 1) != 0 ? highLiabilityItemUiState.eventId : str;
        String str13 = (i5 & 2) != 0 ? highLiabilityItemUiState.sportId : str2;
        String str14 = (i5 & 4) != 0 ? highLiabilityItemUiState.marketId : str3;
        int i6 = (i5 & 8) != 0 ? highLiabilityItemUiState.marketProduct : i;
        String str15 = (i5 & 16) != 0 ? highLiabilityItemUiState.specifier : str4;
        String str16 = (i5 & 32) != 0 ? highLiabilityItemUiState.outComeId : str5;
        int i7 = (i5 & 64) != 0 ? highLiabilityItemUiState.marketStatus : i2;
        String str17 = (i5 & 128) != 0 ? highLiabilityItemUiState.marketDesc : str6;
        String str18 = (i5 & 256) != 0 ? highLiabilityItemUiState.outComeDesc : str7;
        String str19 = (i5 & 512) != 0 ? highLiabilityItemUiState.outComeOdds : str8;
        double d2 = (i5 & 1024) != 0 ? highLiabilityItemUiState.outComeProbability : d;
        int i8 = (i5 & 2048) != 0 ? highLiabilityItemUiState.outComeIsActive : i3;
        int i9 = (i5 & 4096) != 0 ? highLiabilityItemUiState.oddsChangesFlag : i4;
        String str20 = str12;
        String str21 = (i5 & 8192) != 0 ? highLiabilityItemUiState.homeTeamName : str9;
        String str22 = (i5 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? highLiabilityItemUiState.awayTeamName : str10;
        String str23 = (i5 & 32768) != 0 ? highLiabilityItemUiState.tournamentName : str11;
        String str24 = str22;
        long j3 = (i5 & 65536) != 0 ? highLiabilityItemUiState.estimateStartTime : j;
        if ((i5 & 131072) != 0) {
            j2 = j3;
            charSequence2 = highLiabilityItemUiState.betBuilderChildren;
        } else {
            charSequence2 = charSequence;
            j2 = j3;
        }
        return highLiabilityItemUiState.copy(str20, str13, str14, i6, str15, str16, i7, str17, str18, str19, d2, i8, i9, str21, str24, str23, j2, charSequence2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOutComeOdds() {
        return this.outComeOdds;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final double getOutComeProbability() {
        return this.outComeProbability;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getOutComeIsActive() {
        return this.outComeIsActive;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getOddsChangesFlag() {
        return this.oddsChangesFlag;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getTournamentName() {
        return this.tournamentName;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final long getEstimateStartTime() {
        return this.estimateStartTime;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final CharSequence getBetBuilderChildren() {
        return this.betBuilderChildren;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMarketProduct() {
        return this.marketProduct;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSpecifier() {
        return this.specifier;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOutComeId() {
        return this.outComeId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getMarketStatus() {
        return this.marketStatus;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMarketDesc() {
        return this.marketDesc;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOutComeDesc() {
        return this.outComeDesc;
    }

    public final HighLiabilityItemUiState copy(String eventId, String sportId, String marketId, int marketProduct, String specifier, String outComeId, int marketStatus, String marketDesc, String outComeDesc, String outComeOdds, double outComeProbability, int outComeIsActive, int oddsChangesFlag, String homeTeamName, String awayTeamName, String tournamentName, long estimateStartTime, CharSequence betBuilderChildren) {
        qn4.b(eventId, sportId, marketId, specifier, outComeId);
        qn4.b(marketDesc, outComeDesc, outComeOdds, homeTeamName, awayTeamName);
        tournamentName.getClass();
        return new HighLiabilityItemUiState(eventId, sportId, marketId, marketProduct, specifier, outComeId, marketStatus, marketDesc, outComeDesc, outComeOdds, outComeProbability, outComeIsActive, oddsChangesFlag, homeTeamName, awayTeamName, tournamentName, estimateStartTime, betBuilderChildren);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighLiabilityItemUiState)) {
            return false;
        }
        HighLiabilityItemUiState highLiabilityItemUiState = (HighLiabilityItemUiState) other;
        return Intrinsics.g(this.eventId, highLiabilityItemUiState.eventId) && Intrinsics.g(this.sportId, highLiabilityItemUiState.sportId) && Intrinsics.g(this.marketId, highLiabilityItemUiState.marketId) && this.marketProduct == highLiabilityItemUiState.marketProduct && Intrinsics.g(this.specifier, highLiabilityItemUiState.specifier) && Intrinsics.g(this.outComeId, highLiabilityItemUiState.outComeId) && this.marketStatus == highLiabilityItemUiState.marketStatus && Intrinsics.g(this.marketDesc, highLiabilityItemUiState.marketDesc) && Intrinsics.g(this.outComeDesc, highLiabilityItemUiState.outComeDesc) && Intrinsics.g(this.outComeOdds, highLiabilityItemUiState.outComeOdds) && Double.compare(this.outComeProbability, highLiabilityItemUiState.outComeProbability) == 0 && this.outComeIsActive == highLiabilityItemUiState.outComeIsActive && this.oddsChangesFlag == highLiabilityItemUiState.oddsChangesFlag && Intrinsics.g(this.homeTeamName, highLiabilityItemUiState.homeTeamName) && Intrinsics.g(this.awayTeamName, highLiabilityItemUiState.awayTeamName) && Intrinsics.g(this.tournamentName, highLiabilityItemUiState.tournamentName) && this.estimateStartTime == highLiabilityItemUiState.estimateStartTime && Intrinsics.g(this.betBuilderChildren, highLiabilityItemUiState.betBuilderChildren);
    }

    public final String getAwayTeamName() {
        return this.awayTeamName;
    }

    public final CharSequence getBetBuilderChildren() {
        return this.betBuilderChildren;
    }

    public final UiText getDisplayDate() {
        return vjt.a(new Date().getTime(), this.estimateStartTime) ? new ResourceUiText(R.string.page_code_hub__today, kotlin.collections.a.c(getDisplayTime())) : vch0.d(getDisplayDateTime());
    }

    public final String getDisplayDateTime() {
        Date date = new Date(this.estimateStartTime);
        Locale locale = Locale.getDefault();
        locale.getClass();
        return bwf0.l(date, "HH:mm - dd MMM", locale, 2, 0);
    }

    public final String getDisplayTime() {
        return bwf0.a.s(this.estimateStartTime, true);
    }

    public final long getEstimateStartTime() {
        return this.estimateStartTime;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getEventName() {
        return oxc.a(this.homeTeamName, " vs ", this.awayTeamName);
    }

    public final String getHomeTeamName() {
        return this.homeTeamName;
    }

    public final String getMarketDesc() {
        return this.marketDesc;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final int getMarketProduct() {
        return this.marketProduct;
    }

    public final int getMarketStatus() {
        return this.marketStatus;
    }

    public final int getOddsChangesFlag() {
        return this.oddsChangesFlag;
    }

    public final String getOutComeDesc() {
        return this.outComeDesc;
    }

    public final String getOutComeId() {
        return this.outComeId;
    }

    public final int getOutComeIsActive() {
        return this.outComeIsActive;
    }

    public final String getOutComeOdds() {
        return this.outComeOdds;
    }

    public final double getOutComeProbability() {
        return this.outComeProbability;
    }

    public final String getSpecifier() {
        return this.specifier;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final String getTournamentName() {
        return this.tournamentName;
    }

    public int hashCode() {
        int iA = f87.a(gmf0.a(gmf0.a(gmf0.a(gpp.a(this.oddsChangesFlag, gpp.a(this.outComeIsActive, nrg0.a(gmf0.a(gmf0.a(gmf0.a(gpp.a(this.marketStatus, gmf0.a(gmf0.a(gpp.a(this.marketProduct, gmf0.a(gmf0.a(this.eventId.hashCode() * 31, 31, this.sportId), 31, this.marketId), 31), 31, this.specifier), 31, this.outComeId), 31), 31, this.marketDesc), 31, this.outComeDesc), 31, this.outComeOdds), 31, this.outComeProbability), 31), 31), 31, this.homeTeamName), 31, this.awayTeamName), 31, this.tournamentName), this.estimateStartTime, 31);
        CharSequence charSequence = this.betBuilderChildren;
        return iA + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final boolean isBetBuilder() {
        return this.betBuilderChildren != null;
    }

    public String toString() {
        String str = this.eventId;
        String str2 = this.sportId;
        String str3 = this.marketId;
        int i = this.marketProduct;
        String str4 = this.specifier;
        String str5 = this.outComeId;
        int i2 = this.marketStatus;
        String str6 = this.marketDesc;
        String str7 = this.outComeDesc;
        String str8 = this.outComeOdds;
        double d = this.outComeProbability;
        int i3 = this.outComeIsActive;
        int i4 = this.oddsChangesFlag;
        String str9 = this.homeTeamName;
        String str10 = this.awayTeamName;
        String str11 = this.tournamentName;
        long j = this.estimateStartTime;
        CharSequence charSequence = this.betBuilderChildren;
        StringBuilder sbA = ux5.a("HighLiabilityItemUiState(eventId=", str, ", sportId=", str2, ", marketId=");
        wxa.b(i, str3, ", marketProduct=", ", specifier=", sbA);
        hxa.c(sbA, str4, ", outComeId=", str5, ", marketStatus=");
        f78.b(i2, ", marketDesc=", str6, ", outComeDesc=", sbA);
        hxa.c(sbA, str7, ", outComeOdds=", str8, ", outComeProbability=");
        sbA.append(d);
        sbA.append(", outComeIsActive=");
        sbA.append(i3);
        sbA.append(", oddsChangesFlag=");
        sbA.append(i4);
        sbA.append(", homeTeamName=");
        sbA.append(str9);
        hxa.c(sbA, ", awayTeamName=", str10, ", tournamentName=", str11);
        g41.a(j, ", estimateStartTime=", ", betBuilderChildren=", sbA);
        sbA.append((Object) charSequence);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.eventId);
        dest.writeString(this.sportId);
        dest.writeString(this.marketId);
        dest.writeInt(this.marketProduct);
        dest.writeString(this.specifier);
        dest.writeString(this.outComeId);
        dest.writeInt(this.marketStatus);
        dest.writeString(this.marketDesc);
        dest.writeString(this.outComeDesc);
        dest.writeString(this.outComeOdds);
        dest.writeDouble(this.outComeProbability);
        dest.writeInt(this.outComeIsActive);
        dest.writeInt(this.oddsChangesFlag);
        dest.writeString(this.homeTeamName);
        dest.writeString(this.awayTeamName);
        dest.writeString(this.tournamentName);
        dest.writeLong(this.estimateStartTime);
        TextUtils.writeToParcel(this.betBuilderChildren, dest, flags);
    }

    public HighLiabilityItemUiState(String str, String str2, String str3, int i, String str4, String str5, int i2, String str6, String str7, String str8, double d, int i3, int i4, String str9, String str10, String str11, long j, CharSequence charSequence) {
        qn4.b(str, str2, str3, str4, str5);
        qn4.b(str6, str7, str8, str9, str10);
        str11.getClass();
        this.eventId = str;
        this.sportId = str2;
        this.marketId = str3;
        this.marketProduct = i;
        this.specifier = str4;
        this.outComeId = str5;
        this.marketStatus = i2;
        this.marketDesc = str6;
        this.outComeDesc = str7;
        this.outComeOdds = str8;
        this.outComeProbability = d;
        this.outComeIsActive = i3;
        this.oddsChangesFlag = i4;
        this.homeTeamName = str9;
        this.awayTeamName = str10;
        this.tournamentName = str11;
        this.estimateStartTime = j;
        this.betBuilderChildren = charSequence;
    }

    public HighLiabilityItemUiState() {
        this(null, null, null, 0, null, null, 0, null, null, null, 0.0d, 0, 0, null, null, null, 0L, null, 262143, null);
    }
}
