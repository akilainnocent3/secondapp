package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.biometric.presentation.verification.BioAuthVerificationScreenKt$BioAuthVerificationScreen$4$1", f = "BioAuthVerificationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ja4 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ya4 a;
    public final /* synthetic */ Function1<Long, Unit> b;
    public final /* synthetic */ Function0<Unit> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ja4(ya4 ya4Var, Function1<? super Long, Unit> function1, Function0<Unit> function0, v1b<? super ja4> v1bVar) {
        super(2, v1bVar);
        this.a = ya4Var;
        this.b = function1;
        this.c = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ja4(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ja4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ya4 ya4Var = this.a;
        if (ya4Var.c) {
            this.b.invoke(new Long(ya4Var.b));
            this.c.invoke();
        }
        return Unit.a;
    }
}
