package com.sportybet.android.cashoutphase3;

import com.sporty.android.common.network.data.SprThrowable;
import com.sportybet.android.cashoutphase3.e;
import com.sportybet.android.cashoutphase3.g;
import com.sportybet.android.cashoutphase3.h;
import com.sportybet.model.cashOut.CashOutData;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.BetSelection;
import defpackage.c0d;
import defpackage.lk50;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.wwd0;
import defpackage.y5b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$collectCashoutData$1", f = "CashOutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g extends tje0 implements Function2<lk50<? extends CashOutData>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ h b;

    @c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$collectCashoutData$1$1$1", f = "CashOutViewModel.kt", l = {516}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public List a;
        public h b;
        public int c;
        public int d;
        public int e;
        public final /* synthetic */ CashOutData f;
        public final /* synthetic */ h i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CashOutData cashOutData, h hVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.f = cashOutData;
            this.i = hVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.f, this.i, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0032  */
        /* JADX WARN: Code duplicated, block: B:12:0x004f A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004d -> B:13:0x0050). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r7.e
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L15
                int r1 = r7.d
                int r3 = r7.c
                com.sportybet.android.cashoutphase3.h r4 = r7.b
                java.util.List r5 = r7.a
                defpackage.uj50.b(r8)
                goto L50
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L1c:
                defpackage.uj50.b(r8)
                com.sportybet.model.cashOut.CashOutData r8 = r7.f
                java.util.List r8 = r8.getCashAbleBets()
                int r1 = r8.size()
                com.sportybet.android.cashoutphase3.h r3 = r7.i
                r4 = 0
                r5 = r4
                r4 = r3
                r3 = r5
                r5 = r8
            L30:
                if (r3 >= r1) goto L52
                java.lang.Object r8 = r5.get(r3)
                com.sportybet.plugin.realsports.data.Bet r8 = (com.sportybet.plugin.realsports.data.Bet) r8
                sm6 r6 = r4.C
                java.util.List<com.sportybet.plugin.realsports.data.BetSelection> r8 = r8.selections
                r8.getClass()
                r7.a = r5
                r7.b = r4
                r7.c = r3
                r7.d = r1
                r7.e = r2
                java.lang.Object r8 = r6.f(r8, r7)
                if (r8 != r0) goto L50
                return r0
            L50:
                int r3 = r3 + r2
                goto L30
            L52:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportybet.android.cashoutphase3.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, v1b<? super g> v1bVar) {
        super(2, v1bVar);
        this.b = hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        g gVar = new g(this.b, v1bVar);
        gVar.a = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends CashOutData> lk50Var, v1b<? super Unit> v1bVar) {
        return ((g) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        e eVarA;
        String e;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        final h hVar = this.b;
        wwd0 wwd0Var = hVar.R;
        final e eVar = (e) wwd0Var.getValue();
        Function1 function1 = new Function1() { // from class: yn6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CashOutData cashOutData = (CashOutData) obj2;
                List<Bet> cashAbleBets = cashOutData.getCashAbleBets();
                h hVar2 = hVar;
                boolean z = ((Number) hVar2.B.g().a.getValue()).intValue() != 1 && cashAbleBets.isEmpty();
                if (z) {
                    p0z p0zVar = hVar2.M;
                    p0zVar.getClass();
                    hVar2.J.s(d1z.a(p0zVar));
                    hVar2.M = p0zVar;
                    if (p0zVar != p0z.a) {
                        hVar2.v.d(false);
                    }
                    hVar2.B1(zyy.a);
                }
                e eVar2 = eVar;
                if (z) {
                    return eVar2;
                }
                List<Bet> cashAbleBets2 = cashOutData.getCashAbleBets();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : cashAbleBets2) {
                    Bet bet = (Bet) obj3;
                    if (bet.isCashable && bet.isHugeCombo) {
                        arrayList.add(obj3);
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj4 = arrayList.get(i);
                    i++;
                    Bet bet2 = (Bet) obj4;
                    bet2.isCalcByFE = false;
                    bet2.isCashAbleJS = false;
                    bet2.isJsCalcFailed = true;
                    bet2.shouldShowRefreshButton = false;
                    bet2.isCashoutAmountNotAcquired = false;
                }
                List<Bet> cashAbleBets3 = cashOutData.getCashAbleBets();
                LinkedHashMap linkedHashMap = hVar2.S;
                linkedHashMap.clear();
                for (Bet bet3 : cashAbleBets3) {
                    List<BetSelection> list = bet3.selections;
                    ArrayList arrayListA = kw5.a(list);
                    for (Object obj5 : list) {
                        if (((BetSelection) obj5).lfbOddsBoosted) {
                            arrayListA.add(obj5);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = arrayListA.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj6 = arrayListA.get(i2);
                        i2++;
                        BetSelection betSelection = (BetSelection) obj6;
                        String str = betSelection.eventId;
                        String str2 = betSelection.outcomeId;
                        String strA = (str == null || StringsKt.U(str) || str2 == null || StringsKt.U(str2)) ? null : i8z.a(str, str2);
                        if (strA != null) {
                            arrayList2.add(strA);
                        }
                    }
                    Set setE0 = CollectionsKt.E0(arrayList2);
                    String str3 = bet3.id;
                    if (str3 != null && !setE0.isEmpty()) {
                        linkedHashMap.put(str3, setE0);
                    }
                }
                ej5.c(o8i0.d(hVar2), null, null, new g.a(cashOutData, hVar2, null), 3);
                e.a aVar = new e.a(10000, "");
                eVar2.getClass();
                return new e(cashOutData, false, aVar, false);
            }
        };
        if (lk50Var instanceof lk50.c) {
            eVarA = (e) function1.invoke(((lk50.c) lk50Var).a);
        } else if (lk50Var instanceof lk50.a) {
            Throwable th = ((lk50.a) lk50Var).a;
            boolean z = th instanceof SprThrowable;
            SprThrowable sprThrowable = (SprThrowable) (!z ? null : th);
            int d = sprThrowable != null ? sprThrowable.getD() : 19999;
            SprThrowable sprThrowable2 = (SprThrowable) (z ? th : null);
            if (sprThrowable2 == null || (e = sprThrowable2.getE()) == null) {
                e = "";
            }
            eVarA = e.a(eVar, null, true, new e.a(d, e), false, 1);
        } else {
            if (!Intrinsics.g(lk50Var, lk50.b.a)) {
                uhc.a();
                return null;
            }
            eVarA = e.a(eVar, null, false, null, true, 5);
        }
        wwd0Var.setValue(eVarA);
        List<Bet> cashAbleBets = ((e) wwd0Var.getValue()).a.getCashAbleBets();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : cashAbleBets) {
            Bet bet = (Bet) obj2;
            if (bet.isCashable && !bet.isHugeCombo) {
                arrayList.add(obj2);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            ((Function1) hVar.C0.getValue()).invoke((Bet) obj3);
        }
        return Unit.a;
    }
}
