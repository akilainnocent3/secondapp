package com.sportybet.plugin.realsports.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.book.domain.entity.EventSource;
import com.sporty.android.book.domain.entity.SourceType;
import com.sporty.android.core.model.orders.EventPendingReason;
import com.sporty.android.core.model.orders.JokerInfo;
import defpackage.b3;
import defpackage.kgb0;
import defpackage.lfb0;
import defpackage.mfb0;
import defpackage.q980;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class RSelection implements Parcelable {
    public static final Parcelable.Creator<RSelection> CREATOR = new Parcelable.Creator<RSelection>() { // from class: com.sportybet.plugin.realsports.data.RSelection.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RSelection createFromParcel(Parcel parcel) {
            return new RSelection(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RSelection[] newArray(int i) {
            return new RSelection[i];
        }
    };
    public String away;
    public boolean banker;
    public List<RSelection> betBuilderSelections;
    public String categoryId;
    public String categoryName;
    public int commentsNum;
    public String correctOutcome;
    public String eventId;
    public EventPendingReason eventPendingReason;
    public EventSource eventSource;
    public int eventStatus;
    public String gameId;
    public List<String> gameScore;
    public boolean haveLive;
    public String home;
    public String id;
    public String jointId;
    public JokerInfo joker;
    public boolean lfbOddsBoosted;
    public String marketDesc;
    public String marketId;
    public String matchStatus;
    public boolean matchTrackerNotAllowed;
    public String odds;
    public boolean oddsBoosted;
    public String outcomeDesc;
    public String outcomeId;
    public String period;
    public PickMarketMetadata pickMarketMetadata;
    public String playedSeconds;
    public String pointScore;
    public int product;
    public String remainingTimeInPeriod;
    public String setScore;
    public int settleType;
    public String specifier;
    public String sportId;
    public long startTime;
    public int status;
    public String tournamentId;
    public String tournamentName;

    public RSelection(Parcel parcel) {
        this.odds = "";
        this.marketDesc = "";
        this.outcomeDesc = "";
        this.correctOutcome = "";
        this.home = "";
        this.away = "";
        this.id = parcel.readString();
        this.eventId = parcel.readString();
        this.jointId = parcel.readString();
        this.sportId = parcel.readString();
        this.gameId = parcel.readString();
        this.product = parcel.readInt();
        this.marketId = parcel.readString();
        this.outcomeId = parcel.readString();
        this.specifier = parcel.readString();
        this.status = parcel.readInt();
        this.matchStatus = parcel.readString();
        this.eventStatus = parcel.readInt();
        this.banker = parcel.readByte() != 0;
        this.haveLive = parcel.readByte() != 0;
        this.odds = parcel.readString();
        this.marketDesc = parcel.readString();
        this.outcomeDesc = parcel.readString();
        this.correctOutcome = parcel.readString();
        this.home = parcel.readString();
        this.away = parcel.readString();
        this.period = parcel.readString();
        this.playedSeconds = parcel.readString();
        this.remainingTimeInPeriod = parcel.readString();
        this.setScore = parcel.readString();
        this.pointScore = parcel.readString();
        this.startTime = parcel.readLong();
        this.gameScore = parcel.createStringArrayList();
        this.oddsBoosted = parcel.readByte() != 0;
        this.lfbOddsBoosted = parcel.readByte() != 0;
        this.commentsNum = parcel.readInt();
        this.categoryId = parcel.readString();
        this.tournamentId = parcel.readString();
        this.tournamentName = parcel.readString();
        this.categoryName = parcel.readString();
        this.matchTrackerNotAllowed = parcel.readByte() != 0;
        this.eventSource = (EventSource) parcel.readParcelable(EventSource.class.getClassLoader());
        this.settleType = parcel.readInt();
        this.betBuilderSelections = parcel.createTypedArrayList(CREATOR);
        this.eventPendingReason = (EventPendingReason) parcel.readParcelable(EventPendingReason.class.getClassLoader());
        this.pickMarketMetadata = (PickMarketMetadata) parcel.readParcelable(PickMarketMetadata.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getSourceId() {
        EventSource eventSource = this.eventSource;
        if (eventSource == null) {
            return this.eventId;
        }
        String sourceId = eventSource.getSourceId(isLiveOrFinished());
        return sourceId != null ? sourceId : this.eventId;
    }

    public boolean isBetBuilder() {
        List<RSelection> list = this.betBuilderSelections;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean isLiveOrFinished() {
        int i = this.eventStatus;
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public boolean isLost() {
        return this.status == 2;
    }

    public boolean isOngoing() {
        int i = this.eventStatus;
        return (i == 1 || i == 2) && this.status == 0;
    }

    public boolean isRefundAll() {
        return this.status == 4;
    }

    public boolean isVoid() {
        int i = this.status;
        return i == 3 || i == 4;
    }

    public boolean isWin() {
        return this.status == 1;
    }

    public boolean shouldShowBoreDrawLabel(BoreDrawConfig boreDrawConfig) {
        if (boreDrawConfig == null) {
            return false;
        }
        return q980.d(boreDrawConfig, q980.a(this).toString(), this.status, this.eventStatus, this.marketId, this.sportId, this.outcomeId, this.outcomeDesc);
    }

    public boolean showMatchTracker() {
        mfb0 mfb0VarE;
        if (!b3.T(this.eventId) && !b3.U(this.eventId)) {
            if (b3.S(this.eventId)) {
                mfb0 mfb0VarE2 = lfb0.d().e(this.sportId);
                return isLiveOrFinished() && mfb0VarE2 != null && mfb0VarE2.u() && !this.matchTrackerNotAllowed;
            }
            EventSource eventSource = this.eventSource;
            if (eventSource == null) {
                return false;
            }
            SourceType sourceType = eventSource.getSourceType(isLiveOrFinished());
            if (sourceType == SourceType.BET_GENIUS) {
                return kgb0.i(this.sportId);
            }
            if (sourceType == SourceType.BET_RADAR && (mfb0VarE = lfb0.d().e(this.sportId)) != null && mfb0VarE.u()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.eventId);
        parcel.writeString(this.jointId);
        parcel.writeString(this.sportId);
        parcel.writeString(this.gameId);
        parcel.writeInt(this.product);
        parcel.writeString(this.marketId);
        parcel.writeString(this.outcomeId);
        parcel.writeString(this.specifier);
        parcel.writeInt(this.status);
        parcel.writeString(this.matchStatus);
        parcel.writeInt(this.eventStatus);
        parcel.writeByte(this.banker ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.haveLive ? (byte) 1 : (byte) 0);
        parcel.writeString(this.odds);
        parcel.writeString(this.marketDesc);
        parcel.writeString(this.outcomeDesc);
        parcel.writeString(this.correctOutcome);
        parcel.writeString(this.home);
        parcel.writeString(this.away);
        parcel.writeString(this.period);
        parcel.writeString(this.playedSeconds);
        parcel.writeString(this.remainingTimeInPeriod);
        parcel.writeString(this.setScore);
        parcel.writeString(this.pointScore);
        parcel.writeLong(this.startTime);
        parcel.writeStringList(this.gameScore);
        parcel.writeByte(this.oddsBoosted ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.lfbOddsBoosted ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.commentsNum);
        parcel.writeString(this.categoryId);
        parcel.writeString(this.tournamentId);
        parcel.writeString(this.tournamentName);
        parcel.writeString(this.categoryName);
        parcel.writeByte(this.matchTrackerNotAllowed ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.eventSource, i);
        parcel.writeInt(this.settleType);
        parcel.writeTypedList(this.betBuilderSelections);
        parcel.writeParcelable(this.eventPendingReason, i);
        parcel.writeParcelable(this.pickMarketMetadata, i);
    }

    public RSelection() {
        this.odds = "";
        this.marketDesc = "";
        this.outcomeDesc = "";
        this.correctOutcome = "";
        this.home = "";
        this.away = "";
    }
}
