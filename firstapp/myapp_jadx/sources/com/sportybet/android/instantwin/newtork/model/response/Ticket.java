package com.sportybet.android.instantwin.newtork.model.response;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.protobuf.Reader;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import defpackage.geo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class Ticket implements Parcelable {
    public static final Parcelable.Creator<Ticket> CREATOR = new Parcelable.Creator<Ticket>() { // from class: com.sportybet.android.instantwin.newtork.model.response.Ticket.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Ticket createFromParcel(Parcel parcel) {
            return new Ticket(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Ticket[] newArray(int i) {
            return new Ticket[i];
        }
    };
    public List<BetBuilderInRound> betBuilders;
    public List<Bet> bets;
    public long createTime;
    public List<EventInRound> events;
    public int flexibleFitSize;
    public long giftAmount;
    public String giftId;
    public int giftKind;
    public boolean hasDon;
    public boolean isSettled;
    public boolean isWin;
    public List<MarketInRound> markets;
    public List<OutcomeInRound> outcomes;
    private HashMap<String, BetDetail> refBetDetailByCustomKey;
    private boolean refHit;
    private HashMap<String, BetBuilderInRound> refLookupBetBuilderByBetBuilderId;
    private HashMap<String, Bet> refLookupBetByBetId;
    private SparseArray<ArrayList<Bet>> refLookupBetsByFolds;
    private HashMap<String, EventInRound> refLookupEventByEventId;
    private HashMap<String, List<OutcomeInRound>> refLookupHitOutcomeListByMarketId;
    private HashMap<String, MarketInRound> refLookupMarketByMarketId;
    private HashMap<String, OutcomeInRound> refLookupOutcomeByOutcomeId;
    private HashMap<String, List<OutcomeInRound>> refLookupOutcomeListByMarketId;
    private int refMaxFolds;
    private int refMinFolds;
    public String roundId;
    public String sportId;
    public String ticketId;
    public String ticketNumber;
    public String totalOdds;
    public long totalReturn;
    public long totalStake;
    public String type;
    public long wht;

    public interface TicketDelegate {
        boolean isBetBuilder(String str);
    }

    public Ticket(Parcel parcel) {
        this.refMinFolds = Reader.READ_DONE;
        this.refMaxFolds = Integer.MIN_VALUE;
        this.ticketId = parcel.readString();
        this.ticketNumber = parcel.readString();
        this.type = parcel.readString();
        this.totalStake = parcel.readLong();
        this.totalReturn = parcel.readLong();
        this.wht = parcel.readLong();
        this.createTime = parcel.readLong();
        this.roundId = parcel.readString();
        this.giftId = parcel.readString();
        this.giftAmount = parcel.readLong();
        this.giftKind = parcel.readInt();
        this.bets = parcel.createTypedArrayList(Bet.CREATOR);
        this.flexibleFitSize = parcel.readInt();
        this.totalOdds = parcel.readString();
        this.events = parcel.createTypedArrayList(EventInRound.CREATOR);
        this.markets = parcel.createTypedArrayList(MarketInRound.CREATOR);
        this.outcomes = parcel.createTypedArrayList(OutcomeInRound.CREATOR);
        this.betBuilders = parcel.createTypedArrayList(BetBuilderInRound.CREATOR);
        this.isSettled = parcel.readByte() != 0;
        this.isWin = parcel.readByte() != 0;
        this.hasDon = parcel.readByte() != 0;
        this.refHit = parcel.readByte() != 0;
        this.refMinFolds = parcel.readInt();
        this.refMaxFolds = parcel.readInt();
    }

    private void createRefData() {
        synchronized (this) {
            try {
                if (this.refLookupBetByBetId != null) {
                    return;
                }
                this.refLookupBetByBetId = new HashMap<>();
                this.refLookupBetsByFolds = new SparseArray<>();
                this.refLookupEventByEventId = new HashMap<>();
                this.refLookupMarketByMarketId = new HashMap<>();
                this.refLookupHitOutcomeListByMarketId = new HashMap<>();
                this.refLookupOutcomeListByMarketId = new HashMap<>();
                this.refLookupOutcomeByOutcomeId = new HashMap<>();
                this.refLookupBetBuilderByBetBuilderId = new LinkedHashMap();
                this.refBetDetailByCustomKey = new LinkedHashMap();
                for (Bet bet : this.bets) {
                    this.refLookupBetByBetId.put(bet.betId, bet);
                    this.refHit = this.refHit || bet.hit;
                    int folds = bet.getFolds();
                    this.refMinFolds = Math.min(folds, this.refMinFolds);
                    this.refMaxFolds = Math.max(folds, this.refMaxFolds);
                    if (this.refLookupBetsByFolds.get(folds) == null) {
                        this.refLookupBetsByFolds.put(folds, new ArrayList<>());
                    }
                    this.refLookupBetsByFolds.get(folds).add(bet);
                    List<BetDetail> list = bet.betDetails;
                    if (list != null) {
                        for (BetDetail betDetail : list) {
                            betDetail.betId = bet.betId;
                            betDetail.betGroupId = bet.betGroupId;
                            this.refBetDetailByCustomKey.put(betDetail.getCustomKey(), betDetail);
                        }
                    }
                }
                List<EventInRound> list2 = this.events;
                if (list2 != null) {
                    for (EventInRound eventInRound : list2) {
                        this.refLookupEventByEventId.put(eventInRound.eventId, eventInRound);
                    }
                }
                List<MarketInRound> list3 = this.markets;
                if (list3 != null) {
                    for (MarketInRound marketInRound : list3) {
                        this.refLookupMarketByMarketId.put(marketInRound.marketId, marketInRound);
                    }
                }
                List<OutcomeInRound> list4 = this.outcomes;
                if (list4 != null) {
                    try {
                        for (OutcomeInRound outcomeInRound : list4) {
                            this.refLookupOutcomeByOutcomeId.put(outcomeInRound.outcomeId, outcomeInRound);
                            List<OutcomeInRound> arrayList = this.refLookupOutcomeListByMarketId.get(outcomeInRound.marketId);
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                                this.refLookupOutcomeListByMarketId.put(outcomeInRound.marketId, arrayList);
                            }
                            arrayList.add(outcomeInRound);
                            if (outcomeInRound.hit) {
                                List<OutcomeInRound> arrayList2 = this.refLookupHitOutcomeListByMarketId.get(outcomeInRound.marketId);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList<>();
                                    this.refLookupHitOutcomeListByMarketId.put(outcomeInRound.marketId, arrayList2);
                                }
                                arrayList2.add(outcomeInRound);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                List<BetBuilderInRound> list5 = this.betBuilders;
                if (list5 != null) {
                    for (BetBuilderInRound betBuilderInRound : list5) {
                        List<BetBuilderSelection> list6 = betBuilderInRound.selections;
                        if (list6 != null) {
                            for (BetBuilderSelection betBuilderSelection : list6) {
                                betBuilderSelection.setMarketInRound(this.refLookupMarketByMarketId.get(betBuilderSelection.marketId));
                                betBuilderSelection.setOutcomeInRound(this.refLookupOutcomeByOutcomeId.get(betBuilderSelection.outcomeId));
                                betBuilderSelection.setHitOutcomes(this.refLookupHitOutcomeListByMarketId.get(betBuilderSelection.marketId));
                                betBuilderSelection.setOutcomes(this.refLookupOutcomeListByMarketId.get(betBuilderSelection.marketId));
                            }
                            this.refLookupBetBuilderByBetBuilderId.put(betBuilderInRound.id, betBuilderInRound);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public HashMap<String, BetBuilderInRound> getLookupBetBuilderByBetBuilderIdMapping() {
        createRefData();
        return this.refLookupBetBuilderByBetBuilderId;
    }

    public HashMap<String, EventInRound> getLookupEventByEventIdMapping() {
        createRefData();
        return this.refLookupEventByEventId;
    }

    public HashMap<String, MarketInRound> getLookupMarketByMarketIdMapping() {
        createRefData();
        return this.refLookupMarketByMarketId;
    }

    public HashMap<String, OutcomeInRound> getLookupOutcomeByOutcomeIdMapping() {
        createRefData();
        return this.refLookupOutcomeByOutcomeId;
    }

    public OutcomeInRound getOutcomeBy(Context context, String str, String str2, TicketDelegate ticketDelegate) {
        createRefData();
        return ticketDelegate.isBetBuilder(str) ? this.refLookupBetBuilderByBetBuilderId.get(str2).getCombineOutcome(context, str) : this.refLookupOutcomeByOutcomeId.get(str2);
    }

    public BigDecimal getTotalBonus() {
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        Iterator<Bet> it = this.bets.iterator();
        while (it.hasNext()) {
            bigDecimalAdd = bigDecimalAdd.add(BigDecimal.valueOf(it.next().bonus).divide(geo.a));
        }
        return bigDecimalAdd;
    }

    public BigDecimal getTotalOdds(Context context, TicketDelegate ticketDelegate) {
        OutcomeInRound outcomeBy;
        if (!TextUtils.equals(this.type, SimulateBetConsts.BetslipType.SINGLE)) {
            if (TextUtils.equals(this.type, SimulateBetConsts.BetslipType.MULTIPLE)) {
                BigDecimal bigDecimalAdd = BigDecimal.ZERO;
                for (Bet bet : this.bets) {
                    BigDecimal bigDecimalMultiply = BigDecimal.ONE;
                    for (BetDetail betDetail : bet.betDetails) {
                        OutcomeInRound outcomeBy2 = getOutcomeBy(context, betDetail.marketId, betDetail.outcomeId, ticketDelegate);
                        if (outcomeBy2 != null) {
                            bigDecimalMultiply = bigDecimalMultiply.multiply(new BigDecimal(outcomeBy2.odds));
                        }
                    }
                    bigDecimalAdd = bigDecimalAdd.add(bigDecimalMultiply);
                }
                return bigDecimalAdd;
            }
            if (TextUtils.equals(this.type, SimulateBetConsts.BetslipType.FLEX) || TextUtils.equals(this.type, SimulateBetConsts.BetslipType.CUTBET)) {
                return !TextUtils.isEmpty(this.totalOdds) ? new BigDecimal(this.totalOdds).setScale(2, RoundingMode.HALF_UP) : BigDecimal.ZERO;
            }
        } else if (this.bets.size() == 1 && this.bets.get(0).betDetails.size() == 1 && (outcomeBy = getOutcomeBy(context, this.bets.get(0).betDetails.get(0).marketId, this.bets.get(0).betDetails.get(0).outcomeId, ticketDelegate)) != null) {
            return new BigDecimal(outcomeBy.odds);
        }
        return BigDecimal.ZERO;
    }

    public BigDecimal getTotalReturn() {
        return new BigDecimal(this.totalReturn).divide(geo.a);
    }

    public BigDecimal getTotalStake() {
        return new BigDecimal(this.totalStake).divide(geo.a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.ticketId);
        parcel.writeString(this.ticketNumber);
        parcel.writeString(this.type);
        parcel.writeLong(this.totalStake);
        parcel.writeLong(this.totalReturn);
        parcel.writeLong(this.wht);
        parcel.writeLong(this.createTime);
        parcel.writeString(this.roundId);
        parcel.writeString(this.giftId);
        parcel.writeLong(this.giftAmount);
        parcel.writeInt(this.giftKind);
        parcel.writeTypedList(this.bets);
        parcel.writeInt(this.flexibleFitSize);
        parcel.writeString(this.totalOdds);
        parcel.writeTypedList(this.events);
        parcel.writeTypedList(this.markets);
        parcel.writeTypedList(this.outcomes);
        parcel.writeTypedList(this.betBuilders);
        parcel.writeByte(this.isSettled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isWin ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.hasDon ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.refHit ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.refMinFolds);
        parcel.writeInt(this.refMaxFolds);
    }

    public Ticket() {
        this.refMinFolds = Reader.READ_DONE;
        this.refMaxFolds = Integer.MIN_VALUE;
    }
}
