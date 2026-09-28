package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$resultBottomSheetState$1$2", f = "LNPlaceBetViewModel.kt", l = {202}, m = "invokeSuspend", v = 2)
public final class d3r extends tje0 implements Function2<myh<? super v4r>, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ f2r b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3r(v1b v1bVar, f2r f2rVar) {
        super(2, v1bVar);
        this.b = f2rVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d3r(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super v4r> myhVar, v1b<? super Unit> v1bVar) {
        return ((d3r) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ku90<Unit> ku90Var = this.b.R;
            Unit unit = Unit.a;
            this.a = 1;
            if (ku90Var.a.emit(unit, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
