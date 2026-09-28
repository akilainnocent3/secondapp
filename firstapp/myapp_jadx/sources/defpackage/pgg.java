package defpackage;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.evenodd.views.fragments.EvenOddFragment", f = "EvenOddFragment.kt", l = {3252}, m = "setDynamicImagesAsBitmap", v = 1)
public final class pgg extends x1b {
    public ImageView a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fgg c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgg(fgg fggVar, x1b x1bVar) {
        super(x1bVar);
        this.c = fggVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.J0(null, null, this);
    }
}
