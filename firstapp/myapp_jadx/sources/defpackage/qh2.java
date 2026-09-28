package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderOutcome;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderRequest;
import com.sportybet.android.instantwin.newtork.model.response.Event;
import com.sportybet.android.instantwin.newtork.model.response.EventData;
import com.sportybet.android.instantwin.newtork.model.response.Market;
import com.sportybet.android.instantwin.newtork.model.response.Outcome;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
public final class qh2 implements nh2 {
    public final u0v a;
    public final x4s b;
    public final s8o c;
    public final jh2 d;
    public final wwd0 e;
    public final wwd0 f;
    public ssw<hqc> i;
    public String v;
    public String w;

    public qh2(u0v u0vVar, x4s x4sVar, s8o s8oVar, jh2 jh2Var) {
        u0vVar.getClass();
        x4sVar.getClass();
        s8oVar.getClass();
        jh2Var.getClass();
        this.a = u0vVar;
        this.b = x4sVar;
        this.c = s8oVar;
        this.d = jh2Var;
        this.e = xwd0.a(new ii2(zh2.b.a, false, m2g.a));
        this.f = xwd0.a(Boolean.FALSE);
    }

    @Override // defpackage.nh2
    public final boolean K() {
        return ((ii2) this.e.getValue()).d();
    }

    @Override // defpackage.nh2
    public final void U0(String str) {
        str.getClass();
        this.v = str;
        ssw<hqc> sswVar = this.i;
        hqc hqcVarD = sswVar != null ? sswVar.d() : null;
        if (hqcVarD instanceof nqc) {
            h(hqcVarD);
        }
    }

    @Override // defpackage.nh2
    public final uwd0<ii2> a() {
        return this.e;
    }

    @Override // defpackage.nh2
    public final void b(rh2 rh2Var) {
        rh2Var.getClass();
        String str = this.v;
        bs3 bs3Var = new bs3(str, rh2Var.a, rh2Var.b);
        if (str != null) {
            String str2 = this.w;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = rh2Var.c;
            this.v = str;
            ssw<hqc> sswVar = this.i;
            if (sswVar == null) {
                return;
            }
            this.a.e(str2, bs3Var, str3, false, sswVar, this.c);
        }
    }

    @Override // defpackage.nh2
    public final void c() {
        wwd0 wwd0Var;
        Object value;
        ii2 ii2Var;
        itf0.a aVar;
        do {
            wwd0Var = this.e;
            value = wwd0Var.getValue();
            ii2Var = (ii2) value;
            aVar = itf0.a;
            aVar.q("BetBuilder");
            aVar.a("setExpanded(false): before=" + ii2Var, new Object[0]);
        } while (!wwd0Var.g(value, ii2.a(ii2Var, null, false, 5)));
        aVar.q("BetBuilder");
        aVar.a("setExpanded: after=" + ((ii2) wwd0Var.getValue()).b, new Object[0]);
    }

    @Override // defpackage.nh2
    public final void d() {
        wwd0 wwd0Var;
        Object value;
        ii2 ii2Var;
        itf0.a aVar;
        do {
            wwd0Var = this.e;
            value = wwd0Var.getValue();
            ii2Var = (ii2) value;
            aVar = itf0.a;
            aVar.q("BetBuilder");
            aVar.a("toggleExpansion: before=" + ii2Var, new Object[0]);
        } while (!wwd0Var.g(value, ii2.a(ii2Var, null, !ii2Var.b && ii2Var.b(), 5)));
        aVar.q("BetBuilder");
        aVar.a("toggleExpansion: after=" + ((ii2) wwd0Var.getValue()).b, new Object[0]);
    }

    @Override // defpackage.nh2
    public final List<rh2> e() {
        return ((ii2) this.e.getValue()).c();
    }

    @Override // defpackage.nh2
    public final uwd0<Boolean> f() {
        return this.f;
    }

