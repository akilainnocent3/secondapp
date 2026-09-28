package defpackage;

import com.sporty.android.core.model.dateofbirth.DobVerificationRequest;
import com.sporty.android.core.model.dateofbirth.DobVerificationResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.dateofbirth.domain.usecase.VerifyDobUseCase$invoke$1", f = "VerifyDobUseCase.kt", l = {19}, m = "invokeSuspend", v = 2)
public final class a0i0 extends tje0 implements Function1<v1b<? super DobVerificationResponse>, Object> {
    public int a;
    public final /* synthetic */ b0i0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0i0(b0i0 b0i0Var, String str, String str2, v1b<? super a0i0> v1bVar) {
        super(1, v1bVar);
        this.b = b0i0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new a0i0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super DobVerificationResponse> v1bVar) {
        return ((a0i0) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        sve sveVar = this.b.a;
        DobVerificationRequest dobVerificationRequest = new DobVerificationRequest(this.c, this.d);
        this.a = 1;
        Object objC = sveVar.c(dobVerificationRequest, this);
        return objC == y5bVar ? y5bVar : objC;
    }
}
