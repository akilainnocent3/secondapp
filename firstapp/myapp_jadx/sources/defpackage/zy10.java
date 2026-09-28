package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
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
import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.commons.components.a;
import com.sportygames.commons.models.GPSData;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.LeftMenuButton;
import com.sportygames.commons.models.MenuIconSize;
import com.sportygames.commons.models.NetworkStateManager;
import com.sportygames.commons.models.OnboardingItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.utils.CasinoLogger;
import com.sportygames.commons.viewmodels.FbgData;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.crash.components.header.DepositTooltipComponent;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.remote.models.LobbyMetaInfo;
import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;
import com.sportygames.pocketrocket.component.BetContainer;
import com.sportygames.pocketrocket.component.MultiplierContainer;
import com.sportygames.pocketrocket.component.PrAllUserBet;
import com.sportygames.pocketrocket.component.PrHeaderContainer;
import com.sportygames.pocketrocket.component.PrTopWin;
import com.sportygames.pocketrocket.component.PrUserBet;
import com.sportygames.pocketrocket.model.request.CashoutLayoutForChat;
import com.sportygames.pocketrocket.model.request.CashoutRequest;
import com.sportygames.pocketrocket.model.request.PlaceBetRequest;
import com.sportygames.pocketrocket.model.response.ActiveRoomResponse;
import com.sportygames.pocketrocket.model.response.BetDetails;
import com.sportygames.pocketrocket.model.response.DetailResponse;
import com.sportygames.pocketrocket.model.response.GameSocektResponse;
import com.sportygames.pocketrocket.model.response.RoundBetResponse;
import com.sportygames.pocketrocket.model.response.WalletInfo;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import com.sportygames.sportyherov2.components.SHToastContainer;
import com.sportygames.sportyherov2.utils.HeaderPayload;
import com.twilio.voice.Constants;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lzy10;", "Landroidx/fragment/app/Fragment;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "Lbb;", "", "Lzh40$a;", "Lxjj;", "<init>", "()V", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zy10 extends Fragment implements GameMainActivity.b, bb, zh40.a, xjj {
    public boolean A0;
    public boolean A1;
    public GameDetails B;
    public String B0;
    public final q8i0 C;
    public tb5 C0;
    public final q8i0 D;
    public long D0;
    public final q8i0 E;
    public boolean E0;
    public String F;
    public final CashoutLayoutForChat F0;
    public String G;
    public final ArrayList G0;
    public String H;
    public boolean H0;
    public int I;
    public GameSocektResponse I0;
    public boolean J;
    public svg J0;
    public Double K;
    public GPSData K0;
    public double L;
    public boolean L0;
    public List<DetailResponse> M;
    public mke M0;
    public boolean N;
    public final boolean N0;
    public long O;
    public z66 O0;
    public long P;
    public boolean P0;
    public GameSocektResponse Q;
    public boolean Q0;
    public boolean R;
    public final yj2 R0;
    public boolean S;
    public final yj2 S0;
    public int T;
    public final yj2 T0;
    public int U;
    public final q8i0 U0;
    public boolean V;
    public final q8i0 V0;
    public boolean W;
    public int W0;
    public int X;
    public int X0;
    public boolean Y;
    public final ytw<Double> Y0;
    public boolean Z;
    public final ytw<Double> Z0;
    public long a0;
    public final ytw<Double> a1;
    public zt50 b;
    public long b0;
    public final ytw<Double> b1;
    public long c0;
    public final ytw<Boolean> c1;
    public boolean d;
    public boolean d0;
    public final ytw<Boolean> d1;
    public boolean e;
    public boolean e0;
    public final ytw<Boolean> e1;
    public boolean f;
    public boolean f0;
    public int f1;
    public pj60 g0;
    public boolean g1;
    public a920 h0;
    public boolean h1;
    public boolean i;
    public hy50 i0;
    public String i1;
    public nle j0;
    public xi60 j1;
    public String k0;
    public String k1;
    public PromotionGiftsResponse l0;
    public String l1;
    public ArrayList<GameDetails> m0;
    public oh60 m1;
    public FragmentManager n0;
    public final q8i0 n1;
    public String o0;
    public long o1;
    public boolean p0;
    public boolean p1;
    public boolean q0;
    public boolean q1;
    public a r0;
    public int r1;
    public ArrayList<GiftItem> s0;
    public String s1;
    public int t0;
    public String t1;
    public final int u0;
    public Long u1;
    public tb5 v;
    public final int v0;
    public boolean v1;
    public SharedPreferences w;
    public final int w0;
    public boolean w1;
    public final j1b x0;
    public boolean x1;
    public SharedPreferences.Editor y;
    public xbg y0;
    public boolean y1;
    public fq5 z;
    public boolean z0;
    public boolean z1;
    public final ttr a = hwr.a(a1s.a, new s());
    public final ArrayList<String> c = kotlin.collections.b.f("sg_pocket_rockets", "sg_common_dialog_message", "sg_chat", "sg_fbg_dialog", "sg_ham_menu", "sg_input_dialog", "sg_bethistory", "sg_common", "sg_exit_dialog", "sg_game_common", "currency_symbols", "sg_onboarding", "common_functions", "sg_campaign");
    public final String A = "sg_pocket_rockets";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes7.dex */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("NONE", 0);
            a = aVar;
            a aVar2 = new a("CHAT", 1);
            b = aVar2;
            a aVar3 = new a("BET_HISTORY", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ z a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(z zVar) {
            super(0);
            this.a = zVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a aVar = a.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a aVar2 = a.a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Status.values().length];
            try {
                iArr2[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Status.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr2;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c implements View.OnLayoutChangeListener {
        public final /* synthetic */ l8j0 b;
        public final /* synthetic */ PrHeaderContainer c;

        public c(l8j0 l8j0Var, PrHeaderContainer prHeaderContainer) {
            this.b = l8j0Var;
            this.c = prHeaderContainer;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9;
            view.removeOnLayoutChangeListener(this);
            zy10 zy10Var = zy10.this;
            if (zy10Var.h1 || view.getHeight() <= 0 || (i9 = this.b.a.g(1).b) <= 0) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = view.getHeight() + i9;
            view.setLayoutParams(layoutParams2);
            ConstraintLayout constraintLayout = this.c.getBinding().a;
            constraintLayout.getClass();
            constraintLayout.setPadding(constraintLayout.getPaddingLeft(), i9, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
            zt50 zt50Var = zy10Var.b;
            if (zt50Var != null) {
                zt50Var.J.E(i9);
            }
            zy10Var.o0(i9);
            zy10Var.h1 = true;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(ttr ttrVar) {
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

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.pocketrocket.views.PocketRocketFragment$autoCashOutToast$2", f = "PocketRocketFragment.kt", l = {1232, 1234}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zy10.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        
            if (defpackage.hkd.b(3000, r7) == r0) goto L18;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r7.a
                zy10 r2 = defpackage.zy10.this
                r3 = 3000(0xbb8, double:1.482E-320)
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L1f
                if (r1 == r6) goto L1b
                if (r1 != r5) goto L14
                defpackage.uj50.b(r8)
                goto L3d
            L14:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L1b:
                defpackage.uj50.b(r8)
                goto L2b
            L1f:
                defpackage.uj50.b(r8)
                r7.a = r6
                java.lang.Object r8 = defpackage.hkd.b(r3, r7)
                if (r8 != r0) goto L2b
                goto L3c
            L2b:
                zt50 r8 = r2.b
                if (r8 == 0) goto L34
                com.sportygames.sportyherov2.components.SHToastContainer r8 = r8.V
                r8.setFadeOut()
            L34:
                r7.a = r5
                java.lang.Object r7 = defpackage.hkd.b(r3, r7)
                if (r7 != r0) goto L3d
            L3c:
                return r0
            L3d:
                zt50 r7 = r2.b
                if (r7 == 0) goto L48
                com.sportygames.sportyherov2.components.SHToastContainer r7 = r7.V
                r8 = 8
                r7.setVisibility(r8)
            L48:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: zy10.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class d0 extends qlr implements Function0<Fragment> {
        public d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return zy10.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.pocketrocket.views.PocketRocketFragment$callWalletApi$1", f = "PocketRocketFragment.kt", l = {5545}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zy10.this.new e(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            zy10 zy10Var = zy10.this;
            if (i == 0) {
                uj50.b(obj);
                zy10Var.q1 = true;
                this.a = 1;
                if (hkd.b(5000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            zy10Var.b1().y1();
            zy10Var.q1 = false;
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class e0 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? zy10.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.pocketrocket.views.PocketRocketFragment$handleUserData$11", f = "PocketRocketFragment.kt", l = {3629, 3631}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zp40 c;
        public final /* synthetic */ RoundBetResponse d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(zp40 zp40Var, RoundBetResponse roundBetResponse, v1b<? super f> v1bVar) {
            super(2, v1bVar);
            this.c = zp40Var;
            this.d = roundBetResponse;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zy10.this.new f(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        
            if (r1.u1(0, r4, r7.d, r7) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            if (r1.D1(0, r4, r7.d, r7) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        
            return r0;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r7.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L18
                if (r1 == r3) goto L14
                if (r1 != r2) goto Ld
                goto L14
            Ld:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L14:
                defpackage.uj50.b(r8)
                goto L41
            L18:
                defpackage.uj50.b(r8)
                zy10 r1 = defpackage.zy10.this
                boolean r8 = r1.d0
                zp40 r4 = r7.c
                double r4 = r4.a
                if (r8 == 0) goto L33
                r7.a = r3
                r2 = 0
                r3 = r4
                com.sportygames.pocketrocket.model.response.RoundBetResponse r5 = r7.d
                r6 = r7
                java.lang.Object r7 = r1.u1(r2, r3, r5, r6)
                if (r7 != r0) goto L41
                goto L40
            L33:
                r6 = r7
                r3 = r4
                r6.a = r2
                r2 = 0
                com.sportygames.pocketrocket.model.response.RoundBetResponse r5 = r6.d
                java.lang.Object r7 = r1.D1(r2, r3, r5, r6)
                if (r7 != r0) goto L41
            L40:
                return r0
            L41:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: zy10.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class f0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ d0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(d0 d0Var) {
            super(0);
            this.a = d0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.pocketrocket.views.PocketRocketFragment$handleUserData$13", f = "PocketRocketFragment.kt", l = {3671, 3673}, m = "invokeSuspend", v = 1)
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zp40 c;
        public final /* synthetic */ RoundBetResponse d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(zp40 zp40Var, RoundBetResponse roundBetResponse, v1b<? super g> v1bVar) {
            super(2, v1bVar);
            this.c = zp40Var;
            this.d = roundBetResponse;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zy10.this.new g(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        
            if (r1.u1(0, r4, r7.d, r7) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            if (r1.D1(1, r4, r7.d, r7) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        
            return r0;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r7.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L18
                if (r1 == r3) goto L14
                if (r1 != r2) goto Ld
                goto L14
            Ld:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L14:
                defpackage.uj50.b(r8)
                goto L41
            L18:
                defpackage.uj50.b(r8)
                zy10 r1 = defpackage.zy10.this
                boolean r8 = r1.d0
                zp40 r4 = r7.c
                double r4 = r4.a
                if (r8 == 0) goto L33
                r7.a = r3
                r2 = 0
                r3 = r4
                com.sportygames.pocketrocket.model.response.RoundBetResponse r5 = r7.d
                r6 = r7
                java.lang.Object r7 = r1.u1(r2, r3, r5, r6)
                if (r7 != r0) goto L41
                goto L40
            L33:
                r6 = r7
                r3 = r4
                r6.a = r2
                r2 = 1
                com.sportygames.pocketrocket.model.response.RoundBetResponse r5 = r6.d
                java.lang.Object r7 = r1.D1(r2, r3, r5, r6)
                if (r7 != r0) goto L41
            L40:
                return r0
            L41:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: zy10.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class g0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.pocketrocket.views.PocketRocketFragment$handleUserData$15", f = "PocketRocketFragment.kt", l = {3713, 3715}, m = "invokeSuspend", v = 1)
    public static final class h extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zp40 c;
        public final /* synthetic */ RoundBetResponse d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(zp40 zp40Var, RoundBetResponse roundBetResponse, v1b<? super h> v1bVar) {
            super(2, v1bVar);
            this.c = zp40Var;
            this.d = roundBetResponse;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return zy10.this.new h(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((h) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        
            if (r1.u1(1, r4, r7.d, r7) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        
            if (r1.D1(2, r4, r7.d, r7) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        
            return r0;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r7.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L18
                if (r1 == r3) goto L14
                if (r1 != r2) goto Ld
                goto L14
            Ld:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L14:
                defpackage.uj50.b(r8)
                goto L41
            L18:
                defpackage.uj50.b(r8)
                zy10 r1 = defpackage.zy10.this
                boolean r8 = r1.d0
                zp40 r4 = r7.c
                double r4 = r4.a
                if (r8 == 0) goto L33
                r7.a = r3
                r2 = 1
                r3 = r4
                com.sportygames.pocketrocket.model.response.RoundBetResponse r5 = r7.d
                r6 = r7
                java.lang.Object r7 = r1.u1(r2, r3, r5, r6)
                if (r7 != r0) goto L41
                goto L40
            L33:
                r6 = r7
                r3 = r4
                r6.a = r2
                r2 = 2
                com.sportygames.pocketrocket.model.response.RoundBetResponse r5 = r6.d
                java.lang.Object r7 = r1.D1(r2, r3, r5, r6)
                if (r7 != r0) goto L41
            L40:
                return r0
            L41:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: zy10.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class h0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(ttr ttrVar) {
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

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class i extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((zy10) this.receiver).x1();
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class i0 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? zy10.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.pocketrocket.views.PocketRocketFragment$onViewCreated$10$1", f = "PocketRocketFragment.kt", l = {6847, 564}, m = "invokeSuspend", v = 1)
    public static final class j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public wf40 a;
        public c77 b;
        public int c;
        public int d;
        public int e;
        public int f;
        public final /* synthetic */ tb5 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(tb5 tb5Var, v1b v1bVar) {
            super(2, v1bVar);
            this.i = tb5Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new j(this.i, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0054  */
        /* JADX WARN: Code duplicated, block: B:21:0x0055  */
        /* JADX WARN: Code duplicated, block: B:24:0x0063 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x0017, B:18:0x0042, B:22:0x005b, B:24:0x0063, B:27:0x007c, B:14:0x0031, B:17:0x003a), top: B:36:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x007c A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x0017, B:18:0x0042, B:22:0x005b, B:24:0x0063, B:27:0x007c, B:14:0x0031, B:17:0x003a), top: B:36:0x0007 }] */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        
            if (r11.join(r10) == r0) goto L26;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0079 -> B:8:0x001a). Please report as a decompilation issue!!! */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r10.f
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L35
                if (r1 == r3) goto L27
                if (r1 != r2) goto L21
                int r1 = r10.e
                int r5 = r10.d
                int r6 = r10.c
                c77 r7 = r10.b
                wf40 r8 = r10.a
                defpackage.uj50.b(r11)     // Catch: java.lang.Throwable -> L1f
            L1a:
                r11 = r6
                r6 = r1
                r1 = r11
                r11 = r7
                goto L42
            L1f:
                r10 = move-exception
                goto L84
            L21:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r10)
                return r4
            L27:
                int r1 = r10.e
                int r5 = r10.d
                int r6 = r10.c
                c77 r7 = r10.b
                wf40 r8 = r10.a
                defpackage.uj50.b(r11)     // Catch: java.lang.Throwable -> L1f
                goto L5b
            L35:
                defpackage.uj50.b(r11)
                tb5 r8 = r10.i
                tb5$a r11 = new tb5$a     // Catch: java.lang.Throwable -> L1f
                r11.<init>()     // Catch: java.lang.Throwable -> L1f
                r1 = 0
                r5 = r1
                r6 = r5
            L42:
                r10.a = r8     // Catch: java.lang.Throwable -> L1f
                r10.b = r11     // Catch: java.lang.Throwable -> L1f
                r10.c = r1     // Catch: java.lang.Throwable -> L1f
                r10.d = r5     // Catch: java.lang.Throwable -> L1f
                r10.e = r6     // Catch: java.lang.Throwable -> L1f
                r10.f = r3     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r7 = r11.b(r10)     // Catch: java.lang.Throwable -> L1f
                if (r7 != r0) goto L55
                goto L7b
            L55:
                r9 = r7
                r7 = r11
                r11 = r9
                r9 = r6
                r6 = r1
                r1 = r9
            L5b:
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1f
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1f
                if (r11 == 0) goto L7c
                java.lang.Object r11 = r7.next()     // Catch: java.lang.Throwable -> L1f
                c9p r11 = (defpackage.c9p) r11     // Catch: java.lang.Throwable -> L1f
                r10.a = r8     // Catch: java.lang.Throwable -> L1f
                r10.b = r7     // Catch: java.lang.Throwable -> L1f
                r10.c = r6     // Catch: java.lang.Throwable -> L1f
                r10.d = r5     // Catch: java.lang.Throwable -> L1f
                r10.e = r1     // Catch: java.lang.Throwable -> L1f
                r10.f = r2     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r11 = r11.join(r10)     // Catch: java.lang.Throwable -> L1f
                if (r11 != r0) goto L1a
            L7b:
                return r0
            L7c:
                kotlin.Unit r10 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L1f
                r8.cancel(r4)
                kotlin.Unit r10 = kotlin.Unit.a
                return r10
            L84:
                throw r10     // Catch: java.lang.Throwable -> L85
            L85:
                r11 = move-exception
                defpackage.ry60.a(r8, r10)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: zy10.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class j0 extends qlr implements Function0<Fragment> {
        public j0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return zy10.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.pocketrocket.views.PocketRocketFragment$onViewCreated$5$1", f = "PocketRocketFragment.kt", l = {6847, 506}, m = "invokeSuspend", v = 1)
    public static final class k extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public wf40 a;
        public c77 b;
        public int c;
        public int d;
        public int e;
        public int f;
        public final /* synthetic */ tb5 i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(tb5 tb5Var, v1b v1bVar) {
            super(2, v1bVar);
            this.i = tb5Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new k(this.i, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((k) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0054  */
        /* JADX WARN: Code duplicated, block: B:21:0x0055  */
        /* JADX WARN: Code duplicated, block: B:24:0x0063 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x0017, B:18:0x0042, B:22:0x005b, B:24:0x0063, B:27:0x007c, B:14:0x0031, B:17:0x003a), top: B:36:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x007c A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x0017, B:18:0x0042, B:22:0x005b, B:24:0x0063, B:27:0x007c, B:14:0x0031, B:17:0x003a), top: B:36:0x0007 }] */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        
            if (r11.join(r10) == r0) goto L26;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0079 -> B:8:0x001a). Please report as a decompilation issue!!! */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r10.f
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L35
                if (r1 == r3) goto L27
                if (r1 != r2) goto L21
                int r1 = r10.e
                int r5 = r10.d
                int r6 = r10.c
                c77 r7 = r10.b
                wf40 r8 = r10.a
                defpackage.uj50.b(r11)     // Catch: java.lang.Throwable -> L1f
            L1a:
                r11 = r6
                r6 = r1
                r1 = r11
                r11 = r7
                goto L42
            L1f:
                r10 = move-exception
                goto L84
            L21:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r10)
                return r4
            L27:
                int r1 = r10.e
                int r5 = r10.d
                int r6 = r10.c
                c77 r7 = r10.b
                wf40 r8 = r10.a
                defpackage.uj50.b(r11)     // Catch: java.lang.Throwable -> L1f
                goto L5b
            L35:
                defpackage.uj50.b(r11)
                tb5 r8 = r10.i
                tb5$a r11 = new tb5$a     // Catch: java.lang.Throwable -> L1f
                r11.<init>()     // Catch: java.lang.Throwable -> L1f
                r1 = 0
                r5 = r1
                r6 = r5
            L42:
                r10.a = r8     // Catch: java.lang.Throwable -> L1f
                r10.b = r11     // Catch: java.lang.Throwable -> L1f
                r10.c = r1     // Catch: java.lang.Throwable -> L1f
                r10.d = r5     // Catch: java.lang.Throwable -> L1f
                r10.e = r6     // Catch: java.lang.Throwable -> L1f
                r10.f = r3     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r7 = r11.b(r10)     // Catch: java.lang.Throwable -> L1f
                if (r7 != r0) goto L55
                goto L7b
            L55:
                r9 = r7
                r7 = r11
                r11 = r9
                r9 = r6
                r6 = r1
                r1 = r9
            L5b:
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1f
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1f
                if (r11 == 0) goto L7c
                java.lang.Object r11 = r7.next()     // Catch: java.lang.Throwable -> L1f
                c9p r11 = (defpackage.c9p) r11     // Catch: java.lang.Throwable -> L1f
                r10.a = r8     // Catch: java.lang.Throwable -> L1f
                r10.b = r7     // Catch: java.lang.Throwable -> L1f
                r10.c = r6     // Catch: java.lang.Throwable -> L1f
                r10.d = r5     // Catch: java.lang.Throwable -> L1f
                r10.e = r1     // Catch: java.lang.Throwable -> L1f
                r10.f = r2     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r11 = r11.join(r10)     // Catch: java.lang.Throwable -> L1f
                if (r11 != r0) goto L1a
            L7b:
                return r0
            L7c:
                kotlin.Unit r10 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L1f
                r8.cancel(r4)
                kotlin.Unit r10 = kotlin.Unit.a
                return r10
            L84:
                throw r10     // Catch: java.lang.Throwable -> L85
            L85:
                r11 = move-exception
                defpackage.ry60.a(r8, r10)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: zy10.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class k0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ j0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(j0 j0Var) {
            super(0);
            this.a = j0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class l implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public l(Function1 function1) {
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

    /* JADX INFO: loaded from: classes7.dex */
    public static final class l0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class m extends qlr implements Function0<v8i0> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return zy10.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class m0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(ttr ttrVar) {
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

    /* JADX INFO: loaded from: classes7.dex */
    public static final class n extends qlr implements Function0<cyb> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return zy10.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class o extends qlr implements Function0<r8i0.c> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return zy10.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class p extends qlr implements Function0<v8i0> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return zy10.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class q extends qlr implements Function0<cyb> {
        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return zy10.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class r extends qlr implements Function0<r8i0.c> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return zy10.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class s implements Function0<l1z> {
        public s() {
        }

        /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, l1z] */
        /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, l1z] */
        @Override // kotlin.jvm.functions.Function0
        public final l1z invoke() {
            bb bbVar = zy10.this;
            return bbVar instanceof rrp ? ((rrp) bbVar).j().a(jq40.a(l1z.class), null, null) : sjj.b().c.d.a(jq40.a(l1z.class), null, null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? zy10.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class u extends qlr implements Function0<Fragment> {
        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return zy10.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
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

    /* JADX INFO: loaded from: classes7.dex */
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

    /* JADX INFO: loaded from: classes7.dex */
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

    /* JADX INFO: loaded from: classes7.dex */
    public static final class y extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? zy10.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class z extends qlr implements Function0<Fragment> {
        public z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return zy10.this;
        }
    }

    public zy10() {
        d0 d0Var = new d0();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new f0(d0Var));
        this.C = new q8i0(jq40.a(ypa0.class), new g0(ttrVarA), new i0(ttrVarA), new h0(ttrVarA));
        ttr ttrVarA2 = hwr.a(a1sVar, new k0(new j0()));
        this.D = new q8i0(jq40.a(eoa0.class), new l0(ttrVarA2), new t(ttrVarA2), new m0(ttrVarA2));
        ttr ttrVarA3 = hwr.a(a1sVar, new v(new u()));
        this.E = new q8i0(jq40.a(fn1.class), new w(ttrVarA3), new y(ttrVarA3), new x(ttrVarA3));
        this.F = "";
        this.G = "";
        this.H = "";
        this.k0 = "en";
        this.o0 = "en";
        this.r0 = a.a;
        this.s0 = new ArrayList<>();
        this.u0 = 1;
        this.v0 = 2;
        this.w0 = 3;
        pfd pfdVar = fse.a;
        this.x0 = w5b.a(gku.a);
        this.z0 = true;
        this.B0 = "All Bets";
        this.F0 = new CashoutLayoutForChat();
        this.G0 = new ArrayList();
        this.N0 = yju.a("br");
        this.R0 = new yj2();
        this.S0 = new yj2();
        this.T0 = new yj2();
        this.U0 = new q8i0(jq40.a(fuj.class), new m(), new o(), new n());
        this.V0 = new q8i0(jq40.a(db6.class), new p(), new r(), new q());
        this.Y0 = androidx.compose.runtime.i.a(0.0d);
        this.Z0 = androidx.compose.runtime.i.a(0.0d);
        this.a1 = androidx.compose.runtime.i.a(0.0d);
        this.b1 = androidx.compose.runtime.i.a(0.0d);
        Boolean bool = Boolean.FALSE;
        this.c1 = androidx.compose.runtime.m.b(bool);
        this.d1 = androidx.compose.runtime.m.b(bool);
        this.e1 = androidx.compose.runtime.m.b(bool);
        this.i1 = "";
        this.k1 = "";
        this.l1 = "";
        ttr ttrVarA4 = hwr.a(a1sVar, new a0(new z()));
        this.n1 = new q8i0(jq40.a(au2.class), new b0(ttrVarA4), new e0(ttrVarA4), new c0(ttrVarA4));
        this.p1 = true;
        this.s1 = "";
        this.t1 = "";
    }

    public static BigDecimal E0(double d2, double d3) {
        BigDecimal scale = BigDecimal.valueOf(d2 * d3).setScale(2, RoundingMode.HALF_UP);
        scale.getClass();
        return scale;
    }

    public static void f1(BetContainer betContainer) {
        if (Intrinsics.c(betContainer != null ? Double.valueOf(betContainer.getCashoutCoeff()) : null, 0.0d)) {
            betContainer.getBinding().z.setText("1.01");
            betContainer.getBinding().A.setClickable(true);
            betContainer.getBinding().A.setAlpha(1.0f);
        }
    }

    public static final void n0(zy10 zy10Var, l8j0 l8j0Var, PrHeaderContainer prHeaderContainer) {
        int i2;
        if (!prHeaderContainer.isLaidOut() || prHeaderContainer.isLayoutRequested()) {
            prHeaderContainer.addOnLayoutChangeListener(zy10Var.new c(l8j0Var, prHeaderContainer));
            return;
        }
        if (zy10Var.h1 || prHeaderContainer.getHeight() <= 0 || (i2 = l8j0Var.a.g(1).b) <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = prHeaderContainer.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = prHeaderContainer.getHeight() + i2;
        prHeaderContainer.setLayoutParams(layoutParams2);
        ConstraintLayout constraintLayout = prHeaderContainer.getBinding().a;
        constraintLayout.getClass();
        constraintLayout.setPadding(constraintLayout.getPaddingLeft(), i2, constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
        zt50 zt50Var = zy10Var.b;
        if (zt50Var != null) {
            zt50Var.J.E(i2);
        }
        zy10Var.o0(i2);
        zy10Var.h1 = true;
    }

    public static final void p0(int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin += i2;
        view.setLayoutParams(layoutParams2);
    }

    public static void t1(BetContainer betContainer) {
        nk2 binding;
        CharSequence text;
        if (betContainer == null || (binding = betContainer.getBinding()) == null || (text = binding.z.getText()) == null || text.length() != 0) {
            return;
        }
        betContainer.setCashoutAmount(Double.parseDouble("5"));
        betContainer.f();
    }

    public static /* synthetic */ void z0(zy10 zy10Var) {
        int i2 = 1;
        zy10Var.y0(new ln0(i2), new mn0(i2), new sv10(), false);
    }

    public final void A1(BetContainer betContainer) {
        betContainer.setEnableContainer(new Function0() { // from class: qw10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.a.P0();
                return Unit.a;
            }
        });
        betContainer.getBinding().C.setVisibility(0);
        betContainer.getBinding().W.setVisibility(0);
        betContainer.getBinding().Y.setVisibility(0);
        betContainer.getBinding().v.setVisibility(8);
        betContainer.getBinding().p0.setVisibility(8);
    }

    public final void B1() {
        oh60 oh60Var = this.m1;
        int i2 = 1;
        if (oh60Var == null || !oh60Var.isShowing()) {
            if (!U0().b.e()) {
                U0().b.f(getViewLifecycleOwner(), new l(new ffj(this, i2)));
            }
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                final oh60 oh60Var2 = new oh60(activity);
                oh60Var2.z = new tw10(this);
                oh60Var2.A = new uw10(this);
                Window window = oh60Var2.getWindow();
                WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                if (attributes != null) {
                    attributes.gravity = 17;
                }
                if (attributes != null) {
                    attributes.flags &= -5;
                }
                Window window2 = oh60Var2.getWindow();
                if (window2 != null) {
                    window2.setAttributes(attributes);
                }
                Window window3 = oh60Var2.getWindow();
                if (window3 != null) {
                    window3.setBackgroundDrawableResource(R.color.dialog_bg_color);
                }
                oh60Var2.show();
                Window window4 = oh60Var2.getWindow();
                if (window4 != null) {
                    window4.setLayout(-1, -1);
                }
                String str = this.l1;
                String str2 = this.k1;
                str.getClass();
                str2.getClass();
                klz klzVar = new klz();
                klzVar.e = activity;
                klzVar.f = str;
                klzVar.i = str2;
                RecyclerView recyclerViewB = oh60Var2.b();
                oh60Var2.getContext();
                recyclerViewB.setLayoutManager(new LinearLayoutManager());
                sh6 sh6Var = new sh6(oh60Var2, i2);
                Function0<Unit> function0 = new Function0() { // from class: nh60
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        oh60 oh60Var3 = oh60Var2;
                        if (oh60Var3.E == oh60.a.b) {
                            uw10 uw10Var = oh60Var3.A;
                            if (uw10Var == null) {
                                Intrinsics.n("betHistoryArchiveFetchManager");
                                throw null;
                            }
                            uw10Var.invoke(Integer.valueOf(oh60Var3.C + oh60Var3.B), Integer.valueOf(oh60Var3.B));
                        }
                        return Unit.a;
                    }
                };
                klzVar.b = sh6Var;
                klzVar.c = function0;
                oh60Var2.b().setAdapter(klzVar);
                tw10 tw10Var = oh60Var2.z;
                if (tw10Var == null) {
                    Intrinsics.n("betHistoryFetchManager");
                    throw null;
                }
                tw10Var.invoke(Integer.valueOf(oh60Var2.C + oh60Var2.B), Integer.valueOf(oh60Var2.B));
                this.m1 = oh60Var2;
            }
            oh60 oh60Var3 = this.m1;
            if (oh60Var3 != null) {
                oh60Var3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ww10
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        oh60 oh60Var4 = this.a.m1;
                        if (oh60Var4 != null) {
                            oh60Var4.a();
                        }
                    }
                });
            }
        }
    }

    public final void C0(BetContainer betContainer) {
        nk2 binding;
        nk2 binding2;
        nk2 binding3;
        nk2 binding4;
        nk2 binding5;
        if (betContainer != null && (binding5 = betContainer.getBinding()) != null) {
            binding5.C.setVisibility(8);
        }
        if (betContainer != null && (binding4 = betContainer.getBinding()) != null) {
            binding4.W.setVisibility(8);
        }
        if (betContainer != null && (binding3 = betContainer.getBinding()) != null) {
            binding3.Y.setVisibility(8);
        }
        if (betContainer != null && (binding2 = betContainer.getBinding()) != null) {
            binding2.v.setVisibility(0);
        }
        if (betContainer != null && (binding = betContainer.getBinding()) != null) {
            binding.p0.setVisibility(8);
        }
        GameDetails gameDetails = this.B;
        wz.a("BetCanceled", gameDetails != null ? gameDetails.getName() : null, "bet");
    }

    public final void C1() {
        boolean z2;
        try {
            z2 = this.o1 != 0 && System.currentTimeMillis() - this.o1 < 30000;
            this.o1 = System.currentTimeMillis();
        } catch (Exception e2) {
            e2.printStackTrace();
            z2 = false;
        }
        if (z2) {
            return;
        }
        try {
            zt50 zt50Var = this.b;
            if (zt50Var != null) {
                zt50Var.I.setCampaignCompletedText();
            }
            zt50 zt50Var2 = this.b;
            if (zt50Var2 != null) {
                zt50Var2.I.setVisibility(0);
            }
            zt50 zt50Var3 = this.b;
            if (zt50Var3 != null) {
                zt50Var3.I.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_fade_out_toast));
            }
            ej5.c(ebs.a(getLifecycle()), null, null, new uz10(this, null), 3);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public final Object D0(TextView textView, double d2, String str, tje0 tje0Var) {
        tb5 tb5Var = this.v;
        if (tb5Var == null) {
            return Unit.a;
        }
        nas nasVarA = ebs.a(getLifecycle());
        pfd pfdVar = fse.a;
        Object objJ = tb5Var.j(tje0Var, ej5.b(nasVarA, gku.a, a6b.b, new cz10(d2, textView, str, this, null)));
        return objJ == y5b.a ? objJ : Unit.a;
    }

    public final Object D1(int i2, double d2, RoundBetResponse roundBetResponse, tje0 tje0Var) {
        tb5 tb5Var = this.C0;
        if (tb5Var == null) {
            return Unit.a;
        }
        nas nasVarA = ebs.a(getLifecycle());
        pfd pfdVar = fse.a;
        Object objJ = tb5Var.j(tje0Var, ej5.b(nasVarA, gku.a, a6b.b, new vz10(d2, i2, null, this, roundBetResponse)));
        return objJ == y5b.a ? objJ : Unit.a;
    }

    public final void E1(boolean z2, Function0<Unit> function0) {
        Context context = getContext();
        if (context != null) {
            GameDetails gameDetails = this.B;
            nle nleVar = new nle(context, gameDetails != null ? gameDetails.getName() : null, Integer.valueOf(context.getColor(R.color.htp_pocket_rocket_bg)), null, function0, 8);
            this.j0 = nleVar;
            nleVar.show();
            GameDetails gameDetails2 = this.B;
            if (z2) {
                wz.a("PaytableCheck", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
            } else {
                wz.a("HTPClicked", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
            }
        }
    }

    public final void F0(BetContainer betContainer, String str, String str2) {
        long betId = betContainer.getBetId();
        long roundId = betContainer.getRoundId();
        Boolean bool = Boolean.FALSE;
        CashoutRequest cashoutRequest = new CashoutRequest(betId, roundId, str, bool, bool, str2, this.P0);
        betContainer.getBinding().A.setClickable(false);
        betContainer.getBinding().A.setAlpha(0.65f);
        betContainer.setCashoutInProgress(true);
        final String strJ = new eal().j(cashoutRequest);
        Z0().D1(strJ, Long.valueOf(betContainer.getRoundId()), Long.valueOf(betContainer.getBetId()), new Function0() { // from class: tv10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                zy10 zy10Var = this.a;
                cgb.a(zy10Var.Y0(), zy10Var.A, "cashout", strJ);
                return Unit.a;
            }
        });
        GameDetails gameDetails = this.B;
        wz.a("CashoutClicked", gameDetails != null ? gameDetails.getName() : null, str2);
        j1(true);
    }

    public final void F1() {
        this.d0 = false;
        H0();
        Boolean bool = Boolean.FALSE;
        ((x5a0) this.d1).setValue(bool);
        ((x5a0) this.c1).setValue(bool);
        ((x5a0) this.e1).setValue(bool);
        this.p0 = true;
    }

    public final void G0(String str) {
        GameDetails gameDetails = this.B;
        wz.a(str, gameDetails != null ? gameDetails.getName() : null, "bet");
    }

    public final void G1() {
        zt50 zt50Var;
        if (this.J || (zt50Var = this.b) == null) {
            return;
        }
        zt50Var.Q.O(100);
    }

    public final void H0() {
        FragmentManager supportFragmentManager;
        nk2 binding;
        nk2 binding2;
        nk2 binding3;
        nle nleVar;
        nk2 binding4;
        nk2 binding5;
        nk2 binding6;
        nk2 binding7;
        nk2 binding8;
        nk2 binding9;
        nk2 binding10;
        nk2 binding11;
        nk2 binding12;
        nk2 binding13;
        nk2 binding14;
        nk2 binding15;
        nk2 binding16;
        nk2 binding17;
        nk2 binding18;
        nk2 binding19;
        nk2 binding20;
        nk2 binding21;
        nk2 binding22;
        nk2 binding23;
        nk2 binding24;
        nk2 binding25;
        nk2 binding26;
        nk2 binding27;
        nk2 binding28;
        nk2 binding29;
        nk2 binding30;
        nk2 binding31;
        nk2 binding32;
        nk2 binding33;
        nk2 binding34;
        nk2 binding35;
        nk2 binding36;
        nk2 binding37;
        c920 binding38;
        nk2 binding39;
        c920 binding40;
        nk2 binding41;
        c920 binding42;
        nk2 binding43;
        nk2 binding44;
        nk2 binding45;
        nk2 binding46;
        nk2 binding47;
        nk2 binding48;
        try {
            if (!this.d0) {
                zt50 zt50Var = this.b;
                if (zt50Var != null) {
                    zt50Var.M.e();
                }
                Z0().x1();
                ema emaVar = Z0().a;
                if (emaVar != null) {
                    emaVar.dispose();
                }
                this.z0 = false;
                this.W = false;
                this.S = false;
                this.Z = false;
                zt50 zt50Var2 = this.b;
                if (zt50Var2 != null && (binding48 = zt50Var2.S.getBinding()) != null) {
                    binding48.f.setStatus(false);
                }
                zt50 zt50Var3 = this.b;
                if (zt50Var3 != null && (binding47 = zt50Var3.z.getBinding()) != null) {
                    binding47.f.setStatus(false);
                }
                zt50 zt50Var4 = this.b;
                if (zt50Var4 != null && (binding46 = zt50Var4.R.getBinding()) != null) {
                    binding46.f.setStatus(false);
                }
                zt50 zt50Var5 = this.b;
                if (zt50Var5 != null && (binding45 = zt50Var5.S.getBinding()) != null) {
                    binding45.d.setStatus(false);
                }
                zt50 zt50Var6 = this.b;
                if (zt50Var6 != null && (binding44 = zt50Var6.z.getBinding()) != null) {
                    binding44.d.setStatus(false);
                }
                zt50 zt50Var7 = this.b;
                if (zt50Var7 != null && (binding43 = zt50Var7.R.getBinding()) != null) {
                    binding43.d.setStatus(false);
                }
                zt50 zt50Var8 = this.b;
                if (zt50Var8 != null && (binding41 = zt50Var8.S.getBinding()) != null && (binding42 = binding41.d.getBinding()) != null) {
                    binding42.b.setText("");
                }
                zt50 zt50Var9 = this.b;
                if (zt50Var9 != null && (binding39 = zt50Var9.z.getBinding()) != null && (binding40 = binding39.d.getBinding()) != null) {
                    binding40.b.setText("");
                }
                zt50 zt50Var10 = this.b;
                if (zt50Var10 != null && (binding37 = zt50Var10.R.getBinding()) != null && (binding38 = binding37.d.getBinding()) != null) {
                    binding38.b.setText("");
                }
                zt50 zt50Var11 = this.b;
                if (zt50Var11 != null && (binding36 = zt50Var11.S.getBinding()) != null) {
                    binding36.B.setVisibility(8);
                }
                zt50 zt50Var12 = this.b;
                if (zt50Var12 != null && (binding35 = zt50Var12.R.getBinding()) != null) {
                    binding35.B.setVisibility(8);
                }
                zt50 zt50Var13 = this.b;
                if (zt50Var13 != null && (binding34 = zt50Var13.z.getBinding()) != null) {
                    binding34.B.setVisibility(8);
                }
                zt50 zt50Var14 = this.b;
                if (zt50Var14 != null && (binding33 = zt50Var14.R.getBinding()) != null) {
                    binding33.C.setVisibility(8);
                }
                zt50 zt50Var15 = this.b;
                if (zt50Var15 != null && (binding32 = zt50Var15.R.getBinding()) != null) {
                    binding32.W.setVisibility(8);
                }
                zt50 zt50Var16 = this.b;
                if (zt50Var16 != null && (binding31 = zt50Var16.R.getBinding()) != null) {
                    binding31.Y.setVisibility(8);
                }
                zt50 zt50Var17 = this.b;
                if (zt50Var17 != null && (binding30 = zt50Var17.S.getBinding()) != null) {
                    binding30.C.setVisibility(8);
                }
                zt50 zt50Var18 = this.b;
                if (zt50Var18 != null && (binding29 = zt50Var18.S.getBinding()) != null) {
                    binding29.W.setVisibility(8);
                }
                zt50 zt50Var19 = this.b;
                if (zt50Var19 != null && (binding28 = zt50Var19.S.getBinding()) != null) {
                    binding28.Y.setVisibility(8);
                }
                zt50 zt50Var20 = this.b;
                if (zt50Var20 != null && (binding27 = zt50Var20.z.getBinding()) != null) {
                    binding27.C.setVisibility(8);
                }
                zt50 zt50Var21 = this.b;
                if (zt50Var21 != null && (binding26 = zt50Var21.z.getBinding()) != null) {
                    binding26.W.setVisibility(8);
                }
                zt50 zt50Var22 = this.b;
                if (zt50Var22 != null && (binding25 = zt50Var22.z.getBinding()) != null) {
                    binding25.Y.setVisibility(8);
                }
                zt50 zt50Var23 = this.b;
                if (zt50Var23 != null && (binding24 = zt50Var23.S.getBinding()) != null) {
                    binding24.A.setVisibility(8);
                }
                zt50 zt50Var24 = this.b;
                if (zt50Var24 != null && (binding23 = zt50Var24.R.getBinding()) != null) {
                    binding23.A.setVisibility(8);
                }
                zt50 zt50Var25 = this.b;
                if (zt50Var25 != null && (binding22 = zt50Var25.z.getBinding()) != null) {
                    binding22.A.setVisibility(8);
                }
                zt50 zt50Var26 = this.b;
                if (zt50Var26 != null && (binding21 = zt50Var26.S.getBinding()) != null) {
                    binding21.p0.setVisibility(8);
                }
                zt50 zt50Var27 = this.b;
                if (zt50Var27 != null && (binding20 = zt50Var27.R.getBinding()) != null) {
                    binding20.p0.setVisibility(8);
                }
                zt50 zt50Var28 = this.b;
                if (zt50Var28 != null && (binding19 = zt50Var28.z.getBinding()) != null) {
                    binding19.p0.setVisibility(8);
                }
                zt50 zt50Var29 = this.b;
                if (zt50Var29 != null && (binding18 = zt50Var29.z.getBinding()) != null) {
                    binding18.v.setVisibility(0);
                }
                zt50 zt50Var30 = this.b;
                if (zt50Var30 != null && (binding17 = zt50Var30.z.getBinding()) != null) {
                    binding17.v.setClickable(false);
                }
                zt50 zt50Var31 = this.b;
                if (zt50Var31 != null && (binding16 = zt50Var31.S.getBinding()) != null) {
                    binding16.v.setVisibility(0);
                }
                zt50 zt50Var32 = this.b;
                if (zt50Var32 != null && (binding15 = zt50Var32.S.getBinding()) != null) {
                    binding15.v.setClickable(false);
                }
                zt50 zt50Var33 = this.b;
                if (zt50Var33 != null && (binding14 = zt50Var33.R.getBinding()) != null) {
                    binding14.v.setVisibility(0);
                }
                zt50 zt50Var34 = this.b;
                if (zt50Var34 != null && (binding13 = zt50Var34.R.getBinding()) != null) {
                    binding13.v.setClickable(false);
                }
                zt50 zt50Var35 = this.b;
                if (zt50Var35 != null) {
                    zt50Var35.S.setCashoutDone(false);
                }
                zt50 zt50Var36 = this.b;
                if (zt50Var36 != null) {
                    zt50Var36.z.setCashoutDone(false);
                }
                zt50 zt50Var37 = this.b;
                if (zt50Var37 != null) {
                    zt50Var37.R.setCashoutDone(false);
                }
                this.f = false;
                this.e = false;
                this.i = false;
                zt50 zt50Var38 = this.b;
                if (zt50Var38 != null && (binding12 = zt50Var38.S.getBinding()) != null) {
                    binding12.z.setText("5");
                }
                zt50 zt50Var39 = this.b;
                if (zt50Var39 != null && (binding11 = zt50Var39.R.getBinding()) != null) {
                    binding11.z.setText("5");
                }
                zt50 zt50Var40 = this.b;
                if (zt50Var40 != null && (binding10 = zt50Var40.z.getBinding()) != null) {
                    binding10.z.setText("5");
                }
                this.R = false;
                this.Y = false;
                this.V = false;
                zt50 zt50Var41 = this.b;
                if (zt50Var41 != null) {
                    zt50Var41.S.setAutoBetPlace(false);
                }
                zt50 zt50Var42 = this.b;
                if (zt50Var42 != null) {
                    zt50Var42.R.setAutoBetPlace(false);
                }
                zt50 zt50Var43 = this.b;
                if (zt50Var43 != null) {
                    zt50Var43.z.setAutoBetPlace(false);
                }
                this.E0 = true;
                this.X = 0;
                this.T = 0;
                this.U = 0;
                zt50 zt50Var44 = this.b;
                if (zt50Var44 != null) {
                    zt50Var44.S.setGiftItem(null);
                }
                zt50 zt50Var45 = this.b;
                if (zt50Var45 != null) {
                    zt50Var45.R.setGiftItem(null);
                }
                zt50 zt50Var46 = this.b;
                if (zt50Var46 != null) {
                    zt50Var46.z.setGiftItem(null);
                }
                zt50 zt50Var47 = this.b;
                if (zt50Var47 != null) {
                    zt50Var47.S.c();
                }
                zt50 zt50Var48 = this.b;
                if (zt50Var48 != null) {
                    zt50Var48.R.c();
                }
                zt50 zt50Var49 = this.b;
                if (zt50Var49 != null) {
                    zt50Var49.z.c();
                }
                zt50 zt50Var50 = this.b;
                if (zt50Var50 != null && (binding9 = zt50Var50.S.getBinding()) != null) {
                    binding9.v.setAlpha(1.0f);
                }
                zt50 zt50Var51 = this.b;
                if (zt50Var51 != null && (binding8 = zt50Var51.R.getBinding()) != null) {
                    binding8.v.setAlpha(1.0f);
                }
                zt50 zt50Var52 = this.b;
                if (zt50Var52 != null && (binding7 = zt50Var52.z.getBinding()) != null) {
                    binding7.v.setAlpha(1.0f);
                }
                zt50 zt50Var53 = this.b;
                if (zt50Var53 != null && (binding6 = zt50Var53.S.getBinding()) != null) {
                    binding6.A.setAlpha(1.0f);
                }
                zt50 zt50Var54 = this.b;
                if (zt50Var54 != null && (binding5 = zt50Var54.R.getBinding()) != null) {
                    binding5.A.setAlpha(1.0f);
                }
                zt50 zt50Var55 = this.b;
                if (zt50Var55 != null && (binding4 = zt50Var55.z.getBinding()) != null) {
                    binding4.A.setAlpha(1.0f);
                }
                zt50 zt50Var56 = this.b;
                if (zt50Var56 != null) {
                    zt50Var56.F.d();
                }
                km60 km60Var = rlz.d.a;
                if (km60Var != null) {
                    km60Var.dismiss();
                }
                zt50 zt50Var57 = this.b;
                if (zt50Var57 != null) {
                    zt50Var57.y.setVisibility(8);
                }
                zt50 zt50Var58 = this.b;
                if (zt50Var58 != null) {
                    zt50Var58.e.setVisibility(8);
                }
                zt50 zt50Var59 = this.b;
                if (zt50Var59 != null) {
                    zt50Var59.Z.setVisibility(8);
                }
                zt50 zt50Var60 = this.b;
                if (zt50Var60 != null) {
                    zt50Var60.X.setVisibility(8);
                }
                zt50 zt50Var61 = this.b;
                if (zt50Var61 != null) {
                    zt50Var61.N.setEnabled(true);
                }
                zt50 zt50Var62 = this.b;
                if (zt50Var62 != null) {
                    zt50Var62.b.setEnabled(true);
                }
                zt50 zt50Var63 = this.b;
                if (zt50Var63 != null) {
                    zt50Var63.Y.setEnabled(true);
                }
                zt50 zt50Var64 = this.b;
                if (zt50Var64 != null) {
                    zt50Var64.f.setVisibility(8);
                }
                zt50 zt50Var65 = this.b;
                if (zt50Var65 != null) {
                    zt50Var65.M.setVisibility(8);
                }
                zt50 zt50Var66 = this.b;
                if (zt50Var66 != null) {
                    zt50Var66.T.setVisibility(8);
                }
                zt50 zt50Var67 = this.b;
                if (zt50Var67 != null) {
                    zt50Var67.L.setVisibility(8);
                }
                zt50 zt50Var68 = this.b;
                if (zt50Var68 != null) {
                    zt50Var68.K.setVisibility(8);
                }
                a1().I1();
                a920 a920Var = this.h0;
                if (a920Var != null) {
                    a920Var.dismiss();
                }
                hy50 hy50Var = this.i0;
                if (hy50Var != null) {
                    hy50Var.dismiss();
                }
                pj60 pj60Var = this.g0;
                if (pj60Var != null) {
                    pj60Var.dismiss();
                }
                if (!kotlin.text.c.l("br", new SportyGamesManager().getSubCountry(), true) && (nleVar = this.j0) != null) {
                    nleVar.dismiss();
                }
                oh60 oh60Var = this.m1;
                if (oh60Var != null) {
                    oh60Var.dismiss();
                }
                this.E0 = true;
                zt50 zt50Var69 = this.b;
                if (zt50Var69 != null && (binding3 = zt50Var69.S.getBinding()) != null) {
                    binding3.i.setEnabled(false);
                }
                zt50 zt50Var70 = this.b;
                if (zt50Var70 != null && (binding2 = zt50Var70.R.getBinding()) != null) {
                    binding2.i.setEnabled(false);
                }
                zt50 zt50Var71 = this.b;
                if (zt50Var71 != null && (binding = zt50Var71.z.getBinding()) != null) {
                    binding.i.setEnabled(false);
                }
                zt50 zt50Var72 = this.b;
                if (zt50Var72 != null) {
                    zt50Var72.S.setCashoutInProgress(false);
                }
                zt50 zt50Var73 = this.b;
                if (zt50Var73 != null) {
                    zt50Var73.R.setCashoutInProgress(false);
                }
                zt50 zt50Var74 = this.b;
                if (zt50Var74 != null) {
                    zt50Var74.z.setCashoutInProgress(false);
                }
                eoa0 eoa0VarZ0 = Z0();
                eoa0VarZ0.B.clear();
                eoa0VarZ0.C.clear();
            }
            zt50 zt50Var75 = this.b;
            if (zt50Var75 != null) {
                zt50Var75.W.setVisibility(8);
            }
            a1().I1();
            androidx.fragment.app.e activity = getActivity();
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                return;
            }
            supportFragmentManager.a0();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void I() {
    }

    public final void I0(BetContainer betContainer, boolean z2, DetailResponse detailResponse, String str, String str2) {
        PlaceBetRequest placeBetRequest;
        if (this.M != null && betContainer != null && !betContainer.getBetPlaced() && !betContainer.getBetInProgress() && this.O > 0) {
            betContainer.getBinding().v.setAlpha(0.65f);
            boolean z3 = false;
            betContainer.getBinding().v.setClickable(false);
            Double dValueOf = z2 ? Double.valueOf(betContainer.getCashoutCoeff()) : null;
            String currency = detailResponse.getCurrency();
            if (currency != null) {
                String rocketType = detailResponse.getRocketType();
                long j2 = this.O;
                GiftItem giftItem = betContainer.getGiftItem();
                placeBetRequest = new PlaceBetRequest(str, rocketType, currency, j2, giftItem != null ? giftItem.getGiftId() : null, betContainer.getGiftAmount(), dValueOf, this.P0, this.K0);
            } else {
                placeBetRequest = null;
            }
            final String strJ = new eal().j(placeBetRequest);
            Z0().E1(this.O, strJ, detailResponse.getRocketType(), new Function0() { // from class: jv10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    zy10 zy10Var = this.a;
                    cgb.a(zy10Var.Y0(), zy10Var.A, "placeBet", strJ);
                    return Unit.a;
                }
            });
            betContainer.setBetInProgress(true);
            O0();
            SharedPreferences sharedPreferences = this.w;
            if (sharedPreferences != null && sharedPreferences.getBoolean("ROCKET_SOUND", true)) {
                ypa0 ypa0VarA1 = a1();
                String string = getString(R.string.place_bet);
                string.getClass();
                ypa0VarA1.A1(0L, string);
            }
            betContainer.getBinding().C.setVisibility(8);
            betContainer.getBinding().W.setVisibility(8);
            betContainer.getBinding().Y.setVisibility(8);
            betContainer.getBinding().v.setVisibility(0);
            betContainer.getBinding().p0.setVisibility(8);
            O0();
            GiftItem giftItem2 = betContainer.getGiftItem();
            if ((giftItem2 != null ? giftItem2.getGiftId() : null) != null) {
                z3 = true;
            }
            GiftItem giftItem3 = betContainer.getGiftItem();
            v0(str, str2, z3, true, false, (giftItem3 != null ? giftItem3.getGiftId() : null) != null);
        }
        e1();
    }

    public final void J0() {
        zt50 zt50Var = this.b;
        if (zt50Var != null) {
            PrHeaderContainer prHeaderContainer = zt50Var.K;
            prHeaderContainer.binding.d.setClickable(false);
            prHeaderContainer.binding.y.setClickable(false);
        }
        zt50 zt50Var2 = this.b;
        if (zt50Var2 != null) {
            zt50Var2.S.setDisableContainer();
        }
        zt50 zt50Var3 = this.b;
        if (zt50Var3 != null) {
            zt50Var3.z.setDisableContainer();
        }
        zt50 zt50Var4 = this.b;
        if (zt50Var4 != null) {
            zt50Var4.R.setDisableContainer();
        }
    }

    public final void K0() {
        nk2 binding;
        nk2 binding2;
        nk2 binding3;
        nk2 binding4;
        nk2 binding5;
        nk2 binding6;
        zt50 zt50Var = this.b;
        if (zt50Var != null && (binding6 = zt50Var.S.getBinding()) != null) {
            binding6.F.setAlpha(0.3f);
        }
        zt50 zt50Var2 = this.b;
        if (zt50Var2 != null && (binding5 = zt50Var2.R.getBinding()) != null) {
            binding5.F.setAlpha(0.3f);
        }
        zt50 zt50Var3 = this.b;
        if (zt50Var3 != null && (binding4 = zt50Var3.z.getBinding()) != null) {
            binding4.F.setAlpha(0.3f);
        }
        zt50 zt50Var4 = this.b;
        if (zt50Var4 != null && (binding3 = zt50Var4.z.getBinding()) != null) {
            gr60.a(binding3.F, new Function1() { // from class: lv10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((View) obj).getClass();
                    this.a.L0();
                    return Unit.a;
                }
            });
        }
        zt50 zt50Var5 = this.b;
        if (zt50Var5 != null && (binding2 = zt50Var5.S.getBinding()) != null) {
            gr60.a(binding2.F, new Function1() { // from class: mv10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((View) obj).getClass();
                    this.a.L0();
                    return Unit.a;
                }
            });
        }
        zt50 zt50Var6 = this.b;
        if (zt50Var6 == null || (binding = zt50Var6.R.getBinding()) == null) {
            return;
        }
        gr60.a(binding.F, new q8a(this, 1));
    }

    public final void L0() {
        op5 op5Var = op5.a;
        String string = getString(R.string.fbg_one_gift_usage_allowed_msg_cms);
        string.getClass();
        String string2 = getString(R.string.one_gift_allowed);
        string2.getClass();
        op5Var.getClass();
        String strB = op5.b(string, string2, null);
        zt50 zt50Var = this.b;
        if (zt50Var != null) {
            zt50Var.V.k(ebs.a(getLifecycle()), strB, 2000L);
        }
    }

    public final void M0(BetContainer betContainer) {
        nk2 binding;
        nk2 binding2;
        nk2 binding3;
        Context context = getContext();
        if (context != null) {
            betContainer.getBinding().v.setVisibility(0);
            betContainer.getBinding().A.setVisibility(8);
            betContainer.getBinding().v.setBackground(context.getDrawable(R.drawable.bet_button_sh));
            betContainer.setEnableContainer(new pw10(this, 0));
            op5 op5Var = op5.a;
            zt50 zt50Var = this.b;
            TextView textView = (zt50Var == null || (binding3 = zt50Var.S.getBinding()) == null) ? null : binding3.w;
            zt50 zt50Var2 = this.b;
            TextView textView2 = (zt50Var2 == null || (binding2 = zt50Var2.R.getBinding()) == null) ? null : binding2.w;
            zt50 zt50Var3 = this.b;
            op5.r(op5Var, kotlin.collections.b.f(textView, textView2, (zt50Var3 == null || (binding = zt50Var3.z.getBinding()) == null) ? null : binding.w), null, 4);
            betContainer.getBinding().p0.setVisibility(8);
            betContainer.getBinding().y.setBackground(context.getDrawable(R.drawable.bets_placed_background));
        }
    }

    public final void N0() {
        zt50 zt50Var = this.b;
        int i2 = 1;
        if (zt50Var != null) {
            PrHeaderContainer prHeaderContainer = zt50Var.K;
            prHeaderContainer.binding.d.setClickable(true);
            prHeaderContainer.binding.y.setClickable(true);
        }
        if (this.M != null) {
            zt50 zt50Var2 = this.b;
            if (zt50Var2 != null) {
                zt50Var2.S.setEnableContainer(new sfe(this, i2));
            }
            zt50 zt50Var3 = this.b;
            if (zt50Var3 != null) {
                zt50Var3.z.setEnableContainer(new j7a(this, 2));
            }
            zt50 zt50Var4 = this.b;
            if (zt50Var4 != null) {
                zt50Var4.R.setEnableContainer(new qu10(this, 0));
            }
        }
    }

    public final void O0() {
        nk2 binding;
        nk2 binding2;
        nk2 binding3;
        nk2 binding4;
        nk2 binding5;
        nk2 binding6;
        nk2 binding7;
        nk2 binding8;
        nk2 binding9;
        nk2 binding10;
        nk2 binding11;
        nk2 binding12;
        nk2 binding13;
        nk2 binding14;
        nk2 binding15;
        nk2 binding16;
        nk2 binding17;
        nk2 binding18;
        nk2 binding19;
        nk2 binding20;
        nk2 binding21;
        zt50 zt50Var = this.b;
        if (zt50Var == null || (binding19 = zt50Var.S.getBinding()) == null || binding19.p0.getVisibility() != 0) {
            zt50 zt50Var2 = this.b;
            if (zt50Var2 == null || (binding3 = zt50Var2.S.getBinding()) == null || binding3.A.getVisibility() != 0) {
                zt50 zt50Var3 = this.b;
                if (zt50Var3 != null && (binding2 = zt50Var3.S.getBinding()) != null) {
                    binding2.f.setAlpha(1.0f);
                }
                zt50 zt50Var4 = this.b;
                if (zt50Var4 != null && (binding = zt50Var4.S.getBinding()) != null) {
                    binding.B.setAlpha(1.0f);
                }
            } else {
                zt50 zt50Var5 = this.b;
                if (zt50Var5 != null && (binding4 = zt50Var5.S.getBinding()) != null) {
                    binding4.f.setAlpha(0.5f);
                }
            }
        } else {
            zt50 zt50Var6 = this.b;
            if (zt50Var6 != null && (binding21 = zt50Var6.S.getBinding()) != null) {
                binding21.f.setAlpha(0.5f);
            }
            zt50 zt50Var7 = this.b;
            if (zt50Var7 != null && (binding20 = zt50Var7.S.getBinding()) != null) {
                binding20.B.setAlpha(0.7f);
            }
        }
        zt50 zt50Var8 = this.b;
        if (zt50Var8 == null || (binding16 = zt50Var8.R.getBinding()) == null || binding16.p0.getVisibility() != 0) {
            zt50 zt50Var9 = this.b;
            if (zt50Var9 == null || (binding7 = zt50Var9.R.getBinding()) == null || binding7.A.getVisibility() != 0) {
                zt50 zt50Var10 = this.b;
                if (zt50Var10 != null && (binding6 = zt50Var10.R.getBinding()) != null) {
                    binding6.f.setAlpha(1.0f);
                }
                zt50 zt50Var11 = this.b;
                if (zt50Var11 != null && (binding5 = zt50Var11.R.getBinding()) != null) {
                    binding5.B.setAlpha(1.0f);
                }
            } else {
                zt50 zt50Var12 = this.b;
                if (zt50Var12 != null && (binding8 = zt50Var12.R.getBinding()) != null) {
                    binding8.f.setAlpha(0.5f);
                }
            }
        } else {
            zt50 zt50Var13 = this.b;
            if (zt50Var13 != null && (binding18 = zt50Var13.R.getBinding()) != null) {
                binding18.f.setAlpha(0.5f);
            }
            zt50 zt50Var14 = this.b;
            if (zt50Var14 != null && (binding17 = zt50Var14.R.getBinding()) != null) {
                binding17.B.setAlpha(0.7f);
            }
        }
        zt50 zt50Var15 = this.b;
        if (zt50Var15 != null && (binding13 = zt50Var15.z.getBinding()) != null && binding13.p0.getVisibility() == 0) {
            zt50 zt50Var16 = this.b;
            if (zt50Var16 != null && (binding15 = zt50Var16.z.getBinding()) != null) {
                binding15.f.setAlpha(0.5f);
            }
            zt50 zt50Var17 = this.b;
            if (zt50Var17 == null || (binding14 = zt50Var17.z.getBinding()) == null) {
                return;
            }
            binding14.B.setAlpha(0.7f);
            return;
        }
        zt50 zt50Var18 = this.b;
        if (zt50Var18 != null && (binding11 = zt50Var18.z.getBinding()) != null && binding11.A.getVisibility() == 0) {
            zt50 zt50Var19 = this.b;
            if (zt50Var19 == null || (binding12 = zt50Var19.z.getBinding()) == null) {
                return;
            }
            binding12.f.setAlpha(0.5f);
            return;
        }
        zt50 zt50Var20 = this.b;
        if (zt50Var20 != null && (binding10 = zt50Var20.z.getBinding()) != null) {
            binding10.f.setAlpha(1.0f);
        }
        zt50 zt50Var21 = this.b;
        if (zt50Var21 == null || (binding9 = zt50Var21.z.getBinding()) == null) {
            return;
        }
        binding9.B.setAlpha(1.0f);
    }

    public final void P0() {
        zt50 zt50Var;
        nk2 binding;
        zt50 zt50Var2;
        nk2 binding2;
        zt50 zt50Var3;
        nk2 binding3;
        zt50 zt50Var4 = this.b;
        if ((zt50Var4 != null ? zt50Var4.S.getGiftItem() : null) == null) {
            zt50 zt50Var5 = this.b;
            if ((zt50Var5 != null ? zt50Var5.R.getGiftItem() : null) == null) {
                zt50 zt50Var6 = this.b;
                if ((zt50Var6 != null ? zt50Var6.z.getGiftItem() : null) != null) {
                    return;
                }
                zt50 zt50Var7 = this.b;
                if (zt50Var7 != null && !zt50Var7.S.getBetPlaced() && (zt50Var3 = this.b) != null && (binding3 = zt50Var3.S.getBinding()) != null) {
                    binding3.F.setAlpha(1.0f);
                }
                zt50 zt50Var8 = this.b;
                if (zt50Var8 != null && !zt50Var8.R.getBetPlaced() && (zt50Var2 = this.b) != null && (binding2 = zt50Var2.R.getBinding()) != null) {
                    binding2.F.setAlpha(1.0f);
                }
                zt50 zt50Var9 = this.b;
                if (zt50Var9 == null || zt50Var9.z.getBetPlaced() || (zt50Var = this.b) == null || (binding = zt50Var.z.getBinding()) == null) {
                    return;
                }
                binding.F.setAlpha(1.0f);
            }
        }
    }

    @Override // defpackage.bb
    public final void Q(xnh0 xnh0Var) {
        Resources resources;
        String[] stringArray;
        GameDetails gameDetails;
        String name;
        try {
            if (this.e0) {
                p1();
                F1();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = nzf0.a;
        if (!z2 && jCurrentTimeMillis - nzf0.b <= 500) {
            z2 = true;
        }
        if (z2) {
            this.z0 = false;
            H0();
            s1();
            SharedPreferences sharedPreferences = this.w;
            Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("ROCKET_MUSIC", true)) : null;
            zt50 zt50Var = this.b;
            if (zt50Var != null) {
                ProgressMeterComponent progressMeterComponent = zt50Var.Q;
                ypa0 ypa0VarA1 = a1();
                String string = getString(R.string.bg_music);
                string.getClass();
                progressMeterComponent.K(ypa0VarA1, boolValueOf, string);
                return;
            }
            return;
        }
        if ((xnh0Var != null ? xnh0Var.a : null) != null && xnh0Var.a.length() > 0) {
            zt50 zt50Var2 = this.b;
            if (zt50Var2 != null) {
                zt50Var2.Q.O(0);
            }
            this.p0 = false;
            this.N = false;
            zt50 zt50Var3 = this.b;
            if (zt50Var3 != null) {
                zt50Var3.E.setVisibility(8);
            }
            this.q0 = false;
            this.J = false;
            if (getContext() != null && (gameDetails = this.B) != null && (name = gameDetails.getName()) != null) {
                fn1 fn1VarB1 = b1();
                ej5.c(o8i0.d(fn1VarB1), null, null, new an1(fn1VarB1, name, null), 3);
            }
            Context context = getContext();
            int length = ((context == null || (resources = context.getResources()) == null || (stringArray = resources.getStringArray(R.array.pocket_rocket_array)) == null) ? 0 : stringArray.length) + 11;
            zt50 zt50Var4 = this.b;
            if (zt50Var4 != null) {
                zt50Var4.Q.setVisibility(0);
            }
            zt50 zt50Var5 = this.b;
            if (zt50Var5 != null) {
                zt50Var5.Q.setProgressForApi(100 / length);
            }
            zt50 zt50Var6 = this.b;
            if (zt50Var6 != null) {
                zt50Var6.Q.setCurrentProgress(100 - ((100 / length) * length));
            }
            zt50 zt50Var7 = this.b;
            if (zt50Var7 != null) {
                zt50Var7.Q.L();
            }
            if (getContext() != null) {
                v1();
                zt50 zt50Var8 = this.b;
                if (zt50Var8 != null) {
                    zt50Var8.Q.E(this.z, this.c, this.A, this.o0);
                }
            }
        }
        this.e0 = false;
    }

    public final void Q0(ResultWrapper.GenericError genericError) {
        Context context = getContext();
        if (context != null) {
            rlz rlzVar = rlz.d;
            ghe gheVar = new ghe(this, 2);
            int i2 = 1;
            wm0 wm0Var = new wm0(i2);
            xm0 xm0Var = new xm0(i2);
            context.getColor(R.color.sh_error_btn_color);
            rlzVar.c(context, genericError, gheVar, wm0Var, xm0Var, 0, (1728 & 128) != 0 ? new slz() : null, (1728 & 512) != 0 ? new tlz() : null, new ulz());
        }
    }

    public final void R0() {
        l1z l1zVarY0 = Y0();
        GameDetails gameDetails = this.B;
        Integer id = gameDetails != null ? gameDetails.getId() : null;
        GameDetails gameDetails2 = this.B;
        l1zVarY0.h(id, gameDetails2 != null ? gameDetails2.getName() : null);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0151  */
    public final void S0(String str) {
        androidx.fragment.app.e activity;
        String name;
        Object objValueOf;
        Integer id;
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        FragmentManager supportFragmentManager3;
        if (h1() && ((this.d || !this.q0) && str == null)) {
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
                return;
            }
            return;
        }
        xi60 xi60Var = this.j1;
        if (xi60Var != null && xi60Var.isResumed()) {
            xi60 xi60Var2 = this.j1;
            if (xi60Var2 != null) {
                xi60Var2.dismiss();
            }
            zt50 zt50Var = this.b;
            if (zt50Var != null) {
                zt50Var.G.setVisibility(8);
                return;
            }
            return;
        }
        oh60 oh60Var = this.m1;
        if (oh60Var != null && oh60Var.isShowing()) {
            oh60 oh60Var2 = this.m1;
            if (oh60Var2 != null) {
                oh60Var2.dismiss();
                return;
            }
            return;
        }
        hy50 hy50Var = this.i0;
        if (hy50Var != null && hy50Var.isShowing()) {
            hy50 hy50Var2 = this.i0;
            if (hy50Var2 != null) {
                hy50Var2.dismiss();
                return;
            } else {
                Intrinsics.n("roundDetailBet");
                throw null;
            }
        }
        a920 a920Var = this.h0;
        if (a920Var != null && a920Var.isShowing()) {
            a920 a920Var2 = this.h0;
            if (a920Var2 != null) {
                a920Var2.dismiss();
                return;
            } else {
                Intrinsics.n("roundHistory");
                throw null;
            }
        }
        pj60 pj60Var = this.g0;
        if (pj60Var != null && pj60Var.isShowing()) {
            pj60 pj60Var2 = this.g0;
            if (pj60Var2 != null) {
                pj60Var2.dismiss();
                return;
            } else {
                Intrinsics.n("gameLimit");
                throw null;
            }
        }
        androidx.fragment.app.e activity3 = getActivity();
        Fragment fragmentG = (activity3 == null || (supportFragmentManager3 = activity3.getSupportFragmentManager()) == null) ? null : supportFragmentManager3.G(R.id.flContent);
        if (fragmentG instanceof fm60) {
            fm60 fm60Var = (fm60) fragmentG;
            if (fm60Var.isAdded() && fm60Var.isVisible() && !fm60Var.i && Intrinsics.g(fm60Var.b, "one tap bet")) {
                return;
            }
        }
        androidx.fragment.app.e activity4 = getActivity();
        if (((activity4 == null || (supportFragmentManager2 = activity4.getSupportFragmentManager()) == null) ? 0 : supportFragmentManager2.L()) > 0) {
            androidx.fragment.app.e activity5 = getActivity();
            if (activity5 == null || (supportFragmentManager = activity5.getSupportFragmentManager()) == null) {
                return;
            }
            supportFragmentManager.a0();
            return;
        }
        ArrayList<GameDetails> arrayList = this.m0;
        if (arrayList != null) {
            GameDetails gameDetails = this.B;
            int iIntValue = (gameDetails == null || (id = gameDetails.getId()) == null) ? 0 : id.intValue();
            GameDetails gameDetails2 = this.B;
            if (gameDetails2 == null || (name = gameDetails2.getName()) == null) {
                name = "";
            }
            svg svgVar = new svg();
            svgVar.c = arrayList;
            svgVar.d = Integer.valueOf(iIntValue);
            svgVar.e = name;
            svgVar.i = str;
            this.J0 = svgVar;
            androidx.fragment.app.e activity6 = getActivity();
            if (activity6 != null) {
                try {
                    FragmentManager supportFragmentManager4 = activity6.getSupportFragmentManager();
                    supportFragmentManager4.getClass();
                    svg svgVar2 = this.J0;
                    if (svgVar2 != null) {
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager4);
                        aVar.f(R.id.flContent, svgVar2, null);
                        aVar.c("CONFIRM_DIALOG_FRAGMENT");
                        objValueOf = Integer.valueOf(aVar.k(false, true));
                    } else {
                        objValueOf = null;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    objValueOf = Unit.a;
                }
            } else {
                objValueOf = null;
            }
            if (objValueOf != null) {
                return;
            }
        }
        try {
            J0();
            Context context = getContext();
            if (context == null || (activity = getActivity()) == null) {
                return;
            }
            if (str != null) {
                xbg xbgVar = this.y0;
                if (xbgVar == null) {
                    Intrinsics.n("errorDialog");
                    throw null;
                }
                String string = getString(R.string.label_dialog_exit);
                string.getClass();
                xbg.c(xbgVar, str, string, new Function0() { // from class: bx10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        e activity7 = this.a.getActivity();
                        if (activity7 == null) {
                            return null;
                        }
                        activity7.finish();
                        return Unit.a;
                    }
                }, new gx10(), context.getColor(R.color.sh_error_btn_color), 224);
                xbgVar.a();
                return;
            }
            FragmentManager supportFragmentManager5 = activity.getSupportFragmentManager();
            this.n0 = supportFragmentManager5;
            if (supportFragmentManager5 != null) {
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager5);
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
                String strB3 = op5.b(string6, string7, null);
                g7j g7jVar = new g7j(this, 2);
                int color = context.getColor(R.color.redblack_confirm_dialog_left_button);
                int color2 = context.getColor(R.color.redblack_confirm_dialog_right_button);
                fm60 fm60Var2 = new fm60();
                fm60Var2.a = strB;
                fm60Var2.b = JsPluginCommon.GAMES_EXIT;
                fm60Var2.c = strB2;
                fm60Var2.d = strB3;
                fm60Var2.e = g7jVar;
                fm60Var2.v = color;
                fm60Var2.w = color2;
                fm60Var2.i = true;
                aVar2.f(R.id.flContent, fm60Var2, null);
                aVar2.c("");
                aVar2.k(false, true);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
            Unit unit = Unit.a;
        }
    }

    public final void T0() {
        GameDetails gameDetails = this.B;
        String name = gameDetails != null ? gameDetails.getName() : null;
        if (name == null) {
            name = "";
        }
        wz.a("FBGRemoved", name, new String[0]);
    }

    public final au2 U0() {
        return (au2) this.n1.getValue();
    }

    public final void V0() {
        if (yju.a("br")) {
            androidx.fragment.app.e activity = getActivity();
            GameMainActivity gameMainActivity = activity instanceof GameMainActivity ? (GameMainActivity) activity : null;
            if (gameMainActivity != null) {
                gameMainActivity.J1(new dz10(this), new ez10(this));
            }
        }
    }

    public final fuj X0() {
        return (fuj) this.U0.getValue();
    }

    public final l1z Y0() {
        return (l1z) this.a.getValue();
    }

    public final eoa0 Z0() {
        return (eoa0) this.D.getValue();
    }

    public final ypa0 a1() {
        return (ypa0) this.C.getValue();
    }

    public final fn1 b1() {
        return (fn1) this.E.getValue();
    }

    public final void c1(RoundBetResponse roundBetResponse) {
        nk2 binding;
        nk2 binding2;
        nk2 binding3;
        ConstraintLayout constraintLayout;
        nk2 binding4;
        nk2 binding5;
        nk2 binding6;
        nk2 binding7;
        nk2 binding8;
        nk2 binding9;
        nk2 binding10;
        nk2 binding11;
        nk2 binding12;
        ConstraintLayout constraintLayout2;
        nk2 binding13;
        nk2 binding14;
        nk2 binding15;
        nk2 binding16;
        nk2 binding17;
        nk2 binding18;
        nk2 binding19;
        nk2 binding20;
        ConstraintLayout constraintLayout3;
        nk2 binding21;
        nk2 binding22;
        nk2 binding23;
        nk2 binding24;
        nk2 binding25;
        nk2 binding26;
        GiftItem giftItem;
        nk2 binding27;
        nk2 binding28;
        nk2 binding29;
        nk2 binding30;
        nk2 binding31;
        nk2 binding32;
        ConstraintLayout constraintLayout4;
        nk2 binding33;
        nk2 binding34;
        nk2 binding35;
        nk2 binding36;
        nk2 binding37;
        nk2 binding38;
        nk2 binding39;
        nk2 binding40;
        nk2 binding41;
        nk2 binding42;
        nk2 binding43;
        nk2 binding44;
        nk2 binding45;
        nk2 binding46;
        ConstraintLayout constraintLayout5;
        nk2 binding47;
        nk2 binding48;
        nk2 binding49;
        nk2 binding50;
        nk2 binding51;
        nk2 binding52;
        nk2 binding53;
        nk2 binding54;
        nk2 binding55;
        nk2 binding56;
        nk2 binding57;
        nk2 binding58;
        nk2 binding59;
        nk2 binding60;
        ConstraintLayout constraintLayout6;
        nk2 binding61;
        nk2 binding62;
        nk2 binding63;
        nk2 binding64;
        nk2 binding65;
        zt50 zt50Var = this.b;
        if (zt50Var != null) {
            zt50Var.Z.a(roundBetResponse, this.I0);
            Unit unit = Unit.a;
        }
        j0(roundBetResponse.getBet());
        try {
            BetDetails bet = roundBetResponse.getBet();
            if (!Intrinsics.c(bet != null ? Double.valueOf(bet.getCashoutCoefficient()) : null, 0.0d)) {
                w0();
                eoa0 eoa0VarZ0 = Z0();
                String strValueOf = String.valueOf(roundBetResponse.getRoundId());
                BetDetails bet2 = roundBetResponse.getBet();
                String rocketType = bet2 != null ? bet2.getRocketType() : null;
                strValueOf.getClass();
                eoa0VarZ0.C.put(eoa0.B1(strValueOf, rocketType), Boolean.TRUE);
                BetDetails bet3 = roundBetResponse.getBet();
                String rocketType2 = bet3 != null ? bet3.getRocketType() : null;
                boolean zG = Intrinsics.g(rocketType2, "RED");
                CashoutLayoutForChat cashoutLayoutForChat = this.F0;
                if (zG) {
                    zt50 zt50Var2 = this.b;
                    if (zt50Var2 != null) {
                        zt50Var2.S.setCashoutDone(true);
                        Unit unit2 = Unit.a;
                    }
                    zt50 zt50Var3 = this.b;
                    if (zt50Var3 != null && (binding24 = zt50Var3.S.getBinding()) != null) {
                        binding24.v.setAlpha(1.0f);
                        Unit unit3 = Unit.a;
                    }
                    zt50 zt50Var4 = this.b;
                    if (zt50Var4 != null && (binding23 = zt50Var4.S.getBinding()) != null) {
                        binding23.A.setAlpha(1.0f);
                        Unit unit4 = Unit.a;
                    }
                    zt50 zt50Var5 = this.b;
                    if (zt50Var5 != null) {
                        zt50Var5.S.setCashoutInProgress(false);
                        Unit unit5 = Unit.a;
                    }
                    zt50 zt50Var6 = this.b;
                    if (zt50Var6 != null) {
                        zt50Var6.S.setBetPlaced(false);
                        Unit unit6 = Unit.a;
                    }
                    zt50 zt50Var7 = this.b;
                    if (zt50Var7 != null && (binding22 = zt50Var7.S.getBinding()) != null) {
                        binding22.v.setVisibility(0);
                        Unit unit7 = Unit.a;
                    }
                    zt50 zt50Var8 = this.b;
                    if (zt50Var8 != null && (binding21 = zt50Var8.S.getBinding()) != null) {
                        binding21.p0.setVisibility(8);
                        Unit unit8 = Unit.a;
                    }
                    zt50 zt50Var9 = this.b;
                    if (zt50Var9 != null && (binding20 = zt50Var9.S.getBinding()) != null && (constraintLayout3 = binding20.y) != null) {
                        constraintLayout3.setBackground(requireContext().getDrawable(R.drawable.bets_placed_background));
                        Unit unit9 = Unit.a;
                    }
                    if (roundBetResponse.getBet().getGiftAmount() != null) {
                        zt50 zt50Var10 = this.b;
                        if (zt50Var10 != null) {
                            zt50Var10.S.c();
                            Unit unit10 = Unit.a;
                        }
                        b1().x1();
                        Unit unit11 = Unit.a;
                    }
                    zt50 zt50Var11 = this.b;
                    if (zt50Var11 != null && (binding19 = zt50Var11.S.getBinding()) != null) {
                        binding19.v.setClickable(true);
                        Unit unit12 = Unit.a;
                    }
                    zt50 zt50Var12 = this.b;
                    if (zt50Var12 != null && (binding18 = zt50Var12.S.getBinding()) != null) {
                        binding18.A.setVisibility(8);
                        Unit unit13 = Unit.a;
                    }
                    zt50 zt50Var13 = this.b;
                    if (zt50Var13 != null && (binding17 = zt50Var13.S.getBinding()) != null) {
                        binding17.A.setClickable(true);
                        Unit unit14 = Unit.a;
                    }
                    if (this.d0) {
                        cashoutLayoutForChat.setCashOutRedRocketVisibility(false);
                        fb7.d.j(cashoutLayoutForChat);
                    }
                    zp40 zp40Var = new zp40();
                    double cashoutCoefficient = roundBetResponse.getBet().getCashoutCoefficient();
                    zt50 zt50Var14 = this.b;
                    double betAmount = cashoutCoefficient * (zt50Var14 != null ? zt50Var14.S.getBetAmount() : 0.0d);
                    zp40Var.a = betAmount;
                    List<DetailResponse> list = this.M;
                    if (list == null) {
                        Intrinsics.n("gameDetailResponse");
                        throw null;
                    }
                    if (betAmount > list.get(0).getMaxPayoutAmount()) {
                        List<DetailResponse> list2 = this.M;
                        if (list2 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        zp40Var.a = list2.get(0).getMaxPayoutAmount();
                    }
                    nas nasVarB = lrn.b(this);
                    pfd pfdVar = fse.a;
                    ej5.c(nasVarB, gku.a, null, new f(zp40Var, roundBetResponse, null), 2);
                    return;
                }
                boolean zG2 = Intrinsics.g(rocketType2, "PURPLE");
                zt50 zt50Var15 = this.b;
                if (zG2) {
                    if (zt50Var15 != null) {
                        zt50Var15.R.setCashoutDone(true);
                        Unit unit15 = Unit.a;
                    }
                    zt50 zt50Var16 = this.b;
                    if (zt50Var16 != null && (binding16 = zt50Var16.R.getBinding()) != null) {
                        binding16.v.setAlpha(1.0f);
                        Unit unit16 = Unit.a;
                    }
                    zt50 zt50Var17 = this.b;
                    if (zt50Var17 != null && (binding15 = zt50Var17.R.getBinding()) != null) {
                        binding15.A.setAlpha(1.0f);
                        Unit unit17 = Unit.a;
                    }
                    zt50 zt50Var18 = this.b;
                    if (zt50Var18 != null) {
                        zt50Var18.R.setCashoutInProgress(false);
                        Unit unit18 = Unit.a;
                    }
                    zt50 zt50Var19 = this.b;
                    if (zt50Var19 != null) {
                        zt50Var19.R.setBetPlaced(false);
                        Unit unit19 = Unit.a;
                    }
                    zt50 zt50Var20 = this.b;
                    if (zt50Var20 != null && (binding14 = zt50Var20.R.getBinding()) != null) {
                        binding14.v.setVisibility(0);
                        Unit unit20 = Unit.a;
                    }
                    zt50 zt50Var21 = this.b;
                    if (zt50Var21 != null && (binding13 = zt50Var21.R.getBinding()) != null) {
                        binding13.p0.setVisibility(8);
                        Unit unit21 = Unit.a;
                    }
                    zt50 zt50Var22 = this.b;
                    if (zt50Var22 != null && (binding12 = zt50Var22.R.getBinding()) != null && (constraintLayout2 = binding12.y) != null) {
                        constraintLayout2.setBackground(requireContext().getDrawable(R.drawable.bets_placed_background));
                        Unit unit22 = Unit.a;
                    }
                    if (roundBetResponse.getBet().getGiftAmount() != null) {
                        zt50 zt50Var23 = this.b;
                        if (zt50Var23 != null) {
                            zt50Var23.R.c();
                            Unit unit23 = Unit.a;
                        }
                        b1().x1();
                        Unit unit24 = Unit.a;
                    }
                    zt50 zt50Var24 = this.b;
                    if (zt50Var24 != null && (binding11 = zt50Var24.R.getBinding()) != null) {
                        binding11.v.setClickable(true);
                        Unit unit25 = Unit.a;
                    }
                    zt50 zt50Var25 = this.b;
                    if (zt50Var25 != null && (binding10 = zt50Var25.R.getBinding()) != null) {
                        binding10.A.setVisibility(8);
                        Unit unit26 = Unit.a;
                    }
                    zt50 zt50Var26 = this.b;
                    if (zt50Var26 != null && (binding9 = zt50Var26.R.getBinding()) != null) {
                        binding9.A.setClickable(true);
                        Unit unit27 = Unit.a;
                    }
                    if (this.d0) {
                        cashoutLayoutForChat.setCashOutPurpleRocketVisibility(false);
                        fb7.d.j(cashoutLayoutForChat);
                    }
                    zp40 zp40Var2 = new zp40();
                    double cashoutCoefficient2 = roundBetResponse.getBet().getCashoutCoefficient();
                    zt50 zt50Var27 = this.b;
                    double betAmount2 = cashoutCoefficient2 * (zt50Var27 != null ? zt50Var27.R.getBetAmount() : 0.0d);
                    zp40Var2.a = betAmount2;
                    List<DetailResponse> list3 = this.M;
                    if (list3 == null) {
                        Intrinsics.n("gameDetailResponse");
                        throw null;
                    }
                    if (betAmount2 > list3.get(1).getMaxPayoutAmount()) {
                        List<DetailResponse> list4 = this.M;
                        if (list4 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        zp40Var2.a = list4.get(1).getMaxPayoutAmount();
                    }
                    nas nasVarB2 = lrn.b(this);
                    pfd pfdVar2 = fse.a;
                    ej5.c(nasVarB2, gku.a, null, new g(zp40Var2, roundBetResponse, null), 2);
                    return;
                }
                if (zt50Var15 != null) {
                    zt50Var15.z.setCashoutDone(true);
                    Unit unit28 = Unit.a;
                }
                zt50 zt50Var28 = this.b;
                if (zt50Var28 != null) {
                    zt50Var28.z.setCashoutInProgress(false);
                    Unit unit29 = Unit.a;
                }
                zt50 zt50Var29 = this.b;
                if (zt50Var29 != null) {
                    zt50Var29.z.setBetPlaced(false);
                    Unit unit30 = Unit.a;
                }
                zt50 zt50Var30 = this.b;
                if (zt50Var30 != null && (binding8 = zt50Var30.z.getBinding()) != null) {
                    binding8.v.setVisibility(0);
                    Unit unit31 = Unit.a;
                }
                zt50 zt50Var31 = this.b;
                if (zt50Var31 != null && (binding7 = zt50Var31.z.getBinding()) != null) {
                    binding7.v.setClickable(true);
                    Unit unit32 = Unit.a;
                }
                zt50 zt50Var32 = this.b;
                if (zt50Var32 != null && (binding6 = zt50Var32.z.getBinding()) != null) {
                    binding6.A.setVisibility(8);
                    Unit unit33 = Unit.a;
                }
                zt50 zt50Var33 = this.b;
                if (zt50Var33 != null && (binding5 = zt50Var33.z.getBinding()) != null) {
                    binding5.A.setClickable(true);
                    Unit unit34 = Unit.a;
                }
                zt50 zt50Var34 = this.b;
                if (zt50Var34 != null && (binding4 = zt50Var34.z.getBinding()) != null) {
                    binding4.p0.setVisibility(8);
                    Unit unit35 = Unit.a;
                }
                zt50 zt50Var35 = this.b;
                if (zt50Var35 != null && (binding3 = zt50Var35.z.getBinding()) != null && (constraintLayout = binding3.y) != null) {
                    constraintLayout.setBackground(requireContext().getDrawable(R.drawable.bets_placed_background));
                    Unit unit36 = Unit.a;
                }
                zt50 zt50Var36 = this.b;
                if (zt50Var36 != null && (binding2 = zt50Var36.z.getBinding()) != null) {
                    binding2.v.setAlpha(1.0f);
                    Unit unit37 = Unit.a;
                }
                zt50 zt50Var37 = this.b;
                if (zt50Var37 != null && (binding = zt50Var37.z.getBinding()) != null) {
                    binding.A.setAlpha(1.0f);
                    Unit unit38 = Unit.a;
                }
                BetDetails bet4 = roundBetResponse.getBet();
                if (bet4 != null && bet4.getGiftAmount() != null) {
                    zt50 zt50Var38 = this.b;
                    if (zt50Var38 != null) {
                        zt50Var38.z.c();
                        Unit unit39 = Unit.a;
                    }
                    b1().x1();
                    Unit unit40 = Unit.a;
                }
                if (this.d0) {
                    cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                    fb7.d.j(cashoutLayoutForChat);
                }
                zp40 zp40Var3 = new zp40();
                BetDetails bet5 = roundBetResponse.getBet();
                double cashoutCoefficient3 = bet5 != null ? bet5.getCashoutCoefficient() : 0.0d;
                zt50 zt50Var39 = this.b;
                double betAmount3 = cashoutCoefficient3 * (zt50Var39 != null ? zt50Var39.z.getBetAmount() : 0.0d);
                zp40Var3.a = betAmount3;
                List<DetailResponse> list5 = this.M;
                if (list5 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                if (betAmount3 > list5.get(2).getMaxPayoutAmount()) {
                    List<DetailResponse> list6 = this.M;
                    if (list6 == null) {
                        Intrinsics.n("gameDetailResponse");
                        throw null;
                    }
                    zp40Var3.a = list6.get(2).getMaxPayoutAmount();
                }
                nas nasVarB3 = lrn.b(this);
                pfd pfdVar3 = fse.a;
                ej5.c(nasVarB3, gku.a, null, new h(zp40Var3, roundBetResponse, null), 2);
                return;
            }
            eoa0 eoa0VarZ1 = Z0();
            String strValueOf2 = String.valueOf(roundBetResponse.getRoundId());
            String rocketType3 = roundBetResponse.getBet().getRocketType();
            strValueOf2.getClass();
            eoa0VarZ1.B.put(eoa0.B1(strValueOf2, rocketType3), Boolean.TRUE);
            String rocketType4 = roundBetResponse.getBet().getRocketType();
            if (Intrinsics.g(rocketType4, "RED")) {
                zt50 zt50Var40 = this.b;
                if (zt50Var40 != null) {
                    zt50Var40.S.setRoundId(roundBetResponse.getBet().getRoundId());
                    Unit unit41 = Unit.a;
                }
                zt50 zt50Var41 = this.b;
                if (zt50Var41 != null) {
                    zt50Var41.S.setBetAmount(roundBetResponse.getBet().getStakeAmount());
                    Unit unit42 = Unit.a;
                }
                zt50 zt50Var42 = this.b;
                if (zt50Var42 != null) {
                    zt50Var42.S.setBetId(roundBetResponse.getBet().getBetId());
                    Unit unit43 = Unit.a;
                }
                zt50 zt50Var43 = this.b;
                if (zt50Var43 != null) {
                    zt50Var43.S.setBetPlaced(true);
                    Unit unit44 = Unit.a;
                }
                zt50 zt50Var44 = this.b;
                if (zt50Var44 != null && (binding65 = zt50Var44.S.getBinding()) != null) {
                    binding65.v.setVisibility(8);
                    Unit unit45 = Unit.a;
                }
                zt50 zt50Var45 = this.b;
                if (zt50Var45 != null && (binding64 = zt50Var45.S.getBinding()) != null) {
                    binding64.C.setVisibility(8);
                    Unit unit46 = Unit.a;
                }
                zt50 zt50Var46 = this.b;
                if (zt50Var46 != null && (binding63 = zt50Var46.S.getBinding()) != null) {
                    binding63.W.setVisibility(8);
                    Unit unit47 = Unit.a;
                }
                zt50 zt50Var47 = this.b;
                if (zt50Var47 != null && (binding62 = zt50Var47.S.getBinding()) != null) {
                    binding62.Y.setVisibility(8);
                    Unit unit48 = Unit.a;
                }
                this.e = false;
                zt50 zt50Var48 = this.b;
                if (zt50Var48 != null && (binding61 = zt50Var48.S.getBinding()) != null) {
                    binding61.p0.setVisibility(0);
                    Unit unit49 = Unit.a;
                }
                zt50 zt50Var49 = this.b;
                if (zt50Var49 != null && (binding60 = zt50Var49.S.getBinding()) != null && (constraintLayout6 = binding60.y) != null) {
                    constraintLayout6.setBackground(requireContext().getDrawable(R.drawable.bet_placed_enable_background));
                    Unit unit50 = Unit.a;
                }
                zt50 zt50Var50 = this.b;
                if (zt50Var50 != null) {
                    zt50Var50.S.setBetInProgress(false);
                    Unit unit51 = Unit.a;
                }
                zt50 zt50Var51 = this.b;
                if (zt50Var51 != null && (binding59 = zt50Var51.S.getBinding()) != null) {
                    TextView textView = binding59.b;
                    TreeMap treeMap = pw.a;
                    textView.setText(pw.n(roundBetResponse.getBet().getStakeAmount()));
                    Unit unit52 = Unit.a;
                }
                zt50 zt50Var52 = this.b;
                if (zt50Var52 != null && (binding58 = zt50Var52.S.getBinding()) != null) {
                    binding58.v.setClickable(true);
                    Unit unit53 = Unit.a;
                }
                zt50 zt50Var53 = this.b;
                if (zt50Var53 != null && (binding57 = zt50Var53.S.getBinding()) != null) {
                    binding57.v.setAlpha(1.0f);
                    Unit unit54 = Unit.a;
                }
                Double giftAmount = roundBetResponse.getBet().getGiftAmount();
                giftItem = giftAmount != null ? new GiftItem(giftAmount.doubleValue(), "", "", "", 0.0d, 0L, 0, null, null, 384, null) : null;
                if (roundBetResponse.getBet().getAutoCashoutAt() != null) {
                    this.S = true;
                    zt50 zt50Var54 = this.b;
                    if (zt50Var54 != null && (binding56 = zt50Var54.S.getBinding()) != null) {
                        binding56.f.setStatus(true);
                        Unit unit55 = Unit.a;
                    }
                    zt50 zt50Var55 = this.b;
                    if (zt50Var55 != null && (binding55 = zt50Var55.S.getBinding()) != null) {
                        binding55.B.setVisibility(0);
                        Unit unit56 = Unit.a;
                    }
                    zt50 zt50Var56 = this.b;
                    if (zt50Var56 != null && (binding54 = zt50Var56.S.getBinding()) != null) {
                        binding54.z.setText(roundBetResponse.getBet().getAutoCashoutAt());
                        Unit unit57 = Unit.a;
                    }
                } else {
                    this.S = false;
                    zt50 zt50Var57 = this.b;
                    if (zt50Var57 != null && (binding53 = zt50Var57.S.getBinding()) != null) {
                        binding53.f.setStatus(false);
                        Unit unit58 = Unit.a;
                    }
                    zt50 zt50Var58 = this.b;
                    if (zt50Var58 != null && (binding52 = zt50Var58.S.getBinding()) != null) {
                        binding52.B.setVisibility(8);
                        Unit unit59 = Unit.a;
                    }
                }
                zt50 zt50Var59 = this.b;
                if (zt50Var59 != null) {
                    zt50Var59.S.setUserInputAmount(roundBetResponse.getBet().getStakeAmount());
                    Unit unit60 = Unit.a;
                }
                zt50 zt50Var60 = this.b;
                if (giftItem != null) {
                    if (zt50Var60 != null) {
                        zt50Var60.S.setUserInputAmount(roundBetResponse.getBet().getGiftAmount().doubleValue());
                        Unit unit61 = Unit.a;
                    }
                    zt50 zt50Var61 = this.b;
                    if (zt50Var61 != null) {
                        zt50Var61.S.setFBG(giftItem, true, roundBetResponse.getBet().getGiftAmount().doubleValue());
                        Unit unit62 = Unit.a;
                    }
                    zt50 zt50Var62 = this.b;
                    if (zt50Var62 != null) {
                        zt50Var62.S.setFbgRoundId(roundBetResponse.getBet().getRoundId());
                        Unit unit63 = Unit.a;
                    }
                    zt50 zt50Var63 = this.b;
                    if (zt50Var63 != null) {
                        zt50Var63.R.c();
                        Unit unit64 = Unit.a;
                    }
                    zt50 zt50Var64 = this.b;
                    if (zt50Var64 != null) {
                        zt50Var64.z.c();
                        Unit unit65 = Unit.a;
                    }
                    K0();
                    Unit unit66 = Unit.a;
                } else if (zt50Var60 != null) {
                    zt50Var60.S.c();
                    Unit unit67 = Unit.a;
                }
                this.a0 = roundBetResponse.getBet().getRoundId();
            } else {
                boolean zG3 = Intrinsics.g(rocketType4, "PURPLE");
                zt50 zt50Var65 = this.b;
                if (zG3) {
                    if (zt50Var65 != null) {
                        zt50Var65.R.setRoundId(roundBetResponse.getBet().getRoundId());
                        Unit unit68 = Unit.a;
                    }
                    zt50 zt50Var66 = this.b;
                    if (zt50Var66 != null) {
                        zt50Var66.R.setBetAmount(roundBetResponse.getBet().getStakeAmount());
                        Unit unit69 = Unit.a;
                    }
                    zt50 zt50Var67 = this.b;
                    if (zt50Var67 != null) {
                        zt50Var67.R.setBetId(roundBetResponse.getBet().getBetId());
                        Unit unit70 = Unit.a;
                    }
                    zt50 zt50Var68 = this.b;
                    if (zt50Var68 != null) {
                        zt50Var68.R.setBetPlaced(true);
                        Unit unit71 = Unit.a;
                    }
                    zt50 zt50Var69 = this.b;
                    if (zt50Var69 != null && (binding51 = zt50Var69.R.getBinding()) != null) {
                        binding51.v.setVisibility(8);
                        Unit unit72 = Unit.a;
                    }
                    zt50 zt50Var70 = this.b;
                    if (zt50Var70 != null && (binding50 = zt50Var70.R.getBinding()) != null) {
                        binding50.C.setVisibility(8);
                        Unit unit73 = Unit.a;
                    }
                    zt50 zt50Var71 = this.b;
                    if (zt50Var71 != null && (binding49 = zt50Var71.R.getBinding()) != null) {
                        binding49.W.setVisibility(8);
                        Unit unit74 = Unit.a;
                    }
                    zt50 zt50Var72 = this.b;
                    if (zt50Var72 != null && (binding48 = zt50Var72.R.getBinding()) != null) {
                        binding48.Y.setVisibility(8);
                        Unit unit75 = Unit.a;
                    }
                    this.i = false;
                    zt50 zt50Var73 = this.b;
                    if (zt50Var73 != null && (binding47 = zt50Var73.R.getBinding()) != null) {
                        binding47.p0.setVisibility(0);
                        Unit unit76 = Unit.a;
                    }
                    zt50 zt50Var74 = this.b;
                    if (zt50Var74 != null && (binding46 = zt50Var74.R.getBinding()) != null && (constraintLayout5 = binding46.y) != null) {
                        constraintLayout5.setBackground(requireContext().getDrawable(R.drawable.bet_placed_enable_background));
                        Unit unit77 = Unit.a;
                    }
                    zt50 zt50Var75 = this.b;
                    if (zt50Var75 != null) {
                        zt50Var75.R.setBetInProgress(false);
                        Unit unit78 = Unit.a;
                    }
                    zt50 zt50Var76 = this.b;
                    if (zt50Var76 != null && (binding45 = zt50Var76.R.getBinding()) != null) {
                        TextView textView2 = binding45.b;
                        TreeMap treeMap2 = pw.a;
                        textView2.setText(pw.n(roundBetResponse.getBet().getStakeAmount()));
                        Unit unit79 = Unit.a;
                    }
                    zt50 zt50Var77 = this.b;
                    if (zt50Var77 != null && (binding44 = zt50Var77.R.getBinding()) != null) {
                        binding44.v.setClickable(true);
                        Unit unit80 = Unit.a;
                    }
                    zt50 zt50Var78 = this.b;
                    if (zt50Var78 != null && (binding43 = zt50Var78.R.getBinding()) != null) {
                        binding43.v.setAlpha(1.0f);
                        Unit unit81 = Unit.a;
                    }
                    Double giftAmount2 = roundBetResponse.getBet().getGiftAmount();
                    giftItem = giftAmount2 != null ? new GiftItem(giftAmount2.doubleValue(), "", "", "", 0.0d, 0L, 0, null, null, 384, null) : null;
                    if (roundBetResponse.getBet().getAutoCashoutAt() != null) {
                        this.Z = true;
                        zt50 zt50Var79 = this.b;
                        if (zt50Var79 != null && (binding42 = zt50Var79.R.getBinding()) != null) {
                            binding42.f.setStatus(true);
                            Unit unit82 = Unit.a;
                        }
                        zt50 zt50Var80 = this.b;
                        if (zt50Var80 != null && (binding41 = zt50Var80.R.getBinding()) != null) {
                            binding41.B.setVisibility(0);
                            Unit unit83 = Unit.a;
                        }
                        zt50 zt50Var81 = this.b;
                        if (zt50Var81 != null && (binding40 = zt50Var81.R.getBinding()) != null) {
                            binding40.z.setText(roundBetResponse.getBet().getAutoCashoutAt());
                            Unit unit84 = Unit.a;
                        }
                    } else {
                        this.Z = false;
                        zt50 zt50Var82 = this.b;
                        if (zt50Var82 != null && (binding39 = zt50Var82.R.getBinding()) != null) {
                            binding39.f.setStatus(false);
                            Unit unit85 = Unit.a;
                        }
                        zt50 zt50Var83 = this.b;
                        if (zt50Var83 != null && (binding38 = zt50Var83.R.getBinding()) != null) {
                            binding38.B.setVisibility(8);
                            Unit unit86 = Unit.a;
                        }
                    }
                    zt50 zt50Var84 = this.b;
                    if (zt50Var84 != null) {
                        zt50Var84.R.setUserInputAmount(roundBetResponse.getBet().getStakeAmount());
                        Unit unit87 = Unit.a;
                    }
                    zt50 zt50Var85 = this.b;
                    if (giftItem != null) {
                        if (zt50Var85 != null) {
                            zt50Var85.R.setUserInputAmount(roundBetResponse.getBet().getGiftAmount().doubleValue());
                            Unit unit88 = Unit.a;
                        }
                        zt50 zt50Var86 = this.b;
                        if (zt50Var86 != null) {
                            zt50Var86.R.setFBG(giftItem, true, roundBetResponse.getBet().getGiftAmount().doubleValue());
                            Unit unit89 = Unit.a;
                        }
                        zt50 zt50Var87 = this.b;
                        if (zt50Var87 != null) {
                            zt50Var87.R.setFbgRoundId(roundBetResponse.getBet().getRoundId());
                            Unit unit90 = Unit.a;
                        }
                        zt50 zt50Var88 = this.b;
                        if (zt50Var88 != null) {
                            zt50Var88.S.c();
                            Unit unit91 = Unit.a;
                        }
                        zt50 zt50Var89 = this.b;
                        if (zt50Var89 != null) {
                            zt50Var89.z.c();
                            Unit unit92 = Unit.a;
                        }
                        K0();
                        Unit unit93 = Unit.a;
                    } else if (zt50Var85 != null) {
                        zt50Var85.R.c();
                        Unit unit94 = Unit.a;
                    }
                    this.c0 = roundBetResponse.getBet().getRoundId();
                } else {
                    if (zt50Var65 != null) {
                        zt50Var65.z.setRoundId(roundBetResponse.getBet().getRoundId());
                        Unit unit95 = Unit.a;
                    }
                    zt50 zt50Var90 = this.b;
                    if (zt50Var90 != null) {
                        zt50Var90.z.setBetAmount(roundBetResponse.getBet().getStakeAmount());
                        Unit unit96 = Unit.a;
                    }
                    zt50 zt50Var91 = this.b;
                    if (zt50Var91 != null) {
                        zt50Var91.z.setBetId(roundBetResponse.getBet().getBetId());
                        Unit unit97 = Unit.a;
                    }
                    zt50 zt50Var92 = this.b;
                    if (zt50Var92 != null) {
                        zt50Var92.z.setBetPlaced(true);
                        Unit unit98 = Unit.a;
                    }
                    zt50 zt50Var93 = this.b;
                    if (zt50Var93 != null) {
                        zt50Var93.z.setBetInProgress(false);
                        Unit unit99 = Unit.a;
                    }
                    zt50 zt50Var94 = this.b;
                    if (zt50Var94 != null && (binding37 = zt50Var94.z.getBinding()) != null) {
                        binding37.v.setVisibility(8);
                        Unit unit100 = Unit.a;
                    }
                    zt50 zt50Var95 = this.b;
                    if (zt50Var95 != null && (binding36 = zt50Var95.z.getBinding()) != null) {
                        binding36.C.setVisibility(8);
                        Unit unit101 = Unit.a;
                    }
                    zt50 zt50Var96 = this.b;
                    if (zt50Var96 != null && (binding35 = zt50Var96.z.getBinding()) != null) {
                        binding35.W.setVisibility(8);
                        Unit unit102 = Unit.a;
                    }
                    zt50 zt50Var97 = this.b;
                    if (zt50Var97 != null && (binding34 = zt50Var97.z.getBinding()) != null) {
                        binding34.Y.setVisibility(8);
                        Unit unit103 = Unit.a;
                    }
                    this.f = false;
                    zt50 zt50Var98 = this.b;
                    if (zt50Var98 != null && (binding33 = zt50Var98.z.getBinding()) != null) {
                        binding33.p0.setVisibility(0);
                        Unit unit104 = Unit.a;
                    }
                    zt50 zt50Var99 = this.b;
                    if (zt50Var99 != null && (binding32 = zt50Var99.z.getBinding()) != null && (constraintLayout4 = binding32.y) != null) {
                        constraintLayout4.setBackground(requireContext().getDrawable(R.drawable.bet_placed_enable_background));
                        Unit unit105 = Unit.a;
                    }
                    zt50 zt50Var100 = this.b;
                    if (zt50Var100 != null && (binding31 = zt50Var100.z.getBinding()) != null) {
                        binding31.v.setClickable(true);
                        Unit unit106 = Unit.a;
                    }
                    zt50 zt50Var101 = this.b;
                    if (zt50Var101 != null && (binding30 = zt50Var101.z.getBinding()) != null) {
                        binding30.v.setAlpha(1.0f);
                        Unit unit107 = Unit.a;
                    }
                    if (roundBetResponse.getBet().getAutoCashoutAt() != null) {
                        this.W = true;
                        zt50 zt50Var102 = this.b;
                        if (zt50Var102 != null && (binding29 = zt50Var102.z.getBinding()) != null) {
                            binding29.f.setStatus(true);
                            Unit unit108 = Unit.a;
                        }
                        zt50 zt50Var103 = this.b;
                        if (zt50Var103 != null && (binding28 = zt50Var103.z.getBinding()) != null) {
                            binding28.B.setVisibility(0);
                            Unit unit109 = Unit.a;
                        }
                        zt50 zt50Var104 = this.b;
                        if (zt50Var104 != null && (binding27 = zt50Var104.z.getBinding()) != null) {
                            binding27.z.setText(roundBetResponse.getBet().getAutoCashoutAt());
                            Unit unit110 = Unit.a;
                        }
                    } else {
                        this.W = false;
                        zt50 zt50Var105 = this.b;
                        if (zt50Var105 != null && (binding26 = zt50Var105.z.getBinding()) != null) {
                            binding26.f.setStatus(false);
                            Unit unit111 = Unit.a;
                        }
                        zt50 zt50Var106 = this.b;
                        if (zt50Var106 != null && (binding25 = zt50Var106.z.getBinding()) != null) {
                            binding25.B.setVisibility(8);
                            Unit unit112 = Unit.a;
                        }
                    }
                    Double giftAmount3 = roundBetResponse.getBet().getGiftAmount();
                    giftItem = giftAmount3 != null ? new GiftItem(giftAmount3.doubleValue(), "", "", "", 0.0d, 0L, 0, null, null, 384, null) : null;
                    zt50 zt50Var107 = this.b;
                    if (zt50Var107 != null) {
                        zt50Var107.z.setUserInputAmount(roundBetResponse.getBet().getStakeAmount());
                        Unit unit113 = Unit.a;
                    }
                    zt50 zt50Var108 = this.b;
                    if (giftItem != null) {
                        if (zt50Var108 != null) {
                            zt50Var108.z.setUserInputAmount(roundBetResponse.getBet().getGiftAmount().doubleValue());
                            Unit unit114 = Unit.a;
                        }
                        zt50 zt50Var109 = this.b;
                        if (zt50Var109 != null) {
                            zt50Var109.z.setFBG(giftItem, true, roundBetResponse.getBet().getGiftAmount().doubleValue());
                            Unit unit115 = Unit.a;
                        }
                        zt50 zt50Var110 = this.b;
                        if (zt50Var110 != null) {
                            zt50Var110.R.c();
                            Unit unit116 = Unit.a;
                        }
                        zt50 zt50Var111 = this.b;
                        if (zt50Var111 != null) {
                            zt50Var111.S.c();
                            Unit unit117 = Unit.a;
                        }
                        long roundId = roundBetResponse.getBet().getRoundId();
                        zt50 zt50Var112 = this.b;
                        if (zt50Var112 != null) {
                            zt50Var112.z.setFbgRoundId(roundId);
                            Unit unit118 = Unit.a;
                        }
                        K0();
                        Unit unit119 = Unit.a;
                    } else if (zt50Var108 != null) {
                        zt50Var108.z.c();
                        Unit unit120 = Unit.a;
                    }
                    this.b0 = roundBetResponse.getBet().getRoundId();
                }
            }
            Unit unit121 = Unit.a;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void d0() {
    }

    public final boolean d1(HeaderPayload headerPayload) {
        Context applicationContext;
        String string;
        zt50 zt50Var;
        if (Intrinsics.g(headerPayload.isBlocked(), Boolean.TRUE)) {
            Context context = getContext();
            if (context != null) {
                rlz rlzVar = rlz.d;
                ResultWrapper.GenericError genericError = new ResultWrapper.GenericError(80001, new HTTPResponse(9005, getString(R.string.game_not_available), null, null, null, null, null, 64, null));
                Function0 function0 = new Function0() { // from class: jw10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        this.a.R0();
                        return Unit.a;
                    }
                };
                kw10 kw10Var = new kw10();
                Function0 function1 = new Function0() { // from class: mw10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        zy10 zy10Var = this.a;
                        zy10Var.z0 = false;
                        zy10Var.H0();
                        zy10Var.s1();
                        return Unit.a;
                    }
                };
                context.getColor(R.color.sh_error_btn_color);
                rlzVar.c(context, genericError, function0, kw10Var, function1, 0, (1728 & 128) != 0 ? new slz() : null, (1728 & 512) != 0 ? new tlz() : new Function1() { // from class: nw10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        String str = (String) obj;
                        str.getClass();
                        this.a.S0(str);
                        return Unit.a;
                    }
                }, new ulz());
            }
            return false;
        }
        headerPayload.getCountryCode();
        String userCountryCode = headerPayload.getUserCountryCode();
        if (userCountryCode == null) {
            userCountryCode = "";
        }
        this.s1 = userCountryCode;
        String currency = headerPayload.getCurrency();
        if (currency == null) {
            currency = "";
        }
        this.t1 = currency;
        SportyGamesManager.getInstance().setPatronId(String.valueOf(headerPayload.getPatronId()));
        SportyGamesManager.getInstance().setUserId(String.valueOf(headerPayload.getId()));
        SportyGamesManager.getInstance().setUserImage(String.valueOf(headerPayload.getAvatar()));
        SportyGamesManager.getInstance().setNickName(String.valueOf(headerPayload.getNickName()));
        this.F = String.valueOf(headerPayload.getAvatar());
        String nickName = headerPayload.getNickName();
        this.H = nickName != null ? nickName : "";
        this.G = String.valueOf(headerPayload.getPatronId());
        g1();
        zt50 zt50Var2 = this.b;
        if (zt50Var2 != null) {
            zt50Var2.J.setUserDetails(this.H, this.F);
        }
        if (h1()) {
            b1().y1();
        }
        if (!this.J && (zt50Var = this.b) != null) {
            zt50Var.Q.P();
        }
        if (!this.q0 || this.d || !this.E0) {
            return true;
        }
        zt50 zt50Var3 = this.b;
        if (zt50Var3 != null) {
            zt50Var3.K.setVisibility(4);
        }
        zt50 zt50Var4 = this.b;
        if (zt50Var4 != null) {
            zt50Var4.V.setVisibility(0);
        }
        Context context2 = getContext();
        if (context2 == null || (applicationContext = context2.getApplicationContext()) == null || (string = applicationContext.getString(R.string.finding_room)) == null) {
            return true;
        }
        op5 op5Var = op5.a;
        String string2 = getString(R.string.finding_you_room_cms);
        string2.getClass();
        op5Var.getClass();
        String strB = op5.b(string2, string, null);
        zt50 zt50Var5 = this.b;
        if (zt50Var5 == null) {
            return true;
        }
        zt50Var5.V.setMessageandBG(R.color.sh_toast, strB);
        return true;
    }

    public final void e1() {
        zt50 zt50Var = this.b;
        if (zt50Var == null || zt50Var.L.getVisibility() != 0) {
            return;
        }
        zt50 zt50Var2 = this.b;
        f1(zt50Var2 != null ? zt50Var2.S : null);
        zt50 zt50Var3 = this.b;
        f1(zt50Var3 != null ? zt50Var3.z : null);
        zt50 zt50Var4 = this.b;
        f1(zt50Var4 != null ? zt50Var4.R : null);
        zt50 zt50Var5 = this.b;
        if (zt50Var5 != null) {
            zt50Var5.L.setVisibility(8);
        }
    }

    @Override // defpackage.bb
    public final void f0(m8 m8Var) {
        androidx.fragment.app.e activity;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = nzf0.a;
        if (!z2 && jCurrentTimeMillis - nzf0.b <= 500) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        androidx.fragment.app.e activity2 = getActivity();
        if (activity2 != null && !activity2.isFinishing() && (activity = getActivity()) != null && !activity.isDestroyed()) {
            this.N = false;
        }
        this.f0 = true;
    }

    public final void g1() {
        boolean z2;
        Boolean boolValueOf;
        boolean z3;
        Boolean boolValueOf2;
        qo80 binding;
        qo80 binding2;
        zt50 zt50Var;
        Integer numValueOf = Integer.valueOf(R.color.sb_black_100);
        Integer numValueOf2 = Integer.valueOf(R.color.pr_toggle_on_color);
        op5 op5Var = op5.a;
        String string = getString(R.string.music_cms);
        string.getClass();
        String string2 = getString(R.string.music_menu);
        string2.getClass();
        op5Var.getClass();
        String strB = op5.b(string, string2, null);
        MenuIconSize menuIconSize = new MenuIconSize(R.dimen._15sdp, R.dimen._12sdp);
        bw10 bw10Var = new bw10();
        SharedPreferences sharedPreferences = this.w;
        LeftMenuButton leftMenuButton = new LeftMenuButton(0, strB, R.drawable.music, menuIconSize, bw10Var, true, sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("ROCKET_MUSIC", true)) : null, numValueOf2, numValueOf, null, false, new qdj(this, 2), 1536, null);
        String string3 = getString(R.string.sound_cms);
        string3.getClass();
        String string4 = getString(R.string.sound_menu);
        string4.getClass();
        String strB2 = op5.b(string3, string4, null);
        MenuIconSize menuIconSize2 = new MenuIconSize(R.dimen._15sdp, R.dimen._12sdp);
        cw10 cw10Var = new cw10();
        SharedPreferences sharedPreferences2 = this.w;
        if (sharedPreferences2 != null) {
            z2 = true;
            boolValueOf = Boolean.valueOf(sharedPreferences2.getBoolean("ROCKET_SOUND", true));
        } else {
            z2 = true;
            boolValueOf = null;
        }
        LeftMenuButton leftMenuButton2 = new LeftMenuButton(0, strB2, R.drawable.ic_sound, menuIconSize2, cw10Var, true, boolValueOf, numValueOf2, numValueOf, null, false, new dw10(this, 0), 1536, null);
        String string5 = getString(R.string.one_tap_bet_cms);
        string5.getClass();
        String string6 = getString(R.string.onetap_bet_menu);
        string6.getClass();
        String strB3 = op5.b(string5, string6, null);
        MenuIconSize menuIconSize3 = new MenuIconSize(R.dimen._15sdp, R.dimen._10sdp);
        ew10 ew10Var = new ew10();
        SharedPreferences sharedPreferences3 = this.w;
        if (sharedPreferences3 != null) {
            z3 = false;
            boolValueOf2 = Boolean.valueOf(sharedPreferences3.getBoolean("ROCKET_ONE_TAP", false));
        } else {
            z3 = false;
            boolValueOf2 = null;
        }
        LeftMenuButton leftMenuButton3 = new LeftMenuButton(0, strB3, R.drawable.ic_one_tap_bet, menuIconSize3, ew10Var, true, boolValueOf2, numValueOf2, numValueOf, null, false, new eaa(this, 1), 1536, null);
        String string7 = getString(R.string.how_to_play_nav_cms);
        string7.getClass();
        String string8 = getString(R.string.how_to_play_menu);
        string8.getClass();
        LeftMenuButton leftMenuButton4 = new LeftMenuButton(0, op5.b(string7, string8, null), R.drawable.ic_how_to_play, new MenuIconSize(R.dimen._13sdp, R.dimen._13sdp), new fw10(this, 0), false, null, null, null, null, false, null, 3072, null);
        String string9 = getString(R.string.bet_history_cms);
        string9.getClass();
        String string10 = getString(R.string.bethistory_menu);
        string10.getClass();
        LeftMenuButton leftMenuButton5 = new LeftMenuButton(0, op5.b(string9, string10, null), R.drawable.ic_bethistory, new MenuIconSize(R.dimen._17sdp, R.dimen._17sdp), new Function0() { // from class: gw10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                zy10 zy10Var = this.a;
                if (zy10Var.i1()) {
                    zy10Var.r0 = zy10.a.c;
                    zy10Var.o1();
                } else {
                    zy10Var.l1(false);
                }
                return Unit.a;
            }
        }, false, null, null, null, null, false, null, 3072, null);
        String string11 = getString(R.string.game_limits_nav_cms);
        string11.getClass();
        String string12 = getString(R.string.game_limits);
        string12.getClass();
        List listK = kotlin.collections.b.k(leftMenuButton, leftMenuButton2, leftMenuButton3, leftMenuButton4, leftMenuButton5, new LeftMenuButton(0, op5.b(string11, string12, null), R.drawable.game_limit, new MenuIconSize(R.dimen._17sdp, R.dimen._17sdp), new Function0() { // from class: hw10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                pj60 pj60Var;
                FragmentManager supportFragmentManager;
                zy10 zy10Var = this.a;
                GameDetails gameDetails = zy10Var.B;
                wz.a("GameLimits", gameDetails != null ? gameDetails.getName() : null, "HamMenu");
                e activity = zy10Var.getActivity();
                if (!(((activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) ? null : supportFragmentManager.G(R.id.flContent)) instanceof a) && (pj60Var = zy10Var.g0) != null) {
                    Window window = pj60Var.getWindow();
                    WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes != null) {
                        attributes.gravity = 17;
                    }
                    if (attributes != null) {
                        attributes.flags &= -5;
                    }
                    Window window2 = pj60Var.getWindow();
                    if (window2 != null) {
                        window2.setAttributes(attributes);
                    }
                    Window window3 = pj60Var.getWindow();
                    if (window3 != null) {
                        window3.setBackgroundDrawableResource(R.color.dialog_bg_color);
                    }
                    pj60Var.show();
                    Window window4 = pj60Var.getWindow();
                    if (window4 != null) {
                        window4.setLayout(-1, -1);
                    }
                    pj60 pj60Var2 = zy10Var.g0;
                    if (pj60Var2 == null) {
                        Intrinsics.n("gameLimit");
                        throw null;
                    }
                    pj60Var2.setOnDismissListener(new lv80());
                }
                return Unit.a;
            }
        }, false, null, null, null, null, false, null, 3072, null));
        androidx.fragment.app.e activity = getActivity();
        if (activity != null && (zt50Var = this.b) != null) {
            SGHamburgerMenu.setup$default(zt50Var.J, new SGHamburgerMenu.b(a1(), R.string.sg_pocket_rocket, this.F, this.H, listK, new Function0() { // from class: iw10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    zt50 zt50Var2 = this.a.b;
                    if (zt50Var2 != null) {
                        zt50Var2.F.d();
                    }
                    return Unit.a;
                }
            }, new v9a(this, 1)), activity, false, null, new sje(this, 1), 8, null);
        }
        zt50 zt50Var2 = this.b;
        if (zt50Var2 != null) {
            zt50Var2.J.setPocketRocketImage();
        }
        zt50 zt50Var3 = this.b;
        if (zt50Var3 == null || (binding = zt50Var3.J.getBinding()) == null) {
            return;
        }
        TextView textView = binding.c;
        zt50 zt50Var4 = this.b;
        String strValueOf = String.valueOf((zt50Var4 == null || (binding2 = zt50Var4.J.getBinding()) == null) ? null : binding2.c.getTag());
        String string13 = getString(R.string.label_dialog_add_money);
        string13.getClass();
        textView.setText("+ ".concat(op5.c(op5Var, strValueOf, string13)));
    }

    public final boolean h1() {
        return !i1();
    }

    public final boolean i1() {
        Z0();
        return SportyGamesManager.getInstance().getUser() == null;
    }

    public final void j0(BetDetails betDetails) {
        ArrayList arrayList = this.G0;
        try {
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i2 = -1;
                    break;
                }
                Object obj = arrayList.get(i3);
                i3++;
                BetDetails betDetails2 = (BetDetails) obj;
                if (betDetails != null && betDetails2.getBetId() == betDetails.getBetId()) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                if (betDetails != null && betDetails.getCashoutCoefficient() != 0.0d) {
                    ((BetDetails) arrayList.get(i2)).setTicketStatus("WIN");
                    ((BetDetails) arrayList.get(i2)).setPayoutAmount(betDetails.getPayoutAmount());
                    ((BetDetails) arrayList.get(i2)).setCashoutCoefficient(betDetails.getCashoutCoefficient());
                    ((BetDetails) arrayList.get(i2)).setBackground(true);
                    return;
                }
                return;
            }
            if (betDetails != null) {
                String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date());
                str.getClass();
                betDetails.setCreatedAt(str);
                if (betDetails.getCashoutCoefficient() != 0.0d) {
                    betDetails.setTicketStatus("WIN");
                    betDetails.setBackground(true);
                } else if (betDetails.getRoundId() == this.O) {
                    betDetails.setTicketStatus("ONGOING");
                    String str2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date());
                    str2.getClass();
                    betDetails.setCreatedAt(str2);
                }
                arrayList.add(0, betDetails);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void j1(boolean z2) {
        CasinoLogger casinoLogger = CasinoLogger.INSTANCE;
        Pair pair = new Pair("isManualCashout", Boolean.valueOf(z2));
        GameDetails gameDetails = this.B;
        casinoLogger.logEventToCasino("CashoutClicked", vj5.a(pair, new Pair(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, gameDetails != null ? gameDetails.getName() : null), new Pair("Platform", "ANDROID")));
    }

    public final void k1() {
        int i2;
        boolean zBooleanValue;
        Context context = getContext();
        if (context != null) {
            if (i1() || (h1() && this.g1)) {
                this.q0 = true;
                boolean z2 = h1() && this.g1;
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new rz10(this, z2, true, null), 3);
            }
            if (i1() || this.g1) {
                return;
            }
            zt50 zt50Var = this.b;
            if (zt50Var == null || zt50Var.Q.getVisibility() != 0) {
                ArrayList<OnboardingItem> arrayListA = sny.a(context, "pocket-rockets");
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
                boolean z3 = i2 > 0;
                this.q0 = true;
                if (zBooleanValue || z3) {
                    this.d = false;
                    boolean zH1 = h1();
                    pfd pfdVar2 = fse.a;
                    ej5.c(w5b.a(gku.a), null, null, new rz10(this, zH1, false, null), 3);
                    return;
                }
                this.d = true;
                if (this.B != null) {
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    androidx.fragment.app.a aVarA = oke.a(childFragmentManager, childFragmentManager);
                    op5.a.getClass();
                    List<? extends File> list = op5.b;
                    o2g o2gVar = o2g.a;
                    o2gVar.getClass();
                    com.sportygames.commons.views.a aVar = new com.sportygames.commons.views.a();
                    aVar.c = "pocket-rockets";
                    aVar.d = i2;
                    aVar.w = list;
                    aVar.z = o2gVar;
                    aVar.A = false;
                    aVarA.f(R.id.onboarding_images, aVar, null);
                    aVarA.d();
                }
                zt50 zt50Var2 = this.b;
                if (zt50Var2 != null) {
                    zt50Var2.P.setVisibility(0);
                }
            }
        }
    }

    public final void l1(boolean z2) {
        FragmentManager supportFragmentManager;
        GameDetails gameDetails = this.B;
        Fragment fragmentG = null;
        wz.a("BetHistory", gameDetails != null ? gameDetails.getName() : null, "HamMenu");
        androidx.fragment.app.e activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            fragmentG = supportFragmentManager.G(R.id.flContent);
        }
        if (z2 || !(fragmentG instanceof com.sportygames.commons.components.a)) {
            B1();
        }
    }

    public final void m0() {
        eoa0 eoa0VarZ0 = Z0();
        int i2 = 0;
        if (!eoa0VarZ0.y) {
            eoa0VarZ0.a = new ema();
            if (SportyGamesManager.getInstance() != null && SportyGamesManager.getInstance().getCountry() != null) {
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (SportyGamesManager.getInstance() != null && SportyGamesManager.getInstance().getUser() != null) {
                    arrayList.add(new e1e0("cookie", "accessToken=".concat(SportyGamesManager.getInstance().getUser().a)));
                }
                arrayList.add(new e1e0("content-type", Constants.APP_JSON_PAYLOAD_TYPE));
                arrayList.add(new e1e0("accept-encoding", "gzip"));
                arrayList.add(new e1e0("country-code", SportyGamesManager.getInstance().getCountry()));
                String property = System.getProperty("http.agent");
                String strConcat = property != null ? property.concat("-") : "";
                SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                arrayList.add(new e1e0("user-agent", strConcat + (sportyGamesManager != null ? Long.valueOf(sportyGamesManager.getVersionCode()) : null)));
                arrayList.add(new e1e0("x-platform", u3w.a));
                try {
                    Context applicationContext = SportyGamesManager.getApplicationContext();
                    if (applicationContext != null) {
                        arrayList.add(new e1e0("download-source", SportyGamesManager.getInstance().isSideLoading(applicationContext) ? "external-link" : "google-play-store"));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                ua.naiksoftware.stomp.a aVar = pjc.j;
                aVar.e = 15000;
                aVar.d = 15000;
                int i3 = 1;
                u2i u2iVar = new u2i(pjc.i.i(qt1.b), new rja0(new iu10(eoa0VarZ0, i3)));
                slr slrVar = new slr(new gp0(new h8a(eoa0VarZ0, 2), 1), new gna0(), new vq4());
                u2iVar.h(slrVar);
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    e1e0 e1e0Var = (e1e0) obj;
                    linkedHashMap.put(e1e0Var.a, e1e0Var.b);
                }
                pjc pjcVar = pjc.a;
                if (!pjcVar.d() && !pjcVar.d()) {
                    fmy fmyVar = new fmy(yk10.a(SportyGamesManager.getInstance().getBaseUrlSocket(), "games/pocket-rockets/v1/game"), linkedHashMap, new OkHttpClient());
                    pjc.k = fmyVar;
                    ucy<String> ucyVarF = fmyVar.f();
                    new jjc(0);
                    ojc ojcVar = new ojc();
                    ucyVarF.getClass();
                    tdy tdyVar = new tdy(ucyVarF, ojcVar);
                    final kic kicVar = new kic(i2);
                    idy idyVar = new idy(tdyVar, new nm20() { // from class: lic
                        @Override // defpackage.nm20
                        public final boolean test(Object obj2) {
                            obj2.getClass();
                            return ((Boolean) kicVar.invoke(obj2)).booleanValue();
                        }
                    });
                    final wr3 wr3Var = new wr3(i3);
                    cdy cdyVar = new cdy(idyVar, new pya() { // from class: mic
                        @Override // defpackage.pya
                        public final void accept(Object obj2) {
                            wr3Var.invoke(obj2);
                        }
                    });
                    final nic nicVar = new nic();
                    idy idyVar2 = new idy(cdyVar, new nm20() { // from class: oic
                        @Override // defpackage.nm20
                        public final boolean test(Object obj2) {
                            obj2.getClass();
                            return ((Boolean) nicVar.invoke(obj2)).booleanValue();
                        }
                    });
                    final pic picVar = new pic(i2);
                    pya pyaVar = new pya() { // from class: qic
                        @Override // defpackage.pya
                        public final void accept(Object obj2) {
                            picVar.invoke(obj2);
                        }
                    };
                    ljc ljcVar = new ljc();
                    taj.d dVar = taj.c;
                    rlr rlrVar = new rlr(pyaVar, ljcVar, dVar);
                    idyVar2.a(rlrVar);
                    pjc.h = rlrVar;
                    x2 x2Var = pjc.k;
                    if (x2Var == null) {
                        Intrinsics.n("connectionProvider");
                        throw null;
                    }
                    l830<bbs> l830Var = x2Var.a;
                    final mjc mjcVar = new mjc(arrayList);
                    pya pyaVar2 = new pya() { // from class: njc
                        @Override // defpackage.pya
                        public final void accept(Object obj2) {
                            mjcVar.invoke(obj2);
                        }
                    };
                    l830Var.getClass();
                    rlr rlrVar2 = new rlr(pyaVar2, taj.e, dVar);
                    l830Var.a(rlrVar2);
                    pjc.g = rlrVar2;
                }
                ema emaVar = eoa0VarZ0.a;
                if (emaVar != null) {
                    emaVar.b(slrVar);
                }
            }
        }
        X0().x1();
        zt50 zt50Var = this.b;
        if (zt50Var != null) {
            zt50Var.S.setBetPlaced(false);
        }
        zt50 zt50Var2 = this.b;
        if (zt50Var2 != null) {
            zt50Var2.R.setBetPlaced(false);
        }
        zt50 zt50Var3 = this.b;
        if (zt50Var3 != null) {
            zt50Var3.z.setBetPlaced(false);
        }
        zt50 zt50Var4 = this.b;
        if (zt50Var4 != null) {
            zt50Var4.S.setBetInProgress(false);
        }
        zt50 zt50Var5 = this.b;
        if (zt50Var5 != null) {
            zt50Var5.R.setBetInProgress(false);
        }
        zt50 zt50Var6 = this.b;
        if (zt50Var6 != null) {
            zt50Var6.z.setBetInProgress(false);
        }
    }

    public final void m1() {
        Context context = getContext();
        if (context != null) {
            Intent intent = new Intent(context, (Class<?>) ChatActivity.class);
            intent.putExtra(getString(R.string.room_id), this.k1);
            intent.putExtra(getString(R.string.user_id), this.G);
            intent.putExtra(getString(R.string.bot_id), this.l1);
            intent.putExtra(getString(R.string.color), R.color.toolbar_strip_bottle);
            String string = getString(R.string.game_name);
            GameDetails gameDetails = this.B;
            intent.putExtra(string, gameDetails != null ? gameDetails.getName() : null);
            intent.putExtra(getString(R.string.sound), this.B);
            String string2 = getString(R.string.sound_on);
            SharedPreferences sharedPreferences = this.w;
            intent.putExtra(string2, sharedPreferences != null ? sharedPreferences.getBoolean("ROCKET_SOUND", false) : false);
            intent.putExtra("fragment_to_load", "fragment_pocket_rocket_component");
            context.startActivity(intent);
            this.d0 = true;
            GameDetails gameDetails2 = this.B;
            wz.a("ChatClicked", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
        }
    }

    public final void n1() {
        double minAmount;
        double maxAmount;
        xi60 xi60Var;
        this.j1 = new xi60();
        GameDetails gameDetails = this.B;
        wz.a("FBGIconClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
        xi60 xi60Var2 = this.j1;
        if (xi60Var2 == null || xi60Var2.isAdded() || this.M == null) {
            return;
        }
        String str = this.i1;
        int i2 = 1;
        if (Intrinsics.g(str, "RED")) {
            List<DetailResponse> list = this.M;
            if (list == null) {
                Intrinsics.n("gameDetailResponse");
                throw null;
            }
            minAmount = list.get(0).getMinAmount();
            List<DetailResponse> list2 = this.M;
            if (list2 == null) {
                Intrinsics.n("gameDetailResponse");
                throw null;
            }
            maxAmount = list2.get(0).getMaxAmount();
        } else {
            boolean zG = Intrinsics.g(str, "PURPLE");
            List<DetailResponse> list3 = this.M;
            if (zG) {
                if (list3 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                minAmount = list3.get(1).getMinAmount();
                List<DetailResponse> list4 = this.M;
                if (list4 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                maxAmount = list4.get(1).getMaxAmount();
            } else {
                if (list3 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                minAmount = list3.get(2).getMinAmount();
                List<DetailResponse> list5 = this.M;
                if (list5 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                maxAmount = list5.get(2).getMaxAmount();
            }
        }
        final double d2 = maxAmount;
        final double d3 = minAmount;
        androidx.fragment.app.e activity = getActivity();
        if (activity == null || (xi60Var = this.j1) == null) {
            return;
        }
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        xi60Var.q0(supportFragmentManager, new Function0() { // from class: rw10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List<GiftItem> entityList;
                xi60 xi60Var3;
                zy10 zy10Var = this.a;
                PromotionGiftsResponse promotionGiftsResponse = zy10Var.l0;
                if (promotionGiftsResponse != null && (entityList = promotionGiftsResponse.getEntityList()) != null && (xi60Var3 = zy10Var.j1) != null) {
                    xi60Var3.r0(entityList, d2, d3, 0.0d);
                }
                return Unit.a;
            }
        }, new gaj() { // from class: sw10
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                zy10 zy10Var = this.a;
                GiftItem giftItem = (GiftItem) obj;
                double dDoubleValue = ((Double) obj2).doubleValue();
                ((Boolean) obj3).getClass();
                giftItem.getClass();
                try {
                    String str2 = zy10Var.i1;
                    if (Intrinsics.g(str2, "RED")) {
                        zt50 zt50Var = zy10Var.b;
                        if (zt50Var != null) {
                            zt50Var.S.setFBG(giftItem, false, dDoubleValue);
                        }
                    } else {
                        boolean zG2 = Intrinsics.g(str2, "PURPLE");
                        zt50 zt50Var2 = zy10Var.b;
                        if (zG2) {
                            if (zt50Var2 != null) {
                                zt50Var2.R.setFBG(giftItem, false, dDoubleValue);
                            }
                        } else if (zt50Var2 != null) {
                            zt50Var2.z.setFBG(giftItem, false, dDoubleValue);
                        }
                    }
                    zy10Var.K0();
                    xi60 xi60Var3 = zy10Var.j1;
                    if (xi60Var3 != null) {
                        xi60Var3.dismiss();
                    }
                    zy10Var.j1 = null;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                return Unit.a;
            }
        }, new foo(this, i2));
    }

    public final void o0(int i2) {
        zt50 zt50Var = this.b;
        if (zt50Var != null) {
            p0(i2, zt50Var.V);
        }
        zt50 zt50Var2 = this.b;
        if (zt50Var2 != null) {
            p0(i2, zt50Var2.C.a);
        }
        zt50 zt50Var3 = this.b;
        if (zt50Var3 != null) {
            p0(i2, zt50Var3.I);
        }
        zt50 zt50Var4 = this.b;
        if (zt50Var4 != null) {
            p0(i2, zt50Var4.O);
        }
    }

    public final void o1() {
        Z0().c.j("go_to_login");
        this.e0 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof mke) {
            this.M0 = (mke) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.rocket_fragment, viewGroup, false);
        int i2 = R.id.all_bet_header;
        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.all_bet_header, viewInflate);
        if (constraintLayout != null) {
            i2 = R.id.all_bet_text;
            TextView textView = (TextView) h5e.a(R.id.all_bet_text, viewInflate);
            if (textView != null) {
                i2 = R.id.all_bets_value;
                TextView textView2 = (TextView) h5e.a(R.id.all_bets_value, viewInflate);
                if (textView2 != null) {
                    i2 = R.id.allUserBet;
                    PrAllUserBet prAllUserBet = (PrAllUserBet) h5e.a(R.id.allUserBet, viewInflate);
                    if (prAllUserBet != null) {
                        i2 = R.id.bet_container;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.bet_container, viewInflate);
                        if (constraintLayout2 != null) {
                            i2 = R.id.bet_container_line_2;
                            View viewA = h5e.a(R.id.bet_container_line_2, viewInflate);
                            if (viewA != null) {
                                i2 = R.id.bet_container_line_3;
                                View viewA2 = h5e.a(R.id.bet_container_line_3, viewInflate);
                                if (viewA2 != null) {
                                    i2 = R.id.bet_space;
                                    View viewA3 = h5e.a(R.id.bet_space, viewInflate);
                                    if (viewA3 != null) {
                                        i2 = R.id.bet_tab;
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.bet_tab, viewInflate);
                                        if (constraintLayout3 != null) {
                                            i2 = R.id.blue;
                                            BetContainer betContainer = (BetContainer) h5e.a(R.id.blue, viewInflate);
                                            if (betContainer != null) {
                                                i2 = R.id.cashAddTxt;
                                                TextView textView3 = (TextView) h5e.a(R.id.cashAddTxt, viewInflate);
                                                if (textView3 != null) {
                                                    i2 = R.id.cashMinusTxt;
                                                    TextView textView4 = (TextView) h5e.a(R.id.cashMinusTxt, viewInflate);
                                                    if (textView4 != null) {
                                                        i2 = R.id.cashOutToast;
                                                        View viewA4 = h5e.a(R.id.cashOutToast, viewInflate);
                                                        if (viewA4 != null) {
                                                            int i3 = R.id.at;
                                                            TextView textView5 = (TextView) h5e.a(R.id.at, viewA4);
                                                            if (textView5 != null) {
                                                                i3 = R.id.card;
                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.card, viewA4);
                                                                if (constraintLayout4 != null) {
                                                                    CardView cardView = (CardView) viewA4;
                                                                    i3 = R.id.coeff;
                                                                    TextView textView6 = (TextView) h5e.a(R.id.coeff, viewA4);
                                                                    if (textView6 != null) {
                                                                        i3 = R.id.currency;
                                                                        TextView textView7 = (TextView) h5e.a(R.id.currency, viewA4);
                                                                        if (textView7 != null) {
                                                                            i3 = R.id.gift_amount;
                                                                            TextView textView8 = (TextView) h5e.a(R.id.gift_amount, viewA4);
                                                                            if (textView8 != null) {
                                                                                i3 = R.id.gift_amount2;
                                                                                TextView textView9 = (TextView) h5e.a(R.id.gift_amount2, viewA4);
                                                                                if (textView9 != null) {
                                                                                    i3 = R.id.image1;
                                                                                    if (((ImageView) h5e.a(R.id.image1, viewA4)) != null) {
                                                                                        i3 = R.id.image2;
                                                                                        if (((ImageView) h5e.a(R.id.image2, viewA4)) != null) {
                                                                                            i3 = R.id.layout;
                                                                                            if (((LinearLayout) h5e.a(R.id.layout, viewA4)) != null) {
                                                                                                i3 = R.id.layout_gift_amt;
                                                                                                LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.layout_gift_amt, viewA4);
                                                                                                if (linearLayout != null) {
                                                                                                    i3 = R.id.layout_gift_amt2;
                                                                                                    LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.layout_gift_amt2, viewA4);
                                                                                                    if (linearLayout2 != null) {
                                                                                                        i3 = R.id.message;
                                                                                                        TextView textView10 = (TextView) h5e.a(R.id.message, viewA4);
                                                                                                        if (textView10 != null) {
                                                                                                            i3 = R.id.rocket_image;
                                                                                                            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.rocket_image, viewA4);
                                                                                                            if (appCompatImageView != null) {
                                                                                                                i3 = R.id.total_amount;
                                                                                                                TextView textView11 = (TextView) h5e.a(R.id.total_amount, viewA4);
                                                                                                                if (textView11 != null) {
                                                                                                                    i3 = R.id.total_amount2;
                                                                                                                    TextView textView12 = (TextView) h5e.a(R.id.total_amount2, viewA4);
                                                                                                                    if (textView12 != null) {
                                                                                                                        i3 = R.id.win_amount;
                                                                                                                        TextView textView13 = (TextView) h5e.a(R.id.win_amount, viewA4);
                                                                                                                        if (textView13 != null) {
                                                                                                                            i3 = R.id.win_amount2;
                                                                                                                            TextView textView14 = (TextView) h5e.a(R.id.win_amount2, viewA4);
                                                                                                                            if (textView14 != null) {
                                                                                                                                i3 = R.id.with;
                                                                                                                                TextView textView15 = (TextView) h5e.a(R.id.with, viewA4);
                                                                                                                                if (textView15 != null) {
                                                                                                                                    i3 = R.id.you_win_text;
                                                                                                                                    TextView textView16 = (TextView) h5e.a(R.id.you_win_text, viewA4);
                                                                                                                                    if (textView16 != null) {
                                                                                                                                        i3 = R.id.you_win_text2;
                                                                                                                                        TextView textView17 = (TextView) h5e.a(R.id.you_win_text2, viewA4);
                                                                                                                                        if (textView17 != null) {
                                                                                                                                            r820 r820Var = new r820(cardView, textView5, constraintLayout4, textView6, textView7, textView8, textView9, linearLayout, linearLayout2, textView10, appCompatImageView, textView11, textView12, textView13, textView14, textView15, textView16, textView17);
                                                                                                                                            i2 = R.id.compose_view;
                                                                                                                                            ComposeView composeView = (ComposeView) h5e.a(R.id.compose_view, viewInflate);
                                                                                                                                            if (composeView != null) {
                                                                                                                                                i2 = R.id.coord;
                                                                                                                                                if (((CoordinatorLayout) h5e.a(R.id.coord, viewInflate)) != null) {
                                                                                                                                                    i2 = R.id.default_screen;
                                                                                                                                                    CardView cardView2 = (CardView) h5e.a(R.id.default_screen, viewInflate);
                                                                                                                                                    if (cardView2 != null) {
                                                                                                                                                        i2 = R.id.drawer_layout;
                                                                                                                                                        DrawerLayout drawerLayout = (DrawerLayout) h5e.a(R.id.drawer_layout, viewInflate);
                                                                                                                                                        if (drawerLayout != null) {
                                                                                                                                                            i2 = R.id.fbg_layout;
                                                                                                                                                            FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.fbg_layout, viewInflate);
                                                                                                                                                            if (frameLayout != null) {
                                                                                                                                                                i2 = R.id.flContent;
                                                                                                                                                                if (((FrameLayout) h5e.a(R.id.flContent, viewInflate)) != null) {
                                                                                                                                                                    i2 = R.id.games_campaign_progress;
                                                                                                                                                                    ComposeView composeView2 = (ComposeView) h5e.a(R.id.games_campaign_progress, viewInflate);
                                                                                                                                                                    if (composeView2 != null) {
                                                                                                                                                                        i2 = R.id.gift_toast_bar;
                                                                                                                                                                        GiftToast giftToast = (GiftToast) h5e.a(R.id.gift_toast_bar, viewInflate);
                                                                                                                                                                        if (giftToast != null) {
                                                                                                                                                                            i2 = R.id.hamburger_menu;
                                                                                                                                                                            SGHamburgerMenu sGHamburgerMenu = (SGHamburgerMenu) h5e.a(R.id.hamburger_menu, viewInflate);
                                                                                                                                                                            if (sGHamburgerMenu != null) {
                                                                                                                                                                                i2 = R.id.header;
                                                                                                                                                                                PrHeaderContainer prHeaderContainer = (PrHeaderContainer) h5e.a(R.id.header, viewInflate);
                                                                                                                                                                                if (prHeaderContainer != null) {
                                                                                                                                                                                    i2 = R.id.keypad;
                                                                                                                                                                                    SHKeypadContainer sHKeypadContainer = (SHKeypadContainer) h5e.a(R.id.keypad, viewInflate);
                                                                                                                                                                                    if (sHKeypadContainer != null) {
                                                                                                                                                                                        i2 = R.id.multiplier;
                                                                                                                                                                                        MultiplierContainer multiplierContainer = (MultiplierContainer) h5e.a(R.id.multiplier, viewInflate);
                                                                                                                                                                                        if (multiplierContainer != null) {
                                                                                                                                                                                            i2 = R.id.my_bet_header;
                                                                                                                                                                                            TextView textView18 = (TextView) h5e.a(R.id.my_bet_header, viewInflate);
                                                                                                                                                                                            if (textView18 != null) {
                                                                                                                                                                                                i2 = R.id.navigationView;
                                                                                                                                                                                                if (((NavigationView) h5e.a(R.id.navigationView, viewInflate)) != null) {
                                                                                                                                                                                                    i2 = R.id.networkToast;
                                                                                                                                                                                                    SHToastContainer sHToastContainer = (SHToastContainer) h5e.a(R.id.networkToast, viewInflate);
                                                                                                                                                                                                    if (sHToastContainer != null) {
                                                                                                                                                                                                        i2 = R.id.onboarding_images;
                                                                                                                                                                                                        FrameLayout frameLayout2 = (FrameLayout) h5e.a(R.id.onboarding_images, viewInflate);
                                                                                                                                                                                                        if (frameLayout2 != null) {
                                                                                                                                                                                                            i2 = R.id.progress_meter_component;
                                                                                                                                                                                                            ProgressMeterComponent progressMeterComponent = (ProgressMeterComponent) h5e.a(R.id.progress_meter_component, viewInflate);
                                                                                                                                                                                                            if (progressMeterComponent != null) {
                                                                                                                                                                                                                i2 = R.id.purple;
                                                                                                                                                                                                                BetContainer betContainer2 = (BetContainer) h5e.a(R.id.purple, viewInflate);
                                                                                                                                                                                                                if (betContainer2 != null) {
                                                                                                                                                                                                                    i2 = R.id.red;
                                                                                                                                                                                                                    BetContainer betContainer3 = (BetContainer) h5e.a(R.id.red, viewInflate);
                                                                                                                                                                                                                    if (betContainer3 != null) {
                                                                                                                                                                                                                        i2 = R.id.rocket_layout;
                                                                                                                                                                                                                        ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.rocket_layout, viewInflate);
                                                                                                                                                                                                                        if (constraintLayout5 != null) {
                                                                                                                                                                                                                            i2 = R.id.round_bet_space;
                                                                                                                                                                                                                            View viewA5 = h5e.a(R.id.round_bet_space, viewInflate);
                                                                                                                                                                                                                            if (viewA5 != null) {
                                                                                                                                                                                                                                i2 = R.id.toast;
                                                                                                                                                                                                                                SHToastContainer sHToastContainer2 = (SHToastContainer) h5e.a(R.id.toast, viewInflate);
                                                                                                                                                                                                                                if (sHToastContainer2 != null) {
                                                                                                                                                                                                                                    i2 = R.id.tooltip;
                                                                                                                                                                                                                                    DepositTooltipComponent depositTooltipComponent = (DepositTooltipComponent) h5e.a(R.id.tooltip, viewInflate);
                                                                                                                                                                                                                                    if (depositTooltipComponent != null) {
                                                                                                                                                                                                                                        i2 = R.id.top_win;
                                                                                                                                                                                                                                        PrTopWin prTopWin = (PrTopWin) h5e.a(R.id.top_win, viewInflate);
                                                                                                                                                                                                                                        if (prTopWin != null) {
                                                                                                                                                                                                                                            i2 = R.id.top_win_header;
                                                                                                                                                                                                                                            TextView textView19 = (TextView) h5e.a(R.id.top_win_header, viewInflate);
                                                                                                                                                                                                                                            if (textView19 != null) {
                                                                                                                                                                                                                                                i2 = R.id.userBet;
                                                                                                                                                                                                                                                PrUserBet prUserBet = (PrUserBet) h5e.a(R.id.userBet, viewInflate);
                                                                                                                                                                                                                                                if (prUserBet != null) {
                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout6 = (ConstraintLayout) viewInflate;
                                                                                                                                                                                                                                                    this.b = new zt50(constraintLayout6, constraintLayout, textView, textView2, prAllUserBet, constraintLayout2, viewA, viewA2, viewA3, constraintLayout3, betContainer, textView3, textView4, r820Var, composeView, cardView2, drawerLayout, frameLayout, composeView2, giftToast, sGHamburgerMenu, prHeaderContainer, sHKeypadContainer, multiplierContainer, textView18, sHToastContainer, frameLayout2, progressMeterComponent, betContainer2, betContainer3, constraintLayout5, viewA5, sHToastContainer2, depositTooltipComponent, prTopWin, textView19, prUserBet);
                                                                                                                                                                                                                                                    return constraintLayout6;
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
                                                            bmy.a("Missing required view with ID: ".concat(viewA4.getResources().getResourceName(i3)));
                                                            return null;
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

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        pjc.l.j("");
        Z0().x1();
        if (getView() != null) {
            Z0().A.l(getViewLifecycleOwner());
        }
        this.b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (getView() != null) {
            Z0().A.l(getViewLifecycleOwner());
            Z0().A.l(getViewLifecycleOwner());
        }
        rlz.d.a = null;
        zt50 zt50Var = this.b;
        if (zt50Var != null) {
            zt50Var.M.removeAllViews();
        }
        zt50 zt50Var2 = this.b;
        if (zt50Var2 != null) {
            MultiplierContainer multiplierContainer = zt50Var2.M;
            multiplierContainer.y.invoke();
            gqw gqwVar = multiplierContainer.binding;
            if (gqwVar != null) {
                gqwVar.b.clearAnimation();
            }
            gqw gqwVar2 = multiplierContainer.binding;
            if (gqwVar2 != null) {
                gqwVar2.c.clearAnimation();
            }
            gqw gqwVar3 = multiplierContainer.binding;
            if (gqwVar3 != null) {
                gqwVar3.e0.clearAnimation();
            }
            ObjectAnimator objectAnimator = multiplierContainer.T;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ObjectAnimator objectAnimator2 = multiplierContainer.S;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            ObjectAnimator objectAnimator3 = multiplierContainer.U;
            if (objectAnimator3 != null) {
                objectAnimator3.cancel();
            }
            w5b.c(multiplierContainer.d, null);
            multiplierContainer.a0.cancel();
            gqw gqwVar4 = multiplierContainer.binding;
            if (gqwVar4 != null) {
                gqwVar4.V.clearAnimation();
            }
            gqw gqwVar5 = multiplierContainer.binding;
            if (gqwVar5 != null) {
                gqwVar5.M.clearAnimation();
            }
            gqw gqwVar6 = multiplierContainer.binding;
            if (gqwVar6 != null) {
                gqwVar6.f.clearAnimation();
            }
            w5b.c(multiplierContainer.z, null);
            multiplierContainer.A.cancel();
            multiplierContainer.B.cancel();
            multiplierContainer.C.cancel();
            ScaleAnimation scaleAnimation = multiplierContainer.c0;
            if (scaleAnimation != null) {
                scaleAnimation.cancel();
            }
            multiplierContainer.i();
            w5b.c(multiplierContainer.V, null);
        }
        Z0().x1();
        SportyGamesManager.getInstance().removeAccountUpdatedListener(this);
        zt50 zt50Var3 = this.b;
        if (zt50Var3 != null) {
            zt50Var3.Q.N();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (this.e0) {
            return;
        }
        p1();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        zt50 zt50Var;
        String name;
        String name2;
        q8i0 q8i0Var = this.V0;
        int i2 = 1;
        if (this.e0) {
            SharedPreferences sharedPreferences = this.w;
            Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("ROCKET_MUSIC", true)) : null;
            zt50 zt50Var2 = this.b;
            if (zt50Var2 != null) {
                ProgressMeterComponent progressMeterComponent = zt50Var2.Q;
                ypa0 ypa0VarA1 = a1();
                String string = getString(R.string.bg_music);
                string.getClass();
                progressMeterComponent.K(ypa0VarA1, boolValueOf, string);
            }
        } else {
            if (!this.d0) {
                this.p1 = true;
                zt50 zt50Var3 = this.b;
                if (zt50Var3 != null) {
                    zt50Var3.M.j0 = false;
                }
            }
            if (this.p0 && pjc.a.d() && !this.d0) {
                Z0().x1();
                ema emaVar = Z0().a;
                if (emaVar != null) {
                    emaVar.dispose();
                }
            }
            if (this.q0) {
                s1();
                SharedPreferences sharedPreferences2 = this.w;
                Boolean boolValueOf2 = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("ROCKET_MUSIC", true)) : null;
                zt50 zt50Var4 = this.b;
                if (zt50Var4 != null) {
                    ProgressMeterComponent progressMeterComponent2 = zt50Var4.Q;
                    ypa0 ypa0VarA2 = a1();
                    String string2 = getString(R.string.bg_music);
                    string2.getClass();
                    progressMeterComponent2.K(ypa0VarA2, boolValueOf2, string2);
                }
            }
            try {
                GameDetails gameDetails = this.B;
                String str = "";
                String str2 = (gameDetails == null || (name2 = gameDetails.getName()) == null) ? "" : name2;
                androidx.fragment.app.e activity = getActivity();
                ibs viewLifecycleOwner = getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                zt50 zt50Var5 = this.b;
                ra6.b(str2, activity, viewLifecycleOwner, zt50Var5 != null ? zt50Var5.H : null, this.O0, X0(), (db6) q8i0Var.getValue(), p58.a, null, new tld0(this.B, new cgj(this, i2), new i(0, this, zy10.class, "showActiveBetsToast", "showActiveBetsToast()V", 0)), new kgj(this, i2), new nro(this, 2), null, 17920);
                GameDetails gameDetails2 = this.B;
                if (gameDetails2 != null && (name = gameDetails2.getName()) != null) {
                    str = name;
                }
                ibs viewLifecycleOwner2 = getViewLifecycleOwner();
                viewLifecycleOwner2.getClass();
                ra6.c(str, viewLifecycleOwner2, (db6) q8i0Var.getValue(), X0());
                X0().x1();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (this.p0 && !this.q0) {
                zt50 zt50Var6 = this.b;
                if (zt50Var6 != null) {
                    zt50Var6.Q.setVisibility(8);
                }
                zt50 zt50Var7 = this.b;
                if (zt50Var7 != null) {
                    zt50Var7.Q.N();
                }
                this.N = false;
                zt50 zt50Var8 = this.b;
                if (zt50Var8 != null) {
                    zt50Var8.E.setVisibility(8);
                }
                this.p0 = false;
                this.q0 = true;
                SharedPreferences sharedPreferences3 = this.w;
                Boolean boolValueOf3 = sharedPreferences3 != null ? Boolean.valueOf(sharedPreferences3.getBoolean("ROCKET_SOUND", true)) : null;
                if (getContext() != null) {
                    if (getContext() != null && (zt50Var = this.b) != null) {
                        ProgressMeterComponent progressMeterComponent3 = zt50Var.Q;
                        fq5 fq5Var = this.z;
                        String languageCode = SportyGamesManager.getInstance().getLanguageCode();
                        languageCode.getClass();
                        progressMeterComponent3.E(fq5Var, this.c, this.A, languageCode);
                    }
                    zt50 zt50Var9 = this.b;
                    if (zt50Var9 != null) {
                        ProgressMeterComponent progressMeterComponent4 = zt50Var9.Q;
                        ypa0 ypa0VarA3 = a1();
                        String string3 = getString(R.string.bg_music);
                        string3.getClass();
                        progressMeterComponent4.K(ypa0VarA3, boolValueOf3, string3);
                    }
                }
            }
            try {
                zt50 zt50Var10 = this.b;
                if (zt50Var10 == null || zt50Var10.Q.getVisibility() != 0) {
                    V0();
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        if (this.f0) {
            this.e0 = false;
            this.f0 = false;
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        if (!this.e0) {
            F1();
        }
        if (this.b != null) {
            a1().I1();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        jo80 binding;
        String name;
        nk2 binding2;
        nk2 binding3;
        nk2 binding4;
        nk2 binding5;
        nk2 binding6;
        nk2 binding7;
        jo80 binding8;
        gqw binding9;
        ssw<Boolean> blueRocketFired;
        ssw<Boolean> purpleRocketFired;
        ssw<Boolean> redRocketFired;
        ssw<Boolean> sswVar;
        ssw<Boolean> sswVar2;
        ssw<LoadingState<List<File>>> sswVar3;
        ssw<Integer> liveData;
        Resources resources;
        String[] stringArray;
        jo80 binding10;
        jo80 binding11;
        View viewFindViewWithTag;
        Window window;
        view.getClass();
        super.onViewCreated(view, bundle);
        Context context = getContext();
        int i2 = 2;
        int i3 = 0;
        if (context != null) {
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
            this.z = (fq5) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            this.w = un20.a(context);
            SportyGamesManager.getInstance().addAccountUpdatedListener(this);
            SportyGamesManager.getInstance().setScreenName("sportygames/pocket-rockets");
            SharedPreferences sharedPreferences = this.w;
            this.y = sharedPreferences != null ? sharedPreferences.edit() : null;
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                zpe0 zpe0Var = zpe0.a;
                elf.a(activity, new aqe0(0, 0, 2, zpe0Var), new aqe0(0, 0, 2, zpe0Var));
            }
            androidx.fragment.app.e activity2 = getActivity();
            View decorView = (activity2 == null || (window = activity2.getWindow()) == null) ? null : window.getDecorView();
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup != null && (viewFindViewWithTag = viewGroup.findViewWithTag("status_bar_background")) != null) {
                viewGroup.removeView(viewFindViewWithTag);
            }
            zt50 zt50Var = this.b;
            if (zt50Var != null) {
                final PrHeaderContainer prHeaderContainer = zt50Var.K;
                prHeaderContainer.setBackgroundColor(prHeaderContainer.getContext().getColor(R.color.pr_background));
                zmy zmyVar = new zmy() { // from class: cv10
                    @Override // defpackage.zmy
                    public final l8j0 b(View view2, l8j0 l8j0Var) {
                        view2.getClass();
                        zy10.n0(this, l8j0Var, prHeaderContainer);
                        return l8j0Var;
                    }
                };
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                r6i0.d.n(prHeaderContainer, zmyVar);
                if (!prHeaderContainer.isLaidOut() || prHeaderContainer.isLayoutRequested()) {
                    prHeaderContainer.addOnLayoutChangeListener(new bz10(prHeaderContainer, this));
                } else {
                    l8j0 l8j0VarA = r6i0.e.a(prHeaderContainer);
                    if (l8j0VarA != null) {
                        n0(this, l8j0VarA, prHeaderContainer);
                    }
                }
                if (prHeaderContainer.isAttachedToWindow()) {
                    r6i0.c.c(prHeaderContainer);
                } else {
                    prHeaderContainer.addOnAttachStateChangeListener(new az10(prHeaderContainer));
                }
            }
        }
        op5.a.getClass();
        String str = this.A;
        op5.c = str;
        boolean zI1 = i1();
        zt50 zt50Var2 = this.b;
        if (zI1) {
            if (zt50Var2 != null && (binding11 = zt50Var2.K.getBinding()) != null) {
                binding11.A.setVisibility(4);
            }
            zt50 zt50Var3 = this.b;
            if (zt50Var3 != null && (binding10 = zt50Var3.K.getBinding()) != null) {
                binding10.z.setVisibility(4);
            }
            zt50 zt50Var4 = this.b;
            if (zt50Var4 != null) {
                zt50Var4.W.setVisibility(4);
            }
        } else if (zt50Var2 != null && (binding = zt50Var2.K.getBinding()) != null) {
            gr60.a(binding.z, new gy10());
        }
        v1();
        zt50 zt50Var5 = this.b;
        if (zt50Var5 != null) {
            zt50Var5.Q.E(this.z, this.c, str, this.k0);
        }
        zt50 zt50Var6 = this.b;
        if (zt50Var6 != null) {
            zt50Var6.b.setEnabled(false);
        }
        zt50 zt50Var7 = this.b;
        if (zt50Var7 != null) {
            zt50Var7.e.setVisibility(0);
        }
        ej5.c(ebs.a(getLifecycle()), null, null, new qz10(this, null), 3);
        fn1 fn1VarB1 = b1();
        GameDetails gameDetails = this.B;
        if (gameDetails == null || (name = gameDetails.getName()) == null) {
            name = "";
        }
        ej5.c(o8i0.d(fn1VarB1), null, null, new an1(fn1VarB1, name, null), 3);
        Context context2 = getContext();
        int length = ((context2 == null || (resources = context2.getResources()) == null || (stringArray = resources.getStringArray(R.array.pocket_rocket_array)) == null) ? 0 : stringArray.length) + (h1() ? 11 : 8);
        zt50 zt50Var8 = this.b;
        if (zt50Var8 != null) {
            zt50Var8.Q.setVisibility(0);
        }
        zt50 zt50Var9 = this.b;
        if (zt50Var9 != null) {
            zt50Var9.Q.setProgressForApi(100 / length);
        }
        zt50 zt50Var10 = this.b;
        if (zt50Var10 != null) {
            zt50Var10.Q.setCurrentProgress(100 - ((100 / length) * length));
        }
        zt50 zt50Var11 = this.b;
        if (zt50Var11 != null && (liveData = zt50Var11.Q.getLiveData()) != null) {
            liveData.f(getViewLifecycleOwner(), new lfy() { // from class: ou10
                @Override // defpackage.lfy
                public final void u1(Object obj) {
                    Integer num = (Integer) obj;
                    if (num != null && num.intValue() == 100) {
                        pfd pfdVar = fse.a;
                        ej5.c(w5b.a(gku.a), null, null, new sz10(this.a, null), 3);
                    }
                }
            });
        }
        pjc.l.f(getViewLifecycleOwner(), new l(new Function1() { // from class: tu10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str2 = (String) obj;
                str2.getClass();
                boolean zM = StringsKt.M(str2, "user-name:", false);
                zy10 zy10Var = this.a;
                if (!zM) {
                    zy10Var.Z0().y = false;
                    zy10Var.Z0().z.j(str2);
                } else if (pjc.a.d()) {
                    zy10Var.Z0().z.j(str2);
                }
                return Unit.a;
            }
        }));
        fq5 fq5Var = this.z;
        int i4 = 1;
        if (fq5Var != null && (sswVar3 = fq5Var.c) != null) {
            sswVar3.f(getViewLifecycleOwner(), new l(new q56(this, i4)));
        }
        try {
            b1().c.f(getViewLifecycleOwner(), new l(new Function1() { // from class: rx10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    jo80 binding12;
                    zt50 zt50Var12;
                    jo80 binding13;
                    WalletInfo walletInfo;
                    WalletInfo walletInfo2;
                    Double balance;
                    jo80 binding14;
                    jo80 binding15;
                    jo80 binding16;
                    WalletInfo walletInfo3;
                    WalletInfo walletInfo4;
                    zt50 zt50Var13;
                    WalletInfo walletInfo5;
                    Integer code;
                    Integer code2;
                    zt50 zt50Var14;
                    LoadingState loadingState = (LoadingState) obj;
                    int i5 = zy10.b.a[loadingState.getStatus().ordinal()];
                    final zy10 zy10Var = this.a;
                    Double balance2 = null;
                    int i6 = 1;
                    if (i5 == 1) {
                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                        String currency = (hTTPResponse == null || (walletInfo5 = (WalletInfo) hTTPResponse.getData()) == null) ? null : walletInfo5.getCurrency();
                        if (currency != null && !StringsKt.U(currency)) {
                            zy10Var.I = 0;
                        } else if (zy10Var.I < 3) {
                            zy10Var.b1().y1();
                            zy10Var.I++;
                        } else {
                            zy10Var.G1();
                            e activity3 = zy10Var.getActivity();
                            if (activity3 != null) {
                                activity3.finish();
                            }
                        }
                        if (!zy10Var.J && (zt50Var13 = zy10Var.b) != null) {
                            zt50Var13.Q.P();
                        }
                        zt50 zt50Var15 = zy10Var.b;
                        if (zt50Var15 != null) {
                            PrHeaderContainer prHeaderContainer2 = zt50Var15.K;
                            String strValueOf = String.valueOf((hTTPResponse == null || (walletInfo4 = (WalletInfo) hTTPResponse.getData()) == null) ? null : walletInfo4.getBalance());
                            op5 op5Var = op5.a;
                            String strValueOf2 = String.valueOf((hTTPResponse == null || (walletInfo3 = (WalletInfo) hTTPResponse.getData()) == null) ? null : walletInfo3.getCurrency());
                            op5Var.getClass();
                            prHeaderContainer2.setAmount(strValueOf, op5.i(strValueOf2));
                        }
                        zt50 zt50Var16 = zy10Var.b;
                        if (zt50Var16 != null && (binding16 = zt50Var16.K.getBinding()) != null) {
                            binding16.b.setVisibility(0);
                        }
                        zt50 zt50Var17 = zy10Var.b;
                        if (zt50Var17 != null && (binding15 = zt50Var17.K.getBinding()) != null) {
                            binding15.f.setVisibility(0);
                        }
                        zt50 zt50Var18 = zy10Var.b;
                        if (zt50Var18 != null && (binding14 = zt50Var18.K.getBinding()) != null) {
                            binding14.i.setVisibility(8);
                        }
                        zp40 zp40Var = new zp40();
                        Double d2 = zy10Var.K;
                        if (d2 != null) {
                            double dDoubleValue = d2.doubleValue();
                            if (hTTPResponse != null && (walletInfo2 = (WalletInfo) hTTPResponse.getData()) != null && (balance = walletInfo2.getBalance()) != null) {
                                zp40Var.a = dDoubleValue - balance.doubleValue();
                            }
                        }
                        double d3 = zp40Var.a;
                        if (d3 < 0.0d) {
                            nas nasVarA = ebs.a(zy10Var.getLifecycle());
                            pfd pfdVar = fse.a;
                            ej5.c(nasVarA, gku.a, null, new fz10(zy10Var, zp40Var, null), 2);
                        } else if (d3 > 0.0d) {
                            nas nasVarA2 = ebs.a(zy10Var.getLifecycle());
                            pfd pfdVar2 = fse.a;
                            ej5.c(nasVarA2, gku.a, null, new gz10(zy10Var, zp40Var, null), 2);
                        }
                        if (hTTPResponse != null && (walletInfo = (WalletInfo) hTTPResponse.getData()) != null) {
                            balance2 = walletInfo.getBalance();
                        }
                        zy10Var.K = balance2;
                        if ((balance2 != null ? balance2.doubleValue() : 0.0d) < zy10Var.L * 2.0d) {
                            if (zy10Var.h1() && (zt50Var12 = zy10Var.b) != null && (binding13 = zt50Var12.K.getBinding()) != null) {
                                binding13.e.setVisibility(0);
                            }
                            zt50 zt50Var19 = zy10Var.b;
                            if (zt50Var19 != null) {
                                zt50Var19.J.F(R.drawable.hamberger_add_more_red);
                            }
                        } else {
                            zt50 zt50Var20 = zy10Var.b;
                            if (zt50Var20 != null && (binding12 = zt50Var20.K.getBinding()) != null) {
                                binding12.e.setVisibility(8);
                            }
                            zt50 zt50Var21 = zy10Var.b;
                            if (zt50Var21 != null) {
                                zt50Var21.J.F(R.drawable.hamberger_add_more_bg);
                            }
                        }
                        if (zy10Var.h1()) {
                            new SportyGamesManager().fetchFirstDepositState(ebs.a(zy10Var.getLifecycle()), new ose(zy10Var));
                        }
                    } else if (i5 != 2) {
                        if (i5 != 3) {
                            uhc.a();
                            return null;
                        }
                        if (zy10Var.I < 3) {
                            zy10Var.b1().y1();
                            zy10Var.I++;
                            return Unit.a;
                        }
                        e activity4 = zy10Var.getActivity();
                        if (activity4 != null) {
                            try {
                                ResultWrapper.GenericError error = loadingState.getError();
                                if (error != null && (code2 = error.getCode()) != null && code2.intValue() == 403 && (zt50Var14 = zy10Var.b) != null) {
                                    zt50Var14.Q.P();
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            ResultWrapper.GenericError error2 = loadingState.getError();
                            if (error2 == null || (code = error2.getCode()) == null || code.intValue() != 403) {
                                xbg xbgVar = zy10Var.y0;
                                if (xbgVar == null) {
                                    Intrinsics.n("errorDialog");
                                    throw null;
                                }
                                if (!xbgVar.isShowing() && !zy10Var.N) {
                                    zy10Var.G1();
                                    Context context3 = zy10Var.getContext();
                                    if (context3 != null) {
                                        rlz rlzVar = rlz.d;
                                        ResultWrapper.GenericError error3 = loadingState.getError();
                                        Function0 function0 = new Function0() { // from class: ov10
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                zy10Var.R0();
                                                return Unit.a;
                                            }
                                        };
                                        fn0 fn0Var = new fn0(1);
                                        hie hieVar = new hie(zy10Var, i6);
                                        context3.getColor(R.color.sh_error_btn_color);
                                        rlzVar.c(activity4, error3, function0, fn0Var, hieVar, 0, (1728 & 128) != 0 ? new slz() : null, (1728 & 512) != 0 ? new tlz() : new bcj(zy10Var, i6), new ulz());
                                    }
                                }
                            }
                        }
                    }
                    return Unit.a;
                }
            }));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            Z0().c.f(getViewLifecycleOwner(), new l(new jda(this, i4)));
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        b1().b.f(getViewLifecycleOwner(), new l(new sx10(this, i3)));
        b1().f.f(getViewLifecycleOwner(), new l(new Function1() { // from class: tx10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String chatRoomId;
                zt50 zt50Var12;
                jo80 binding12;
                ActiveRoomResponse activeRoomResponse;
                String botUserId;
                ActiveRoomResponse activeRoomResponse2;
                zt50 zt50Var13;
                Integer code;
                LoadingState loadingState = (LoadingState) obj;
                int i5 = zy10.b.a[loadingState.getStatus().ordinal()];
                zy10 zy10Var = this.a;
                if (i5 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (!zy10Var.J && (zt50Var13 = zy10Var.b) != null) {
                        zt50Var13.Q.P();
                    }
                    String str2 = "";
                    if (hTTPResponse == null || (activeRoomResponse2 = (ActiveRoomResponse) hTTPResponse.getData()) == null || (chatRoomId = activeRoomResponse2.getChatRoomId()) == null) {
                        chatRoomId = "";
                    }
                    zy10Var.k1 = chatRoomId;
                    if (hTTPResponse != null && (activeRoomResponse = (ActiveRoomResponse) hTTPResponse.getData()) != null && (botUserId = activeRoomResponse.getBotUserId()) != null) {
                        str2 = botUserId;
                    }
                    zy10Var.l1 = str2;
                    if (zy10Var.k1.length() > 0 && (zt50Var12 = zy10Var.b) != null && (binding12 = zt50Var12.K.getBinding()) != null) {
                        binding12.d.setVisibility(0);
                    }
                    FragmentManager parentFragmentManager = zy10Var.getParentFragmentManager();
                    parentFragmentManager.getClass();
                    Fragment fragmentH = parentFragmentManager.H("Chat");
                    if (fragmentH != null) {
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
                        aVar.p(fragmentH);
                        aVar.d();
                    }
                    fn1 fn1VarB2 = zy10Var.b1();
                    ej5.c(o8i0.d(fn1VarB2), null, null, new xm1(fn1VarB2, null), 3);
                } else if (i5 != 2) {
                    if (i5 != 3) {
                        uhc.a();
                        return null;
                    }
                    ResultWrapper.GenericError error = loadingState.getError();
                    if (error == null || (code = error.getCode()) == null || code.intValue() != 403 || zy10Var.N) {
                        zy10Var.G1();
                        zy10Var.Q0(loadingState.getError());
                    } else {
                        zy10Var.G1();
                        zy10Var.N = true;
                        SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                    }
                }
                return Unit.a;
            }
        }));
        b1().e.f(getViewLifecycleOwner(), new l(new ux10(this, i3)));
        b1().d.f(getViewLifecycleOwner(), new l(new vx10(this, i3)));
        b1().i.f(getViewLifecycleOwner(), new l(new Function1() { // from class: wx10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List<BetDetails> list;
                char c2;
                Object obj2;
                zt50 zt50Var12;
                nk2 binding12;
                nk2 binding13;
                nk2 binding14;
                nk2 binding15;
                ConstraintLayout constraintLayout;
                nk2 binding16;
                nk2 binding17;
                nk2 binding18;
                GameSocektResponse.Info info;
                GameSocektResponse.Info.InfoDetails blue;
                String multiplier;
                zt50 zt50Var13;
                nk2 binding19;
                nk2 binding20;
                nk2 binding21;
                ConstraintLayout constraintLayout2;
                nk2 binding22;
                GameSocektResponse.Info info2;
                GameSocektResponse.Info.InfoDetails purple;
                String multiplier2;
                nk2 binding23;
                nk2 binding24;
                zt50 zt50Var14;
                nk2 binding25;
                ConstraintLayout constraintLayout3;
                nk2 binding26;
                nk2 binding27;
                nk2 binding28;
                GameSocektResponse.Info info3;
                GameSocektResponse.Info.InfoDetails red;
                String multiplier3;
                nk2 binding29;
                nk2 binding30;
                nk2 binding31;
                nk2 binding32;
                nk2 binding33;
                nk2 binding34;
                nk2 binding35;
                nk2 binding36;
                ConstraintLayout constraintLayout4;
                nk2 binding37;
                nk2 binding38;
                nk2 binding39;
                nk2 binding40;
                nk2 binding41;
                nk2 binding42;
                nk2 binding43;
                nk2 binding44;
                nk2 binding45;
                nk2 binding46;
                nk2 binding47;
                ConstraintLayout constraintLayout5;
                nk2 binding48;
                nk2 binding49;
                nk2 binding50;
                nk2 binding51;
                nk2 binding52;
                nk2 binding53;
                nk2 binding54;
                nk2 binding55;
                nk2 binding56;
                nk2 binding57;
                nk2 binding58;
                nk2 binding59;
                nk2 binding60;
                ConstraintLayout constraintLayout6;
                nk2 binding61;
                nk2 binding62;
                nk2 binding63;
                nk2 binding64;
                nk2 binding65;
                LoadingState loadingState = (LoadingState) obj;
                int i5 = zy10.b.a[loadingState.getStatus().ordinal()];
                char c3 = 2;
                Object obj3 = null;
                zy10 zy10Var = this.a;
                if (i5 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    CashoutLayoutForChat cashoutLayoutForChat = zy10Var.F0;
                    zt50 zt50Var15 = zy10Var.b;
                    if (zt50Var15 != null) {
                        zt50Var15.Q.P();
                        Unit unit = Unit.a;
                    }
                    if (hTTPResponse != null && (list = (List) hTTPResponse.getData()) != null) {
                        zy10Var.w1();
                        for (BetDetails betDetails : list) {
                            zy10Var.j0(betDetails);
                            double d2 = 0.0d;
                            if (betDetails.getCashoutCoefficient() == 0.0d) {
                                eoa0 eoa0VarZ0 = zy10Var.Z0();
                                String strValueOf = String.valueOf(betDetails.getRoundId());
                                String rocketType = betDetails.getRocketType();
                                strValueOf.getClass();
                                eoa0VarZ0.B.put(eoa0.B1(strValueOf, rocketType), Boolean.TRUE);
                                if (Intrinsics.g(betDetails.getRocketType(), "RED")) {
                                    zt50 zt50Var16 = zy10Var.b;
                                    if (zt50Var16 != null) {
                                        zt50Var16.S.setRoundId(betDetails.getRoundId());
                                        Unit unit2 = Unit.a;
                                    }
                                    zt50 zt50Var17 = zy10Var.b;
                                    if (zt50Var17 != null) {
                                        zt50Var17.S.setBetAmount(betDetails.getStakeAmount());
                                        Unit unit3 = Unit.a;
                                    }
                                    zt50 zt50Var18 = zy10Var.b;
                                    if (zt50Var18 != null) {
                                        zt50Var18.S.setBetId(betDetails.getBetId());
                                        Unit unit4 = Unit.a;
                                    }
                                    zt50 zt50Var19 = zy10Var.b;
                                    if (zt50Var19 != null) {
                                        zt50Var19.S.setBetPlaced(true);
                                        Unit unit5 = Unit.a;
                                    }
                                    zt50 zt50Var20 = zy10Var.b;
                                    if (zt50Var20 != null && (binding65 = zt50Var20.S.getBinding()) != null) {
                                        binding65.v.setVisibility(8);
                                        Unit unit6 = Unit.a;
                                    }
                                    zt50 zt50Var21 = zy10Var.b;
                                    if (zt50Var21 != null && (binding64 = zt50Var21.S.getBinding()) != null) {
                                        binding64.C.setVisibility(8);
                                        Unit unit7 = Unit.a;
                                    }
                                    zt50 zt50Var22 = zy10Var.b;
                                    if (zt50Var22 != null && (binding63 = zt50Var22.S.getBinding()) != null) {
                                        binding63.W.setVisibility(8);
                                        Unit unit8 = Unit.a;
                                    }
                                    zt50 zt50Var23 = zy10Var.b;
                                    if (zt50Var23 != null && (binding62 = zt50Var23.S.getBinding()) != null) {
                                        binding62.Y.setVisibility(8);
                                        Unit unit9 = Unit.a;
                                    }
                                    zy10Var.e = false;
                                    zt50 zt50Var24 = zy10Var.b;
                                    if (zt50Var24 != null && (binding61 = zt50Var24.S.getBinding()) != null) {
                                        binding61.p0.setVisibility(0);
                                        Unit unit10 = Unit.a;
                                    }
                                    zt50 zt50Var25 = zy10Var.b;
                                    if (zt50Var25 != null && (binding60 = zt50Var25.S.getBinding()) != null && (constraintLayout6 = binding60.y) != null) {
                                        constraintLayout6.setBackground(zy10Var.requireContext().getDrawable(R.drawable.bet_placed_enable_background));
                                        Unit unit11 = Unit.a;
                                    }
                                    zt50 zt50Var26 = zy10Var.b;
                                    if (zt50Var26 != null) {
                                        zt50Var26.S.setBetInProgress(false);
                                        Unit unit12 = Unit.a;
                                    }
                                    zt50 zt50Var27 = zy10Var.b;
                                    if (zt50Var27 != null) {
                                        zt50Var27.S.setCashoutDone(false);
                                        Unit unit13 = Unit.a;
                                    }
                                    zt50 zt50Var28 = zy10Var.b;
                                    if (zt50Var28 != null && (binding59 = zt50Var28.S.getBinding()) != null) {
                                        binding59.v.setClickable(true);
                                        Unit unit14 = Unit.a;
                                    }
                                    zt50 zt50Var29 = zy10Var.b;
                                    if (zt50Var29 != null && (binding58 = zt50Var29.S.getBinding()) != null) {
                                        binding58.v.setAlpha(1.0f);
                                        Unit unit15 = Unit.a;
                                    }
                                    zt50 zt50Var30 = zy10Var.b;
                                    if (zt50Var30 != null && (binding57 = zt50Var30.S.getBinding()) != null) {
                                        TextView textView = binding57.b;
                                        TreeMap treeMap = pw.a;
                                        textView.setText(pw.n(betDetails.getStakeAmount()));
                                        Unit unit16 = Unit.a;
                                    }
                                    Double giftAmount = betDetails.getGiftAmount();
                                    GiftItem giftItem = giftAmount != null ? new GiftItem(giftAmount.doubleValue(), "", "", "", 0.0d, 0L, 0, null, null, 384, null) : null;
                                    zt50 zt50Var31 = zy10Var.b;
                                    if (giftItem != null) {
                                        if (zt50Var31 != null) {
                                            zt50Var31.S.setFBG(giftItem, true, betDetails.getGiftAmount().doubleValue());
                                            Unit unit17 = Unit.a;
                                        }
                                        zt50 zt50Var32 = zy10Var.b;
                                        if (zt50Var32 != null) {
                                            zt50Var32.z.c();
                                            Unit unit18 = Unit.a;
                                        }
                                        zt50 zt50Var33 = zy10Var.b;
                                        if (zt50Var33 != null) {
                                            zt50Var33.R.c();
                                            Unit unit19 = Unit.a;
                                        }
                                        zt50 zt50Var34 = zy10Var.b;
                                        if (zt50Var34 != null) {
                                            zt50Var34.S.setFbgRoundId(betDetails.getRoundId());
                                            Unit unit20 = Unit.a;
                                        }
                                        zy10Var.K0();
                                        Unit unit21 = Unit.a;
                                    } else {
                                        if (zt50Var31 != null) {
                                            zt50Var31.S.setUserInputAmount(betDetails.getStakeAmount());
                                            Unit unit22 = Unit.a;
                                        }
                                        Unit unit23 = Unit.a;
                                    }
                                    if (zy10Var.M != null) {
                                        op5 op5Var = op5.a;
                                        String string = zy10Var.getString(R.string.place_bet_cms);
                                        string.getClass();
                                        String string2 = zy10Var.getString(R.string.place_bet_text_sh);
                                        string2.getClass();
                                        op5Var.getClass();
                                        String strB = op5.b(string, string2, null);
                                        List<DetailResponse> list2 = zy10Var.M;
                                        if (list2 == null) {
                                            Intrinsics.n("gameDetailResponse");
                                            throw null;
                                        }
                                        String currency = list2.get(0).getCurrency();
                                        String strI2 = op5.i(currency != null ? currency : "");
                                        TreeMap treeMap2 = pw.a;
                                        StringBuilder sbA = ux5.a(strB, " ", strI2, " ", pw.j(betDetails.getStakeAmount()));
                                        sbA.append("?");
                                        String string3 = sbA.toString();
                                        zt50 zt50Var35 = zy10Var.b;
                                        if (zt50Var35 != null && (binding56 = zt50Var35.S.getBinding()) != null) {
                                            binding56.X.setText(string3);
                                        }
                                    }
                                    zy10Var.a0 = betDetails.getRoundId();
                                    if (betDetails.getAutoCashoutAt() != null) {
                                        zy10Var.S = true;
                                        zt50 zt50Var36 = zy10Var.b;
                                        if (zt50Var36 != null && (binding55 = zt50Var36.S.getBinding()) != null) {
                                            binding55.f.setStatus(true);
                                        }
                                        zt50 zt50Var37 = zy10Var.b;
                                        if (zt50Var37 != null && (binding54 = zt50Var37.S.getBinding()) != null) {
                                            binding54.B.setVisibility(0);
                                        }
                                        zt50 zt50Var38 = zy10Var.b;
                                        if (zt50Var38 != null && (binding53 = zt50Var38.S.getBinding()) != null) {
                                            binding53.z.setText(betDetails.getAutoCashoutAt());
                                        }
                                        zt50 zt50Var39 = zy10Var.b;
                                        if (zt50Var39 != null) {
                                            zt50Var39.S.setCashoutCoeff(Double.parseDouble(betDetails.getAutoCashoutAt()));
                                        }
                                    }
                                } else {
                                    boolean zG = Intrinsics.g(betDetails.getRocketType(), "PURPLE");
                                    zt50 zt50Var40 = zy10Var.b;
                                    if (zG) {
                                        if (zt50Var40 != null) {
                                            zt50Var40.R.setRoundId(betDetails.getRoundId());
                                            Unit unit24 = Unit.a;
                                        }
                                        zt50 zt50Var41 = zy10Var.b;
                                        if (zt50Var41 != null) {
                                            zt50Var41.R.setBetAmount(betDetails.getStakeAmount());
                                            Unit unit25 = Unit.a;
                                        }
                                        zt50 zt50Var42 = zy10Var.b;
                                        if (zt50Var42 != null) {
                                            zt50Var42.R.setBetId(betDetails.getBetId());
                                            Unit unit26 = Unit.a;
                                        }
                                        zt50 zt50Var43 = zy10Var.b;
                                        if (zt50Var43 != null) {
                                            zt50Var43.R.setBetPlaced(true);
                                            Unit unit27 = Unit.a;
                                        }
                                        zt50 zt50Var44 = zy10Var.b;
                                        if (zt50Var44 != null && (binding52 = zt50Var44.R.getBinding()) != null) {
                                            binding52.v.setVisibility(8);
                                            Unit unit28 = Unit.a;
                                        }
                                        zt50 zt50Var45 = zy10Var.b;
                                        if (zt50Var45 != null && (binding51 = zt50Var45.R.getBinding()) != null) {
                                            binding51.C.setVisibility(8);
                                            Unit unit29 = Unit.a;
                                        }
                                        zt50 zt50Var46 = zy10Var.b;
                                        if (zt50Var46 != null && (binding50 = zt50Var46.R.getBinding()) != null) {
                                            binding50.W.setVisibility(8);
                                            Unit unit30 = Unit.a;
                                        }
                                        zt50 zt50Var47 = zy10Var.b;
                                        if (zt50Var47 != null && (binding49 = zt50Var47.R.getBinding()) != null) {
                                            binding49.Y.setVisibility(8);
                                            Unit unit31 = Unit.a;
                                        }
                                        zy10Var.i = false;
                                        zt50 zt50Var48 = zy10Var.b;
                                        if (zt50Var48 != null && (binding48 = zt50Var48.R.getBinding()) != null) {
                                            binding48.p0.setVisibility(0);
                                            Unit unit32 = Unit.a;
                                        }
                                        zt50 zt50Var49 = zy10Var.b;
                                        if (zt50Var49 != null && (binding47 = zt50Var49.R.getBinding()) != null && (constraintLayout5 = binding47.y) != null) {
                                            constraintLayout5.setBackground(zy10Var.requireContext().getDrawable(R.drawable.bet_placed_enable_background));
                                            Unit unit33 = Unit.a;
                                        }
                                        zt50 zt50Var50 = zy10Var.b;
                                        if (zt50Var50 != null) {
                                            zt50Var50.R.setBetInProgress(false);
                                            Unit unit34 = Unit.a;
                                        }
                                        zt50 zt50Var51 = zy10Var.b;
                                        if (zt50Var51 != null) {
                                            zt50Var51.R.setCashoutDone(false);
                                            Unit unit35 = Unit.a;
                                        }
                                        zt50 zt50Var52 = zy10Var.b;
                                        if (zt50Var52 != null && (binding46 = zt50Var52.R.getBinding()) != null) {
                                            TextView textView2 = binding46.b;
                                            TreeMap treeMap3 = pw.a;
                                            textView2.setText(pw.n(betDetails.getStakeAmount()));
                                            Unit unit36 = Unit.a;
                                        }
                                        Double giftAmount2 = betDetails.getGiftAmount();
                                        GiftItem giftItem2 = giftAmount2 != null ? new GiftItem(giftAmount2.doubleValue(), "", "", "", 0.0d, 0L, 0, null, null, 384, null) : null;
                                        zt50 zt50Var53 = zy10Var.b;
                                        if (giftItem2 != null) {
                                            if (zt50Var53 != null) {
                                                zt50Var53.R.setFBG(giftItem2, true, betDetails.getGiftAmount().doubleValue());
                                                Unit unit37 = Unit.a;
                                            }
                                            zt50 zt50Var54 = zy10Var.b;
                                            if (zt50Var54 != null) {
                                                zt50Var54.z.c();
                                                Unit unit38 = Unit.a;
                                            }
                                            zt50 zt50Var55 = zy10Var.b;
                                            if (zt50Var55 != null) {
                                                zt50Var55.S.c();
                                                Unit unit39 = Unit.a;
                                            }
                                            zt50 zt50Var56 = zy10Var.b;
                                            if (zt50Var56 != null) {
                                                zt50Var56.R.setFbgRoundId(betDetails.getRoundId());
                                                Unit unit40 = Unit.a;
                                            }
                                            zy10Var.K0();
                                            Unit unit41 = Unit.a;
                                        } else {
                                            if (zt50Var53 != null) {
                                                zt50Var53.R.setUserInputAmount(betDetails.getStakeAmount());
                                                Unit unit42 = Unit.a;
                                            }
                                            Unit unit43 = Unit.a;
                                        }
                                        if (zy10Var.M != null) {
                                            op5 op5Var2 = op5.a;
                                            String string4 = zy10Var.getString(R.string.place_bet_cms);
                                            string4.getClass();
                                            String string5 = zy10Var.getString(R.string.place_bet_text_sh);
                                            string5.getClass();
                                            op5Var2.getClass();
                                            String strB2 = op5.b(string4, string5, null);
                                            List<DetailResponse> list3 = zy10Var.M;
                                            if (list3 == null) {
                                                Intrinsics.n("gameDetailResponse");
                                                throw null;
                                            }
                                            String currency2 = list3.get(1).getCurrency();
                                            String strI3 = op5.i(currency2 != null ? currency2 : "");
                                            TreeMap treeMap4 = pw.a;
                                            StringBuilder sbA2 = ux5.a(strB2, " ", strI3, " ", pw.j(betDetails.getStakeAmount()));
                                            sbA2.append("?");
                                            String string6 = sbA2.toString();
                                            zt50 zt50Var57 = zy10Var.b;
                                            if (zt50Var57 != null && (binding45 = zt50Var57.R.getBinding()) != null) {
                                                binding45.X.setText(string6);
                                            }
                                        }
                                        zy10Var.c0 = betDetails.getRoundId();
                                        if (betDetails.getAutoCashoutAt() != null) {
                                            zy10Var.Z = true;
                                            zt50 zt50Var58 = zy10Var.b;
                                            if (zt50Var58 != null && (binding44 = zt50Var58.R.getBinding()) != null) {
                                                binding44.f.setStatus(true);
                                            }
                                            zt50 zt50Var59 = zy10Var.b;
                                            if (zt50Var59 != null && (binding43 = zt50Var59.R.getBinding()) != null) {
                                                binding43.B.setVisibility(0);
                                            }
                                            zt50 zt50Var60 = zy10Var.b;
                                            if (zt50Var60 != null && (binding42 = zt50Var60.R.getBinding()) != null) {
                                                binding42.z.setText(betDetails.getAutoCashoutAt());
                                            }
                                            zt50 zt50Var61 = zy10Var.b;
                                            if (zt50Var61 != null) {
                                                zt50Var61.R.setCashoutCoeff(Double.parseDouble(betDetails.getAutoCashoutAt()));
                                            }
                                        }
                                        if (zy10Var.d0) {
                                            fb7.d.j(cashoutLayoutForChat);
                                        }
                                    } else {
                                        if (zt50Var40 != null) {
                                            zt50Var40.z.setRoundId(betDetails.getRoundId());
                                            Unit unit44 = Unit.a;
                                        }
                                        zt50 zt50Var62 = zy10Var.b;
                                        if (zt50Var62 != null) {
                                            zt50Var62.z.setBetAmount(betDetails.getStakeAmount());
                                            Unit unit45 = Unit.a;
                                        }
                                        zt50 zt50Var63 = zy10Var.b;
                                        if (zt50Var63 != null) {
                                            zt50Var63.z.setBetId(betDetails.getBetId());
                                            Unit unit46 = Unit.a;
                                        }
                                        zt50 zt50Var64 = zy10Var.b;
                                        if (zt50Var64 != null && (binding41 = zt50Var64.z.getBinding()) != null) {
                                            binding41.v.setVisibility(8);
                                            Unit unit47 = Unit.a;
                                        }
                                        zt50 zt50Var65 = zy10Var.b;
                                        if (zt50Var65 != null && (binding40 = zt50Var65.z.getBinding()) != null) {
                                            binding40.C.setVisibility(8);
                                            Unit unit48 = Unit.a;
                                        }
                                        zt50 zt50Var66 = zy10Var.b;
                                        if (zt50Var66 != null && (binding39 = zt50Var66.z.getBinding()) != null) {
                                            binding39.W.setVisibility(8);
                                            Unit unit49 = Unit.a;
                                        }
                                        zt50 zt50Var67 = zy10Var.b;
                                        if (zt50Var67 != null && (binding38 = zt50Var67.z.getBinding()) != null) {
                                            binding38.Y.setVisibility(8);
                                            Unit unit50 = Unit.a;
                                        }
                                        zy10Var.f = false;
                                        zt50 zt50Var68 = zy10Var.b;
                                        if (zt50Var68 != null && (binding37 = zt50Var68.z.getBinding()) != null) {
                                            binding37.p0.setVisibility(0);
                                            Unit unit51 = Unit.a;
                                        }
                                        zt50 zt50Var69 = zy10Var.b;
                                        if (zt50Var69 != null && (binding36 = zt50Var69.z.getBinding()) != null && (constraintLayout4 = binding36.y) != null) {
                                            constraintLayout4.setBackground(zy10Var.requireContext().getDrawable(R.drawable.bet_placed_enable_background));
                                            Unit unit52 = Unit.a;
                                        }
                                        zt50 zt50Var70 = zy10Var.b;
                                        if (zt50Var70 != null) {
                                            zt50Var70.z.setBetPlaced(true);
                                            Unit unit53 = Unit.a;
                                        }
                                        zt50 zt50Var71 = zy10Var.b;
                                        if (zt50Var71 != null) {
                                            zt50Var71.z.setBetInProgress(false);
                                            Unit unit54 = Unit.a;
                                        }
                                        zt50 zt50Var72 = zy10Var.b;
                                        if (zt50Var72 != null) {
                                            zt50Var72.z.setCashoutDone(false);
                                            Unit unit55 = Unit.a;
                                        }
                                        Double giftAmount3 = betDetails.getGiftAmount();
                                        GiftItem giftItem3 = giftAmount3 != null ? new GiftItem(giftAmount3.doubleValue(), "", "", "", 0.0d, 0L, 0, null, null, 384, null) : null;
                                        zt50 zt50Var73 = zy10Var.b;
                                        if (giftItem3 != null) {
                                            if (zt50Var73 != null) {
                                                zt50Var73.z.setFbgRoundId(betDetails.getRoundId());
                                                Unit unit56 = Unit.a;
                                            }
                                            zt50 zt50Var74 = zy10Var.b;
                                            if (zt50Var74 != null) {
                                                zt50Var74.z.setFBG(giftItem3, true, betDetails.getGiftAmount().doubleValue());
                                                Unit unit57 = Unit.a;
                                            }
                                            zt50 zt50Var75 = zy10Var.b;
                                            if (zt50Var75 != null) {
                                                zt50Var75.R.c();
                                                Unit unit58 = Unit.a;
                                            }
                                            zt50 zt50Var76 = zy10Var.b;
                                            if (zt50Var76 != null) {
                                                zt50Var76.S.c();
                                                Unit unit59 = Unit.a;
                                            }
                                            zy10Var.K0();
                                            Unit unit60 = Unit.a;
                                        } else {
                                            if (zt50Var73 != null) {
                                                zt50Var73.z.setUserInputAmount(betDetails.getStakeAmount());
                                                Unit unit61 = Unit.a;
                                            }
                                            zt50 zt50Var77 = zy10Var.b;
                                            if (zt50Var77 != null && (binding31 = zt50Var77.z.getBinding()) != null) {
                                                TextView textView3 = binding31.b;
                                                TreeMap treeMap5 = pw.a;
                                                textView3.setText(pw.n(betDetails.getStakeAmount()));
                                                Unit unit62 = Unit.a;
                                            }
                                            Unit unit63 = Unit.a;
                                        }
                                        if (zy10Var.M != null) {
                                            op5 op5Var3 = op5.a;
                                            String string7 = zy10Var.getString(R.string.place_bet_cms);
                                            string7.getClass();
                                            String string8 = zy10Var.getString(R.string.place_bet_text_sh);
                                            string8.getClass();
                                            op5Var3.getClass();
                                            String strB3 = op5.b(string7, string8, null);
                                            List<DetailResponse> list4 = zy10Var.M;
                                            if (list4 == null) {
                                                Intrinsics.n("gameDetailResponse");
                                                throw null;
                                            }
                                            c2 = 2;
                                            String currency3 = list4.get(2).getCurrency();
                                            String strI4 = op5.i(currency3 != null ? currency3 : "");
                                            TreeMap treeMap6 = pw.a;
                                            StringBuilder sbA3 = ux5.a(strB3, " ", strI4, " ", pw.j(betDetails.getStakeAmount()));
                                            sbA3.append("?");
                                            String string9 = sbA3.toString();
                                            zt50 zt50Var78 = zy10Var.b;
                                            if (zt50Var78 != null && (binding35 = zt50Var78.z.getBinding()) != null) {
                                                binding35.X.setText(string9);
                                            }
                                        } else {
                                            c2 = 2;
                                        }
                                        obj2 = null;
                                        zy10Var.b0 = betDetails.getRoundId();
                                        if (betDetails.getAutoCashoutAt() != null) {
                                            zy10Var.W = true;
                                            zt50 zt50Var79 = zy10Var.b;
                                            if (zt50Var79 != null && (binding34 = zt50Var79.z.getBinding()) != null) {
                                                binding34.f.setStatus(true);
                                            }
                                            zt50 zt50Var80 = zy10Var.b;
                                            if (zt50Var80 != null && (binding33 = zt50Var80.z.getBinding()) != null) {
                                                binding33.B.setVisibility(0);
                                            }
                                            zt50 zt50Var81 = zy10Var.b;
                                            if (zt50Var81 != null && (binding32 = zt50Var81.z.getBinding()) != null) {
                                                binding32.z.setText(betDetails.getAutoCashoutAt());
                                            }
                                            zt50 zt50Var82 = zy10Var.b;
                                            if (zt50Var82 != null) {
                                                zt50Var82.z.setCashoutCoeff(Double.parseDouble(betDetails.getAutoCashoutAt()));
                                            }
                                        }
                                    }
                                }
                                c2 = 2;
                                obj2 = null;
                            } else {
                                c2 = c3;
                                obj2 = obj3;
                                zy10Var.w0();
                                eoa0 eoa0VarZ1 = zy10Var.Z0();
                                String strValueOf2 = String.valueOf(betDetails.getRoundId());
                                String rocketType2 = betDetails.getRocketType();
                                strValueOf2.getClass();
                                eoa0VarZ1.C.put(eoa0.B1(strValueOf2, rocketType2), Boolean.TRUE);
                                if (Intrinsics.g(betDetails.getRocketType(), "RED")) {
                                    zt50 zt50Var83 = zy10Var.b;
                                    if (zt50Var83 != null) {
                                        zt50Var83.S.setCashoutDone(true);
                                        Unit unit64 = Unit.a;
                                    }
                                    zt50 zt50Var84 = zy10Var.b;
                                    if (zt50Var84 != null) {
                                        zt50Var84.S.setBetPlaced(false);
                                        Unit unit65 = Unit.a;
                                    }
                                    zt50 zt50Var85 = zy10Var.b;
                                    if (zt50Var85 != null && (binding30 = zt50Var85.S.getBinding()) != null) {
                                        binding30.v.setClickable(true);
                                        Unit unit66 = Unit.a;
                                    }
                                    zt50 zt50Var86 = zy10Var.b;
                                    if (zt50Var86 != null && (binding29 = zt50Var86.S.getBinding()) != null) {
                                        binding29.v.setAlpha(1.0f);
                                        Unit unit67 = Unit.a;
                                    }
                                    if (betDetails.getAutoCashoutAt() != null) {
                                        double d3 = Double.parseDouble(betDetails.getAutoCashoutAt());
                                        GameSocektResponse gameSocektResponse = zy10Var.Q;
                                        if (gameSocektResponse != null && (info3 = gameSocektResponse.getInfo()) != null && (red = info3.getRED()) != null && (multiplier3 = red.getMultiplier()) != null) {
                                            d2 = Double.parseDouble(multiplier3);
                                        }
                                        if (d3 >= d2) {
                                            zy10Var.S = true;
                                            zt50 zt50Var87 = zy10Var.b;
                                            if (zt50Var87 != null && (binding28 = zt50Var87.S.getBinding()) != null) {
                                                binding28.f.setStatus(true);
                                                Unit unit68 = Unit.a;
                                            }
                                            zt50 zt50Var88 = zy10Var.b;
                                            if (zt50Var88 != null && (binding27 = zt50Var88.S.getBinding()) != null) {
                                                binding27.B.setVisibility(0);
                                                Unit unit69 = Unit.a;
                                            }
                                            zt50 zt50Var89 = zy10Var.b;
                                            if (zt50Var89 != null && (binding26 = zt50Var89.S.getBinding()) != null) {
                                                binding26.z.setText(betDetails.getAutoCashoutAt());
                                                Unit unit70 = Unit.a;
                                            }
                                            zt50 zt50Var90 = zy10Var.b;
                                            if (zt50Var90 != null && (binding25 = zt50Var90.S.getBinding()) != null && (constraintLayout3 = binding25.y) != null) {
                                                constraintLayout3.setBackground(zy10Var.requireContext().getDrawable(R.drawable.bets_placed_background));
                                                Unit unit71 = Unit.a;
                                            }
                                            if (zy10Var.d0) {
                                                cashoutLayoutForChat.setCashOutRedRocketVisibility(false);
                                                fb7.d.j(cashoutLayoutForChat);
                                            }
                                        }
                                    }
                                    if (betDetails.getGiftAmount() != null && (zt50Var14 = zy10Var.b) != null) {
                                        zt50Var14.S.c();
                                        Unit unit72 = Unit.a;
                                    }
                                } else if (Intrinsics.g(betDetails.getRocketType(), "PURPLE")) {
                                    zt50 zt50Var91 = zy10Var.b;
                                    if (zt50Var91 != null) {
                                        zt50Var91.R.setCashoutDone(true);
                                        Unit unit73 = Unit.a;
                                    }
                                    zt50 zt50Var92 = zy10Var.b;
                                    if (zt50Var92 != null) {
                                        zt50Var92.R.setBetPlaced(false);
                                        Unit unit74 = Unit.a;
                                    }
                                    zt50 zt50Var93 = zy10Var.b;
                                    if (zt50Var93 != null && (binding24 = zt50Var93.R.getBinding()) != null) {
                                        binding24.v.setClickable(true);
                                        Unit unit75 = Unit.a;
                                    }
                                    zt50 zt50Var94 = zy10Var.b;
                                    if (zt50Var94 != null && (binding23 = zt50Var94.R.getBinding()) != null) {
                                        binding23.v.setAlpha(1.0f);
                                        Unit unit76 = Unit.a;
                                    }
                                    if (betDetails.getAutoCashoutAt() != null) {
                                        double d4 = Double.parseDouble(betDetails.getAutoCashoutAt());
                                        GameSocektResponse gameSocektResponse2 = zy10Var.Q;
                                        if (gameSocektResponse2 != null && (info2 = gameSocektResponse2.getInfo()) != null && (purple = info2.getPURPLE()) != null && (multiplier2 = purple.getMultiplier()) != null) {
                                            d2 = Double.parseDouble(multiplier2);
                                        }
                                        if (d4 >= d2) {
                                            zy10Var.Z = true;
                                            zt50 zt50Var95 = zy10Var.b;
                                            if (zt50Var95 != null && (binding22 = zt50Var95.R.getBinding()) != null) {
                                                binding22.f.setStatus(true);
                                                Unit unit77 = Unit.a;
                                            }
                                            zt50 zt50Var96 = zy10Var.b;
                                            if (zt50Var96 != null && (binding21 = zt50Var96.R.getBinding()) != null && (constraintLayout2 = binding21.y) != null) {
                                                constraintLayout2.setBackground(zy10Var.requireContext().getDrawable(R.drawable.bets_placed_background));
                                                Unit unit78 = Unit.a;
                                            }
                                            zt50 zt50Var97 = zy10Var.b;
                                            if (zt50Var97 != null && (binding20 = zt50Var97.R.getBinding()) != null) {
                                                binding20.B.setVisibility(0);
                                                Unit unit79 = Unit.a;
                                            }
                                            zt50 zt50Var98 = zy10Var.b;
                                            if (zt50Var98 != null && (binding19 = zt50Var98.R.getBinding()) != null) {
                                                binding19.z.setText(betDetails.getAutoCashoutAt());
                                                Unit unit80 = Unit.a;
                                            }
                                            if (zy10Var.d0) {
                                                cashoutLayoutForChat.setCashOutPurpleRocketVisibility(false);
                                                fb7.d.j(cashoutLayoutForChat);
                                            }
                                        }
                                    }
                                    if (betDetails.getGiftAmount() != null && (zt50Var13 = zy10Var.b) != null) {
                                        zt50Var13.R.c();
                                        Unit unit81 = Unit.a;
                                    }
                                } else {
                                    if (zy10Var.d0) {
                                        cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                        fb7.d.j(cashoutLayoutForChat);
                                    }
                                    if (betDetails.getAutoCashoutAt() != null) {
                                        double d5 = Double.parseDouble(betDetails.getAutoCashoutAt());
                                        GameSocektResponse gameSocektResponse3 = zy10Var.Q;
                                        if (gameSocektResponse3 != null && (info = gameSocektResponse3.getInfo()) != null && (blue = info.getBLUE()) != null && (multiplier = blue.getMultiplier()) != null) {
                                            d2 = Double.parseDouble(multiplier);
                                        }
                                        if (d5 >= d2) {
                                            zy10Var.W = true;
                                            zt50 zt50Var99 = zy10Var.b;
                                            if (zt50Var99 != null && (binding18 = zt50Var99.z.getBinding()) != null) {
                                                binding18.f.setStatus(true);
                                                Unit unit82 = Unit.a;
                                            }
                                            zt50 zt50Var100 = zy10Var.b;
                                            if (zt50Var100 != null && (binding17 = zt50Var100.z.getBinding()) != null) {
                                                binding17.B.setVisibility(0);
                                                Unit unit83 = Unit.a;
                                            }
                                            zt50 zt50Var101 = zy10Var.b;
                                            if (zt50Var101 != null && (binding16 = zt50Var101.z.getBinding()) != null) {
                                                binding16.z.setText(betDetails.getAutoCashoutAt());
                                                Unit unit84 = Unit.a;
                                            }
                                        }
                                    }
                                    zt50 zt50Var102 = zy10Var.b;
                                    if (zt50Var102 != null) {
                                        zt50Var102.z.setCashoutDone(true);
                                        Unit unit85 = Unit.a;
                                    }
                                    zt50 zt50Var103 = zy10Var.b;
                                    if (zt50Var103 != null) {
                                        zt50Var103.z.setBetPlaced(false);
                                        Unit unit86 = Unit.a;
                                    }
                                    zt50 zt50Var104 = zy10Var.b;
                                    if (zt50Var104 != null && (binding15 = zt50Var104.z.getBinding()) != null && (constraintLayout = binding15.y) != null) {
                                        constraintLayout.setBackground(zy10Var.requireContext().getDrawable(R.drawable.bets_placed_background));
                                        Unit unit87 = Unit.a;
                                    }
                                    zt50 zt50Var105 = zy10Var.b;
                                    if (zt50Var105 != null && (binding14 = zt50Var105.z.getBinding()) != null) {
                                        binding14.v.setClickable(true);
                                        Unit unit88 = Unit.a;
                                    }
                                    zt50 zt50Var106 = zy10Var.b;
                                    if (zt50Var106 != null && (binding13 = zt50Var106.z.getBinding()) != null) {
                                        binding13.v.setAlpha(1.0f);
                                        Unit unit89 = Unit.a;
                                    }
                                    zt50 zt50Var107 = zy10Var.b;
                                    if (zt50Var107 != null && (binding12 = zt50Var107.z.getBinding()) != null) {
                                        binding12.A.setAlpha(1.0f);
                                        Unit unit90 = Unit.a;
                                    }
                                    if (betDetails.getGiftAmount() != null && (zt50Var12 = zy10Var.b) != null) {
                                        zt50Var12.z.c();
                                        Unit unit91 = Unit.a;
                                    }
                                }
                            }
                            c3 = c2;
                            obj3 = obj2;
                        }
                        Unit unit92 = Unit.a;
                    }
                } else if (i5 != 2) {
                    if (i5 != 3) {
                        uhc.a();
                        return null;
                    }
                    zt50 zt50Var108 = zy10Var.b;
                    if (zt50Var108 != null) {
                        zt50Var108.Q.P();
                    }
                }
                return Unit.a;
            }
        }));
        b1().v.f(getViewLifecycleOwner(), new l(new xx10(this, i3)));
        b1().z.f(getViewLifecycleOwner(), new l(new Function1() { // from class: yx10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List<GiftItem> entityList;
                zt50 zt50Var12;
                zt50 zt50Var13;
                e activity3;
                Context applicationContext;
                LoadingState loadingState = (LoadingState) obj;
                int i5 = zy10.b.a[loadingState.getStatus().ordinal()];
                final zy10 zy10Var = this.a;
                if (i5 == 1) {
                    zy10Var.Q0 = true;
                    List<DetailResponse> list = zy10Var.M;
                    if (list != null && list.size() > 0) {
                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                        zy10Var.l0 = hTTPResponse != null ? (PromotionGiftsResponse) hTTPResponse.getData() : null;
                        if (!zy10Var.isRemoving() && zy10Var.p1) {
                            try {
                                new brr();
                                GameDetails gameDetails2 = zy10Var.B;
                                if (gameDetails2 != null) {
                                    gameDetails2.getDisplayName();
                                }
                                SharedPreferences sharedPreferences2 = zy10Var.w;
                                if (sharedPreferences2 != null && !sharedPreferences2.getBoolean("ROCKET_ONE_TAP", false)) {
                                    Context context3 = zy10Var.getContext();
                                    String string = (context3 == null || (applicationContext = context3.getApplicationContext()) == null) ? null : applicationContext.getString(R.string.one_tap_choice_label);
                                    if (string != null) {
                                        zy10Var.J0();
                                        Context context4 = zy10Var.getContext();
                                        if (context4 != null && (activity3 = zy10Var.getActivity()) != null) {
                                            FragmentManager supportFragmentManager = activity3.getSupportFragmentManager();
                                            zy10Var.n0 = supportFragmentManager;
                                            if (supportFragmentManager != null) {
                                                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                                                op5 op5Var = op5.a;
                                                String string2 = zy10Var.getString(R.string.otb_dialog_msg_cms);
                                                string2.getClass();
                                                op5Var.getClass();
                                                String strB = op5.b(string2, string, null);
                                                String string3 = zy10Var.getString(R.string.yes_btn_cms);
                                                string3.getClass();
                                                String string4 = zy10Var.getString(R.string.yes_bet);
                                                string4.getClass();
                                                String strB2 = op5.b(string3, string4, null);
                                                String string5 = zy10Var.getString(R.string.no_btn_cms);
                                                string5.getClass();
                                                String string6 = zy10Var.getString(R.string.no_bet);
                                                string6.getClass();
                                                String strB3 = op5.b(string5, string6, null);
                                                Function1<? super Boolean, Unit> function1 = new Function1() { // from class: kv10
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj2) {
                                                        FragmentManager supportFragmentManager2;
                                                        FragmentManager supportFragmentManager3;
                                                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                                        zy10 zy10Var2 = zy10Var;
                                                        if (zBooleanValue) {
                                                            zy10Var2.N0();
                                                            zy10Var2.p1 = false;
                                                            SharedPreferences.Editor editor = zy10Var2.y;
                                                            if (zBooleanValue) {
                                                                if (editor != null) {
                                                                    editor.putBoolean("ROCKET_ONE_TAP", true);
                                                                }
                                                            } else if (editor != null) {
                                                                editor.putBoolean("ROCKET_ONE_TAP", false);
                                                            }
                                                            SharedPreferences.Editor editor2 = zy10Var2.y;
                                                            if (editor2 != null) {
                                                                editor2.apply();
                                                            }
                                                            zy10Var2.g1();
                                                            e activity4 = zy10Var2.getActivity();
                                                            if (activity4 != null && (supportFragmentManager3 = activity4.getSupportFragmentManager()) != null) {
                                                                supportFragmentManager3.a0();
                                                            }
                                                        } else {
                                                            zy10Var2.N0();
                                                            zy10Var2.p1 = false;
                                                            e activity5 = zy10Var2.getActivity();
                                                            if (activity5 != null && (supportFragmentManager2 = activity5.getSupportFragmentManager()) != null) {
                                                                supportFragmentManager2.a0();
                                                            }
                                                        }
                                                        return Unit.a;
                                                    }
                                                };
                                                int color = context4.getColor(R.color.redblack_confirm_dialog_left_button);
                                                int color2 = context4.getColor(R.color.redblack_confirm_dialog_right_button);
                                                fm60 fm60Var = new fm60();
                                                fm60Var.a = strB;
                                                fm60Var.b = "one tap bet";
                                                fm60Var.c = strB2;
                                                fm60Var.d = strB3;
                                                fm60Var.e = function1;
                                                fm60Var.v = color;
                                                fm60Var.w = color2;
                                                fm60Var.i = false;
                                                aVar.f(R.id.flContent, fm60Var, null);
                                                aVar.c("");
                                                aVar.d();
                                            }
                                        }
                                    }
                                }
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        }
                        PromotionGiftsResponse promotionGiftsResponse = zy10Var.l0;
                        if (promotionGiftsResponse != null && (entityList = promotionGiftsResponse.getEntityList()) != null) {
                            ArrayList<GiftItem> arrayList = (ArrayList) entityList;
                            zy10Var.s0 = arrayList;
                            if (arrayList.size() > 0) {
                                zt50 zt50Var14 = zy10Var.b;
                                if (zt50Var14 != null && zt50Var14.S.getFbgRoundId() == 0 && (zt50Var12 = zy10Var.b) != null && zt50Var12.R.getFbgRoundId() == 0 && (zt50Var13 = zy10Var.b) != null && zt50Var13.z.getFbgRoundId() == 0) {
                                    zy10Var.y1();
                                }
                                if (zy10Var.p1) {
                                    ArrayList<GiftItem> arrayList2 = zy10Var.s0;
                                    arrayList2.getClass();
                                    int size = arrayList2.size();
                                    double curBal = 0.0d;
                                    int i6 = 0;
                                    while (i6 < size) {
                                        GiftItem giftItem = arrayList2.get(i6);
                                        i6++;
                                        curBal += giftItem.getCurBal();
                                    }
                                    ArrayList<GiftItem> arrayList3 = zy10Var.s0;
                                    op5 op5Var2 = op5.a;
                                    String currency = arrayList3.get(0).getCurrency();
                                    op5Var2.getClass();
                                    String strI2 = op5.i(currency);
                                    zt50 zt50Var15 = zy10Var.b;
                                    if (zt50Var15 != null) {
                                        GiftToast.setToastText$default(zt50Var15.I, strI2, curBal, null, 4, null);
                                    }
                                    zt50 zt50Var16 = zy10Var.b;
                                    if (zt50Var16 != null) {
                                        zt50Var16.I.setClickable(true);
                                    }
                                    jbh.a.j(new FbgData(true, Double.valueOf(curBal), strI2));
                                    zt50 zt50Var17 = zy10Var.b;
                                    if (zt50Var17 != null) {
                                        zt50Var17.I.setVisibility(0);
                                    }
                                    zt50 zt50Var18 = zy10Var.b;
                                    if (zt50Var18 != null) {
                                        zt50Var18.I.startAnimation(AnimationUtils.loadAnimation(zy10Var.getContext(), R.anim.fade_in_fade_out_toast));
                                    }
                                }
                                ej5.c(ebs.a(zy10Var.getLifecycle()), null, null, new jz10(zy10Var, null), 3);
                            } else {
                                zy10.z0(zy10Var);
                            }
                            zy10Var.p1 = false;
                        }
                    }
                } else if (i5 == 3) {
                    zy10Var.Q0 = false;
                }
                return Unit.a;
            }
        }));
        b1().A.f(getViewLifecycleOwner(), new l(new egj(this, i4)));
        b1().y.f(getViewLifecycleOwner(), new l(new fgj(this, i2)));
        zt50 zt50Var12 = this.b;
        if (zt50Var12 != null && (sswVar2 = zt50Var12.M.isRoundEnd) != null) {
            sswVar2.f(getViewLifecycleOwner(), new l(new ox10(this, i3)));
        }
        zt50 zt50Var13 = this.b;
        if (zt50Var13 != null && (sswVar = zt50Var13.M.isRoundPreStart) != null) {
            sswVar.f(getViewLifecycleOwner(), new l(new ggj(this, i4)));
        }
        b1().C.f(getViewLifecycleOwner(), new l(new hgj(this, i4)));
        Z0().w.f(getViewLifecycleOwner(), new l(new px10(this, 0)));
        b1().D.f(getViewLifecycleOwner(), new l(new jgj(this, i4)));
        b1().E.f(getViewLifecycleOwner(), new l(new Function1() { // from class: qx10
            /* JADX WARN: Code duplicated, block: B:102:0x014d A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:50:0x013c  */
            /* JADX WARN: Code duplicated, block: B:51:0x0141  */
            /* JADX WARN: Code duplicated, block: B:54:0x014a  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List list;
                String messageType;
                Integer code;
                LoadingState loadingState = (LoadingState) obj;
                zy10 zy10Var = this.a;
                zt50 zt50Var14 = zy10Var.b;
                if (zt50Var14 != null) {
                    PrUserBet prUserBet = zt50Var14.Z;
                    loadingState.getClass();
                    ArrayList arrayList = zy10Var.G0;
                    GameSocektResponse gameSocektResponse = zy10Var.I0;
                    long j2 = zy10Var.O;
                    long j3 = zy10Var.P;
                    arrayList.getClass();
                    int i5 = PrUserBet.a.a[loadingState.getStatus().ordinal()];
                    if (i5 == 1) {
                        prUserBet.binding.v.setVisibility(8);
                        prUserBet.binding.f.setVisibility(0);
                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                        if (hTTPResponse != null && (list = (List) hTTPResponse.getData()) != null) {
                            List<BetDetails> listB = y8h0.b(list);
                            prUserBet.d = listB;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : listB) {
                                if (Intrinsics.g(((BetDetails) obj2).getTicketStatus(), PBBetHistoryItemDTO.STATUS_PENDING)) {
                                    arrayList2.add(obj2);
                                }
                            }
                            if (prUserBet.f) {
                                ArrayList arrayList3 = new ArrayList();
                                int size = arrayList.size();
                                int i6 = 0;
                                while (i6 < size) {
                                    Object obj3 = arrayList.get(i6);
                                    i6++;
                                    BetDetails betDetails = (BetDetails) obj3;
                                    if (Intrinsics.g(betDetails.getTicketStatus(), "ONGOING")) {
                                        List<BetDetails> list2 = prUserBet.d;
                                        if (list2 == null || !list2.isEmpty()) {
                                            Iterator<T> it = list2.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    if (gameSocektResponse != null) {
                                                        messageType = gameSocektResponse.getMessageType();
                                                    } else {
                                                        messageType = null;
                                                    }
                                                    if (Intrinsics.g(messageType, "ROUND_WAITING")) {
                                                        arrayList3.add(obj3);
                                                    }
                                                } else if (((BetDetails) it.next()).getBetId() == betDetails.getBetId()) {
                                                }
                                            }
                                        } else {
                                            if (gameSocektResponse != null) {
                                                messageType = gameSocektResponse.getMessageType();
                                            } else {
                                                messageType = null;
                                            }
                                            if (Intrinsics.g(messageType, "ROUND_WAITING")) {
                                                arrayList3.add(obj3);
                                            }
                                        }
                                    }
                                }
                                List listR0 = CollectionsKt.r0(arrayList3, new m920());
                                if (!listR0.isEmpty()) {
                                    prUserBet.d.addAll(0, listR0);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                int size2 = arrayList2.size();
                                for (int i7 = 0; i7 < size2; i7++) {
                                    int size3 = arrayList.size();
                                    for (int i8 = 0; i8 < size3; i8++) {
                                        if (((BetDetails) arrayList2.get(i7)).getBetId() == ((BetDetails) arrayList.get(i8)).getBetId() && (((BetDetails) arrayList.get(i8)).getRoundId() == j2 || ((BetDetails) arrayList.get(i8)).getRoundId() == j3)) {
                                            ((BetDetails) arrayList2.get(i7)).setTicketStatus(((BetDetails) arrayList.get(i8)).getTicketStatus());
                                            ((BetDetails) arrayList2.get(i7)).setPayoutAmount(((BetDetails) arrayList.get(i8)).getPayoutAmount());
                                            ((BetDetails) arrayList2.get(i7)).setCreatedAt(((BetDetails) arrayList.get(i8)).getCreatedAt());
                                            ((BetDetails) arrayList2.get(i7)).setBackground(((BetDetails) arrayList.get(i8)).isBackground());
                                            ((BetDetails) arrayList2.get(i7)).setCashoutCoefficient(((BetDetails) arrayList.get(i8)).getCashoutCoefficient());
                                        }
                                    }
                                }
                            }
                            prUserBet.c();
                        }
                        if (!prUserBet.f) {
                            ArrayList arrayList4 = prUserBet.e;
                            if (arrayList4.size() > 1) {
                                o48.v(new n920(), arrayList4);
                            }
                            p48.A(arrayList4, new wsj(prUserBet, 1));
                            int size4 = arrayList4.size();
                            for (int i9 = 0; i9 < size4; i9++) {
                                prUserBet.d.add(0, (BetDetails) arrayList4.get(i9));
                            }
                            o920 o920Var = prUserBet.c;
                            if (o920Var != null) {
                                List<BetDetails> list3 = prUserBet.d;
                                list3.getClass();
                                o920Var.c = list3;
                                o920Var.a = y8h0.b(list3);
                                o920Var.notifyDataSetChanged();
                            } else {
                                prUserBet.c();
                            }
                            arrayList4.clear();
                        }
                        boolean zIsEmpty = prUserBet.d.isEmpty();
                        fw2 fw2Var = prUserBet.binding;
                        if (zIsEmpty) {
                            fw2Var.d.setVisibility(0);
                        } else {
                            fw2Var.d.setVisibility(8);
                        }
                    } else if (i5 == 2) {
                        prUserBet.binding.f.setVisibility(8);
                        prUserBet.binding.v.setVisibility(0);
                    } else {
                        if (i5 != 3) {
                            uhc.a();
                            return null;
                        }
                        prUserBet.binding.v.setVisibility(8);
                        ResultWrapper.GenericError error = loadingState.getError();
                        if (error == null || (code = error.getCode()) == null || code.intValue() != 403) {
                            rlz rlzVar = rlz.d;
                            Context context3 = prUserBet.getContext();
                            context3.getClass();
                            ResultWrapper.GenericError error2 = loadingState.getError();
                            j920 j920Var = new j920();
                            k920 k920Var = new k920();
                            l920 l920Var = new l920();
                            prUserBet.getContext().getColor(R.color.try_again_color);
                            rlzVar.c(context3, error2, j920Var, k920Var, l920Var, 0, (1728 & 128) != 0 ? new slz() : null, (1728 & 512) != 0 ? new tlz() : null, new ulz());
                        } else {
                            SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                        }
                    }
                }
                return Unit.a;
            }
        }));
        Z0().f.f(getViewLifecycleOwner(), new l(new qfe(this, i4)));
        zt50 zt50Var14 = this.b;
        if (zt50Var14 != null && (redRocketFired = zt50Var14.M.getRedRocketFired()) != null) {
            redRocketFired.f(getViewLifecycleOwner(), new l(new b8j(this, i4)));
        }
        zt50 zt50Var15 = this.b;
        if (zt50Var15 != null && (purpleRocketFired = zt50Var15.M.getPurpleRocketFired()) != null) {
            purpleRocketFired.f(getViewLifecycleOwner(), new l(new c8j(this, i4)));
        }
        zt50 zt50Var16 = this.b;
        if (zt50Var16 != null && (blueRocketFired = zt50Var16.M.getBlueRocketFired()) != null) {
            blueRocketFired.f(getViewLifecycleOwner(), new l(new nu10(this, i3)));
        }
        zt50 zt50Var17 = this.b;
        if (zt50Var17 != null) {
            zt50Var17.Y.setOnClickListener(new View.OnClickListener() { // from class: yy10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    zy10 zy10Var = this.a;
                    GameDetails gameDetails2 = zy10Var.B;
                    wz.a("TopWinsClicked", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
                    zt50 zt50Var18 = zy10Var.b;
                    if (zt50Var18 != null) {
                        zt50Var18.N.setEnabled(true);
                    }
                    zt50 zt50Var19 = zy10Var.b;
                    if (zt50Var19 != null) {
                        zt50Var19.b.setEnabled(true);
                    }
                    zt50 zt50Var20 = zy10Var.b;
                    if (zt50Var20 != null) {
                        zt50Var20.Y.setEnabled(false);
                    }
                    zt50 zt50Var21 = zy10Var.b;
                    if (zt50Var21 != null) {
                        zt50Var21.Z.setVisibility(8);
                    }
                    zt50 zt50Var22 = zy10Var.b;
                    if (zt50Var22 != null) {
                        zt50Var22.e.setVisibility(8);
                    }
                    zt50 zt50Var23 = zy10Var.b;
                    if (zt50Var23 != null) {
                        zt50Var23.X.setVisibility(0);
                    }
                    zy10Var.B0 = "Top Wins";
                    zt50 zt50Var24 = zy10Var.b;
                    if (zt50Var24 != null) {
                        PrTopWin prTopWin = zt50Var24.X;
                        fn1 fn1VarB2 = zy10Var.b1();
                        ibs viewLifecycleOwner = zy10Var.getViewLifecycleOwner();
                        viewLifecycleOwner.getClass();
                        prTopWin.a(fn1VarB2, viewLifecycleOwner);
                    }
                }
            });
        }
        zt50 zt50Var18 = this.b;
        if (zt50Var18 != null) {
            zt50Var18.N.setOnClickListener(new View.OnClickListener() { // from class: cx10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    zt50 zt50Var19;
                    zy10 zy10Var = this.a;
                    GameDetails gameDetails2 = zy10Var.B;
                    wz.a("MyBetsClicked", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
                    zt50 zt50Var20 = zy10Var.b;
                    if (zt50Var20 != null) {
                        zt50Var20.N.setEnabled(false);
                    }
                    zt50 zt50Var21 = zy10Var.b;
                    if (zt50Var21 != null) {
                        zt50Var21.b.setEnabled(true);
                    }
                    zt50 zt50Var22 = zy10Var.b;
                    if (zt50Var22 != null) {
                        zt50Var22.Y.setEnabled(true);
                    }
                    zt50 zt50Var23 = zy10Var.b;
                    if (zt50Var23 != null) {
                        zt50Var23.X.setVisibility(8);
                    }
                    zt50 zt50Var24 = zy10Var.b;
                    if (zt50Var24 != null) {
                        zt50Var24.e.setVisibility(8);
                    }
                    zt50 zt50Var25 = zy10Var.b;
                    if (zt50Var25 != null) {
                        zt50Var25.Z.setVisibility(0);
                    }
                    zy10Var.B0 = "My Bets";
                    if (!zy10Var.h1() || (zt50Var19 = zy10Var.b) == null) {
                        return;
                    }
                    PrUserBet prUserBet = zt50Var19.Z;
                    fn1 fn1VarB2 = zy10Var.b1();
                    ibs viewLifecycleOwner = zy10Var.getViewLifecycleOwner();
                    viewLifecycleOwner.getClass();
                    prUserBet.b(fn1VarB2, viewLifecycleOwner, true);
                }
            });
        }
        zt50 zt50Var19 = this.b;
        if (zt50Var19 != null) {
            zt50Var19.b.setOnClickListener(new View.OnClickListener() { // from class: hx10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    zy10 zy10Var = this.a;
                    GameDetails gameDetails2 = zy10Var.B;
                    wz.a("AllBetsClicked", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
                    zt50 zt50Var20 = zy10Var.b;
                    if (zt50Var20 != null) {
                        zt50Var20.N.setEnabled(true);
                    }
                    zt50 zt50Var21 = zy10Var.b;
                    if (zt50Var21 != null) {
                        zt50Var21.b.setEnabled(false);
                    }
                    zt50 zt50Var22 = zy10Var.b;
                    if (zt50Var22 != null) {
                        zt50Var22.Y.setEnabled(true);
                    }
                    zt50 zt50Var23 = zy10Var.b;
                    if (zt50Var23 != null) {
                        zt50Var23.X.setVisibility(8);
                    }
                    zt50 zt50Var24 = zy10Var.b;
                    if (zt50Var24 != null) {
                        zt50Var24.Z.setVisibility(8);
                    }
                    zt50 zt50Var25 = zy10Var.b;
                    if (zt50Var25 != null) {
                        zt50Var25.e.setVisibility(0);
                    }
                    zy10Var.B0 = "All Bets";
                    zt50 zt50Var26 = zy10Var.b;
                    if (zt50Var26 != null) {
                        PrAllUserBet prAllUserBet = zt50Var26.e;
                        fn1 fn1VarB2 = zy10Var.b1();
                        ibs viewLifecycleOwner = zy10Var.getViewLifecycleOwner();
                        viewLifecycleOwner.getClass();
                        prAllUserBet.a(fn1VarB2, viewLifecycleOwner);
                    }
                }
            });
        }
        zt50 zt50Var20 = this.b;
        if (zt50Var20 != null && (binding9 = zt50Var20.M.getBinding()) != null) {
            gr60.a(binding9.h0, new Function1() { // from class: lx10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((View) obj).getClass();
                    zy10 zy10Var = this.a;
                    GameDetails gameDetails2 = zy10Var.B;
                    wz.a("RoundHistoryClicked", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
                    e activity3 = zy10Var.getActivity();
                    if (activity3 != null) {
                        fn1 fn1VarB2 = zy10Var.b1();
                        ibs viewLifecycleOwner = zy10Var.getViewLifecycleOwner();
                        viewLifecycleOwner.getClass();
                        eoa0 eoa0VarZ0 = zy10Var.Z0();
                        a920 a920Var = new a920(activity3);
                        a920Var.a = fn1VarB2;
                        a920Var.b = viewLifecycleOwner;
                        a920Var.c = zy10Var;
                        a920Var.d = eoa0VarZ0;
                        a920Var.i = new ArrayList();
                        a920Var.setCancelable(true);
                        a920Var.setCanceledOnTouchOutside(false);
                        zy10Var.h0 = a920Var;
                        try {
                            Window window2 = a920Var.getWindow();
                            WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
                            if (attributes != null) {
                                attributes.gravity = 17;
                            }
                            if (attributes != null) {
                                attributes.flags &= -5;
                            }
                            Window window3 = a920Var.getWindow();
                            if (window3 != null) {
                                window3.setAttributes(attributes);
                            }
                            Window window4 = a920Var.getWindow();
                            if (window4 != null) {
                                window4.setBackgroundDrawableResource(R.color.dialog_bg_color);
                            }
                            a920Var.show();
                            Window window5 = a920Var.getWindow();
                            if (window5 != null) {
                                window5.setLayout(-1, -1);
                            }
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                    return Unit.a;
                }
            });
        }
        zt50 zt50Var21 = this.b;
        if (zt50Var21 != null) {
            zt50Var21.S.setBetListener(new mx10(this, i3), new ypo(this, 1), new nx10(this, i3));
        }
        zt50 zt50Var22 = this.b;
        if (zt50Var22 != null) {
            zt50Var22.z.setBetListener(new m56(this, i4), new jne(this, i4), new y6t(this, 1));
        }
        zt50 zt50Var23 = this.b;
        if (zt50Var23 != null) {
            zt50Var23.R.setBetListener(new pfe(this, i4), new vu10(this, 0), new e8a(this, 2));
        }
        zt50 zt50Var24 = this.b;
        if (zt50Var24 != null) {
            zt50Var24.S.setCashoutListener(new Function1() { // from class: nv10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    GameSocektResponse.Info info;
                    GameSocektResponse.Info.InfoDetails red;
                    String multiplier;
                    zt50 zt50Var25;
                    ((String) obj).getClass();
                    zy10 zy10Var = this.a;
                    GameSocektResponse gameSocektResponse = zy10Var.Q;
                    if (gameSocektResponse != null && (info = gameSocektResponse.getInfo()) != null && (red = info.getRED()) != null && (multiplier = red.getMultiplier()) != null && (zt50Var25 = zy10Var.b) != null) {
                        zy10Var.F0(zt50Var25.S, multiplier, "RED");
                    }
                    return Unit.a;
                }
            });
        }
        zt50 zt50Var25 = this.b;
        if (zt50Var25 != null) {
            zt50Var25.z.setCashoutListener(new r3t(this, i4));
        }
        zt50 zt50Var26 = this.b;
        if (zt50Var26 != null) {
            zt50Var26.R.setCashoutListener(new xv10(this, i3));
        }
        zt50 zt50Var27 = this.b;
        if (zt50Var27 != null) {
            zt50Var27.K.setBackListener(new rdj(this, 1));
        }
        zt50 zt50Var28 = this.b;
        if (zt50Var28 != null && (binding8 = zt50Var28.K.getBinding()) != null) {
            binding8.d.setOnClickListener(new View.OnClickListener() { // from class: lw10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    zy10 zy10Var = this.a;
                    try {
                        if (!zy10Var.i1()) {
                            zy10Var.m1();
                        } else {
                            zy10Var.r0 = zy10.a.b;
                            zy10Var.o1();
                        }
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
            });
        }
        zt50 zt50Var29 = this.b;
        if (zt50Var29 != null) {
            zt50Var29.S.setConfirmBetListener(new Function1() { // from class: vw10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    zt50 zt50Var30;
                    zt50 zt50Var31;
                    String str2 = (String) obj;
                    str2.getClass();
                    zy10 zy10Var = this.a;
                    if (zy10Var.i1()) {
                        zy10Var.o1();
                    } else {
                        if (zy10Var.M != null && (zt50Var30 = zy10Var.b) != null && !zt50Var30.S.getBetPlaced() && (zt50Var31 = zy10Var.b) != null && !zt50Var31.S.getBetInProgress()) {
                            zy10Var.e = false;
                        }
                        zt50 zt50Var32 = zy10Var.b;
                        BetContainer betContainer = zt50Var32 != null ? zt50Var32.S : null;
                        boolean z2 = zy10Var.S;
                        List<DetailResponse> list = zy10Var.M;
                        if (list == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        zy10Var.I0(betContainer, z2, list.get(0), str2, "RED");
                    }
                    return Unit.a;
                }
            }, new hfj(this, i4), new jfj(this, i4));
        }
        zt50 zt50Var30 = this.b;
        if (zt50Var30 != null) {
            zt50Var30.R.setConfirmBetListener(new Function1() { // from class: dx10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    zt50 zt50Var31;
                    zt50 zt50Var32;
                    String str2 = (String) obj;
                    str2.getClass();
                    zy10 zy10Var = this.a;
                    if (zy10Var.i1()) {
                        zy10Var.o1();
                    } else {
                        if (zy10Var.M != null && (zt50Var31 = zy10Var.b) != null && !zt50Var31.R.getBetPlaced() && (zt50Var32 = zy10Var.b) != null && !zt50Var32.R.getBetInProgress()) {
                            zy10Var.i = false;
                        }
                        zt50 zt50Var33 = zy10Var.b;
                        BetContainer betContainer = zt50Var33 != null ? zt50Var33.R : null;
                        boolean z2 = zy10Var.Z;
                        List<DetailResponse> list = zy10Var.M;
                        if (list == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        zy10Var.I0(betContainer, z2, list.get(1), str2, "PURPLE");
                    }
                    return Unit.a;
                }
            }, new g6t(this, 1), new ex10(this, i3));
        }
        zt50 zt50Var31 = this.b;
        if (zt50Var31 != null) {
            zt50Var31.z.setConfirmBetListener(new mfj(this, i4), new nfj(this, i2), new xs0(this, 1));
        }
        zt50 zt50Var32 = this.b;
        if (zt50Var32 != null) {
            zt50Var32.S.setCancelBetListener(new x46(this, i4));
        }
        zt50 zt50Var33 = this.b;
        if (zt50Var33 != null) {
            zt50Var33.R.setCancelBetListener(new Function1() { // from class: fx10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((String) obj).getClass();
                    zy10 zy10Var = this.a;
                    zt50 zt50Var34 = zy10Var.b;
                    zy10Var.C0(zt50Var34 != null ? zt50Var34.R : null);
                    zy10Var.i = false;
                    return Unit.a;
                }
            });
        }
        zt50 zt50Var34 = this.b;
        if (zt50Var34 != null) {
            zt50Var34.z.setCancelBetListener(new o6t(this, i4));
        }
        zt50 zt50Var35 = this.b;
        if (zt50Var35 != null) {
            zt50Var35.S.setautoCashoutListener(new gaj() { // from class: ix10
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    String str2 = (String) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    zy10 zy10Var = this.a;
                    if (str2 == null || str2.length() == 0 || str2.length() == 0) {
                        zy10Var.S = zBooleanValue;
                    }
                    zy10Var.s0(iIntValue, zy10Var.u0, str2, zBooleanValue);
                    if (!zy10Var.S) {
                        zt50 zt50Var36 = zy10Var.b;
                        zy10.t1(zt50Var36 != null ? zt50Var36.S : null);
                    }
                    return Unit.a;
                }
            });
        }
        zt50 zt50Var36 = this.b;
        if (zt50Var36 != null) {
            zt50Var36.R.setautoCashoutListener(new gaj() { // from class: jx10
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    String str2 = (String) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    zy10 zy10Var = this.a;
                    if (str2 == null || str2.length() == 0 || str2.length() == 0) {
                        zy10Var.Z = zBooleanValue;
                    }
                    zy10Var.s0(iIntValue, zy10Var.v0, str2, zBooleanValue);
                    if (!zy10Var.Z) {
                        zt50 zt50Var37 = zy10Var.b;
                        zy10.t1(zt50Var37 != null ? zt50Var37.R : null);
                    }
                    return Unit.a;
                }
            });
        }
        zt50 zt50Var37 = this.b;
        if (zt50Var37 != null) {
            zt50Var37.z.setautoCashoutListener(new gaj() { // from class: kx10
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    String str2 = (String) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    zy10 zy10Var = this.a;
                    if (str2 == null || str2.length() == 0 || str2.length() == 0) {
                        zy10Var.W = zBooleanValue;
                    }
                    zy10Var.s0(iIntValue, zy10Var.w0, str2, zBooleanValue);
                    if (!zy10Var.W) {
                        zt50 zt50Var38 = zy10Var.b;
                        zy10.t1(zt50Var38 != null ? zt50Var38.z : null);
                    }
                    return Unit.a;
                }
            });
        }
        Z0().b.f(getViewLifecycleOwner(), new l(new uu10(this, i3)));
        Z0().v.f(getViewLifecycleOwner(), new l(new wu10(this, i3)));
        Z0().i.f(getViewLifecycleOwner(), new l(new xu10(this, i3)));
        Z0().d.f(getViewLifecycleOwner(), new l(new yu10(this, 0)));
        fb7.a.f(getViewLifecycleOwner(), new l(new Function1() { // from class: iy10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                GameSocektResponse.Info info;
                GameSocektResponse.Info.InfoDetails red;
                String multiplier;
                zt50 zt50Var38;
                zy10 zy10Var = this.a;
                GameSocektResponse gameSocektResponse = zy10Var.Q;
                if (gameSocektResponse != null && (info = gameSocektResponse.getInfo()) != null && (red = info.getRED()) != null && (multiplier = red.getMultiplier()) != null && (zt50Var38 = zy10Var.b) != null) {
                    zy10Var.F0(zt50Var38.S, multiplier, "RED");
                }
                wz.a("ChatCashout", "Pocket Rockets", "RED");
                return Unit.a;
            }
        }));
        fb7.b.f(getViewLifecycleOwner(), new l(new Function1() { // from class: ny10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                GameSocektResponse.Info info;
                GameSocektResponse.Info.InfoDetails purple;
                String multiplier;
                zt50 zt50Var38;
                zy10 zy10Var = this.a;
                GameSocektResponse gameSocektResponse = zy10Var.Q;
                if (gameSocektResponse != null && (info = gameSocektResponse.getInfo()) != null && (purple = info.getPURPLE()) != null && (multiplier = purple.getMultiplier()) != null && (zt50Var38 = zy10Var.b) != null) {
                    zy10Var.F0(zt50Var38.R, multiplier, "PURPLE");
                }
                wz.a("ChatCashout", "Pocket Rockets", "PURPLE");
                return Unit.a;
            }
        }));
        fb7.c.f(getViewLifecycleOwner(), new l(new vy0(this, i4)));
        zt50 zt50Var38 = this.b;
        if (zt50Var38 != null) {
            zt50Var38.K.setNavigationListener(new xy10(this, i3));
        }
        zt50 zt50Var39 = this.b;
        if (zt50Var39 != null) {
            zt50Var39.S.setBetStepListener(new ok0(this));
        }
        zt50 zt50Var40 = this.b;
        if (zt50Var40 != null) {
            zt50Var40.R.setBetStepListener(new dix(this));
        }
        zt50 zt50Var41 = this.b;
        if (zt50Var41 != null) {
            zt50Var41.z.setBetStepListener(new mu10());
        }
        zt50 zt50Var42 = this.b;
        if (zt50Var42 != null) {
            zt50Var42.S.setAutoCashoutAmount(new y6a(this, i2));
        }
        zt50 zt50Var43 = this.b;
        if (zt50Var43 != null) {
            zt50Var43.R.setAutoCashoutAmount(new cho(this, i4));
        }
        zt50 zt50Var44 = this.b;
        if (zt50Var44 != null) {
            zt50Var44.z.setAutoCashoutAmount(new y7j(this, i4));
        }
        zt50 zt50Var45 = this.b;
        if (zt50Var45 != null) {
            zt50Var45.S.setFBGRemoveListener(new cux(this, 1));
        }
        zt50 zt50Var46 = this.b;
        if (zt50Var46 != null) {
            zt50Var46.R.setFBGRemoveListener(new dux(this, 1));
        }
        zt50 zt50Var47 = this.b;
        if (zt50Var47 != null) {
            zt50Var47.z.setFBGRemoveListener(new eux(this, 1));
        }
        zt50 zt50Var48 = this.b;
        if (zt50Var48 != null) {
            zt50Var48.L.setNumberClick(new s76(this, i4));
        }
        zt50 zt50Var49 = this.b;
        if (zt50Var49 != null) {
            zt50Var49.L.setDoneClick(new Function0() { // from class: ky10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    zy10 zy10Var = this.a;
                    int i5 = zy10Var.t0;
                    if (i5 == zy10Var.u0) {
                        zt50 zt50Var50 = zy10Var.b;
                        if (zt50Var50 != null) {
                            zt50Var50.S.setDone();
                        }
                    } else {
                        int i6 = zy10Var.v0;
                        zt50 zt50Var51 = zy10Var.b;
                        if (i5 == i6) {
                            if (zt50Var51 != null) {
                                zt50Var51.R.setDone();
                            }
                        } else if (zt50Var51 != null) {
                            zt50Var51.z.setDone();
                        }
                    }
                    zt50 zt50Var52 = zy10Var.b;
                    if (zt50Var52 != null) {
                        zt50Var52.L.setVisibility(8);
                    }
                    return Unit.a;
                }
            });
        }
        zt50 zt50Var50 = this.b;
        if (zt50Var50 != null) {
            zt50Var50.L.setClearClick(new ly10(this, i3));
        }
        zt50 zt50Var51 = this.b;
        if (zt50Var51 != null) {
            zt50Var51.L.setCrossClick(new b86(this, i4));
        }
        zt50 zt50Var52 = this.b;
        if (zt50Var52 != null) {
            zt50Var52.L.setDoubleZeroClick(new c86(this, i2));
        }
        zt50 zt50Var53 = this.b;
        if (zt50Var53 != null) {
            zt50Var53.L.setPointClick(new d86(this, i4));
        }
        zt50 zt50Var54 = this.b;
        if (zt50Var54 != null) {
            zt50Var54.S.setautoBetListener(new my10(this, i3), new Function1() { // from class: oy10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    nk2 binding12;
                    ((Boolean) obj).getClass();
                    zy10 zy10Var = this.a;
                    zt50 zt50Var55 = zy10Var.b;
                    if (zt50Var55 != null && (binding12 = zt50Var55.S.getBinding()) != null) {
                        binding12.d.setStatus(false);
                    }
                    ((x5a0) zy10Var.c1).setValue(Boolean.TRUE);
                    return Unit.a;
                }
            }, new yx0(this, i4), new py10(this, 0));
        }
        zt50 zt50Var55 = this.b;
        if (zt50Var55 != null) {
            zt50Var55.R.setautoBetListener(new Function1() { // from class: ry10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    zt50 zt50Var56;
                    nk2 binding12;
                    c920 binding13;
                    nk2 binding14;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    zy10 zy10Var = this.a;
                    zy10Var.Y = zBooleanValue;
                    zy10Var.X = 0;
                    zt50 zt50Var57 = zy10Var.b;
                    zy10Var.q0(zt50Var57 != null ? zt50Var57.R : null);
                    wz.a(zy10Var.Y ? "AutoBetOnPURPLE" : "AutoBetOffPURPLE", "Pocket Rockets", "bet");
                    zt50 zt50Var58 = zy10Var.b;
                    if (zt50Var58 != null && (binding14 = zt50Var58.R.getBinding()) != null && binding14.W.getVisibility() == 0) {
                        zy10Var.i = false;
                    }
                    if (!zy10Var.Y && (zt50Var56 = zy10Var.b) != null && (binding12 = zt50Var56.R.getBinding()) != null && (binding13 = binding12.d.getBinding()) != null) {
                        binding13.b.setText("");
                    }
                    return Unit.a;
                }
            }, new kre(this, i4), new sy10(this, 0), new ty10(this, 0));
        }
        zt50 zt50Var56 = this.b;
        if (zt50Var56 != null) {
            zt50Var56.z.setautoBetListener(new Function1() { // from class: uy10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    zt50 zt50Var57;
                    nk2 binding12;
                    c920 binding13;
                    nk2 binding14;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    zy10 zy10Var = this.a;
                    zy10Var.V = zBooleanValue;
                    zy10Var.U = 0;
                    zt50 zt50Var58 = zy10Var.b;
                    zy10Var.q0(zt50Var58 != null ? zt50Var58.z : null);
                    wz.a(zy10Var.V ? "AutoBetOnBLUE" : "AutoBetOffBLUE", "Pocket Rockets", "bet");
                    zt50 zt50Var59 = zy10Var.b;
                    if (zt50Var59 != null && (binding14 = zt50Var59.z.getBinding()) != null && binding14.W.getVisibility() == 0) {
                        zy10Var.f = false;
                    }
                    if (!zy10Var.V && (zt50Var57 = zy10Var.b) != null && (binding12 = zt50Var57.z.getBinding()) != null && (binding13 = binding12.d.getBinding()) != null) {
                        binding13.b.setText("");
                    }
                    return Unit.a;
                }
            }, new gfa(this, i4), new vy10(this, 0), new wy10(this, 0));
        }
        try {
            androidx.fragment.app.e activity3 = getActivity();
            if (activity3 != null) {
                String str2 = ((db6) this.V0.getValue()).c;
                if (str2 == null) {
                    str2 = "Ongoing";
                }
                this.O0 = new z66(activity3, str2);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        androidx.fragment.app.e activity4 = getActivity();
        if (activity4 != null) {
            zt50 zt50Var57 = this.b;
            if (zt50Var57 != null && (binding7 = zt50Var57.S.getBinding()) != null) {
                binding7.d.setOnOffColor(activity4);
            }
            zt50 zt50Var58 = this.b;
            if (zt50Var58 != null && (binding6 = zt50Var58.z.getBinding()) != null) {
                binding6.d.setOnOffColor(activity4);
            }
            zt50 zt50Var59 = this.b;
            if (zt50Var59 != null && (binding5 = zt50Var59.R.getBinding()) != null) {
                binding5.d.setOnOffColor(activity4);
            }
            a1();
            this.y0 = new xbg(activity4, "Pocket Rockets");
        }
        tb5 tb5VarB = d77.b(2, 6, null);
        nas nasVarA = ebs.a(getLifecycle());
        pfd pfdVar = fse.a;
        wcl wclVar = gku.a;
        ej5.c(nasVarA, wclVar, null, new k(tb5VarB, null), 2);
        this.C0 = tb5VarB;
        zt50 zt50Var60 = this.b;
        if (zt50Var60 != null && (binding4 = zt50Var60.S.getBinding()) != null) {
            final TextView textView = binding4.e;
            final TextView textView2 = binding4.c;
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: pu10
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                    textView2.setTextSize(0, textView.getTextSize());
                }
            });
        }
        zt50 zt50Var61 = this.b;
        if (zt50Var61 != null && (binding3 = zt50Var61.R.getBinding()) != null) {
            final TextView textView3 = binding3.e;
            final TextView textView4 = binding3.c;
            textView3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: pu10
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                    textView4.setTextSize(0, textView3.getTextSize());
                }
            });
        }
        zt50 zt50Var62 = this.b;
        if (zt50Var62 != null && (binding2 = zt50Var62.z.getBinding()) != null) {
            final TextView textView5 = binding2.e;
            final TextView textView6 = binding2.c;
            textView5.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: pu10
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                    textView6.setTextSize(0, textView5.getTextSize());
                }
            });
        }
        NetworkStateManager.INSTANCE.observeNetworkState().f(getViewLifecycleOwner(), new l(new jy10(this, i3)));
        tb5 tb5VarB2 = d77.b(2, 6, null);
        ej5.c(ebs.a(getLifecycle()), wclVar, null, new j(tb5VarB2, null), 2);
        this.v = tb5VarB2;
        this.p1 = true;
        zt50 zt50Var63 = this.b;
        if (zt50Var63 != null) {
            zt50Var63.d.setText("(0)");
        }
        zt50 zt50Var64 = this.b;
        if (zt50Var64 != null) {
            ComposeView composeView = zt50Var64.D;
            composeView.setViewCompositionStrategy(u6i0.c.a);
            composeView.setContent(new op8(261802144, new Function2() { // from class: qy10
                /* JADX WARN: Code duplicated, block: B:107:0x0273  */
                /* JADX WARN: Code duplicated, block: B:113:0x0292  */
                /* JADX WARN: Code duplicated, block: B:119:0x02af  */
                /* JADX WARN: Code duplicated, block: B:125:0x02ce  */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a.C0041a.C0042a c0042a;
                    int i5;
                    String str3;
                    Object obj3;
                    androidx.compose.runtime.a.C0041a.C0042a c0042a2;
                    Object obj4;
                    String str4;
                    nk2 binding12;
                    BigDecimal bigDecimalE0;
                    BigDecimal bigDecimalE1;
                    int i6;
                    androidx.compose.runtime.a.C0041a.C0042a c0042a3;
                    boolean zA;
                    Object objY;
                    boolean zA2;
                    Object objY2;
                    boolean zA3;
                    Object objY3;
                    boolean zA4;
                    Object objY4;
                    nk2 binding13;
                    GameSocektResponse.Info info;
                    GameSocektResponse.Info.InfoDetails blue;
                    String multiplier;
                    GameSocektResponse.Info info2;
                    GameSocektResponse.Info.InfoDetails blue2;
                    String multiplier2;
                    nk2 binding14;
                    androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i7 = 2;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final zy10 zy10Var = this.a;
                        ytw<Boolean> ytwVar = zy10Var.c1;
                        ytw<Double> ytwVar2 = zy10Var.a1;
                        ytw<Double> ytwVar3 = zy10Var.Z0;
                        ytw<Double> ytwVar4 = zy10Var.Y0;
                        ytw<Double> ytwVar5 = zy10Var.b1;
                        boolean zBooleanValue = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
                        androidx.compose.runtime.a.C0041a.C0042a c0042a4 = androidx.compose.runtime.a.C0041a.a;
                        if (zBooleanValue) {
                            aVar.N(-312744748);
                            HashMap map = new HashMap();
                            op5 op5Var = op5.a;
                            String str5 = zy10Var.t1;
                            op5Var.getClass();
                            map.put("{currency}", op5.i(str5));
                            zt50 zt50Var65 = zy10Var.b;
                            map.put("{amount}", String.valueOf((zt50Var65 == null || (binding14 = zt50Var65.S.getBinding()) == null) ? null : binding14.b.getText()));
                            String strB = op5.b("bet_per_round:sg_common", "Bet Per Round : ", map);
                            List<DetailResponse> list = zy10Var.M;
                            if (list == null) {
                                Intrinsics.n("gameDetailResponse");
                                throw null;
                            }
                            ArrayList<Double> autoBetChips = list.get(0).getAutoBetChips();
                            String strI2 = op5.i(zy10Var.t1);
                            boolean zA5 = aVar.A(zy10Var);
                            Object objY5 = aVar.y();
                            if (zA5 || objY5 == c0042a4) {
                                objY5 = new oro(zy10Var, i7);
                                aVar.r(objY5);
                            }
                            Function0 function0 = (Function0) objY5;
                            boolean zA6 = aVar.A(zy10Var);
                            Object objY6 = aVar.y();
                            if (zA6 || objY6 == c0042a4) {
                                objY6 = new Function1() { // from class: dy10
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        nk2 binding15;
                                        nk2 binding16;
                                        nk2 binding17;
                                        nk2 binding18;
                                        nk2 binding19;
                                        zt50 zt50Var66;
                                        nk2 binding20;
                                        c920 binding21;
                                        nk2 binding22;
                                        int iDoubleValue = (int) ((Double) obj5).doubleValue();
                                        zy10 zy10Var2 = zy10Var;
                                        zy10Var2.W0 = iDoubleValue;
                                        zt50 zt50Var67 = zy10Var2.b;
                                        if (zt50Var67 != null && (binding22 = zt50Var67.S.getBinding()) != null) {
                                            binding22.d.setStatus(true);
                                        }
                                        zt50 zt50Var68 = zy10Var2.b;
                                        if (zt50Var68 != null) {
                                            zt50Var68.S.setAutoBetPlace(true);
                                        }
                                        zt50 zt50Var69 = zy10Var2.b;
                                        if (zt50Var69 != null) {
                                            zt50Var69.S.setDisableContainer();
                                        }
                                        zy10Var2.R = true;
                                        zy10Var2.e1();
                                        wz.a("AutoBet", "Sporty Hero", "2", zy10Var2.R ? "On" : "Off");
                                        if (!zy10Var2.R && (zt50Var66 = zy10Var2.b) != null && (binding20 = zt50Var66.S.getBinding()) != null && (binding21 = binding20.d.getBinding()) != null) {
                                            binding21.b.setText("");
                                        }
                                        ((x5a0) zy10Var2.c1).setValue(Boolean.FALSE);
                                        zt50 zt50Var70 = zy10Var2.b;
                                        if (zt50Var70 != null && (binding15 = zt50Var70.S.getBinding()) != null && binding15.W.getVisibility() == 0) {
                                            zt50 zt50Var71 = zy10Var2.b;
                                            if (zt50Var71 != null && (binding19 = zt50Var71.S.getBinding()) != null) {
                                                binding19.W.setVisibility(8);
                                            }
                                            zt50 zt50Var72 = zy10Var2.b;
                                            if (zt50Var72 != null && (binding18 = zt50Var72.S.getBinding()) != null) {
                                                binding18.C.setVisibility(8);
                                            }
                                            zt50 zt50Var73 = zy10Var2.b;
                                            if (zt50Var73 != null && (binding17 = zt50Var73.S.getBinding()) != null) {
                                                binding17.Y.setVisibility(8);
                                            }
                                            zt50 zt50Var74 = zy10Var2.b;
                                            if (zt50Var74 != null && (binding16 = zt50Var74.S.getBinding()) != null) {
                                                binding16.p0.setVisibility(0);
                                            }
                                            zy10Var2.e = false;
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar.r(objY6);
                            }
                            Function1 function1 = (Function1) objY6;
                            boolean zA7 = aVar.A(zy10Var);
                            Object objY7 = aVar.y();
                            if (zA7 || objY7 == c0042a4) {
                                objY7 = new Function0() { // from class: ey10
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        GameSocektResponse.Info info3;
                                        GameSocektResponse.Info.InfoDetails red;
                                        String multiplier3;
                                        zt50 zt50Var66;
                                        zy10 zy10Var2 = zy10Var;
                                        GameSocektResponse gameSocektResponse = zy10Var2.Q;
                                        if (gameSocektResponse != null && (info3 = gameSocektResponse.getInfo()) != null && (red = info3.getRED()) != null && (multiplier3 = red.getMultiplier()) != null && (zt50Var66 = zy10Var2.b) != null) {
                                            zy10Var2.F0(zt50Var66.S, multiplier3, "RED");
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar.r(objY7);
                            }
                            Function0 function2 = (Function0) objY7;
                            boolean zA8 = aVar.A(zy10Var);
                            Object objY8 = aVar.y();
                            if (zA8 || objY8 == c0042a4) {
                                objY8 = new Function0() { // from class: fy10
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        GameSocektResponse.Info info3;
                                        GameSocektResponse.Info.InfoDetails blue3;
                                        String multiplier3;
                                        zt50 zt50Var66;
                                        zy10 zy10Var2 = zy10Var;
                                        GameSocektResponse gameSocektResponse = zy10Var2.Q;
                                        if (gameSocektResponse != null && (info3 = gameSocektResponse.getInfo()) != null && (blue3 = info3.getBLUE()) != null && (multiplier3 = blue3.getMultiplier()) != null && (zt50Var66 = zy10Var2.b) != null) {
                                            zy10Var2.F0(zt50Var66.z, multiplier3, "BLUE");
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar.r(objY8);
                            }
                            Function0 function3 = (Function0) objY8;
                            boolean zA9 = aVar.A(zy10Var);
                            Object objY9 = aVar.y();
                            if (zA9 || objY9 == c0042a4) {
                                objY9 = new xtx(zy10Var, 2);
                                aVar.r(objY9);
                            }
                            c0042a = c0042a4;
                            i5 = -336939070;
                            x81.b(strB, autoBetChips, function0, function1, ytwVar5, strI2, ytwVar4, ytwVar3, ytwVar2, function2, function3, (Function0) objY9, aVar, 0);
                        } else {
                            c0042a = c0042a4;
                            i5 = -336939070;
                            aVar.N(-336939070);
                        }
                        aVar.H();
                        if (((Boolean) ((x5a0) zy10Var.d1).getValue()).booleanValue()) {
                            aVar.N(-308200520);
                            GameSocektResponse gameSocektResponse = zy10Var.I0;
                            if (gameSocektResponse == null || (info2 = gameSocektResponse.getInfo()) == null || (blue2 = info2.getBLUE()) == null || (multiplier2 = blue2.getMultiplier()) == null) {
                                bigDecimalE0 = null;
                            } else {
                                double d2 = Double.parseDouble(multiplier2);
                                zt50 zt50Var66 = zy10Var.b;
                                bigDecimalE0 = zy10.E0(d2, zt50Var66 != null ? zt50Var66.z.getBetAmount() : 0.0d);
                            }
                            GameSocektResponse gameSocektResponse2 = zy10Var.I0;
                            if (gameSocektResponse2 == null || (info = gameSocektResponse2.getInfo()) == null || (blue = info.getBLUE()) == null || (multiplier = blue.getMultiplier()) == null) {
                                bigDecimalE1 = null;
                            } else {
                                double d3 = Double.parseDouble(multiplier);
                                zt50 zt50Var67 = zy10Var.b;
                                bigDecimalE1 = zy10.E0(d3, zt50Var67 != null ? zt50Var67.z.getBetAmount() : 0.0d);
                            }
                            List<DetailResponse> list2 = zy10Var.M;
                            if (list2 == null) {
                                Intrinsics.n("gameDetailResponse");
                                throw null;
                            }
                            BigDecimal bigDecimal = new BigDecimal(String.valueOf(list2.get(1).getMaxPayoutAmount()));
                            BigDecimal bigDecimalMin = bigDecimalE0 != null ? bigDecimalE0.min(bigDecimal) : null;
                            if (bigDecimalMin != null) {
                                i6 = 2;
                                bigDecimalMin.setScale(2, RoundingMode.HALF_UP);
                            } else {
                                i6 = 2;
                            }
                            BigDecimal bigDecimalMin2 = bigDecimalE1 != null ? bigDecimalE1.min(bigDecimal) : null;
                            if (bigDecimalMin2 != null) {
                                bigDecimalMin2.setScale(i6, RoundingMode.HALF_UP);
                            }
                            HashMap map2 = new HashMap();
                            op5 op5Var2 = op5.a;
                            String str6 = zy10Var.t1;
                            op5Var2.getClass();
                            map2.put("{currency}", op5.i(str6));
                            zt50 zt50Var68 = zy10Var.b;
                            map2.put("{amount}", String.valueOf((zt50Var68 == null || (binding13 = zt50Var68.z.getBinding()) == null) ? null : binding13.b.getText()));
                            str4 = "Bet Per Round : ";
                            String strB2 = op5.b("bet_per_round:sg_common", str4, map2);
                            List<DetailResponse> list3 = zy10Var.M;
                            if (list3 == null) {
                                Intrinsics.n("gameDetailResponse");
                                throw null;
                            }
                            ArrayList<Double> autoBetChips2 = list3.get(1).getAutoBetChips();
                            String strI3 = op5.i(zy10Var.t1);
                            boolean zA10 = aVar.A(zy10Var);
                            Object objY10 = aVar.y();
                            if (zA10) {
                                c0042a3 = c0042a;
                            } else {
                                c0042a3 = c0042a;
                                if (objY10 == c0042a3) {
                                }
                                Function0 function4 = (Function0) objY10;
                                zA = aVar.A(zy10Var);
                                objY = aVar.y();
                                if (zA || objY == c0042a3) {
                                    objY = new hy10(zy10Var, 0);
                                    aVar.r(objY);
                                }
                                Function1 function5 = (Function1) objY;
                                zA2 = aVar.A(zy10Var);
                                objY2 = aVar.y();
                                if (zA2 || objY2 == c0042a3) {
                                    objY2 = new l76(zy10Var, 2);
                                    aVar.r(objY2);
                                }
                                Function0 function6 = (Function0) objY2;
                                zA3 = aVar.A(zy10Var);
                                objY3 = aVar.y();
                                if (zA3 || objY3 == c0042a3) {
                                    objY3 = new m76(zy10Var, 1);
                                    aVar.r(objY3);
                                }
                                Function0 function7 = (Function0) objY3;
                                zA4 = aVar.A(zy10Var);
                                objY4 = aVar.y();
                                if (zA4 || objY4 == c0042a3) {
                                    objY4 = new n76(zy10Var, 1);
                                    aVar.r(objY4);
                                }
                                obj3 = "{currency}";
                                obj4 = "{amount}";
                                str3 = "bet_per_round:sg_common";
                                c0042a2 = c0042a3;
                                x81.b(strB2, autoBetChips2, function4, function5, ytwVar5, strI3, ytwVar4, ytwVar3, ytwVar2, function6, function7, (Function0) objY4, aVar, 0);
                            }
                            objY10 = new yoe(zy10Var, 1);
                            aVar.r(objY10);
                            Function0 function8 = (Function0) objY10;
                            zA = aVar.A(zy10Var);
                            objY = aVar.y();
                            if (zA) {
                                objY = new hy10(zy10Var, 0);
                                aVar.r(objY);
                            } else {
                                objY = new hy10(zy10Var, 0);
                                aVar.r(objY);
                            }
                            Function1 function9 = (Function1) objY;
                            zA2 = aVar.A(zy10Var);
                            objY2 = aVar.y();
                            if (zA2) {
                                objY2 = new l76(zy10Var, 2);
                                aVar.r(objY2);
                            } else {
                                objY2 = new l76(zy10Var, 2);
                                aVar.r(objY2);
                            }
                            Function0 function10 = (Function0) objY2;
                            zA3 = aVar.A(zy10Var);
                            objY3 = aVar.y();
                            if (zA3) {
                                objY3 = new m76(zy10Var, 1);
                                aVar.r(objY3);
                            } else {
                                objY3 = new m76(zy10Var, 1);
                                aVar.r(objY3);
                            }
                            Function0 function11 = (Function0) objY3;
                            zA4 = aVar.A(zy10Var);
                            objY4 = aVar.y();
                            if (zA4) {
                                objY4 = new n76(zy10Var, 1);
                                aVar.r(objY4);
                            } else {
                                objY4 = new n76(zy10Var, 1);
                                aVar.r(objY4);
                            }
                            obj3 = "{currency}";
                            obj4 = "{amount}";
                            str3 = "bet_per_round:sg_common";
                            c0042a2 = c0042a3;
                            x81.b(strB2, autoBetChips2, function8, function9, ytwVar5, strI3, ytwVar4, ytwVar3, ytwVar2, function10, function11, (Function0) objY4, aVar, 0);
                        } else {
                            int i8 = i5;
                            str3 = r9;
                            obj3 = r11;
                            c0042a2 = c0042a;
                            aVar.N(i8);
                        }
                        aVar.H();
                        if (((Boolean) ((x5a0) zy10Var.e1).getValue()).booleanValue()) {
                            aVar.N(-302615932);
                            HashMap map3 = new HashMap();
                            op5 op5Var3 = op5.a;
                            String str7 = zy10Var.t1;
                            op5Var3.getClass();
                            map3.put(obj3, op5.i(str7));
                            zt50 zt50Var69 = zy10Var.b;
                            map3.put(obj4, String.valueOf((zt50Var69 == null || (binding12 = zt50Var69.R.getBinding()) == null) ? null : binding12.b.getText()));
                            String strB3 = op5.b(str3, str4, map3);
                            List<DetailResponse> list4 = zy10Var.M;
                            if (list4 == null) {
                                Intrinsics.n("gameDetailResponse");
                                throw null;
                            }
                            ArrayList<Double> autoBetChips3 = list4.get(2).getAutoBetChips();
                            String strI4 = op5.i(zy10Var.t1);
                            boolean zA11 = aVar.A(zy10Var);
                            Object objY11 = aVar.y();
                            androidx.compose.runtime.a.C0041a.C0042a c0042a5 = c0042a2;
                            if (zA11 || objY11 == c0042a5) {
                                objY11 = new sda(zy10Var, 1);
                                aVar.r(objY11);
                            }
                            Function0 function12 = (Function0) objY11;
                            boolean zA12 = aVar.A(zy10Var);
                            Object objY12 = aVar.y();
                            if (zA12 || objY12 == c0042a5) {
                                objY12 = new Function1() { // from class: zx10
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        nk2 binding15;
                                        nk2 binding16;
                                        nk2 binding17;
                                        nk2 binding18;
                                        nk2 binding19;
                                        zt50 zt50Var70;
                                        nk2 binding20;
                                        c920 binding21;
                                        nk2 binding22;
                                        int iDoubleValue = (int) ((Double) obj5).doubleValue();
                                        zy10 zy10Var2 = zy10Var;
                                        zy10Var2.f1 = iDoubleValue;
                                        zt50 zt50Var71 = zy10Var2.b;
                                        if (zt50Var71 != null && (binding22 = zt50Var71.R.getBinding()) != null) {
                                            binding22.d.setStatus(true);
                                        }
                                        zt50 zt50Var72 = zy10Var2.b;
                                        if (zt50Var72 != null) {
                                            zt50Var72.R.setAutoBetPlace(true);
                                        }
                                        zt50 zt50Var73 = zy10Var2.b;
                                        if (zt50Var73 != null) {
                                            zt50Var73.R.setDisableContainer();
                                        }
                                        zy10Var2.Y = true;
                                        zy10Var2.e1();
                                        wz.a("AutoBet", "Sporty Hero", "2", zy10Var2.Y ? "On" : "Off");
                                        if (!zy10Var2.Y && (zt50Var70 = zy10Var2.b) != null && (binding20 = zt50Var70.R.getBinding()) != null && (binding21 = binding20.d.getBinding()) != null) {
                                            binding21.b.setText("");
                                        }
                                        ((x5a0) zy10Var2.e1).setValue(Boolean.FALSE);
                                        zt50 zt50Var74 = zy10Var2.b;
                                        if (zt50Var74 != null && (binding15 = zt50Var74.R.getBinding()) != null && binding15.W.getVisibility() == 0) {
                                            zt50 zt50Var75 = zy10Var2.b;
                                            if (zt50Var75 != null && (binding19 = zt50Var75.R.getBinding()) != null) {
                                                binding19.W.setVisibility(8);
                                            }
                                            zt50 zt50Var76 = zy10Var2.b;
                                            if (zt50Var76 != null && (binding18 = zt50Var76.R.getBinding()) != null) {
                                                binding18.C.setVisibility(8);
                                            }
                                            zt50 zt50Var77 = zy10Var2.b;
                                            if (zt50Var77 != null && (binding17 = zt50Var77.R.getBinding()) != null) {
                                                binding17.Y.setVisibility(8);
                                            }
                                            zt50 zt50Var78 = zy10Var2.b;
                                            if (zt50Var78 != null && (binding16 = zt50Var78.R.getBinding()) != null) {
                                                binding16.p0.setVisibility(0);
                                            }
                                            zy10Var2.i = false;
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar.r(objY12);
                            }
                            Function1 function13 = (Function1) objY12;
                            boolean zA13 = aVar.A(zy10Var);
                            Object objY13 = aVar.y();
                            if (zA13 || objY13 == c0042a5) {
                                objY13 = new Function0() { // from class: ay10
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        GameSocektResponse.Info info3;
                                        GameSocektResponse.Info.InfoDetails red;
                                        String multiplier3;
                                        zt50 zt50Var70;
                                        zy10 zy10Var2 = zy10Var;
                                        GameSocektResponse gameSocektResponse3 = zy10Var2.Q;
                                        if (gameSocektResponse3 != null && (info3 = gameSocektResponse3.getInfo()) != null && (red = info3.getRED()) != null && (multiplier3 = red.getMultiplier()) != null && (zt50Var70 = zy10Var2.b) != null) {
                                            zy10Var2.F0(zt50Var70.S, multiplier3, "RED");
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar.r(objY13);
                            }
                            Function0 function14 = (Function0) objY13;
                            boolean zA14 = aVar.A(zy10Var);
                            Object objY14 = aVar.y();
                            if (zA14 || objY14 == c0042a5) {
                                objY14 = new Function0() { // from class: by10
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        GameSocektResponse.Info info3;
                                        GameSocektResponse.Info.InfoDetails blue3;
                                        String multiplier3;
                                        zt50 zt50Var70;
                                        zy10 zy10Var2 = zy10Var;
                                        GameSocektResponse gameSocektResponse3 = zy10Var2.Q;
                                        if (gameSocektResponse3 != null && (info3 = gameSocektResponse3.getInfo()) != null && (blue3 = info3.getBLUE()) != null && (multiplier3 = blue3.getMultiplier()) != null && (zt50Var70 = zy10Var2.b) != null) {
                                            zy10Var2.F0(zt50Var70.z, multiplier3, "BLUE");
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar.r(objY14);
                            }
                            Function0 function15 = (Function0) objY14;
                            boolean zA15 = aVar.A(zy10Var);
                            Object objY15 = aVar.y();
                            if (zA15 || objY15 == c0042a5) {
                                objY15 = new Function0() { // from class: cy10
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        GameSocektResponse.Info info3;
                                        GameSocektResponse.Info.InfoDetails purple;
                                        String multiplier3;
                                        zt50 zt50Var70;
                                        zy10 zy10Var2 = zy10Var;
                                        GameSocektResponse gameSocektResponse3 = zy10Var2.Q;
                                        if (gameSocektResponse3 != null && (info3 = gameSocektResponse3.getInfo()) != null && (purple = info3.getPURPLE()) != null && (multiplier3 = purple.getMultiplier()) != null && (zt50Var70 = zy10Var2.b) != null) {
                                            zy10Var2.F0(zt50Var70.R, multiplier3, "PURPLE");
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar.r(objY15);
                            }
                            x81.b(strB3, autoBetChips3, function12, function13, ytwVar5, strI4, ytwVar4, ytwVar3, ytwVar2, function14, function15, (Function0) objY15, aVar, 0);
                        } else {
                            aVar.N(-336939070);
                        }
                        aVar.H();
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
    }

    public final void p1() {
        androidx.fragment.app.e activity;
        FragmentManager supportFragmentManager;
        if (!isRemoving() && this.J0 != null && (activity = getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager.Y();
        }
        xi60 xi60Var = this.j1;
        if (xi60Var != null && xi60Var.isResumed()) {
            xi60 xi60Var2 = this.j1;
            if (xi60Var2 != null) {
                xi60Var2.dismiss();
            }
            this.j1 = null;
        }
        zt50 zt50Var = this.b;
        if (zt50Var != null) {
            zt50Var.Q.setVisibility(8);
        }
        zt50 zt50Var2 = this.b;
        if (zt50Var2 != null) {
            zt50Var2.Q.N();
        }
        if (this.L0) {
            this.L0 = false;
            H0();
        }
        try {
            X0().e.l(getViewLifecycleOwner());
            X0().d.l(getViewLifecycleOwner());
            X0().y1();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void q0(BetContainer betContainer) {
        nk2 binding;
        c920 binding2;
        nk2 binding3;
        e1();
        if (betContainer != null && (binding3 = betContainer.getBinding()) != null && binding3.W.getVisibility() == 0) {
            betContainer.getBinding().W.setVisibility(8);
            betContainer.getBinding().C.setVisibility(8);
            betContainer.getBinding().Y.setVisibility(8);
            betContainer.getBinding().p0.setVisibility(0);
        }
        if (betContainer == null || (binding = betContainer.getBinding()) == null || (binding2 = binding.d.getBinding()) == null) {
            return;
        }
        binding2.b.setText("");
    }

    public final void q1() {
        String str = SportyGamesManager.getInstance().getUser().a;
        pzf0.b(str);
        if (str.equals("API_RETURN_NULL") || str.equals("testing_access_token") || str.length() == 0) {
            if (this.N) {
                return;
            }
            this.N = true;
            SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
            return;
        }
        int i2 = this.r1;
        if (i2 >= 1) {
            this.r1 = 0;
            this.N = true;
            SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
        } else {
            this.r1 = i2 + 1;
            H0();
            s1();
        }
    }

    public final void r0(BetContainer betContainer, BetContainer betContainer2, int i2) {
        nk2 binding;
        CharSequence text;
        nk2 binding2;
        CharSequence text2;
        zt50 zt50Var = this.b;
        if (zt50Var != null && zt50Var.L.getVisibility() == 0) {
            if (betContainer != null && (binding2 = betContainer.getBinding()) != null && (text2 = binding2.z.getText()) != null && text2.equals("0")) {
                betContainer.setDone();
            }
            if (betContainer2 != null && (binding = betContainer2.getBinding()) != null && (text = binding.z.getText()) != null && text.equals("0")) {
                betContainer2.setDone();
            }
        }
        this.t0 = i2;
        zt50 zt50Var2 = this.b;
        if (zt50Var2 != null) {
            zt50Var2.L.setVisibility(0);
        }
        r1();
    }

    public final void r1() {
        try {
            if (this.S) {
                zt50 zt50Var = this.b;
                if ((zt50Var != null ? zt50Var.S.getCashoutCoeff() : 0.0d) <= Double.parseDouble("1.01")) {
                    zt50 zt50Var2 = this.b;
                    if (zt50Var2 != null) {
                        zt50Var2.S.setCashoutAmount(Double.parseDouble("1.01"));
                    }
                    zt50 zt50Var3 = this.b;
                    if (zt50Var3 != null) {
                        zt50Var3.S.f();
                    }
                }
            }
            if (this.W) {
                zt50 zt50Var4 = this.b;
                if ((zt50Var4 != null ? zt50Var4.z.getCashoutCoeff() : 0.0d) <= Double.parseDouble("1.01")) {
                    zt50 zt50Var5 = this.b;
                    if (zt50Var5 != null) {
                        zt50Var5.z.setCashoutAmount(Double.parseDouble("1.01"));
                    }
                    zt50 zt50Var6 = this.b;
                    if (zt50Var6 != null) {
                        zt50Var6.z.f();
                    }
                }
            }
            if (this.Z) {
                zt50 zt50Var7 = this.b;
                if ((zt50Var7 != null ? zt50Var7.R.getCashoutCoeff() : 0.0d) <= Double.parseDouble("1.01")) {
                    zt50 zt50Var8 = this.b;
                    if (zt50Var8 != null) {
                        zt50Var8.R.setCashoutAmount(Double.parseDouble("1.01"));
                    }
                    zt50 zt50Var9 = this.b;
                    if (zt50Var9 != null) {
                        zt50Var9.R.f();
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void s0(int i2, int i3, String str, boolean z2) {
        String str2;
        if (str == null || str.length() == 0 || str.length() <= 0) {
            if (z2) {
                this.t0 = i3;
                zt50 zt50Var = this.b;
                if (zt50Var != null) {
                    zt50Var.L.setVisibility(0);
                }
            } else {
                zt50 zt50Var2 = this.b;
                if (zt50Var2 != null) {
                    zt50Var2.L.setVisibility(8);
                }
            }
            if (i3 == this.u0) {
                str2 = z2 ? "AutoCashoutOnRED" : "AutoCashoutOffRED";
            } else if (i3 == this.v0) {
                str2 = z2 ? "AutoCashoutOnPURPLE" : "AutoCashoutOffPURPLE";
            } else {
                str2 = z2 ? "AutoCashoutOnBLUE" : "AutoCashoutOffBLUE";
            }
            wz.a(str2, "Pocket Rockets", "bet");
        } else {
            zt50 zt50Var3 = this.b;
            if (zt50Var3 != null && zt50Var3.V.getVisibility() == 8) {
                zt50 zt50Var4 = this.b;
                if (zt50Var4 != null) {
                    zt50Var4.V.setVisibility(0);
                }
                zt50 zt50Var5 = this.b;
                if (zt50Var5 != null) {
                    zt50Var5.V.setMessageandBG(i2, str);
                }
                nas nasVarA = ebs.a(getLifecycle());
                pfd pfdVar = fse.a;
                ej5.c(nasVarA, gku.a, null, new d(null), 2);
            }
        }
        r1();
    }

    public final void s1() {
        nk2 binding;
        nk2 binding2;
        nk2 binding3;
        try {
            FragmentManager fragmentManager = this.n0;
            if ((fragmentManager != null ? fragmentManager.G(R.id.flContent) : null) != null) {
                FragmentManager fragmentManager2 = this.n0;
                Fragment fragmentG = fragmentManager2 != null ? fragmentManager2.G(R.id.flContent) : null;
                fragmentG.getClass();
                fm60 fm60Var = (fm60) fragmentG;
                FragmentManager fragmentManager3 = this.n0;
                if (fragmentManager3 != null) {
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager3);
                    aVar.p(fm60Var);
                    aVar.d();
                }
            }
            if (!this.d0) {
                m0();
            }
            zt50 zt50Var = this.b;
            if (zt50Var != null && (binding3 = zt50Var.S.getBinding()) != null) {
                binding3.v.setClickable(true);
            }
            zt50 zt50Var2 = this.b;
            if (zt50Var2 != null && (binding2 = zt50Var2.R.getBinding()) != null) {
                binding2.v.setClickable(true);
            }
            zt50 zt50Var3 = this.b;
            if (zt50Var3 != null && (binding = zt50Var3.z.getBinding()) != null) {
                binding.v.setClickable(true);
            }
            this.d0 = false;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r16v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v2 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r16v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v3 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v10 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v174 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v174 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v175 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v175 ??, new type: com.sportygames.pocketrocket.component.BetContainer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v176 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v176 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v257 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v257 ??, new type: com.sportygames.pocketrocket.component.BetContainer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v4 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v5 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v9 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v93 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v93 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v94 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v94 ??, new type: com.sportygames.pocketrocket.component.BetContainer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v95 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v95 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v17 ??, new type: com.sportygames.pocketrocket.component.BetContainer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v18 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v33 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v34 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v35 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v35 ??, new type: com.sportygames.pocketrocket.component.BetContainer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r3v36 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v36 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v11 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v12 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v13 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v14 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v2 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v2 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v3 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v4 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v5 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v2 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v3 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v2 ??, new type: double
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final void t0(com.sportygames.pocketrocket.model.response.GameSocektResponse r29) {
        /*
            Method dump skipped, instruction units count: 1365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy10.t0(com.sportygames.pocketrocket.model.response.GameSocektResponse):void");
    }

    public final void u0(BetContainer betContainer, boolean z2, DetailResponse detailResponse, String str, String str2) {
        Double dValueOf;
        BetContainer betContainer2;
        PlaceBetRequest placeBetRequest;
        String string;
        SharedPreferences sharedPreferences = this.w;
        if (sharedPreferences != null && !sharedPreferences.getBoolean("ROCKET_ONE_TAP", false)) {
            betContainer.getBinding().C.setVisibility(0);
            betContainer.getBinding().W.setVisibility(0);
            betContainer.getBinding().Y.setVisibility(0);
            betContainer.getBinding().f0.setVisibility(0);
            betContainer.getBinding().v.setVisibility(8);
            betContainer.getBinding().p0.setVisibility(8);
        } else if (!betContainer.getBetPlaced() && !betContainer.getBetInProgress() && this.O > 0) {
            betContainer.getBinding().v.setClickable(false);
            betContainer.getBinding().v.setAlpha(0.65f);
            if (z2) {
                CharSequence text = betContainer.getBinding().z.getText();
                dValueOf = (text == null || (string = text.toString()) == null) ? null : Double.valueOf(Double.parseDouble(string));
            } else {
                dValueOf = null;
            }
            if (this.M != null) {
                String currency = detailResponse.getCurrency();
                if (currency != null) {
                    String rocketType = detailResponse.getRocketType();
                    long j2 = this.O;
                    GiftItem giftItem = betContainer.getGiftItem();
                    placeBetRequest = new PlaceBetRequest(str, rocketType, currency, j2, giftItem != null ? giftItem.getGiftId() : null, betContainer.getGiftAmount(), dValueOf, this.P0, this.K0);
                } else {
                    placeBetRequest = null;
                }
                String strJ = new eal().j(placeBetRequest);
                Z0().E1(this.O, strJ, detailResponse.getRocketType(), new e4t(1, this, strJ));
                betContainer2 = betContainer;
                betContainer2.setBetInProgress(true);
                O0();
                SharedPreferences sharedPreferences2 = this.w;
                if (sharedPreferences2 != null && sharedPreferences2.getBoolean("ROCKET_SOUND", true)) {
                    ypa0 ypa0VarA1 = a1();
                    String string2 = getString(R.string.place_bet);
                    string2.getClass();
                    ypa0VarA1.A1(0L, string2);
                }
            } else {
                betContainer2 = betContainer;
            }
            O0();
            GiftItem giftItem2 = betContainer2.getGiftItem();
            boolean z3 = (giftItem2 != null ? giftItem2.getGiftId() : null) != null;
            GiftItem giftItem3 = betContainer.getGiftItem();
            v0(str, str2, z3, true, false, (giftItem3 != null ? giftItem3.getGiftId() : null) != null);
        }
        r1();
        e1();
    }

    public final Object u1(int i2, double d2, RoundBetResponse roundBetResponse, tje0 tje0Var) {
        tb5 tb5Var = this.C0;
        if (tb5Var == null) {
            return Unit.a;
        }
        nas nasVarA = ebs.a(getLifecycle());
        pfd pfdVar = fse.a;
        Object objJ = tb5Var.j(tje0Var, ej5.b(nasVarA, gku.a, a6b.b, new tz10(d2, i2, null, this, roundBetResponse)));
        return objJ == y5b.a ? objJ : Unit.a;
    }

    public final void v0(String str, String str2, boolean z2, boolean z3, boolean z4, boolean z5) {
        GameDetails gameDetails = this.B;
        wz.a("BetPlaced", gameDetails != null ? gameDetails.getName() : null, str, str2, String.valueOf(z2), String.valueOf(z3), String.valueOf(z4), String.valueOf(z5));
        GameDetails gameDetails2 = this.B;
        wz.a("PlaceBetClicked", gameDetails2 != null ? gameDetails2.getName() : null, str2);
        CasinoLogger casinoLogger = CasinoLogger.INSTANCE;
        Pair pair = new Pair("isManualBet", Boolean.valueOf(z3));
        GameDetails gameDetails3 = this.B;
        Pair pair2 = new Pair(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, gameDetails3 != null ? gameDetails3.getName() : null);
        SharedPreferences sharedPreferences = this.w;
        casinoLogger.logEventToCasino("BetPlaced", vj5.a(pair, pair2, new Pair("isOneTapBet", sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("ROCKET_ONE_TAP", false)) : null), new Pair("Platform", "ANDROID")));
    }

    public final void v1() {
        LobbyMetaInfo metaInfo;
        Long minimumCMSVersionSupported;
        try {
            String languageCode = SportyGamesManager.getInstance().getLanguageCode();
            languageCode.getClass();
            this.o0 = languageCode;
            long versionCode = SportyGamesManager.getInstance().getVersionCode();
            GameDetails gameDetails = this.B;
            if (versionCode < ((gameDetails == null || (metaInfo = gameDetails.getMetaInfo()) == null || (minimumCMSVersionSupported = metaInfo.getMinimumCMSVersionSupported()) == null) ? 0L : minimumCMSVersionSupported.longValue())) {
                this.o0 = "en";
            }
            Map<String, ArrayList<String>> map = vlr.a;
            ArrayList<String> arrayList = vlr.a.get("pocket-rocket");
            if (arrayList == null || !arrayList.contains(this.o0)) {
                return;
            }
            String languageCode2 = SportyGamesManager.getInstance().getLanguageCode();
            languageCode2.getClass();
            this.k0 = languageCode2;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void w0() {
        if (h1()) {
            if (this.q1) {
                return;
            }
            ej5.c(this.x0, null, null, new e(null), 3);
            return;
        }
        zt50 zt50Var = this.b;
        if (zt50Var != null) {
            zt50Var.Q.P();
        }
    }

    public final void w1() {
        zt50 zt50Var;
        jo80 binding;
        zt50 zt50Var2 = this.b;
        if (zt50Var2 != null) {
            zt50Var2.f.setVisibility(0);
        }
        zt50 zt50Var3 = this.b;
        if (zt50Var3 != null) {
            zt50Var3.E.setVisibility(8);
        }
        zt50 zt50Var4 = this.b;
        if (zt50Var4 != null) {
            zt50Var4.y.setVisibility(0);
        }
        zt50 zt50Var5 = this.b;
        if (zt50Var5 != null) {
            zt50Var5.b.setEnabled(false);
        }
        zt50 zt50Var6 = this.b;
        if (zt50Var6 != null) {
            zt50Var6.N.setEnabled(true);
        }
        zt50 zt50Var7 = this.b;
        if (zt50Var7 != null) {
            zt50Var7.Y.setEnabled(true);
        }
        zt50 zt50Var8 = this.b;
        if (zt50Var8 != null) {
            zt50Var8.e.setVisibility(0);
        }
        zt50 zt50Var9 = this.b;
        if (zt50Var9 != null) {
            zt50Var9.T.setVisibility(0);
        }
        if (!i1() || (zt50Var = this.b) == null || (binding = zt50Var.K.getBinding()) == null) {
            return;
        }
        binding.A.setVisibility(4);
    }

    public final void x1() {
        zt50 zt50Var = this.b;
        if (zt50Var != null) {
            SHToastContainer sHToastContainer = zt50Var.V;
            nas nasVarA = ebs.a(getLifecycle());
            op5 op5Var = op5.a;
            String string = getString(R.string.sg_campaign_navigation_disabled_key);
            string.getClass();
            sHToastContainer.k(nasVarA, op5.c(op5Var, string, "You have active bets. Cashout and try again."), 1800L);
        }
    }

    public final void y0(Function0<Unit> function0, final Function0<Unit> function1, Function0<Unit> function2, boolean z2) {
        List<DetailResponse> list = this.M;
        if (list != null) {
            zt50 zt50Var = this.b;
            int i2 = 1;
            int i3 = 0;
            if (zt50Var != null) {
                zt50Var.S.setBetModel(list.get(0), z2, new hba(function0, i2), new Function1() { // from class: xw10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int iIntValue = ((Integer) obj).intValue();
                        zy10 zy10Var = this.a;
                        zt50 zt50Var2 = zy10Var.b;
                        if (zt50Var2 == null || iIntValue != zt50Var2.S.getHintAmount1Click()) {
                            zt50 zt50Var3 = zy10Var.b;
                            if (zt50Var3 == null || iIntValue != zt50Var3.S.getHintAmount2Click()) {
                                zt50 zt50Var4 = zy10Var.b;
                                if (zt50Var4 == null || iIntValue != zt50Var4.S.getHintAmount3Click()) {
                                    zt50 zt50Var5 = zy10Var.b;
                                    if (zt50Var5 != null && iIntValue == zt50Var5.S.getHintAmount4Click()) {
                                        zy10Var.G0("BetREDChip4Click");
                                    }
                                } else {
                                    zy10Var.G0("BetREDChip3Click");
                                }
                            } else {
                                zy10Var.G0("BetREDChip2Click");
                            }
                        } else {
                            zy10Var.G0("BetREDChip1Click");
                        }
                        zt50 zt50Var6 = zy10Var.b;
                        if (zt50Var6 != null) {
                            zt50Var6.z.e();
                        }
                        zt50 zt50Var7 = zy10Var.b;
                        if (zt50Var7 != null) {
                            zt50Var7.R.e();
                        }
                        return Unit.a;
                    }
                });
            }
            zt50 zt50Var2 = this.b;
            int i4 = 2;
            if (zt50Var2 != null) {
                BetContainer betContainer = zt50Var2.z;
                List<DetailResponse> list2 = this.M;
                if (list2 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                betContainer.setBetModel(list2.get(2), z2, new Function0() { // from class: yw10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke();
                        return Unit.a;
                    }
                }, new cfj(this, i4));
            }
            zt50 zt50Var3 = this.b;
            if (zt50Var3 != null) {
                BetContainer betContainer2 = zt50Var3.R;
                List<DetailResponse> list3 = this.M;
                if (list3 != null) {
                    betContainer2.setBetModel(list3.get(1), z2, new dfj(function2, i4), new zw10(this, i3));
                } else {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
            }
        }
    }

    public final void y1() {
        nk2 binding;
        nk2 binding2;
        nk2 binding3;
        nk2 binding4;
        y0(new pv10(this, 0), new Function0() { // from class: qv10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                zy10 zy10Var = this.a;
                zy10Var.i1 = "BLUE";
                if (zy10Var.j1 == null) {
                    zy10Var.n1();
                }
                return Unit.a;
            }
        }, new Function0() { // from class: rv10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                zy10 zy10Var = this.a;
                zy10Var.i1 = "PURPLE";
                if (zy10Var.j1 == null) {
                    zy10Var.n1();
                }
                return Unit.a;
            }
        }, true);
        zt50 zt50Var = this.b;
        if (zt50Var != null && (binding = zt50Var.S.getBinding()) != null && binding.F.getVisibility() == 8) {
            zt50 zt50Var2 = this.b;
            if (zt50Var2 != null && (binding4 = zt50Var2.S.getBinding()) != null) {
                binding4.F.setVisibility(0);
            }
            zt50 zt50Var3 = this.b;
            if (zt50Var3 != null && (binding3 = zt50Var3.R.getBinding()) != null) {
                binding3.F.setVisibility(0);
            }
            zt50 zt50Var4 = this.b;
            if (zt50Var4 != null && (binding2 = zt50Var4.z.getBinding()) != null) {
                binding2.F.setVisibility(0);
            }
        }
        P0();
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0210  */
    /* JADX WARN: Code duplicated, block: B:114:0x0214  */
    /* JADX WARN: Code duplicated, block: B:116:0x0218  */
    /* JADX WARN: Code duplicated, block: B:119:0x0224  */
    /* JADX WARN: Code duplicated, block: B:121:0x022a  */
    /* JADX WARN: Code duplicated, block: B:123:0x022e  */
    /* JADX WARN: Code duplicated, block: B:126:0x0239  */
    /* JADX WARN: Code duplicated, block: B:171:0x02fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:173:0x0305  */
    /* JADX WARN: Code duplicated, block: B:180:0x0317  */
    /* JADX WARN: Code duplicated, block: B:182:0x0329  */
    /* JADX WARN: Code duplicated, block: B:192:0x034b  */
    /* JADX WARN: Code duplicated, block: B:194:0x034f  */
    /* JADX WARN: Code duplicated, block: B:197:0x035a  */
    /* JADX WARN: Code duplicated, block: B:201:0x036e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:279:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:281:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:283:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:286:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:288:0x0505  */
    /* JADX WARN: Code duplicated, block: B:290:0x0509  */
    /* JADX WARN: Code duplicated, block: B:293:0x0514  */
    /* JADX WARN: Code duplicated, block: B:295:0x0518  */
    /* JADX WARN: Code duplicated, block: B:299:0x0533  */
    /* JADX WARN: Code duplicated, block: B:302:0x0538  */
    /* JADX WARN: Code duplicated, block: B:307:0x054b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:312:0x0560  */
    /* JADX WARN: Code duplicated, block: B:317:0x0575  */
    /* JADX WARN: Code duplicated, block: B:322:0x058a  */
    /* JADX WARN: Code duplicated, block: B:327:0x059f  */
    /* JADX WARN: Code duplicated, block: B:332:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:340:0x05d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:341:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:342:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:343:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:349:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:351:0x0605  */
    /* JADX WARN: Code duplicated, block: B:361:0x0627  */
    /* JADX WARN: Code duplicated, block: B:363:0x062b  */
    /* JADX WARN: Code duplicated, block: B:366:0x0636  */
    /* JADX WARN: Code duplicated, block: B:370:0x064a  */
    /* JADX WARN: Code duplicated, block: B:448:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:450:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:452:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:455:0x07de  */
    /* JADX WARN: Code duplicated, block: B:457:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:459:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:462:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:464:0x0800  */
    /* JADX WARN: Code duplicated, block: B:469:0x0815  */
    /* JADX WARN: Code duplicated, block: B:474:0x0829  */
    /* JADX WARN: Code duplicated, block: B:479:0x083e  */
    /* JADX WARN: Code duplicated, block: B:484:0x0853  */
    /* JADX WARN: Code duplicated, block: B:489:0x0868  */
    /* JADX WARN: Code duplicated, block: B:494:0x087d  */
    /* JADX WARN: Code duplicated, block: B:499:0x0892  */
    /* JADX WARN: Code duplicated, block: B:507:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:596:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void z1(GameSocektResponse gameSocektResponse) {
        Context context;
        zt50 zt50Var;
        zt50 zt50Var2;
        zt50 zt50Var3;
        zt50 zt50Var4;
        zt50 zt50Var5;
        zt50 zt50Var6;
        zt50 zt50Var7;
        zt50 zt50Var8;
        nk2 binding;
        ConstraintLayout constraintLayout;
        nk2 binding2;
        nk2 binding3;
        nk2 binding4;
        nk2 binding5;
        nk2 binding6;
        nk2 binding7;
        zt50 zt50Var9;
        nk2 binding8;
        zt50 zt50Var10;
        zt50 zt50Var11;
        zt50 zt50Var12;
        boolean z2;
        nk2 binding9;
        ConstraintLayout constraintLayout2;
        nk2 binding10;
        nk2 binding11;
        nk2 binding12;
        zt50 zt50Var13;
        nk2 binding13;
        zt50 zt50Var14;
        nk2 binding14;
        nk2 binding15;
        nk2 binding16;
        zt50 zt50Var15;
        zt50 zt50Var16;
        zt50 zt50Var17;
        boolean z3;
        zt50 zt50Var18;
        zt50 zt50Var19;
        Context context2;
        zt50 zt50Var20;
        int i2;
        zt50 zt50Var21;
        zt50 zt50Var22;
        zt50 zt50Var23;
        zt50 zt50Var24;
        zt50 zt50Var25;
        zt50 zt50Var26;
        zt50 zt50Var27;
        nk2 binding17;
        ConstraintLayout constraintLayout3;
        nk2 binding18;
        nk2 binding19;
        nk2 binding20;
        nk2 binding21;
        nk2 binding22;
        nk2 binding23;
        zt50 zt50Var28;
        nk2 binding24;
        zt50 zt50Var29;
        zt50 zt50Var30;
        zt50 zt50Var31;
        boolean z4;
        nk2 binding25;
        ConstraintLayout constraintLayout4;
        nk2 binding26;
        nk2 binding27;
        nk2 binding28;
        zt50 zt50Var32;
        nk2 binding29;
        zt50 zt50Var33;
        nk2 binding30;
        nk2 binding31;
        nk2 binding32;
        zt50 zt50Var34;
        zt50 zt50Var35;
        zt50 zt50Var36;
        boolean z5;
        zt50 zt50Var37;
        zt50 zt50Var38;
        Context context3;
        zt50 zt50Var39;
        zt50 zt50Var40;
        zt50 zt50Var41;
        zt50 zt50Var42;
        zt50 zt50Var43;
        zt50 zt50Var44;
        zt50 zt50Var45;
        zt50 zt50Var46;
        nk2 binding33;
        ConstraintLayout constraintLayout5;
        nk2 binding34;
        nk2 binding35;
        nk2 binding36;
        nk2 binding37;
        nk2 binding38;
        nk2 binding39;
        zt50 zt50Var47;
        nk2 binding40;
        zt50 zt50Var48;
        zt50 zt50Var49;
        zt50 zt50Var50;
        boolean z6;
        nk2 binding41;
        ConstraintLayout constraintLayout6;
        nk2 binding42;
        nk2 binding43;
        nk2 binding44;
        zt50 zt50Var51;
        nk2 binding45;
        zt50 zt50Var52;
        nk2 binding46;
        nk2 binding47;
        nk2 binding48;
        zt50 zt50Var53;
        zt50 zt50Var54;
        zt50 zt50Var55;
        Context context4;
        int i3;
        boolean zBooleanValue;
        boolean zL;
        View viewF;
        boolean z7 = this.e;
        zt50 zt50Var56 = this.b;
        CashoutLayoutForChat cashoutLayoutForChat = this.F0;
        if (!z7) {
            if (zt50Var56 == null || zt50Var56.S.getBetPlaced() || this.R || this.e) {
                if (Intrinsics.g(gameSocektResponse.getInfo().getRED().getStatus(), "STOPPED_FLYING") && (zt50Var15 = this.b) != null && zt50Var15.S.getBetPlaced() && !this.R && (zt50Var16 = this.b) != null) {
                    if (gameSocektResponse.getRoundId() == zt50Var16.S.getRoundId()) {
                        zt50Var17 = this.b;
                        if (zt50Var17 != null) {
                            M0(zt50Var17.S);
                            Unit unit = Unit.a;
                        }
                        if (this.d0) {
                            cashoutLayoutForChat.setCashOutRedRocketVisibility(false);
                            fb7.d.j(cashoutLayoutForChat);
                        }
                        O0();
                        Unit unit2 = Unit.a;
                    }
                }
                zt50 zt50Var57 = this.b;
                if (zt50Var57 == null || !zt50Var57.S.getBetPlaced() || !Intrinsics.g(gameSocektResponse.getMessageType(), "ROUND_ONGOING") || Float.parseFloat(gameSocektResponse.getCommonMultiplier()) <= 1.0f || (zt50Var11 = this.b) == null) {
                    if (this.e) {
                        zt50Var10 = this.b;
                        if (zt50Var10 != null) {
                            A1(zt50Var10.S);
                            Unit unit3 = Unit.a;
                        }
                        Unit unit4 = Unit.a;
                    } else {
                        context = getContext();
                        if (context != null) {
                            zt50Var = this.b;
                            if (zt50Var != null) {
                                zt50Var.S.setDisableContainer();
                                Unit unit5 = Unit.a;
                            }
                            if (this.d0) {
                                cashoutLayoutForChat.setCashOutRedRocketVisibility(false);
                                fb7.d.j(cashoutLayoutForChat);
                                zt50Var9 = this.b;
                                if (zt50Var9 != null && (binding8 = zt50Var9.S.getBinding()) != null) {
                                    binding8.v.setVisibility(8);
                                    Unit unit6 = Unit.a;
                                }
                            }
                            zt50Var2 = this.b;
                            if (zt50Var2 != null && (binding7 = zt50Var2.S.getBinding()) != null) {
                                binding7.p0.setVisibility(0);
                                Unit unit7 = Unit.a;
                            }
                            zt50Var3 = this.b;
                            if (zt50Var3 != null && (binding6 = zt50Var3.S.getBinding()) != null) {
                                binding6.v.setVisibility(8);
                                Unit unit8 = Unit.a;
                            }
                            zt50Var4 = this.b;
                            if (zt50Var4 != null && (binding5 = zt50Var4.S.getBinding()) != null) {
                                binding5.A.setVisibility(8);
                                Unit unit9 = Unit.a;
                            }
                            zt50Var5 = this.b;
                            if (zt50Var5 != null && (binding4 = zt50Var5.S.getBinding()) != null) {
                                binding4.C.setVisibility(8);
                                Unit unit10 = Unit.a;
                            }
                            zt50Var6 = this.b;
                            if (zt50Var6 != null && (binding3 = zt50Var6.S.getBinding()) != null) {
                                binding3.W.setVisibility(8);
                                Unit unit11 = Unit.a;
                            }
                            zt50Var7 = this.b;
                            if (zt50Var7 != null && (binding2 = zt50Var7.S.getBinding()) != null) {
                                binding2.Y.setVisibility(8);
                                Unit unit12 = Unit.a;
                            }
                            zt50Var8 = this.b;
                            if (zt50Var8 != null && (binding = zt50Var8.S.getBinding()) != null && (constraintLayout = binding.y) != null) {
                                constraintLayout.setBackground(context.getDrawable(R.drawable.bet_placed_enable_background));
                                Unit unit13 = Unit.a;
                            }
                            Unit unit14 = Unit.a;
                        }
                    }
                } else if (gameSocektResponse.getRoundId() == zt50Var11.S.getRoundId() && (zt50Var12 = this.b) != null && !zt50Var12.S.getCashoutDone()) {
                    zt50 zt50Var58 = this.b;
                    if (zt50Var58 != null) {
                        zt50Var58.S.setDisableContainer();
                        Unit unit15 = Unit.a;
                    }
                    zt50 zt50Var59 = this.b;
                    if (zt50Var59 != null && (binding16 = zt50Var59.S.getBinding()) != null) {
                        binding16.A.setTextSize(12.0f);
                        Unit unit16 = Unit.a;
                    }
                    Context context5 = getContext();
                    if (context5 != null) {
                        zt50 zt50Var60 = this.b;
                        if (zt50Var60 != null && (binding15 = zt50Var60.S.getBinding()) != null) {
                            binding15.A.setBackground(context5.getDrawable(R.drawable.cashout_button_sh));
                            Unit unit17 = Unit.a;
                        }
                        Unit unit18 = Unit.a;
                    }
                    if (Build.VERSION.SDK_INT <= 25 && (zt50Var14 = this.b) != null && (binding14 = zt50Var14.S.getBinding()) != null) {
                        binding14.A.setTextSize(12.0f);
                        Unit unit19 = Unit.a;
                    }
                    double d2 = Double.parseDouble(gameSocektResponse.getInfo().getRED().getMultiplier());
                    zt50 zt50Var61 = this.b;
                    BigDecimal bigDecimalE0 = E0(d2, zt50Var61 != null ? zt50Var61.S.getBetAmount() : 0.0d);
                    op5 op5Var = op5.a;
                    String string = getString(R.string.cash_out_upper_case_cms);
                    string.getClass();
                    String string2 = getString(R.string.cashout_text);
                    string2.getClass();
                    op5Var.getClass();
                    String strB = op5.b(string, string2, null);
                    zt50 zt50Var62 = this.b;
                    if (zt50Var62 != null && !zt50Var62.S.getCashoutInProgress() && (zt50Var13 = this.b) != null && (binding13 = zt50Var13.S.getBinding()) != null) {
                        binding13.A.setText(strB + "\n" + bigDecimalE0);
                        Unit unit20 = Unit.a;
                    }
                    Context context6 = getContext();
                    if (context6 != null) {
                        if (this.d0) {
                            cashoutLayoutForChat.setCashOutRedRocketVisibility(true);
                            cashoutLayoutForChat.setCashOutAmountRed(strB + "\n" + bigDecimalE0);
                            fb7.d.j(cashoutLayoutForChat);
                        }
                        zt50 zt50Var63 = this.b;
                        if (zt50Var63 != null && (binding12 = zt50Var63.S.getBinding()) != null) {
                            binding12.p0.setVisibility(8);
                            Unit unit21 = Unit.a;
                        }
                        zt50 zt50Var64 = this.b;
                        if (zt50Var64 != null && (binding11 = zt50Var64.S.getBinding()) != null) {
                            binding11.v.setVisibility(8);
                            Unit unit22 = Unit.a;
                        }
                        zt50 zt50Var65 = this.b;
                        if (zt50Var65 != null && (binding10 = zt50Var65.S.getBinding()) != null) {
                            binding10.A.setVisibility(0);
                            Unit unit23 = Unit.a;
                        }
                        zt50 zt50Var66 = this.b;
                        if (zt50Var66 != null && (binding9 = zt50Var66.S.getBinding()) != null && (constraintLayout2 = binding9.y) != null) {
                            constraintLayout2.setBackground(context6.getDrawable(R.drawable.bet_placed_disable_background));
                            Unit unit24 = Unit.a;
                        }
                        Unit unit25 = Unit.a;
                        z2 = true;
                    }
                } else if (this.e) {
                    zt50Var10 = this.b;
                    if (zt50Var10 != null) {
                        A1(zt50Var10.S);
                        Unit unit26 = Unit.a;
                    }
                    Unit unit27 = Unit.a;
                } else {
                    context = getContext();
                    if (context != null) {
                        zt50Var = this.b;
                        if (zt50Var != null) {
                            zt50Var.S.setDisableContainer();
                            Unit unit28 = Unit.a;
                        }
                        if (this.d0) {
                            cashoutLayoutForChat.setCashOutRedRocketVisibility(false);
                            fb7.d.j(cashoutLayoutForChat);
                            zt50Var9 = this.b;
                            if (zt50Var9 != null) {
                                binding8.v.setVisibility(8);
                                Unit unit29 = Unit.a;
                            }
                        }
                        zt50Var2 = this.b;
                        if (zt50Var2 != null) {
                            binding7.p0.setVisibility(0);
                            Unit unit30 = Unit.a;
                        }
                        zt50Var3 = this.b;
                        if (zt50Var3 != null) {
                            binding6.v.setVisibility(8);
                            Unit unit31 = Unit.a;
                        }
                        zt50Var4 = this.b;
                        if (zt50Var4 != null) {
                            binding5.A.setVisibility(8);
                            Unit unit32 = Unit.a;
                        }
                        zt50Var5 = this.b;
                        if (zt50Var5 != null) {
                            binding4.C.setVisibility(8);
                            Unit unit110 = Unit.a;
                        }
                        zt50Var6 = this.b;
                        if (zt50Var6 != null) {
                            binding3.W.setVisibility(8);
                            Unit unit111 = Unit.a;
                        }
                        zt50Var7 = this.b;
                        if (zt50Var7 != null) {
                            binding2.Y.setVisibility(8);
                            Unit unit112 = Unit.a;
                        }
                        zt50Var8 = this.b;
                        if (zt50Var8 != null) {
                            constraintLayout.setBackground(context.getDrawable(R.drawable.bet_placed_enable_background));
                            Unit unit113 = Unit.a;
                        }
                        Unit unit114 = Unit.a;
                    }
                }
            } else {
                zt50Var17 = this.b;
                if (zt50Var17 != null) {
                    M0(zt50Var17.S);
                    Unit unit33 = Unit.a;
                }
                if (this.d0) {
                    cashoutLayoutForChat.setCashOutRedRocketVisibility(false);
                    fb7.d.j(cashoutLayoutForChat);
                }
                O0();
                Unit unit34 = Unit.a;
            }
            z3 = this.i;
            zt50Var18 = this.b;
            if (z3) {
                if (zt50Var18 != null || zt50Var18.R.getBetPlaced() || this.Y || this.i) {
                    if (Intrinsics.g(gameSocektResponse.getInfo().getPURPLE().getStatus(), "STOPPED_FLYING") && (zt50Var34 = this.b) != null && zt50Var34.R.getBetPlaced() && !this.Y && (zt50Var35 = this.b) != null) {
                        if (gameSocektResponse.getRoundId() == zt50Var35.R.getRoundId()) {
                            zt50Var36 = this.b;
                            if (zt50Var36 != null) {
                                M0(zt50Var36.R);
                                Unit unit35 = Unit.a;
                            }
                            if (this.d0) {
                                cashoutLayoutForChat.setCashOutPurpleRocketVisibility(false);
                                fb7.d.j(cashoutLayoutForChat);
                            }
                            O0();
                            Unit unit36 = Unit.a;
                        }
                    }
                    zt50Var19 = this.b;
                    if (zt50Var19 == null && zt50Var19.R.getBetPlaced() && Intrinsics.g(gameSocektResponse.getMessageType(), "ROUND_ONGOING") && Float.parseFloat(gameSocektResponse.getCommonMultiplier()) > 1.0f && (zt50Var30 = this.b) != null) {
                        if (gameSocektResponse.getRoundId() == zt50Var30.R.getRoundId() && (zt50Var31 = this.b) != null && !zt50Var31.R.getCashoutDone()) {
                            zt50 zt50Var67 = this.b;
                            if (zt50Var67 != null) {
                                zt50Var67.R.setDisableContainer();
                                Unit unit37 = Unit.a;
                            }
                            zt50 zt50Var68 = this.b;
                            if (zt50Var68 != null && (binding32 = zt50Var68.R.getBinding()) != null) {
                                binding32.A.setTextSize(12.0f);
                                Unit unit38 = Unit.a;
                            }
                            Context context7 = getContext();
                            if (context7 != null) {
                                zt50 zt50Var69 = this.b;
                                if (zt50Var69 != null && (binding31 = zt50Var69.R.getBinding()) != null) {
                                    binding31.A.setBackground(context7.getDrawable(R.drawable.cashout_button_sh));
                                    Unit unit39 = Unit.a;
                                }
                                Unit unit40 = Unit.a;
                            }
                            if (Build.VERSION.SDK_INT <= 25 && (zt50Var33 = this.b) != null && (binding30 = zt50Var33.R.getBinding()) != null) {
                                binding30.A.setTextSize(12.0f);
                                Unit unit41 = Unit.a;
                            }
                            double d3 = Double.parseDouble(gameSocektResponse.getInfo().getPURPLE().getMultiplier());
                            zt50 zt50Var70 = this.b;
                            BigDecimal bigDecimalE1 = E0(d3, zt50Var70 != null ? zt50Var70.R.getBetAmount() : 0.0d);
                            op5 op5Var2 = op5.a;
                            String string3 = getString(R.string.cash_out_upper_case_cms);
                            string3.getClass();
                            String string4 = getString(R.string.cashout_text);
                            string4.getClass();
                            op5Var2.getClass();
                            String strB2 = op5.b(string3, string4, null);
                            zt50 zt50Var71 = this.b;
                            if (zt50Var71 != null && !zt50Var71.R.getCashoutInProgress() && (zt50Var32 = this.b) != null && (binding29 = zt50Var32.R.getBinding()) != null) {
                                binding29.A.setText(strB2 + "\n" + bigDecimalE1);
                                Unit unit42 = Unit.a;
                            }
                            Context context8 = getContext();
                            if (context8 != null) {
                                if (this.d0) {
                                    cashoutLayoutForChat.setCashOutPurpleRocketVisibility(true);
                                    cashoutLayoutForChat.setCashOutAmountPurple(strB2 + "\n" + bigDecimalE1);
                                    fb7.d.j(cashoutLayoutForChat);
                                }
                                zt50 zt50Var72 = this.b;
                                if (zt50Var72 != null && (binding28 = zt50Var72.R.getBinding()) != null) {
                                    binding28.p0.setVisibility(8);
                                    Unit unit43 = Unit.a;
                                }
                                zt50 zt50Var73 = this.b;
                                if (zt50Var73 != null && (binding27 = zt50Var73.R.getBinding()) != null) {
                                    binding27.v.setVisibility(8);
                                    Unit unit44 = Unit.a;
                                }
                                zt50 zt50Var74 = this.b;
                                if (zt50Var74 != null && (binding26 = zt50Var74.R.getBinding()) != null) {
                                    binding26.A.setVisibility(0);
                                    Unit unit45 = Unit.a;
                                }
                                zt50 zt50Var75 = this.b;
                                if (zt50Var75 != null && (binding25 = zt50Var75.R.getBinding()) != null && (constraintLayout4 = binding25.y) != null) {
                                    constraintLayout4.setBackground(context8.getDrawable(R.drawable.bet_placed_disable_background));
                                    Unit unit46 = Unit.a;
                                }
                                Unit unit47 = Unit.a;
                                z4 = true;
                            }
                        } else if (this.i) {
                            zt50Var29 = this.b;
                            if (zt50Var29 != null) {
                                A1(zt50Var29.R);
                                Unit unit48 = Unit.a;
                            }
                            Unit unit49 = Unit.a;
                        } else {
                            context2 = getContext();
                            if (context2 != null) {
                                zt50Var20 = this.b;
                                if (zt50Var20 != null) {
                                    zt50Var20.R.setDisableContainer();
                                    Unit unit50 = Unit.a;
                                }
                                if (this.d0) {
                                    zt50Var28 = this.b;
                                    if (zt50Var28 != null) {
                                        binding24.v.setVisibility(8);
                                        Unit unit51 = Unit.a;
                                    }
                                    i2 = 0;
                                    cashoutLayoutForChat.setCashOutPurpleRocketVisibility(false);
                                    fb7.d.j(cashoutLayoutForChat);
                                } else {
                                    i2 = 0;
                                }
                                zt50Var21 = this.b;
                                if (zt50Var21 != null) {
                                    binding23.p0.setVisibility(i2);
                                    Unit unit52 = Unit.a;
                                }
                                zt50Var22 = this.b;
                                if (zt50Var22 != null) {
                                    binding22.v.setVisibility(8);
                                    Unit unit53 = Unit.a;
                                }
                                zt50Var23 = this.b;
                                if (zt50Var23 != null) {
                                    binding21.A.setVisibility(8);
                                    Unit unit54 = Unit.a;
                                }
                                zt50Var24 = this.b;
                                if (zt50Var24 != null) {
                                    binding20.C.setVisibility(8);
                                    Unit unit55 = Unit.a;
                                }
                                zt50Var25 = this.b;
                                if (zt50Var25 != null) {
                                    binding19.W.setVisibility(8);
                                    Unit unit56 = Unit.a;
                                }
                                zt50Var26 = this.b;
                                if (zt50Var26 != null) {
                                    binding18.Y.setVisibility(8);
                                    Unit unit57 = Unit.a;
                                }
                                zt50Var27 = this.b;
                                if (zt50Var27 != null) {
                                    constraintLayout3.setBackground(context2.getDrawable(R.drawable.bet_placed_enable_background));
                                    Unit unit58 = Unit.a;
                                }
                                Unit unit59 = Unit.a;
                            }
                        }
                    } else if (this.i) {
                        zt50Var29 = this.b;
                        if (zt50Var29 != null) {
                            A1(zt50Var29.R);
                            Unit unit410 = Unit.a;
                        }
                        Unit unit411 = Unit.a;
                    } else {
                        context2 = getContext();
                        if (context2 != null) {
                            zt50Var20 = this.b;
                            if (zt50Var20 != null) {
                                zt50Var20.R.setDisableContainer();
                                Unit unit510 = Unit.a;
                            }
                            if (this.d0) {
                                zt50Var28 = this.b;
                                if (zt50Var28 != null && (binding24 = zt50Var28.R.getBinding()) != null) {
                                    binding24.v.setVisibility(8);
                                    Unit unit511 = Unit.a;
                                }
                                i2 = 0;
                                cashoutLayoutForChat.setCashOutPurpleRocketVisibility(false);
                                fb7.d.j(cashoutLayoutForChat);
                            } else {
                                i2 = 0;
                            }
                            zt50Var21 = this.b;
                            if (zt50Var21 != null && (binding23 = zt50Var21.R.getBinding()) != null) {
                                binding23.p0.setVisibility(i2);
                                Unit unit512 = Unit.a;
                            }
                            zt50Var22 = this.b;
                            if (zt50Var22 != null && (binding22 = zt50Var22.R.getBinding()) != null) {
                                binding22.v.setVisibility(8);
                                Unit unit513 = Unit.a;
                            }
                            zt50Var23 = this.b;
                            if (zt50Var23 != null && (binding21 = zt50Var23.R.getBinding()) != null) {
                                binding21.A.setVisibility(8);
                                Unit unit514 = Unit.a;
                            }
                            zt50Var24 = this.b;
                            if (zt50Var24 != null && (binding20 = zt50Var24.R.getBinding()) != null) {
                                binding20.C.setVisibility(8);
                                Unit unit515 = Unit.a;
                            }
                            zt50Var25 = this.b;
                            if (zt50Var25 != null && (binding19 = zt50Var25.R.getBinding()) != null) {
                                binding19.W.setVisibility(8);
                                Unit unit516 = Unit.a;
                            }
                            zt50Var26 = this.b;
                            if (zt50Var26 != null && (binding18 = zt50Var26.R.getBinding()) != null) {
                                binding18.Y.setVisibility(8);
                                Unit unit517 = Unit.a;
                            }
                            zt50Var27 = this.b;
                            if (zt50Var27 != null && (binding17 = zt50Var27.R.getBinding()) != null && (constraintLayout3 = binding17.y) != null) {
                                constraintLayout3.setBackground(context2.getDrawable(R.drawable.bet_placed_enable_background));
                                Unit unit518 = Unit.a;
                            }
                            Unit unit519 = Unit.a;
                        }
                    }
                } else {
                    zt50Var36 = this.b;
                    if (zt50Var36 != null) {
                        M0(zt50Var36.R);
                        Unit unit310 = Unit.a;
                    }
                    if (this.d0) {
                        cashoutLayoutForChat.setCashOutPurpleRocketVisibility(false);
                        fb7.d.j(cashoutLayoutForChat);
                    }
                    O0();
                    Unit unit311 = Unit.a;
                }
                z5 = this.f;
                zt50Var37 = this.b;
                if (z5) {
                    if (zt50Var37 != null || zt50Var37.z.getBetPlaced() || this.V || this.f) {
                        if (Intrinsics.g(gameSocektResponse.getInfo().getBLUE().getStatus(), "STOPPED_FLYING") && (zt50Var53 = this.b) != null && zt50Var53.z.getBetPlaced() && !this.V && (zt50Var54 = this.b) != null) {
                            if (gameSocektResponse.getRoundId() == zt50Var54.z.getRoundId()) {
                                zt50Var55 = this.b;
                                if (zt50Var55 != null) {
                                    M0(zt50Var55.z);
                                    Unit unit60 = Unit.a;
                                }
                                if (this.d0) {
                                    cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                    fb7.d.j(cashoutLayoutForChat);
                                }
                                O0();
                                Unit unit61 = Unit.a;
                            }
                        }
                        zt50Var38 = this.b;
                        if (zt50Var38 == null && zt50Var38.z.getBetPlaced() && Intrinsics.g(gameSocektResponse.getMessageType(), "ROUND_ONGOING") && Float.parseFloat(gameSocektResponse.getCommonMultiplier()) > 1.0f && (zt50Var49 = this.b) != null) {
                            if (gameSocektResponse.getRoundId() == zt50Var49.z.getRoundId() && (zt50Var50 = this.b) != null && !zt50Var50.z.getCashoutDone()) {
                                zt50 zt50Var76 = this.b;
                                if (zt50Var76 != null) {
                                    zt50Var76.z.setDisableContainer();
                                    Unit unit62 = Unit.a;
                                }
                                zt50 zt50Var77 = this.b;
                                if (zt50Var77 != null && (binding48 = zt50Var77.z.getBinding()) != null) {
                                    binding48.A.setTextSize(12.0f);
                                    Unit unit63 = Unit.a;
                                }
                                Context context9 = getContext();
                                if (context9 != null) {
                                    zt50 zt50Var78 = this.b;
                                    if (zt50Var78 != null && (binding47 = zt50Var78.z.getBinding()) != null) {
                                        binding47.A.setBackground(context9.getDrawable(R.drawable.cashout_button_sh));
                                        Unit unit64 = Unit.a;
                                    }
                                    Unit unit65 = Unit.a;
                                }
                                if (Build.VERSION.SDK_INT <= 25 && (zt50Var52 = this.b) != null && (binding46 = zt50Var52.z.getBinding()) != null) {
                                    binding46.A.setTextSize(12.0f);
                                    Unit unit66 = Unit.a;
                                }
                                double d4 = Double.parseDouble(gameSocektResponse.getInfo().getBLUE().getMultiplier());
                                zt50 zt50Var79 = this.b;
                                BigDecimal bigDecimalE2 = E0(d4, zt50Var79 != null ? zt50Var79.z.getBetAmount() : 0.0d);
                                op5 op5Var3 = op5.a;
                                String string5 = getString(R.string.cash_out_upper_case_cms);
                                string5.getClass();
                                String string6 = getString(R.string.cashout_text);
                                string6.getClass();
                                op5Var3.getClass();
                                String strB3 = op5.b(string5, string6, null);
                                zt50 zt50Var80 = this.b;
                                if (zt50Var80 != null && !zt50Var80.z.getCashoutInProgress() && (zt50Var51 = this.b) != null && (binding45 = zt50Var51.z.getBinding()) != null) {
                                    binding45.A.setText(strB3 + "\n" + bigDecimalE2);
                                    Unit unit67 = Unit.a;
                                }
                                Context context10 = getContext();
                                if (context10 != null) {
                                    if (this.d0) {
                                        cashoutLayoutForChat.setCashOutBlueRocketVisibility(true);
                                        cashoutLayoutForChat.setCashOutAmountBlue(strB3 + "\n" + bigDecimalE2);
                                        fb7.d.j(cashoutLayoutForChat);
                                    }
                                    zt50 zt50Var81 = this.b;
                                    if (zt50Var81 != null && (binding44 = zt50Var81.z.getBinding()) != null) {
                                        binding44.p0.setVisibility(8);
                                        Unit unit68 = Unit.a;
                                    }
                                    zt50 zt50Var82 = this.b;
                                    if (zt50Var82 != null && (binding43 = zt50Var82.z.getBinding()) != null) {
                                        binding43.v.setVisibility(8);
                                        Unit unit69 = Unit.a;
                                    }
                                    zt50 zt50Var83 = this.b;
                                    if (zt50Var83 != null && (binding42 = zt50Var83.z.getBinding()) != null) {
                                        binding42.A.setVisibility(0);
                                        Unit unit70 = Unit.a;
                                    }
                                    zt50 zt50Var84 = this.b;
                                    if (zt50Var84 != null && (binding41 = zt50Var84.z.getBinding()) != null && (constraintLayout6 = binding41.y) != null) {
                                        constraintLayout6.setBackground(context10.getDrawable(R.drawable.bet_placed_disable_background));
                                        Unit unit71 = Unit.a;
                                    }
                                    Unit unit72 = Unit.a;
                                    z6 = true;
                                }
                            } else if (this.f) {
                                zt50Var48 = this.b;
                                if (zt50Var48 != null) {
                                    A1(zt50Var48.z);
                                    Unit unit73 = Unit.a;
                                }
                                Unit unit74 = Unit.a;
                            } else {
                                context3 = getContext();
                                if (context3 != null) {
                                    zt50Var39 = this.b;
                                    if (zt50Var39 != null) {
                                        zt50Var39.z.setDisableContainer();
                                        Unit unit75 = Unit.a;
                                    }
                                    if (this.d0) {
                                        cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                        fb7.d.j(cashoutLayoutForChat);
                                        zt50Var47 = this.b;
                                        if (zt50Var47 != null) {
                                            binding40.v.setVisibility(8);
                                            Unit unit76 = Unit.a;
                                        }
                                    }
                                    zt50Var40 = this.b;
                                    if (zt50Var40 != null) {
                                        binding39.p0.setVisibility(0);
                                        Unit unit77 = Unit.a;
                                    }
                                    zt50Var41 = this.b;
                                    if (zt50Var41 != null) {
                                        binding38.v.setVisibility(8);
                                        Unit unit78 = Unit.a;
                                    }
                                    zt50Var42 = this.b;
                                    if (zt50Var42 != null) {
                                        binding37.A.setVisibility(8);
                                        Unit unit79 = Unit.a;
                                    }
                                    zt50Var43 = this.b;
                                    if (zt50Var43 != null) {
                                        binding36.C.setVisibility(8);
                                        Unit unit80 = Unit.a;
                                    }
                                    zt50Var44 = this.b;
                                    if (zt50Var44 != null) {
                                        binding35.W.setVisibility(8);
                                        Unit unit81 = Unit.a;
                                    }
                                    zt50Var45 = this.b;
                                    if (zt50Var45 != null) {
                                        binding34.Y.setVisibility(8);
                                        Unit unit82 = Unit.a;
                                    }
                                    zt50Var46 = this.b;
                                    if (zt50Var46 != null) {
                                        constraintLayout5.setBackground(context3.getDrawable(R.drawable.bet_placed_enable_background));
                                        Unit unit83 = Unit.a;
                                    }
                                    Unit unit84 = Unit.a;
                                }
                            }
                        } else if (this.f) {
                            zt50Var48 = this.b;
                            if (zt50Var48 != null) {
                                A1(zt50Var48.z);
                                Unit unit710 = Unit.a;
                            }
                            Unit unit711 = Unit.a;
                        } else {
                            context3 = getContext();
                            if (context3 != null) {
                                zt50Var39 = this.b;
                                if (zt50Var39 != null) {
                                    zt50Var39.z.setDisableContainer();
                                    Unit unit712 = Unit.a;
                                }
                                if (this.d0) {
                                    cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                    fb7.d.j(cashoutLayoutForChat);
                                    zt50Var47 = this.b;
                                    if (zt50Var47 != null && (binding40 = zt50Var47.z.getBinding()) != null) {
                                        binding40.v.setVisibility(8);
                                        Unit unit713 = Unit.a;
                                    }
                                }
                                zt50Var40 = this.b;
                                if (zt50Var40 != null && (binding39 = zt50Var40.z.getBinding()) != null) {
                                    binding39.p0.setVisibility(0);
                                    Unit unit714 = Unit.a;
                                }
                                zt50Var41 = this.b;
                                if (zt50Var41 != null && (binding38 = zt50Var41.z.getBinding()) != null) {
                                    binding38.v.setVisibility(8);
                                    Unit unit715 = Unit.a;
                                }
                                zt50Var42 = this.b;
                                if (zt50Var42 != null && (binding37 = zt50Var42.z.getBinding()) != null) {
                                    binding37.A.setVisibility(8);
                                    Unit unit716 = Unit.a;
                                }
                                zt50Var43 = this.b;
                                if (zt50Var43 != null && (binding36 = zt50Var43.z.getBinding()) != null) {
                                    binding36.C.setVisibility(8);
                                    Unit unit85 = Unit.a;
                                }
                                zt50Var44 = this.b;
                                if (zt50Var44 != null && (binding35 = zt50Var44.z.getBinding()) != null) {
                                    binding35.W.setVisibility(8);
                                    Unit unit86 = Unit.a;
                                }
                                zt50Var45 = this.b;
                                if (zt50Var45 != null && (binding34 = zt50Var45.z.getBinding()) != null) {
                                    binding34.Y.setVisibility(8);
                                    Unit unit87 = Unit.a;
                                }
                                zt50Var46 = this.b;
                                if (zt50Var46 != null && (binding33 = zt50Var46.z.getBinding()) != null && (constraintLayout5 = binding33.y) != null) {
                                    constraintLayout5.setBackground(context3.getDrawable(R.drawable.bet_placed_enable_background));
                                    Unit unit88 = Unit.a;
                                }
                                Unit unit89 = Unit.a;
                            }
                        }
                    } else {
                        zt50Var55 = this.b;
                        if (zt50Var55 != null) {
                            M0(zt50Var55.z);
                            Unit unit610 = Unit.a;
                        }
                        if (this.d0) {
                            cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                            fb7.d.j(cashoutLayoutForChat);
                        }
                        O0();
                        Unit unit611 = Unit.a;
                    }
                    if (!isRemoving() || (context4 = getContext()) == null) {
                    }
                    ArrayList<OnboardingItem> arrayListA = sny.a(context4, "pocket-rockets");
                    if (!arrayListA.isEmpty()) {
                        int size = arrayListA.size();
                        i3 = 0;
                        zBooleanValue = false;
                        while (true) {
                            if (i3 < size) {
                                Boolean isView = arrayListA.get(i3).getIsView();
                                zBooleanValue = isView != null ? isView.booleanValue() : false;
                                if (!zBooleanValue) {
                                    break;
                                } else {
                                    i3++;
                                }
                            } else {
                                i3 = 0;
                                break;
                            }
                        }
                    } else {
                        i3 = 0;
                        zBooleanValue = false;
                        break;
                    }
                    try {
                        zt50 zt50Var85 = this.b;
                        zL = (zt50Var85 == null || (viewF = zt50Var85.F.f(8388613)) == null) ? false : DrawerLayout.l(viewF);
                    } catch (Exception unused) {
                    }
                    if (zBooleanValue || i3 <= 0 || zL) {
                        return;
                    }
                    Fragment fragmentG = getChildFragmentManager().G(R.id.onboarding_images);
                    if ((this.v1 && this.w1 && this.x1) || (!z2 && !z4 && !z6)) {
                        this.d = false;
                        if (fragmentG != null) {
                            FragmentManager childFragmentManager = getChildFragmentManager();
                            childFragmentManager.getClass();
                            androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                            aVar.p(fragmentG);
                            aVar.d();
                        }
                        zt50 zt50Var86 = this.b;
                        if (zt50Var86 != null) {
                            zt50Var86.P.setVisibility(8);
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Long l2 = this.u1;
                        if (l2 != null) {
                            long jLongValue = l2.longValue();
                            if (this.v1 || this.w1 || this.x1 || jCurrentTimeMillis - jLongValue > 3000) {
                                sny.c(context4, this.y, 1, "pocket-rockets");
                            }
                        }
                        this.u1 = null;
                        this.v1 = false;
                        this.w1 = false;
                        this.x1 = false;
                        return;
                    }
                    this.d = true;
                    if (this.B != null && (fragmentG == null || this.y1 != z2 || this.z1 != z4 || this.A1 != z6)) {
                        Map<String, Float> mapF = kpu.f(new Pair("PR_BET1_PLACED", Float.valueOf(z2 ? 1.0f : 0.0f)), new Pair("PR_BET2_PLACED", Float.valueOf(z4 ? 1.0f : 0.0f)), new Pair("PR_BET3_PLACED", Float.valueOf(z6 ? 1.0f : 0.0f)));
                        FragmentManager childFragmentManager2 = getChildFragmentManager();
                        androidx.fragment.app.a aVarA = oke.a(childFragmentManager2, childFragmentManager2);
                        op5.a.getClass();
                        List<? extends File> list = op5.b;
                        com.sportygames.commons.views.a aVar2 = new com.sportygames.commons.views.a();
                        aVar2.c = "pocket-rockets";
                        aVar2.d = 1;
                        aVar2.w = list;
                        aVar2.z = mapF;
                        aVar2.A = false;
                        aVarA.f(R.id.onboarding_images, aVar2, null);
                        aVarA.d();
                    }
                    this.y1 = z2;
                    this.z1 = z4;
                    this.A1 = z6;
                    zt50 zt50Var87 = this.b;
                    if (zt50Var87 != null) {
                        zt50Var87.P.setVisibility(0);
                    }
                    if (this.u1 == null) {
                        this.u1 = Long.valueOf(System.currentTimeMillis());
                        return;
                    }
                    return;
                }
                if (zt50Var37 != null) {
                    A1(zt50Var37.z);
                    Unit unit90 = Unit.a;
                }
                z6 = false;
                if (isRemoving()) {
                }
            }
            if (zt50Var18 != null) {
                A1(zt50Var18.R);
                Unit unit91 = Unit.a;
            }
            z4 = false;
            z5 = this.f;
            zt50Var37 = this.b;
            if (z5) {
                if (zt50Var37 != null) {
                    if (Intrinsics.g(gameSocektResponse.getInfo().getBLUE().getStatus(), "STOPPED_FLYING")) {
                        if (gameSocektResponse.getRoundId() == zt50Var54.z.getRoundId()) {
                            zt50Var55 = this.b;
                            if (zt50Var55 != null) {
                                M0(zt50Var55.z);
                                Unit unit612 = Unit.a;
                            }
                            if (this.d0) {
                                cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                fb7.d.j(cashoutLayoutForChat);
                            }
                            O0();
                            Unit unit613 = Unit.a;
                        }
                    }
                    zt50Var38 = this.b;
                    if (zt50Var38 == null) {
                        if (this.f) {
                            zt50Var48 = this.b;
                            if (zt50Var48 != null) {
                                A1(zt50Var48.z);
                                Unit unit717 = Unit.a;
                            }
                            Unit unit718 = Unit.a;
                        } else {
                            context3 = getContext();
                            if (context3 != null) {
                                zt50Var39 = this.b;
                                if (zt50Var39 != null) {
                                    zt50Var39.z.setDisableContainer();
                                    Unit unit719 = Unit.a;
                                }
                                if (this.d0) {
                                    cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                    fb7.d.j(cashoutLayoutForChat);
                                    zt50Var47 = this.b;
                                    if (zt50Var47 != null) {
                                        binding40.v.setVisibility(8);
                                        Unit unit7110 = Unit.a;
                                    }
                                }
                                zt50Var40 = this.b;
                                if (zt50Var40 != null) {
                                    binding39.p0.setVisibility(0);
                                    Unit unit7111 = Unit.a;
                                }
                                zt50Var41 = this.b;
                                if (zt50Var41 != null) {
                                    binding38.v.setVisibility(8);
                                    Unit unit7112 = Unit.a;
                                }
                                zt50Var42 = this.b;
                                if (zt50Var42 != null) {
                                    binding37.A.setVisibility(8);
                                    Unit unit7113 = Unit.a;
                                }
                                zt50Var43 = this.b;
                                if (zt50Var43 != null) {
                                    binding36.C.setVisibility(8);
                                    Unit unit810 = Unit.a;
                                }
                                zt50Var44 = this.b;
                                if (zt50Var44 != null) {
                                    binding35.W.setVisibility(8);
                                    Unit unit811 = Unit.a;
                                }
                                zt50Var45 = this.b;
                                if (zt50Var45 != null) {
                                    binding34.Y.setVisibility(8);
                                    Unit unit812 = Unit.a;
                                }
                                zt50Var46 = this.b;
                                if (zt50Var46 != null) {
                                    constraintLayout5.setBackground(context3.getDrawable(R.drawable.bet_placed_enable_background));
                                    Unit unit813 = Unit.a;
                                }
                                Unit unit814 = Unit.a;
                            }
                        }
                    } else if (this.f) {
                        zt50Var48 = this.b;
                        if (zt50Var48 != null) {
                            A1(zt50Var48.z);
                            Unit unit7114 = Unit.a;
                        }
                        Unit unit7115 = Unit.a;
                    } else {
                        context3 = getContext();
                        if (context3 != null) {
                            zt50Var39 = this.b;
                            if (zt50Var39 != null) {
                                zt50Var39.z.setDisableContainer();
                                Unit unit7116 = Unit.a;
                            }
                            if (this.d0) {
                                cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                fb7.d.j(cashoutLayoutForChat);
                                zt50Var47 = this.b;
                                if (zt50Var47 != null) {
                                    binding40.v.setVisibility(8);
                                    Unit unit7117 = Unit.a;
                                }
                            }
                            zt50Var40 = this.b;
                            if (zt50Var40 != null) {
                                binding39.p0.setVisibility(0);
                                Unit unit7118 = Unit.a;
                            }
                            zt50Var41 = this.b;
                            if (zt50Var41 != null) {
                                binding38.v.setVisibility(8);
                                Unit unit7119 = Unit.a;
                            }
                            zt50Var42 = this.b;
                            if (zt50Var42 != null) {
                                binding37.A.setVisibility(8);
                                Unit unit71110 = Unit.a;
                            }
                            zt50Var43 = this.b;
                            if (zt50Var43 != null) {
                                binding36.C.setVisibility(8);
                                Unit unit815 = Unit.a;
                            }
                            zt50Var44 = this.b;
                            if (zt50Var44 != null) {
                                binding35.W.setVisibility(8);
                                Unit unit816 = Unit.a;
                            }
                            zt50Var45 = this.b;
                            if (zt50Var45 != null) {
                                binding34.Y.setVisibility(8);
                                Unit unit817 = Unit.a;
                            }
                            zt50Var46 = this.b;
                            if (zt50Var46 != null) {
                                constraintLayout5.setBackground(context3.getDrawable(R.drawable.bet_placed_enable_background));
                                Unit unit818 = Unit.a;
                            }
                            Unit unit819 = Unit.a;
                        }
                    }
                } else {
                    if (Intrinsics.g(gameSocektResponse.getInfo().getBLUE().getStatus(), "STOPPED_FLYING")) {
                        if (gameSocektResponse.getRoundId() == zt50Var54.z.getRoundId()) {
                            zt50Var55 = this.b;
                            if (zt50Var55 != null) {
                                M0(zt50Var55.z);
                                Unit unit614 = Unit.a;
                            }
                            if (this.d0) {
                                cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                fb7.d.j(cashoutLayoutForChat);
                            }
                            O0();
                            Unit unit615 = Unit.a;
                        }
                    }
                    zt50Var38 = this.b;
                    if (zt50Var38 == null) {
                        if (this.f) {
                            zt50Var48 = this.b;
                            if (zt50Var48 != null) {
                                A1(zt50Var48.z);
                                Unit unit71111 = Unit.a;
                            }
                            Unit unit71112 = Unit.a;
                        } else {
                            context3 = getContext();
                            if (context3 != null) {
                                zt50Var39 = this.b;
                                if (zt50Var39 != null) {
                                    zt50Var39.z.setDisableContainer();
                                    Unit unit71113 = Unit.a;
                                }
                                if (this.d0) {
                                    cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                    fb7.d.j(cashoutLayoutForChat);
                                    zt50Var47 = this.b;
                                    if (zt50Var47 != null) {
                                        binding40.v.setVisibility(8);
                                        Unit unit71114 = Unit.a;
                                    }
                                }
                                zt50Var40 = this.b;
                                if (zt50Var40 != null) {
                                    binding39.p0.setVisibility(0);
                                    Unit unit71115 = Unit.a;
                                }
                                zt50Var41 = this.b;
                                if (zt50Var41 != null) {
                                    binding38.v.setVisibility(8);
                                    Unit unit71116 = Unit.a;
                                }
                                zt50Var42 = this.b;
                                if (zt50Var42 != null) {
                                    binding37.A.setVisibility(8);
                                    Unit unit71117 = Unit.a;
                                }
                                zt50Var43 = this.b;
                                if (zt50Var43 != null) {
                                    binding36.C.setVisibility(8);
                                    Unit unit8110 = Unit.a;
                                }
                                zt50Var44 = this.b;
                                if (zt50Var44 != null) {
                                    binding35.W.setVisibility(8);
                                    Unit unit8111 = Unit.a;
                                }
                                zt50Var45 = this.b;
                                if (zt50Var45 != null) {
                                    binding34.Y.setVisibility(8);
                                    Unit unit8112 = Unit.a;
                                }
                                zt50Var46 = this.b;
                                if (zt50Var46 != null) {
                                    constraintLayout5.setBackground(context3.getDrawable(R.drawable.bet_placed_enable_background));
                                    Unit unit8113 = Unit.a;
                                }
                                Unit unit8114 = Unit.a;
                            }
                        }
                    } else if (this.f) {
                        zt50Var48 = this.b;
                        if (zt50Var48 != null) {
                            A1(zt50Var48.z);
                            Unit unit71118 = Unit.a;
                        }
                        Unit unit71119 = Unit.a;
                    } else {
                        context3 = getContext();
                        if (context3 != null) {
                            zt50Var39 = this.b;
                            if (zt50Var39 != null) {
                                zt50Var39.z.setDisableContainer();
                                Unit unit711110 = Unit.a;
                            }
                            if (this.d0) {
                                cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                fb7.d.j(cashoutLayoutForChat);
                                zt50Var47 = this.b;
                                if (zt50Var47 != null) {
                                    binding40.v.setVisibility(8);
                                    Unit unit711111 = Unit.a;
                                }
                            }
                            zt50Var40 = this.b;
                            if (zt50Var40 != null) {
                                binding39.p0.setVisibility(0);
                                Unit unit711112 = Unit.a;
                            }
                            zt50Var41 = this.b;
                            if (zt50Var41 != null) {
                                binding38.v.setVisibility(8);
                                Unit unit711113 = Unit.a;
                            }
                            zt50Var42 = this.b;
                            if (zt50Var42 != null) {
                                binding37.A.setVisibility(8);
                                Unit unit711114 = Unit.a;
                            }
                            zt50Var43 = this.b;
                            if (zt50Var43 != null) {
                                binding36.C.setVisibility(8);
                                Unit unit8115 = Unit.a;
                            }
                            zt50Var44 = this.b;
                            if (zt50Var44 != null) {
                                binding35.W.setVisibility(8);
                                Unit unit8116 = Unit.a;
                            }
                            zt50Var45 = this.b;
                            if (zt50Var45 != null) {
                                binding34.Y.setVisibility(8);
                                Unit unit8117 = Unit.a;
                            }
                            zt50Var46 = this.b;
                            if (zt50Var46 != null) {
                                constraintLayout5.setBackground(context3.getDrawable(R.drawable.bet_placed_enable_background));
                                Unit unit8118 = Unit.a;
                            }
                            Unit unit8119 = Unit.a;
                        }
                    }
                }
                if (isRemoving()) {
                }
            }
            if (zt50Var37 != null) {
                A1(zt50Var37.z);
                Unit unit92 = Unit.a;
            }
            z6 = false;
            if (isRemoving()) {
            }
        }
        if (zt50Var56 != null) {
            A1(zt50Var56.S);
            Unit unit93 = Unit.a;
        }
        z2 = false;
        z3 = this.i;
        zt50Var18 = this.b;
        if (z3) {
            if (zt50Var18 != null) {
                if (Intrinsics.g(gameSocektResponse.getInfo().getPURPLE().getStatus(), "STOPPED_FLYING")) {
                    if (gameSocektResponse.getRoundId() == zt50Var35.R.getRoundId()) {
                        zt50Var36 = this.b;
                        if (zt50Var36 != null) {
                            M0(zt50Var36.R);
                            Unit unit312 = Unit.a;
                        }
                        if (this.d0) {
                            cashoutLayoutForChat.setCashOutPurpleRocketVisibility(false);
                            fb7.d.j(cashoutLayoutForChat);
                        }
                        O0();
                        Unit unit313 = Unit.a;
                    }
                }
                zt50Var19 = this.b;
                if (zt50Var19 == null) {
                    if (this.i) {
                        zt50Var29 = this.b;
                        if (zt50Var29 != null) {
                            A1(zt50Var29.R);
                            Unit unit412 = Unit.a;
                        }
                        Unit unit413 = Unit.a;
                    } else {
                        context2 = getContext();
                        if (context2 != null) {
                            zt50Var20 = this.b;
                            if (zt50Var20 != null) {
                                zt50Var20.R.setDisableContainer();
                                Unit unit5110 = Unit.a;
                            }
                            if (this.d0) {
                                zt50Var28 = this.b;
                                if (zt50Var28 != null) {
                                    binding24.v.setVisibility(8);
                                    Unit unit5111 = Unit.a;
                                }
                                i2 = 0;
                                cashoutLayoutForChat.setCashOutPurpleRocketVisibility(false);
                                fb7.d.j(cashoutLayoutForChat);
                            } else {
                                i2 = 0;
                            }
                            zt50Var21 = this.b;
                            if (zt50Var21 != null) {
                                binding23.p0.setVisibility(i2);
                                Unit unit5112 = Unit.a;
                            }
                            zt50Var22 = this.b;
                            if (zt50Var22 != null) {
                                binding22.v.setVisibility(8);
                                Unit unit5113 = Unit.a;
                            }
                            zt50Var23 = this.b;
                            if (zt50Var23 != null) {
                                binding21.A.setVisibility(8);
                                Unit unit5114 = Unit.a;
                            }
                            zt50Var24 = this.b;
                            if (zt50Var24 != null) {
                                binding20.C.setVisibility(8);
                                Unit unit5115 = Unit.a;
                            }
                            zt50Var25 = this.b;
                            if (zt50Var25 != null) {
                                binding19.W.setVisibility(8);
                                Unit unit5116 = Unit.a;
                            }
                            zt50Var26 = this.b;
                            if (zt50Var26 != null) {
                                binding18.Y.setVisibility(8);
                                Unit unit5117 = Unit.a;
                            }
                            zt50Var27 = this.b;
                            if (zt50Var27 != null) {
                                constraintLayout3.setBackground(context2.getDrawable(R.drawable.bet_placed_enable_background));
                                Unit unit5118 = Unit.a;
                            }
                            Unit unit5119 = Unit.a;
                        }
                    }
                } else if (this.i) {
                    zt50Var29 = this.b;
                    if (zt50Var29 != null) {
                        A1(zt50Var29.R);
                        Unit unit414 = Unit.a;
                    }
                    Unit unit415 = Unit.a;
                } else {
                    context2 = getContext();
                    if (context2 != null) {
                        zt50Var20 = this.b;
                        if (zt50Var20 != null) {
                            zt50Var20.R.setDisableContainer();
                            Unit unit51110 = Unit.a;
                        }
                        if (this.d0) {
                            zt50Var28 = this.b;
                            if (zt50Var28 != null) {
                                binding24.v.setVisibility(8);
                                Unit unit51111 = Unit.a;
                            }
                            i2 = 0;
                            cashoutLayoutForChat.setCashOutPurpleRocketVisibility(false);
                            fb7.d.j(cashoutLayoutForChat);
                        } else {
                            i2 = 0;
                        }
                        zt50Var21 = this.b;
                        if (zt50Var21 != null) {
                            binding23.p0.setVisibility(i2);
                            Unit unit51112 = Unit.a;
                        }
                        zt50Var22 = this.b;
                        if (zt50Var22 != null) {
                            binding22.v.setVisibility(8);
                            Unit unit51113 = Unit.a;
                        }
                        zt50Var23 = this.b;
                        if (zt50Var23 != null) {
                            binding21.A.setVisibility(8);
                            Unit unit51114 = Unit.a;
                        }
                        zt50Var24 = this.b;
                        if (zt50Var24 != null) {
                            binding20.C.setVisibility(8);
                            Unit unit51115 = Unit.a;
                        }
                        zt50Var25 = this.b;
                        if (zt50Var25 != null) {
                            binding19.W.setVisibility(8);
                            Unit unit51116 = Unit.a;
                        }
                        zt50Var26 = this.b;
                        if (zt50Var26 != null) {
                            binding18.Y.setVisibility(8);
                            Unit unit51117 = Unit.a;
                        }
                        zt50Var27 = this.b;
                        if (zt50Var27 != null) {
                            constraintLayout3.setBackground(context2.getDrawable(R.drawable.bet_placed_enable_background));
                            Unit unit51118 = Unit.a;
                        }
                        Unit unit51119 = Unit.a;
                    }
                }
            } else {
                if (Intrinsics.g(gameSocektResponse.getInfo().getPURPLE().getStatus(), "STOPPED_FLYING")) {
                    if (gameSocektResponse.getRoundId() == zt50Var35.R.getRoundId()) {
                        zt50Var36 = this.b;
                        if (zt50Var36 != null) {
                            M0(zt50Var36.R);
                            Unit unit314 = Unit.a;
                        }
                        if (this.d0) {
                            cashoutLayoutForChat.setCashOutPurpleRocketVisibility(false);
                            fb7.d.j(cashoutLayoutForChat);
                        }
                        O0();
                        Unit unit315 = Unit.a;
                    }
                }
                zt50Var19 = this.b;
                if (zt50Var19 == null) {
                    if (this.i) {
                        zt50Var29 = this.b;
                        if (zt50Var29 != null) {
                            A1(zt50Var29.R);
                            Unit unit416 = Unit.a;
                        }
                        Unit unit417 = Unit.a;
                    } else {
                        context2 = getContext();
                        if (context2 != null) {
                            zt50Var20 = this.b;
                            if (zt50Var20 != null) {
                                zt50Var20.R.setDisableContainer();
                                Unit unit511110 = Unit.a;
                            }
                            if (this.d0) {
                                zt50Var28 = this.b;
                                if (zt50Var28 != null) {
                                    binding24.v.setVisibility(8);
                                    Unit unit511111 = Unit.a;
                                }
                                i2 = 0;
                                cashoutLayoutForChat.setCashOutPurpleRocketVisibility(false);
                                fb7.d.j(cashoutLayoutForChat);
                            } else {
                                i2 = 0;
                            }
                            zt50Var21 = this.b;
                            if (zt50Var21 != null) {
                                binding23.p0.setVisibility(i2);
                                Unit unit511112 = Unit.a;
                            }
                            zt50Var22 = this.b;
                            if (zt50Var22 != null) {
                                binding22.v.setVisibility(8);
                                Unit unit511113 = Unit.a;
                            }
                            zt50Var23 = this.b;
                            if (zt50Var23 != null) {
                                binding21.A.setVisibility(8);
                                Unit unit511114 = Unit.a;
                            }
                            zt50Var24 = this.b;
                            if (zt50Var24 != null) {
                                binding20.C.setVisibility(8);
                                Unit unit511115 = Unit.a;
                            }
                            zt50Var25 = this.b;
                            if (zt50Var25 != null) {
                                binding19.W.setVisibility(8);
                                Unit unit511116 = Unit.a;
                            }
                            zt50Var26 = this.b;
                            if (zt50Var26 != null) {
                                binding18.Y.setVisibility(8);
                                Unit unit511117 = Unit.a;
                            }
                            zt50Var27 = this.b;
                            if (zt50Var27 != null) {
                                constraintLayout3.setBackground(context2.getDrawable(R.drawable.bet_placed_enable_background));
                                Unit unit511118 = Unit.a;
                            }
                            Unit unit511119 = Unit.a;
                        }
                    }
                } else if (this.i) {
                    zt50Var29 = this.b;
                    if (zt50Var29 != null) {
                        A1(zt50Var29.R);
                        Unit unit418 = Unit.a;
                    }
                    Unit unit419 = Unit.a;
                } else {
                    context2 = getContext();
                    if (context2 != null) {
                        zt50Var20 = this.b;
                        if (zt50Var20 != null) {
                            zt50Var20.R.setDisableContainer();
                            Unit unit5111110 = Unit.a;
                        }
                        if (this.d0) {
                            zt50Var28 = this.b;
                            if (zt50Var28 != null) {
                                binding24.v.setVisibility(8);
                                Unit unit5111111 = Unit.a;
                            }
                            i2 = 0;
                            cashoutLayoutForChat.setCashOutPurpleRocketVisibility(false);
                            fb7.d.j(cashoutLayoutForChat);
                        } else {
                            i2 = 0;
                        }
                        zt50Var21 = this.b;
                        if (zt50Var21 != null) {
                            binding23.p0.setVisibility(i2);
                            Unit unit5111112 = Unit.a;
                        }
                        zt50Var22 = this.b;
                        if (zt50Var22 != null) {
                            binding22.v.setVisibility(8);
                            Unit unit5111113 = Unit.a;
                        }
                        zt50Var23 = this.b;
                        if (zt50Var23 != null) {
                            binding21.A.setVisibility(8);
                            Unit unit5111114 = Unit.a;
                        }
                        zt50Var24 = this.b;
                        if (zt50Var24 != null) {
                            binding20.C.setVisibility(8);
                            Unit unit5111115 = Unit.a;
                        }
                        zt50Var25 = this.b;
                        if (zt50Var25 != null) {
                            binding19.W.setVisibility(8);
                            Unit unit5111116 = Unit.a;
                        }
                        zt50Var26 = this.b;
                        if (zt50Var26 != null) {
                            binding18.Y.setVisibility(8);
                            Unit unit5111117 = Unit.a;
                        }
                        zt50Var27 = this.b;
                        if (zt50Var27 != null) {
                            constraintLayout3.setBackground(context2.getDrawable(R.drawable.bet_placed_enable_background));
                            Unit unit5111118 = Unit.a;
                        }
                        Unit unit5111119 = Unit.a;
                    }
                }
            }
            z5 = this.f;
            zt50Var37 = this.b;
            if (z5) {
                if (zt50Var37 != null) {
                    if (Intrinsics.g(gameSocektResponse.getInfo().getBLUE().getStatus(), "STOPPED_FLYING")) {
                        if (gameSocektResponse.getRoundId() == zt50Var54.z.getRoundId()) {
                            zt50Var55 = this.b;
                            if (zt50Var55 != null) {
                                M0(zt50Var55.z);
                                Unit unit616 = Unit.a;
                            }
                            if (this.d0) {
                                cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                fb7.d.j(cashoutLayoutForChat);
                            }
                            O0();
                            Unit unit617 = Unit.a;
                        }
                    }
                    zt50Var38 = this.b;
                    if (zt50Var38 == null) {
                        if (this.f) {
                            zt50Var48 = this.b;
                            if (zt50Var48 != null) {
                                A1(zt50Var48.z);
                                Unit unit711115 = Unit.a;
                            }
                            Unit unit711116 = Unit.a;
                        } else {
                            context3 = getContext();
                            if (context3 != null) {
                                zt50Var39 = this.b;
                                if (zt50Var39 != null) {
                                    zt50Var39.z.setDisableContainer();
                                    Unit unit711117 = Unit.a;
                                }
                                if (this.d0) {
                                    cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                    fb7.d.j(cashoutLayoutForChat);
                                    zt50Var47 = this.b;
                                    if (zt50Var47 != null) {
                                        binding40.v.setVisibility(8);
                                        Unit unit711118 = Unit.a;
                                    }
                                }
                                zt50Var40 = this.b;
                                if (zt50Var40 != null) {
                                    binding39.p0.setVisibility(0);
                                    Unit unit711119 = Unit.a;
                                }
                                zt50Var41 = this.b;
                                if (zt50Var41 != null) {
                                    binding38.v.setVisibility(8);
                                    Unit unit7111110 = Unit.a;
                                }
                                zt50Var42 = this.b;
                                if (zt50Var42 != null) {
                                    binding37.A.setVisibility(8);
                                    Unit unit7111111 = Unit.a;
                                }
                                zt50Var43 = this.b;
                                if (zt50Var43 != null) {
                                    binding36.C.setVisibility(8);
                                    Unit unit81110 = Unit.a;
                                }
                                zt50Var44 = this.b;
                                if (zt50Var44 != null) {
                                    binding35.W.setVisibility(8);
                                    Unit unit81111 = Unit.a;
                                }
                                zt50Var45 = this.b;
                                if (zt50Var45 != null) {
                                    binding34.Y.setVisibility(8);
                                    Unit unit81112 = Unit.a;
                                }
                                zt50Var46 = this.b;
                                if (zt50Var46 != null) {
                                    constraintLayout5.setBackground(context3.getDrawable(R.drawable.bet_placed_enable_background));
                                    Unit unit81113 = Unit.a;
                                }
                                Unit unit81114 = Unit.a;
                            }
                        }
                    } else if (this.f) {
                        zt50Var48 = this.b;
                        if (zt50Var48 != null) {
                            A1(zt50Var48.z);
                            Unit unit7111112 = Unit.a;
                        }
                        Unit unit7111113 = Unit.a;
                    } else {
                        context3 = getContext();
                        if (context3 != null) {
                            zt50Var39 = this.b;
                            if (zt50Var39 != null) {
                                zt50Var39.z.setDisableContainer();
                                Unit unit7111114 = Unit.a;
                            }
                            if (this.d0) {
                                cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                fb7.d.j(cashoutLayoutForChat);
                                zt50Var47 = this.b;
                                if (zt50Var47 != null) {
                                    binding40.v.setVisibility(8);
                                    Unit unit7111115 = Unit.a;
                                }
                            }
                            zt50Var40 = this.b;
                            if (zt50Var40 != null) {
                                binding39.p0.setVisibility(0);
                                Unit unit7111116 = Unit.a;
                            }
                            zt50Var41 = this.b;
                            if (zt50Var41 != null) {
                                binding38.v.setVisibility(8);
                                Unit unit7111117 = Unit.a;
                            }
                            zt50Var42 = this.b;
                            if (zt50Var42 != null) {
                                binding37.A.setVisibility(8);
                                Unit unit7111118 = Unit.a;
                            }
                            zt50Var43 = this.b;
                            if (zt50Var43 != null) {
                                binding36.C.setVisibility(8);
                                Unit unit81115 = Unit.a;
                            }
                            zt50Var44 = this.b;
                            if (zt50Var44 != null) {
                                binding35.W.setVisibility(8);
                                Unit unit81116 = Unit.a;
                            }
                            zt50Var45 = this.b;
                            if (zt50Var45 != null) {
                                binding34.Y.setVisibility(8);
                                Unit unit81117 = Unit.a;
                            }
                            zt50Var46 = this.b;
                            if (zt50Var46 != null) {
                                constraintLayout5.setBackground(context3.getDrawable(R.drawable.bet_placed_enable_background));
                                Unit unit81118 = Unit.a;
                            }
                            Unit unit81119 = Unit.a;
                        }
                    }
                } else {
                    if (Intrinsics.g(gameSocektResponse.getInfo().getBLUE().getStatus(), "STOPPED_FLYING")) {
                        if (gameSocektResponse.getRoundId() == zt50Var54.z.getRoundId()) {
                            zt50Var55 = this.b;
                            if (zt50Var55 != null) {
                                M0(zt50Var55.z);
                                Unit unit618 = Unit.a;
                            }
                            if (this.d0) {
                                cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                fb7.d.j(cashoutLayoutForChat);
                            }
                            O0();
                            Unit unit619 = Unit.a;
                        }
                    }
                    zt50Var38 = this.b;
                    if (zt50Var38 == null) {
                        if (this.f) {
                            zt50Var48 = this.b;
                            if (zt50Var48 != null) {
                                A1(zt50Var48.z);
                                Unit unit7111119 = Unit.a;
                            }
                            Unit unit71111110 = Unit.a;
                        } else {
                            context3 = getContext();
                            if (context3 != null) {
                                zt50Var39 = this.b;
                                if (zt50Var39 != null) {
                                    zt50Var39.z.setDisableContainer();
                                    Unit unit71111111 = Unit.a;
                                }
                                if (this.d0) {
                                    cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                    fb7.d.j(cashoutLayoutForChat);
                                    zt50Var47 = this.b;
                                    if (zt50Var47 != null) {
                                        binding40.v.setVisibility(8);
                                        Unit unit71111112 = Unit.a;
                                    }
                                }
                                zt50Var40 = this.b;
                                if (zt50Var40 != null) {
                                    binding39.p0.setVisibility(0);
                                    Unit unit71111113 = Unit.a;
                                }
                                zt50Var41 = this.b;
                                if (zt50Var41 != null) {
                                    binding38.v.setVisibility(8);
                                    Unit unit71111114 = Unit.a;
                                }
                                zt50Var42 = this.b;
                                if (zt50Var42 != null) {
                                    binding37.A.setVisibility(8);
                                    Unit unit71111115 = Unit.a;
                                }
                                zt50Var43 = this.b;
                                if (zt50Var43 != null) {
                                    binding36.C.setVisibility(8);
                                    Unit unit811110 = Unit.a;
                                }
                                zt50Var44 = this.b;
                                if (zt50Var44 != null) {
                                    binding35.W.setVisibility(8);
                                    Unit unit811111 = Unit.a;
                                }
                                zt50Var45 = this.b;
                                if (zt50Var45 != null) {
                                    binding34.Y.setVisibility(8);
                                    Unit unit811112 = Unit.a;
                                }
                                zt50Var46 = this.b;
                                if (zt50Var46 != null) {
                                    constraintLayout5.setBackground(context3.getDrawable(R.drawable.bet_placed_enable_background));
                                    Unit unit811113 = Unit.a;
                                }
                                Unit unit811114 = Unit.a;
                            }
                        }
                    } else if (this.f) {
                        zt50Var48 = this.b;
                        if (zt50Var48 != null) {
                            A1(zt50Var48.z);
                            Unit unit71111116 = Unit.a;
                        }
                        Unit unit71111117 = Unit.a;
                    } else {
                        context3 = getContext();
                        if (context3 != null) {
                            zt50Var39 = this.b;
                            if (zt50Var39 != null) {
                                zt50Var39.z.setDisableContainer();
                                Unit unit71111118 = Unit.a;
                            }
                            if (this.d0) {
                                cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                fb7.d.j(cashoutLayoutForChat);
                                zt50Var47 = this.b;
                                if (zt50Var47 != null) {
                                    binding40.v.setVisibility(8);
                                    Unit unit71111119 = Unit.a;
                                }
                            }
                            zt50Var40 = this.b;
                            if (zt50Var40 != null) {
                                binding39.p0.setVisibility(0);
                                Unit unit711111110 = Unit.a;
                            }
                            zt50Var41 = this.b;
                            if (zt50Var41 != null) {
                                binding38.v.setVisibility(8);
                                Unit unit711111111 = Unit.a;
                            }
                            zt50Var42 = this.b;
                            if (zt50Var42 != null) {
                                binding37.A.setVisibility(8);
                                Unit unit711111112 = Unit.a;
                            }
                            zt50Var43 = this.b;
                            if (zt50Var43 != null) {
                                binding36.C.setVisibility(8);
                                Unit unit811115 = Unit.a;
                            }
                            zt50Var44 = this.b;
                            if (zt50Var44 != null) {
                                binding35.W.setVisibility(8);
                                Unit unit811116 = Unit.a;
                            }
                            zt50Var45 = this.b;
                            if (zt50Var45 != null) {
                                binding34.Y.setVisibility(8);
                                Unit unit811117 = Unit.a;
                            }
                            zt50Var46 = this.b;
                            if (zt50Var46 != null) {
                                constraintLayout5.setBackground(context3.getDrawable(R.drawable.bet_placed_enable_background));
                                Unit unit811118 = Unit.a;
                            }
                            Unit unit811119 = Unit.a;
                        }
                    }
                }
                if (isRemoving()) {
                }
            }
            if (zt50Var37 != null) {
                A1(zt50Var37.z);
                Unit unit94 = Unit.a;
            }
            z6 = false;
            if (isRemoving()) {
            }
        }
        if (zt50Var18 != null) {
            A1(zt50Var18.R);
            Unit unit95 = Unit.a;
        }
        z4 = false;
        z5 = this.f;
        zt50Var37 = this.b;
        if (z5) {
            if (zt50Var37 != null) {
                if (Intrinsics.g(gameSocektResponse.getInfo().getBLUE().getStatus(), "STOPPED_FLYING")) {
                    if (gameSocektResponse.getRoundId() == zt50Var54.z.getRoundId()) {
                        zt50Var55 = this.b;
                        if (zt50Var55 != null) {
                            M0(zt50Var55.z);
                            Unit unit6110 = Unit.a;
                        }
                        if (this.d0) {
                            cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                            fb7.d.j(cashoutLayoutForChat);
                        }
                        O0();
                        Unit unit6111 = Unit.a;
                    }
                }
                zt50Var38 = this.b;
                if (zt50Var38 == null) {
                    if (this.f) {
                        zt50Var48 = this.b;
                        if (zt50Var48 != null) {
                            A1(zt50Var48.z);
                            Unit unit711111113 = Unit.a;
                        }
                        Unit unit711111114 = Unit.a;
                    } else {
                        context3 = getContext();
                        if (context3 != null) {
                            zt50Var39 = this.b;
                            if (zt50Var39 != null) {
                                zt50Var39.z.setDisableContainer();
                                Unit unit711111115 = Unit.a;
                            }
                            if (this.d0) {
                                cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                fb7.d.j(cashoutLayoutForChat);
                                zt50Var47 = this.b;
                                if (zt50Var47 != null) {
                                    binding40.v.setVisibility(8);
                                    Unit unit711111116 = Unit.a;
                                }
                            }
                            zt50Var40 = this.b;
                            if (zt50Var40 != null) {
                                binding39.p0.setVisibility(0);
                                Unit unit711111117 = Unit.a;
                            }
                            zt50Var41 = this.b;
                            if (zt50Var41 != null) {
                                binding38.v.setVisibility(8);
                                Unit unit711111118 = Unit.a;
                            }
                            zt50Var42 = this.b;
                            if (zt50Var42 != null) {
                                binding37.A.setVisibility(8);
                                Unit unit711111119 = Unit.a;
                            }
                            zt50Var43 = this.b;
                            if (zt50Var43 != null) {
                                binding36.C.setVisibility(8);
                                Unit unit8111110 = Unit.a;
                            }
                            zt50Var44 = this.b;
                            if (zt50Var44 != null) {
                                binding35.W.setVisibility(8);
                                Unit unit8111111 = Unit.a;
                            }
                            zt50Var45 = this.b;
                            if (zt50Var45 != null) {
                                binding34.Y.setVisibility(8);
                                Unit unit8111112 = Unit.a;
                            }
                            zt50Var46 = this.b;
                            if (zt50Var46 != null) {
                                constraintLayout5.setBackground(context3.getDrawable(R.drawable.bet_placed_enable_background));
                                Unit unit8111113 = Unit.a;
                            }
                            Unit unit8111114 = Unit.a;
                        }
                    }
                } else if (this.f) {
                    zt50Var48 = this.b;
                    if (zt50Var48 != null) {
                        A1(zt50Var48.z);
                        Unit unit7111111110 = Unit.a;
                    }
                    Unit unit7111111111 = Unit.a;
                } else {
                    context3 = getContext();
                    if (context3 != null) {
                        zt50Var39 = this.b;
                        if (zt50Var39 != null) {
                            zt50Var39.z.setDisableContainer();
                            Unit unit7111111112 = Unit.a;
                        }
                        if (this.d0) {
                            cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                            fb7.d.j(cashoutLayoutForChat);
                            zt50Var47 = this.b;
                            if (zt50Var47 != null) {
                                binding40.v.setVisibility(8);
                                Unit unit7111111113 = Unit.a;
                            }
                        }
                        zt50Var40 = this.b;
                        if (zt50Var40 != null) {
                            binding39.p0.setVisibility(0);
                            Unit unit7111111114 = Unit.a;
                        }
                        zt50Var41 = this.b;
                        if (zt50Var41 != null) {
                            binding38.v.setVisibility(8);
                            Unit unit7111111115 = Unit.a;
                        }
                        zt50Var42 = this.b;
                        if (zt50Var42 != null) {
                            binding37.A.setVisibility(8);
                            Unit unit7111111116 = Unit.a;
                        }
                        zt50Var43 = this.b;
                        if (zt50Var43 != null) {
                            binding36.C.setVisibility(8);
                            Unit unit8111115 = Unit.a;
                        }
                        zt50Var44 = this.b;
                        if (zt50Var44 != null) {
                            binding35.W.setVisibility(8);
                            Unit unit8111116 = Unit.a;
                        }
                        zt50Var45 = this.b;
                        if (zt50Var45 != null) {
                            binding34.Y.setVisibility(8);
                            Unit unit8111117 = Unit.a;
                        }
                        zt50Var46 = this.b;
                        if (zt50Var46 != null) {
                            constraintLayout5.setBackground(context3.getDrawable(R.drawable.bet_placed_enable_background));
                            Unit unit8111118 = Unit.a;
                        }
                        Unit unit8111119 = Unit.a;
                    }
                }
            } else {
                if (Intrinsics.g(gameSocektResponse.getInfo().getBLUE().getStatus(), "STOPPED_FLYING")) {
                    if (gameSocektResponse.getRoundId() == zt50Var54.z.getRoundId()) {
                        zt50Var55 = this.b;
                        if (zt50Var55 != null) {
                            M0(zt50Var55.z);
                            Unit unit6112 = Unit.a;
                        }
                        if (this.d0) {
                            cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                            fb7.d.j(cashoutLayoutForChat);
                        }
                        O0();
                        Unit unit6113 = Unit.a;
                    }
                }
                zt50Var38 = this.b;
                if (zt50Var38 == null) {
                    if (this.f) {
                        zt50Var48 = this.b;
                        if (zt50Var48 != null) {
                            A1(zt50Var48.z);
                            Unit unit7111111117 = Unit.a;
                        }
                        Unit unit7111111118 = Unit.a;
                    } else {
                        context3 = getContext();
                        if (context3 != null) {
                            zt50Var39 = this.b;
                            if (zt50Var39 != null) {
                                zt50Var39.z.setDisableContainer();
                                Unit unit7111111119 = Unit.a;
                            }
                            if (this.d0) {
                                cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                fb7.d.j(cashoutLayoutForChat);
                                zt50Var47 = this.b;
                                if (zt50Var47 != null) {
                                    binding40.v.setVisibility(8);
                                    Unit unit71111111110 = Unit.a;
                                }
                            }
                            zt50Var40 = this.b;
                            if (zt50Var40 != null) {
                                binding39.p0.setVisibility(0);
                                Unit unit71111111111 = Unit.a;
                            }
                            zt50Var41 = this.b;
                            if (zt50Var41 != null) {
                                binding38.v.setVisibility(8);
                                Unit unit71111111112 = Unit.a;
                            }
                            zt50Var42 = this.b;
                            if (zt50Var42 != null) {
                                binding37.A.setVisibility(8);
                                Unit unit71111111113 = Unit.a;
                            }
                            zt50Var43 = this.b;
                            if (zt50Var43 != null) {
                                binding36.C.setVisibility(8);
                                Unit unit81111110 = Unit.a;
                            }
                            zt50Var44 = this.b;
                            if (zt50Var44 != null) {
                                binding35.W.setVisibility(8);
                                Unit unit81111111 = Unit.a;
                            }
                            zt50Var45 = this.b;
                            if (zt50Var45 != null) {
                                binding34.Y.setVisibility(8);
                                Unit unit81111112 = Unit.a;
                            }
                            zt50Var46 = this.b;
                            if (zt50Var46 != null) {
                                constraintLayout5.setBackground(context3.getDrawable(R.drawable.bet_placed_enable_background));
                                Unit unit81111113 = Unit.a;
                            }
                            Unit unit81111114 = Unit.a;
                        }
                    }
                } else if (this.f) {
                    zt50Var48 = this.b;
                    if (zt50Var48 != null) {
                        A1(zt50Var48.z);
                        Unit unit71111111114 = Unit.a;
                    }
                    Unit unit71111111115 = Unit.a;
                } else {
                    context3 = getContext();
                    if (context3 != null) {
                        zt50Var39 = this.b;
                        if (zt50Var39 != null) {
                            zt50Var39.z.setDisableContainer();
                            Unit unit71111111116 = Unit.a;
                        }
                        if (this.d0) {
                            cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                            fb7.d.j(cashoutLayoutForChat);
                            zt50Var47 = this.b;
                            if (zt50Var47 != null) {
                                binding40.v.setVisibility(8);
                                Unit unit71111111117 = Unit.a;
                            }
                        }
                        zt50Var40 = this.b;
                        if (zt50Var40 != null) {
                            binding39.p0.setVisibility(0);
                            Unit unit71111111118 = Unit.a;
                        }
                        zt50Var41 = this.b;
                        if (zt50Var41 != null) {
                            binding38.v.setVisibility(8);
                            Unit unit71111111119 = Unit.a;
                        }
                        zt50Var42 = this.b;
                        if (zt50Var42 != null) {
                            binding37.A.setVisibility(8);
                            Unit unit711111111110 = Unit.a;
                        }
                        zt50Var43 = this.b;
                        if (zt50Var43 != null) {
                            binding36.C.setVisibility(8);
                            Unit unit81111115 = Unit.a;
                        }
                        zt50Var44 = this.b;
                        if (zt50Var44 != null) {
                            binding35.W.setVisibility(8);
                            Unit unit81111116 = Unit.a;
                        }
                        zt50Var45 = this.b;
                        if (zt50Var45 != null) {
                            binding34.Y.setVisibility(8);
                            Unit unit81111117 = Unit.a;
                        }
                        zt50Var46 = this.b;
                        if (zt50Var46 != null) {
                            constraintLayout5.setBackground(context3.getDrawable(R.drawable.bet_placed_enable_background));
                            Unit unit81111118 = Unit.a;
                        }
                        Unit unit81111119 = Unit.a;
                    }
                }
            }
            if (isRemoving()) {
            }
        }
        if (zt50Var37 != null) {
            A1(zt50Var37.z);
            Unit unit96 = Unit.a;
        }
        z6 = false;
        if (isRemoving()) {
        }
    }

    @Override // zh40.a
    public final void U(long j2) {
        GameDetails gameDetails = this.B;
        wz.a(jbkEboCkTqmGf.TQohAV, gameDetails != null ? gameDetails.getName() : null, new String[0]);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            fn1 fn1VarB1 = b1();
            String str = this.t1;
            str.getClass();
            hy50 hy50Var = new hy50(activity);
            hy50Var.a = fn1VarB1;
            hy50Var.b = j2;
            hy50Var.c = str;
            hy50Var.setCancelable(true);
            hy50Var.setCanceledOnTouchOutside(false);
            this.i0 = hy50Var;
            try {
                Window window = hy50Var.getWindow();
                WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                if (attributes != null) {
                    attributes.gravity = 17;
                }
                if (attributes != null) {
                    attributes.flags &= -5;
                }
                Window window2 = hy50Var.getWindow();
                if (window2 != null) {
                    window2.setAttributes(attributes);
                }
                Window window3 = hy50Var.getWindow();
                if (window3 != null) {
                    window3.setBackgroundDrawableResource(R.color.dialog_bg_color);
                }
                hy50Var.show();
                Window window4 = hy50Var.getWindow();
                if (window4 != null) {
                    window4.setLayout(-1, -1);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
