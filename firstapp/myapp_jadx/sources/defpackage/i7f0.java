package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.dedicatedteampage.team.presentation.viewmodel.TeamMatchesViewModel$fetchTournamentsThenEvents$1", f = "TeamMatchesViewModel.kt", l = {223}, m = "invokeSuspend", v = 2)
public final class i7f0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ h7f0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7f0(h7f0 h7f0Var, v1b<? super i7f0> v1bVar) {
        super(2, v1bVar);
        this.b = h7f0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i7f0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((i7f0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        f7f0 f7f0Var;
        String message;
        Object value2;
        List list;
        h7f0 h7f0Var = this.b;
        wwd0 wwd0Var = h7f0Var.i;
        wwd0 wwd0Var2 = h7f0Var.z;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            nfk nfkVar = h7f0Var.a;
            String str = h7f0Var.f;
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
        Throwable thA = zi50.a(objA);
        if (thA == null) {
            List list2 = (List) objA;
            String strA0 = CollectionsKt.a0(list2, ",", null, null, new pu20(1), 30);
            do {
                value2 = wwd0Var2.getValue();
                list = list2;
                list2 = list;
            } while (!wwd0Var2.g(value2, f7f0.a((f7f0) value2, null, list, strA0, null, false, false, null, null, 249)));
            Boolean bool = Boolean.FALSE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
            h7f0Var.x1(strA0);
        } else {
            do {
                value = wwd0Var2.getValue();
                f7f0Var = (f7f0) value;
                message = thA.getMessage();
                if (message == null) {
                    message = "";
                }
            } while (!wwd0Var2.g(value, f7f0.a(f7f0Var, message, null, null, null, false, false, null, null, 254)));
            Boolean bool2 = Boolean.FALSE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool2);
        }
        return Unit.a;
    }
}
