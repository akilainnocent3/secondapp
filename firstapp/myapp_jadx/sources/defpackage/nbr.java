package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.search.presentation.LNSearchViewModel$lotteriesSearchResult$1", f = "LNSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class nbr extends tje0 implements iaj<qcn<? extends String>, qcn<? extends erq>, String, v1b<? super uf00<? extends hsq>>, Object> {
    public /* synthetic */ qcn a;
    public /* synthetic */ qcn b;
    public /* synthetic */ String c;
    public final /* synthetic */ fjr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbr(fjr fjrVar, v1b<? super nbr> v1bVar) {
        super(4, v1bVar);
        this.d = fjrVar;
    }

    @Override // defpackage.iaj
    public final Object d(qcn<? extends String> qcnVar, qcn<? extends erq> qcnVar2, String str, v1b<? super uf00<? extends hsq>> v1bVar) {
        nbr nbrVar = new nbr(this.d, v1bVar);
        nbrVar.a = qcnVar;
        nbrVar.b = qcnVar2;
        nbrVar.c = str;
        return nbrVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qcn qcnVar = this.a;
        qcn qcnVar2 = this.b;
        String str = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        qcn qcnVarA = dmt.a(qcnVar, qcnVar2);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : qcnVarA) {
            erq erqVar = (erq) obj2;
            if (StringsKt.M(erqVar.b, str, true) || StringsKt.M(erqVar.e, str, true)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            arrayList2.add(dmt.b((erq) obj3, this.d));
        }
        return a4h.f(arrayList2);
    }
}
