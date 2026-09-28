package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.home.RestrictionViewModel$getUserGeoInfo$1", f = "RestrictionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vi50 extends tje0 implements Function2<lk50<? extends Boolean>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ui50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi50(ui50 ui50Var, v1b<? super vi50> v1bVar) {
        super(2, v1bVar);
        this.b = ui50Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vi50 vi50Var = new vi50(this.b, v1bVar);
        vi50Var.a = obj;
        return vi50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Boolean> lk50Var, v1b<? super Unit> v1bVar) {
        return ((vi50) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50<Boolean> lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.A.m(lk50Var);
        return Unit.a;
    }
}
