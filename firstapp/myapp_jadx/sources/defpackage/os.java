package defpackage;

import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class os implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ os(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                umz umzVar = ys.a;
                return cbd.a;
            default:
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(1000L);
                alphaAnimation.setFillAfter(true);
                animationSet.addAnimation(alphaAnimation);
                return animationSet;
        }
    }
}
