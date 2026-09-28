package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.goldmine.ui.animationpanel.TGAnimationViewModel$init$1", f = "TGAnimationViewModel.kt", l = {72}, m = "invokeSuspend", v = 1)
public final class fse0 extends tje0 implements Function2<Integer, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ise0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fse0(ise0 ise0Var, v1b<? super fse0> v1bVar) {
        super(2, v1bVar);
        this.b = ise0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fse0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, v1b<? super Unit> v1bVar) {
        return ((fse0) create(Integer.valueOf(num.intValue()), v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            b390 b390Var = this.b.B;
            ryo.a aVar = ryo.a.a;
            this.a = 1;
            if (b390Var.emit(aVar, this) == y5bVar) {
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
