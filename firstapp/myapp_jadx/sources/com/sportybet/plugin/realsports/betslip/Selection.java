package com.sportybet.plugin.realsports.betslip;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.sportybet.ntespm.socket.TopicInfoKt;
import com.sportybet.ntespm.socket.TopicType;
import com.sportybet.plugin.realsports.betslip.domain.model.SelectionId;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.OutcomeEnum;
import com.sportybet.plugin.realsports.data.Sport;
import defpackage.f78;
import defpackage.hxa;
import defpackage.ig8;
import defpackage.jg8;
import defpackage.k980;
import defpackage.r780;
import defpackage.uf80;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes7.dex */
public class Selection implements Parcelable, SelectionId<Selection> {
    public static final Parcelable.Creator<Selection> CREATOR = new a();
    public boolean A;
    public final Event a;
    public final Market b;
    public final Outcome c;
    public final List<Selection> d;
    public k980 e;
    public String f;
    public boolean i;
    public final boolean v;
    public boolean w;
    public boolean y;
    public boolean z;

    public class a implements Parcelable.Creator<Selection> {
        @Override // android.os.Parcelable.Creator
        public final Selection createFromParcel(Parcel parcel) {
            return new Selection(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Selection[] newArray(int i) {
            return new Selection[i];
        }
    }

    public Selection(Parcel parcel) {
        this.v = false;
        this.w = false;
        this.y = false;
        this.z = false;
        this.A = false;
        this.a = (Event) parcel.readParcelable(Event.class.getClassLoader());
        this.b = (Market) parcel.readParcelable(Market.class.getClassLoader());
        this.c = (Outcome) parcel.readParcelable(Outcome.class.getClassLoader());
        this.d = parcel.createTypedArrayList(CREATOR);
        int i = parcel.readInt();
        this.e = i == -1 ? null : k980.values()[i];
        this.f = parcel.readString();
        this.i = parcel.readByte() != 0;
        this.v = parcel.readByte() != 0;
        this.w = parcel.readByte() != 0;
        this.y = parcel.readByte() != 0;
        this.z = parcel.readByte() != 0;
        this.A = parcel.readByte() != 0;
    }

    public final boolean a(ArrayList arrayList) {
        if (p()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (this.d.contains((Selection) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return TopicInfoKt.generateTopicString(TopicType.MARKET_ODDS, new jg8(this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Selection selection = (Selection) obj;
            if (this.a.equals(selection.a) && p() == selection.p()) {
                if (p()) {
                    List<Selection> list = selection.d;
                    List<Selection> list2 = this.d;
                    list2.getClass();
                    list.getClass();
                    return list2.size() == list.size() && CollectionsKt.E0(list2).containsAll(list);
                }
                if (this.b.equals(selection.b) && this.c.equals(selection.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String g() {
        return TopicInfoKt.generateTopicString(TopicType.MARKET_STATUS, new ig8(this, 1));
    }

    @Override // com.sportybet.plugin.realsports.betslip.domain.model.SelectionId
    public final List<Selection> getChildSelections() {
        return this.d;
    }

    @Override // com.sportybet.plugin.realsports.betslip.domain.model.SelectionId
    public final String getEventId() {
        Event event = this.a;
        if (event == null) {
            return null;
        }
        return event.eventId;
    }

    @Override // com.sportybet.plugin.realsports.betslip.domain.model.SelectionId
    public final String getMarketId() {
        Market market = this.b;
        if (market == null) {
            return null;
        }
        return market.id;
    }

    @Override // com.sportybet.plugin.realsports.betslip.domain.model.SelectionId
    public final String getOutcomeId() {
        Outcome outcome = this.c;
        if (outcome == null) {
            return null;
        }
        return outcome.id;
    }

    @Override // com.sportybet.plugin.realsports.betslip.domain.model.SelectionId
    public final String getSpecifier() {
        Market market = this.b;
        if (market == null) {
            return null;
        }
        return market.specifier;
    }

    public final String h() {
        return TopicInfoKt.generateTopicString(TopicType.SELECTION, new r780(this, 0));
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode();
        if (!p()) {
            return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
        }
        int i = iHashCode * 31;
        List<Selection> list = this.d;
        list.getClass();
        Iterator<T> it = list.iterator();
        int iHashCode2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode2 ^= next != null ? next.hashCode() : 0;
        }
        return i + iHashCode2;
    }

    public final String i() {
        StringBuilder sb = new StringBuilder();
        Event event = this.a;
        sb.append(event.eventId);
        sb.append("/");
        Sport sport = event.sport;
        String str = "";
        String str2 = sport == null ? "" : sport.id;
        Market market = this.b;
        if (!TextUtils.isEmpty(market.specifier)) {
            str = "?" + market.specifier;
        }
        StringBuilder sb2 = new StringBuilder("uof:");
        f78.b(market.product, "/", str2, "/", sb2);
        sb2.append(market.id);
        sb2.append(str);
        sb.append(sb2.toString());
        return sb.toString();
    }

    public final String j() {
        Sport sport = this.a.sport;
        String str = "";
        String str2 = sport == null ? "" : sport.id;
        Market market = this.b;
        if (!TextUtils.isEmpty(market.specifier)) {
            str = "?" + market.specifier;
        }
        StringBuilder sb = new StringBuilder("uof:");
        f78.b(market.product, "/", str2, "/", sb);
        sb.append(market.id);
        sb.append("/");
        return uf80.a(sb, this.c.id, str);
    }

    public final String k() {
        Market market = this.b;
        String str = TextUtils.isEmpty(market.specifier) ? "" : market.specifier;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.eventId);
        sb.append("^");
        hxa.c(sb, market.id, "^", str, "^");
        sb.append(this.c.id);
        return sb.toString();
    }

    public final boolean n() {
        Outcome outcome = this.c;
        if (outcome != null) {
            return outcome.id.equals(OutcomeEnum.Draw.getId()) || outcome.id.equals(OutcomeEnum.Joker.getId());
        }
        return false;
    }

    public final boolean p() {
        List<Selection> list = this.d;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final boolean q() {
        Outcome outcome = this.c;
        return outcome != null && outcome.isJokerOutcome();
    }

    public final String toString() {
        return this.a.eventId + this.b + this.c.id;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeTypedList(this.d);
        k980 k980Var = this.e;
        parcel.writeInt(k980Var == null ? -1 : k980Var.ordinal());
        parcel.writeString(this.f);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.w ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A ? (byte) 1 : (byte) 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Selection(Event event, Market market, Outcome outcome, List<Selection> list) {
        k980 k980Var = k980.DEFAULT;
        Boolean bool = Boolean.FALSE;
        this(event, market, outcome, list, k980Var, bool, bool, bool, bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Selection(Event event, Market market, Outcome outcome, k980 k980Var, Boolean bool) {
        Boolean bool2 = Boolean.FALSE;
        this(event, market, outcome, null, k980Var, bool, bool2, bool2, bool2);
    }

    public Selection(Event event, Market market, Outcome outcome, List<Selection> list, k980 k980Var, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.v = false;
        this.w = false;
        this.y = false;
        this.z = false;
        this.A = false;
        this.a = event;
        this.b = market;
        this.c = outcome;
        this.d = list;
        this.e = k980Var;
        this.i = bool.booleanValue();
        this.y = bool2.booleanValue();
        this.z = bool3.booleanValue();
        this.A = bool4.booleanValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Selection(Event event, Market market, Outcome outcome) {
        k980 k980Var = k980.DEFAULT;
        Boolean bool = Boolean.FALSE;
        this(event, market, outcome, null, k980Var, bool, bool, bool, bool);
    }
}
