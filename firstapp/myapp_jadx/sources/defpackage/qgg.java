package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.evenodd.views.fragments.EvenOddFragment", f = "EvenOddFragment.kt", l = {3256}, m = "setDynamicImagesAsDrawable", v = 1)
public final class qgg extends x1b {
    public ConstraintLayout a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fgg c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgg(fgg fggVar, x1b x1bVar) {
        super(x1bVar);
        this.c = fggVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.K0(null, null, this);
    }
}