    @Override // defpackage.nh2
    public final void g(boolean z) {
        this.f.k(null, Boolean.valueOf(z));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void h(hqc hqcVar) {
        zh2 dVar;
        Event event;
        String str;
        String str2;
        Double dH;
        List<Event> list;
        wwd0 wwd0Var = this.e;
        ii2 ii2Var = (ii2) wwd0Var.getValue();
        if (hqcVar instanceof lqc) {
            dVar = zh2.c.a;
        } else if (hqcVar instanceof kqc) {
            dVar = zh2.a.a;
        } else if (hqcVar instanceof mqc) {
            dVar = ((ii2) wwd0Var.getValue()).a;
        } else if (hqcVar instanceof nqc) {
            T t = ((nqc) hqcVar).a;
            BetBuilderOutcome betBuilderOutcome = t instanceof BetBuilderOutcome ? (BetBuilderOutcome) t : null;
            if (betBuilderOutcome == null) {
                dVar = zh2.b.a;
            } else {
                String str3 = this.v;
                if (str3 != null) {
                    u0v u0vVar = this.a;
                    u0vVar.getClass();
                    EventData eventData = u0vVar.k.get(str3);
                    if (eventData == null || (list = eventData.events) == null) {
                        event = null;
                    } else {
                        event = (Event) CollectionsKt.firstOrNull(list);
                    }
                } else {
                    event = null;
                }
                Iterable<BetBuilderRequest> iterable = betBuilderOutcome.originalData;
                if (iterable == null) {
                    iterable = m2g.a;
                }
                ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
                for (BetBuilderRequest betBuilderRequest : iterable) {
                    Market marketD = event != null ? sqo.d(event, betBuilderRequest.marketId) : null;
                    Outcome outcomeH = marketD != null ? sqo.h(marketD, betBuilderRequest.outcomeId) : null;
                    String str4 = betBuilderRequest.marketId;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = betBuilderRequest.outcomeId;
                    if (str5 == null) {
                        str5 = "";
                    }
                    String str6 = betBuilderRequest.lookupKey;
                    String str7 = str6 == null ? "" : str6;
                    String str8 = marketD != null ? marketD.title : null;
                    String str9 = str8 == null ? "" : str8;
                    String str10 = outcomeH != null ? outcomeH.desc : null;
                    String str11 = str10 == null ? "" : str10;
                    String str12 = outcomeH != null ? outcomeH.odds : null;
                    arrayList.add(new rh2(str4, str5, str7, str9, str11, str12 == null ? "" : str12));
                }
                if (arrayList.isEmpty()) {
                    dVar = zh2.b.a;
                } else {
                    boolean z = arrayList.size() < 2;
                    x4s x4sVar = this.b;
                    BetBuilderConfig betBuilderConfig = x4sVar.b.i;
                    String str13 = "200";
                    if (betBuilderConfig != null) {
                        str = betBuilderConfig.maxOdds;
                        str.getClass();
                    } else {
                        str = "200";
                    }
                    Double dH2 = b.h(str);
                    double dDoubleValue = dH2 != null ? dH2.doubleValue() : Double.MAX_VALUE;
                    String str14 = betBuilderOutcome.odds;
                    double dDoubleValue2 = (str14 == null || (dH = b.h(str14)) == null) ? 0.0d : dH.doubleValue();
                    boolean z2 = betBuilderOutcome.enable;
                    boolean z3 = !z2 && dDoubleValue2 > dDoubleValue;
                    String str15 = betBuilderOutcome.odds;
                    if (str15 == null) {
                        str15 = "0.00";
                    }
                    String str16 = str15;
                    if (z3) {
                        BetBuilderConfig betBuilderConfig2 = x4sVar.b.i;
                        if (betBuilderConfig2 != null) {
                            str13 = betBuilderConfig2.maxOdds;
                            str13.getClass();
                        }
                        str2 = str13;
                    } else {
                        str2 = null;
                    }
                    dVar = new zh2.d(new pg2(arrayList, str16, z2, z, z3, str2));
                }
            }
        } else {
            dVar = zh2.b.a;
        }
        boolean z4 = ii2Var.b && ((dVar instanceof zh2.c) || ((dVar instanceof zh2.d) && !((zh2.d) dVar).a.a.isEmpty()));
        List list2 = dVar instanceof zh2.d ? ((zh2.d) dVar).a.a : dVar instanceof zh2.c ? ii2Var.c : m2g.a;
        dVar.getClass();
        list2.getClass();
        wwd0Var.k(null, new ii2(dVar, z4, list2));
    }

    @Override // defpackage.nh2
    public final void h0(et7 et7Var, String str, ssw sswVar) {
        qh2 qh2Var;
        lyh lyhVarA;
        str.getClass();
        this.w = str;
        this.i = sswVar;
        if (sswVar == null || (lyhVarA = i2i.a(sswVar)) == null) {
            qh2Var = this;
        } else {
            qh2Var = this;
            kzh.d(new g1i(lyhVarA, new oh2(2, qh2Var, qh2.class, "updateUiState", "updateUiState(Lcom/sportybet/android/common/DataState;)V", 4)), et7Var);
        }
        kzh.d(new g1i(qh2Var.f, new ph2(qh2Var, str, null)), et7Var);
    }
}
