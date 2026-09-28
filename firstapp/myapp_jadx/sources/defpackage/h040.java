package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.RangeSliderLogic$captureThumb$1", f = "Slider.kt", l = {2527}, m = "invokeSuspend")
public final class h040 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ i040 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xxo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h040(i040 i040Var, boolean z, xxo xxoVar, v1b<? super h040> v1bVar) {
        super(2, v1bVar);
        this.b = i040Var;
        this.c = z;
        this.d = xxoVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h040(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h040) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            boolean z = this.c;
            i040 i040Var = this.b;
            psw pswVar = z ? i040Var.b : i040Var.c;
            this.a = 1;
            if (pswVar.a(this.d, this) == y5bVar) {
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
