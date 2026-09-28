package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.kyc.nin.NINVerificationScreenKt$NINVerificationScreen$1$1", f = "NINVerificationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n6x extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ p6x a;
    public final /* synthetic */ Function0<Unit> b;
    public final /* synthetic */ Function0<Unit> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6x(p6x p6xVar, Function0<Unit> function0, Function0<Unit> function1, v1b<? super n6x> v1bVar) {
        super(2, v1bVar);
        this.a = p6xVar;
        this.b = function0;
        this.c = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new n6x(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((n6x) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.a.g) {
            this.b.invoke();
            this.c.invoke();
        }
        return Unit.a;
    }
}
