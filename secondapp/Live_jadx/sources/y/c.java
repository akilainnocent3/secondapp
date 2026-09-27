package y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class c extends Dialog {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f145649c = 250;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f145650d = 150;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f145651b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f145652b;

        public a(boolean z10) {
            this.f145652b = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f145652b) {
                return;
            }
            c.super.dismiss();
        }
    }

    public c(Context context, View view) {
        super(context);
        this.f145651b = view;
    }

    public final void b(boolean z10) {
        float f10 = z10 ? 0.0f : 1.0f;
        float f11 = z10 ? 1.0f : 0.0f;
        long j10 = z10 ? 250L : 150L;
        this.f145651b.setScaleX(f10);
        this.f145651b.setScaleY(f10);
        this.f145651b.animate().scaleX(f11).scaleY(f11).setDuration(j10).setInterpolator(new r3.c()).setListener(new a(z10)).start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        b(false);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // android.app.Dialog
    public void show() {
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        b(true);
        super.show();
    }
}
