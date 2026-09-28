package defpackage;

import android.animation.ValueAnimator;
import androidx.camera.view.ScreenFlashView;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class no70 implements h8n.i {
    public float a;
    public ValueAnimator b;
    public final /* synthetic */ ScreenFlashView c;

    public no70(ScreenFlashView screenFlashView) {
        this.c = screenFlashView;
    }

    @Override // h8n.i
    public final void a(long j, h8n.j jVar) {
        pgt.a("ScreenFlashView", "ScreenFlash#apply");
        final ScreenFlashView screenFlashView = this.c;
        this.a = screenFlashView.getBrightness();
        screenFlashView.setBrightness(1.0f);
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Objects.requireNonNull(jVar);
        mo70 mo70Var = new mo70(jVar);
        pgt.a("ScreenFlashView", "animateToFullOpacity");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(screenFlashView.getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: lo70
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                int i = ScreenFlashView.c;
                pgt.a("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                screenFlashView.setAlpha(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat.addListener(new oo70(mo70Var));
        valueAnimatorOfFloat.start();
        this.b = valueAnimatorOfFloat;
    }

    @Override // h8n.i
    public final void clear() {
        pgt.a("ScreenFlashView", "ScreenFlash#clear");
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.b = null;
        }
        ScreenFlashView screenFlashView = this.c;
        screenFlashView.setAlpha(0.0f);
        screenFlashView.setBrightness(this.a);
    }
}
