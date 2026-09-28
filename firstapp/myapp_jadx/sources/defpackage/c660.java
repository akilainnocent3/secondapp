package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.rush.view.RushFragment", f = "RushFragment.kt", l = {4673}, m = "setDynamicImagesAsDrawable", v = 1)
public final class c660 extends x1b {
    public View a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l560 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c660(l560 l560Var, x1b x1bVar) {
        super(x1bVar);
        this.c = l560Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a1(null, null, this);
    }
}
