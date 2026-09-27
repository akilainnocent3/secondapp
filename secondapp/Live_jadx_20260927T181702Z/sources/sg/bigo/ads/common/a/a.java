package sg.bigo.ads.common.a;

import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;

/* JADX INFO: loaded from: classes7.dex */
public class a extends TranslateAnimation implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f132856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f132857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f132858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f132859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f132860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f132861f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Animation.AnimationListener f132862g;

    public a(float f10) {
        super(0.0f, 0.0f, 0.0f, f10);
    }

    @Override // android.view.animation.TranslateAnimation, android.view.animation.Animation
    public final void applyTransformation(float f10, Transformation transformation) {
        Transformation transformation2 = new Transformation();
        super.applyTransformation(f10, transformation2);
        Matrix matrix = transformation2.getMatrix();
        Matrix matrix2 = transformation != null ? transformation.getMatrix() : null;
        if (matrix == null || matrix2 == null) {
            return;
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        fArr[2] = fArr[2] - this.f132861f;
        fArr[5] = fArr[5] - this.f132859d;
        matrix2.setValues(fArr);
        a(fArr[2], fArr[5], this.f132856a, this.f132857b);
    }

    @Override // android.view.animation.TranslateAnimation, android.view.animation.Animation
    public void initialize(int i10, int i11, int i12, int i13) {
        super.initialize(i10, i11, i12, i13);
        super.setAnimationListener(this);
        this.f132856a = i10;
        this.f132857b = i11;
    }

    public void onAnimationEnd(Animation animation) {
        Animation.AnimationListener animationListener = this.f132862g;
        if (animationListener != null) {
            animationListener.onAnimationEnd(animation);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        this.f132861f = this.f132860e;
        this.f132859d = this.f132858c;
        Animation.AnimationListener animationListener = this.f132862g;
        if (animationListener != null) {
            animationListener.onAnimationRepeat(animation);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        Animation.AnimationListener animationListener = this.f132862g;
        if (animationListener != null) {
            animationListener.onAnimationStart(animation);
        }
    }

    @Override // android.view.animation.Animation
    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.f132862g = animationListener;
    }

    public a(float f10, float f11) {
        super(1, 0.0f, 1, 0.0f, 1, f10, 1, f11);
    }

    public void a(float f10, float f11, int i10, int i11) {
    }
}
