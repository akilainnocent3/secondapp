package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.feature.register.revamp.ui.RegisterRevampVerifyScreenKt$rememberPendingSnackbarHost$1$1", f = "RegisterRevampVerifyScreen.kt", l = {160}, m = "invokeSuspend", v = 2)
public final class tv40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ v3a0 c;
    public final /* synthetic */ ytw<Boolean> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv40(String str, v3a0 v3a0Var, ytw<Boolean> ytwVar, v1b<? super tv40> v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = v3a0Var;
        this.d = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tv40(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tv40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            if (this.b != null) {
                ytw<Boolean> ytwVar = this.d;
                if (!ytwVar.getValue().booleanValue()) {
                    ytwVar.setValue(Boolean.TRUE);
                    this.a = 1;
                    if (v3a0.b(this.c, this.b, null, false, null, this, 14) == y5bVar) {
                        return y5bVar;
                    }
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        return Unit.a;
    }
}
