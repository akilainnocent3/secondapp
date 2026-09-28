package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$selectedTagState$1", f = "LNLobbyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kqq extends tje0 implements gaj<ipq, kmq, v1b<? super uf00<? extends jpq>>, Object> {
    public /* synthetic */ ipq a;
    public /* synthetic */ kmq b;

    @Override // defpackage.gaj
    public final Object invoke(ipq ipqVar, kmq kmqVar, v1b<? super uf00<? extends jpq>> v1bVar) {
        kqq kqqVar = new kqq(3, v1bVar);
        kqqVar.a = ipqVar;
        kqqVar.b = kmqVar;
        return kqqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ipq ipqVar = this.a;
        kmq kmqVar = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        qcn<ipq> qcnVar = kmqVar.b;
        ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
        Iterator<ipq> it = qcnVar.iterator();
        while (it.hasNext()) {
            ipq next = it.next();
            arrayList.add(new jpq(next, ipqVar == next));
        }
        return a4h.f(arrayList);
    }
}
