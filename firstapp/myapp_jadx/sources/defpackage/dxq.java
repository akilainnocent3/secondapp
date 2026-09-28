package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.mynumbers.LNMyNumberViewModel$state$1", f = "LNMyNumberViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class dxq extends tje0 implements iaj<Integer, dvq, ovq, v1b<? super wwq>, Object> {
    public /* synthetic */ int a;
    public /* synthetic */ dvq b;
    public /* synthetic */ ovq c;

    @Override // defpackage.iaj
    public final Object d(Integer num, dvq dvqVar, ovq ovqVar, v1b<? super wwq> v1bVar) {
        int iIntValue = num.intValue();
        dxq dxqVar = new dxq(4, v1bVar);
        dxqVar.a = iIntValue;
        dxqVar.b = dvqVar;
        dxqVar.c = ovqVar;
        return dxqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        dvq dvqVar = this.b;
        ovq ovqVar = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (Intrinsics.g(dvqVar, dvq.a.a) || Intrinsics.g(dvqVar, dvq.c.a)) {
            return wwq.a.a;
        }
        if (dvqVar == null) {
            return wwq.b.a;
        }
        if (!(dvqVar instanceof dvq.b)) {
            uhc.a();
            return null;
        }
        dvq.b bVar = (dvq.b) dvqVar;
        qcn<qvq> qcnVar = bVar.b;
        ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
        for (qvq qvqVar : qcnVar) {
            int i2 = qvqVar.b;
            String str = qvqVar.c;
            qcn<Integer> qcnVar2 = qvqVar.d;
            arrayList.add(new rvq(i2, str, qcnVar2, bVar.a.contains(new Integer(qcnVar2.size()))));
        }
        return new wwq.c(qcnVar.size() < i, i, ovqVar, a4h.f(arrayList));
    }
}
