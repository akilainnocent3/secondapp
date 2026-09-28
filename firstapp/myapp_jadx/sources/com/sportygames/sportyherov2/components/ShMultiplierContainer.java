package com.sportygames.sportyherov2.components;

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
import android.widget.SeekBar;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportyherov2.remote.models.MultiplierResponse;
import defpackage.c0d;
import defpackage.dgb;
import defpackage.dtp;
import defpackage.e6a;
import defpackage.ej5;
import defpackage.fse;
import defpackage.gku;
import defpackage.hh40;
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
import defpackage.srw;
import defpackage.tje0;
import defpackage.u6i0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.w5b;
import defpackage.wcl;
import defpackage.wo9;
import defpackage.x5a0;
import defpackage.y5b;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\nJ\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\nJ\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010.\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\"\u00102\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'\"\u0004\b1\u0010)R\"\u00106\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010%\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)R\"\u0010:\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010%\u001a\u0004\b8\u0010'\"\u0004\b9\u0010)R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010J\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010R\u001a\u0004\u0018\u00010K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010T\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010=\u001a\u0004\bT\u0010?\"\u0004\bU\u0010AR$\u0010]\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010a\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010X\u001a\u0004\b_\u0010Z\"\u0004\b`\u0010\\¨\u0006b"}, d2 = {"Lcom/sportygames/sportyherov2/components/ShMultiplierContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "setAssets", "()V", "setXmasTheme", "Lcom/sportygames/sportyherov2/remote/models/MultiplierResponse;", "s", "setMultiplier", "(Lcom/sportygames/sportyherov2/remote/models/MultiplierResponse;)V", "", "deviceHeight", "deviceWidth", "setNestedDimens", "(FF)V", "setSpine", "setValentineSpine", "", "mDuration", "setSportyAnimations", "(J)V", "Lqu80;", "b", "Lqu80;", "getBinding", "()Lqu80;", "setBinding", "(Lqu80;)V", "binding", "", "c", "I", "getAnimDone", "()I", "setAnimDone", "(I)V", "animDone", "d", "getAnimStart", "setAnimStart", "animStart", "e", "getEndAnimDone", "setEndAnimDone", "endAnimDone", "f", "getOngoingStart", "setOngoingStart", "ongoingStart", "i", "getAnimstartInitial", "setAnimstartInitial", "animstartInitial", "", "v", "Z", "getTimerInProgress", "()Z", "setTimerInProgress", "(Z)V", "timerInProgress", "Landroid/view/animation/TranslateAnimation;", "w", "Landroid/view/animation/TranslateAnimation;", "getTranslateAnimation", "()Landroid/view/animation/TranslateAnimation;", "setTranslateAnimation", "(Landroid/view/animation/TranslateAnimation;)V", "translateAnimation", "Landroid/view/animation/AlphaAnimation;", "z", "Landroid/view/animation/AlphaAnimation;", "getAlphaAnimation", "()Landroid/view/animation/AlphaAnimation;", "setAlphaAnimation", "(Landroid/view/animation/AlphaAnimation;)V", "alphaAnimation", "A", "isDestoyed", "setDestoyed", "Ljava/io/File;", "J", "Ljava/io/File;", "getAtlasName", "()Ljava/io/File;", "setAtlasName", "(Ljava/io/File;)V", "atlasName", "K", "getSkeletonName", "setSkeletonName", "skeletonName", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShMultiplierContainer extends LinearLayout {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public boolean isDestoyed;
    public boolean B;
    public boolean C;
    public j1b D;
    public int E;
    public final j1b F;
    public boolean G;
    public final double H;
    public String I;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public File atlasName;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public File skeletonName;
    public final StringBuilder L;
    public String M;
    public Context a;

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

    @c0d(c = "com.sportygames.sportyherov2.components.ShMultiplierContainer$setAssets$1", f = "ShMultiplierContainer.kt", l = {154}, m = "invokeSuspend", v = 1)
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

    @c0d(c = "com.sportygames.sportyherov2.components.ShMultiplierContainer$setAssets$3", f = "ShMultiplierContainer.kt", l = {167}, m = "invokeSuspend", v = 1)
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
        /* JADX WARN: Code duplicated, block: B:19:0x0048  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ImageView imageView;
            qu80 binding;
            y5b y5bVar = y5b.a;
            int i = this.b;
            ShMultiplierContainer shMultiplierContainer = ShMultiplierContainer.this;
            if (i == 0) {
                uj50.b(obj);
                qu80 binding2 = shMultiplierContainer.getBinding();
                if (binding2 != null) {
                    ImageView imageView2 = binding2.O;
                    s4u<String, Bitmap> s4uVar = r9n.a;
                    Context context = shMultiplierContainer.a;
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
                    ImageView imageView3 = binding.K;
                    Context context2 = shMultiplierContainer.a;
                    imageView3.setImageDrawable(context2 != null ? context2.getDrawable(R.drawable.clip_world_cup) : null);
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
                ImageView imageView4 = binding.K;
                Context context3 = shMultiplierContainer.a;
                imageView4.setImageDrawable(context3 != null ? context3.getDrawable(R.drawable.clip_world_cup) : null);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportyherov2.components.ShMultiplierContainer$setMultiplier$1", f = "ShMultiplierContainer.kt", l = {380}, m = "invokeSuspend", v = 1)
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
                if (shMultiplierContainer.f()) {
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

    @c0d(c = "com.sportygames.sportyherov2.components.ShMultiplierContainer$setMultiplier$4", f = "ShMultiplierContainer.kt", l = {560}, m = "invokeSuspend", v = 1)
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

    @c0d(c = "com.sportygames.sportyherov2.components.ShMultiplierContainer$setSpine$1$1", f = "ShMultiplierContainer.kt", l = {}, m = "invokeSuspend", v = 1)
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
                composeView2.setContent(new op8(917625717, new hh40(shMultiplierContainer), true));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportyherov2.components.ShMultiplierContainer$setSportyAnimations$2", f = "ShMultiplierContainer.kt", l = {845}, m = "invokeSuspend", v = 1)
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

    @c0d(c = "com.sportygames.sportyherov2.components.ShMultiplierContainer$setValentineSpine$1", f = "ShMultiplierContainer.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {

        @c0d(c = "com.sportygames.sportyherov2.components.ShMultiplierContainer$setValentineSpine$1$2$1", f = "ShMultiplierContainer.kt", l = {}, m = "invokeSuspend", v = 1)
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
                composeView.setContent(wo9.a);
                return Unit.a;
            }
        }

        @c0d(c = "com.sportygames.sportyherov2.components.ShMultiplierContainer$setValentineSpine$1$5", f = "ShMultiplierContainer.kt", l = {}, m = "invokeSuspend", v = 1)
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
                SeekBar seekBar = binding8.M;
                Context context = shMultiplierContainer.a;
                seekBar.setProgressDrawable(context != null ? context.getDrawable(R.drawable.sh_seek_bar_valentine) : null);
            }
            qu80 binding9 = shMultiplierContainer.getBinding();
            if (binding9 != null) {
                SeekBar seekBar2 = binding9.D;
                Context context2 = shMultiplierContainer.a;
                seekBar2.setProgressDrawable(context2 != null ? context2.getDrawable(R.drawable.sh_seek_bar_valentine) : null);
            }
            pfd pfdVar2 = fse.a;
            ej5.c(w5b.a(gku.a), null, null, new b(shMultiplierContainer, null), 3);
            qu80 binding10 = shMultiplierContainer.getBinding();
            if (binding10 != null) {
                ImageView imageView = binding10.K;
                Context context3 = shMultiplierContainer.a;
                imageView.setImageDrawable(context3 != null ? context3.getDrawable(R.drawable.clip_valentine) : null);
            }
            return Unit.a;
        }
    }

    public ShMultiplierContainer(Context context, AttributeSet attributeSet) {
        double d2;
        Context context2;
        float f2;
        super(context, attributeSet);
        this.a = context;
        this.binding = qu80.a(LayoutInflater.from(context), this);
        pfd pfdVar = fse.a;
        wcl wclVar = gku.a;
        this.D = w5b.a(wclVar);
        this.F = w5b.a(wclVar);
        this.I = "Encore-hero-christmas";
        Context context3 = this.a;
        if (context3 != null) {
            try {
                Object systemService = context3.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                }
                d2 = memoryInfo.totalMem / 1.073741824E9d;
            } catch (Exception unused) {
                d2 = 0.0d;
            }
            this.H = d2;
        }
        qu80 qu80Var = this.binding;
        if (qu80Var != null) {
            qu80Var.A.setScaleY(0.8f);
        }
        qu80 qu80Var2 = this.binding;
        if (qu80Var2 != null) {
            qu80Var2.A.setScaleX(0.8f);
        }
        if (f() && (context2 = this.a) != null) {
            DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
            float f3 = displayMetrics.heightPixels;
            float f4 = displayMetrics.widthPixels;
            if (f3 != 0.0f && f4 != 0.0f) {
                float f5 = f3 / f4;
                if (f5 >= 2.0f) {
                    f2 = 160.0f;
                } else {
                    f2 = f5 >= 1.8f ? 125.0f : 120.0f;
                }
                int iApplyDimension = (int) TypedValue.applyDimension(1, f2, getResources().getDisplayMetrics());
                qu80 qu80Var3 = this.binding;
                MotionLayout motionLayout = qu80Var3 != null ? qu80Var3.c : null;
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
        this.L = new StringBuilder();
        this.M = "";
    }

    private final void setSportyAnimations(long mDuration) {
        ArrayList<androidx.constraintlayout.motion.widget.b.C0051b> definedTransitions;
        try {
            if (f()) {
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

    public final void a(String str) {
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

    public final void b() {
        qu80 qu80Var;
        qu80 qu80Var2 = this.binding;
        if ((qu80Var2 == null || qu80Var2.j0.getVisibility() != 8) && ((qu80Var = this.binding) == null || qu80Var.j0.getVisibility() != 4)) {
            return;
        }
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

    public final void c() {
        qu80 qu80Var;
        qu80 qu80Var2;
        qu80 qu80Var3 = this.binding;
        if (((qu80Var3 == null || qu80Var3.m0.getVisibility() != 8) && ((qu80Var = this.binding) == null || qu80Var.m0.getVisibility() != 4)) || (qu80Var2 = this.binding) == null) {
            return;
        }
        qu80Var2.m0.setVisibility(0);
    }

    public final void d() {
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

    public final void e() {
        qu80 qu80Var;
        qu80 qu80Var2 = this.binding;
        if (qu80Var2 == null || qu80Var2.m0.getVisibility() != 0 || (qu80Var = this.binding) == null) {
            return;
        }
        qu80Var.m0.setVisibility(8);
    }

    public final boolean f() {
        return this.H <= 3.0d;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00be  */
    public final void g(boolean z) {
        qu80 qu80Var;
        float f2;
        qu80 qu80Var2;
        Integer numValueOf = Integer.valueOf(R.dimen._12ssp);
        Integer numValueOf2 = Integer.valueOf(R.dimen._13ssp);
        this.G = z;
        if (z) {
            if (f() && (qu80Var2 = this.binding) != null) {
                qu80Var2.O.setVisibility(0);
            }
            if (Intrinsics.g(this.M, "ROUND_PRE_START")) {
                if (f()) {
                    e();
                } else {
                    d();
                }
                qu80 qu80Var3 = this.binding;
                if (qu80Var3 != null) {
                    qu80Var3.d.setVisibility(8);
                }
            }
            if (Intrinsics.g(this.M, "ROUND_END_WAIT")) {
                qu80 qu80Var4 = this.binding;
                if (qu80Var4 != null) {
                    qu80Var4.d.setVisibility(0);
                }
                Context context = this.a;
                if (context != null) {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    f2 = 2.0f;
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
                    f2 = 2.0f;
                }
            } else {
                f2 = 2.0f;
            }
            if (Intrinsics.g(this.M, "ROUND_WAITING")) {
                if (f()) {
                    c();
                } else {
                    b();
                }
                Context context2 = this.a;
                if (context2 != null) {
                    DisplayMetrics displayMetrics2 = context2.getResources().getDisplayMetrics();
                    float f4 = displayMetrics2.heightPixels / displayMetrics2.widthPixels;
                    Map mapA2 = dtp.a(numValueOf2, "powering_up_font_size");
                    if (f4 >= 2.1f || f4 >= f2) {
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
            if (Intrinsics.g(this.M, "ROUND_ONGOING") || Intrinsics.g(this.M, "ROUND_END_WAIT")) {
                qu80 qu80Var7 = this.binding;
                if (qu80Var7 != null) {
                    qu80Var7.b.setVisibility(0);
                }
                qu80 qu80Var8 = this.binding;
                if (qu80Var8 != null) {
                    qu80Var8.B.setVisibility(8);
                }
            }
            if (Intrinsics.g(this.M, "ROUND_ONGOING") || Intrinsics.g(this.M, "ROUND_PRE_START")) {
                setSportyAnimations(800L);
            }
            boolean zF = f();
            qu80 qu80Var9 = this.binding;
            if (zF) {
                if (qu80Var9 != null) {
                    qu80Var9.K.setVisibility(0);
                }
            } else if (qu80Var9 != null) {
                qu80Var9.K.setVisibility(4);
            }
            qu80 qu80Var10 = this.binding;
            if (qu80Var10 != null) {
                qu80Var10.E.setVisibility(8);
            }
            setSpine();
        } else {
            qu80 qu80Var11 = this.binding;
            if (qu80Var11 != null) {
                qu80Var11.O.setVisibility(4);
            }
            if (f() && (qu80Var = this.binding) != null) {
                qu80Var.c.setVisibility(4);
            }
            qu80 qu80Var12 = this.binding;
            if (qu80Var12 != null) {
                qu80Var12.j0.setVisibility(8);
            }
            qu80 qu80Var13 = this.binding;
            if (qu80Var13 != null) {
                qu80Var13.m0.setVisibility(8);
            }
            if (Intrinsics.g(this.M, "ROUND_WAITING")) {
                qu80 qu80Var14 = this.binding;
                if (qu80Var14 != null) {
                    qu80Var14.E.setVisibility(0);
                }
                Context context3 = this.a;
                if (context3 != null) {
                    DisplayMetrics displayMetrics3 = context3.getResources().getDisplayMetrics();
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
                    qu80 qu80Var15 = this.binding;
                    if (qu80Var15 != null) {
                        qu80Var15.C.setTextSize(0, dimension3);
                    }
                }
            }
            if (Intrinsics.g(this.M, "ROUND_ONGOING") || Intrinsics.g(this.M, "ROUND_PRE_START")) {
                setSportyAnimations(800L);
            }
            if (Intrinsics.g(this.M, "ROUND_ONGOING") || Intrinsics.g(this.M, "ROUND_END_WAIT")) {
                qu80 qu80Var16 = this.binding;
                if (qu80Var16 != null) {
                    qu80Var16.b.setVisibility(8);
                }
                qu80 qu80Var17 = this.binding;
                if (qu80Var17 != null) {
                    qu80Var17.B.setVisibility(0);
                }
                qu80 qu80Var18 = this.binding;
                if (qu80Var18 != null) {
                    qu80Var18.E.setVisibility(8);
                }
            }
            qu80 qu80Var19 = this.binding;
            if (qu80Var19 != null) {
                qu80Var19.d.setVisibility(8);
            }
            qu80 qu80Var20 = this.binding;
            if (qu80Var20 != null) {
                qu80Var20.K.setVisibility(4);
            }
        }
        qu80 qu80Var21 = this.binding;
        if (qu80Var21 != null) {
            ConstraintLayout constraintLayout = qu80Var21.W;
            CardView cardView = qu80Var21.z;
            ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            layoutParams2.t = constraintLayout.getId();
            layoutParams2.i = constraintLayout.getId();
            layoutParams2.k = -1;
            cardView.setLayoutParams(layoutParams2);
        }
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

    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:91:0x0169  */
    /* JADX WARN: Code duplicated, block: B:92:0x016c  */
    public final void setAssets() {
        String str;
        String str2;
        if (f()) {
            if (this.C) {
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new a(null), 3);
            } else if (this.B) {
                qu80 qu80Var = this.binding;
                if (qu80Var != null) {
                    com.bumptech.glide.a.e(this).o(Integer.valueOf(R.drawable.sh_xmas)).M(qu80Var.O);
                }
            } else if (srw.d()) {
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
                if (qu80Var2 != null) {
                    ImageView imageView = qu80Var2.O;
                    Context context = this.a;
                    if (context != null) {
                        com.bumptech.glide.a.b(context).c(context).p(op5.c(op5.a, "militao_hero_idle_webp:sg_game_name", "")).M(imageView);
                    }
                }
                qu80 qu80Var3 = this.binding;
                if (qu80Var3 != null) {
                    ImageView imageView2 = qu80Var3.K;
                    Context context2 = this.a;
                    imageView2.setImageDrawable(context2 != null ? context2.getDrawable(R.drawable.clip_militao) : null);
                }
            }
            if (this.C) {
                str2 = "militao-valentine";
            } else if (this.B) {
                str2 = "militao-christmas";
            } else if (((Boolean) ((x5a0) srw.b).getValue()).booleanValue()) {
                str2 = "militao-fugu";
            } else if (srw.d() && srw.d()) {
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
            this.I = str2;
        }
    }

    public final void setAtlasName(File file) {
        this.atlasName = file;
    }

    public final void setBinding(qu80 qu80Var) {
        this.binding = qu80Var;
    }

    public final void setDestoyed(boolean z) {
        this.isDestoyed = z;
    }

    public final void setEndAnimDone(int i) {
        this.endAnimDone = i;
    }

    /* JADX WARN: Code duplicated, block: B:208:0x0356  */
    public final void setMultiplier(MultiplierResponse s) {
        TranslateAnimation translateAnimation;
        qu80 qu80Var;
        qu80 qu80Var2;
        qu80 qu80Var3;
        Drawable drawable;
        s.getClass();
        this.M = s.getMessageType();
        if (s.getTotalMillis() != 0) {
            s.getTotalMillis();
        }
        if (Intrinsics.g(s.getMessageType(), "ROUND_WAITING") && !this.timerInProgress) {
            double totalMillis = ((double) s.getTotalMillis()) / 10000.0d;
            if (f() && (qu80Var3 = this.binding) != null && (drawable = qu80Var3.K.getDrawable()) != null) {
                drawable.setLevel((int) (((double) s.getTotalMillis()) / totalMillis));
            }
            this.endAnimDone = 0;
            if (!this.G) {
                qu80 qu80Var4 = this.binding;
                if (qu80Var4 != null) {
                    qu80Var4.E.setVisibility(0);
                }
            } else if (f()) {
                c();
            } else {
                b();
            }
            this.animstartInitial = 0;
            this.animStart = 0;
            this.animDone = 0;
            boolean z = this.G;
            qu80 qu80Var5 = this.binding;
            if (z) {
                if (qu80Var5 != null && qu80Var5.G.getVisibility() == 0 && (qu80Var2 = this.binding) != null) {
                    qu80Var2.G.setVisibility(8);
                }
            } else if (qu80Var5 != null && qu80Var5.G.getVisibility() == 0 && (qu80Var = this.binding) != null) {
                qu80Var.G.setVisibility(8);
            }
            qu80 qu80Var6 = this.binding;
            if (qu80Var6 != null) {
                qu80Var6.M.setMax(s.getTotalMillis());
            }
            qu80 qu80Var7 = this.binding;
            if (qu80Var7 != null) {
                qu80Var7.N.setMax(s.getTotalMillis());
            }
            qu80 qu80Var8 = this.binding;
            if (qu80Var8 != null) {
                qu80Var8.D.setMax(s.getTotalMillis());
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
            if (f()) {
                e();
            } else {
                d();
            }
            qu80 qu80Var9 = this.binding;
            if (qu80Var9 != null) {
                qu80Var9.E.setVisibility(8);
            }
            qu80 qu80Var10 = this.binding;
            if (qu80Var10 != null) {
                qu80Var10.G.setVisibility(0);
            }
            qu80 qu80Var11 = this.binding;
            if (qu80Var11 != null) {
                qu80Var11.b.setVisibility(8);
            }
            qu80 qu80Var12 = this.binding;
            if (qu80Var12 != null) {
                qu80Var12.B.setVisibility(8);
            }
            qu80 qu80Var13 = this.binding;
            if (qu80Var13 != null) {
                qu80Var13.d.setVisibility(8);
            }
            if (this.animDone == 0 && this.animStart == 0) {
                this.animstartInitial = 1;
                this.animStart = 1;
                setSportyAnimations(800L);
            }
        }
        if (Intrinsics.g(s.getMessageType(), "ROUND_ONGOING")) {
            if (this.ongoingStart == 0 && this.animDone == 0 && this.animStart == 0) {
                this.animstartInitial = 1;
                this.ongoingStart = 1;
                setSportyAnimations(0L);
            }
            this.animDone = 0;
            this.timerInProgress = false;
            w5b.c(this.D, null);
            this.animStart = 0;
            boolean z2 = this.G;
            qu80 qu80Var14 = this.binding;
            if (z2) {
                if (qu80Var14 != null) {
                    qu80Var14.b.setVisibility(0);
                }
                qu80 qu80Var15 = this.binding;
                if (qu80Var15 != null) {
                    qu80Var15.B.setVisibility(8);
                }
            } else {
                if (qu80Var14 != null) {
                    qu80Var14.b.setVisibility(8);
                }
                qu80 qu80Var16 = this.binding;
                if (qu80Var16 != null) {
                    qu80Var16.B.setVisibility(0);
                }
                qu80 qu80Var17 = this.binding;
                if (qu80Var17 != null) {
                    qu80Var17.E.setVisibility(8);
                }
            }
            qu80 qu80Var18 = this.binding;
            if (qu80Var18 != null) {
                qu80Var18.b.setShadowLayer(20.0f, 0.0f, 0.0f, Color.parseColor("#4DFFFFFF"));
            }
            qu80 qu80Var19 = this.binding;
            if (qu80Var19 != null) {
                qu80Var19.B.setShadowLayer(20.0f, 0.0f, 0.0f, Color.parseColor("#4DFFFFFF"));
            }
            if (f()) {
                e();
            } else {
                d();
            }
            qu80 qu80Var20 = this.binding;
            if (qu80Var20 != null) {
                qu80Var20.d.setVisibility(8);
            }
            qu80 qu80Var21 = this.binding;
            if (qu80Var21 != null) {
                qu80Var21.G.setVisibility(0);
            }
            StringBuilder sb = this.L;
            sb.setLength(0);
            sb.append(s.getCurrentMultiplier());
            sb.append("x");
            qu80 qu80Var22 = this.binding;
            if (qu80Var22 != null) {
                qu80Var22.b.setText(sb.toString());
            }
            qu80 qu80Var23 = this.binding;
            if (qu80Var23 != null) {
                qu80Var23.B.setText(sb.toString());
            }
            String currentMultiplier = s.getCurrentMultiplier();
            if (currentMultiplier == null) {
                currentMultiplier = "";
            }
            a(currentMultiplier);
            Context context = this.a;
            if (context != null) {
                qu80 qu80Var24 = this.binding;
                if (qu80Var24 != null) {
                    qu80Var24.b.setTextColor(context.getColor(R.color.white));
                }
                qu80 qu80Var25 = this.binding;
                if (qu80Var25 != null) {
                    qu80Var25.B.setTextColor(context.getColor(R.color.white));
                }
            }
        }
        if (Intrinsics.g(s.getMessageType(), "ROUND_END_WAIT")) {
            qu80 qu80Var26 = this.binding;
            if (qu80Var26 != null) {
                r97.a(qu80Var26.b, s.getCurrentMultiplier(), "x");
            }
            qu80 qu80Var27 = this.binding;
            if (qu80Var27 != null) {
                r97.a(qu80Var27.B, s.getCurrentMultiplier(), "x");
            }
            String currentMultiplier2 = s.getCurrentMultiplier();
            a(currentMultiplier2 != null ? currentMultiplier2 : "");
            this.ongoingStart = 0;
            if (this.animstartInitial == 0) {
                this.animstartInitial = 1;
            }
            boolean z3 = this.G;
            qu80 qu80Var28 = this.binding;
            if (z3) {
                if (qu80Var28 != null) {
                    qu80Var28.b.setVisibility(0);
                }
                qu80 qu80Var29 = this.binding;
                if (qu80Var29 != null) {
                    qu80Var29.B.setVisibility(8);
                }
                qu80 qu80Var30 = this.binding;
                if (qu80Var30 != null) {
                    qu80Var30.d.setVisibility(0);
                }
            } else {
                if (qu80Var28 != null) {
                    qu80Var28.b.setVisibility(8);
                }
                qu80 qu80Var31 = this.binding;
                if (qu80Var31 != null) {
                    qu80Var31.B.setVisibility(0);
                }
                qu80 qu80Var32 = this.binding;
                if (qu80Var32 != null) {
                    qu80Var32.d.setVisibility(8);
                }
            }
            qu80 qu80Var33 = this.binding;
            if (qu80Var33 != null) {
                qu80Var33.b.setShadowLayer(20.0f, 0.0f, 0.0f, Color.parseColor("#4DFF1B1B"));
            }
            qu80 qu80Var34 = this.binding;
            if (qu80Var34 != null) {
                qu80Var34.B.setShadowLayer(20.0f, 0.0f, 0.0f, Color.parseColor("#4DFF1B1B"));
            }
            qu80 qu80Var35 = this.binding;
            if (qu80Var35 != null) {
                qu80Var35.j0.setVisibility(8);
            }
            qu80 qu80Var36 = this.binding;
            if (qu80Var36 != null) {
                qu80Var36.m0.setVisibility(8);
            }
            qu80 qu80Var37 = this.binding;
            if (qu80Var37 != null) {
                qu80Var37.E.setVisibility(8);
            }
            qu80 qu80Var38 = this.binding;
            if (qu80Var38 != null) {
                qu80Var38.G.setVisibility(0);
            }
            Context context2 = this.a;
            if (context2 != null) {
                boolean z4 = this.C;
                qu80 qu80Var39 = this.binding;
                if (z4) {
                    if (qu80Var39 != null) {
                        qu80Var39.b.setTextColor(context2.getColor(R.color.valentine));
                    }
                    qu80 qu80Var40 = this.binding;
                    if (qu80Var40 != null) {
                        qu80Var40.B.setTextColor(context2.getColor(R.color.valentine));
                    }
                } else if (qu80Var39 != null) {
                    qu80Var39.b.setTextColor(context2.getColor(R.color.sh_seekbar));
                }
                qu80 qu80Var41 = this.binding;
                if (qu80Var41 != null) {
                    qu80Var41.B.setTextColor(context2.getColor(R.color.sh_seekbar));
                }
            }
            if (this.endAnimDone == 0 && f()) {
                qu80 qu80Var42 = this.binding;
                if (qu80Var42 != null) {
                    float x = qu80Var42.c.getX();
                    qu80 qu80Var43 = this.binding;
                    if (qu80Var43 != null) {
                        float y = qu80Var43.c.getY();
                        translateAnimation = new TranslateAnimation(x, 1050.0f + x, y, (-y) - 730.0f);
                    } else {
                        translateAnimation = null;
                    }
                } else {
                    translateAnimation = null;
                }
                qu80 qu80Var44 = this.binding;
                if (qu80Var44 != null) {
                    qu80Var44.c.setAlpha(0.5f);
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
                qu80 qu80Var45 = this.binding;
                if (qu80Var45 != null) {
                    qu80Var45.f.startAnimation(translateAnimation);
                }
                qu80 qu80Var46 = this.binding;
                if (qu80Var46 != null) {
                    qu80Var46.Y.startAnimation(translateAnimation);
                }
                ej5.c(this.F, null, null, new d(null), 3);
            }
        }
    }

    public final void setNestedDimens(float deviceHeight, float deviceWidth) {
        if (deviceHeight == 0.0f || deviceWidth == 0.0f) {
            return;
        }
        Float fValueOf = Float.valueOf(0.113f);
        float f2 = deviceHeight / deviceWidth;
        Float fValueOf2 = Float.valueOf(0.03f);
        Map mapA = dgb.a("view_bottom_height", fValueOf2);
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

    public final void setSkeletonName(File file) {
        this.skeletonName = file;
    }

    public final void setSpine() {
        if (!f() || this.atlasName == null || this.skeletonName == null) {
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
            if (f()) {
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new g(null), 3);
            }
        } catch (Exception unused) {
        }
    }

    public final void setXmasTheme() {
        if (f()) {
            this.B = true;
            qu80 qu80Var = this.binding;
            if (qu80Var != null) {
                qu80Var.V.setVisibility(0);
            }
        }
    }

    public ShMultiplierContainer(Context context) {
        this(context, null);
    }
}
