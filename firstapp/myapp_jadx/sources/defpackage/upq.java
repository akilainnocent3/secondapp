package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$favoritePage$1$1$1", f = "LNLobbyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class upq extends tje0 implements gaj<qcn<? extends erq>, qcn<? extends String>, v1b<? super mmq>, Object> {
    public /* synthetic */ qcn a;
    public /* synthetic */ qcn b;
    public final /* synthetic */ spq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upq(v1b v1bVar, spq spqVar) {
        super(3, v1bVar);
        this.c = spqVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(qcn<? extends erq> qcnVar, qcn<? extends String> qcnVar2, v1b<? super mmq> v1bVar) {
        upq upqVar = new upq(v1bVar, this.c);
        upqVar.a = qcnVar;
        upqVar.b = qcnVar2;
        return upqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qcn qcnVar = this.a;
        qcn qcnVar2 = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (qcnVar2.isEmpty()) {
            return mmq.b.a;
        }
        qcn qcnVarA = dmt.a(qcnVar2, qcnVar);
        if (qcnVarA.isEmpty()) {
            return mmq.f.a;
        }
        ArrayList arrayList = new ArrayList(l48.r(qcnVarA, 10));
        Iterator<E> it = qcnVarA.iterator();
        while (it.hasNext()) {
            arrayList.add(dmt.b((erq) it.next(), this.c.c));
        }
        return new mmq.e(a4h.b(arrayList));
    }
}
