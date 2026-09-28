package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.luckywheel.components.LuckyWheelKt$LuckyWheel$4$1", f = "LuckyWheel.kt", l = {228}, m = "invokeSuspend", v = 2)
public final class i9u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ccb0 b;
    public final /* synthetic */ wd0<Float, ij0> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9u(ccb0 ccb0Var, wd0<Float, ij0> wd0Var, v1b<? super i9u> v1bVar) {
        super(2, v1bVar);
        this.b = ccb0Var;
        this.c = wd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new i9u(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((i9u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (this.b == ccb0.a) {
                wd0<Float, ij0> wd0Var = this.c;
                Float f = new Float(wd0Var.d().floatValue() % 360.0f);
                this.a = 1;
                if (wd0Var.f(this, f) == y5bVar) {
                    return y5bVar;
                }
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
