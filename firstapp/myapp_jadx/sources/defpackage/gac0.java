package defpackage;

import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.android.instantwin.newtork.model.error.ErrorBody;
import com.sportybet.android.instantwin.newtork.model.request.BetBuilderParameter;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderOutcome;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderRequest;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes5.dex */
public final class gac0 implements fac0 {
    public final s8o a;
    public final JsonSerializeService b;
    public final jh2 c;
    public final wwd0 d;
    public final wwd0 e;
    public final wwd0 f;
    public et7 g;
    public String h;
    public icc0 i;
    public String j;
    public String k;
    public BetBuilderConfig l;
    public final LinkedHashMap m;
    public String n;

    public static final class a extends IllegalStateException {
        public final kqc a;

        public a(kqc kqcVar) {
            this.a = kqcVar;
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsBetBuilderHandlerImpl$updateSelectionDirectly$1", f = "SportyLegendsBetBuilderHandlerImpl.kt", l = {235}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;
        public final /* synthetic */ BetBuilderOutcome i;
        public final /* synthetic */ BetBuilderOutcome v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, BetBuilderOutcome betBuilderOutcome, BetBuilderOutcome betBuilderOutcome2, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.i = betBuilderOutcome;
            this.v = betBuilderOutcome2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = gac0.this.new b(this.d, this.e, this.f, this.i, this.v, v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:69:0x00fb  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            b bVar;
            Throwable th;
            Object bVar2;
            Object bVar3;
            Object bVar4;
            kqc kqcVar;
            ResponseBody responseBody;
            Object value;
            gac0 gac0Var = gac0.this;
            wwd0 wwd0Var = gac0Var.f;
            wwd0 wwd0Var2 = gac0Var.d;
            y5b y5bVar = y5b.a;
            int i = this.a;
            Object obj2 = null;
            if (i == 0) {
                uj50.b(obj);
                gac0Var.r(((ii2) wwd0Var2.getValue()).c());
                String str = this.d;
                String str2 = this.e;
                String str3 = this.f;
                BetBuilderOutcome betBuilderOutcome = this.i;
                try {
                    zi50.a aVar = zi50.b;
                    this.b = null;
                    this.a = 1;
                    bVar = this;
                    try {
                        obj = gac0Var.p(str, str2, str3, betBuilderOutcome, bVar);
                        if (obj == y5bVar) {
                            return y5bVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        zi50.a aVar2 = zi50.b;
                        bVar2 = new zi50.b(th);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bVar = this;
                    th = th;
                    zi50.a aVar3 = zi50.b;
                    bVar2 = new zi50.b(th);
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                try {
                    uj50.b(obj);
                    bVar = this;
                } catch (Throwable th4) {
                    th = th4;
                    bVar = this;
                    zi50.a aVar4 = zi50.b;
                    bVar2 = new zi50.b(th);
                }
            }
            bVar2 = (BetBuilderOutcome) obj;
            zi50.a aVar5 = zi50.b;
            boolean z = bVar2 instanceof zi50.b;
            String str4 = bVar.f;
            if (!z) {
                BetBuilderOutcome betBuilderOutcome2 = (BetBuilderOutcome) bVar2;
                if (gac0Var.n.equals(str4)) {
                    wwd0Var.setValue(betBuilderOutcome2.m47clone());
                    gac0Var.q();
                }
            }
            Throwable thA = zi50.a(bVar2);
            if (thA != null) {
                if (thA instanceof CancellationException) {
                    throw thA;
                }
                if (gac0Var.n.equals(str4)) {
                    wwd0Var.setValue(bVar.v);
                }
                if (thA instanceof a) {
                    kqcVar = ((a) thA).a;
                } else if (thA instanceof tom) {
                    try {
                        bi50<?> bi50Var = ((tom) thA).c;
                        bVar3 = (bi50Var == null || (responseBody = bi50Var.c) == null) ? null : ci50.a(responseBody);
                    } catch (Throwable th5) {
                        zi50.a aVar6 = zi50.b;
                        bVar3 = new zi50.b(th5);
                    }
                    if (bVar3 instanceof zi50.b) {
                        bVar3 = null;
                    }
                    String str5 = (String) bVar3;
                    if (str5 != null) {
                        try {
                            bVar4 = gac0Var.b.fromJson(str5, (Class<Object>) ErrorBody.class);
                        } catch (Throwable th6) {
                            zi50.a aVar7 = zi50.b;
                            bVar4 = new zi50.b(th6);
                        }
                        if (!(bVar4 instanceof zi50.b)) {
                            obj2 = bVar4;
                        }
                    }
                    ErrorBody errorBody = (ErrorBody) obj2;
                    if (errorBody == null || errorBody.getErrorCode() != 11000) {
                        kqcVar = new kqc();
                    } else {
                        kqcVar = new kqc();
                        kqcVar.c = Long.valueOf(errorBody.getErrorCode());
                    }
                } else {
                    kqcVar = new kqc();
                }
                itf0.a aVar8 = itf0.a;
                aVar8.q("SportyLegendsBetBuilder");
                aVar8.n("Bet builder request failed with code=%s", kqcVar.c);
                do {
                    value = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value, ii2.a((ii2) value, zh2.a.a, false, 4)));
            }
            return Unit.a;
        }
    }

    public gac0(s8o s8oVar, JsonSerializeService jsonSerializeService, jh2 jh2Var) {
        s8oVar.getClass();
        jsonSerializeService.getClass();
        jh2Var.getClass();
        this.a = s8oVar;
        this.b = jsonSerializeService;
        this.c = jh2Var;
        this.d = xwd0.a(new ii2(zh2.b.a, false, m2g.a));
        this.e = xwd0.a(Boolean.FALSE);
        this.f = xwd0.a(BetBuilderOutcome.genDefaultBetBuilder());
        this.h = "";
        this.j = "";
        this.k = "";
        this.m = new LinkedHashMap();
        this.n = "";
    }

    @Override // defpackage.fac0
    public final v340 a() {
        return e1i.b(this.d);
    }

    @Override // defpackage.fac0
    public final void b(rh2 rh2Var) {
        rh2Var.getClass();
        if (StringsKt.U(this.h)) {
            return;
        }
        String str = this.k;
        String str2 = this.h;
        s(str, str2, new bs3(str2, rh2Var.a, rh2Var.b), rh2Var.c, false);
    }

    @Override // defpackage.fac0
    public final void c() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.d;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ii2.a((ii2) value, null, false, 5)));
    }

