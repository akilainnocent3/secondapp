package defpackage;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spin2win.view.Spin2WinFragment$playWalletAnimation$2", f = "Spin2WinFragment.kt", l = {2360}, m = "invokeSuspend", v = 1)
public final class j1b0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ a1b0 b;
    public final /* synthetic */ zp40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1b0(a1b0 a1b0Var, zp40 zp40Var, v1b<? super j1b0> v1bVar) {
        super(2, v1bVar);
        this.b = a1b0Var;
        this.c = zp40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j1b0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j1b0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        iq80 binding;
        y5b y5bVar = y5b.a;
        int i = this.a;
        TextView textView = null;
        if (i == 0) {
            uj50.b(obj);
            a1b0 a1b0Var = this.b;
            wxi wxiVar = a1b0Var.v;
            if (wxiVar != null && (binding = wxiVar.z.getBinding()) != null) {
                textView = binding.d;
            }
            double dAbs = Math.abs(this.c.a);
            this.a = 1;
            if (a1b0Var.n0(textView, dAbs, "up", this) == y5bVar) {
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
