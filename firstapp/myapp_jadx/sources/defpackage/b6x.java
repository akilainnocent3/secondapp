package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.kyc.nin.NINVerificationDialogKt$NINVerificationDialogRoute$1$1", f = "NINVerificationDialog.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b6x extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ s6x a;
    public final /* synthetic */ ytw b;
    public final /* synthetic */ Function0<Unit> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6x(s6x s6xVar, ytw ytwVar, Function0 function0, v1b v1bVar) {
        super(2, v1bVar);
        this.a = s6xVar;
        this.b = ytwVar;
        this.c = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new b6x(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((b6x) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (((p6x) this.b.getValue()).c == 100) {
            final Function0<Unit> function0 = this.c;
            Function0 function1 = new Function0() { // from class: a6x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    function0.invoke();
                    return Unit.a;
                }
            };
            s6x s6xVar = this.a;
            ej5.c(o8i0.d(s6xVar), null, null, new t6x(false, s6xVar, function1, null), 3);
        }
        return Unit.a;
    }
}