    @Override // defpackage.fac0
    public final void d() {
        wwd0 wwd0Var;
        Object value;
        ii2 ii2Var;
        do {
            wwd0Var = this.d;
            value = wwd0Var.getValue();
            ii2Var = (ii2) value;
        } while (!wwd0Var.g(value, ii2.a(ii2Var, null, !ii2Var.b && ii2Var.b(), 5)));
    }

    @Override // defpackage.fac0
    public final List<rh2> e() {
        return ((ii2) this.d.getValue()).c();
    }

    @Override // defpackage.fac0
    public final v340 f() {
        return e1i.b(this.e);
    }

    @Override // defpackage.fac0
    public final void g(boolean z) {
        this.e.k(null, Boolean.valueOf(z));
    }

    @Override // defpackage.fac0
    public final void h(et7 et7Var, lyh lyhVar, String str) {
        lyhVar.getClass();
        this.g = et7Var;
        this.k = str;
        kzh.d(new yzh(new g1i(lyhVar, new kac0(this, null)), new lac0(this, null)), et7Var);
        kzh.d(new g1i(e1i.b(this.e), new mac0(this, str, null)), et7Var);
    }

    @Override // defpackage.fac0
    public final void i(icc0 icc0Var) {
        String str = this.h;
        this.i = icc0Var;
        String str2 = icc0Var != null ? icc0Var.a : null;
        if (str2 == null) {
            str2 = "";
        }
        this.h = str2;
        if (str.equals(str2)) {
            q();
        } else {
            m();
        }
    }

    @Override // defpackage.fac0
    public final void j(String str) {
        if (this.j.equals(str)) {
            this.j = str;
        } else {
            this.j = str;
            m();
        }
    }

    @Override // defpackage.fac0
    public final void k(String str, String str2, bs3 bs3Var, String str3) {
        str3.getClass();
        s(str, str2, bs3Var, str3, true);
    }

    @Override // defpackage.fac0
    public final v340 l() {
        return e1i.b(this.f);
    }

    @Override // defpackage.fac0
    public final void m() {
        this.n = "";
        this.f.setValue(BetBuilderOutcome.genDefaultBetBuilder().m47clone());
        q();
    }

    @Override // defpackage.fac0
    public final void n(String str, String str2, bs3 bs3Var, String str3) {
        str3.getClass();
        s(str, str2, bs3Var, str3, false);
    }

