package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.multifactorauth.MFAViewModel$checkTwoFactorAuthPromptStatus$1", f = "MFAViewModel.kt", l = {352, 354}, m = "invokeSuspend", v = 2)
public final class qcu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public boolean a;
    public int b;
    public final /* synthetic */ ocu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qcu(ocu ocuVar, v1b<? super qcu> v1bVar) {
        super(2, v1bVar);
        this.c = ocuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qcu(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qcu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z;
        y5b y5bVar = y5b.a;
        int i = this.b;
        ocu ocuVar = this.c;
        if (i == 0) {
            uj50.b(obj);
            mgb0 mgb0Var = ocuVar.c;
            this.b = 1;
            obj = mgb0Var.isTwoFactorAuthEnabled(this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            uj50.b(obj);
        } else {
            if (i != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.a;
            uj50.b(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (!z && !zBooleanValue) {
            ocuVar.E.a(u9w.b.a);
        }
        return Unit.a;
        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
        wm20<Boolean> wm20VarA = ocuVar.v.a();
        Boolean bool = Boolean.FALSE;
        this.a = zBooleanValue2;
        this.b = 2;
        Object objE = wm20VarA.e(this, bool);
        if (objE != y5bVar) {
            obj = objE;
            z = zBooleanValue2;
            boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
            if (!z) {
                ocuVar.E.a(u9w.b.a);
            }
            return Unit.a;
        }
        return y5bVar;
    }
}
