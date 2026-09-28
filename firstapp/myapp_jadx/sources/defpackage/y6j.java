package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntFragment", f = "FruitHuntFragment.kt", l = {1960}, m = "dropletView", v = 1)
public final class y6j extends x1b {
    public ConstraintLayout a;
    public e b;
    public /* synthetic */ Object c;
    public final /* synthetic */ u6j d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6j(u6j u6jVar, x1b x1bVar) {
        super(x1bVar);
        this.d = u6jVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b1(null, false, this);
    }
}
