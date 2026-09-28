package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import com.sportygames.pocketrocket.component.MultiplierContainer;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class fqw implements Runnable {
    public final /* synthetic */ MultiplierContainer a;
    public final /* synthetic */ View b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ long e;

    public fqw(MultiplierContainer multiplierContainer, View view, float f, float f2, long j) {
        this.a = multiplierContainer;
        this.b = view;
        this.c = f;
        this.d = f2;
        this.e = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = MultiplierContainer.k0;
        MultiplierContainer multiplierContainer = this.a;
        LinkedHashMap linkedHashMap = multiplierContainer.b0;
        final View view = this.b;
        Pair pair = (Pair) linkedHashMap.get(view);
        if (pair != null) {
            ValueAnimator valueAnimator = (ValueAnimator) pair.a;
            ObjectAnimator objectAnimator = (ObjectAnimator) pair.b;
            valueAnimator.cancel();
            objectAnimator.cancel();
        }
        final float f = this.c;
        long j = (long) ((1000.0f * f) / this.d);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-100.0f, f);
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(j);
        }
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setRepeatCount(-1);
        }
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bqw
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    int i2 = MultiplierContainer.k0;
                    float fFloatValue = ((Float) flk.a(valueAnimator2)).floatValue();
                    View view2 = view;
                    view2.setTranslationY(fFloatValue);
                    if (fFloatValue >= f) {
                        view2.setTranslationY(0.0f);
                    }
                }
            });
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.1f, 0.6f);
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setDuration(j);
        }
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setRepeatCount(-1);
        }
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setRepeatMode(2);
        }
        linkedHashMap.put(view, new Pair(valueAnimatorOfFloat, objectAnimatorOfFloat));
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.start();
        }
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.start();
        }
        Handler handler = multiplierContainer.O;
        if (handler != null) {
            handler.postDelayed(this, this.e);
        }
    }
}
