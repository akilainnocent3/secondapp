package defpackage;

import com.sporty.android.core.model.security.biometric.CryptoPurpose;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.biometric.presentation.verification.BioAuthVerificationViewModel$prepareAuthContext$1", f = "BioAuthVerificationViewModel.kt", l = {89}, m = "invokeSuspend", v = 2)
public final class ab4 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ cb4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab4(cb4 cb4Var, v1b<? super ab4> v1bVar) {
        super(2, v1bVar);
        this.b = cb4Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ab4(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ab4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.a;
        cb4 cb4Var = this.b;
        try {
            if (i == 0) {
                uj50.b(obj);
                oc4 oc4Var = cb4Var.a;
                String phoneNumber = cb4Var.b.getPhoneNumber();
                phoneNumber.getClass();
                CryptoPurpose cryptoPurpose = CryptoPurpose.Encryption;
                this.a = 1;
                obj = oc4Var.a(phoneNumber, cryptoPurpose, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            nc4 nc4Var = (nc4) obj;
            wwd0 wwd0Var = cb4Var.d;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, ya4.a((ya4) value, nc4Var.b, 0L, false, 6)));
        } catch (Exception e) {
            itf0.a.d("Error preparing auth context: " + e, new Object[0]);
        }
        return Unit.a;
    }
}
