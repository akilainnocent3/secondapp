package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$mainDrawDialogState$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z2r extends tje0 implements gaj<String, uf00<? extends zsq>, v1b<? super e0q>, Object> {
    public /* synthetic */ String a;
    public /* synthetic */ uf00 b;

    @Override // defpackage.gaj
    public final Object invoke(String str, uf00<? extends zsq> uf00Var, v1b<? super e0q> v1bVar) {
        z2r z2rVar = new z2r(3, v1bVar);
        z2rVar.a = str;
        z2rVar.b = uf00Var;
        return z2rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object next;
        String str = this.a;
        uf00 uf00Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Iterator<E> it = uf00Var.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.g(((zsq) next).getMarketId(), str));
        zsq zsqVar = (zsq) next;
        return zsqVar != null ? new e0q.a(zsqVar) : e0q.b.a;
    }
}
