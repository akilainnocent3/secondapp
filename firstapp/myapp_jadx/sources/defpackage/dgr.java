package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$ticketWindowState$1", f = "LNStreamPlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dgr extends tje0 implements kaj<lk50<? extends qcn<? extends e3q>>, Integer, igr, Boolean, Boolean, v1b<? super khr>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ int b;
    public /* synthetic */ igr c;
    public /* synthetic */ boolean d;
    public /* synthetic */ boolean e;
    public final /* synthetic */ mfr f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgr(v1b v1bVar, mfr mfrVar) {
        super(6, v1bVar);
        this.f = mfrVar;
    }

    @Override // defpackage.kaj
    public final Object f(lk50<? extends qcn<? extends e3q>> lk50Var, Integer num, igr igrVar, Boolean bool, Boolean bool2, v1b<? super khr> v1bVar) {
        int iIntValue = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        dgr dgrVar = new dgr(v1bVar, this.f);
        dgrVar.a = lk50Var;
        dgrVar.b = iIntValue;
        dgrVar.c = igrVar;
        dgrVar.d = zBooleanValue;
        dgrVar.e = zBooleanValue2;
        return dgrVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = this.a;
        int i = this.b;
        igr igrVar = this.c;
        boolean z = this.d;
        boolean z2 = this.e;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (z2) {
            return khr.b.a;
        }
        boolean z3 = lk50Var instanceof lk50.a;
        if (z3) {
            return khr.a.a;
        }
        if (!z) {
            return khr.d.a;
        }
        if (Intrinsics.g(lk50Var, lk50.b.a)) {
            return khr.e.a;
        }
        if (z3) {
            return khr.a.a;
        }
        if (!(lk50Var instanceof lk50.c)) {
            uhc.a();
            return null;
        }
        T t = ((lk50.c) lk50Var).a;
        qcn qcnVar = (qcn) t;
        if (qcnVar.isEmpty()) {
            return khr.f.a;
        }
        List list = (List) t;
        int iE = f.e(i, 0, b.j(list));
        e3q e3qVar = (e3q) qcnVar.get(iE);
        String str = e3qVar.a;
        qcn<Integer> qcnVar2 = e3qVar.b;
        ArrayList arrayList = new ArrayList(l48.r(qcnVar2, 10));
        Iterator<Integer> it = qcnVar2.iterator();
        while (it.hasNext()) {
            arrayList.add(new ggr(it.next().intValue(), true));
        }
        qcn<Integer> qcnVar3 = e3qVar.c;
        ArrayList arrayList2 = new ArrayList(l48.r(qcnVar3, 10));
        Iterator<Integer> it2 = qcnVar3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new ggr(it2.next().intValue(), false));
        }
        return new khr.c(str, a4h.f(CollectionsKt.i0(arrayList2, arrayList)), d40.a(iE + 1, qcnVar.size(), " / "), iE > 0, iE < list.size() - 1, igrVar);
    }
}
