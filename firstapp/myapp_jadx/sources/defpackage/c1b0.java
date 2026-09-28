package defpackage;

import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spin2win.view.Spin2WinFragment", f = "Spin2WinFragment.kt", l = {3872}, m = "cashAddRemoveAnimation", v = 1)
public final class c1b0 extends x1b {
    public TextView a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a1b0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1b0(a1b0 a1b0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = a1b0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.n0(null, 0.0d, null, this);
    }
}
