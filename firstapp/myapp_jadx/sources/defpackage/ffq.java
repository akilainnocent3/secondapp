package defpackage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.rewardcenter.gift.presentation.LNGiftTabViewModel$state$1", f = "LNGiftTabViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ffq extends tje0 implements iaj<lk50<? extends qcn<? extends ocq>>, scn<String, ? extends Boolean>, Boolean, v1b<? super dfq>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ scn b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ efq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffq(efq efqVar, v1b<? super ffq> v1bVar) {
        super(4, v1bVar);
        this.d = efqVar;
    }

    @Override // defpackage.iaj
    public final Object d(lk50<? extends qcn<? extends ocq>> lk50Var, scn<String, ? extends Boolean> scnVar, Boolean bool, v1b<? super dfq> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        ffq ffqVar = new ffq(this.d, v1bVar);
        ffqVar.a = lk50Var;
        ffqVar.b = scnVar;
        ffqVar.c = zBooleanValue;
        return ffqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        leq dVar;
        lk50 lk50Var = this.a;
        scn scnVar = this.b;
        boolean z = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (Intrinsics.g(lk50Var, lk50.b.a)) {
            dVar = leq.c.a;
        } else if (lk50Var instanceof lk50.a) {
            dVar = leq.b.a;
        } else {
            if (!(lk50Var instanceof lk50.c)) {
                uhc.a();
                return null;
            }
            qcn<ocq> qcnVar = (qcn) ((lk50.c) lk50Var).a;
            ocq ocqVar = (ocq) CollectionsKt.firstOrNull(qcnVar);
            if (ocqVar == null) {
                dVar = leq.a.a;
            } else {
                ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
                for (ocq ocqVar2 : qcnVar) {
                    ocqVar2.getClass();
                    scnVar.getClass();
                    arrayList.add(new hfq(ocqVar2.a, ocqVar2.d, ukd0.a(2, ocqVar2.e, true, true), bwf0.o((6 & 4) != 0 ? 0 : 1, ocqVar2.f, false), ocqVar2.b, ocqVar2.c, Intrinsics.g(scnVar.get(ocqVar2.a), Boolean.TRUE), false));
                }
                qcn qcnVarB = a4h.b(arrayList);
                String str = ocqVar.d;
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
                bigDecimalValueOf.getClass();
                Iterator<E> it = qcnVar.iterator();
                while (it.hasNext()) {
                    bigDecimalValueOf = bigDecimalValueOf.add(((ocq) it.next()).e);
                    bigDecimalValueOf.getClass();
                }
                rkd0.a aVar = rkd0.Companion;
                dVar = new leq.d(qcnVarB, str, ukd0.a(2, bigDecimalValueOf, true, true));
            }
        }
        return new dfq(dVar, z);
    }
}
