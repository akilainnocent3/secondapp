package defpackage;

import android.view.animation.TranslateAnimation;
import com.sportybet.plugin.swipebet.widget.CustomCardView;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ug6 implements CustomCardView.a {
    public final /* synthetic */ xg6 a;
    public final /* synthetic */ zg6 b;
    public final /* synthetic */ xg6.a c;

    public /* synthetic */ ug6(xg6 xg6Var, zg6 zg6Var, xg6.a aVar) {
        this.a = xg6Var;
        this.b = zg6Var;
        this.c = aVar;
    }

    public final void a() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setDuration(200L);
        translateAnimation.setFillAfter(false);
        xg6 xg6Var = this.a;
        zg6 zg6Var = this.b;
        xg6.a aVar = this.c;
        translateAnimation.setAnimationListener(new wg6(xg6Var, zg6Var, aVar));
        aVar.v.startAnimation(translateAnimation);
    }
}
