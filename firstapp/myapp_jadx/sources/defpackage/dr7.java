package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.a;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class dr7 extends f6g {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final wq7 j;
    public final xq7 k;
    public AnimatorSet l;
    public ValueAnimator m;

    /* JADX WARN: Type inference failed for: r0v0, types: [wq7] */
    /* JADX WARN: Type inference failed for: r0v1, types: [xq7] */
    public dr7(a aVar) {
        super(aVar);
        this.j = new View.OnClickListener() { // from class: wq7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dr7 dr7Var = this.a;
                EditText editText = dr7Var.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                dr7Var.p();
            }
        };
        this.k = new View.OnFocusChangeListener() { // from class: xq7
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                dr7 dr7Var = this.a;
                dr7Var.s(dr7Var.t());
            }
        };
        this.e = bbv.c(aVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f = bbv.c(aVar.getContext(), R.attr.motionDurationShort3, 150);
        this.g = f6w.c(aVar.getContext(), R.attr.motionEasingLinearInterpolator, dj0.a);
        this.h = f6w.c(aVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, dj0.d);
    }

    @Override // defpackage.f6g
    public final void a() {
        if (this.b.E != null) {
            return;
        }
        s(t());
    }

    @Override // defpackage.f6g
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.f6g
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.f6g
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // defpackage.f6g
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // defpackage.f6g
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // defpackage.f6g
    public final void l(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(t());
    }

    @Override // defpackage.f6g
    public final void o(boolean z) {
        if (this.b.E == null) {
            return;
        }
        s(z);
    }

    @Override // defpackage.f6g
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.h);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ar7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = this.a.d;
                checkableImageButton.setScaleX(fFloatValue);
                checkableImageButton.setScaleY(fFloatValue);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i = this.e;
        valueAnimatorOfFloat2.setDuration(i);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yq7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.l.addListener(new br7(this));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yq7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new cr7(this));
    }

    @Override // defpackage.f6g
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: zq7
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.s(true);
                }
            });
        }
    }

    public final void s(boolean z) {
        boolean z2 = this.b.d() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
