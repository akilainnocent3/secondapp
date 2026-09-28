package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Outline;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.permission.location.KN.qUnCRF;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.anTesting.data.model.CampaignParticipateV2;
import com.sportygames.chat.remote.models.ClaimError;
import com.sportygames.chat.remote.models.ClaimErrorParams;
import com.sportygames.chat.remote.models.ClaimRainResponse;
import com.sportygames.chat.remote.models.RainDetailInfoResponse;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.commons.models.GPSData;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.GiftItemKt;
import com.sportygames.commons.models.LeftMenuButton;
import com.sportygames.commons.models.MenuIconSize;
import com.sportygames.commons.models.NetworkStateManager;
import com.sportygames.commons.models.OnboardingItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.models.RainClaimErrorUi;
import com.sportygames.commons.models.RainToastData;
import com.sportygames.commons.models.enums.PagingFetchType;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.remote.model.StatusChat;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import com.sportygames.crash.components.ProgressMeterComponent;
import com.sportygames.crash.models.BetData;
import com.sportygames.crash.models.ToastType;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.crash.models.header.CrashHeaderState;
import com.sportygames.crash.remote.models.BetHistoryItem;
import com.sportygames.crash.remote.models.CancelBetRequest;
import com.sportygames.crash.remote.models.CashoutRequest;
import com.sportygames.crash.remote.models.ChatRoomResponse;
import com.sportygames.crash.remote.models.Coefficients;
import com.sportygames.crash.remote.models.DetailResponse;
import com.sportygames.crash.remote.models.MultiplierResponse;
import com.sportygames.crash.remote.models.PlaceBetRequest;
import com.sportygames.crash.remote.models.PreviousMultiplierResponse;
import com.sportygames.crash.remote.models.RoundResponse;
import com.sportygames.crash.remote.models.TopBets;
import com.sportygames.crash.remote.models.UserInfoResponseSocket;
import com.sportygames.crash.remote.models.WalletInfo;
import com.sportygames.crash.utils.HeaderPayload;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.remote.models.LobbyMetaInfo;
import com.sportygames.newcms.b;
import com.sportygames.newcms.c;
import com.sportygames.sportyherov2.remote.models.RainStatusResponse;
import com.sportygames.sportyherov2.remote.models.RainTopicResponse;
import com.sportygames.vip.data.StakeSafeUsageCountResponse;
import com.sportygames.vip.data.TurboUsageCountResponse;
import com.twilio.voice.EventKeys;
import eightbitlab.com.blurview.BlurView;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lfgb;", "Landroidx/fragment/app/Fragment;", "Lxjj;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "Lbb;", "", "<init>", "()V", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class fgb extends Fragment implements xjj, GameMainActivity.b, bb {
    public boolean A;
    public long A0;
    public String A1;
    public boolean B;
    public final ssw<Long> B0;
    public boolean B1;
    public boolean C;
    public final ssw<String> C0;
    public boolean C1;
    public Long D;
    public long D0;
    public boolean D1;
    public String E;
    public long E0;
    public final ytw<Boolean> E1;
    public String F;
    public boolean F0;
    public final ytw<Boolean> F1;
    public boolean G;
    public xbg G0;
    public final ttr G1;
    public SharedPreferences H;
    public String H0;
    public final ttr H1;
    public String I;
    public String I0;
    public final ttr I1;
    public SharedPreferences.Editor J;
    public boolean J0;
    public Function0<Unit> J1;
    public final q8i0 K;
    public ArrayList<GameDetails> K0;
    public Function1<? super Integer, Unit> K1;
    public final ttr L;
    public final ttr L0;
    public boolean L1;
    public final ttr M;
    public final boolean M0;
    public boolean M1;
    public final ttr N;
    public svg N0;
    public Long N1;
    public final ttr O;
    public boolean O0;
    public boolean O1;
    public final ttr P;
    public xi60 P0;
    public boolean P1;
    public final ttr Q;
    public PromotionGiftsResponse Q0;
    public String Q1;
    public final q8i0 R;
    public double R0;
    public boolean R1;
    public final ttr S;
    public Double S0;
    public boolean S1;
    public final ttr T;
    public int T0;
    public boolean T1;
    public final ttr U;
    public GPSData U0;
    public a U1;
    public final ttr V;
    public String V0;
    public mz1 V1;
    public List<DetailResponse> W;
    public BetHistoryItem W0;
    public cj5 W1;
    public boolean X;
    public String X0;
    public z52 X1;
    public final ytw<Double> Y;
    public final q8i0 Y0;
    public PlaceBetRequest Y1;
    public final ytw<Double> Z;
    public final ytw<Boolean> Z0;
    public List<DetailResponse> Z1;
    public final ttr a;
    public boolean a0;
    public final ytw<Boolean> a1;
    public Double a2;
    public final ttr b;
    public final ytw<Double> b0;
    public final ytw<Boolean> b1;
    public Double b2;
    public final ttr c;
    public final ytw<Double> c0;
    public final ytw<ob30> c1;
    public CashoutRequest c2;
    public Long d;
    public final ytw<Boolean> d0;
    public final ytw<Boolean> d1;
    public final q8i0 d2;
    public boolean e;
    public final ytw<Boolean> e0;
    public final ytw<Boolean> e1;
    public final ttr e2;
    public boolean f;
    public final ytw<Double> f0;
    public final ytw<Boolean> f1;
    public final q8i0 f2;
    public final SnapshotStateList<ps6> g0;
    public ArrayList<GiftItem> g1;
    public z66 g2;
    public final LinkedHashSet h0;
    public chb h1;
    public boolean h2;
    public GameDetails i;
    public final ytw<Boolean> i0;
    public jvd0 i1;
    public int i2;
    public boolean j0;
    public final ytw<Boolean> j1;
    public int j2;
    public boolean k0;
    public final ytw<Boolean> k1;
    public HeaderPayload k2;
    public boolean l0;
    public final ytw<Boolean> l1;
    public long l2;
    public final ArrayList m0;
    public final ytw<Boolean> m1;
    public final int m2;
    public boolean n0;
    public final osw n1;
    public int n2;
    public final j1b o0;
    public String o1;
    public boolean o2;
    public boolean p0;
    public int p1;
    public boolean p2;
    public boolean q0;
    public mke q1;
    public int q2;
    public boolean r0;
    public long r1;
    public int r2;
    public boolean s0;
    public jvd0 s1;
    public double s2;
    public boolean t0;
    public boolean t1;
    public RainDetailInfoResponse t2;
    public boolean u0;
    public final ttr u1;
    public int u2;
    public final q8i0 v;
    public boolean v0;
    public final ttr v1;
    public final mpe0 v2;
    public boolean w;
    public String w0;
    public ab8 w1;
    public long w2;
    public MultiplierResponse x0;
    public RainTopicResponse x1;
    public final int[] x2;
    public String y;
    public String y0;
    public boolean y1;
    public gvi z;
    public long z0;
    public double z1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes7.dex */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("NONE", 0);
            a = aVar;
            a aVar2 = new a("CHAT", 1);
            b = aVar2;
            a aVar3 = new a("BET_HISTORY", 2);
            c = aVar3;
            a aVar4 = new a("PROVABLY_FAIR_SETTINGS", 3);
            d = aVar4;
            e = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.crash.CrashFragment$showRainActiveToast$1", f = "CrashFragment.kt", l = {7763, 7767}, m = "invokeSuspend", v = 1)
    public static final class a0 extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(String str, String str2, v1b<? super a0> v1bVar) {
            super(1, v1bVar);
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return fgb.this.new a0(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((a0) create(v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            if (defpackage.hkd.b(4000, r7) == r0) goto L15;
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
                fgb r2 = defpackage.fgb.this
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r3) goto L12
                defpackage.uj50.b(r8)
                goto L4b
            L12:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L19:
                defpackage.uj50.b(r8)
                goto L2b
            L1d:
                defpackage.uj50.b(r8)
                r7.a = r4
                r4 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r8 = defpackage.hkd.b(r4, r7)
                if (r8 != r0) goto L2b
                goto L4a
            L2b:
                ytw<ob30> r8 = r2.c1
                ob30$c r1 = new ob30$c
                rv30$a r4 = new rv30$a
                java.lang.String r5 = r7.c
                java.lang.String r6 = r7.d
                r4.<init>(r5, r6)
                r1.<init>(r4)
                x5a0 r8 = (defpackage.x5a0) r8
                r8.setValue(r1)
                r7.a = r3
                r3 = 4000(0xfa0, double:1.9763E-320)
                java.lang.Object r7 = defpackage.hkd.b(r3, r7)
                if (r7 != r0) goto L4b
            L4a:
                return r0
            L4b:
                r2.s1()
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: fgb.a0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a1 implements Function0<Fragment> {
        public a1() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a2 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a2(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

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
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a aVar = a.a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a aVar2 = a.a;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a aVar3 = a.a;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[StatusChat.values().length];
            try {
                iArr3[StatusChat.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[StatusChat.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            b = iArr3;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b0 extends qlr implements Function0<v8i0> {
        public b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return fgb.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b1 implements Function0<vt2> {
        public final /* synthetic */ a1 b;

        public b1(a1 a1Var) {
            this.b = a1Var;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [j8i0, vt2] */
        @Override // kotlin.jvm.functions.Function0
        public final vt2 invoke() {
            v8i0 viewModelStore = fgb.this.getViewModelStore();
            fgb fgbVar = fgb.this;
            cyb defaultViewModelCreationExtras = fgbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(vt2.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(fgbVar), null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b2 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b2(ttr ttrVar) {
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
    @c0d(c = "com.sportygames.crash.CrashFragment$callFbgApi$1", f = "CrashFragment.kt", l = {7858}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return fgb.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            long j;
            y5b y5bVar = y5b.a;
            int i = this.a;
            fgb fgbVar = fgb.this;
            if (i == 0) {
                uj50.b(obj);
                if (fgbVar.O0) {
                    j = 0;
                } else {
                    t530 t530VarF1 = fgbVar.f1();
                    t530VarF1.getClass();
                    ej5.c(o8i0.d(t530VarF1), null, null, new y530(t530VarF1, null), 3);
                    j = 2000;
                }
                this.a = 1;
                if (hkd.b(j, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            fgbVar.f1().x1();
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c0 extends qlr implements Function0<cyb> {
        public c0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return fgb.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c1 implements Function0<Fragment> {
        public c1() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c2 extends qlr implements Function0<Fragment> {
        public c2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class d extends ViewOutlineProvider {
        public final /* synthetic */ float a;

        public d(float f) {
            this.a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            view.getClass();
            outline.getClass();
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.a);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class d0 extends qlr implements Function0<r8i0.c> {
        public d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return fgb.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class d1 implements Function0<xpf0> {
        public final /* synthetic */ c1 b;

        public d1(c1 c1Var) {
            this.b = c1Var;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [j8i0, xpf0] */
        @Override // kotlin.jvm.functions.Function0
        public final xpf0 invoke() {
            v8i0 viewModelStore = fgb.this.getViewModelStore();
            fgb fgbVar = fgb.this;
            cyb defaultViewModelCreationExtras = fgbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(xpf0.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(fgbVar), null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class d2 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d2(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? fgb.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.crash.CrashFragment$enqueueOverlayToast$1", f = "CrashFragment.kt", l = {832, 834}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ c9p b;
        public final /* synthetic */ Function1<v1b<? super Unit>, Object> c;
        public final /* synthetic */ fgb d;
        public final /* synthetic */ ToastType e;

        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[ToastType.values().length];
                try {
                    iArr[ToastType.RAIN_UPCOMING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ToastType.GIFT_FBG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(c9p c9pVar, Function1<? super v1b<? super Unit>, ? extends Object> function1, fgb fgbVar, ToastType toastType, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.b = c9pVar;
            this.c = function1;
            this.d = fgbVar;
            this.e = toastType;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        
            if (r8.invoke(r7) == r0) goto L22;
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
                r2 = 0
                com.sportygames.crash.models.ToastType r3 = r7.e
                r4 = 2
                r5 = 1
                fgb r6 = r7.d
                if (r1 == 0) goto L24
                if (r1 == r5) goto L20
                if (r1 != r4) goto L19
                defpackage.uj50.b(r8)     // Catch: java.lang.Throwable -> L15 java.util.concurrent.CancellationException -> L17
                goto L3f
            L15:
                r7 = move-exception
                goto L6a
            L17:
                r7 = move-exception
                goto L48
            L19:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L20:
                defpackage.uj50.b(r8)
                goto L34
            L24:
                defpackage.uj50.b(r8)
                c9p r8 = r7.b
                if (r8 == 0) goto L34
                r7.a = r5
                java.lang.Object r8 = r8.join(r7)
                if (r8 != r0) goto L34
                goto L3e
            L34:
                kotlin.jvm.functions.Function1<v1b<? super kotlin.Unit>, java.lang.Object> r8 = r7.c     // Catch: java.lang.Throwable -> L15 java.util.concurrent.CancellationException -> L17
                r7.a = r4     // Catch: java.lang.Throwable -> L15 java.util.concurrent.CancellationException -> L17
                java.lang.Object r7 = r8.invoke(r7)     // Catch: java.lang.Throwable -> L15 java.util.concurrent.CancellationException -> L17
                if (r7 != r0) goto L3f
            L3e:
                return r0
            L3f:
                com.sportygames.crash.models.ToastType r7 = com.sportygames.crash.models.ToastType.GIFT_FBG
                if (r3 != r7) goto L45
                r6.t1 = r2
            L45:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            L48:
                r6.s1()     // Catch: java.lang.Throwable -> L15
                int[] r8 = fgb.e.a.a     // Catch: java.lang.Throwable -> L15
                int r0 = r3.ordinal()     // Catch: java.lang.Throwable -> L15
                r8 = r8[r0]     // Catch: java.lang.Throwable -> L15
                if (r8 == r5) goto L60
                if (r8 == r4) goto L58
                goto L69
            L58:
                ssw<java.lang.Boolean> r8 = defpackage.jbh.b     // Catch: java.lang.Throwable -> L15
                java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L15
                r8.j(r0)     // Catch: java.lang.Throwable -> L15
                goto L69
            L60:
                ytw<java.lang.Boolean> r8 = r6.b1     // Catch: java.lang.Throwable -> L15
                java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L15
                x5a0 r8 = (defpackage.x5a0) r8     // Catch: java.lang.Throwable -> L15
                r8.setValue(r0)     // Catch: java.lang.Throwable -> L15
            L69:
                throw r7     // Catch: java.lang.Throwable -> L15
            L6a:
                com.sportygames.crash.models.ToastType r8 = com.sportygames.crash.models.ToastType.GIFT_FBG
                if (r3 != r8) goto L70
                r6.t1 = r2
            L70:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: fgb.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class e0 extends qlr implements Function0<v8i0> {
        public e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return fgb.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class e1 implements Function0<Fragment> {
        public e1() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class e2 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ c2 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e2(c2 c2Var) {
            super(0);
            this.a = c2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.crash.CrashFragment$handleClaimRainSuccess$1", f = "CrashFragment.kt", l = {7868, 7881}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ ClaimRainResponse c;
        public final /* synthetic */ fgb d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, ClaimRainResponse claimRainResponse, fgb fgbVar, v1b<? super f> v1bVar) {
            super(1, v1bVar);
            this.b = str;
            this.c = claimRainResponse;
            this.d = fgbVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new f(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((f) create(v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0076, code lost:
        
            if (defpackage.hkd.b(3000, r21) == r1) goto L15;
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
                fgb r3 = r0.d
                com.sportygames.chat.remote.models.ClaimRainResponse r4 = r0.c
                r5 = 2
                r6 = 1
                r7 = 3000(0xbb8, double:1.482E-320)
                r9 = 0
                if (r2 == 0) goto L24
                if (r2 == r6) goto L20
                if (r2 != r5) goto L19
                defpackage.uj50.b(r22)
                goto L79
            L19:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r0)
                r0 = 0
                return r0
            L20:
                defpackage.uj50.b(r22)
                goto L32
            L24:
                defpackage.uj50.b(r22)
                r0.a = r6
                r10 = 200(0xc8, double:9.9E-322)
                java.lang.Object r2 = defpackage.hkd.b(r10, r0)
                if (r2 != r1) goto L32
                goto L78
            L32:
                ssw<com.sportygames.commons.models.RainToastData> r2 = defpackage.qv30.b
                com.sportygames.commons.models.RainToastData r10 = new com.sportygames.commons.models.RainToastData
                java.lang.Integer r11 = new java.lang.Integer
                r11.<init>(r9)
                tv30[] r6 = defpackage.tv30.a
                java.lang.Long r15 = new java.lang.Long
                r15.<init>(r7)
                java.lang.Integer r6 = new java.lang.Integer
                r6.<init>(r9)
                com.sportygames.chat.remote.models.ClaimLimit r17 = r4.getClaimLimit()
                r19 = 128(0x80, float:1.8E-43)
                r20 = 0
                java.lang.String r12 = "claim_success"
                java.lang.String r13 = r0.b
                java.lang.String r14 = ""
                r18 = 0
                r16 = r6
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                r2.j(r10)
                ytw<ob30> r2 = r3.c1
                ob30$c r6 = new ob30$c
                rv30$b r10 = new rv30$b
                r10.<init>(r13)
                r6.<init>(r10)
                x5a0 r2 = (defpackage.x5a0) r2
                r2.setValue(r6)
                r0.a = r5
                java.lang.Object r0 = defpackage.hkd.b(r7, r0)
                if (r0 != r1) goto L79
            L78:
                return r1
            L79:
                r3.s1()
                ssw<com.sportygames.commons.models.RainToastData> r0 = defpackage.qv30.b
                com.sportygames.commons.models.RainToastData r10 = new com.sportygames.commons.models.RainToastData
                java.lang.Integer r11 = new java.lang.Integer
                r11.<init>(r9)
                tv30[] r1 = defpackage.tv30.a
                java.lang.Long r15 = new java.lang.Long
                r15.<init>(r7)
                java.lang.Integer r1 = new java.lang.Integer
                r2 = 8
                r1.<init>(r2)
                com.sportygames.chat.remote.models.ClaimLimit r17 = r4.getClaimLimit()
                r19 = 128(0x80, float:1.8E-43)
                r20 = 0
                java.lang.String r12 = "claim_success"
                java.lang.String r13 = ""
                java.lang.String r14 = ""
                r18 = 0
                r16 = r1
                r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                r0.j(r10)
                kotlin.Unit r0 = kotlin.Unit.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: fgb.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class f0 extends qlr implements Function0<cyb> {
        public f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return fgb.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class f1 implements Function0<t290> {
        public final /* synthetic */ u0 b;

        public f1(u0 u0Var) {
            this.b = u0Var;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [j8i0, t290] */
        @Override // kotlin.jvm.functions.Function0
        public final t290 invoke() {
            v8i0 viewModelStore = fgb.this.getViewModelStore();
            fgb fgbVar = fgb.this;
            cyb defaultViewModelCreationExtras = fgbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(t290.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(fgbVar), null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class f2 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f2(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class g extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((fgb) this.receiver).T2();
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class g0 extends qlr implements Function0<r8i0.c> {
        public g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return fgb.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class g1 implements Function0<dug0> {
        public final /* synthetic */ e1 b;

        public g1(e1 e1Var) {
            this.b = e1Var;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [dug0, j8i0] */
        @Override // kotlin.jvm.functions.Function0
        public final dug0 invoke() {
            v8i0 viewModelStore = fgb.this.getViewModelStore();
            fgb fgbVar = fgb.this;
            cyb defaultViewModelCreationExtras = fgbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(dug0.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(fgbVar), null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class g2 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g2(ttr ttrVar) {
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
    public static final class h implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ ytw b;

        public h(View view, ytw ytwVar) {
            this.a = view;
            this.b = ytwVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((x5a0) this.b).setValue(Integer.valueOf(this.a.getHeight()));
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class h0 implements Function0<l1z> {
        public h0() {
        }

        /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, l1z] */
        /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, l1z] */
        @Override // kotlin.jvm.functions.Function0
        public final l1z invoke() {
            bb bbVar = fgb.this;
            return bbVar instanceof rrp ? ((rrp) bbVar).j().a(jq40.a(l1z.class), null, null) : sjj.b().c.d.a(jq40.a(l1z.class), null, null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class h1 implements Function0<Fragment> {
        public h1() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class h2 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h2(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? fgb.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.crash.CrashFragment$onViewCreated$6$1$1$1", f = "CrashFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class i extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public i(v1b<? super i> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return fgb.this.new i(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((i) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            fgb fgbVar = fgb.this;
            if (!((Boolean) ((x5a0) fgbVar.j1).getValue()).booleanValue()) {
                fgbVar.p2();
            } else if (fgbVar.p1 != 1 && Intrinsics.g(((x5a0) fgbVar.c1().v).getValue(), "sporty-jet")) {
                gvi gviVar = fgbVar.z;
                if (gviVar != null) {
                    gviVar.B.setVisibility(0);
                }
                gvi gviVar2 = fgbVar.z;
                if (gviVar2 != null) {
                    gviVar2.b0.setVisibility(8);
                }
                gvi gviVar3 = fgbVar.z;
                if (gviVar3 != null) {
                    gviVar3.L.setVisibility(8);
                }
                gvi gviVar4 = fgbVar.z;
                if (gviVar4 != null) {
                    gviVar4.k0.setVisibility(8);
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class i0 implements Function0<h5h> {
        public i0() {
        }

        /* JADX WARN: Type inference failed for: r3v5, types: [h5h, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v8, types: [h5h, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final h5h invoke() {
            bb bbVar = fgb.this;
            return bbVar instanceof rrp ? ((rrp) bbVar).j().a(jq40.a(h5h.class), null, null) : sjj.b().c.d.a(jq40.a(h5h.class), null, null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class i1 implements Function0<hh7> {
        public final /* synthetic */ h1 b;

        public i1(h1 h1Var) {
            this.b = h1Var;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [hh7, j8i0] */
        @Override // kotlin.jvm.functions.Function0
        public final hh7 invoke() {
            v8i0 viewModelStore = fgb.this.getViewModelStore();
            fgb fgbVar = fgb.this;
            cyb defaultViewModelCreationExtras = fgbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(hh7.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(fgbVar), null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class i2 extends qlr implements Function0<Fragment> {
        public i2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class j extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            fgb fgbVar = (fgb) this.receiver;
            if (fgbVar.p1 == 1) {
                fgbVar.R0().Q1(13);
                fgbVar.R0().M1(!((BetContainerState) fgbVar.R0().a.getValue()).getExtraKey());
            } else if (fgbVar.R0().z1()) {
                fgbVar.Z0().f(13);
                fgbVar.Z0().e(!((Boolean) ((x5a0) fgbVar.Z0().c).getValue()).booleanValue());
            } else {
                fgbVar.S0().Q1(13);
                fgbVar.S0().M1(!((BetContainerState) fgbVar.S0().a.getValue()).getExtraKey());
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class j0 implements Function0<b5> {
        public j0() {
        }

        /* JADX WARN: Type inference failed for: r3v5, types: [b5, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v8, types: [b5, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final b5 invoke() {
            bb bbVar = fgb.this;
            return bbVar instanceof rrp ? ((rrp) bbVar).j().a(jq40.a(b5.class), null, null) : sjj.b().c.d.a(jq40.a(b5.class), null, null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class j1 implements Function0<Fragment> {
        public j1() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class j2 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ i2 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j2(i2 i2Var) {
            super(0);
            this.a = i2Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class k extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            fgb fgbVar = (fgb) this.receiver;
            if (fgbVar.p1 == 1) {
                fgbVar.R0().Q1(12);
                fgbVar.R0().M1(!((BetContainerState) fgbVar.R0().a.getValue()).getExtraKey());
            } else if (fgbVar.R0().z1()) {
                fgbVar.Z0().f(12);
                fgbVar.Z0().e(!((Boolean) ((x5a0) fgbVar.Z0().c).getValue()).booleanValue());
            } else {
                fgbVar.S0().Q1(12);
                fgbVar.S0().M1(!((BetContainerState) fgbVar.S0().a.getValue()).getExtraKey());
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class k0 implements Function0<t530> {
        public final /* synthetic */ r1 b;

        public k0(r1 r1Var) {
            this.b = r1Var;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [j8i0, t530] */
        @Override // kotlin.jvm.functions.Function0
        public final t530 invoke() {
            v8i0 viewModelStore = fgb.this.getViewModelStore();
            fgb fgbVar = fgb.this;
            cyb defaultViewModelCreationExtras = fgbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(t530.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(fgbVar), null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class k1 implements Function0<i96> {
        public final /* synthetic */ j1 b;

        public k1(j1 j1Var) {
            this.b = j1Var;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [i96, j8i0] */
        @Override // kotlin.jvm.functions.Function0
        public final i96 invoke() {
            v8i0 viewModelStore = fgb.this.getViewModelStore();
            fgb fgbVar = fgb.this;
            cyb defaultViewModelCreationExtras = fgbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(i96.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(fgbVar), null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class k2 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k2(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class l extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            fgb fgbVar = (fgb) this.receiver;
            fgbVar.p2();
            if (fgbVar.p1 == 1) {
                fgbVar.R0().Q1(14);
                fgbVar.R0().M1(!((BetContainerState) fgbVar.R0().a.getValue()).getExtraKey());
                fgbVar.R0().R1(false);
            } else if (fgbVar.R0().z1()) {
                fgbVar.Z0().f(14);
                fgbVar.Z0().e(!((Boolean) ((x5a0) fgbVar.Z0().c).getValue()).booleanValue());
                fgbVar.Z0().g(false);
            } else {
                fgbVar.S0().Q1(14);
                fgbVar.S0().M1(!((BetContainerState) fgbVar.S0().a.getValue()).getExtraKey());
                fgbVar.S0().R1(false);
            }
            ((x5a0) fgbVar.j1).setValue(Boolean.FALSE);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class l0 implements Function0<Fragment> {
        public l0() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class l1 implements Function0<Fragment> {
        public l1() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class l2 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l2(ttr ttrVar) {
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
    public static final /* synthetic */ class m extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            fgb fgbVar = (fgb) this.receiver;
            fgbVar.n2();
            gvi gviVar = fgbVar.z;
            if (gviVar != null) {
                gviVar.H.n(8388613);
            }
            GameDetails gameDetails = fgbVar.i;
            wz.a("MenuClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class m0 implements Function0<ul2> {
        public final /* synthetic */ eae0 b;
        public final /* synthetic */ l0 c;

        public m0(eae0 eae0Var, l0 l0Var) {
            this.b = eae0Var;
            this.c = l0Var;
        }

        /* JADX WARN: Type inference failed for: r7v1, types: [j8i0, ul2] */
        @Override // kotlin.jvm.functions.Function0
        public final ul2 invoke() {
            v8i0 viewModelStore = fgb.this.getViewModelStore();
            fgb fgbVar = fgb.this;
            cyb defaultViewModelCreationExtras = fgbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(ul2.class), viewModelStore, defaultViewModelCreationExtras, this.b, e80.a(fgbVar), null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class m1 implements Function0<loa0> {
        public final /* synthetic */ l1 b;

        public m1(l1 l1Var) {
            this.b = l1Var;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [j8i0, loa0] */
        @Override // kotlin.jvm.functions.Function0
        public final loa0 invoke() {
            v8i0 viewModelStore = fgb.this.getViewModelStore();
            fgb fgbVar = fgb.this;
            cyb defaultViewModelCreationExtras = fgbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(loa0.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(fgbVar), null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.crash.CrashFragment$onViewCreated$9$1$14$1", f = "CrashFragment.kt", l = {1233}, m = "invokeSuspend", v = 1)
    public static final class n extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public n(v1b<? super n> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return fgb.this.new n(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((n) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(900L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ((x5a0) fgb.this.Y0().a).setValue(Boolean.FALSE);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class n0 implements Function0<Fragment> {
        public n0() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class n1 implements Function0<Fragment> {
        public n1() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class n2 extends CountDownTimer {
        public final /* synthetic */ fgb a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n2(cq40 cq40Var, fgb fgbVar) {
            super(cq40Var.a, 1000L);
            this.a = fgbVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            fgb fgbVar = this.a;
            RainTopicResponse rainTopicResponse = fgbVar.x1;
            if (rainTopicResponse != null) {
                String messageType = rainTopicResponse.getMessageType();
                if (messageType == null) {
                    messageType = "";
                }
                Locale locale = Locale.ROOT;
                String lowerCase = messageType.toLowerCase(locale);
                lowerCase.getClass();
                tv30[] tv30VarArr = tv30.a;
                if (lowerCase.equals("upcoming")) {
                    return;
                }
                RainTopicResponse rainTopicResponse2 = fgbVar.x1;
                String messageType2 = rainTopicResponse2 != null ? rainTopicResponse2.getMessageType() : null;
                if (messageType2 == null) {
                    messageType2 = "";
                }
                String lowerCase2 = messageType2.toLowerCase(locale);
                lowerCase2.getClass();
                if (lowerCase2.equals("stopped")) {
                    return;
                }
                fgbVar.l3("", false);
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            tv30[] tv30VarArr = tv30.a;
            this.a.l3("active", true);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class o extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            iny onBackPressedDispatcher;
            androidx.fragment.app.e activity = ((fgb) this.receiver).getActivity();
            if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                onBackPressedDispatcher.d();
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class o0 implements Function0<ul2> {
        public final /* synthetic */ eae0 b;
        public final /* synthetic */ n0 c;

        public o0(eae0 eae0Var, n0 n0Var) {
            this.b = eae0Var;
            this.c = n0Var;
        }

        /* JADX WARN: Type inference failed for: r7v1, types: [j8i0, ul2] */
        @Override // kotlin.jvm.functions.Function0
        public final ul2 invoke() {
            v8i0 viewModelStore = fgb.this.getViewModelStore();
            fgb fgbVar = fgb.this;
            cyb defaultViewModelCreationExtras = fgbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(ul2.class), viewModelStore, defaultViewModelCreationExtras, this.b, e80.a(fgbVar), null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class o1 implements Function0<ln1> {
        public final /* synthetic */ n1 b;

        public o1(n1 n1Var) {
            this.b = n1Var;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [j8i0, ln1] */
        @Override // kotlin.jvm.functions.Function0
        public final ln1 invoke() {
            v8i0 viewModelStore = fgb.this.getViewModelStore();
            fgb fgbVar = fgb.this;
            cyb defaultViewModelCreationExtras = fgbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(ln1.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(fgbVar), null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.crash.CrashFragment$onViewCreated$9$1$25$1", f = "CrashFragment.kt", l = {1358}, m = "invokeSuspend", v = 1)
    public static final class p extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public p(v1b<? super p> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return fgb.this.new p(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((p) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(900L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ((x5a0) fgb.this.Y0().a).setValue(Boolean.FALSE);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class p0 implements Function0<Fragment> {
        public p0() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class p1 implements Function0<Fragment> {
        public p1() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class q extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((fgb) this.receiver).U1();
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class q0 implements Function0<goj> {
        public final /* synthetic */ p0 b;
        public final /* synthetic */ y9b c;

        public q0(p0 p0Var, y9b y9bVar) {
            this.b = p0Var;
            this.c = y9bVar;
        }

        /* JADX WARN: Type inference failed for: r7v1, types: [goj, j8i0] */
        @Override // kotlin.jvm.functions.Function0
        public final goj invoke() {
            v8i0 viewModelStore = fgb.this.getViewModelStore();
            fgb fgbVar = fgb.this;
            cyb defaultViewModelCreationExtras = fgbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(goj.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(fgbVar), this.c);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class q1 implements Function0<m28> {
        public final /* synthetic */ p1 b;

        public q1(p1 p1Var) {
            this.b = p1Var;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [j8i0, m28] */
        @Override // kotlin.jvm.functions.Function0
        public final m28 invoke() {
            v8i0 viewModelStore = fgb.this.getViewModelStore();
            fgb fgbVar = fgb.this;
            cyb defaultViewModelCreationExtras = fgbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(m28.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(fgbVar), null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.crash.CrashFragment$onViewCreated$9$1$30$1", f = "CrashFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class r extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public r(v1b<? super r> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return fgb.this.new r(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((r) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            androidx.fragment.app.e activity;
            FragmentManager supportFragmentManager;
            svg svgVar;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            fgb fgbVar = fgb.this;
            Context context = fgbVar.getContext();
            if (context != null && (activity = fgbVar.getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && !(supportFragmentManager.G(R.id.flContent) instanceof com.sportygames.commons.components.a) && (((svgVar = fgbVar.N0) == null || !svgVar.isVisible()) && !supportFragmentManager.V())) {
                int i = 0;
                com.sportygames.commons.components.a aVarA = com.sportygames.commons.components.a.C0437a.a("Sporty Hero", "one tap bet", (String) ((x5a0) fgbVar.c1().I).getValue(), "", (String) ((x5a0) fgbVar.c1().R).getValue(), (String) ((x5a0) fgbVar.c1().S).getValue(), new seb(fgbVar, i), new teb(i), context.getColor(R.color.redblack_confirm_dialog_left_button), context.getColor(R.color.redblack_confirm_dialog_right_button), 12288);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.f(R.id.flContent, aVarA, null);
                aVar.c("CONFIRM_DIALOG_FRAGMENT");
                aVar.d();
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class r0 implements Function0<Fragment> {
        public r0() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class r1 implements Function0<Fragment> {
        public r1() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class s extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((fgb) this.receiver).getClass();
            SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class s0 implements Function0<e5h> {
        public final /* synthetic */ r0 b;

        public s0(r0 r0Var) {
            this.b = r0Var;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [e5h, j8i0] */
        @Override // kotlin.jvm.functions.Function0
        public final e5h invoke() {
            v8i0 viewModelStore = fgb.this.getViewModelStore();
            fgb fgbVar = fgb.this;
            cyb defaultViewModelCreationExtras = fgbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(e5h.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(fgbVar), null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class s1 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s1(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? fgb.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class t extends saj implements Function1<Integer, String> {
        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Integer num) {
            return ((fgb) this.receiver).m1(num.intValue());
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class t0 implements Function0<Fragment> {
        public t0() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class t1 extends qlr implements Function0<Fragment> {
        public t1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class u extends saj implements Function1<Integer, String> {
        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Integer num) {
            return ((fgb) this.receiver).m1(num.intValue());
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class u0 implements Function0<Fragment> {
        public u0() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class u1 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ t1 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u1(t1 t1Var) {
            super(0);
            this.a = t1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class v implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public v(Function1 function1) {
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
    public static final class v0 implements Function0<aig0> {
        public final /* synthetic */ t0 b;

        public v0(t0 t0Var) {
            this.b = t0Var;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [aig0, j8i0] */
        @Override // kotlin.jvm.functions.Function0
        public final aig0 invoke() {
            v8i0 viewModelStore = fgb.this.getViewModelStore();
            fgb fgbVar = fgb.this;
            cyb defaultViewModelCreationExtras = fgbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(aig0.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(fgbVar), null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class v1 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v1(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.crash.CrashFragment$setCashoutData$3", f = "CrashFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class w extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ fgb b;
        public final /* synthetic */ TopBets c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(boolean z, fgb fgbVar, TopBets topBets, v1b<? super w> v1bVar) {
            super(2, v1bVar);
            this.a = z;
            this.b = fgbVar;
            this.c = topBets;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new w(this.a, this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((w) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (this.a) {
                fgb fgbVar = this.b;
                dhb dhbVar = new dhb(fgbVar, this.c, null);
                nas nasVarA = ebs.a(fgbVar.getLifecycle());
                pfd pfdVar = fse.a;
                ej5.c(nasVarA, gku.a, null, new igb(fgbVar, dhbVar, null), 2);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class w0 implements Function0<Fragment> {
        public w0() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class w1 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w1(ttr ttrVar) {
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
    @c0d(c = "com.sportygames.crash.CrashFragment$setDefaultPrefOnboarding$1$1", f = "CrashFragment.kt", l = {8393}, m = "invokeSuspend", v = 1)
    public static final class x extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(int i, v1b<? super x> v1bVar) {
            super(2, v1bVar);
            this.c = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return fgb.this.new x(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((x) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(100L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            Function1<? super Integer, Unit> function1 = fgb.this.K1;
            if (function1 != null) {
                function1.invoke(new Integer(this.c));
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class x0 implements Function0<lei0> {
        public final /* synthetic */ w0 b;

        public x0(w0 w0Var) {
            this.b = w0Var;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [j8i0, lei0] */
        @Override // kotlin.jvm.functions.Function0
        public final lei0 invoke() {
            v8i0 viewModelStore = fgb.this.getViewModelStore();
            fgb fgbVar = fgb.this;
            cyb defaultViewModelCreationExtras = fgbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(lei0.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(fgbVar), null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class x1 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x1(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? fgb.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class y0 implements Function0<Fragment> {
        public y0() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class y1 extends qlr implements Function0<Fragment> {
        public y1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgb.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.crash.CrashFragment$showCampaignToast$1", f = "CrashFragment.kt", l = {8287, 8292}, m = "invokeSuspend", v = 1)
    public static final class z extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public int a;

        public z(v1b<? super z> v1bVar) {
            super(1, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return fgb.this.new z(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((z) create(v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (defpackage.hkd.b(2200, r7) == r0) goto L17;
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
                fgb r4 = defpackage.fgb.this
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L19
                if (r1 != r2) goto L12
                defpackage.uj50.b(r8)
                goto L58
            L12:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L19:
                defpackage.uj50.b(r8)
                goto L2b
            L1d:
                defpackage.uj50.b(r8)
                r7.a = r3
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r8 = defpackage.hkd.b(r5, r7)
                if (r8 != r0) goto L2b
                goto L57
            L2b:
                ibs r8 = r4.getViewLifecycleOwner()
                s9s r8 = r8.getLifecycle()
                s9s$b r8 = r8.b()
                s9s$b r1 = s9s.b.e
                int r8 = r8.compareTo(r1)
                if (r8 < 0) goto L5b
                ytw<ob30> r8 = r4.c1
                ob30$a r1 = new ob30$a
                ypk$a r3 = ypk.a.a
                r1.<init>(r3)
                x5a0 r8 = (defpackage.x5a0) r8
                r8.setValue(r1)
                r7.a = r2
                r1 = 2200(0x898, double:1.087E-320)
                java.lang.Object r7 = defpackage.hkd.b(r1, r7)
                if (r7 != r0) goto L58
            L57:
                return r0
            L58:
                r4.s1()
            L5b:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: fgb.z.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class z0 implements Function0<lw30> {
        public final /* synthetic */ y0 b;

        public z0(y0 y0Var) {
            this.b = y0Var;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [j8i0, lw30] */
        @Override // kotlin.jvm.functions.Function0
        public final lw30 invoke() {
            v8i0 viewModelStore = fgb.this.getViewModelStore();
            fgb fgbVar = fgb.this;
            cyb defaultViewModelCreationExtras = fgbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(lw30.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(fgbVar), null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class z1 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ y1 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z1(y1 y1Var) {
            super(0);
            this.a = y1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public fgb() {
        a1s a1sVar = a1s.a;
        this.a = hwr.a(a1sVar, new h0());
        this.b = hwr.a(a1sVar, new i0());
        u0 u0Var = new u0();
        a1s a1sVar2 = a1s.c;
        this.c = hwr.a(a1sVar2, new f1(u0Var));
        ttr ttrVarA = hwr.a(a1sVar2, new e2(new c2()));
        this.v = new q8i0(jq40.a(defpackage.q.class), new f2(ttrVarA), new h2(ttrVarA), new g2(ttrVarA));
        this.y = "en";
        this.B = true;
        this.E = "unknown";
        this.F = "unknown";
        this.G = true;
        ttr ttrVarA2 = hwr.a(a1sVar2, new j2(new i2()));
        this.K = new q8i0(jq40.a(ypa0.class), new k2(ttrVarA2), new s1(ttrVarA2), new l2(ttrVarA2));
        this.L = hwr.a(a1sVar2, new m1(new l1()));
        this.M = hwr.a(a1sVar2, new o1(new n1()));
        this.N = hwr.a(a1sVar2, new q1(new p1()));
        this.O = hwr.a(a1sVar2, new k0(new r1()));
        this.P = hwr.a(a1sVar2, new m0(new eae0("first_bet_container"), new l0()));
        this.Q = hwr.a(a1sVar2, new o0(new eae0("second_bet_container"), new n0()));
        ttr ttrVarA3 = hwr.a(a1sVar2, new u1(new t1()));
        this.R = new q8i0(jq40.a(ip8.class), new v1(ttrVarA3), new x1(ttrVarA3), new w1(ttrVarA3));
        int i3 = 0;
        this.S = hwr.a(a1sVar2, new q0(new p0(), new y9b(this, i3)));
        this.T = hwr.a(a1sVar2, new s0(new r0()));
        this.U = hwr.a(a1sVar2, new v0(new t0()));
        this.V = hwr.a(a1sVar2, new x0(new w0()));
        this.Y = androidx.compose.runtime.i.a(0.0d);
        this.Z = androidx.compose.runtime.i.a(0.0d);
        this.b0 = androidx.compose.runtime.i.a(0.0d);
        this.c0 = androidx.compose.runtime.i.a(0.0d);
        Boolean bool = Boolean.FALSE;
        this.d0 = androidx.compose.runtime.m.b(bool);
        this.e0 = androidx.compose.runtime.m.b(bool);
        this.f0 = androidx.compose.runtime.i.a(0.0d);
        this.g0 = new SnapshotStateList<>();
        this.h0 = new LinkedHashSet();
        this.i0 = androidx.compose.runtime.m.b(bool);
        this.j0 = true;
        this.k0 = true;
        this.m0 = new ArrayList();
        pfd pfdVar = fse.a;
        this.o0 = w5b.a(gku.a);
        this.w0 = "";
        this.y0 = "";
        this.B0 = new ssw<>(0L);
        this.C0 = new ssw<>("");
        this.H0 = "";
        this.I0 = "";
        this.L0 = hwr.a(a1sVar2, new z0(new y0()));
        this.M0 = yju.a("br");
        this.V0 = "";
        this.X0 = "";
        ttr ttrVarA4 = hwr.a(a1sVar2, new z1(new y1()));
        this.Y0 = new q8i0(jq40.a(fq5.class), new a2(ttrVarA4), new d2(ttrVarA4), new b2(ttrVarA4));
        this.Z0 = androidx.compose.runtime.m.b(bool);
        this.a1 = androidx.compose.runtime.m.b(bool);
        this.b1 = androidx.compose.runtime.m.b(bool);
        this.c1 = androidx.compose.runtime.m.b(null);
        this.d1 = androidx.compose.runtime.m.b(bool);
        this.e1 = androidx.compose.runtime.m.b(bool);
        this.f1 = androidx.compose.runtime.m.b(bool);
        this.g1 = new ArrayList<>();
        this.j1 = androidx.compose.runtime.m.b(bool);
        this.k1 = androidx.compose.runtime.m.b(bool);
        this.l1 = androidx.compose.runtime.m.b(bool);
        this.m1 = androidx.compose.runtime.m.b(bool);
        this.n1 = androidx.compose.runtime.k.a(1);
        this.o1 = "";
        this.u1 = hwr.a(a1sVar2, new b1(new a1()));
        this.v1 = hwr.a(a1sVar, new j0());
        this.A1 = "";
        this.E1 = androidx.compose.runtime.m.b(bool);
        this.F1 = androidx.compose.runtime.m.b(bool);
        this.G1 = hwr.a(a1sVar2, new d1(new c1()));
        this.H1 = hwr.a(a1sVar2, new g1(new e1()));
        this.I1 = hwr.a(a1sVar2, new i1(new h1()));
        this.U1 = a.a;
        this.d2 = new q8i0(jq40.a(fuj.class), new b0(), new d0(), new c0());
        this.e2 = hwr.a(a1sVar2, new k1(new j1()));
        this.f2 = new q8i0(jq40.a(db6.class), new e0(), new g0(), new f0());
        this.m2 = 500;
        this.v2 = hwr.b(new Function0() { // from class: eab
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new fv30(new sv30(new fgb.u(1, this.a, fgb.class, "getStringWithContext", "getStringWithContext(I)Ljava/lang/String;", 0)));
            }
        });
        hwr.b(new mab(this, i3));
        this.x2 = new int[]{0, 1};
    }

    public static void C0(final BlurView blurView, final float f3) {
        if (blurView != null) {
            blurView.post(new Runnable() { // from class: mdb
                @Override // java.lang.Runnable
                public final void run() {
                    fgb.d dVar = new fgb.d(f3);
                    BlurView blurView2 = blurView;
                    blurView2.setOutlineProvider(dVar);
                    blurView2.setClipToOutline(true);
                }
            });
        }
    }

    public static final void I2(ComposeView composeView, int i3, boolean z2, int i4) {
        ViewGroup.LayoutParams layoutParams = composeView.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        if (!z2) {
            i4 = 0;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = i3 + i4;
        composeView.setLayoutParams(layoutParams2);
        composeView.requestLayout();
    }

    public static void J2(View view, String str) {
        Context context;
        if (Intrinsics.g(str, "sporty-hero") && (context = view.getContext()) != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            float f3 = displayMetrics.heightPixels;
            float f4 = displayMetrics.widthPixels;
            if (f3 == 0.0f || f4 == 0.0f) {
                return;
            }
            Float fValueOf = Float.valueOf(0.024f);
            float f5 = f3 / f4;
            Float fValueOf2 = Float.valueOf(0.025f);
            Map mapA = dgb.a("prev_multiplier_height", fValueOf2);
            if (f5 >= 2.1f || f5 >= 2.0f) {
                mapA = dgb.a("prev_multiplier_height", fValueOf);
            } else if (f5 >= 1.5f) {
                mapA = dgb.a("prev_multiplier_height", fValueOf2);
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            Float f6 = (Float) mapA.get("prev_multiplier_height");
            layoutParams2.S = f6 != null ? f6.floatValue() : 0.045f;
            view.setLayoutParams(layoutParams2);
            view.requestLayout();
        }
    }

    public static void K0(fgb fgbVar, String str, long j3, long j4, int i3, int i4) {
        long j5 = (i4 & 8) != 0 ? 3000L : 1800L;
        fgbVar.getClass();
        fgbVar.L0(ToastType.MESSAGE, new jgb(fgbVar, str, j3, j4, false, j5, i3, null));
    }

    public static void a3(fgb fgbVar) {
        long jIntValue = ((Number) ((x5a0) fgbVar.c1().Q).getValue()).intValue();
        Long lValueOf = Long.valueOf(jIntValue);
        if (jIntValue <= 0) {
            lValueOf = null;
        }
        fgbVar.L0(ToastType.MESSAGE, new jgb(fgbVar, (String) ((x5a0) fgbVar.c1().H).getValue(), ((j58) ((x5a0) fgbVar.c1().K).getValue()).a, ((j58) ((x5a0) fgbVar.c1().L).getValue()).a, ((Boolean) ((x5a0) fgbVar.c1().P).getValue()).booleanValue(), lValueOf != null ? lValueOf.longValue() : 3000L, ((Number) ((x5a0) fgbVar.c1().M).getValue()).intValue(), null));
    }

    public static ArrayList k3(double d3, ul2 ul2Var) {
        return wag0.a(d3, egb.a((BetContainerState) ul2Var.a.getValue()) > 0);
    }

    public static final String r0(List<DetailResponse> list, String str, NumberFormat numberFormat, String str2) {
        Object next;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.g(((DetailResponse) next).getBetCategoryEnum(), str2));
        DetailResponse detailResponse = (DetailResponse) next;
        return oxc.a(str, " ", numberFormat.format(detailResponse != null ? detailResponse.getMaxPayoutAmount() : 0.0d));
    }

    public static void u1(fgb fgbVar, boolean z2, boolean z3) {
        int i3;
        boolean zBooleanValue;
        boolean zL;
        boolean zL2;
        View viewF;
        Context context;
        ytw<Boolean> ytwVar = fgbVar.m1;
        Context context2 = fgbVar.getContext();
        if (context2 != null) {
            String strV1 = fgbVar.v1();
            ArrayList<OnboardingItem> arrayListA = sny.a(context2, strV1);
            if (arrayListA.isEmpty()) {
                i3 = 0;
                zBooleanValue = false;
            } else {
                int size = arrayListA.size();
                i3 = 0;
                zBooleanValue = false;
                while (true) {
                    if (i3 >= size) {
                        i3 = 0;
                        break;
                    }
                    Boolean isView = arrayListA.get(i3).getIsView();
                    zBooleanValue = isView != null ? isView.booleanValue() : false;
                    if (!zBooleanValue) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            if (i3 == 0 && ((z2 || z3) && !Intrinsics.g(((x5a0) fgbVar.c1().v).getValue(), "sporty-hero") && (context = fgbVar.getContext()) != null)) {
                sny.c(context, fgbVar.J, 0, strV1);
            }
            try {
                gvi gviVar = fgbVar.z;
                zL = (gviVar == null || (viewF = gviVar.H.f(8388613)) == null) ? false : DrawerLayout.l(viewF);
            } catch (Exception unused) {
            }
            try {
                zL2 = fgbVar.l2();
            } catch (Exception unused2) {
                zL2 = false;
            }
            if (zBooleanValue) {
                return;
            }
            Intrinsics.g(((x5a0) fgbVar.c1().v).getValue(), "sporty-hero");
            if (i3 <= 0 || zL || zL2 || !fgbVar.A1()) {
                return;
            }
            Fragment fragmentG = fgbVar.getChildFragmentManager().G(R.id.onboarding_images);
            if ((fgbVar.e && fgbVar.f) || (!z2 && !z3)) {
                fgbVar.l0 = false;
                if (fragmentG != null) {
                    FragmentManager childFragmentManager = fgbVar.getChildFragmentManager();
                    childFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                    aVar.p(fragmentG);
                    aVar.d();
                }
                if (fgbVar.D1) {
                    ((x5a0) ytwVar).setValue(Boolean.TRUE);
                }
                Function0<Unit> function0 = fgbVar.J1;
                if (function0 != null) {
                    function0.invoke();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                Long l3 = fgbVar.d;
                if (l3 != null) {
                    long jLongValue = l3.longValue();
                    if (fgbVar.e || fgbVar.f || jCurrentTimeMillis - jLongValue > 3000) {
                        SharedPreferences.Editor editor = fgbVar.J;
                        Intrinsics.g(((x5a0) fgbVar.c1().v).getValue(), "sporty-hero");
                        sny.c(context2, editor, 1, fgbVar.v1());
                    }
                }
                fgbVar.d = null;
                fgbVar.e = false;
                fgbVar.f = false;
                return;
            }
            fgbVar.l0 = true;
            if (fgbVar.i != null && fragmentG == null) {
                Map<String, Float> mapF = kpu.f(new Pair("SJ_BET_PLACED", Float.valueOf(z2 ? 1.0f : 0.0f)), new Pair("SJ_BET1_PLACED", Float.valueOf(z3 ? 1.0f : 0.0f)));
                if (Intrinsics.g(((x5a0) fgbVar.c1().v).getValue(), "galaxy-go") || Intrinsics.g(((x5a0) fgbVar.c1().v).getValue(), "sporty-kick") || Intrinsics.g(((x5a0) fgbVar.c1().v).getValue(), "sporty-cars") || Intrinsics.g(((x5a0) fgbVar.c1().v).getValue(), "crazy-rider") || Intrinsics.g(((x5a0) fgbVar.c1().v).getValue(), "sporty-skills") || Intrinsics.g(((x5a0) fgbVar.c1().v).getValue(), "sporty-hero")) {
                    fgbVar.z2(i3, strV1);
                } else {
                    FragmentManager childFragmentManager2 = fgbVar.getChildFragmentManager();
                    androidx.fragment.app.a aVarA = oke.a(childFragmentManager2, childFragmentManager2);
                    String str = (String) ((x5a0) fgbVar.c1().z).getValue();
                    op5.a.getClass();
                    List<? extends File> list = op5.b;
                    str.getClass();
                    com.sportygames.commons.views.a aVar2 = new com.sportygames.commons.views.a();
                    aVar2.c = str;
                    aVar2.d = 1;
                    aVar2.w = list;
                    aVar2.z = mapF;
                    aVar2.A = false;
                    aVarA.f(R.id.onboarding_images, aVar2, null);
                    aVarA.d();
                }
            }
            fgbVar.r1();
            fgbVar.p2();
            gvi gviVar2 = fgbVar.z;
            if (gviVar2 != null) {
                gviVar2.X.setVisibility(0);
            }
            if (fgbVar.D1) {
                ((x5a0) ytwVar).setValue(Boolean.FALSE);
            }
            Function1<? super Integer, Unit> function1 = fgbVar.K1;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(i3));
            }
            if (fgbVar.d == null) {
                fgbVar.d = Long.valueOf(System.currentTimeMillis());
            }
        }
    }

    public static BigDecimal w0(double d3, double d4) {
        BigDecimal scale = BigDecimal.valueOf(d3 * d4).setScale(2, RoundingMode.HALF_UP);
        scale.getClass();
        return scale;
    }

    public static boolean w1(String str) {
        return kotlin.text.c.l(str, "sporty-jet", true) || kotlin.text.c.l(str, "galaxy-go", true) || kotlin.text.c.l(str, "sporty-kick", true) || kotlin.text.c.l(str, "sporty-skills", true) || kotlin.text.c.l(str, "crazy-rider", true) || kotlin.text.c.l(str, "sporty-hero", true);
    }

    public boolean A1() {
        return true;
    }

    public final void A2() {
        LobbyMetaInfo metaInfo;
        Long minimumCMSVersionSupported;
        try {
            long versionCode = SportyGamesManager.getInstance().getVersionCode();
            GameDetails gameDetails = this.i;
            if (versionCode < ((gameDetails == null || (metaInfo = gameDetails.getMetaInfo()) == null || (minimumCMSVersionSupported = metaInfo.getMinimumCMSVersionSupported()) == null) ? 0L : minimumCMSVersionSupported.longValue())) {
                this.y = "en";
            }
            ArrayList<String> arrayList = vlr.a.get(((x5a0) c1().v).getValue());
            if (arrayList == null || !arrayList.contains(SportyGamesManager.getInstance().getLanguageCode())) {
                return;
            }
            String languageCode = SportyGamesManager.getInstance().getLanguageCode();
            languageCode.getClass();
            this.y = languageCode;
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public final boolean B1() {
        String str = (String) ((x5a0) c1().v).getValue();
        return kotlin.text.c.l(str, "sporty-hero", true) || kotlin.text.c.l(str, "Sporty Hero", true) || kotlin.text.c.l(str, "sporty_hero", true) || kotlin.text.c.l(str, "sg_sporty_hero", true) || kotlin.text.c.l((String) ((x5a0) c1().z).getValue(), "sg_sporty_hero", true);
    }

    public abstract void B2(MultiplierResponse multiplierResponse);

    public void C1() {
    }

    public final void C2() {
        Context applicationContext;
        try {
            new brr();
            GameDetails gameDetails = this.i;
            if (gameDetails != null) {
                gameDetails.getDisplayName();
            }
            SharedPreferences sharedPreferences = this.H;
            if (sharedPreferences == null || sharedPreferences.getBoolean(((String[]) ((x5a0) c1().B).getValue())[2], false)) {
                return;
            }
            this.D1 = true;
            Context context = getContext();
            String string = (context == null || (applicationContext = context.getApplicationContext()) == null) ? null : applicationContext.getString(R.string.one_tap_choice_label);
            if (string != null) {
                String string2 = B1() ? getString(R.string.revamped_otb_dialog_msg_cms) : getString(R.string.otb_dialog_msg_cms);
                string2.getClass();
                ytw<String> ytwVar = c1().I;
                op5.a.getClass();
                ((x5a0) ytwVar).setValue(op5.b(string2, string, null));
                ytw<String> ytwVar2 = c1().R;
                String string3 = getString(R.string.yes_btn_cms);
                string3.getClass();
                String string4 = getString(R.string.yes_bet);
                string4.getClass();
                ((x5a0) ytwVar2).setValue(op5.b(string3, string4, null));
                ytw<String> ytwVar3 = c1().S;
                String string5 = getString(R.string.no_btn_cms);
                string5.getClass();
                String string6 = getString(R.string.no_bet);
                string6.getClass();
                ((x5a0) ytwVar3).setValue(op5.b(string5, string6, null));
                ((x5a0) c1().T).setValue(Boolean.FALSE);
                if (K2()) {
                    return;
                }
                ((x5a0) this.m1).setValue(Boolean.TRUE);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public final String D0(String str) {
        CharSequence charSequence = (CharSequence) ((x5a0) c1().v).getValue();
        if (StringsKt.U(charSequence)) {
            GameDetails gameDetails = this.i;
            String name = gameDetails != null ? gameDetails.getName() : null;
            if (name == null) {
                name = "";
            }
            charSequence = name;
        }
        CharSequence charSequence2 = charSequence;
        CharSequence charSequence3 = str;
        if (!StringsKt.U(charSequence2)) {
            charSequence3 = charSequence2;
        }
        return (String) charSequence3;
    }

    /* JADX WARN: Failed to calculate best type for var: r12v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v12 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v13 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v18 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v21 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v22 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v40 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v40 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v6 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v7 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v8 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v15 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v16 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v17 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v20 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v21 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v31 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v31 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r13v43 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v43 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v1 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v10 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v11 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v12 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v18 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
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
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
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
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v4 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v9 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v125 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v125 ??, new type: java.lang.Double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v126 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v126 ??, new type: java.lang.Double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v157 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v157 ??, new type: java.lang.Double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v52 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v52 ??, new type: com.sportygames.crash.remote.models.DetailResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v87 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v87 ??, new type: java.lang.Double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v0 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v1 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v10 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v11 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v12 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r27v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v2 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v27 ??, new type: java.lang.Double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v78 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v78 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v79 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v79 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v80 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v80 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v45 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v45 ??, new type: fsw
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v46 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v46 ??, new type: java.lang.Double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v62 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v62 ??, new type: fsw
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v63 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v63 ??, new type: java.lang.Double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v74 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v74 ??, new type: com.sportygames.crash.remote.models.DetailResponse
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v32 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v32 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v33 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v38 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v38 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v49 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v49 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v50 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v50 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v51 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v51 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v6 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v6 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v7 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r9v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v8 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v6 ??, new type: double
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public final void D1(java.lang.String r52) {
        /*
            Method dump skipped, instruction units count: 5242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgb.D1(java.lang.String):void");
    }

    public abstract void D2(Coefficients coefficients);

    public abstract void E0();

    public void E1(ul2 ul2Var, TopBets topBets, boolean z2) {
        ul2Var.getClass();
        topBets.getClass();
    }

    public abstract void E2(PreviousMultiplierResponse previousMultiplierResponse);

    public void F0() {
    }

    public void F1(ul2 ul2Var, TopBets topBets, boolean z2) {
        ul2Var.getClass();
        topBets.getClass();
    }

    public abstract void F2(boolean z2);

    public final void G0() {
        if (d1().A) {
            d1().d = new ssw<>();
            this.o2 = false;
            this.p2 = false;
            this.x1 = null;
            qv30.a.j(null);
            d1();
            msj msjVar = msj.a;
            if (msjVar.d()) {
                msjVar.a();
            }
            d1().z1();
        }
    }

    public void G1() {
    }

    public final void G2() {
        gvi gviVar;
        gvi gviVar2;
        this.R1 = true;
        if (Intrinsics.g(((x5a0) c1().v).getValue(), "sporty-jet") && y1() && (gviVar2 = this.z) != null) {
            gviVar2.V.setVisibility(0);
        }
        if (this.T1) {
            W2();
        }
        if (y1()) {
            if (this.l0 && (gviVar = this.z) != null) {
                gviVar.X.setVisibility(0);
            }
            String str = (String) ((x5a0) c1().v).getValue();
            if (this.G) {
                gvi gviVar3 = this.z;
                if (gviVar3 == null || gviVar3.X.getVisibility() != 0) {
                    gvi gviVar4 = this.z;
                    if (gviVar4 == null || gviVar4.s0.getVisibility() != 0) {
                        gvi gviVar5 = this.z;
                        if ((gviVar5 != null && gviVar5.r0.getVisibility() == 0) || ((BetContainerState) R0().a.getValue()).getCashoutInProgress() || ((BetContainerState) S0().a.getValue()).getCashoutInProgress() || ((BetContainerState) R0().a.getValue()).getBetPlaced() || ((BetContainerState) S0().a.getValue()).getBetPlaced()) {
                            return;
                        }
                        if (Intrinsics.g(str, "sporty-jet") || B1() || Intrinsics.g(str, "sporty-cars")) {
                            C2();
                        }
                    }
                }
            }
        }
    }

    public boolean H0() {
        return false;
    }

    public final void H1() {
        if (((Boolean) ((x5a0) c1().T).getValue()).booleanValue()) {
            boolean z2 = this.M0;
            if (z2 && ((BetContainerState) c1().v0.a.getValue()).getDetailResponse().getBetIndex() == 1) {
                ((BetContainerState) R0().a.getValue()).setBetData((BetData) ((x5a0) c1().J).getValue());
                ((x5a0) this.E1).setValue(Boolean.TRUE);
            } else if (z2 && ((BetContainerState) c1().v0.a.getValue()).getDetailResponse().getBetIndex() == 2) {
                ((BetContainerState) R0().a.getValue()).setBetData((BetData) ((x5a0) c1().J).getValue());
                ((x5a0) this.F1).setValue(Boolean.TRUE);
            } else {
                wz.a("AutoBetOn", (String) ((x5a0) c1().v).getValue(), String.valueOf(((BetContainerState) R0().a.getValue()).getDetailResponse().getBetIndex()));
                c1().v0.G1(true);
                p0(c1().v0, (BetData) ((x5a0) c1().J).getValue(), null);
            }
        }
        if (this.H != null) {
            c1().G1(true);
        }
        SharedPreferences.Editor editor = this.J;
        if (editor != null) {
            editor.putBoolean(((Object[]) ((x5a0) c1().B).getValue()).length == 0 ? "" : ((String[]) ((x5a0) c1().B).getValue())[2], ((Boolean) ((x5a0) c1().q0).getValue()).booleanValue());
        }
        SharedPreferences.Editor editor2 = this.J;
        if (editor2 != null) {
            editor2.apply();
        }
        t1();
        this.D1 = false;
        ((x5a0) this.m1).setValue(Boolean.FALSE);
    }

    public final void H2(final ComposeView composeView, String str) {
        Integer numValueOf;
        Context context = composeView.getContext();
        if (context != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i3 = displayMetrics.heightPixels;
            float f3 = i3;
            float f4 = displayMetrics.widthPixels;
            int iFloatValue = (int) (((double) i3) * 0.065d);
            int iApplyDimension = (int) TypedValue.applyDimension(1, 50.0f, displayMetrics);
            if (Intrinsics.g(str, "sporty-hero")) {
                if (f3 == 0.0f || f4 == 0.0f) {
                    return;
                }
                Float fValueOf = Float.valueOf(0.062f);
                float f5 = f3 / f4;
                Float fValueOf2 = Float.valueOf(0.0719f);
                Map mapA = dgb.a("header_height", fValueOf2);
                if (f5 >= 2.1f || f5 >= 2.0f) {
                    mapA = dgb.a("header_height", fValueOf);
                } else if (f5 >= 1.5f) {
                    mapA = dgb.a("header_height", fValueOf2);
                }
                Float f6 = (Float) mapA.get("header_height");
                iFloatValue = (int) (f3 * (f6 != null ? f6.floatValue() : 0.0f));
                numValueOf = Integer.valueOf(iFloatValue);
            } else {
                numValueOf = null;
            }
            final int iIntValue = numValueOf != null ? numValueOf.intValue() : Math.max(iFloatValue, iApplyDimension);
            final boolean zW1 = w1(str);
            gvi gviVar = this.z;
            if (gviVar != null) {
                ConstraintLayout constraintLayout = gviVar.F;
                I2(composeView, iIntValue, zW1, i3(constraintLayout));
                zmy zmyVar = new zmy(this) { // from class: pdb
                    @Override // defpackage.zmy
                    public final l8j0 b(View view, l8j0 l8j0Var) {
                        view.getClass();
                        int i4 = l8j0Var.a.h(129).b;
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        fgb.I2(composeView, iIntValue, zW1, i4);
                        return l8j0Var;
                    }
                };
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                r6i0.d.n(constraintLayout, zmyVar);
                if (constraintLayout.isAttachedToWindow()) {
                    r6i0.c.c(constraintLayout);
                } else if (constraintLayout.isAttachedToWindow()) {
                    r6i0.c.c(constraintLayout);
                } else {
                    constraintLayout.addOnAttachStateChangeListener(new y(constraintLayout));
                }
            }
        }
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public void I() {
    }

    public abstract void I0();

    public void I1() {
    }

    public abstract void J0();

    public void J1(MultiplierResponse multiplierResponse) {
    }

    public void K1() {
    }

    public boolean K2() {
        return false;
    }

    public final void L0(ToastType toastType, Function1<? super v1b<? super Unit>, ? extends Object> function1) {
        if (!isAdded() || getView() == null) {
            return;
        }
        ToastType toastType2 = ToastType.GIFT_FBG;
        if (toastType == toastType2 && this.t1) {
            return;
        }
        if (toastType == toastType2) {
            this.t1 = true;
        }
        jvd0 jvd0Var = this.s1;
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        nas nasVarA = ebs.a(viewLifecycleOwner.getLifecycle());
        pfd pfdVar = fse.a;
        this.s1 = ej5.c(nasVarA, gku.a, null, new e(jvd0Var, function1, this, toastType, null), 2);
    }

    public void L1() {
    }

    public boolean L2() {
        return true;
    }

    public final void M0() {
        l1z l1zVarE1 = e1();
        GameDetails gameDetails = this.i;
        Integer id = gameDetails != null ? gameDetails.getId() : null;
        GameDetails gameDetails2 = this.i;
        l1zVarE1.h(id, gameDetails2 != null ? gameDetails2.getName() : null);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void M1(boolean z2) {
        int i3;
        boolean zBooleanValue;
        boolean zG;
        Context context = getContext();
        if (context != null) {
            if ((z1() || (y1() && ((Boolean) ((x5a0) c1().r0).getValue()).booleanValue())) && y1() && ((Boolean) ((x5a0) c1().r0).getValue()).booleanValue() && !P2()) {
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new zgb(this, z2, null), 3);
            }
            if (z1() || ((Boolean) ((x5a0) c1().r0).getValue()).booleanValue()) {
                return;
            }
            gvi gviVar = this.z;
            if (gviVar == null || gviVar.Y.getVisibility() != 0) {
                if (B1() && Intrinsics.g(((x5a0) gci0.h).getValue(), Boolean.TRUE)) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("vip_elite_data", 0);
                    if (!((Boolean) ((x5a0) gci0.F).getValue()).booleanValue()) {
                        sharedPreferences.getClass();
                        try {
                            zG = Intrinsics.g(sharedPreferences.getString("one_time_fetch", null), "ui_animated");
                        } catch (Exception unused) {
                            zG = false;
                        }
                        if (!zG) {
                            return;
                        }
                    }
                }
                if (A1()) {
                    String strV1 = v1();
                    ArrayList<OnboardingItem> arrayListA = sny.a(context, strV1);
                    if (arrayListA.isEmpty()) {
                        i3 = 0;
                        zBooleanValue = false;
                    } else {
                        int size = arrayListA.size();
                        i3 = 0;
                        zBooleanValue = false;
                        while (true) {
                            if (i3 >= size) {
                                i3 = 0;
                                break;
                            }
                            Boolean isView = arrayListA.get(i3).getIsView();
                            zBooleanValue = isView != null ? isView.booleanValue() : false;
                            if (!zBooleanValue) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    }
                    Intrinsics.g(((x5a0) c1().v).getValue(), "sporty-hero");
                    boolean z3 = i3 > 0;
                    ((x5a0) this.i0).setValue(Boolean.TRUE);
                    if (zBooleanValue || z3) {
                        this.l0 = false;
                        if (P2()) {
                            return;
                        }
                        pfd pfdVar2 = fse.a;
                        ej5.c(w5b.a(gku.a), null, null, new zgb(this, z2, null), 3);
                        return;
                    }
                    this.l0 = true;
                    if (this.i != null) {
                        if (Intrinsics.g(((x5a0) c1().v).getValue(), "galaxy-go") || Intrinsics.g(((x5a0) c1().v).getValue(), "sporty-kick") || Intrinsics.g(((x5a0) c1().v).getValue(), "sporty-cars") || Intrinsics.g(((x5a0) c1().v).getValue(), "crazy-rider") || Intrinsics.g(((x5a0) c1().v).getValue(), "sporty-skills") || Intrinsics.g(((x5a0) c1().v).getValue(), "sporty-hero")) {
                            z2(i3, strV1);
                        } else if (!getChildFragmentManager().V()) {
                            FragmentManager childFragmentManager = getChildFragmentManager();
                            androidx.fragment.app.a aVarA = oke.a(childFragmentManager, childFragmentManager);
                            String str = (String) ((x5a0) c1().z).getValue();
                            op5.a.getClass();
                            List<? extends File> list = op5.b;
                            o2g o2gVar = o2g.a;
                            o2gVar.getClass();
                            str.getClass();
                            com.sportygames.commons.views.a aVar = new com.sportygames.commons.views.a();
                            aVar.c = str;
                            aVar.d = i3;
                            aVar.w = list;
                            aVar.z = o2gVar;
                            aVar.A = false;
                            aVarA.f(R.id.onboarding_images, aVar, null);
                            aVarA.d();
                        }
                    }
                    gvi gviVar2 = this.z;
                    if (gviVar2 != null) {
                        gviVar2.X.setVisibility(0);
                    }
                    ((x5a0) this.m1).setValue(Boolean.FALSE);
                }
            }
        }
    }

    public boolean M2() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:84:0x015c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    public final void N0(String str) {
        androidx.fragment.app.e activity;
        svg svgVar;
        Object objValueOf;
        String name;
        Integer id;
        androidx.fragment.app.e activity2;
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        List<Fragment> listF;
        FragmentManager supportFragmentManager3;
        n2();
        if (this.l0) {
            Object value = ((x5a0) R0().T).getValue();
            z83 z83Var = z83.b;
            if (value == z83Var || ((x5a0) S0().T).getValue() == z83Var) {
                if (!((Boolean) ((x5a0) this.i0).getValue()).booleanValue()) {
                    if (str == null) {
                        M0();
                        return;
                    }
                }
            } else if (str == null) {
                M0();
                return;
            }
        } else if (!((Boolean) ((x5a0) this.i0).getValue()).booleanValue()) {
            if (str == null) {
                M0();
                return;
            }
        }
        Object value2 = ((x5a0) R0().T).getValue();
        z83 z83Var2 = z83.b;
        if (value2 == z83Var2 || ((x5a0) S0().T).getValue() == z83Var2) {
            ((x5a0) c1().i0).setValue(Boolean.TRUE);
        }
        if (((Boolean) ((x5a0) this.m1).getValue()).booleanValue()) {
            return;
        }
        androidx.fragment.app.e activity3 = getActivity();
        Fragment fragmentG = (activity3 == null || (supportFragmentManager3 = activity3.getSupportFragmentManager()) == null) ? null : supportFragmentManager3.G(R.id.flContent);
        if (fragmentG instanceof com.sportygames.commons.components.a) {
            com.sportygames.commons.components.a aVar = (com.sportygames.commons.components.a) fragmentG;
            if (!aVar.e && Intrinsics.g(aVar.b, "one tap bet")) {
                return;
            }
        }
        ab8 ab8Var = this.w1;
        if (ab8Var != null && ab8Var.isShowing()) {
            ab8 ab8Var2 = this.w1;
            if (ab8Var2 != null) {
                ab8Var2.dismiss();
                return;
            }
            return;
        }
        if (H0()) {
            return;
        }
        androidx.fragment.app.e activity4 = getActivity();
        int i3 = 0;
        if (((activity4 == null || (supportFragmentManager2 = activity4.getSupportFragmentManager()) == null || (listF = supportFragmentManager2.c.f()) == null) ? 0 : listF.size()) > 1 && (activity2 = getActivity()) != null && (supportFragmentManager = activity2.getSupportFragmentManager()) != null) {
            supportFragmentManager.a0();
        }
        if (this.K0 != null) {
            Y0().A1(true);
            ArrayList<GameDetails> arrayList = this.K0;
            if (arrayList != null) {
                GameDetails gameDetails = this.i;
                int iIntValue = (gameDetails == null || (id = gameDetails.getId()) == null) ? 0 : id.intValue();
                GameDetails gameDetails2 = this.i;
                if (gameDetails2 == null || (name = gameDetails2.getName()) == null) {
                    name = "";
                }
                svgVar = new svg();
                svgVar.c = arrayList;
                svgVar.d = Integer.valueOf(iIntValue);
                svgVar.e = name;
                svgVar.i = str;
            } else {
                svgVar = null;
            }
            this.N0 = svgVar;
            androidx.fragment.app.e activity5 = getActivity();
            if (activity5 != null) {
                try {
                    FragmentManager supportFragmentManager4 = activity5.getSupportFragmentManager();
                    supportFragmentManager4.getClass();
                    svg svgVar2 = this.N0;
                    if (svgVar2 != null) {
                        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager4);
                        aVar2.f(R.id.flContent, svgVar2, null);
                        aVar2.c("CONFIRM_DIALOG_FRAGMENT");
                        objValueOf = Integer.valueOf(aVar2.k(false, true));
                    } else {
                        objValueOf = null;
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
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
            Context context = getContext();
            if (context == null || (activity = getActivity()) == null) {
                return;
            }
            if (str == null) {
                ((x5a0) c1().i0).setValue(Boolean.TRUE);
                FragmentManager supportFragmentManager5 = activity.getSupportFragmentManager();
                if (supportFragmentManager5 != null) {
                    androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager5);
                    String str2 = (String) ((x5a0) c1().D).getValue();
                    op5 op5Var = op5.a;
                    String string = getString(R.string.exit_confirm_msg_cms);
                    string.getClass();
                    String string2 = getString(R.string.exit_text);
                    string2.getClass();
                    op5Var.getClass();
                    String strB = op5.b(string, string2, null);
                    String string3 = getString(R.string.stay_btn_cms);
                    string3.getClass();
                    String string4 = getString(R.string.stay);
                    string4.getClass();
                    String strB2 = op5.b(string3, string4, null);
                    String string5 = getString(R.string.exit_btn_cms);
                    string5.getClass();
                    String string6 = getString(R.string.label_dialog_exit);
                    string6.getClass();
                    String strB3 = op5.b(string5, string6, null);
                    sab sabVar = new sab(this, i3);
                    int color = context.getColor(R.color.redblack_confirm_dialog_left_button);
                    int color2 = context.getColor(R.color.redblack_confirm_dialog_right_button);
                    str2.getClass();
                    fm60 fm60Var = new fm60();
                    fm60Var.a = strB;
                    fm60Var.b = JsPluginCommon.GAMES_EXIT;
                    fm60Var.c = strB2;
                    fm60Var.d = strB3;
                    fm60Var.e = sabVar;
                    fm60Var.v = color;
                    fm60Var.w = color2;
                    fm60Var.i = true;
                    aVar3.f(R.id.flContent, fm60Var, null);
                    aVar3.c("");
                    aVar3.d();
                }
            } else {
                xbg xbgVar = this.G0;
                if (xbgVar != null) {
                    String string7 = getString(R.string.label_dialog_exit);
                    string7.getClass();
                    xbg.c(xbgVar, str, string7, new dbb(this, i3), new nbb(), context.getColor(R.color.sh_error_btn_color), 224);
                    xbgVar.a();
                }
            }
            GameDetails gameDetails3 = this.i;
            wz.a("BackClicked", gameDetails3 != null ? gameDetails3.getName() : null, "1", "On", "No");
            Unit unit = Unit.a;
        } catch (Exception unused) {
            Unit unit2 = Unit.a;
        }
    }

    public void N1(CampaignTopicResponse campaignTopicResponse) {
    }

    public boolean N2() {
        return true;
    }

    public List<LeftMenuButton> O0() {
        return m2g.a;
    }

    public void O1() {
    }

    public boolean O2(ul2 ul2Var) {
        ul2Var.getClass();
        return false;
    }

    public void P0() {
    }

    public final void P1() {
        int i3 = 0;
        if (((Boolean) ((x5a0) c1().T).getValue()).booleanValue()) {
            boolean z2 = this.M0;
            if (z2 && ((BetContainerState) c1().v0.a.getValue()).getDetailResponse().getBetIndex() == 1) {
                ((BetContainerState) R0().a.getValue()).setBetData((BetData) ((x5a0) c1().J).getValue());
                ((x5a0) this.E1).setValue(Boolean.TRUE);
            } else if (z2 && ((BetContainerState) c1().v0.a.getValue()).getDetailResponse().getBetIndex() == 2) {
                try {
                    ((BetContainerState) R0().a.getValue()).setBetData((BetData) ((x5a0) c1().J).getValue());
                } catch (Exception unused) {
                }
                ((x5a0) this.F1).setValue(Boolean.TRUE);
            } else {
                wz.a("AutoBetOn", (String) ((x5a0) c1().v).getValue(), String.valueOf(((BetContainerState) R0().a.getValue()).getDetailResponse().getBetIndex()));
                c1().v0.G1(true);
                if (this.j0) {
                    goj gojVarC1 = c1();
                    BetData betData = (BetData) ((x5a0) c1().J).getValue();
                    long j3 = this.z0;
                    GPSData gPSData = this.U0;
                    boolean z3 = this.h2;
                    int betIndex = ((BetContainerState) c1().v0.a.getValue()).getDetailResponse().getBetIndex() - 1;
                    web webVar = new web(this, i3);
                    xeb xebVar = new xeb(this, i3);
                    Long lValueOf = Long.valueOf(this.A0);
                    MultiplierResponse multiplierResponse = this.x0;
                    String messageType = multiplierResponse != null ? multiplierResponse.getMessageType() : null;
                    if (messageType == null) {
                        messageType = "";
                    }
                    goj.A1(gojVarC1, betData, j3, gPSData, z3, betIndex, "AUTO", webVar, xebVar, null, lValueOf, messageType, 256);
                } else {
                    p0(c1().v0, (BetData) ((x5a0) c1().J).getValue(), null);
                }
            }
        }
        if (this.H != null) {
            c1().G1(true);
        }
        SharedPreferences.Editor editor = this.J;
        if (editor != null) {
            editor.putBoolean(((String[]) ((x5a0) c1().B).getValue())[2], ((Boolean) ((x5a0) c1().q0).getValue()).booleanValue());
        }
        SharedPreferences.Editor editor2 = this.J;
        if (editor2 != null) {
            editor2.apply();
        }
        t1();
        this.D1 = false;
        ((x5a0) this.m1).setValue(Boolean.FALSE);
    }

    public boolean P2() {
        return false;
    }

    @Override // defpackage.bb
    public void Q(xnh0 xnh0Var) {
        try {
            if (this.t0) {
                X1();
                j3();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        if (this.s0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = nzf0.a;
        if (!z2 && jCurrentTimeMillis - nzf0.b <= 500) {
            z2 = true;
        }
        if (!z2) {
            A2();
            if ((xnh0Var != null ? xnh0Var.a : null) != null && xnh0Var.a.length() > 0) {
                s0();
            }
            this.t0 = false;
            return;
        }
        this.B = false;
        z0();
        o2();
        if (this.p0) {
            g2();
        } else if (this.q0) {
            f2();
        } else {
            c2();
        }
    }

    public boolean Q0() {
        return this instanceof bwb;
    }

    public final void Q1(String str) {
        CampaignParticipateV2 campaignParticipateV2J2;
        str.getClass();
        Double dH = kotlin.text.b.h(str);
        CampaignParticipateV2 campaignParticipateV2J3 = getZ2();
        if (campaignParticipateV2J3 != null && (campaignParticipateV2J2 = getZ2()) != null && campaignParticipateV2J2.getCanConvert() && this.w) {
            q8i0 q8i0Var = this.v;
            ((defpackage.q) q8i0Var.getValue()).y1(Integer.valueOf(campaignParticipateV2J3.getCampaignId()), getA2(), Integer.valueOf(campaignParticipateV2J3.getVariantId()), dH, campaignParticipateV2J3.getVariantName(), "stake");
            ((defpackage.q) q8i0Var.getValue()).y1(Integer.valueOf(campaignParticipateV2J3.getCampaignId()), getA2(), Integer.valueOf(campaignParticipateV2J3.getVariantId()), Double.valueOf(1.0d), campaignParticipateV2J3.getVariantName(), "bet_count");
        }
    }

    public boolean Q2() {
        return false;
    }

    public final ul2 R0() {
        return (ul2) this.P.getValue();
    }

    public void R1(boolean z2) {
    }

    public boolean R2() {
        return false;
    }

    public final ul2 S0() {
        return (ul2) this.Q.getValue();
    }

    public void S1(MultiplierResponse multiplierResponse) {
    }

    public boolean S2() {
        return false;
    }

    public final vt2 T0() {
        return (vt2) this.u1.getValue();
    }

    public void T1(ynj ynjVar) {
    }

    public final void T2() {
        op5 op5Var = op5.a;
        String string = getString(R.string.sg_campaign_navigation_disabled_key);
        string.getClass();
        String strC = op5.c(op5Var, string, "You have active bets. Cashout and try again.");
        ((x5a0) c1().H).setValue(strC);
        ((x5a0) c1().K).setValue(new j58(b1().L0()));
        K0(this, strC, b1().L0(), b1().M0(), ((Number) ((x5a0) c1().M).getValue()).intValue(), 24);
    }

    public final cj5 U0() {
        cj5 cj5Var = this.W1;
        if (cj5Var != null) {
            return cj5Var;
        }
        Intrinsics.n("buildVariantColors");
        throw null;
    }

    public final void U1() {
        n2();
        ((x5a0) this.l1).setValue(Boolean.TRUE);
    }

    public void U2(final String str) {
        ab8 ab8Var;
        ab8 ab8Var2 = this.w1;
        int i3 = 1;
        int i4 = 0;
        if (ab8Var2 != null && ab8Var2.isShowing()) {
            androidx.fragment.app.e activity = getActivity();
            if (activity == null || (ab8Var = this.w1) == null) {
                return;
            }
            ab8Var.F = new qfb(this, str);
            ab8Var.G = new rfb(i4, this, str);
            ab8Var.c(new zo2(activity, this.X0, this.V0, (String) ((x5a0) c1().D).getValue(), (String) ((x5a0) c1().v).getValue(), b1(), new Function1() { // from class: sfb
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str2 = (String) obj;
                    str2.getClass();
                    fgb fgbVar = this.a;
                    fgbVar.o1 = str2;
                    ((x5a0) fgbVar.k1).setValue(Boolean.TRUE);
                    return Unit.a;
                }
            }, new tfb(this, i4)));
            Function2<? super Integer, ? super Integer, Unit> function2 = ab8Var.F;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(ab8Var.I + ab8Var.H), Integer.valueOf(ab8Var.H));
                return;
            } else {
                Intrinsics.n("betHistoryFetchManager");
                throw null;
            }
        }
        GameDetails gameDetails = this.i;
        wz.a("BetHistoryClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
        if (!T0().b.e()) {
            T0().b.f(getViewLifecycleOwner(), new v(new z62(this, 2)));
        }
        androidx.fragment.app.e activity2 = getActivity();
        if (activity2 != null) {
            ab8 ab8Var3 = new ab8(activity2, Boolean.valueOf(this.S1), (String) ((x5a0) c1().D).getValue(), b1());
            ab8Var3.F = new Function2() { // from class: ufb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    this.a.T0().x1(((Integer) obj).intValue(), ((Integer) obj2).intValue(), PagingFetchType.VIEW_MORE, str);
                    return Unit.a;
                }
            };
            ab8Var3.G = new Function2() { // from class: vfb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    this.a.T0().x1(((Integer) obj).intValue(), ((Integer) obj2).intValue(), PagingFetchType.ARCHIVE_MORE, str);
                    return Unit.a;
                }
            };
            Window window = ab8Var3.getWindow();
            WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
            if (attributes != null) {
                attributes.gravity = 17;
            }
            if (attributes != null) {
                attributes.flags &= -5;
            }
            Window window2 = ab8Var3.getWindow();
            if (window2 != null) {
                window2.setAttributes(attributes);
            }
            Window window3 = ab8Var3.getWindow();
            if (window3 != null) {
                window3.setBackgroundDrawableResource(R.color.trans_black_45);
            }
            ab8Var3.show();
            Window window4 = ab8Var3.getWindow();
            if (window4 != null) {
                window4.setLayout(-1, -1);
            }
            ab8Var3.c(new zo2(activity2, this.X0, this.V0, (String) ((x5a0) c1().D).getValue(), (String) ((x5a0) c1().v).getValue(), b1(), new sg7(this, i3), new gaj() { // from class: wfb
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String str2 = (String) obj;
                    String str3 = (String) obj2;
                    str2.getClass();
                    str3.getClass();
                    fgb fgbVar = this.a;
                    fgbVar.V0 = str2;
                    fgbVar.X0 = str3;
                    fgbVar.W0 = (BetHistoryItem) obj3;
                    fgbVar.U1();
                    return Unit.a;
                }
            }));
            Function2<? super Integer, ? super Integer, Unit> function3 = ab8Var3.F;
            if (function3 == null) {
                Intrinsics.n("betHistoryFetchManager");
                throw null;
            }
            function3.invoke(Integer.valueOf(ab8Var3.I + ab8Var3.H), Integer.valueOf(ab8Var3.H));
            this.w1 = ab8Var3;
        }
        ab8 ab8Var4 = this.w1;
        if (ab8Var4 != null) {
            ab8Var4.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: xfb
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    ab8 ab8Var5 = this.a.w1;
                    if (ab8Var5 != null) {
                        ab8Var5.a();
                    }
                }
            });
        }
    }

    public final fq5 V0() {
        return (fq5) this.Y0.getValue();
    }

    public final void V1() {
        k1().F1();
        this.t0 = true;
    }

    public final void W1() {
        String lowerCase;
        gvi gviVar;
        if (l2()) {
            return;
        }
        if (StringsKt.M((CharSequence) ((x5a0) c1().v).getValue(), "Jet", false) && (gviVar = this.z) != null) {
            gviVar.g0.setVisibility(0);
        }
        n2();
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            try {
                int i3 = this.q2;
                boolean z2 = i3 == 2 || i3 == 4;
                FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                String str = (String) ((x5a0) c1().z).getValue();
                String strValueOf = String.valueOf(this.r2);
                op5 op5Var = op5.a;
                String str2 = this.y0;
                op5Var.getClass();
                String strI = op5.i(str2);
                Double dValueOf = Double.valueOf(this.s2);
                Function1<? super Boolean, Unit> function1 = new Function1() { // from class: pab
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        ((x5a0) this.a.c1().j0).setValue(bool);
                        return Unit.a;
                    }
                };
                gw30 gw30Var = new gw30();
                if (str != null) {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                } else {
                    lowerCase = null;
                }
                if (lowerCase == null) {
                    lowerCase = "";
                }
                gw30Var.b = lowerCase;
                gw30Var.c = z2;
                if (z2) {
                    gw30Var.d = strValueOf;
                    gw30Var.B = strI;
                    gw30Var.C = dValueOf;
                }
                gw30Var.v = function1;
                aVar.f(R.id.flContent, gw30Var, "RainV2Fragment");
                aVar.c(jq40.a(gw30.class).k());
                aVar.k(false, true);
            } catch (Exception e3) {
                e3.printStackTrace();
                Unit unit = Unit.a;
            }
        }
    }

    public final void W2() {
        gvi gviVar;
        gvi gviVar2;
        gvi gviVar3;
        if (this.R1 && this.T1) {
            R0().U1(false);
            S0().U1(false);
            I1();
            if (Intrinsics.g(((x5a0) c1().v).getValue(), "sporty-jet") || Intrinsics.g(((x5a0) c1().v).getValue(), "sporty-hero")) {
                gvi gviVar4 = this.z;
                if (gviVar4 != null) {
                    gviVar4.c.setVisibility(0);
                }
                if (this.p0) {
                    gvi gviVar5 = this.z;
                    if (gviVar5 != null) {
                        gviVar5.h0.setVisibility(0);
                    }
                    gvi gviVar6 = this.z;
                    if (gviVar6 != null) {
                        gviVar6.i0.setVisibility(0);
                    }
                }
                gvi gviVar7 = this.z;
                if (gviVar7 != null) {
                    gviVar7.d.setVisibility(0);
                }
                if (Intrinsics.g(((x5a0) c1().v).getValue(), "sporty-hero")) {
                    gvi gviVar8 = this.z;
                    if (gviVar8 != null) {
                        gviVar8.v.setVisibility(0);
                    }
                    gvi gviVar9 = this.z;
                    if (gviVar9 != null) {
                        gviVar9.w.setVisibility(0);
                    }
                    gvi gviVar10 = this.z;
                    if (gviVar10 != null) {
                        gviVar10.p0.setVisibility(0);
                    }
                    gvi gviVar11 = this.z;
                    if (gviVar11 != null) {
                        gviVar11.n0.setVisibility(0);
                    }
                    gvi gviVar12 = this.z;
                    if (gviVar12 != null) {
                        gviVar12.W.setVisibility(0);
                    }
                    gvi gviVar13 = this.z;
                    if (gviVar13 != null) {
                        gviVar13.o0.setVisibility(0);
                    }
                    if (Intrinsics.g(((x5a0) gci0.h).getValue(), Boolean.TRUE) && (gviVar = this.z) != null) {
                        gviVar.q0.setVisibility(0);
                    }
                    gvi gviVar14 = this.z;
                    if (gviVar14 != null) {
                        gviVar14.f0.setVisibility(0);
                    }
                    gvi gviVar15 = this.z;
                    if (gviVar15 != null) {
                        gviVar15.e0.setVisibility(this.S1 ? 0 : 8);
                    }
                }
            } else {
                MultiplierResponse multiplierResponse = this.x0;
                if (Intrinsics.g(multiplierResponse != null ? multiplierResponse.getMessageType() : null, "ROUND_ONGOING") && Intrinsics.g(((x5a0) c1().v).getValue(), "sporty-cars")) {
                    Z1();
                }
                gvi gviVar16 = this.z;
                if (gviVar16 != null) {
                    gviVar16.i.setVisibility(0);
                }
                gvi gviVar17 = this.z;
                if (gviVar17 != null) {
                    gviVar17.e.setVisibility(0);
                }
                gvi gviVar18 = this.z;
                if (gviVar18 != null) {
                    gviVar18.T.setVisibility((!Intrinsics.g(((x5a0) c1().v).getValue(), "sporty-cars") || y1()) ? 0 : 8);
                }
                gvi gviVar19 = this.z;
                if (gviVar19 != null) {
                    gviVar19.b0.setVisibility(0);
                }
                if (Intrinsics.g(((x5a0) c1().v).getValue(), "sporty-cars") && (gviVar3 = this.z) != null) {
                    gviVar3.z.setVisibility(0);
                }
                if (Intrinsics.g(((x5a0) c1().v).getValue(), "galaxy-go") || Intrinsics.g(((x5a0) c1().v).getValue(), "sporty-kick") || Intrinsics.g(((x5a0) c1().v).getValue(), "sporty-cars") || Intrinsics.g(((x5a0) c1().v).getValue(), "crazy-rider")) {
                    gvi gviVar20 = this.z;
                    if (gviVar20 != null) {
                        gviVar20.v.setVisibility(0);
                    }
                    gvi gviVar21 = this.z;
                    if (gviVar21 != null) {
                        gviVar21.w.setVisibility(0);
                    }
                }
            }
            if (y1() && (gviVar2 = this.z) != null) {
                gviVar2.L.setVisibility(0);
            }
            L1();
            this.R1 = false;
            this.T1 = false;
        }
    }

    public final m28 X0() {
        return (m28) this.N.getValue();
    }

    public final void X1() {
        FragmentManager supportFragmentManager;
        xi60 xi60Var;
        androidx.fragment.app.e activity;
        FragmentManager supportFragmentManager2;
        if (!isRemoving() && this.N0 != null && (activity = getActivity()) != null && (supportFragmentManager2 = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager2.Y();
        }
        R0().I1(false);
        S0().I1(false);
        ((x5a0) c1().z0).setValue(Boolean.FALSE);
        if (!isRemoving() && (xi60Var = this.P0) != null && xi60Var.isVisible()) {
            xi60 xi60Var2 = this.P0;
            if (xi60Var2 != null) {
                xi60Var2.dismiss();
            }
            this.P0 = null;
        }
        s1();
        try {
            if (isRemoving()) {
                return;
            }
            try {
                androidx.fragment.app.e activity2 = getActivity();
                Fragment fragmentH = (activity2 == null || (supportFragmentManager = activity2.getSupportFragmentManager()) == null) ? null : supportFragmentManager.H("CampaignBottomSheetDialog");
                if (fragmentH instanceof com.google.android.material.bottomsheet.c) {
                    ((com.google.android.material.bottomsheet.c) fragmentH).dismiss();
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            this.t1 = false;
            ((x5a0) this.d1).setValue(Boolean.FALSE);
            ((x5a0) c1().M).setValue(1);
            jvd0 jvd0Var = this.s1;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void X2() {
        boolean z2 = false;
        try {
            boolean z3 = this.w2 != 0 && System.currentTimeMillis() - this.w2 < 30000;
            this.w2 = System.currentTimeMillis();
            z2 = z3;
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        if (z2) {
            return;
        }
        try {
            L0(ToastType.GIFT_CAMPAIGN, new z(null));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final ip8 Y0() {
        return (ip8) this.R.getValue();
    }

    public final String Y1(ul2 ul2Var) {
        String currency = ((BetContainerState) ul2Var.a.getValue()).getDetailResponse().getCurrency();
        if (!StringsKt.U(currency)) {
            return currency;
        }
        if (((BetContainerState) ul2Var.a.getValue()).getDetailResponse().getBetIndex() <= 0 || StringsKt.U(this.y0)) {
            return null;
        }
        return this.y0;
    }

    public final void Y2(final ul2 ul2Var, boolean z2, final int i3) {
        List<GiftItem> entityList;
        ul2Var.getClass();
        if (x1()) {
            op5 op5Var = op5.a;
            String string = getString(R.string.fbg_one_gift_usage_allowed_msg_cms);
            string.getClass();
            String string2 = getString(R.string.one_gift_allowed);
            string2.getClass();
            op5Var.getClass();
            String strB = op5.b(string, string2, null);
            ((x5a0) c1().H).setValue(strB);
            ((x5a0) c1().K).setValue(new j58(b1().L0()));
            ((x5a0) c1().L).setValue(new j58(b1().M0()));
            ((x5a0) c1().Q).setValue(1800);
            ((x5a0) c1().O).setValue(Boolean.TRUE);
            K0(this, strB, b1().L0(), b1().M0(), ((Number) ((x5a0) c1().M).getValue()).intValue(), 16);
            return;
        }
        wwd0 wwd0Var = ul2Var.a;
        if (((BetContainerState) wwd0Var.getValue()).getBetInProgress() || ((BetContainerState) wwd0Var.getValue()).getBetPlaced() || ((BetContainerState) wwd0Var.getValue()).getAutoBetFlag() || z2) {
            return;
        }
        boolean z3 = this.k0;
        int i4 = this.m2;
        int i5 = 1;
        if (!z3) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.l2 < i4) {
                return;
            }
            this.l2 = jCurrentTimeMillis;
            try {
                androidx.fragment.app.e activity = getActivity();
                if (activity != null) {
                    xi60 xi60Var = this.P0;
                    if (xi60Var == null) {
                        xi60Var = new xi60();
                        this.P0 = xi60Var;
                    }
                    if (xi60Var.isAdded()) {
                        return;
                    }
                    GameDetails gameDetails = this.i;
                    wz.a("FBGIconClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                    n2();
                    xi60 xi60Var2 = this.P0;
                    if (xi60Var2 != null) {
                        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        xi60Var2.q0(supportFragmentManager, new Function0() { // from class: gab
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                List<GiftItem> entityList2;
                                fgb fgbVar = this.a;
                                PromotionGiftsResponse promotionGiftsResponse = fgbVar.Q0;
                                if (promotionGiftsResponse != null && (entityList2 = promotionGiftsResponse.getEntityList()) != null) {
                                    ArrayList arrayList = (ArrayList) entityList2;
                                    xi60 xi60Var3 = fgbVar.P0;
                                    if (xi60Var3 != null) {
                                        ul2 ul2Var2 = ul2Var;
                                        xi60Var3.r0(arrayList, ((BetContainerState) ul2Var2.a.getValue()).getDetailResponse().getMaxAmount(), ((BetContainerState) ul2Var2.a.getValue()).getDetailResponse().getMinAmount(), 0.0d);
                                    }
                                }
                                return Unit.a;
                            }
                        }, new gaj() { // from class: hab
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                GiftItem giftItem = (GiftItem) obj;
                                Double d3 = (Double) obj2;
                                d3.getClass();
                                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                                giftItem.getClass();
                                if (zBooleanValue) {
                                    giftItem.setPartialBal(d3);
                                } else {
                                    giftItem.setPartialBal(Double.valueOf(0.0d));
                                }
                                ul2Var.O1(giftItem);
                                fgb fgbVar = this.a;
                                fgbVar.E0();
                                xi60 xi60Var3 = fgbVar.P0;
                                if (xi60Var3 != null) {
                                    xi60Var3.dismiss();
                                }
                                return Unit.a;
                            }
                        }, new d72(this, i5));
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception e3) {
                e3.printStackTrace();
                return;
            }
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        if (jCurrentTimeMillis2 - this.l2 < i4) {
            return;
        }
        this.l2 = jCurrentTimeMillis2;
        try {
            if (getActivity() != null) {
                GameDetails gameDetails2 = this.i;
                wz.a("FBGIconClicked", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
                n2();
                PromotionGiftsResponse promotionGiftsResponse = this.Q0;
                if (promotionGiftsResponse == null || (entityList = promotionGiftsResponse.getEntityList()) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(l48.r(entityList, 10));
                Iterator<T> it = entityList.iterator();
                while (it.hasNext()) {
                    arrayList.add(GiftItemKt.toFBGGiftItem((GiftItem) it.next()));
                }
                final ArrayList arrayList2 = new ArrayList(arrayList);
                final double maxAmount = ((BetContainerState) wwd0Var.getValue()).getDetailResponse().getMaxAmount();
                final double minAmount = ((BetContainerState) wwd0Var.getValue()).getDetailResponse().getMinAmount();
                ((x5a0) ul2Var.U).setValue(Boolean.TRUE);
                gvi gviVar = this.z;
                if (gviVar != null) {
                    gviVar.K.setViewCompositionStrategy(u6i0.c.a);
                }
                gvi gviVar2 = this.z;
                if (gviVar2 != null) {
                    gviVar2.K.setContent(new op8(119687709, new Function2() { // from class: qab
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar = (a) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final ul2 ul2Var2 = ul2Var;
                                final BetContainerState betContainerState = (BetContainerState) wyh.c(ul2Var2.a, aVar, 0, 7).getValue();
                                lrp lrpVarA = sjj.a();
                                final double d3 = maxAmount;
                                final double d4 = minAmount;
                                final int i6 = i3;
                                final fgb fgbVar = this;
                                final ArrayList arrayList3 = arrayList2;
                                orp.a(lrpVarA, pp8.b(809341022, new Function2() { // from class: pbb
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        a aVar2 = (a) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            final ul2 ul2Var3 = ul2Var2;
                                            if (ul2Var3.z1()) {
                                                aVar2.N(-867788156);
                                                final fgb fgbVar2 = fgbVar;
                                                b bVar = (b) wyh.c(((e5h) fgbVar2.T.getValue()).f, aVar2, 0, 7).getValue();
                                                final double d5 = d3;
                                                final double d6 = d4;
                                                final int i7 = i6;
                                                final BetContainerState betContainerState2 = betContainerState;
                                                final ArrayList arrayList4 = arrayList3;
                                                c.a(bVar, pp8.b(34983434, new Function2() { // from class: wbb
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj5, Object obj6) {
                                                        a aVar3 = (a) obj5;
                                                        int iIntValue3 = ((Integer) obj6).intValue();
                                                        if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                            d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), j58.c(0.5f, j58.b), zk40.a);
                                                            aiv aivVarC = g75.c(ht.a.a, false);
                                                            int iHashCode = Long.hashCode(aVar3.m());
                                                            ne00 ne00VarO = aVar3.o();
                                                            d dVarC = androidx.compose.ui.c.c(aVar3, dVarB);
                                                            yka.k.getClass();
                                                            tsr.a aVar4 = yka.a.b;
                                                            if (aVar3.k() == null) {
                                                                l2a.b();
                                                                throw null;
                                                            }
                                                            aVar3.D();
                                                            if (aVar3.g()) {
                                                                aVar3.F(aVar4);
                                                            } else {
                                                                aVar3.p();
                                                            }
                                                            hlh0.a(aVar3, aivVarC, yka.a.f);
                                                            hlh0.a(aVar3, ne00VarO, yka.a.e);
                                                            yka.a.C1350a c1350a = yka.a.g;
                                                            if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                                                j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                                            }
                                                            hlh0.a(aVar3, dVarC, yka.a.d);
                                                            BetContainerState betContainerState3 = betContainerState2;
                                                            int keypadValue = betContainerState3.getKeypadValue();
                                                            boolean extraKey = betContainerState3.getExtraKey();
                                                            final fgb fgbVar3 = fgbVar2;
                                                            boolean zA = aVar3.A(fgbVar3);
                                                            final ul2 ul2Var4 = ul2Var3;
                                                            boolean zA2 = zA | aVar3.A(ul2Var4);
                                                            Object objY = aVar3.y();
                                                            a.C0041a.C0042a c0042a = a.C0041a.a;
                                                            if (zA2 || objY == c0042a) {
                                                                objY = new Function0() { // from class: wcb
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        fgb fgbVar4 = fgbVar3;
                                                                        ytw<Boolean> ytwVar = fgbVar4.j1;
                                                                        Boolean bool = Boolean.FALSE;
                                                                        ((x5a0) ytwVar).setValue(bool);
                                                                        fgbVar4.Z0().g(false);
                                                                        ((x5a0) ul2Var4.U).setValue(bool);
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar3.r(objY);
                                                            }
                                                            Function0 function0 = (Function0) objY;
                                                            boolean zA3 = aVar3.A(fgbVar3) | aVar3.A(ul2Var4);
                                                            Object objY2 = aVar3.y();
                                                            if (zA3 || objY2 == c0042a) {
                                                                objY2 = new gaj() { // from class: xcb
                                                                    @Override // defpackage.gaj
                                                                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                                        com.sportygames.fbg_dialog.data.model.GiftItem giftItem = (com.sportygames.fbg_dialog.data.model.GiftItem) obj7;
                                                                        Double d7 = (Double) obj8;
                                                                        d7.getClass();
                                                                        boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                                                                        giftItem.getClass();
                                                                        fgb fgbVar4 = fgbVar3;
                                                                        ytw<Boolean> ytwVar = fgbVar4.j1;
                                                                        Boolean bool = Boolean.FALSE;
                                                                        ((x5a0) ytwVar).setValue(bool);
                                                                        fgbVar4.Z0().g(false);
                                                                        if (zBooleanValue) {
                                                                            giftItem.setPartialBal(d7);
                                                                        } else {
                                                                            giftItem.setPartialBal(Double.valueOf(0.0d));
                                                                        }
                                                                        GiftItem giftItem2 = GiftItemKt.toGiftItem(giftItem);
                                                                        ul2 ul2Var5 = ul2Var4;
                                                                        ul2Var5.O1(giftItem2);
                                                                        fgbVar4.E0();
                                                                        ((x5a0) ul2Var5.U).setValue(bool);
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar3.r(objY2);
                                                            }
                                                            gaj gajVar = (gaj) objY2;
                                                            boolean zA4 = aVar3.A(fgbVar3) | aVar3.A(ul2Var4);
                                                            Object objY3 = aVar3.y();
                                                            if (zA4 || objY3 == c0042a) {
                                                                objY3 = new Function0() { // from class: zcb
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        fgb fgbVar4 = fgbVar3;
                                                                        ((x5a0) fgbVar4.j1).setValue(Boolean.FALSE);
                                                                        fgbVar4.Z0().g(false);
                                                                        ul2 ul2Var5 = ul2Var4;
                                                                        ul2Var5.Q1(-1);
                                                                        ul2Var5.P1(3);
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar3.r(objY3);
                                                            }
                                                            Function0 function1 = (Function0) objY3;
                                                            boolean zA5 = aVar3.A(ul2Var4) | aVar3.A(fgbVar3);
                                                            Object objY4 = aVar3.y();
                                                            if (zA5 || objY4 == c0042a) {
                                                                objY4 = new adb(0, ul2Var4, fgbVar3);
                                                                aVar3.r(objY4);
                                                            }
                                                            Function0 function2 = (Function0) objY4;
                                                            boolean zA6 = aVar3.A(fgbVar3);
                                                            Object objY5 = aVar3.y();
                                                            if (zA6 || objY5 == c0042a) {
                                                                objY5 = new Function0() { // from class: bdb
                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        fgb fgbVar4 = fgbVar3;
                                                                        ((x5a0) fgbVar4.j1).setValue(Boolean.FALSE);
                                                                        fgbVar4.Z0().g(false);
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                aVar3.r(objY5);
                                                            }
                                                            vca.d(i7, arrayList4, keypadValue, extraKey, d5, d6, null, null, function0, gajVar, function1, function2, (Function0) objY5, aVar3, 1572864);
                                                            aVar3.s();
                                                        } else {
                                                            aVar3.G();
                                                        }
                                                        return Unit.a;
                                                    }
                                                }, aVar2), aVar2, 48);
                                            } else {
                                                aVar2.N(-1288626300);
                                            }
                                            aVar2.H();
                                        } else {
                                            aVar2.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar), aVar, 48);
                            } else {
                                aVar.G();
                            }
                            return Unit.a;
                        }
                    }, true));
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final h5h Z0() {
        return (h5h) this.b.getValue();
    }

    public void Z1() {
    }

    public final void Z2() {
        fgb fgbVar;
        if (this.r1 > 0) {
            MultiplierResponse multiplierResponse = this.x0;
            if (Intrinsics.g(multiplierResponse != null ? multiplierResponse.getMessageType() : null, "ROUND_ONGOING")) {
                if ((this.r1 - System.currentTimeMillis()) / 1000 <= 2 || this.J0) {
                    fgbVar = this;
                } else {
                    ytw<String> ytwVar = c1().H;
                    op5 op5Var = op5.a;
                    String string = getString(R.string.no_internet_msg_cms);
                    string.getClass();
                    String string2 = getString(R.string.your_connection_is_unstable_might_affect_bet_and_cash_out);
                    string2.getClass();
                    ((x5a0) ytwVar).setValue(op5.c(op5Var, string, string2));
                    ((x5a0) c1().K).setValue(new j58(b1().h0()));
                    ((x5a0) c1().L).setValue(new j58(b1().M0()));
                    ((x5a0) c1().Q).setValue(6000);
                    ytw<Boolean> ytwVar2 = c1().O;
                    Boolean bool = Boolean.TRUE;
                    ((x5a0) ytwVar2).setValue(bool);
                    ((x5a0) c1().P).setValue(bool);
                    fgbVar = this;
                    fgbVar.L0(ToastType.MESSAGE, new jgb(fgbVar, (String) ((x5a0) c1().H).getValue(), b1().h0(), b1().M0(), true, 6000L, ((Number) ((x5a0) c1().M).getValue()).intValue(), null));
                }
                fgbVar.J0 = false;
            }
        }
    }

    public final void a1() {
        if (yju.a("br")) {
            androidx.fragment.app.e activity = getActivity();
            GameMainActivity gameMainActivity = activity instanceof GameMainActivity ? (GameMainActivity) activity : null;
            if (gameMainActivity != null) {
                lgb lgbVar = new lgb(this);
                mgb mgbVar = new mgb();
                mgbVar.a = this;
                gameMainActivity.J1(lgbVar, mgbVar);
            }
        }
    }

    public abstract void a2();

    public abstract void b2();

    public final void b3(String str, String str2, String str3) {
        str.getClass();
        ((x5a0) this.d1).setValue(Boolean.TRUE);
        L0(ToastType.VIP_LHS, new kgb(str, this, str2, str3, null));
    }

    public final goj c1() {
        return (goj) this.S.getValue();
    }

    public abstract void c2();

    public final void c3(RainTopicResponse rainTopicResponse) {
        try {
            String strG1 = g1(rainTopicResponse);
            op5 op5Var = op5.a;
            String strM1 = m1(R.string.cms_claim_now);
            String strM2 = m1(R.string.default_claim_now);
            op5Var.getClass();
            L0(ToastType.RAIN_ACTIVE, new a0(strG1, "<font color=\"#1A1A1A\">" + op5.b(strM1, strM2, null) + "</font>", null));
        } catch (Exception e3) {
            e3.printStackTrace();
            this.p2 = false;
            this.o2 = false;
            s1();
        }
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public void d0() {
    }

    public final fuj d1() {
        return (fuj) this.d2.getValue();
    }

    public abstract void d2();

    public void d3() {
    }

    public final l1z e1() {
        return (l1z) this.a.getValue();
    }

    public abstract void e2();

    public final void e3(ul2 ul2Var, BetData betData) {
        String giftId;
        Double partialBal;
        ul2Var.getClass();
        betData.getClass();
        wwd0 wwd0Var = ul2Var.a;
        if (((BetContainerState) wwd0Var.getValue()).getCancelBet()) {
            return;
        }
        ((x5a0) this.j1).setValue(Boolean.FALSE);
        ul2Var.R1(false);
        ul2Var.H1(true);
        ul2Var.G1(false);
        Double cashOutValue = betData.getCashOutValue();
        Double cashOutValue2 = (cashOutValue != null ? cashOutValue.doubleValue() : 0.0d) > 0.0d ? betData.getCashOutValue() : null;
        ((x5a0) ul2Var.c).setValue(Boolean.valueOf(cashOutValue2 != null));
        if (egb.a((BetContainerState) wwd0Var.getValue()) > 0) {
            Double partialBal2 = ((BetContainerState) wwd0Var.getValue()).getGift().getPartialBal();
            partialBal = (partialBal2 != null ? partialBal2.doubleValue() : 0.0d) > 0.0d ? ((BetContainerState) wwd0Var.getValue()).getGift().getPartialBal() : Double.valueOf(((BetContainerState) wwd0Var.getValue()).getGift().getCurBal());
            giftId = ((BetContainerState) wwd0Var.getValue()).getGift().getGiftId();
        } else {
            giftId = null;
            partialBal = null;
        }
        double minAmount = ((BetContainerState) wwd0Var.getValue()).getDetailResponse().getMinAmount();
        Double betValue = betData.getBetValue();
        if (betValue != null) {
            Double d3 = betValue.doubleValue() >= minAmount ? betValue : null;
            if (d3 != null) {
                minAmount = d3.doubleValue();
            }
        }
        CancelBetRequest cancelBetRequest = new CancelBetRequest(ul2Var.L.getValue().longValue(), String.valueOf(minAmount), ((BetContainerState) wwd0Var.getValue()).getDetailResponse().getBetIndex(), ((BetContainerState) wwd0Var.getValue()).getDetailResponse().getCurrency(), ((BetContainerState) wwd0Var.getValue()).getRoundId(), giftId, partialBal, cashOutValue2, this.h2, this.U0);
        final String strJ = new eal().j(cancelBetRequest);
        k1().G1(cancelBetRequest.getBetIndex(), strJ, String.valueOf(cancelBetRequest.getRoundId()), new Function0() { // from class: rab
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                fgb fgbVar = this.a;
                cgb.a(fgbVar.e1(), (String) ((x5a0) fgbVar.c1().v).getValue(), "cancelBet", strJ);
                return Unit.a;
            }
        });
    }

    @Override // defpackage.bb
    public final void f0(m8 m8Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = nzf0.a;
        if (!z2 && jCurrentTimeMillis - nzf0.b <= 500) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        this.u0 = true;
    }

    public final t530 f1() {
        return (t530) this.O.getValue();
    }

    public abstract void f2();

    public final void f3(String str) {
        try {
            if (str.length() == 0) {
                return;
            }
            List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{":"}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(l48.r(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            int iIntValue = ((Number) arrayList.get(0)).intValue();
            int iIntValue2 = ((Number) arrayList.get(1)).intValue();
            cq40 cq40Var = new cq40();
            long j3 = (((long) ((iIntValue * 60) + iIntValue2)) * 1000) - 6000;
            cq40Var.a = j3;
            if (j3 < 0) {
                cq40Var.a = 2000L;
            }
            new m2(cq40Var, this).start();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public final String g1(RainTopicResponse rainTopicResponse) {
        HashMap map = new HashMap();
        String strM1 = m1(R.string.currencySymbol);
        op5 op5Var = op5.a;
        String str = this.y0;
        op5Var.getClass();
        String upperCase = op5.i(str).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        map.put(strM1, "<b><font color=\"#ffc820\">" + upperCase + "</font></b>");
        String strM2 = m1(R.string.totalFreeBetValue);
        TreeMap treeMap = pw.a;
        Double totalFreeBetValue = rainTopicResponse.getTotalFreeBetValue();
        String strB = pw.b(totalFreeBetValue != null ? String.valueOf(totalFreeBetValue.doubleValue()) : null);
        if (strB == null) {
            strB = "";
        }
        map.put(strM2, "<b><font color=\"#ffc820\">" + strB + "</font></b>");
        return op5.b(m1(R.string.cms_rain_started_text), m1(R.string.default_rain_started_text), map);
    }

    public abstract void g2();

    public final void g3(String str) {
        try {
            List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{":"}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(l48.r(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            int iIntValue = ((Number) arrayList.get(0)).intValue();
            int iIntValue2 = ((Number) arrayList.get(1)).intValue();
            cq40 cq40Var = new cq40();
            long j3 = (((long) ((iIntValue * 60) + iIntValue2)) * 1000) - 6000;
            cq40Var.a = j3;
            if (j3 < 0) {
                cq40Var.a = 2000L;
            }
            new n2(cq40Var, this).start();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public final String h1(RainTopicResponse rainTopicResponse) {
        HashMap map = new HashMap();
        String strM1 = m1(R.string.currencySymbol);
        op5 op5Var = op5.a;
        String str = this.y0;
        op5Var.getClass();
        String upperCase = op5.i(str).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        map.put(strM1, "<b><font color=\"#f2c844\">" + upperCase + "</font></b>");
        String strM2 = m1(R.string.totalFreeBetValue);
        TreeMap treeMap = pw.a;
        Double totalFreeBetValue = rainTopicResponse.getTotalFreeBetValue();
        String strB = pw.b(totalFreeBetValue != null ? String.valueOf(totalFreeBetValue.doubleValue()) : null);
        if (strB == null) {
            strB = "";
        }
        map.put(strM2, "<b><font color=\"#f2c844\">" + strB + "</font></b>");
        String strM3 = m1(R.string.upcomingRainTimeRemainingSeconds);
        String startTime = rainTopicResponse.getStartTime();
        map.put(strM3, k94.i(startTime != null ? startTime : ""));
        return op5.b(m1(R.string.cms_rain_starting_text), m1(R.string.default_rain_starting_text), map);
    }

    public abstract void h2();

    public final void h3() {
        loa0 loa0VarK1 = k1();
        String str = this.I;
        if (str == null) {
            str = "";
        }
        loa0VarK1.getClass();
        usm usmVar = loa0VarK1.b;
        if (!usmVar.c()) {
            loa0VarK1.x1();
            loa0VarK1.f = ej5.c(o8i0.d(loa0VarK1), null, null, new koa0(loa0VarK1, null), 3);
            jvd0 jvd0Var = loa0VarK1.d;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            loa0VarK1.d = ej5.c(o8i0.d(loa0VarK1), null, null, new joa0(loa0VarK1, null), 3);
            loa0VarK1.e = ej5.c(o8i0.d(loa0VarK1), null, null, new ioa0(loa0VarK1, null), 3);
            g0n g0nVar = loa0VarK1.a;
            usmVar.b(g0nVar.b().concat(str), g0nVar.a());
        }
        this.v0 = true;
    }

    public final lw30 i1() {
        return (lw30) this.L0.getValue();
    }

    /* JADX INFO: renamed from: i2 */
    public String getA2() {
        return null;
    }

    public final int i3(View view) {
        Window window;
        View decorView;
        l8j0 l8j0VarA;
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        l8j0 l8j0VarA2 = r6i0.e.a(view);
        Integer num = null;
        if (l8j0VarA2 != null) {
            int i3 = l8j0VarA2.a.h(129).b;
            if (i3 < 0) {
                i3 = 0;
            }
            Integer numValueOf = Integer.valueOf(i3);
            if (i3 <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null && (l8j0VarA = r6i0.e.a(decorView)) != null) {
            int i4 = l8j0VarA.a.h(129).b;
            if (i4 < 0) {
                i4 = 0;
            }
            Integer numValueOf2 = Integer.valueOf(i4);
            if (i4 > 0) {
                num = numValueOf2;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public void j0(int i3, int i4, androidx.compose.runtime.a aVar, Function0 function0) {
        function0.getClass();
        aVar.N(-1915661464);
        afa.c((String) ((x5a0) c1().v).getValue(), b1(), ((Boolean) ((x5a0) c1().l0).getValue()).booleanValue(), i3, function0, 0.0d, false, false, aVar, 0, 224);
        aVar.H();
    }

    public final t290 j1() {
        return (t290) this.c.getValue();
    }

    /* JADX INFO: renamed from: j2 */
    public CampaignParticipateV2 getZ2() {
        return null;
    }

    public final void j3() {
        z0();
        Boolean bool = Boolean.FALSE;
        ((x5a0) this.E1).setValue(bool);
        ((x5a0) this.F1).setValue(bool);
        ((x5a0) X0().D).setValue(Boolean.TRUE);
        ((x5a0) q8b.d.b).setValue(bool);
        gvi gviVar = this.z;
        this.M1 = gviVar != null && gviVar.Y.getVisibility() == 0;
        GameDetails gameDetails = this.i;
        wz.a("GameBackground", gameDetails != null ? gameDetails.getName() : null, new String[0]);
    }

    public final loa0 k1() {
        return (loa0) this.L.getValue();
    }

    public final boolean k2() {
        String str = (String) ((x5a0) c1().v).getValue();
        return Intrinsics.g(str, "sporty-jet") || Intrinsics.g(str, "sporty jet") || Intrinsics.g(str, "galaxy-go") || Intrinsics.g(str, "galaxy go") || Intrinsics.g(str, "sporty-kick") || Intrinsics.g(str, "sporty kick") || Intrinsics.g(str, "sporty-hero") || Intrinsics.g(str, "Sporty Hero") || Intrinsics.g(str, "sporty-cars") || Intrinsics.g(str, "sporty cars");
    }

    public final ypa0 l1() {
        return (ypa0) this.K.getValue();
    }

    public final boolean l2() {
        FragmentManager supportFragmentManager;
        androidx.fragment.app.e activity = getActivity();
        Fragment fragmentH = null;
        if ((activity != null ? activity.getSupportFragmentManager() : null) != null) {
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null && (supportFragmentManager = activity2.getSupportFragmentManager()) != null) {
                fragmentH = supportFragmentManager.H("RainV2Fragment");
            }
            if (fragmentH != null && fragmentH.isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void l3(String str, boolean z2) {
        if (!z2) {
            ytw<Boolean> ytwVar = c1().c0;
            Boolean bool = Boolean.FALSE;
            ((x5a0) ytwVar).setValue(bool);
            ((x5a0) c1().b0).setValue(bool);
        }
        if (str.length() > 0) {
            tv30[] tv30VarArr = tv30.a;
            if (!str.equals("upcoming")) {
                if (str.equals("active")) {
                    ((x5a0) c1().c0).setValue(Boolean.FALSE);
                    ((x5a0) c1().b0).setValue(Boolean.TRUE);
                    return;
                }
                return;
            }
            ((x5a0) c1().c0).setValue(Boolean.TRUE);
            ((x5a0) c1().b0).setValue(Boolean.FALSE);
            RainTopicResponse rainTopicResponse = this.x1;
            String startTime = rainTopicResponse != null ? rainTopicResponse.getStartTime() : null;
            if (startTime == null) {
                startTime = "";
            }
            List listSplit$default = StringsKt__StringsKt.split$default(k94.f(startTime), new String[]{":"}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(l48.r(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            new hhb(((long) ((((Number) arrayList.get(0)).intValue() * 60) + ((Number) arrayList.get(1)).intValue())) * 1000, this).start();
        }
    }

    public final void m0(final int i3, final int i4, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(890012765);
        int i5 = (bVarI.d(i3) ? 4 : 2) | i4 | (bVarI.A(this) ? 32 : 16);
        if (bVarI.q(i5 & 1, (i5 & 19) != 18)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            View view = (View) bVarI.O(AndroidCompositionLocals_androidKt.f);
            context.getClass();
            final Activity activity = (Activity) context;
            if (view.isInEditMode()) {
                bVarI.N(1189974821);
            } else {
                bVarI.N(1537405275);
                boolean zA = bVarI.A(this) | bVarI.A(activity) | ((i5 & 14) == 4);
                Object objY = bVarI.y();
                if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new Function0(this) { // from class: qeb
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Activity activity2 = activity;
                            Window window = activity2.getWindow();
                            qlf.d(activity2);
                            window.getClass();
                            qlf.c(window, activity2.getColor(i3));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                use useVar = xvf.a;
                bVarI.t((Function0) objY);
            }
            bVarI.X(false);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i3, i4) { // from class: reb
                public final /* synthetic */ int b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.m0(this.b, iA, (a) obj);
                    return Unit.a;
                }
            };
        }
    }

    public final String m1(int i3) {
        String string;
        try {
            Context context = getContext();
            return (context == null || (string = context.getString(i3)) == null) ? "" : string;
        } catch (Exception unused) {
        }
    }

    public final void m2() {
        try {
            String str = SportyGamesManager.getInstance().getUser().a;
            pzf0.b(str);
            if (!str.equals("API_RETURN_NULL") && !str.equals("testing_access_token") && str.length() != 0) {
                int i3 = this.n2;
                if (i3 >= 1) {
                    this.n2 = 0;
                    this.F0 = true;
                    SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                    return;
                } else {
                    this.n2 = i3 + 1;
                    z0();
                    o2();
                    return;
                }
            }
            if (this.F0) {
                return;
            }
            this.F0 = true;
            SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
        } catch (Exception unused) {
        }
    }

    public final void m3() {
        gvi gviVar;
        if (this.A || (gviVar = this.z) == null) {
            return;
        }
        gviVar.Y.M(100);
    }

    public abstract void n0(RoundResponse roundResponse);

    public final ln1 n1() {
        return (ln1) this.M.getValue();
    }

    public final void n2() {
        S0().S1(true);
        R0().S1(true);
        ((x5a0) this.j1).setValue(Boolean.FALSE);
        R0().R1(false);
        S0().R1(false);
        Z0().g(false);
    }

    public void o0(List<DetailResponse> list) {
        DetailResponse detailResponse;
        DetailResponse detailResponse2;
        if (list != null && (detailResponse2 = (DetailResponse) CollectionsKt.V(0, list)) != null) {
            R0().L1(detailResponse2);
        }
        if (list == null || (detailResponse = (DetailResponse) CollectionsKt.V(1, list)) == null) {
            return;
        }
        S0().L1(detailResponse);
    }

    public final lei0 o1() {
        return (lei0) this.V.getValue();
    }

    public final void o2() {
        try {
            Context context = getContext();
            if (context != null) {
                fdt fdtVarA = fdt.a(context);
                chb chbVar = this.h1;
                if (chbVar == null) {
                    Intrinsics.n("mServiceReceiver");
                    throw null;
                }
                fdtVarA.d(chbVar);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("cashoutCall");
                intentFilter.addAction("playCashout");
                intentFilter.addAction("soundOn");
                intentFilter.addAction("fairnessCall");
                intentFilter.addAction("appBackground");
                fdt fdtVarA2 = fdt.a(context);
                chb chbVar2 = this.h1;
                if (chbVar2 == null) {
                    Intrinsics.n("mServiceReceiver");
                    throw null;
                }
                fdtVarA2.b(chbVar2, intentFilter);
            }
            if (!this.s0) {
                h3();
            }
            this.s0 = false;
            ((x5a0) Y0().i).setValue(Boolean.FALSE);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof mke) {
            this.q1 = (mke) context;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:60:0x0103  */
    /* JADX WARN: Code duplicated, block: B:63:0x010b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0113  */
    /* JADX WARN: Code duplicated, block: B:66:0x0117  */
    /* JADX WARN: Code duplicated, block: B:69:0x0128  */
    /* JADX WARN: Code duplicated, block: B:72:0x0143 A[LOOP:0: B:70:0x013d->B:72:0x0143, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0161  */
    /* JADX WARN: Code duplicated, block: B:86:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x015f A[SYNTHETIC] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        androidx.fragment.app.e activity;
        boolean zBooleanValue;
        Intent intent;
        androidx.fragment.app.e activity2;
        Intent intent2;
        Object obj;
        String string;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        int size;
        int i3;
        Object obj2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean zBooleanValue2 = false;
        boolean z2 = true;
        if (arguments == null) {
            activity = getActivity();
            if (activity == null && (intent = activity.getIntent()) != null && intent.hasExtra("betcontainer_clean")) {
                Bundle extras = intent.getExtras();
                Object obj3 = extras != null ? extras.get("betcontainer_clean") : null;
                if (obj3 instanceof Boolean) {
                    zBooleanValue = ((Boolean) obj3).booleanValue();
                } else if (obj3 instanceof String) {
                    String string2 = StringsKt.t0((String) obj3).toString();
                    if (string2.length() == 0) {
                        zBooleanValue = true;
                    } else {
                        List listSplit$default = StringsKt__StringsKt.split$default(string2, new String[]{","}, false, 0, 6, null);
                        ArrayList arrayList3 = new ArrayList(l48.r(listSplit$default, 10));
                        Iterator it2 = listSplit$default.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(StringsKt.t0((String) it2.next()).toString());
                        }
                        ArrayList arrayList4 = new ArrayList();
                        int size2 = arrayList3.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            Object obj4 = arrayList3.get(i4);
                            i4++;
                            if (((String) obj4).length() > 0) {
                                arrayList4.add(obj4);
                            }
                        }
                        if (ay0.s(String.valueOf(SportyGamesManager.getInstance().getVersionCode()), (String[]) arrayList4.toArray(new String[0]))) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    }
                } else {
                    zBooleanValue = true;
                }
            } else {
                zBooleanValue = true;
            }
        } else {
            if (!arguments.containsKey("betcontainer_clean")) {
                arguments = null;
            }
            if (arguments != null) {
                zBooleanValue = arguments.getBoolean("betcontainer_clean");
            } else {
                activity = getActivity();
                if (activity == null) {
                    zBooleanValue = true;
                } else {
                    zBooleanValue = true;
                }
            }
        }
        this.j0 = zBooleanValue;
        Bundle arguments2 = getArguments();
        if (arguments2 == null) {
            activity2 = getActivity();
            if (activity2 != null && (intent2 = activity2.getIntent()) != null) {
                if (intent2.hasExtra("fbgdialog_old")) {
                    Bundle extras2 = intent2.getExtras();
                    obj = extras2 != null ? extras2.get("fbgdialog_old") : null;
                    if (obj instanceof Boolean) {
                        zBooleanValue2 = ((Boolean) obj).booleanValue();
                    } else if (obj instanceof String) {
                        string = StringsKt.t0((String) obj).toString();
                        if (string.length() == 0) {
                            zBooleanValue2 = true;
                        } else {
                            List listSplit$default2 = StringsKt__StringsKt.split$default(string, new String[]{","}, false, 0, 6, null);
                            arrayList = new ArrayList(l48.r(listSplit$default2, 10));
                            it = listSplit$default2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(StringsKt.t0((String) it.next()).toString());
                            }
                            arrayList2 = new ArrayList();
                            size = arrayList.size();
                            i3 = 0;
                            while (i3 < size) {
                                obj2 = arrayList.get(i3);
                                i3++;
                                if (((String) obj2).length() > 0) {
                                    arrayList2.add(obj2);
                                }
                            }
                            if (!ay0.s(String.valueOf(SportyGamesManager.getInstance().getVersionCode()), (String[]) arrayList2.toArray(new String[0]))) {
                                zBooleanValue2 = true;
                            }
                        }
                    } else {
                        zBooleanValue2 = true;
                    }
                } else {
                    zBooleanValue2 = true;
                }
                z2 = zBooleanValue2;
            }
        } else {
            if (!arguments2.containsKey("fbgdialog_old")) {
                arguments2 = null;
            }
            if (arguments2 != null) {
                z2 = arguments2.getBoolean("fbgdialog_old");
            } else {
                activity2 = getActivity();
                if (activity2 != null) {
                    if (intent2.hasExtra("fbgdialog_old")) {
                        Bundle extras3 = intent2.getExtras();
                        if (extras3 != null) {
                        }
                        if (obj instanceof Boolean) {
                            zBooleanValue2 = ((Boolean) obj).booleanValue();
                        } else if (obj instanceof String) {
                            string = StringsKt.t0((String) obj).toString();
                            if (string.length() == 0) {
                                zBooleanValue2 = true;
                            } else {
                                List listSplit$default3 = StringsKt__StringsKt.split$default(string, new String[]{","}, false, 0, 6, null);
                                arrayList = new ArrayList(l48.r(listSplit$default3, 10));
                                it = listSplit$default3.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(StringsKt.t0((String) it.next()).toString());
                                }
                                arrayList2 = new ArrayList();
                                size = arrayList.size();
                                i3 = 0;
                                while (i3 < size) {
                                    obj2 = arrayList.get(i3);
                                    i3++;
                                    if (((String) obj2).length() > 0) {
                                        arrayList2.add(obj2);
                                    }
                                }
                                if (!ay0.s(String.valueOf(SportyGamesManager.getInstance().getVersionCode()), (String[]) arrayList2.toArray(new String[0]))) {
                                    zBooleanValue2 = true;
                                }
                            }
                        } else {
                            zBooleanValue2 = true;
                        }
                    } else {
                        zBooleanValue2 = true;
                    }
                    z2 = zBooleanValue2;
                }
            }
        }
        this.k0 = z2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            zpe0 zpe0Var = zpe0.a;
            elf.a(activity, new aqe0(0, 0, 2, zpe0Var), new aqe0(0, 0, 2, zpe0Var));
        }
        try {
            gvi gviVarA = gvi.a(layoutInflater);
            this.z = gviVarA;
            return gviVarA.a;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        Context context;
        super.onDestroy();
        loa0 loa0VarK1 = k1();
        loa0VarK1.x1();
        loa0VarK1.b.e();
        G0();
        if (getView() != null) {
            k1().J.l(getViewLifecycleOwner());
        }
        if (this.h1 != null && (context = getContext()) != null) {
            fdt fdtVarA = fdt.a(context);
            chb chbVar = this.h1;
            if (chbVar == null) {
                Intrinsics.n("mServiceReceiver");
                throw null;
            }
            fdtVarA.d(chbVar);
        }
        this.z = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (getView() != null) {
            k1().J.l(getViewLifecycleOwner());
        }
        loa0 loa0VarK1 = k1();
        loa0VarK1.x1();
        loa0VarK1.b.e();
        G0();
        SportyGamesManager.getInstance().removeAccountUpdatedListener(this);
        gvi gviVar = this.z;
        if (gviVar != null) {
            ProgressMeterComponent progressMeterComponent = gviVar.Y;
            e9p e9pVar = progressMeterComponent.I;
            if (e9pVar != null) {
                e9pVar.cancel((CancellationException) null);
            }
            progressMeterComponent.L();
        }
        xbg xbgVar = this.G0;
        if (xbgVar != null) {
            xbgVar.dismiss();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        androidx.fragment.app.e activity = getActivity();
        if (activity != null && activity.isFinishing() && this.z != null) {
            l1().I1();
        }
        if (this.t0) {
            return;
        }
        X1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        String name;
        if (this.t0) {
            try {
                SharedPreferences sharedPreferences = this.H;
                Object objValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean(((String[]) ((x5a0) c1().B).getValue())[0], true)) : null;
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.g(objValueOf, bool) && !this.p0 && !this.q0) {
                    c2();
                } else if (Intrinsics.g(objValueOf, bool) && this.p0) {
                    g2();
                } else if (Intrinsics.g(objValueOf, bool)) {
                    f2();
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        } else {
            this.R1 = false;
            this.T1 = false;
            if (!this.s0) {
                this.G = true;
                R0().U1(true);
                S0().U1(true);
            }
            ((x5a0) X0().D).setValue(Boolean.FALSE);
            GameDetails gameDetails = this.i;
            wz.a("GameForeground", gameDetails != null ? gameDetails.getName() : null, new String[0]);
            if (this.M1) {
                s0();
            } else {
                o2();
            }
            try {
                gvi gviVar = this.z;
                if (gviVar == null || gviVar.Y.getVisibility() != 0) {
                    a1();
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            ((x5a0) c1().i0).setValue(Boolean.FALSE);
            ((x5a0) c1().j0).setValue(Boolean.TRUE);
            if (Q0()) {
                try {
                    GameDetails gameDetails2 = this.i;
                    if (gameDetails2 == null || (name = gameDetails2.getName()) == null) {
                        name = "";
                    }
                    String str = name;
                    androidx.fragment.app.e activity = getActivity();
                    ibs viewLifecycleOwner = getViewLifecycleOwner();
                    viewLifecycleOwner.getClass();
                    gvi gviVar2 = this.z;
                    int i3 = 0;
                    ra6.b(str, activity, viewLifecycleOwner, gviVar2 != null ? gviVar2.L : null, this.g2, d1(), (db6) this.f2.getValue(), p58.b, null, new tld0(this.i, new Function0() { // from class: vbb
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            fgb fgbVar = this.a;
                            return Boolean.valueOf(((BetContainerState) fgbVar.R0().a.getValue()).getBetPlaced() || ((BetContainerState) fgbVar.S0().a.getValue()).getBetPlaced());
                        }
                    }, new g(0, this, fgb.class, "showActiveBetsToast", "showActiveBetsToast()V", 0)), new Function1() { // from class: fcb
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            fgb fgbVar = this.a;
                            CampaignTopicResponse campaignTopicResponse = (CampaignTopicResponse) obj;
                            try {
                                fgbVar.h2 = campaignTopicResponse != null;
                                if (campaignTopicResponse != null) {
                                    if (!Intrinsics.g(campaignTopicResponse.getMessageType(), "ACTIVITY_INIT") && campaignTopicResponse.getCampaignCompletedJustNow()) {
                                        fgbVar.X2();
                                    }
                                    fgbVar.N1(campaignTopicResponse);
                                }
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                            return Unit.a;
                        }
                    }, new pcb(this, i3), new ycb(this, i3), 1536);
                    d1().x1();
                    d1();
                    d1().e.f(getViewLifecycleOwner(), new v(new peb(this, 0)));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
        if (this.u0) {
            this.t0 = false;
            this.u0 = false;
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        if (!this.t0) {
            j3();
        }
        if (this.z != null) {
            l1().I1();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Resources resources;
        String[] stringArray;
        Resources resources2;
        String[] stringArray2;
        ssw<Integer> liveData;
        view.getClass();
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null) {
            this.H = un20.a(context);
        }
        CampaignParticipateV2 campaignParticipateV2J2 = getZ2();
        int i3 = 1;
        if (campaignParticipateV2J2 != null && campaignParticipateV2J2.getCanConvert()) {
            q8i0 q8i0Var = this.v;
            ((defpackage.q) q8i0Var.getValue()).c.f(getViewLifecycleOwner(), new v(new qd7(this, i3)));
            defpackage.q qVar = (defpackage.q) q8i0Var.getValue();
            int campaignId = campaignParticipateV2J2.getCampaignId();
            int variantId = campaignParticipateV2J2.getVariantId();
            qVar.c.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 30, null));
            ej5.c(o8i0.d(qVar), null, null, new defpackage.r(qVar, campaignId, variantId, null), 3);
            c1().n0 = new rd7(this, i3);
        }
        if (Q2()) {
            c1().o0 = new qdb(this);
        }
        if (R2()) {
            c1().p0 = new oeb(this);
        }
        NetworkStateManager.INSTANCE.observeNetworkState().f(getViewLifecycleOwner(), new v(new md7(this, i3)));
        SportyGamesManager.getInstance().addAccountUpdatedListener(this);
        int i4 = 0;
        ((dug0) this.H1.getValue()).a.f(getViewLifecycleOwner(), new v(new sdb(this, i4)));
        getParentFragmentManager().n0("exit_dialog_result", getViewLifecycleOwner(), new qxi() { // from class: jeb
            @Override // defpackage.qxi
            public final void a(String str, Bundle bundle2) {
                bundle2.getClass();
                if (Intrinsics.g(bundle2.getString("action"), "stay")) {
                    ((x5a0) this.a.c1().i0).setValue(Boolean.FALSE);
                }
            }
        });
        try {
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                String str = ((db6) this.f2.getValue()).c;
                if (str == null) {
                    str = "Ongoing";
                }
                this.g2 = new z66(activity, str);
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        SharedPreferences sharedPreferences = this.H;
        this.J = sharedPreferences != null ? sharedPreferences.edit() : null;
        this.h1 = new chb(this);
        ytw ytwVarB = androidx.compose.runtime.m.b(null);
        qry.a(view, new h(view, ytwVarB));
        gvi gviVar = this.z;
        u6i0.c cVar = u6i0.c.a;
        if (gviVar != null) {
            ComposeView composeView = gviVar.b0;
            composeView.setViewCompositionStrategy(cVar);
            composeView.setContent(new op8(-421055019, new Function2() { // from class: ueb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i5 = 1;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarB = androidx.compose.foundation.a.b(j.c(j.g(d.a.b, 1.0f), 1.0f), j58.l, zk40.a);
                        aiv aivVarC = g75.c(ht.a.e, false);
                        int iHashCode = Long.hashCode(aVar.m());
                        ne00 ne00VarO = aVar.o();
                        d dVarC = androidx.compose.ui.c.c(aVar, dVarB);
                        yka.k.getClass();
                        tsr.a aVar2 = yka.a.b;
                        if (aVar.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar.D();
                        if (aVar.g()) {
                            aVar.F(aVar2);
                        } else {
                            aVar.p();
                        }
                        hlh0.a(aVar, aivVarC, yka.a.f);
                        hlh0.a(aVar, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar, iHashCode, c1350a);
                        }
                        hlh0.a(aVar, dVarC, yka.a.d);
                        final fgb fgbVar = this.a;
                        wwd0 wwd0Var = fgbVar.Y0().z;
                        m28 m28VarX0 = fgbVar.X0();
                        mz1 mz1Var = (mz1) ((x5a0) fgbVar.c1().e0).getValue();
                        cj5 cj5Var = (cj5) ((x5a0) fgbVar.c1().f0).getValue();
                        boolean zA = aVar.A(fgbVar);
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new nd7(fgbVar, i5);
                            aVar.r(objY);
                        }
                        Function1 function1 = (Function1) objY;
                        boolean zA2 = aVar.A(fgbVar);
                        Object objY2 = aVar.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new Function0() { // from class: odb
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    fgbVar.n2();
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY2);
                        }
                        lja.a(wwd0Var, m28VarX0, mz1Var, cj5Var, function1, (Function0) objY2, (String) ((x5a0) fgbVar.c1().v).getValue(), aVar, 12582912);
                        aVar.s();
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar2 = this.z;
        if (gviVar2 != null) {
            ComposeView composeView2 = gviVar2.R;
            composeView2.setViewCompositionStrategy(cVar);
            composeView2.setContent(new op8(273591988, new efb(this, ytwVarB, i4), true));
        }
        gvi gviVar3 = this.z;
        if (gviVar3 != null) {
            ComposeView composeView3 = gviVar3.E;
            composeView3.setViewCompositionStrategy(cVar);
            composeView3.setContent(new op8(968238995, new Function2() { // from class: pfb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i5 = 0;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        orp.a(sjj.a(), pp8.b(-304912172, new rdb(this.a, i5), aVar), aVar, 48);
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar4 = this.z;
        if (gviVar4 != null) {
            ComposeView composeView4 = gviVar4.u0;
            composeView4.setViewCompositionStrategy(cVar);
            composeView4.setContent(new op8(1662886002, new Function2() { // from class: zfb
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        fgb fgbVar = this.a;
                        if (((Boolean) ((x5a0) fgbVar.c1().r0).getValue()).booleanValue() && ((Boolean) ((x5a0) fgbVar.c1().h0).getValue()).booleanValue() && ((CharSequence) ((x5a0) fgbVar.c1().s0).getValue()).length() > 0) {
                            aVar.N(884279799);
                            z3w.a(0, fgbVar.b1(), aVar, (String) ((x5a0) fgbVar.c1().s0).getValue());
                        } else {
                            aVar.N(834664144);
                        }
                        aVar.H();
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar5 = this.z;
        if (gviVar5 != null) {
            ComposeView composeView5 = gviVar5.G;
            String strD0 = D0("");
            H2(composeView5, strD0);
            gvi gviVar6 = this.z;
            if (gviVar6 != null) {
                J2(gviVar6.b0, strD0);
            }
            composeView5.setViewCompositionStrategy(cVar);
            composeView5.setContent(new op8(-1937434287, new e9b(i4, ytwVarB, this), true));
        }
        this.M1 = true;
        if (S2() && !this.O1 && this.N1 == null) {
            this.N1 = Long.valueOf(SystemClock.elapsedRealtime());
        }
        gvi gviVar7 = this.z;
        if (gviVar7 != null) {
            gviVar7.Y.setVisibility(0);
        }
        ((x5a0) c1().Z).setValue(Boolean.FALSE);
        gvi gviVar8 = this.z;
        if (gviVar8 != null) {
            gviVar8.Y.setProgressForApi(12);
        }
        gvi gviVar9 = this.z;
        if (gviVar9 != null) {
            gviVar9.Y.setCurrentProgress(4);
        }
        gvi gviVar10 = this.z;
        if (gviVar10 != null && (liveData = gviVar10.Y.getLiveData()) != null) {
            liveData.f(getViewLifecycleOwner(), new v(new idb(this, i4)));
        }
        androidx.fragment.app.e activity2 = getActivity();
        if (activity2 != null) {
            l1();
            this.G0 = new xbg(activity2, (String) ((x5a0) c1().D).getValue());
        }
        hh7 hh7Var = (hh7) this.I1.getValue();
        hh7Var.getClass();
        ej5.c(o8i0.d(hh7Var), null, null, new nh7(hh7Var, null), 3);
        e5h e5hVar = (e5h) this.T.getValue();
        String str2 = (String) ((x5a0) c1().z).getValue();
        e5hVar.getClass();
        str2.getClass();
        ej5.c(o8i0.d(e5hVar), null, null, new d5h(e5hVar, null), 3);
        Context context2 = getContext();
        ArrayList arrayList = this.m0;
        if (context2 != null && (resources2 = context2.getResources()) != null && (stringArray2 = resources2.getStringArray(R.array.cms_array)) != null) {
            arrayList.addAll(ay0.U(stringArray2));
            if (Q0()) {
                arrayList.add("sg_campaign");
            }
        }
        aig0 aig0Var = (aig0) this.U.getValue();
        String str3 = (String) ((x5a0) c1().z).getValue();
        aig0Var.getClass();
        str3.getClass();
        ej5.c(o8i0.d(aig0Var), null, null, new xhg0(aig0Var, null), 3);
        lei0 lei0VarO1 = o1();
        String str4 = (String) ((x5a0) c1().z).getValue();
        lei0VarO1.getClass();
        str4.getClass();
        ej5.c(o8i0.d(lei0VarO1), null, null, new kei0(lei0VarO1, null), 3);
        Context context3 = getContext();
        if (context3 != null && (resources = context3.getResources()) != null && (stringArray = resources.getStringArray(R.array.cms_array)) != null) {
            arrayList.addAll(ay0.U(stringArray));
        }
        gvi gviVar11 = this.z;
        if (gviVar11 != null) {
            gviVar11.F.setOnClickListener(new View.OnClickListener() { // from class: n9b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.a.r1();
                }
            });
        }
        float f3 = getResources().getDisplayMetrics().density * 16.0f;
        gvi gviVar12 = this.z;
        C0(gviVar12 != null ? gviVar12.v : null, f3);
        gvi gviVar13 = this.z;
        C0(gviVar13 != null ? gviVar13.w : null, f3);
        gvi gviVar14 = this.z;
        C0(gviVar14 != null ? gviVar14.o0 : null, f3);
        gvi gviVar15 = this.z;
        C0(gviVar15 != null ? gviVar15.e0 : null, f3);
        msj.l.f(getViewLifecycleOwner(), new v(new ndb(this, i4)));
        ej5.c(ebs.a(getLifecycle()), null, null, new pgb(this, null), 3);
    }

    public final void p0(ul2 ul2Var, BetData betData, Long l3) {
        String strY1;
        String giftId;
        Double partialBal;
        boolean z2;
        qdb qdbVar;
        ul2Var.getClass();
        betData.getClass();
        wwd0 wwd0Var = ul2Var.a;
        if (((BetContainerState) wwd0Var.getValue()).getTopBets().getRoundId() >= this.z0 || ((BetContainerState) wwd0Var.getValue()).getBetInProgress() || (strY1 = Y1(ul2Var)) == null) {
            return;
        }
        ((x5a0) this.j1).setValue(Boolean.FALSE);
        int i3 = 0;
        Z0().g(false);
        ul2Var.R1(false);
        ul2Var.I1(true);
        ul2Var.H1(false);
        Double cashOutValue = betData.getCashOutValue();
        ((x5a0) ul2Var.c).setValue(Boolean.valueOf(cashOutValue != null));
        if (egb.a((BetContainerState) wwd0Var.getValue()) > 0) {
            Double partialBal2 = ((BetContainerState) wwd0Var.getValue()).getGift().getPartialBal();
            partialBal = (partialBal2 != null ? partialBal2.doubleValue() : 0.0d) > 0.0d ? ((BetContainerState) wwd0Var.getValue()).getGift().getPartialBal() : Double.valueOf(((BetContainerState) wwd0Var.getValue()).getGift().getCurBal());
            giftId = ((BetContainerState) wwd0Var.getValue()).getGift().getGiftId();
        } else {
            giftId = null;
            partialBal = null;
        }
        double minAmount = ((BetContainerState) wwd0Var.getValue()).getDetailResponse().getMinAmount();
        Double betValue = betData.getBetValue();
        if (betValue != null) {
            if (betValue.doubleValue() < minAmount) {
                betValue = null;
            }
            if (betValue != null) {
                minAmount = betValue.doubleValue();
            }
        }
        MultiplierResponse multiplierResponse = this.x0;
        String messageType = multiplierResponse != null ? multiplierResponse.getMessageType() : null;
        if (messageType == null) {
            messageType = "";
        }
        PlaceBetRequest placeBetRequestCreateOrNull = PlaceBetRequest.INSTANCE.createOrNull(String.valueOf(minAmount), ((BetContainerState) wwd0Var.getValue()).getDetailResponse().getBetCategoryType(), ((BetContainerState) wwd0Var.getValue()).getDetailResponse().getBetIndex(), strY1, this.z0, giftId, partialBal, cashOutValue, this.h2, this.U0, Boolean.valueOf(xxm.a(ul2Var, this.A0, messageType)), Boolean.valueOf(iex.a(ul2Var, this.A0, messageType)));
        if (placeBetRequestCreateOrNull == null) {
            ul2Var.I1(false);
            return;
        }
        this.Y1 = placeBetRequestCreateOrNull;
        String strJ = new eal().j(placeBetRequestCreateOrNull);
        if (k1().I1(placeBetRequestCreateOrNull.getBetIndex(), strJ, String.valueOf(placeBetRequestCreateOrNull.getRoundId()), new yfb(i3, this, strJ)) && l3 != null && (qdbVar = c1().o0) != null) {
            qdbVar.invoke(Long.valueOf(SystemClock.elapsedRealtime() - l3.longValue()));
        }
        Q1(placeBetRequestCreateOrNull.getBetAmount());
        if (((BetContainerState) wwd0Var.getValue()).getAutoBetFlag() && ((BetContainerState) wwd0Var.getValue()).getDetailResponse().getBetIndex() == 1) {
            ((u5a0) ul2Var.M).k(1);
        }
        if (((BetContainerState) wwd0Var.getValue()).getAutoBetFlag() && ((BetContainerState) wwd0Var.getValue()).getDetailResponse().getBetIndex() == 2) {
            z2 = true;
            ((u5a0) S0().M).k(1);
        } else {
            z2 = true;
        }
        ul2Var.I1(z2);
        d2();
        GameDetails gameDetails = this.i;
        wz.a("BetPlaced", gameDetails != null ? gameDetails.getName() : null, "1", "On");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    public final void p1(ClaimRainResponse claimRainResponse) {
        ClaimError claimError;
        ClaimError claimError2;
        RainClaimErrorUi.Toast toast;
        Integer wagerPeriodMinutes;
        Float minimumCashoutCoefficient;
        Double minimumWagerAmount;
        String currency;
        Double minimumBalance;
        String currency2;
        Integer claimLimitationPeriod;
        Integer claimLimitation;
        Integer claimLimitation2;
        int i3 = 0;
        List<ClaimError> errors = claimRainResponse.getErrors();
        if (errors == null || (claimError = (ClaimError) CollectionsKt.firstOrNull(errors)) == null) {
            return;
        }
        Integer bizCode = claimError.getBizCode();
        ?? liveDataToast = 0;
        liveDataToast = 0;
        String strValueOf = bizCode != null ? String.valueOf(bizCode.intValue()) : null;
        String str = "";
        if (strValueOf == null) {
            strValueOf = "";
        }
        wz.a("RainClaimFailed", strValueOf, new String[0]);
        fv30 fv30Var = (fv30) this.v2.getValue();
        sv30 sv30Var = fv30Var.a;
        sv30 sv30Var2 = fv30Var.a;
        List<ClaimError> errors2 = claimRainResponse.getErrors();
        if (errors2 != null && (claimError2 = (ClaimError) CollectionsKt.firstOrNull(errors2)) != null) {
            ClaimErrorParams params = claimError2.getParams();
            Integer bizCode2 = claimError2.getBizCode();
            int i4 = 2;
            if ((bizCode2 != null && bizCode2.intValue() == 5001) || (bizCode2 != null && bizCode2.intValue() == 5000)) {
                toast = new RainClaimErrorUi.Toast(sv30Var2.a(R.string.cms_rain_not_active_error_text, R.string.default_rain_not_active_error_text, null), i3, i4, liveDataToast);
            } else if (bizCode2 != null && bizCode2.intValue() == 5002) {
                toast = new RainClaimErrorUi.Toast(sv30Var2.a(R.string.cms_all_gifts_claimed_text, R.string.default_cms_all_gifts_claimed_text, null), i3, i4, liveDataToast);
            } else if (bizCode2 != null && bizCode2.intValue() == 5003) {
                toast = new RainClaimErrorUi.Toast(sv30Var.a(R.string.cms_claim_limit_error_text, R.string.default_cms_claim_limit_error_text, kpu.d(new Pair(sv30Var.b(R.string.claimLimitation), String.valueOf((params == null || (claimLimitation2 = params.getClaimLimitation()) == null) ? 0 : claimLimitation2.intValue())))), i3, i4, liveDataToast);
            } else if (bizCode2 != null && bizCode2.intValue() == 5004) {
                toast = new RainClaimErrorUi.Toast(sv30Var.a(R.string.claim_limit_duration_error_text, R.string.default_claim_limit_duration_error_text, kpu.d(new Pair(sv30Var.b(R.string.claimLimitation), String.valueOf((params == null || (claimLimitation = params.getClaimLimitation()) == null) ? 0 : claimLimitation.intValue())), new Pair(sv30Var.b(R.string.claimLimitationPeriod), String.valueOf((params == null || (claimLimitationPeriod = params.getClaimLimitationPeriod()) == null) ? 0 : claimLimitationPeriod.intValue())))), i3, i4, liveDataToast);
            } else {
                double dDoubleValue = 0.0d;
                int iIntValue = 1;
                if (bizCode2 != null && bizCode2.intValue() == 5005) {
                    String strB = sv30Var.b(R.string.currency_cms);
                    if (params != null && (currency2 = params.getCurrency()) != null) {
                        str = currency2;
                    }
                    Pair pair = new Pair(strB, str.toString());
                    String strB2 = sv30Var.b(R.string.balance);
                    Locale locale = SportyGamesManager.locale;
                    if (params != null && (minimumBalance = params.getMinimumBalance()) != null) {
                        dDoubleValue = minimumBalance.doubleValue();
                    }
                    toast = new RainClaimErrorUi.Toast(sv30Var.a(R.string.minimum_balance_error_text, R.string.default_minimum_balance_error_text, kpu.d(pair, new Pair(strB2, String.format(locale, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue)}, 1))))), i3, i4, liveDataToast);
                } else if (bizCode2 != null && bizCode2.intValue() == 5006) {
                    if (params != null && (currency = params.getCurrency()) != null) {
                        str = currency;
                    }
                    String string = str.toString();
                    TreeMap treeMap = pw.a;
                    if (params != null && (minimumWagerAmount = params.getMinimumWagerAmount()) != null) {
                        dDoubleValue = minimumWagerAmount.doubleValue();
                    }
                    String strM = pw.m(dDoubleValue);
                    float fFloatValue = (params == null || (minimumCashoutCoefficient = params.getMinimumCashoutCoefficient()) == null) ? 0.0f : minimumCashoutCoefficient.floatValue();
                    String strB3 = sv30Var.b(R.string.wagerPeriodMinutes);
                    if (params != null && (wagerPeriodMinutes = params.getWagerPeriodMinutes()) != null) {
                        iIntValue = wagerPeriodMinutes.intValue();
                    }
                    liveDataToast = new RainClaimErrorUi.LiveDataToast(sv30Var.a(fFloatValue > 0.0f ? R.string.minimum_wager_cashout_error_text : R.string.minimum_wager_error_text_new, fFloatValue > 0.0f ? R.string.default_minimum_wager_cashout_error_text : R.string.default_minimum_wager_error_text_new, kpu.d(new Pair(strB3, String.valueOf(iIntValue)), new Pair(sv30Var.b(R.string.currency_cms), string), new Pair(sv30Var.b(R.string.minimumWagerAmount), strM), new Pair(sv30Var.b(R.string.minimumCashoutCoefficient), String.valueOf(fFloatValue)))), sv30Var.a(R.string.invalid_claim_title, R.string.default_invalid_claim_title, kpu.d(new Pair(sv30Var.b(R.string.currency_cms), string), new Pair(sv30Var.b(R.string.minimumWagerAmount), strM))), 5006);
                } else {
                    toast = new RainClaimErrorUi.Toast(sv30Var2.a(R.string.something_went_wrong_error_text, R.string.default_something_went_wrong_error_text, null), R.color.warn_toast);
                }
            }
            liveDataToast = toast;
        }
        if (liveDataToast instanceof RainClaimErrorUi.Toast) {
            gvi gviVar = this.z;
            if (gviVar != null) {
                RainClaimErrorUi.Toast toast2 = (RainClaimErrorUi.Toast) liveDataToast;
                gviVar.Z.j(ebs.a(getLifecycle()), toast2.getColorRes(), toast2.getText());
                return;
            }
            return;
        }
        if (!(liveDataToast instanceof RainClaimErrorUi.LiveDataToast)) {
            if (liveDataToast == 0) {
                return;
            }
            uhc.a();
        } else {
            ssw<RainToastData> sswVar = qv30.b;
            tv30[] tv30VarArr = tv30.a;
            RainClaimErrorUi.LiveDataToast liveDataToast2 = (RainClaimErrorUi.LiveDataToast) liveDataToast;
            sswVar.j(new RainToastData(0, AnalyticsEvent.BI_TRACKING_KIND_ERROR, liveDataToast2.getMessage(), liveDataToast2.getTitle(), 3000L, 0, null, liveDataToast2.getErrorType()));
        }
    }

    public final void p2() {
        gvi gviVar = this.z;
        if (gviVar != null) {
            gviVar.B.setVisibility(8);
        }
        gvi gviVar2 = this.z;
        if (gviVar2 != null) {
            gviVar2.b0.setVisibility(0);
        }
        gvi gviVar3 = this.z;
        if (gviVar3 != null) {
            gviVar3.L.setVisibility(0);
        }
        gvi gviVar4 = this.z;
        if (gviVar4 != null) {
            gviVar4.k0.setVisibility(0);
        }
    }

    public final Long q0() {
        if (Q2()) {
            return Long.valueOf(SystemClock.elapsedRealtime());
        }
        return null;
    }

    public final void q1(ClaimRainResponse claimRainResponse) {
        t0();
        op5 op5Var = op5.a;
        String strM1 = m1(R.string.cms_rain_gift_claimed_text);
        String strM2 = m1(R.string.default_rain_gift_claimed_text);
        op5Var.getClass();
        String strB = op5.b(strM1, strM2, null);
        RainTopicResponse rainTopicResponse = this.x1;
        String currency = rainTopicResponse != null ? rainTopicResponse.getCurrency() : null;
        if (currency == null) {
            currency = "";
        }
        String strI = op5.i(currency);
        TreeMap treeMap = pw.a;
        RainTopicResponse rainTopicResponse2 = this.x1;
        StringBuilder sbA = ux5.a(strB, " <b><font color=\"#ffc820\">", strI, " ", pw.b(String.valueOf(rainTopicResponse2 != null ? rainTopicResponse2.getFreeBetValue() : null)));
        sbA.append("</font></b>");
        L0(ToastType.CLAIM_RAIN, new f(sbA.toString(), claimRainResponse, this, null));
        GameDetails gameDetails = this.i;
        wz.a("RainClaimed", gameDetails != null ? gameDetails.getName() : null, new String[0]);
    }

    public final void q2(ul2 ul2Var) {
        CashoutRequest cashoutRequest;
        String currentMultiplier;
        String currentMultiplier2;
        Double dH;
        MultiplierResponse multiplierResponse = this.x0;
        if (multiplierResponse != null) {
            multiplierResponse.getCurrentMultiplier();
        }
        MultiplierResponse multiplierResponse2 = this.x0;
        double dDoubleValue = (multiplierResponse2 == null || (currentMultiplier2 = multiplierResponse2.getCurrentMultiplier()) == null || (dH = kotlin.text.b.h(currentMultiplier2)) == null) ? 0.0d : dH.doubleValue();
        MultiplierResponse multiplierResponse3 = this.x0;
        if (multiplierResponse3 == null || (currentMultiplier = multiplierResponse3.getCurrentMultiplier()) == null) {
            cashoutRequest = null;
        } else {
            xsw xswVar = ul2Var.L;
            wwd0 wwd0Var = ul2Var.a;
            cashoutRequest = new CashoutRequest(xswVar.getValue().longValue(), ((BetContainerState) wwd0Var.getValue()).getRoundId(), currentMultiplier, Boolean.FALSE, String.valueOf(System.currentTimeMillis()), this.h2, k3(dDoubleValue, ul2Var), Boolean.valueOf(((BetContainerState) wwd0Var.getValue()).isTurboBet()), Boolean.valueOf(((BetContainerState) wwd0Var.getValue()).isStakeSafeBet() || ((BetContainerState) wwd0Var.getValue()).isStakeSafeApplied()));
        }
        ul2Var.K1(true);
        if (cashoutRequest != null) {
            this.c2 = cashoutRequest;
        }
        if (cashoutRequest != null) {
            final String strJ = new eal().j(cashoutRequest);
            k1().H1(ul2Var.L.getValue().longValue(), strJ, String.valueOf(cashoutRequest.getRoundId()), new Function0() { // from class: zeb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    fgb fgbVar = this.a;
                    cgb.a(fgbVar.e1(), (String) ((x5a0) fgbVar.c1().v).getValue(), "cashout", strJ);
                    return Unit.a;
                }
            });
            GameDetails gameDetails = this.i;
            wz.a("Cashout", gameDetails != null ? gameDetails.getName() : null, "1", "Off", "No");
        }
    }

    public final void r1() {
        ytw<Boolean> ytwVar = this.j1;
        if (((Boolean) ((x5a0) ytwVar).getValue()).booleanValue()) {
            ((x5a0) ytwVar).setValue(Boolean.FALSE);
            R0().R1(false);
            S0().R1(false);
            Z0().g(false);
        }
    }

    public void r2(z83 z83Var, ul2 ul2Var) {
        z83Var.getClass();
        ul2Var.getClass();
        if (isRemoving()) {
            return;
        }
        ytw<z83> ytwVar = ul2Var.T;
        wwd0 wwd0Var = ul2Var.a;
        ((x5a0) ytwVar).setValue(z83Var);
        y2(z83Var, ul2Var);
        if (this.s0 || l2()) {
            if (z83Var == z83.b) {
                Intent intent = new Intent("custom-event-name");
                op5 op5Var = op5.a;
                String string = getString(R.string.cash_out_upper_case_cms);
                string.getClass();
                String string2 = getString(R.string.cashout_text);
                string2.getClass();
                op5Var.getClass();
                String strB = op5.b(string, string2, null);
                String currentMultiplier = ((MultiplierResponse) ((x5a0) ul2Var.b).getValue()).getCurrentMultiplier();
                BigDecimal bigDecimalMin = w0(currentMultiplier != null ? Double.parseDouble(currentMultiplier) : 0.0d, ul2Var.O.getValue().doubleValue()).min(new BigDecimal(String.valueOf(((BetContainerState) wwd0Var.getValue()).getDetailResponse().getMaxPayoutAmount())));
                BigDecimal scale = bigDecimalMin != null ? bigDecimalMin.setScale(2, RoundingMode.HALF_UP) : null;
                if (l2()) {
                    intent.putExtra(EventKeys.ERROR_MESSAGE, strB + "\n " + scale);
                } else {
                    intent.putExtra(EventKeys.ERROR_MESSAGE, strB + "\n" + op5.i(this.y0) + " " + scale);
                }
                intent.putExtra("betIndex", ((BetContainerState) wwd0Var.getValue()).getDetailResponse().getBetIndex());
                Context context = getContext();
                if (context != null) {
                    fdt.a(context).c(intent);
                }
            } else if (z83Var != z83.c) {
                Intent intent2 = new Intent("custom-event-name");
                intent2.putExtra(EventKeys.ERROR_MESSAGE, "");
                intent2.putExtra("betIndex", ((BetContainerState) wwd0Var.getValue()).getDetailResponse().getBetIndex());
                Context context2 = getContext();
                if (context2 != null) {
                    fdt.a(context2).c(intent2);
                }
            }
        }
        if (z83Var == z83.b) {
            if (((BetContainerState) wwd0Var.getValue()).getDetailResponse().getBetIndex() == 1) {
                this.B1 = true;
            } else {
                this.C1 = true;
            }
            if (isRemoving()) {
                return;
            }
            u1(this, this.B1, this.C1);
            return;
        }
        if (((BetContainerState) wwd0Var.getValue()).getDetailResponse().getBetIndex() == 1) {
            this.B1 = false;
        } else {
            this.C1 = false;
        }
        if (!Intrinsics.g(((x5a0) c1().v).getValue(), "galaxy-go") && !Intrinsics.g(((x5a0) c1().v).getValue(), "sporty-kick") && !Intrinsics.g(((x5a0) c1().v).getValue(), "sporty-cars") && !Intrinsics.g(((x5a0) c1().v).getValue(), "crazy-rider") && !Intrinsics.g(((x5a0) c1().v).getValue(), "sporty-skills")) {
            Intrinsics.g(((x5a0) c1().v).getValue(), "sporty-hero");
        }
        if (isRemoving()) {
            return;
        }
        u1(this, this.B1, this.C1);
    }

    public final void s0() {
        String name;
        gvi gviVar = this.z;
        if (gviVar != null) {
            gviVar.Y.M(0);
        }
        this.v0 = true;
        this.F0 = false;
        Boolean bool = Boolean.FALSE;
        ((x5a0) this.i0).setValue(bool);
        this.A = false;
        this.M1 = true;
        if (S2() && !this.O1 && this.N1 == null) {
            this.N1 = Long.valueOf(SystemClock.elapsedRealtime());
        }
        gvi gviVar2 = this.z;
        if (gviVar2 != null) {
            gviVar2.Y.setProgressForApi(11);
        }
        gvi gviVar3 = this.z;
        if (gviVar3 != null) {
            gviVar3.Y.setCurrentProgress(1);
        }
        gvi gviVar4 = this.z;
        if (gviVar4 != null) {
            gviVar4.Y.setVisibility(0);
        }
        ((x5a0) c1().Z).setValue(bool);
        gvi gviVar5 = this.z;
        if (gviVar5 != null) {
            gviVar5.Y.K();
        }
        if (getContext() != null) {
            ln1 ln1VarN1 = n1();
            GameDetails gameDetails = this.i;
            if (gameDetails == null || (name = gameDetails.getName()) == null) {
                name = "";
            }
            ln1VarN1.getClass();
            if (name.length() != 0) {
                ej5.c(o8i0.d(ln1VarN1), null, null, new dn1(ln1VarN1, name, null), 3);
            }
            ArrayList arrayList = this.m0;
            if (!arrayList.contains("sg_sporty_jet") && !arrayList.contains("sg_galaxy_go") && !arrayList.contains("sg_sporty_kick") && !arrayList.contains("sg_sporty_cars") && !arrayList.contains("sg_crazy_rider") && !arrayList.contains("sg_sporty_skills")) {
                arrayList.add("cmsApiList");
            }
            op5.a.getClass();
            String str = op5.c;
            if (str != null) {
                ((x5a0) c1().g0).setValue(bool);
                gvi gviVar6 = this.z;
                if (gviVar6 != null) {
                    ProgressMeterComponent progressMeterComponent = gviVar6.Y;
                    fq5 fq5VarV0 = V0();
                    List listA0 = CollectionsKt.A0(arrayList);
                    listA0.getClass();
                    progressMeterComponent.F(fq5VarV0, (ArrayList) listA0, str, this.y);
                }
            }
        }
    }

    public final void s1() {
        ((x5a0) this.c1).setValue(null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0132 A[PHI: r5
      0x0132: PHI (r5v28 java.lang.Double) = (r5v27 java.lang.Double), (r5v32 java.lang.Double) binds: [B:41:0x0147, B:33:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0139  */
    /* JADX WARN: Code duplicated, block: B:40:0x0146  */
    /* JADX WARN: Code duplicated, block: B:64:0x01be  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cd  */
    public final void s2(ul2 ul2Var, TopBets topBets) {
        boolean z2;
        wwd0 wwd0Var;
        boolean z3;
        GiftItem giftItem;
        Double d3;
        double dDoubleValue;
        Double stakeLimit;
        Double stakeLimit2;
        Double dValueOf = Double.valueOf(0.0d);
        ytw<HashMap<Long, Boolean>> ytwVar = ul2Var.d;
        wwd0 wwd0Var2 = ul2Var.a;
        HashMap map = new HashMap((Map) ((x5a0) ul2Var.d).getValue());
        map.remove(Long.valueOf(topBets.getRoundId()));
        ((x5a0) ytwVar).setValue(map);
        ul2Var.V1(topBets.getRoundId());
        ((v5a0) ul2Var.L).K(topBets.getBetId());
        ul2Var.J1(true);
        ul2Var.I1(false);
        ul2Var.W1(topBets);
        loa0 loa0VarK1 = k1();
        String strValueOf = String.valueOf(topBets.getRoundId());
        int betIndex = topBets.getBetIndex();
        loa0VarK1.getClass();
        strValueOf.getClass();
        loa0VarK1.M.remove(loa0.E1(betIndex, strValueOf));
        Double giftAmount = topBets.getGiftAmount();
        if (giftAmount != null) {
            double dDoubleValue2 = giftAmount.doubleValue();
            String giftId = topBets.getGiftId();
            z3 = false;
            wwd0Var = wwd0Var2;
            z2 = true;
            giftItem = new GiftItem(dDoubleValue2, "", "", (giftId == null || giftId.length() == 0) ? ((BetContainerState) wwd0Var2.getValue()).getGift().getGiftId() : topBets.getGiftId().toString(), 0.0d, 0L, 0, dValueOf, null, 256, null);
        } else {
            z2 = true;
            wwd0Var = wwd0Var2;
            z3 = false;
            giftItem = new GiftItem(0.0d, "", "", "", 0.0d, 0L, 0, dValueOf, null);
        }
        ul2Var.O1(giftItem);
        if (topBets.getGiftAmount() != null) {
            ((v5a0) ul2Var.Q).K(topBets.getRoundId());
            E0();
        }
        MultiplierResponse multiplierResponse = this.x0;
        Double d4 = null;
        String messageType = multiplierResponse != null ? multiplierResponse.getMessageType() : null;
        if (messageType == null) {
            messageType = "";
        }
        Boolean turboBonusUsed = topBets.getTurboBonusUsed();
        Boolean bool = Boolean.TRUE;
        boolean zG = Intrinsics.g(turboBonusUsed, bool);
        ul2Var.F1(zG);
        if (zG) {
            TurboUsageCountResponse turboUsageCountResponse = (TurboUsageCountResponse) ((x5a0) gci0.d).getValue();
            if (turboUsageCountResponse == null || (stakeLimit2 = turboUsageCountResponse.getStakeLimit()) == null) {
                stakeLimit2 = this.a2;
                if (stakeLimit2 != null || stakeLimit2.doubleValue() <= r2) {
                    stakeLimit2 = null;
                }
                if (stakeLimit2 != null) {
                    double dDoubleValue3 = stakeLimit2.doubleValue();
                    this.a2 = Double.valueOf(dDoubleValue3);
                    ul2Var.L1(DetailResponse.copy$default(ul2Var.y1(), 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, dDoubleValue3, 0, 0, null, null, null, 8063, null));
                    ul2Var.U1(z2);
                }
            } else {
                if (stakeLimit2.doubleValue() <= 0) {
                    stakeLimit2 = null;
                }
                if (stakeLimit2 != null) {
                    double dDoubleValue4 = stakeLimit2.doubleValue();
                    this.a2 = Double.valueOf(dDoubleValue4);
                    ul2Var.L1(DetailResponse.copy$default(ul2Var.y1(), 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, dDoubleValue4, 0, 0, null, null, null, 8063, null));
                    ul2Var.U1(z2);
                } else {
                    stakeLimit2 = this.a2;
                    if (stakeLimit2 != null) {
                        stakeLimit2 = null;
                    } else {
                        stakeLimit2 = null;
                    }
                    if (stakeLimit2 != null) {
                        double dDoubleValue5 = stakeLimit2.doubleValue();
                        this.a2 = Double.valueOf(dDoubleValue5);
                        ul2Var.L1(DetailResponse.copy$default(ul2Var.y1(), 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, dDoubleValue5, 0, 0, null, null, null, 8063, null));
                        ul2Var.U1(z2);
                    }
                }
            }
        }
        boolean z4 = (Intrinsics.g(topBets.getStakeSafeUsed(), bool) || iex.a(ul2Var, this.A0, messageType)) ? z2 : z3;
        ul2Var.C1(z4);
        if (z4) {
            ul2Var.A1(z2);
            StakeSafeUsageCountResponse stakeSafeUsageCountResponse = (StakeSafeUsageCountResponse) ((x5a0) gci0.b).getValue();
            if (stakeSafeUsageCountResponse == null || (stakeLimit = stakeSafeUsageCountResponse.getStakeLimit()) == null) {
                d3 = this.b2;
                if (d3 != null && d3.doubleValue() > r2) {
                    d4 = d3;
                }
                if (d4 != null) {
                    dDoubleValue = d4.doubleValue();
                    double d5 = dDoubleValue;
                    this.b2 = Double.valueOf(d5);
                    ul2Var.L1(DetailResponse.copy$default(ul2Var.y1(), 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, d5, 0, 0, null, null, null, 8063, null));
                    ul2Var.U1(z2);
                }
            } else {
                if (stakeLimit.doubleValue() <= r2) {
                    stakeLimit = null;
                }
                if (stakeLimit != null) {
                    dDoubleValue = stakeLimit.doubleValue();
                } else {
                    d3 = this.b2;
                    if (d3 != null) {
                        d4 = d3;
                    }
                    if (d4 != null) {
                        dDoubleValue = d4.doubleValue();
                    }
                }
                double d6 = dDoubleValue;
                this.b2 = Double.valueOf(d6);
                ul2Var.L1(DetailResponse.copy$default(ul2Var.y1(), 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, d6, 0, 0, null, null, null, 8063, null));
                ul2Var.U1(z2);
            }
        }
        ((s5a0) ul2Var.O).t(topBets.getStakeAmount());
        String autoCashoutAt = topBets.getAutoCashoutAt();
        ytw<Boolean> ytwVar2 = ul2Var.c;
        if (autoCashoutAt != null) {
            ((x5a0) ytwVar2).setValue(bool);
            ((x5a0) ul2Var.N).setValue(topBets.getAutoCashoutAt());
        } else {
            ((x5a0) ytwVar2).setValue(Boolean.FALSE);
        }
        Context context = getContext();
        if (context != null && (this.s0 || l2())) {
            Intent intent = new Intent("custom-event-name");
            intent.putExtra("number", ((BetContainerState) wwd0Var.getValue()).getDetailResponse().getBetIndex());
            intent.putExtra("enable button", z2);
            fdt.a(context).c(intent);
        }
        E1(ul2Var, topBets, z4);
    }

    public final void t0() {
        ej5.c(ebs.a(getLifecycle()), null, null, new c(null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v17, types: [l9b] */
    public final void t1() {
        boolean z2;
        Boolean boolValueOf;
        int i3;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        boolean z3;
        gvi gviVar;
        qo80 binding;
        gvi gviVar2 = this.z;
        if (gviVar2 != null) {
            gviVar2.Q.setHeaderColor(r58.l(b1().d0()));
        }
        gvi gviVar3 = this.z;
        if (gviVar3 != null) {
            gviVar3.Q.setBodyColor(r58.l(b1().c0()));
        }
        op5 op5Var = op5.a;
        String string = getString(R.string.music_cms);
        string.getClass();
        String string2 = getString(R.string.music_menu);
        string2.getClass();
        op5Var.getClass();
        String strB = op5.b(string, string2, null);
        MenuIconSize menuIconSize = new MenuIconSize(2131165245, R.dimen._12sdp);
        i9b i9bVar = new i9b();
        SharedPreferences sharedPreferences = this.H;
        LeftMenuButton leftMenuButton = new LeftMenuButton(0, strB, R.drawable.music_new, menuIconSize, i9bVar, true, sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean(((String[]) ((x5a0) c1().B).getValue())[0], true)) : null, Integer.valueOf(c1().F), Integer.valueOf(c1().G), null, false, new Function1() { // from class: o9b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fgb fgbVar = this.a;
                SharedPreferences sharedPreferences2 = fgbVar.H;
                if (zBooleanValue) {
                    if (sharedPreferences2 != null) {
                        fgbVar.c1().F1(true);
                    }
                    SharedPreferences.Editor editor = fgbVar.J;
                    if (editor != null) {
                        editor.putBoolean(((String[]) ((x5a0) fgbVar.c1().B).getValue())[0], ((Boolean) ((x5a0) fgbVar.c1().t0).getValue()).booleanValue());
                    }
                    SharedPreferences.Editor editor2 = fgbVar.J;
                    if (editor2 != null) {
                        editor2.apply();
                    }
                    if (fgbVar.p0) {
                        fgbVar.g2();
                    } else if (fgbVar.q0) {
                        fgbVar.f2();
                    } else {
                        fgbVar.c2();
                    }
                    GameDetails gameDetails = fgbVar.i;
                    wz.a("Music", gameDetails != null ? gameDetails.getName() : null, "On");
                } else {
                    if (sharedPreferences2 != null) {
                        fgbVar.c1().F1(false);
                    }
                    SharedPreferences.Editor editor3 = fgbVar.J;
                    if (editor3 != null) {
                        editor3.putBoolean(((String[]) ((x5a0) fgbVar.c1().B).getValue())[0], ((Boolean) ((x5a0) fgbVar.c1().t0).getValue()).booleanValue());
                    }
                    SharedPreferences.Editor editor4 = fgbVar.J;
                    if (editor4 != null) {
                        editor4.apply();
                    }
                    if (fgbVar.z != null) {
                        fgbVar.l1().I1();
                    }
                    GameDetails gameDetails2 = fgbVar.i;
                    wz.a("Music", gameDetails2 != null ? gameDetails2.getName() : null, "Off");
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
        p9b p9bVar = new p9b();
        SharedPreferences sharedPreferences2 = this.H;
        if (sharedPreferences2 != null) {
            z2 = true;
            boolValueOf = Boolean.valueOf(sharedPreferences2.getBoolean(((String[]) ((x5a0) c1().B).getValue())[1], true));
        } else {
            z2 = true;
            boolValueOf = null;
        }
        LeftMenuButton leftMenuButton2 = new LeftMenuButton(0, strB2, R.drawable.ic_sound, menuIconSize2, p9bVar, true, boolValueOf, Integer.valueOf(c1().F), Integer.valueOf(c1().G), null, false, new Function1() { // from class: q9b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fgb fgbVar = this.a;
                SharedPreferences sharedPreferences3 = fgbVar.H;
                if (zBooleanValue) {
                    if (sharedPreferences3 != null) {
                        fgbVar.c1().H1(true);
                    }
                    fgbVar.l1().y1().d = ((Boolean) ((x5a0) fgbVar.c1().u0).getValue()).booleanValue();
                    SharedPreferences.Editor editor = fgbVar.J;
                    if (editor != null) {
                        editor.putBoolean(((String[]) ((x5a0) fgbVar.c1().B).getValue())[1], ((Boolean) ((x5a0) fgbVar.c1().u0).getValue()).booleanValue());
                    }
                    SharedPreferences.Editor editor2 = fgbVar.J;
                    if (editor2 != null) {
                        editor2.apply();
                    }
                    GameDetails gameDetails = fgbVar.i;
                    wz.a("Sound", gameDetails != null ? gameDetails.getName() : null, "On");
                } else {
                    if (sharedPreferences3 != null) {
                        fgbVar.c1().H1(false);
                    }
                    fgbVar.l1().y1().d = ((Boolean) ((x5a0) fgbVar.c1().u0).getValue()).booleanValue();
                    SharedPreferences.Editor editor3 = fgbVar.J;
                    if (editor3 != null) {
                        editor3.putBoolean(((String[]) ((x5a0) fgbVar.c1().B).getValue())[1], ((Boolean) ((x5a0) fgbVar.c1().u0).getValue()).booleanValue());
                    }
                    SharedPreferences.Editor editor4 = fgbVar.J;
                    if (editor4 != null) {
                        editor4.apply();
                    }
                    GameDetails gameDetails2 = fgbVar.i;
                    wz.a("Sound", gameDetails2 != null ? gameDetails2.getName() : null, "Off");
                }
                fgbVar.l1().K1(fgbVar.l1().y1().d);
                return Unit.a;
            }
        }, 1536, null);
        String string5 = getString(R.string.one_tap_bet_cms);
        string5.getClass();
        String string6 = getString(R.string.onetap_bet_menu);
        string6.getClass();
        String strB3 = op5.b(string5, string6, null);
        MenuIconSize menuIconSize3 = new MenuIconSize(R.dimen._15sdp, R.dimen._10sdp);
        r9b r9bVar = new r9b();
        SharedPreferences sharedPreferences3 = this.H;
        if (sharedPreferences3 != null) {
            i3 = 0;
            boolValueOf2 = Boolean.valueOf(sharedPreferences3.getBoolean(((String[]) ((x5a0) c1().B).getValue())[2], false));
        } else {
            i3 = 0;
            boolValueOf2 = null;
        }
        LeftMenuButton leftMenuButton3 = new LeftMenuButton(0, strB3, R.drawable.ic_one_tap_bet_new, menuIconSize3, r9bVar, true, boolValueOf2, Integer.valueOf(c1().F), Integer.valueOf(c1().G), null, false, new s9b(this, i3), 1536, null);
        String string7 = getString(R.string.special_theme_cms);
        string7.getClass();
        String string8 = getString(R.string.special_theme_menu);
        string8.getClass();
        String strB4 = op5.b(string7, string8, null);
        MenuIconSize menuIconSize4 = new MenuIconSize(R.dimen._15sdp, R.dimen._12sdp);
        t9b t9bVar = new t9b();
        SharedPreferences sharedPreferences4 = this.H;
        if (sharedPreferences4 != null) {
            z3 = true;
            boolValueOf3 = Boolean.valueOf(sharedPreferences4.getBoolean(((String[]) ((x5a0) c1().B).getValue())[3], true));
        } else {
            boolValueOf3 = null;
            z3 = true;
        }
        LeftMenuButton leftMenuButton4 = new LeftMenuButton(0, strB4, R.drawable.valentine, menuIconSize4, t9bVar, true, boolValueOf3, Integer.valueOf(c1().F), Integer.valueOf(c1().G), null, false, new Function1() { // from class: u9b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fgb fgbVar = this.a;
                SharedPreferences.Editor editor = fgbVar.J;
                if (zBooleanValue) {
                    if (editor != null) {
                        editor.putBoolean(((String[]) ((x5a0) fgbVar.c1().B).getValue())[3], true);
                    }
                    SharedPreferences.Editor editor2 = fgbVar.J;
                    if (editor2 != null) {
                        editor2.apply();
                    }
                    fgbVar.q0 = true;
                    SharedPreferences sharedPreferences5 = fgbVar.H;
                    Boolean boolValueOf4 = sharedPreferences5 != null ? Boolean.valueOf(sharedPreferences5.getBoolean(((String[]) ((x5a0) fgbVar.c1().B).getValue())[0], true)) : null;
                    try {
                        MediaPlayer mediaPlayer = fgbVar.l1().y1().i;
                        if ((mediaPlayer != null ? mediaPlayer.isPlaying() : false) && Intrinsics.g(boolValueOf4, Boolean.TRUE)) {
                            if (fgbVar.z != null) {
                                fgbVar.l1().I1();
                            }
                            fgbVar.f2();
                        }
                    } catch (Exception unused) {
                    }
                    GameDetails gameDetails = fgbVar.i;
                    wz.a("SpecialThemeToggled", gameDetails != null ? gameDetails.getName() : null, "On");
                } else {
                    if (editor != null) {
                        editor.putBoolean(((String[]) ((x5a0) fgbVar.c1().B).getValue())[3], false);
                    }
                    SharedPreferences.Editor editor3 = fgbVar.J;
                    if (editor3 != null) {
                        editor3.apply();
                    }
                    SharedPreferences sharedPreferences6 = fgbVar.H;
                    if (Intrinsics.g(sharedPreferences6 != null ? Boolean.valueOf(sharedPreferences6.getBoolean(((String[]) ((x5a0) fgbVar.c1().B).getValue())[0], true)) : null, Boolean.TRUE)) {
                        fgbVar.l1().G1();
                        if (fgbVar.z != null) {
                            fgbVar.l1().I1();
                        }
                        fgbVar.c2();
                    }
                    GameDetails gameDetails2 = fgbVar.i;
                    wz.a("SpecialThemeToggled", gameDetails2 != null ? gameDetails2.getName() : null, "Off");
                }
                SharedPreferences.Editor editor4 = fgbVar.J;
                if (editor4 != null) {
                    editor4.apply();
                }
                return Unit.a;
            }
        }, 1536, null);
        String string9 = getString(R.string.provably_fair_settings_cms);
        string9.getClass();
        String string10 = getString(R.string.provably_fair_setting);
        string10.getClass();
        Integer num = null;
        LeftMenuButton leftMenuButton5 = new LeftMenuButton(0, op5.b(string9, string10, null), R.drawable.fairness_setting, new MenuIconSize(R.dimen._13sdp, R.dimen._13sdp), new v9b(this, 0), false, null, null, num, null, false, null, 3072, null);
        String string11 = getString(R.string.how_to_play_nav_cms);
        string11.getClass();
        String string12 = getString(R.string.how_to_play_menu);
        string12.getClass();
        LeftMenuButton leftMenuButton6 = new LeftMenuButton(0, op5.b(string11, string12, null), R.drawable.ic_how_to_play, new MenuIconSize(R.dimen._13sdp, R.dimen._13sdp), new w9b(this, 0), false, null, num, 0 == true ? 1 : 0, null, false, null, 3072, null);
        String string13 = getString(R.string.bet_history_cms);
        string13.getClass();
        String string14 = getString(R.string.bethistory_menu);
        string14.getClass();
        Integer num2 = null;
        LeftMenuButton leftMenuButton7 = new LeftMenuButton(0, op5.b(string13, string14, null), R.drawable.ic_bethistory, new MenuIconSize(R.dimen._17sdp, R.dimen._17sdp), new t42(this, 1), false, null, null, num2, null, false, null, 3072, null);
        String string15 = getString(R.string.game_limits_nav_cms);
        string15.getClass();
        String string16 = getString(R.string.game_limits);
        string16.getClass();
        ArrayList arrayList = new ArrayList(kotlin.collections.b.l(leftMenuButton, leftMenuButton2, leftMenuButton3, leftMenuButton4, leftMenuButton5, leftMenuButton6, leftMenuButton7, new LeftMenuButton(0, op5.b(string15, string16, null), R.drawable.game_limit, new MenuIconSize(R.dimen._17sdp, R.dimen._17sdp), new u42(this, 1), false, 0 == true ? 1 : 0, num2, 0 == true ? 1 : 0, null, false, null, 3072, null)));
        List<LeftMenuButton> listO0 = O0();
        if (!listO0.isEmpty()) {
            arrayList.addAll(4, listO0);
        }
        if (!this.r0) {
            arrayList.remove(3);
        }
        String str = (String) ((x5a0) c1().v).getValue();
        if (!Intrinsics.g(str, "sporty-jet") && !Intrinsics.g(str, "sporty-hero") && !Intrinsics.g(str, "sporty-cars")) {
            arrayList.remove(2);
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            gvi gviVar4 = this.z;
            if (gviVar4 != null) {
                SGHamburgerMenu sGHamburgerMenu = gviVar4.Q;
                ypa0 ypa0VarL1 = l1();
                int iIntValue = c1().C.getValue().intValue();
                String str2 = this.H0;
                String str3 = this.I0;
                j9b j9bVar = new j9b(this, 0);
                k9b k9bVar = new k9b();
                GameDetails gameDetails = this.i;
                SGHamburgerMenu.setup$default(sGHamburgerMenu, new SGHamburgerMenu.b(ypa0VarL1, iIntValue, str2, str3, arrayList, j9bVar, k9bVar, gameDetails != null ? gameDetails.getName() : null, new Function0() { // from class: l9b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        fgb fgbVar = this.a;
                        if (fgbVar.B1()) {
                            Object value = ((x5a0) gci0.r).getValue();
                            Boolean bool = Boolean.TRUE;
                            if (Intrinsics.g(value, bool) && Intrinsics.g(((x5a0) gci0.h).getValue(), bool) && fgbVar.y1()) {
                                fgbVar.d3();
                            }
                        }
                        return Unit.a;
                    }
                }), activity, false, null, new Function0() { // from class: m9b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(this.a.y1());
                    }
                }, 12, null);
            }
            gvi gviVar5 = this.z;
            op5.r(op5Var, kotlin.collections.b.f((gviVar5 == null || (binding = gviVar5.Q.getBinding()) == null) ? null : binding.c), null, 6);
            gvi gviVar6 = this.z;
            if (gviVar6 != null) {
                gviVar6.Q.setCrashImage((String) ((x5a0) c1().v).getValue(), ((Boolean) ((x5a0) c1().k0).getValue()).booleanValue(), ((Boolean) ((x5a0) c1().m0).getValue()).booleanValue());
            }
            if (w1(str) && (gviVar = this.z) != null) {
                SGHamburgerMenu sGHamburgerMenu2 = gviVar.Q;
                sGHamburgerMenu2.E(i3(sGHamburgerMenu2));
            }
            O1();
        }
    }

    public final void t2(String str, String str2) {
        String name;
        mz1 mz1Var;
        z52 z52Var;
        cj5 cj5Var;
        try {
            String str3 = (String) ((x5a0) c1().v).getValue();
            str3.getClass();
            Function0<mz1> function0 = vij.a.get(str3);
            if (function0 == null || (mz1Var = function0.invoke()) == null) {
                mz1Var = new mz1();
            }
            this.V1 = mz1Var;
            String str4 = (String) ((x5a0) c1().v).getValue();
            str4.getClass();
            Function0<z52> function1 = vij.c.get(str4);
            if (function1 == null || (z52Var = function1.invoke()) == null) {
                z52Var = new z52();
            }
            this.X1 = z52Var;
            String str5 = (String) ((x5a0) c1().v).getValue();
            str5.getClass();
            Function0<cj5> function2 = vij.b.get(str5);
            if (function2 == null || (cj5Var = function2.invoke()) == null) {
                cj5Var = new cj5();
            }
            this.W1 = cj5Var;
            ((x5a0) c1().e0).setValue(b1());
            ((x5a0) c1().f0).setValue(U0());
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        ln1 ln1VarN1 = n1();
        GameDetails gameDetails = this.i;
        if (gameDetails == null || (name = gameDetails.getName()) == null) {
            name = "";
        }
        ln1VarN1.getClass();
        if (name.length() != 0) {
            ej5.c(o8i0.d(ln1VarN1), null, null, new dn1(ln1VarN1, name, null), 3);
        }
        A2();
        ArrayList arrayList = this.m0;
        int i3 = 0;
        arrayList.add(0, str);
        this.I = str2;
        String strD0 = D0(str);
        gvi gviVar = this.z;
        if (gviVar != null) {
            H2(gviVar.G, strD0);
        }
        gvi gviVar2 = this.z;
        if (gviVar2 != null) {
            J2(gviVar2.b0, strD0);
        }
        List listA0 = CollectionsKt.A0(arrayList);
        listA0.getClass();
        ArrayList<String> arrayList2 = (ArrayList) listA0;
        if (!arrayList2.contains("sg_sporty_jet") && !arrayList2.contains("sg_galaxy_go") && !arrayList2.contains("sg_sporty_kick") && !arrayList2.contains("sg_sporty_cars") && !arrayList2.contains("sg_crazy_rider") && !arrayList.contains("sg_sporty_skills") && !arrayList2.contains("sg_sporty_hero")) {
            arrayList2.add("sg_sporty_hero");
        }
        ((x5a0) c1().g0).setValue(Boolean.FALSE);
        gvi gviVar3 = this.z;
        if (gviVar3 != null) {
            gviVar3.Y.F(V0(), arrayList2, str, this.y);
        }
        int i4 = 1;
        k1().z.f(getViewLifecycleOwner(), new v(new v62(this, i4)));
        d1().b.f(getViewLifecycleOwner(), new v(new Function1() { // from class: z9b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String lowerCase;
                Integer id;
                String country;
                Integer id2;
                Double freeBetValue;
                Integer id3;
                fgb fgbVar = this.a;
                String str6 = (String) obj;
                if (Intrinsics.g(str6, AnalyticsEvent.BI_TRACKING_KIND_ERROR)) {
                    return Unit.a;
                }
                try {
                    RainTopicResponse rainTopicResponse = (RainTopicResponse) new eal().e(str6, RainTopicResponse.class);
                    fgbVar.x1 = rainTopicResponse;
                    qv30.a.j(rainTopicResponse);
                    RainTopicResponse rainTopicResponse2 = fgbVar.x1;
                    String strValueOf = null;
                    String messageType = rainTopicResponse2 != null ? rainTopicResponse2.getMessageType() : null;
                    String str7 = "";
                    if (messageType == null) {
                        messageType = "";
                    }
                    Locale locale = Locale.ROOT;
                    String lowerCase2 = messageType.toLowerCase(locale);
                    lowerCase2.getClass();
                    tv30[] tv30VarArr = tv30.a;
                    int iIntValue = 0;
                    if (lowerCase2.equals("upcoming")) {
                        fgbVar.q2 = 0;
                        if (!fgbVar.p2) {
                            fgbVar.p2 = true;
                            rainTopicResponse.getClass();
                            try {
                                fgbVar.L0(ToastType.RAIN_UPCOMING, new fhb(rainTopicResponse, fgbVar.h1(rainTopicResponse), fgbVar, null));
                            } catch (Exception e4) {
                                e4.printStackTrace();
                                fgbVar.p2 = false;
                                fgbVar.o2 = false;
                                fgbVar.s1();
                            }
                            tv30[] tv30VarArr2 = tv30.a;
                            fgbVar.l3("upcoming", true);
                            ytw<Boolean> ytwVar = fgbVar.R0().S;
                            Boolean bool = Boolean.FALSE;
                            ((x5a0) ytwVar).setValue(bool);
                            ((x5a0) fgbVar.S0().S).setValue(bool);
                        }
                    } else {
                        double dDoubleValue = 0.0d;
                        if (lowerCase2.equals("active")) {
                            RainTopicResponse rainTopicResponse3 = fgbVar.x1;
                            String status = rainTopicResponse3 != null ? rainTopicResponse3.getStatus() : null;
                            if (status == null) {
                                status = "";
                            }
                            String lowerCase3 = status.toLowerCase(locale);
                            lowerCase3.getClass();
                            if (lowerCase3.equals("ended")) {
                                fgbVar.q2 = 2;
                                fgbVar.p2 = false;
                                fgbVar.o2 = false;
                                fgbVar.s1();
                                RainDetailInfoResponse rainDetailInfoResponse = fgbVar.t2;
                                if (rainDetailInfoResponse != null) {
                                    String endTime = rainDetailInfoResponse.getEndTime();
                                    if (endTime != null) {
                                        str7 = endTime;
                                    }
                                    fgbVar.f3(k94.f(str7));
                                } else {
                                    ej5.c(ebs.a(fgbVar.getLifecycle()), null, null, new wgb(fgbVar, null), 3);
                                }
                                fgbVar.o2 = false;
                                fgbVar.p2 = false;
                                ej5.c(ebs.a(fgbVar.getLifecycle()), null, null, new xgb(2, null), 3);
                                ytw<Boolean> ytwVar2 = fgbVar.R0().S;
                                Boolean bool2 = Boolean.FALSE;
                                ((x5a0) ytwVar2).setValue(bool2);
                                ((x5a0) fgbVar.S0().S).setValue(bool2);
                            } else {
                                fgbVar.q2 = 1;
                                if (!fgbVar.o2) {
                                    if (rainTopicResponse != null && (id3 = rainTopicResponse.getId()) != null) {
                                        iIntValue = id3.intValue();
                                    }
                                    fgbVar.r2 = iIntValue;
                                    if (rainTopicResponse != null && (freeBetValue = rainTopicResponse.getFreeBetValue()) != null) {
                                        dDoubleValue = freeBetValue.doubleValue();
                                    }
                                    fgbVar.s2 = dDoubleValue;
                                    fgbVar.o2 = true;
                                    lw30 lw30VarI1 = fgbVar.i1();
                                    String strValueOf2 = (rainTopicResponse == null || (id2 = rainTopicResponse.getId()) == null) ? null : String.valueOf(id2.intValue());
                                    if (strValueOf2 == null) {
                                        strValueOf2 = "";
                                    }
                                    lw30VarI1.getClass();
                                    ej5.c(o8i0.d(lw30VarI1), null, null, new rw30(lw30VarI1, strValueOf2, null), 3);
                                    lw30 lw30VarI2 = fgbVar.i1();
                                    SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                                    if (sportyGamesManager == null || (country = sportyGamesManager.getCountry()) == null) {
                                        lowerCase = null;
                                    } else {
                                        lowerCase = country.toLowerCase(locale);
                                        lowerCase.getClass();
                                    }
                                    if (lowerCase == null) {
                                        lowerCase = "";
                                    }
                                    if (rainTopicResponse != null && (id = rainTopicResponse.getId()) != null) {
                                        strValueOf = String.valueOf(id.intValue());
                                    }
                                    if (strValueOf != null) {
                                        str7 = strValueOf;
                                    }
                                    lw30VarI2.x1(lowerCase, str7);
                                    ytw<Boolean> ytwVar3 = fgbVar.R0().S;
                                    Boolean bool3 = Boolean.TRUE;
                                    ((x5a0) ytwVar3).setValue(bool3);
                                    ((x5a0) fgbVar.S0().S).setValue(bool3);
                                }
                            }
                        } else {
                            fgbVar.q2 = 3;
                            fgbVar.t2 = null;
                            fgbVar.r2 = 0;
                            fgbVar.s2 = 0.0d;
                            fgbVar.p2 = false;
                            fgbVar.o2 = false;
                            fgbVar.s1();
                            fgbVar.l3("", false);
                            ytw<Boolean> ytwVar4 = fgbVar.R0().S;
                            Boolean bool4 = Boolean.FALSE;
                            ((x5a0) ytwVar4).setValue(bool4);
                            ((x5a0) fgbVar.S0().S).setValue(bool4);
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return Unit.a;
            }
        }));
        d1().c.f(getViewLifecycleOwner(), new v(new Function1() { // from class: aab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                fgb fgbVar = this.a;
                String str6 = (String) obj;
                if (Intrinsics.g(str6, AnalyticsEvent.BI_TRACKING_KIND_ERROR)) {
                    return Unit.a;
                }
                try {
                    RainStatusResponse rainStatusResponse = (RainStatusResponse) new eal().e(str6, RainStatusResponse.class);
                    if (rainStatusResponse == null) {
                        return Unit.a;
                    }
                    fgbVar.q2 = 4;
                    Integer id = rainStatusResponse.getId();
                    fgbVar.r2 = id != null ? id.intValue() : 0;
                    Double freeBetValue = rainStatusResponse.getFreeBetValue();
                    fgbVar.s2 = freeBetValue != null ? freeBetValue.doubleValue() : 0.0d;
                    String endTime = rainStatusResponse.getEndTime();
                    if (endTime == null) {
                        endTime = "";
                    }
                    fgbVar.g3(k94.f(endTime));
                    return Unit.a;
                } catch (Exception unused) {
                }
            }
        }));
        i1().B.f(getViewLifecycleOwner(), new v(new w87(this, i4)));
        i1().e.f(getViewLifecycleOwner(), new v(new x87(this, i4)));
        i1().z.f(getViewLifecycleOwner(), new v(new y87(this, i4)));
        i1().f.f(getViewLifecycleOwner(), new v(new z87(this, i4)));
        qv30.c.f(getViewLifecycleOwner(), new v(new u62(this, 2)));
        k1().C.f(getViewLifecycleOwner(), new v(new Function1() { // from class: x9b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str6 = (String) obj;
                if (Intrinsics.g(str6, AnalyticsEvent.BI_TRACKING_KIND_ERROR)) {
                    return Unit.a;
                }
                try {
                    ClaimRainResponse claimRainResponse = (ClaimRainResponse) new eal().e(str6, ClaimRainResponse.class);
                    if (claimRainResponse == null) {
                        return Unit.a;
                    }
                    List<ClaimError> errors = claimRainResponse.getErrors();
                    fgb fgbVar = this.a;
                    if (errors == null) {
                        fgbVar.q1(claimRainResponse);
                    } else {
                        fgbVar.p1(claimRainResponse);
                    }
                    return Unit.a;
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }));
        V0().c.f(getViewLifecycleOwner(), new v(new afb(this, i3)));
        k1().y.f(getViewLifecycleOwner(), new v(new dfb(this, i3)));
        n1().b.f(getViewLifecycleOwner(), new v(new u87(this, i4)));
        n1().f.f(getViewLifecycleOwner(), new v(new ffb(this, i3)));
        k1().B.f(getViewLifecycleOwner(), new v(new gfb(this, i3)));
        try {
            n1().e.f(getViewLifecycleOwner(), new v(new Function1() { // from class: hfb
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    WalletInfo walletInfo;
                    WalletInfo walletInfo2;
                    Double balance;
                    WalletInfo walletInfo3;
                    WalletInfo walletInfo4;
                    gvi gviVar4;
                    WalletInfo walletInfo5;
                    ResultWrapper.GenericError error;
                    Context context;
                    gvi gviVar5;
                    Integer code;
                    LoadingState loadingState = (LoadingState) obj;
                    int i5 = fgb.b.a[loadingState.getStatus().ordinal()];
                    fgb fgbVar = this.a;
                    Double balance2 = null;
                    if (i5 == 1) {
                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                        String currency = (hTTPResponse == null || (walletInfo5 = (WalletInfo) hTTPResponse.getData()) == null) ? null : walletInfo5.getCurrency();
                        if (currency != null && !StringsKt.U(currency)) {
                            fgbVar.T0 = 0;
                        } else {
                            if (fgbVar.T0 < 3) {
                                fgbVar.n1().z1();
                                fgbVar.T0++;
                                return Unit.a;
                            }
                            fgbVar.m3();
                            fgbVar.M0();
                        }
                        if (!fgbVar.A && (gviVar4 = fgbVar.z) != null) {
                            gviVar4.Y.N();
                        }
                        ip8 ip8VarY0 = fgbVar.Y0();
                        HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                        String strValueOf = String.valueOf((hTTPResponse2 == null || (walletInfo4 = (WalletInfo) hTTPResponse2.getData()) == null) ? null : walletInfo4.getBalance());
                        op5 op5Var = op5.a;
                        HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
                        String strValueOf2 = String.valueOf((hTTPResponse3 == null || (walletInfo3 = (WalletInfo) hTTPResponse3.getData()) == null) ? null : walletInfo3.getCurrency());
                        op5Var.getClass();
                        ip8VarY0.z1(strValueOf, op5.i(strValueOf2));
                        fgbVar.Y0().A1(true);
                        Double d3 = fgbVar.S0;
                        if (d3 != null) {
                            double dDoubleValue = d3.doubleValue();
                            HTTPResponse hTTPResponse4 = (HTTPResponse) loadingState.getData();
                            if (hTTPResponse4 != null && (walletInfo2 = (WalletInfo) hTTPResponse4.getData()) != null && (balance = walletInfo2.getBalance()) != null) {
                                fgbVar.z1 = dDoubleValue - balance.doubleValue();
                            }
                        }
                        double d4 = fgbVar.z1;
                        if (d4 < 0.0d) {
                            fgbVar.A1 = "up";
                            ((x5a0) fgbVar.Y0().a).setValue(Boolean.TRUE);
                        } else if (d4 > 0.0d) {
                            fgbVar.A1 = "down";
                            ((x5a0) fgbVar.Y0().a).setValue(Boolean.TRUE);
                        }
                        HTTPResponse hTTPResponse5 = (HTTPResponse) loadingState.getData();
                        if (hTTPResponse5 != null && (walletInfo = (WalletInfo) hTTPResponse5.getData()) != null) {
                            balance2 = walletInfo.getBalance();
                        }
                        fgbVar.S0 = balance2;
                        if ((balance2 != null ? balance2.doubleValue() : 0.0d) < fgbVar.R0 * 2.0d) {
                            fgbVar.Y0().C1(true);
                            gvi gviVar6 = fgbVar.z;
                            if (gviVar6 != null) {
                                gviVar6.Q.F(R.drawable.hamberger_add_more_red);
                            }
                        } else {
                            fgbVar.Y0().C1(false);
                            if (Intrinsics.g(((x5a0) fgbVar.c1().v).getValue(), "crazy-rider") || StringsKt.M((CharSequence) ((x5a0) fgbVar.c1().v).getValue(), "skills", false)) {
                                gvi gviVar7 = fgbVar.z;
                                if (gviVar7 != null) {
                                    gviVar7.Q.F(R.drawable.hamburger_add_more_transparent_bg);
                                }
                            } else {
                                boolean zM = StringsKt.M((CharSequence) ((x5a0) fgbVar.c1().v).getValue(), "sporty-cars", false);
                                gvi gviVar8 = fgbVar.z;
                                if (zM) {
                                    if (gviVar8 != null) {
                                        gviVar8.Q.F(R.drawable.hamburger_add_more_cars);
                                    }
                                } else if (gviVar8 != null) {
                                    gviVar8.Q.F(R.drawable.hamberger_add_more_bg);
                                }
                            }
                        }
                        if (fgbVar.y1()) {
                            new SportyGamesManager().fetchFirstDepositState(ebs.a(fgbVar.getLifecycle()), new ugb(fgbVar, pm5.MONEY_DEPOSIT_TOOLTIP_TEXT.a()));
                        }
                    } else if (i5 != 2) {
                        if (i5 != 3) {
                            uhc.a();
                            return null;
                        }
                        if (fgbVar.T0 < 3) {
                            fgbVar.n1().z1();
                            fgbVar.T0++;
                            return Unit.a;
                        }
                        fgbVar.m3();
                        e activity = fgbVar.getActivity();
                        if (activity != null && ((error = loadingState.getError()) == null || (code = error.getCode()) == null || code.intValue() != 403)) {
                            xbg xbgVar = fgbVar.G0;
                            if (!(xbgVar != null ? xbgVar.isShowing() : false) && !fgbVar.F0 && (context = fgbVar.getContext()) != null && (gviVar5 = fgbVar.z) != null) {
                                ComposeView composeView = gviVar5.J;
                                composeView.setViewCompositionStrategy(u6i0.c.a);
                                composeView.setContent(new op8(-1748952273, new fab(composeView, fgbVar, loadingState, context, activity), true));
                            }
                        }
                    }
                    return Unit.a;
                }
            }));
        } catch (Exception unused) {
        }
        X0().b.f(getViewLifecycleOwner(), new v(new ifb(this, i3)));
        n1().d.f(getViewLifecycleOwner(), new v(new Function1() { // from class: jfb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String chatRoomId;
                ChatRoomResponse chatRoomResponse;
                String botUserId;
                ChatRoomResponse chatRoomResponse2;
                gvi gviVar4;
                LoadingState loadingState = (LoadingState) obj;
                int i5 = fgb.b.a[loadingState.getStatus().ordinal()];
                fgb fgbVar = this.a;
                if (i5 == 1) {
                    gvi gviVar5 = fgbVar.z;
                    if (gviVar5 != null) {
                        gviVar5.Y.N();
                    }
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    String str6 = "";
                    if (hTTPResponse == null || (chatRoomResponse2 = (ChatRoomResponse) hTTPResponse.getData()) == null || (chatRoomId = chatRoomResponse2.getChatRoomId()) == null) {
                        chatRoomId = "";
                    }
                    fgbVar.V0 = chatRoomId;
                    HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse2 != null && (chatRoomResponse = (ChatRoomResponse) hTTPResponse2.getData()) != null && (botUserId = chatRoomResponse.getBotUserId()) != null) {
                        str6 = botUserId;
                    }
                    fgbVar.X0 = str6;
                    if (fgbVar.V0.length() > 0) {
                        wwd0 wwd0Var = fgbVar.Y0().A;
                        wwd0Var.setValue(CrashHeaderState.copy$default((CrashHeaderState) wwd0Var.getValue(), null, null, true, false, false, false, 59, null));
                    }
                    FragmentManager parentFragmentManager = fgbVar.getParentFragmentManager();
                    parentFragmentManager.getClass();
                    Fragment fragmentH = parentFragmentManager.H("Chat");
                    if (fragmentH != null) {
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
                        aVar.p(fragmentH);
                        aVar.d();
                    }
                } else if (i5 == 3 && (gviVar4 = fgbVar.z) != null) {
                    gviVar4.Y.N();
                }
                return Unit.a;
            }
        }));
        k1().w.f(getViewLifecycleOwner(), new v(new Function1() { // from class: kfb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                UserInfoResponseSocket userInfoResponseSocket = (UserInfoResponseSocket) q97.a(UserInfoResponseSocket.class, (String) obj);
                if (Intrinsics.g(userInfoResponseSocket.getMessageType(), "OVER_UNDER_BET_RECORD") || Intrinsics.g(userInfoResponseSocket.getMessageType(), "RANGE_BET_RECORD")) {
                    return Unit.a;
                }
                try {
                    boolean zG = Intrinsics.g(userInfoResponseSocket.getMessageType(), "CANCELLED_BET_RECORD");
                    fgb fgbVar = this.a;
                    if (zG) {
                        loa0 loa0VarK1 = fgbVar.k1();
                        String strValueOf = String.valueOf(userInfoResponseSocket.getBet().getRoundId());
                        int betIndex = userInfoResponseSocket.getBet().getBetIndex();
                        loa0VarK1.getClass();
                        strValueOf.getClass();
                        loa0VarK1.M.put(loa0.E1(betIndex, strValueOf), Boolean.TRUE);
                        if (userInfoResponseSocket.getBet().getBetIndex() == 1) {
                            fgbVar.v2(fgbVar.R0(), userInfoResponseSocket.getBet());
                        } else {
                            fgbVar.v2(fgbVar.S0(), userInfoResponseSocket.getBet());
                        }
                    } else {
                        if (userInfoResponseSocket.getBet().getCashoutCoefficient() == null) {
                            loa0 loa0VarK2 = fgbVar.k1();
                            String strValueOf2 = String.valueOf(userInfoResponseSocket.getBet().getRoundId());
                            int betIndex2 = userInfoResponseSocket.getBet().getBetIndex();
                            loa0VarK2.getClass();
                            strValueOf2.getClass();
                            loa0VarK2.K.put(loa0.E1(betIndex2, strValueOf2), Boolean.TRUE);
                            if (userInfoResponseSocket.getBet().getBetIndex() == 1) {
                                fgbVar.s2(fgbVar.R0(), userInfoResponseSocket.getBet());
                                fgbVar.D0 = userInfoResponseSocket.getBet().getRoundId();
                            } else {
                                fgbVar.s2(fgbVar.S0(), userInfoResponseSocket.getBet());
                                fgbVar.E0 = userInfoResponseSocket.getBet().getRoundId();
                            }
                            com.sportygames.commons.views.a aVar = null;
                            if (!fgbVar.n0) {
                                ej5.c(fgbVar.o0, null, null, new ggb(fgbVar, null), 3);
                            }
                            if (Intrinsics.g(((x5a0) fgbVar.c1().v).getValue(), "sporty-jet")) {
                                Fragment fragmentG = fgbVar.getChildFragmentManager().G(R.id.onboarding_images);
                                com.sportygames.commons.views.a aVar2 = fragmentG instanceof com.sportygames.commons.views.a ? (com.sportygames.commons.views.a) fragmentG : null;
                                if (aVar2 != null) {
                                    if (aVar2.isVisible()) {
                                        kd kdVar = (kd) aVar2.b;
                                        if ((kdVar != null ? kdVar.e.getCurrentItem() : 0) == 0) {
                                            aVar = aVar2;
                                        }
                                    }
                                    if (aVar != null) {
                                        aVar.w0();
                                    }
                                }
                            }
                        } else {
                            fgbVar.n1().z1();
                            fgbVar.k1().A1(userInfoResponseSocket.getBet().getBetId(), String.valueOf(userInfoResponseSocket.getBet().getRoundId()));
                            if (userInfoResponseSocket.getBet().getBetIndex() == 1) {
                                fgbVar.w2(fgbVar.R0(), userInfoResponseSocket.getBet(), true);
                            } else {
                                fgbVar.w2(fgbVar.S0(), userInfoResponseSocket.getBet(), true);
                            }
                            if (fgbVar.M0 && fgbVar.i2 == fgbVar.R0().M.getValue().intValue()) {
                                fgbVar.R0().G1(false);
                            }
                        }
                    }
                } catch (Exception unused2) {
                }
                return Unit.a;
            }
        }));
        k1().v.f(getViewLifecycleOwner(), new v(new lfb(this, i3)));
        k1().i.f(getViewLifecycleOwner(), new v(new mfb(this, i3)));
        n1().w.f(getViewLifecycleOwner(), new v(new bfb(this, i3)));
        ej5.c(ebs.a(getLifecycle()), null, null, new tgb(this, null), 3);
        k1().H.f(getViewLifecycleOwner(), new v(new cfb(this, i3)));
        n1().i.f(getViewLifecycleOwner(), new v(new Function1() { // from class: oab
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List<TopBets> list;
                gvi gviVar4;
                LoadingState loadingState = (LoadingState) obj;
                int i5 = fgb.b.a[loadingState.getStatus().ordinal()];
                fgb fgbVar = this.a;
                if (i5 == 1) {
                    fgbVar.G2();
                    fgbVar.G = false;
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (list = (List) hTTPResponse.getData()) != null) {
                        if (!fgbVar.A) {
                            gvi gviVar5 = fgbVar.z;
                            if (gviVar5 != null) {
                                gviVar5.Y.N();
                            }
                            fgbVar.A = true;
                        } else if (!fgbVar.l0 && !((Boolean) ((x5a0) fgbVar.e1).getValue()).booleanValue()) {
                            fgbVar.f1().x1();
                        }
                        try {
                            for (TopBets topBets : list) {
                                if (topBets.getCashoutCoefficient() == null) {
                                    loa0 loa0VarK1 = fgbVar.k1();
                                    String strValueOf = String.valueOf(topBets.getRoundId());
                                    int betIndex = topBets.getBetIndex();
                                    loa0VarK1.getClass();
                                    strValueOf.getClass();
                                    loa0VarK1.K.put(loa0.E1(betIndex, strValueOf), Boolean.TRUE);
                                    if (topBets.getBetIndex() == 1) {
                                        fgbVar.s2(fgbVar.R0(), topBets);
                                    } else {
                                        fgbVar.s2(fgbVar.S0(), topBets);
                                    }
                                } else {
                                    fgbVar.n1().z1();
                                    fgbVar.k1().A1(topBets.getBetId(), String.valueOf(topBets.getRoundId()));
                                    if (topBets.getBetIndex() == 1) {
                                        fgbVar.w2(fgbVar.R0(), topBets, false);
                                    } else {
                                        fgbVar.w2(fgbVar.S0(), topBets, false);
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                        }
                    }
                } else if (i5 != 2) {
                    if (i5 != 3) {
                        uhc.a();
                        return null;
                    }
                    if (!fgbVar.A && (gviVar4 = fgbVar.z) != null) {
                        gviVar4.Y.N();
                    }
                }
                return Unit.a;
            }
        }));
        f1().b.f(getViewLifecycleOwner(), new v(new w62(this, i4)));
        f1().c.f(getViewLifecycleOwner(), new v(new x62(this, i4)));
        if (d1().A && k2()) {
            fuj fujVarD1 = d1();
            String str6 = this.y0;
            Locale locale = Locale.ROOT;
            String lowerCase = str6.toLowerCase(locale);
            lowerCase.getClass();
            GameDetails gameDetails2 = this.i;
            String name2 = gameDetails2 != null ? gameDetails2.getName() : null;
            if (name2 == null) {
                name2 = "";
            }
            String strF = krh0.f(name2);
            String country = SportyGamesManager.getInstance().getCountry();
            String lowerCase2 = (country != null ? country : "").toLowerCase(locale);
            lowerCase2.getClass();
            fujVarD1.C1(lowerCase, strF, lowerCase2);
            loa0 loa0VarK1 = k1();
            String lowerCase3 = this.y0.toLowerCase(locale);
            lowerCase3.getClass();
            loa0VarK1.z1(lowerCase3, this.w0);
        }
    }

    public final void u0(ul2 ul2Var) {
        String giftId;
        Double partialBal;
        ul2Var.getClass();
        ul2Var.H1(true);
        wwd0 wwd0Var = ul2Var.a;
        ul2Var.G1(false);
        x5a0 x5a0Var = (x5a0) ul2Var.c;
        Double dValueOf = ((Boolean) x5a0Var.getValue()).booleanValue() ? Double.valueOf(Double.parseDouble((String) ((x5a0) ul2Var.N).getValue())) : null;
        x5a0Var.setValue(Boolean.valueOf(dValueOf != null));
        if (egb.a((BetContainerState) wwd0Var.getValue()) > 0) {
            Double partialBal2 = ((BetContainerState) wwd0Var.getValue()).getGift().getPartialBal();
            partialBal = (partialBal2 != null ? partialBal2.doubleValue() : 0.0d) > 0.0d ? ((BetContainerState) wwd0Var.getValue()).getGift().getPartialBal() : Double.valueOf(((BetContainerState) wwd0Var.getValue()).getGift().getCurBal());
            giftId = ((BetContainerState) wwd0Var.getValue()).getGift().getGiftId();
        } else {
            giftId = null;
            partialBal = null;
        }
        double minAmount = ((BetContainerState) wwd0Var.getValue()).getDetailResponse().getMinAmount();
        double doubleValue = ((s5a0) ul2Var.O).getDoubleValue();
        if (doubleValue >= minAmount) {
            minAmount = doubleValue;
        }
        CancelBetRequest cancelBetRequest = new CancelBetRequest(ul2Var.L.getValue().longValue(), String.valueOf(minAmount), ((BetContainerState) wwd0Var.getValue()).getDetailResponse().getBetIndex(), ((BetContainerState) wwd0Var.getValue()).getDetailResponse().getCurrency(), ((BetContainerState) wwd0Var.getValue()).getRoundId(), giftId, partialBal, dValueOf, this.h2, this.U0);
        final String strJ = new eal().j(cancelBetRequest);
        k1().G1(cancelBetRequest.getBetIndex(), strJ, String.valueOf(cancelBetRequest.getRoundId()), new Function0() { // from class: w8b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                fgb fgbVar = this.a;
                cgb.a(fgbVar.e1(), (String) ((x5a0) fgbVar.c1().v).getValue(), "cancelBet", strJ);
                return Unit.a;
            }
        });
        GameDetails gameDetails = this.i;
        wz.a("Cancel", gameDetails != null ? gameDetails.getName() : null, "1", "Off", "No");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007a  */
    public final void u2(MultiplierResponse multiplierResponse, ul2 ul2Var, int i3) {
        boolean z2;
        Double dValueOf = Double.valueOf(0.0d);
        Double dValueOf2 = Double.valueOf(1.0d);
        String str = (String) ((x5a0) c1().v).getValue();
        if (Intrinsics.g(str, "sporty-jet") || Intrinsics.g(str, "sporty jet") || Intrinsics.g(str, "sporty-hero") || Intrinsics.g(str, "Sporty Hero")) {
            return;
        }
        boolean z3 = false;
        if (!((BetContainerState) ul2Var.a.getValue()).getBetPlaced()) {
            z2 = false;
        } else if (multiplierResponse.getRoundId() != ((BetContainerState) ul2Var.a.getValue()).getRoundId()) {
            z2 = true;
            z3 = true;
        } else if (Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_ONGOING") || Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT")) {
            z2 = false;
        } else {
            z2 = false;
            z3 = true;
        }
        ytw<Double> ytwVar = this.c0;
        ytw<Double> ytwVar2 = this.b0;
        if (!z3) {
            if (i3 == 1) {
                ytwVar2.setValue(dValueOf);
            }
            if (i3 == 2) {
                ytwVar.setValue(dValueOf);
                return;
            }
            return;
        }
        if (i3 == 1) {
            ytwVar2.setValue(dValueOf2);
            ((x5a0) this.d0).setValue(Boolean.valueOf(z2));
        }
        if (i3 == 2) {
            ytwVar.setValue(dValueOf2);
            ((x5a0) this.e0).setValue(Boolean.valueOf(z2));
        }
    }

    public final void v0(ul2 ul2Var, Long l3) {
        String strValueOf;
        oeb oebVar;
        String currentMultiplier;
        ul2Var.getClass();
        MultiplierResponse multiplierResponse = this.x0;
        Double dH = (multiplierResponse == null || (currentMultiplier = multiplierResponse.getCurrentMultiplier()) == null) ? null : kotlin.text.b.h(currentMultiplier);
        ytw<Boolean> ytwVar = ul2Var.c;
        xsw xswVar = ul2Var.L;
        wwd0 wwd0Var = ul2Var.a;
        boolean zBooleanValue = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
        Double dH2 = kotlin.text.b.h((String) ((x5a0) ul2Var.N).getValue());
        if (zBooleanValue && dH != null && dH2 != null) {
            dH = Double.valueOf(dH.doubleValue() < dH2.doubleValue() ? dH.doubleValue() : dH2.doubleValue());
        }
        if (dH == null || (strValueOf = String.valueOf(dH.doubleValue())) == null) {
            strValueOf = "";
        }
        String str = strValueOf;
        Double dH3 = kotlin.text.b.h(str);
        int i3 = 1;
        CashoutRequest cashoutRequest = new CashoutRequest(xswVar.getValue().longValue(), ((BetContainerState) wwd0Var.getValue()).getRoundId(), str, Boolean.FALSE, String.valueOf(System.currentTimeMillis()), this.h2, k3(dH3 != null ? dH3.doubleValue() : 0.0d, ul2Var), Boolean.valueOf(((BetContainerState) wwd0Var.getValue()).isTurboBet()), Boolean.valueOf(((BetContainerState) wwd0Var.getValue()).isStakeSafeBet() || ((BetContainerState) wwd0Var.getValue()).isStakeSafeApplied()));
        ul2Var.K1(true);
        this.c2 = cashoutRequest;
        String strJ = new eal().j(cashoutRequest);
        if (k1().H1(xswVar.getValue().longValue(), strJ, String.valueOf(cashoutRequest.getRoundId()), new lf2(i3, this, strJ)) && l3 != null && (oebVar = c1().p0) != null) {
            oebVar.invoke(Long.valueOf(SystemClock.elapsedRealtime() - l3.longValue()));
        }
        GameDetails gameDetails = this.i;
        wz.a("Cashout", gameDetails != null ? gameDetails.getName() : null, "1", "Off", "No");
    }

    public final String v1() {
        return Intrinsics.g(((x5a0) c1().v).getValue(), "sporty-hero") ? "sporty-hero" : (String) ((x5a0) c1().z).getValue();
    }

    public final void v2(ul2 ul2Var, TopBets topBets) {
        ul2Var.J1(false);
        ul2Var.H1(false);
        ul2Var.I1(false);
        wwd0 wwd0Var = ul2Var.a;
        wwd0Var.setValue(BetContainerState.copy$default((BetContainerState) wwd0Var.getValue(), false, null, 0L, false, 0, null, null, false, false, false, 0, false, 0, false, new TopBets(0L, 0L, 0, 0, 0.0d, 0.0d, null, "", "", "", "", "", "", "", "", null, null, null, null, null, null, null, null, null, 16252928, null), false, false, false, false, false, false, false, false, 8372223, null));
        loa0 loa0VarK1 = k1();
        String strValueOf = String.valueOf(topBets.getRoundId());
        int betIndex = topBets.getBetIndex();
        loa0VarK1.getClass();
        strValueOf.getClass();
        loa0VarK1.K.remove(loa0.E1(betIndex, strValueOf));
        if (topBets.getGiftAmount() != null) {
            J0();
            f1().x1();
            ((v5a0) ul2Var.Q).K(0L);
        }
        ul2Var.J1(false);
        Context context = getContext();
        if (context != null) {
            if (this.s0 || l2()) {
                Intent intent = new Intent("custom-event-name");
                intent.putExtra("number", "1");
                intent.putExtra("enable button", true);
                fdt.a(context).c(intent);
            }
        }
    }

    public final void w2(ul2 ul2Var, TopBets topBets, boolean z2) {
        ul2Var.O1(new GiftItem(0.0d, "", "", "", 0.0d, 0L, 0, Double.valueOf(0.0d), null));
        ytw<Boolean> ytwVar = ul2Var.R;
        Boolean bool = Boolean.TRUE;
        ((x5a0) ytwVar).setValue(bool);
        x5a0 x5a0Var = (x5a0) ul2Var.d;
        HashMap map = new HashMap((Map) x5a0Var.getValue());
        map.put(Long.valueOf(topBets.getRoundId()), bool);
        x5a0Var.setValue(map);
        ul2Var.K1(false);
        ul2Var.J1(false);
        ul2Var.W1(topBets);
        boolean zIsStakeSafeBet = ((BetContainerState) ul2Var.a.getValue()).isStakeSafeBet();
        ul2Var.F1(false);
        ul2Var.C1(false);
        if (zIsStakeSafeBet) {
            ul2Var.A1(false);
        }
        if (topBets.getGiftAmount() != null) {
            J0();
            f1().x1();
        }
        Context context = getContext();
        if (context != null && (this.s0 || l2())) {
            Intent intent = new Intent("custom-event-name");
            intent.putExtra("number", "1");
            intent.putExtra("enable button", true);
            fdt.a(context).c(intent);
        }
        F1(ul2Var, topBets, zIsStakeSafeBet);
        nas nasVarA = ebs.a(getLifecycle());
        pfd pfdVar = fse.a;
        ej5.c(nasVarA, gku.a, null, new w(z2, this, topBets, null), 2);
    }

    public final boolean x1() {
        return (this.g1.size() > 0 && egb.a((BetContainerState) R0().a.getValue()) == 0 && egb.a((BetContainerState) S0().a.getValue()) == 0) ? false : true;
    }

    public final void x2(ul2 ul2Var, int i3) {
        ul2Var.I1(false);
        ul2Var.K1(false);
        if (i3 != 8019) {
            ((x5a0) ul2Var.d).setValue(new HashMap());
        }
        Context context = getContext();
        if (context != null) {
            if (this.s0 || l2()) {
                Intent intent = new Intent("custom-event-name");
                intent.putExtra("number", ((BetContainerState) ul2Var.a.getValue()).getDetailResponse().getBetIndex());
                intent.putExtra("enable button", true);
                fdt.a(context).c(intent);
            }
        }
    }

    public final Long y0() {
        if (R2()) {
            return Long.valueOf(SystemClock.elapsedRealtime());
        }
        return null;
    }

    public final boolean y1() {
        return !z1();
    }

    /* JADX WARN: Code duplicated, block: B:50:0x015a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0170  */
    /* JADX WARN: Code duplicated, block: B:56:0x0175  */
    /* JADX WARN: Code duplicated, block: B:58:0x018a  */
    /* JADX WARN: Code duplicated, block: B:93:0x026c  */
    public final void y2(z83 z83Var, ul2 ul2Var) {
        Object value;
        String name;
        String str;
        Double dValueOf = Double.valueOf(0.0d);
        z83 z83Var2 = z83.b;
        SnapshotStateList<ps6> snapshotStateList = this.g0;
        boolean z2 = false;
        if (z83Var == z83Var2) {
            op5 op5Var = op5.a;
            String string = getString(R.string.cash_out_upper_case_cms);
            string.getClass();
            String string2 = getString(R.string.cashout_button_text);
            string2.getClass();
            op5Var.getClass();
            String strB = op5.b(string, string2, null);
            ytw<MultiplierResponse> ytwVar = ul2Var.b;
            wwd0 wwd0Var = ul2Var.a;
            String currentMultiplier = ((MultiplierResponse) ((x5a0) ytwVar).getValue()).getCurrentMultiplier();
            BigDecimal bigDecimalMin = w0(currentMultiplier != null ? Double.parseDouble(currentMultiplier) : 0.0d, ul2Var.O.getValue().doubleValue()).min(new BigDecimal(String.valueOf(((BetContainerState) wwd0Var.getValue()).getDetailResponse().getMaxPayoutAmount())));
            Object scale = bigDecimalMin != null ? bigDecimalMin.setScale(2, RoundingMode.HALF_UP) : null;
            if (l2()) {
                str = strB + "\n" + scale;
            } else {
                str = strB + "\n" + op5.i(this.y0) + " " + scale;
            }
            int betIndex = ((BetContainerState) wwd0Var.getValue()).getDetailResponse().getBetIndex();
            if (this.h0.contains(Integer.valueOf(betIndex))) {
                return;
            }
            ListIterator<ps6> listIterator = snapshotStateList.listIterator();
            int i3 = 0;
            while (true) {
                dxd0 dxd0Var = (dxd0) listIterator;
                if (!dxd0Var.hasNext()) {
                    i3 = -1;
                    break;
                } else if (((ps6) dxd0Var.next()).b == betIndex) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 == -1) {
                snapshotStateList.add(new ps6(betIndex, "CASHOUT", str, false));
            } else {
                snapshotStateList.set(i3, new ps6(betIndex, "CASHOUT", str, false));
            }
            this.b0.setValue(dValueOf);
            this.c0.setValue(dValueOf);
            return;
        }
        if (z83Var != z83.c) {
            final int betIndex2 = ((BetContainerState) ul2Var.a.getValue()).getDetailResponse().getBetIndex();
            p48.A(snapshotStateList, new Function1() { // from class: abb
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ps6 ps6Var = (ps6) obj;
                    ps6Var.getClass();
                    return Boolean.valueOf(ps6Var.b == betIndex2);
                }
            });
            return;
        }
        String str2 = (String) ((x5a0) c1().v).getValue();
        if (Intrinsics.g(str2, "sporty-jet") || Intrinsics.g(str2, "sporty jet") || Intrinsics.g(str2, "sporty-hero") || Intrinsics.g(str2, "Sporty Hero")) {
            if (Intrinsics.g(str2, "sporty-hero") || Intrinsics.g(str2, "Sporty Hero")) {
                final int betIndex3 = ((BetContainerState) ul2Var.a.getValue()).getDetailResponse().getBetIndex();
                p48.A(snapshotStateList, new Function1() { // from class: yab
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ps6 ps6Var = (ps6) obj;
                        ps6Var.getClass();
                        return Boolean.valueOf(ps6Var.b == betIndex3);
                    }
                });
                return;
            }
            return;
        }
        wwd0 wwd0Var2 = ul2Var.a;
        ytw<MultiplierResponse> ytwVar2 = ul2Var.b;
        final int betIndex4 = ((BetContainerState) wwd0Var2.getValue()).getDetailResponse().getBetIndex();
        GameDetails gameDetails = this.i;
        if (gameDetails == null || (name = gameDetails.getName()) == null) {
            value = ((x5a0) c1().w).getValue();
            if (StringsKt.U((String) value)) {
                value = null;
            }
            name = (String) value;
            if (name == null) {
                Object value2 = ((x5a0) c1().v).getValue();
                name = (String) (StringsKt.U((String) value2) ? null : value2);
            }
        } else {
            if (StringsKt.U(name)) {
                name = null;
            }
            if (name == null) {
                value = ((x5a0) c1().w).getValue();
                if (StringsKt.U((String) value)) {
                    value = null;
                }
                name = (String) value;
                if (name == null) {
                    Object value3 = ((x5a0) c1().v).getValue();
                    name = (String) (StringsKt.U((String) value3) ? null : value3);
                }
            }
        }
        if (!dg7.m(name)) {
            p48.A(snapshotStateList, new Function1() { // from class: zab
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ps6 ps6Var = (ps6) obj;
                    ps6Var.getClass();
                    return Boolean.valueOf(ps6Var.b == betIndex4);
                }
            });
            return;
        }
        long roundId = ((BetContainerState) wwd0Var2.getValue()).getRoundId();
        boolean z3 = true;
        boolean z4 = roundId == 0 || roundId != ((MultiplierResponse) ((x5a0) ytwVar2).getValue()).getRoundId();
        op5 op5Var2 = op5.a;
        String string3 = getString(R.string.bet_cancel_cms);
        string3.getClass();
        String string4 = getString(R.string.cancel);
        string4.getClass();
        String strC = op5.c(op5Var2, string3, string4);
        Locale locale = Locale.getDefault();
        locale.getClass();
        String upperCase = strC.toUpperCase(locale);
        upperCase.getClass();
        ListIterator<ps6> listIterator2 = snapshotStateList.listIterator();
        int i4 = 0;
        while (true) {
            dxd0 dxd0Var2 = (dxd0) listIterator2;
            if (!dxd0Var2.hasNext()) {
                i4 = -1;
                break;
            } else if (((ps6) dxd0Var2.next()).b == betIndex4) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 == -1) {
            snapshotStateList.add(new ps6(betIndex4, "CANCEL", upperCase, z4));
        } else {
            snapshotStateList.set(i4, new ps6(betIndex4, "CANCEL", upperCase, z4));
        }
        if (((BetContainerState) wwd0Var2.getValue()).getBetPlaced()) {
            x5a0 x5a0Var = (x5a0) ytwVar2;
            if (((MultiplierResponse) x5a0Var.getValue()).getRoundId() != ((BetContainerState) wwd0Var2.getValue()).getRoundId()) {
                z2 = true;
            } else if (Intrinsics.g(((MultiplierResponse) x5a0Var.getValue()).getMessageType(), "ROUND_ONGOING") || Intrinsics.g(((MultiplierResponse) x5a0Var.getValue()).getMessageType(), "ROUND_END_WAIT")) {
                z3 = false;
            } else {
                z2 = true;
                z3 = false;
            }
        } else {
            z3 = false;
        }
        if (z2) {
            op5 op5Var3 = op5.a;
            String string5 = getString(R.string.waiting_next_round_cms);
            string5.getClass();
            String string6 = getString(R.string.waiting_for_next_round);
            string6.getClass();
            String strC2 = op5.c(op5Var3, string5, string6);
            Intent intent = new Intent("custom-event-name");
            intent.putExtra(EventKeys.ERROR_MESSAGE, z3 ? "CANCEL\n".concat(strC2) : "CANCEL");
            intent.putExtra("betIndex", ((BetContainerState) wwd0Var2.getValue()).getDetailResponse().getBetIndex());
            Context context = getContext();
            if (context != null) {
                fdt.a(context).c(intent);
            }
        }
    }

    public final void z0() {
        FragmentManager supportFragmentManager;
        gvi gviVar;
        Double dValueOf = Double.valueOf(0.0d);
        try {
            if (this.s0) {
                return;
            }
            F0();
            R0().I1(false);
            S0().I1(false);
            R0().K1(false);
            S0().K1(false);
            ssw<Boolean> sswVar = f1().d;
            Boolean bool = Boolean.FALSE;
            sswVar.m(bool);
            loa0 loa0VarK1 = k1();
            loa0VarK1.x1();
            loa0VarK1.b.e();
            k1().getClass();
            this.J0 = true;
            this.L1 = false;
            this.B = false;
            ((x5a0) c1().Z).setValue(bool);
            Y0().B1(new PreviousMultiplierResponse(0, new ArrayList()));
            R0().G1(false);
            S0().G1(false);
            ((x5a0) R0().c).setValue(bool);
            ((x5a0) S0().c).setValue(bool);
            ((u5a0) S0().M).k(0);
            ((u5a0) R0().M).k(0);
            R0().O1(new GiftItem(0.0d, "", "", "", 0.0d, 0L, 0, dValueOf, null));
            S0().O1(new GiftItem(0.0d, "", "", "", 0.0d, 0L, 0, dValueOf, null));
            G0();
            ytw<Boolean> ytwVar = S0().R;
            Boolean bool2 = Boolean.TRUE;
            ((x5a0) ytwVar).setValue(bool2);
            ((x5a0) R0().R).setValue(bool2);
            ((x5a0) R0().N).setValue("5");
            ((x5a0) S0().N).setValue("5");
            ((x5a0) this.Z0).setValue(bool);
            ((x5a0) this.k1).setValue(bool);
            ((x5a0) this.l1).setValue(bool);
            ((x5a0) this.m1).setValue(bool);
            ((x5a0) this.a1).setValue(bool);
            ((x5a0) this.e1).setValue(bool);
            ((x5a0) this.j1).setValue(bool);
            R0().R1(false);
            S0().R1(false);
            gvi gviVar2 = this.z;
            if (gviVar2 != null) {
                gviVar2.H.d();
            }
            ab8 ab8Var = this.w1;
            if (ab8Var != null) {
                ab8Var.dismiss();
            }
            H0();
            if (!Intrinsics.g(((x5a0) c1().v).getValue(), "sporty-cars") && (gviVar = this.z) != null) {
                gviVar.W.setVisibility(8);
            }
            gvi gviVar3 = this.z;
            if (gviVar3 != null) {
                gviVar3.N.setVisibility(8);
            }
            gvi gviVar4 = this.z;
            if (gviVar4 != null) {
                gviVar4.V.setVisibility(8);
            }
            gvi gviVar5 = this.z;
            if (gviVar5 != null) {
                gviVar5.M.setVisibility(8);
            }
            gvi gviVar6 = this.z;
            if (gviVar6 != null) {
                gviVar6.U.setVisibility(8);
            }
            gvi gviVar7 = this.z;
            if (gviVar7 != null) {
                gviVar7.c.setVisibility(4);
            }
            gvi gviVar8 = this.z;
            if (gviVar8 != null) {
                gviVar8.d.setVisibility(4);
            }
            gvi gviVar9 = this.z;
            if (gviVar9 != null) {
                gviVar9.c0.setVisibility(8);
            }
            gvi gviVar10 = this.z;
            if (gviVar10 != null) {
                gviVar10.f0.setVisibility(4);
            }
            gvi gviVar11 = this.z;
            if (gviVar11 != null) {
                gviVar11.e0.setVisibility(4);
            }
            Z0().g(false);
            gvi gviVar12 = this.z;
            if (gviVar12 != null) {
                gviVar12.h0.setVisibility(8);
            }
            gvi gviVar13 = this.z;
            if (gviVar13 != null) {
                gviVar13.i0.setVisibility(8);
            }
            gvi gviVar14 = this.z;
            if (gviVar14 != null) {
                gviVar14.w0.setVisibility(8);
            }
            gvi gviVar15 = this.z;
            if (gviVar15 != null) {
                gviVar15.X.setVisibility(8);
            }
            gvi gviVar16 = this.z;
            if (gviVar16 != null) {
                gviVar16.L.setVisibility(8);
            }
            gvi gviVar17 = this.z;
            if (gviVar17 != null) {
                gviVar17.i.setVisibility(8);
            }
            gvi gviVar18 = this.z;
            if (gviVar18 != null) {
                gviVar18.T.setVisibility(8);
            }
            gvi gviVar19 = this.z;
            if (gviVar19 != null) {
                gviVar19.e.setVisibility(8);
            }
            gvi gviVar20 = this.z;
            if (gviVar20 != null) {
                gviVar20.v.setVisibility(8);
            }
            gvi gviVar21 = this.z;
            if (gviVar21 != null) {
                gviVar21.w.setVisibility(8);
            }
            gvi gviVar22 = this.z;
            if (gviVar22 != null) {
                gviVar22.p0.setVisibility(8);
            }
            gvi gviVar23 = this.z;
            if (gviVar23 != null) {
                gviVar23.n0.setVisibility(8);
            }
            gvi gviVar24 = this.z;
            if (gviVar24 != null) {
                gviVar24.o0.setVisibility(8);
            }
            gvi gviVar25 = this.z;
            if (gviVar25 != null) {
                gviVar25.b0.setVisibility(8);
            }
            gvi gviVar26 = this.z;
            if (gviVar26 != null) {
                gviVar26.z.setVisibility(8);
            }
            gvi gviVar27 = this.z;
            if (gviVar27 != null) {
                gviVar27.a0.setVisibility(8);
            }
            ((x5a0) c1().h0).setValue(bool);
            ((x5a0) c1().b0).setValue(bool);
            ((x5a0) c1().c0).setValue(bool);
            R0().R1(false);
            l1().I1();
            loa0 loa0VarK2 = k1();
            loa0VarK2.K.clear();
            loa0VarK2.L.clear();
            loa0VarK2.M.clear();
            androidx.fragment.app.e activity = getActivity();
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                return;
            }
            supportFragmentManager.a0();
        } catch (Exception unused) {
        }
    }

    public final boolean z1() {
        return k1().D1();
    }

    public final void z2(int i3, String str) {
        int[] iArr;
        Context context = getContext();
        if (context != null) {
            if (!sny.a(context, str).isEmpty()) {
                Function1<? super Integer, Unit> function1 = this.K1;
                if (function1 != null) {
                    function1.invoke(Integer.valueOf(i3));
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (str.equals("sporty-hero")) {
                iArr = new int[2];
                for (int i4 = 0; i4 < 2; i4++) {
                    iArr[i4] = i4;
                }
            } else {
                iArr = this.x2;
            }
            int length = iArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                int i6 = iArr[i5];
                arrayList.add(new OnboardingItem(Integer.valueOf(i5), Boolean.FALSE));
            }
            sny.b(this.J, arrayList, str);
            pfd pfdVar = fse.a;
            ej5.c(w5b.a(gku.a), null, null, new x(i3, null), 3);
        }
    }

    public final mz1 b1() {
        mz1 mz1Var = this.V1;
        if (mz1Var != null) {
            return mz1Var;
        }
        Intrinsics.n(qUnCRF.zdHlaGeZRebP);
        throw null;
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class m2 extends CountDownTimer {
        public final /* synthetic */ fgb a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m2(cq40 cq40Var, fgb fgbVar) {
            super(cq40Var.a, 1000L);
            this.a = fgbVar;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            fgb fgbVar = this.a;
            RainTopicResponse rainTopicResponse = fgbVar.x1;
            if (rainTopicResponse != null) {
                String messageType = rainTopicResponse.getMessageType();
                if (messageType == null) {
                    messageType = "";
                }
                String lowerCase = messageType.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                tv30[] tv30VarArr = tv30.a;
                if (lowerCase.equals("upcoming")) {
                    return;
                }
                fgbVar.l3("", false);
                qv30.a.j(null);
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class y implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View a;

        public y(View view) {
            this.a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.a.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            r6i0.c.c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