    public final ArrayList o(BetBuilderOutcome betBuilderOutcome) {
        sdc0 sdc0Var;
        gfc0 gfc0Var;
        List<gfc0> list;
        Object next;
        List<sdc0> list2;
        Object next2;
        icc0 icc0Var = this.i;
        Iterable<BetBuilderRequest> iterable = betBuilderOutcome.originalData;
        if (iterable == null) {
            iterable = m2g.a;
        }
        ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
        for (BetBuilderRequest betBuilderRequest : iterable) {
            if (icc0Var == null || (list2 = icc0Var.d) == null) {
                sdc0Var = null;
            } else {
                Iterator<T> it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!Intrinsics.g(((sdc0) next2).a, betBuilderRequest.marketId));
                sdc0Var = (sdc0) next2;
            }
            if (sdc0Var == null || (list = sdc0Var.i) == null) {
                gfc0Var = null;
            } else {
                Iterator<T> it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!((gfc0) next).a.equals(betBuilderRequest.outcomeId));
                gfc0Var = (gfc0) next;
            }
            String str = betBuilderRequest.marketId;
            if (str == null) {
                str = "";
            }
            String str2 = betBuilderRequest.outcomeId;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = betBuilderRequest.lookupKey;
            String str4 = str3 == null ? "" : str3;
            String str5 = sdc0Var != null ? sdc0Var.d : null;
            String str6 = str5 == null ? "" : str5;
            String str7 = gfc0Var != null ? gfc0Var.c : null;
            String str8 = str7 == null ? "" : str7;
            String string = gfc0Var != null ? gfc0Var.b.toString() : null;
            arrayList.add(new rh2(str, str2, str4, str6, str8, string == null ? "" : string));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object p(String str, String str2, String str3, BetBuilderOutcome betBuilderOutcome, x1b x1bVar) throws Throwable {
        jac0 jac0Var;
        Object bVar;
        Object bVar2;
        kqc kqcVar;
        if (x1bVar instanceof jac0) {
            jac0Var = (jac0) x1bVar;
            int i = jac0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                jac0Var.f = i - Integer.MIN_VALUE;
            } else {
                jac0Var = new jac0(this, x1bVar);
            }
        } else {
            jac0Var = new jac0(this, x1bVar);
        }
        Object objO = jac0Var.d;
        y5b y5bVar = y5b.a;
        int i2 = jac0Var.f;
        Object obj = null;
        if (i2 == 0) {
            uj50.b(objO);
            su5<BetBuilderOutcome> su5VarL = this.a.l(new BetBuilderParameter(str, this.j, str2, betBuilderOutcome.originalData), new InstantWinBizTypeTag(vcj.a(str)));
            jac0Var.a = str2;
            jac0Var.b = str3;
            jac0Var.c = betBuilderOutcome;
            jac0Var.f = 1;
            bc6 bc6Var = new bc6(1, yzo.b(jac0Var));
            bc6Var.q();
            su5VarL.G(new hac0(bc6Var));
            bc6Var.t(new iac0(su5VarL));
            objO = bc6Var.o();
            if (objO == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            betBuilderOutcome = jac0Var.c;
            str3 = jac0Var.b;
            str2 = jac0Var.a;
            uj50.b(objO);
        }
        bi50 bi50Var = (bi50) objO;
        BetBuilderOutcome betBuilderOutcome2 = (BetBuilderOutcome) bi50Var.b;
        if (bi50Var.a.getIsSuccessful() && betBuilderOutcome2 != null) {
            BetBuilderOutcome betBuilderOutcomeM47clone = betBuilderOutcome.m47clone();
            betBuilderOutcomeM47clone.update(betBuilderOutcome2.id, betBuilderOutcome2.odds, betBuilderOutcome2.probability, betBuilderOutcome2.enable);
            LinkedHashMap linkedHashMap = this.m;
            Object linkedHashMap2 = linkedHashMap.get(str2);
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                linkedHashMap.put(str2, linkedHashMap2);
            }
            ((Map) linkedHashMap2).put(str3, betBuilderOutcomeM47clone.m47clone());
            return betBuilderOutcomeM47clone;
        }
        try {
            zi50.a aVar = zi50.b;
            ResponseBody responseBody = bi50Var.c;
            bVar = responseBody != null ? ci50.a(responseBody) : null;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        String str4 = (String) bVar;
        if (str4 != null) {
            try {
                bVar2 = this.b.fromJson(str4, (Class<Object>) ErrorBody.class);
            } catch (Throwable th2) {
                zi50.a aVar3 = zi50.b;
                bVar2 = new zi50.b(th2);
            }
            if (!(bVar2 instanceof zi50.b)) {
                obj = bVar2;
            }
        }
        ErrorBody errorBody = (ErrorBody) obj;
        if (errorBody == null || errorBody.getErrorCode() != 11000) {
            kqcVar = new kqc();
        } else {
            kqcVar = new kqc();
            kqcVar.c = Long.valueOf(errorBody.getErrorCode());
        }
        throw new a(kqcVar);
    }

