package com.sportygames.spin2win.components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.spin2win.model.response.Spin2WinPlaceBetResponse;
import defpackage.bmy;
import defpackage.ej5;
import defpackage.fse;
import defpackage.g9i0;
import defpackage.gku;
import defpackage.h5e;
import defpackage.hq80;
import defpackage.j5b0;
import defpackage.k5b0;
import defpackage.l8j0;
import defpackage.lya0;
import defpackage.o5b0;
import defpackage.pfd;
import defpackage.r6i0;
import defpackage.tk30;
import defpackage.w5b;
import defpackage.wcl;
import defpackage.ymn;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u0012\u0010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/sportygames/spin2win/components/Spin2WinWheel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/sportygames/spin2win/model/response/Spin2WinPlaceBetResponse;", "response", "", "setPlaceBetApiResponse", "(Lcom/sportygames/spin2win/model/response/Spin2WinPlaceBetResponse;)V", "Lkotlin/Function1;", "", "listener", "setAnimationEndListener", "(Lkotlin/jvm/functions/Function1;)V", "setWheelAnimationListener", "Lhq80;", "F", "Lhq80;", "getBinding", "()Lhq80;", "setBinding", "(Lhq80;)V", "binding", "", "K", "Z", "isWheelSpinning", "()Z", "setWheelSpinning", "(Z)V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Spin2WinWheel extends ConstraintLayout {
    public static final /* synthetic */ int L = 0;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public hq80 binding;
    public Function1<? super String, Unit> G;
    public Function1<? super String, Unit> H;
    public RotateAnimation I;
    public Spin2WinPlaceBetResponse J;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public boolean isWheelSpinning;

    public static final class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
            Spin2WinWheel spin2WinWheel = Spin2WinWheel.this;
            Spin2WinPlaceBetResponse spin2WinPlaceBetResponse = spin2WinWheel.J;
            if (spin2WinPlaceBetResponse == null) {
                RotateAnimation rotateAnimation = spin2WinWheel.I;
                if (rotateAnimation != null) {
                    rotateAnimation.setInterpolator(new LinearInterpolator());
                }
                RotateAnimation rotateAnimation2 = spin2WinWheel.I;
                if (rotateAnimation2 != null) {
                    rotateAnimation2.setDuration(2000L);
                }
                RotateAnimation rotateAnimation3 = spin2WinWheel.I;
                if (rotateAnimation3 != null) {
                    rotateAnimation3.setRepeatCount(-1);
                }
                hq80 binding = spin2WinWheel.getBinding();
                if (binding != null) {
                    binding.B.setAnimation(spin2WinWheel.I);
                }
                hq80 binding2 = spin2WinWheel.getBinding();
                if (binding2 != null) {
                    binding2.B.startAnimation(spin2WinWheel.I);
                    return;
                }
                return;
            }
            Integer houseDraw = spin2WinPlaceBetResponse.getHouseDraw();
            RotateAnimation rotateAnimation4 = new RotateAnimation(0.0f, 1080.0f + lya0.b(Integer.valueOf(houseDraw != null ? houseDraw.intValue() : 0)), 1, 0.5f, 1, 0.5f);
            spin2WinWheel.I = rotateAnimation4;
            rotateAnimation4.setFillAfter(true);
            RotateAnimation rotateAnimation5 = spin2WinWheel.I;
            if (rotateAnimation5 != null) {
                rotateAnimation5.setInterpolator(new DecelerateInterpolator());
            }
            RotateAnimation rotateAnimation6 = spin2WinWheel.I;
            if (rotateAnimation6 != null) {
                rotateAnimation6.setDuration(4000L);
            }
            RotateAnimation rotateAnimation7 = spin2WinWheel.I;
            if (rotateAnimation7 != null) {
                rotateAnimation7.setAnimationListener(new o5b0(spin2WinWheel, spin2WinPlaceBetResponse));
            }
            hq80 hq80Var = spin2WinWheel.binding;
            if (hq80Var != null) {
                hq80Var.B.startAnimation(spin2WinWheel.I);
            }
            spin2WinWheel.J = null;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            Spin2WinWheel spin2WinWheel = Spin2WinWheel.this;
            Function1<? super String, Unit> function1 = spin2WinWheel.H;
            if (function1 == null) {
                Intrinsics.n("wheelAnimationState");
                throw null;
            }
            function1.invoke("START");
            spin2WinWheel.setWheelSpinning(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Spin2WinWheel(Context context, AttributeSet attributeSet) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ViewGroup.LayoutParams layoutParams4;
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sg_spin2_win_wheel, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.bg_house_draw;
        ShapeableImageView shapeableImageView = (ShapeableImageView) h5e.a(R.id.bg_house_draw, viewInflate);
        if (shapeableImageView != null) {
            i = R.id.circle_2;
            if (((ShapeableImageView) h5e.a(R.id.circle_2, viewInflate)) != null) {
                i = R.id.container_frame;
                if (((FrameLayout) h5e.a(R.id.container_frame, viewInflate)) != null) {
                    i = R.id.ic_you_win;
                    ImageView imageView = (ImageView) h5e.a(R.id.ic_you_win, viewInflate);
                    if (imageView != null) {
                        i = R.id.layout_gift_amt;
                        LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.layout_gift_amt, viewInflate);
                        if (linearLayout != null) {
                            i = R.id.left_amt;
                            TextView textView = (TextView) h5e.a(R.id.left_amt, viewInflate);
                            if (textView != null) {
                                i = R.id.lose_text_1;
                                TextView textView2 = (TextView) h5e.a(R.id.lose_text_1, viewInflate);
                                if (textView2 != null) {
                                    i = R.id.lose_text_2;
                                    TextView textView3 = (TextView) h5e.a(R.id.lose_text_2, viewInflate);
                                    if (textView3 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        i = R.id.pin;
                                        TextView textView4 = (TextView) h5e.a(R.id.pin, viewInflate);
                                        if (textView4 != null) {
                                            i = R.id.right_amt;
                                            TextView textView5 = (TextView) h5e.a(R.id.right_amt, viewInflate);
                                            if (textView5 != null) {
                                                i = R.id.tv_house_draw;
                                                TextView textView6 = (TextView) h5e.a(R.id.tv_house_draw, viewInflate);
                                                if (textView6 != null) {
                                                    i = R.id.tv_win_amount_fbg;
                                                    TextView textView7 = (TextView) h5e.a(R.id.tv_win_amount_fbg, viewInflate);
                                                    if (textView7 != null) {
                                                        i = R.id.tv_win_amount_normal;
                                                        TextView textView8 = (TextView) h5e.a(R.id.tv_win_amount_normal, viewInflate);
                                                        if (textView8 != null) {
                                                            i = R.id.wheel;
                                                            ImageView imageView2 = (ImageView) h5e.a(R.id.wheel, viewInflate);
                                                            if (imageView2 != null) {
                                                                i = R.id.wheel_container;
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.wheel_container, viewInflate);
                                                                if (constraintLayout2 != null) {
                                                                    i = R.id.wheel_layout_shadow;
                                                                    CardView cardView = (CardView) h5e.a(R.id.wheel_layout_shadow, viewInflate);
                                                                    if (cardView != null) {
                                                                        i = R.id.wheel_layout_shadow_2;
                                                                        CardView cardView2 = (CardView) h5e.a(R.id.wheel_layout_shadow_2, viewInflate);
                                                                        if (cardView2 != null) {
                                                                            i = R.id.white_circle;
                                                                            ShapeableImageView shapeableImageView2 = (ShapeableImageView) h5e.a(R.id.white_circle, viewInflate);
                                                                            if (shapeableImageView2 != null) {
                                                                                i = R.id.white_line_1;
                                                                                ImageView imageView3 = (ImageView) h5e.a(R.id.white_line_1, viewInflate);
                                                                                if (imageView3 != null) {
                                                                                    i = R.id.white_line_2;
                                                                                    ImageView imageView4 = (ImageView) h5e.a(R.id.white_line_2, viewInflate);
                                                                                    if (imageView4 != null) {
                                                                                        i = R.id.white_line_3;
                                                                                        ImageView imageView5 = (ImageView) h5e.a(R.id.white_line_3, viewInflate);
                                                                                        if (imageView5 != null) {
                                                                                            i = R.id.white_line_4;
                                                                                            if (((ImageView) h5e.a(R.id.white_line_4, viewInflate)) != null) {
                                                                                                i = R.id.white_line_5;
                                                                                                ImageView imageView6 = (ImageView) h5e.a(R.id.white_line_5, viewInflate);
                                                                                                if (imageView6 != null) {
                                                                                                    i = R.id.white_line_6;
                                                                                                    ImageView imageView7 = (ImageView) h5e.a(R.id.white_line_6, viewInflate);
                                                                                                    if (imageView7 != null) {
                                                                                                        i = R.id.win_amount_fbg;
                                                                                                        ImageView imageView8 = (ImageView) h5e.a(R.id.win_amount_fbg, viewInflate);
                                                                                                        if (imageView8 != null) {
                                                                                                            i = R.id.win_amount_normal;
                                                                                                            ImageView imageView9 = (ImageView) h5e.a(R.id.win_amount_normal, viewInflate);
                                                                                                            if (imageView9 != null) {
                                                                                                                i = R.id.you_lose_layout;
                                                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.you_lose_layout, viewInflate);
                                                                                                                if (constraintLayout3 != null) {
                                                                                                                    i = R.id.you_win_layout;
                                                                                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.you_win_layout, viewInflate);
                                                                                                                    if (constraintLayout4 != null) {
                                                                                                                        this.binding = new hq80(constraintLayout, shapeableImageView, imageView, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, imageView2, constraintLayout2, cardView, cardView2, shapeableImageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, constraintLayout3, constraintLayout4);
                                                                                                                        if (attributeSet != null) {
                                                                                                                            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.u);
                                                                                                                            typedArrayObtainStyledAttributes.getClass();
                                                                                                                            typedArrayObtainStyledAttributes.recycle();
                                                                                                                        }
                                                                                                                        F();
                                                                                                                        hq80 hq80Var = this.binding;
                                                                                                                        if (hq80Var != null) {
                                                                                                                            hq80Var.C.setLayoutParams(new ConstraintLayout.LayoutParams((int) J(E(41.0f)), (int) J(E(41.0f))));
                                                                                                                        }
                                                                                                                        int iJ = (int) J(E(41.0f));
                                                                                                                        int iJ2 = (int) J(E(41.0f));
                                                                                                                        hq80 hq80Var2 = this.binding;
                                                                                                                        if (hq80Var2 != null && (layoutParams4 = hq80Var2.D.getLayoutParams()) != null) {
                                                                                                                            layoutParams4.height = iJ2;
                                                                                                                        }
                                                                                                                        hq80 hq80Var3 = this.binding;
                                                                                                                        if (hq80Var3 != null && (layoutParams3 = hq80Var3.D.getLayoutParams()) != null) {
                                                                                                                            layoutParams3.width = iJ;
                                                                                                                        }
                                                                                                                        hq80 hq80Var4 = this.binding;
                                                                                                                        if (hq80Var4 != null) {
                                                                                                                            hq80Var4.D.setRadius(iJ / 2);
                                                                                                                        }
                                                                                                                        hq80 hq80Var5 = this.binding;
                                                                                                                        if (hq80Var5 != null) {
                                                                                                                            hq80Var5.D.requestLayout();
                                                                                                                        }
                                                                                                                        int i2 = (int) (((double) iJ) * 0.3d);
                                                                                                                        int i3 = (int) (((double) iJ2) * 0.3d);
                                                                                                                        hq80 hq80Var6 = this.binding;
                                                                                                                        if (hq80Var6 != null && (layoutParams2 = hq80Var6.E.getLayoutParams()) != null) {
                                                                                                                            layoutParams2.height = i3;
                                                                                                                        }
                                                                                                                        hq80 hq80Var7 = this.binding;
                                                                                                                        if (hq80Var7 != null && (layoutParams = hq80Var7.E.getLayoutParams()) != null) {
                                                                                                                            layoutParams.width = i2;
                                                                                                                        }
                                                                                                                        hq80 hq80Var8 = this.binding;
                                                                                                                        if (hq80Var8 != null) {
                                                                                                                            hq80Var8.E.setRadius(i2 / 2);
                                                                                                                        }
                                                                                                                        hq80 hq80Var9 = this.binding;
                                                                                                                        if (hq80Var9 != null) {
                                                                                                                            hq80Var9.E.requestLayout();
                                                                                                                        }
                                                                                                                        pfd pfdVar = fse.a;
                                                                                                                        wcl wclVar = gku.a;
                                                                                                                        ej5.c(w5b.a(wclVar), null, null, new j5b0(this, null), 3);
                                                                                                                        ej5.c(w5b.a(wclVar), null, null, new k5b0(this, null), 3);
                                                                                                                        return;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final float E(float f) {
        int i;
        Display defaultDisplay;
        ymn ymnVarG;
        Rect bounds;
        Insets insets;
        Context context = getContext();
        Object systemService = context != null ? context.getSystemService("window") : null;
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        int iHeight = 0;
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = windowManager != null ? windowManager.getCurrentWindowMetrics() : null;
            WindowInsets windowInsets = currentWindowMetrics != null ? currentWindowMetrics.getWindowInsets() : null;
            int i2 = (windowInsets == null || (insets = windowInsets.getInsets(WindowInsets.Type.statusBars())) == null) ? 0 : insets.top;
            if (currentWindowMetrics != null && (bounds = currentWindowMetrics.getBounds()) != null) {
                iHeight = bounds.height();
            }
            i = iHeight - i2;
        } else {
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            l8j0 l8j0VarA = r6i0.e.a(this);
            if (l8j0VarA != null && (ymnVarG = l8j0VarA.a.g(1)) != null) {
                iHeight = ymnVarG.b;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            i = displayMetrics.heightPixels - iHeight;
        }
        return (f / 100.0f) * (i / getContext().getResources().getDisplayMetrics().density);
    }

    public final void F() {
        hq80 hq80Var = this.binding;
        if (hq80Var != null) {
            hq80Var.O.setScaleX(0.0f);
        }
        hq80 hq80Var2 = this.binding;
        if (hq80Var2 != null) {
            hq80Var2.O.setScaleY(0.0f);
        }
        hq80 hq80Var3 = this.binding;
        if (hq80Var3 != null) {
            hq80Var3.N.setScaleX(0.0f);
        }
        hq80 hq80Var4 = this.binding;
        if (hq80Var4 != null) {
            hq80Var4.N.setScaleY(0.0f);
        }
        hq80 hq80Var5 = this.binding;
        if (hq80Var5 != null) {
            hq80Var5.F.setAlpha(1.0f);
        }
        hq80 hq80Var6 = this.binding;
        if (hq80Var6 != null) {
            hq80Var6.E.setAlpha(1.0f);
        }
        hq80 hq80Var7 = this.binding;
        if (hq80Var7 != null) {
            hq80Var7.F.setScaleX(1.0f);
        }
        hq80 hq80Var8 = this.binding;
        if (hq80Var8 != null) {
            hq80Var8.E.setScaleX(1.0f);
        }
        hq80 hq80Var9 = this.binding;
        if (hq80Var9 != null) {
            hq80Var9.F.setScaleY(1.0f);
        }
        hq80 hq80Var10 = this.binding;
        if (hq80Var10 != null) {
            hq80Var10.E.setScaleY(1.0f);
        }
        hq80 hq80Var11 = this.binding;
        if (hq80Var11 != null) {
            hq80Var11.b.setScaleX(0.0f);
        }
        hq80 hq80Var12 = this.binding;
        if (hq80Var12 != null) {
            hq80Var12.b.setScaleY(0.0f);
        }
        hq80 hq80Var13 = this.binding;
        if (hq80Var13 != null) {
            hq80Var13.y.setScaleX(0.0f);
        }
        hq80 hq80Var14 = this.binding;
        if (hq80Var14 != null) {
            hq80Var14.y.setScaleY(0.0f);
        }
        hq80 hq80Var15 = this.binding;
        if (hq80Var15 != null) {
            hq80Var15.A.setText("");
        }
        hq80 hq80Var16 = this.binding;
        if (hq80Var16 != null) {
            hq80Var16.z.setText("");
        }
        hq80 hq80Var17 = this.binding;
        if (hq80Var17 != null) {
            hq80Var17.B.setAlpha(1.0f);
        }
        hq80 hq80Var18 = this.binding;
        if (hq80Var18 != null) {
            hq80Var18.v.setVisibility(0);
        }
        hq80 hq80Var19 = this.binding;
        if (hq80Var19 != null) {
            hq80Var19.b.clearAnimation();
        }
        hq80 hq80Var20 = this.binding;
        if (hq80Var20 != null) {
            hq80Var20.y.clearAnimation();
        }
        hq80 hq80Var21 = this.binding;
        if (hq80Var21 != null) {
            hq80Var21.B.clearAnimation();
        }
    }

    public final void G(ImageView imageView) {
        float fJ = (J(E(20.0f)) - (imageView != null ? imageView.getWidth() : 0)) + 50.0f;
        if (imageView != null) {
            imageView.setPivotX(0.0f);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "translationX", 0.0f, fJ);
        objectAnimatorOfFloat.setDuration(4000L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.start();
    }

    public final void H(ImageView imageView) {
        float fJ = (J(E(40.0f)) - (imageView != null ? imageView.getWidth() : 0)) + 350.0f;
        if (imageView != null) {
            imageView.setPivotX(0.0f);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "translationX", 0.0f, fJ);
        objectAnimatorOfFloat.setDuration(4000L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.start();
    }

    public final void I() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 1080.0f + lya0.b(0), 1, 0.5f, 1, 0.5f);
        this.I = rotateAnimation;
        rotateAnimation.setFillAfter(true);
        RotateAnimation rotateAnimation2 = this.I;
        if (rotateAnimation2 != null) {
            rotateAnimation2.setInterpolator(new AccelerateInterpolator());
        }
        RotateAnimation rotateAnimation3 = this.I;
        if (rotateAnimation3 != null) {
            rotateAnimation3.setDuration(3000L);
        }
        RotateAnimation rotateAnimation4 = this.I;
        if (rotateAnimation4 != null) {
            rotateAnimation4.setRepeatCount(-1);
        }
        RotateAnimation rotateAnimation5 = this.I;
        if (rotateAnimation5 != null) {
            rotateAnimation5.setAnimationListener(new a());
        }
        hq80 hq80Var = this.binding;
        if (hq80Var != null) {
            hq80Var.B.startAnimation(this.I);
        }
    }

    public final float J(float f) {
        return TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    public final hq80 getBinding() {
        return this.binding;
    }

    public final void setAnimationEndListener(Function1<? super String, Unit> listener) {
        listener.getClass();
        this.G = listener;
    }

    public final void setBinding(hq80 hq80Var) {
        this.binding = hq80Var;
    }

    public final void setPlaceBetApiResponse(Spin2WinPlaceBetResponse response) {
        if (getContext() != null) {
            this.J = response;
        }
    }

    public final void setWheelAnimationListener(Function1<? super String, Unit> listener) {
        listener.getClass();
        this.H = listener;
    }

    public final void setWheelSpinning(boolean z) {
        this.isWheelSpinning = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Spin2WinWheel(Context context) {
        this(context, null);
        context.getClass();
    }
}
