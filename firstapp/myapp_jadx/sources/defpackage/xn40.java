package defpackage;

import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.redblack.views.fragments.RedBlackFragment", f = "RedBlackFragment.kt", l = {2860}, m = "setDynamicImagesAsBitmap", v = 1)
public final class xn40 extends x1b {
    public AppCompatImageView a;
    public /* synthetic */ Object b;
    public final /* synthetic */ nn40 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn40(nn40 nn40Var, x1b x1bVar) {
        super(x1bVar);
        this.c = nn40Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.M0(null, null, this);
    }
}
