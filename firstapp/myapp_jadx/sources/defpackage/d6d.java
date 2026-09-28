package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.dedicatedteampage.team.presentation.viewmodel.DedicatedTeamPagesViewModel$fetchTeamDetails$1", f = "DedicatedTeamPagesViewModel.kt", l = {84}, m = "invokeSuspend", v = 2)
public final class d6d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ e6d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6d(e6d e6dVar, v1b<? super d6d> v1bVar) {
        super(2, v1bVar);
        this.b = e6dVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d6d(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d6d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        Object value3;
        e6d e6dVar = this.b;
        wwd0 wwd0Var = e6dVar.e;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, n7d.a((n7d) value, null, null, true, false, false, 39)));
            jfk jfkVar = e6dVar.b;
            String str = e6dVar.d;
            this.a = 1;
            objA = jfkVar.a(str, this);
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
        if (!(objA instanceof zi50.b)) {
            f6f0 f6f0Var = (f6f0) objA;
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, n7d.a((n7d) value3, f6f0Var.a, f6f0Var.b, false, false, false, 33)));
        }
        Throwable thA = zi50.a(objA);
        if (thA != null) {
            boolean z = thA instanceof g6f0.a;
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, n7d.a((n7d) value2, null, null, false, !z, z, 7)));
        }
        return Unit.a;
    }
}
