package com.sportygames.spinmatch.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.spinmatch.model.response.MatchPlaceBetResponse;
import defpackage.bmy;
import defpackage.c0d;
import defpackage.ej5;
import defpackage.f6j0;
import defpackage.fse;
import defpackage.g4c;
import defpackage.gku;
import defpackage.h5e;
import defpackage.hkd;
import defpackage.ib5;
import defpackage.j1b;
import defpackage.nw50;
import defpackage.pfd;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.w5b;
import defpackage.y5b;
import defpackage.ypa0;
import java.security.SecureRandom;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/sportygames/spinmatch/components/WheelLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/sportygames/spinmatch/model/response/MatchPlaceBetResponse;", "matchPlaceBetResponse", "Lypa0;", "soundViewModel", "", "setPlaceBetResponse", "(Lcom/sportygames/spinmatch/model/response/MatchPlaceBetResponse;Lypa0;)V", "Lf6j0;", "F", "Lf6j0;", "getBinding", "()Lf6j0;", "setBinding", "(Lf6j0;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WheelLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public f6j0 binding;
    public float G;
    public float H;
    public final j1b I;

    @c0d(c = "com.sportygames.spinmatch.components.WheelLayout$setPlaceBetResponse$1", f = "WheelLayout.kt", l = {85}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ RotateAnimation c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RotateAnimation rotateAnimation, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = rotateAnimation;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return WheelLayout.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(2900L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            f6j0 binding = WheelLayout.this.getBinding();
            if (binding != null) {
                binding.e.startAnimation(this.c);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.spinmatch.components.WheelLayout$setPlaceBetResponse$2", f = "WheelLayout.kt", l = {90}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ RotateAnimation c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RotateAnimation rotateAnimation, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = rotateAnimation;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return WheelLayout.this.new b(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(2900L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            f6j0 binding = WheelLayout.this.getBinding();
            if (binding != null) {
                binding.v.startAnimation(this.c);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.spinmatch.components.WheelLayout$setPlaceBetResponse$3", f = "WheelLayout.kt", l = {107}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return WheelLayout.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(2050L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            WheelLayout wheelLayout = WheelLayout.this;
            f6j0 binding = wheelLayout.getBinding();
            if (binding != null) {
                binding.d.startAnimation(AnimationUtils.loadAnimation(wheelLayout.getContext(), R.anim.rotate_last_left_anim));
            }
            f6j0 binding2 = wheelLayout.getBinding();
            if (binding2 != null) {
                binding2.i.startAnimation(AnimationUtils.loadAnimation(wheelLayout.getContext(), R.anim.rotate_last_right_anim));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WheelLayout(Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        context.getClass();
        pfd pfdVar = fse.a;
        this.I = w5b.a(gku.a);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.wheel_layout, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.add_money;
        TextView textView = (TextView) h5e.a(R.id.add_money, viewInflate);
        if (textView != null) {
            i = R.id.guideline;
            if (((Guideline) h5e.a(R.id.guideline, viewInflate)) != null) {
                i = R.id.layout;
                if (((ConstraintLayout) h5e.a(R.id.layout, viewInflate)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    i = R.id.left_bg;
                    ImageView imageView = (ImageView) h5e.a(R.id.left_bg, viewInflate);
                    if (imageView != null) {
                        i = R.id.left_pin;
                        ImageView imageView2 = (ImageView) h5e.a(R.id.left_pin, viewInflate);
                        if (imageView2 != null) {
                            i = R.id.left_wheel;
                            ImageView imageView3 = (ImageView) h5e.a(R.id.left_wheel, viewInflate);
                            if (imageView3 != null) {
                                i = R.id.right_bg;
                                ImageView imageView4 = (ImageView) h5e.a(R.id.right_bg, viewInflate);
                                if (imageView4 != null) {
                                    i = R.id.right_pin;
                                    ImageView imageView5 = (ImageView) h5e.a(R.id.right_pin, viewInflate);
                                    if (imageView5 != null) {
                                        i = R.id.right_wheel;
                                        ImageView imageView6 = (ImageView) h5e.a(R.id.right_wheel, viewInflate);
                                        if (imageView6 != null) {
                                            i = R.id.spin_kit_wallet;
                                            SpinKitView spinKitView = (SpinKitView) h5e.a(R.id.spin_kit_wallet, viewInflate);
                                            if (spinKitView != null) {
                                                i = R.id.text_balance;
                                                TextView textView2 = (TextView) h5e.a(R.id.text_balance, viewInflate);
                                                if (textView2 != null) {
                                                    i = R.id.wallet_image;
                                                    if (((AppCompatImageView) h5e.a(R.id.wallet_image, viewInflate)) != null) {
                                                        this.binding = new f6j0(constraintLayout, textView, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, spinKitView, textView2);
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void E() {
        RotateAnimation rotateAnimation = new RotateAnimation(this.G, 0.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setFillAfter(true);
        g4c g4cVar = g4c.f;
        rotateAnimation.setInterpolator(g4cVar);
        rotateAnimation.setDuration(0L);
        RotateAnimation rotateAnimation2 = new RotateAnimation(this.H, 0.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation2.setFillAfter(true);
        rotateAnimation2.setInterpolator(g4cVar);
        rotateAnimation2.setDuration(0L);
        f6j0 f6j0Var = this.binding;
        if (f6j0Var != null) {
            f6j0Var.e.startAnimation(rotateAnimation);
        }
        f6j0 f6j0Var2 = this.binding;
        if (f6j0Var2 != null) {
            f6j0Var2.v.startAnimation(rotateAnimation2);
        }
    }

    public final f6j0 getBinding() {
        return this.binding;
    }

    public final void setBinding(f6j0 f6j0Var) {
        this.binding = f6j0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e4  */
    public final void setPlaceBetResponse(MatchPlaceBetResponse matchPlaceBetResponse, ypa0 soundViewModel) {
        String colour;
        double dDoubleValue;
        double d;
        double dDoubleValue2;
        String colour2;
        matchPlaceBetResponse.getClass();
        soundViewModel.getClass();
        List<Double> list = nw50.a;
        MatchPlaceBetResponse.Wheel1Draw wheel1Draw = matchPlaceBetResponse.getWheel1Draw();
        String str = "";
        if (wheel1Draw == null || (colour = wheel1Draw.getColour()) == null) {
            colour = "";
        }
        SecureRandom secureRandom = new SecureRandom();
        switch (colour) {
            case "orange":
                List<Double> list2 = nw50.c;
                dDoubleValue = list2.get(secureRandom.nextInt(list2.size())).doubleValue();
                break;
            case "yellow":
                List<Double> list3 = nw50.b;
                dDoubleValue = list3.get(secureRandom.nextInt(list3.size())).doubleValue();
                break;
            case "blue":
                List<Double> list4 = nw50.a;
                dDoubleValue = list4.get(secureRandom.nextInt(list4.size())).doubleValue();
                break;
            case "grey":
                List<Double> list5 = nw50.f;
                dDoubleValue = list5.get(secureRandom.nextInt(list5.size())).doubleValue();
                break;
            case "pink":
                List<Double> list6 = nw50.e;
                dDoubleValue = list6.get(secureRandom.nextInt(list6.size())).doubleValue();
                break;
            case "green":
                List<Double> list7 = nw50.d;
                dDoubleValue = list7.get(secureRandom.nextInt(list7.size())).doubleValue();
                break;
            default:
                dDoubleValue = 0.0d;
                break;
        }
        float f = 1447.0f + ((float) dDoubleValue);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, f, 1, 0.5f, 1, 0.5f);
        this.G = f;
        rotateAnimation.setFillAfter(true);
        g4c g4cVar = g4c.f;
        rotateAnimation.setInterpolator(g4cVar);
        rotateAnimation.setDuration(2500L);
        float f2 = this.G - 5.0f;
        RotateAnimation rotateAnimation2 = new RotateAnimation(this.G, f2, 1, 0.5f, 1, 0.5f);
        this.G = f2;
        rotateAnimation2.setFillAfter(true);
        rotateAnimation2.setInterpolator(g4cVar);
        rotateAnimation2.setDuration(1000L);
        MatchPlaceBetResponse.Wheel1Draw wheel2Draw = matchPlaceBetResponse.getWheel2Draw();
        if (wheel2Draw != null && (colour2 = wheel2Draw.getColour()) != null) {
            str = colour2;
        }
        SecureRandom secureRandom2 = new SecureRandom();
        switch (str) {
            case "orange":
                List<Integer> list8 = nw50.i;
                dDoubleValue2 = list8.get(secureRandom2.nextInt(list8.size())).doubleValue();
                d = dDoubleValue2 * 14.4d;
                break;
            case "yellow":
                List<Integer> list9 = nw50.h;
                dDoubleValue2 = list9.get(secureRandom2.nextInt(list9.size())).doubleValue();
                d = dDoubleValue2 * 14.4d;
                break;
            case "blue":
                List<Integer> list10 = nw50.g;
                dDoubleValue2 = list10.get(secureRandom2.nextInt(list10.size())).doubleValue();
                d = dDoubleValue2 * 14.4d;
                break;
            case "grey":
                List<Integer> list11 = nw50.l;
                dDoubleValue2 = list11.get(secureRandom2.nextInt(list11.size())).doubleValue();
                d = dDoubleValue2 * 14.4d;
                break;
            case "pink":
                List<Integer> list12 = nw50.k;
                dDoubleValue2 = list12.get(secureRandom2.nextInt(list12.size())).doubleValue();
                d = dDoubleValue2 * 14.4d;
                break;
            case "green":
                List<Integer> list13 = nw50.j;
                dDoubleValue2 = list13.get(secureRandom2.nextInt(list13.size())).doubleValue();
                d = dDoubleValue2 * 14.4d;
                break;
            default:
                d = 0.0d;
                break;
        }
        float f3 = (-1446.0f) - ((float) d);
        RotateAnimation rotateAnimation3 = new RotateAnimation(0.0f, f3, 1, 0.5f, 1, 0.5f);
        this.H = f3;
        rotateAnimation3.setFillAfter(true);
        rotateAnimation3.setInterpolator(g4cVar);
        rotateAnimation3.setDuration(2500L);
        float f4 = this.H + 5.0f;
        RotateAnimation rotateAnimation4 = new RotateAnimation(this.H, f4, 1, 0.5f, 1, 0.5f);
        this.H = f4;
        rotateAnimation4.setFillAfter(true);
        rotateAnimation4.setInterpolator(g4cVar);
        rotateAnimation4.setDuration(1000L);
        String string = getContext().getString(R.string.spin_sound);
        string.getClass();
        soundViewModel.A1(3200L, string);
        f6j0 f6j0Var = this.binding;
        if (f6j0Var != null) {
            f6j0Var.e.startAnimation(rotateAnimation);
        }
        a aVar = new a(rotateAnimation2, null);
        j1b j1bVar = this.I;
        ej5.c(j1bVar, null, null, aVar, 3);
        f6j0 f6j0Var2 = this.binding;
        if (f6j0Var2 != null) {
            f6j0Var2.v.startAnimation(rotateAnimation3);
        }
        ej5.c(j1bVar, null, null, new b(rotateAnimation4, null), 3);
        f6j0 f6j0Var3 = this.binding;
        if (f6j0Var3 != null) {
            f6j0Var3.d.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.rotate_left_pin));
        }
        f6j0 f6j0Var4 = this.binding;
        if (f6j0Var4 != null) {
            f6j0Var4.i.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.rotate_right_pin));
        }
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new c(null), 3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WheelLayout(Context context) {
        this(context, null);
        context.getClass();
    }
}
