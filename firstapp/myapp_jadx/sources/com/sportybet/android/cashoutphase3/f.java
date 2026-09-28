package com.sportybet.android.cashoutphase3;

import com.sporty.android.core.model.MyLog;
import com.sportybet.android.data.BannedItemSocket;
import com.sportybet.model.cashOut.CashOutData;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.BetSelection;
import defpackage.c0d;
import defpackage.g2k;
import defpackage.itf0;
import defpackage.ku90;
import defpackage.l48;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.wwd0;
import defpackage.y5b;
import defpackage.zi50;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$3", f = "CashOutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class f extends tje0 implements Function2<List<? extends BannedItemSocket>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ h b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, v1b<? super f> v1bVar) {
        super(2, v1bVar);
        this.b = hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        f fVar = new f(this.b, v1bVar);
        fVar.a = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends BannedItemSocket> list, v1b<? super Unit> v1bVar) {
        return ((f) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        h hVar = this.b;
        try {
            zi50.a aVar = zi50.b;
            ArrayList arrayListE = g2k.e(list);
            wwd0 wwd0Var = hVar.R;
            e eVar = (e) wwd0Var.getValue();
            ArrayList arrayListC0 = CollectionsKt.C0(((e) wwd0Var.getValue()).a.getCashAbleBets());
            int size = arrayListE.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayListE.get(i);
                i++;
                BannedItemSocket bannedItemSocket = (BannedItemSocket) obj2;
                ArrayList arrayList = new ArrayList();
                int size2 = arrayListC0.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj3 = arrayListC0.get(i2);
                    i2++;
                    if (((Bet) obj3).isCashable) {
                        arrayList.add(obj3);
                    }
                }
                int size3 = arrayList.size();
                int i3 = 0;
                while (i3 < size3) {
                    Object obj4 = arrayList.get(i3);
                    i3++;
                    List<BetSelection> list2 = ((Bet) obj4).selections;
                    list2.getClass();
                    ArrayList arrayList2 = new ArrayList(l48.r(list2, 10));
                    for (BetSelection betSelection : list2) {
                        if (Intrinsics.g(betSelection.eventId, bannedItemSocket.getId())) {
                            betSelection.bannedEvent = bannedItemSocket.getBanned();
                        }
                        arrayList2.add(Unit.a);
                    }
                }
            }
            e eVarA = e.a(eVar, CashOutData.copy$default(eVar.a, 0, arrayListC0, null, null, false, false, null, 125, null), false, null, false, 14);
            wwd0Var.getClass();
            wwd0Var.k(null, eVarA);
            ku90<Unit> ku90Var = hVar.T;
            bVar = Boolean.valueOf(ku90Var.a.a(Unit.a));
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_CASHOUT_CALC);
            aVar3.a("[bandedListStateFlow] add/delete fail.", new Object[0]);
        }
        return Unit.a;
    }
}
