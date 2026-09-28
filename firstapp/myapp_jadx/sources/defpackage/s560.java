package defpackage;

import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.rush.view.RushFragment", f = "RushFragment.kt", l = {4100}, m = "cashAddRemoveAnimation", v = 1)
public final class s560 extends x1b {
    public TextView a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l560 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s560(l560 l560Var, x1b x1bVar) {
        super(x1bVar);
        this.c = l560Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.n0(null, 0.0d, null, this);
    }
}
