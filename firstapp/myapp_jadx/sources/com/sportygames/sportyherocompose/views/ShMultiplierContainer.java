package com.sportygames.sportyherocompose.views;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.esotericsoftware.spine.android.SpineView;
import com.esotericsoftware.spine.android.b;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import com.sportygames.crash.remote.models.MultiplierResponse;
import com.sportygames.sportyherocompose.views.ShMultiplierContainer;
import defpackage.c0d;
import defpackage.dgb;
import defpackage.dih;
import defpackage.dtp;
import defpackage.e6a;
import defpackage.ej5;
import defpackage.fse;
import defpackage.gku;
import defpackage.hkd;
import defpackage.ib5;
import defpackage.j1b;
import defpackage.op5;
import defpackage.op8;
import defpackage.pfd;
import defpackage.qu80;
import defpackage.r97;
import defpackage.r9n;
import defpackage.s4u;
import defpackage.tje0;
import defpackage.trw;
import defpackage.u6i0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.w5b;
import defpackage.wcl;
import defpackage.x5a0;
import defpackage.xo9;
import defpackage.y5b;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\fJ\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u000eJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%R$\u0010-\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00103\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u0010!R\"\u00107\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u0010!R\"\u0010;\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010/\u001a\u0004\b9\u00101\"\u0004\b:\u0010!R\"\u0010?\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010/\u001a\u0004\b=\u00101\"\u0004\b>\u0010!R\"\u0010C\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010/\u001a\u0004\bA\u00101\"\u0004\bB\u0010!R\"\u0010I\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010\fR$\u0010Q\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010Y\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010[\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010E\u001a\u0004\b[\u0010G\"\u0004\b\\\u0010\fR$\u0010d\u001a\u0004\u0018\u00010]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010h\u001a\u0004\u0018\u00010]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010_\u001a\u0004\bf\u0010a\"\u0004\bg\u0010c¨\u0006i"}, d2 = {"Lcom/sportygames/sportyherocompose/views/ShMultiplierContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "enabled", "", "setLowRamHeroMode", "(Z)V", "setAssets", "()V", "setXmasTheme", "hidden", "setRoundOverlayHidden", "setCoefficientsHiddenByVipSheet", "Lcom/sportygames/crash/remote/models/MultiplierResponse;", "s", "setMultiplier", "(Lcom/sportygames/crash/remote/models/MultiplierResponse;)V", "", "deviceHeight", "deviceWidth", "setNestedDimens", "(FF)V", "setSpine", "setValentineSpine", "", "visibility", "setMiniWaitingTextLayoutVisibility", "(I)V", "", "mDuration", "setSportyAnimations", "(J)V", "Lqu80;", "b", "Lqu80;", "getBinding", "()Lqu80;", "setBinding", "(Lqu80;)V", "binding", "c", "I", "getAnimDone", "()I", "setAnimDone", "animDone", "d", "getAnimStart", "setAnimStart", "animStart", "e", "getEndAnimDone", "setEndAnimDone", "endAnimDone", "f", "getOngoingStart", "setOngoingStart", "ongoingStart", "i", "getAnimstartInitial", "setAnimstartInitial", "animstartInitial", "v", "Z", "getTimerInProgress", "()Z", "setTimerInProgress", "timerInProgress", "Landroid/view/animation/TranslateAnimation;", "w", "Landroid/view/animation/TranslateAnimation;", "getTranslateAnimation", "()Landroid/view/animation/TranslateAnimation;", "setTranslateAnimation", "(Landroid/view/animation/TranslateAnimation;)V", "translateAnimation", "Landroid/view/animation/AlphaAnimation;", "z", "Landroid/view/animation/AlphaAnimation;", "getAlphaAnimation", "()Landroid/view/animation/AlphaAnimation;", "setAlphaAnimation", "(Landroid/view/animation/AlphaAnimation;)V", "alphaAnimation", "A", "isDestoyed", "setDestoyed", "Ljava/io/File;", "M", "Ljava/io/File;", "getAtlasName", "()Ljava/io/File;", "setAtlasName", "(Ljava/io/File;)V", "atlasName", "N", "getSkeletonName", "setSkeletonName", "skeletonName", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShMultiplierContainer extends LinearLayout {
    public static final /* synthetic */ int Q = 0;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public boolean isDestoyed;
    public boolean B;
    public boolean C;
    public j1b D;
    public int E;
    public final j1b F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public File atlasName;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public File skeletonName;
    public final StringBuilder O;
    public String P;
    public final Context a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public qu80 binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int animDone;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int animStart;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int endAnimDone;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int ongoingStart;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int animstartInitial;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean timerInProgress;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public TranslateAnimation translateAnimation;
    public com.esotericsoftware.spine.android.b y;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public AlphaAnimation alphaAnimation;

    @c0d(c = "com.sportygames.sportyherocompose.views.ShMultiplierContainer$setAssets$1", f = "ShMultiplierContainer.kt", l = {178}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public ImageView a;
        public int b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ShMultiplierContainer.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ImageView imageView;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                ShMultiplierContainer shMultiplierContainer = ShMultiplierContainer.this;
                qu80 binding = shMultiplierContainer.getBinding();
                if (binding != null) {
                    ImageView imageView2 = binding.O;
                    s4u<String, Bitmap> s4uVar = r9n.a;
                    Context context = shMultiplierContainer.a;
                    this.a = imageView2;
                    this.b = 1;
                    obj = r9n.c(this, context, "militao_idle_valentine_png");
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                    imageView = imageView2;
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            imageView = this.a;
            uj50.b(obj);
            imageView.setImageBitmap((Bitmap) obj);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportyherocompose.views.ShMultiplierContainer$setAssets$3", f = "ShMultiplierContainer.kt", l = {191}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public ImageView a;
        public int b;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.d = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ShMultiplierContainer.this.new b(this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0042  */
        /* JADX WARN: Code duplicated, block: B:19:0x0046  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ImageView imageView;
            qu80 binding;
            ShMultiplierContainer shMultiplierContainer = ShMultiplierContainer.this;
            Context context = shMultiplierContainer.a;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                qu80 binding2 = shMultiplierContainer.getBinding();
                if (binding2 != null) {
                    ImageView imageView2 = binding2.O;
                    s4u<String, Bitmap> s4uVar = r9n.a;
                    this.a = imageView2;
                    this.b = 1;
                    Object objC = r9n.c(this, context, this.d);
                    if (objC == y5bVar) {
                        return y5bVar;
                    }
                    obj = objC;
                    imageView = imageView2;
                }
                binding = shMultiplierContainer.getBinding();
                if (binding != null) {
                    binding.K.setImageDrawable(context != null ? context.getDrawable(R.drawable.clip_world_cup) : null);
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            imageView = this.a;
            uj50.b(obj);
            imageView.setImageBitmap((Bitmap) obj);
            binding = shMultiplierContainer.getBinding();
            if (binding != null) {
                binding.K.setImageDrawable(context != null ? context.getDrawable(R.drawable.clip_world_cup) : null);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportyherocompose.views.ShMultiplierContainer$setMultiplier$1", f = "ShMultiplierContainer.kt", l = {513}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ double c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(double d, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.c = d;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ShMultiplierContainer.this.new c(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Drawable drawable;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0 && i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            do {
                ShMultiplierContainer shMultiplierContainer = ShMultiplierContainer.this;
                int i2 = shMultiplierContainer.E;
                if (i2 <= 0) {
                    return Unit.a;
                }
                shMultiplierContainer.E = i2 - 100;
                if (shMultiplierContainer.J) {
                    qu80 binding = shMultiplierContainer.getBinding();
                    if (binding != null) {
                        binding.N.setProgress(shMultiplierContainer.E);
                    }
                    qu80 binding2 = shMultiplierContainer.getBinding();
                    if (binding2 != null && (drawable = binding2.K.getDrawable()) != null) {
                        drawable.setLevel((int) (((double) shMultiplierContainer.E) / this.c));
                    }
                } else {
                    qu80 binding3 = shMultiplierContainer.getBinding();
                    if (binding3 != null) {
                        binding3.M.setProgress(shMultiplierContainer.E);
                    }
                }
                qu80 binding4 = shMultiplierContainer.getBinding();
                if (binding4 != null) {
                    binding4.D.setProgress(shMultiplierContainer.E);
                }
                this.a = 1;
            } while (hkd.b(100L, this) != y5bVar);
            return y5bVar;
        }
    }

    @c0d(c = "com.sportygames.sportyherocompose.views.ShMultiplierContainer$setMultiplier$4", f = "ShMultiplierContainer.kt", l = {688}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ShMultiplierContainer.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            qu80 binding;
            ArrayList<androidx.constraintlayout.motion.widget.b.C0051b> definedTransitions;
            y5b y5bVar = y5b.a;
            int i = this.a;
            TranslateAnimation translateAnimation = null;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(1000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ShMultiplierContainer shMultiplierContainer = ShMultiplierContainer.this;
            if (!shMultiplierContainer.isDestoyed) {
                qu80 binding2 = shMultiplierContainer.getBinding();
                if (binding2 != null) {
                    binding2.c.setAlpha(0.0f);
                }
                qu80 binding3 = shMultiplierContainer.getBinding();
                if (binding3 != null) {
                    float x = binding3.c.getX();
                    qu80 binding4 = shMultiplierContainer.getBinding();
                    if (binding4 != null) {
                        float y = binding4.c.getY();
                        translateAnimation = new TranslateAnimation(x, x - 1050.0f, y, (-y) + 730.0f);
                    }
                }
                if (translateAnimation != null) {
                    translateAnimation.setDuration(1L);
                }
                qu80 binding5 = shMultiplierContainer.getBinding();
                if (binding5 != null) {
                    binding5.f.startAnimation(translateAnimation);
                }
                if (!shMultiplierContainer.isDestoyed && (binding = shMultiplierContainer.getBinding()) != null && (definedTransitions = binding.c.getDefinedTransitions()) != null) {
                    int size = definedTransitions.size();
                    int i2 = 0;
                    while (i2 < size) {
                        androidx.constraintlayout.motion.widget.b.C0051b c0051b = definedTransitions.get(i2);
                        i2++;
                        c0051b.a(0);
                        qu80 binding6 = shMultiplierContainer.getBinding();
                        if (binding6 != null) {
                            binding6.c.U();
                        }
                    }
                }
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportyherocompose.views.ShMultiplierContainer$setSpine$1$1", f = "ShMultiplierContainer.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ComposeView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComposeView composeView, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.b = composeView;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ShMultiplierContainer.this.new e(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ShMultiplierContainer shMultiplierContainer = ShMultiplierContainer.this;
            qu80 binding = shMultiplierContainer.getBinding();
            if ((binding != null ? binding.f.getParent() : null) == null) {
                qu80 binding2 = shMultiplierContainer.getBinding();
                if (binding2 != null) {
                    ComposeView composeView = binding2.f;
                    qu80 binding3 = shMultiplierContainer.getBinding();
                    if (binding3 != null) {
                        binding3.c.addView(composeView);
                    }
                    qu80 binding4 = shMultiplierContainer.getBinding();
                    if (binding4 != null) {
                        binding4.f.invalidate();
                    }
                    qu80 binding5 = shMultiplierContainer.getBinding();
                    if (binding5 != null) {
                        binding5.f.requestLayout();
                    }
                    com.esotericsoftware.spine.android.b bVar = shMultiplierContainer.y;
                    if (bVar != null && !bVar.d) {
                        bVar.d = true;
                    }
                }
            } else {
                u6i0.c cVar = u6i0.c.a;
                ComposeView composeView2 = this.b;
                composeView2.setViewCompositionStrategy(cVar);
                composeView2.setId(R.id.hero);
                composeView2.setContent(new op8(1087411007, new dih(shMultiplierContainer), true));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportyherocompose.views.ShMultiplierContainer$setSportyAnimations$2", f = "ShMultiplierContainer.kt", l = {979}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long b;
        public final /* synthetic */ ShMultiplierContainer c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j, ShMultiplierContainer shMultiplierContainer, v1b<? super f> v1bVar) {
            super(2, v1bVar);
            this.b = j;
            this.c = shMultiplierContainer;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new f(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(this.b, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ShMultiplierContainer shMultiplierContainer = this.c;
            if (!shMultiplierContainer.isDestoyed) {
                shMultiplierContainer.setAnimDone(1);
                Context context = shMultiplierContainer.a;
                if (context != null) {
                    AnimationSet animationSet = new AnimationSet(context, null);
                    AnimationSet animationSet2 = new AnimationSet(context, null);
                    shMultiplierContainer.setTranslateAnimation(new TranslateAnimation(2, 0.0f, 2, -0.13f, 2, 0.0f, 2, 0.1f));
                    shMultiplierContainer.setAlphaAnimation(new AlphaAnimation(1.0f, 0.0f));
                    animationSet.addAnimation(shMultiplierContainer.getAlphaAnimation());
                    animationSet.addAnimation(shMultiplierContainer.getTranslateAnimation());
                    animationSet2.addAnimation(shMultiplierContainer.getAlphaAnimation());
                    TranslateAnimation translateAnimation = shMultiplierContainer.getTranslateAnimation();
                    if (translateAnimation != null) {
                        translateAnimation.setRepeatCount(-1);
                    }
                    TranslateAnimation translateAnimation2 = shMultiplierContainer.getTranslateAnimation();
                    if (translateAnimation2 != null) {
                        translateAnimation2.setRepeatMode(1);
                    }
                    AlphaAnimation alphaAnimation = shMultiplierContainer.getAlphaAnimation();
                    if (alphaAnimation != null) {
                        alphaAnimation.setRepeatCount(-1);
                    }
                    AlphaAnimation alphaAnimation2 = shMultiplierContainer.getAlphaAnimation();
                    if (alphaAnimation2 != null) {
                        alphaAnimation2.setRepeatMode(1);
                    }
                    animationSet.setDuration(1000L);
                    animationSet2.setDuration(1000L);
                }
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportyherocompose.views.ShMultiplierContainer$setValentineSpine$1", f = "ShMultiplierContainer.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {

        @c0d(c = "com.sportygames.sportyherocompose.views.ShMultiplierContainer$setValentineSpine$1$2$1", f = "ShMultiplierContainer.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ ComposeView a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ComposeView composeView, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.a = composeView;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.a, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                u6i0.c cVar = u6i0.c.a;
                ComposeView composeView = this.a;
                composeView.setViewCompositionStrategy(cVar);
                composeView.setId(R.id.valentine);
                composeView.setContent(xo9.a);
                return Unit.a;
            }
        }

        @c0d(c = "com.sportygames.sportyherocompose.views.ShMultiplierContainer$setValentineSpine$1$5", f = "ShMultiplierContainer.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ ShMultiplierContainer a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ShMultiplierContainer shMultiplierContainer, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.a = shMultiplierContainer;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.a, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                qu80 binding;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                ShMultiplierContainer shMultiplierContainer = this.a;
                Context context = shMultiplierContainer.a;
                if (context != null && (binding = shMultiplierContainer.getBinding()) != null) {
                    com.bumptech.glide.a.b(context).c(context).p(op5.c(op5.a, "militao_idle_valentine_png:sg_game_name", "")).M(binding.O);
                }
                return Unit.a;
            }
        }

        public g(v1b<? super g> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ShMultiplierContainer.this.new g(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ShMultiplierContainer shMultiplierContainer = ShMultiplierContainer.this;
            Context context = shMultiplierContainer.a;
            shMultiplierContainer.C = true;
            qu80 binding = shMultiplierContainer.getBinding();
            if ((binding != null ? binding.Y.getParent() : null) == null) {
                qu80 binding2 = shMultiplierContainer.getBinding();
                if (binding2 != null) {
                    ComposeView composeView = binding2.Y;
                    qu80 binding3 = shMultiplierContainer.getBinding();
                    if (binding3 != null) {
                        binding3.c.addView(composeView);
                    }
                    qu80 binding4 = shMultiplierContainer.getBinding();
                    if (binding4 != null) {
                        binding4.Y.setVisibility(0);
                    }
                    qu80 binding5 = shMultiplierContainer.getBinding();
                    if (binding5 != null) {
                        binding5.Y.invalidate();
                    }
                    qu80 binding6 = shMultiplierContainer.getBinding();
                    if (binding6 != null) {
                        binding6.Y.requestLayout();
                    }
                }
            } else {
                qu80 binding7 = shMultiplierContainer.getBinding();
                if (binding7 != null) {
                    ComposeView composeView2 = binding7.Y;
                    j1b j1bVar = shMultiplierContainer.F;
                    pfd pfdVar = fse.a;
                    ej5.c(j1bVar, gku.a, null, new a(composeView2, null), 2);
                }
            }
            qu80 binding8 = shMultiplierContainer.getBinding();
            if (binding8 != null) {
                binding8.M.setProgressDrawable(context != null ? context.getDrawable(R.drawable.sh_seek_bar_valentine) : null);
            }
            qu80 binding9 = shMultiplierContainer.getBinding();
            if (binding9 != null) {
                binding9.D.setProgressDrawable(context != null ? context.getDrawable(R.drawable.sh_seek_bar_valentine) : null);
            }
            pfd pfdVar2 = fse.a;
            ej5.c(w5b.a(gku.a), null, null, new b(shMultiplierContainer, null), 3);
            qu80 binding10 = shMultiplierContainer.getBinding();
            if (binding10 != null) {
                binding10.K.setImageDrawable(context != null ? context.getDrawable(R.drawable.clip_valentine) : null);
            }
            return Unit.a;
        }
    }

    public ShMultiplierContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context;
        this.binding = qu80.a(LayoutInflater.from(context), this);
        pfd pfdVar = fse.a;
        wcl wclVar = gku.a;
        this.D = w5b.a(wclVar);
        this.F = w5b.a(wclVar);
        this.L = "Encore-hero-christmas";
        if (context != null) {
            try {
                Object systemService = context.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                }
            } catch (Exception unused) {
            }
        }
        qu80 qu80Var = this.binding;
        if (qu80Var != null) {
            qu80Var.A.setScaleY(0.8f);
        }
        qu80 qu80Var2 = this.binding;
        if (qu80Var2 != null) {
            qu80Var2.A.setScaleX(0.8f);
        }
        if (this.J) {
            i();
        }
        this.O = new StringBuilder();
        this.P = "";
    }

    private final void setMiniWaitingTextLayoutVisibility(int visibility) {
        if (this.I && visibility == 0) {
            qu80 qu80Var = this.binding;
            if (qu80Var != null) {
                qu80Var.E.setVisibility(8);
                return;
            }
            return;
        }
        qu80 qu80Var2 = this.binding;
        if (qu80Var2 != null) {
            qu80Var2.E.setVisibility(visibility);
        }
    }

    private final void setSportyAnimations(long mDuration) {
        ArrayList<androidx.constraintlayout.motion.widget.b.C0051b> definedTransitions;
        try {
            if (this.J) {
                qu80 qu80Var = this.binding;
                if (qu80Var != null) {
                    qu80Var.c.setAlpha(1.0f);
                }
                qu80 qu80Var2 = this.binding;
                if (qu80Var2 != null && (definedTransitions = qu80Var2.c.getDefinedTransitions()) != null) {
                    int size = definedTransitions.size();
                    int i = 0;
                    while (i < size) {
                        androidx.constraintlayout.motion.widget.b.C0051b c0051b = definedTransitions.get(i);
                        i++;
                        c0051b.a((int) mDuration);
                    }
                }
                qu80 qu80Var3 = this.binding;
                if (qu80Var3 != null) {
                    qu80Var3.c.T();
                }
                ej5.c(this.F, null, null, new f(mDuration, this, null), 3);
            }
        } catch (Exception unused) {
        }
    }

    public final void a(final boolean z, final boolean z2, final File file, final File file2, final String str, final Function1<? super com.esotericsoftware.spine.android.b, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        str.getClass();
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-734848836);
        int i2 = i | (bVarI.b(z) ? 4 : 2) | (bVarI.b(z2) ? 32 : 16) | (bVarI.A(file) ? 256 : 128) | (bVarI.A(file2) ? 2048 : 1024) | (bVarI.M(str) ? 16384 : 8192) | (bVarI.A(function1) ? 131072 : 65536);
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            bVarI.C(-1815088623, bVarI.l(bVarI.l(bVarI.l(bVarI.l(str, Boolean.valueOf(z)), Boolean.valueOf(z2)), file != null ? file.getAbsolutePath() : null), file2 != null ? file2.getAbsolutePath() : null));
            boolean zA = bVarI.A(file) | bVarI.A(file2) | ((458752 & i2) == 131072) | ((i2 & 57344) == 16384);
            Object objY = bVarI.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: jt80
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        int i3 = ShMultiplierContainer.Q;
                        context.getClass();
                        return SpineView.a(file, file2, context, new b(new nt80(str, function1)));
                    }
                };
                bVarI.r(objY);
            }
            androidx.compose.ui.viewinterop.b.a((Function1) objY, null, null, bVarI, 0, 6);
            bVarI.X(false);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, z2, file, file2, str, function1, i) { // from class: lt80
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ File d;
                public final /* synthetic */ File e;
                public final /* synthetic */ String f;
                public final /* synthetic */ Function1 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    ((Integer) obj2).getClass();
                    int i3 = ShMultiplierContainer.Q;
                    this.a.a(this.b, this.c, this.d, this.e, this.f, this.i, aVar2, qj40.a(1));
                    return Unit.a;
                }
            };
        }
    }

    public final void b(String str) {
        int i;
        int i2;
        int length = str.length();
        if (length >= 13) {
            i = R.dimen._42ssp;
        } else if (length >= 12) {
            i = R.dimen._44ssp;
        } else {
            i = length >= 11 ? R.dimen._45ssp : R.dimen._50ssp;
        }
        if (length >= 13) {
            i2 = R.dimen._28ssp;
        } else if (length >= 12) {
            i2 = R.dimen._30ssp;
        } else {
            i2 = length >= 11 ? R.dimen._32ssp : R.dimen._35ssp;
        }
        float dimension = getResources().getDimension(i);
        qu80 qu80Var = this.binding;
        if (qu80Var != null) {
            qu80Var.b.setTextSize(0, dimension);
        }
        float dimension2 = getResources().getDimension(i2);
        qu80 qu80Var2 = this.binding;
        if (qu80Var2 != null) {
            qu80Var2.B.setTextSize(0, dimension2);
        }
    }

    public final void c() {
        if (this.I) {
            qu80 qu80Var = this.binding;
            if (qu80Var != null) {
                qu80Var.k0.setVisibility(8);
            }
            qu80 qu80Var2 = this.binding;
            if (qu80Var2 != null) {
                qu80Var2.l0.setVisibility(8);
            }
            qu80 qu80Var3 = this.binding;
            if (qu80Var3 != null) {
                qu80Var3.E.setVisibility(8);
            }
        }
    }

    public final void d() {
        qu80 qu80Var;
        qu80 qu80Var2 = this.binding;
        if ((qu80Var2 != null && qu80Var2.j0.getVisibility() == 8) || ((qu80Var = this.binding) != null && qu80Var.j0.getVisibility() == 4)) {
            qu80 qu80Var3 = this.binding;
            if (qu80Var3 != null) {
                qu80Var3.j0.setVisibility(0);
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(new LinearInterpolator());
            alphaAnimation.setDuration(500L);
            qu80 qu80Var4 = this.binding;
            if (qu80Var4 != null) {
                qu80Var4.j0.setAnimation(alphaAnimation);
            }
        }
        c();
    }

    public final void e() {
        qu80 qu80Var;
        qu80 qu80Var2;
        qu80 qu80Var3 = this.binding;
        if (((qu80Var3 != null && qu80Var3.m0.getVisibility() == 8) || ((qu80Var = this.binding) != null && qu80Var.m0.getVisibility() == 4)) && (qu80Var2 = this.binding) != null) {
            qu80Var2.m0.setVisibility(0);
        }
        c();
    }

    public final void f() {
        qu80 qu80Var = this.binding;
        if (qu80Var == null || qu80Var.j0.getVisibility() != 0) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setDuration(300L);
        qu80 qu80Var2 = this.binding;
        if (qu80Var2 != null) {
            qu80Var2.j0.setAnimation(alphaAnimation);
        }
        qu80 qu80Var3 = this.binding;
        if (qu80Var3 != null) {
            qu80Var3.j0.setVisibility(8);
        }
    }

    public final void g() {
        qu80 qu80Var;
        qu80 qu80Var2 = this.binding;
        if (qu80Var2 == null || qu80Var2.m0.getVisibility() != 0 || (qu80Var = this.binding) == null) {
            return;
        }
        qu80Var.m0.setVisibility(8);
    }

    public final AlphaAnimation getAlphaAnimation() {
        return this.alphaAnimation;
    }

    public final int getAnimDone() {
        return this.animDone;
    }

    public final int getAnimStart() {
        return this.animStart;
    }

    public final int getAnimstartInitial() {
        return this.animstartInitial;
    }

    public final File getAtlasName() {
        return this.atlasName;
    }

    public final qu80 getBinding() {
        return this.binding;
    }

    public final int getEndAnimDone() {
        return this.endAnimDone;
    }

    public final int getOngoingStart() {
        return this.ongoingStart;
    }

    public final File getSkeletonName() {
        return this.skeletonName;
    }

    public final boolean getTimerInProgress() {
        return this.timerInProgress;
    }

    public final TranslateAnimation getTranslateAnimation() {
        return this.translateAnimation;
    }

    public final void h() {
        qu80 qu80Var = this.binding;
        if (qu80Var != null) {
            qu80Var.j0.clearAnimation();
        }
        qu80 qu80Var2 = this.binding;
        if (qu80Var2 != null) {
            qu80Var2.m0.clearAnimation();
        }
        qu80 qu80Var3 = this.binding;
        if (qu80Var3 != null) {
            qu80Var3.E.clearAnimation();
        }
        qu80 qu80Var4 = this.binding;
        if (qu80Var4 != null) {
            qu80Var4.b.clearAnimation();
        }
        qu80 qu80Var5 = this.binding;
        if (qu80Var5 != null) {
            qu80Var5.B.clearAnimation();
        }
        qu80 qu80Var6 = this.binding;
        if (qu80Var6 != null) {
            qu80Var6.d.clearAnimation();
        }
        qu80 qu80Var7 = this.binding;
        if (qu80Var7 != null) {
            qu80Var7.K.clearAnimation();
        }
        qu80 qu80Var8 = this.binding;
        if (qu80Var8 != null) {
            qu80Var8.j0.setVisibility(8);
        }
        qu80 qu80Var9 = this.binding;
        if (qu80Var9 != null) {
            qu80Var9.m0.setVisibility(8);
        }
        qu80 qu80Var10 = this.binding;
        if (qu80Var10 != null) {
            qu80Var10.E.setVisibility(8);
        }
        j(8, 8);
        qu80 qu80Var11 = this.binding;
        if (qu80Var11 != null) {
            qu80Var11.d.setVisibility(8);
        }
        qu80 qu80Var12 = this.binding;
        if (qu80Var12 != null) {
            qu80Var12.K.setVisibility(4);
        }
    }

    public final void i() {
        float f2;
        Context context = this.a;
        if (context != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            float f3 = displayMetrics.heightPixels;
            float f4 = displayMetrics.widthPixels;
            if (f3 == 0.0f || f4 == 0.0f) {
                return;
            }
            float f5 = f3 / f4;
            if (f5 >= 2.0f) {
                f2 = 160.0f;
            } else {
                f2 = f5 >= 1.8f ? 125.0f : 120.0f;
            }
            int iApplyDimension = (int) TypedValue.applyDimension(1, f2, getResources().getDisplayMetrics());
            qu80 qu80Var = this.binding;
            MotionLayout motionLayout = qu80Var != null ? qu80Var.c : null;
            androidx.constraintlayout.widget.b bVarK = motionLayout != null ? motionLayout.K(R.id.start) : null;
            androidx.constraintlayout.widget.b bVarK2 = motionLayout != null ? motionLayout.K(R.id.end) : null;
            if (bVarK != null) {
                bVarK.l(R.id.hero, iApplyDimension);
            }
            if (bVarK != null) {
                bVarK.i(R.id.hero, iApplyDimension);
            }
            if (bVarK != null) {
                bVarK.b(motionLayout);
            }
            if (bVarK2 != null) {
                bVarK2.l(R.id.hero, iApplyDimension);
            }
            if (bVarK2 != null) {
                bVarK2.i(R.id.hero, iApplyDimension);
            }
            if (bVarK2 != null) {
                bVarK2.b(motionLayout);
            }
        }
    }

    public final void j(int i, int i2) {
        boolean z = this.I;
        qu80 qu80Var = this.binding;
        if (z) {
            if (qu80Var != null) {
                qu80Var.b.setVisibility(8);
            }
            qu80 qu80Var2 = this.binding;
            if (qu80Var2 != null) {
                qu80Var2.B.setVisibility(8);
                return;
            }
            return;
        }
        if (qu80Var != null) {
            qu80Var.b.setVisibility(i);
        }
        qu80 qu80Var3 = this.binding;
        if (qu80Var3 != null) {
            qu80Var3.B.setVisibility(i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    public final void k(boolean z) {
        qu80 qu80Var;
        float f2;
        qu80 qu80Var2;
        Integer numValueOf = Integer.valueOf(R.dimen._12ssp);
        Integer numValueOf2 = Integer.valueOf(R.dimen._13ssp);
        this.G = z;
        Context context = this.a;
        if (z) {
            if (this.J && (qu80Var2 = this.binding) != null) {
                qu80Var2.O.setVisibility(0);
            }
            if (Intrinsics.g(this.P, "ROUND_PRE_START")) {
                if (this.J) {
                    g();
                } else {
                    f();
                }
                qu80 qu80Var3 = this.binding;
                if (qu80Var3 != null) {
                    qu80Var3.d.setVisibility(8);
                }
            }
            if (Intrinsics.g(this.P, "ROUND_END_WAIT")) {
                qu80 qu80Var4 = this.binding;
                if (qu80Var4 != null) {
                    qu80Var4.d.setVisibility(0);
                }
                if (context != null) {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    f2 = 2.1f;
                    float f3 = displayMetrics.heightPixels / displayMetrics.widthPixels;
                    Map mapA = dtp.a(numValueOf2, "powering_up_font_size");
                    if (f3 >= 2.1f || f3 >= 2.0f) {
                        mapA = dtp.a(numValueOf2, "powering_up_font_size");
                    } else if (f3 >= 1.5f) {
                        mapA = dtp.a(numValueOf, "powering_up_font_size");
                    }
                    Resources resources = getResources();
                    Integer num = (Integer) mapA.get("powering_up_font_size");
                    float dimension = resources.getDimension(num != null ? num.intValue() : R.dimen._11ssp);
                    qu80 qu80Var5 = this.binding;
                    if (qu80Var5 != null) {
                        qu80Var5.e.setTextSize(0, dimension);
                    }
                } else {
                    f2 = 2.1f;
                }
            } else {
                f2 = 2.1f;
            }
            if (Intrinsics.g(this.P, "ROUND_WAITING")) {
                if (this.J) {
                    e();
                } else {
                    d();
                }
                if (context != null) {
                    DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                    float f4 = displayMetrics2.heightPixels / displayMetrics2.widthPixels;
                    Map mapA2 = dtp.a(numValueOf2, "powering_up_font_size");
                    if (f4 >= f2 || f4 >= 2.0f) {
                        mapA2 = dtp.a(numValueOf2, "powering_up_font_size");
                    } else if (f4 >= 1.5f) {
                        mapA2 = dtp.a(numValueOf, "powering_up_font_size");
                    }
                    Resources resources2 = getResources();
                    Integer num2 = (Integer) mapA2.get("powering_up_font_size");
                    float dimension2 = resources2.getDimension(num2 != null ? num2.intValue() : R.dimen._11ssp);
                    qu80 qu80Var6 = this.binding;
                    if (qu80Var6 != null) {
                        qu80Var6.I.setTextSize(0, dimension2);
                    }
                }
            }
            if (Intrinsics.g(this.P, "ROUND_ONGOING") || Intrinsics.g(this.P, "ROUND_END_WAIT")) {
                j(0, 8);
            }
            if (Intrinsics.g(this.P, "ROUND_ONGOING") || Intrinsics.g(this.P, "ROUND_PRE_START")) {
                setSportyAnimations(800L);
            }
            boolean z2 = this.J;
            qu80 qu80Var7 = this.binding;
            if (z2) {
                if (qu80Var7 != null) {
                    qu80Var7.K.setVisibility(0);
                }
            } else if (qu80Var7 != null) {
                qu80Var7.K.setVisibility(4);
            }
            qu80 qu80Var8 = this.binding;
            if (qu80Var8 != null) {
                qu80Var8.E.setVisibility(8);
            }
            setSpine();
        } else {
            qu80 qu80Var9 = this.binding;
            if (qu80Var9 != null) {
                qu80Var9.O.setVisibility(4);
            }
            if (this.J && (qu80Var = this.binding) != null) {
                qu80Var.c.setVisibility(4);
            }
            qu80 qu80Var10 = this.binding;
            if (qu80Var10 != null) {
                qu80Var10.j0.setVisibility(8);
            }
            qu80 qu80Var11 = this.binding;
            if (qu80Var11 != null) {
                qu80Var11.m0.setVisibility(8);
            }
            if (Intrinsics.g(this.P, "ROUND_WAITING")) {
                setMiniWaitingTextLayoutVisibility(0);
                if (context != null) {
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    float f5 = displayMetrics3.heightPixels / displayMetrics3.widthPixels;
                    Map mapA3 = dtp.a(numValueOf2, "powering_up_font_size");
                    if (f5 >= 2.1f || f5 >= 2.0f) {
                        mapA3 = dtp.a(numValueOf2, "powering_up_font_size");
                    } else if (f5 >= 1.5f) {
                        mapA3 = dtp.a(numValueOf, "powering_up_font_size");
                    }
                    Resources resources3 = getResources();
                    Integer num3 = (Integer) mapA3.get("powering_up_font_size");
                    float dimension3 = resources3.getDimension(num3 != null ? num3.intValue() : R.dimen._11ssp);
                    qu80 qu80Var12 = this.binding;
                    if (qu80Var12 != null) {
                        qu80Var12.C.setTextSize(0, dimension3);
                    }
                }
            }
            if (Intrinsics.g(this.P, "ROUND_ONGOING") || Intrinsics.g(this.P, "ROUND_PRE_START")) {
                setSportyAnimations(800L);
            }
            if (Intrinsics.g(this.P, "ROUND_ONGOING") || Intrinsics.g(this.P, "ROUND_END_WAIT")) {
                j(8, 0);
                qu80 qu80Var13 = this.binding;
                if (qu80Var13 != null) {
                    qu80Var13.E.setVisibility(8);
                }
            }
            qu80 qu80Var14 = this.binding;
            if (qu80Var14 != null) {
                qu80Var14.d.setVisibility(8);
            }
            qu80 qu80Var15 = this.binding;
            if (qu80Var15 != null) {
                qu80Var15.K.setVisibility(4);
            }
        }
        qu80 qu80Var16 = this.binding;
        if (qu80Var16 != null) {
            ConstraintLayout constraintLayout = qu80Var16.W;
            CardView cardView = qu80Var16.z;
            ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.t = constraintLayout.getId();
                layoutParams2.i = constraintLayout.getId();
                layoutParams2.k = -1;
                cardView.setLayoutParams(layoutParams2);
            }
        }
        if (this.H) {
            h();
        }
    }

    public final void setAlphaAnimation(AlphaAnimation alphaAnimation) {
        this.alphaAnimation = alphaAnimation;
    }

    public final void setAnimDone(int i) {
        this.animDone = i;
    }

    public final void setAnimStart(int i) {
        this.animStart = i;
    }

    public final void setAnimstartInitial(int i) {
        this.animstartInitial = i;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:92:0x0168  */
    /* JADX WARN: Code duplicated, block: B:93:0x016b  */
    public final void setAssets() {
        String str;
        String str2;
        if (this.J) {
            if (this.C) {
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new a(null), 3);
            } else if (this.B) {
                qu80 qu80Var = this.binding;
                if (qu80Var != null) {
                    com.bumptech.glide.a.e(this).o(Integer.valueOf(R.drawable.sh_xmas)).M(qu80Var.O);
                }
            } else if (trw.g()) {
                String lowerCase = e6a.a().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                int iHashCode = lowerCase.hashCode();
                if (iHashCode != 3152) {
                    if (iHashCode != 3297) {
                        if (iHashCode != 3499) {
                            if (iHashCode != 3879) {
                                if (iHashCode == 104431 && lowerCase.equals("int")) {
                                    str = "power_wc_br";
                                }
                            } else if (lowerCase.equals("za")) {
                                str = "power_wc_za";
                            }
                            str = "power_wc_tz";
                        } else if (lowerCase.equals("mx")) {
                            str = "power_wc_mx";
                        } else {
                            str = "power_wc_tz";
                        }
                    } else if (lowerCase.equals("gh")) {
                        str = "power_wc_gh";
                    } else {
                        str = "power_wc_tz";
                    }
                } else if (lowerCase.equals("br")) {
                    str = "power_wc_br";
                } else {
                    str = "power_wc_tz";
                }
                pfd pfdVar2 = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new b(str, null), 3);
            } else {
                qu80 qu80Var2 = this.binding;
                Context context = this.a;
                if (qu80Var2 != null) {
                    ImageView imageView = qu80Var2.O;
                    if (context != null) {
                        com.bumptech.glide.a.b(context).c(context).p(op5.c(op5.a, "militao_hero_idle_webp:sg_game_name", "")).M(imageView);
                    }
                }
                qu80 qu80Var3 = this.binding;
                if (qu80Var3 != null) {
                    qu80Var3.K.setImageDrawable(context != null ? context.getDrawable(R.drawable.clip_militao) : null);
                }
            }
            if (this.C) {
                str2 = "militao-valentine";
            } else if (this.B) {
                str2 = "militao-christmas";
            } else if (((Boolean) ((x5a0) trw.b).getValue()).booleanValue()) {
                str2 = "militao-fugu";
            } else if (trw.g() && trw.g()) {
                String lowerCase2 = e6a.a().toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                int iHashCode2 = lowerCase2.hashCode();
                if (iHashCode2 != 3152) {
                    if (iHashCode2 != 3297) {
                        if (iHashCode2 != 3499) {
                            if (iHashCode2 != 3879) {
                                if (iHashCode2 == 104431 && lowerCase2.equals("int")) {
                                    str2 = "militao-normal_wc_brazil";
                                }
                            } else if (lowerCase2.equals("za")) {
                                str2 = "militao-normal_wc_SA";
                            }
                            str2 = "militao-normal_wc_TZ";
                        } else if (lowerCase2.equals("mx")) {
                            str2 = "militao-normal_wc_MX";
                        } else {
                            str2 = "militao-normal_wc_TZ";
                        }
                    } else if (lowerCase2.equals("gh")) {
                        str2 = "militao-normal_wc_GH";
                    } else {
                        str2 = "militao-normal_wc_TZ";
                    }
                } else if (lowerCase2.equals("br")) {
                    str2 = "militao-normal_wc_brazil";
                } else {
                    str2 = "militao-normal_wc_TZ";
                }
            } else {
                str2 = "militao-normal";
            }
            this.L = str2;
        }
    }

    public final void setAtlasName(File file) {
        this.atlasName = file;
    }

    public final void setBinding(qu80 qu80Var) {
        this.binding = qu80Var;
    }

    public final void setCoefficientsHiddenByVipSheet(boolean hidden) {
        this.I = hidden;
        if (hidden) {
            qu80 qu80Var = this.binding;
            if (qu80Var != null) {
                qu80Var.b.setVisibility(8);
            }
            qu80 qu80Var2 = this.binding;
            if (qu80Var2 != null) {
                qu80Var2.B.setVisibility(8);
            }
            qu80 qu80Var3 = this.binding;
            if (qu80Var3 != null) {
                qu80Var3.k0.setVisibility(8);
            }
            qu80 qu80Var4 = this.binding;
            if (qu80Var4 != null) {
                qu80Var4.l0.setVisibility(8);
            }
            qu80 qu80Var5 = this.binding;
            if (qu80Var5 != null) {
                qu80Var5.E.setVisibility(8);
                return;
            }
            return;
        }
        String str = this.P;
        if (!Intrinsics.g(str, "ROUND_ONGOING") && !Intrinsics.g(str, "ROUND_END_WAIT")) {
            j(8, 8);
        } else if (this.G) {
            j(0, 8);
        } else {
            j(8, 0);
        }
        qu80 qu80Var6 = this.binding;
        if (qu80Var6 != null) {
            qu80Var6.k0.setVisibility(0);
        }
        qu80 qu80Var7 = this.binding;
        if (qu80Var7 != null) {
            qu80Var7.l0.setVisibility(0);
        }
        if (!Intrinsics.g(this.P, "ROUND_WAITING") || this.G) {
            qu80 qu80Var8 = this.binding;
            if (qu80Var8 != null) {
                qu80Var8.E.setVisibility(8);
                return;
            }
            return;
        }
        qu80 qu80Var9 = this.binding;
        if (qu80Var9 != null) {
            qu80Var9.E.setVisibility(0);
        }
    }

    public final void setDestoyed(boolean z) {
        this.isDestoyed = z;
    }

    public final void setEndAnimDone(int i) {
        this.endAnimDone = i;
    }

    public final void setLowRamHeroMode(boolean enabled) {
        this.J = enabled;
        if (!enabled || this.K) {
            return;
        }
        i();
        this.K = true;
    }

    public final void setNestedDimens(float deviceHeight, float deviceWidth) {
        if (deviceHeight == 0.0f || deviceWidth == 0.0f) {
            return;
        }
        Float fValueOf = Float.valueOf(0.113f);
        Float fValueOf2 = Float.valueOf(0.09f);
        float f2 = deviceHeight / deviceWidth;
        Map mapA = dgb.a("view_bottom_height", Float.valueOf(0.03f));
        if (f2 >= 2.1f || f2 >= 2.0f) {
            mapA = dgb.a("view_bottom_height", fValueOf);
        } else if (f2 >= 1.9f || f2 >= 1.8f || f2 >= 1.5f) {
            mapA = dgb.a("view_bottom_height", fValueOf2);
        }
        qu80 qu80Var = this.binding;
        ViewGroup.LayoutParams layoutParams = qu80Var != null ? qu80Var.Z.getLayoutParams() : null;
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        Float f3 = (Float) mapA.get("view_bottom_height");
        layoutParams2.S = f3 != null ? f3.floatValue() : 0.03f;
        qu80 qu80Var2 = this.binding;
        if (qu80Var2 != null) {
            qu80Var2.Z.setLayoutParams(layoutParams2);
        }
    }

    public final void setOngoingStart(int i) {
        this.ongoingStart = i;
    }

    public final void setRoundOverlayHidden(boolean hidden) {
        if (this.H == hidden) {
            return;
        }
        this.H = hidden;
        if (hidden) {
            h();
        } else {
            k(this.G);
        }
    }

    public final void setSkeletonName(File file) {
        this.skeletonName = file;
    }

    public final void setSpine() {
        if (!this.J || this.atlasName == null || this.skeletonName == null) {
            return;
        }
        qu80 qu80Var = this.binding;
        if (qu80Var != null) {
            qu80Var.c.setVisibility(0);
        }
        qu80 qu80Var2 = this.binding;
        if (qu80Var2 != null) {
            ComposeView composeView = qu80Var2.f;
            pfd pfdVar = fse.a;
            ej5.c(this.F, gku.a, null, new e(composeView, null), 2);
        }
    }

    public final void setTimerInProgress(boolean z) {
        this.timerInProgress = z;
    }

    public final void setTranslateAnimation(TranslateAnimation translateAnimation) {
        this.translateAnimation = translateAnimation;
    }

    public final void setValentineSpine() {
        try {
            if (this.J) {
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new g(null), 3);
            }
        } catch (Exception unused) {
        }
    }

    public final void setXmasTheme() {
        if (this.J) {
            this.B = true;
            qu80 qu80Var = this.binding;
            if (qu80Var != null) {
                qu80Var.V.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:180:0x0301  */
    public final void setMultiplier(MultiplierResponse s) {
        TranslateAnimation translateAnimation;
        qu80 qu80Var;
        qu80 qu80Var2;
        qu80 qu80Var3;
        Drawable drawable;
        s.getClass();
        this.P = s.getMessageType();
        if (s.getTotalMillis() != 0) {
            s.getTotalMillis();
        }
        if (Intrinsics.g(s.getMessageType(), "ROUND_WAITING") && !this.timerInProgress) {
            double totalMillis = ((double) s.getTotalMillis()) / 10000.0d;
            if (this.J && (qu80Var3 = this.binding) != null && (drawable = qu80Var3.K.getDrawable()) != null) {
                drawable.setLevel((int) (((double) s.getTotalMillis()) / totalMillis));
            }
            this.endAnimDone = 0;
            if (this.G) {
                if (this.J) {
                    e();
                } else {
                    d();
                }
            } else {
                setMiniWaitingTextLayoutVisibility(0);
            }
            c();
            this.animstartInitial = 0;
            this.animStart = 0;
            this.animDone = 0;
            boolean z = this.G;
            qu80 qu80Var4 = this.binding;
            if (z) {
                if (qu80Var4 != null && qu80Var4.G.getVisibility() == 0 && (qu80Var2 = this.binding) != null) {
                    qu80Var2.G.setVisibility(8);
                }
            } else if (qu80Var4 != null && qu80Var4.G.getVisibility() == 0 && (qu80Var = this.binding) != null) {
                qu80Var.G.setVisibility(8);
            }
            qu80 qu80Var5 = this.binding;
            if (qu80Var5 != null) {
                qu80Var5.M.setMax(s.getTotalMillis());
            }
            qu80 qu80Var6 = this.binding;
            if (qu80Var6 != null) {
                qu80Var6.N.setMax(s.getTotalMillis());
            }
            qu80 qu80Var7 = this.binding;
            if (qu80Var7 != null) {
                qu80Var7.D.setMax(s.getTotalMillis());
            }
            this.timerInProgress = true;
            pfd pfdVar = fse.a;
            this.D = w5b.a(gku.a);
            this.E = s.getMillisLeft();
            s.getMillisLeft();
            ej5.c(this.D, null, null, new c(totalMillis, null), 3);
        }
        if (Intrinsics.g(s.getMessageType(), "ROUND_PRE_START")) {
            this.timerInProgress = false;
            w5b.c(this.D, null);
            if (this.J) {
                g();
            } else {
                f();
            }
            qu80 qu80Var8 = this.binding;
            if (qu80Var8 != null) {
                qu80Var8.E.setVisibility(8);
            }
            qu80 qu80Var9 = this.binding;
            if (qu80Var9 != null) {
                qu80Var9.G.setVisibility(0);
            }
            j(8, 8);
            qu80 qu80Var10 = this.binding;
            if (qu80Var10 != null) {
                qu80Var10.d.setVisibility(8);
            }
            if (this.animDone == 0 && this.animStart == 0) {
                this.animstartInitial = 1;
                this.animStart = 1;
                setSportyAnimations(800L);
            }
        }
        boolean zG = Intrinsics.g(s.getMessageType(), "ROUND_ONGOING");
        Context context = this.a;
        String str = "";
        if (zG) {
            if (this.ongoingStart == 0 && this.animDone == 0 && this.animStart == 0) {
                this.animstartInitial = 1;
                this.ongoingStart = 1;
                setSportyAnimations(0L);
            }
            this.animDone = 0;
            this.timerInProgress = false;
            w5b.c(this.D, null);
            this.animStart = 0;
            if (this.G) {
                j(0, 8);
            } else {
                j(8, 0);
                qu80 qu80Var11 = this.binding;
                if (qu80Var11 != null) {
                    qu80Var11.E.setVisibility(8);
                }
            }
            qu80 qu80Var12 = this.binding;
            if (qu80Var12 != null) {
                qu80Var12.b.setShadowLayer(20.0f, 0.0f, 0.0f, Color.parseColor("#4DFFFFFF"));
            }
            qu80 qu80Var13 = this.binding;
            if (qu80Var13 != null) {
                qu80Var13.B.setShadowLayer(20.0f, 0.0f, 0.0f, Color.parseColor("#4DFFFFFF"));
            }
            if (this.J) {
                g();
            } else {
                f();
            }
            qu80 qu80Var14 = this.binding;
            if (qu80Var14 != null) {
                qu80Var14.d.setVisibility(8);
            }
            qu80 qu80Var15 = this.binding;
            if (qu80Var15 != null) {
                qu80Var15.G.setVisibility(0);
            }
            StringBuilder sb = this.O;
            sb.setLength(0);
            sb.append(s.getCurrentMultiplier());
            sb.append("x");
            qu80 qu80Var16 = this.binding;
            if (qu80Var16 != null) {
                qu80Var16.b.setText(sb.toString());
            }
            qu80 qu80Var17 = this.binding;
            if (qu80Var17 != null) {
                qu80Var17.B.setText(sb.toString());
            }
            String currentMultiplier = s.getCurrentMultiplier();
            if (currentMultiplier == null) {
                currentMultiplier = "";
            }
            b(currentMultiplier);
            if (context != null) {
                qu80 qu80Var18 = this.binding;
                if (qu80Var18 != null) {
                    qu80Var18.b.setTextColor(context.getColor(R.color.white));
                }
                qu80 qu80Var19 = this.binding;
                if (qu80Var19 != null) {
                    qu80Var19.B.setTextColor(context.getColor(R.color.white));
                }
            }
        }
        if (Intrinsics.g(s.getMessageType(), "ROUND_END_WAIT")) {
            qu80 qu80Var20 = this.binding;
            if (qu80Var20 != null) {
                r97.a(qu80Var20.b, s.getCurrentMultiplier(), "x");
            }
            qu80 qu80Var21 = this.binding;
            if (qu80Var21 != null) {
                r97.a(qu80Var21.B, s.getCurrentMultiplier(), "x");
            }
            String currentMultiplier2 = s.getCurrentMultiplier();
            if (currentMultiplier2 != null) {
                str = currentMultiplier2;
            }
            b(str);
            this.ongoingStart = 0;
            if (this.animstartInitial == 0) {
                this.animstartInitial = 1;
            }
            if (this.G) {
                j(0, 8);
                qu80 qu80Var22 = this.binding;
                if (qu80Var22 != null) {
                    qu80Var22.d.setVisibility(0);
                }
            } else {
                j(8, 0);
                qu80 qu80Var23 = this.binding;
                if (qu80Var23 != null) {
                    qu80Var23.d.setVisibility(8);
                }
            }
            qu80 qu80Var24 = this.binding;
            String str2 = LGxrN.oZgjLpZ;
            if (qu80Var24 != null) {
                qu80Var24.b.setShadowLayer(20.0f, 0.0f, 0.0f, Color.parseColor(str2));
            }
            qu80 qu80Var25 = this.binding;
            if (qu80Var25 != null) {
                qu80Var25.B.setShadowLayer(20.0f, 0.0f, 0.0f, Color.parseColor(str2));
            }
            qu80 qu80Var26 = this.binding;
            if (qu80Var26 != null) {
                qu80Var26.j0.setVisibility(8);
            }
            qu80 qu80Var27 = this.binding;
            if (qu80Var27 != null) {
                qu80Var27.m0.setVisibility(8);
            }
            qu80 qu80Var28 = this.binding;
            if (qu80Var28 != null) {
                qu80Var28.E.setVisibility(8);
            }
            qu80 qu80Var29 = this.binding;
            if (qu80Var29 != null) {
                qu80Var29.G.setVisibility(0);
            }
            if (context != null) {
                boolean z2 = this.C;
                qu80 qu80Var30 = this.binding;
                if (z2) {
                    if (qu80Var30 != null) {
                        qu80Var30.b.setTextColor(context.getColor(R.color.valentine));
                    }
                    qu80 qu80Var31 = this.binding;
                    if (qu80Var31 != null) {
                        qu80Var31.B.setTextColor(context.getColor(R.color.valentine));
                    }
                } else if (qu80Var30 != null) {
                    qu80Var30.b.setTextColor(context.getColor(R.color.sh_seekbar));
                }
                qu80 qu80Var32 = this.binding;
                if (qu80Var32 != null) {
                    qu80Var32.B.setTextColor(context.getColor(R.color.sh_seekbar));
                }
            }
            if (this.endAnimDone == 0 && this.J) {
                qu80 qu80Var33 = this.binding;
                if (qu80Var33 != null) {
                    float x = qu80Var33.c.getX();
                    qu80 qu80Var34 = this.binding;
                    if (qu80Var34 != null) {
                        float y = qu80Var34.c.getY();
                        translateAnimation = new TranslateAnimation(x, 1050.0f + x, y, (-y) - 730.0f);
                    } else {
                        translateAnimation = null;
                    }
                } else {
                    translateAnimation = null;
                }
                qu80 qu80Var35 = this.binding;
                if (qu80Var35 != null) {
                    qu80Var35.c.setAlpha(0.5f);
                }
                TranslateAnimation translateAnimation2 = this.translateAnimation;
                if (translateAnimation2 != null) {
                    translateAnimation2.cancel();
                }
                AlphaAnimation alphaAnimation = this.alphaAnimation;
                if (alphaAnimation != null) {
                    alphaAnimation.cancel();
                }
                this.endAnimDone = 1;
                if (translateAnimation != null) {
                    translateAnimation.setDuration(400L);
                }
                if (translateAnimation != null) {
                    translateAnimation.setFillAfter(true);
                }
                qu80 qu80Var36 = this.binding;
                if (qu80Var36 != null) {
                    qu80Var36.f.startAnimation(translateAnimation);
                }
                qu80 qu80Var37 = this.binding;
                if (qu80Var37 != null) {
                    qu80Var37.Y.startAnimation(translateAnimation);
                }
                ej5.c(this.F, null, null, new d(null), 3);
            }
        }
        if (this.H) {
            h();
        }
    }

    public ShMultiplierContainer(Context context) {
        this(context, null);
    }
}
