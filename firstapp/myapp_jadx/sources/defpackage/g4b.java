package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", l = {342}, m = "invokeSuspend")
public final class g4b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ia5 b;
    public final /* synthetic */ ijf0 c;
    public final /* synthetic */ n6s d;
    public final /* synthetic */ vkf0 e;
    public final /* synthetic */ mly f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4b(ia5 ia5Var, ijf0 ijf0Var, n6s n6sVar, vkf0 vkf0Var, mly mlyVar, v1b<? super g4b> v1bVar) {
        super(2, v1bVar);
        this.b = ia5Var;
        this.c = ijf0Var;
        this.d = n6sVar;
        this.e = vkf0Var;
        this.f = mlyVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g4b(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g4b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk40 lk40VarB;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            bff0 bff0Var = this.d.a;
            ukf0 ukf0Var = this.e.a;
            this.a = 1;
            int iB = this.f.b(ulf0.e(this.c.b));
            if (iB < ukf0Var.a.a.b.length()) {
                lk40VarB = ukf0Var.b(iB);
            } else {
                lk40VarB = iB != 0 ? ukf0Var.b(iB - 1) : new lk40(0.0f, 0.0f, 1.0f, (int) (yff0.a(bff0Var.b, bff0Var.g, bff0Var.h, yff0.a, 1) & 4294967295L));
            }
            Object objA = this.b.a(lk40VarB, this);
            if (objA != y5bVar) {
                objA = Unit.a;
            }
            if (objA == y5bVar) {
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
