package defpackage;

import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class zy4 implements Function0 {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ zy4() {
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(1000L);
                alphaAnimation.setFillAfter(true);
                animationSet.addAnimation(alphaAnimation);
                return animationSet;
            default:
                return Unit.a;
        }
    }

    public /* synthetic */ zy4(vad0 vad0Var) {
    }
}
