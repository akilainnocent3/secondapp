package com.sportygames.pocketrocket.component;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportygames.pocketrocket.component.MultiplierContainer;
import com.sportygames.pocketrocket.model.response.GameSocektResponse;
import defpackage.bmy;
import defpackage.c0d;
import defpackage.dqw;
import defpackage.ej5;
import defpackage.fqw;
import defpackage.fse;
import defpackage.gku;
import defpackage.gqw;
import defpackage.h5e;
import defpackage.hkd;
import defpackage.ib5;
import defpackage.j1b;
import defpackage.jpu;
import defpackage.l48;
import defpackage.op5;
import defpackage.pfd;
import defpackage.ssw;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.w5b;
import defpackage.wcl;
import defpackage.y5b;
import defpackage.ypa0;
import defpackage.zk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0019\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R(\u0010/\u001a\b\u0012\u0004\u0012\u00020\f0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R(\u00103\u001a\b\u0012\u0004\u0012\u00020\f0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010$\u001a\u0004\b1\u0010&\"\u0004\b2\u0010(R(\u00107\u001a\b\u0012\u0004\u0012\u00020\f0\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010$\u001a\u0004\b5\u0010&\"\u0004\b6\u0010(R\u0019\u0010=\u001a\u0004\u0018\u0001088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010C\u001a\u0004\u0018\u00010>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\"\u0010E\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010\u0014\u001a\u0004\bE\u0010\u0016\"\u0004\b.\u0010\u0018R\"\u0010G\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010\u0014\u001a\u0004\bG\u0010\u0016\"\u0004\b2\u0010\u0018R\"\u0010I\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\u0014\u001a\u0004\bI\u0010\u0016\"\u0004\b6\u0010\u0018¨\u0006J"}, d2 = {"Lcom/sportygames/pocketrocket/component/MultiplierContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/sportygames/pocketrocket/model/response/GameSocektResponse;", "s", "Lypa0;", "soundViewModel", "", "gameLoaded", "", "setMultiplier", "(Lcom/sportygames/pocketrocket/model/response/GameSocektResponse;Lypa0;Z)V", "setEarth", "()V", "b", "Z", "getTimerInProgress", "()Z", "setTimerInProgress", "(Z)V", "timerInProgress", "Lgqw;", "c", "Lgqw;", "getBinding", "()Lgqw;", "setBinding", "(Lgqw;)V", "binding", "Lssw;", "G", "Lssw;", "isRoundEnd", "()Lssw;", "setRoundEnd", "(Lssw;)V", "H", "isRoundPreStart", "setRoundPreStart", "J", "getRedRocketFired", "setRedRocketFired", "redRocketFired", "K", "getPurpleRocketFired", "setPurpleRocketFired", "purpleRocketFired", "L", "getBlueRocketFired", "setBlueRocketFired", "blueRocketFired", "Landroid/util/DisplayMetrics;", "e0", "Landroid/util/DisplayMetrics;", "getDisplayMetrics", "()Landroid/util/DisplayMetrics;", "displayMetrics", "", "f0", "Ljava/lang/Double;", "getHeight", "()Ljava/lang/Double;", "height", "g0", "isRedRocketFired", "h0", "isPurpleRocketFired", "i0", "isBlueRocketFired", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MultiplierContainer extends LinearLayout {
    public static final /* synthetic */ int k0 = 0;
    public final TranslateAnimation A;
    public final TranslateAnimation B;
    public final TranslateAnimation C;
    public boolean D;
    public boolean E;
    public boolean F;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ssw<Boolean> isRoundEnd;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public ssw<Boolean> isRoundPreStart;
    public boolean I;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public ssw<Boolean> redRocketFired;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public ssw<Boolean> purpleRocketFired;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public ssw<Boolean> blueRocketFired;
    public final ArrayList M;
    public final Pair<Float, Float>[] N;
    public Handler O;
    public final List<Pair<Float, Float>> P;
    public final List<View> Q;
    public final HashMap<String, Pair<Float, Float>> R;
    public ObjectAnimator S;
    public ObjectAnimator T;
    public ObjectAnimator U;
    public final j1b V;
    public final List<ImageView> W;
    public final Context a;
    public AnimatorSet a0;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean timerInProgress;
    public final LinkedHashMap b0;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public gqw binding;
    public ScaleAnimation c0;
    public j1b d;
    public ScaleAnimation d0;
    public int e;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public final DisplayMetrics displayMetrics;
    public int f;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public final Double height;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public boolean isRedRocketFired;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    public boolean isPurpleRocketFired;
    public boolean i;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public boolean isBlueRocketFired;
    public boolean j0;
    public boolean v;
    public boolean w;
    public Function0<Unit> y;
    public final j1b z;

    @c0d(c = "com.sportygames.pocketrocket.component.MultiplierContainer$asteroidAnimation$1", f = "MultiplierContainer.kt", l = {826, 832, 843}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public Pair b;
        public ImageView c;
        public int d;
        public final /* synthetic */ LinkedHashMap f;
        public final /* synthetic */ List<ImageView> i;
        public final /* synthetic */ int v;
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LinkedHashMap linkedHashMap, List list, int i, int i2, v1b v1bVar) {
            super(2, v1bVar);
            this.f = linkedHashMap;
            this.i = list;
            this.v = i;
            this.w = i2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return MultiplierContainer.this.new a(this.f, this.i, this.v, this.w, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0037 A[LOOP:0: B:14:0x0038->B:13:0x0037, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:19:0x0043  */
        /* JADX WARN: Code duplicated, block: B:24:0x0089  */
        /* JADX WARN: Code duplicated, block: B:27:0x009d  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a5 A[PHI: r1 r7
          0x00a5: PHI (r1v1 int) = (r1v2 int), (r1v3 int) binds: [B:28:0x009f, B:23:0x0087] A[DONT_GENERATE, DONT_INLINE]
          0x00a5: PHI (r7v0 kotlin.Pair) = (r7v12 kotlin.Pair), (r7v20 kotlin.Pair) binds: [B:28:0x009f, B:23:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:35:0x00de  */
        /* JADX WARN: Code duplicated, block: B:38:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:46:0x0055 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x010f, code lost:
        
            if (defpackage.hkd.b(7000, r11) == r0) goto L41;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x010f -> B:42:0x0112). Please report as a decompilation issue!!! */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 278
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportygames.pocketrocket.component.MultiplierContainer.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.pocketrocket.component.MultiplierContainer$ongoingStoppedFlyingAnimation$1", f = "MultiplierContainer.kt", l = {619, 633, 649}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ImageView b;
        public final /* synthetic */ MultiplierContainer c;
        public final /* synthetic */ TextView d;
        public final /* synthetic */ TextView e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ImageView imageView, MultiplierContainer multiplierContainer, TextView textView, TextView textView2, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = imageView;
            this.c = multiplierContainer;
            this.d = textView;
            this.e = textView2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0073  */
        /* JADX WARN: Code duplicated, block: B:28:0x007a  */
        /* JADX WARN: Code duplicated, block: B:31:0x009b  */
        /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
        
            if (defpackage.hkd.b(110, r21) == r1) goto L36;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r0 = r21
                y5b r1 = defpackage.y5b.a
                int r2 = r0.a
                r3 = 110(0x6e, double:5.43E-322)
                r5 = 220(0xdc, double:1.087E-321)
                r7 = 3
                r8 = 2
                r9 = 1
                android.widget.ImageView r10 = r0.b
                com.sportygames.pocketrocket.component.MultiplierContainer r11 = r0.c
                if (r2 == 0) goto L2d
                if (r2 == r9) goto L29
                if (r2 == r8) goto L25
                if (r2 != r7) goto L1e
                defpackage.uj50.b(r22)
                goto Lb0
            L1e:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r0)
                r0 = 0
                return r0
            L25:
                defpackage.uj50.b(r22)
                goto L6e
            L29:
                defpackage.uj50.b(r22)
                goto L3c
            L2d:
                defpackage.uj50.b(r22)
                r0.a = r9
                r12 = 270(0x10e, double:1.334E-321)
                java.lang.Object r2 = defpackage.hkd.b(r12, r0)
                if (r2 != r1) goto L3c
                goto Laf
            L3c:
                if (r10 == 0) goto L43
                android.view.animation.ScaleAnimation r2 = r11.c0
                r10.setAnimation(r2)
            L43:
                android.view.animation.ScaleAnimation r12 = new android.view.animation.ScaleAnimation
                r19 = 1
                r20 = 1056964608(0x3f000000, float:0.5)
                r13 = 1058642330(0x3f19999a, float:0.6)
                r14 = 0
                r15 = 1058642330(0x3f19999a, float:0.6)
                r16 = 0
                r17 = 1
                r18 = 1056964608(0x3f000000, float:0.5)
                r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
                r11.c0 = r12
                r12.setDuration(r5)
                if (r10 == 0) goto L65
                android.view.animation.ScaleAnimation r2 = r11.c0
                r10.setAnimation(r2)
            L65:
                r0.a = r8
                java.lang.Object r2 = defpackage.hkd.b(r3, r0)
                if (r2 != r1) goto L6e
                goto Laf
            L6e:
                r2 = 0
                android.widget.TextView r8 = r0.d
                if (r8 == 0) goto L76
                r8.setVisibility(r2)
            L76:
                android.widget.TextView r9 = r0.e
                if (r9 == 0) goto L7d
                r9.setVisibility(r2)
            L7d:
                android.view.animation.ScaleAnimation r12 = new android.view.animation.ScaleAnimation
                r19 = 1
                r20 = 1056964608(0x3f000000, float:0.5)
                r13 = 1045220557(0x3e4ccccd, float:0.2)
                r14 = 1065353216(0x3f800000, float:1.0)
                r15 = 1045220557(0x3e4ccccd, float:0.2)
                r16 = 1065353216(0x3f800000, float:1.0)
                r17 = 1
                r18 = 1056964608(0x3f000000, float:0.5)
                r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
                r11.d0 = r12
                r12.setDuration(r5)
                if (r9 == 0) goto La0
                android.view.animation.ScaleAnimation r2 = r11.d0
                r9.setAnimation(r2)
            La0:
                if (r8 == 0) goto La7
                android.view.animation.ScaleAnimation r2 = r11.d0
                r8.setAnimation(r2)
            La7:
                r0.a = r7
                java.lang.Object r0 = defpackage.hkd.b(r3, r0)
                if (r0 != r1) goto Lb0
            Laf:
                return r1
            Lb0:
                if (r10 == 0) goto Lb6
                r0 = 4
                r10.setVisibility(r0)
            Lb6:
                kotlin.Unit r0 = kotlin.Unit.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportygames.pocketrocket.component.MultiplierContainer.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.pocketrocket.component.MultiplierContainer$setMultiplier$1", f = "MultiplierContainer.kt", l = {296}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public MultiplierContainer a;
        public int b;
        public int c;
        public int d;
        public int e;
        public /* synthetic */ Object f;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = MultiplierContainer.this.new c(v1bVar);
            cVar.f = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0030  */
        /* JADX WARN: Code duplicated, block: B:12:0x0034  */
        /* JADX WARN: Code duplicated, block: B:14:0x003e  */
        /* JADX WARN: Code duplicated, block: B:17:0x0059 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x005c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0057 -> B:18:0x005a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:14:0x003e
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = r9.f
                v5b r0 = (defpackage.v5b) r0
                y5b r0 = defpackage.y5b.a
                int r1 = r9.e
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 != r3) goto L1a
                int r1 = r9.d
                int r4 = r9.c
                int r5 = r9.b
                com.sportygames.pocketrocket.component.MultiplierContainer r6 = r9.a
                defpackage.uj50.b(r10)
                goto L5a
            L1a:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r9)
                return r2
            L20:
                defpackage.uj50.b(r10)
                com.sportygames.pocketrocket.component.MultiplierContainer r10 = com.sportygames.pocketrocket.component.MultiplierContainer.this
                int r1 = r10.f
                int r1 = r1 / 75
                r4 = 0
                r6 = r10
                r5 = r4
                r4 = r1
                r1 = r5
            L2e:
                if (r1 >= r4) goto L5c
                int r10 = r6.e
                if (r10 <= 0) goto L45
                int r10 = r10 + (-75)
                r6.e = r10
                gqw r10 = r6.getBinding()
                if (r10 == 0) goto L45
                android.widget.SeekBar r10 = r10.d0
                int r7 = r6.e
                r10.setProgress(r7)
            L45:
                r9.f = r2
                r9.a = r6
                r9.b = r5
                r9.c = r4
                r9.d = r1
                r9.e = r3
                r7 = 75
                java.lang.Object r10 = defpackage.hkd.b(r7, r9)
                if (r10 != r0) goto L5a
                return r0
            L5a:
                int r1 = r1 + r3
                goto L2e
            L5c:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportygames.pocketrocket.component.MultiplierContainer.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d implements Animator.AnimatorListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ MultiplierContainer b;

        @c0d(c = "com.sportygames.pocketrocket.component.MultiplierContainer$shootingStarAnimation$2$onAnimationEnd$1", f = "MultiplierContainer.kt", l = {804}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ View b;
            public final /* synthetic */ MultiplierContainer c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view, MultiplierContainer multiplierContainer, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = view;
                this.c = multiplierContainer;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, this.c, v1bVar);
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
                    if (hkd.b(12000L, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                View view = this.b;
                view.setVisibility(0);
                int i2 = MultiplierContainer.k0;
                this.c.h(view);
                return Unit.a;
            }
        }

        public d(View view, MultiplierContainer multiplierContainer) {
            this.a = view;
            this.b = multiplierContainer;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            animator.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            animator.getClass();
            View view = this.a;
            view.setVisibility(8);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            MultiplierContainer multiplierContainer = this.b;
            ej5.c(multiplierContainer.z, null, null, new a(view, multiplierContainer, null), 3);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            animator.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            animator.getClass();
        }
    }

    @c0d(c = "com.sportygames.pocketrocket.component.MultiplierContainer$translateRocket$1", f = "MultiplierContainer.kt", l = {705}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ View c;
        public final /* synthetic */ ImageView d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view, ImageView imageView, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.c = view;
            this.d = imageView;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return MultiplierContainer.this.new e(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            MultiplierContainer multiplierContainer = MultiplierContainer.this;
            if (i == 0) {
                uj50.b(obj);
                Double height = multiplierContainer.getHeight();
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -((float) ((height != null ? height.doubleValue() : 1.0d) * 0.28d)));
                translateAnimation.setDuration(500L);
                translateAnimation.setFillAfter(true);
                this.c.startAnimation(translateAnimation);
                this.a = 1;
                if (hkd.b(500L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.0f);
            multiplierContainer.c0 = scaleAnimation;
            scaleAnimation.setDuration(500L);
            ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setAnimation(multiplierContainer.c0);
            }
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiplierContainer(Context context, AttributeSet attributeSet) {
        ViewGroup.LayoutParams layoutParams;
        Resources resources;
        super(context, attributeSet);
        Float fValueOf = Float.valueOf(0.6f);
        Float fValueOf2 = Float.valueOf(0.14f);
        Float fValueOf3 = Float.valueOf(0.25f);
        Float fValueOf4 = Float.valueOf(0.16f);
        this.a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.multiplier_container, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.background_one;
        ImageView imageView = (ImageView) h5e.a(R.id.background_one, viewInflate);
        if (imageView != null) {
            i = R.id.background_two;
            ImageView imageView2 = (ImageView) h5e.a(R.id.background_two, viewInflate);
            if (imageView2 != null) {
                i = R.id.blue_cloud;
                ImageView imageView3 = (ImageView) h5e.a(R.id.blue_cloud, viewInflate);
                if (imageView3 != null) {
                    i = R.id.blue_crashed_text;
                    TextView textView = (TextView) h5e.a(R.id.blue_crashed_text, viewInflate);
                    if (textView != null) {
                        i = R.id.blue_fire_layout;
                        if (((ConstraintLayout) h5e.a(R.id.blue_fire_layout, viewInflate)) != null) {
                            i = R.id.blue_layout;
                            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.blue_layout, viewInflate);
                            if (constraintLayout != null) {
                                i = R.id.blue_ongoing_layout;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.blue_ongoing_layout, viewInflate);
                                if (constraintLayout2 != null) {
                                    i = R.id.blue_ongoing_text;
                                    TextView textView2 = (TextView) h5e.a(R.id.blue_ongoing_text, viewInflate);
                                    if (textView2 != null) {
                                        i = R.id.blue_shadow;
                                        ImageView imageView4 = (ImageView) h5e.a(R.id.blue_shadow, viewInflate);
                                        if (imageView4 != null) {
                                            i = R.id.coefficient;
                                            TextView textView3 = (TextView) h5e.a(R.id.coefficient, viewInflate);
                                            if (textView3 != null) {
                                                i = R.id.earth;
                                                ImageView imageView5 = (ImageView) h5e.a(R.id.earth, viewInflate);
                                                if (imageView5 != null) {
                                                    i = R.id.earth_layout;
                                                    if (((ConstraintLayout) h5e.a(R.id.earth_layout, viewInflate)) != null) {
                                                        i = R.id.fbg;
                                                        if (((FrameLayout) h5e.a(R.id.fbg, viewInflate)) != null) {
                                                            i = R.id.fire;
                                                            ImageView imageView6 = (ImageView) h5e.a(R.id.fire, viewInflate);
                                                            if (imageView6 != null) {
                                                                i = R.id.fire_blue;
                                                                ImageView imageView7 = (ImageView) h5e.a(R.id.fire_blue, viewInflate);
                                                                if (imageView7 != null) {
                                                                    i = R.id.fire_pink;
                                                                    ImageView imageView8 = (ImageView) h5e.a(R.id.fire_pink, viewInflate);
                                                                    if (imageView8 != null) {
                                                                        i = R.id.line_1;
                                                                        View viewA = h5e.a(R.id.line_1, viewInflate);
                                                                        if (viewA != null) {
                                                                            i = R.id.line_2;
                                                                            View viewA2 = h5e.a(R.id.line_2, viewInflate);
                                                                            if (viewA2 != null) {
                                                                                i = R.id.line_3;
                                                                                View viewA3 = h5e.a(R.id.line_3, viewInflate);
                                                                                if (viewA3 != null) {
                                                                                    i = R.id.line_4;
                                                                                    View viewA4 = h5e.a(R.id.line_4, viewInflate);
                                                                                    if (viewA4 != null) {
                                                                                        i = R.id.line_5;
                                                                                        View viewA5 = h5e.a(R.id.line_5, viewInflate);
                                                                                        if (viewA5 != null) {
                                                                                            i = R.id.line_6;
                                                                                            View viewA6 = h5e.a(R.id.line_6, viewInflate);
                                                                                            if (viewA6 != null) {
                                                                                                i = R.id.mars;
                                                                                                ImageView imageView9 = (ImageView) h5e.a(R.id.mars, viewInflate);
                                                                                                if (imageView9 != null) {
                                                                                                    i = R.id.mars_layout;
                                                                                                    if (((ConstraintLayout) h5e.a(R.id.mars_layout, viewInflate)) != null) {
                                                                                                        i = R.id.mercury;
                                                                                                        ImageView imageView10 = (ImageView) h5e.a(R.id.mercury, viewInflate);
                                                                                                        if (imageView10 != null) {
                                                                                                            i = R.id.neptune;
                                                                                                            ImageView imageView11 = (ImageView) h5e.a(R.id.neptune, viewInflate);
                                                                                                            if (imageView11 != null) {
                                                                                                                i = R.id.neptune_layout;
                                                                                                                if (((ConstraintLayout) h5e.a(R.id.neptune_layout, viewInflate)) != null) {
                                                                                                                    i = R.id.pink_layout;
                                                                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.pink_layout, viewInflate);
                                                                                                                    if (constraintLayout3 != null) {
                                                                                                                        i = R.id.powering;
                                                                                                                        TextView textView4 = (TextView) h5e.a(R.id.powering, viewInflate);
                                                                                                                        if (textView4 != null) {
                                                                                                                            i = R.id.purple_cloud;
                                                                                                                            ImageView imageView12 = (ImageView) h5e.a(R.id.purple_cloud, viewInflate);
                                                                                                                            if (imageView12 != null) {
                                                                                                                                i = R.id.purple_crashed_text;
                                                                                                                                TextView textView5 = (TextView) h5e.a(R.id.purple_crashed_text, viewInflate);
                                                                                                                                if (textView5 != null) {
                                                                                                                                    i = R.id.purple_fire_layout;
                                                                                                                                    if (((ConstraintLayout) h5e.a(R.id.purple_fire_layout, viewInflate)) != null) {
                                                                                                                                        i = R.id.purple_ongoing_layout;
                                                                                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.purple_ongoing_layout, viewInflate);
                                                                                                                                        if (constraintLayout4 != null) {
                                                                                                                                            i = R.id.purple_ongoing_text;
                                                                                                                                            TextView textView6 = (TextView) h5e.a(R.id.purple_ongoing_text, viewInflate);
                                                                                                                                            if (textView6 != null) {
                                                                                                                                                i = R.id.purple_shadow;
                                                                                                                                                ImageView imageView13 = (ImageView) h5e.a(R.id.purple_shadow, viewInflate);
                                                                                                                                                if (imageView13 != null) {
                                                                                                                                                    i = R.id.red_cloud;
                                                                                                                                                    ImageView imageView14 = (ImageView) h5e.a(R.id.red_cloud, viewInflate);
                                                                                                                                                    if (imageView14 != null) {
                                                                                                                                                        i = R.id.red_crashed_text;
                                                                                                                                                        TextView textView7 = (TextView) h5e.a(R.id.red_crashed_text, viewInflate);
                                                                                                                                                        if (textView7 != null) {
                                                                                                                                                            i = R.id.red_fire_layout;
                                                                                                                                                            if (((ConstraintLayout) h5e.a(R.id.red_fire_layout, viewInflate)) != null) {
                                                                                                                                                                i = R.id.red_layout;
                                                                                                                                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.red_layout, viewInflate);
                                                                                                                                                                if (constraintLayout5 != null) {
                                                                                                                                                                    i = R.id.red_ongoing_layout;
                                                                                                                                                                    ConstraintLayout constraintLayout6 = (ConstraintLayout) h5e.a(R.id.red_ongoing_layout, viewInflate);
                                                                                                                                                                    if (constraintLayout6 != null) {
                                                                                                                                                                        i = R.id.red_ongoing_text;
                                                                                                                                                                        TextView textView8 = (TextView) h5e.a(R.id.red_ongoing_text, viewInflate);
                                                                                                                                                                        if (textView8 != null) {
                                                                                                                                                                            i = R.id.red_shadow;
                                                                                                                                                                            ImageView imageView15 = (ImageView) h5e.a(R.id.red_shadow, viewInflate);
                                                                                                                                                                            if (imageView15 != null) {
                                                                                                                                                                                i = R.id.rocket_blue;
                                                                                                                                                                                ImageView imageView16 = (ImageView) h5e.a(R.id.rocket_blue, viewInflate);
                                                                                                                                                                                if (imageView16 != null) {
                                                                                                                                                                                    i = R.id.rocket_image;
                                                                                                                                                                                    ImageView imageView17 = (ImageView) h5e.a(R.id.rocket_image, viewInflate);
                                                                                                                                                                                    if (imageView17 != null) {
                                                                                                                                                                                        i = R.id.rocket_purple;
                                                                                                                                                                                        ImageView imageView18 = (ImageView) h5e.a(R.id.rocket_purple, viewInflate);
                                                                                                                                                                                        if (imageView18 != null) {
                                                                                                                                                                                            i = R.id.saturn;
                                                                                                                                                                                            ImageView imageView19 = (ImageView) h5e.a(R.id.saturn, viewInflate);
                                                                                                                                                                                            if (imageView19 != null) {
                                                                                                                                                                                                i = R.id.seekbar;
                                                                                                                                                                                                SeekBar seekBar = (SeekBar) h5e.a(R.id.seekbar, viewInflate);
                                                                                                                                                                                                if (seekBar != null) {
                                                                                                                                                                                                    i = R.id.shootingStarImage;
                                                                                                                                                                                                    ImageView imageView20 = (ImageView) h5e.a(R.id.shootingStarImage, viewInflate);
                                                                                                                                                                                                    if (imageView20 != null) {
                                                                                                                                                                                                        i = R.id.space;
                                                                                                                                                                                                        ConstraintLayout constraintLayout7 = (ConstraintLayout) h5e.a(R.id.space, viewInflate);
                                                                                                                                                                                                        if (constraintLayout7 != null) {
                                                                                                                                                                                                            i = R.id.venus;
                                                                                                                                                                                                            ImageView imageView21 = (ImageView) h5e.a(R.id.venus, viewInflate);
                                                                                                                                                                                                            if (imageView21 != null) {
                                                                                                                                                                                                                i = R.id.wait;
                                                                                                                                                                                                                if (((FrameLayout) h5e.a(R.id.wait, viewInflate)) != null) {
                                                                                                                                                                                                                    i = R.id.wait_round;
                                                                                                                                                                                                                    ImageView imageView22 = (ImageView) h5e.a(R.id.wait_round, viewInflate);
                                                                                                                                                                                                                    if (imageView22 != null) {
                                                                                                                                                                                                                        i = R.id.waiting;
                                                                                                                                                                                                                        ConstraintLayout constraintLayout8 = (ConstraintLayout) h5e.a(R.id.waiting, viewInflate);
                                                                                                                                                                                                                        if (constraintLayout8 != null) {
                                                                                                                                                                                                                            i = R.id.waiting_layout;
                                                                                                                                                                                                                            ConstraintLayout constraintLayout9 = (ConstraintLayout) h5e.a(R.id.waiting_layout, viewInflate);
                                                                                                                                                                                                                            if (constraintLayout9 != null) {
                                                                                                                                                                                                                                i = R.id.waiting_text_layout;
                                                                                                                                                                                                                                if (((ConstraintLayout) h5e.a(R.id.waiting_text_layout, viewInflate)) != null) {
                                                                                                                                                                                                                                    this.binding = new gqw((CardView) viewInflate, imageView, imageView2, imageView3, textView, constraintLayout, constraintLayout2, textView2, imageView4, textView3, imageView5, imageView6, imageView7, imageView8, viewA, viewA2, viewA3, viewA4, viewA5, viewA6, imageView9, imageView10, imageView11, constraintLayout3, textView4, imageView12, textView5, constraintLayout4, textView6, imageView13, imageView14, textView7, constraintLayout5, constraintLayout6, textView8, imageView15, imageView16, imageView17, imageView18, imageView19, seekBar, imageView20, constraintLayout7, imageView21, imageView22, constraintLayout8, constraintLayout9);
                                                                                                                                                                                                                                    pfd pfdVar = fse.a;
                                                                                                                                                                                                                                    wcl wclVar = gku.a;
                                                                                                                                                                                                                                    this.d = w5b.a(wclVar);
                                                                                                                                                                                                                                    int i2 = 1;
                                                                                                                                                                                                                                    this.y = new zk(1);
                                                                                                                                                                                                                                    this.z = w5b.a(wclVar);
                                                                                                                                                                                                                                    this.isRoundEnd = new ssw<>();
                                                                                                                                                                                                                                    this.isRoundPreStart = new ssw<>();
                                                                                                                                                                                                                                    this.redRocketFired = new ssw<>();
                                                                                                                                                                                                                                    this.purpleRocketFired = new ssw<>();
                                                                                                                                                                                                                                    this.blueRocketFired = new ssw<>();
                                                                                                                                                                                                                                    ArrayList arrayListC0 = CollectionsKt.C0(kotlin.collections.b.k("earth_png", "saturn_png", "neptune_png", "mercury_png", "mars_png", "venus_png", "satellite_png", "space_station_png", "spaceship_png"));
                                                                                                                                                                                                                                    this.M = arrayListC0;
                                                                                                                                                                                                                                    this.N = new Pair[]{new Pair(Float.valueOf(0.7f), Float.valueOf(0.11f)), new Pair(Float.valueOf(0.3f), fValueOf4), new Pair(Float.valueOf(0.1f), fValueOf4), new Pair(Float.valueOf(0.34f), fValueOf4), new Pair(Float.valueOf(0.55f), fValueOf2), new Pair(Float.valueOf(0.2f), fValueOf2), new Pair(fValueOf, fValueOf3), new Pair(fValueOf, fValueOf3), new Pair(Float.valueOf(0.83f), fValueOf3)};
                                                                                                                                                                                                                                    this.P = kotlin.collections.b.k(new Pair(Float.valueOf(1.0f), Float.valueOf(680.0f)), new Pair(Float.valueOf(1.8f), Float.valueOf(800.0f)), new Pair(Float.valueOf(0.5f), Float.valueOf(700.0f)), new Pair(Float.valueOf(0.9f), Float.valueOf(600.0f)), new Pair(Float.valueOf(1.4f), Float.valueOf(850.0f)), new Pair(Float.valueOf(1.3f), Float.valueOf(750.0f)));
                                                                                                                                                                                                                                    gqw gqwVar = this.binding;
                                                                                                                                                                                                                                    this.Q = kotlin.collections.b.k(gqwVar != null ? gqwVar.D : null, gqwVar != null ? gqwVar.E : null, gqwVar != null ? gqwVar.F : null, gqwVar != null ? gqwVar.G : null, gqwVar != null ? gqwVar.H : null, gqwVar != null ? gqwVar.I : null);
                                                                                                                                                                                                                                    this.R = new HashMap<>();
                                                                                                                                                                                                                                    this.V = w5b.a(wclVar);
                                                                                                                                                                                                                                    gqw gqwVar2 = this.binding;
                                                                                                                                                                                                                                    this.W = kotlin.collections.b.k(gqwVar2 != null ? gqwVar2.z : null, gqwVar2 != null ? gqwVar2.c0 : null, gqwVar2 != null ? gqwVar2.L : null, gqwVar2 != null ? gqwVar2.K : null, gqwVar2 != null ? gqwVar2.J : null, gqwVar2 != null ? gqwVar2.g0 : null, gqwVar2 != null ? gqwVar2.z : null, gqwVar2 != null ? gqwVar2.c0 : null, gqwVar2 != null ? gqwVar2.L : null, gqwVar2 != null ? gqwVar2.K : null, gqwVar2 != null ? gqwVar2.J : null, gqwVar2 != null ? gqwVar2.g0 : null);
                                                                                                                                                                                                                                    this.a0 = new AnimatorSet();
                                                                                                                                                                                                                                    this.b0 = new LinkedHashMap();
                                                                                                                                                                                                                                    gqw gqwVar3 = this.binding;
                                                                                                                                                                                                                                    if (gqwVar3 != null) {
                                                                                                                                                                                                                                        gqwVar3.i0.setVisibility(8);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    gqw gqwVar4 = this.binding;
                                                                                                                                                                                                                                    if (gqwVar4 != null) {
                                                                                                                                                                                                                                        gqwVar4.y.setVisibility(8);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    int size = arrayListC0.size();
                                                                                                                                                                                                                                    for (int i3 = 0; i3 < size; i3++) {
                                                                                                                                                                                                                                        this.R.put((String) this.M.get(i3), this.N[i3]);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    Context context2 = this.a;
                                                                                                                                                                                                                                    DisplayMetrics displayMetrics = (context2 == null || (resources = context2.getResources()) == null) ? null : resources.getDisplayMetrics();
                                                                                                                                                                                                                                    this.displayMetrics = displayMetrics;
                                                                                                                                                                                                                                    double d2 = ((double) (displayMetrics != null ? displayMetrics.heightPixels : 1)) * 0.28d;
                                                                                                                                                                                                                                    this.height = Double.valueOf(d2);
                                                                                                                                                                                                                                    gqw gqwVar5 = this.binding;
                                                                                                                                                                                                                                    if (gqwVar5 != null && (layoutParams = gqwVar5.a0.getLayoutParams()) != null) {
                                                                                                                                                                                                                                        i2 = layoutParams.height;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    double d3 = d2 - ((0.13d * d2) + ((double) i2));
                                                                                                                                                                                                                                    gqw gqwVar6 = this.binding;
                                                                                                                                                                                                                                    int i4 = (int) d3;
                                                                                                                                                                                                                                    g(gqwVar6 != null ? gqwVar6.V : null, i4);
                                                                                                                                                                                                                                    gqw gqwVar7 = this.binding;
                                                                                                                                                                                                                                    g(gqwVar7 != null ? gqwVar7.M : null, i4);
                                                                                                                                                                                                                                    gqw gqwVar8 = this.binding;
                                                                                                                                                                                                                                    g(gqwVar8 != null ? gqwVar8.f : null, i4);
                                                                                                                                                                                                                                    float f = -((float) (d2 * 0.28d));
                                                                                                                                                                                                                                    float f2 = 15.0f + f;
                                                                                                                                                                                                                                    this.A = new TranslateAnimation(0.0f, 0.0f, f, f2);
                                                                                                                                                                                                                                    this.B = new TranslateAnimation(0.0f, 0.0f, f, f2);
                                                                                                                                                                                                                                    this.C = new TranslateAnimation(0.0f, 0.0f, f, f2);
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

    public static void a(ImageView imageView, ObjectAnimator objectAnimator) {
        if (imageView != null) {
            imageView.setPivotY(0.0f);
        }
        if (objectAnimator != null) {
            objectAnimator.setRepeatCount(-1);
        }
        if (objectAnimator != null) {
            objectAnimator.setRepeatMode(2);
        }
        if (objectAnimator != null) {
            objectAnimator.setDuration(100L);
        }
        if (objectAnimator != null) {
            objectAnimator.start();
        }
    }

    public static void g(ConstraintLayout constraintLayout, int i) {
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i;
            }
            constraintLayout.setLayoutParams(layoutParams2);
        }
    }

    public static void k(ConstraintLayout constraintLayout, TranslateAnimation translateAnimation) {
        translateAnimation.setDuration(500L);
        translateAnimation.setRepeatCount(-1);
        translateAnimation.setRepeatMode(2);
        translateAnimation.setFillAfter(true);
        constraintLayout.startAnimation(translateAnimation);
    }

    public static void l(ImageView imageView, ObjectAnimator objectAnimator) {
        if (imageView != null) {
            imageView.setPivotY(0.0f);
        }
        if (objectAnimator != null) {
            objectAnimator.setRepeatCount(-1);
        }
        if (objectAnimator != null) {
            objectAnimator.setRepeatMode(2);
        }
        if (objectAnimator != null) {
            objectAnimator.setDuration(100L);
        }
        if (objectAnimator != null) {
            objectAnimator.start();
        }
    }

    public final void b() {
        gqw gqwVar = this.binding;
        int width = gqwVar != null ? gqwVar.f0.getWidth() : 1;
        gqw gqwVar2 = this.binding;
        int height = gqwVar2 != null ? gqwVar2.f0.getHeight() : 1;
        List listT0 = CollectionsKt.t0(kotlin.collections.a.d(this.W), 9);
        Set<Map.Entry<String, Pair<Float, Float>>> setEntrySet = this.R.entrySet();
        setEntrySet.getClass();
        List listD = kotlin.collections.a.d(setEntrySet);
        int iA = jpu.a(l48.r(listD, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        ArrayList arrayList = (ArrayList) listD;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Map.Entry entry = (Map.Entry) obj;
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        ej5.c(this.V, null, null, new a(linkedHashMap, listT0, width, height, null), 3);
    }

    public final void c() {
        MultiplierContainer multiplierContainer;
        int i = 0;
        for (Object obj : this.Q) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.b.q();
                throw null;
            }
            View view = (View) obj;
            Pair<Float, Float> pair = this.P.get(i);
            float fFloatValue = pair.a.floatValue();
            float fFloatValue2 = pair.b.floatValue();
            if (view != null) {
                gqw gqwVar = this.binding;
                Handler handler = new Handler(Looper.getMainLooper());
                this.O = handler;
                multiplierContainer = this;
                handler.post(new fqw(multiplierContainer, view, 2.0f * (gqwVar != null ? gqwVar.f0.getHeight() : 1), fFloatValue2, (long) (1000.0f / fFloatValue)));
                view.setVisibility(0);
            } else {
                multiplierContainer = this;
            }
            i = i2;
            this = multiplierContainer;
        }
    }

    public final void d(ImageView imageView, TextView textView, TextView textView2) {
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        if (textView != null) {
            textView.setVisibility(8);
        }
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 0.6f, 0.0f, 0.6f, 1, 0.5f, 1, 0.5f);
        this.c0 = scaleAnimation;
        scaleAnimation.setDuration(220L);
        if (imageView != null) {
            imageView.setAnimation(this.c0);
        }
        ej5.c(this.z, null, null, new b(imageView, this, textView, textView2, null), 3);
    }

    public final void e() {
        this.j0 = true;
        this.I = false;
        this.i = false;
        this.v = false;
        this.w = false;
        i();
    }

    public final void f(float f, float f2) {
        ObjectAnimator objectAnimator = this.T;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.S;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        ObjectAnimator objectAnimator3 = this.U;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        gqw gqwVar = this.binding;
        this.T = ObjectAnimator.ofFloat(gqwVar != null ? gqwVar.B : null, "scaleY", f, f2);
        gqw gqwVar2 = this.binding;
        this.S = ObjectAnimator.ofFloat(gqwVar2 != null ? gqwVar2.A : null, "scaleY", f, f2);
        gqw gqwVar3 = this.binding;
        this.U = ObjectAnimator.ofFloat(gqwVar3 != null ? gqwVar3.C : null, "scaleY", f, f2);
    }

    public final gqw getBinding() {
        return this.binding;
    }

    public final ssw<Boolean> getBlueRocketFired() {
        return this.blueRocketFired;
    }

    public final DisplayMetrics getDisplayMetrics() {
        return this.displayMetrics;
    }

    @Override // android.view.View
    public final Double getHeight() {
        return this.height;
    }

    public final ssw<Boolean> getPurpleRocketFired() {
        return this.purpleRocketFired;
    }

    public final ssw<Boolean> getRedRocketFired() {
        return this.redRocketFired;
    }

    public final boolean getTimerInProgress() {
        return this.timerInProgress;
    }

    public final void h(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", 200.0f, -650.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "translationY", -50.0f, 450.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.setDuration(7000L);
        animatorSet.setInterpolator(new LinearInterpolator());
        this.a0 = animatorSet;
        animatorSet.addListener(new d(view, this));
        this.a0.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        Handler handler = this.O;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.O = null;
        LinkedHashMap linkedHashMap = this.b0;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) ((Map.Entry) it.next()).getValue();
            ((ValueAnimator) pair.a).cancel();
            ((ObjectAnimator) pair.b).cancel();
        }
        linkedHashMap.clear();
        int i = 0;
        for (Object obj : this.Q) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.b.q();
                throw null;
            }
            View view = (View) obj;
            if (view != null) {
                view.setVisibility(8);
            }
            i = i2;
        }
    }

    public final void j(View view, ImageView imageView) {
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new e(view, imageView, null), 3);
    }

    public final void setBinding(gqw gqwVar) {
        this.binding = gqwVar;
    }

    public final void setBlueRocketFired(ssw<Boolean> sswVar) {
        sswVar.getClass();
        this.blueRocketFired = sswVar;
    }

    public final void setEarth() {
        try {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setDuration(10000L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cqw
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i = MultiplierContainer.k0;
                    float fFloatValue = ((Float) flk.a(valueAnimator)).floatValue();
                    MultiplierContainer multiplierContainer = this.a;
                    gqw gqwVar = multiplierContainer.binding;
                    float height = gqwVar != null ? gqwVar.b.getHeight() : 0.0f;
                    float f = fFloatValue * height;
                    gqw gqwVar2 = multiplierContainer.binding;
                    if (gqwVar2 != null) {
                        gqwVar2.b.setTranslationY(f);
                    }
                    gqw gqwVar3 = multiplierContainer.binding;
                    if (gqwVar3 != null) {
                        gqwVar3.c.setTranslationY(f - height);
                    }
                }
            });
            valueAnimatorOfFloat.start();
            gqw gqwVar = this.binding;
            if (gqwVar != null) {
                h(gqwVar.e0);
            }
            b();
            this.y = new dqw(valueAnimatorOfFloat, 0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void setMultiplier(GameSocektResponse s, ypa0 soundViewModel, boolean gameLoaded) {
        gqw gqwVar;
        s.getClass();
        soundViewModel.getClass();
        if (Intrinsics.g(s.getMessageType(), "ROUND_WAITING") && !this.timerInProgress) {
            this.I = false;
            this.isRedRocketFired = false;
            this.isPurpleRocketFired = false;
            this.isBlueRocketFired = false;
            this.D = false;
            this.F = false;
            this.E = false;
            i();
            this.isRoundEnd.j(Boolean.TRUE);
            gqw gqwVar2 = this.binding;
            if (gqwVar2 != null) {
                gqwVar2.i0.setVisibility(0);
                Unit unit = Unit.a;
            }
            gqw gqwVar3 = this.binding;
            if (gqwVar3 != null) {
                gqwVar3.V.clearAnimation();
                Unit unit2 = Unit.a;
            }
            gqw gqwVar4 = this.binding;
            if (gqwVar4 != null) {
                gqwVar4.f.clearAnimation();
                Unit unit3 = Unit.a;
            }
            gqw gqwVar5 = this.binding;
            if (gqwVar5 != null) {
                gqwVar5.M.clearAnimation();
                Unit unit4 = Unit.a;
            }
            gqw gqwVar6 = this.binding;
            if (gqwVar6 != null) {
                gqwVar6.V.setVisibility(0);
                Unit unit5 = Unit.a;
            }
            gqw gqwVar7 = this.binding;
            if (gqwVar7 != null) {
                gqwVar7.f.setVisibility(0);
                Unit unit6 = Unit.a;
            }
            gqw gqwVar8 = this.binding;
            if (gqwVar8 != null) {
                gqwVar8.M.setVisibility(0);
                Unit unit7 = Unit.a;
            }
            gqw gqwVar9 = this.binding;
            if (gqwVar9 != null) {
                gqwVar9.y.setVisibility(8);
                Unit unit8 = Unit.a;
            }
            gqw gqwVar10 = this.binding;
            if (gqwVar10 != null) {
                gqwVar10.Y.setVisibility(8);
                Unit unit9 = Unit.a;
            }
            gqw gqwVar11 = this.binding;
            if (gqwVar11 != null) {
                gqwVar11.S.setVisibility(8);
                Unit unit10 = Unit.a;
            }
            gqw gqwVar12 = this.binding;
            if (gqwVar12 != null) {
                gqwVar12.w.setVisibility(8);
                Unit unit11 = Unit.a;
            }
            gqw gqwVar13 = this.binding;
            if (gqwVar13 != null) {
                gqwVar13.W.setVisibility(8);
                Unit unit12 = Unit.a;
            }
            gqw gqwVar14 = this.binding;
            if (gqwVar14 != null) {
                gqwVar14.i.setVisibility(8);
                Unit unit13 = Unit.a;
            }
            gqw gqwVar15 = this.binding;
            if (gqwVar15 != null) {
                gqwVar15.Q.setVisibility(8);
                Unit unit14 = Unit.a;
            }
            gqw gqwVar16 = this.binding;
            if (gqwVar16 != null) {
                gqwVar16.B.setScaleX(0.2f);
                Unit unit15 = Unit.a;
            }
            gqw gqwVar17 = this.binding;
            if (gqwVar17 != null) {
                gqwVar17.C.setScaleX(0.2f);
                Unit unit16 = Unit.a;
            }
            gqw gqwVar18 = this.binding;
            if (gqwVar18 != null) {
                gqwVar18.A.setScaleX(0.2f);
                Unit unit17 = Unit.a;
            }
            f(0.1f, 0.35f);
            gqw gqwVar19 = this.binding;
            a(gqwVar19 != null ? gqwVar19.B : null, this.T);
            gqw gqwVar20 = this.binding;
            a(gqwVar20 != null ? gqwVar20.C : null, this.U);
            gqw gqwVar21 = this.binding;
            a(gqwVar21 != null ? gqwVar21.A : null, this.S);
            this.timerInProgress = true;
            pfd pfdVar = fse.a;
            wcl wclVar = gku.a;
            this.d = w5b.a(wclVar);
            this.e = s.getMillisLeft();
            this.f = s.getMillisLeft();
            gqw gqwVar22 = this.binding;
            if (gqwVar22 != null) {
                gqwVar22.j0.setVisibility(0);
                Unit unit18 = Unit.a;
            }
            gqw gqwVar23 = this.binding;
            if (gqwVar23 != null) {
                gqwVar23.d0.setMax(10000);
                Unit unit19 = Unit.a;
            }
            this.timerInProgress = true;
            this.d = w5b.a(wclVar);
            this.e = s.getMillisLeft() - 1000;
            this.f = s.getMillisLeft() - 1000;
            ej5.c(this.d, null, null, new c(null), 3);
        }
        boolean zG = Intrinsics.g(s.getMessageType(), "ROUND_PRE_START");
        Context context = this.a;
        if (zG) {
            this.isRedRocketFired = false;
            this.isPurpleRocketFired = false;
            this.isBlueRocketFired = false;
            gqw gqwVar24 = this.binding;
            if (gqwVar24 != null) {
                gqwVar24.i0.setVisibility(8);
                Unit unit20 = Unit.a;
            }
            this.timerInProgress = false;
            w5b.c(this.d, null);
            this.isRoundPreStart.j(Boolean.TRUE);
            this.I = true;
            gqw gqwVar25 = this.binding;
            if (gqwVar25 != null) {
                gqwVar25.B.setScaleX(0.5f);
                Unit unit21 = Unit.a;
            }
            gqw gqwVar26 = this.binding;
            if (gqwVar26 != null) {
                gqwVar26.C.setScaleX(0.5f);
                Unit unit22 = Unit.a;
            }
            gqw gqwVar27 = this.binding;
            if (gqwVar27 != null) {
                gqwVar27.A.setScaleX(0.5f);
                Unit unit23 = Unit.a;
            }
            if (context != null) {
                if (gameLoaded) {
                    String string = context.getString(R.string.rocket_launched);
                    string.getClass();
                    soundViewModel.A1(0L, string);
                }
                Unit unit24 = Unit.a;
            }
            this.D = false;
            this.F = false;
            this.E = false;
            f(0.2f, 0.6f);
            gqw gqwVar28 = this.binding;
            l(gqwVar28 != null ? gqwVar28.B : null, this.T);
            gqw gqwVar29 = this.binding;
            l(gqwVar29 != null ? gqwVar29.C : null, this.U);
            gqw gqwVar30 = this.binding;
            l(gqwVar30 != null ? gqwVar30.A : null, this.S);
            gqw gqwVar31 = this.binding;
            if (gqwVar31 != null) {
                gqwVar31.W.setVisibility(8);
                Unit unit25 = Unit.a;
            }
            gqw gqwVar32 = this.binding;
            if (gqwVar32 != null) {
                gqwVar32.Q.setVisibility(8);
                Unit unit26 = Unit.a;
            }
            gqw gqwVar33 = this.binding;
            if (gqwVar33 != null) {
                gqwVar33.i.setVisibility(8);
                Unit unit27 = Unit.a;
            }
            gqw gqwVar34 = this.binding;
            if (gqwVar34 != null) {
                gqwVar34.V.setVisibility(0);
                Unit unit28 = Unit.a;
            }
            gqw gqwVar35 = this.binding;
            if (gqwVar35 != null) {
                gqwVar35.f.setVisibility(0);
                Unit unit29 = Unit.a;
            }
            gqw gqwVar36 = this.binding;
            if (gqwVar36 != null) {
                gqwVar36.M.setVisibility(0);
                Unit unit30 = Unit.a;
            }
            c();
            gqw gqwVar37 = this.binding;
            if (gqwVar37 != null) {
                j(gqwVar37.V, gqwVar37.Y);
                Unit unit31 = Unit.a;
            }
            gqw gqwVar38 = this.binding;
            if (gqwVar38 != null) {
                j(gqwVar38.f, gqwVar38.w);
                Unit unit32 = Unit.a;
            }
            gqw gqwVar39 = this.binding;
            if (gqwVar39 != null) {
                j(gqwVar39.M, gqwVar39.S);
                Unit unit33 = Unit.a;
            }
        }
        if (Intrinsics.g(s.getMessageType(), "ROUND_ONGOING")) {
            this.timerInProgress = false;
            w5b.c(this.d, null);
            if (!this.I) {
                gqw gqwVar40 = this.binding;
                if (gqwVar40 != null) {
                    gqwVar40.B.setScaleX(0.5f);
                    Unit unit34 = Unit.a;
                }
                gqw gqwVar41 = this.binding;
                if (gqwVar41 != null) {
                    gqwVar41.C.setScaleX(0.5f);
                    Unit unit35 = Unit.a;
                }
                gqw gqwVar42 = this.binding;
                if (gqwVar42 != null) {
                    gqwVar42.A.setScaleX(0.5f);
                    Unit unit36 = Unit.a;
                }
                this.isRedRocketFired = false;
                this.isPurpleRocketFired = false;
                this.isBlueRocketFired = false;
                if (Intrinsics.g(s.getInfo().getRED().getStatus(), "FLYING")) {
                    gqw gqwVar43 = this.binding;
                    if (gqwVar43 != null) {
                        gqwVar43.W.setVisibility(8);
                        Unit unit37 = Unit.a;
                    }
                    gqw gqwVar44 = this.binding;
                    if (gqwVar44 != null) {
                        gqwVar44.V.setVisibility(0);
                        Unit unit38 = Unit.a;
                    }
                }
                if (Intrinsics.g(s.getInfo().getBLUE().getStatus(), "FLYING")) {
                    gqw gqwVar45 = this.binding;
                    if (gqwVar45 != null) {
                        gqwVar45.i.setVisibility(8);
                        Unit unit39 = Unit.a;
                    }
                    gqw gqwVar46 = this.binding;
                    if (gqwVar46 != null) {
                        gqwVar46.f.setVisibility(0);
                        Unit unit40 = Unit.a;
                    }
                }
                if (Intrinsics.g(s.getInfo().getPURPLE().getStatus(), "FLYING")) {
                    gqw gqwVar47 = this.binding;
                    if (gqwVar47 != null) {
                        gqwVar47.Q.setVisibility(8);
                        Unit unit41 = Unit.a;
                    }
                    gqw gqwVar48 = this.binding;
                    if (gqwVar48 != null) {
                        gqwVar48.M.setVisibility(0);
                        Unit unit42 = Unit.a;
                    }
                }
                f(0.2f, 0.6f);
                gqw gqwVar49 = this.binding;
                l(gqwVar49 != null ? gqwVar49.B : null, this.T);
                gqw gqwVar50 = this.binding;
                l(gqwVar50 != null ? gqwVar50.C : null, this.U);
                gqw gqwVar51 = this.binding;
                l(gqwVar51 != null ? gqwVar51.A : null, this.S);
                c();
                this.I = true;
            }
            Boolean boolD = this.isRoundPreStart.d();
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.g(boolD, bool)) {
                this.isRoundPreStart.j(bool);
            }
            if (context != null) {
                gqw gqwVar52 = this.binding;
                if (gqwVar52 != null) {
                    gqwVar52.y.setVisibility(0);
                    Unit unit43 = Unit.a;
                }
                gqw gqwVar53 = this.binding;
                if (gqwVar53 != null) {
                    gqwVar53.i0.setVisibility(8);
                    Unit unit44 = Unit.a;
                }
                gqw gqwVar54 = this.binding;
                if (gqwVar54 != null) {
                    gqwVar54.y.setTextSize(43.0f);
                    Unit unit45 = Unit.a;
                }
                gqw gqwVar55 = this.binding;
                if (gqwVar55 != null) {
                    gqwVar55.y.setTextColor(context.getColor(R.color.white));
                    Unit unit46 = Unit.a;
                }
                gqw gqwVar56 = this.binding;
                if (gqwVar56 != null) {
                    gqwVar56.y.setText(s.getCommonMultiplier() + "x");
                    Unit unit47 = Unit.a;
                }
                Unit unit48 = Unit.a;
            }
            if (Intrinsics.g(s.getInfo().getRED().getStatus(), "FLYING") && !this.D) {
                this.i = false;
                gqw gqwVar57 = this.binding;
                if (gqwVar57 != null) {
                    gqwVar57.W.setVisibility(8);
                    Unit unit49 = Unit.a;
                }
                gqw gqwVar58 = this.binding;
                if (gqwVar58 != null) {
                    gqwVar58.V.setVisibility(0);
                    Unit unit50 = Unit.a;
                }
                gqw gqwVar59 = this.binding;
                if (gqwVar59 != null) {
                    k(gqwVar59.V, this.A);
                    Unit unit51 = Unit.a;
                }
                this.D = true;
                gqw gqwVar60 = this.binding;
                if (gqwVar60 != null) {
                    gqwVar60.Y.setVisibility(0);
                    Unit unit52 = Unit.a;
                }
            }
            if (Intrinsics.g(s.getInfo().getBLUE().getStatus(), "FLYING") && !this.E) {
                this.w = false;
                gqw gqwVar61 = this.binding;
                if (gqwVar61 != null) {
                    gqwVar61.i.setVisibility(8);
                    Unit unit53 = Unit.a;
                }
                gqw gqwVar62 = this.binding;
                if (gqwVar62 != null) {
                    gqwVar62.f.setVisibility(0);
                    Unit unit54 = Unit.a;
                }
                gqw gqwVar63 = this.binding;
                if (gqwVar63 != null) {
                    k(gqwVar63.f, this.C);
                    Unit unit55 = Unit.a;
                }
                this.E = true;
                gqw gqwVar64 = this.binding;
                if (gqwVar64 != null) {
                    gqwVar64.w.setVisibility(0);
                    Unit unit56 = Unit.a;
                }
            }
            if (Intrinsics.g(s.getInfo().getPURPLE().getStatus(), "FLYING")) {
                if (!this.F) {
                    this.v = false;
                    gqw gqwVar65 = this.binding;
                    if (gqwVar65 != null) {
                        gqwVar65.Q.setVisibility(8);
                        Unit unit57 = Unit.a;
                    }
                    gqw gqwVar66 = this.binding;
                    if (gqwVar66 != null) {
                        gqwVar66.M.setVisibility(0);
                        Unit unit58 = Unit.a;
                    }
                    gqw gqwVar67 = this.binding;
                    if (gqwVar67 != null) {
                        k(gqwVar67.M, this.B);
                        Unit unit59 = Unit.a;
                    }
                    gqw gqwVar68 = this.binding;
                    if (gqwVar68 != null) {
                        gqwVar68.S.setVisibility(0);
                        Unit unit60 = Unit.a;
                    }
                }
                this.F = true;
            }
            if (Intrinsics.g(s.getInfo().getRED().getStatus(), "STOPPED_FLYING") && !this.i) {
                gqw gqwVar69 = this.binding;
                if (gqwVar69 != null) {
                    gqwVar69.V.clearAnimation();
                    Unit unit61 = Unit.a;
                }
                if (context != null) {
                    if (gameLoaded) {
                        String string2 = context.getString(R.string.rocket_crashed);
                        string2.getClass();
                        soundViewModel.A1(0L, string2);
                    }
                    Unit unit62 = Unit.a;
                }
                this.D = false;
                this.redRocketFired.j(bool);
                this.isRedRocketFired = true;
                gqw gqwVar70 = this.binding;
                if (gqwVar70 != null) {
                    gqwVar70.V.setVisibility(8);
                    Unit unit63 = Unit.a;
                }
                gqw gqwVar71 = this.binding;
                if (gqwVar71 != null) {
                    gqwVar71.X.setText(s.getInfo().getRED().getMultiplier() + "x");
                    Unit unit64 = Unit.a;
                }
                gqw gqwVar72 = this.binding;
                if (gqwVar72 != null) {
                    gqwVar72.W.setVisibility(0);
                    Unit unit65 = Unit.a;
                }
                gqw gqwVar73 = this.binding;
                d(gqwVar73 != null ? gqwVar73.T : null, gqwVar73 != null ? gqwVar73.U : null, gqwVar73 != null ? gqwVar73.X : null);
                this.i = true;
            }
            if (Intrinsics.g(s.getInfo().getPURPLE().getStatus(), "STOPPED_FLYING") && !this.v) {
                gqw gqwVar74 = this.binding;
                if (gqwVar74 != null) {
                    gqwVar74.M.clearAnimation();
                    Unit unit66 = Unit.a;
                }
                if (context != null) {
                    if (gameLoaded) {
                        String string3 = context.getString(R.string.rocket_crashed);
                        string3.getClass();
                        soundViewModel.A1(0L, string3);
                    }
                    Unit unit67 = Unit.a;
                }
                this.F = false;
                gqw gqwVar75 = this.binding;
                if (gqwVar75 != null) {
                    gqwVar75.M.setVisibility(8);
                    Unit unit68 = Unit.a;
                }
                this.purpleRocketFired.j(bool);
                this.isPurpleRocketFired = true;
                gqw gqwVar76 = this.binding;
                if (gqwVar76 != null) {
                    gqwVar76.R.setText(s.getInfo().getPURPLE().getMultiplier() + "x");
                    Unit unit69 = Unit.a;
                }
                gqw gqwVar77 = this.binding;
                if (gqwVar77 != null) {
                    gqwVar77.Q.setVisibility(0);
                    Unit unit70 = Unit.a;
                }
                gqw gqwVar78 = this.binding;
                d(gqwVar78 != null ? gqwVar78.O : null, gqwVar78 != null ? gqwVar78.P : null, gqwVar78 != null ? gqwVar78.R : null);
                this.v = true;
            }
            if (Intrinsics.g(s.getInfo().getBLUE().getStatus(), "STOPPED_FLYING") && !this.w) {
                gqw gqwVar79 = this.binding;
                if (gqwVar79 != null) {
                    gqwVar79.f.clearAnimation();
                    Unit unit71 = Unit.a;
                }
                if (context != null) {
                    if (gameLoaded) {
                        String string4 = context.getString(R.string.rocket_crashed);
                        string4.getClass();
                        soundViewModel.A1(0L, string4);
                    }
                    Unit unit72 = Unit.a;
                }
                this.E = false;
                this.blueRocketFired.j(bool);
                this.isBlueRocketFired = true;
                gqw gqwVar80 = this.binding;
                if (gqwVar80 != null) {
                    gqwVar80.f.setVisibility(8);
                    Unit unit73 = Unit.a;
                }
                gqw gqwVar81 = this.binding;
                if (gqwVar81 != null) {
                    gqwVar81.i.setVisibility(0);
                    Unit unit74 = Unit.a;
                }
                gqw gqwVar82 = this.binding;
                if (gqwVar82 != null) {
                    gqwVar82.v.setText(s.getInfo().getBLUE().getMultiplier() + "x");
                    Unit unit75 = Unit.a;
                }
                gqw gqwVar83 = this.binding;
                d(gqwVar83 != null ? gqwVar83.d : null, gqwVar83 != null ? gqwVar83.e : null, gqwVar83 != null ? gqwVar83.v : null);
                this.w = true;
            }
        }
        if (Intrinsics.g(s.getMessageType(), "ROUND_END_WAIT")) {
            this.I = false;
            gqw gqwVar84 = this.binding;
            if (gqwVar84 != null) {
                gqwVar84.y.setVisibility(0);
                Unit unit76 = Unit.a;
            }
            gqw gqwVar85 = this.binding;
            if (gqwVar85 != null) {
                gqwVar85.y.setText(context != null ? context.getString(R.string.round_ended) : null);
                Unit unit77 = Unit.a;
            }
            gqw gqwVar86 = this.binding;
            if (gqwVar86 != null) {
                gqwVar86.y.setTag(context != null ? context.getString(R.string.round_ended_cms) : null);
                Unit unit78 = Unit.a;
            }
            i();
            op5 op5Var = op5.a;
            gqw gqwVar87 = this.binding;
            op5.r(op5Var, kotlin.collections.b.f(gqwVar87 != null ? gqwVar87.y : null), null, 6);
            gqw gqwVar88 = this.binding;
            if (gqwVar88 != null) {
                gqwVar88.y.setTextSize(26.0f);
                Unit unit79 = Unit.a;
            }
            if (context != null && (gqwVar = this.binding) != null) {
                gqwVar.y.setTextColor(context.getColor(R.color.round_ended_color));
                Unit unit80 = Unit.a;
            }
            if (Intrinsics.g(s.getInfo().getRED().getStatus(), "STOPPED_FLYING") && !this.i) {
                gqw gqwVar89 = this.binding;
                if (gqwVar89 != null) {
                    gqwVar89.V.clearAnimation();
                    Unit unit81 = Unit.a;
                }
                if (context != null) {
                    if (gameLoaded) {
                        String string5 = context.getString(R.string.rocket_crashed);
                        string5.getClass();
                        soundViewModel.A1(0L, string5);
                    }
                    Unit unit82 = Unit.a;
                }
                this.D = false;
                gqw gqwVar90 = this.binding;
                if (gqwVar90 != null) {
                    gqwVar90.V.setVisibility(8);
                    Unit unit83 = Unit.a;
                }
                this.redRocketFired.j(Boolean.TRUE);
                this.isRedRocketFired = true;
                gqw gqwVar91 = this.binding;
                if (gqwVar91 != null) {
                    gqwVar91.W.setVisibility(0);
                    Unit unit84 = Unit.a;
                }
                gqw gqwVar92 = this.binding;
                if (gqwVar92 != null) {
                    gqwVar92.X.setText(s.getInfo().getRED().getMultiplier() + "x");
                    Unit unit85 = Unit.a;
                }
                gqw gqwVar93 = this.binding;
                d(gqwVar93 != null ? gqwVar93.T : null, gqwVar93 != null ? gqwVar93.U : null, gqwVar93 != null ? gqwVar93.X : null);
                this.i = true;
            }
            if (Intrinsics.g(s.getInfo().getPURPLE().getStatus(), "STOPPED_FLYING") && !this.v) {
                gqw gqwVar94 = this.binding;
                if (gqwVar94 != null) {
                    gqwVar94.M.clearAnimation();
                    Unit unit86 = Unit.a;
                }
                if (context != null) {
                    if (gameLoaded) {
                        String string6 = context.getString(R.string.rocket_crashed);
                        string6.getClass();
                        soundViewModel.A1(0L, string6);
                    }
                    Unit unit87 = Unit.a;
                }
                this.F = false;
                gqw gqwVar95 = this.binding;
                if (gqwVar95 != null) {
                    gqwVar95.M.setVisibility(8);
                    Unit unit88 = Unit.a;
                }
                this.purpleRocketFired.j(Boolean.TRUE);
                this.isPurpleRocketFired = true;
                gqw gqwVar96 = this.binding;
                if (gqwVar96 != null) {
                    gqwVar96.Q.setVisibility(0);
                    Unit unit89 = Unit.a;
                }
                gqw gqwVar97 = this.binding;
                if (gqwVar97 != null) {
                    gqwVar97.R.setText(s.getInfo().getPURPLE().getMultiplier() + "x");
                    Unit unit90 = Unit.a;
                }
                gqw gqwVar98 = this.binding;
                d(gqwVar98 != null ? gqwVar98.O : null, gqwVar98 != null ? gqwVar98.P : null, gqwVar98 != null ? gqwVar98.R : null);
                this.v = true;
            }
            if (Intrinsics.g(s.getInfo().getBLUE().getStatus(), "STOPPED_FLYING") && !this.w) {
                gqw gqwVar99 = this.binding;
                if (gqwVar99 != null) {
                    gqwVar99.f.clearAnimation();
                    Unit unit91 = Unit.a;
                }
                if (context != null) {
                    if (gameLoaded) {
                        String string7 = context.getString(R.string.rocket_crashed);
                        string7.getClass();
                        soundViewModel.A1(0L, string7);
                    }
                    Unit unit92 = Unit.a;
                }
                this.E = false;
                gqw gqwVar100 = this.binding;
                if (gqwVar100 != null) {
                    gqwVar100.f.setVisibility(8);
                    Unit unit93 = Unit.a;
                }
                this.blueRocketFired.j(Boolean.TRUE);
                this.isBlueRocketFired = true;
                gqw gqwVar101 = this.binding;
                if (gqwVar101 != null) {
                    gqwVar101.i.setVisibility(0);
                    Unit unit94 = Unit.a;
                }
                gqw gqwVar102 = this.binding;
                if (gqwVar102 != null) {
                    gqwVar102.v.setText(s.getInfo().getBLUE().getMultiplier() + "x");
                    Unit unit95 = Unit.a;
                }
                gqw gqwVar103 = this.binding;
                d(gqwVar103 != null ? gqwVar103.d : null, gqwVar103 != null ? gqwVar103.e : null, gqwVar103 != null ? gqwVar103.v : null);
                this.w = true;
            }
            this.i = false;
            this.v = false;
            this.w = false;
        }
    }

    public final void setPurpleRocketFired(ssw<Boolean> sswVar) {
        sswVar.getClass();
        this.purpleRocketFired = sswVar;
    }

    public final void setRedRocketFired(ssw<Boolean> sswVar) {
        sswVar.getClass();
        this.redRocketFired = sswVar;
    }

    public final void setRoundEnd(ssw<Boolean> sswVar) {
        sswVar.getClass();
        this.isRoundEnd = sswVar;
    }

    public final void setRoundPreStart(ssw<Boolean> sswVar) {
        sswVar.getClass();
        this.isRoundPreStart = sswVar;
    }

    public final void setTimerInProgress(boolean z) {
        this.timerInProgress = z;
    }

    public final void setBlueRocketFired(boolean z) {
        this.isBlueRocketFired = z;
    }

    public final void setPurpleRocketFired(boolean z) {
        this.isPurpleRocketFired = z;
    }

    public final void setRedRocketFired(boolean z) {
        this.isRedRocketFired = z;
    }

    public MultiplierContainer(Context context) {
        this(context, null);
    }
}
