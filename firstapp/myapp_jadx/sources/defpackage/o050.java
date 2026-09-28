package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.latam.validation.presentation.RegistrationValidationViewModel$launchFacialRecognition$1", f = "RegistrationValidationViewModel.kt", l = {152}, m = "invokeSuspend", v = 2)
public final class o050 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ s050 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o050(s050 s050Var, v1b<? super o050> v1bVar) {
        super(2, v1bVar);
        this.b = s050Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new o050(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((o050) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s050 s050Var = this.b;
            wwd0 wwd0Var = s050Var.a;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, l050.a((l050) value, null, null, null, null, false, false, null, true, false, false, 639)));
            b390 b390Var = s050Var.c;
            k050.b bVar = new k050.b(new u6h(s050Var.z1().b, q7h.REGISTRATION));
            this.a = 1;
            if (b390Var.emit(bVar, this) == y5bVar) {
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
