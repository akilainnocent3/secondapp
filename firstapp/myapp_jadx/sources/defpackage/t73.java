package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.realsports.data.Event;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$reportNoBonusInPlaceBetRequest$1", f = "BetSlipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class t73 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ BigDecimal b;
    public final /* synthetic */ q73 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t73(BigDecimal bigDecimal, q73 q73Var, v1b<? super t73> v1bVar) {
        super(2, v1bVar);
        this.b = bigDecimal;
        this.c = q73Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        t73 t73Var = new t73(this.b, this.c, v1bVar);
        t73Var.a = obj;
        return t73Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t73) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Object bVar2;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Exception exc = new Exception("No bonus in place bet request in Betslip");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new StackTraceElement("No bonus in place bet request in Betslip", "", "", 0));
        arrayList.add(new StackTraceElement("", "totalBonusAmount=" + this.b, "", 0));
        q73 q73Var = this.c;
        lrm lrmVar = q73Var.O;
        Set<Map.Entry<Event, HashSet<lw2.a>>> setEntrySet = q73Var.X.s().entrySet();
        ArrayList arrayList2 = new ArrayList(l48.r(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            arrayList2.add((Event) ((Map.Entry) it.next()).getKey());
        }
        arrayList.add(new StackTraceElement("", "BetMutexData.LegalBetMutexMap's keys(Events)=" + arrayList2, "", 0));
        arrayList.add(new StackTraceElement("", "BonusConfig.oddsThreshold=" + nh4.c().a, "", 0));
        arrayList.add(new StackTraceElement("", hce0.a(nh4.c().d, "BonusConfig.minChuanCount="), "", 0));
        arrayList.add(new StackTraceElement("", inm.a("BonusConfig.bonusPlanId=", nh4.c().b), "", 0));
        int i = 16;
        try {
            zi50.a aVar = zi50.b;
            Set<Map.Entry> setEntrySet2 = lrmVar.b().entrySet();
            int iA = jpu.a(l48.r(setEntrySet2, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (Map.Entry entry : setEntrySet2) {
                linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
            bVar = "BetStore.chuanBonusMap=" + linkedHashMap;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            bVar = "BetStore.chuanBonusMap=null";
        }
        arrayList.add(new StackTraceElement("", (String) bVar, "", 0));
        try {
            Set<Map.Entry> setEntrySet3 = lrmVar.u().entrySet();
            int iA2 = jpu.a(l48.r(setEntrySet3, 10));
            if (iA2 >= 16) {
                i = iA2;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
            for (Map.Entry entry2 : setEntrySet3) {
                String str = (String) entry2.getKey();
                if (str == null) {
                    str = "";
                }
                linkedHashMap2.put(str, String.valueOf(entry2.getValue()));
            }
            bVar2 = "BetStore.chuanGuanStakeMap=" + linkedHashMap2;
        } catch (Throwable th2) {
            zi50.a aVar3 = zi50.b;
            bVar2 = new zi50.b(th2);
        }
        if (zi50.a(bVar2) != null) {
            bVar2 = "BetStore.chuanGuanStakeMap=null";
        }
        arrayList.add(new StackTraceElement("", (String) bVar2, "", 0));
        arrayList.add(new StackTraceElement("", "BetStore.getSingleStake=" + lrmVar.e0(), "", 0));
        arrayList.add(new StackTraceElement("", "BetStore.getMultipleStake=" + lrmVar.d0(), "", 0));
        arrayList.add(new StackTraceElement("", "BetStore.getSystemStake=" + lrmVar.a(), "", 0));
        exc.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        itf0.a aVar4 = itf0.a;
        aVar4.q(MyLog.TAG_BET_SLIP);
        aVar4.e(exc);
        wsm.d(q73Var.Y, exc);
        return Unit.a;
    }
}