    public final void q() {
        String str;
        zh2 dVar;
        Double dH;
        List list;
        wwd0 wwd0Var = this.d;
        ii2 ii2Var = (ii2) wwd0Var.getValue();
        BetBuilderOutcome betBuilderOutcomeM47clone = ((BetBuilderOutcome) this.f.getValue()).m47clone();
        betBuilderOutcomeM47clone.getClass();
        ArrayList arrayListO = o(betBuilderOutcomeM47clone);
        boolean z = false;
        if (arrayListO.isEmpty()) {
            dVar = zh2.b.a;
        } else {
            boolean z2 = arrayListO.size() < 2;
            BetBuilderConfig betBuilderConfig = this.l;
            if (betBuilderConfig == null || (str = betBuilderConfig.maxOdds) == null) {
                str = "200";
            }
            Double dH2 = kotlin.text.b.h(str);
            double dDoubleValue = dH2 != null ? dH2.doubleValue() : Double.MAX_VALUE;
            String str2 = betBuilderOutcomeM47clone.odds;
            double dDoubleValue2 = (str2 == null || (dH = kotlin.text.b.h(str2)) == null) ? 0.0d : dH.doubleValue();
            double d = dDoubleValue;
            boolean z3 = betBuilderOutcomeM47clone.enable;
            boolean z4 = !z3 && dDoubleValue2 > d;
            String str3 = betBuilderOutcomeM47clone.odds;
            if (str3 == null) {
                str3 = "0.00";
            }
            dVar = new zh2.d(new pg2(arrayListO, str3, z3, z2, z4, z4 ? str : null));
        }
        if (ii2Var.b && ((dVar instanceof zh2.c) || ((dVar instanceof zh2.d) && !((zh2.d) dVar).a.a.isEmpty()))) {
            z = true;
        }
        if (dVar instanceof zh2.d) {
            list = ((zh2.d) dVar).a.a;
        } else {
            list = dVar instanceof zh2.c ? ii2Var.c : m2g.a;
        }
        dVar.getClass();
        list.getClass();
        wwd0Var.k(null, new ii2(dVar, z, list));
    }

    public final void r(List<rh2> list) {
        wwd0 wwd0Var = this.d;
        ii2 ii2Var = (ii2) wwd0Var.getValue();
        zh2.c cVar = zh2.c.a;
        boolean z = ii2Var.b && !ii2Var.c().isEmpty();
        cVar.getClass();
        list.getClass();
        wwd0Var.k(null, new ii2(cVar, z, list));
    }

    public final void s(String str, String str2, bs3 bs3Var, String str3, boolean z) {
        this.k = str;
        this.h = str2;
        wwd0 wwd0Var = this.f;
        BetBuilderOutcome betBuilderOutcomeM47clone = ((BetBuilderOutcome) wwd0Var.getValue()).m47clone();
        BetBuilderOutcome betBuilderOutcomeM47clone2 = ((BetBuilderOutcome) wwd0Var.getValue()).m47clone();
        String str4 = bs3Var.b;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = bs3Var.c;
        if (str5 == null) {
            str5 = "";
        }
        BetBuilderRequest betBuilderRequest = new BetBuilderRequest(str4, str5, str3);
        String strAddItem = z ? betBuilderOutcomeM47clone2.addItem(betBuilderRequest) : betBuilderOutcomeM47clone2.removeItem(betBuilderRequest);
        this.n = strAddItem != null ? strAddItem : "";
        if (betBuilderOutcomeM47clone2.originalData.size() <= 1) {
            wwd0Var.setValue(betBuilderOutcomeM47clone2.m47clone());
            q();
            return;
        }
        if (strAddItem == null || strAddItem.length() == 0) {
            q();
            return;
        }
        wwd0Var.setValue(betBuilderOutcomeM47clone2.m47clone());
        r(o(betBuilderOutcomeM47clone2));
        LinkedHashMap linkedHashMap = this.m;
        Object linkedHashMap2 = linkedHashMap.get(str2);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(str2, linkedHashMap2);
        }
        BetBuilderOutcome betBuilderOutcome = (BetBuilderOutcome) ((Map) linkedHashMap2).get(strAddItem);
        BetBuilderOutcome betBuilderOutcomeM47clone3 = betBuilderOutcome != null ? betBuilderOutcome.m47clone() : null;
        if (betBuilderOutcomeM47clone3 != null) {
            wwd0Var.setValue(betBuilderOutcomeM47clone3.m47clone());
            q();
            return;
        }
        et7 et7Var = this.g;
        if (et7Var == null) {
            return;
        }
        pfd pfdVar = fse.a;
        ej5.c(et7Var, gku.a.h0(), null, new b(str, str2, strAddItem, betBuilderOutcomeM47clone2, betBuilderOutcomeM47clone, null), 2);
    }
}
