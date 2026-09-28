package com.sportybet.android.instantwin.newtork.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.p200;
import defpackage.ux5;
import defpackage.v9d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0012\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0013\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nJ\u0016\u0010\u0015\u001a\u00020\u00112\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nJ\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nJ\u0016\u0010\u0017\u001a\u00020\u00112\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÂ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nHÂ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nHÂ\u0003J]\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0083\u0004J\n\u0010%\u001a\u00020 HÖ\u0081\u0004J\n\u0010&\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000Ê\u0001\u0002\b,Ê\u0001\f\b-\u0012\b\b.\u0012\u0004\b\u0003\u0010\u0000¨\u0006+"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/BetBuilderSelection;", "Landroid/os/Parcelable;", "marketId", "", "outcomeId", AnalyticsParam.MARKET_PARAM_MARKET, "Lcom/sportybet/android/instantwin/newtork/model/response/MarketInRound;", "outcome", "Lcom/sportybet/android/instantwin/newtork/model/response/OutcomeInRound;", "hitOutcomes", "", "outcomes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/android/instantwin/newtork/model/response/MarketInRound;Lcom/sportybet/android/instantwin/newtork/model/response/OutcomeInRound;Ljava/util/List;Ljava/util/List;)V", "Lkotlin/jvm/JvmField;", "getMarket", "setMarketInRound", "", "getOutcome", "setOutcomeInRound", "getHitOutcomes", "setHitOutcomes", "getOutcomes", "setOutcomes", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "instantWin", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetBuilderSelection implements Parcelable {
    private List<OutcomeInRound> hitOutcomes;
    private MarketInRound market;
    public final String marketId;
    private OutcomeInRound outcome;
    public final String outcomeId;
    private List<OutcomeInRound> outcomes;
    public static final Parcelable.Creator<BetBuilderSelection> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BetBuilderSelection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BetBuilderSelection createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList2 = null;
            MarketInRound marketInRoundCreateFromParcel = parcel.readInt() == 0 ? null : MarketInRound.CREATOR.createFromParcel(parcel);
            OutcomeInRound outcomeInRoundCreateFromParcel = parcel.readInt() == 0 ? null : OutcomeInRound.CREATOR.createFromParcel(parcel);
            int iA = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA2 = 0;
                while (iA2 != i) {
                    iA2 = p200.a(OutcomeInRound.CREATOR, parcel, arrayList, iA2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                arrayList2 = new ArrayList(i2);
                while (iA != i2) {
                    iA = p200.a(OutcomeInRound.CREATOR, parcel, arrayList2, iA, 1);
                }
            }
            return new BetBuilderSelection(string, string2, marketInRoundCreateFromParcel, outcomeInRoundCreateFromParcel, arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BetBuilderSelection[] newArray(int i) {
            return new BetBuilderSelection[i];
        }
    }

    public BetBuilderSelection(String str, String str2, MarketInRound marketInRound, OutcomeInRound outcomeInRound, List<OutcomeInRound> list, List<OutcomeInRound> list2) {
        this.marketId = str;
        this.outcomeId = str2;
        this.market = marketInRound;
        this.outcome = outcomeInRound;
        this.hitOutcomes = list;
        this.outcomes = list2;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final MarketInRound getMarket() {
        return this.market;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final OutcomeInRound getOutcome() {
        return this.outcome;
    }

    private final List<OutcomeInRound> component5() {
        return this.hitOutcomes;
    }

    private final List<OutcomeInRound> component6() {
        return this.outcomes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BetBuilderSelection copy$default(BetBuilderSelection betBuilderSelection, String str, String str2, MarketInRound marketInRound, OutcomeInRound outcomeInRound, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = betBuilderSelection.marketId;
        }
        if ((i & 2) != 0) {
            str2 = betBuilderSelection.outcomeId;
        }
        if ((i & 4) != 0) {
            marketInRound = betBuilderSelection.market;
        }
        if ((i & 8) != 0) {
            outcomeInRound = betBuilderSelection.outcome;
        }
        if ((i & 16) != 0) {
            list = betBuilderSelection.hitOutcomes;
        }
        if ((i & 32) != 0) {
            list2 = betBuilderSelection.outcomes;
        }
        List list3 = list;
        List list4 = list2;
        return betBuilderSelection.copy(str, str2, marketInRound, outcomeInRound, list3, list4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final BetBuilderSelection copy(String marketId, String outcomeId, MarketInRound market, OutcomeInRound outcome, List<OutcomeInRound> hitOutcomes, List<OutcomeInRound> outcomes) {
        return new BetBuilderSelection(marketId, outcomeId, market, outcome, hitOutcomes, outcomes);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetBuilderSelection)) {
            return false;
        }
        BetBuilderSelection betBuilderSelection = (BetBuilderSelection) other;
        return Intrinsics.g(this.marketId, betBuilderSelection.marketId) && Intrinsics.g(this.outcomeId, betBuilderSelection.outcomeId) && Intrinsics.g(this.market, betBuilderSelection.market) && Intrinsics.g(this.outcome, betBuilderSelection.outcome) && Intrinsics.g(this.hitOutcomes, betBuilderSelection.hitOutcomes) && Intrinsics.g(this.outcomes, betBuilderSelection.outcomes);
    }

    public final List<OutcomeInRound> getHitOutcomes() {
        return this.hitOutcomes;
    }

    public final MarketInRound getMarket() {
        return this.market;
    }

    public final OutcomeInRound getOutcome() {
        return this.outcome;
    }

    public final List<OutcomeInRound> getOutcomes() {
        return this.outcomes;
    }

    public int hashCode() {
        String str = this.marketId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.outcomeId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        MarketInRound marketInRound = this.market;
        int iHashCode3 = (iHashCode2 + (marketInRound == null ? 0 : marketInRound.hashCode())) * 31;
        OutcomeInRound outcomeInRound = this.outcome;
        int iHashCode4 = (iHashCode3 + (outcomeInRound == null ? 0 : outcomeInRound.hashCode())) * 31;
        List<OutcomeInRound> list = this.hitOutcomes;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<OutcomeInRound> list2 = this.outcomes;
        return iHashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setHitOutcomes(List<OutcomeInRound> hitOutcomes) {
        this.hitOutcomes = hitOutcomes;
    }

    public final void setMarketInRound(MarketInRound market) {
        this.market = market;
    }

    public final void setOutcomeInRound(OutcomeInRound outcome) {
        this.outcome = outcome;
    }

    public final void setOutcomes(List<OutcomeInRound> outcomes) {
        this.outcomes = outcomes;
    }

    public String toString() {
        String str = this.marketId;
        String str2 = this.outcomeId;
        MarketInRound marketInRound = this.market;
        OutcomeInRound outcomeInRound = this.outcome;
        List<OutcomeInRound> list = this.hitOutcomes;
        List<OutcomeInRound> list2 = this.outcomes;
        StringBuilder sbA = ux5.a("BetBuilderSelection(marketId=", str, ", outcomeId=", str2, ", market=");
        sbA.append(marketInRound);
        sbA.append(", outcome=");
        sbA.append(outcomeInRound);
        sbA.append(", hitOutcomes=");
        return v9d.a(", outcomes=", ")", sbA, list, list2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.marketId);
        dest.writeString(this.outcomeId);
        MarketInRound marketInRound = this.market;
        if (marketInRound == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            marketInRound.writeToParcel(dest, flags);
        }
        OutcomeInRound outcomeInRound = this.outcome;
        if (outcomeInRound == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            outcomeInRound.writeToParcel(dest, flags);
        }
        List<OutcomeInRound> list = this.hitOutcomes;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<OutcomeInRound> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        List<OutcomeInRound> list2 = this.outcomes;
        if (list2 == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list2.size());
        Iterator<OutcomeInRound> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
    }
}
