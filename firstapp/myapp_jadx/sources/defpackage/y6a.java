package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import eightbitlab.com.blurview.BlurView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y6a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y6a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        djh djhVar;
        ConstraintLayout constraintLayout;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Window window = (Window) obj;
                if (window != null) {
                    window.setGravity(48);
                }
                break;
            case 1:
                final u6j u6jVar = (u6j) obj;
                c9i0 c9i0Var = u6jVar.i;
                if (!u6jVar.v0) {
                    u6jVar.v0 = true;
                    Path[] pathArr = u6jVar.y0;
                    if (pathArr[3] == null) {
                        pathArr[0] = u6jVar.h1(0.0f, 0.215f, true);
                        pathArr[1] = u6jVar.h1(0.095f, 0.31f, false);
                        pathArr[2] = u6jVar.h1(0.19f, 0.405f, true);
                        pathArr[3] = u6jVar.h1(0.285f, 0.5f, false);
                    }
                    if (!u6jVar.S0) {
                        u6jVar.S0 = true;
                        int i2 = c9i0Var.b / 3;
                        e activity = u6jVar.getActivity();
                        if (activity != null && !activity.isFinishing()) {
                            u6jVar.T0 = new ConstraintLayout(activity);
                        }
                        ConstraintLayout constraintLayout2 = u6jVar.T0;
                        if (constraintLayout2 != null) {
                            constraintLayout2.setLayoutParams(new ConstraintLayout.LayoutParams(c9i0Var.a, i2));
                        }
                        ConstraintLayout constraintLayout3 = u6jVar.T0;
                        if (constraintLayout3 != null) {
                            constraintLayout3.setId(View.generateViewId());
                        }
                        ConstraintLayout constraintLayout4 = u6jVar.T0;
                        if (constraintLayout4 != null) {
                            constraintLayout4.setX(0.0f);
                        }
                        ConstraintLayout constraintLayout5 = u6jVar.T0;
                        if (constraintLayout5 != null) {
                            constraintLayout5.setY(c9i0Var.b - i2);
                        }
                        for (int i3 = 0; i3 < 10; i3++) {
                            AppCompatImageView appCompatImageViewI1 = u6jVar.i1(i3, true);
                            if (appCompatImageViewI1 != null && (constraintLayout = u6jVar.T0) != null) {
                                constraintLayout.addView(appCompatImageViewI1);
                            }
                        }
                        r750.d(u6jVar.t0(), new Function0() { // from class: g5j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                djh djhVar2;
                                u6j u6jVar2 = u6jVar;
                                ConstraintLayout constraintLayout6 = u6jVar2.T0;
                                if (constraintLayout6 != null && (djhVar2 = u6jVar2.b) != null) {
                                    djhVar2.e.d.addView(constraintLayout6);
                                }
                                return Unit.a;
                            }
                        });
                    }
                    if (u6jVar.getActivity() != null && !u6jVar.X0) {
                        u6jVar.X0 = true;
                        ej5.c(o8i0.d(u6jVar.t0()), null, null, new l7j(u6jVar, null), 3);
                    }
                    LinearInterpolator linearInterpolator = new LinearInterpolator();
                    djh djhVar2 = u6jVar.b;
                    AppCompatImageView appCompatImageView = djhVar2 != null ? djhVar2.e.e : null;
                    Property property = View.ROTATION;
                    final ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatImageView, (Property<AppCompatImageView, Float>) property, 0.0f, 8.0f, 0.0f);
                    objectAnimatorOfFloat.setRepeatCount(-1);
                    objectAnimatorOfFloat.setInterpolator(linearInterpolator);
                    objectAnimatorOfFloat.setDuration(4000L);
                    djh djhVar3 = u6jVar.b;
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(djhVar3 != null ? djhVar3.e.f : null, u6jVar.r0, 0.0f, 3.0f, -3.0f, 0.0f);
                    objectAnimatorOfFloat2.setRepeatCount(-1);
                    objectAnimatorOfFloat2.setInterpolator(linearInterpolator);
                    objectAnimatorOfFloat2.setDuration(6000L);
                    djh djhVar4 = u6jVar.b;
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(djhVar4 != null ? djhVar4.e.f : null, (Property<AppCompatImageView, Float>) property, 0.0f, 4.0f, 0.0f);
                    objectAnimatorOfFloat3.setRepeatCount(-1);
                    objectAnimatorOfFloat3.setInterpolator(linearInterpolator);
                    objectAnimatorOfFloat3.setDuration(6000L);
                    final AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat3);
                    djh djhVar5 = u6jVar.b;
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(djhVar5 != null ? djhVar5.e.i : null, u6jVar.q0, 0.0f, 4.0f, -4.0f, 0.0f);
                    objectAnimatorOfFloat4.setRepeatCount(-1);
                    objectAnimatorOfFloat4.setInterpolator(linearInterpolator);
                    objectAnimatorOfFloat4.setDuration(6000L);
                    djh djhVar6 = u6jVar.b;
                    ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(djhVar6 != null ? djhVar6.e.i : null, (Property<AppCompatImageView, Float>) property, 0.0f, 9.0f, 0.0f);
                    objectAnimatorOfFloat5.setRepeatCount(-1);
                    objectAnimatorOfFloat5.setInterpolator(linearInterpolator);
                    objectAnimatorOfFloat5.setDuration(6000L);
                    final AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat4);
                    r750.d(u6jVar.t0(), new Function0() { // from class: t6j
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            objectAnimatorOfFloat.start();
                            animatorSet.start();
                            animatorSet2.start();
                            return Unit.a;
                        }
                    });
                    djh djhVar7 = u6jVar.b;
                    u6jVar.w0 = djhVar7 != null ? djhVar7.y.b.getHeight() : 0;
                    a6h a6hVar = u6jVar.C0;
                    o8j o8jVarT0 = u6jVar.t0();
                    int iB = ycv.b(c9i0Var.c);
                    if (iB < 1) {
                        iB = 1;
                    }
                    a6hVar.getClass();
                    a6hVar.a = o8jVarT0;
                    a6hVar.b = iB;
                    u6jVar.K0 = Math.min(c9i0Var.c, c9i0Var.d) * 0.95f;
                    djh djhVar8 = u6jVar.b;
                    u6jVar.L0 = djhVar8 != null ? djhVar8.w.H.getWidth() : 0;
                    djh djhVar9 = u6jVar.b;
                    ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(djhVar9 != null ? djhVar9.w.i : null, (Property<AppCompatImageView, Float>) property, 0.0f, 359.0f);
                    u6jVar.P0 = objectAnimatorOfFloat6;
                    if (objectAnimatorOfFloat6 != null) {
                        objectAnimatorOfFloat6.setDuration(15000L);
                    }
                    ObjectAnimator objectAnimator = u6jVar.P0;
                    if (objectAnimator != null) {
                        objectAnimator.setStartDelay(0L);
                    }
                    ObjectAnimator objectAnimator2 = u6jVar.P0;
                    if (objectAnimator2 != null) {
                        objectAnimator2.setRepeatCount(1);
                    }
                    ObjectAnimator objectAnimator3 = u6jVar.N0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.setStartDelay(0L);
                    }
                    ObjectAnimator objectAnimator4 = u6jVar.N0;
                    if (objectAnimator4 != null) {
                        objectAnimator4.setRepeatCount(0);
                    }
                    ObjectAnimator objectAnimator5 = u6jVar.N0;
                    if (objectAnimator5 != null) {
                        objectAnimator5.setDuration(800L);
                    }
                    ObjectAnimator objectAnimator6 = u6jVar.O0;
                    if (objectAnimator6 != null) {
                        objectAnimator6.setStartDelay(0L);
                    }
                    ObjectAnimator objectAnimator7 = u6jVar.O0;
                    if (objectAnimator7 != null) {
                        objectAnimator7.setRepeatCount(0);
                    }
                    ObjectAnimator objectAnimator8 = u6jVar.O0;
                    if (objectAnimator8 != null) {
                        objectAnimator8.setDuration(800L);
                    }
                    u6jVar.Q0.setDuration(800L);
                    u6jVar.R0.setDuration(800L);
                    try {
                        djh djhVar10 = u6jVar.b;
                        if (djhVar10 != null) {
                            ConstraintLayout constraintLayout6 = djhVar10.D;
                            e activity2 = u6jVar.getActivity();
                            if (activity2 != null && (djhVar = u6jVar.b) != null) {
                                BlurView blurView = djhVar.b;
                                ha20 ha20VarB = blurView.b(constraintLayout6, new a850(activity2));
                                ha20VarB.e(true);
                                ha20VarB.a = 2.0f;
                                blurView.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                                blurView.setClipToOutline(true);
                            }
                        }
                        Unit unit = Unit.a;
                        break;
                    } catch (Exception unused) {
                    }
                    djh djhVar11 = u6jVar.b;
                    if (djhVar11 != null && (layoutParams3 = djhVar11.E.getLayoutParams()) != null) {
                        layoutParams3.width = (int) (c9i0Var.c * 260.0f);
                    }
                    djh djhVar12 = u6jVar.b;
                    if (djhVar12 != null && (layoutParams2 = djhVar12.f.b.getLayoutParams()) != null) {
                        layoutParams2.width = (int) (c9i0Var.c * 50.0f);
                    }
                    djh djhVar13 = u6jVar.b;
                    if (djhVar13 != null && (layoutParams = djhVar13.f.b.getLayoutParams()) != null) {
                        layoutParams.height = (int) (c9i0Var.c * 50.0f);
                    }
                }
                break;
            default:
                zy10 zy10Var = (zy10) obj;
                zt50 zt50Var = zy10Var.b;
                zy10Var.r0(zt50Var != null ? zt50Var.z : null, zt50Var != null ? zt50Var.R : null, zy10Var.u0);
                break;
        }
        return Unit.a;
    }
}
