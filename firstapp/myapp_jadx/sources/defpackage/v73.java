package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.PreCannedBBOutcome;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$reportPlaceBetToFs$1", f = "BetSlipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v73 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ q73 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v73(q73 q73Var, int i, String str, String str2, int i2, v1b<? super v73> v1bVar) {
        super(2, v1bVar);
        this.b = q73Var;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = i2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        v73 v73Var = new v73(this.b, this.c, this.d, this.e, this.f, v1bVar);
        v73Var.a = obj;
        return v73Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((v73) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        q73 q73Var = this.b;
        String str2 = this.d;
        int i8 = this.f;
        try {
            zi50.a aVar = zi50.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<? extends Selection> listA0 = CollectionsKt.A0(q73Var.N.U());
            int size = listA0.size();
            if (listA0.isEmpty()) {
                i = 0;
            } else {
                Iterator<T> it = listA0.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (yay.i((Selection) it.next()) && (i = i + 1) < 0) {
                        b.p();
                        throw null;
                    }
                }
            }
            int i9 = this.c;
            if (i > 0) {
                q73Var.K1(i9, listA0);
            } else {
                q73Var.G1 = null;
            }
            switch (i9) {
                case 1:
                    str = SimulateBetConsts.BetslipType.SINGLE;
                    break;
                case 2:
                    str = SimulateBetConsts.BetslipType.MULTIPLE;
                    break;
                case 3:
                    str = "system";
                    break;
                case 4:
                    str = SimulateBetConsts.BetslipType.FLEX;
                    break;
                case 5:
                    str = SimulateBetConsts.BetslipType.CUTBET;
                    break;
                case 6:
                    str = "anywin";
                    break;
                default:
                    str = "unknown";
                    break;
            }
            linkedHashMap.put("betType", str);
            linkedHashMap.put("betCount", new Integer(size));
            linkedHashMap.put("stake", str2);
            if (listA0.isEmpty()) {
                i2 = 0;
            } else {
                Iterator<T> it2 = listA0.iterator();
                i2 = 0;
                while (it2.hasNext()) {
                    if (u7u.j((Selection) it2.next()) && (i2 = i2 + 1) < 0) {
                        b.p();
                        throw null;
                    }
                }
            }
            linkedHashMap.put("twoUpBetCount", new Integer(i2));
            if (listA0.isEmpty()) {
                i3 = 0;
            } else {
                i3 = 0;
                for (Selection selection : listA0) {
                    if (u7u.g(selection) || rlc.d(selection)) {
                        i3++;
                        if (i3 < 0) {
                            b.p();
                            throw null;
                        }
                    }
                }
            }
            linkedHashMap.put("oneUpBetCount", new Integer(i3));
            if (listA0.isEmpty()) {
                i4 = 0;
            } else {
                Iterator<T> it3 = listA0.iterator();
                i4 = 0;
                while (it3.hasNext()) {
                    if (((Selection) it3.next()).e == k980.RELATED_BET && (i4 = i4 + 1) < 0) {
                        b.p();
                        throw null;
                    }
                }
            }
            linkedHashMap.put("relatedBetCount", new Integer(i4));
            if (listA0.isEmpty()) {
                i5 = 0;
            } else {
                Iterator<T> it4 = listA0.iterator();
                i5 = 0;
                while (it4.hasNext()) {
                    if (((Selection) it4.next()).p() && (i5 = i5 + 1) < 0) {
                        b.p();
                        throw null;
                    }
                }
            }
            linkedHashMap.put("bbBetCount", new Integer(i5));
            if (listA0.isEmpty()) {
                i6 = 0;
            } else {
                Iterator<T> it5 = listA0.iterator();
                i6 = 0;
                while (it5.hasNext()) {
                    List<PreCannedBBOutcome> list = ((Selection) it5.next()).c.childOutcomes;
                    list.getClass();
                    if (!list.isEmpty() && (i6 = i6 + 1) < 0) {
                        b.p();
                        throw null;
                    }
                }
            }
            linkedHashMap.put("pcbbBetCount", new Integer(i6));
            linkedHashMap.put("egBetCount", new Integer(i));
            if (listA0.isEmpty()) {
                i7 = 0;
            } else {
                Iterator<T> it6 = listA0.iterator();
                i7 = 0;
                while (it6.hasNext()) {
                    if (((Selection) it6.next()).y && (i7 = i7 + 1) < 0) {
                        b.p();
                        throw null;
                    }
                }
            }
            linkedHashMap.put("featuredbbBetCount", new Integer(i7));
            String str3 = this.e;
            if (str3 != null) {
                linkedHashMap.put("from", str3);
            }
            if (i9 == 4) {
                linkedHashMap.put("flexibleOption", i8 + "+ of " + size);
            }
            q73Var.a0.f("PLACE_BET", linkedHashMap);
            bVar = Unit.a;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            w950.a("BetSlipViewModel", "reportPlaceBetToFs", thA, null);
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_BET_SLIP);
            aVar3.f(thA, "Failed to report place bet to FullStory", new Object[0]);
        }
        return Unit.a;
    }
}
