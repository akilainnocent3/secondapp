package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.sporty.android.common.uievent.a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.register.presentation.br.BrRegistrationSuccessfulScreenKt$BrRegistrationSuccessfulBottomSheet$1$1", f = "BrRegistrationSuccessfulScreen.kt", l = {77}, m = "invokeSuspend", v = 2)
public final class z85 extends tje0 implements gaj<v5b, a, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ a b;
    public final /* synthetic */ v3a0 c;
    public final /* synthetic */ Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z85(v3a0 v3a0Var, Context context, v1b<? super z85> v1bVar) {
        super(3, v1bVar);
        this.c = v3a0Var;
        this.d = context;
    }

    @Override // defpackage.gaj
    public final Object invoke(v5b v5bVar, a aVar, v1b<? super Unit> v1bVar) {
        z85 z85Var = new z85(this.c, this.d, v1bVar);
        z85Var.b = aVar;
        return z85Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        a aVar = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            boolean z = aVar instanceof a.m;
            Context context = this.d;
            if (z) {
                j3a0 j3a0Var = (j3a0) ((x5a0) this.c.b).getValue();
                if (j3a0Var != null) {
                    j3a0Var.dismiss();
                }
                String strG = ((a.m) aVar).a.g(context);
                k3a0 k3a0Var = k3a0.a;
                this.b = null;
                this.a = 1;
                if (v3a0.b(this.c, strG, null, true, k3a0Var, this, 2) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (aVar instanceof a.n) {
                    Toast.makeText(context, ((a.n) aVar).a.g(context), 0).show();
                }
                Unit unit = Unit.a;
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
