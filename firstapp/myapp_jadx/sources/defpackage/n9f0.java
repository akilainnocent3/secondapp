package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.dedicatedteampage.team.presentation.viewmodel.TeamStandingsViewModel$fetchTournaments$1", f = "TeamStandingsViewModel.kt", l = {59}, m = "invokeSuspend", v = 2)
public final class n9f0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ o9f0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9f0(o9f0 o9f0Var, v1b<? super n9f0> v1bVar) {
        super(2, v1bVar);
        this.b = o9f0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new n9f0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((n9f0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        y5b y5bVar = y5b.a;
        int i = this.a;
        o9f0 o9f0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            nfk nfkVar = o9f0Var.a;
            String str = o9f0Var.c;
            this.a = 1;
            objA = nfkVar.a(str, this);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (objA instanceof zi50.b) {
            objA = null;
        }
        List list = (List) objA;
        if (list == null) {
            list = m2g.a;
        }
        o9f0Var.e.setValue(a4h.f(list));
        wwd0 wwd0Var = o9f0Var.f;
        a4g0 a4g0Var = (a4g0) CollectionsKt.firstOrNull(list);
        String str2 = a4g0Var != null ? a4g0Var.a : null;
        if (str2 == null) {
            str2 = "";
        }
        wwd0Var.getClass();
        wwd0Var.k(null, str2);
        return Unit.a;
    }
}
