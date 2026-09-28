package defpackage;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.navigation.NavigationView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.commons.components.BetBoxContainer;
import com.sportygames.commons.components.BetChipContainer;
import com.sportygames.commons.components.ChipSlider;
import com.sportygames.commons.components.GameHeader;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.commons.components.WalletText;
import com.sportygames.commons.components.a;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.LeftMenuButton;
import com.sportygames.commons.models.MenuIconSize;
import com.sportygames.commons.models.OnboardingItem;
import com.sportygames.commons.models.PagingState;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.models.enums.PagingFetchType;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.spindabottle.components.RoundResult;
import com.sportygames.spindabottle.remote.models.ChatRoomResponse;
import com.sportygames.spindabottle.remote.models.DetailResponse;
import com.sportygames.spindabottle.remote.models.GameAvailableResponse;
import com.sportygames.spindabottle.remote.models.PlaceBetRequest;
import com.sportygames.spindabottle.remote.models.PlaceBetResponse;
import com.sportygames.spindabottle.remote.models.UserValidateResponse;
import com.sportygames.spindabottle.remote.models.WalletInfo;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import nl.dionsegijn.konfetti.xml.KonfettiView;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lb8b0;", "Ll12;", "Lfm1;", "Ldcb0;", "", "Lcom/sportygames/commons/views/GameMainActivity$b;", "Lbb;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b8b0 extends l12<fm1, dcb0> implements GameMainActivity.b, bb {
    public fm1.c A0;
    public xbg B;
    public long B0;
    public final q8i0 D;
    public final q8i0 E;
    public final q8i0 F;
    public final q8i0 G;
    public fo2 H;
    public Double I;
    public ypa0 J;
    public final q8i0 K;
    public int L;
    public int M;
    public double N;
    public double O;
    public double P;
    public double Q;
    public boolean R;
    public boolean S;
    public double T;
    public int U;
    public String V;
    public boolean W;
    public SharedPreferences.Editor X;
    public ArrayList<Double> Y;
    public SharedPreferences Z;
    public PlaceBetResponse a0;
    public int b0;
    public RotateAnimation c;
    public double c0;
    public com.sportygames.commons.components.a d;
    public boolean d0;
    public com.sportygames.commons.components.a e;
    public boolean e0;
    public double f;
    public boolean f0;
    public int g0;
    public PromotionGiftsResponse h0;
    public xi60 i0;
    public int j0;
    public boolean k0;
    public b l0;
    public fq5 m0;
    public List<GameDetails> n0;
    public boolean o0;
    public String p0;
    public final List<String> q0;
    public boolean r0;
    public boolean s0;
    public String t0;
    public nle u0;
    public mke v0;
    public boolean w;
    public z66 w0;
    public boolean x0;
    public GameDetails y;
    public boolean y0;
    public boolean z0;
    public String i = "";
    public String v = "";
    public String z = "";
    public String A = "";
    public String C = "";

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            rk60 soundManager;
            intent.getClass();
            b8b0 b8b0Var = b8b0.this;
            dcb0 dcb0Var = (dcb0) b8b0Var.b;
            if (dcb0Var == null || (soundManager = dcb0Var.M.getSoundManager()) == null) {
                return;
            }
            ypa0 ypa0Var = b8b0Var.J;
            if (ypa0Var != null) {
                ypa0Var.F1(soundManager, new e8b0(b8b0Var, 0));
            } else {
                Intrinsics.n("soundViewModel");
                throw null;
            }
        }
    }

    public static final class c implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public c(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return b8b0.this.requireActivity().getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return b8b0.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class f extends qlr implements Function0<r8i0.c> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return b8b0.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class g extends qlr implements Function0<v8i0> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return b8b0.this.requireActivity().getViewModelStore();
        }
    }

    public static final class h extends qlr implements Function0<cyb> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return b8b0.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class i extends qlr implements Function0<r8i0.c> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return b8b0.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class j extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? b8b0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class k extends qlr implements Function0<Fragment> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return b8b0.this;
        }
    }

    public static final class l extends qlr implements Function0<w8i0> {
        public final /* synthetic */ k a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.a = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class m extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class n extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class o extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? b8b0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class p extends qlr implements Function0<Fragment> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return b8b0.this;
        }
    }

    public static final class q extends qlr implements Function0<w8i0> {
        public final /* synthetic */ p a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(p pVar) {
            super(0);
            this.a = pVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class r extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class s extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class t extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? b8b0.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class u extends qlr implements Function0<Fragment> {
        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return b8b0.this;
        }
    }

    public static final class v extends qlr implements Function0<w8i0> {
        public final /* synthetic */ u a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(u uVar) {
            super(0);
            this.a = uVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class w extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class x extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public b8b0() {
        p pVar = new p();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new q(pVar));
        this.D = new q8i0(jq40.a(eu2.class), new r(ttrVarA), new t(ttrVarA), new s(ttrVarA));
        ttr ttrVarA2 = hwr.a(a1sVar, new v(new u()));
        this.E = new q8i0(jq40.a(r530.class), new w(ttrVarA2), new j(ttrVarA2), new x(ttrVarA2));
        this.F = new q8i0(jq40.a(fuj.class), new d(), new f(), new e());
        this.G = new q8i0(jq40.a(db6.class), new g(), new i(), new h());
        ttr ttrVarA3 = hwr.a(a1sVar, new l(new k()));
        this.K = new q8i0(jq40.a(di10.class), new m(ttrVarA3), new o(ttrVarA3), new n(ttrVarA3));
        this.V = "";
        this.W = true;
        new LinkedHashSet();
        this.Y = new ArrayList<>();
        this.p0 = "sg_spin_da_bottle";
        this.q0 = kotlin.collections.b.k("sg_common_dialog_message", "sg_chat", "sg_bethistory", "sg_fbg_dialog", "sg_ham_menu", "sg_common", "sg_exit_dialog", "sg_game_common", "currency_symbols", "sg_onboarding", "common_functions", "sg_campaign");
        this.t0 = "en";
    }

    public final void C0() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        this.U = 1;
        this.M = 0;
        if (this.y0) {
            G0();
        }
        I0(true);
        ypa0 ypa0Var = this.J;
        if (ypa0Var == null) {
            Intrinsics.n("soundViewModel");
            throw null;
        }
        String string = getString(R.string.click_main_menu);
        string.getClass();
        ypa0Var.A1(0L, string);
        dcb0 dcb0Var = (dcb0) this.b;
        if (dcb0Var != null && (viewPropertyAnimatorAnimate = dcb0Var.v.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) != null) {
            viewPropertyAnimatorAlpha.setDuration(300L);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: u6b0
            @Override // java.lang.Runnable
            public final void run() {
                b8b0 b8b0Var = this.a;
                dcb0 dcb0Var2 = (dcb0) b8b0Var.b;
                if (dcb0Var2 != null) {
                    dcb0Var2.v.setRotation(-((float) b8b0Var.T));
                }
            }
        }, 400L);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: v6b0
            @Override // java.lang.Runnable
            public final void run() {
                ViewPropertyAnimator viewPropertyAnimatorAnimate2;
                ViewPropertyAnimator viewPropertyAnimatorAlpha2;
                dcb0 dcb0Var2 = (dcb0) this.a.b;
                if (dcb0Var2 == null || (viewPropertyAnimatorAnimate2 = dcb0Var2.v.animate()) == null || (viewPropertyAnimatorAlpha2 = viewPropertyAnimatorAnimate2.alpha(1.0f)) == null) {
                    return;
                }
                viewPropertyAnimatorAlpha2.setDuration(300L);
            }
        }, 500L);
        dcb0 dcb0Var2 = (dcb0) this.b;
        if (dcb0Var2 != null) {
            dcb0Var2.c.setVisibility(0);
        }
        dcb0 dcb0Var3 = (dcb0) this.b;
        if (dcb0Var3 != null) {
            dcb0Var3.i.setVisibility(0);
        }
        dcb0 dcb0Var4 = (dcb0) this.b;
        if (dcb0Var4 != null) {
            dcb0Var4.d.setVisibility(0);
        }
        dcb0 dcb0Var5 = (dcb0) this.b;
        if (dcb0Var5 != null) {
            dcb0Var5.S.setVisibility(0);
        }
        dcb0 dcb0Var6 = (dcb0) this.b;
        if (dcb0Var6 != null) {
            dcb0Var6.B.setVisibility(8);
        }
        dcb0 dcb0Var7 = (dcb0) this.b;
        if (dcb0Var7 != null) {
            dcb0Var7.A.setVisibility(4);
        }
        dcb0 dcb0Var8 = (dcb0) this.b;
        if (dcb0Var8 != null) {
            dcb0Var8.z.setVisibility(8);
        }
    }

    public final void D0() {
        int i2;
        boolean zBooleanValue;
        AppCompatImageView chat;
        Context context = getContext();
        if (context != null) {
            ArrayList<OnboardingItem> arrayListA = sny.a(context, "spin-da-bottle");
            if (arrayListA.isEmpty()) {
                i2 = 0;
                zBooleanValue = false;
            } else {
                int size = arrayListA.size();
                i2 = 0;
                zBooleanValue = false;
                while (true) {
                    if (i2 >= size) {
                        i2 = 0;
                        break;
                    }
                    Boolean isView = arrayListA.get(i2).getIsView();
                    zBooleanValue = isView != null ? isView.booleanValue() : false;
                    if (!zBooleanValue) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.o0 = true;
            if (zBooleanValue) {
                this.s0 = false;
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new d8b0(this, null), 3);
                return;
            }
            this.s0 = true;
            if (this.y != null) {
                dcb0 dcb0Var = (dcb0) this.b;
                boolean z = (dcb0Var == null || (chat = dcb0Var.C.getChat()) == null || chat.getVisibility() != 0) ? false : true;
                FragmentManager childFragmentManager = getChildFragmentManager();
                androidx.fragment.app.a aVarA = oke.a(childFragmentManager, childFragmentManager);
                op5.a.getClass();
                List<? extends File> list = op5.b;
                o2g o2gVar = o2g.a;
                o2gVar.getClass();
                com.sportygames.commons.views.a aVar = new com.sportygames.commons.views.a();
                aVar.c = "spin-da-bottle";
                aVar.d = i2;
                aVar.w = list;
                aVar.z = o2gVar;
                aVar.A = z;
                aVarA.f(R.id.onboarding_images, aVar, null);
                aVarA.d();
            }
            dcb0 dcb0Var2 = (dcb0) this.b;
            if (dcb0Var2 != null) {
                dcb0Var2.J.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:128:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:129:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:132:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:133:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:137:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:139:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:140:0x04da  */
    /* JADX WARN: Code duplicated, block: B:143:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:144:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:62:0x0126 A[Catch: Exception -> 0x017b, TryCatch #0 {Exception -> 0x017b, blocks: (B:26:0x005a, B:28:0x0060, B:29:0x0065, B:31:0x006b, B:33:0x006f, B:34:0x0076, B:36:0x007c, B:37:0x007f, B:39:0x0087, B:41:0x008b, B:42:0x009c, B:44:0x00a3, B:45:0x00a8, B:47:0x00b0, B:48:0x00cb, B:60:0x010d, B:62:0x0126, B:63:0x012d, B:65:0x0131, B:66:0x0136, B:68:0x013c, B:69:0x013f, B:71:0x0145, B:72:0x014c, B:74:0x0150, B:76:0x0163, B:77:0x0168, B:79:0x016c, B:80:0x0175, B:81:0x017a, B:50:0x00d0, B:52:0x00d8, B:56:0x00e9, B:57:0x00ec, B:59:0x00f4), top: B:148:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0131 A[Catch: Exception -> 0x017b, TryCatch #0 {Exception -> 0x017b, blocks: (B:26:0x005a, B:28:0x0060, B:29:0x0065, B:31:0x006b, B:33:0x006f, B:34:0x0076, B:36:0x007c, B:37:0x007f, B:39:0x0087, B:41:0x008b, B:42:0x009c, B:44:0x00a3, B:45:0x00a8, B:47:0x00b0, B:48:0x00cb, B:60:0x010d, B:62:0x0126, B:63:0x012d, B:65:0x0131, B:66:0x0136, B:68:0x013c, B:69:0x013f, B:71:0x0145, B:72:0x014c, B:74:0x0150, B:76:0x0163, B:77:0x0168, B:79:0x016c, B:80:0x0175, B:81:0x017a, B:50:0x00d0, B:52:0x00d8, B:56:0x00e9, B:57:0x00ec, B:59:0x00f4), top: B:148:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:68:0x013c A[Catch: Exception -> 0x017b, TryCatch #0 {Exception -> 0x017b, blocks: (B:26:0x005a, B:28:0x0060, B:29:0x0065, B:31:0x006b, B:33:0x006f, B:34:0x0076, B:36:0x007c, B:37:0x007f, B:39:0x0087, B:41:0x008b, B:42:0x009c, B:44:0x00a3, B:45:0x00a8, B:47:0x00b0, B:48:0x00cb, B:60:0x010d, B:62:0x0126, B:63:0x012d, B:65:0x0131, B:66:0x0136, B:68:0x013c, B:69:0x013f, B:71:0x0145, B:72:0x014c, B:74:0x0150, B:76:0x0163, B:77:0x0168, B:79:0x016c, B:80:0x0175, B:81:0x017a, B:50:0x00d0, B:52:0x00d8, B:56:0x00e9, B:57:0x00ec, B:59:0x00f4), top: B:148:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0145 A[Catch: Exception -> 0x017b, TryCatch #0 {Exception -> 0x017b, blocks: (B:26:0x005a, B:28:0x0060, B:29:0x0065, B:31:0x006b, B:33:0x006f, B:34:0x0076, B:36:0x007c, B:37:0x007f, B:39:0x0087, B:41:0x008b, B:42:0x009c, B:44:0x00a3, B:45:0x00a8, B:47:0x00b0, B:48:0x00cb, B:60:0x010d, B:62:0x0126, B:63:0x012d, B:65:0x0131, B:66:0x0136, B:68:0x013c, B:69:0x013f, B:71:0x0145, B:72:0x014c, B:74:0x0150, B:76:0x0163, B:77:0x0168, B:79:0x016c, B:80:0x0175, B:81:0x017a, B:50:0x00d0, B:52:0x00d8, B:56:0x00e9, B:57:0x00ec, B:59:0x00f4), top: B:148:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0150 A[Catch: Exception -> 0x017b, TryCatch #0 {Exception -> 0x017b, blocks: (B:26:0x005a, B:28:0x0060, B:29:0x0065, B:31:0x006b, B:33:0x006f, B:34:0x0076, B:36:0x007c, B:37:0x007f, B:39:0x0087, B:41:0x008b, B:42:0x009c, B:44:0x00a3, B:45:0x00a8, B:47:0x00b0, B:48:0x00cb, B:60:0x010d, B:62:0x0126, B:63:0x012d, B:65:0x0131, B:66:0x0136, B:68:0x013c, B:69:0x013f, B:71:0x0145, B:72:0x014c, B:74:0x0150, B:76:0x0163, B:77:0x0168, B:79:0x016c, B:80:0x0175, B:81:0x017a, B:50:0x00d0, B:52:0x00d8, B:56:0x00e9, B:57:0x00ec, B:59:0x00f4), top: B:148:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0163 A[Catch: Exception -> 0x017b, TryCatch #0 {Exception -> 0x017b, blocks: (B:26:0x005a, B:28:0x0060, B:29:0x0065, B:31:0x006b, B:33:0x006f, B:34:0x0076, B:36:0x007c, B:37:0x007f, B:39:0x0087, B:41:0x008b, B:42:0x009c, B:44:0x00a3, B:45:0x00a8, B:47:0x00b0, B:48:0x00cb, B:60:0x010d, B:62:0x0126, B:63:0x012d, B:65:0x0131, B:66:0x0136, B:68:0x013c, B:69:0x013f, B:71:0x0145, B:72:0x014c, B:74:0x0150, B:76:0x0163, B:77:0x0168, B:79:0x016c, B:80:0x0175, B:81:0x017a, B:50:0x00d0, B:52:0x00d8, B:56:0x00e9, B:57:0x00ec, B:59:0x00f4), top: B:148:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:79:0x016c A[Catch: Exception -> 0x017b, TryCatch #0 {Exception -> 0x017b, blocks: (B:26:0x005a, B:28:0x0060, B:29:0x0065, B:31:0x006b, B:33:0x006f, B:34:0x0076, B:36:0x007c, B:37:0x007f, B:39:0x0087, B:41:0x008b, B:42:0x009c, B:44:0x00a3, B:45:0x00a8, B:47:0x00b0, B:48:0x00cb, B:60:0x010d, B:62:0x0126, B:63:0x012d, B:65:0x0131, B:66:0x0136, B:68:0x013c, B:69:0x013f, B:71:0x0145, B:72:0x014c, B:74:0x0150, B:76:0x0163, B:77:0x0168, B:79:0x016c, B:80:0x0175, B:81:0x017a, B:50:0x00d0, B:52:0x00d8, B:56:0x00e9, B:57:0x00ec, B:59:0x00f4), top: B:148:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0175 A[Catch: Exception -> 0x017b, TryCatch #0 {Exception -> 0x017b, blocks: (B:26:0x005a, B:28:0x0060, B:29:0x0065, B:31:0x006b, B:33:0x006f, B:34:0x0076, B:36:0x007c, B:37:0x007f, B:39:0x0087, B:41:0x008b, B:42:0x009c, B:44:0x00a3, B:45:0x00a8, B:47:0x00b0, B:48:0x00cb, B:60:0x010d, B:62:0x0126, B:63:0x012d, B:65:0x0131, B:66:0x0136, B:68:0x013c, B:69:0x013f, B:71:0x0145, B:72:0x014c, B:74:0x0150, B:76:0x0163, B:77:0x0168, B:79:0x016c, B:80:0x0175, B:81:0x017a, B:50:0x00d0, B:52:0x00d8, B:56:0x00e9, B:57:0x00ec, B:59:0x00f4), top: B:148:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0180  */
    public final void E0() {
        String houseDraw;
        PlaceBetResponse placeBetResponse;
        String str;
        int i2;
        PlaceBetResponse placeBetResponse2;
        String houseDraw2;
        PlaceBetResponse placeBetResponse3;
        String userPick;
        PlaceBetResponse placeBetResponse4;
        String houseDraw3;
        dcb0 dcb0Var;
        String strD;
        String strD2;
        double dFloor;
        dcb0 dcb0Var2;
        RotateAnimation rotateAnimation;
        RotateAnimation rotateAnimation2;
        dcb0 dcb0Var3;
        ypa0 ypa0Var;
        dcb0 dcb0Var4;
        RotateAnimation rotateAnimation3;
        ssw<LoadingState<HTTPResponse<WalletInfo>>> sswVar;
        ssw<LoadingState<HTTPResponse<WalletInfo>>> sswVar2;
        dcb0 dcb0Var5 = (dcb0) this.b;
        if (dcb0Var5 != null) {
            dcb0Var5.S.setVisibility(8);
        }
        dcb0 dcb0Var6 = (dcb0) this.b;
        if (dcb0Var6 != null) {
            dcb0Var6.A.setVisibility(4);
        }
        dcb0 dcb0Var7 = (dcb0) this.b;
        if (dcb0Var7 != null) {
            dcb0Var7.i.setVisibility(8);
        }
        dcb0 dcb0Var8 = (dcb0) this.b;
        if (dcb0Var8 != null) {
            dcb0Var8.d.setVisibility(8);
        }
        dcb0 dcb0Var9 = (dcb0) this.b;
        if (dcb0Var9 != null) {
            dcb0Var9.c.setVisibility(8);
        }
        dcb0 dcb0Var10 = (dcb0) this.b;
        boolean z = false;
        if (dcb0Var10 != null) {
            dcb0Var10.C.a(0);
        }
        PlaceBetResponse placeBetResponse5 = this.a0;
        if (placeBetResponse5 == null || (houseDraw = placeBetResponse5.getHouseDraw()) == null) {
            houseDraw = "";
        }
        int i3 = 1;
        try {
            dcb0 dcb0Var11 = (dcb0) this.b;
            if (dcb0Var11 != null) {
                dcb0Var11.C.a(8);
            }
            fm1 fm1Var = (fm1) this.a;
            if (fm1Var != null && (sswVar2 = fm1Var.y) != null) {
                sswVar2.l(getViewLifecycleOwner());
            }
            fm1 fm1Var2 = (fm1) this.a;
            if (fm1Var2 != null) {
                fm1Var2.z1();
            }
            this.S = true;
            fm1 fm1Var3 = (fm1) this.a;
            if (fm1Var3 != null && (sswVar = fm1Var3.y) != null) {
                sswVar.f(getViewLifecycleOwner(), new c(new j7b0(this, z)));
            }
            dcb0 dcb0Var12 = (dcb0) this.b;
            float f2 = 0.0f;
            if (dcb0Var12 != null) {
                dcb0Var12.v.setRotation(0.0f);
            }
            if (!houseDraw.equalsIgnoreCase("UP")) {
                if (!houseDraw.equalsIgnoreCase("MIDDLE")) {
                    if (houseDraw.equalsIgnoreCase("Down")) {
                        dFloor = Math.floor((new SecureRandom().nextDouble() * 61.0d) + 15.0d);
                        this.T = dFloor;
                    }
                    placeBetResponse = this.a0;
                    if (placeBetResponse != null || (dcb0Var = (dcb0) this.b) == null) {
                        str = null;
                        i2 = 3;
                    } else {
                        RoundResult roundResult = dcb0Var.z;
                        boolean zG = Intrinsics.g(placeBetResponse.getUserPick(), placeBetResponse.getHouseDraw());
                        bcb0 bcb0Var = roundResult.binding;
                        if (zG) {
                            bcb0Var.z.setVisibility(0);
                            roundResult.binding.B.setVisibility(0);
                            roundResult.binding.A.setVisibility(8);
                            roundResult.binding.C.setVisibility(8);
                            roundResult.binding.D.setVisibility(8);
                            roundResult.binding.e.setVisibility(4);
                            pfd pfdVar = fse.a;
                            ej5.c(w5b.a(gku.a), null, null, new tz50(placeBetResponse, roundResult, null), 3);
                            roundResult.binding.v.setTextColor(roundResult.getContext().getColor(R.color.white));
                            if (Build.VERSION.SDK_INT <= 25) {
                                roundResult.binding.v.setTextSize(34.0f);
                                roundResult.binding.i.setTextSize(20.0f);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            Drawable drawable = roundResult.getContext().getDrawable(R.drawable.sporty_trophy);
                            op5 op5Var = op5.a;
                            String string = roundResult.binding.i.getTag().toString();
                            String string2 = roundResult.getContext().getString(R.string.redblack_win_msg);
                            string2.getClass();
                            String strC = op5.c(op5Var, string, string2);
                            if (drawable != null) {
                                drawable.setBounds(0, 0, (roundResult.binding.i.getLineHeight() * 40) / 53, roundResult.binding.i.getLineHeight());
                            }
                            spannableStringBuilder.append((CharSequence) strC.concat("  "));
                            int color = roundResult.getContext().getColor(R.color.win_color);
                            String strI = op5.i(placeBetResponse.getCurrency());
                            Locale locale = Locale.ROOT;
                            String upperCase = strI.toUpperCase(locale);
                            upperCase.getClass();
                            Double actualCreditedAmt = placeBetResponse.getActualCreditedAmt();
                            if (actualCreditedAmt != null) {
                                double dDoubleValue = actualCreditedAmt.doubleValue();
                                TreeMap treeMap = pw.a;
                                strD = pw.d(dDoubleValue);
                            } else {
                                strD = null;
                            }
                            StringBuilder sbA = uqe0.a(color, "<font color=", ">", upperCase, " ");
                            sbA.append(strD);
                            sbA.append("</font>");
                            spannableStringBuilder.append((CharSequence) Html.fromHtml(sbA.toString()));
                            spannableStringBuilder.setSpan(drawable != null ? new ImageSpan(drawable, 1) : null, strC.length(), strC.length() + 1, 17);
                            roundResult.binding.i.setText(spannableStringBuilder);
                            if (placeBetResponse.getGiftAmount() == null || placeBetResponse.getGiftAmount().doubleValue() <= 0.0d) {
                                roundResult.binding.e.setVisibility(4);
                            } else {
                                roundResult.binding.e.setVisibility(0);
                                TextView textView = roundResult.binding.y;
                                String upperCase2 = op5.i(placeBetResponse.getCurrency()).toUpperCase(locale);
                                upperCase2.getClass();
                                Double payoutAmount = placeBetResponse.getPayoutAmount();
                                if (payoutAmount != null) {
                                    double dDoubleValue2 = payoutAmount.doubleValue();
                                    TreeMap treeMap2 = pw.a;
                                    strD2 = pw.d(dDoubleValue2);
                                } else {
                                    strD2 = null;
                                }
                                hu1.b(upperCase2, " ", strD2, textView);
                                TextView textView2 = roundResult.binding.d;
                                String upperCase3 = op5.i(placeBetResponse.getCurrency()).toUpperCase(locale);
                                upperCase3.getClass();
                                TreeMap treeMap3 = pw.a;
                                hu1.b(upperCase3, " ", pw.d(placeBetResponse.getGiftAmount().doubleValue()), textView2);
                                TextView textView3 = roundResult.binding.E;
                                String upperCase4 = op5.i(placeBetResponse.getCurrency()).toUpperCase(locale);
                                upperCase4.getClass();
                                Double actualCreditedAmt2 = placeBetResponse.getActualCreditedAmt();
                                hu1.b(upperCase4, " ", actualCreditedAmt2 != null ? pw.d(actualCreditedAmt2.doubleValue()) : null, textView3);
                            }
                            roundResult.binding.w.setVisibility(0);
                            roundResult.binding.i.setVisibility(0);
                            roundResult.binding.f.setVisibility(8);
                            roundResult.binding.b.setVisibility(0);
                            TextView textView4 = roundResult.binding.v;
                            String upperCase5 = placeBetResponse.getHouseDraw().toUpperCase(locale);
                            upperCase5.getClass();
                            textView4.setText(upperCase5);
                            Animation animationLoadAnimation = AnimationUtils.loadAnimation(roundResult.getContext(), R.anim.animation_left);
                            animationLoadAnimation.getClass();
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(roundResult.getContext(), R.anim.animation_right);
                            animationLoadAnimation2.getClass();
                            roundResult.binding.w.startAnimation(animationLoadAnimation);
                            roundResult.binding.b.startAnimation(animationLoadAnimation2);
                            op5.r(op5Var, kotlin.collections.b.f(roundResult.binding.v), null, 4);
                            str = null;
                            i2 = 3;
                        } else {
                            bcb0Var.z.setVisibility(0);
                            roundResult.binding.B.setVisibility(0);
                            roundResult.binding.A.setVisibility(0);
                            roundResult.binding.e.setVisibility(4);
                            roundResult.binding.C.setVisibility(0);
                            roundResult.binding.D.setVisibility(0);
                            roundResult.binding.v.setTextColor(roundResult.getContext().getColor(R.color.off_white));
                            pfd pfdVar2 = fse.a;
                            i2 = 3;
                            ej5.c(w5b.a(gku.a), null, null, new rz50(placeBetResponse, roundResult, null), 3);
                            if (Build.VERSION.SDK_INT <= 25) {
                                roundResult.binding.v.setTextSize(34.0f);
                            }
                            boolean zL = kotlin.text.c.l(placeBetResponse.getUserPick(), "UP", true);
                            bcb0 bcb0Var2 = roundResult.binding;
                            if (zL) {
                                bcb0Var2.f.setTag("sorry_you_chose_up:sg_game_name");
                            } else {
                                bcb0Var2.f.setTag("sorry_you_chose_down:sg_game_name");
                            }
                            roundResult.binding.f.setText(roundResult.getContext().getString(R.string.redblack_lost_msg, placeBetResponse.getUserPick()));
                            TextView textView5 = roundResult.binding.v;
                            String upperCase6 = placeBetResponse.getHouseDraw().toUpperCase(Locale.ROOT);
                            upperCase6.getClass();
                            textView5.setText(upperCase6);
                            op5 op5Var2 = op5.a;
                            bcb0 bcb0Var3 = roundResult.binding;
                            str = null;
                            op5.r(op5Var2, kotlin.collections.b.f(bcb0Var3.f, bcb0Var3.v), null, 4);
                            roundResult.binding.f.setVisibility(0);
                            roundResult.binding.i.setVisibility(8);
                            roundResult.binding.F.setVisibility(8);
                            roundResult.binding.E.setVisibility(8);
                            roundResult.binding.w.setVisibility(8);
                            roundResult.binding.b.setVisibility(8);
                            roundResult.binding.i.setVisibility(8);
                            roundResult.binding.b.clearAnimation();
                            roundResult.binding.w.clearAnimation();
                        }
                    }
                    placeBetResponse2 = this.a0;
                    if (placeBetResponse2 != null) {
                        houseDraw2 = placeBetResponse2.getHouseDraw();
                    } else {
                        houseDraw2 = str;
                    }
                    placeBetResponse3 = this.a0;
                    if (placeBetResponse3 != null) {
                        userPick = placeBetResponse3.getUserPick();
                    } else {
                        userPick = str;
                    }
                    if (!kotlin.text.c.l(houseDraw2, userPick, false)) {
                        placeBetResponse4 = this.a0;
                        if (placeBetResponse4 != null) {
                            houseDraw3 = placeBetResponse4.getHouseDraw();
                        } else {
                            houseDraw3 = str;
                        }
                        if (kotlin.text.c.l(houseDraw3, "middle", true)) {
                            i3 = i2;
                        } else {
                            i3 = 2;
                        }
                    }
                    this.b0 = i3;
                }
                f2 = new SecureRandom().nextBoolean() ? 1440.0f : 1620.0f;
                this.T = 0.0d;
                RotateAnimation rotateAnimation4 = new RotateAnimation(0.0f, f2, 1, 0.5f, 1, 0.45f);
                this.c = rotateAnimation4;
                rotateAnimation4.setFillAfter(true);
                dcb0Var2 = (dcb0) this.b;
                if (dcb0Var2 != null) {
                    dcb0Var2.Y.setAlpha(1.0f);
                }
                rotateAnimation = this.c;
                if (rotateAnimation != null) {
                    rotateAnimation.setInterpolator(g4c.f);
                }
                rotateAnimation2 = this.c;
                if (rotateAnimation2 != null) {
                    rotateAnimation2.setDuration(3200L);
                }
                dcb0Var3 = (dcb0) this.b;
                if (dcb0Var3 != null) {
                    dcb0Var3.v.startAnimation(this.c);
                }
                ypa0Var = this.J;
                if (ypa0Var != null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                String string3 = getString(R.string.bottle);
                string3.getClass();
                ypa0Var.A1(3200L, string3);
                dcb0Var4 = (dcb0) this.b;
                if (dcb0Var4 != null) {
                    dcb0Var4.C.setBackImageVisible(8);
                }
                rotateAnimation3 = this.c;
                if (rotateAnimation3 != null) {
                    rotateAnimation3.setAnimationListener(new i8b0(this));
                }
                placeBetResponse = this.a0;
                if (placeBetResponse != null) {
                    str = null;
                    i2 = 3;
                } else {
                    str = null;
                    i2 = 3;
                }
                placeBetResponse2 = this.a0;
                if (placeBetResponse2 != null) {
                    houseDraw2 = placeBetResponse2.getHouseDraw();
                } else {
                    houseDraw2 = str;
                }
                placeBetResponse3 = this.a0;
                if (placeBetResponse3 != null) {
                    userPick = placeBetResponse3.getUserPick();
                } else {
                    userPick = str;
                }
                if (!kotlin.text.c.l(houseDraw2, userPick, false)) {
                    placeBetResponse4 = this.a0;
                    if (placeBetResponse4 != null) {
                        houseDraw3 = placeBetResponse4.getHouseDraw();
                    } else {
                        houseDraw3 = str;
                    }
                    if (kotlin.text.c.l(houseDraw3, "middle", true)) {
                        i3 = i2;
                    } else {
                        i3 = 2;
                    }
                }
                this.b0 = i3;
            }
            dFloor = Math.floor((new SecureRandom().nextDouble() * 151.0d) + 195.0d);
            this.T = dFloor;
            f2 = ((float) dFloor) + 1440.0f;
            RotateAnimation rotateAnimation5 = new RotateAnimation(0.0f, f2, 1, 0.5f, 1, 0.45f);
            this.c = rotateAnimation5;
            rotateAnimation5.setFillAfter(true);
            dcb0Var2 = (dcb0) this.b;
            if (dcb0Var2 != null) {
                dcb0Var2.Y.setAlpha(1.0f);
            }
            rotateAnimation = this.c;
            if (rotateAnimation != null) {
                rotateAnimation.setInterpolator(g4c.f);
            }
            rotateAnimation2 = this.c;
            if (rotateAnimation2 != null) {
                rotateAnimation2.setDuration(3200L);
            }
            dcb0Var3 = (dcb0) this.b;
            if (dcb0Var3 != null) {
                dcb0Var3.v.startAnimation(this.c);
            }
            ypa0Var = this.J;
            if (ypa0Var != null) {
                Intrinsics.n("soundViewModel");
                throw null;
            }
            String string4 = getString(R.string.bottle);
            string4.getClass();
            ypa0Var.A1(3200L, string4);
            dcb0Var4 = (dcb0) this.b;
            if (dcb0Var4 != null) {
                dcb0Var4.C.setBackImageVisible(8);
            }
            rotateAnimation3 = this.c;
            if (rotateAnimation3 != null) {
                rotateAnimation3.setAnimationListener(new i8b0(this));
            }
            placeBetResponse = this.a0;
            if (placeBetResponse != null) {
                str = null;
                i2 = 3;
            } else {
                str = null;
                i2 = 3;
            }
            placeBetResponse2 = this.a0;
            if (placeBetResponse2 != null) {
                houseDraw2 = placeBetResponse2.getHouseDraw();
            } else {
                houseDraw2 = str;
            }
            placeBetResponse3 = this.a0;
            if (placeBetResponse3 != null) {
                userPick = placeBetResponse3.getUserPick();
            } else {
                userPick = str;
            }
            if (!kotlin.text.c.l(houseDraw2, userPick, false)) {
                placeBetResponse4 = this.a0;
                if (placeBetResponse4 != null) {
                    houseDraw3 = placeBetResponse4.getHouseDraw();
                } else {
                    houseDraw3 = str;
                }
                if (kotlin.text.c.l(houseDraw3, "middle", true)) {
                    i3 = i2;
                } else {
                    i3 = 2;
                }
            }
            this.b0 = i3;
        } catch (Exception unused) {
        }
    }

    public final void F0() {
        String name;
        fm1 fm1Var;
        Resources resources;
        String[] stringArray;
        this.r0 = false;
        this.k0 = false;
        Context context = getContext();
        int length = ((context == null || (resources = context.getResources()) == null || (stringArray = resources.getStringArray(R.array.spin_da_bottle_array)) == null) ? 0 : stringArray.length) + 7;
        dcb0 dcb0Var = (dcb0) this.b;
        if (dcb0Var != null) {
            dcb0Var.M.setProgressForApi(100 / length);
        }
        dcb0 dcb0Var2 = (dcb0) this.b;
        if (dcb0Var2 != null) {
            dcb0Var2.M.L();
        }
        dcb0 dcb0Var3 = (dcb0) this.b;
        if (dcb0Var3 != null) {
            dcb0Var3.M.O(0);
        }
        dcb0 dcb0Var4 = (dcb0) this.b;
        if (dcb0Var4 != null) {
            dcb0Var4.M.setVisibility(0);
        }
        GameDetails gameDetails = this.y;
        if (gameDetails != null && (name = gameDetails.getName()) != null && (fm1Var = (fm1) this.a) != null) {
            ej5.c(o8i0.d(fm1Var), null, null, new bn1(fm1Var, name, null), 3);
        }
        fm1 fm1Var2 = (fm1) this.a;
        if (fm1Var2 != null) {
            fm1Var2.x1();
        }
    }

    public final void G0() {
        this.y0 = false;
        this.z0 = false;
        dcb0 dcb0Var = (dcb0) this.b;
        if (dcb0Var != null) {
            dcb0Var.d.E(1.0f, true);
        }
        dcb0 dcb0Var2 = (dcb0) this.b;
        if (dcb0Var2 != null) {
            dcb0Var2.c.a(8);
        }
        dcb0 dcb0Var3 = (dcb0) this.b;
        if (dcb0Var3 != null) {
            dcb0Var3.c.b(4, 0);
        }
        dcb0 dcb0Var4 = (dcb0) this.b;
        if (dcb0Var4 != null) {
            BetBoxContainer betBoxContainer = dcb0Var4.c;
            fm1.c cVar = this.A0;
            betBoxContainer.setBetAmount(Double.valueOf(cVar != null ? cVar.a : 0.0d), this.Y);
        }
        dcb0 dcb0Var5 = (dcb0) this.b;
        if (dcb0Var5 != null) {
            ChipSlider chipSlider = dcb0Var5.i;
            fm1.c cVar2 = this.A0;
            chipSlider.setBetAmount(cVar2 != null ? cVar2.a : 0.0d, this.Y);
        }
        fm1 fm1Var = (fm1) this.a;
        if (fm1Var != null) {
            fm1.c cVar3 = this.A0;
            fm1Var.y1(Double.valueOf(cVar3 != null ? cVar3.a : 0.0d));
        }
        fm1 fm1Var2 = (fm1) this.a;
        if (fm1Var2 != null) {
            fm1Var2.d.m(null);
        }
        dcb0 dcb0Var6 = (dcb0) this.b;
        if (dcb0Var6 != null) {
            dcb0Var6.i.setEnabled(true);
        }
        dcb0 dcb0Var7 = (dcb0) this.b;
        if (dcb0Var7 != null) {
            dcb0Var7.i.setAlpha(1.0f);
        }
        dcb0 dcb0Var8 = (dcb0) this.b;
        if (dcb0Var8 != null) {
            dcb0Var8.i.b(true);
        }
        dcb0 dcb0Var9 = (dcb0) this.b;
        if (dcb0Var9 != null) {
            dcb0Var9.f.setVisibility(8);
        }
    }

    public final void H0() {
        dcb0 dcb0Var = (dcb0) this.b;
        if (dcb0Var != null) {
            dcb0Var.O.setAlpha(1.0f);
        }
        dcb0 dcb0Var2 = (dcb0) this.b;
        if (dcb0Var2 != null) {
            dcb0Var2.O.setEnabled(true);
        }
        dcb0 dcb0Var3 = (dcb0) this.b;
        if (dcb0Var3 != null) {
            dcb0Var3.P.setAlpha(1.0f);
        }
        dcb0 dcb0Var4 = (dcb0) this.b;
        if (dcb0Var4 != null) {
            dcb0Var4.P.setEnabled(true);
        }
        dcb0 dcb0Var5 = (dcb0) this.b;
        if (dcb0Var5 != null) {
            dcb0Var5.P.setClickable(true);
        }
        dcb0 dcb0Var6 = (dcb0) this.b;
        if (dcb0Var6 != null) {
            dcb0Var6.O.setClickable(true);
        }
        dcb0 dcb0Var7 = (dcb0) this.b;
        if (dcb0Var7 != null) {
            dcb0Var7.N.setAlpha(1.0f);
        }
        dcb0 dcb0Var8 = (dcb0) this.b;
        if (dcb0Var8 != null) {
            dcb0Var8.N.setEnabled(true);
        }
        dcb0 dcb0Var9 = (dcb0) this.b;
        if (dcb0Var9 != null) {
            dcb0Var9.N.setClickable(true);
        }
        dcb0 dcb0Var10 = (dcb0) this.b;
        if (dcb0Var10 != null) {
            dcb0Var10.I.setAlpha(1.0f);
        }
        dcb0 dcb0Var11 = (dcb0) this.b;
        if (dcb0Var11 != null) {
            dcb0Var11.I.setEnabled(true);
        }
        dcb0 dcb0Var12 = (dcb0) this.b;
        if (dcb0Var12 != null) {
            dcb0Var12.I.setClickable(true);
        }
        dcb0 dcb0Var13 = (dcb0) this.b;
        if (dcb0Var13 != null) {
            dcb0Var13.c.setAlpha(1.0f);
        }
        dcb0 dcb0Var14 = (dcb0) this.b;
        if (dcb0Var14 != null) {
            dcb0Var14.c.setEnabled(true);
        }
        if (!this.y0) {
            dcb0 dcb0Var15 = (dcb0) this.b;
            if (dcb0Var15 != null) {
                dcb0Var15.d.setAlpha(1.0f);
            }
            dcb0 dcb0Var16 = (dcb0) this.b;
            if (dcb0Var16 != null) {
                dcb0Var16.d.setEnabled(true);
            }
            dcb0 dcb0Var17 = (dcb0) this.b;
            if (dcb0Var17 != null) {
                dcb0Var17.i.setAlpha(1.0f);
            }
            dcb0 dcb0Var18 = (dcb0) this.b;
            if (dcb0Var18 != null) {
                dcb0Var18.i.setEnabled(true);
            }
        }
        dcb0 dcb0Var19 = (dcb0) this.b;
        if (dcb0Var19 != null) {
            dcb0Var19.Y.setAlpha(1.0f);
        }
        dcb0 dcb0Var20 = (dcb0) this.b;
        if (dcb0Var20 != null) {
            dcb0Var20.C.a(8);
        }
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void I() {
        u35.e.a();
    }

    public final void I0(boolean z) {
        dcb0 dcb0Var;
        dcb0 dcb0Var2 = (dcb0) this.b;
        if (dcb0Var2 != null) {
            dcb0Var2.N.setAlpha(0.5f);
        }
        dcb0 dcb0Var3 = (dcb0) this.b;
        if (dcb0Var3 != null) {
            dcb0Var3.N.setEnabled(false);
        }
        dcb0 dcb0Var4 = (dcb0) this.b;
        if (dcb0Var4 != null) {
            dcb0Var4.I.setAlpha(0.5f);
        }
        dcb0 dcb0Var5 = (dcb0) this.b;
        if (dcb0Var5 != null) {
            dcb0Var5.I.setEnabled(false);
        }
        dcb0 dcb0Var6 = (dcb0) this.b;
        if (dcb0Var6 != null) {
            dcb0Var6.I.setClickable(false);
        }
        dcb0 dcb0Var7 = (dcb0) this.b;
        if (dcb0Var7 != null) {
            dcb0Var7.P.setClickable(false);
        }
        dcb0 dcb0Var8 = (dcb0) this.b;
        if (dcb0Var8 != null) {
            dcb0Var8.P.setAlpha(0.5f);
        }
        dcb0 dcb0Var9 = (dcb0) this.b;
        if (dcb0Var9 != null) {
            dcb0Var9.P.setEnabled(false);
        }
        dcb0 dcb0Var10 = (dcb0) this.b;
        if (dcb0Var10 != null) {
            dcb0Var10.O.setClickable(false);
        }
        dcb0 dcb0Var11 = (dcb0) this.b;
        if (dcb0Var11 != null) {
            dcb0Var11.O.setAlpha(0.5f);
        }
        dcb0 dcb0Var12 = (dcb0) this.b;
        if (dcb0Var12 != null) {
            dcb0Var12.O.setEnabled(false);
        }
        dcb0 dcb0Var13 = (dcb0) this.b;
        if (dcb0Var13 != null) {
            dcb0Var13.d.setAlpha(0.5f);
        }
        dcb0 dcb0Var14 = (dcb0) this.b;
        if (dcb0Var14 != null) {
            dcb0Var14.d.setEnabled(false);
        }
        dcb0 dcb0Var15 = (dcb0) this.b;
        if (dcb0Var15 != null) {
            dcb0Var15.i.setAlpha(0.5f);
        }
        dcb0 dcb0Var16 = (dcb0) this.b;
        if (dcb0Var16 != null) {
            dcb0Var16.i.setEnabled(false);
        }
        if (!z || (dcb0Var = (dcb0) this.b) == null) {
            return;
        }
        dcb0Var.C.a(0);
    }

    public final void J0() {
        boolean z;
        Context context;
        com.sportygames.commons.components.a aVar;
        try {
            GameDetails gameDetails = this.y;
            if (gameDetails == null || gameDetails.getDisplayName() == null) {
                z = false;
            } else {
                new brr();
                z = true;
            }
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
        }
        SharedPreferences sharedPreferences = this.Z;
        if (sharedPreferences == null || sharedPreferences.getBoolean("SPIN_DA_BOTTLE_ONE_TAP", false) || !z) {
            z0();
            return;
        }
        Context context2 = getContext();
        String string = context2 != null ? context2.getString(R.string.one_tap_choice_label) : null;
        if (string == null || (context = getContext()) == null) {
            return;
        }
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        supportFragmentManager.getClass();
        op5 op5Var = op5.a;
        String string2 = getString(R.string.otb_dialog_msg_cms);
        string2.getClass();
        op5Var.getClass();
        String strB = op5.b(string2, string, null);
        String string3 = getString(R.string.yes_btn_cms);
        string3.getClass();
        String string4 = getString(R.string.yes_bet);
        string4.getClass();
        String strB2 = op5.b(string3, string4, null);
        String string5 = getString(R.string.no_btn_cms);
        string5.getClass();
        String string6 = getString(R.string.no_bet);
        string6.getClass();
        this.e = com.sportygames.commons.components.a.C0437a.a("Spin da' Bottle", "one tap bet", strB, "", strB2, op5.b(string5, string6, null), new uw6(this, 2), new c7b0(), context.getColor(R.color.redblack_confirm_dialog_left_button), context.getColor(R.color.redblack_confirm_dialog_right_button), 12288);
        com.sportygames.commons.components.a aVar2 = this.d;
        if ((aVar2 == null || !aVar2.isVisible()) && (aVar = this.e) != null) {
            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
            aVar3.f(R.id.flContent, aVar, null);
            aVar3.c("CONFIRM_DIALOG_FRAGMENT");
            aVar3.d();
        }
    }

    public final void K0() {
        androidx.fragment.app.e activity = getActivity();
        fo2 fo2Var = null;
        if (activity != null) {
            yo2 yo2Var = new yo2();
            yo2Var.e = activity;
            androidx.fragment.app.e eVarRequireActivity = requireActivity();
            eVarRequireActivity.getClass();
            final fo2 fo2Var2 = new fo2(eVarRequireActivity, "Spin da' Bottle");
            fo2Var2.H = new Function2() { // from class: s7b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj).intValue();
                    int iIntValue2 = ((Integer) obj2).intValue();
                    eu2 eu2VarU0 = this.a.u0();
                    PagingFetchType pagingFetchType = PagingFetchType.VIEW_MORE;
                    pagingFetchType.getClass();
                    ej5.c(o8i0.d(eu2VarU0), null, null, new tt2(eu2VarU0, pagingFetchType, iIntValue, iIntValue2, null), 3);
                    return Unit.a;
                }
            };
            fo2Var2.I = new Function2() { // from class: u7b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj).intValue();
                    int iIntValue2 = ((Integer) obj2).intValue();
                    eu2 eu2VarU0 = this.a.u0();
                    PagingFetchType pagingFetchType = PagingFetchType.ARCHIVE_MORE;
                    pagingFetchType.getClass();
                    ej5.c(o8i0.d(eu2VarU0), null, null, new tt2(eu2VarU0, pagingFetchType, iIntValue, iIntValue2, null), 3);
                    return Unit.a;
                }
            };
            op5 op5Var = op5.a;
            String string = getString(R.string.bet_history_note);
            string.getClass();
            String string2 = getString(R.string.bet_history_note);
            string2.getClass();
            op5Var.getClass();
            fo2Var2.P = new fo2.a.b(op5.b(string, string2, null));
            fo2Var2.d();
            fo2Var2.e().setBackground(fo2Var2.getContext().getDrawable(R.drawable.modal_bottle));
            RecyclerView recyclerViewF = fo2Var2.f();
            fo2Var2.getContext();
            recyclerViewF.setLayoutManager(new LinearLayoutManager());
            Function0<Unit> function0 = new Function0() { // from class: cn2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    fo2 fo2Var3 = fo2Var2;
                    if (fo2Var3.L == fo2.b.b) {
                        Function2<? super Integer, ? super Integer, Unit> function2 = fo2Var3.H;
                        if (function2 == null) {
                            Intrinsics.n("betHistoryFetchManager");
                            throw null;
                        }
                        function2.invoke(Integer.valueOf(fo2Var3.K + fo2Var3.J), Integer.valueOf(fo2Var3.J));
                    }
                    return Unit.a;
                }
            };
            Function0<Unit> function1 = new Function0() { // from class: dn2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    fo2 fo2Var3 = fo2Var2;
                    if (fo2Var3.M == fo2.b.b) {
                        Function2<? super Integer, ? super Integer, Unit> function2 = fo2Var3.I;
                        if (function2 == null) {
                            Intrinsics.n("betHistoryArchiveFetchManager");
                            throw null;
                        }
                        function2.invoke(Integer.valueOf(fo2Var3.K + fo2Var3.J), Integer.valueOf(fo2Var3.J));
                    }
                    return Unit.a;
                }
            };
            yo2Var.b = function0;
            yo2Var.c = function1;
            fo2Var2.f().setAdapter(yo2Var);
            fo2Var2.b();
            fo2Var = fo2Var2;
        }
        this.H = fo2Var;
        if (fo2Var != null) {
            fo2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: v7b0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    fo2 fo2Var3 = this.a.H;
                    if (fo2Var3 != null) {
                        fo2Var3.c();
                    }
                }
            });
        }
    }

    public final void L0() {
        boolean z;
        try {
            z = this.B0 != 0 && System.currentTimeMillis() - this.B0 < 30000;
            this.B0 = System.currentTimeMillis();
        } catch (Exception e2) {
            e2.printStackTrace();
            z = false;
        }
        if (z) {
            return;
        }
        try {
            dcb0 dcb0Var = (dcb0) this.b;
            if (dcb0Var != null) {
                dcb0Var.E.setCampaignCompletedText();
            }
            dcb0 dcb0Var2 = (dcb0) this.b;
            if (dcb0Var2 != null) {
                dcb0Var2.E.setVisibility(0);
            }
            dcb0 dcb0Var3 = (dcb0) this.b;
            if (dcb0Var3 != null) {
                dcb0Var3.E.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_fade_out_toast));
            }
            ej5.c(ebs.a(getLifecycle()), null, null, new j8b0(this, null), 3);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public final void M0(boolean z) {
        dcb0 dcb0Var;
        dcb0 dcb0Var2;
        AppCompatImageView redMark;
        H0();
        dcb0 dcb0Var3 = (dcb0) this.b;
        if (dcb0Var3 != null) {
            dcb0Var3.C.setBackImageVisible(0);
        }
        dcb0 dcb0Var4 = (dcb0) this.b;
        if (dcb0Var4 != null) {
            dcb0Var4.Y.setBalance(this.C, this.I);
        }
        Double d2 = this.I;
        if ((d2 != null ? d2.doubleValue() : 0.0d) < this.N) {
            dcb0 dcb0Var5 = (dcb0) this.b;
            if (dcb0Var5 != null && (redMark = dcb0Var5.C.getRedMark()) != null) {
                redMark.setVisibility(0);
            }
            dcb0 dcb0Var6 = (dcb0) this.b;
            if (dcb0Var6 != null) {
                dcb0Var6.F.F(R.drawable.hamberger_add_more_red);
            }
        }
        if (this.w && (dcb0Var2 = (dcb0) this.b) != null) {
            dcb0Var2.b.setVisibility(0);
        }
        this.S = false;
        double d3 = this.c0;
        if (d3 < 0.0d) {
            dcb0 dcb0Var7 = (dcb0) this.b;
            if (dcb0Var7 != null) {
                dcb0Var7.Y.a(Math.abs(d3));
            }
        } else if (d3 > 0.0d && (dcb0Var = (dcb0) this.b) != null) {
            dcb0Var.Y.b(Math.abs(d3));
        }
        new LinkedHashSet();
        if (!z) {
            int i2 = this.b0;
            ypa0 ypa0Var = this.J;
            if (i2 == 1) {
                if (ypa0Var == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                String string = getString(R.string.game_win);
                string.getClass();
                ypa0Var.A1(2000L, string);
            } else if (i2 == 3) {
                if (ypa0Var == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                String string2 = getString(R.string.house_win);
                string2.getClass();
                ypa0Var.A1(2000L, string2);
            } else {
                if (ypa0Var == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                String string3 = getString(R.string.game_lose);
                string3.getClass();
                ypa0Var.A1(2000L, string3);
            }
        }
        if (this.b0 == 1) {
            requireActivity().getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
            androidx.fragment.app.e activity = getActivity();
            Object systemService = activity != null ? activity.getSystemService("vibrator") : null;
            systemService.getClass();
            Vibrator vibrator = (Vibrator) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(VibrationEffect.createOneShot(200L, -1));
            } else {
                vibrator.vibrate(200L);
            }
            TimeUnit.SECONDS.getClass();
            x0g x0gVar = new x0g();
            x0gVar.a = 1000L;
            x0gVar.b = 0.005f;
            dcb0 dcb0Var8 = (dcb0) this.b;
            dcb0Var8.getClass();
            KonfettiView konfettiView = dcb0Var8.e;
            iuz iuzVar = new iuz(x0gVar);
            iuzVar.a(-45);
            iuzVar.f();
            px80.d dVar = px80.d.a;
            px80.a aVar = px80.a.a;
            iuzVar.e(kotlin.collections.b.k(dVar, aVar));
            iuzVar.b(kotlin.collections.b.k(16777215, 16766720, 12632256, 16740285));
            iuzVar.d(50.0f);
            iuzVar.c(new i620.c(0.0d, 0.7d));
            guz guzVar = iuzVar.a;
            iuz iuzVar2 = new iuz(x0gVar);
            iuzVar2.a(225);
            iuzVar2.f();
            iuzVar2.e(kotlin.collections.b.k(dVar, aVar));
            iuzVar2.b(kotlin.collections.b.k(16777215, 16766720, 12632256, 16740285));
            iuzVar2.d(50.0f);
            iuzVar2.c(new i620.c(1.0d, 0.7d));
            konfettiView.a(guzVar, iuzVar2.a);
        }
        if (this.U == 0) {
            dcb0 dcb0Var9 = (dcb0) this.b;
            if (dcb0Var9 != null) {
                dcb0Var9.B.setVisibility(0);
            }
            boolean z2 = this.y0;
            B b2 = this.b;
            if (z2) {
                dcb0 dcb0Var10 = (dcb0) b2;
                if (dcb0Var10 != null) {
                    dcb0Var10.N.setVisibility(8);
                }
            } else {
                dcb0 dcb0Var11 = (dcb0) b2;
                if (dcb0Var11 != null) {
                    dcb0Var11.N.setVisibility(0);
                }
            }
            dcb0 dcb0Var12 = (dcb0) this.b;
            if (dcb0Var12 != null) {
                dcb0Var12.z.setVisibility(0);
            }
        }
    }

    @Override // defpackage.bb
    public final void Q(xnh0 xnh0Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = nzf0.a;
        if (!z && jCurrentTimeMillis - nzf0.b <= 500) {
            z = true;
        }
        if (z) {
            return;
        }
        if ((xnh0Var != null ? xnh0Var.a : null) == null || xnh0Var.a.length() <= 0) {
            return;
        }
        F0();
    }

    @Override // defpackage.bb
    public final void f0(m8 m8Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = nzf0.a;
        if (!z && jCurrentTimeMillis - nzf0.b <= 500) {
            z = true;
        }
        if (z) {
            return;
        }
        androidx.fragment.app.e activity = getActivity();
        Boolean boolValueOf = activity != null ? Boolean.valueOf(activity.isFinishing()) : null;
        boolValueOf.getClass();
        if (boolValueOf.booleanValue()) {
            return;
        }
        androidx.fragment.app.e activity2 = getActivity();
        Boolean boolValueOf2 = activity2 != null ? Boolean.valueOf(activity2.isDestroyed()) : null;
        boolValueOf2.getClass();
        if (boolValueOf2.booleanValue()) {
            return;
        }
        this.k0 = false;
        Context context = getContext();
        if (context != null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            hht hhtVar = new hht(contextRequireContext, "Spin da' Bottle");
            String string = getString(R.string.game_not_available);
            string.getClass();
            String string2 = getString(R.string.label_dialog_exit);
            string2.getClass();
            hhtVar.c(string, string2, new Function0() { // from class: k7b0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    iny onBackPressedDispatcher;
                    e activity3 = this.a.getActivity();
                    if (activity3 == null || (onBackPressedDispatcher = activity3.getOnBackPressedDispatcher()) == null) {
                        return null;
                    }
                    onBackPressedDispatcher.d();
                    return Unit.a;
                }
            }, new l7b0(), context.getColor(R.color.try_again_color));
            hhtVar.a();
        }
    }

    @Override // defpackage.l12
    public final g6i0 o0() {
        View viewInflate = getLayoutInflater().inflate(R.layout.spindabottle_game_fragment, (ViewGroup) null, false);
        int i2 = R.id.add_money;
        TextView textView = (TextView) h5e.a(R.id.add_money, viewInflate);
        if (textView != null) {
            i2 = R.id.bet_amountbox;
            BetBoxContainer betBoxContainer = (BetBoxContainer) h5e.a(R.id.bet_amountbox, viewInflate);
            if (betBoxContainer != null) {
                i2 = R.id.betchip_container;
                BetChipContainer betChipContainer = (BetChipContainer) h5e.a(R.id.betchip_container, viewInflate);
                if (betChipContainer != null) {
                    i2 = R.id.bottle_konfetti;
                    KonfettiView konfettiView = (KonfettiView) h5e.a(R.id.bottle_konfetti, viewInflate);
                    if (konfettiView != null) {
                        i2 = R.id.cardlay;
                        if (((ConstraintLayout) h5e.a(R.id.cardlay, viewInflate)) != null) {
                            i2 = R.id.chip_overlay;
                            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.chip_overlay, viewInflate);
                            if (constraintLayout != null) {
                                i2 = R.id.chip_slider;
                                ChipSlider chipSlider = (ChipSlider) h5e.a(R.id.chip_slider, viewInflate);
                                if (chipSlider != null) {
                                    i2 = R.id.dice2;
                                    ImageView imageView = (ImageView) h5e.a(R.id.dice2, viewInflate);
                                    if (imageView != null) {
                                        i2 = R.id.down;
                                        TextView textView2 = (TextView) h5e.a(R.id.down, viewInflate);
                                        if (textView2 != null) {
                                            i2 = R.id.drawer_layout;
                                            DrawerLayout drawerLayout = (DrawerLayout) h5e.a(R.id.drawer_layout, viewInflate);
                                            if (drawerLayout != null) {
                                                i2 = R.id.eo_round_result;
                                                RoundResult roundResult = (RoundResult) h5e.a(R.id.eo_round_result, viewInflate);
                                                if (roundResult != null) {
                                                    i2 = R.id.error_text;
                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.error_text, viewInflate);
                                                    if (appCompatTextView != null) {
                                                        i2 = R.id.evenoddnew;
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.evenoddnew, viewInflate);
                                                        if (constraintLayout2 != null) {
                                                            i2 = R.id.flContent;
                                                            if (((FrameLayout) h5e.a(R.id.flContent, viewInflate)) != null) {
                                                                i2 = R.id.game_header;
                                                                GameHeader gameHeader = (GameHeader) h5e.a(R.id.game_header, viewInflate);
                                                                if (gameHeader != null) {
                                                                    i2 = R.id.games_campaign_progress;
                                                                    ComposeView composeView = (ComposeView) h5e.a(R.id.games_campaign_progress, viewInflate);
                                                                    if (composeView != null) {
                                                                        i2 = R.id.gift_toast_bar;
                                                                        GiftToast giftToast = (GiftToast) h5e.a(R.id.gift_toast_bar, viewInflate);
                                                                        if (giftToast != null) {
                                                                            i2 = R.id.hamburger_menu;
                                                                            SGHamburgerMenu sGHamburgerMenu = (SGHamburgerMenu) h5e.a(R.id.hamburger_menu, viewInflate);
                                                                            if (sGHamburgerMenu != null) {
                                                                                i2 = R.id.layout;
                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.layout, viewInflate);
                                                                                if (constraintLayout3 != null) {
                                                                                    i2 = R.id.loose_text;
                                                                                    if (((ImageView) h5e.a(R.id.loose_text, viewInflate)) != null) {
                                                                                        i2 = R.id.navigationView;
                                                                                        NavigationView navigationView = (NavigationView) h5e.a(R.id.navigationView, viewInflate);
                                                                                        if (navigationView != null) {
                                                                                            i2 = R.id.new_round_btn;
                                                                                            TextView textView3 = (TextView) h5e.a(R.id.new_round_btn, viewInflate);
                                                                                            if (textView3 != null) {
                                                                                                i2 = R.id.onboarding_images;
                                                                                                FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.onboarding_images, viewInflate);
                                                                                                if (frameLayout != null) {
                                                                                                    i2 = R.id.pay_down;
                                                                                                    TextView textView4 = (TextView) h5e.a(R.id.pay_down, viewInflate);
                                                                                                    if (textView4 != null) {
                                                                                                        i2 = R.id.pay_text;
                                                                                                        if (((AppCompatTextView) h5e.a(R.id.pay_text, viewInflate)) != null) {
                                                                                                            i2 = R.id.pay_up;
                                                                                                            TextView textView5 = (TextView) h5e.a(R.id.pay_up, viewInflate);
                                                                                                            if (textView5 != null) {
                                                                                                                i2 = R.id.progress_meter_component;
                                                                                                                ProgressMeterComponent progressMeterComponent = (ProgressMeterComponent) h5e.a(R.id.progress_meter_component, viewInflate);
                                                                                                                if (progressMeterComponent != null) {
                                                                                                                    i2 = R.id.rebet_btn;
                                                                                                                    TextView textView6 = (TextView) h5e.a(R.id.rebet_btn, viewInflate);
                                                                                                                    if (textView6 != null) {
                                                                                                                        i2 = R.id.select_down_btn;
                                                                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.select_down_btn, viewInflate);
                                                                                                                        if (constraintLayout4 != null) {
                                                                                                                            i2 = R.id.select_up_btn;
                                                                                                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.select_up_btn, viewInflate);
                                                                                                                            if (constraintLayout5 != null) {
                                                                                                                                i2 = R.id.table;
                                                                                                                                if (((ConstraintLayout) h5e.a(R.id.table, viewInflate)) != null) {
                                                                                                                                    i2 = R.id.table_image;
                                                                                                                                    ImageView imageView2 = (ImageView) h5e.a(R.id.table_image, viewInflate);
                                                                                                                                    if (imageView2 != null) {
                                                                                                                                        i2 = R.id.up;
                                                                                                                                        TextView textView7 = (TextView) h5e.a(R.id.up, viewInflate);
                                                                                                                                        if (textView7 != null) {
                                                                                                                                            i2 = R.id.uplay;
                                                                                                                                            ConstraintLayout constraintLayout6 = (ConstraintLayout) h5e.a(R.id.uplay, viewInflate);
                                                                                                                                            if (constraintLayout6 != null) {
                                                                                                                                                i2 = R.id.view1;
                                                                                                                                                View viewA = h5e.a(R.id.view1, viewInflate);
                                                                                                                                                if (viewA != null) {
                                                                                                                                                    i2 = R.id.view2;
                                                                                                                                                    View viewA2 = h5e.a(R.id.view2, viewInflate);
                                                                                                                                                    if (viewA2 != null) {
                                                                                                                                                        i2 = R.id.view_margin;
                                                                                                                                                        View viewA3 = h5e.a(R.id.view_margin, viewInflate);
                                                                                                                                                        if (viewA3 != null) {
                                                                                                                                                            i2 = R.id.view_margin2;
                                                                                                                                                            View viewA4 = h5e.a(R.id.view_margin2, viewInflate);
                                                                                                                                                            if (viewA4 != null) {
                                                                                                                                                                i2 = R.id.view_margin3;
                                                                                                                                                                View viewA5 = h5e.a(R.id.view_margin3, viewInflate);
                                                                                                                                                                if (viewA5 != null) {
                                                                                                                                                                    i2 = R.id.wallet_textView;
                                                                                                                                                                    WalletText walletText = (WalletText) h5e.a(R.id.wallet_textView, viewInflate);
                                                                                                                                                                    if (walletText != null) {
                                                                                                                                                                        return new dcb0((CoordinatorLayout) viewInflate, textView, betBoxContainer, betChipContainer, konfettiView, constraintLayout, chipSlider, imageView, textView2, drawerLayout, roundResult, appCompatTextView, constraintLayout2, gameHeader, composeView, giftToast, sGHamburgerMenu, constraintLayout3, navigationView, textView3, frameLayout, textView4, textView5, progressMeterComponent, textView6, constraintLayout4, constraintLayout5, imageView2, textView7, constraintLayout6, viewA, viewA2, viewA3, viewA4, viewA5, walletText);
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof mke) {
            this.v0 = (mke) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Context context;
        ssw<LoadingState<HTTPResponse<GameAvailableResponse>>> sswVar;
        ssw<LoadingState<HTTPResponse<DetailResponse>>> sswVar2;
        ssw<LoadingState<HTTPResponse<GameAvailableResponse>>> sswVar3;
        u35.e.a = null;
        SportyGamesManager.getInstance().removeAccountUpdatedListener(this);
        if (getView() != null) {
            fm1 fm1Var = (fm1) this.a;
            if (fm1Var != null && (sswVar3 = fm1Var.e) != null) {
                sswVar3.l(getViewLifecycleOwner());
            }
            fm1 fm1Var2 = (fm1) this.a;
            if (fm1Var2 != null && (sswVar2 = fm1Var2.i) != null) {
                sswVar2.l(getViewLifecycleOwner());
            }
        }
        fm1 fm1Var3 = (fm1) this.a;
        if (fm1Var3 != null && (sswVar = fm1Var3.e) != null) {
            sswVar.m(null);
        }
        dcb0 dcb0Var = (dcb0) this.b;
        if (dcb0Var != null) {
            dcb0Var.E.removeAllViews();
        }
        if (getView() != null) {
            u0().b.l(getViewLifecycleOwner());
        }
        getViewModelStore().a();
        if (this.l0 != null && (context = getContext()) != null) {
            fdt fdtVarA = fdt.a(context);
            b bVar = this.l0;
            if (bVar == null) {
                Intrinsics.n("mServiceReceiver");
                throw null;
            }
            fdtVarA.d(bVar);
        }
        dcb0 dcb0Var2 = (dcb0) this.b;
        if (dcb0Var2 != null) {
            dcb0Var2.M.N();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (this.e0) {
            this.f0 = true;
            this.e0 = false;
            M0(true);
        }
        try {
            v0().e.l(getViewLifecycleOwner());
            v0().d.l(getViewLifecycleOwner());
            v0().y1();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        String name;
        String name2;
        ssw<LoadingState<HTTPResponse<UserValidateResponse>>> sswVar;
        q8i0 q8i0Var = this.G;
        super.onResume();
        boolean z = false;
        this.f0 = false;
        if (this.d0) {
            fm1 fm1Var = (fm1) this.a;
            if (fm1Var != null) {
                ej5.c(o8i0.d(fm1Var), null, null, new zn1(fm1Var, null), 3);
            }
            fm1 fm1Var2 = (fm1) this.a;
            if (fm1Var2 != null && (sswVar = fm1Var2.f) != null) {
                sswVar.f(getViewLifecycleOwner(), new c(new w6b0(this, z)));
            }
        }
        Context context = getContext();
        if (context != null) {
            if (this.l0 == null) {
                context = null;
            }
            if (context != null) {
                fdt fdtVarA = fdt.a(context);
                b bVar = this.l0;
                if (bVar == null) {
                    Intrinsics.n("mServiceReceiver");
                    throw null;
                }
                fdtVarA.d(bVar);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("soundOn");
                fdt fdtVarA2 = fdt.a(context);
                b bVar2 = this.l0;
                if (bVar2 == null) {
                    Intrinsics.n("mServiceReceiver");
                    throw null;
                }
                fdtVarA2.b(bVar2, intentFilter);
            }
        }
        int i2 = 1;
        if (this.o0) {
            SharedPreferences sharedPreferences = this.Z;
            Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("SPIN_DA_BOTTLE_MUSIC", true)) : null;
            dcb0 dcb0Var = (dcb0) this.b;
            if (dcb0Var != null) {
                ProgressMeterComponent progressMeterComponent = dcb0Var.M;
                ypa0 ypa0Var = this.J;
                if (ypa0Var == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                String string = getString(R.string.bg_music);
                string.getClass();
                progressMeterComponent.K(ypa0Var, boolValueOf, string);
            }
        }
        try {
            GameDetails gameDetails = this.y;
            String str = "";
            if (gameDetails == null || (name = gameDetails.getName()) == null) {
                name = "";
            }
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            ra6.c(name, viewLifecycleOwner, (db6) q8i0Var.getValue(), v0());
            GameDetails gameDetails2 = this.y;
            if (gameDetails2 != null && (name2 = gameDetails2.getName()) != null) {
                str = name2;
            }
            androidx.fragment.app.e activity = getActivity();
            ibs viewLifecycleOwner2 = getViewLifecycleOwner();
            viewLifecycleOwner2.getClass();
            dcb0 dcb0Var2 = (dcb0) this.b;
            ra6.b(str, activity, viewLifecycleOwner2, dcb0Var2 != null ? dcb0Var2.D : null, this.w0, v0(), (db6) q8i0Var.getValue(), p58.c, null, new tld0(this.y), new kip(this, i2), new wt1(this, i2), null, 17920);
            v0().x1();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        ypa0 ypa0Var = this.J;
        if (ypa0Var != null) {
            ypa0Var.G1();
            if (((dcb0) this.b) != null) {
                ypa0 ypa0Var2 = this.J;
                if (ypa0Var2 == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                ypa0Var2.I1();
            }
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        xbg xbgVar;
        ssw<LoadingState<HTTPResponse<UserValidateResponse>>> sswVar;
        ImageView crossFbg;
        AppCompatImageView chat;
        AppCompatImageView navigation;
        ssw<LoadingState<HTTPResponse<DetailResponse>>> sswVar2;
        ssw<LoadingState<HTTPResponse<GameAvailableResponse>>> sswVar3;
        ssw<LoadingState<HTTPResponse<List<GameDetails>>>> sswVar4;
        String name;
        fm1 fm1Var;
        ssw<LoadingState<List<File>>> sswVar5;
        Resources resources;
        DisplayMetrics displayMetrics;
        ssw<Integer> liveData;
        Resources resources2;
        String[] stringArray;
        view.getClass();
        super.onViewCreated(view, bundle);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(fq5.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.m0 = (fq5) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        SportyGamesManager.getInstance().setScreenName("sportygames/spin-da-bottle");
        ArrayList<String> arrayList = vlr.a.get("spin-da-bottle");
        int i2 = 1;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        char c5 = 1;
        if (arrayList != null && arrayList.contains(SportyGamesManager.getInstance().getLanguageCode())) {
            this.t0 = xwj.a();
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            qlf.d(activity);
            qlf.c(window, activity.getColor(R.color.toolbar_strip_bottle));
        }
        Context context = getContext();
        int i3 = 0;
        int length = ((context == null || (resources2 = context.getResources()) == null || (stringArray = resources2.getStringArray(R.array.spin_da_bottle_array)) == null) ? 0 : stringArray.length) + 7;
        dcb0 dcb0Var = (dcb0) this.b;
        if (dcb0Var != null) {
            dcb0Var.M.setVisibility(0);
        }
        dcb0 dcb0Var2 = (dcb0) this.b;
        if (dcb0Var2 != null) {
            dcb0Var2.M.setProgressForApi(100 / length);
        }
        dcb0 dcb0Var3 = (dcb0) this.b;
        if (dcb0Var3 != null) {
            dcb0Var3.M.setCurrentProgress(100 - ((100 / length) * length));
        }
        dcb0 dcb0Var4 = (dcb0) this.b;
        if (dcb0Var4 != null && (liveData = dcb0Var4.M.getLiveData()) != null) {
            liveData.f(getViewLifecycleOwner(), new lfy() { // from class: n6b0
                @Override // defpackage.lfy
                public final void u1(Object obj) {
                    Integer num = (Integer) obj;
                    b8b0 b8b0Var = this.a;
                    if (num != null && num.intValue() == 75) {
                        pfd pfdVar = fse.a;
                        ej5.c(w5b.a(gku.a), null, null, new f8b0(b8b0Var, null), 3);
                    }
                    if (num != null && num.intValue() == 100) {
                        pfd pfdVar2 = fse.a;
                        ej5.c(w5b.a(gku.a), null, null, new h8b0(b8b0Var, null), 3);
                    }
                }
            });
        }
        Context context2 = getContext();
        int i4 = (context2 == null || (resources = context2.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0 : displayMetrics.widthPixels;
        dcb0 dcb0Var5 = (dcb0) this.b;
        ViewGroup.LayoutParams layoutParams = dcb0Var5 != null ? dcb0Var5.H.getLayoutParams() : null;
        layoutParams.getClass();
        DrawerLayout.LayoutParams layoutParams2 = (DrawerLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = (i4 * 72) / 100;
        dcb0 dcb0Var6 = (dcb0) this.b;
        if (dcb0Var6 != null) {
            dcb0Var6.H.setLayoutParams(layoutParams2);
        }
        RelativeLayout.LayoutParams layoutParams3 = Resources.getSystem().getDisplayMetrics().heightPixels < 1800 ? new RelativeLayout.LayoutParams(Resources.getSystem().getDisplayMetrics().widthPixels, (Resources.getSystem().getDisplayMetrics().heightPixels * 22) / 50) : new RelativeLayout.LayoutParams(Resources.getSystem().getDisplayMetrics().widthPixels, (Resources.getSystem().getDisplayMetrics().heightPixels * 22) / 50);
        androidx.fragment.app.e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        v8i0 viewModelStore2 = eVarRequireActivity.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = eVarRequireActivity.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, sd7.a(eVarRequireActivity, viewModelStore2, defaultViewModelProviderFactory2));
        dq7 dq7VarA2 = jq40.a(ypa0.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.J = (ypa0) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        fq5 fq5Var = this.m0;
        if (fq5Var != null && (sswVar5 = fq5Var.c) != null) {
            sswVar5.f(getViewLifecycleOwner(), new c(new po60(this, i2)));
        }
        dcb0 dcb0Var7 = (dcb0) this.b;
        if (dcb0Var7 != null) {
            dcb0Var7.Q.setLayoutParams(layoutParams3);
        }
        androidx.fragment.app.e activity2 = getActivity();
        if (activity2 == null) {
            xbgVar = null;
        } else {
            if (this.J == null) {
                Intrinsics.n("soundViewModel");
                throw null;
            }
            xbgVar = new xbg(activity2, "Spin da' Bottle");
        }
        xbgVar.getClass();
        this.B = xbgVar;
        try {
            androidx.fragment.app.e activity3 = getActivity();
            if (activity3 != null) {
                String str = ((db6) this.G.getValue()).c;
                if (str == null) {
                    str = "Ongoing";
                }
                this.w0 = new z66(activity3, str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        SharedPreferences sharedPreferencesA = un20.a(requireContext());
        this.Z = sharedPreferencesA;
        this.X = sharedPreferencesA != null ? sharedPreferencesA.edit() : null;
        String string = getString(R.string.guest_username);
        string.getClass();
        this.A = string;
        SportyGamesManager.getInstance().addAccountUpdatedListener(this);
        dcb0 dcb0Var8 = (dcb0) this.b;
        if (dcb0Var8 != null) {
            dcb0Var8.d.setColor(R.color.chip_bg_bottle);
        }
        I0(true);
        dcb0 dcb0Var9 = (dcb0) this.b;
        if (dcb0Var9 != null) {
            dcb0Var9.i.setTooltipColor(R.drawable.trans_bottle_round);
        }
        GameDetails gameDetails = this.y;
        int i5 = 3;
        if (gameDetails != null && (name = gameDetails.getName()) != null && (fm1Var = (fm1) this.a) != null) {
            ej5.c(o8i0.d(fm1Var), null, null, new bn1(fm1Var, name, null), 3);
        }
        fm1 fm1Var2 = (fm1) this.a;
        if (fm1Var2 != null && (sswVar4 = fm1Var2.A) != null) {
            sswVar4.f(getViewLifecycleOwner(), new c(new Function1() { // from class: m6b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    List list;
                    LoadingState loadingState = (LoadingState) obj;
                    if (b8b0.a.a[loadingState.getStatus().ordinal()] == 1) {
                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                        if (((hTTPResponse == null || (list = (List) hTTPResponse.getData()) == null) ? 0 : list.size()) > 0) {
                            HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                            this.a.n0 = hTTPResponse2 != null ? (List) hTTPResponse2.getData() : null;
                        }
                    }
                    return Unit.a;
                }
            }));
        }
        fm1 fm1Var3 = (fm1) this.a;
        if (fm1Var3 != null && (sswVar3 = fm1Var3.e) != null) {
            sswVar3.f(getViewLifecycleOwner(), new c(new dp60(this, c5 == true ? 1 : 0)));
        }
        int i6 = 2;
        y0().c.f(getViewLifecycleOwner(), new c(new ayj(this, i6)));
        y0().b.f(getViewLifecycleOwner(), new c(new av6(this, i6)));
        w0().b.f(getViewLifecycleOwner(), new c(new ep60(this, c4 == true ? 1 : 0)));
        fm1 fm1Var4 = (fm1) this.a;
        if (fm1Var4 != null && (sswVar2 = fm1Var4.i) != null) {
            sswVar2.f(getViewLifecycleOwner(), new c(new Function1() { // from class: s6b0
                /* JADX WARN: Code duplicated, block: B:140:0x0257  */
                /* JADX WARN: Code duplicated, block: B:142:0x025d  */
                /* JADX WARN: Code duplicated, block: B:145:0x026a  */
                /* JADX WARN: Code duplicated, block: B:150:0x027d  */
                /* JADX WARN: Code duplicated, block: B:174:0x02ce  */
                /* JADX WARN: Code duplicated, block: B:176:0x02d4  */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    fm1 fm1Var5;
                    ssw<Double> sswVar6;
                    dcb0 dcb0Var10;
                    dcb0 dcb0Var11;
                    dcb0 dcb0Var12;
                    AppCompatImageView redMark;
                    DetailResponse detailResponse;
                    DetailResponse detailResponse2;
                    DetailResponse detailResponse3;
                    DetailResponse detailResponse4;
                    DetailResponse detailResponse5;
                    double dDoubleValue;
                    DetailResponse detailResponse6;
                    double defaultAmount;
                    DetailResponse detailResponse7;
                    DetailResponse detailResponse8;
                    DetailResponse detailResponse9;
                    DetailResponse detailResponse10;
                    DetailResponse detailResponse11;
                    DetailResponse detailResponse12;
                    DetailResponse detailResponse13;
                    DetailResponse detailResponse14;
                    DetailResponse detailResponse15;
                    DetailResponse detailResponse16;
                    DetailResponse detailResponse17;
                    DetailResponse detailResponse18;
                    DetailResponse detailResponse19;
                    DetailResponse detailResponse20;
                    DetailResponse detailResponse21;
                    AppCompatImageView redMark2;
                    dcb0 dcb0Var13;
                    AppCompatImageView redMark3;
                    DetailResponse detailResponse22;
                    DetailResponse detailResponse23;
                    DetailResponse detailResponse24;
                    DetailResponse detailResponse25;
                    DetailResponse detailResponse26;
                    DetailResponse detailResponse27;
                    DetailResponse detailResponse28;
                    DetailResponse detailResponse29;
                    DetailResponse detailResponse30;
                    DetailResponse detailResponse31;
                    DetailResponse detailResponse32;
                    DetailResponse detailResponse33;
                    DetailResponse detailResponse34;
                    DetailResponse detailResponse35;
                    DetailResponse detailResponse36;
                    DetailResponse detailResponse37;
                    DetailResponse detailResponse38;
                    DetailResponse detailResponse39;
                    DetailResponse detailResponse40;
                    DetailResponse detailResponse41;
                    DetailResponse detailResponse42;
                    DetailResponse detailResponse43;
                    dcb0 dcb0Var14;
                    DetailResponse detailResponse44;
                    AppCompatImageView redMark4;
                    DetailResponse detailResponse45;
                    DetailResponse detailResponse46;
                    DetailResponse detailResponse47;
                    DetailResponse detailResponse48;
                    ssw<Double> sswVar7;
                    DetailResponse detailResponse49;
                    DetailResponse detailResponse50;
                    DetailResponse detailResponse51;
                    ssw<LoadingState<HTTPResponse<List<ChatRoomResponse>>>> sswVar8;
                    String name2;
                    fm1 fm1Var6;
                    Integer code;
                    dcb0 dcb0Var15;
                    LoadingState loadingState = (LoadingState) obj;
                    int i7 = b8b0.a.a[loadingState.getStatus().ordinal()];
                    final b8b0 b8b0Var = this.a;
                    ArrayList<Double> betChipList = null;
                    int i8 = 1;
                    if (i7 == 1) {
                        GameDetails gameDetails2 = b8b0Var.y;
                        if (gameDetails2 != null && (name2 = gameDetails2.getName()) != null && (fm1Var6 = (fm1) b8b0Var.a) != null) {
                            ej5.c(o8i0.d(fm1Var6), null, null, new um1(fm1Var6, name2, null), 3);
                            Unit unit = Unit.a;
                        }
                        fm1 fm1Var7 = (fm1) b8b0Var.a;
                        if (fm1Var7 != null && (sswVar8 = fm1Var7.v) != null) {
                            sswVar8.f(b8b0Var.getViewLifecycleOwner(), new b8b0.c(new phy(b8b0Var, i8)));
                        }
                        if (b8b0Var.r0) {
                            b8b0Var.y0().x1();
                            Unit unit2 = Unit.a;
                        } else {
                            b8b0Var.r0 = true;
                            dcb0 dcb0Var16 = (dcb0) b8b0Var.b;
                            if (dcb0Var16 != null) {
                                dcb0Var16.M.P();
                                Unit unit3 = Unit.a;
                            }
                        }
                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                        b8b0Var.Y = (hTTPResponse == null || (detailResponse51 = (DetailResponse) hTTPResponse.getData()) == null) ? null : detailResponse51.getBetChipList();
                        if (b8b0Var.j0 == 1) {
                            r530 r530VarY0 = b8b0Var.y0();
                            ej5.c(o8i0.d(r530VarY0), null, null, new x530(r530VarY0, null), 3);
                        }
                        dcb0 dcb0Var17 = (dcb0) b8b0Var.b;
                        if (dcb0Var17 != null) {
                            BetChipContainer betChipContainer = dcb0Var17.d;
                            HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                            Double dValueOf = (hTTPResponse2 == null || (detailResponse50 = (DetailResponse) hTTPResponse2.getData()) == null) ? null : Double.valueOf(detailResponse50.getMinAmount());
                            HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
                            betChipContainer.setMinMaxChip(dValueOf, (hTTPResponse3 == null || (detailResponse49 = (DetailResponse) hTTPResponse3.getData()) == null) ? null : Double.valueOf(detailResponse49.getMaxAmount()));
                            Unit unit4 = Unit.a;
                        }
                        fm1 fm1Var8 = (fm1) b8b0Var.a;
                        if ((fm1Var8 == null || (sswVar7 = fm1Var8.b) == null || !sswVar7.e()) && (fm1Var5 = (fm1) b8b0Var.a) != null && (sswVar6 = fm1Var5.b) != null) {
                            sswVar6.f(b8b0Var.getViewLifecycleOwner(), new b8b0.c(new Function1() { // from class: w7b0
                                /* JADX WARN: Code duplicated, block: B:23:0x0043  */
                                /* JADX WARN: Code duplicated, block: B:25:0x0049  */
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    dcb0 dcb0Var18;
                                    ssw<DetailResponse> sswVar9;
                                    DetailResponse detailResponseD;
                                    ssw<DetailResponse> sswVar10;
                                    DetailResponse detailResponseD2;
                                    ssw<DetailResponse> sswVar11;
                                    DetailResponse detailResponseD3;
                                    ssw<DetailResponse> sswVar12;
                                    DetailResponse detailResponseD4;
                                    ssw<DetailResponse> sswVar13;
                                    DetailResponse detailResponseD5;
                                    ssw<DetailResponse> sswVar14;
                                    DetailResponse detailResponseD6;
                                    dcb0 dcb0Var19;
                                    Double d2 = (Double) obj2;
                                    b8b0 b8b0Var2 = b8b0Var;
                                    if (d2 != null) {
                                        if (b8b0Var2.I != null) {
                                            double dDoubleValue2 = d2.doubleValue();
                                            Double d3 = b8b0Var2.I;
                                            if (dDoubleValue2 < (d3 != null ? d3.doubleValue() : 0.0d) || d2.doubleValue() <= 0.0d) {
                                                dcb0Var19 = (dcb0) b8b0Var2.b;
                                                if (dcb0Var19 != null) {
                                                    dcb0Var19.b.setVisibility(4);
                                                }
                                            } else {
                                                Double d4 = b8b0Var2.I;
                                                if ((d4 != null ? d4.doubleValue() : 0.0d) <= b8b0Var2.O) {
                                                    dcb0 dcb0Var20 = (dcb0) b8b0Var2.b;
                                                    if (dcb0Var20 != null) {
                                                        dcb0Var20.b.setVisibility(0);
                                                    }
                                                } else {
                                                    dcb0Var19 = (dcb0) b8b0Var2.b;
                                                    if (dcb0Var19 != null) {
                                                        dcb0Var19.b.setVisibility(4);
                                                    }
                                                }
                                            }
                                        } else {
                                            dcb0Var19 = (dcb0) b8b0Var2.b;
                                            if (dcb0Var19 != null) {
                                                dcb0Var19.b.setVisibility(4);
                                            }
                                        }
                                    }
                                    dcb0 dcb0Var21 = (dcb0) b8b0Var2.b;
                                    Double dValueOf2 = null;
                                    if (dcb0Var21 != null) {
                                        BetChipContainer betChipContainer2 = dcb0Var21.d;
                                        fm1 fm1Var9 = (fm1) b8b0Var2.a;
                                        betChipContainer2.setBetAmount(d2, (fm1Var9 == null || (sswVar14 = fm1Var9.w) == null || (detailResponseD6 = sswVar14.d()) == null) ? null : Double.valueOf(detailResponseD6.getMaxAmount()));
                                    }
                                    if (b8b0Var2.L != 0) {
                                        Double d5 = b8b0Var2.I;
                                        double dDoubleValue3 = d5 != null ? d5.doubleValue() : 0.0d;
                                        fm1 fm1Var10 = (fm1) b8b0Var2.a;
                                        if (dDoubleValue3 >= ((fm1Var10 == null || (sswVar13 = fm1Var10.w) == null || (detailResponseD5 = sswVar13.d()) == null) ? 0.0d : detailResponseD5.getDefaultAmount()) || b8b0Var2.L != 0) {
                                            dcb0 dcb0Var22 = (dcb0) b8b0Var2.b;
                                            if (dcb0Var22 != null) {
                                                dcb0Var22.c.setBetAmount(d2, b8b0Var2.Y);
                                            }
                                            if (d2 != null) {
                                                double dDoubleValue4 = d2.doubleValue();
                                                dcb0 dcb0Var23 = (dcb0) b8b0Var2.b;
                                                if (dcb0Var23 != null) {
                                                    dcb0Var23.i.setBetAmount(dDoubleValue4, b8b0Var2.Y);
                                                }
                                            }
                                        } else {
                                            Double d6 = b8b0Var2.I;
                                            double dDoubleValue5 = d6 != null ? d6.doubleValue() : 0.0d;
                                            fm1 fm1Var11 = (fm1) b8b0Var2.a;
                                            double minAmount = (fm1Var11 == null || (sswVar12 = fm1Var11.w) == null || (detailResponseD4 = sswVar12.d()) == null) ? 0.0d : detailResponseD4.getMinAmount();
                                            B b2 = b8b0Var2.b;
                                            if (dDoubleValue5 < minAmount) {
                                                dcb0 dcb0Var24 = (dcb0) b2;
                                                if (dcb0Var24 != null) {
                                                    ChipSlider chipSlider = dcb0Var24.i;
                                                    fm1 fm1Var12 = (fm1) b8b0Var2.a;
                                                    chipSlider.setConfiguration(null, (fm1Var12 == null || (sswVar11 = fm1Var12.w) == null || (detailResponseD3 = sswVar11.d()) == null) ? null : Double.valueOf(detailResponseD3.getMaxAmount()), null);
                                                }
                                                dcb0 dcb0Var25 = (dcb0) b8b0Var2.b;
                                                if (dcb0Var25 != null) {
                                                    BetBoxContainer betBoxContainer = dcb0Var25.c;
                                                    fm1 fm1Var13 = (fm1) b8b0Var2.a;
                                                    if (fm1Var13 != null && (sswVar10 = fm1Var13.w) != null && (detailResponseD2 = sswVar10.d()) != null) {
                                                        dValueOf2 = Double.valueOf(detailResponseD2.getMinAmount());
                                                    }
                                                    betBoxContainer.setBetAmount(dValueOf2, b8b0Var2.Y);
                                                }
                                                dcb0 dcb0Var26 = (dcb0) b8b0Var2.b;
                                                if (dcb0Var26 != null) {
                                                    ChipSlider chipSlider2 = dcb0Var26.i;
                                                    fm1 fm1Var14 = (fm1) b8b0Var2.a;
                                                    chipSlider2.setBetAmount((fm1Var14 == null || (sswVar9 = fm1Var14.w) == null || (detailResponseD = sswVar9.d()) == null) ? 0.0d : detailResponseD.getMinAmount(), b8b0Var2.Y);
                                                }
                                            } else {
                                                dcb0 dcb0Var27 = (dcb0) b2;
                                                if (dcb0Var27 != null) {
                                                    dcb0Var27.i.setSeekMax();
                                                }
                                                dcb0 dcb0Var28 = (dcb0) b8b0Var2.b;
                                                if (dcb0Var28 != null) {
                                                    dcb0Var28.c.setBetAmount(b8b0Var2.I, b8b0Var2.Y);
                                                }
                                                Double d7 = b8b0Var2.I;
                                                if (d7 != null) {
                                                    double dDoubleValue6 = d7.doubleValue();
                                                    dcb0 dcb0Var29 = (dcb0) b8b0Var2.b;
                                                    if (dcb0Var29 != null) {
                                                        dcb0Var29.i.setBetAmount(dDoubleValue6, b8b0Var2.Y);
                                                    }
                                                }
                                            }
                                        }
                                        double dDoubleValue7 = d2 != null ? d2.doubleValue() : 0.0d;
                                        Double d8 = b8b0Var2.I;
                                        if (dDoubleValue7 >= (d8 != null ? d8.doubleValue() : 0.0d) * 0.8d) {
                                            Double d9 = b8b0Var2.I;
                                            if ((d9 != null ? d9.doubleValue() : 0.0d) <= b8b0Var2.O && (dcb0Var18 = (dcb0) b8b0Var2.b) != null) {
                                                dcb0Var18.b.setVisibility(0);
                                            }
                                        }
                                    }
                                    b8b0Var2.H0();
                                    return Unit.a;
                                }
                            }));
                        }
                        HTTPResponse hTTPResponse4 = (HTTPResponse) loadingState.getData();
                        b8b0Var.N = (hTTPResponse4 == null || (detailResponse48 = (DetailResponse) hTTPResponse4.getData()) == null) ? 0.0d : detailResponse48.getMinAmount();
                        HTTPResponse hTTPResponse5 = (HTTPResponse) loadingState.getData();
                        b8b0Var.O = (hTTPResponse5 == null || (detailResponse47 = (DetailResponse) hTTPResponse5.getData()) == null) ? 0.0d : detailResponse47.getMaxAmount();
                        if (b8b0Var.I == null) {
                            dcb0Var10 = (dcb0) b8b0Var.b;
                            if (dcb0Var10 != null) {
                                dcb0Var10.b.setVisibility(4);
                                Unit unit5 = Unit.a;
                            }
                            dcb0Var11 = (dcb0) b8b0Var.b;
                            if (dcb0Var11 != null && (redMark = dcb0Var11.C.getRedMark()) != null) {
                                redMark.setVisibility(8);
                                Unit unit6 = Unit.a;
                            }
                            dcb0Var12 = (dcb0) b8b0Var.b;
                            if (dcb0Var12 != null) {
                                dcb0Var12.F.F(R.drawable.hamberger_add_more_bg);
                                Unit unit7 = Unit.a;
                            }
                        } else {
                            HTTPResponse hTTPResponse6 = (HTTPResponse) loadingState.getData();
                            double minAmount = (hTTPResponse6 == null || (detailResponse46 = (DetailResponse) hTTPResponse6.getData()) == null) ? 0.0d : detailResponse46.getMinAmount();
                            Double d2 = b8b0Var.I;
                            if (minAmount < (d2 != null ? d2.doubleValue() : 0.0d)) {
                                dcb0Var10 = (dcb0) b8b0Var.b;
                                if (dcb0Var10 != null) {
                                    dcb0Var10.b.setVisibility(4);
                                    Unit unit8 = Unit.a;
                                }
                                dcb0Var11 = (dcb0) b8b0Var.b;
                                if (dcb0Var11 != null) {
                                    redMark.setVisibility(8);
                                    Unit unit9 = Unit.a;
                                }
                                dcb0Var12 = (dcb0) b8b0Var.b;
                                if (dcb0Var12 != null) {
                                    dcb0Var12.F.F(R.drawable.hamberger_add_more_bg);
                                    Unit unit10 = Unit.a;
                                }
                            } else {
                                Double d3 = b8b0Var.I;
                                if ((d3 != null ? d3.doubleValue() : 0.0d) > b8b0Var.O) {
                                    dcb0Var10 = (dcb0) b8b0Var.b;
                                    if (dcb0Var10 != null) {
                                        dcb0Var10.b.setVisibility(4);
                                        Unit unit11 = Unit.a;
                                    }
                                    dcb0Var11 = (dcb0) b8b0Var.b;
                                    if (dcb0Var11 != null) {
                                        redMark.setVisibility(8);
                                        Unit unit12 = Unit.a;
                                    }
                                    dcb0Var12 = (dcb0) b8b0Var.b;
                                    if (dcb0Var12 != null) {
                                        dcb0Var12.F.F(R.drawable.hamberger_add_more_bg);
                                        Unit unit13 = Unit.a;
                                    }
                                } else {
                                    HTTPResponse hTTPResponse7 = (HTTPResponse) loadingState.getData();
                                    if (((hTTPResponse7 == null || (detailResponse45 = (DetailResponse) hTTPResponse7.getData()) == null) ? 0.0d : detailResponse45.getMinAmount()) > 0.0d) {
                                        dcb0 dcb0Var18 = (dcb0) b8b0Var.b;
                                        if (dcb0Var18 != null) {
                                            dcb0Var18.b.setVisibility(0);
                                            Unit unit14 = Unit.a;
                                        }
                                        dcb0 dcb0Var19 = (dcb0) b8b0Var.b;
                                        if (dcb0Var19 != null) {
                                            dcb0Var19.F.F(R.drawable.hamberger_add_more_red);
                                            Unit unit15 = Unit.a;
                                        }
                                        dcb0 dcb0Var20 = (dcb0) b8b0Var.b;
                                        if (dcb0Var20 != null && (redMark4 = dcb0Var20.C.getRedMark()) != null) {
                                            redMark4.setVisibility(0);
                                            Unit unit16 = Unit.a;
                                        }
                                        dcb0 dcb0Var21 = (dcb0) b8b0Var.b;
                                        if (dcb0Var21 != null) {
                                            dcb0Var21.A.setVisibility(0);
                                            Unit unit17 = Unit.a;
                                        }
                                        dcb0 dcb0Var22 = (dcb0) b8b0Var.b;
                                        if (dcb0Var22 != null) {
                                            dcb0Var22.c.setErrorBetAmount();
                                            Unit unit18 = Unit.a;
                                        }
                                    } else {
                                        dcb0Var10 = (dcb0) b8b0Var.b;
                                        if (dcb0Var10 != null) {
                                            dcb0Var10.b.setVisibility(4);
                                            Unit unit19 = Unit.a;
                                        }
                                        dcb0Var11 = (dcb0) b8b0Var.b;
                                        if (dcb0Var11 != null) {
                                            redMark.setVisibility(8);
                                            Unit unit110 = Unit.a;
                                        }
                                        dcb0Var12 = (dcb0) b8b0Var.b;
                                        if (dcb0Var12 != null) {
                                            dcb0Var12.F.F(R.drawable.hamberger_add_more_bg);
                                            Unit unit111 = Unit.a;
                                        }
                                    }
                                }
                            }
                        }
                        double d4 = b8b0Var.f;
                        if (d4 > 0.0d) {
                            Double d5 = b8b0Var.I;
                            if (d5 == null || d4 < d5.doubleValue()) {
                                dcb0Var14 = (dcb0) b8b0Var.b;
                                if (dcb0Var14 != null) {
                                    dcb0Var14.b.setVisibility(4);
                                    Unit unit20 = Unit.a;
                                }
                            } else {
                                Double d6 = b8b0Var.I;
                                if ((d6 != null ? d6.doubleValue() : 0.0d) > b8b0Var.O) {
                                    dcb0Var14 = (dcb0) b8b0Var.b;
                                    if (dcb0Var14 != null) {
                                        dcb0Var14.b.setVisibility(4);
                                        Unit unit21 = Unit.a;
                                    }
                                } else {
                                    HTTPResponse hTTPResponse8 = (HTTPResponse) loadingState.getData();
                                    if (((hTTPResponse8 == null || (detailResponse44 = (DetailResponse) hTTPResponse8.getData()) == null) ? 0.0d : detailResponse44.getMinAmount()) > 0.0d) {
                                        dcb0 dcb0Var23 = (dcb0) b8b0Var.b;
                                        if (dcb0Var23 != null) {
                                            dcb0Var23.b.setVisibility(0);
                                            Unit unit22 = Unit.a;
                                        }
                                    } else {
                                        dcb0Var14 = (dcb0) b8b0Var.b;
                                        if (dcb0Var14 != null) {
                                            dcb0Var14.b.setVisibility(4);
                                            Unit unit23 = Unit.a;
                                        }
                                    }
                                }
                            }
                        }
                        Double d7 = b8b0Var.I;
                        double dDoubleValue2 = d7 != null ? d7.doubleValue() : 0.0d;
                        HTTPResponse hTTPResponse9 = (HTTPResponse) loadingState.getData();
                        double maxAmount = (hTTPResponse9 == null || (detailResponse43 = (DetailResponse) hTTPResponse9.getData()) == null) ? 0.0d : detailResponse43.getMaxAmount();
                        B b2 = b8b0Var.b;
                        if (dDoubleValue2 < maxAmount) {
                            dcb0 dcb0Var24 = (dcb0) b2;
                            if (dcb0Var24 != null) {
                                ChipSlider chipSlider = dcb0Var24.i;
                                HTTPResponse hTTPResponse10 = (HTTPResponse) loadingState.getData();
                                Double dValueOf2 = (hTTPResponse10 == null || (detailResponse42 = (DetailResponse) hTTPResponse10.getData()) == null) ? null : Double.valueOf(detailResponse42.getMinAmount());
                                Double d8 = b8b0Var.I;
                                HTTPResponse hTTPResponse11 = (HTTPResponse) loadingState.getData();
                                chipSlider.setConfiguration(dValueOf2, d8, (hTTPResponse11 == null || (detailResponse41 = (DetailResponse) hTTPResponse11.getData()) == null) ? null : Double.valueOf(detailResponse41.getDefaultAmount()));
                                Unit unit24 = Unit.a;
                            }
                            Double d9 = b8b0Var.I;
                            double dDoubleValue3 = d9 != null ? d9.doubleValue() : 0.0d;
                            HTTPResponse hTTPResponse12 = (HTTPResponse) loadingState.getData();
                            if (dDoubleValue3 < ((hTTPResponse12 == null || (detailResponse40 = (DetailResponse) hTTPResponse12.getData()) == null) ? 0.0d : detailResponse40.getDefaultAmount())) {
                                Double d10 = b8b0Var.I;
                                double dDoubleValue4 = d10 != null ? d10.doubleValue() : 0.0d;
                                HTTPResponse hTTPResponse13 = (HTTPResponse) loadingState.getData();
                                double minAmount2 = (hTTPResponse13 == null || (detailResponse39 = (DetailResponse) hTTPResponse13.getData()) == null) ? 0.0d : detailResponse39.getMinAmount();
                                B b3 = b8b0Var.b;
                                if (dDoubleValue4 < minAmount2) {
                                    dcb0 dcb0Var25 = (dcb0) b3;
                                    if (dcb0Var25 != null) {
                                        ChipSlider chipSlider2 = dcb0Var25.i;
                                        HTTPResponse hTTPResponse14 = (HTTPResponse) loadingState.getData();
                                        Double dValueOf3 = (hTTPResponse14 == null || (detailResponse38 = (DetailResponse) hTTPResponse14.getData()) == null) ? null : Double.valueOf(detailResponse38.getMinAmount());
                                        HTTPResponse hTTPResponse15 = (HTTPResponse) loadingState.getData();
                                        Double dValueOf4 = (hTTPResponse15 == null || (detailResponse37 = (DetailResponse) hTTPResponse15.getData()) == null) ? null : Double.valueOf(detailResponse37.getMaxAmount());
                                        HTTPResponse hTTPResponse16 = (HTTPResponse) loadingState.getData();
                                        chipSlider2.setConfiguration(dValueOf3, dValueOf4, (hTTPResponse16 == null || (detailResponse36 = (DetailResponse) hTTPResponse16.getData()) == null) ? null : Double.valueOf(detailResponse36.getMinAmount()));
                                        Unit unit25 = Unit.a;
                                    }
                                    dcb0 dcb0Var26 = (dcb0) b8b0Var.b;
                                    if (dcb0Var26 != null) {
                                        BetBoxContainer betBoxContainer = dcb0Var26.c;
                                        HTTPResponse hTTPResponse17 = (HTTPResponse) loadingState.getData();
                                        Double dValueOf5 = (hTTPResponse17 == null || (detailResponse35 = (DetailResponse) hTTPResponse17.getData()) == null) ? null : Double.valueOf(detailResponse35.getMinAmount());
                                        HTTPResponse hTTPResponse18 = (HTTPResponse) loadingState.getData();
                                        betBoxContainer.setBetAmount(dValueOf5, (hTTPResponse18 == null || (detailResponse34 = (DetailResponse) hTTPResponse18.getData()) == null) ? null : detailResponse34.getBetChipList());
                                        Unit unit26 = Unit.a;
                                    }
                                    dcb0 dcb0Var27 = (dcb0) b8b0Var.b;
                                    if (dcb0Var27 != null) {
                                        ChipSlider chipSlider3 = dcb0Var27.i;
                                        HTTPResponse hTTPResponse19 = (HTTPResponse) loadingState.getData();
                                        double minAmount3 = (hTTPResponse19 == null || (detailResponse33 = (DetailResponse) hTTPResponse19.getData()) == null) ? 0.0d : detailResponse33.getMinAmount();
                                        HTTPResponse hTTPResponse20 = (HTTPResponse) loadingState.getData();
                                        chipSlider3.setBetAmount(minAmount3, (hTTPResponse20 == null || (detailResponse32 = (DetailResponse) hTTPResponse20.getData()) == null) ? null : detailResponse32.getBetChipList());
                                        Unit unit27 = Unit.a;
                                    }
                                } else {
                                    dcb0 dcb0Var28 = (dcb0) b3;
                                    if (dcb0Var28 != null) {
                                        dcb0Var28.i.setSeekMax();
                                        Unit unit28 = Unit.a;
                                    }
                                    dcb0 dcb0Var29 = (dcb0) b8b0Var.b;
                                    if (dcb0Var29 != null) {
                                        BetBoxContainer betBoxContainer2 = dcb0Var29.c;
                                        Double d11 = b8b0Var.I;
                                        HTTPResponse hTTPResponse21 = (HTTPResponse) loadingState.getData();
                                        betBoxContainer2.setBetAmount(d11, (hTTPResponse21 == null || (detailResponse31 = (DetailResponse) hTTPResponse21.getData()) == null) ? null : detailResponse31.getBetChipList());
                                        Unit unit29 = Unit.a;
                                    }
                                }
                            } else {
                                dcb0 dcb0Var30 = (dcb0) b8b0Var.b;
                                if (dcb0Var30 != null) {
                                    BetBoxContainer betBoxContainer3 = dcb0Var30.c;
                                    HTTPResponse hTTPResponse22 = (HTTPResponse) loadingState.getData();
                                    Double dValueOf6 = (hTTPResponse22 == null || (detailResponse30 = (DetailResponse) hTTPResponse22.getData()) == null) ? null : Double.valueOf(detailResponse30.getDefaultAmount());
                                    HTTPResponse hTTPResponse23 = (HTTPResponse) loadingState.getData();
                                    betBoxContainer3.setBetAmount(dValueOf6, (hTTPResponse23 == null || (detailResponse29 = (DetailResponse) hTTPResponse23.getData()) == null) ? null : detailResponse29.getBetChipList());
                                    Unit unit30 = Unit.a;
                                }
                            }
                        } else {
                            dcb0 dcb0Var31 = (dcb0) b2;
                            if (dcb0Var31 != null) {
                                ChipSlider chipSlider4 = dcb0Var31.i;
                                HTTPResponse hTTPResponse24 = (HTTPResponse) loadingState.getData();
                                Double dValueOf7 = (hTTPResponse24 == null || (detailResponse5 = (DetailResponse) hTTPResponse24.getData()) == null) ? null : Double.valueOf(detailResponse5.getMinAmount());
                                HTTPResponse hTTPResponse25 = (HTTPResponse) loadingState.getData();
                                Double dValueOf8 = (hTTPResponse25 == null || (detailResponse4 = (DetailResponse) hTTPResponse25.getData()) == null) ? null : Double.valueOf(detailResponse4.getMaxAmount());
                                HTTPResponse hTTPResponse26 = (HTTPResponse) loadingState.getData();
                                chipSlider4.setConfiguration(dValueOf7, dValueOf8, (hTTPResponse26 == null || (detailResponse3 = (DetailResponse) hTTPResponse26.getData()) == null) ? null : Double.valueOf(detailResponse3.getDefaultAmount()));
                                Unit unit31 = Unit.a;
                            }
                            dcb0 dcb0Var32 = (dcb0) b8b0Var.b;
                            if (dcb0Var32 != null) {
                                BetBoxContainer betBoxContainer4 = dcb0Var32.c;
                                HTTPResponse hTTPResponse27 = (HTTPResponse) loadingState.getData();
                                Double dValueOf9 = (hTTPResponse27 == null || (detailResponse2 = (DetailResponse) hTTPResponse27.getData()) == null) ? null : Double.valueOf(detailResponse2.getDefaultAmount());
                                HTTPResponse hTTPResponse28 = (HTTPResponse) loadingState.getData();
                                betBoxContainer4.setBetAmount(dValueOf9, (hTTPResponse28 == null || (detailResponse = (DetailResponse) hTTPResponse28.getData()) == null) ? null : detailResponse.getBetChipList());
                                Unit unit32 = Unit.a;
                            }
                        }
                        if (b8b0Var.L == 0) {
                            Double d12 = b8b0Var.I;
                            double dDoubleValue5 = d12 != null ? d12.doubleValue() : 0.0d;
                            HTTPResponse hTTPResponse29 = (HTTPResponse) loadingState.getData();
                            if (dDoubleValue5 <= ((hTTPResponse29 == null || (detailResponse28 = (DetailResponse) hTTPResponse29.getData()) == null) ? 0.0d : detailResponse28.getMinAmount())) {
                                HTTPResponse hTTPResponse30 = (HTTPResponse) loadingState.getData();
                                dDoubleValue = (hTTPResponse30 == null || (detailResponse27 = (DetailResponse) hTTPResponse30.getData()) == null) ? 0.0d : detailResponse27.getMaxAmount();
                            } else {
                                Double d13 = b8b0Var.I;
                                dDoubleValue = d13 != null ? d13.doubleValue() : 0.0d;
                                HTTPResponse hTTPResponse31 = (HTTPResponse) loadingState.getData();
                                double maxAmount2 = (hTTPResponse31 == null || (detailResponse6 = (DetailResponse) hTTPResponse31.getData()) == null) ? 0.0d : detailResponse6.getMaxAmount();
                                if (dDoubleValue > maxAmount2) {
                                    dDoubleValue = maxAmount2;
                                }
                            }
                            b8b0Var.P = dDoubleValue;
                            Double d14 = b8b0Var.I;
                            double dDoubleValue6 = d14 != null ? d14.doubleValue() : 0.0d;
                            HTTPResponse hTTPResponse32 = (HTTPResponse) loadingState.getData();
                            double minAmount4 = (hTTPResponse32 == null || (detailResponse26 = (DetailResponse) hTTPResponse32.getData()) == null) ? 0.0d : detailResponse26.getMinAmount();
                            Double d15 = b8b0Var.I;
                            if (dDoubleValue6 > minAmount4) {
                                defaultAmount = d15 != null ? d15.doubleValue() : 0.0d;
                                HTTPResponse hTTPResponse33 = (HTTPResponse) loadingState.getData();
                                double defaultAmount2 = (hTTPResponse33 == null || (detailResponse25 = (DetailResponse) hTTPResponse33.getData()) == null) ? 0.0d : detailResponse25.getDefaultAmount();
                                if (defaultAmount > defaultAmount2) {
                                    defaultAmount = defaultAmount2;
                                }
                                dcb0 dcb0Var33 = (dcb0) b8b0Var.b;
                                if (dcb0Var33 != null) {
                                    ChipSlider chipSlider5 = dcb0Var33.i;
                                    HTTPResponse hTTPResponse34 = (HTTPResponse) loadingState.getData();
                                    chipSlider5.setConfiguration((hTTPResponse34 == null || (detailResponse24 = (DetailResponse) hTTPResponse34.getData()) == null) ? null : Double.valueOf(detailResponse24.getMinAmount()), Double.valueOf(b8b0Var.P), Double.valueOf(defaultAmount));
                                    Unit unit33 = Unit.a;
                                }
                                dcb0 dcb0Var34 = (dcb0) b8b0Var.b;
                                if (dcb0Var34 != null) {
                                    BetBoxContainer betBoxContainer5 = dcb0Var34.c;
                                    Double dValueOf10 = Double.valueOf(defaultAmount);
                                    HTTPResponse hTTPResponse35 = (HTTPResponse) loadingState.getData();
                                    betBoxContainer5.setBetAmount(dValueOf10, (hTTPResponse35 == null || (detailResponse23 = (DetailResponse) hTTPResponse35.getData()) == null) ? null : detailResponse23.getBetChipList());
                                    Unit unit34 = Unit.a;
                                }
                                dcb0 dcb0Var35 = (dcb0) b8b0Var.b;
                                if (dcb0Var35 != null) {
                                    ChipSlider chipSlider6 = dcb0Var35.i;
                                    HTTPResponse hTTPResponse36 = (HTTPResponse) loadingState.getData();
                                    if (hTTPResponse36 != null && (detailResponse22 = (DetailResponse) hTTPResponse36.getData()) != null) {
                                        betChipList = detailResponse22.getBetChipList();
                                    }
                                    chipSlider6.setBetAmount(defaultAmount, betChipList);
                                    Unit unit35 = Unit.a;
                                }
                                b8b0Var.Q = defaultAmount;
                            } else {
                                double dDoubleValue7 = d15 != null ? d15.doubleValue() : 0.0d;
                                HTTPResponse hTTPResponse37 = (HTTPResponse) loadingState.getData();
                                double defaultAmount3 = (hTTPResponse37 == null || (detailResponse21 = (DetailResponse) hTTPResponse37.getData()) == null) ? 0.0d : detailResponse21.getDefaultAmount();
                                B b4 = b8b0Var.b;
                                if (dDoubleValue7 < defaultAmount3) {
                                    dcb0 dcb0Var36 = (dcb0) b4;
                                    if (dcb0Var36 != null) {
                                        ChipSlider chipSlider7 = dcb0Var36.i;
                                        HTTPResponse hTTPResponse38 = (HTTPResponse) loadingState.getData();
                                        Double dValueOf11 = (hTTPResponse38 == null || (detailResponse20 = (DetailResponse) hTTPResponse38.getData()) == null) ? null : Double.valueOf(detailResponse20.getMinAmount());
                                        Double dValueOf12 = Double.valueOf(b8b0Var.P);
                                        HTTPResponse hTTPResponse39 = (HTTPResponse) loadingState.getData();
                                        chipSlider7.setConfiguration(dValueOf11, dValueOf12, (hTTPResponse39 == null || (detailResponse19 = (DetailResponse) hTTPResponse39.getData()) == null) ? null : Double.valueOf(detailResponse19.getMinAmount()));
                                        Unit unit36 = Unit.a;
                                    }
                                    dcb0 dcb0Var37 = (dcb0) b8b0Var.b;
                                    if (dcb0Var37 != null) {
                                        BetBoxContainer betBoxContainer6 = dcb0Var37.c;
                                        HTTPResponse hTTPResponse40 = (HTTPResponse) loadingState.getData();
                                        Double dValueOf13 = (hTTPResponse40 == null || (detailResponse18 = (DetailResponse) hTTPResponse40.getData()) == null) ? null : Double.valueOf(detailResponse18.getMinAmount());
                                        HTTPResponse hTTPResponse41 = (HTTPResponse) loadingState.getData();
                                        betBoxContainer6.setBetAmount(dValueOf13, (hTTPResponse41 == null || (detailResponse17 = (DetailResponse) hTTPResponse41.getData()) == null) ? null : detailResponse17.getBetChipList());
                                        Unit unit37 = Unit.a;
                                    }
                                    dcb0 dcb0Var38 = (dcb0) b8b0Var.b;
                                    if (dcb0Var38 != null) {
                                        ChipSlider chipSlider8 = dcb0Var38.i;
                                        HTTPResponse hTTPResponse42 = (HTTPResponse) loadingState.getData();
                                        double minAmount5 = (hTTPResponse42 == null || (detailResponse16 = (DetailResponse) hTTPResponse42.getData()) == null) ? 0.0d : detailResponse16.getMinAmount();
                                        HTTPResponse hTTPResponse43 = (HTTPResponse) loadingState.getData();
                                        if (hTTPResponse43 != null && (detailResponse15 = (DetailResponse) hTTPResponse43.getData()) != null) {
                                            betChipList = detailResponse15.getBetChipList();
                                        }
                                        chipSlider8.setBetAmount(minAmount5, betChipList);
                                        Unit unit38 = Unit.a;
                                    }
                                    HTTPResponse hTTPResponse44 = (HTTPResponse) loadingState.getData();
                                    defaultAmount = (hTTPResponse44 == null || (detailResponse14 = (DetailResponse) hTTPResponse44.getData()) == null) ? 0.0d : detailResponse14.getMinAmount();
                                    b8b0Var.Q = defaultAmount;
                                } else {
                                    dcb0 dcb0Var39 = (dcb0) b4;
                                    if (dcb0Var39 != null) {
                                        ChipSlider chipSlider9 = dcb0Var39.i;
                                        HTTPResponse hTTPResponse45 = (HTTPResponse) loadingState.getData();
                                        Double dValueOf14 = (hTTPResponse45 == null || (detailResponse13 = (DetailResponse) hTTPResponse45.getData()) == null) ? null : Double.valueOf(detailResponse13.getMinAmount());
                                        Double dValueOf15 = Double.valueOf(b8b0Var.P);
                                        HTTPResponse hTTPResponse46 = (HTTPResponse) loadingState.getData();
                                        chipSlider9.setConfiguration(dValueOf14, dValueOf15, (hTTPResponse46 == null || (detailResponse12 = (DetailResponse) hTTPResponse46.getData()) == null) ? null : Double.valueOf(detailResponse12.getDefaultAmount()));
                                        Unit unit39 = Unit.a;
                                    }
                                    dcb0 dcb0Var40 = (dcb0) b8b0Var.b;
                                    if (dcb0Var40 != null) {
                                        BetBoxContainer betBoxContainer7 = dcb0Var40.c;
                                        HTTPResponse hTTPResponse47 = (HTTPResponse) loadingState.getData();
                                        Double dValueOf16 = (hTTPResponse47 == null || (detailResponse11 = (DetailResponse) hTTPResponse47.getData()) == null) ? null : Double.valueOf(detailResponse11.getDefaultAmount());
                                        HTTPResponse hTTPResponse48 = (HTTPResponse) loadingState.getData();
                                        betBoxContainer7.setBetAmount(dValueOf16, (hTTPResponse48 == null || (detailResponse10 = (DetailResponse) hTTPResponse48.getData()) == null) ? null : detailResponse10.getBetChipList());
                                        Unit unit40 = Unit.a;
                                    }
                                    dcb0 dcb0Var41 = (dcb0) b8b0Var.b;
                                    if (dcb0Var41 != null) {
                                        ChipSlider chipSlider10 = dcb0Var41.i;
                                        HTTPResponse hTTPResponse49 = (HTTPResponse) loadingState.getData();
                                        double defaultAmount4 = (hTTPResponse49 == null || (detailResponse9 = (DetailResponse) hTTPResponse49.getData()) == null) ? 0.0d : detailResponse9.getDefaultAmount();
                                        HTTPResponse hTTPResponse50 = (HTTPResponse) loadingState.getData();
                                        if (hTTPResponse50 != null && (detailResponse8 = (DetailResponse) hTTPResponse50.getData()) != null) {
                                            betChipList = detailResponse8.getBetChipList();
                                        }
                                        chipSlider10.setBetAmount(defaultAmount4, betChipList);
                                        Unit unit41 = Unit.a;
                                    }
                                    HTTPResponse hTTPResponse51 = (HTTPResponse) loadingState.getData();
                                    defaultAmount = (hTTPResponse51 == null || (detailResponse7 = (DetailResponse) hTTPResponse51.getData()) == null) ? 0.0d : detailResponse7.getDefaultAmount();
                                    b8b0Var.Q = defaultAmount;
                                }
                            }
                            Double d16 = b8b0Var.I;
                            if (defaultAmount > (d16 != null ? d16.doubleValue() : 0.0d)) {
                                dcb0 dcb0Var42 = (dcb0) b8b0Var.b;
                                if (dcb0Var42 != null && (redMark3 = dcb0Var42.C.getRedMark()) != null) {
                                    redMark3.setVisibility(0);
                                    Unit unit42 = Unit.a;
                                }
                                dcb0 dcb0Var43 = (dcb0) b8b0Var.b;
                                if (dcb0Var43 != null) {
                                    dcb0Var43.F.F(R.drawable.hamberger_add_more_red);
                                    Unit unit43 = Unit.a;
                                }
                                dcb0 dcb0Var44 = (dcb0) b8b0Var.b;
                                if (dcb0Var44 != null) {
                                    dcb0Var44.A.setVisibility(0);
                                    Unit unit44 = Unit.a;
                                }
                                dcb0 dcb0Var45 = (dcb0) b8b0Var.b;
                                if (dcb0Var45 != null) {
                                    dcb0Var45.c.setErrorBetAmount();
                                    Unit unit45 = Unit.a;
                                }
                            } else {
                                double d17 = b8b0Var.Q;
                                Double d18 = b8b0Var.I;
                                if (d17 >= (d18 != null ? d18.doubleValue() : 0.0d)) {
                                    Double d19 = b8b0Var.I;
                                    if ((d19 != null ? d19.doubleValue() : 0.0d) <= b8b0Var.O && (dcb0Var13 = (dcb0) b8b0Var.b) != null) {
                                        dcb0Var13.b.setVisibility(0);
                                        Unit unit46 = Unit.a;
                                    }
                                }
                                dcb0 dcb0Var46 = (dcb0) b8b0Var.b;
                                if (dcb0Var46 != null && (redMark2 = dcb0Var46.C.getRedMark()) != null) {
                                    redMark2.setVisibility(8);
                                    Unit unit47 = Unit.a;
                                }
                                dcb0 dcb0Var47 = (dcb0) b8b0Var.b;
                                if (dcb0Var47 != null) {
                                    dcb0Var47.F.F(R.drawable.hamberger_add_more_bg);
                                    Unit unit48 = Unit.a;
                                }
                                dcb0 dcb0Var48 = (dcb0) b8b0Var.b;
                                if (dcb0Var48 != null) {
                                    dcb0Var48.A.setVisibility(4);
                                    Unit unit49 = Unit.a;
                                }
                                dcb0 dcb0Var49 = (dcb0) b8b0Var.b;
                                if (dcb0Var49 != null) {
                                    dcb0Var49.c.setErrorBetAmountLayout();
                                    Unit unit50 = Unit.a;
                                }
                            }
                        }
                        b8b0Var.H0();
                        Unit unit51 = Unit.a;
                    } else if (i7 != 3) {
                        Unit unit52 = Unit.a;
                    } else {
                        e activity4 = b8b0Var.getActivity();
                        if (activity4 != null) {
                            if (!b8b0Var.r0 && (dcb0Var15 = (dcb0) b8b0Var.b) != null) {
                                dcb0Var15.M.O(100);
                                Unit unit53 = Unit.a;
                            }
                            ResultWrapper.GenericError error = loadingState.getError();
                            if (error == null || (code = error.getCode()) == null || code.intValue() != 403 || b8b0Var.k0) {
                                u35 u35Var = u35.e;
                                if (b8b0Var.J == null) {
                                    Intrinsics.n("soundViewModel");
                                    throw null;
                                }
                                jcg.d(u35Var, activity4, "Spin da' Bottle", loadingState.getError(), new xf20(b8b0Var, i8), null, null, 0, activity4.getColor(R.color.try_again_color), null, null, null, new Function1() { // from class: e7b0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        String str2 = (String) obj2;
                                        str2.getClass();
                                        b8b0Var.t0(str2);
                                        return Unit.a;
                                    }
                                }, null, 97760);
                            } else {
                                b8b0Var.k0 = true;
                                SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                            }
                            Unit unit54 = Unit.a;
                        }
                    }
                    return Unit.a;
                }
            }));
        }
        this.l0 = new b();
        dcb0 dcb0Var10 = (dcb0) this.b;
        if (dcb0Var10 != null && (navigation = dcb0Var10.C.getNavigation()) != null) {
            navigation.setAlpha(0.5f);
        }
        dcb0 dcb0Var11 = (dcb0) this.b;
        if (dcb0Var11 != null) {
            dcb0Var11.y.setScrimColor(requireContext().getColor(R.color.trans_black_60));
        }
        dcb0 dcb0Var12 = (dcb0) this.b;
        if (dcb0Var12 != null) {
            dcb0Var12.C.setNavigationListener(new hwt(this, i6));
        }
        dcb0 dcb0Var13 = (dcb0) this.b;
        if (dcb0Var13 != null) {
            dcb0Var13.C.setBackListener(new hdf(this, i5));
        }
        dcb0 dcb0Var14 = (dcb0) this.b;
        if (dcb0Var14 != null) {
            dcb0Var14.b.setOnClickListener(new e6b0());
        }
        if (Build.VERSION.SDK_INT <= 25) {
            dcb0 dcb0Var15 = (dcb0) this.b;
            if (dcb0Var15 != null) {
                dcb0Var15.b.setTextSize(14.0f);
            }
            dcb0 dcb0Var16 = (dcb0) this.b;
            if (dcb0Var16 != null) {
                dcb0Var16.R.setTextSize(18.5f);
            }
            dcb0 dcb0Var17 = (dcb0) this.b;
            if (dcb0Var17 != null) {
                dcb0Var17.w.setTextSize(18.5f);
            }
            dcb0 dcb0Var18 = (dcb0) this.b;
            if (dcb0Var18 != null) {
                dcb0Var18.L.setTextSize(10.0f);
            }
            dcb0 dcb0Var19 = (dcb0) this.b;
            if (dcb0Var19 != null) {
                dcb0Var19.K.setTextSize(10.0f);
            }
        }
        dcb0 dcb0Var20 = (dcb0) this.b;
        if (dcb0Var20 != null) {
            gr60.a(dcb0Var20.I, new ptt(this, i6));
        }
        dcb0 dcb0Var21 = (dcb0) this.b;
        if (dcb0Var21 != null) {
            gr60.a(dcb0Var21.P, new f6b0(this, i3));
        }
        dcb0 dcb0Var22 = (dcb0) this.b;
        if (dcb0Var22 != null) {
            gr60.a(dcb0Var22.N, new rtt(this, c3 == true ? 1 : 0));
        }
        dcb0 dcb0Var23 = (dcb0) this.b;
        if (dcb0Var23 != null) {
            gr60.a(dcb0Var23.O, new Function1() { // from class: g6b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((View) obj).getClass();
                    b8b0 b8b0Var = this.a;
                    String string2 = b8b0Var.getString(R.string.down);
                    string2.getClass();
                    b8b0Var.p0(string2);
                    return Unit.a;
                }
            });
        }
        dcb0 dcb0Var24 = (dcb0) this.b;
        if (dcb0Var24 != null && (chat = dcb0Var24.C.getChat()) != null) {
            chat.setOnClickListener(new View.OnClickListener() { // from class: h6b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    b8b0 b8b0Var = this.a;
                    try {
                        b8b0Var.d0 = true;
                        Intent intent = new Intent(b8b0Var.requireContext(), (Class<?>) ChatActivity.class);
                        intent.putExtra("roomId", b8b0Var.i);
                        intent.putExtra("botId", b8b0Var.v);
                        intent.putExtra("color", R.color.toolbar_strip_bottle);
                        GameDetails gameDetails2 = b8b0Var.y;
                        intent.putExtra(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, gameDetails2 != null ? gameDetails2.getName() : null);
                        intent.putExtra("sound", b8b0Var.y);
                        SharedPreferences sharedPreferences = b8b0Var.Z;
                        intent.putExtra("soundOn", sharedPreferences != null ? sharedPreferences.getBoolean("SPIN_DA_BOTTLE_SOUND", false) : false);
                        b8b0Var.requireContext().startActivity(intent);
                    } catch (Exception unused) {
                    }
                }
            });
        }
        dcb0 dcb0Var25 = (dcb0) this.b;
        if (dcb0Var25 != null) {
            dcb0Var25.d.setBetAmountAddListener(new qt6(this, i6));
        }
        dcb0 dcb0Var26 = (dcb0) this.b;
        if (dcb0Var26 != null) {
            dcb0Var26.d.setFbgClickListener(new Function1() { // from class: i6b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    e activity4;
                    xi60 xi60Var;
                    Double balance;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    final b8b0 b8b0Var = this.a;
                    if (b8b0Var.y0 || b8b0Var.i0 != null) {
                        return Unit.a;
                    }
                    ypa0 ypa0Var = b8b0Var.J;
                    fm1.c cVar = null;
                    if (ypa0Var == null) {
                        Intrinsics.n("soundViewModel");
                        throw null;
                    }
                    String string2 = b8b0Var.getString(R.string.click_chip);
                    string2.getClass();
                    ypa0Var.A1(0L, string2);
                    if (zBooleanValue && (activity4 = b8b0Var.getActivity()) != null) {
                        fm1 fm1Var5 = (fm1) b8b0Var.a;
                        if (fm1Var5 != null) {
                            ssw<DetailResponse> sswVar6 = fm1Var5.w;
                            Double d2 = fm1Var5.b.d();
                            double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
                            WalletInfo walletInfoD = fm1Var5.z.d();
                            double dDoubleValue2 = (walletInfoD == null || (balance = walletInfoD.getBalance()) == null) ? 0.0d : balance.doubleValue();
                            DetailResponse detailResponseD = sswVar6.d();
                            double minAmount = detailResponseD != null ? detailResponseD.getMinAmount() : 0.0d;
                            DetailResponse detailResponseD2 = sswVar6.d();
                            cVar = new fm1.c(dDoubleValue, minAmount, detailResponseD2 != null ? detailResponseD2.getMaxAmount() : 0.0d, dDoubleValue2);
                        }
                        b8b0Var.A0 = cVar;
                        xi60 xi60Var2 = new xi60();
                        b8b0Var.i0 = xi60Var2;
                        if (!xi60Var2.isAdded() && (xi60Var = b8b0Var.i0) != null) {
                            FragmentManager supportFragmentManager = activity4.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            xi60Var.q0(supportFragmentManager, new yt6(b8b0Var, 2), new gaj() { // from class: o6b0
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    Dialog dialog;
                                    GiftItem giftItem = (GiftItem) obj2;
                                    Double d3 = (Double) obj3;
                                    double dDoubleValue3 = d3.doubleValue();
                                    boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                                    giftItem.getClass();
                                    b8b0 b8b0Var2 = b8b0Var;
                                    b8b0Var2.y0 = true;
                                    b8b0Var2.z0 = zBooleanValue2;
                                    xi60 xi60Var3 = b8b0Var2.i0;
                                    if (xi60Var3 != null && (dialog = xi60Var3.getDialog()) != null && dialog.isShowing()) {
                                        xi60 xi60Var4 = b8b0Var2.i0;
                                        if (xi60Var4 != null) {
                                            xi60Var4.dismiss();
                                        }
                                        b8b0Var2.i0 = null;
                                    }
                                    dcb0 dcb0Var27 = (dcb0) b8b0Var2.b;
                                    if (dcb0Var27 != null) {
                                        dcb0Var27.c.a(0);
                                    }
                                    dcb0 dcb0Var28 = (dcb0) b8b0Var2.b;
                                    if (dcb0Var28 != null) {
                                        dcb0Var28.c.b(0, 4);
                                    }
                                    dcb0 dcb0Var29 = (dcb0) b8b0Var2.b;
                                    if (dcb0Var29 != null) {
                                        dcb0Var29.c.setBetAmount(d3, b8b0Var2.Y);
                                    }
                                    dcb0 dcb0Var30 = (dcb0) b8b0Var2.b;
                                    if (dcb0Var30 != null) {
                                        dcb0Var30.i.setBetAmount(dDoubleValue3, b8b0Var2.Y);
                                    }
                                    dcb0 dcb0Var31 = (dcb0) b8b0Var2.b;
                                    if (dcb0Var31 != null) {
                                        dcb0Var31.f.setVisibility(0);
                                    }
                                    fm1.c cVar2 = b8b0Var2.A0;
                                    double d4 = (cVar2 != null ? cVar2.a : 0.0d) - dDoubleValue3;
                                    fm1 fm1Var6 = (fm1) b8b0Var2.a;
                                    if (fm1Var6 != null) {
                                        fm1Var6.y1(d3);
                                    }
                                    dcb0 dcb0Var32 = (dcb0) b8b0Var2.b;
                                    if (dcb0Var32 != null) {
                                        dcb0Var32.d.setEnabled(false);
                                    }
                                    dcb0 dcb0Var33 = (dcb0) b8b0Var2.b;
                                    if (dcb0Var33 != null) {
                                        dcb0Var33.d.setAlpha(0.5f);
                                    }
                                    dcb0 dcb0Var34 = (dcb0) b8b0Var2.b;
                                    if (dcb0Var34 != null) {
                                        dcb0Var34.d.E(0.5f, false);
                                    }
                                    dcb0 dcb0Var35 = (dcb0) b8b0Var2.b;
                                    if (dcb0Var35 != null) {
                                        dcb0Var35.i.setEnabled(false);
                                    }
                                    dcb0 dcb0Var36 = (dcb0) b8b0Var2.b;
                                    if (dcb0Var36 != null) {
                                        dcb0Var36.i.setAlpha(0.5f);
                                    }
                                    dcb0 dcb0Var37 = (dcb0) b8b0Var2.b;
                                    if (dcb0Var37 != null) {
                                        dcb0Var37.i.b(false);
                                    }
                                    fm1 fm1Var7 = (fm1) b8b0Var2.a;
                                    if (fm1Var7 != null) {
                                        fm1Var7.d.m(new fm1.d(giftItem, dDoubleValue3, d4));
                                    }
                                    return Unit.a;
                                }
                            }, new but(b8b0Var, 2));
                        }
                    }
                    return Unit.a;
                }
            });
        }
        dcb0 dcb0Var27 = (dcb0) this.b;
        if (dcb0Var27 != null && (crossFbg = dcb0Var27.c.getCrossFbg()) != null) {
            gr60.a(crossFbg, new Function1() { // from class: t7b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((View) obj).getClass();
                    b8b0 b8b0Var = this.a;
                    GameDetails gameDetails2 = b8b0Var.y;
                    String name2 = gameDetails2 != null ? gameDetails2.getName() : null;
                    if (name2 == null) {
                        name2 = "";
                    }
                    wz.a("FBGRemoved", name2, new String[0]);
                    b8b0Var.G0();
                    return Unit.a;
                }
            });
        }
        dcb0 dcb0Var28 = (dcb0) this.b;
        if (dcb0Var28 != null) {
            dcb0Var28.i.setAmountChangeListener(new Function2() { // from class: z7b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    fm1 fm1Var5;
                    Double d2;
                    Double d3 = (Double) obj;
                    d3.getClass();
                    if (((Boolean) obj2).booleanValue()) {
                        b8b0 b8b0Var = this.a;
                        ypa0 ypa0Var = b8b0Var.J;
                        if (ypa0Var == null) {
                            Intrinsics.n("soundViewModel");
                            throw null;
                        }
                        String string2 = b8b0Var.getString(R.string.slider);
                        string2.getClass();
                        ypa0Var.A1(0L, string2);
                        fm1 fm1Var6 = (fm1) b8b0Var.a;
                        if ((fm1Var6 == null || (d2 = fm1Var6.b.d()) == null || !d2.equals(d3)) && (fm1Var5 = (fm1) b8b0Var.a) != null) {
                            fm1Var5.y1(d3);
                        }
                    }
                    return Unit.a;
                }
            }, new Function1() { // from class: a8b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    fm1 fm1Var5;
                    Double d2;
                    Double d3;
                    Double d4 = (Double) obj;
                    b8b0 b8b0Var = this.a;
                    b8b0Var.L = 1;
                    fm1 fm1Var6 = (fm1) b8b0Var.a;
                    if ((fm1Var6 == null || (d3 = fm1Var6.b.d()) == null || !d3.equals(d4)) && (fm1Var5 = (fm1) b8b0Var.a) != null) {
                        fm1Var5.y1(d4);
                    }
                    fm1 fm1Var7 = (fm1) b8b0Var.a;
                    double dDoubleValue = (fm1Var7 == null || (d2 = fm1Var7.b.d()) == null) ? 0.0d : d2.doubleValue();
                    Double d5 = b8b0Var.I;
                    double dDoubleValue2 = d5 != null ? d5.doubleValue() : 0.0d;
                    B b2 = b8b0Var.b;
                    if (dDoubleValue > dDoubleValue2) {
                        dcb0 dcb0Var29 = (dcb0) b2;
                        if (dcb0Var29 != null) {
                            dcb0Var29.A.setVisibility(0);
                        }
                        dcb0 dcb0Var30 = (dcb0) b8b0Var.b;
                        if (dcb0Var30 != null) {
                            dcb0Var30.c.setErrorBetAmount();
                        }
                        dcb0 dcb0Var31 = (dcb0) b8b0Var.b;
                        if (dcb0Var31 != null) {
                            dcb0Var31.i.setSeekMax();
                        }
                    } else {
                        dcb0 dcb0Var32 = (dcb0) b2;
                        if (dcb0Var32 != null) {
                            dcb0Var32.A.setVisibility(4);
                        }
                        dcb0 dcb0Var33 = (dcb0) b8b0Var.b;
                        if (dcb0Var33 != null) {
                            dcb0Var33.c.setErrorBetAmountLayout();
                        }
                    }
                    return Unit.a;
                }
            }, new cxj(this, i6));
        }
        u0().b.f(getViewLifecycleOwner(), new c(new Function1() { // from class: t6b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                PagingFetchType type;
                fo2 fo2Var;
                fo2 fo2Var2;
                e activity4;
                LoadingState loadingState = (LoadingState) obj;
                int i7 = b8b0.a.a[loadingState.getStatus().ordinal()];
                int i8 = 3;
                final b8b0 b8b0Var = this.a;
                if (i7 != 1) {
                    int i9 = 2;
                    if (i7 == 2) {
                        fo2 fo2Var3 = b8b0Var.H;
                        if (fo2Var3 != null) {
                            fo2Var3.k(true);
                        }
                    } else {
                        if (i7 != 3) {
                            uhc.a();
                            return null;
                        }
                        xbg xbgVar2 = b8b0Var.B;
                        if (xbgVar2 == null) {
                            Intrinsics.n("errorDialog");
                            throw null;
                        }
                        if (!xbgVar2.isShowing() && (activity4 = b8b0Var.getActivity()) != null) {
                            u35 u35Var = u35.e;
                            if (b8b0Var.J == null) {
                                Intrinsics.n("soundViewModel");
                                throw null;
                            }
                            jcg.d(u35Var, activity4, "Spin da' Bottle", loadingState.getError(), new vw6(b8b0Var, i8), new zut(b8b0Var, i9), null, 0, activity4.getColor(R.color.try_again_color), null, null, null, new Function1() { // from class: d7b0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    String str2 = (String) obj2;
                                    str2.getClass();
                                    b8b0Var.t0(str2);
                                    return Unit.a;
                                }
                            }, null, 97728);
                        }
                    }
                } else if (loadingState.getData() != null) {
                    fo2 fo2Var4 = b8b0Var.H;
                    if (fo2Var4 != null) {
                        fo2Var4.k(false);
                    }
                    List list = (List) ((HTTPResponse) loadingState.getData()).getData();
                    if ((list != null ? list.size() : 0) <= 0) {
                        Integer total = ((HTTPResponse) loadingState.getData()).getTotal();
                        if ((total != null ? total.intValue() : 0) <= 0 && (fo2Var = b8b0Var.H) != null && fo2Var.f().getChildCount() == 0 && (fo2Var2 = b8b0Var.H) != null) {
                            fo2Var2.l();
                            Unit unit = Unit.a;
                        }
                    }
                    fo2 fo2Var5 = b8b0Var.H;
                    if (fo2Var5 != null) {
                        List list2 = (List) ((HTTPResponse) loadingState.getData()).getData();
                        Integer total2 = ((HTTPResponse) loadingState.getData()).getTotal();
                        PagingState pagingStateD = b8b0Var.u0().c.d();
                        int offset = pagingStateD != null ? pagingStateD.getOffset() : 0;
                        PagingState pagingStateD2 = b8b0Var.u0().c.d();
                        int limit = pagingStateD2 != null ? pagingStateD2.getLimit() : 0;
                        PagingState pagingStateD3 = b8b0Var.u0().c.d();
                        if (pagingStateD3 == null || (type = pagingStateD3.getType()) == null) {
                            type = PagingFetchType.VIEW_MORE;
                        }
                        ArrayList arrayList2 = fo2Var5.D;
                        type.getClass();
                        if (list2 != null) {
                            fo2Var5.B.addAll(list2);
                            arrayList2.addAll(list2);
                        }
                        fo2Var5.e().setBackground(fo2Var5.getContext().getDrawable(R.drawable.modal_bottle));
                        fo2Var5.K = offset;
                        fo2Var5.J = limit;
                        fo2Var5.h(type, total2, list2 != null ? list2.size() : 0);
                        if (list2 != null) {
                            RecyclerView.f adapter = fo2Var5.f().getAdapter();
                            adapter.getClass();
                            yo2 yo2Var = (yo2) adapter;
                            ArrayList arrayListC0 = CollectionsKt.C0(arrayList2);
                            fo2.b bVar = fo2Var5.L;
                            fo2.b bVar2 = fo2.b.b;
                            ej5.c(yo2Var.d, null, null, new bp2(arrayListC0, bVar == bVar2, fo2Var5.M == bVar2, yo2Var, null), 3);
                        }
                        RecyclerView.f adapter2 = fo2Var5.f().getAdapter();
                        if (adapter2 != null) {
                            adapter2.notifyDataSetChanged();
                        }
                    }
                }
                return Unit.a;
            }
        }));
        fm1 fm1Var5 = (fm1) this.a;
        if (fm1Var5 != null) {
            fm1Var5.x1();
        }
        fm1 fm1Var6 = (fm1) this.a;
        if (fm1Var6 != null && (sswVar = fm1Var6.f) != null) {
            sswVar.f(getViewLifecycleOwner(), new c(new w6b0(this, c2 == true ? 1 : 0)));
        }
        ypa0 ypa0Var = this.J;
        if (ypa0Var == null) {
            Intrinsics.n("soundViewModel");
            throw null;
        }
        GameDetails gameDetails2 = this.y;
        String name2 = gameDetails2 != null ? gameDetails2.getName() : null;
        if (name2 == null) {
            name2 = "";
        }
        ypa0Var.e = name2;
    }

    public final void p0(final String str) {
        ssw<fm1.d> sswVar;
        fm1.d dVarD;
        ssw<fm1.d> sswVar2;
        fm1.d dVarD2;
        ssw<fm1.d> sswVar3;
        fm1.d dVarD3;
        ssw<fm1.d> sswVar4;
        fm1.d dVarD4;
        ssw<Double> sswVar5;
        Double d2;
        ssw<Double> sswVar6;
        Double d3;
        Context context;
        String string;
        String strB;
        String strB2;
        String string2;
        String string3;
        ssw<Double> sswVar7;
        ssw<Double> sswVar8;
        Double d4;
        this.U = 0;
        this.V = str;
        try {
            ypa0 ypa0Var = this.J;
            Double dValueOf = null;
            if (ypa0Var == null) {
                Intrinsics.n("soundViewModel");
                throw null;
            }
            String string4 = requireContext().getString(R.string.click_main_menu);
            string4.getClass();
            ypa0Var.A1(0L, string4);
            SharedPreferences sharedPreferences = this.Z;
            double dDoubleValue = 0.0d;
            if (sharedPreferences != null && !sharedPreferences.getBoolean("SPIN_DA_BOTTLE_ONE_TAP", false)) {
                if (this.C.length() == 0) {
                    return;
                }
                DecimalFormat decimalFormat = new DecimalFormat("#,###.00", SportyGamesManager.decimalFormatSymbols);
                fm1 fm1Var = (fm1) this.a;
                if (fm1Var != null && (sswVar8 = fm1Var.b) != null && (d4 = sswVar8.d()) != null) {
                    dDoubleValue = d4.doubleValue();
                }
                if (dDoubleValue < 1.0d) {
                    decimalFormat = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols);
                }
                fm1 fm1Var2 = (fm1) this.a;
                if (fm1Var2 == null || (sswVar6 = fm1Var2.b) == null || (d3 = sswVar6.d()) == null) {
                    return;
                }
                double dDoubleValue2 = d3.doubleValue();
                op5 op5Var = op5.a;
                String str2 = this.C;
                op5Var.getClass();
                String string5 = getString(R.string.redblack_confirm_txt, op5.i(str2), decimalFormat.format(dDoubleValue2), str);
                if (string5 == null || (context = getContext()) == null) {
                    return;
                }
                if (Intrinsics.g(str, getString(R.string.up))) {
                    string = getString(R.string.place_bet_confirm_up_cms);
                    string.getClass();
                } else {
                    string = getString(R.string.place_bet_confirm_down_cms);
                    string.getClass();
                }
                HashMap map = new HashMap();
                map.put(getString(R.string.currency_cms), op5.i(this.C));
                String string6 = getString(R.string.amount_cms);
                fm1 fm1Var3 = (fm1) this.a;
                map.put(string6, decimalFormat.format((fm1Var3 == null || (sswVar7 = fm1Var3.b) == null) ? null : sswVar7.d()));
                HashMap map2 = new HashMap();
                map2.put(getString(R.string.currency_cms), op5.i(this.C));
                map2.put(getString(R.string.amount_cms), "_AMOUNT_");
                FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
                supportFragmentManager.getClass();
                if (this.J == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                String strB3 = op5.b(string, string5, map);
                String string7 = getString(R.string.redblack_confirm_txt, op5.i(this.C), "_AMOUNT_", str);
                string7.getClass();
                String strB4 = op5.b(string, string7, map2);
                androidx.fragment.app.e activity = getActivity();
                if (activity == null || (string3 = activity.getString(R.string.confirm_btn_cms)) == null) {
                    strB = null;
                } else {
                    String string8 = getString(R.string.confirm_bet);
                    string8.getClass();
                    strB = op5.b(string3, string8, null);
                }
                androidx.fragment.app.e activity2 = getActivity();
                if (activity2 == null || (string2 = activity2.getString(R.string.cancel_btn_cms)) == null) {
                    strB2 = null;
                } else {
                    String string9 = getString(R.string.cancel_bet);
                    string9.getClass();
                    strB2 = op5.b(string2, string9, null);
                }
                com.sportygames.commons.components.a aVarA = com.sportygames.commons.components.a.C0437a.a("Spin da' Bottle", "place bet", strB3, strB4, strB, strB2, new Function1() { // from class: p6b0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ssw<fm1.d> sswVar9;
                        fm1.d dVarD5;
                        ssw<fm1.d> sswVar10;
                        fm1.d dVarD6;
                        ssw<fm1.d> sswVar11;
                        fm1.d dVarD7;
                        ssw<fm1.d> sswVar12;
                        fm1.d dVarD8;
                        ssw<Double> sswVar13;
                        Double d5;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        b8b0 b8b0Var = this.a;
                        if (!zBooleanValue && b8b0Var.M == 1) {
                            b8b0Var.M = 0;
                        }
                        b8b0Var.r0();
                        if (zBooleanValue) {
                            fm1 fm1Var4 = (fm1) b8b0Var.a;
                            double dDoubleValue3 = (fm1Var4 == null || (sswVar13 = fm1Var4.b) == null || (d5 = sswVar13.d()) == null) ? 0.0d : d5.doubleValue();
                            b8b0Var.Q = dDoubleValue3;
                            b8b0Var.f = dDoubleValue3;
                            b8b0Var.I0(true);
                            dcb0 dcb0Var = (dcb0) b8b0Var.b;
                            if (dcb0Var != null) {
                                dcb0Var.B.setVisibility(8);
                            }
                            dcb0 dcb0Var2 = (dcb0) b8b0Var.b;
                            if (dcb0Var2 != null && dcb0Var2.A.getVisibility() == 0) {
                                b8b0Var.R = true;
                            }
                            dcb0 dcb0Var3 = (dcb0) b8b0Var.b;
                            if (dcb0Var3 != null) {
                                dcb0Var3.A.setVisibility(4);
                            }
                            dcb0 dcb0Var4 = (dcb0) b8b0Var.b;
                            if (dcb0Var4 != null) {
                                dcb0Var4.z.setVisibility(8);
                            }
                            int i2 = b8b0Var.M;
                            String str3 = str;
                            if (i2 == 1) {
                                String str4 = b8b0Var.C;
                                if (str4 != null && !StringsKt.U(str4)) {
                                    if (yju.a("br")) {
                                        b8b0Var.w0().y1(new PlaceBetRequest(str3, b8b0Var.Q, b8b0Var.C, null, null, b8b0Var.x0, null, 64, null), b8b0Var.getActivity());
                                    } else {
                                        di10.x1(b8b0Var.w0(), new PlaceBetRequest(str3, b8b0Var.Q, b8b0Var.C, null, null, b8b0Var.x0, null, 64, null));
                                    }
                                    FragmentManager parentFragmentManager = b8b0Var.getParentFragmentManager();
                                    parentFragmentManager.getClass();
                                    parentFragmentManager.a0();
                                }
                            } else {
                                dcb0 dcb0Var5 = (dcb0) b8b0Var.b;
                                if (dcb0Var5 != null) {
                                    dcb0Var5.S.setVisibility(8);
                                }
                                dcb0 dcb0Var6 = (dcb0) b8b0Var.b;
                                if (dcb0Var6 != null) {
                                    dcb0Var6.A.setVisibility(4);
                                }
                                dcb0 dcb0Var7 = (dcb0) b8b0Var.b;
                                if (dcb0Var7 != null) {
                                    dcb0Var7.i.setVisibility(8);
                                }
                                dcb0 dcb0Var8 = (dcb0) b8b0Var.b;
                                if (dcb0Var8 != null) {
                                    dcb0Var8.d.setVisibility(8);
                                }
                                dcb0 dcb0Var9 = (dcb0) b8b0Var.b;
                                if (dcb0Var9 != null) {
                                    dcb0Var9.c.setVisibility(8);
                                }
                                String str5 = b8b0Var.C;
                                if (str5 != null && !StringsKt.U(str5)) {
                                    Double dValueOf2 = null;
                                    if (yju.a("br")) {
                                        di10 di10VarW0 = b8b0Var.w0();
                                        String upperCase = str3.toUpperCase(Locale.ROOT);
                                        upperCase.getClass();
                                        double d6 = b8b0Var.Q;
                                        String str6 = b8b0Var.C;
                                        fm1 fm1Var5 = (fm1) b8b0Var.a;
                                        String giftId = (fm1Var5 == null || (sswVar12 = fm1Var5.d) == null || (dVarD8 = sswVar12.d()) == null) ? null : dVarD8.a.getGiftId();
                                        fm1 fm1Var6 = (fm1) b8b0Var.a;
                                        if (fm1Var6 != null && (sswVar11 = fm1Var6.d) != null && (dVarD7 = sswVar11.d()) != null) {
                                            dValueOf2 = Double.valueOf(dVarD7.b);
                                        }
                                        di10VarW0.y1(new PlaceBetRequest(upperCase, d6, str6, giftId, dValueOf2, b8b0Var.x0, null, 64, null), b8b0Var.getActivity());
                                    } else {
                                        di10 di10VarW1 = b8b0Var.w0();
                                        String upperCase2 = str3.toUpperCase(Locale.ROOT);
                                        upperCase2.getClass();
                                        double d7 = b8b0Var.Q;
                                        String str7 = b8b0Var.C;
                                        fm1 fm1Var7 = (fm1) b8b0Var.a;
                                        String giftId2 = (fm1Var7 == null || (sswVar10 = fm1Var7.d) == null || (dVarD6 = sswVar10.d()) == null) ? null : dVarD6.a.getGiftId();
                                        fm1 fm1Var8 = (fm1) b8b0Var.a;
                                        if (fm1Var8 != null && (sswVar9 = fm1Var8.d) != null && (dVarD5 = sswVar9.d()) != null) {
                                            dValueOf2 = Double.valueOf(dVarD5.b);
                                        }
                                        di10.x1(di10VarW1, new PlaceBetRequest(upperCase2, d7, str7, giftId2, dValueOf2, b8b0Var.x0, null, 64, null));
                                    }
                                    FragmentManager parentFragmentManager2 = b8b0Var.getParentFragmentManager();
                                    parentFragmentManager2.getClass();
                                    parentFragmentManager2.a0();
                                }
                            }
                        } else {
                            b8b0Var.H0();
                            b8b0Var.getParentFragmentManager().a0();
                        }
                        return Unit.a;
                    }
                }, new r6b0(), context.getColor(R.color.redblack_confirm_dialog_left_button), context.getColor(R.color.redblack_confirm_dialog_right_button), 12288);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.f(R.id.flContent, aVarA, null);
                aVar.c("");
                aVar.d();
                return;
            }
            if (this.C == null) {
                return;
            }
            fm1 fm1Var4 = (fm1) this.a;
            if (fm1Var4 != null && (sswVar5 = fm1Var4.b) != null && (d2 = sswVar5.d()) != null) {
                dDoubleValue = d2.doubleValue();
            }
            this.Q = dDoubleValue;
            this.f = dDoubleValue;
            I0(true);
            int i2 = this.M;
            B b2 = this.b;
            if (i2 == 1) {
                dcb0 dcb0Var = (dcb0) b2;
                if (dcb0Var != null) {
                    dcb0Var.B.setVisibility(8);
                }
                dcb0 dcb0Var2 = (dcb0) this.b;
                if (dcb0Var2 != null) {
                    dcb0Var2.A.setVisibility(4);
                }
                dcb0 dcb0Var3 = (dcb0) this.b;
                if (dcb0Var3 != null) {
                    dcb0Var3.z.setVisibility(8);
                }
                String str3 = this.C;
                if (str3 != null && !StringsKt.U(str3)) {
                    if ("br".equalsIgnoreCase(new SportyGamesManager().getSubCountry())) {
                        w0().y1(new PlaceBetRequest(str, this.Q, this.C, null, null, this.x0, null, 64, null), getActivity());
                        return;
                    } else {
                        di10.x1(w0(), new PlaceBetRequest(str, this.Q, this.C, null, null, this.x0, null, 64, null));
                        return;
                    }
                }
                return;
            }
            dcb0 dcb0Var4 = (dcb0) b2;
            if (dcb0Var4 != null) {
                dcb0Var4.B.setVisibility(8);
            }
            dcb0 dcb0Var5 = (dcb0) this.b;
            if (dcb0Var5 != null && dcb0Var5.A.getVisibility() == 0) {
                this.R = true;
            }
            dcb0 dcb0Var6 = (dcb0) this.b;
            if (dcb0Var6 != null) {
                dcb0Var6.A.setVisibility(4);
            }
            dcb0 dcb0Var7 = (dcb0) this.b;
            if (dcb0Var7 != null) {
                dcb0Var7.z.setVisibility(8);
            }
            dcb0 dcb0Var8 = (dcb0) this.b;
            if (dcb0Var8 != null) {
                dcb0Var8.S.setVisibility(8);
            }
            dcb0 dcb0Var9 = (dcb0) this.b;
            if (dcb0Var9 != null) {
                dcb0Var9.A.setVisibility(4);
            }
            dcb0 dcb0Var10 = (dcb0) this.b;
            if (dcb0Var10 != null) {
                dcb0Var10.i.setVisibility(8);
            }
            dcb0 dcb0Var11 = (dcb0) this.b;
            if (dcb0Var11 != null) {
                dcb0Var11.d.setVisibility(8);
            }
            dcb0 dcb0Var12 = (dcb0) this.b;
            if (dcb0Var12 != null) {
                dcb0Var12.c.setVisibility(8);
            }
            String str4 = this.C;
            if (str4 != null && !StringsKt.U(str4)) {
                if ("br".equalsIgnoreCase(new SportyGamesManager().getSubCountry())) {
                    di10 di10VarW0 = w0();
                    double d5 = this.Q;
                    String str5 = this.C;
                    fm1 fm1Var5 = (fm1) this.a;
                    String giftId = (fm1Var5 == null || (sswVar4 = fm1Var5.d) == null || (dVarD4 = sswVar4.d()) == null) ? null : dVarD4.a.getGiftId();
                    fm1 fm1Var6 = (fm1) this.a;
                    if (fm1Var6 != null && (sswVar3 = fm1Var6.d) != null && (dVarD3 = sswVar3.d()) != null) {
                        dValueOf = Double.valueOf(dVarD3.b);
                    }
                    di10VarW0.y1(new PlaceBetRequest(str, d5, str5, giftId, dValueOf, this.x0, null, 64, null), getActivity());
                    return;
                }
                di10 di10VarW1 = w0();
                double d6 = this.Q;
                String str6 = this.C;
                fm1 fm1Var7 = (fm1) this.a;
                String giftId2 = (fm1Var7 == null || (sswVar2 = fm1Var7.d) == null || (dVarD2 = sswVar2.d()) == null) ? null : dVarD2.a.getGiftId();
                fm1 fm1Var8 = (fm1) this.a;
                if (fm1Var8 != null && (sswVar = fm1Var8.d) != null && (dVarD = sswVar.d()) != null) {
                    dValueOf = Double.valueOf(dVarD.b);
                }
                di10.x1(di10VarW1, new PlaceBetRequest(str, d6, str6, giftId2, dValueOf, this.x0, null, 64, null));
            }
        } catch (Exception unused) {
        }
    }

    public final void q0() {
        dcb0 dcb0Var = (dcb0) this.b;
        if (dcb0Var != null) {
            dcb0Var.i.b(false);
        }
        dcb0 dcb0Var2 = (dcb0) this.b;
        if (dcb0Var2 != null) {
            dcb0Var2.F.setClickable(false);
        }
        dcb0 dcb0Var3 = (dcb0) this.b;
        if (dcb0Var3 != null) {
            dcb0Var3.C.setListener(false);
        }
        dcb0 dcb0Var4 = (dcb0) this.b;
        if (dcb0Var4 != null) {
            dcb0Var4.i.setEnabled(false);
        }
        dcb0 dcb0Var5 = (dcb0) this.b;
        if (dcb0Var5 != null) {
            dcb0Var5.d.setChipsClick(false);
        }
        dcb0 dcb0Var6 = (dcb0) this.b;
        if (dcb0Var6 != null) {
            dcb0Var6.b.setClickable(false);
        }
    }

    public final void r0() {
        dcb0 dcb0Var = (dcb0) this.b;
        if (dcb0Var != null) {
            dcb0Var.i.b(true);
        }
        dcb0 dcb0Var2 = (dcb0) this.b;
        if (dcb0Var2 != null) {
            dcb0Var2.F.setClickable(true);
        }
        dcb0 dcb0Var3 = (dcb0) this.b;
        if (dcb0Var3 != null) {
            dcb0Var3.C.setListener(true);
        }
        dcb0 dcb0Var4 = (dcb0) this.b;
        if (dcb0Var4 != null) {
            dcb0Var4.i.setEnabled(true);
        }
        dcb0 dcb0Var5 = (dcb0) this.b;
        if (dcb0Var5 != null) {
            dcb0Var5.d.setChipsClick(true);
        }
        dcb0 dcb0Var6 = (dcb0) this.b;
        if (dcb0Var6 != null) {
            dcb0Var6.b.setClickable(true);
        }
    }

    public final void s0() {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    public final void t0(String str) {
        Integer numValueOf;
        svg svgVar;
        String name;
        Integer id;
        try {
            if ((this.s0 || !this.o0) && str == null) {
                androidx.fragment.app.e activity = getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            int i2 = 1;
            if (this.n0 != null) {
                if (getContext() == null) {
                    numValueOf = null;
                } else {
                    List<GameDetails> list = this.n0;
                    if (list != null) {
                        GameDetails gameDetails = this.y;
                        int iIntValue = (gameDetails == null || (id = gameDetails.getId()) == null) ? 0 : id.intValue();
                        GameDetails gameDetails2 = this.y;
                        if (gameDetails2 == null || (name = gameDetails2.getName()) == null) {
                            name = "";
                        }
                        svgVar = new svg();
                        svgVar.c = list;
                        svgVar.d = Integer.valueOf(iIntValue);
                        svgVar.e = name;
                        svgVar.i = str;
                    } else {
                        svgVar = null;
                    }
                    androidx.fragment.app.e activity2 = getActivity();
                    if (activity2 != null) {
                        FragmentManager supportFragmentManager = activity2.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        if (svgVar != null) {
                            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                            aVar.f(R.id.flContent, svgVar, null);
                            aVar.c("CONFIRM_DIALOG_FRAGMENT");
                            numValueOf = Integer.valueOf(aVar.k(false, true));
                        } else {
                            numValueOf = null;
                        }
                    } else {
                        numValueOf = null;
                    }
                }
                if (numValueOf != null) {
                    return;
                }
            }
            q0();
            Context context = getContext();
            if (context != null) {
                if (str != null) {
                    xbg xbgVar = this.B;
                    if (xbgVar == null) {
                        Intrinsics.n("errorDialog");
                        throw null;
                    }
                    String string = getString(R.string.label_dialog_exit);
                    string.getClass();
                    xbg.c(xbgVar, str, string, new Function0() { // from class: q6b0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            e activity3 = this.a.getActivity();
                            if (activity3 == null) {
                                return null;
                            }
                            activity3.finish();
                            return Unit.a;
                        }
                    }, new x6b0(), context.getColor(R.color.try_again_color), 224);
                    xbgVar.a();
                    return;
                }
                if (this.J == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                op5 op5Var = op5.a;
                String string2 = getString(R.string.exit_confirm_msg_cms);
                string2.getClass();
                String string3 = getString(R.string.exit_text);
                string3.getClass();
                op5Var.getClass();
                String strB = op5.b(string2, string3, null);
                String string4 = getString(R.string.stay_btn_cms);
                string4.getClass();
                String string5 = getString(R.string.stay);
                string5.getClass();
                String strB2 = op5.b(string4, string5, null);
                String string6 = getString(R.string.exit_btn_cms);
                string6.getClass();
                String string7 = getString(R.string.label_dialog_exit);
                string7.getClass();
                this.d = com.sportygames.commons.components.a.C0437a.a("Spin da' Bottle", JsPluginCommon.GAMES_EXIT, strB, "", strB2, op5.b(string6, string7, null), new bxj(this, i2), new j6b0(), context.getColor(R.color.redblack_confirm_dialog_left_button), context.getColor(R.color.redblack_confirm_dialog_right_button), 4096);
                FragmentManager supportFragmentManager2 = requireActivity().getSupportFragmentManager();
                supportFragmentManager2.getClass();
                com.sportygames.commons.components.a aVar2 = this.d;
                if (aVar2 != null) {
                    androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager2);
                    aVar3.f(R.id.flContent, aVar2, null);
                    aVar3.c("CONFIRM_DIALOG_FRAGMENT");
                    aVar3.k(false, true);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final eu2 u0() {
        return (eu2) this.D.getValue();
    }

    public final fuj v0() {
        return (fuj) this.F.getValue();
    }

    public final di10 w0() {
        return (di10) this.K.getValue();
    }

    public final r530 y0() {
        return (r530) this.E.getValue();
    }

    public final void z0() {
        boolean z;
        boolean z2;
        int i2;
        Boolean boolValueOf;
        ArrayList arrayList;
        Integer numValueOf = Integer.valueOf(R.color.bottle_toggle_off_color);
        Integer numValueOf2 = Integer.valueOf(R.color.bottle_toggle_on_color);
        fm1 fm1Var = (fm1) this.a;
        if (fm1Var != null) {
            z = fm1Var.c;
            z2 = false;
        } else {
            z = false;
            z2 = false;
        }
        op5 op5Var = op5.a;
        String string = getString(R.string.music_cms);
        string.getClass();
        String string2 = getString(R.string.music_menu);
        string2.getClass();
        op5Var.getClass();
        String strB = op5.b(string, string2, null);
        MenuIconSize menuIconSize = new MenuIconSize(R.dimen._15sdp, R.dimen._12sdp);
        m7b0 m7b0Var = new m7b0();
        SharedPreferences sharedPreferences = this.Z;
        boolean z3 = z;
        LeftMenuButton leftMenuButton = new LeftMenuButton(0, strB, R.drawable.music, menuIconSize, m7b0Var, true, sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("SPIN_DA_BOTTLE_MUSIC", true)) : null, numValueOf2, numValueOf, null, false, new Function1() { // from class: n7b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                dcb0 dcb0Var;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                b8b0 b8b0Var = this.a;
                SharedPreferences.Editor editor = b8b0Var.X;
                if (zBooleanValue) {
                    if (editor != null) {
                        editor.putBoolean("SPIN_DA_BOTTLE_MUSIC", true);
                    }
                    SharedPreferences.Editor editor2 = b8b0Var.X;
                    if (editor2 != null) {
                        editor2.apply();
                    }
                    SharedPreferences sharedPreferences2 = b8b0Var.Z;
                    Boolean boolValueOf2 = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("SPIN_DA_BOTTLE_MUSIC", true)) : null;
                    SharedPreferences sharedPreferences3 = b8b0Var.Z;
                    Boolean boolValueOf3 = sharedPreferences3 != null ? Boolean.valueOf(sharedPreferences3.getBoolean("SPIN_DA_BOTTLE_SOUND", true)) : null;
                    Context context = b8b0Var.getContext();
                    if (context != null && (dcb0Var = (dcb0) b8b0Var.b) != null) {
                        ProgressMeterComponent progressMeterComponent = dcb0Var.M;
                        String string3 = b8b0Var.getString(R.string.bottle_name);
                        string3.getClass();
                        rk60.b bVar = rk60.b.e;
                        GameDetails gameDetails = b8b0Var.y;
                        ypa0 ypa0Var = b8b0Var.J;
                        if (ypa0Var == null) {
                            Intrinsics.n("soundViewModel");
                            throw null;
                        }
                        String string4 = b8b0Var.getString(R.string.bg_music);
                        string4.getClass();
                        progressMeterComponent.I("Bottle/", string3, boolValueOf3, bVar, gameDetails, context, ypa0Var, boolValueOf2, string4);
                    }
                } else {
                    if (editor != null) {
                        editor.putBoolean("SPIN_DA_BOTTLE_MUSIC", false);
                    }
                    if (((dcb0) b8b0Var.b) != null) {
                        ypa0 ypa0Var2 = b8b0Var.J;
                        if (ypa0Var2 == null) {
                            Intrinsics.n("soundViewModel");
                            throw null;
                        }
                        ypa0Var2.I1();
                    }
                }
                SharedPreferences.Editor editor3 = b8b0Var.X;
                if (editor3 != null) {
                    editor3.apply();
                }
                return Unit.a;
            }
        }, 1536, null);
        String string3 = getString(R.string.sound_cms);
        string3.getClass();
        String string4 = getString(R.string.sound_menu);
        string4.getClass();
        String strB2 = op5.b(string3, string4, null);
        MenuIconSize menuIconSize2 = new MenuIconSize(R.dimen._15sdp, R.dimen._12sdp);
        o7b0 o7b0Var = new o7b0();
        SharedPreferences sharedPreferences2 = this.Z;
        if (sharedPreferences2 != null) {
            i2 = 1;
            boolValueOf = Boolean.valueOf(sharedPreferences2.getBoolean("SPIN_DA_BOTTLE_SOUND", true));
        } else {
            i2 = 1;
            boolValueOf = null;
        }
        LeftMenuButton leftMenuButton2 = new LeftMenuButton(0, strB2, R.drawable.ic_sound, menuIconSize2, o7b0Var, true, boolValueOf, numValueOf2, numValueOf, null, false, new ru1(this, i2), 1536, null);
        String string5 = getString(R.string.one_tap_bet_cms);
        string5.getClass();
        String string6 = getString(R.string.onetap_bet_menu);
        string6.getClass();
        String strB3 = op5.b(string5, string6, null);
        MenuIconSize menuIconSize3 = new MenuIconSize(R.dimen._15sdp, R.dimen._10sdp);
        gif gifVar = new gif(1);
        SharedPreferences sharedPreferences3 = this.Z;
        LeftMenuButton leftMenuButton3 = new LeftMenuButton(0, strB3, R.drawable.ic_one_tap_bet, menuIconSize3, gifVar, true, sharedPreferences3 != null ? Boolean.valueOf(sharedPreferences3.getBoolean("SPIN_DA_BOTTLE_ONE_TAP", false)) : null, numValueOf2, numValueOf, null, false, new fr60(this, 1), 1536, null);
        String string7 = getString(R.string.how_to_play_nav_cms);
        string7.getClass();
        String string8 = getString(R.string.how_to_play_menu);
        string8.getClass();
        LeftMenuButton leftMenuButton4 = new LeftMenuButton(0, op5.b(string7, string8, null), R.drawable.ic_how_to_play, new MenuIconSize(R.dimen._13sdp, R.dimen._13sdp), new Function0() { // from class: p7b0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                b8b0 b8b0Var = this.a;
                if (!(b8b0Var.requireActivity().getSupportFragmentManager().G(R.id.flContent) instanceof a)) {
                    y7b0 y7b0Var = new y7b0();
                    Context context = b8b0Var.getContext();
                    if (context != null) {
                        pfd pfdVar = fse.a;
                        ej5.c(w5b.a(gku.a), null, null, new k8b0(context, b8b0Var, y7b0Var, false, null), 3);
                    }
                }
                return Unit.a;
            }
        }, false, null, null, null, null, false, null, 3072, null);
        String string9 = getString(R.string.bet_history_cms);
        string9.getClass();
        String string10 = getString(R.string.bethistory_menu);
        string10.getClass();
        ArrayList arrayListL = kotlin.collections.b.l(leftMenuButton, leftMenuButton2, leftMenuButton3, leftMenuButton4, new LeftMenuButton(0, op5.b(string9, string10, null), R.drawable.ic_bethistory, new MenuIconSize(R.dimen._17sdp, R.dimen._17sdp), new z1b(this, 1), false, null, null, null, null, false, null, 3072, null));
        if (z3) {
            String string11 = getString(R.string.special_theme_cms);
            string11.getClass();
            String string12 = getString(R.string.special_theme_cms);
            string12.getClass();
            String strB4 = op5.b(string11, string12, null);
            MenuIconSize menuIconSize4 = new MenuIconSize(R.dimen._15sdp, R.dimen._12sdp);
            q7b0 q7b0Var = new q7b0();
            SharedPreferences sharedPreferences4 = this.Z;
            arrayList = arrayListL;
            arrayList.add(3, new LeftMenuButton(0, strB4, R.drawable.brush, menuIconSize4, q7b0Var, true, Boolean.valueOf(sharedPreferences4 != null ? sharedPreferences4.getBoolean("SPIN_DA_BOTTLE_SPECIAL_THEME", true) : true), numValueOf2, numValueOf, null, false, new Function1() { // from class: r7b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    b8b0 b8b0Var = this.a;
                    SharedPreferences.Editor editor = b8b0Var.X;
                    if (editor != null) {
                        editor.putBoolean("SPIN_DA_BOTTLE_SPECIAL_THEME", zBooleanValue);
                    }
                    SharedPreferences.Editor editor2 = b8b0Var.X;
                    if (editor2 != null) {
                        editor2.apply();
                    }
                    wz.a(zBooleanValue ? "spin_da_bottle_special_theme_on" : "spin_da_bottle_special_theme_off", b8b0Var.getString(R.string.bottle_name), new String[0]);
                    dcb0 dcb0Var = (dcb0) b8b0Var.b;
                    if (dcb0Var != null) {
                        dcb0Var.y.d();
                    }
                    if (((dcb0) b8b0Var.b) != null) {
                        ypa0 ypa0Var = b8b0Var.J;
                        if (ypa0Var == null) {
                            Intrinsics.n("soundViewModel");
                            throw null;
                        }
                        ypa0Var.I1();
                    }
                    b8b0Var.C0();
                    b8b0Var.F0();
                    return Unit.a;
                }
            }, 1536, null));
        } else {
            arrayList = arrayListL;
        }
        dcb0 dcb0Var = (dcb0) this.b;
        if (dcb0Var != null) {
            SGHamburgerMenu sGHamburgerMenu = dcb0Var.F;
            ypa0 ypa0Var = this.J;
            if (ypa0Var == null) {
                Intrinsics.n("soundViewModel");
                throw 0;
            }
            SGHamburgerMenu.b bVar = new SGHamburgerMenu.b(ypa0Var, R.string.bottle_name, this.z, this.A, arrayList, new c1b(this, 2), new mu1(1), "", null);
            androidx.fragment.app.e eVarRequireActivity = requireActivity();
            eVarRequireActivity.getClass();
            SGHamburgerMenu.setup$default(sGHamburgerMenu, bVar, eVarRequireActivity, false, null, null, 28, null);
        }
        dcb0 dcb0Var2 = (dcb0) this.b;
        if (dcb0Var2 != null) {
            dcb0Var2.F.setBottleImage();
        }
        dcb0 dcb0Var3 = (dcb0) this.b;
        if (dcb0Var3 != null) {
            dcb0Var3.F.setSDBBottomImage();
        }
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void d0() {
    }
}
