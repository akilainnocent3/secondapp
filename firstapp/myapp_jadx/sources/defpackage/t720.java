package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.vip.presentation.PoweringUpComponentKt$PoweringUpComponent$1", f = "PoweringUpComponent.kt", l = {47}, m = "invokeSuspend", v = 1)
public final class t720 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ yp40 b;
    public final /* synthetic */ isw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t720(yp40 yp40Var, isw iswVar, v1b<? super t720> v1bVar) {
        super(2, v1bVar);
        this.b = yp40Var;
        this.c = iswVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t720(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t720) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        yp40 yp40Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            if (!yp40Var.a) {
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        do {
            isw iswVar = this.c;
            if (iswVar.j() < 0.0f) {
                return Unit.a;
            }
            iswVar.A(iswVar.j() - 100.0f);
            yp40Var.a = true;
            this.a = 1;
        } while (hkd.b(100L, this) != y5bVar);
        return y5bVar;
    }
}
