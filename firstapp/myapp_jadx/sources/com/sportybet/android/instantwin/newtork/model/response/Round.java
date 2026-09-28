package com.sportybet.android.instantwin.newtork.model.response;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.gson.annotations.SerializedName;
import com.google.protobuf.Reader;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import defpackage.geo;
import defpackage.sqo;
import defpackage.w8z;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class Round implements Parcelable {
    public static final Parcelable.Creator<Round> CREATOR = new Parcelable.Creator<Round>() { // from class: com.sportybet.android.instantwin.newtork.model.response.Round.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Round createFromParcel(Parcel parcel) {
            return new Round(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Round[] newArray(int i) {
            return new Round[i];
        }
    };

    @SerializedName("betBuilders")
    public List<BetBuilderInRound> betBuilders;
    public Map<String, List<BetBuilderInRound>> buildAndGoItems;

    @SerializedName("donChallengeId")
    public String donChallengeId;

    @SerializedName("events")
    public List<EventInRound> events;

    @SerializedName("fillingEvents")
    public List<EventInRound> fillingEvents;

    @SerializedName("leagues")
    public List<League> leagues;

    @SerializedName("markets")
    public List<MarketInRound> markets;
    private int multipleBetCount;

    @SerializedName("outcomes")
    public List<OutcomeInRound> outcomes;
    private HashMap<String, BetDetail> refBetDetailByCustomKey;
    private boolean refHit;
    private HashMap<String, BetBuilderInRound> refLookupBetBuilderByBetBuilderId;
    private HashMap<String, Bet> refLookupBetByBetId;
    private HashMap<String, EventInRound> refLookupEventByEventId;
    private HashMap<String, EventInRound> refLookupFillingEventByEventId;
    private HashMap<String, List<OutcomeInRound>> refLookupHitOutcomeListByMarketId;
    private HashMap<String, League> refLookupLeagueByLeagueId;
    private HashMap<String, MarketInRound> refLookupMarketByMarketId;
    private HashMap<String, OutcomeInRound> refLookupOutcomeByOutcomeId;
    private HashMap<String, List<OutcomeInRound>> refLookupOutcomeListByMarketId;
    private HashMap<String, List<w8z>> refLookupOutcomeTagByOutcomeId;
    private HashMap<String, SparseArray<ArrayList<Bet>>> refLookupTicketBetsByFolds;
    private HashMap<String, TicketInRound> refLookupTicketByBetId;
    private HashMap<String, Integer> refTicketMaxFolds;
    private HashMap<String, Integer> refTicketMinFolds;

    @SerializedName("roundId")
    public String roundId;

    @SerializedName("roundNumber")
    public long roundNumber;
    private int singleBetCount;

    @SerializedName("sportId")
    public String sportId;
    private int systemBetCount;

    @SerializedName("tickets")
    public List<TicketInRound> tickets;

    public Round(Parcel parcel) {
        this.singleBetCount = 0;
        this.multipleBetCount = 0;
        this.systemBetCount = 0;
        this.sportId = parcel.readString();
        this.roundId = parcel.readString();
        this.roundNumber = parcel.readLong();
        this.markets = parcel.createTypedArrayList(MarketInRound.CREATOR);
        this.tickets = parcel.createTypedArrayList(TicketInRound.CREATOR);
        this.leagues = parcel.createTypedArrayList(League.CREATOR);
        Parcelable.Creator<EventInRound> creator = EventInRound.CREATOR;
        this.events = parcel.createTypedArrayList(creator);
        this.fillingEvents = parcel.createTypedArrayList(creator);
        this.outcomes = parcel.createTypedArrayList(OutcomeInRound.CREATOR);
        this.betBuilders = parcel.createTypedArrayList(BetBuilderInRound.CREATOR);
        this.donChallengeId = parcel.readString();
        this.refHit = parcel.readByte() != 0;
        this.singleBetCount = parcel.readInt();
        this.multipleBetCount = parcel.readInt();
        this.systemBetCount = parcel.readInt();
    }

    private void createRefData() {
        synchronized (this) {
            try {
                if (this.refLookupBetByBetId != null) {
                    return;
                }
                this.refLookupBetByBetId = new LinkedHashMap();
                this.refLookupTicketBetsByFolds = new LinkedHashMap();
                this.refTicketMinFolds = new LinkedHashMap();
                this.refTicketMaxFolds = new LinkedHashMap();
                this.refLookupTicketByBetId = new LinkedHashMap();
                this.refLookupLeagueByLeagueId = new LinkedHashMap();
                this.refLookupEventByEventId = new LinkedHashMap();
                this.refLookupFillingEventByEventId = new LinkedHashMap();
                this.refLookupMarketByMarketId = new LinkedHashMap();
                this.refLookupHitOutcomeListByMarketId = new LinkedHashMap();
                this.refLookupOutcomeListByMarketId = new LinkedHashMap();
                this.refLookupOutcomeByOutcomeId = new LinkedHashMap();
                this.refLookupBetBuilderByBetBuilderId = new LinkedHashMap();
                this.refLookupOutcomeTagByOutcomeId = new LinkedHashMap();
                this.refBetDetailByCustomKey = new LinkedHashMap();
                for (TicketInRound ticketInRound : this.tickets) {
                    if (ticketInRound.type.equals("system")) {
                        this.systemBetCount++;
                    }
                    SparseArray<ArrayList<Bet>> sparseArray = new SparseArray<>();
                    int iMin = Reader.READ_DONE;
                    int iMax = Integer.MIN_VALUE;
                    for (Bet bet : ticketInRound.bets) {
                        if (ticketInRound.type.equals(SimulateBetConsts.BetslipType.SINGLE)) {
                            this.singleBetCount++;
                        } else if (ticketInRound.type.equals(SimulateBetConsts.BetslipType.MULTIPLE)) {
                            this.multipleBetCount++;
                        }
                        this.refLookupTicketByBetId.put(bet.betId, ticketInRound);
                        this.refLookupBetByBetId.put(bet.betId, bet);
                        this.refHit = this.refHit || bet.hit;
                        int folds = bet.getFolds();
                        iMin = Math.min(folds, iMin);
                        iMax = Math.max(folds, iMax);
                        if (sparseArray.get(folds) == null) {
                            sparseArray.put(folds, new ArrayList<>());
                        }
                        sparseArray.get(folds).add(bet);
                        for (BetDetail betDetail : bet.betDetails) {
                            betDetail.betId = bet.betId;
                            betDetail.betGroupId = bet.betGroupId;
                            this.refBetDetailByCustomKey.put(betDetail.getCustomKey(), betDetail);
                            String str = betDetail.outcomeId;
                            ArrayList arrayList = new ArrayList();
                            if (this.refLookupOutcomeTagByOutcomeId.get(str) != null) {
                                arrayList.addAll(this.refLookupOutcomeTagByOutcomeId.get(str));
                            }
                            arrayList.add(generateOutcomeTag(ticketInRound.ticketId, ticketInRound.type));
                            this.refLookupOutcomeTagByOutcomeId.put(str, arrayList);
                        }
                    }
                    this.refTicketMinFolds.put(ticketInRound.ticketId, Integer.valueOf(iMin));
                    this.refTicketMaxFolds.put(ticketInRound.ticketId, Integer.valueOf(iMax));
                    this.refLookupTicketBetsByFolds.put(ticketInRound.ticketId, sparseArray);
                }
                List<League> list = this.leagues;
                if (list != null) {
                    for (League league : list) {
                        this.refLookupLeagueByLeagueId.put(league.leagueId, league);
                    }
                }
                for (EventInRound eventInRound : this.events) {
                    this.refLookupEventByEventId.put(eventInRound.eventId, eventInRound);
                }
                List<EventInRound> list2 = this.fillingEvents;
                if (list2 != null) {
                    for (EventInRound eventInRound2 : list2) {
                        this.refLookupFillingEventByEventId.put(eventInRound2.eventId, eventInRound2);
                    }
                }
                for (MarketInRound marketInRound : this.markets) {
                    this.refLookupMarketByMarketId.put(marketInRound.marketId, marketInRound);
                }
                for (OutcomeInRound outcomeInRound : this.outcomes) {
                    this.refLookupOutcomeByOutcomeId.put(outcomeInRound.outcomeId, outcomeInRound);
                    List<OutcomeInRound> arrayList2 = this.refLookupOutcomeListByMarketId.get(outcomeInRound.marketId);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                        this.refLookupOutcomeListByMarketId.put(outcomeInRound.marketId, arrayList2);
                    }
                    arrayList2.add(outcomeInRound);
                    if (outcomeInRound.hit) {
                        List<OutcomeInRound> arrayList3 = this.refLookupHitOutcomeListByMarketId.get(outcomeInRound.marketId);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList<>();
                            this.refLookupHitOutcomeListByMarketId.put(outcomeInRound.marketId, arrayList3);
                        }
                        arrayList3.add(outcomeInRound);
                    }
                }
                for (BetBuilderInRound betBuilderInRound : this.betBuilders) {
                    for (BetBuilderSelection betBuilderSelection : betBuilderInRound.selections) {
                        betBuilderSelection.setMarketInRound(this.refLookupMarketByMarketId.get(betBuilderSelection.marketId));
                        betBuilderSelection.setOutcomeInRound(this.refLookupOutcomeByOutcomeId.get(betBuilderSelection.outcomeId));
                        betBuilderSelection.setHitOutcomes(this.refLookupHitOutcomeListByMarketId.get(betBuilderSelection.marketId));
                        betBuilderSelection.setOutcomes(this.refLookupOutcomeListByMarketId.get(betBuilderSelection.marketId));
                    }
                    this.refLookupBetBuilderByBetBuilderId.put(betBuilderInRound.id, betBuilderInRound);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    private w8z generateOutcomeTag(String str, String str2) {
        int i;
        switch (str2.hashCode()) {
            case -1349076209:
                if (!str2.equals(SimulateBetConsts.BetslipType.CUTBET)) {
                    i = this.singleBetCount;
                } else {
                    i = this.multipleBetCount;
                }
                break;
            case -902265784:
                str2.equals(SimulateBetConsts.BetslipType.SINGLE);
                i = this.singleBetCount;
                break;
            case -887328209:
                if (!str2.equals("system")) {
                    i = this.singleBetCount;
                } else {
                    i = this.systemBetCount;
                }
                break;
            case 653829648:
                if (!str2.equals(SimulateBetConsts.BetslipType.MULTIPLE)) {
                    i = this.singleBetCount;
                } else {
                    i = this.multipleBetCount;
                }
                break;
            case 1744737227:
                if (!str2.equals(SimulateBetConsts.BetslipType.FLEX)) {
                    i = this.singleBetCount;
                } else {
                    i = this.multipleBetCount;
                }
                break;
            default:
                i = this.singleBetCount;
                break;
        }
        return new w8z(str, str2, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ArrayList<Bet> getBetsByFolds(String str, int i) {
        createRefData();
        return this.refLookupTicketBetsByFolds.get(str).get(i);
    }

    public HashMap<String, List<w8z>> getLookUpOutcomeTagByOutcomeIdMapping() {
        createRefData();
        return this.refLookupOutcomeTagByOutcomeId;
    }

    public HashMap<String, BetBuilderInRound> getLookupBetBuilderByBetBuilderIdMapping() {
        createRefData();
        return this.refLookupBetBuilderByBetBuilderId;
    }

    public HashMap<String, Bet> getLookupBetByBetIdMapping() {
        createRefData();
        return this.refLookupBetByBetId;
    }

    public HashMap<String, BetDetail> getLookupBetDetailByCustomKeyMapping() {
        createRefData();
        return this.refBetDetailByCustomKey;
    }

    public HashMap<String, EventInRound> getLookupEventByEventIdMapping() {
        createRefData();
        return this.refLookupEventByEventId;
    }

    public HashMap<String, EventInRound> getLookupFillingEventByEventIdMapping() {
        createRefData();
        return this.refLookupFillingEventByEventId;
    }

    public HashMap<String, List<OutcomeInRound>> getLookupHitOutcomeByMarketIdMapping() {
        createRefData();
        return this.refLookupHitOutcomeListByMarketId;
    }

    public HashMap<String, League> getLookupLeagueByLeagueIdMapping() {
        createRefData();
        return this.refLookupLeagueByLeagueId;
    }

    public HashMap<String, MarketInRound> getLookupMarketByMarketIdMapping() {
        createRefData();
        return this.refLookupMarketByMarketId;
    }

    public HashMap<String, List<OutcomeInRound>> getLookupOutcomeByMarketIdMapping() {
        createRefData();
        return this.refLookupOutcomeListByMarketId;
    }

    public HashMap<String, OutcomeInRound> getLookupOutcomeByOutcomeIdMapping() {
        createRefData();
        return this.refLookupOutcomeByOutcomeId;
    }

    public HashMap<String, TicketInRound> getLookupTicketByBetIdMapping() {
        createRefData();
        return this.refLookupTicketByBetId;
    }

    public int getMaxFolds(String str) {
        return this.refTicketMaxFolds.get(str).intValue();
    }

    public int getMinFolds(String str) {
        return this.refTicketMinFolds.get(str).intValue();
    }

    public OutcomeInRound getOutcomeBy(Context context, String str, String str2, boolean z) {
        createRefData();
        return z ? this.refLookupBetBuilderByBetBuilderId.get(str2).getCombineOutcome(context, str) : this.refLookupOutcomeByOutcomeId.get(str2);
    }

    public BigDecimal getPotWin() {
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        Iterator<TicketInRound> it = this.tickets.iterator();
        while (it.hasNext()) {
            Iterator<Bet> it2 = it.next().bets.iterator();
            while (it2.hasNext()) {
                bigDecimalAdd = bigDecimalAdd.add(BigDecimal.valueOf(it2.next().potWin));
            }
        }
        return bigDecimalAdd.divide(geo.a);
    }

    public BigDecimal getTotalReturn() {
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        Iterator<TicketInRound> it = this.tickets.iterator();
        while (it.hasNext()) {
            bigDecimalAdd = bigDecimalAdd.add(BigDecimal.valueOf(it.next().totalReturn));
        }
        return bigDecimalAdd.divide(geo.a);
    }

    public BigDecimal getTotalStake() {
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        Iterator<TicketInRound> it = this.tickets.iterator();
        while (it.hasNext()) {
            bigDecimalAdd = bigDecimalAdd.add(BigDecimal.valueOf(it.next().totalStake));
        }
        return bigDecimalAdd.divide(geo.a);
    }

    public BigDecimal getWhTaxByFold(String str, int i) {
        BigDecimal bigDecimalAdd = BigDecimal.ZERO;
        ArrayList<Bet> betsByFolds = getBetsByFolds(str, i);
        int size = betsByFolds.size();
        int i2 = 0;
        while (i2 < size) {
            Bet bet = betsByFolds.get(i2);
            i2++;
            Bet bet2 = bet;
            if (bet2.hit) {
                bigDecimalAdd = bigDecimalAdd.add(new BigDecimal(bet2.wht));
            }
        }
        return bigDecimalAdd.divide(sqo.a, 2, RoundingMode.HALF_UP);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.sportId);
        parcel.writeString(this.roundId);
        parcel.writeLong(this.roundNumber);
        parcel.writeTypedList(this.markets);
        parcel.writeTypedList(this.tickets);
        parcel.writeTypedList(this.leagues);
        parcel.writeTypedList(this.events);
        parcel.writeTypedList(this.fillingEvents);
        parcel.writeTypedList(this.outcomes);
        parcel.writeTypedList(this.betBuilders);
        parcel.writeString(this.donChallengeId);
        parcel.writeByte(this.refHit ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.singleBetCount);
        parcel.writeInt(this.multipleBetCount);
        parcel.writeInt(this.systemBetCount);
    }

    public Round() {
        this.singleBetCount = 0;
        this.multipleBetCount = 0;
        this.systemBetCount = 0;
    }
}
