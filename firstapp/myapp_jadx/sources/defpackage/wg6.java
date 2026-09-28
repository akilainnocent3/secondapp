package defpackage;

import android.view.animation.Animation;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class wg6 implements Animation.AnimationListener {
    public final /* synthetic */ zg6 a;
    public final /* synthetic */ xg6.a b;
    public final /* synthetic */ xg6 c;

    public wg6(xg6 xg6Var, zg6 zg6Var, xg6.a aVar) {
        this.c = xg6Var;
        this.a = zg6Var;
        this.b = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        zg6 zg6Var = this.a;
        int size = (zg6Var.b + 1) % zg6Var.a.markets.get(0).outcomes.size();
        ArrayList arrayList = this.c.a;
        xg6.a aVar = this.b;
        ((zg6) arrayList.get(aVar.getBindingAdapterPosition())).b = size;
        xg6.i(aVar, zg6Var);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
