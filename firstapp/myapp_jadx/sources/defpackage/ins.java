package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ins {
    public final List<Sport> a;
    public final Sport b;
    public final List<RegularMarketRule> c;
    public final RegularMarketRule d;
    public final List<Event> e;
    public final List<Map<String, String>> f;

    /* JADX WARN: Multi-variable type inference failed */
    public ins(List<? extends Sport> list, Sport sport, List<? extends RegularMarketRule> list2, RegularMarketRule regularMarketRule, List<? extends Event> list3, List<? extends Map<String, String>> list4) {
        sport.getClass();
        this.a = list;
        this.b = sport;
        this.c = list2;
        this.d = regularMarketRule;
        this.e = list3;
        this.f = list4;
    }

    public static ins a(ins insVar, Sport sport, List list, RegularMarketRule regularMarketRule, List list2, List list3, int i) {
        Sport sport2 = sport;
        List<Sport> list4 = insVar.a;
        if ((i & 2) != 0) {
            sport2 = insVar.b;
        }
        if ((i & 4) != 0) {
            list = insVar.c;
        }
        if ((i & 8) != 0) {
            regularMarketRule = insVar.d;
        }
        if ((i & 32) != 0) {
            list3 = insVar.f;
        }
        list4.getClass();
        sport2.getClass();
        RegularMarketRule regularMarketRule2 = regularMarketRule;
        List list5 = list;
        return new ins(list4, sport2, list5, regularMarketRule2, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ins)) {
            return false;
        }
        ins insVar = (ins) obj;
        return Intrinsics.g(this.a, insVar.a) && Intrinsics.g(this.b, insVar.b) && Intrinsics.g(this.c, insVar.c) && Intrinsics.g(this.d, insVar.d) && Intrinsics.g(this.e, insVar.e) && Intrinsics.g(this.f, insVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        List<RegularMarketRule> list = this.c;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        RegularMarketRule regularMarketRule = this.d;
        int iHashCode3 = (iHashCode2 + (regularMarketRule == null ? 0 : regularMarketRule.hashCode())) * 31;
        List<Event> list2 = this.e;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Map<String, String>> list3 = this.f;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveEventsPanelUiState(sportList=");
        sb.append(this.a);
        sb.append(", selectedSport=");
        sb.append(this.b);
        sb.append(", markets=");
        sb.append(this.c);
        sb.append(", selectedMarket=");
        sb.append(this.d);
        sb.append(", liveEvents=");
        return v9d.a(", boostMatches=", ")", sb, this.e, this.f);
    }

    public /* synthetic */ ins(ArrayList arrayList, Sport sport) {
        this(arrayList, sport, null, null, null, null);
    }
}
