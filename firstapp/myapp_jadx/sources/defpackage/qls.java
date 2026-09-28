package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class qls {
    public final Context a;
    public final ems b;
    public final Handler c;
    public boolean d;
    public nls e;

    public qls(Context context, ems emsVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        context.getClass();
        emsVar.getClass();
        this.a = context;
        this.b = emsVar;
        this.c = handler;
        this.d = true;
    }

    public final void a() {
        ems emsVar = this.b;
        float fA = zch0.a(this.a, 36) * emsVar.d.getChildCount();
        ImageView imageView = emsVar.b;
        boolean z = this.d;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "translationX", z ? 0.0f : -fA, z ? -fA : 0.0f);
        LinearLayout linearLayout = emsVar.d;
        boolean z2 = this.d;
        float f = z2 ? fA : 0.0f;
        if (z2) {
            fA = 0.0f;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(linearLayout, "translationX", f, fA);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(300L);
        animatorSet.start();
        this.d = !this.d;
    }
}
