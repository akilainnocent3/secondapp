package com.sportybet.android.multimaker.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sportybet.plugin.realsports.betslip.domain.model.SelectionId;
import defpackage.mq0;
import defpackage.mtg0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/sportybet/android/multimaker/domain/model/MultiMakerItem;", "Landroid/os/Parcelable;", "Lcom/sportybet/plugin/realsports/betslip/domain/model/SelectionId;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MultiMakerItem implements Parcelable, SelectionId<MultiMakerItem> {
    public static final Parcelable.Creator<MultiMakerItem> CREATOR = new a();
    public final MultiMakerEvent a;
    public final MultiMakerMarket b;
    public final MultiMakerOutcome c;
    public final boolean d;
    public final boolean e;

    public static final class a implements Parcelable.Creator<MultiMakerItem> {
        @Override // android.os.Parcelable.Creator
        public final MultiMakerItem createFromParcel(Parcel parcel) {
            parcel.getClass();
            MultiMakerEvent multiMakerEventCreateFromParcel = MultiMakerEvent.CREATOR.createFromParcel(parcel);
            MultiMakerMarket multiMakerMarketCreateFromParcel = MultiMakerMarket.CREATOR.createFromParcel(parcel);
            MultiMakerOutcome multiMakerOutcomeCreateFromParcel = MultiMakerOutcome.CREATOR.createFromParcel(parcel);
            boolean z = false;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new MultiMakerItem(multiMakerEventCreateFromParcel, multiMakerMarketCreateFromParcel, multiMakerOutcomeCreateFromParcel, z, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MultiMakerItem[] newArray(int i) {
            return new MultiMakerItem[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MultiMakerItem(MultiMakerEvent multiMakerEvent, MultiMakerMarket multiMakerMarket, MultiMakerOutcome multiMakerOutcome, int i) {
        int i2 = 0;
        this((i & 1) != 0 ? new MultiMakerEvent(i2) : multiMakerEvent, (i & 2) != 0 ? new MultiMakerMarket(i2) : multiMakerMarket, (i & 4) != 0 ? new MultiMakerOutcome(null, null, null, null, 0, 63, 0) : multiMakerOutcome, false, true);
    }

    public static MultiMakerItem a(MultiMakerItem multiMakerItem, MultiMakerEvent multiMakerEvent, MultiMakerMarket multiMakerMarket, MultiMakerOutcome multiMakerOutcome, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            multiMakerEvent = multiMakerItem.a;
        }
        MultiMakerEvent multiMakerEvent2 = multiMakerEvent;
        if ((i & 2) != 0) {
            multiMakerMarket = multiMakerItem.b;
        }
        MultiMakerMarket multiMakerMarket2 = multiMakerMarket;
        if ((i & 4) != 0) {
            multiMakerOutcome = multiMakerItem.c;
        }
        MultiMakerOutcome multiMakerOutcome2 = multiMakerOutcome;
        if ((i & 8) != 0) {
            z = multiMakerItem.d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = multiMakerItem.e;
        }
        multiMakerItem.getClass();
        multiMakerEvent2.getClass();
        multiMakerMarket2.getClass();
        multiMakerOutcome2.getClass();
        return new MultiMakerItem(multiMakerEvent2, multiMakerMarket2, multiMakerOutcome2, z3, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiMakerItem)) {
            return false;
        }
        MultiMakerItem multiMakerItem = (MultiMakerItem) obj;
        return Intrinsics.g(this.a, multiMakerItem.a) && Intrinsics.g(this.b, multiMakerItem.b) && Intrinsics.g(this.c, multiMakerItem.c) && this.d == multiMakerItem.d && this.e == multiMakerItem.e;
    }

    @Override // com.sportybet.plugin.realsports.betslip.domain.model.SelectionId
    public final List<MultiMakerItem> getChildSelections() {
        return null;
    }

    @Override // com.sportybet.plugin.realsports.betslip.domain.model.SelectionId
    public final String getEventId() {
        return this.a.a;
    }

    @Override // com.sportybet.plugin.realsports.betslip.domain.model.SelectionId
    public final String getMarketId() {
        return this.b.a;
    }

    @Override // com.sportybet.plugin.realsports.betslip.domain.model.SelectionId
    public final String getOutcomeId() {
        return this.c.a;
    }

    @Override // com.sportybet.plugin.realsports.betslip.domain.model.SelectionId
    public final String getSpecifier() {
        return this.b.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + mtg0.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiMakerItem(event=");
        sb.append(this.a);
        sb.append(", market=");
        sb.append(this.b);
        sb.append(", outcome=");
        sb.append(this.c);
        sb.append(", isLocked=");
        sb.append(this.d);
        sb.append(", isEnable=");
        return mq0.a(sb, this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        this.c.writeToParcel(parcel, i);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }

    public MultiMakerItem(MultiMakerEvent multiMakerEvent, MultiMakerMarket multiMakerMarket, MultiMakerOutcome multiMakerOutcome, boolean z, boolean z2) {
        multiMakerEvent.getClass();
        multiMakerMarket.getClass();
        multiMakerOutcome.getClass();
        this.a = multiMakerEvent;
        this.b = multiMakerMarket;
        this.c = multiMakerOutcome;
        this.d = z;
        this.e = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MultiMakerItem() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31);
    }
}
