package defpackage;

import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spinmatch.views.SpinMatchFragment", f = "SpinMatchFragment.kt", l = {2141}, m = "cashAddRemoveAnimation", v = 1)
public final class lab0 extends x1b {
    public TextView a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kab0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lab0(kab0 kab0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = kab0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.m0(null, 0.0d, null, this);
    }
}
