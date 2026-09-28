package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.kyc.nin.NINVerificationDialogKt$NINVerificationDialogRoute$2$1", f = "NINVerificationDialog.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c6x extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> a;
    public final /* synthetic */ Function0<Unit> b;
    public final /* synthetic */ ytw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6x(Function0 function0, Function0 function1, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.a = function0;
        this.b = function1;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c6x(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c6x) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (((p6x) this.c.getValue()).g) {
            this.a.invoke();
            this.b.invoke();
        }
        return Unit.a;
    }
}
