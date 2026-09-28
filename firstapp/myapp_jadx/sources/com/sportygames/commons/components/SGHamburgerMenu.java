package com.sportygames.commons.components;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.google.android.material.imageview.ShapeableImageView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.commons.models.LeftMenuButton;
import defpackage.ai50;
import defpackage.b7p;
import defpackage.bmy;
import defpackage.c0d;
import defpackage.ej5;
import defpackage.etj;
import defpackage.fse;
import defpackage.gku;
import defpackage.gpp;
import defpackage.gr60;
import defpackage.h5e;
import defpackage.hb50;
import defpackage.hre;
import defpackage.hxa;
import defpackage.ib5;
import defpackage.j1b;
import defpackage.jvd0;
import defpackage.k4s;
import defpackage.kpu;
import defpackage.krh0;
import defpackage.l9b;
import defpackage.lfe0;
import defpackage.lo80;
import defpackage.lw20;
import defpackage.n2j;
import defpackage.na7;
import defpackage.np5;
import defpackage.odd;
import defpackage.op5;
import defpackage.pfd;
import defpackage.po80;
import defpackage.qo80;
import defpackage.r9n;
import defpackage.s4u;
import defpackage.tje0;
import defpackage.tk30;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v920;
import defpackage.w5b;
import defpackage.w920;
import defpackage.wn7;
import defpackage.x6f;
import defpackage.x7g;
import defpackage.xa50;
import defpackage.y5b;
import defpackage.ypa0;
import defpackage.z1j;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0003YZ[B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJE\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001d\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\b¢\u0006\u0004\b\"\u0010\fJ\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010 J\u0015\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J+\u0010+\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u0010)\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u0012¢\u0006\u0004\b+\u0010,J+\u0010-\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u0010)\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u0012¢\u0006\u0004\b-\u0010,J\r\u0010.\u001a\u00020\n¢\u0006\u0004\b.\u0010 J\r\u0010/\u001a\u00020\n¢\u0006\u0004\b/\u0010 J\r\u00100\u001a\u00020\n¢\u0006\u0004\b0\u0010 J\r\u00101\u001a\u00020\n¢\u0006\u0004\b1\u0010 J\r\u00102\u001a\u00020\n¢\u0006\u0004\b2\u0010 J\r\u00103\u001a\u00020\n¢\u0006\u0004\b3\u0010 J\r\u00104\u001a\u00020\n¢\u0006\u0004\b4\u0010 J\u0017\u00107\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\n¢\u0006\u0004\b9\u0010 J\r\u0010:\u001a\u00020\n¢\u0006\u0004\b:\u0010 J\r\u0010;\u001a\u00020\n¢\u0006\u0004\b;\u0010 J\r\u0010<\u001a\u00020\n¢\u0006\u0004\b<\u0010 J)\u0010?\u001a\u00020\n2\u0006\u0010=\u001a\u00020\u001a2\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u0010>\u001a\u00020\u0012¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\n¢\u0006\u0004\bA\u0010 J\u0015\u0010C\u001a\u00020\n2\u0006\u0010B\u001a\u00020\u0012¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\n2\u0006\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bG\u0010HR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010X\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010W¨\u0006\\"}, d2 = {"Lcom/sportygames/commons/components/SGHamburgerMenu;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "color", "", "setHeaderColor", "(I)V", "setBodyColor", "Lcom/sportygames/commons/components/SGHamburgerMenu$b;", "setUpDetails", "Landroid/app/Activity;", "gameMainActivity", "", "playSoundEffect", "Lcom/sportygames/commons/components/SGHamburgerMenu$a;", "itemRenderedListener", "Lkotlin/Function0;", "isLoggedIn", "setup", "(Lcom/sportygames/commons/components/SGHamburgerMenu$b;Landroid/app/Activity;ZLcom/sportygames/commons/components/SGHamburgerMenu$a;Lkotlin/jvm/functions/Function0;)V", "", "userName", "userIcon", "setUserDetails", "(Ljava/lang/String;Ljava/lang/String;)V", "setBottleImage", "()V", "i", "setShBottomImageMargin", "setSHImage", "", "scale", "setShBottomImageScale", "(F)V", "isXmasTheme", "isFuguTheme", "isWorldCupThemeEnabled", "setShBottomImage", "(ZZZ)V", "setShBottomImageV2", "setSDBBottomImage", "setRedBlackBottomImage", "setRushBottomImage", "setEvenOddBottomImage", "setEvenImage", "setRBImage", "setRushImage", "Landroid/graphics/Typeface;", "font", "setFruitHuntImage", "(Landroid/graphics/Typeface;)V", "setSpin2WinImage", "setSpinMatchImage", "setPocketRocketImage", "setPPImage", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "isWorldCupTheme", "setCrashImage", "(Ljava/lang/String;ZZ)V", "setShGameLogoImage", "isVip", "setHamMenuVipChanges", "(Z)V", "Landroid/content/res/TypedArray;", "typedArray", "setThemeAttribute", "(Landroid/content/res/TypedArray;)V", "Lqo80;", "F", "Lqo80;", "getBinding", "()Lqo80;", "setBinding", "(Lqo80;)V", "binding", "Lk4s;", "L", "Lk4s;", "getAdapter", "()Lk4s;", "setAdapter", "(Lk4s;)V", "adapter", "b", "HamMenuLinearLayoutManager", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SGHamburgerMenu extends ConstraintLayout {
    public static final /* synthetic */ int M = 0;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public qo80 binding;
    public b G;
    public final j1b H;
    public jvd0 I;
    public int J;
    public boolean K;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public k4s adapter;

    public interface a {
    }

    @c0d(c = "com.sportygames.commons.components.SGHamburgerMenu$setEvenOddBottomImage$1", f = "SGHamburgerMenu.kt", l = {602}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return SGHamburgerMenu.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            SGHamburgerMenu sGHamburgerMenu = SGHamburgerMenu.this;
            if (i == 0) {
                uj50.b(obj);
                s4u<String, Bitmap> s4uVar = r9n.a;
                Context context = sGHamburgerMenu.getContext();
                String string = sGHamburgerMenu.getContext().getString(R.string.key_ham_bg_image);
                string.getClass();
                this.a = 1;
                obj = r9n.c(this, context, string);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(sGHamburgerMenu.getResources(), (Bitmap) obj);
            op5 op5Var = op5.a;
            ArrayList arrayListF = kotlin.collections.b.f(sGHamburgerMenu.getBinding().y);
            ArrayList arrayListF2 = kotlin.collections.b.f(bitmapDrawable);
            Context context2 = sGHamburgerMenu.getContext();
            context2.getClass();
            op5Var.getClass();
            op5.o(arrayListF, arrayListF2, context2);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.commons.components.SGHamburgerMenu$setRedBlackBottomImage$1", f = "SGHamburgerMenu.kt", l = {500}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return SGHamburgerMenu.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            SGHamburgerMenu sGHamburgerMenu = SGHamburgerMenu.this;
            if (i == 0) {
                uj50.b(obj);
                s4u<String, Bitmap> s4uVar = r9n.a;
                Context context = sGHamburgerMenu.getContext();
                String string = sGHamburgerMenu.getContext().getString(R.string.key_ham_bg_image);
                string.getClass();
                this.a = 1;
                obj = r9n.c(this, context, string);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(sGHamburgerMenu.getResources(), (Bitmap) obj);
            op5 op5Var = op5.a;
            ArrayList arrayListF = kotlin.collections.b.f(sGHamburgerMenu.getBinding().y);
            ArrayList arrayListF2 = kotlin.collections.b.f(bitmapDrawable);
            Context context2 = sGHamburgerMenu.getContext();
            context2.getClass();
            op5Var.getClass();
            op5.o(arrayListF, arrayListF2, context2);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.commons.components.SGHamburgerMenu$setRushBottomImage$1", f = "SGHamburgerMenu.kt", l = {551}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return SGHamburgerMenu.this.new e(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            SGHamburgerMenu sGHamburgerMenu = SGHamburgerMenu.this;
            if (i == 0) {
                uj50.b(obj);
                s4u<String, Bitmap> s4uVar = r9n.a;
                Context context = sGHamburgerMenu.getContext();
                String string = sGHamburgerMenu.getContext().getString(R.string.key_ham_bg_image);
                string.getClass();
                this.a = 1;
                obj = r9n.c(this, context, string);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(sGHamburgerMenu.getResources(), (Bitmap) obj);
            op5 op5Var = op5.a;
            ArrayList arrayListF = kotlin.collections.b.f(sGHamburgerMenu.getBinding().y);
            ArrayList arrayListF2 = kotlin.collections.b.f(bitmapDrawable);
            Context context2 = sGHamburgerMenu.getContext();
            context2.getClass();
            op5Var.getClass();
            op5.o(arrayListF, arrayListF2, context2);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.commons.components.SGHamburgerMenu$setSDBBottomImage$1", f = "SGHamburgerMenu.kt", l = {449}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return SGHamburgerMenu.this.new f(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            SGHamburgerMenu sGHamburgerMenu = SGHamburgerMenu.this;
            if (i == 0) {
                uj50.b(obj);
                s4u<String, Bitmap> s4uVar = r9n.a;
                Context context = sGHamburgerMenu.getContext();
                String string = sGHamburgerMenu.getContext().getString(R.string.key_ham_bg_image);
                string.getClass();
                this.a = 1;
                obj = r9n.c(this, context, string);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(sGHamburgerMenu.getResources(), (Bitmap) obj);
            op5 op5Var = op5.a;
            ArrayList arrayListF = kotlin.collections.b.f(sGHamburgerMenu.getBinding().y);
            ArrayList arrayListF2 = kotlin.collections.b.f(bitmapDrawable);
            Context context2 = sGHamburgerMenu.getContext();
            context2.getClass();
            op5Var.getClass();
            op5.o(arrayListF, arrayListF2, context2);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.commons.components.SGHamburgerMenu$setShBottomImage$1", f = "SGHamburgerMenu.kt", l = {328}, m = "invokeSuspend", v = 1)
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ SGHamburgerMenu c;
        public final /* synthetic */ String d;

        @c0d(c = "com.sportygames.commons.components.SGHamburgerMenu$setShBottomImage$1$bitmap$1", f = "SGHamburgerMenu.kt", l = {329}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Bitmap>, Object> {
            public int a;
            public final /* synthetic */ SGHamburgerMenu b;
            public final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SGHamburgerMenu sGHamburgerMenu, String str, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = sGHamburgerMenu;
                this.c = str;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Bitmap> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                s4u<String, Bitmap> s4uVar = r9n.a;
                Context context = this.b.getContext();
                this.a = 1;
                Object objC = r9n.c(this, context, this.c);
                return objC == y5bVar ? y5bVar : objC;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i, SGHamburgerMenu sGHamburgerMenu, String str, v1b<? super g> v1bVar) {
            super(2, v1bVar);
            this.b = i;
            this.c = sGHamburgerMenu;
            this.d = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new g(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            SGHamburgerMenu sGHamburgerMenu = this.c;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    pfd pfdVar = fse.a;
                    odd oddVar = odd.b;
                    a aVar = new a(sGHamburgerMenu, this.d, null);
                    this.a = 1;
                    obj = ej5.d(oddVar, aVar, this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                Bitmap bitmap = (Bitmap) obj;
                if (this.b == sGHamburgerMenu.J) {
                    sGHamburgerMenu.getBinding().y.setImageBitmap(bitmap);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.commons.components.SGHamburgerMenu$setShBottomImageV2$1", f = "SGHamburgerMenu.kt", l = {393}, m = "invokeSuspend", v = 1)
    public static final class h extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ SGHamburgerMenu c;
        public final /* synthetic */ String d;
        public final /* synthetic */ boolean e;

        @c0d(c = "com.sportygames.commons.components.SGHamburgerMenu$setShBottomImageV2$1$bitmap$1", f = "SGHamburgerMenu.kt", l = {394}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Bitmap>, Object> {
            public int a;
            public final /* synthetic */ SGHamburgerMenu b;
            public final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SGHamburgerMenu sGHamburgerMenu, String str, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = sGHamburgerMenu;
                this.c = str;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Bitmap> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                s4u<String, Bitmap> s4uVar = r9n.a;
                Context context = this.b.getContext();
                this.a = 1;
                Object objC = r9n.c(this, context, this.c);
                return objC == y5bVar ? y5bVar : objC;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i, SGHamburgerMenu sGHamburgerMenu, String str, boolean z, v1b<? super h> v1bVar) {
            super(2, v1bVar);
            this.b = i;
            this.c = sGHamburgerMenu;
            this.d = str;
            this.e = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new h(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((h) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            SGHamburgerMenu sGHamburgerMenu = this.c;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    pfd pfdVar = fse.a;
                    odd oddVar = odd.b;
                    a aVar = new a(sGHamburgerMenu, this.d, null);
                    this.a = 1;
                    obj = ej5.d(oddVar, aVar, this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                Bitmap bitmap = (Bitmap) obj;
                if (this.b == sGHamburgerMenu.J) {
                    sGHamburgerMenu.getBinding().y.setImageBitmap(bitmap);
                    ImageView imageView = sGHamburgerMenu.getBinding().y;
                    boolean z = this.e;
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        layoutParams2.setMarginStart(z ? sGHamburgerMenu.getResources().getDimensionPixelSize(R.dimen._20sdp) : -sGHamburgerMenu.getResources().getDimensionPixelSize(R.dimen._35sdp));
                        imageView.setLayoutParams(layoutParams2);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SGHamburgerMenu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sg_hamburger_menu_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.account_icon;
        ShapeableImageView shapeableImageView = (ShapeableImageView) h5e.a(R.id.account_icon, viewInflate);
        if (shapeableImageView != null) {
            i = R.id.add_money_button;
            TextView textView = (TextView) h5e.a(R.id.add_money_button, viewInflate);
            if (textView != null) {
                i = R.id.bottom_area;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) h5e.a(R.id.bottom_area, viewInflate);
                if (linearLayoutCompat != null) {
                    i = R.id.bottom_rtp_info;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) h5e.a(R.id.bottom_rtp_info, viewInflate);
                    if (linearLayoutCompat2 != null) {
                        i = R.id.game_title;
                        TextView textView2 = (TextView) h5e.a(R.id.game_title, viewInflate);
                        if (textView2 != null) {
                            i = R.id.game_title_image;
                            ImageView imageView = (ImageView) h5e.a(R.id.game_title_image, viewInflate);
                            if (imageView != null) {
                                i = R.id.header_area;
                                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.header_area, viewInflate);
                                if (constraintLayout != null) {
                                    i = R.id.ivIllustration;
                                    ImageView imageView2 = (ImageView) h5e.a(R.id.ivIllustration, viewInflate);
                                    if (imageView2 != null) {
                                        i = R.id.ll_rtp_main;
                                        if (((LinearLayout) h5e.a(R.id.ll_rtp_main, viewInflate)) != null) {
                                            i = R.id.menuBottomImage;
                                            ImageView imageView3 = (ImageView) h5e.a(R.id.menuBottomImage, viewInflate);
                                            if (imageView3 != null) {
                                                i = R.id.menu_list;
                                                RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.menu_list, viewInflate);
                                                if (recyclerView != null) {
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                    i = R.id.tv_rng_value;
                                                    TextView textView3 = (TextView) h5e.a(R.id.tv_rng_value, viewInflate);
                                                    if (textView3 != null) {
                                                        i = R.id.tv_rtp_title;
                                                        if (((TextView) h5e.a(R.id.tv_rtp_title, viewInflate)) != null) {
                                                            i = R.id.tv_rtp_value;
                                                            TextView textView4 = (TextView) h5e.a(R.id.tv_rtp_value, viewInflate);
                                                            if (textView4 != null) {
                                                                i = R.id.user_name;
                                                                TextView textView5 = (TextView) h5e.a(R.id.user_name, viewInflate);
                                                                if (textView5 != null) {
                                                                    i = R.id.vip_arrow;
                                                                    ImageView imageView4 = (ImageView) h5e.a(R.id.vip_arrow, viewInflate);
                                                                    if (imageView4 != null) {
                                                                        i = R.id.vip_benefit;
                                                                        TextView textView6 = (TextView) h5e.a(R.id.vip_benefit, viewInflate);
                                                                        if (textView6 != null) {
                                                                            i = R.id.vip_crown_small;
                                                                            ImageView imageView5 = (ImageView) h5e.a(R.id.vip_crown_small, viewInflate);
                                                                            if (imageView5 != null) {
                                                                                i = R.id.vip_tag;
                                                                                TextView textView7 = (TextView) h5e.a(R.id.vip_tag, viewInflate);
                                                                                if (textView7 != null) {
                                                                                    this.binding = new qo80(constraintLayout2, shapeableImageView, textView, linearLayoutCompat, linearLayoutCompat2, textView2, imageView, constraintLayout, imageView2, imageView3, recyclerView, constraintLayout2, textView3, textView4, textView5, imageView4, textView6, imageView5, textView7);
                                                                                    pfd pfdVar = fse.a;
                                                                                    this.H = w5b.a(gku.a.plus(lfe0.a()));
                                                                                    if (attributeSet != null) {
                                                                                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.g);
                                                                                        typedArrayObtainStyledAttributes.getClass();
                                                                                        setThemeAttribute(typedArrayObtainStyledAttributes);
                                                                                        typedArrayObtainStyledAttributes.recycle();
                                                                                        return;
                                                                                    }
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public static /* synthetic */ void setCrashImage$default(SGHamburgerMenu sGHamburgerMenu, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        sGHamburgerMenu.setCrashImage(str, z, z2);
    }

    public static /* synthetic */ void setShBottomImage$default(SGHamburgerMenu sGHamburgerMenu, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        sGHamburgerMenu.setShBottomImage(z, z2, z3);
    }

    public static /* synthetic */ void setShBottomImageV2$default(SGHamburgerMenu sGHamburgerMenu, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        sGHamburgerMenu.setShBottomImageV2(z, z2, z3);
    }

    private final void setThemeAttribute(TypedArray typedArray) {
        int resourceId = typedArray.getResourceId(0, android.R.color.transparent);
        int resourceId2 = typedArray.getResourceId(1, android.R.color.transparent);
        this.binding.a.setBackgroundResource(typedArray.getResourceId(2, android.R.color.transparent));
        this.binding.v.setBackgroundResource(resourceId);
        this.binding.d.setBackgroundResource(resourceId2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setup$default(SGHamburgerMenu sGHamburgerMenu, b bVar, Activity activity, boolean z, a aVar, Function0 function0, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        sGHamburgerMenu.setup(bVar, activity, z, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? null : function0);
    }

    public final void E(int i) {
        if (this.K || i <= 0) {
            return;
        }
        ConstraintLayout constraintLayout = this.binding.v;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        int i2 = layoutParams.height;
        if (i2 > 0) {
            layoutParams.height = i2 + i;
            constraintLayout.setLayoutParams(layoutParams);
        }
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop() + i, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        this.K = true;
    }

    public final void F(int i) {
        try {
            this.binding.c.setBackground(getContext().getDrawable(i));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final k4s getAdapter() {
        return this.adapter;
    }

    public final qo80 getBinding() {
        return this.binding;
    }

    public final void setAdapter(k4s k4sVar) {
        this.adapter = k4sVar;
    }

    public final void setBinding(qo80 qo80Var) {
        qo80Var.getClass();
        this.binding = qo80Var;
    }

    public final void setBodyColor(int color) {
        this.binding.a.setBackgroundColor(color);
    }

    public final void setBottleImage() {
        int i = getContext().getResources().getDisplayMetrics().heightPixels / 3;
        this.binding.d.getBackground().setAlpha(50);
        ViewGroup.LayoutParams layoutParams = this.binding.d.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = i;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = i;
        this.binding.d.setLayoutParams(layoutParams2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void setCrashImage(String gameName, boolean isXmasTheme, boolean isWorldCupTheme) {
        String lowerCase;
        gameName.getClass();
        this.binding.w.setVisibility(0);
        this.binding.w.setScaleX(1.0f);
        this.binding.w.setScaleY(1.0f);
        ViewGroup.LayoutParams layoutParams = this.binding.w.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = getContext().getResources().getDisplayMetrics().widthPixels;
        switch (gameName.hashCode()) {
            case 13143121:
                if (gameName.equals("sporty-jet")) {
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, i / 10, 50);
                }
                break;
            case 22313157:
                if (gameName.equals("galaxy-go")) {
                    marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, 0, r.d.DEFAULT_DRAG_ANIMATION_DURATION);
                }
                break;
            case 407224423:
                if (gameName.equals("sporty-cars")) {
                    marginLayoutParams.setMargins(r.d.DEFAULT_DRAG_ANIMATION_DURATION, marginLayoutParams.topMargin, i / 8, r.d.DEFAULT_DRAG_ANIMATION_DURATION);
                }
                break;
            case 407469966:
                if (gameName.equals("sporty-kick")) {
                    marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, i / 8, 50);
                }
                break;
            case 510525191:
                if (gameName.equals("one-punch")) {
                    marginLayoutParams.setMargins(100, marginLayoutParams.topMargin, i / 8, r.d.DEFAULT_DRAG_ANIMATION_DURATION);
                }
                break;
            case 967676810:
                if (gameName.equals("sporty-skills")) {
                    marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, 0, i / 35);
                }
                break;
            case 1618394686:
                if (gameName.equals("crazy-rider")) {
                    marginLayoutParams.setMargins(100, marginLayoutParams.topMargin, i / 8, r.d.DEFAULT_DRAG_ANIMATION_DURATION);
                }
                break;
        }
        ViewGroup.LayoutParams layoutParams2 = this.binding.i.getLayoutParams();
        layoutParams2.getClass();
        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams2;
        layoutParams3.setMargins(getResources().getDimensionPixelSize(R.dimen._16sdp), getResources().getDimensionPixelSize(R.dimen._10sdp), 0, 0);
        this.binding.i.setLayoutParams(layoutParams3);
        this.binding.w.setLayoutParams(marginLayoutParams);
        if (isXmasTheme) {
            this.binding.w.setTag("ham_menu_xmas_webp:sg_game_name");
        } else if (gameName.equals("sporty-skills")) {
            String country = SportyGamesManager.getInstance().getCountry();
            if (country != null) {
                lowerCase = country.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            String str = Intrinsics.g(lowerCase, "ke") ? "ke" : Intrinsics.g(lowerCase, "za") ? "za" : null;
            qo80 qo80Var = this.binding;
            if (str != null) {
                qo80Var.w.setTag("ham_menu_bg_" + str + ":sg_game_name");
            } else {
                qo80Var.w.setTag("ham_menu_webp:sg_game_name");
            }
        } else if (isWorldCupTheme && gameName.equals("sporty-jet")) {
            this.binding.w.setTag("wc_ham_img:sg_game_name");
            this.binding.w.setScaleX(1.35f);
            this.binding.w.setScaleY(1.25f);
        } else {
            this.binding.w.setTag("ham_menu_webp:sg_game_name");
        }
        this.binding.f.setVisibility(8);
        String str2 = ((kotlin.text.c.l(SportyGamesManager.getInstance().getCountry(), "ke", true) || kotlin.text.c.l(SportyGamesManager.getInstance().getCountry(), "za", true)) && StringsKt.M(gameName, "skills", true)) ? "game_title_mc_webp:sg_game_name" : "game_title_webp:sg_game_name";
        Context context = getContext();
        context.getClass();
        xa50 xa50VarC = com.bumptech.glide.a.b(context).c(context);
        xa50VarC.getClass();
        op5 op5Var = op5.a;
        String strG = krh0.g(gameName);
        op5Var.getClass();
        String strB = op5.b(str2, strG, null);
        new po80(xa50VarC, strB, na7.a(xa50VarC, Drawable.class, strB), lo80.a).e(this.binding.i);
        if (gameName.equals("one-punch")) {
            this.binding.i.setScaleX(0.8f);
            this.binding.i.setScaleY(0.8f);
            this.binding.w.setScaleX(1.0f);
            this.binding.w.setScaleY(1.0f);
        }
        if (gameName.equals("sporty-skills")) {
            this.binding.w.setScaleX(1.095f);
            this.binding.w.setScaleY(1.095f);
        }
        if (gameName.equals("sporty-cars")) {
            this.binding.w.setScaleX(1.5f);
            this.binding.w.setScaleY(1.5f);
            this.binding.w.setAlpha(0.8f);
        }
        this.binding.i.setVisibility(0);
        TextView textView = this.binding.c;
        textView.setText("+ ".concat(op5.c(op5Var, textView.getTag().toString(), this.binding.c.getText().toString())));
        ArrayList arrayListF = kotlin.collections.b.f(this.binding.w);
        ArrayList arrayListF2 = kotlin.collections.b.f(null);
        Context context2 = getContext();
        context2.getClass();
        op5.o(arrayListF, arrayListF2, context2);
    }

    public final void setEvenImage() {
        double d2 = ((double) getContext().getResources().getDisplayMetrics().heightPixels) * 0.28d;
        ViewGroup.LayoutParams layoutParams = this.binding.d.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = (int) d2;
        this.binding.d.setLayoutParams(layoutParams2);
    }

    public final void setEvenOddBottomImage() {
        this.binding.y.setVisibility(0);
        ConstraintLayout constraintLayout = this.binding.A;
        constraintLayout.getClass();
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.f(constraintLayout);
        bVar.h(this.binding.y.getId(), 6, this.binding.A.getId(), 6, 0);
        bVar.h(this.binding.y.getId(), 4, this.binding.A.getId(), 4, 0);
        bVar.h(this.binding.y.getId(), 7, this.binding.A.getId(), 7, 0);
        bVar.j(this.binding.y.getId(), 0.45f);
        bVar.k(this.binding.y.getId(), 1.0f);
        ViewGroup.LayoutParams layoutParams = this.binding.y.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.v = 0;
        layoutParams2.t = 0;
        this.binding.y.setLayoutParams(layoutParams2);
        bVar.b(constraintLayout);
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new c(null), 3);
    }

    public final void setFruitHuntImage(Typeface font) {
        this.binding.c.setBackgroundResource(R.drawable.fh_hamburger_add_money);
        this.binding.w.setVisibility(0);
        this.binding.f.setTypeface(font);
        op5 op5Var = op5.a;
        ArrayList arrayListF = kotlin.collections.b.f(this.binding.w);
        ArrayList arrayListF2 = kotlin.collections.b.f(null);
        Context context = getContext();
        context.getClass();
        op5Var.getClass();
        op5.o(arrayListF, arrayListF2, context);
    }

    public final void setHamMenuVipChanges(boolean isVip) {
        ConstraintLayout.LayoutParams layoutParams;
        qo80 qo80Var = this.binding;
        if (!isVip) {
            ViewGroup.LayoutParams layoutParams2 = qo80Var.D.getLayoutParams();
            layoutParams = layoutParams2 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams != null) {
                layoutParams.l = this.binding.b.getId();
            }
            this.binding.D.setLayoutParams(layoutParams);
            this.binding.F.setVisibility(8);
            this.binding.E.setVisibility(8);
            this.binding.H.setVisibility(8);
            this.binding.G.setVisibility(8);
            this.binding.b.setStrokeWidth(0.0f);
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = qo80Var.D.getLayoutParams();
        layoutParams = layoutParams3 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams != null) {
            layoutParams.l = -1;
        }
        this.binding.D.setLayoutParams(layoutParams);
        this.binding.F.setVisibility(0);
        this.binding.E.setVisibility(0);
        this.binding.H.setVisibility(0);
        this.binding.G.setVisibility(0);
        Context context = getContext();
        if (context != null) {
            this.binding.b.setStrokeColor(ColorStateList.valueOf(context.getColor(R.color.color_EBAE25)));
            Resources resources = getResources();
            if (resources != null) {
                this.binding.b.setStrokeWidth(resources.getDimension(R.dimen._1sdp));
            }
        }
    }

    public final void setHeaderColor(int color) {
        this.binding.v.setBackgroundColor(color);
    }

    public final void setPPImage() {
        this.binding.w.setVisibility(0);
        this.binding.w.setScaleX(1.0f);
        this.binding.w.setScaleY(1.0f);
        ViewGroup.LayoutParams layoutParams = this.binding.w.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, 50);
        this.binding.w.setLayoutParams(marginLayoutParams);
        op5 op5Var = op5.a;
        ArrayList arrayListF = kotlin.collections.b.f(this.binding.w);
        ArrayList arrayListF2 = kotlin.collections.b.f(getContext().getDrawable(R.drawable.pp_ham_menu));
        Context context = getContext();
        context.getClass();
        op5Var.getClass();
        op5.o(arrayListF, arrayListF2, context);
    }

    public final void setPocketRocketImage() {
        int iApplyDimension;
        this.binding.w.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = this.binding.d.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        int i = getContext().getResources().getDisplayMetrics().heightPixels / 3;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = i;
        try {
            iApplyDimension = (int) TypedValue.applyDimension(1, 90.0f, getContext().getResources().getDisplayMetrics());
        } catch (Exception unused) {
            iApplyDimension = 0;
        }
        layoutParams2.setMargins(0, 0, 0, iApplyDimension);
        this.binding.d.setLayoutParams(layoutParams2);
        this.binding.f.setTextColor(getContext().getColor(R.color.game_name_color));
        TextView textView = this.binding.f;
        textView.setTypeface(textView.getTypeface(), 1);
        ViewGroup.LayoutParams layoutParams3 = this.binding.c.getLayoutParams();
        layoutParams3.getClass();
        ((LinearLayout.LayoutParams) layoutParams3).height = i / 6;
        op5 op5Var = op5.a;
        ArrayList arrayListF = kotlin.collections.b.f(this.binding.w);
        ArrayList arrayListF2 = kotlin.collections.b.f(null);
        Context context = getContext();
        context.getClass();
        op5Var.getClass();
        op5.o(arrayListF, arrayListF2, context);
    }

    public final void setRBImage() {
        double d2 = ((double) getContext().getResources().getDisplayMetrics().heightPixels) * 0.24d;
        ViewGroup.LayoutParams layoutParams = this.binding.d.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = (int) d2;
        this.binding.d.setLayoutParams(layoutParams2);
    }

    public final void setRedBlackBottomImage() {
        this.binding.y.setVisibility(0);
        ConstraintLayout constraintLayout = this.binding.A;
        constraintLayout.getClass();
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.f(constraintLayout);
        bVar.h(this.binding.y.getId(), 6, this.binding.A.getId(), 6, 0);
        bVar.h(this.binding.y.getId(), 4, this.binding.A.getId(), 4, 0);
        bVar.h(this.binding.y.getId(), 7, this.binding.A.getId(), 7, 0);
        bVar.j(this.binding.y.getId(), 0.3f);
        bVar.k(this.binding.y.getId(), 1.0f);
        ViewGroup.LayoutParams layoutParams = this.binding.y.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.v = 0;
        layoutParams2.t = 0;
        this.binding.y.setLayoutParams(layoutParams2);
        bVar.b(constraintLayout);
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new d(null), 3);
    }

    public final void setRushBottomImage() {
        this.binding.y.setVisibility(0);
        ConstraintLayout constraintLayout = this.binding.A;
        constraintLayout.getClass();
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.f(constraintLayout);
        bVar.h(this.binding.y.getId(), 6, this.binding.A.getId(), 6, 0);
        bVar.h(this.binding.y.getId(), 4, this.binding.A.getId(), 4, 0);
        bVar.h(this.binding.y.getId(), 7, this.binding.A.getId(), 7, 0);
        bVar.j(this.binding.y.getId(), 0.55f);
        bVar.k(this.binding.y.getId(), 1.0f);
        ViewGroup.LayoutParams layoutParams = this.binding.y.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.v = 0;
        layoutParams2.t = 0;
        this.binding.y.setLayoutParams(layoutParams2);
        bVar.b(constraintLayout);
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new e(null), 3);
    }

    public final void setRushImage() {
        int i = getContext().getResources().getDisplayMetrics().heightPixels / 3;
        ViewGroup.LayoutParams layoutParams = this.binding.d.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = i;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = i;
        this.binding.d.setLayoutParams(layoutParams2);
    }

    public final void setSDBBottomImage() {
        this.binding.y.setVisibility(0);
        ConstraintLayout constraintLayout = this.binding.A;
        constraintLayout.getClass();
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.f(constraintLayout);
        bVar.h(this.binding.y.getId(), 6, this.binding.A.getId(), 6, 50);
        bVar.h(this.binding.y.getId(), 4, this.binding.A.getId(), 4, 50);
        bVar.j(this.binding.y.getId(), 0.32f);
        bVar.k(this.binding.y.getId(), 0.89f);
        ViewGroup.LayoutParams layoutParams = this.binding.y.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.v = 0;
        layoutParams2.t = 0;
        this.binding.y.setLayoutParams(layoutParams2);
        bVar.b(constraintLayout);
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new f(null), 3);
    }

    public final void setSHImage() {
        this.binding.d.getBackground().setAlpha(50);
        ViewGroup.LayoutParams layoutParams = this.binding.d.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ViewGroup.LayoutParams layoutParams3 = this.binding.d.getLayoutParams();
        layoutParams3.getClass();
        ((ConstraintLayout.LayoutParams) layoutParams3).setMargins(0, 0, 0, 0);
        ViewGroup.LayoutParams layoutParams4 = this.binding.c.getLayoutParams();
        layoutParams4.getClass();
        ((LinearLayout.LayoutParams) layoutParams4).setMargins(0, 0, 0, 0);
        layoutParams2.j = R.id.menu_list;
        this.binding.d.setLayoutParams(layoutParams2);
        this.binding.y.setVisibility(0);
    }

    public final void setShBottomImage(boolean isXmasTheme, boolean isFuguTheme, boolean isWorldCupThemeEnabled) {
        String str;
        this.binding.y.setVisibility(0);
        this.binding.y.setAlpha((isFuguTheme || isWorldCupThemeEnabled) ? 1.0f : 0.2f);
        float f2 = isWorldCupThemeEnabled ? 0.72f : 0.32f;
        float f3 = isWorldCupThemeEnabled ? 0.99f : 0.89f;
        ConstraintLayout constraintLayout = this.binding.A;
        constraintLayout.getClass();
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.f(constraintLayout);
        bVar.h(this.binding.y.getId(), 6, this.binding.A.getId(), 6, 0);
        bVar.h(this.binding.y.getId(), 4, this.binding.A.getId(), 4, 0);
        bVar.j(this.binding.y.getId(), f2);
        bVar.k(this.binding.y.getId(), f3);
        this.binding.y.setLayoutParams(new ConstraintLayout.LayoutParams(0, 0));
        bVar.b(constraintLayout);
        jvd0 jvd0Var = this.I;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        int i = this.J + 1;
        this.J = i;
        if (isXmasTheme) {
            str = "ham_bg_theme_android_png";
        } else if (isFuguTheme) {
            str = "ham_img_sh_fugu";
        } else {
            str = isWorldCupThemeEnabled ? "wc_ham_img" : "ham_bg_android_png";
        }
        this.I = ej5.c(this.H, null, null, new g(i, this, str, null), 3);
    }

    public final void setShBottomImageMargin(int i) {
        ViewGroup.LayoutParams layoutParams = this.binding.y.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, 0, 0, -getResources().getDimensionPixelSize(i));
        this.binding.y.setLayoutParams(layoutParams2);
    }

    public final void setShBottomImageScale(float scale) {
        this.binding.y.setScaleY(scale);
        this.binding.y.setScaleX(scale);
    }

    public final void setShBottomImageV2(boolean isXmasTheme, boolean isFuguTheme, boolean isWorldCupThemeEnabled) {
        String str;
        this.binding.y.setVisibility(0);
        this.binding.y.setAlpha(1.0f);
        ConstraintLayout constraintLayout = this.binding.A;
        constraintLayout.getClass();
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.f(constraintLayout);
        bVar.h(this.binding.y.getId(), 6, this.binding.A.getId(), 6, 0);
        bVar.h(this.binding.y.getId(), 4, this.binding.A.getId(), 4, 0);
        bVar.j(this.binding.y.getId(), 0.32f);
        bVar.k(this.binding.y.getId(), 0.89f);
        this.binding.y.setLayoutParams(new ConstraintLayout.LayoutParams(0, 0));
        bVar.b(constraintLayout);
        jvd0 jvd0Var = this.I;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        int i = this.J + 1;
        this.J = i;
        if (isXmasTheme) {
            str = "ham_img_sh_xmas";
        } else if (isFuguTheme) {
            str = "ham_img_sh_fugu";
        } else {
            str = isWorldCupThemeEnabled ? "wc_ham_img" : "ham_img_sh";
        }
        this.I = ej5.c(this.H, null, null, new h(i, this, str, isFuguTheme, null), 3);
    }

    public final void setShGameLogoImage() {
        this.binding.w.setVisibility(8);
        this.binding.i.setScaleY(0.75f);
        this.binding.i.setScaleX(1.0f);
        ViewGroup.LayoutParams layoutParams = this.binding.i.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(getResources().getDimensionPixelSize(R.dimen._16sdp), getResources().getDimensionPixelSize(R.dimen._10sdp), 0, 0);
        this.binding.i.setLayoutParams(layoutParams2);
        this.binding.f.setVisibility(8);
        Context context = getContext();
        context.getClass();
        xa50 xa50VarA = np5.a(context, context);
        op5.a.getClass();
        String strB = op5.b("game_title_webp:sg_game_name", "https://s.sporty.net/cms/sh_header_logo_8f2265e4ae.webp", null);
        new po80(xa50VarA, strB, na7.a(xa50VarA, Drawable.class, strB), lo80.a).e(this.binding.i);
        this.binding.i.setVisibility(0);
    }

    public final void setSpin2WinImage() {
        this.binding.w.setVisibility(0);
        this.binding.w.setScaleX(1.2f);
        this.binding.w.setScaleY(1.2f);
        ViewGroup.LayoutParams layoutParams = this.binding.w.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, 50);
        this.binding.w.setLayoutParams(marginLayoutParams);
        op5 op5Var = op5.a;
        ArrayList arrayListF = kotlin.collections.b.f(this.binding.w);
        ArrayList arrayListF2 = kotlin.collections.b.f(null);
        Context context = getContext();
        context.getClass();
        op5Var.getClass();
        op5.o(arrayListF, arrayListF2, context);
    }

    public final void setSpinMatchImage() {
        int iApplyDimension;
        this.binding.w.setVisibility(0);
        this.binding.w.setScaleY(1.2f);
        this.binding.w.setScaleX(1.2f);
        int i = getContext().getResources().getDisplayMetrics().heightPixels;
        int i2 = i / 3;
        ViewGroup.LayoutParams layoutParams = this.binding.d.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = i2;
        try {
            iApplyDimension = (int) TypedValue.applyDimension(1, 55.0f, getContext().getResources().getDisplayMetrics());
        } catch (Exception unused) {
            iApplyDimension = 0;
        }
        layoutParams2.setMargins(0, 0, 0, iApplyDimension);
        this.binding.d.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.binding.c.getLayoutParams();
        layoutParams3.getClass();
        ((LinearLayout.LayoutParams) layoutParams3).height = i2 / 6;
        ViewGroup.LayoutParams layoutParams4 = this.binding.w.getLayoutParams();
        layoutParams4.getClass();
        ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams4;
        int i3 = i / 25;
        layoutParams5.setMargins(i3, 0, 0, i3);
        this.binding.w.setLayoutParams(layoutParams5);
        op5 op5Var = op5.a;
        ArrayList arrayListF = kotlin.collections.b.f(this.binding.w);
        ArrayList arrayListF2 = kotlin.collections.b.f(null);
        Context context = getContext();
        context.getClass();
        op5Var.getClass();
        op5.o(arrayListF, arrayListF2, context);
    }

    public final void setUserDetails(String userName, String userIcon) {
        b bVar;
        if (this.G == null) {
            return;
        }
        if (userName == null || userName.length() <= 0) {
            b bVar2 = this.G;
            if (bVar2 == null) {
                Intrinsics.n("setUpDetails");
                throw null;
            }
            bVar2.d = getContext().getString(R.string.guest_username);
            bVar = this.G;
            if (bVar == null) {
                Intrinsics.n("setUpDetails");
                throw null;
            }
            bVar.c = "";
        } else {
            bVar = this.G;
            if (bVar == null) {
                Intrinsics.n("setUpDetails");
                throw null;
            }
            bVar.d = userName;
            bVar.c = userIcon;
        }
        this.binding.D.setText(bVar.d);
        b bVar3 = this.G;
        if (bVar3 == null) {
            Intrinsics.n("setUpDetails");
            throw null;
        }
        String str = bVar3.c;
        if (str == null || str.length() <= 0) {
            this.binding.b.setImageDrawable(getContext().getDrawable(2131232710));
            return;
        }
        hb50 hb50VarQ = ((hb50) new hb50().z(x6f.b, new wn7())).o(2131232710).h(2131232710).e(hre.a).q(lw20.b);
        hb50VarQ.getClass();
        hb50 hb50Var = hb50VarQ;
        Context context = getContext();
        context.getClass();
        xa50 xa50VarC = com.bumptech.glide.a.b(context).c(context);
        xa50VarC.getClass();
        b bVar4 = this.G;
        if (bVar4 == null) {
            Intrinsics.n("setUpDetails");
            throw null;
        }
        String str2 = bVar4.c;
        po80 po80Var = new po80(xa50VarC, str2, na7.a(xa50VarC, Drawable.class, str2), lo80.a);
        po80Var.a(hb50Var);
        po80Var.e(this.binding.b);
    }

    public final void setup(final b setUpDetails, Activity gameMainActivity, boolean playSoundEffect, a itemRenderedListener, Function0<Boolean> isLoggedIn) {
        setUpDetails.getClass();
        gameMainActivity.getClass();
        this.G = setUpDetails;
        TextView textView = this.binding.f;
        int i = setUpDetails.b;
        textView.setText(i);
        setUserDetails(setUpDetails.d, setUpDetails.c);
        Context context = getContext();
        context.getClass();
        HamMenuLinearLayoutManager hamMenuLinearLayoutManager = new HamMenuLinearLayoutManager(context, null, 0, 14, 0);
        hamMenuLinearLayoutManager.T = itemRenderedListener;
        this.binding.z.setLayoutManager(hamMenuLinearLayoutManager);
        List<LeftMenuButton> list = setUpDetails.e;
        ypa0 ypa0Var = setUpDetails.a;
        String string = getResources().getString(i);
        string.getClass();
        k4s k4sVar = new k4s(list, gameMainActivity, ypa0Var, string, playSoundEffect);
        this.adapter = k4sVar;
        this.binding.z.setAdapter(k4sVar);
        int i2 = 1;
        gr60.a(this.binding.c, new b7p(setUpDetails, i2));
        gr60.a(this.binding.D, new v920(setUpDetails, i2));
        gr60.a(this.binding.b, new w920(setUpDetails, i2));
        gr60.a(this.binding.F, new Function1() { // from class: sj60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = SGHamburgerMenu.M;
                ((View) obj).getClass();
                Function0<Unit> function0 = setUpDetails.i;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.a;
            }
        });
        gr60.a(this.binding.E, new etj(setUpDetails, 2));
        if (isLoggedIn != null) {
            boolean zBooleanValue = isLoggedIn.invoke().booleanValue();
            qo80 qo80Var = this.binding;
            if (zBooleanValue) {
                qo80Var.c.setVisibility(0);
            } else {
                qo80Var.c.setVisibility(4);
            }
        }
        op5 op5Var = op5.a;
        qo80 qo80Var2 = this.binding;
        op5.r(op5Var, kotlin.collections.b.f(qo80Var2.f, qo80Var2.F), null, 6);
        if (!kotlin.text.c.l(SportyGamesManager.getInstance().getCountry(), "za", true) && !kotlin.text.c.l(SportyGamesManager.getInstance().getSubCountry(), "br", true)) {
            this.binding.e.setVisibility(8);
            return;
        }
        String string2 = getContext().getString(R.string.rng_version);
        string2.getClass();
        String strB = op5.b(string2, "", null);
        String string3 = getContext().getString(R.string.rtp_value);
        string3.getClass();
        String strB2 = op5.b(string3, "", null);
        if (strB.length() == 0 || strB2.length() == 0) {
            this.binding.e.setVisibility(8);
            return;
        }
        this.binding.e.setVisibility(0);
        this.binding.B.setText(strB);
        this.binding.C.setText(strB2);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/sportygames/commons/components/SGHamburgerMenu$HamMenuLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HamMenuLinearLayoutManager extends LinearLayoutManager {
        public a T;

        public /* synthetic */ HamMenuLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
            this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final void u0(RecyclerView.z zVar) {
            a aVar;
            Float f;
            Float f2;
            Float f3;
            Float f4;
            super.u0(zVar);
            View viewJ = J(0);
            float fFloatValue = 0.0f;
            float height = viewJ != null ? viewJ.getHeight() : 0.0f;
            View viewJ2 = J(1);
            float height2 = viewJ2 != null ? viewJ2.getHeight() : 0.0f;
            View viewJ3 = J(2);
            float height3 = viewJ3 != null ? viewJ3.getHeight() : 0.0f;
            View viewJ4 = J(2);
            float width = viewJ4 != null ? viewJ4.getWidth() : 0.0f;
            if (height == 0.0f || height2 == 0.0f || height3 == 0.0f || width == 0.0f || (aVar = this.T) == null) {
                return;
            }
            Map mapF = kpu.f(new Pair("FH_HAM_ITEM0_HEIGHT", Float.valueOf(height)), new Pair("FH_HAM_ITEM1_HEIGHT", Float.valueOf(height2)), new Pair("FH_HAM_ITEM2_HEIGHT", Float.valueOf(height3)), new Pair("FH_HAM_ITEM_WIDTH", Float.valueOf(width)));
            n2j n2jVar = ((z1j) aVar).a;
            n2jVar.A = (!mapF.containsKey("FH_HAM_ITEM0_HEIGHT") || (f4 = (Float) mapF.get("FH_HAM_ITEM0_HEIGHT")) == null) ? 0.0f : f4.floatValue();
            n2jVar.B = (!mapF.containsKey("FH_HAM_ITEM1_HEIGHT") || (f3 = (Float) mapF.get("FH_HAM_ITEM1_HEIGHT")) == null) ? 0.0f : f3.floatValue();
            n2jVar.C = (!mapF.containsKey("FH_HAM_ITEM2_HEIGHT") || (f2 = (Float) mapF.get("FH_HAM_ITEM2_HEIGHT")) == null) ? 0.0f : f2.floatValue();
            if (mapF.containsKey("FH_HAM_ITEM_WIDTH") && (f = (Float) mapF.get("FH_HAM_ITEM_WIDTH")) != null) {
                fFloatValue = f.floatValue();
            }
            n2jVar.D = fFloatValue;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public HamMenuLinearLayoutManager(Context context, AttributeSet attributeSet, int i) {
            this(context, attributeSet, i, 8, 0);
            context.getClass();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HamMenuLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
            context.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public HamMenuLinearLayoutManager(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0, 12, 0);
            context.getClass();
        }
    }

    public static final class b {
        public final ypa0 a;
        public final int b;
        public String c;
        public String d;
        public final List<LeftMenuButton> e;
        public final Function0<Unit> f;
        public final Function0<Unit> g;
        public final String h;
        public final Function0<Unit> i;

        public b(ypa0 ypa0Var, int i, String str, String str2, List list, Function0 function0, Function0 function1, String str3, l9b l9bVar) {
            list.getClass();
            this.a = ypa0Var;
            this.b = i;
            this.c = str;
            this.d = str2;
            this.e = list;
            this.f = function0;
            this.g = function1;
            this.h = str3;
            this.i = l9bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && this.b == bVar.b && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d) && Intrinsics.g(this.e, bVar.e) && Intrinsics.g(this.f, bVar.f) && Intrinsics.g(this.g, bVar.g) && Intrinsics.g(this.h, bVar.h) && Intrinsics.g(this.i, bVar.i);
        }

        public final int hashCode() {
            ypa0 ypa0Var = this.a;
            int iA = gpp.a(this.b, (ypa0Var == null ? 0 : ypa0Var.hashCode()) * 31, 31);
            String str = this.c;
            int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iA2 = x7g.a(x7g.a(ai50.a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
            String str3 = this.h;
            int iHashCode2 = (iA2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Function0<Unit> function0 = this.i;
            return iHashCode2 + (function0 != null ? function0.hashCode() : 0);
        }

        public final String toString() {
            String str = this.c;
            String str2 = this.d;
            StringBuilder sb = new StringBuilder("SetUpDetails(gameViewModel=");
            sb.append(this.a);
            sb.append(", gameNameResource=");
            sb.append(this.b);
            sb.append(", userImage=");
            hxa.c(sb, str, ", userName=", str2, ", menuList=");
            sb.append(this.e);
            sb.append(", onClose=");
            sb.append(this.f);
            sb.append(", onAddMoney=");
            sb.append(this.g);
            sb.append(", gameName=");
            sb.append(this.h);
            sb.append(", onUserNameClick=");
            sb.append(this.i);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ b(ypa0 ypa0Var, int i, String str, String str2, List list, Function0 function0, Function0 function1) {
            this(ypa0Var, i, str, str2, list, function0, function1, "", null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SGHamburgerMenu(Context context) {
        this(context, null);
        context.getClass();
    }
}
