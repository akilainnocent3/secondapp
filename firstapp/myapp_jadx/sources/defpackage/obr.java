package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$resultLotteries$1", f = "LNSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class obr extends tje0 implements iaj<uf00<? extends hsq>, scn<String, ? extends Boolean>, scn<String, ? extends lk50<? extends qcn<? extends mk90>>>, v1b<? super sx70.e>, Object> {
    public /* synthetic */ uf00 a;
    public /* synthetic */ scn b;
    public /* synthetic */ scn c;

    @Override // defpackage.iaj
    public final Object d(uf00<? extends hsq> uf00Var, scn<String, ? extends Boolean> scnVar, scn<String, ? extends lk50<? extends qcn<? extends mk90>>> scnVar2, v1b<? super sx70.e> v1bVar) {
        obr obrVar = new obr(4, v1bVar);
        obrVar.a = uf00Var;
        obrVar.b = scnVar;
        obrVar.c = scnVar2;
        return obrVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        scn scnVar;
        boolean z;
        car cVar;
        uf00 uf00Var = this.a;
        scn scnVar2 = this.b;
        scn scnVar3 = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        uf00Var.getClass();
        scnVar2.getClass();
        scnVar3.getClass();
        List listR0 = CollectionsKt.r0(CollectionsKt.r0(uf00Var, new px70()), new qx70());
        ArrayList arrayList = new ArrayList(l48.r(listR0, 10));
        Iterator it = listR0.iterator();
        while (it.hasNext()) {
            hsq hsqVar = (hsq) it.next();
            String str = hsqVar.a;
            String str2 = hsqVar.i;
            boolean z2 = hsqVar.b;
            glq glqVar = hsqVar.g;
            Boolean bool = (Boolean) scnVar2.get(str);
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            String str3 = hsqVar.a;
            boolean z3 = hsqVar.b;
            glq glqVar2 = hsqVar.g;
            qcn<jer> qcnVar = hsqVar.m;
            lk50 lk50Var = (lk50) scnVar3.get(str3);
            car carVar = car.b.a;
            if (lk50Var != null) {
                if (lk50Var instanceof lk50.a) {
                    carVar = car.a.a;
                } else if (!lk50Var.equals(lk50.b.a)) {
                    if (!(lk50Var instanceof lk50.c)) {
                        uhc.a();
                        return null;
                    }
                    T t = ((lk50.c) lk50Var).a;
                    List listT0 = CollectionsKt.t0((Iterable) t, 3);
                    ArrayList arrayList2 = new ArrayList(l48.r(listT0, 10));
                    Iterator it2 = listT0.iterator();
                    while (it2.hasNext()) {
                        mk90 mk90Var = (mk90) it2.next();
                        boolean z4 = z3;
                        glq glqVar3 = glqVar2;
                        String str4 = mk90Var.a;
                        String str5 = mk90Var.c;
                        Iterator it3 = it2;
                        scn scnVar4 = scnVar2;
                        Date date = new Date(mk90Var.d);
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        qcn<jer> qcnVar2 = qcnVar;
                        boolean z5 = zBooleanValue;
                        arrayList2.add(new c7r(str4, str3, str5, z4, glqVar3, bwf0.l(date, "dd-MM-yyyy HH:mm", locale, 2, 0), mk90Var.g ? l6r.b.a : new l6r.a(mk90Var.h), qcnVar2));
                        z3 = z4;
                        glqVar2 = glqVar3;
                        qcnVar = qcnVar2;
                        scnVar2 = scnVar4;
                        it2 = it3;
                        zBooleanValue = z5;
                    }
                    scnVar = scnVar2;
                    z = zBooleanValue;
                    cVar = new car.c(a4h.f(arrayList2), ((qcn) t).size() > 3);
                }
                scnVar = scnVar2;
                z = zBooleanValue;
                cVar = carVar;
            } else {
                scnVar = scnVar2;
                z = zBooleanValue;
                cVar = carVar;
            }
            arrayList.add(new dar(str, z2, str2, glqVar, z, cVar));
            it = it;
            scnVar3 = scnVar3;
            scnVar2 = scnVar;
        }
        return new sx70.e(a4h.f(arrayList));
    }
}
