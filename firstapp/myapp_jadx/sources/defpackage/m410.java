package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
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
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.commons.components.a;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.LeftMenuButton;
import com.sportygames.commons.models.MenuIconSize;
import com.sportygames.commons.models.NetworkStateManager;
import com.sportygames.commons.models.OnboardingItem;
import com.sportygames.commons.models.PagingState;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.models.enums.PagingFetchType;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.utils.CasinoLogger;
import com.sportygames.commons.viewmodels.FbgData;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import com.sportygames.crash.components.header.DepositTooltipComponent;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.remote.models.LobbyMetaInfo;
import com.sportygames.pingpong.components.ShBetContainer;
import com.sportygames.pingpong.components.ShHeaderContainer;
import com.sportygames.pingpong.components.ShMultiplierContainer;
import com.sportygames.pingpong.components.ShRoundBetsContainer;
import com.sportygames.pingpong.components.ShRoundHistoryContainer;
import com.sportygames.pingpong.remote.models.CashoutRequest;
import com.sportygames.pingpong.remote.models.ChatRoomResponse;
import com.sportygames.pingpong.remote.models.DetailResponse;
import com.sportygames.pingpong.remote.models.DetailResponseData;
import com.sportygames.pingpong.remote.models.MultiplierResponse;
import com.sportygames.pingpong.remote.models.PlaceBetRequest;
import com.sportygames.pingpong.remote.models.RoundBetResponse;
import com.sportygames.pingpong.remote.models.RoundInfoResponse;
import com.sportygames.pingpong.remote.models.TopBets;
import com.sportygames.pingpong.remote.models.UserInfoResponseSocket;
import com.sportygames.pingpong.remote.models.WalletInfo;
import com.sportygames.pingpong.utils.HeaderPayload;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import com.sportygames.sportyherov2.components.SHToastContainer;
import com.twilio.voice.Constants;
import com.twilio.voice.EventKeys;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
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
import kotlin.text.c;
import m410.g;
import m410.h;
import m410.i;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lm410;", "Ll12;", "Lgoa0;", "Lixi;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "Lbb;", "", "Lxjj;", "<init>", "()V", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m410 extends l12<goa0, ixi> implements GameMainActivity.b, bb, xjj {
    public String A;
    public ArrayList<GameDetails> A0;
    public String B;
    public final j1b B0;
    public String C;
    public ArrayList<GiftItem> C0;
    public boolean D;
    public boolean D0;
    public boolean E;
    public boolean E0;
    public int F;
    public final String F0;
    public int G;
    public int G0;
    public boolean H;
    public int H0;
    public boolean I;
    public final ArrayList<String> I0;
    public long J;
    public boolean J0;
    public long K;
    public boolean K0;
    public long L;
    public int L0;
    public boolean M;
    public boolean M0;
    public boolean N;
    public boolean N0;
    public boolean O;
    public long O0;
    public ty50 P;
    public final int P0;
    public tj60 Q;
    public int Q0;
    public final boolean R;
    public int R0;
    public nv80 S;
    public final int S0;
    public n2g0 T;
    public final int T0;
    public MultiplierResponse U;
    public final int U0;
    public SharedPreferences V;
    public final int V0;
    public SharedPreferences.Editor W;
    public boolean W0;
    public Long X;
    public boolean X0;
    public boolean Y;
    public boolean Y0;
    public boolean Z;
    public boolean Z0;
    public mj60 a0;
    public final yj2 a1;
    public pl60 b0;
    public final yj2 b1;
    public final ttr c = hwr.a(a1s.a, new t());
    public xbg c0;
    public z66 c1;
    public final q8i0 d;
    public boolean d0;
    public boolean d1;
    public final q8i0 e;
    public double e0;
    public final q8i0 e1;
    public final q8i0 f;
    public Double f0;
    public final q8i0 f1;
    public boolean g0;
    public boolean g1;
    public boolean h0;
    public boolean h1;
    public final q8i0 i;
    public boolean i0;
    public String i1;
    public boolean j0;
    public int j1;
    public boolean k0;
    public svg k1;
    public boolean l0;
    public final ytw<Boolean> l1;
    public f m0;
    public final ytw<Boolean> m1;
    public final ArrayList n0;
    public final ytw<Double> n1;
    public final ArrayList o0;
    public final ytw<Double> o1;
    public tb5 p0;
    public final ytw<Double> p1;
    public tb5 q0;
    public boolean q1;
    public boolean r0;
    public GameDetails r1;
    public FragmentManager s0;
    public ImageView[] s1;
    public boolean t0;
    public jvd0 t1;
    public String u0;
    public long u1;
    public ypa0 v;
    public String v0;
    public DetailResponseData w;
    public PromotionGiftsResponse w0;
    public xi60 x0;
    public final q8i0 y;
    public boolean y0;
    public String z;
    public a z0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
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

    public static final class a0 extends qlr implements Function0<Fragment> {
        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return m410.this;
        }
    }

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
            try {
                a aVar3 = a.a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Status.values().length];
            try {
                iArr2[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Status.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr2;
        }
    }

    public static final class b0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ a0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(a0 a0Var) {
            super(0);
            this.a = a0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    @c0d(c = "com.sportygames.pingpong.views.PingPongFragment$callWalletApi$1", f = "PingPongFragment.kt", l = {6804}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return m410.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            m410 m410Var = m410.this;
            if (i == 0) {
                uj50.b(obj);
                m410Var.N0 = true;
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
            m410Var.L0().y1();
            m410Var.N0 = false;
            return Unit.a;
        }
    }

    public static final class c0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    @c0d(c = "com.sportygames.pingpong.views.PingPongFragment$handleBgFlash$1$1", f = "PingPongFragment.kt", l = {4395, 4397, 4399, 4401, 4403}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ImageView[] c;
        public final /* synthetic */ Context d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ImageView[] imageViewArr, Context context, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.c = imageViewArr;
            this.d = context;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return m410.this.new d(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0068  */
        /* JADX WARN: Code duplicated, block: B:28:0x0078  */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
        
            if (defpackage.hkd.b(700, r12) == r0) goto L30;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r12.a
                r2 = 500(0x1f4, double:2.47E-321)
                r4 = 5
                r5 = 4
                r6 = 3
                r7 = 2
                r8 = 1
                android.content.Context r9 = r12.d
                android.widget.ImageView[] r10 = r12.c
                m410 r11 = defpackage.m410.this
                if (r1 == 0) goto L38
                if (r1 == r8) goto L34
                if (r1 == r7) goto L30
                if (r1 == r6) goto L2c
                if (r1 == r5) goto L28
                if (r1 != r4) goto L21
                defpackage.uj50.b(r13)
                goto L88
            L21:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r12)
                r12 = 0
                return r12
            L28:
                defpackage.uj50.b(r13)
                goto L78
            L2c:
                defpackage.uj50.b(r13)
                goto L68
            L30:
                defpackage.uj50.b(r13)
                goto L58
            L34:
                defpackage.uj50.b(r13)
                goto L4a
            L38:
                defpackage.uj50.b(r13)
                r13 = 0
                r13 = r10[r13]
                r11.B1(r13, r9)
                r12.a = r8
                java.lang.Object r13 = defpackage.hkd.b(r2, r12)
                if (r13 != r0) goto L4a
                goto L87
            L4a:
                r13 = r10[r8]
                r11.B1(r13, r9)
                r12.a = r7
                java.lang.Object r13 = defpackage.hkd.b(r2, r12)
                if (r13 != r0) goto L58
                goto L87
            L58:
                r13 = r10[r7]
                r11.B1(r13, r9)
                r12.a = r6
                r1 = 300(0x12c, double:1.48E-321)
                java.lang.Object r13 = defpackage.hkd.b(r1, r12)
                if (r13 != r0) goto L68
                goto L87
            L68:
                r13 = r10[r6]
                r11.B1(r13, r9)
                r12.a = r5
                r1 = 600(0x258, double:2.964E-321)
                java.lang.Object r13 = defpackage.hkd.b(r1, r12)
                if (r13 != r0) goto L78
                goto L87
            L78:
                r13 = r10[r5]
                r11.B1(r13, r9)
                r12.a = r4
                r1 = 700(0x2bc, double:3.46E-321)
                java.lang.Object r12 = defpackage.hkd.b(r1, r12)
                if (r12 != r0) goto L88
            L87:
                return r0
            L88:
                r12 = r10[r4]
                r11.B1(r12, r9)
                kotlin.Unit r12 = kotlin.Unit.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: m410.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(ttr ttrVar) {
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

    public static final /* synthetic */ class e extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((m410) this.receiver).t1();
            return Unit.a;
        }
    }

    public static final class e0 extends qlr implements Function0<Fragment> {
        public e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return m410.this;
        }
    }

    public static final class f extends BroadcastReceiver {
        public f() {
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0073  */
        /* JADX WARN: Code duplicated, block: B:82:0x017b  */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            rk60 soundManager;
            ixi ixiVar;
            CashoutRequest cashoutRequest;
            CashoutRequest cashoutRequest2;
            ixi ixiVar2;
            intent.getClass();
            boolean zL = kotlin.text.c.l(intent.getAction(), "cashoutCall", false);
            final m410 m410Var = m410.this;
            if (!zL) {
                if (!kotlin.text.c.l(intent.getAction(), "playCashout", false)) {
                    ixi ixiVar3 = (ixi) m410Var.b;
                    if (ixiVar3 == null || (soundManager = ixiVar3.U.getSoundManager()) == null) {
                        return;
                    }
                    ypa0 ypa0Var = m410Var.v;
                    if (ypa0Var != null) {
                        ypa0Var.F1(soundManager, new ued(m410Var, 1));
                        return;
                    } else {
                        Intrinsics.n("soundViewModel");
                        throw null;
                    }
                }
                SharedPreferences sharedPreferences = m410Var.V;
                if (sharedPreferences == null || !sharedPreferences.getBoolean("PING_PONG_SOUND", true)) {
                    return;
                }
                ypa0 ypa0Var2 = m410Var.v;
                if (ypa0Var2 == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                String string = m410Var.getString(R.string.cashout);
                string.getClass();
                ypa0Var2.A1(0L, string);
                return;
            }
            int intExtra = intent.getIntExtra("betIndex", 0);
            MultiplierResponse multiplierResponse = m410Var.U;
            if (intExtra == 1) {
                if (multiplierResponse == null || multiplierResponse.getMultiplier() == null) {
                    return;
                }
                ixi ixiVar4 = (ixi) m410Var.b;
                if (ixiVar4 != null) {
                    long betId = ixiVar4.b.getBetId();
                    ixi ixiVar5 = (ixi) m410Var.b;
                    if (ixiVar5 != null) {
                        long roundId = ixiVar5.b.getRoundId();
                        MultiplierResponse multiplierResponse2 = m410Var.U;
                        if (multiplierResponse2 == null) {
                            Intrinsics.n("multiplierResponse");
                            throw null;
                        }
                        String multiplier = multiplierResponse2.getMultiplier();
                        cashoutRequest2 = new CashoutRequest(betId, roundId, multiplier == null ? "" : multiplier, Boolean.FALSE, String.valueOf(System.currentTimeMillis()), m410Var.d1);
                    } else {
                        cashoutRequest2 = null;
                    }
                } else {
                    cashoutRequest2 = null;
                }
                ixi ixiVar6 = (ixi) m410Var.b;
                if ((ixiVar6 != null ? ixiVar6.b.getBetId() : 0L) <= 0 || (ixiVar2 = (ixi) m410Var.b) == null) {
                    return;
                }
                Long lValueOf = Long.valueOf(ixiVar2.b.getRoundId());
                MultiplierResponse multiplierResponse3 = m410Var.U;
                if (multiplierResponse3 == null) {
                    Intrinsics.n("multiplierResponse");
                    throw null;
                }
                if (!lValueOf.equals(Long.valueOf(multiplierResponse3.getRoundId())) || cashoutRequest2 == null) {
                    return;
                }
                final String strJ = new eal().j(cashoutRequest2);
                goa0 goa0Var = (goa0) m410Var.a;
                if (goa0Var != null) {
                    ixi ixiVar7 = (ixi) m410Var.b;
                    Long lValueOf2 = ixiVar7 != null ? Long.valueOf(ixiVar7.b.getRoundId()) : null;
                    ixi ixiVar8 = (ixi) m410Var.b;
                    goa0.H1(goa0Var, strJ, lValueOf2, ixiVar8 != null ? Long.valueOf(ixiVar8.b.getBetId()) : null, new Function0() { // from class: f510
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            m410 m410Var2 = m410Var;
                            cgb.a(m410Var2.P0(), m410Var2.F0, "cashout", strJ);
                            return Unit.a;
                        }
                    });
                }
                GameDetails gameDetails = m410Var.r1;
                wz.a("Cashout", gameDetails != null ? gameDetails.getName() : null, "1", "Off", "No");
                m410Var.b1("1", true);
                return;
            }
            if (multiplierResponse == null || multiplierResponse.getMultiplier() == null) {
                return;
            }
            ixi ixiVar9 = (ixi) m410Var.b;
            if ((ixiVar9 != null ? ixiVar9.c.getBetId() : 0L) <= 0 || (ixiVar = (ixi) m410Var.b) == null) {
                return;
            }
            Long lValueOf3 = Long.valueOf(ixiVar.c.getRoundId());
            MultiplierResponse multiplierResponse4 = m410Var.U;
            if (multiplierResponse4 == null) {
                Intrinsics.n("multiplierResponse");
                throw null;
            }
            if (lValueOf3.equals(Long.valueOf(multiplierResponse4.getRoundId()))) {
                ixi ixiVar10 = (ixi) m410Var.b;
                if (ixiVar10 != null) {
                    long betId2 = ixiVar10.c.getBetId();
                    ixi ixiVar11 = (ixi) m410Var.b;
                    if (ixiVar11 != null) {
                        long roundId2 = ixiVar11.c.getRoundId();
                        MultiplierResponse multiplierResponse5 = m410Var.U;
                        if (multiplierResponse5 == null) {
                            Intrinsics.n("multiplierResponse");
                            throw null;
                        }
                        String multiplier2 = multiplierResponse5.getMultiplier();
                        cashoutRequest = new CashoutRequest(betId2, roundId2, multiplier2 == null ? "" : multiplier2, Boolean.FALSE, String.valueOf(System.currentTimeMillis()), m410Var.d1);
                    } else {
                        cashoutRequest = null;
                    }
                } else {
                    cashoutRequest = null;
                }
                if (cashoutRequest != null) {
                    String strJ2 = new eal().j(cashoutRequest);
                    goa0 goa0Var2 = (goa0) m410Var.a;
                    if (goa0Var2 != null) {
                        ixi ixiVar12 = (ixi) m410Var.b;
                        Long lValueOf4 = ixiVar12 != null ? Long.valueOf(ixiVar12.c.getRoundId()) : null;
                        ixi ixiVar13 = (ixi) m410Var.b;
                        goa0.H1(goa0Var2, strJ2, lValueOf4, ixiVar13 != null ? Long.valueOf(ixiVar13.c.getBetId()) : null, new zhi(1, m410Var, strJ2));
                    }
                    GameDetails gameDetails2 = m410Var.r1;
                    wz.a("Cashout", gameDetails2 != null ? gameDetails2.getName() : null, "2", "No");
                    m410Var.b1("2", true);
                }
            }
        }
    }

    public static final class f0 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? m410.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    @c0d(c = "com.sportygames.pingpong.views.PingPongFragment$onViewCreated$2$2", f = "PingPongFragment.kt", l = {518}, m = "invokeSuspend", v = 1)
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public g(v1b<? super g> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return m410.this.new g(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
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
            m410.this.r0 = false;
            return Unit.a;
        }
    }

    public static final class g0 extends qlr implements Function0<Fragment> {
        public g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return m410.this;
        }
    }

    @c0d(c = "com.sportygames.pingpong.views.PingPongFragment$onViewCreated$53$2", f = "PingPongFragment.kt", l = {1781, 1783}, m = "invokeSuspend", v = 1)
    public static final class h extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public h(v1b<? super h> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return m410.this.new h(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((h) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        
            if (defpackage.hkd.b(2200, r7) == r0) goto L18;
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
                m410 r2 = defpackage.m410.this
                r3 = 2200(0x898, double:1.087E-320)
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L1f
                if (r1 == r6) goto L1b
                if (r1 != r5) goto L14
                defpackage.uj50.b(r8)
                goto L3f
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
                goto L3e
            L2b:
                B extends g6i0 r8 = r2.b
                ixi r8 = (defpackage.ixi) r8
                if (r8 == 0) goto L36
                com.sportygames.sportyherov2.components.SHToastContainer r8 = r8.X
                r8.setFadeOut()
            L36:
                r7.a = r5
                java.lang.Object r7 = defpackage.hkd.b(r3, r7)
                if (r7 != r0) goto L3f
            L3e:
                return r0
            L3f:
                B extends g6i0 r7 = r2.b
                ixi r7 = (defpackage.ixi) r7
                if (r7 == 0) goto L4c
                com.sportygames.sportyherov2.components.SHToastContainer r7 = r7.X
                r8 = 8
                r7.setVisibility(r8)
            L4c:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: m410.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class h0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ g0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(g0 g0Var) {
            super(0);
            this.a = g0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    @c0d(c = "com.sportygames.pingpong.views.PingPongFragment$onViewCreated$56$2", f = "PingPongFragment.kt", l = {1846, 1848}, m = "invokeSuspend", v = 1)
    public static final class i extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public i(v1b<? super i> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return m410.this.new i(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((i) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        
            if (defpackage.hkd.b(2200, r7) == r0) goto L18;
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
                m410 r2 = defpackage.m410.this
                r3 = 2200(0x898, double:1.087E-320)
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L1f
                if (r1 == r6) goto L1b
                if (r1 != r5) goto L14
                defpackage.uj50.b(r8)
                goto L3f
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
                goto L3e
            L2b:
                B extends g6i0 r8 = r2.b
                ixi r8 = (defpackage.ixi) r8
                if (r8 == 0) goto L36
                com.sportygames.sportyherov2.components.SHToastContainer r8 = r8.X
                r8.setFadeOut()
            L36:
                r7.a = r5
                java.lang.Object r7 = defpackage.hkd.b(r3, r7)
                if (r7 != r0) goto L3f
            L3e:
                return r0
            L3f:
                B extends g6i0 r7 = r2.b
                ixi r7 = (defpackage.ixi) r7
                if (r7 == 0) goto L4c
                com.sportygames.sportyherov2.components.SHToastContainer r7 = r7.X
                r8 = 8
                r7.setVisibility(r8)
            L4c:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: m410.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class i0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    @c0d(c = "com.sportygames.pingpong.views.PingPongFragment$onViewCreated$57$1", f = "PingPongFragment.kt", l = {7137, 1892}, m = "invokeSuspend", v = 1)
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
            throw new UnsupportedOperationException("Method not decompiled: m410.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class j0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(ttr ttrVar) {
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

    @c0d(c = "com.sportygames.pingpong.views.PingPongFragment$onViewCreated$6$1", f = "PingPongFragment.kt", l = {7137, 828}, m = "invokeSuspend", v = 1)
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
            throw new UnsupportedOperationException("Method not decompiled: m410.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class k0 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? m410.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

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

    public static final class l0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ e0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(e0 e0Var) {
            super(0);
            this.a = e0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class m implements wa50<thk> {
        public final /* synthetic */ ImageView a;

        public m(ImageView imageView) {
            this.a = imageView;
        }

        @Override // defpackage.wa50
        public final boolean f(thk thkVar, Object obj, d5f0<thk> d5f0Var, cqc cqcVar, boolean z) {
            thk thkVar2 = thkVar;
            obj.getClass();
            d5f0Var.getClass();
            cqcVar.getClass();
            thkVar2.b(1);
            n510 n510Var = new n510(this.a);
            ArrayList arrayList = thkVar2.z;
            if (arrayList == null) {
                arrayList = new ArrayList();
                thkVar2.z = arrayList;
            }
            arrayList.add(n510Var);
            thkVar2.start();
            return false;
        }

        @Override // defpackage.wa50
        public final boolean l(xzk xzkVar, Object obj, d5f0<thk> d5f0Var, boolean z) {
            return false;
        }
    }

    public static final class m0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class n extends qlr implements Function0<v8i0> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return m410.this.requireActivity().getViewModelStore();
        }
    }

    public static final class n0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(ttr ttrVar) {
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

    public static final class o extends qlr implements Function0<cyb> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return m410.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class o0 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? m410.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class p extends qlr implements Function0<r8i0.c> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return m410.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class p0 extends qlr implements Function0<Fragment> {
        public p0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return m410.this;
        }
    }

    public static final class q extends qlr implements Function0<v8i0> {
        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return m410.this.requireActivity().getViewModelStore();
        }
    }

    public static final class q0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ p0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(p0 p0Var) {
            super(0);
            this.a = p0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class r extends qlr implements Function0<cyb> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return m410.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class r0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class s extends qlr implements Function0<r8i0.c> {
        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return m410.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class s0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(ttr ttrVar) {
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

    public static final class t implements Function0<l1z> {
        public t() {
        }

        /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, l1z] */
        /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, l1z] */
        @Override // kotlin.jvm.functions.Function0
        public final l1z invoke() {
            bb bbVar = m410.this;
            return bbVar instanceof rrp ? ((rrp) bbVar).j().a(jq40.a(l1z.class), null, null) : sjj.b().c.d.a(jq40.a(l1z.class), null, null);
        }
    }

    public static final class u extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? m410.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class v extends qlr implements Function0<Fragment> {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return m410.this;
        }
    }

    public static final class w extends qlr implements Function0<w8i0> {
        public final /* synthetic */ v a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(v vVar) {
            super(0);
            this.a = vVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class x extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class y extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ttr ttrVar) {
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

    public static final class z extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? m410.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public m410() {
        e0 e0Var = new e0();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new l0(e0Var));
        this.d = new q8i0(jq40.a(jn1.class), new m0(ttrVarA), new o0(ttrVarA), new n0(ttrVarA));
        ttr ttrVarA2 = hwr.a(a1sVar, new q0(new p0()));
        this.e = new q8i0(jq40.a(p530.class), new r0(ttrVarA2), new u(ttrVarA2), new s0(ttrVarA2));
        ttr ttrVarA3 = hwr.a(a1sVar, new w(new v()));
        this.f = new q8i0(jq40.a(y720.class), new x(ttrVarA3), new z(ttrVarA3), new y(ttrVarA3));
        ttr ttrVarA4 = hwr.a(a1sVar, new b0(new a0()));
        this.i = new q8i0(jq40.a(zt2.class), new c0(ttrVarA4), new f0(ttrVarA4), new d0(ttrVarA4));
        ttr ttrVarA5 = hwr.a(a1sVar, new h0(new g0()));
        this.y = new q8i0(jq40.a(fq5.class), new i0(ttrVarA5), new k0(ttrVarA5), new j0(ttrVarA5));
        this.z = "";
        this.A = "";
        this.B = "";
        this.C = "";
        this.M = true;
        this.R = yju.a("br");
        this.n0 = new ArrayList();
        this.o0 = new ArrayList();
        this.t0 = true;
        this.u0 = "";
        this.v0 = "";
        this.z0 = a.a;
        pfd pfdVar = fse.a;
        wcl wclVar = gku.a;
        this.B0 = w5b.a(wclVar);
        w5b.a(wclVar);
        this.C0 = new ArrayList<>();
        this.F0 = "sg_ping_pong";
        this.I0 = kotlin.collections.b.f("sg_ping_pong", "sg_common_dialog_message", "sg_chat", "sg_fbg_dialog", "sg_ham_menu", "sg_input_dialog", "sg_bethistory", "sg_common", "sg_exit_dialog", "sg_game_common", "currency_symbols", "sg_onboarding", "sg_campaign");
        this.P0 = 1;
        this.Q0 = 1;
        this.S0 = 1;
        this.T0 = 2;
        this.U0 = 3;
        this.V0 = 4;
        this.a1 = new yj2();
        this.b1 = new yj2();
        this.e1 = new q8i0(jq40.a(fuj.class), new n(), new p(), new o());
        this.f1 = new q8i0(jq40.a(db6.class), new q(), new s(), new r());
        this.i1 = "en";
        Boolean bool = Boolean.FALSE;
        this.l1 = androidx.compose.runtime.m.b(bool);
        this.m1 = androidx.compose.runtime.m.b(bool);
        this.n1 = androidx.compose.runtime.i.a(0.0d);
        this.o1 = androidx.compose.runtime.i.a(0.0d);
        this.p1 = androidx.compose.runtime.i.a(0.0d);
        this.s1 = new ImageView[0];
    }

    public static void X0(m410 m410Var, boolean z2, boolean z3, int i2) {
        int i3;
        boolean zBooleanValue;
        boolean zL;
        View viewF;
        boolean z4 = (i2 & 1) == 0;
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if ((i2 & 4) != 0) {
            z3 = true;
        }
        Context context = m410Var.getContext();
        if (context != null) {
            ArrayList<OnboardingItem> arrayListA = sny.a(context, "ping-pong");
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
                ixi ixiVar = (ixi) m410Var.b;
                zL = (ixiVar == null || (viewF = ixiVar.z.f(8388613)) == null) ? false : DrawerLayout.l(viewF);
            } catch (Exception unused) {
            }
            if (zBooleanValue || i3 <= 0 || m410Var.Q0 != m410Var.P0 || zL) {
                return;
            }
            Fragment fragmentG = m410Var.getChildFragmentManager().G(R.id.onboarding_images);
            if (z4 || ((m410Var.Y && m410Var.Z) || !(z2 || z3))) {
                m410Var.K0 = false;
                if (fragmentG != null) {
                    FragmentManager childFragmentManager = m410Var.getChildFragmentManager();
                    childFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                    aVar.p(fragmentG);
                    aVar.d();
                }
                ixi ixiVar2 = (ixi) m410Var.b;
                if (ixiVar2 != null) {
                    ixiVar2.Q.setVisibility(8);
                }
                if (!z4) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Long l2 = m410Var.X;
                    if (l2 != null) {
                        long jLongValue = l2.longValue();
                        if (m410Var.Y || m410Var.Z || jCurrentTimeMillis - jLongValue > 3000) {
                            sny.c(context, m410Var.W, 1, "ping-pong");
                        }
                    }
                }
                m410Var.X = null;
                m410Var.Y = false;
                m410Var.Z = false;
                return;
            }
            m410Var.K0 = true;
            if (m410Var.r1 != null && fragmentG == null) {
                Map<String, Float> mapF = kpu.f(new Pair("PP_BET_PLACED", Float.valueOf(z2 ? 1.0f : 0.0f)), new Pair("PP_BET1_PLACED", Float.valueOf(z3 ? 1.0f : 0.0f)));
                FragmentManager childFragmentManager2 = m410Var.getChildFragmentManager();
                androidx.fragment.app.a aVarA = oke.a(childFragmentManager2, childFragmentManager2);
                op5.a.getClass();
                List<? extends File> list = op5.b;
                com.sportygames.commons.views.a aVar2 = new com.sportygames.commons.views.a();
                aVar2.c = "ping-pong";
                aVar2.d = 1;
                aVar2.w = list;
                aVar2.z = mapF;
                aVar2.A = false;
                aVarA.f(R.id.onboarding_images, aVar2, null);
                aVarA.d();
            }
            ixi ixiVar3 = (ixi) m410Var.b;
            if (ixiVar3 != null) {
                ixiVar3.Q.setVisibility(0);
            }
            if (m410Var.X == null) {
                m410Var.X = Long.valueOf(System.currentTimeMillis());
            }
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r10v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v10 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r10v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v12 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r10v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v13 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r10v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v14 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r10v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v15 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r10v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v9 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r12v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v26 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r12v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v27 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r12v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v28 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r12v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v29 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r12v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v30 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r12v31 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v31 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r1v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v16 ??, new type: double
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v16 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r1v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v17 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r1v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v19 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r1v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v20 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r1v213 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v213 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r1v214 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v214 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r1v215 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v215 ??, new type: com.sportygames.pingpong.components.ShBetContainer
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
    /* JADX WARN: Failed to calculate best type for var: r1v216 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v216 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r1v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v23 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r1v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v24 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r1v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v26 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r1v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v27 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r1v299 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v299 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r1v300 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v300 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r1v301 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v301 ??, new type: com.sportygames.pingpong.components.ShBetContainer
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
    /* JADX WARN: Failed to calculate best type for var: r1v302 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v302 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r1v395 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v395 ??, new type: java.lang.Double
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
    /* JADX WARN: Failed to calculate best type for var: r1v400 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v400 ??, new type: com.sportygames.pingpong.components.ShBetContainer
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
    /* JADX WARN: Failed to calculate best type for var: r1v51 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v51 ??, new type: com.sportygames.pingpong.components.ShBetContainer
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
    /* JADX WARN: Failed to calculate best type for var: r20v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v16 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r22v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v5 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r23v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v15 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r23v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v16 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r23v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v17 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r2v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v13 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r2v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v14 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r2v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v16 ??, new type: com.sportygames.pingpong.components.ShBetContainer
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
    /* JADX WARN: Failed to calculate best type for var: r2v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v17 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r2v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v4 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r2v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v5 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r2v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v7 ??, new type: com.sportygames.pingpong.components.ShBetContainer
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
    /* JADX WARN: Failed to calculate best type for var: r2v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v8 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r2v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v9 ??, new type: com.sportygames.pingpong.components.ShBetContainer
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
    /* JADX WARN: Failed to calculate best type for var: r3v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v2 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r3v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v3 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r3v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v4 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r3v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v5 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r3v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v6 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r3v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v7 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r5v138 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v138 ??, new type: java.lang.Double
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
    /* JADX WARN: Failed to calculate best type for var: r5v139 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v139 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r5v140 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v140 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r5v145 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v145 ??, new type: java.lang.Double
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
    /* JADX WARN: Failed to calculate best type for var: r5v146 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v146 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r5v147 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v147 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r5v149 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v149 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r5v150 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v150 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r5v37 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v37 ??, new type: com.sportygames.pingpong.remote.models.DetailResponse
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
    /* JADX WARN: Failed to calculate best type for var: r5v40 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v40 ??, new type: com.sportygames.pingpong.components.ShBetContainer
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
    /* JADX WARN: Failed to calculate best type for var: r5v65 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v65 ??, new type: com.sportygames.pingpong.remote.models.DetailResponse
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
    /* JADX WARN: Failed to calculate best type for var: r5v68 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v68 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r5v69 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v69 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r5v70 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v70 ??, new type: com.sportygames.pingpong.components.ShBetContainer
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
    /* JADX WARN: Failed to calculate best type for var: r5v71 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v71 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r6v67 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v67 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r6v68 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v68 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r6v78 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v78 ??, new type: double
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
    /* JADX WARN: Failed to calculate best type for var: r7v129 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v129 ??, new type: com.sportygames.pingpong.components.ShBetContainer
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
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v16 ??, new type: double
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final kotlin.Unit d1(defpackage.m410 r46, java.lang.String r47) {
        /*
            Method dump skipped, instruction units count: 4096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m410.d1(m410, java.lang.String):kotlin.Unit");
    }

    /* JADX WARN: Code duplicated, block: B:157:0x031c A[Catch: Exception -> 0x09dc, TryCatch #0 {Exception -> 0x09dc, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x001c, B:10:0x004b, B:12:0x0051, B:16:0x005f, B:19:0x0067, B:22:0x006f, B:25:0x0077, B:29:0x0080, B:32:0x00aa, B:34:0x00b1, B:36:0x00bd, B:38:0x00c3, B:51:0x00f2, B:53:0x00ff, B:55:0x0105, B:56:0x011a, B:59:0x0122, B:61:0x0126, B:62:0x0131, B:64:0x0137, B:65:0x0142, B:67:0x0148, B:68:0x0153, B:70:0x0159, B:71:0x0160, B:73:0x0166, B:74:0x016d, B:76:0x0173, B:78:0x017b, B:79:0x0182, B:81:0x0188, B:83:0x0190, B:84:0x0198, B:86:0x019e, B:87:0x01a6, B:89:0x01ac, B:91:0x01b4, B:92:0x01c3, B:94:0x01c9, B:96:0x01d1, B:97:0x01d8, B:99:0x01de, B:101:0x01e6, B:102:0x01ed, B:104:0x01f3, B:106:0x0212, B:108:0x0218, B:110:0x0220, B:112:0x0228, B:113:0x022f, B:115:0x0235, B:117:0x023d, B:118:0x0245, B:120:0x024b, B:122:0x0253, B:133:0x028d, B:135:0x0293, B:137:0x029b, B:139:0x02ae, B:141:0x02b4, B:143:0x02bc, B:144:0x02d1, B:146:0x02d7, B:147:0x02e6, B:149:0x02ec, B:150:0x02f7, B:152:0x02fd, B:153:0x0304, B:155:0x030d, B:163:0x033a, B:264:0x0543, B:266:0x0549, B:268:0x0551, B:270:0x0557, B:272:0x055f, B:273:0x0566, B:275:0x056c, B:277:0x0574, B:279:0x057a, B:281:0x0582, B:282:0x0589, B:284:0x058d, B:287:0x0596, B:286:0x0593, B:157:0x031c, B:159:0x0322, B:160:0x032d, B:162:0x0333, B:123:0x025f, B:125:0x0268, B:127:0x0270, B:128:0x0278, B:130:0x027e, B:132:0x0286, B:164:0x0342, B:166:0x0346, B:167:0x0351, B:169:0x0357, B:170:0x0362, B:172:0x0368, B:173:0x0373, B:175:0x0379, B:176:0x0380, B:178:0x0386, B:179:0x038d, B:181:0x0393, B:182:0x039b, B:184:0x03a1, B:186:0x03a9, B:187:0x03b0, B:189:0x03b6, B:191:0x03be, B:192:0x03c6, B:194:0x03cc, B:196:0x03d4, B:197:0x03db, B:199:0x03e1, B:201:0x03e9, B:202:0x03f0, B:204:0x03f6, B:206:0x03fe, B:208:0x0406, B:209:0x040d, B:211:0x0413, B:213:0x041b, B:214:0x0423, B:216:0x0429, B:218:0x0431, B:229:0x046b, B:231:0x0471, B:233:0x0490, B:235:0x0496, B:237:0x049e, B:239:0x04b1, B:241:0x04b7, B:243:0x04bf, B:244:0x04d4, B:246:0x04da, B:247:0x04e9, B:249:0x04ef, B:250:0x04f6, B:252:0x04fc, B:253:0x0507, B:255:0x0510, B:263:0x053d, B:257:0x051f, B:259:0x0525, B:260:0x0530, B:262:0x0536, B:219:0x043d, B:221:0x0446, B:223:0x044e, B:224:0x0456, B:226:0x045c, B:228:0x0464, B:288:0x059a, B:290:0x05a3, B:291:0x05c3, B:294:0x05d0, B:296:0x05d6, B:298:0x05e0, B:300:0x05eb, B:302:0x05f3, B:304:0x05f9, B:306:0x0601, B:325:0x0653, B:327:0x0659, B:328:0x0660, B:330:0x0666, B:332:0x066e, B:333:0x0675, B:335:0x067b, B:337:0x0683, B:338:0x068a, B:340:0x0690, B:341:0x0698, B:343:0x069e, B:344:0x06a6, B:346:0x06ac, B:347:0x06b4, B:349:0x06ba, B:351:0x06c2, B:352:0x06ca, B:354:0x06d0, B:356:0x06d6, B:357:0x06dd, B:358:0x06e6, B:360:0x06ec, B:362:0x06f4, B:363:0x06fb, B:365:0x0701, B:367:0x0709, B:368:0x0710, B:370:0x0716, B:372:0x071e, B:373:0x0725, B:375:0x072b, B:377:0x072f, B:378:0x0743, B:379:0x0745, B:381:0x0758, B:383:0x0760, B:385:0x0767, B:387:0x076d, B:389:0x0776, B:393:0x0780, B:395:0x0784, B:397:0x078a, B:399:0x0793, B:401:0x0799, B:402:0x079b, B:404:0x07a1, B:406:0x07a9, B:408:0x07b3, B:409:0x07b9, B:410:0x07c2, B:307:0x0609, B:309:0x060f, B:311:0x0617, B:312:0x061e, B:314:0x0624, B:316:0x062c, B:317:0x0634, B:319:0x063a, B:320:0x063e, B:322:0x0644, B:324:0x064c, B:411:0x07d6, B:413:0x07de, B:415:0x07e8, B:417:0x07f3, B:419:0x07fb, B:421:0x0801, B:423:0x0809, B:442:0x085b, B:444:0x0861, B:445:0x0868, B:447:0x086e, B:448:0x0876, B:450:0x087c, B:451:0x0884, B:453:0x088a, B:454:0x0892, B:456:0x0898, B:458:0x08a0, B:459:0x08a8, B:461:0x08ae, B:463:0x08b6, B:464:0x08bd, B:466:0x08c3, B:468:0x08cb, B:469:0x08d2, B:471:0x08d8, B:473:0x08e0, B:474:0x08e7, B:476:0x08ed, B:478:0x08f5, B:479:0x08fc, B:481:0x0902, B:483:0x090a, B:484:0x0911, B:486:0x0917, B:488:0x091d, B:489:0x0924, B:490:0x092d, B:492:0x0933, B:494:0x0937, B:495:0x094b, B:496:0x094d, B:498:0x0960, B:500:0x0968, B:502:0x096f, B:504:0x0975, B:506:0x097d, B:510:0x0987, B:512:0x098b, B:514:0x0991, B:516:0x0999, B:518:0x099f, B:519:0x09a1, B:521:0x09a7, B:523:0x09af, B:525:0x09b9, B:526:0x09bf, B:527:0x09c8, B:424:0x0811, B:426:0x0817, B:428:0x081f, B:429:0x0826, B:431:0x082c, B:433:0x0834, B:434:0x083c, B:436:0x0842, B:437:0x0846, B:439:0x084c, B:441:0x0854, B:39:0x00cb, B:40:0x00ce, B:41:0x00cf, B:43:0x00d3, B:45:0x00de, B:47:0x00e6, B:48:0x00ec, B:49:0x00ef, B:50:0x00f0, B:528:0x09d9), top: B:533:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0322 A[Catch: Exception -> 0x09dc, TryCatch #0 {Exception -> 0x09dc, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x001c, B:10:0x004b, B:12:0x0051, B:16:0x005f, B:19:0x0067, B:22:0x006f, B:25:0x0077, B:29:0x0080, B:32:0x00aa, B:34:0x00b1, B:36:0x00bd, B:38:0x00c3, B:51:0x00f2, B:53:0x00ff, B:55:0x0105, B:56:0x011a, B:59:0x0122, B:61:0x0126, B:62:0x0131, B:64:0x0137, B:65:0x0142, B:67:0x0148, B:68:0x0153, B:70:0x0159, B:71:0x0160, B:73:0x0166, B:74:0x016d, B:76:0x0173, B:78:0x017b, B:79:0x0182, B:81:0x0188, B:83:0x0190, B:84:0x0198, B:86:0x019e, B:87:0x01a6, B:89:0x01ac, B:91:0x01b4, B:92:0x01c3, B:94:0x01c9, B:96:0x01d1, B:97:0x01d8, B:99:0x01de, B:101:0x01e6, B:102:0x01ed, B:104:0x01f3, B:106:0x0212, B:108:0x0218, B:110:0x0220, B:112:0x0228, B:113:0x022f, B:115:0x0235, B:117:0x023d, B:118:0x0245, B:120:0x024b, B:122:0x0253, B:133:0x028d, B:135:0x0293, B:137:0x029b, B:139:0x02ae, B:141:0x02b4, B:143:0x02bc, B:144:0x02d1, B:146:0x02d7, B:147:0x02e6, B:149:0x02ec, B:150:0x02f7, B:152:0x02fd, B:153:0x0304, B:155:0x030d, B:163:0x033a, B:264:0x0543, B:266:0x0549, B:268:0x0551, B:270:0x0557, B:272:0x055f, B:273:0x0566, B:275:0x056c, B:277:0x0574, B:279:0x057a, B:281:0x0582, B:282:0x0589, B:284:0x058d, B:287:0x0596, B:286:0x0593, B:157:0x031c, B:159:0x0322, B:160:0x032d, B:162:0x0333, B:123:0x025f, B:125:0x0268, B:127:0x0270, B:128:0x0278, B:130:0x027e, B:132:0x0286, B:164:0x0342, B:166:0x0346, B:167:0x0351, B:169:0x0357, B:170:0x0362, B:172:0x0368, B:173:0x0373, B:175:0x0379, B:176:0x0380, B:178:0x0386, B:179:0x038d, B:181:0x0393, B:182:0x039b, B:184:0x03a1, B:186:0x03a9, B:187:0x03b0, B:189:0x03b6, B:191:0x03be, B:192:0x03c6, B:194:0x03cc, B:196:0x03d4, B:197:0x03db, B:199:0x03e1, B:201:0x03e9, B:202:0x03f0, B:204:0x03f6, B:206:0x03fe, B:208:0x0406, B:209:0x040d, B:211:0x0413, B:213:0x041b, B:214:0x0423, B:216:0x0429, B:218:0x0431, B:229:0x046b, B:231:0x0471, B:233:0x0490, B:235:0x0496, B:237:0x049e, B:239:0x04b1, B:241:0x04b7, B:243:0x04bf, B:244:0x04d4, B:246:0x04da, B:247:0x04e9, B:249:0x04ef, B:250:0x04f6, B:252:0x04fc, B:253:0x0507, B:255:0x0510, B:263:0x053d, B:257:0x051f, B:259:0x0525, B:260:0x0530, B:262:0x0536, B:219:0x043d, B:221:0x0446, B:223:0x044e, B:224:0x0456, B:226:0x045c, B:228:0x0464, B:288:0x059a, B:290:0x05a3, B:291:0x05c3, B:294:0x05d0, B:296:0x05d6, B:298:0x05e0, B:300:0x05eb, B:302:0x05f3, B:304:0x05f9, B:306:0x0601, B:325:0x0653, B:327:0x0659, B:328:0x0660, B:330:0x0666, B:332:0x066e, B:333:0x0675, B:335:0x067b, B:337:0x0683, B:338:0x068a, B:340:0x0690, B:341:0x0698, B:343:0x069e, B:344:0x06a6, B:346:0x06ac, B:347:0x06b4, B:349:0x06ba, B:351:0x06c2, B:352:0x06ca, B:354:0x06d0, B:356:0x06d6, B:357:0x06dd, B:358:0x06e6, B:360:0x06ec, B:362:0x06f4, B:363:0x06fb, B:365:0x0701, B:367:0x0709, B:368:0x0710, B:370:0x0716, B:372:0x071e, B:373:0x0725, B:375:0x072b, B:377:0x072f, B:378:0x0743, B:379:0x0745, B:381:0x0758, B:383:0x0760, B:385:0x0767, B:387:0x076d, B:389:0x0776, B:393:0x0780, B:395:0x0784, B:397:0x078a, B:399:0x0793, B:401:0x0799, B:402:0x079b, B:404:0x07a1, B:406:0x07a9, B:408:0x07b3, B:409:0x07b9, B:410:0x07c2, B:307:0x0609, B:309:0x060f, B:311:0x0617, B:312:0x061e, B:314:0x0624, B:316:0x062c, B:317:0x0634, B:319:0x063a, B:320:0x063e, B:322:0x0644, B:324:0x064c, B:411:0x07d6, B:413:0x07de, B:415:0x07e8, B:417:0x07f3, B:419:0x07fb, B:421:0x0801, B:423:0x0809, B:442:0x085b, B:444:0x0861, B:445:0x0868, B:447:0x086e, B:448:0x0876, B:450:0x087c, B:451:0x0884, B:453:0x088a, B:454:0x0892, B:456:0x0898, B:458:0x08a0, B:459:0x08a8, B:461:0x08ae, B:463:0x08b6, B:464:0x08bd, B:466:0x08c3, B:468:0x08cb, B:469:0x08d2, B:471:0x08d8, B:473:0x08e0, B:474:0x08e7, B:476:0x08ed, B:478:0x08f5, B:479:0x08fc, B:481:0x0902, B:483:0x090a, B:484:0x0911, B:486:0x0917, B:488:0x091d, B:489:0x0924, B:490:0x092d, B:492:0x0933, B:494:0x0937, B:495:0x094b, B:496:0x094d, B:498:0x0960, B:500:0x0968, B:502:0x096f, B:504:0x0975, B:506:0x097d, B:510:0x0987, B:512:0x098b, B:514:0x0991, B:516:0x0999, B:518:0x099f, B:519:0x09a1, B:521:0x09a7, B:523:0x09af, B:525:0x09b9, B:526:0x09bf, B:527:0x09c8, B:424:0x0811, B:426:0x0817, B:428:0x081f, B:429:0x0826, B:431:0x082c, B:433:0x0834, B:434:0x083c, B:436:0x0842, B:437:0x0846, B:439:0x084c, B:441:0x0854, B:39:0x00cb, B:40:0x00ce, B:41:0x00cf, B:43:0x00d3, B:45:0x00de, B:47:0x00e6, B:48:0x00ec, B:49:0x00ef, B:50:0x00f0, B:528:0x09d9), top: B:533:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0333 A[Catch: Exception -> 0x09dc, TryCatch #0 {Exception -> 0x09dc, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x001c, B:10:0x004b, B:12:0x0051, B:16:0x005f, B:19:0x0067, B:22:0x006f, B:25:0x0077, B:29:0x0080, B:32:0x00aa, B:34:0x00b1, B:36:0x00bd, B:38:0x00c3, B:51:0x00f2, B:53:0x00ff, B:55:0x0105, B:56:0x011a, B:59:0x0122, B:61:0x0126, B:62:0x0131, B:64:0x0137, B:65:0x0142, B:67:0x0148, B:68:0x0153, B:70:0x0159, B:71:0x0160, B:73:0x0166, B:74:0x016d, B:76:0x0173, B:78:0x017b, B:79:0x0182, B:81:0x0188, B:83:0x0190, B:84:0x0198, B:86:0x019e, B:87:0x01a6, B:89:0x01ac, B:91:0x01b4, B:92:0x01c3, B:94:0x01c9, B:96:0x01d1, B:97:0x01d8, B:99:0x01de, B:101:0x01e6, B:102:0x01ed, B:104:0x01f3, B:106:0x0212, B:108:0x0218, B:110:0x0220, B:112:0x0228, B:113:0x022f, B:115:0x0235, B:117:0x023d, B:118:0x0245, B:120:0x024b, B:122:0x0253, B:133:0x028d, B:135:0x0293, B:137:0x029b, B:139:0x02ae, B:141:0x02b4, B:143:0x02bc, B:144:0x02d1, B:146:0x02d7, B:147:0x02e6, B:149:0x02ec, B:150:0x02f7, B:152:0x02fd, B:153:0x0304, B:155:0x030d, B:163:0x033a, B:264:0x0543, B:266:0x0549, B:268:0x0551, B:270:0x0557, B:272:0x055f, B:273:0x0566, B:275:0x056c, B:277:0x0574, B:279:0x057a, B:281:0x0582, B:282:0x0589, B:284:0x058d, B:287:0x0596, B:286:0x0593, B:157:0x031c, B:159:0x0322, B:160:0x032d, B:162:0x0333, B:123:0x025f, B:125:0x0268, B:127:0x0270, B:128:0x0278, B:130:0x027e, B:132:0x0286, B:164:0x0342, B:166:0x0346, B:167:0x0351, B:169:0x0357, B:170:0x0362, B:172:0x0368, B:173:0x0373, B:175:0x0379, B:176:0x0380, B:178:0x0386, B:179:0x038d, B:181:0x0393, B:182:0x039b, B:184:0x03a1, B:186:0x03a9, B:187:0x03b0, B:189:0x03b6, B:191:0x03be, B:192:0x03c6, B:194:0x03cc, B:196:0x03d4, B:197:0x03db, B:199:0x03e1, B:201:0x03e9, B:202:0x03f0, B:204:0x03f6, B:206:0x03fe, B:208:0x0406, B:209:0x040d, B:211:0x0413, B:213:0x041b, B:214:0x0423, B:216:0x0429, B:218:0x0431, B:229:0x046b, B:231:0x0471, B:233:0x0490, B:235:0x0496, B:237:0x049e, B:239:0x04b1, B:241:0x04b7, B:243:0x04bf, B:244:0x04d4, B:246:0x04da, B:247:0x04e9, B:249:0x04ef, B:250:0x04f6, B:252:0x04fc, B:253:0x0507, B:255:0x0510, B:263:0x053d, B:257:0x051f, B:259:0x0525, B:260:0x0530, B:262:0x0536, B:219:0x043d, B:221:0x0446, B:223:0x044e, B:224:0x0456, B:226:0x045c, B:228:0x0464, B:288:0x059a, B:290:0x05a3, B:291:0x05c3, B:294:0x05d0, B:296:0x05d6, B:298:0x05e0, B:300:0x05eb, B:302:0x05f3, B:304:0x05f9, B:306:0x0601, B:325:0x0653, B:327:0x0659, B:328:0x0660, B:330:0x0666, B:332:0x066e, B:333:0x0675, B:335:0x067b, B:337:0x0683, B:338:0x068a, B:340:0x0690, B:341:0x0698, B:343:0x069e, B:344:0x06a6, B:346:0x06ac, B:347:0x06b4, B:349:0x06ba, B:351:0x06c2, B:352:0x06ca, B:354:0x06d0, B:356:0x06d6, B:357:0x06dd, B:358:0x06e6, B:360:0x06ec, B:362:0x06f4, B:363:0x06fb, B:365:0x0701, B:367:0x0709, B:368:0x0710, B:370:0x0716, B:372:0x071e, B:373:0x0725, B:375:0x072b, B:377:0x072f, B:378:0x0743, B:379:0x0745, B:381:0x0758, B:383:0x0760, B:385:0x0767, B:387:0x076d, B:389:0x0776, B:393:0x0780, B:395:0x0784, B:397:0x078a, B:399:0x0793, B:401:0x0799, B:402:0x079b, B:404:0x07a1, B:406:0x07a9, B:408:0x07b3, B:409:0x07b9, B:410:0x07c2, B:307:0x0609, B:309:0x060f, B:311:0x0617, B:312:0x061e, B:314:0x0624, B:316:0x062c, B:317:0x0634, B:319:0x063a, B:320:0x063e, B:322:0x0644, B:324:0x064c, B:411:0x07d6, B:413:0x07de, B:415:0x07e8, B:417:0x07f3, B:419:0x07fb, B:421:0x0801, B:423:0x0809, B:442:0x085b, B:444:0x0861, B:445:0x0868, B:447:0x086e, B:448:0x0876, B:450:0x087c, B:451:0x0884, B:453:0x088a, B:454:0x0892, B:456:0x0898, B:458:0x08a0, B:459:0x08a8, B:461:0x08ae, B:463:0x08b6, B:464:0x08bd, B:466:0x08c3, B:468:0x08cb, B:469:0x08d2, B:471:0x08d8, B:473:0x08e0, B:474:0x08e7, B:476:0x08ed, B:478:0x08f5, B:479:0x08fc, B:481:0x0902, B:483:0x090a, B:484:0x0911, B:486:0x0917, B:488:0x091d, B:489:0x0924, B:490:0x092d, B:492:0x0933, B:494:0x0937, B:495:0x094b, B:496:0x094d, B:498:0x0960, B:500:0x0968, B:502:0x096f, B:504:0x0975, B:506:0x097d, B:510:0x0987, B:512:0x098b, B:514:0x0991, B:516:0x0999, B:518:0x099f, B:519:0x09a1, B:521:0x09a7, B:523:0x09af, B:525:0x09b9, B:526:0x09bf, B:527:0x09c8, B:424:0x0811, B:426:0x0817, B:428:0x081f, B:429:0x0826, B:431:0x082c, B:433:0x0834, B:434:0x083c, B:436:0x0842, B:437:0x0846, B:439:0x084c, B:441:0x0854, B:39:0x00cb, B:40:0x00ce, B:41:0x00cf, B:43:0x00d3, B:45:0x00de, B:47:0x00e6, B:48:0x00ec, B:49:0x00ef, B:50:0x00f0, B:528:0x09d9), top: B:533:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x051f A[Catch: Exception -> 0x09dc, TryCatch #0 {Exception -> 0x09dc, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x001c, B:10:0x004b, B:12:0x0051, B:16:0x005f, B:19:0x0067, B:22:0x006f, B:25:0x0077, B:29:0x0080, B:32:0x00aa, B:34:0x00b1, B:36:0x00bd, B:38:0x00c3, B:51:0x00f2, B:53:0x00ff, B:55:0x0105, B:56:0x011a, B:59:0x0122, B:61:0x0126, B:62:0x0131, B:64:0x0137, B:65:0x0142, B:67:0x0148, B:68:0x0153, B:70:0x0159, B:71:0x0160, B:73:0x0166, B:74:0x016d, B:76:0x0173, B:78:0x017b, B:79:0x0182, B:81:0x0188, B:83:0x0190, B:84:0x0198, B:86:0x019e, B:87:0x01a6, B:89:0x01ac, B:91:0x01b4, B:92:0x01c3, B:94:0x01c9, B:96:0x01d1, B:97:0x01d8, B:99:0x01de, B:101:0x01e6, B:102:0x01ed, B:104:0x01f3, B:106:0x0212, B:108:0x0218, B:110:0x0220, B:112:0x0228, B:113:0x022f, B:115:0x0235, B:117:0x023d, B:118:0x0245, B:120:0x024b, B:122:0x0253, B:133:0x028d, B:135:0x0293, B:137:0x029b, B:139:0x02ae, B:141:0x02b4, B:143:0x02bc, B:144:0x02d1, B:146:0x02d7, B:147:0x02e6, B:149:0x02ec, B:150:0x02f7, B:152:0x02fd, B:153:0x0304, B:155:0x030d, B:163:0x033a, B:264:0x0543, B:266:0x0549, B:268:0x0551, B:270:0x0557, B:272:0x055f, B:273:0x0566, B:275:0x056c, B:277:0x0574, B:279:0x057a, B:281:0x0582, B:282:0x0589, B:284:0x058d, B:287:0x0596, B:286:0x0593, B:157:0x031c, B:159:0x0322, B:160:0x032d, B:162:0x0333, B:123:0x025f, B:125:0x0268, B:127:0x0270, B:128:0x0278, B:130:0x027e, B:132:0x0286, B:164:0x0342, B:166:0x0346, B:167:0x0351, B:169:0x0357, B:170:0x0362, B:172:0x0368, B:173:0x0373, B:175:0x0379, B:176:0x0380, B:178:0x0386, B:179:0x038d, B:181:0x0393, B:182:0x039b, B:184:0x03a1, B:186:0x03a9, B:187:0x03b0, B:189:0x03b6, B:191:0x03be, B:192:0x03c6, B:194:0x03cc, B:196:0x03d4, B:197:0x03db, B:199:0x03e1, B:201:0x03e9, B:202:0x03f0, B:204:0x03f6, B:206:0x03fe, B:208:0x0406, B:209:0x040d, B:211:0x0413, B:213:0x041b, B:214:0x0423, B:216:0x0429, B:218:0x0431, B:229:0x046b, B:231:0x0471, B:233:0x0490, B:235:0x0496, B:237:0x049e, B:239:0x04b1, B:241:0x04b7, B:243:0x04bf, B:244:0x04d4, B:246:0x04da, B:247:0x04e9, B:249:0x04ef, B:250:0x04f6, B:252:0x04fc, B:253:0x0507, B:255:0x0510, B:263:0x053d, B:257:0x051f, B:259:0x0525, B:260:0x0530, B:262:0x0536, B:219:0x043d, B:221:0x0446, B:223:0x044e, B:224:0x0456, B:226:0x045c, B:228:0x0464, B:288:0x059a, B:290:0x05a3, B:291:0x05c3, B:294:0x05d0, B:296:0x05d6, B:298:0x05e0, B:300:0x05eb, B:302:0x05f3, B:304:0x05f9, B:306:0x0601, B:325:0x0653, B:327:0x0659, B:328:0x0660, B:330:0x0666, B:332:0x066e, B:333:0x0675, B:335:0x067b, B:337:0x0683, B:338:0x068a, B:340:0x0690, B:341:0x0698, B:343:0x069e, B:344:0x06a6, B:346:0x06ac, B:347:0x06b4, B:349:0x06ba, B:351:0x06c2, B:352:0x06ca, B:354:0x06d0, B:356:0x06d6, B:357:0x06dd, B:358:0x06e6, B:360:0x06ec, B:362:0x06f4, B:363:0x06fb, B:365:0x0701, B:367:0x0709, B:368:0x0710, B:370:0x0716, B:372:0x071e, B:373:0x0725, B:375:0x072b, B:377:0x072f, B:378:0x0743, B:379:0x0745, B:381:0x0758, B:383:0x0760, B:385:0x0767, B:387:0x076d, B:389:0x0776, B:393:0x0780, B:395:0x0784, B:397:0x078a, B:399:0x0793, B:401:0x0799, B:402:0x079b, B:404:0x07a1, B:406:0x07a9, B:408:0x07b3, B:409:0x07b9, B:410:0x07c2, B:307:0x0609, B:309:0x060f, B:311:0x0617, B:312:0x061e, B:314:0x0624, B:316:0x062c, B:317:0x0634, B:319:0x063a, B:320:0x063e, B:322:0x0644, B:324:0x064c, B:411:0x07d6, B:413:0x07de, B:415:0x07e8, B:417:0x07f3, B:419:0x07fb, B:421:0x0801, B:423:0x0809, B:442:0x085b, B:444:0x0861, B:445:0x0868, B:447:0x086e, B:448:0x0876, B:450:0x087c, B:451:0x0884, B:453:0x088a, B:454:0x0892, B:456:0x0898, B:458:0x08a0, B:459:0x08a8, B:461:0x08ae, B:463:0x08b6, B:464:0x08bd, B:466:0x08c3, B:468:0x08cb, B:469:0x08d2, B:471:0x08d8, B:473:0x08e0, B:474:0x08e7, B:476:0x08ed, B:478:0x08f5, B:479:0x08fc, B:481:0x0902, B:483:0x090a, B:484:0x0911, B:486:0x0917, B:488:0x091d, B:489:0x0924, B:490:0x092d, B:492:0x0933, B:494:0x0937, B:495:0x094b, B:496:0x094d, B:498:0x0960, B:500:0x0968, B:502:0x096f, B:504:0x0975, B:506:0x097d, B:510:0x0987, B:512:0x098b, B:514:0x0991, B:516:0x0999, B:518:0x099f, B:519:0x09a1, B:521:0x09a7, B:523:0x09af, B:525:0x09b9, B:526:0x09bf, B:527:0x09c8, B:424:0x0811, B:426:0x0817, B:428:0x081f, B:429:0x0826, B:431:0x082c, B:433:0x0834, B:434:0x083c, B:436:0x0842, B:437:0x0846, B:439:0x084c, B:441:0x0854, B:39:0x00cb, B:40:0x00ce, B:41:0x00cf, B:43:0x00d3, B:45:0x00de, B:47:0x00e6, B:48:0x00ec, B:49:0x00ef, B:50:0x00f0, B:528:0x09d9), top: B:533:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:259:0x0525 A[Catch: Exception -> 0x09dc, TryCatch #0 {Exception -> 0x09dc, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x001c, B:10:0x004b, B:12:0x0051, B:16:0x005f, B:19:0x0067, B:22:0x006f, B:25:0x0077, B:29:0x0080, B:32:0x00aa, B:34:0x00b1, B:36:0x00bd, B:38:0x00c3, B:51:0x00f2, B:53:0x00ff, B:55:0x0105, B:56:0x011a, B:59:0x0122, B:61:0x0126, B:62:0x0131, B:64:0x0137, B:65:0x0142, B:67:0x0148, B:68:0x0153, B:70:0x0159, B:71:0x0160, B:73:0x0166, B:74:0x016d, B:76:0x0173, B:78:0x017b, B:79:0x0182, B:81:0x0188, B:83:0x0190, B:84:0x0198, B:86:0x019e, B:87:0x01a6, B:89:0x01ac, B:91:0x01b4, B:92:0x01c3, B:94:0x01c9, B:96:0x01d1, B:97:0x01d8, B:99:0x01de, B:101:0x01e6, B:102:0x01ed, B:104:0x01f3, B:106:0x0212, B:108:0x0218, B:110:0x0220, B:112:0x0228, B:113:0x022f, B:115:0x0235, B:117:0x023d, B:118:0x0245, B:120:0x024b, B:122:0x0253, B:133:0x028d, B:135:0x0293, B:137:0x029b, B:139:0x02ae, B:141:0x02b4, B:143:0x02bc, B:144:0x02d1, B:146:0x02d7, B:147:0x02e6, B:149:0x02ec, B:150:0x02f7, B:152:0x02fd, B:153:0x0304, B:155:0x030d, B:163:0x033a, B:264:0x0543, B:266:0x0549, B:268:0x0551, B:270:0x0557, B:272:0x055f, B:273:0x0566, B:275:0x056c, B:277:0x0574, B:279:0x057a, B:281:0x0582, B:282:0x0589, B:284:0x058d, B:287:0x0596, B:286:0x0593, B:157:0x031c, B:159:0x0322, B:160:0x032d, B:162:0x0333, B:123:0x025f, B:125:0x0268, B:127:0x0270, B:128:0x0278, B:130:0x027e, B:132:0x0286, B:164:0x0342, B:166:0x0346, B:167:0x0351, B:169:0x0357, B:170:0x0362, B:172:0x0368, B:173:0x0373, B:175:0x0379, B:176:0x0380, B:178:0x0386, B:179:0x038d, B:181:0x0393, B:182:0x039b, B:184:0x03a1, B:186:0x03a9, B:187:0x03b0, B:189:0x03b6, B:191:0x03be, B:192:0x03c6, B:194:0x03cc, B:196:0x03d4, B:197:0x03db, B:199:0x03e1, B:201:0x03e9, B:202:0x03f0, B:204:0x03f6, B:206:0x03fe, B:208:0x0406, B:209:0x040d, B:211:0x0413, B:213:0x041b, B:214:0x0423, B:216:0x0429, B:218:0x0431, B:229:0x046b, B:231:0x0471, B:233:0x0490, B:235:0x0496, B:237:0x049e, B:239:0x04b1, B:241:0x04b7, B:243:0x04bf, B:244:0x04d4, B:246:0x04da, B:247:0x04e9, B:249:0x04ef, B:250:0x04f6, B:252:0x04fc, B:253:0x0507, B:255:0x0510, B:263:0x053d, B:257:0x051f, B:259:0x0525, B:260:0x0530, B:262:0x0536, B:219:0x043d, B:221:0x0446, B:223:0x044e, B:224:0x0456, B:226:0x045c, B:228:0x0464, B:288:0x059a, B:290:0x05a3, B:291:0x05c3, B:294:0x05d0, B:296:0x05d6, B:298:0x05e0, B:300:0x05eb, B:302:0x05f3, B:304:0x05f9, B:306:0x0601, B:325:0x0653, B:327:0x0659, B:328:0x0660, B:330:0x0666, B:332:0x066e, B:333:0x0675, B:335:0x067b, B:337:0x0683, B:338:0x068a, B:340:0x0690, B:341:0x0698, B:343:0x069e, B:344:0x06a6, B:346:0x06ac, B:347:0x06b4, B:349:0x06ba, B:351:0x06c2, B:352:0x06ca, B:354:0x06d0, B:356:0x06d6, B:357:0x06dd, B:358:0x06e6, B:360:0x06ec, B:362:0x06f4, B:363:0x06fb, B:365:0x0701, B:367:0x0709, B:368:0x0710, B:370:0x0716, B:372:0x071e, B:373:0x0725, B:375:0x072b, B:377:0x072f, B:378:0x0743, B:379:0x0745, B:381:0x0758, B:383:0x0760, B:385:0x0767, B:387:0x076d, B:389:0x0776, B:393:0x0780, B:395:0x0784, B:397:0x078a, B:399:0x0793, B:401:0x0799, B:402:0x079b, B:404:0x07a1, B:406:0x07a9, B:408:0x07b3, B:409:0x07b9, B:410:0x07c2, B:307:0x0609, B:309:0x060f, B:311:0x0617, B:312:0x061e, B:314:0x0624, B:316:0x062c, B:317:0x0634, B:319:0x063a, B:320:0x063e, B:322:0x0644, B:324:0x064c, B:411:0x07d6, B:413:0x07de, B:415:0x07e8, B:417:0x07f3, B:419:0x07fb, B:421:0x0801, B:423:0x0809, B:442:0x085b, B:444:0x0861, B:445:0x0868, B:447:0x086e, B:448:0x0876, B:450:0x087c, B:451:0x0884, B:453:0x088a, B:454:0x0892, B:456:0x0898, B:458:0x08a0, B:459:0x08a8, B:461:0x08ae, B:463:0x08b6, B:464:0x08bd, B:466:0x08c3, B:468:0x08cb, B:469:0x08d2, B:471:0x08d8, B:473:0x08e0, B:474:0x08e7, B:476:0x08ed, B:478:0x08f5, B:479:0x08fc, B:481:0x0902, B:483:0x090a, B:484:0x0911, B:486:0x0917, B:488:0x091d, B:489:0x0924, B:490:0x092d, B:492:0x0933, B:494:0x0937, B:495:0x094b, B:496:0x094d, B:498:0x0960, B:500:0x0968, B:502:0x096f, B:504:0x0975, B:506:0x097d, B:510:0x0987, B:512:0x098b, B:514:0x0991, B:516:0x0999, B:518:0x099f, B:519:0x09a1, B:521:0x09a7, B:523:0x09af, B:525:0x09b9, B:526:0x09bf, B:527:0x09c8, B:424:0x0811, B:426:0x0817, B:428:0x081f, B:429:0x0826, B:431:0x082c, B:433:0x0834, B:434:0x083c, B:436:0x0842, B:437:0x0846, B:439:0x084c, B:441:0x0854, B:39:0x00cb, B:40:0x00ce, B:41:0x00cf, B:43:0x00d3, B:45:0x00de, B:47:0x00e6, B:48:0x00ec, B:49:0x00ef, B:50:0x00f0, B:528:0x09d9), top: B:533:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:262:0x0536 A[Catch: Exception -> 0x09dc, TryCatch #0 {Exception -> 0x09dc, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x001c, B:10:0x004b, B:12:0x0051, B:16:0x005f, B:19:0x0067, B:22:0x006f, B:25:0x0077, B:29:0x0080, B:32:0x00aa, B:34:0x00b1, B:36:0x00bd, B:38:0x00c3, B:51:0x00f2, B:53:0x00ff, B:55:0x0105, B:56:0x011a, B:59:0x0122, B:61:0x0126, B:62:0x0131, B:64:0x0137, B:65:0x0142, B:67:0x0148, B:68:0x0153, B:70:0x0159, B:71:0x0160, B:73:0x0166, B:74:0x016d, B:76:0x0173, B:78:0x017b, B:79:0x0182, B:81:0x0188, B:83:0x0190, B:84:0x0198, B:86:0x019e, B:87:0x01a6, B:89:0x01ac, B:91:0x01b4, B:92:0x01c3, B:94:0x01c9, B:96:0x01d1, B:97:0x01d8, B:99:0x01de, B:101:0x01e6, B:102:0x01ed, B:104:0x01f3, B:106:0x0212, B:108:0x0218, B:110:0x0220, B:112:0x0228, B:113:0x022f, B:115:0x0235, B:117:0x023d, B:118:0x0245, B:120:0x024b, B:122:0x0253, B:133:0x028d, B:135:0x0293, B:137:0x029b, B:139:0x02ae, B:141:0x02b4, B:143:0x02bc, B:144:0x02d1, B:146:0x02d7, B:147:0x02e6, B:149:0x02ec, B:150:0x02f7, B:152:0x02fd, B:153:0x0304, B:155:0x030d, B:163:0x033a, B:264:0x0543, B:266:0x0549, B:268:0x0551, B:270:0x0557, B:272:0x055f, B:273:0x0566, B:275:0x056c, B:277:0x0574, B:279:0x057a, B:281:0x0582, B:282:0x0589, B:284:0x058d, B:287:0x0596, B:286:0x0593, B:157:0x031c, B:159:0x0322, B:160:0x032d, B:162:0x0333, B:123:0x025f, B:125:0x0268, B:127:0x0270, B:128:0x0278, B:130:0x027e, B:132:0x0286, B:164:0x0342, B:166:0x0346, B:167:0x0351, B:169:0x0357, B:170:0x0362, B:172:0x0368, B:173:0x0373, B:175:0x0379, B:176:0x0380, B:178:0x0386, B:179:0x038d, B:181:0x0393, B:182:0x039b, B:184:0x03a1, B:186:0x03a9, B:187:0x03b0, B:189:0x03b6, B:191:0x03be, B:192:0x03c6, B:194:0x03cc, B:196:0x03d4, B:197:0x03db, B:199:0x03e1, B:201:0x03e9, B:202:0x03f0, B:204:0x03f6, B:206:0x03fe, B:208:0x0406, B:209:0x040d, B:211:0x0413, B:213:0x041b, B:214:0x0423, B:216:0x0429, B:218:0x0431, B:229:0x046b, B:231:0x0471, B:233:0x0490, B:235:0x0496, B:237:0x049e, B:239:0x04b1, B:241:0x04b7, B:243:0x04bf, B:244:0x04d4, B:246:0x04da, B:247:0x04e9, B:249:0x04ef, B:250:0x04f6, B:252:0x04fc, B:253:0x0507, B:255:0x0510, B:263:0x053d, B:257:0x051f, B:259:0x0525, B:260:0x0530, B:262:0x0536, B:219:0x043d, B:221:0x0446, B:223:0x044e, B:224:0x0456, B:226:0x045c, B:228:0x0464, B:288:0x059a, B:290:0x05a3, B:291:0x05c3, B:294:0x05d0, B:296:0x05d6, B:298:0x05e0, B:300:0x05eb, B:302:0x05f3, B:304:0x05f9, B:306:0x0601, B:325:0x0653, B:327:0x0659, B:328:0x0660, B:330:0x0666, B:332:0x066e, B:333:0x0675, B:335:0x067b, B:337:0x0683, B:338:0x068a, B:340:0x0690, B:341:0x0698, B:343:0x069e, B:344:0x06a6, B:346:0x06ac, B:347:0x06b4, B:349:0x06ba, B:351:0x06c2, B:352:0x06ca, B:354:0x06d0, B:356:0x06d6, B:357:0x06dd, B:358:0x06e6, B:360:0x06ec, B:362:0x06f4, B:363:0x06fb, B:365:0x0701, B:367:0x0709, B:368:0x0710, B:370:0x0716, B:372:0x071e, B:373:0x0725, B:375:0x072b, B:377:0x072f, B:378:0x0743, B:379:0x0745, B:381:0x0758, B:383:0x0760, B:385:0x0767, B:387:0x076d, B:389:0x0776, B:393:0x0780, B:395:0x0784, B:397:0x078a, B:399:0x0793, B:401:0x0799, B:402:0x079b, B:404:0x07a1, B:406:0x07a9, B:408:0x07b3, B:409:0x07b9, B:410:0x07c2, B:307:0x0609, B:309:0x060f, B:311:0x0617, B:312:0x061e, B:314:0x0624, B:316:0x062c, B:317:0x0634, B:319:0x063a, B:320:0x063e, B:322:0x0644, B:324:0x064c, B:411:0x07d6, B:413:0x07de, B:415:0x07e8, B:417:0x07f3, B:419:0x07fb, B:421:0x0801, B:423:0x0809, B:442:0x085b, B:444:0x0861, B:445:0x0868, B:447:0x086e, B:448:0x0876, B:450:0x087c, B:451:0x0884, B:453:0x088a, B:454:0x0892, B:456:0x0898, B:458:0x08a0, B:459:0x08a8, B:461:0x08ae, B:463:0x08b6, B:464:0x08bd, B:466:0x08c3, B:468:0x08cb, B:469:0x08d2, B:471:0x08d8, B:473:0x08e0, B:474:0x08e7, B:476:0x08ed, B:478:0x08f5, B:479:0x08fc, B:481:0x0902, B:483:0x090a, B:484:0x0911, B:486:0x0917, B:488:0x091d, B:489:0x0924, B:490:0x092d, B:492:0x0933, B:494:0x0937, B:495:0x094b, B:496:0x094d, B:498:0x0960, B:500:0x0968, B:502:0x096f, B:504:0x0975, B:506:0x097d, B:510:0x0987, B:512:0x098b, B:514:0x0991, B:516:0x0999, B:518:0x099f, B:519:0x09a1, B:521:0x09a7, B:523:0x09af, B:525:0x09b9, B:526:0x09bf, B:527:0x09c8, B:424:0x0811, B:426:0x0817, B:428:0x081f, B:429:0x0826, B:431:0x082c, B:433:0x0834, B:434:0x083c, B:436:0x0842, B:437:0x0846, B:439:0x084c, B:441:0x0854, B:39:0x00cb, B:40:0x00ce, B:41:0x00cf, B:43:0x00d3, B:45:0x00de, B:47:0x00e6, B:48:0x00ec, B:49:0x00ef, B:50:0x00f0, B:528:0x09d9), top: B:533:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf A[Catch: Exception -> 0x09dc, TryCatch #0 {Exception -> 0x09dc, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x001c, B:10:0x004b, B:12:0x0051, B:16:0x005f, B:19:0x0067, B:22:0x006f, B:25:0x0077, B:29:0x0080, B:32:0x00aa, B:34:0x00b1, B:36:0x00bd, B:38:0x00c3, B:51:0x00f2, B:53:0x00ff, B:55:0x0105, B:56:0x011a, B:59:0x0122, B:61:0x0126, B:62:0x0131, B:64:0x0137, B:65:0x0142, B:67:0x0148, B:68:0x0153, B:70:0x0159, B:71:0x0160, B:73:0x0166, B:74:0x016d, B:76:0x0173, B:78:0x017b, B:79:0x0182, B:81:0x0188, B:83:0x0190, B:84:0x0198, B:86:0x019e, B:87:0x01a6, B:89:0x01ac, B:91:0x01b4, B:92:0x01c3, B:94:0x01c9, B:96:0x01d1, B:97:0x01d8, B:99:0x01de, B:101:0x01e6, B:102:0x01ed, B:104:0x01f3, B:106:0x0212, B:108:0x0218, B:110:0x0220, B:112:0x0228, B:113:0x022f, B:115:0x0235, B:117:0x023d, B:118:0x0245, B:120:0x024b, B:122:0x0253, B:133:0x028d, B:135:0x0293, B:137:0x029b, B:139:0x02ae, B:141:0x02b4, B:143:0x02bc, B:144:0x02d1, B:146:0x02d7, B:147:0x02e6, B:149:0x02ec, B:150:0x02f7, B:152:0x02fd, B:153:0x0304, B:155:0x030d, B:163:0x033a, B:264:0x0543, B:266:0x0549, B:268:0x0551, B:270:0x0557, B:272:0x055f, B:273:0x0566, B:275:0x056c, B:277:0x0574, B:279:0x057a, B:281:0x0582, B:282:0x0589, B:284:0x058d, B:287:0x0596, B:286:0x0593, B:157:0x031c, B:159:0x0322, B:160:0x032d, B:162:0x0333, B:123:0x025f, B:125:0x0268, B:127:0x0270, B:128:0x0278, B:130:0x027e, B:132:0x0286, B:164:0x0342, B:166:0x0346, B:167:0x0351, B:169:0x0357, B:170:0x0362, B:172:0x0368, B:173:0x0373, B:175:0x0379, B:176:0x0380, B:178:0x0386, B:179:0x038d, B:181:0x0393, B:182:0x039b, B:184:0x03a1, B:186:0x03a9, B:187:0x03b0, B:189:0x03b6, B:191:0x03be, B:192:0x03c6, B:194:0x03cc, B:196:0x03d4, B:197:0x03db, B:199:0x03e1, B:201:0x03e9, B:202:0x03f0, B:204:0x03f6, B:206:0x03fe, B:208:0x0406, B:209:0x040d, B:211:0x0413, B:213:0x041b, B:214:0x0423, B:216:0x0429, B:218:0x0431, B:229:0x046b, B:231:0x0471, B:233:0x0490, B:235:0x0496, B:237:0x049e, B:239:0x04b1, B:241:0x04b7, B:243:0x04bf, B:244:0x04d4, B:246:0x04da, B:247:0x04e9, B:249:0x04ef, B:250:0x04f6, B:252:0x04fc, B:253:0x0507, B:255:0x0510, B:263:0x053d, B:257:0x051f, B:259:0x0525, B:260:0x0530, B:262:0x0536, B:219:0x043d, B:221:0x0446, B:223:0x044e, B:224:0x0456, B:226:0x045c, B:228:0x0464, B:288:0x059a, B:290:0x05a3, B:291:0x05c3, B:294:0x05d0, B:296:0x05d6, B:298:0x05e0, B:300:0x05eb, B:302:0x05f3, B:304:0x05f9, B:306:0x0601, B:325:0x0653, B:327:0x0659, B:328:0x0660, B:330:0x0666, B:332:0x066e, B:333:0x0675, B:335:0x067b, B:337:0x0683, B:338:0x068a, B:340:0x0690, B:341:0x0698, B:343:0x069e, B:344:0x06a6, B:346:0x06ac, B:347:0x06b4, B:349:0x06ba, B:351:0x06c2, B:352:0x06ca, B:354:0x06d0, B:356:0x06d6, B:357:0x06dd, B:358:0x06e6, B:360:0x06ec, B:362:0x06f4, B:363:0x06fb, B:365:0x0701, B:367:0x0709, B:368:0x0710, B:370:0x0716, B:372:0x071e, B:373:0x0725, B:375:0x072b, B:377:0x072f, B:378:0x0743, B:379:0x0745, B:381:0x0758, B:383:0x0760, B:385:0x0767, B:387:0x076d, B:389:0x0776, B:393:0x0780, B:395:0x0784, B:397:0x078a, B:399:0x0793, B:401:0x0799, B:402:0x079b, B:404:0x07a1, B:406:0x07a9, B:408:0x07b3, B:409:0x07b9, B:410:0x07c2, B:307:0x0609, B:309:0x060f, B:311:0x0617, B:312:0x061e, B:314:0x0624, B:316:0x062c, B:317:0x0634, B:319:0x063a, B:320:0x063e, B:322:0x0644, B:324:0x064c, B:411:0x07d6, B:413:0x07de, B:415:0x07e8, B:417:0x07f3, B:419:0x07fb, B:421:0x0801, B:423:0x0809, B:442:0x085b, B:444:0x0861, B:445:0x0868, B:447:0x086e, B:448:0x0876, B:450:0x087c, B:451:0x0884, B:453:0x088a, B:454:0x0892, B:456:0x0898, B:458:0x08a0, B:459:0x08a8, B:461:0x08ae, B:463:0x08b6, B:464:0x08bd, B:466:0x08c3, B:468:0x08cb, B:469:0x08d2, B:471:0x08d8, B:473:0x08e0, B:474:0x08e7, B:476:0x08ed, B:478:0x08f5, B:479:0x08fc, B:481:0x0902, B:483:0x090a, B:484:0x0911, B:486:0x0917, B:488:0x091d, B:489:0x0924, B:490:0x092d, B:492:0x0933, B:494:0x0937, B:495:0x094b, B:496:0x094d, B:498:0x0960, B:500:0x0968, B:502:0x096f, B:504:0x0975, B:506:0x097d, B:510:0x0987, B:512:0x098b, B:514:0x0991, B:516:0x0999, B:518:0x099f, B:519:0x09a1, B:521:0x09a7, B:523:0x09af, B:525:0x09b9, B:526:0x09bf, B:527:0x09c8, B:424:0x0811, B:426:0x0817, B:428:0x081f, B:429:0x0826, B:431:0x082c, B:433:0x0834, B:434:0x083c, B:436:0x0842, B:437:0x0846, B:439:0x084c, B:441:0x0854, B:39:0x00cb, B:40:0x00ce, B:41:0x00cf, B:43:0x00d3, B:45:0x00de, B:47:0x00e6, B:48:0x00ec, B:49:0x00ef, B:50:0x00f0, B:528:0x09d9), top: B:533:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d3 A[Catch: Exception -> 0x09dc, TryCatch #0 {Exception -> 0x09dc, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x001c, B:10:0x004b, B:12:0x0051, B:16:0x005f, B:19:0x0067, B:22:0x006f, B:25:0x0077, B:29:0x0080, B:32:0x00aa, B:34:0x00b1, B:36:0x00bd, B:38:0x00c3, B:51:0x00f2, B:53:0x00ff, B:55:0x0105, B:56:0x011a, B:59:0x0122, B:61:0x0126, B:62:0x0131, B:64:0x0137, B:65:0x0142, B:67:0x0148, B:68:0x0153, B:70:0x0159, B:71:0x0160, B:73:0x0166, B:74:0x016d, B:76:0x0173, B:78:0x017b, B:79:0x0182, B:81:0x0188, B:83:0x0190, B:84:0x0198, B:86:0x019e, B:87:0x01a6, B:89:0x01ac, B:91:0x01b4, B:92:0x01c3, B:94:0x01c9, B:96:0x01d1, B:97:0x01d8, B:99:0x01de, B:101:0x01e6, B:102:0x01ed, B:104:0x01f3, B:106:0x0212, B:108:0x0218, B:110:0x0220, B:112:0x0228, B:113:0x022f, B:115:0x0235, B:117:0x023d, B:118:0x0245, B:120:0x024b, B:122:0x0253, B:133:0x028d, B:135:0x0293, B:137:0x029b, B:139:0x02ae, B:141:0x02b4, B:143:0x02bc, B:144:0x02d1, B:146:0x02d7, B:147:0x02e6, B:149:0x02ec, B:150:0x02f7, B:152:0x02fd, B:153:0x0304, B:155:0x030d, B:163:0x033a, B:264:0x0543, B:266:0x0549, B:268:0x0551, B:270:0x0557, B:272:0x055f, B:273:0x0566, B:275:0x056c, B:277:0x0574, B:279:0x057a, B:281:0x0582, B:282:0x0589, B:284:0x058d, B:287:0x0596, B:286:0x0593, B:157:0x031c, B:159:0x0322, B:160:0x032d, B:162:0x0333, B:123:0x025f, B:125:0x0268, B:127:0x0270, B:128:0x0278, B:130:0x027e, B:132:0x0286, B:164:0x0342, B:166:0x0346, B:167:0x0351, B:169:0x0357, B:170:0x0362, B:172:0x0368, B:173:0x0373, B:175:0x0379, B:176:0x0380, B:178:0x0386, B:179:0x038d, B:181:0x0393, B:182:0x039b, B:184:0x03a1, B:186:0x03a9, B:187:0x03b0, B:189:0x03b6, B:191:0x03be, B:192:0x03c6, B:194:0x03cc, B:196:0x03d4, B:197:0x03db, B:199:0x03e1, B:201:0x03e9, B:202:0x03f0, B:204:0x03f6, B:206:0x03fe, B:208:0x0406, B:209:0x040d, B:211:0x0413, B:213:0x041b, B:214:0x0423, B:216:0x0429, B:218:0x0431, B:229:0x046b, B:231:0x0471, B:233:0x0490, B:235:0x0496, B:237:0x049e, B:239:0x04b1, B:241:0x04b7, B:243:0x04bf, B:244:0x04d4, B:246:0x04da, B:247:0x04e9, B:249:0x04ef, B:250:0x04f6, B:252:0x04fc, B:253:0x0507, B:255:0x0510, B:263:0x053d, B:257:0x051f, B:259:0x0525, B:260:0x0530, B:262:0x0536, B:219:0x043d, B:221:0x0446, B:223:0x044e, B:224:0x0456, B:226:0x045c, B:228:0x0464, B:288:0x059a, B:290:0x05a3, B:291:0x05c3, B:294:0x05d0, B:296:0x05d6, B:298:0x05e0, B:300:0x05eb, B:302:0x05f3, B:304:0x05f9, B:306:0x0601, B:325:0x0653, B:327:0x0659, B:328:0x0660, B:330:0x0666, B:332:0x066e, B:333:0x0675, B:335:0x067b, B:337:0x0683, B:338:0x068a, B:340:0x0690, B:341:0x0698, B:343:0x069e, B:344:0x06a6, B:346:0x06ac, B:347:0x06b4, B:349:0x06ba, B:351:0x06c2, B:352:0x06ca, B:354:0x06d0, B:356:0x06d6, B:357:0x06dd, B:358:0x06e6, B:360:0x06ec, B:362:0x06f4, B:363:0x06fb, B:365:0x0701, B:367:0x0709, B:368:0x0710, B:370:0x0716, B:372:0x071e, B:373:0x0725, B:375:0x072b, B:377:0x072f, B:378:0x0743, B:379:0x0745, B:381:0x0758, B:383:0x0760, B:385:0x0767, B:387:0x076d, B:389:0x0776, B:393:0x0780, B:395:0x0784, B:397:0x078a, B:399:0x0793, B:401:0x0799, B:402:0x079b, B:404:0x07a1, B:406:0x07a9, B:408:0x07b3, B:409:0x07b9, B:410:0x07c2, B:307:0x0609, B:309:0x060f, B:311:0x0617, B:312:0x061e, B:314:0x0624, B:316:0x062c, B:317:0x0634, B:319:0x063a, B:320:0x063e, B:322:0x0644, B:324:0x064c, B:411:0x07d6, B:413:0x07de, B:415:0x07e8, B:417:0x07f3, B:419:0x07fb, B:421:0x0801, B:423:0x0809, B:442:0x085b, B:444:0x0861, B:445:0x0868, B:447:0x086e, B:448:0x0876, B:450:0x087c, B:451:0x0884, B:453:0x088a, B:454:0x0892, B:456:0x0898, B:458:0x08a0, B:459:0x08a8, B:461:0x08ae, B:463:0x08b6, B:464:0x08bd, B:466:0x08c3, B:468:0x08cb, B:469:0x08d2, B:471:0x08d8, B:473:0x08e0, B:474:0x08e7, B:476:0x08ed, B:478:0x08f5, B:479:0x08fc, B:481:0x0902, B:483:0x090a, B:484:0x0911, B:486:0x0917, B:488:0x091d, B:489:0x0924, B:490:0x092d, B:492:0x0933, B:494:0x0937, B:495:0x094b, B:496:0x094d, B:498:0x0960, B:500:0x0968, B:502:0x096f, B:504:0x0975, B:506:0x097d, B:510:0x0987, B:512:0x098b, B:514:0x0991, B:516:0x0999, B:518:0x099f, B:519:0x09a1, B:521:0x09a7, B:523:0x09af, B:525:0x09b9, B:526:0x09bf, B:527:0x09c8, B:424:0x0811, B:426:0x0817, B:428:0x081f, B:429:0x0826, B:431:0x082c, B:433:0x0834, B:434:0x083c, B:436:0x0842, B:437:0x0846, B:439:0x084c, B:441:0x0854, B:39:0x00cb, B:40:0x00ce, B:41:0x00cf, B:43:0x00d3, B:45:0x00de, B:47:0x00e6, B:48:0x00ec, B:49:0x00ef, B:50:0x00f0, B:528:0x09d9), top: B:533:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00de A[Catch: Exception -> 0x09dc, TryCatch #0 {Exception -> 0x09dc, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x001c, B:10:0x004b, B:12:0x0051, B:16:0x005f, B:19:0x0067, B:22:0x006f, B:25:0x0077, B:29:0x0080, B:32:0x00aa, B:34:0x00b1, B:36:0x00bd, B:38:0x00c3, B:51:0x00f2, B:53:0x00ff, B:55:0x0105, B:56:0x011a, B:59:0x0122, B:61:0x0126, B:62:0x0131, B:64:0x0137, B:65:0x0142, B:67:0x0148, B:68:0x0153, B:70:0x0159, B:71:0x0160, B:73:0x0166, B:74:0x016d, B:76:0x0173, B:78:0x017b, B:79:0x0182, B:81:0x0188, B:83:0x0190, B:84:0x0198, B:86:0x019e, B:87:0x01a6, B:89:0x01ac, B:91:0x01b4, B:92:0x01c3, B:94:0x01c9, B:96:0x01d1, B:97:0x01d8, B:99:0x01de, B:101:0x01e6, B:102:0x01ed, B:104:0x01f3, B:106:0x0212, B:108:0x0218, B:110:0x0220, B:112:0x0228, B:113:0x022f, B:115:0x0235, B:117:0x023d, B:118:0x0245, B:120:0x024b, B:122:0x0253, B:133:0x028d, B:135:0x0293, B:137:0x029b, B:139:0x02ae, B:141:0x02b4, B:143:0x02bc, B:144:0x02d1, B:146:0x02d7, B:147:0x02e6, B:149:0x02ec, B:150:0x02f7, B:152:0x02fd, B:153:0x0304, B:155:0x030d, B:163:0x033a, B:264:0x0543, B:266:0x0549, B:268:0x0551, B:270:0x0557, B:272:0x055f, B:273:0x0566, B:275:0x056c, B:277:0x0574, B:279:0x057a, B:281:0x0582, B:282:0x0589, B:284:0x058d, B:287:0x0596, B:286:0x0593, B:157:0x031c, B:159:0x0322, B:160:0x032d, B:162:0x0333, B:123:0x025f, B:125:0x0268, B:127:0x0270, B:128:0x0278, B:130:0x027e, B:132:0x0286, B:164:0x0342, B:166:0x0346, B:167:0x0351, B:169:0x0357, B:170:0x0362, B:172:0x0368, B:173:0x0373, B:175:0x0379, B:176:0x0380, B:178:0x0386, B:179:0x038d, B:181:0x0393, B:182:0x039b, B:184:0x03a1, B:186:0x03a9, B:187:0x03b0, B:189:0x03b6, B:191:0x03be, B:192:0x03c6, B:194:0x03cc, B:196:0x03d4, B:197:0x03db, B:199:0x03e1, B:201:0x03e9, B:202:0x03f0, B:204:0x03f6, B:206:0x03fe, B:208:0x0406, B:209:0x040d, B:211:0x0413, B:213:0x041b, B:214:0x0423, B:216:0x0429, B:218:0x0431, B:229:0x046b, B:231:0x0471, B:233:0x0490, B:235:0x0496, B:237:0x049e, B:239:0x04b1, B:241:0x04b7, B:243:0x04bf, B:244:0x04d4, B:246:0x04da, B:247:0x04e9, B:249:0x04ef, B:250:0x04f6, B:252:0x04fc, B:253:0x0507, B:255:0x0510, B:263:0x053d, B:257:0x051f, B:259:0x0525, B:260:0x0530, B:262:0x0536, B:219:0x043d, B:221:0x0446, B:223:0x044e, B:224:0x0456, B:226:0x045c, B:228:0x0464, B:288:0x059a, B:290:0x05a3, B:291:0x05c3, B:294:0x05d0, B:296:0x05d6, B:298:0x05e0, B:300:0x05eb, B:302:0x05f3, B:304:0x05f9, B:306:0x0601, B:325:0x0653, B:327:0x0659, B:328:0x0660, B:330:0x0666, B:332:0x066e, B:333:0x0675, B:335:0x067b, B:337:0x0683, B:338:0x068a, B:340:0x0690, B:341:0x0698, B:343:0x069e, B:344:0x06a6, B:346:0x06ac, B:347:0x06b4, B:349:0x06ba, B:351:0x06c2, B:352:0x06ca, B:354:0x06d0, B:356:0x06d6, B:357:0x06dd, B:358:0x06e6, B:360:0x06ec, B:362:0x06f4, B:363:0x06fb, B:365:0x0701, B:367:0x0709, B:368:0x0710, B:370:0x0716, B:372:0x071e, B:373:0x0725, B:375:0x072b, B:377:0x072f, B:378:0x0743, B:379:0x0745, B:381:0x0758, B:383:0x0760, B:385:0x0767, B:387:0x076d, B:389:0x0776, B:393:0x0780, B:395:0x0784, B:397:0x078a, B:399:0x0793, B:401:0x0799, B:402:0x079b, B:404:0x07a1, B:406:0x07a9, B:408:0x07b3, B:409:0x07b9, B:410:0x07c2, B:307:0x0609, B:309:0x060f, B:311:0x0617, B:312:0x061e, B:314:0x0624, B:316:0x062c, B:317:0x0634, B:319:0x063a, B:320:0x063e, B:322:0x0644, B:324:0x064c, B:411:0x07d6, B:413:0x07de, B:415:0x07e8, B:417:0x07f3, B:419:0x07fb, B:421:0x0801, B:423:0x0809, B:442:0x085b, B:444:0x0861, B:445:0x0868, B:447:0x086e, B:448:0x0876, B:450:0x087c, B:451:0x0884, B:453:0x088a, B:454:0x0892, B:456:0x0898, B:458:0x08a0, B:459:0x08a8, B:461:0x08ae, B:463:0x08b6, B:464:0x08bd, B:466:0x08c3, B:468:0x08cb, B:469:0x08d2, B:471:0x08d8, B:473:0x08e0, B:474:0x08e7, B:476:0x08ed, B:478:0x08f5, B:479:0x08fc, B:481:0x0902, B:483:0x090a, B:484:0x0911, B:486:0x0917, B:488:0x091d, B:489:0x0924, B:490:0x092d, B:492:0x0933, B:494:0x0937, B:495:0x094b, B:496:0x094d, B:498:0x0960, B:500:0x0968, B:502:0x096f, B:504:0x0975, B:506:0x097d, B:510:0x0987, B:512:0x098b, B:514:0x0991, B:516:0x0999, B:518:0x099f, B:519:0x09a1, B:521:0x09a7, B:523:0x09af, B:525:0x09b9, B:526:0x09bf, B:527:0x09c8, B:424:0x0811, B:426:0x0817, B:428:0x081f, B:429:0x0826, B:431:0x082c, B:433:0x0834, B:434:0x083c, B:436:0x0842, B:437:0x0846, B:439:0x084c, B:441:0x0854, B:39:0x00cb, B:40:0x00ce, B:41:0x00cf, B:43:0x00d3, B:45:0x00de, B:47:0x00e6, B:48:0x00ec, B:49:0x00ef, B:50:0x00f0, B:528:0x09d9), top: B:533:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e6 A[Catch: Exception -> 0x09dc, TryCatch #0 {Exception -> 0x09dc, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x001c, B:10:0x004b, B:12:0x0051, B:16:0x005f, B:19:0x0067, B:22:0x006f, B:25:0x0077, B:29:0x0080, B:32:0x00aa, B:34:0x00b1, B:36:0x00bd, B:38:0x00c3, B:51:0x00f2, B:53:0x00ff, B:55:0x0105, B:56:0x011a, B:59:0x0122, B:61:0x0126, B:62:0x0131, B:64:0x0137, B:65:0x0142, B:67:0x0148, B:68:0x0153, B:70:0x0159, B:71:0x0160, B:73:0x0166, B:74:0x016d, B:76:0x0173, B:78:0x017b, B:79:0x0182, B:81:0x0188, B:83:0x0190, B:84:0x0198, B:86:0x019e, B:87:0x01a6, B:89:0x01ac, B:91:0x01b4, B:92:0x01c3, B:94:0x01c9, B:96:0x01d1, B:97:0x01d8, B:99:0x01de, B:101:0x01e6, B:102:0x01ed, B:104:0x01f3, B:106:0x0212, B:108:0x0218, B:110:0x0220, B:112:0x0228, B:113:0x022f, B:115:0x0235, B:117:0x023d, B:118:0x0245, B:120:0x024b, B:122:0x0253, B:133:0x028d, B:135:0x0293, B:137:0x029b, B:139:0x02ae, B:141:0x02b4, B:143:0x02bc, B:144:0x02d1, B:146:0x02d7, B:147:0x02e6, B:149:0x02ec, B:150:0x02f7, B:152:0x02fd, B:153:0x0304, B:155:0x030d, B:163:0x033a, B:264:0x0543, B:266:0x0549, B:268:0x0551, B:270:0x0557, B:272:0x055f, B:273:0x0566, B:275:0x056c, B:277:0x0574, B:279:0x057a, B:281:0x0582, B:282:0x0589, B:284:0x058d, B:287:0x0596, B:286:0x0593, B:157:0x031c, B:159:0x0322, B:160:0x032d, B:162:0x0333, B:123:0x025f, B:125:0x0268, B:127:0x0270, B:128:0x0278, B:130:0x027e, B:132:0x0286, B:164:0x0342, B:166:0x0346, B:167:0x0351, B:169:0x0357, B:170:0x0362, B:172:0x0368, B:173:0x0373, B:175:0x0379, B:176:0x0380, B:178:0x0386, B:179:0x038d, B:181:0x0393, B:182:0x039b, B:184:0x03a1, B:186:0x03a9, B:187:0x03b0, B:189:0x03b6, B:191:0x03be, B:192:0x03c6, B:194:0x03cc, B:196:0x03d4, B:197:0x03db, B:199:0x03e1, B:201:0x03e9, B:202:0x03f0, B:204:0x03f6, B:206:0x03fe, B:208:0x0406, B:209:0x040d, B:211:0x0413, B:213:0x041b, B:214:0x0423, B:216:0x0429, B:218:0x0431, B:229:0x046b, B:231:0x0471, B:233:0x0490, B:235:0x0496, B:237:0x049e, B:239:0x04b1, B:241:0x04b7, B:243:0x04bf, B:244:0x04d4, B:246:0x04da, B:247:0x04e9, B:249:0x04ef, B:250:0x04f6, B:252:0x04fc, B:253:0x0507, B:255:0x0510, B:263:0x053d, B:257:0x051f, B:259:0x0525, B:260:0x0530, B:262:0x0536, B:219:0x043d, B:221:0x0446, B:223:0x044e, B:224:0x0456, B:226:0x045c, B:228:0x0464, B:288:0x059a, B:290:0x05a3, B:291:0x05c3, B:294:0x05d0, B:296:0x05d6, B:298:0x05e0, B:300:0x05eb, B:302:0x05f3, B:304:0x05f9, B:306:0x0601, B:325:0x0653, B:327:0x0659, B:328:0x0660, B:330:0x0666, B:332:0x066e, B:333:0x0675, B:335:0x067b, B:337:0x0683, B:338:0x068a, B:340:0x0690, B:341:0x0698, B:343:0x069e, B:344:0x06a6, B:346:0x06ac, B:347:0x06b4, B:349:0x06ba, B:351:0x06c2, B:352:0x06ca, B:354:0x06d0, B:356:0x06d6, B:357:0x06dd, B:358:0x06e6, B:360:0x06ec, B:362:0x06f4, B:363:0x06fb, B:365:0x0701, B:367:0x0709, B:368:0x0710, B:370:0x0716, B:372:0x071e, B:373:0x0725, B:375:0x072b, B:377:0x072f, B:378:0x0743, B:379:0x0745, B:381:0x0758, B:383:0x0760, B:385:0x0767, B:387:0x076d, B:389:0x0776, B:393:0x0780, B:395:0x0784, B:397:0x078a, B:399:0x0793, B:401:0x0799, B:402:0x079b, B:404:0x07a1, B:406:0x07a9, B:408:0x07b3, B:409:0x07b9, B:410:0x07c2, B:307:0x0609, B:309:0x060f, B:311:0x0617, B:312:0x061e, B:314:0x0624, B:316:0x062c, B:317:0x0634, B:319:0x063a, B:320:0x063e, B:322:0x0644, B:324:0x064c, B:411:0x07d6, B:413:0x07de, B:415:0x07e8, B:417:0x07f3, B:419:0x07fb, B:421:0x0801, B:423:0x0809, B:442:0x085b, B:444:0x0861, B:445:0x0868, B:447:0x086e, B:448:0x0876, B:450:0x087c, B:451:0x0884, B:453:0x088a, B:454:0x0892, B:456:0x0898, B:458:0x08a0, B:459:0x08a8, B:461:0x08ae, B:463:0x08b6, B:464:0x08bd, B:466:0x08c3, B:468:0x08cb, B:469:0x08d2, B:471:0x08d8, B:473:0x08e0, B:474:0x08e7, B:476:0x08ed, B:478:0x08f5, B:479:0x08fc, B:481:0x0902, B:483:0x090a, B:484:0x0911, B:486:0x0917, B:488:0x091d, B:489:0x0924, B:490:0x092d, B:492:0x0933, B:494:0x0937, B:495:0x094b, B:496:0x094d, B:498:0x0960, B:500:0x0968, B:502:0x096f, B:504:0x0975, B:506:0x097d, B:510:0x0987, B:512:0x098b, B:514:0x0991, B:516:0x0999, B:518:0x099f, B:519:0x09a1, B:521:0x09a7, B:523:0x09af, B:525:0x09b9, B:526:0x09bf, B:527:0x09c8, B:424:0x0811, B:426:0x0817, B:428:0x081f, B:429:0x0826, B:431:0x082c, B:433:0x0834, B:434:0x083c, B:436:0x0842, B:437:0x0846, B:439:0x084c, B:441:0x0854, B:39:0x00cb, B:40:0x00ce, B:41:0x00cf, B:43:0x00d3, B:45:0x00de, B:47:0x00e6, B:48:0x00ec, B:49:0x00ef, B:50:0x00f0, B:528:0x09d9), top: B:533:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec A[Catch: Exception -> 0x09dc, TryCatch #0 {Exception -> 0x09dc, blocks: (B:3:0x0002, B:5:0x0014, B:8:0x001c, B:10:0x004b, B:12:0x0051, B:16:0x005f, B:19:0x0067, B:22:0x006f, B:25:0x0077, B:29:0x0080, B:32:0x00aa, B:34:0x00b1, B:36:0x00bd, B:38:0x00c3, B:51:0x00f2, B:53:0x00ff, B:55:0x0105, B:56:0x011a, B:59:0x0122, B:61:0x0126, B:62:0x0131, B:64:0x0137, B:65:0x0142, B:67:0x0148, B:68:0x0153, B:70:0x0159, B:71:0x0160, B:73:0x0166, B:74:0x016d, B:76:0x0173, B:78:0x017b, B:79:0x0182, B:81:0x0188, B:83:0x0190, B:84:0x0198, B:86:0x019e, B:87:0x01a6, B:89:0x01ac, B:91:0x01b4, B:92:0x01c3, B:94:0x01c9, B:96:0x01d1, B:97:0x01d8, B:99:0x01de, B:101:0x01e6, B:102:0x01ed, B:104:0x01f3, B:106:0x0212, B:108:0x0218, B:110:0x0220, B:112:0x0228, B:113:0x022f, B:115:0x0235, B:117:0x023d, B:118:0x0245, B:120:0x024b, B:122:0x0253, B:133:0x028d, B:135:0x0293, B:137:0x029b, B:139:0x02ae, B:141:0x02b4, B:143:0x02bc, B:144:0x02d1, B:146:0x02d7, B:147:0x02e6, B:149:0x02ec, B:150:0x02f7, B:152:0x02fd, B:153:0x0304, B:155:0x030d, B:163:0x033a, B:264:0x0543, B:266:0x0549, B:268:0x0551, B:270:0x0557, B:272:0x055f, B:273:0x0566, B:275:0x056c, B:277:0x0574, B:279:0x057a, B:281:0x0582, B:282:0x0589, B:284:0x058d, B:287:0x0596, B:286:0x0593, B:157:0x031c, B:159:0x0322, B:160:0x032d, B:162:0x0333, B:123:0x025f, B:125:0x0268, B:127:0x0270, B:128:0x0278, B:130:0x027e, B:132:0x0286, B:164:0x0342, B:166:0x0346, B:167:0x0351, B:169:0x0357, B:170:0x0362, B:172:0x0368, B:173:0x0373, B:175:0x0379, B:176:0x0380, B:178:0x0386, B:179:0x038d, B:181:0x0393, B:182:0x039b, B:184:0x03a1, B:186:0x03a9, B:187:0x03b0, B:189:0x03b6, B:191:0x03be, B:192:0x03c6, B:194:0x03cc, B:196:0x03d4, B:197:0x03db, B:199:0x03e1, B:201:0x03e9, B:202:0x03f0, B:204:0x03f6, B:206:0x03fe, B:208:0x0406, B:209:0x040d, B:211:0x0413, B:213:0x041b, B:214:0x0423, B:216:0x0429, B:218:0x0431, B:229:0x046b, B:231:0x0471, B:233:0x0490, B:235:0x0496, B:237:0x049e, B:239:0x04b1, B:241:0x04b7, B:243:0x04bf, B:244:0x04d4, B:246:0x04da, B:247:0x04e9, B:249:0x04ef, B:250:0x04f6, B:252:0x04fc, B:253:0x0507, B:255:0x0510, B:263:0x053d, B:257:0x051f, B:259:0x0525, B:260:0x0530, B:262:0x0536, B:219:0x043d, B:221:0x0446, B:223:0x044e, B:224:0x0456, B:226:0x045c, B:228:0x0464, B:288:0x059a, B:290:0x05a3, B:291:0x05c3, B:294:0x05d0, B:296:0x05d6, B:298:0x05e0, B:300:0x05eb, B:302:0x05f3, B:304:0x05f9, B:306:0x0601, B:325:0x0653, B:327:0x0659, B:328:0x0660, B:330:0x0666, B:332:0x066e, B:333:0x0675, B:335:0x067b, B:337:0x0683, B:338:0x068a, B:340:0x0690, B:341:0x0698, B:343:0x069e, B:344:0x06a6, B:346:0x06ac, B:347:0x06b4, B:349:0x06ba, B:351:0x06c2, B:352:0x06ca, B:354:0x06d0, B:356:0x06d6, B:357:0x06dd, B:358:0x06e6, B:360:0x06ec, B:362:0x06f4, B:363:0x06fb, B:365:0x0701, B:367:0x0709, B:368:0x0710, B:370:0x0716, B:372:0x071e, B:373:0x0725, B:375:0x072b, B:377:0x072f, B:378:0x0743, B:379:0x0745, B:381:0x0758, B:383:0x0760, B:385:0x0767, B:387:0x076d, B:389:0x0776, B:393:0x0780, B:395:0x0784, B:397:0x078a, B:399:0x0793, B:401:0x0799, B:402:0x079b, B:404:0x07a1, B:406:0x07a9, B:408:0x07b3, B:409:0x07b9, B:410:0x07c2, B:307:0x0609, B:309:0x060f, B:311:0x0617, B:312:0x061e, B:314:0x0624, B:316:0x062c, B:317:0x0634, B:319:0x063a, B:320:0x063e, B:322:0x0644, B:324:0x064c, B:411:0x07d6, B:413:0x07de, B:415:0x07e8, B:417:0x07f3, B:419:0x07fb, B:421:0x0801, B:423:0x0809, B:442:0x085b, B:444:0x0861, B:445:0x0868, B:447:0x086e, B:448:0x0876, B:450:0x087c, B:451:0x0884, B:453:0x088a, B:454:0x0892, B:456:0x0898, B:458:0x08a0, B:459:0x08a8, B:461:0x08ae, B:463:0x08b6, B:464:0x08bd, B:466:0x08c3, B:468:0x08cb, B:469:0x08d2, B:471:0x08d8, B:473:0x08e0, B:474:0x08e7, B:476:0x08ed, B:478:0x08f5, B:479:0x08fc, B:481:0x0902, B:483:0x090a, B:484:0x0911, B:486:0x0917, B:488:0x091d, B:489:0x0924, B:490:0x092d, B:492:0x0933, B:494:0x0937, B:495:0x094b, B:496:0x094d, B:498:0x0960, B:500:0x0968, B:502:0x096f, B:504:0x0975, B:506:0x097d, B:510:0x0987, B:512:0x098b, B:514:0x0991, B:516:0x0999, B:518:0x099f, B:519:0x09a1, B:521:0x09a7, B:523:0x09af, B:525:0x09b9, B:526:0x09bf, B:527:0x09c8, B:424:0x0811, B:426:0x0817, B:428:0x081f, B:429:0x0826, B:431:0x082c, B:433:0x0834, B:434:0x083c, B:436:0x0842, B:437:0x0846, B:439:0x084c, B:441:0x0854, B:39:0x00cb, B:40:0x00ce, B:41:0x00cf, B:43:0x00d3, B:45:0x00de, B:47:0x00e6, B:48:0x00ec, B:49:0x00ef, B:50:0x00f0, B:528:0x09d9), top: B:533:0x0002 }] */
    public static final Unit e1(m410 m410Var, String str) {
        long roundId;
        MultiplierResponse multiplierResponse;
        v720 binding;
        v720 binding2;
        List<DetailResponse> gameDetailsResponseList;
        DetailResponse detailResponse;
        List<DetailResponse> gameDetailsResponseList2;
        DetailResponse detailResponse2;
        v720 binding3;
        v720 binding4;
        v720 binding5;
        v720 binding6;
        v720 binding7;
        v720 binding8;
        v720 binding9;
        v720 binding10;
        v720 binding11;
        v720 binding12;
        v720 binding13;
        List<DetailResponse> gameDetailsResponseList3;
        DetailResponse detailResponse3;
        List<DetailResponse> gameDetailsResponseList4;
        DetailResponse detailResponse4;
        v720 binding14;
        v720 binding15;
        v720 binding16;
        v720 binding17;
        v720 binding18;
        v720 binding19;
        v720 binding20;
        v720 binding21;
        v720 binding22;
        v720 binding23;
        v720 binding24;
        ixi ixiVar;
        ixi ixiVar2;
        v720 binding25;
        v720 binding26;
        v720 binding27;
        v720 binding28;
        v720 binding29;
        v720 binding30;
        v720 binding31;
        v720 binding32;
        v720 binding33;
        ixi ixiVar3;
        v720 binding34;
        ixi ixiVar4;
        v720 binding35;
        v720 binding36;
        v720 binding37;
        ixi ixiVar5;
        ixi ixiVar6;
        v720 binding38;
        v720 binding39;
        v720 binding40;
        v720 binding41;
        v720 binding42;
        v720 binding43;
        v720 binding44;
        v720 binding45;
        v720 binding46;
        v720 binding47;
        try {
            eal ealVar = new eal();
            String strA = y54.a(Base64.decode(str, 0));
            if (strA != null && strA.length() != 0) {
                Object objE = ealVar.e(strA, UserInfoResponseSocket.class);
                objE.getClass();
                UserInfoResponseSocket userInfoResponseSocket = (UserInfoResponseSocket) objE;
                long roundId2 = userInfoResponseSocket.getRoundId();
                long betId = userInfoResponseSocket.getBetId();
                int roomId = userInfoResponseSocket.getRoomId();
                int betIndex = userInfoResponseSocket.getBetIndex();
                double stakeAmount = userInfoResponseSocket.getStakeAmount();
                double payoutAmount = userInfoResponseSocket.getPayoutAmount();
                Double giftAmount = userInfoResponseSocket.getGiftAmount();
                Double dValueOf = Double.valueOf(giftAmount != null ? giftAmount.doubleValue() : 0.0d);
                String currency = userInfoResponseSocket.getCurrency();
                String str2 = "";
                if (currency == null) {
                    currency = "";
                }
                String cashoutCoefficient = userInfoResponseSocket.getCashoutCoefficient();
                if (cashoutCoefficient == null) {
                    cashoutCoefficient = "";
                }
                String userId = userInfoResponseSocket.getUserId();
                if (userId == null) {
                    userId = "";
                }
                String nickName = userInfoResponseSocket.getNickName();
                if (nickName == null) {
                    nickName = "";
                }
                String autoCashoutAt = userInfoResponseSocket.getAutoCashoutAt();
                if (autoCashoutAt != null) {
                    str2 = autoCashoutAt;
                }
                double betAmount = 0.0d;
                TopBets topBets = new TopBets(roundId2, betId, roomId, betIndex, stakeAmount, payoutAmount, dValueOf, currency, cashoutCoefficient, userId, nickName, str2, null, null, null, null, null, null, 258048, null);
                Unit unit = null;
                if (m410Var.U != null) {
                    userInfoResponseSocket.getRoundId();
                    MultiplierResponse multiplierResponse2 = m410Var.U;
                    if (multiplierResponse2 == null) {
                        Intrinsics.n("multiplierResponse");
                        throw null;
                    }
                    if (multiplierResponse2.getRoundId() == userInfoResponseSocket.getRoundId()) {
                        ixi ixiVar7 = (ixi) m410Var.b;
                        if (ixiVar7 != null) {
                            ixiVar7.V.c(topBets);
                            Unit unit2 = Unit.a;
                        }
                    } else {
                        if (m410Var.U != null) {
                            userInfoResponseSocket.getRoundId();
                            roundId = userInfoResponseSocket.getRoundId();
                            multiplierResponse = m410Var.U;
                            if (multiplierResponse != null) {
                                Intrinsics.n("multiplierResponse");
                                throw null;
                            }
                            if (roundId > multiplierResponse.getRoundId()) {
                                m410Var.n0.add(topBets);
                            }
                        }
                        Unit unit3 = Unit.a;
                    }
                } else {
                    if (m410Var.U != null) {
                        userInfoResponseSocket.getRoundId();
                        roundId = userInfoResponseSocket.getRoundId();
                        multiplierResponse = m410Var.U;
                        if (multiplierResponse != null) {
                            Intrinsics.n("multiplierResponse");
                            throw null;
                        }
                        if (roundId > multiplierResponse.getRoundId()) {
                            m410Var.n0.add(topBets);
                        }
                    }
                    Unit unit4 = Unit.a;
                }
                if (userInfoResponseSocket.getCashoutCoefficient() == null) {
                    goa0 goa0Var = (goa0) m410Var.a;
                    if (goa0Var != null) {
                        goa0Var.A1(Integer.valueOf(userInfoResponseSocket.getBetIndex()), String.valueOf(userInfoResponseSocket.getRoundId()));
                        Unit unit5 = Unit.a;
                    }
                    int betIndex2 = userInfoResponseSocket.getBetIndex();
                    B b2 = m410Var.b;
                    if (betIndex2 == 1) {
                        ixi ixiVar8 = (ixi) b2;
                        if (ixiVar8 != null) {
                            ixiVar8.b.setRoundId(userInfoResponseSocket.getRoundId());
                            Unit unit6 = Unit.a;
                        }
                        ixi ixiVar9 = (ixi) m410Var.b;
                        if (ixiVar9 != null) {
                            ixiVar9.b.setBetAmount(userInfoResponseSocket.getStakeAmount());
                            Unit unit7 = Unit.a;
                        }
                        ixi ixiVar10 = (ixi) m410Var.b;
                        if (ixiVar10 != null) {
                            ixiVar10.b.setBetId(userInfoResponseSocket.getBetId());
                            Unit unit8 = Unit.a;
                        }
                        ixi ixiVar11 = (ixi) m410Var.b;
                        if (ixiVar11 != null) {
                            ixiVar11.b.setBetPlaced(true);
                            Unit unit9 = Unit.a;
                        }
                        ixi ixiVar12 = (ixi) m410Var.b;
                        if (ixiVar12 != null) {
                            ixiVar12.b.setBetPlacedV2(true);
                            Unit unit10 = Unit.a;
                        }
                        ixi ixiVar13 = (ixi) m410Var.b;
                        if (ixiVar13 != null && (binding47 = ixiVar13.b.getBinding()) != null) {
                            binding47.v.setVisibility(8);
                            Unit unit11 = Unit.a;
                        }
                        ixi ixiVar14 = (ixi) m410Var.b;
                        if (ixiVar14 != null && (binding46 = ixiVar14.b.getBinding()) != null) {
                            binding46.q0.setVisibility(0);
                            Unit unit12 = Unit.a;
                        }
                        ixi ixiVar15 = (ixi) m410Var.b;
                        if (ixiVar15 != null) {
                            ixiVar15.b.setBetInProgress(false);
                            Unit unit13 = Unit.a;
                        }
                        ixi ixiVar16 = (ixi) m410Var.b;
                        if (ixiVar16 != null && (binding45 = ixiVar16.b.getBinding()) != null) {
                            binding45.b.setText(String.valueOf(userInfoResponseSocket.getStakeAmount()));
                            Unit unit14 = Unit.a;
                        }
                        ixi ixiVar17 = (ixi) m410Var.b;
                        if (ixiVar17 != null && (binding44 = ixiVar17.b.getBinding()) != null) {
                            binding44.v.setClickable(true);
                            Unit unit15 = Unit.a;
                        }
                        ixi ixiVar18 = (ixi) m410Var.b;
                        if (ixiVar18 != null && (binding43 = ixiVar18.b.getBinding()) != null) {
                            binding43.v.setAlpha(1.0f);
                            Unit unit16 = Unit.a;
                        }
                        Double giftAmount2 = userInfoResponseSocket.getGiftAmount();
                        GiftItem giftItem = giftAmount2 != null ? new GiftItem(giftAmount2.doubleValue(), "", "", "", 0.0d, 0L, 0, null, null, 384, null) : null;
                        if (userInfoResponseSocket.getAutoCashoutAt() != null) {
                            m410Var.E = true;
                            ixi ixiVar19 = (ixi) m410Var.b;
                            if (ixiVar19 != null && (binding42 = ixiVar19.b.getBinding()) != null) {
                                binding42.f.setStatus(true);
                                Unit unit17 = Unit.a;
                            }
                            ixi ixiVar20 = (ixi) m410Var.b;
                            if (ixiVar20 != null && (binding41 = ixiVar20.b.getBinding()) != null) {
                                binding41.C.setVisibility(0);
                                Unit unit18 = Unit.a;
                            }
                            ixi ixiVar21 = (ixi) m410Var.b;
                            if (ixiVar21 != null && (binding40 = ixiVar21.b.getBinding()) != null) {
                                binding40.z.setText(userInfoResponseSocket.getAutoCashoutAt());
                                Unit unit19 = Unit.a;
                            }
                        } else {
                            m410Var.E = false;
                            ixi ixiVar22 = (ixi) m410Var.b;
                            if (ixiVar22 != null && (binding37 = ixiVar22.b.getBinding()) != null) {
                                binding37.f.setStatus(false);
                                Unit unit20 = Unit.a;
                            }
                            ixi ixiVar23 = (ixi) m410Var.b;
                            if (ixiVar23 != null && (binding36 = ixiVar23.b.getBinding()) != null) {
                                binding36.C.setVisibility(8);
                                Unit unit21 = Unit.a;
                            }
                        }
                        ixi ixiVar24 = (ixi) m410Var.b;
                        if (ixiVar24 != null && (binding39 = ixiVar24.b.getBinding()) != null) {
                            TextView textView = binding39.b;
                            TreeMap treeMap = pw.a;
                            textView.setText(pw.n(userInfoResponseSocket.getStakeAmount()));
                            Unit unit22 = Unit.a;
                        }
                        if (giftItem == null) {
                            ixiVar5 = (ixi) m410Var.b;
                            if (ixiVar5 != null) {
                                ixiVar5.b.setUserInputAmount(userInfoResponseSocket.getStakeAmount());
                                Unit unit23 = Unit.a;
                            }
                            ixiVar6 = (ixi) m410Var.b;
                            if (ixiVar6 != null) {
                                ixiVar6.b.c();
                                Unit unit24 = Unit.a;
                            }
                        } else {
                            ixi ixiVar25 = (ixi) m410Var.b;
                            if (ixiVar25 != null && (binding38 = ixiVar25.b.getBinding()) != null) {
                                TextView textView2 = binding38.b;
                                TreeMap treeMap2 = pw.a;
                                textView2.setText(pw.n(userInfoResponseSocket.getGiftAmount().doubleValue()));
                                Unit unit25 = Unit.a;
                            }
                            ixi ixiVar26 = (ixi) m410Var.b;
                            if (ixiVar26 != null) {
                                ixiVar26.b.setFBG(giftItem, true, userInfoResponseSocket.getGiftAmount().doubleValue());
                                Unit unit26 = Unit.a;
                            }
                            ixi ixiVar27 = (ixi) m410Var.b;
                            if (ixiVar27 != null) {
                                ixiVar27.b.setFbgRoundId(userInfoResponseSocket.getRoundId());
                                Unit unit27 = Unit.a;
                            }
                            ixi ixiVar28 = (ixi) m410Var.b;
                            if (ixiVar28 != null) {
                                ixiVar28.c.c();
                                Unit unit28 = Unit.a;
                            }
                            m410Var.E0();
                            ixi ixiVar29 = (ixi) m410Var.b;
                            if (ixiVar29 != null) {
                                ShBetContainer shBetContainer = ixiVar29.b;
                                shBetContainer.b = false;
                                shBetContainer.c = false;
                                shBetContainer.d = false;
                                shBetContainer.e = false;
                                unit = Unit.a;
                            }
                            if (unit == null) {
                                ixiVar5 = (ixi) m410Var.b;
                                if (ixiVar5 != null) {
                                    ixiVar5.b.setUserInputAmount(userInfoResponseSocket.getStakeAmount());
                                    Unit unit29 = Unit.a;
                                }
                                ixiVar6 = (ixi) m410Var.b;
                                if (ixiVar6 != null) {
                                    ixiVar6.b.c();
                                    Unit unit210 = Unit.a;
                                }
                            }
                        }
                        m410Var.K = userInfoResponseSocket.getRoundId();
                    } else {
                        ixi ixiVar30 = (ixi) b2;
                        if (ixiVar30 != null) {
                            ixiVar30.c.setRoundId(userInfoResponseSocket.getRoundId());
                            Unit unit30 = Unit.a;
                        }
                        ixi ixiVar31 = (ixi) m410Var.b;
                        if (ixiVar31 != null) {
                            ixiVar31.c.setBetAmount(userInfoResponseSocket.getStakeAmount());
                            Unit unit31 = Unit.a;
                        }
                        ixi ixiVar32 = (ixi) m410Var.b;
                        if (ixiVar32 != null) {
                            ixiVar32.c.setBetId(userInfoResponseSocket.getBetId());
                            Unit unit32 = Unit.a;
                        }
                        ixi ixiVar33 = (ixi) m410Var.b;
                        if (ixiVar33 != null) {
                            ixiVar33.c.setBetPlaced(true);
                            Unit unit33 = Unit.a;
                        }
                        ixi ixiVar34 = (ixi) m410Var.b;
                        if (ixiVar34 != null) {
                            ixiVar34.c.setBetPlacedV2(true);
                            Unit unit34 = Unit.a;
                        }
                        ixi ixiVar35 = (ixi) m410Var.b;
                        if (ixiVar35 != null) {
                            ixiVar35.c.setBetInProgress(false);
                            Unit unit35 = Unit.a;
                        }
                        ixi ixiVar36 = (ixi) m410Var.b;
                        if (ixiVar36 != null && (binding33 = ixiVar36.c.getBinding()) != null) {
                            binding33.v.setVisibility(8);
                            Unit unit36 = Unit.a;
                        }
                        ixi ixiVar37 = (ixi) m410Var.b;
                        if (ixiVar37 != null && (binding32 = ixiVar37.c.getBinding()) != null) {
                            binding32.q0.setVisibility(0);
                            Unit unit37 = Unit.a;
                        }
                        ixi ixiVar38 = (ixi) m410Var.b;
                        if (ixiVar38 != null && (binding31 = ixiVar38.c.getBinding()) != null) {
                            binding31.v.setClickable(true);
                            Unit unit38 = Unit.a;
                        }
                        ixi ixiVar39 = (ixi) m410Var.b;
                        if (ixiVar39 != null && (binding30 = ixiVar39.c.getBinding()) != null) {
                            binding30.v.setAlpha(1.0f);
                            Unit unit39 = Unit.a;
                        }
                        if (userInfoResponseSocket.getAutoCashoutAt() != null) {
                            m410Var.I = true;
                            ixi ixiVar40 = (ixi) m410Var.b;
                            if (ixiVar40 != null && (binding29 = ixiVar40.c.getBinding()) != null) {
                                binding29.f.setStatus(true);
                                Unit unit40 = Unit.a;
                            }
                            ixi ixiVar41 = (ixi) m410Var.b;
                            if (ixiVar41 != null && (binding28 = ixiVar41.c.getBinding()) != null) {
                                binding28.C.setVisibility(0);
                                Unit unit41 = Unit.a;
                            }
                            ixi ixiVar42 = (ixi) m410Var.b;
                            if (ixiVar42 != null && (binding27 = ixiVar42.c.getBinding()) != null) {
                                binding27.z.setText(userInfoResponseSocket.getAutoCashoutAt());
                                Unit unit42 = Unit.a;
                            }
                        } else {
                            m410Var.I = false;
                            ixi ixiVar43 = (ixi) m410Var.b;
                            if (ixiVar43 != null && (binding24 = ixiVar43.c.getBinding()) != null) {
                                binding24.f.setStatus(false);
                                Unit unit43 = Unit.a;
                            }
                            ixi ixiVar44 = (ixi) m410Var.b;
                            if (ixiVar44 != null && (binding23 = ixiVar44.c.getBinding()) != null) {
                                binding23.C.setVisibility(8);
                                Unit unit44 = Unit.a;
                            }
                        }
                        Double giftAmount3 = userInfoResponseSocket.getGiftAmount();
                        GiftItem giftItem2 = giftAmount3 != null ? new GiftItem(giftAmount3.doubleValue(), "", "", "", 0.0d, 0L, 0, null, null, 384, null) : null;
                        ixi ixiVar45 = (ixi) m410Var.b;
                        if (ixiVar45 != null && (binding26 = ixiVar45.c.getBinding()) != null) {
                            TextView textView3 = binding26.b;
                            TreeMap treeMap3 = pw.a;
                            textView3.setText(pw.n(userInfoResponseSocket.getStakeAmount()));
                            Unit unit45 = Unit.a;
                        }
                        if (giftItem2 == null) {
                            ixiVar = (ixi) m410Var.b;
                            if (ixiVar != null) {
                                ixiVar.c.setUserInputAmount(userInfoResponseSocket.getStakeAmount());
                                Unit unit46 = Unit.a;
                            }
                            ixiVar2 = (ixi) m410Var.b;
                            if (ixiVar2 != null) {
                                ixiVar2.c.c();
                                Unit unit47 = Unit.a;
                            }
                        } else {
                            ixi ixiVar46 = (ixi) m410Var.b;
                            if (ixiVar46 != null && (binding25 = ixiVar46.c.getBinding()) != null) {
                                TextView textView4 = binding25.b;
                                TreeMap treeMap4 = pw.a;
                                textView4.setText(pw.n(userInfoResponseSocket.getGiftAmount().doubleValue()));
                                Unit unit48 = Unit.a;
                            }
                            ixi ixiVar47 = (ixi) m410Var.b;
                            if (ixiVar47 != null) {
                                ixiVar47.c.setFBG(giftItem2, true, userInfoResponseSocket.getGiftAmount().doubleValue());
                                Unit unit49 = Unit.a;
                            }
                            ixi ixiVar48 = (ixi) m410Var.b;
                            if (ixiVar48 != null) {
                                ixiVar48.b.c();
                                Unit unit50 = Unit.a;
                            }
                            ixi ixiVar49 = (ixi) m410Var.b;
                            if (ixiVar49 != null) {
                                ixiVar49.c.setFbgRoundId(userInfoResponseSocket.getRoundId());
                                Unit unit51 = Unit.a;
                            }
                            m410Var.E0();
                            ixi ixiVar50 = (ixi) m410Var.b;
                            if (ixiVar50 != null) {
                                ShBetContainer shBetContainer2 = ixiVar50.c;
                                shBetContainer2.b = false;
                                shBetContainer2.c = false;
                                shBetContainer2.d = false;
                                shBetContainer2.e = false;
                                unit = Unit.a;
                            }
                            if (unit == null) {
                                ixiVar = (ixi) m410Var.b;
                                if (ixiVar != null) {
                                    ixiVar.c.setUserInputAmount(userInfoResponseSocket.getStakeAmount());
                                    Unit unit410 = Unit.a;
                                }
                                ixiVar2 = (ixi) m410Var.b;
                                if (ixiVar2 != null) {
                                    ixiVar2.c.c();
                                    Unit unit411 = Unit.a;
                                }
                            }
                        }
                        m410Var.L = userInfoResponseSocket.getRoundId();
                    }
                    ixi ixiVar51 = (ixi) m410Var.b;
                    if (ixiVar51 != null && ixiVar51.b.getBetPlaced() && (ixiVar4 = (ixi) m410Var.b) != null && (binding35 = ixiVar4.b.getBinding()) != null) {
                        binding35.G.setAlpha(0.5f);
                        Unit unit52 = Unit.a;
                    }
                    ixi ixiVar52 = (ixi) m410Var.b;
                    if (ixiVar52 != null && ixiVar52.c.getBetPlaced() && (ixiVar3 = (ixi) m410Var.b) != null && (binding34 = ixiVar3.c.getBinding()) != null) {
                        binding34.G.setAlpha(0.5f);
                        Unit unit53 = Unit.a;
                    }
                    if (m410Var.g1 || m410Var.Y0()) {
                        m410Var.E0();
                    }
                    Unit unit54 = Unit.a;
                } else {
                    m410Var.q0();
                    goa0 goa0Var2 = (goa0) m410Var.a;
                    if (goa0Var2 != null) {
                        String strValueOf = String.valueOf(userInfoResponseSocket.getRoundId());
                        Long lValueOf = Long.valueOf(userInfoResponseSocket.getBetId());
                        strValueOf.getClass();
                        goa0Var2.C.put(goa0.E1(lValueOf, strValueOf), Boolean.TRUE);
                        Unit unit55 = Unit.a;
                    }
                    if (userInfoResponseSocket.getBetIndex() == 1) {
                        if (userInfoResponseSocket.getGiftAmount() != null && !Intrinsics.c(userInfoResponseSocket.getGiftAmount(), 0.0d)) {
                            m410Var.g1 = false;
                            m410Var.h1 = false;
                            ixi ixiVar53 = (ixi) m410Var.b;
                            if (ixiVar53 == null || !ixiVar53.c.getBetPlaced()) {
                                ixi ixiVar54 = (ixi) m410Var.b;
                                if (ixiVar54 != null && (binding21 = ixiVar54.b.getBinding()) != null) {
                                    binding21.G.setAlpha(1.0f);
                                    Unit unit56 = Unit.a;
                                }
                                ixi ixiVar55 = (ixi) m410Var.b;
                                if (ixiVar55 != null && (binding20 = ixiVar55.c.getBinding()) != null) {
                                    binding20.G.setAlpha(1.0f);
                                    Unit unit57 = Unit.a;
                                }
                            } else {
                                ixi ixiVar56 = (ixi) m410Var.b;
                                if (ixiVar56 != null && (binding22 = ixiVar56.c.getBinding()) != null) {
                                    binding22.G.setAlpha(0.5f);
                                    Unit unit58 = Unit.a;
                                }
                            }
                        } else if (m410Var.Y0()) {
                            m410Var.E0();
                        } else {
                            ixi ixiVar57 = (ixi) m410Var.b;
                            if (ixiVar57 != null && (binding12 = ixiVar57.b.getBinding()) != null) {
                                binding12.G.setAlpha(1.0f);
                                Unit unit59 = Unit.a;
                            }
                        }
                        ixi ixiVar58 = (ixi) m410Var.b;
                        if (ixiVar58 != null) {
                            ixiVar58.b.setCashoutDone(true);
                            Unit unit60 = Unit.a;
                        }
                        ixi ixiVar59 = (ixi) m410Var.b;
                        if (ixiVar59 != null && (binding19 = ixiVar59.b.getBinding()) != null) {
                            binding19.v.setAlpha(1.0f);
                            Unit unit61 = Unit.a;
                        }
                        ixi ixiVar60 = (ixi) m410Var.b;
                        if (ixiVar60 != null && (binding18 = ixiVar60.b.getBinding()) != null) {
                            binding18.B.setAlpha(1.0f);
                            Unit unit62 = Unit.a;
                        }
                        ixi ixiVar61 = (ixi) m410Var.b;
                        if (ixiVar61 != null) {
                            ixiVar61.b.setCashoutInProgress(false);
                            Unit unit63 = Unit.a;
                        }
                        ixi ixiVar62 = (ixi) m410Var.b;
                        if (ixiVar62 != null) {
                            ixiVar62.b.setBetPlaced(false);
                            Unit unit64 = Unit.a;
                        }
                        ixi ixiVar63 = (ixi) m410Var.b;
                        if (ixiVar63 != null) {
                            ixiVar63.b.setBetPlacedV2(false);
                            Unit unit65 = Unit.a;
                        }
                        ixi ixiVar64 = (ixi) m410Var.b;
                        if (ixiVar64 != null && (binding17 = ixiVar64.b.getBinding()) != null) {
                            binding17.v.setVisibility(0);
                            Unit unit66 = Unit.a;
                        }
                        if (userInfoResponseSocket.getGiftAmount() != null) {
                            ixi ixiVar65 = (ixi) m410Var.b;
                            if (ixiVar65 != null) {
                                ixiVar65.b.c();
                                Unit unit67 = Unit.a;
                            }
                            m410Var.Q0().x1();
                            Unit unit68 = Unit.a;
                        }
                        ixi ixiVar66 = (ixi) m410Var.b;
                        if (ixiVar66 != null && (binding16 = ixiVar66.b.getBinding()) != null) {
                            binding16.v.setClickable(true);
                            Unit unit69 = Unit.a;
                        }
                        ixi ixiVar67 = (ixi) m410Var.b;
                        if (ixiVar67 != null && (binding15 = ixiVar67.b.getBinding()) != null) {
                            binding15.B.setVisibility(8);
                            Unit unit70 = Unit.a;
                        }
                        ixi ixiVar68 = (ixi) m410Var.b;
                        if (ixiVar68 != null && (binding14 = ixiVar68.b.getBinding()) != null) {
                            binding14.B.setClickable(true);
                            Unit unit71 = Unit.a;
                        }
                        Context context = m410Var.getContext();
                        if (context != null) {
                            if (m410Var.h0) {
                                Intent intent = new Intent("custom-event-name");
                                intent.putExtra("number", "1");
                                intent.putExtra("enable button", true);
                                fdt.a(context).c(intent);
                            }
                            Unit unit72 = Unit.a;
                        }
                        zp40 zp40Var = new zp40();
                        double d2 = Double.parseDouble(userInfoResponseSocket.getCashoutCoefficient());
                        ixi ixiVar69 = (ixi) m410Var.b;
                        double betAmount2 = d2 * (ixiVar69 != null ? ixiVar69.b.getBetAmount() : 0.0d);
                        zp40Var.a = betAmount2;
                        DetailResponseData detailResponseData = m410Var.w;
                        if (betAmount2 > ((detailResponseData == null || (gameDetailsResponseList4 = detailResponseData.getGameDetailsResponseList()) == null || (detailResponse4 = gameDetailsResponseList4.get(0)) == null) ? 0.0d : detailResponse4.getMaxPayoutAmount())) {
                            DetailResponseData detailResponseData2 = m410Var.w;
                            zp40Var.a = (detailResponseData2 == null || (gameDetailsResponseList3 = detailResponseData2.getGameDetailsResponseList()) == null || (detailResponse3 = gameDetailsResponseList3.get(0)) == null) ? 0.0d : detailResponse3.getMaxPayoutAmount();
                        }
                        ixi ixiVar70 = (ixi) m410Var.b;
                        if (ixiVar70 != null && (binding13 = ixiVar70.b.getBinding()) != null) {
                            TextView textView5 = binding13.b;
                            TreeMap treeMap5 = pw.a;
                            ixi ixiVar71 = (ixi) m410Var.b;
                            if (ixiVar71 != null) {
                                betAmount = ixiVar71.b.getBetAmount();
                            }
                            textView5.setText(pw.n(betAmount));
                            Unit unit73 = Unit.a;
                        }
                        nas nasVarB = lrn.b(m410Var);
                        pfd pfdVar = fse.a;
                        ej5.c(nasVarB, gku.a, null, new a510(m410Var, zp40Var, userInfoResponseSocket, null), 2);
                    } else {
                        if (userInfoResponseSocket.getGiftAmount() != null && !Intrinsics.c(userInfoResponseSocket.getGiftAmount(), 0.0d)) {
                            m410Var.g1 = false;
                            m410Var.h1 = false;
                            ixi ixiVar72 = (ixi) m410Var.b;
                            if (ixiVar72 == null || !ixiVar72.b.getBetPlaced()) {
                                ixi ixiVar73 = (ixi) m410Var.b;
                                if (ixiVar73 != null && (binding10 = ixiVar73.c.getBinding()) != null) {
                                    binding10.G.setAlpha(1.0f);
                                    Unit unit74 = Unit.a;
                                }
                                ixi ixiVar74 = (ixi) m410Var.b;
                                if (ixiVar74 != null && (binding9 = ixiVar74.b.getBinding()) != null) {
                                    binding9.G.setAlpha(1.0f);
                                    Unit unit75 = Unit.a;
                                }
                            } else {
                                ixi ixiVar75 = (ixi) m410Var.b;
                                if (ixiVar75 != null && (binding11 = ixiVar75.b.getBinding()) != null) {
                                    binding11.G.setAlpha(0.5f);
                                    Unit unit76 = Unit.a;
                                }
                            }
                        } else if (m410Var.Y0()) {
                            m410Var.E0();
                        } else {
                            ixi ixiVar76 = (ixi) m410Var.b;
                            if (ixiVar76 != null && (binding = ixiVar76.c.getBinding()) != null) {
                                binding.G.setAlpha(1.0f);
                                Unit unit77 = Unit.a;
                            }
                        }
                        ixi ixiVar77 = (ixi) m410Var.b;
                        if (ixiVar77 != null) {
                            ixiVar77.c.setCashoutDone(true);
                            Unit unit78 = Unit.a;
                        }
                        ixi ixiVar78 = (ixi) m410Var.b;
                        if (ixiVar78 != null) {
                            ixiVar78.c.setCashoutInProgress(false);
                            Unit unit79 = Unit.a;
                        }
                        ixi ixiVar79 = (ixi) m410Var.b;
                        if (ixiVar79 != null) {
                            ixiVar79.c.setBetPlaced(false);
                            Unit unit80 = Unit.a;
                        }
                        ixi ixiVar80 = (ixi) m410Var.b;
                        if (ixiVar80 != null) {
                            ixiVar80.c.setBetPlacedV2(false);
                            Unit unit81 = Unit.a;
                        }
                        ixi ixiVar81 = (ixi) m410Var.b;
                        if (ixiVar81 != null && (binding8 = ixiVar81.c.getBinding()) != null) {
                            binding8.v.setVisibility(0);
                            Unit unit82 = Unit.a;
                        }
                        ixi ixiVar82 = (ixi) m410Var.b;
                        if (ixiVar82 != null && (binding7 = ixiVar82.c.getBinding()) != null) {
                            binding7.v.setClickable(true);
                            Unit unit83 = Unit.a;
                        }
                        ixi ixiVar83 = (ixi) m410Var.b;
                        if (ixiVar83 != null && (binding6 = ixiVar83.c.getBinding()) != null) {
                            binding6.B.setVisibility(8);
                            Unit unit84 = Unit.a;
                        }
                        ixi ixiVar84 = (ixi) m410Var.b;
                        if (ixiVar84 != null && (binding5 = ixiVar84.c.getBinding()) != null) {
                            binding5.B.setClickable(true);
                            Unit unit85 = Unit.a;
                        }
                        ixi ixiVar85 = (ixi) m410Var.b;
                        if (ixiVar85 != null && (binding4 = ixiVar85.c.getBinding()) != null) {
                            binding4.v.setAlpha(1.0f);
                            Unit unit86 = Unit.a;
                        }
                        ixi ixiVar86 = (ixi) m410Var.b;
                        if (ixiVar86 != null && (binding3 = ixiVar86.c.getBinding()) != null) {
                            binding3.B.setAlpha(1.0f);
                            Unit unit87 = Unit.a;
                        }
                        if (userInfoResponseSocket.getGiftAmount() != null) {
                            ixi ixiVar87 = (ixi) m410Var.b;
                            if (ixiVar87 != null) {
                                ixiVar87.c.c();
                                Unit unit88 = Unit.a;
                            }
                            m410Var.Q0().x1();
                            Unit unit89 = Unit.a;
                        }
                        Context context2 = m410Var.getContext();
                        if (context2 != null) {
                            if (m410Var.h0) {
                                Intent intent2 = new Intent("custom-event-name");
                                intent2.putExtra("number", "2");
                                intent2.putExtra("enable button", true);
                                fdt.a(context2).c(intent2);
                            }
                            Unit unit90 = Unit.a;
                        }
                        zp40 zp40Var2 = new zp40();
                        double d3 = Double.parseDouble(userInfoResponseSocket.getCashoutCoefficient());
                        ixi ixiVar88 = (ixi) m410Var.b;
                        double betAmount3 = d3 * (ixiVar88 != null ? ixiVar88.c.getBetAmount() : 0.0d);
                        zp40Var2.a = betAmount3;
                        DetailResponseData detailResponseData3 = m410Var.w;
                        if (betAmount3 > ((detailResponseData3 == null || (gameDetailsResponseList2 = detailResponseData3.getGameDetailsResponseList()) == null || (detailResponse2 = gameDetailsResponseList2.get(1)) == null) ? 0.0d : detailResponse2.getMaxPayoutAmount())) {
                            DetailResponseData detailResponseData4 = m410Var.w;
                            zp40Var2.a = (detailResponseData4 == null || (gameDetailsResponseList = detailResponseData4.getGameDetailsResponseList()) == null || (detailResponse = gameDetailsResponseList.get(1)) == null) ? 0.0d : detailResponse.getMaxPayoutAmount();
                        }
                        ixi ixiVar89 = (ixi) m410Var.b;
                        if (ixiVar89 != null && (binding2 = ixiVar89.c.getBinding()) != null) {
                            TextView textView6 = binding2.b;
                            TreeMap treeMap6 = pw.a;
                            ixi ixiVar90 = (ixi) m410Var.b;
                            if (ixiVar90 != null) {
                                betAmount = ixiVar90.c.getBetAmount();
                            }
                            textView6.setText(pw.n(betAmount));
                            Unit unit91 = Unit.a;
                        }
                        nas nasVarB2 = lrn.b(m410Var);
                        pfd pfdVar2 = fse.a;
                        ej5.c(nasVarB2, gku.a, null, new z410(m410Var, zp40Var2, userInfoResponseSocket, null), 2);
                    }
                }
                return Unit.a;
            }
            return Unit.a;
        } catch (Exception unused) {
        }
    }

    public static BigDecimal w0(double d2, double d3) {
        BigDecimal scale = BigDecimal.valueOf(d2 * d3).setScale(2, RoundingMode.HALF_UP);
        scale.getClass();
        return scale;
    }

    public final void A1() {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            y720 y720VarN0 = N0();
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            b410 b410Var = new b410(this, 0);
            c410 c410Var = new c410(this, 0);
            DetailResponseData detailResponseData = this.w;
            Boolean isManualSeedAllowed = detailResponseData != null ? detailResponseData.getIsManualSeedAllowed() : null;
            nv80 nv80Var = new nv80(activity);
            nv80Var.a = activity;
            nv80Var.b = y720VarN0;
            nv80Var.c = viewLifecycleOwner;
            nv80Var.d = b410Var;
            nv80Var.e = c410Var;
            nv80Var.f = isManualSeedAllowed;
            nv80Var.v = "";
            nv80Var.w = true;
            nv80Var.setCancelable(true);
            nv80Var.setCanceledOnTouchOutside(false);
            nv80Var.y = "";
            Window window = nv80Var.getWindow();
            WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
            if (attributes != null) {
                attributes.gravity = 17;
            }
            if (attributes != null) {
                attributes.flags &= -5;
            }
            Window window2 = nv80Var.getWindow();
            if (window2 != null) {
                window2.setAttributes(attributes);
            }
            Window window3 = nv80Var.getWindow();
            if (window3 != null) {
                window3.setBackgroundDrawableResource(R.color.trans_black_45);
            }
            nv80Var.show();
            Window window4 = nv80Var.getWindow();
            if (window4 != null) {
                window4.setLayout(-1, -1);
            }
            this.S = nv80Var;
            nv80Var.setOnDismissListener(new lv80());
            GameDetails gameDetails = this.r1;
            wz.a("ProvablyFairClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
        }
    }

    public final void B1(ImageView imageView, Context context) {
        if (imageView != null) {
            imageView.setVisibility(0);
            ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ROTATION, 0.0f, 359.0f).setDuration(2000L).start();
            androidx.fragment.app.e activity = getActivity();
            if (activity == null || activity.isDestroyed() || !isAdded()) {
                return;
            }
            com.bumptech.glide.a.b(context).c(context).f(thk.class).a(xa50.A).O(Integer.valueOf(R.drawable.pp_star_animation)).N(new m(imageView)).M(imageView);
        }
    }

    public final void C0() {
        ixi ixiVar = (ixi) this.b;
        if (ixiVar != null) {
            ixiVar.b.a();
        }
        ixi ixiVar2 = (ixi) this.b;
        if (ixiVar2 != null) {
            ixiVar2.c.a();
        }
        ixi ixiVar3 = (ixi) this.b;
        if (ixiVar3 != null) {
            ixiVar3.b.setBetDone();
        }
        ixi ixiVar4 = (ixi) this.b;
        if (ixiVar4 != null) {
            ixiVar4.c.setBetDone();
        }
        ixi ixiVar5 = (ixi) this.b;
        if (ixiVar5 != null) {
            ixiVar5.b.setCashoutDone();
        }
        ixi ixiVar6 = (ixi) this.b;
        if (ixiVar6 != null) {
            ixiVar6.c.setCashoutDone();
        }
        ixi ixiVar7 = (ixi) this.b;
        if (ixiVar7 != null) {
            ixiVar7.M.setVisibility(8);
        }
        q1(false);
    }

    public final void C1() {
        ValueAnimator ballAnimator;
        f820 binding;
        f820 binding2;
        f820 binding3;
        z0();
        this.W0 = false;
        Boolean bool = Boolean.FALSE;
        ((x5a0) this.m1).setValue(bool);
        ((x5a0) this.l1).setValue(bool);
        ixi ixiVar = (ixi) this.b;
        if (ixiVar != null && (binding3 = ixiVar.O.getBinding()) != null) {
            binding3.L.setVisibility(8);
        }
        ixi ixiVar2 = (ixi) this.b;
        if (ixiVar2 != null && (binding2 = ixiVar2.O.getBinding()) != null) {
            binding2.A.setVisibility(8);
        }
        ixi ixiVar3 = (ixi) this.b;
        if (ixiVar3 != null) {
            ixiVar3.b.setCashoutInProgress(false);
        }
        ixi ixiVar4 = (ixi) this.b;
        if (ixiVar4 != null) {
            ixiVar4.c.setCashoutInProgress(false);
        }
        this.M0 = true;
        ixi ixiVar5 = (ixi) this.b;
        if (ixiVar5 != null) {
            ixiVar5.c.setBetPlacedV2(false);
        }
        ixi ixiVar6 = (ixi) this.b;
        if (ixiVar6 != null) {
            ixiVar6.c.setBetPlaced(false);
        }
        ixi ixiVar7 = (ixi) this.b;
        if (ixiVar7 != null) {
            ixiVar7.b.setBetPlacedV2(false);
        }
        ixi ixiVar8 = (ixi) this.b;
        if (ixiVar8 != null) {
            ixiVar8.b.setBetPlaced(false);
        }
        ixi ixiVar9 = (ixi) this.b;
        if (ixiVar9 != null && (binding = ixiVar9.O.getBinding()) != null) {
            binding.d.removeAllViews();
        }
        ixi ixiVar10 = (ixi) this.b;
        if (ixiVar10 != null && (ballAnimator = ixiVar10.O.getBallAnimator()) != null) {
            ballAnimator.removeAllListeners();
        }
        ixi ixiVar11 = (ixi) this.b;
        if (ixiVar11 != null) {
            ixiVar11.O.setWaitingCalled(false);
        }
    }

    public final void D0() {
        a aVar = this.z0;
        this.z0 = a.a;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                g1();
                return;
            }
            if (iOrdinal == 2) {
                v1();
            } else if (iOrdinal == 3) {
                A1();
            } else {
                uhc.a();
            }
        }
    }

    public final void D1() {
        ixi ixiVar;
        if (this.J0 || (ixiVar = (ixi) this.b) == null) {
            return;
        }
        ixiVar.U.O(100);
    }

    public final void E0() {
        v720 binding;
        v720 binding2;
        if (this.Y0) {
            ixi ixiVar = (ixi) this.b;
            if (ixiVar != null && (binding2 = ixiVar.b.getBinding()) != null) {
                binding2.G.setAlpha(0.5f);
            }
            ixi ixiVar2 = (ixi) this.b;
            if (ixiVar2 == null || (binding = ixiVar2.c.getBinding()) == null) {
                return;
            }
            binding.G.setAlpha(0.5f);
        }
    }

    public final void F0() {
        ixi ixiVar = (ixi) this.b;
        if (ixiVar != null) {
            ShHeaderContainer shHeaderContainer = ixiVar.L;
            shHeaderContainer.binding.d.setClickable(false);
            shHeaderContainer.binding.w.setClickable(false);
        }
        ixi ixiVar2 = (ixi) this.b;
        if (ixiVar2 != null) {
            ixiVar2.b.setDisableContainer();
        }
        ixi ixiVar3 = (ixi) this.b;
        if (ixiVar3 != null) {
            ixiVar3.c.setDisableContainer();
        }
        ixi ixiVar4 = (ixi) this.b;
        if (ixiVar4 != null) {
            ixiVar4.V.binding.w.setClickable(false);
        }
        ixi ixiVar5 = (ixi) this.b;
        if (ixiVar5 != null) {
            ixiVar5.T.binding.c.setClickable(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    public final void G0() {
        v720 binding;
        v720 binding2;
        v720 binding3;
        ixi ixiVar;
        v720 binding4;
        ixi ixiVar2 = (ixi) this.b;
        if (ixiVar2 == null || !ixiVar2.b.getBetPlacedV2()) {
            ixi ixiVar3 = (ixi) this.b;
            if ((ixiVar3 != null ? ixiVar3.b.getFbgRoundId() : 0L) > 0 || Y0()) {
                ixiVar = (ixi) this.b;
                if (ixiVar != null && (binding4 = ixiVar.b.getBinding()) != null) {
                    binding4.G.setAlpha(0.5f);
                }
            } else {
                ixi ixiVar4 = (ixi) this.b;
                if (ixiVar4 != null && (binding = ixiVar4.b.getBinding()) != null) {
                    binding.G.setAlpha(1.0f);
                }
            }
        } else {
            ixiVar = (ixi) this.b;
            if (ixiVar != null) {
                binding4.G.setAlpha(0.5f);
            }
        }
        ixi ixiVar5 = (ixi) this.b;
        if (ixiVar5 == null || !ixiVar5.c.getBetPlacedV2()) {
            ixi ixiVar6 = (ixi) this.b;
            if ((ixiVar6 != null ? ixiVar6.c.getFbgRoundId() : 0L) <= 0 && !Y0()) {
                ixi ixiVar7 = (ixi) this.b;
                if (ixiVar7 == null || (binding2 = ixiVar7.c.getBinding()) == null) {
                    return;
                }
                binding2.G.setAlpha(1.0f);
                return;
            }
        }
        ixi ixiVar8 = (ixi) this.b;
        if (ixiVar8 == null || (binding3 = ixiVar8.c.getBinding()) == null) {
            return;
        }
        binding3.G.setAlpha(0.5f);
    }

    public final void H0() {
        ixi ixiVar = (ixi) this.b;
        if (ixiVar != null) {
            ShHeaderContainer shHeaderContainer = ixiVar.L;
            shHeaderContainer.binding.d.setClickable(true);
            shHeaderContainer.binding.w.setClickable(true);
        }
        if (this.w != null) {
            ixi ixiVar2 = (ixi) this.b;
            if (ixiVar2 != null) {
                ixiVar2.b.setEnableContainer();
            }
            ixi ixiVar3 = (ixi) this.b;
            if (ixiVar3 != null) {
                ixiVar3.c.setEnableContainer();
            }
        }
        ixi ixiVar4 = (ixi) this.b;
        if (ixiVar4 != null) {
            ixiVar4.V.binding.w.setClickable(true);
        }
        ixi ixiVar5 = (ixi) this.b;
        if (ixiVar5 != null) {
            ixiVar5.T.binding.c.setClickable(true);
        }
    }

    public final void I0() {
        v720 binding;
        v720 binding2;
        v720 binding3;
        v720 binding4;
        v720 binding5;
        v720 binding6;
        v720 binding7;
        v720 binding8;
        v720 binding9;
        v720 binding10;
        v720 binding11;
        v720 binding12;
        v720 binding13;
        v720 binding14;
        ixi ixiVar = (ixi) this.b;
        if (ixiVar == null || (binding12 = ixiVar.b.getBinding()) == null || binding12.q0.getVisibility() != 0) {
            ixi ixiVar2 = (ixi) this.b;
            if (ixiVar2 == null || (binding3 = ixiVar2.b.getBinding()) == null || binding3.B.getVisibility() != 0) {
                ixi ixiVar3 = (ixi) this.b;
                if (ixiVar3 != null && (binding2 = ixiVar3.b.getBinding()) != null) {
                    binding2.f.setAlpha(1.0f);
                }
                ixi ixiVar4 = (ixi) this.b;
                if (ixiVar4 != null && (binding = ixiVar4.b.getBinding()) != null) {
                    binding.C.setAlpha(1.0f);
                }
            } else {
                ixi ixiVar5 = (ixi) this.b;
                if (ixiVar5 != null && (binding4 = ixiVar5.b.getBinding()) != null) {
                    binding4.f.setAlpha(0.5f);
                }
            }
        } else {
            ixi ixiVar6 = (ixi) this.b;
            if (ixiVar6 != null && (binding14 = ixiVar6.b.getBinding()) != null) {
                binding14.f.setAlpha(0.5f);
            }
            ixi ixiVar7 = (ixi) this.b;
            if (ixiVar7 != null && (binding13 = ixiVar7.b.getBinding()) != null) {
                binding13.C.setAlpha(0.7f);
            }
        }
        ixi ixiVar8 = (ixi) this.b;
        if (ixiVar8 != null && (binding9 = ixiVar8.c.getBinding()) != null && binding9.q0.getVisibility() == 0) {
            ixi ixiVar9 = (ixi) this.b;
            if (ixiVar9 != null && (binding11 = ixiVar9.c.getBinding()) != null) {
                binding11.f.setAlpha(0.5f);
            }
            ixi ixiVar10 = (ixi) this.b;
            if (ixiVar10 == null || (binding10 = ixiVar10.c.getBinding()) == null) {
                return;
            }
            binding10.C.setAlpha(0.7f);
            return;
        }
        ixi ixiVar11 = (ixi) this.b;
        if (ixiVar11 != null && (binding7 = ixiVar11.c.getBinding()) != null && binding7.B.getVisibility() == 0) {
            ixi ixiVar12 = (ixi) this.b;
            if (ixiVar12 == null || (binding8 = ixiVar12.b.getBinding()) == null) {
                return;
            }
            binding8.f.setAlpha(0.5f);
            return;
        }
        ixi ixiVar13 = (ixi) this.b;
        if (ixiVar13 != null && (binding6 = ixiVar13.c.getBinding()) != null) {
            binding6.f.setAlpha(1.0f);
        }
        ixi ixiVar14 = (ixi) this.b;
        if (ixiVar14 == null || (binding5 = ixiVar14.c.getBinding()) == null) {
            return;
        }
        binding5.C.setAlpha(1.0f);
    }

    public final void J0() {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            l1z l1zVarP0 = P0();
            GameDetails gameDetails = this.r1;
            Integer id = gameDetails != null ? gameDetails.getId() : null;
            GameDetails gameDetails2 = this.r1;
            l1zVarP0.h(id, gameDetails2 != null ? gameDetails2.getName() : null);
            activity.finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0166  */
    public final void K0(String str) {
        androidx.fragment.app.e activity;
        String name;
        Object objValueOf;
        Integer id;
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        FragmentManager supportFragmentManager3;
        dt80 dt80Var;
        if (Z0() && ((this.K0 || !this.y0) && str == null)) {
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
                return;
            }
            return;
        }
        pl60 pl60Var = this.b0;
        int i2 = 1;
        if (pl60Var != null && pl60Var.isShowing()) {
            pl60 pl60Var2 = this.b0;
            if (pl60Var2 != null) {
                pl60Var2.dismiss();
                return;
            }
            return;
        }
        mj60 mj60Var = this.a0;
        if (mj60Var != null && mj60Var.isShowing()) {
            mj60 mj60Var2 = this.a0;
            if (mj60Var2 != null) {
                mj60Var2.dismiss();
                return;
            } else {
                Intrinsics.n("gameLimit");
                throw null;
            }
        }
        nv80 nv80Var = this.S;
        if (nv80Var != null && nv80Var.isShowing()) {
            nv80 nv80Var2 = this.S;
            if (nv80Var2 != null) {
                nv80Var2.dismiss();
                return;
            }
            return;
        }
        ty50 ty50Var = this.P;
        if (ty50Var != null) {
            try {
                if (ty50Var.y != null && ty50Var.a().isShowing()) {
                    try {
                        dt80 dt80Var2 = ty50Var.a().f;
                        if (dt80Var2 != null) {
                            dt80Var2.dismiss();
                        }
                    } catch (Exception unused) {
                    }
                    ty50Var.a().dismiss();
                    return;
                }
            } catch (Exception unused2) {
            }
            if (ty50Var.isShowing()) {
                ty50Var.dismiss();
                return;
            }
        }
        n2g0 n2g0Var = this.T;
        if (n2g0Var != null && n2g0Var.isShowing()) {
            n2g0 n2g0Var2 = this.T;
            if (n2g0Var2 != null && (dt80Var = n2g0Var2.z) != null) {
                dt80Var.dismiss();
            }
            n2g0 n2g0Var3 = this.T;
            if (n2g0Var3 != null) {
                n2g0Var3.dismiss();
                return;
            }
            return;
        }
        androidx.fragment.app.e activity3 = getActivity();
        Fragment fragmentG = (activity3 == null || (supportFragmentManager3 = activity3.getSupportFragmentManager()) == null) ? null : supportFragmentManager3.G(R.id.flContent);
        if (fragmentG instanceof com.sportygames.pingpong.components.a) {
            com.sportygames.pingpong.components.a aVar = (com.sportygames.pingpong.components.a) fragmentG;
            if (aVar.isAdded() && aVar.isVisible() && !aVar.v && Intrinsics.g(aVar.b, "one tap bet")) {
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
        ArrayList<GameDetails> arrayList = this.A0;
        if (arrayList != null) {
            GameDetails gameDetails = this.r1;
            int iIntValue = (gameDetails == null || (id = gameDetails.getId()) == null) ? 0 : id.intValue();
            GameDetails gameDetails2 = this.r1;
            if (gameDetails2 == null || (name = gameDetails2.getName()) == null) {
                name = "";
            }
            svg svgVar = new svg();
            svgVar.c = arrayList;
            svgVar.d = Integer.valueOf(iIntValue);
            svgVar.e = name;
            svgVar.i = str;
            this.k1 = svgVar;
            androidx.fragment.app.e activity6 = getActivity();
            if (activity6 != null) {
                try {
                    FragmentManager supportFragmentManager4 = activity6.getSupportFragmentManager();
                    supportFragmentManager4.getClass();
                    svg svgVar2 = this.k1;
                    if (svgVar2 != null) {
                        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager4);
                        aVar2.f(R.id.flContent, svgVar2, null);
                        aVar2.c("CONFIRM_DIALOG_FRAGMENT");
                        objValueOf = Integer.valueOf(aVar2.k(false, true));
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
            F0();
            Context context = getContext();
            if (context == null || (activity = getActivity()) == null) {
                return;
            }
            if (str == null) {
                FragmentManager supportFragmentManager5 = activity.getSupportFragmentManager();
                this.s0 = supportFragmentManager5;
                if (supportFragmentManager5 != null) {
                    androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager5);
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
                    th thVar = new th(this, i2);
                    int color = context.getColor(R.color.redblack_confirm_dialog_left_button);
                    int color2 = context.getColor(R.color.redblack_confirm_dialog_right_button);
                    com.sportygames.pingpong.components.a aVar4 = new com.sportygames.pingpong.components.a();
                    aVar4.a = strB;
                    aVar4.b = JsPluginCommon.GAMES_EXIT;
                    aVar4.c = strB2;
                    aVar4.d = strB3;
                    aVar4.e = thVar;
                    aVar4.w = color;
                    aVar4.y = color2;
                    aVar4.v = true;
                    aVar3.f(R.id.flContent, aVar4, null);
                    aVar3.c("");
                    aVar3.d();
                }
            } else {
                xbg xbgVar = this.c0;
                if (xbgVar == null) {
                    Intrinsics.n("errorDialog");
                    throw null;
                }
                String string7 = getString(R.string.label_dialog_exit);
                string7.getClass();
                xbg.c(xbgVar, str, string7, new vh(this, i2), new y210(), context.getColor(R.color.sh_error_btn_color), 224);
                xbgVar.a();
            }
            GameDetails gameDetails3 = this.r1;
            wz.a("BackClicked", gameDetails3 != null ? gameDetails3.getName() : null, "1", "On", "No");
            Unit unit = Unit.a;
        } catch (Exception unused3) {
            Unit unit2 = Unit.a;
        }
    }

    public final jn1 L0() {
        return (jn1) this.d.getValue();
    }

    public final zt2 M0() {
        return (zt2) this.i.getValue();
    }

    public final y720 N0() {
        return (y720) this.f.getValue();
    }

    public final fuj O0() {
        return (fuj) this.e1.getValue();
    }

    public final l1z P0() {
        return (l1z) this.c.getValue();
    }

    @Override // defpackage.bb
    public final void Q(xnh0 xnh0Var) {
        String name;
        try {
            if (this.i0) {
                j1();
                C1();
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
            this.t0 = false;
            z0();
            m1();
            SharedPreferences sharedPreferences = this.V;
            Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("PING_PONG_MUSIC", true)) : null;
            ixi ixiVar = (ixi) this.b;
            if (ixiVar != null) {
                ProgressMeterComponent progressMeterComponent = ixiVar.U;
                ypa0 ypa0Var = this.v;
                if (ypa0Var == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                String string = getString(R.string.bg_music);
                string.getClass();
                progressMeterComponent.K(ypa0Var, boolValueOf, string);
                return;
            }
            return;
        }
        if ((xnh0Var != null ? xnh0Var.a : null) != null && xnh0Var.a.length() > 0) {
            ixi ixiVar2 = (ixi) this.b;
            if (ixiVar2 != null) {
                ixiVar2.U.O(0);
            }
            this.g0 = true;
            this.M0 = false;
            this.l0 = false;
            this.y0 = false;
            this.J0 = false;
            ixi ixiVar3 = (ixi) this.b;
            if (ixiVar3 != null) {
                ixiVar3.U.setProgressForApi(11);
            }
            ixi ixiVar4 = (ixi) this.b;
            if (ixiVar4 != null) {
                ixiVar4.U.setCurrentProgress(1);
            }
            ixi ixiVar5 = (ixi) this.b;
            if (ixiVar5 != null) {
                ixiVar5.U.setVisibility(0);
            }
            ixi ixiVar6 = (ixi) this.b;
            if (ixiVar6 != null) {
                ixiVar6.U.L();
            }
            if (getContext() != null) {
                r1();
                jn1 jn1VarL0 = L0();
                GameDetails gameDetails = this.r1;
                if (gameDetails == null || (name = gameDetails.getName()) == null) {
                    name = "";
                }
                ej5.c(o8i0.d(jn1VarL0), null, null, new zm1(jn1VarL0, name, null), 3);
                ixi ixiVar7 = (ixi) this.b;
                if (ixiVar7 != null) {
                    ixiVar7.U.E((fq5) this.y.getValue(), this.I0, this.F0, this.i1);
                }
            }
        }
        this.i0 = false;
    }

    public final p530 Q0() {
        return (p530) this.e.getValue();
    }

    public final void R0(MultiplierResponse multiplierResponse) {
        boolean zG = Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT");
        B b2 = this.b;
        int i2 = 0;
        if (!zG) {
            ixi ixiVar = (ixi) b2;
            if (ixiVar != null) {
                ixiVar.N.setVisibility(8);
            }
            ImageView[] imageViewArr = this.s1;
            if (imageViewArr != null) {
                int length = imageViewArr.length;
                while (i2 < length) {
                    ImageView imageView = imageViewArr[i2];
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    i2++;
                }
            }
            jvd0 jvd0Var = this.t1;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            this.t1 = null;
            return;
        }
        ixi ixiVar2 = (ixi) b2;
        if (ixiVar2 != null) {
            ixiVar2.N.setVisibility(0);
        }
        ImageView[] imageViewArr2 = this.s1;
        if (imageViewArr2 != null) {
            lx30.INSTANCE.getClass();
            for (int length2 = imageViewArr2.length - 1; length2 > 0; length2--) {
                int iF = lx30.b.f(length2 + 1);
                ImageView imageView2 = imageViewArr2[length2];
                imageViewArr2[length2] = imageViewArr2[iF];
                imageViewArr2[iF] = imageView2;
            }
        }
        ImageView[] imageViewArr3 = new ImageView[6];
        Context context = getContext();
        if (context != null) {
            while (i2 < 6) {
                ImageView[] imageViewArr4 = this.s1;
                imageViewArr3[i2] = imageViewArr4 != null ? imageViewArr4[i2] : null;
                i2++;
            }
            this.t1 = ej5.c(ebs.a(getLifecycle()), null, null, new d(imageViewArr3, context, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    public final void S0() {
        v720 binding;
        v720 binding2;
        v720 binding3;
        ixi ixiVar;
        v720 binding4;
        ixi ixiVar2 = (ixi) this.b;
        if (ixiVar2 == null || !ixiVar2.b.getBetPlacedV2()) {
            ixi ixiVar3 = (ixi) this.b;
            if ((ixiVar3 != null ? ixiVar3.b.getFbgRoundId() : 0L) > 0 || Y0()) {
                ixiVar = (ixi) this.b;
                if (ixiVar != null && (binding4 = ixiVar.b.getBinding()) != null) {
                    binding4.G.setAlpha(0.5f);
                }
            } else {
                ixi ixiVar4 = (ixi) this.b;
                if (ixiVar4 != null && (binding = ixiVar4.b.getBinding()) != null) {
                    binding.G.setAlpha(1.0f);
                }
            }
        } else {
            ixiVar = (ixi) this.b;
            if (ixiVar != null) {
                binding4.G.setAlpha(0.5f);
            }
        }
        ixi ixiVar5 = (ixi) this.b;
        if (ixiVar5 == null || !ixiVar5.c.getBetPlacedV2()) {
            ixi ixiVar6 = (ixi) this.b;
            if ((ixiVar6 != null ? ixiVar6.c.getFbgRoundId() : 0L) <= 0 && !Y0()) {
                ixi ixiVar7 = (ixi) this.b;
                if (ixiVar7 == null || (binding2 = ixiVar7.c.getBinding()) == null) {
                    return;
                }
                binding2.G.setAlpha(1.0f);
                return;
            }
        }
        ixi ixiVar8 = (ixi) this.b;
        if (ixiVar8 == null || (binding3 = ixiVar8.c.getBinding()) == null) {
            return;
        }
        binding3.G.setAlpha(0.5f);
    }

    public final boolean T0(HeaderPayload headerPayload) {
        ixi ixiVar;
        Context applicationContext;
        String string;
        goa0 goa0Var;
        if (Intrinsics.g(headerPayload.isBlocked(), Boolean.TRUE)) {
            Context context = getContext();
            if (context != null) {
                vs80 vs80Var = vs80.b;
                ResultWrapper.GenericError genericError = new ResultWrapper.GenericError(80001, new HTTPResponse(9005, getString(R.string.game_not_available), null, null, null, null, null, 64, null));
                qyr qyrVar = new qyr(this, 2);
                vkw vkwVar = new vkw(1);
                Function0 function0 = new Function0() { // from class: t110
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        m410 m410Var = this.a;
                        m410Var.t0 = false;
                        m410Var.z0();
                        m410Var.m1();
                        return Unit.a;
                    }
                };
                context.getColor(R.color.sh_error_btn_color);
                vs80Var.c(context, genericError, qyrVar, vkwVar, function0, 0, (640 & 128) != 0 ? new mm60() : null, (640 & 512) != 0 ? new xvj(2) : null);
            }
            return false;
        }
        headerPayload.getCountryCode();
        String userCountryCode = headerPayload.getUserCountryCode();
        if (userCountryCode == null) {
            userCountryCode = "";
        }
        this.u0 = userCountryCode;
        String currency = headerPayload.getCurrency();
        if (currency == null) {
            currency = "";
        }
        this.v0 = currency;
        SportyGamesManager.getInstance().setPatronId(String.valueOf(headerPayload.getPatronId()));
        SportyGamesManager.getInstance().setUserId(String.valueOf(headerPayload.getId()));
        SportyGamesManager.getInstance().setUserImage(String.valueOf(headerPayload.getAvatar()));
        SportyGamesManager.getInstance().setNickName(String.valueOf(headerPayload.getNickName()));
        this.z = String.valueOf(headerPayload.getAvatar());
        String nickName = headerPayload.getNickName();
        String str = nickName != null ? nickName : "";
        this.A = str;
        ixi ixiVar2 = (ixi) this.b;
        if (ixiVar2 != null) {
            ixiVar2.K.setUserDetails(str, this.z);
        }
        String str2 = this.v0;
        if (str2 != null && str2.length() != 0 && (goa0Var = (goa0) this.a) != null) {
            goa0Var.C1(this.v0, this.u0);
        }
        if (Z0()) {
            L0().y1();
        }
        if (this.y0 && !this.K0 && this.k0) {
            ixi ixiVar3 = (ixi) this.b;
            if (ixiVar3 != null) {
                ixiVar3.L.setVisibility(4);
            }
            ixi ixiVar4 = (ixi) this.b;
            if (ixiVar4 != null) {
                ixiVar4.X.setVisibility(0);
            }
            Context context2 = getContext();
            if (context2 != null && (applicationContext = context2.getApplicationContext()) != null && (string = applicationContext.getString(R.string.finding_room)) != null) {
                op5 op5Var = op5.a;
                String string2 = getString(R.string.finding_you_room_cms);
                string2.getClass();
                op5Var.getClass();
                String strB = op5.b(string2, string, null);
                ixi ixiVar5 = (ixi) this.b;
                if (ixiVar5 != null) {
                    ixiVar5.X.setMessageandBG(R.color.sh_toast, strB);
                }
            }
        }
        if (!this.J0 && (ixiVar = (ixi) this.b) != null) {
            ixiVar.U.P();
        }
        return true;
    }

    public final void U0() {
        v720 binding;
        v720 binding2;
        v720 binding3;
        v720 binding4;
        v720 binding5;
        v720 binding6;
        ixi ixiVar = (ixi) this.b;
        if (ixiVar == null || ixiVar.M.getVisibility() != 0) {
            return;
        }
        ixi ixiVar2 = (ixi) this.b;
        if (Intrinsics.c(ixiVar2 != null ? Double.valueOf(ixiVar2.c.getCashoutCoeff()) : null, 0.0d)) {
            ixi ixiVar3 = (ixi) this.b;
            if (ixiVar3 != null && (binding6 = ixiVar3.c.getBinding()) != null) {
                binding6.z.setText("1.01");
            }
            ixi ixiVar4 = (ixi) this.b;
            if (ixiVar4 != null && (binding5 = ixiVar4.c.getBinding()) != null) {
                binding5.B.setClickable(true);
            }
            ixi ixiVar5 = (ixi) this.b;
            if (ixiVar5 != null && (binding4 = ixiVar5.c.getBinding()) != null) {
                binding4.B.setAlpha(1.0f);
            }
        }
        ixi ixiVar6 = (ixi) this.b;
        if (Intrinsics.c(ixiVar6 != null ? Double.valueOf(ixiVar6.b.getCashoutCoeff()) : null, 0.0d)) {
            ixi ixiVar7 = (ixi) this.b;
            if (ixiVar7 != null && (binding3 = ixiVar7.b.getBinding()) != null) {
                binding3.z.setText("1.01");
            }
            ixi ixiVar8 = (ixi) this.b;
            if (ixiVar8 != null && (binding2 = ixiVar8.b.getBinding()) != null) {
                binding2.B.setClickable(true);
            }
            ixi ixiVar9 = (ixi) this.b;
            if (ixiVar9 != null && (binding = ixiVar9.b.getBinding()) != null) {
                binding.B.setAlpha(1.0f);
            }
        }
        C0();
        if (this.d0 && this.D) {
            ixi ixiVar10 = (ixi) this.b;
            if (ixiVar10 != null) {
                ixiVar10.b.setDone();
            }
            ixi ixiVar11 = (ixi) this.b;
            if (ixiVar11 != null) {
                ixiVar11.M.setVisibility(8);
            }
        }
    }

    public final void V0() {
        Integer numValueOf = Integer.valueOf(R.color.pp_toggle_off_color);
        Integer numValueOf2 = Integer.valueOf(R.color.pp_toggle_on_color);
        op5 op5Var = op5.a;
        String string = getString(R.string.music_cms);
        string.getClass();
        String string2 = getString(R.string.music_menu);
        string2.getClass();
        op5Var.getClass();
        String strB = op5.b(string, string2, null);
        MenuIconSize menuIconSize = new MenuIconSize(R.dimen._15sdp, R.dimen._12sdp);
        o310 o310Var = new o310();
        SharedPreferences sharedPreferences = this.V;
        LeftMenuButton leftMenuButton = new LeftMenuButton(0, strB, R.drawable.music, menuIconSize, o310Var, true, sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("PING_PONG_MUSIC", true)) : null, numValueOf2, numValueOf, null, false, new Function1() { // from class: q310
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ixi ixiVar;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                m410 m410Var = this.a;
                SharedPreferences.Editor editor = m410Var.W;
                if (zBooleanValue) {
                    if (editor != null) {
                        editor.putBoolean("PING_PONG_MUSIC", true);
                    }
                    SharedPreferences.Editor editor2 = m410Var.W;
                    if (editor2 != null) {
                        editor2.apply();
                    }
                    SharedPreferences sharedPreferences2 = m410Var.V;
                    Boolean boolValueOf = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("PING_PONG_SOUND", true)) : null;
                    Context context = m410Var.getContext();
                    if (context != null && (ixiVar = (ixi) m410Var.b) != null) {
                        ProgressMeterComponent progressMeterComponent = ixiVar.U;
                        String string3 = m410Var.getString(R.string.ping_pong_name);
                        string3.getClass();
                        rk60.b bVar = rk60.b.A;
                        GameDetails gameDetails = m410Var.r1;
                        ypa0 ypa0Var = m410Var.v;
                        if (ypa0Var == null) {
                            Intrinsics.n("soundViewModel");
                            throw null;
                        }
                        Boolean bool = Boolean.TRUE;
                        String string4 = m410Var.getString(R.string.bg_music);
                        string4.getClass();
                        progressMeterComponent.I("Ping Pong/", string3, boolValueOf, bVar, gameDetails, context, ypa0Var, bool, string4);
                    }
                    GameDetails gameDetails2 = m410Var.r1;
                    wz.a("Music", gameDetails2 != null ? gameDetails2.getName() : null, "On");
                } else {
                    if (editor != null) {
                        editor.putBoolean("PING_PONG_MUSIC", false);
                    }
                    if (((ixi) m410Var.b) != null) {
                        ypa0 ypa0Var2 = m410Var.v;
                        if (ypa0Var2 == null) {
                            Intrinsics.n("soundViewModel");
                            throw null;
                        }
                        ypa0Var2.I1();
                    }
                    GameDetails gameDetails3 = m410Var.r1;
                    wz.a("Music", gameDetails3 != null ? gameDetails3.getName() : null, "Off");
                }
                SharedPreferences.Editor editor3 = m410Var.W;
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
        r310 r310Var = new r310();
        SharedPreferences sharedPreferences2 = this.V;
        LeftMenuButton leftMenuButton2 = new LeftMenuButton(0, strB2, R.drawable.ic_sound, menuIconSize2, r310Var, true, sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("PING_PONG_SOUND", true)) : null, numValueOf2, numValueOf, null, false, new Function1() { // from class: s310
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                m410 m410Var = this.a;
                SharedPreferences.Editor editor = m410Var.W;
                if (zBooleanValue) {
                    if (editor != null) {
                        editor.putBoolean("PING_PONG_SOUND", true);
                    }
                    GameDetails gameDetails = m410Var.r1;
                    wz.a("Sound", gameDetails != null ? gameDetails.getName() : null, "On");
                } else {
                    if (editor != null) {
                        editor.putBoolean("PING_PONG_SOUND", false);
                    }
                    GameDetails gameDetails2 = m410Var.r1;
                    wz.a("Sound", gameDetails2 != null ? gameDetails2.getName() : null, "Off");
                }
                SharedPreferences.Editor editor2 = m410Var.W;
                if (editor2 != null) {
                    editor2.apply();
                }
                ypa0 ypa0Var = m410Var.v;
                if (ypa0Var != null) {
                    ypa0Var.K1(ypa0Var.y1().d);
                    return Unit.a;
                }
                Intrinsics.n("soundViewModel");
                throw null;
            }
        }, 1536, null);
        String string5 = getString(R.string.one_tap_bet_cms);
        string5.getClass();
        String string6 = getString(R.string.onetap_bet_menu);
        string6.getClass();
        String strB3 = op5.b(string5, string6, null);
        MenuIconSize menuIconSize3 = new MenuIconSize(R.dimen._15sdp, R.dimen._10sdp);
        u310 u310Var = new u310();
        SharedPreferences sharedPreferences3 = this.V;
        LeftMenuButton leftMenuButton3 = new LeftMenuButton(0, strB3, R.drawable.ic_one_tap_bet, menuIconSize3, u310Var, true, sharedPreferences3 != null ? Boolean.valueOf(sharedPreferences3.getBoolean("PING_PONG_ONE_TAP", false)) : null, numValueOf2, numValueOf, null, false, new Function1() { // from class: v310
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                v720 binding;
                v720 binding2;
                v720 binding3;
                v720 binding4;
                v720 binding5;
                v720 binding6;
                v720 binding7;
                v720 binding8;
                v720 binding9;
                v720 binding10;
                v720 binding11;
                v720 binding12;
                v720 binding13;
                v720 binding14;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                m410 m410Var = this.a;
                SharedPreferences.Editor editor = m410Var.W;
                if (zBooleanValue) {
                    if (editor != null) {
                        editor.putBoolean("PING_PONG_ONE_TAP", true);
                    }
                    ixi ixiVar = (ixi) m410Var.b;
                    if (ixiVar != null && (binding14 = ixiVar.b.getBinding()) != null) {
                        binding14.d.setAlpha(1.0f);
                    }
                    ixi ixiVar2 = (ixi) m410Var.b;
                    if (ixiVar2 != null && (binding13 = ixiVar2.c.getBinding()) != null) {
                        binding13.d.setAlpha(1.0f);
                    }
                    GameDetails gameDetails = m410Var.r1;
                    wz.a("OneTapBet", gameDetails != null ? gameDetails.getName() : null, "On");
                    ixi ixiVar3 = (ixi) m410Var.b;
                    if (ixiVar3 != null && (binding8 = ixiVar3.b.getBinding()) != null && binding8.Y.getVisibility() == 0) {
                        ixi ixiVar4 = (ixi) m410Var.b;
                        if (ixiVar4 != null && (binding12 = ixiVar4.b.getBinding()) != null) {
                            binding12.Y.setVisibility(8);
                        }
                        ixi ixiVar5 = (ixi) m410Var.b;
                        if (ixiVar5 != null && (binding11 = ixiVar5.b.getBinding()) != null) {
                            binding11.D.setVisibility(8);
                        }
                        ixi ixiVar6 = (ixi) m410Var.b;
                        if (ixiVar6 != null && (binding10 = ixiVar6.b.getBinding()) != null) {
                            binding10.a0.setVisibility(8);
                        }
                        ixi ixiVar7 = (ixi) m410Var.b;
                        if (ixiVar7 != null && (binding9 = ixiVar7.b.getBinding()) != null) {
                            binding9.v.setVisibility(0);
                        }
                        m410Var.N = false;
                    }
                    ixi ixiVar8 = (ixi) m410Var.b;
                    if (ixiVar8 != null && (binding3 = ixiVar8.c.getBinding()) != null && binding3.Y.getVisibility() == 0) {
                        ixi ixiVar9 = (ixi) m410Var.b;
                        if (ixiVar9 != null && (binding7 = ixiVar9.c.getBinding()) != null) {
                            binding7.Y.setVisibility(8);
                        }
                        ixi ixiVar10 = (ixi) m410Var.b;
                        if (ixiVar10 != null && (binding6 = ixiVar10.c.getBinding()) != null) {
                            binding6.D.setVisibility(8);
                        }
                        ixi ixiVar11 = (ixi) m410Var.b;
                        if (ixiVar11 != null && (binding5 = ixiVar11.c.getBinding()) != null) {
                            binding5.a0.setVisibility(8);
                        }
                        ixi ixiVar12 = (ixi) m410Var.b;
                        if (ixiVar12 != null && (binding4 = ixiVar12.c.getBinding()) != null) {
                            binding4.v.setVisibility(0);
                        }
                        m410Var.O = false;
                    }
                } else {
                    if (editor != null) {
                        editor.putBoolean("PING_PONG_ONE_TAP", false);
                    }
                    ixi ixiVar13 = (ixi) m410Var.b;
                    if (ixiVar13 != null && (binding2 = ixiVar13.b.getBinding()) != null) {
                        binding2.d.setAlpha(0.65f);
                    }
                    ixi ixiVar14 = (ixi) m410Var.b;
                    if (ixiVar14 != null && (binding = ixiVar14.c.getBinding()) != null) {
                        binding.d.setAlpha(0.65f);
                    }
                    ixi ixiVar15 = (ixi) m410Var.b;
                    if (ixiVar15 != null) {
                        ShBetContainer shBetContainer = ixiVar15.c;
                        shBetContainer.binding.d.setStatus(false);
                        m410Var.H = false;
                        Unit unit = Unit.a;
                        shBetContainer.autoBetPlace = false;
                    }
                    ixi ixiVar16 = (ixi) m410Var.b;
                    if (ixiVar16 != null) {
                        ShBetContainer shBetContainer2 = ixiVar16.b;
                        shBetContainer2.binding.d.setStatus(false);
                        m410Var.D = false;
                        Unit unit2 = Unit.a;
                        shBetContainer2.autoBetPlace = false;
                    }
                    GameDetails gameDetails2 = m410Var.r1;
                    wz.a("OneTapBet", gameDetails2 != null ? gameDetails2.getName() : null, "Off");
                }
                SharedPreferences.Editor editor2 = m410Var.W;
                if (editor2 != null) {
                    editor2.apply();
                }
                return Unit.a;
            }
        }, 1536, null);
        String string7 = getString(R.string.provably_fair_settings_cms);
        string7.getClass();
        String string8 = getString(R.string.provably_fair_setting);
        string8.getClass();
        LeftMenuButton leftMenuButton4 = new LeftMenuButton(0, op5.b(string7, string8, null), R.drawable.fairness_setting, new MenuIconSize(R.dimen._13sdp, R.dimen._13sdp), new Function0() { // from class: w310
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FragmentManager supportFragmentManager;
                m410 m410Var = this.a;
                e activity = m410Var.getActivity();
                if (!(((activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) ? null : supportFragmentManager.G(R.id.flContent)) instanceof a)) {
                    m410Var.A1();
                }
                return Unit.a;
            }
        }, false, null, null, null, null, false, null, 3072, null);
        String string9 = getString(R.string.how_to_play_nav_cms);
        string9.getClass();
        String string10 = getString(R.string.how_to_play_menu);
        string10.getClass();
        LeftMenuButton leftMenuButton5 = new LeftMenuButton(0, op5.b(string9, string10, null), R.drawable.ic_how_to_play, new MenuIconSize(R.dimen._13sdp, R.dimen._13sdp), new Function0() { // from class: x310
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FragmentManager supportFragmentManager;
                m410 m410Var = this.a;
                e activity = m410Var.getActivity();
                if (!(((activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) ? null : supportFragmentManager.G(R.id.flContent)) instanceof a)) {
                    m410Var.y1(false, new a110());
                }
                return Unit.a;
            }
        }, false, null, null, null, null, false, null, 3072, null);
        String string11 = getString(R.string.bet_history_cms);
        string11.getClass();
        String string12 = getString(R.string.bethistory_menu);
        string12.getClass();
        int i2 = 0;
        LeftMenuButton leftMenuButton6 = new LeftMenuButton(0, op5.b(string11, string12, null), R.drawable.ic_bethistory, new MenuIconSize(R.dimen._17sdp, R.dimen._17sdp), new y310(this, i2), false, null, null, null, null, false, null, 3072, null);
        String string13 = getString(R.string.game_limits_nav_cms);
        string13.getClass();
        String string14 = getString(R.string.game_limits);
        string14.getClass();
        List listK = kotlin.collections.b.k(leftMenuButton, leftMenuButton2, leftMenuButton3, leftMenuButton4, leftMenuButton5, leftMenuButton6, new LeftMenuButton(0, op5.b(string13, string14, null), R.drawable.game_limit, new MenuIconSize(R.dimen._17sdp, R.dimen._17sdp), new z310(this, i2), false, null, null, null, null, false, null, 3072, null));
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            ixi ixiVar = (ixi) this.b;
            if (ixiVar != null) {
                SGHamburgerMenu sGHamburgerMenu = ixiVar.K;
                ypa0 ypa0Var = this.v;
                if (ypa0Var == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                int i3 = 1;
                SGHamburgerMenu.setup$default(sGHamburgerMenu, new SGHamburgerMenu.b(ypa0Var, R.string.ping_pong_name, this.z, this.A, listK, new zi(this, i3), new p310()), activity, false, null, new bj(this, i3), 12, null);
            }
            ixi ixiVar2 = (ixi) this.b;
            if (ixiVar2 != null) {
                ixiVar2.K.setPPImage();
            }
        }
    }

    public final boolean Y0() {
        if (this.C0.size() <= 0) {
            return true;
        }
        ixi ixiVar = (ixi) this.b;
        if ((ixiVar != null ? ixiVar.b.getGiftItem() : null) != null) {
            return true;
        }
        ixi ixiVar2 = (ixi) this.b;
        return (ixiVar2 != null ? ixiVar2.c.getGiftItem() : null) != null;
    }

    public final boolean Z0() {
        return !a1();
    }

    public final boolean a1() {
        return ((goa0) this.a) != null && SportyGamesManager.getInstance().getUser() == null;
    }

    public final void b1(String str, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isManualCashout", z2);
        bundle.putString("cashoutButton", str);
        GameDetails gameDetails = this.r1;
        bundle.putString(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, gameDetails != null ? gameDetails.getName() : null);
        bundle.putString("Platform", "ANDROID");
        CasinoLogger.INSTANCE.logEventToCasino("CashoutClicked", bundle);
    }

    public final void c1(String str, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isManualBet", z2);
        bundle.putString("betButton", str);
        GameDetails gameDetails = this.r1;
        bundle.putString(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, gameDetails != null ? gameDetails.getName() : null);
        bundle.putBoolean("isFBG", this.g1);
        bundle.putBoolean("isPartialFBG", this.h1);
        bundle.putString("Platform", "ANDROID");
        SharedPreferences sharedPreferences = this.V;
        if (sharedPreferences != null) {
            bundle.putBoolean("isOneTapBet", sharedPreferences.getBoolean("PING_PONG_ONE_TAP", false));
        }
        CasinoLogger.INSTANCE.logEventToCasino("BetPlaced", bundle);
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
        if (activity2 != null && !activity2.isFinishing() && (activity = getActivity()) != null && !activity.isDestroyed() && getActivity() != null) {
            this.l0 = false;
        }
        this.j0 = true;
    }

    public final void f1() {
        Context context;
        int i2;
        boolean zBooleanValue;
        try {
            if ((a1() || (Z0() && this.q1)) && !this.y0) {
                this.y0 = true;
                boolean z2 = Z0() && this.q1;
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new g510(this, z2, true, null), 3);
            }
            if (a1() || this.q1) {
                return;
            }
            ixi ixiVar = (ixi) this.b;
            if ((ixiVar == null || ixiVar.U.getVisibility() != 0) && (context = getContext()) != null) {
                ArrayList<OnboardingItem> arrayListA = sny.a(context, "ping-pong");
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
                this.y0 = true;
                if (!zBooleanValue && !z3) {
                    this.K0 = true;
                    if (this.r1 != null) {
                        FragmentManager childFragmentManager = getChildFragmentManager();
                        childFragmentManager.getClass();
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                        op5.a.getClass();
                        List<? extends File> list = op5.b;
                        o2g o2gVar = o2g.a;
                        o2gVar.getClass();
                        com.sportygames.commons.views.a aVar2 = new com.sportygames.commons.views.a();
                        aVar2.c = "ping-pong";
                        aVar2.d = i2;
                        aVar2.w = list;
                        aVar2.z = o2gVar;
                        aVar2.A = false;
                        aVar.f(R.id.onboarding_images, aVar2, null);
                        aVar.d();
                    }
                    ixi ixiVar2 = (ixi) this.b;
                    if (ixiVar2 != null) {
                        ixiVar2.Q.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.K0 = false;
                boolean zZ0 = Z0();
                pfd pfdVar2 = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new g510(this, zZ0, false, null), 3);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void g1() {
        Context context = getContext();
        if (context != null) {
            Intent intent = new Intent(context, (Class<?>) ChatActivity.class);
            intent.putExtra(getString(R.string.room_id), this.B);
            intent.putExtra(getString(R.string.bot_id), this.C);
            intent.putExtra(getString(R.string.color), R.color.toolbar_strip_bottle);
            String string = getString(R.string.game_name);
            GameDetails gameDetails = this.r1;
            intent.putExtra(string, gameDetails != null ? gameDetails.getName() : null);
            intent.putExtra(getString(R.string.sound), this.r1);
            String string2 = getString(R.string.sound_on);
            SharedPreferences sharedPreferences = this.V;
            intent.putExtra(string2, sharedPreferences != null ? sharedPreferences.getBoolean("PING_PONG_SOUND", false) : false);
            context.startActivity(intent);
            this.h0 = true;
            GameDetails gameDetails2 = this.r1;
            wz.a("ChatClicked", gameDetails2 != null ? gameDetails2.getName() : null, "Off");
        }
    }

    public final void h1(final int i2) {
        xi60 xi60Var;
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            if (this.x0 == null) {
                this.x0 = new xi60();
            }
            GameDetails gameDetails = this.r1;
            wz.a("FBGIconClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
            C0();
            xi60 xi60Var2 = this.x0;
            if (xi60Var2 == null || xi60Var2.isAdded() || (xi60Var = this.x0) == null) {
                return;
            }
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            xi60Var.q0(supportFragmentManager, new Function0() { // from class: s010
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    List<GiftItem> entityList;
                    DetailResponseData detailResponseData;
                    List<DetailResponse> gameDetailsResponseList;
                    int i3;
                    DetailResponse detailResponse;
                    List<DetailResponse> gameDetailsResponseList2;
                    DetailResponse detailResponse2;
                    m410 m410Var = this.a;
                    PromotionGiftsResponse promotionGiftsResponse = m410Var.w0;
                    if (promotionGiftsResponse != null && (entityList = promotionGiftsResponse.getEntityList()) != null) {
                        ArrayList arrayList = (ArrayList) entityList;
                        DetailResponseData detailResponseData2 = m410Var.w;
                        if ((detailResponseData2 != null ? detailResponseData2.getGameDetailsResponseList() : null) != null && (detailResponseData = m410Var.w) != null && (gameDetailsResponseList = detailResponseData.getGameDetailsResponseList()) != null && (detailResponse = gameDetailsResponseList.get((i3 = i2))) != null) {
                            double maxAmount = detailResponse.getMaxAmount();
                            DetailResponseData detailResponseData3 = m410Var.w;
                            if (detailResponseData3 != null && (gameDetailsResponseList2 = detailResponseData3.getGameDetailsResponseList()) != null && (detailResponse2 = gameDetailsResponseList2.get(i3)) != null) {
                                double minAmount = detailResponse2.getMinAmount();
                                xi60 xi60Var3 = m410Var.x0;
                                if (xi60Var3 != null) {
                                    xi60Var3.r0(arrayList, maxAmount, minAmount, 0.0d);
                                }
                            }
                        }
                    }
                    return Unit.a;
                }
            }, new gaj() { // from class: t010
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    GiftItem giftItem = (GiftItem) obj;
                    double dDoubleValue = ((Double) obj2).doubleValue();
                    boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                    giftItem.getClass();
                    m410 m410Var = this.a;
                    m410Var.W0 = false;
                    m410Var.h1 = zBooleanValue;
                    xi60 xi60Var3 = m410Var.x0;
                    if (xi60Var3 != null) {
                        xi60Var3.dismiss();
                    }
                    m410Var.x0 = null;
                    m410Var.g1 = true;
                    m410Var.E0();
                    if (m410Var.Q0 == m410Var.P0) {
                        B b2 = m410Var.b;
                        if (i2 == 0) {
                            ixi ixiVar = (ixi) b2;
                            if (ixiVar != null) {
                                ixiVar.b.setFBG(giftItem, false, dDoubleValue);
                            }
                        } else {
                            ixi ixiVar2 = (ixi) b2;
                            if (ixiVar2 != null) {
                                ixiVar2.c.setFBG(giftItem, false, dDoubleValue);
                            }
                        }
                    }
                    m410Var.W0 = false;
                    ixi ixiVar3 = (ixi) m410Var.b;
                    if (ixiVar3 != null) {
                        ixiVar3.b.a();
                    }
                    B b3 = m410Var.b;
                    ixi ixiVar4 = (ixi) b3;
                    if (ixiVar4 != null) {
                        ShBetContainer shBetContainer = ixiVar4.b;
                        shBetContainer.b = false;
                        shBetContainer.c = false;
                        shBetContainer.d = false;
                        shBetContainer.e = false;
                    }
                    ixi ixiVar5 = (ixi) b3;
                    if (ixiVar5 != null) {
                        ixiVar5.c.a();
                    }
                    ixi ixiVar6 = (ixi) m410Var.b;
                    if (ixiVar6 != null) {
                        ShBetContainer shBetContainer2 = ixiVar6.c;
                        shBetContainer2.b = false;
                        shBetContainer2.c = false;
                        shBetContainer2.d = false;
                        shBetContainer2.e = false;
                    }
                    return Unit.a;
                }
            }, new bdn(this, 1));
        }
    }

    public final void i1() {
        goa0 goa0Var = (goa0) this.a;
        if (goa0Var != null) {
            goa0Var.c.j("go_to_login");
        }
        this.i0 = true;
    }

    public final void j1() {
        xi60 xi60Var;
        ixi ixiVar;
        ixi ixiVar2;
        androidx.fragment.app.e activity;
        FragmentManager supportFragmentManager;
        this.W0 = false;
        if (!isRemoving() && this.k1 != null && (activity = getActivity()) != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager.Y();
        }
        try {
            if (!isRemoving() && (ixiVar = (ixi) this.b) != null && ixiVar.U.getVisibility() == 0 && !this.l0 && (((ixiVar2 = (ixi) this.b) == null || ixiVar2.Q.getVisibility() != 0) && !this.K0)) {
                f1();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        ixi ixiVar3 = (ixi) this.b;
        if (ixiVar3 != null) {
            ixiVar3.U.setVisibility(8);
        }
        ixi ixiVar4 = (ixi) this.b;
        if (ixiVar4 != null) {
            ixiVar4.U.N();
        }
        if (!isRemoving()) {
            X0(this, false, false, 6);
        }
        if (!isRemoving() && (xi60Var = this.x0) != null && xi60Var.isVisible()) {
            xi60 xi60Var2 = this.x0;
            if (xi60Var2 != null) {
                xi60Var2.dismiss();
            }
            this.x0 = null;
        }
        try {
            O0().e.l(getViewLifecycleOwner());
            O0().d.l(getViewLifecycleOwner());
            O0().y1();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public final void k1() {
        String str = SportyGamesManager.getInstance().getUser().a;
        pzf0.b(str);
        if (str.equals("API_RETURN_NULL") || str.equals("testing_access_token") || str.length() == 0) {
            if (this.l0) {
                return;
            }
            this.l0 = true;
            SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
            return;
        }
        int i2 = this.j1;
        if (i2 >= 1) {
            this.j1 = 0;
            this.l0 = true;
            SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
        } else {
            this.j1 = i2 + 1;
            z0();
            m1();
        }
    }

    public final void l1() {
        try {
            if (this.E) {
                ixi ixiVar = (ixi) this.b;
                if ((ixiVar != null ? ixiVar.b.getCashoutCoeff() : 0.0d) <= Double.parseDouble("1.01")) {
                    ixi ixiVar2 = (ixi) this.b;
                    if (ixiVar2 != null) {
                        ixiVar2.b.setCashoutAmount(Double.parseDouble("1.01"));
                    }
                    ixi ixiVar3 = (ixi) this.b;
                    if (ixiVar3 != null) {
                        ixiVar3.b.f();
                    }
                }
            }
            if (this.I) {
                ixi ixiVar4 = (ixi) this.b;
                if ((ixiVar4 != null ? ixiVar4.c.getCashoutCoeff() : 0.0d) <= Double.parseDouble("1.01")) {
                    ixi ixiVar5 = (ixi) this.b;
                    if (ixiVar5 != null) {
                        ixiVar5.c.setCashoutAmount(Double.parseDouble("1.01"));
                    }
                    ixi ixiVar6 = (ixi) this.b;
                    if (ixiVar6 != null) {
                        ixiVar6.c.f();
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void m1() {
        v720 binding;
        v720 binding2;
        try {
            FragmentManager fragmentManager = this.s0;
            if ((fragmentManager != null ? fragmentManager.G(R.id.flContent) : null) != null) {
                FragmentManager fragmentManager2 = this.s0;
                Fragment fragmentG = fragmentManager2 != null ? fragmentManager2.G(R.id.flContent) : null;
                fragmentG.getClass();
                com.sportygames.pingpong.components.a aVar = (com.sportygames.pingpong.components.a) fragmentG;
                FragmentManager fragmentManager3 = this.s0;
                if (fragmentManager3 != null) {
                    androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager3);
                    aVar2.p(aVar);
                    aVar2.d();
                }
            }
            Context context = getContext();
            if (context != null) {
                fdt fdtVarA = fdt.a(context);
                f fVar = this.m0;
                if (fVar == null) {
                    Intrinsics.n("mServiceReceiver");
                    throw null;
                }
                fdtVarA.d(fVar);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("cashoutCall");
                intentFilter.addAction("playCashout");
                intentFilter.addAction("soundOn");
                fdt fdtVarA2 = fdt.a(context);
                f fVar2 = this.m0;
                if (fVar2 == null) {
                    Intrinsics.n("mServiceReceiver");
                    throw null;
                }
                fdtVarA2.b(fVar2, intentFilter);
            }
            if (!this.h0) {
                p0();
                ixi ixiVar = (ixi) this.b;
                if (ixiVar != null) {
                    ixiVar.O.setAnimstartInitial(0);
                }
                ixi ixiVar2 = (ixi) this.b;
                if (ixiVar2 != null) {
                    ixiVar2.O.setAnimDone(0);
                }
                ixi ixiVar3 = (ixi) this.b;
                if (ixiVar3 != null) {
                    ixiVar3.O.setAnimStart(0);
                }
                ixi ixiVar4 = (ixi) this.b;
                if (ixiVar4 != null) {
                    ixiVar4.O.setEndAnimDone(0);
                }
                ixi ixiVar5 = (ixi) this.b;
                if (ixiVar5 != null) {
                    ixiVar5.O.setOngoingStart(0);
                }
                ixi ixiVar6 = (ixi) this.b;
                if (ixiVar6 != null) {
                    ixiVar6.O.setDestoyed(false);
                }
            }
            ixi ixiVar7 = (ixi) this.b;
            if (ixiVar7 != null && (binding2 = ixiVar7.b.getBinding()) != null) {
                binding2.v.setClickable(true);
            }
            ixi ixiVar8 = (ixi) this.b;
            if (ixiVar8 != null && (binding = ixiVar8.c.getBinding()) != null) {
                binding.v.setClickable(true);
            }
            this.h0 = false;
        } catch (Exception unused) {
        }
    }

    public final void n1(MultiplierResponse multiplierResponse) {
        DetailResponseData detailResponseData;
        List<DetailResponse> gameDetailsResponseList;
        ixi ixiVar;
        Context context = getContext();
        if (context == null || (detailResponseData = this.w) == null || (gameDetailsResponseList = detailResponseData.getGameDetailsResponseList()) == null || gameDetailsResponseList.size() < 2 || (ixiVar = (ixi) this.b) == null) {
            return;
        }
        ShBetContainer shBetContainer = ixiVar.b;
        if (ixiVar != null) {
            ShBetContainer shBetContainer2 = ixiVar.c;
            boolean z2 = un20.a(context).getBoolean("PING_PONG_ONE_TAP", true);
            ixi ixiVar2 = (ixi) this.b;
            boolean z3 = ixiVar2 != null && ixiVar2.M.getVisibility() == 0;
            vc9.a(context, P0(), multiplierResponse, shBetContainer, shBetContainer2, gameDetailsResponseList.get(0), this.D, this.Z0, this.a1, this.F0, z2, z3);
            vc9.a(context, P0(), multiplierResponse, shBetContainer2, shBetContainer, gameDetailsResponseList.get(1), this.H, this.Z0, this.b1, this.F0, z2, z3);
        }
    }

    @Override // defpackage.l12
    public final g6i0 o0() {
        View viewInflate = getLayoutInflater().inflate(R.layout.fragment_ping_pong, (ViewGroup) null, false);
        int i2 = R.id.bet_container;
        ShBetContainer shBetContainer = (ShBetContainer) h5e.a(R.id.bet_container, viewInflate);
        if (shBetContainer != null) {
            i2 = R.id.bet_container1;
            ShBetContainer shBetContainer2 = (ShBetContainer) h5e.a(R.id.bet_container1, viewInflate);
            if (shBetContainer2 != null) {
                i2 = R.id.bet_container_layout;
                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.bet_container_layout, viewInflate);
                if (constraintLayout != null) {
                    i2 = R.id.bet_space;
                    View viewA = h5e.a(R.id.bet_space, viewInflate);
                    if (viewA != null) {
                        i2 = R.id.cashAddTxt;
                        TextView textView = (TextView) h5e.a(R.id.cashAddTxt, viewInflate);
                        if (textView != null) {
                            i2 = R.id.cashMinusTxt;
                            TextView textView2 = (TextView) h5e.a(R.id.cashMinusTxt, viewInflate);
                            if (textView2 != null) {
                                i2 = R.id.cashOutToast;
                                View viewA2 = h5e.a(R.id.cashOutToast, viewInflate);
                                if (viewA2 != null) {
                                    prr prrVarA = prr.a(viewA2);
                                    i2 = R.id.child_layout_constraint;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.child_layout_constraint, viewInflate);
                                    if (constraintLayout2 != null) {
                                        i2 = R.id.compose_view;
                                        ComposeView composeView = (ComposeView) h5e.a(R.id.compose_view, viewInflate);
                                        if (composeView != null) {
                                            i2 = R.id.coord;
                                            if (((CoordinatorLayout) h5e.a(R.id.coord, viewInflate)) != null) {
                                                i2 = R.id.drawer_layout;
                                                DrawerLayout drawerLayout = (DrawerLayout) h5e.a(R.id.drawer_layout, viewInflate);
                                                if (drawerLayout != null) {
                                                    i2 = R.id.fbg_layout;
                                                    FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.fbg_layout, viewInflate);
                                                    if (frameLayout != null) {
                                                        i2 = R.id.flContent;
                                                        if (((FrameLayout) h5e.a(R.id.flContent, viewInflate)) != null) {
                                                            i2 = R.id.flash1;
                                                            ImageView imageView = (ImageView) h5e.a(R.id.flash1, viewInflate);
                                                            if (imageView != null) {
                                                                i2 = R.id.flash2;
                                                                ImageView imageView2 = (ImageView) h5e.a(R.id.flash2, viewInflate);
                                                                if (imageView2 != null) {
                                                                    i2 = R.id.flash3;
                                                                    ImageView imageView3 = (ImageView) h5e.a(R.id.flash3, viewInflate);
                                                                    if (imageView3 != null) {
                                                                        i2 = R.id.flash4;
                                                                        ImageView imageView4 = (ImageView) h5e.a(R.id.flash4, viewInflate);
                                                                        if (imageView4 != null) {
                                                                            i2 = R.id.flash5;
                                                                            ImageView imageView5 = (ImageView) h5e.a(R.id.flash5, viewInflate);
                                                                            if (imageView5 != null) {
                                                                                i2 = R.id.flash6;
                                                                                ImageView imageView6 = (ImageView) h5e.a(R.id.flash6, viewInflate);
                                                                                if (imageView6 != null) {
                                                                                    i2 = R.id.flash7;
                                                                                    ImageView imageView7 = (ImageView) h5e.a(R.id.flash7, viewInflate);
                                                                                    if (imageView7 != null) {
                                                                                        i2 = R.id.flash8;
                                                                                        ImageView imageView8 = (ImageView) h5e.a(R.id.flash8, viewInflate);
                                                                                        if (imageView8 != null) {
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
                                                                                                        ShHeaderContainer shHeaderContainer = (ShHeaderContainer) h5e.a(R.id.header, viewInflate);
                                                                                                        if (shHeaderContainer != null) {
                                                                                                            i2 = R.id.keypad;
                                                                                                            SHKeypadContainer sHKeypadContainer = (SHKeypadContainer) h5e.a(R.id.keypad, viewInflate);
                                                                                                            if (sHKeypadContainer != null) {
                                                                                                                i2 = R.id.layout_flash;
                                                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.layout_flash, viewInflate);
                                                                                                                if (constraintLayout3 != null) {
                                                                                                                    i2 = R.id.multiplier;
                                                                                                                    ShMultiplierContainer shMultiplierContainer = (ShMultiplierContainer) h5e.a(R.id.multiplier, viewInflate);
                                                                                                                    if (shMultiplierContainer != null) {
                                                                                                                        i2 = R.id.navigationView;
                                                                                                                        if (((NavigationView) h5e.a(R.id.navigationView, viewInflate)) != null) {
                                                                                                                            i2 = R.id.networkToast;
                                                                                                                            SHToastContainer sHToastContainer = (SHToastContainer) h5e.a(R.id.networkToast, viewInflate);
                                                                                                                            if (sHToastContainer != null) {
                                                                                                                                i2 = R.id.onboarding_images;
                                                                                                                                FrameLayout frameLayout2 = (FrameLayout) h5e.a(R.id.onboarding_images, viewInflate);
                                                                                                                                if (frameLayout2 != null) {
                                                                                                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) viewInflate;
                                                                                                                                    i2 = R.id.pp_layout;
                                                                                                                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.pp_layout, viewInflate);
                                                                                                                                    if (constraintLayout5 != null) {
                                                                                                                                        i2 = R.id.previous_multiplier;
                                                                                                                                        ShRoundHistoryContainer shRoundHistoryContainer = (ShRoundHistoryContainer) h5e.a(R.id.previous_multiplier, viewInflate);
                                                                                                                                        if (shRoundHistoryContainer != null) {
                                                                                                                                            i2 = R.id.progress_meter_component;
                                                                                                                                            ProgressMeterComponent progressMeterComponent = (ProgressMeterComponent) h5e.a(R.id.progress_meter_component, viewInflate);
                                                                                                                                            if (progressMeterComponent != null) {
                                                                                                                                                i2 = R.id.round_bet;
                                                                                                                                                ShRoundBetsContainer shRoundBetsContainer = (ShRoundBetsContainer) h5e.a(R.id.round_bet, viewInflate);
                                                                                                                                                if (shRoundBetsContainer != null) {
                                                                                                                                                    i2 = R.id.round_bet_space;
                                                                                                                                                    View viewA3 = h5e.a(R.id.round_bet_space, viewInflate);
                                                                                                                                                    if (viewA3 != null) {
                                                                                                                                                        i2 = R.id.toast;
                                                                                                                                                        SHToastContainer sHToastContainer2 = (SHToastContainer) h5e.a(R.id.toast, viewInflate);
                                                                                                                                                        if (sHToastContainer2 != null) {
                                                                                                                                                            i2 = R.id.tooltip;
                                                                                                                                                            DepositTooltipComponent depositTooltipComponent = (DepositTooltipComponent) h5e.a(R.id.tooltip, viewInflate);
                                                                                                                                                            if (depositTooltipComponent != null) {
                                                                                                                                                                i2 = R.id.view_hero;
                                                                                                                                                                View viewA4 = h5e.a(R.id.view_hero, viewInflate);
                                                                                                                                                                if (viewA4 != null) {
                                                                                                                                                                    return new ixi(constraintLayout4, shBetContainer, shBetContainer2, constraintLayout, viewA, textView, textView2, prrVarA, constraintLayout2, composeView, drawerLayout, frameLayout, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, composeView2, giftToast, sGHamburgerMenu, shHeaderContainer, sHKeypadContainer, constraintLayout3, shMultiplierContainer, sHToastContainer, frameLayout2, constraintLayout4, constraintLayout5, shRoundHistoryContainer, progressMeterComponent, shRoundBetsContainer, viewA3, sHToastContainer2, depositTooltipComponent, viewA4);
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

    public final Object o1(int i2, double d2, UserInfoResponseSocket userInfoResponseSocket, tje0 tje0Var) {
        tb5 tb5Var = this.p0;
        if (tb5Var == null) {
            return Unit.a;
        }
        nas nasVarA = ebs.a(getLifecycle());
        pfd pfdVar = fse.a;
        Object objJ = tb5Var.j(tje0Var, ej5.b(nasVarA, gku.a, a6b.b, new j510(d2, i2, null, this, userInfoResponseSocket)));
        return objJ == y5b.a ? objJ : Unit.a;
    }

    @Override // defpackage.l12, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Context context;
        goa0 goa0Var;
        ssw sswVar;
        super.onDestroy();
        hic.a.getClass();
        hic.l.j("");
        goa0 goa0Var2 = (goa0) this.a;
        if (goa0Var2 != null) {
            goa0Var2.z1();
        }
        if (getView() != null && (goa0Var = (goa0) this.a) != null && (sswVar = goa0Var.A) != null) {
            sswVar.l(getViewLifecycleOwner());
        }
        if (this.m0 != null && (context = getContext()) != null) {
            fdt fdtVarA = fdt.a(context);
            f fVar = this.m0;
            if (fVar == null) {
                Intrinsics.n("mServiceReceiver");
                throw null;
            }
            fdtVarA.d(fVar);
        }
        this.b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ssw sswVar;
        ssw sswVar2;
        if (getView() != null) {
            goa0 goa0Var = (goa0) this.a;
            if (goa0Var != null && (sswVar2 = goa0Var.A) != null) {
                sswVar2.l(getViewLifecycleOwner());
            }
            goa0 goa0Var2 = (goa0) this.a;
            if (goa0Var2 != null && (sswVar = goa0Var2.A) != null) {
                sswVar.l(getViewLifecycleOwner());
            }
        }
        vs80.b.a = null;
        ixi ixiVar = (ixi) this.b;
        if (ixiVar != null) {
            ixiVar.O.removeAllViews();
        }
        ixi ixiVar2 = (ixi) this.b;
        if (ixiVar2 != null) {
            ShMultiplierContainer shMultiplierContainer = ixiVar2.O;
            j1b j1bVar = shMultiplierContainer.D;
            if (w5b.e(j1bVar) && i9p.h(j1bVar.a)) {
                w5b.c(j1bVar, null);
            }
            shMultiplierContainer.binding = null;
            shMultiplierContainer.a = null;
        }
        goa0 goa0Var3 = (goa0) this.a;
        if (goa0Var3 != null) {
            goa0Var3.z1();
        }
        SportyGamesManager.getInstance().removeAccountUpdatedListener(this);
        ixi ixiVar3 = (ixi) this.b;
        if (ixiVar3 != null) {
            ixiVar3.U.N();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (this.i0) {
            return;
        }
        j1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() throws Throwable {
        ixi ixiVar;
        Throwable th;
        String name;
        String name2;
        ema emaVar;
        q8i0 q8i0Var = this.f1;
        if (this.i0) {
            SharedPreferences sharedPreferences = this.V;
            Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("PING_PONG_SOUND", true)) : null;
            SharedPreferences sharedPreferences2 = this.V;
            Boolean boolValueOf2 = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("PING_PONG_MUSIC", true)) : null;
            Context context = getContext();
            if (context != null && (ixiVar = (ixi) this.b) != null) {
                ProgressMeterComponent progressMeterComponent = ixiVar.U;
                String string = getString(R.string.ping_pong_name);
                string.getClass();
                rk60.b bVar = rk60.b.A;
                GameDetails gameDetails = this.r1;
                ypa0 ypa0Var = this.v;
                if (ypa0Var == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                String string2 = getString(R.string.bg_music);
                string2.getClass();
                progressMeterComponent.I("Ping Pong/", string, boolValueOf, bVar, gameDetails, context, ypa0Var, boolValueOf2, string2);
            }
        } else {
            if (!this.h0) {
                this.M = true;
            }
            if (this.M0 && hic.a.d() && !this.h0) {
                goa0 goa0Var = (goa0) this.a;
                if (goa0Var != null) {
                    goa0Var.z1();
                }
                goa0 goa0Var2 = (goa0) this.a;
                if (goa0Var2 != null && (emaVar = goa0Var2.a) != null) {
                    emaVar.dispose();
                }
            }
            try {
                GameDetails gameDetails2 = this.r1;
                String str = (gameDetails2 == null || (name2 = gameDetails2.getName()) == null) ? "" : name2;
                androidx.fragment.app.e activity = getActivity();
                ibs viewLifecycleOwner = getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                ixi ixiVar2 = (ixi) this.b;
                th = null;
                try {
                    ra6.b(str, activity, viewLifecycleOwner, ixiVar2 != null ? ixiVar2.I : null, this.c1, O0(), (db6) q8i0Var.getValue(), p58.f, Float.valueOf(2.5f), new tld0(this.r1, new Function0() { // from class: z210
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ixi ixiVar3;
                            m410 m410Var = this.a;
                            ixi ixiVar4 = (ixi) m410Var.b;
                            boolean z2 = true;
                            if ((ixiVar4 == null || !ixiVar4.c.getBetPlaced()) && ((ixiVar3 = (ixi) m410Var.b) == null || !ixiVar3.b.getBetPlaced())) {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        }
                    }, new e(0, this, m410.class, "showActiveBetsToast", "showActiveBetsToast()V", 0)), new Function1() { // from class: a310
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            m410 m410Var = this.a;
                            CampaignTopicResponse campaignTopicResponse = (CampaignTopicResponse) obj;
                            try {
                                m410Var.d1 = campaignTopicResponse != null;
                                if (campaignTopicResponse != null && !Intrinsics.g(campaignTopicResponse.getMessageType(), "ACTIVITY_INIT") && campaignTopicResponse.getCampaignCompletedJustNow()) {
                                    m410Var.w1();
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            return Unit.a;
                        }
                    }, new b310(this, 0), null, 17408);
                    GameDetails gameDetails3 = this.r1;
                    if (gameDetails3 == null || (name = gameDetails3.getName()) == null) {
                        name = "";
                    }
                    ibs viewLifecycleOwner2 = getViewLifecycleOwner();
                    viewLifecycleOwner2.getClass();
                    ra6.c(name, viewLifecycleOwner2, (db6) q8i0Var.getValue(), O0());
                    O0().x1();
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                }
            } catch (Exception e3) {
                e = e3;
                th = null;
            }
            if (this.y0) {
                m1();
                SharedPreferences sharedPreferences3 = this.V;
                Boolean boolValueOf3 = sharedPreferences3 != null ? Boolean.valueOf(sharedPreferences3.getBoolean("PING_PONG_MUSIC", true)) : th;
                ixi ixiVar3 = (ixi) this.b;
                if (ixiVar3 != null) {
                    ProgressMeterComponent progressMeterComponent2 = ixiVar3.U;
                    ypa0 ypa0Var2 = this.v;
                    if (ypa0Var2 == null) {
                        Intrinsics.n("soundViewModel");
                        throw th;
                    }
                    String string3 = getString(R.string.bg_music);
                    string3.getClass();
                    progressMeterComponent2.K(ypa0Var2, boolValueOf3, string3);
                }
            }
            if (this.M0 && !this.y0) {
                ixi ixiVar4 = (ixi) this.b;
                if (ixiVar4 != null) {
                    ixiVar4.U.setVisibility(8);
                }
                ixi ixiVar5 = (ixi) this.b;
                if (ixiVar5 != null) {
                    ixiVar5.U.N();
                }
                this.l0 = false;
                this.M0 = false;
                this.y0 = true;
                D0();
                SharedPreferences sharedPreferences4 = this.V;
                Boolean boolValueOf4 = sharedPreferences4 != null ? Boolean.valueOf(sharedPreferences4.getBoolean("PING_PONG_SOUND", true)) : th;
                SharedPreferences sharedPreferences5 = this.V;
                Boolean boolValueOf5 = sharedPreferences5 != null ? Boolean.valueOf(sharedPreferences5.getBoolean("PING_PONG_MUSIC", true)) : th;
                Context context2 = getContext();
                if (context2 != null) {
                    ixi ixiVar6 = (ixi) this.b;
                    if (ixiVar6 != null) {
                        ProgressMeterComponent progressMeterComponent3 = ixiVar6.U;
                        fq5 fq5Var = (fq5) this.y.getValue();
                        String languageCode = SportyGamesManager.getInstance().getLanguageCode();
                        languageCode.getClass();
                        progressMeterComponent3.E(fq5Var, this.I0, this.F0, languageCode);
                    }
                    ixi ixiVar7 = (ixi) this.b;
                    if (ixiVar7 != null) {
                        ProgressMeterComponent progressMeterComponent4 = ixiVar7.U;
                        String string4 = getString(R.string.ping_pong_name);
                        string4.getClass();
                        rk60.b bVar2 = rk60.b.A;
                        GameDetails gameDetails4 = this.r1;
                        ypa0 ypa0Var3 = this.v;
                        if (ypa0Var3 == null) {
                            Intrinsics.n("soundViewModel");
                            throw th;
                        }
                        String string5 = getString(R.string.bg_music);
                        string5.getClass();
                        progressMeterComponent4.I("Ping Pong/", string4, boolValueOf4, bVar2, gameDetails4, context2, ypa0Var3, boolValueOf5, string5);
                    }
                }
            }
        }
        if (this.j0) {
            this.i0 = false;
            this.j0 = false;
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        if (!this.i0) {
            C1();
        }
        if (((ixi) this.b) != null) {
            ypa0 ypa0Var = this.v;
            if (ypa0Var == null) {
                Intrinsics.n("soundViewModel");
                throw null;
            }
            ypa0Var.I1();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        io80 binding;
        ty50 ty50Var;
        String name;
        io80 binding2;
        ssw<String> sswVar;
        ssw<Boolean> sswVar2;
        io80 binding3;
        i820 binding4;
        io80 binding5;
        ssw<Integer> liveData;
        v720 binding6;
        v720 binding7;
        ssw<String> sswVar3;
        ssw<String> sswVar4;
        ssw<String> sswVar5;
        ssw<String> sswVar6;
        ssw<String> sswVar7;
        io80 binding8;
        io80 binding9;
        view.getClass();
        super.onViewCreated(view, bundle);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            qlf.d(activity);
            qlf.c(window, activity.getColor(R.color.sb_black_100));
        }
        SportyGamesManager.getInstance().setScreenName("sportygames/ping-pong");
        this.Q0 = this.P0;
        int i2 = 1;
        if (Build.VERSION.SDK_INT <= 24) {
            ixi ixiVar = (ixi) this.b;
            if (ixiVar != null) {
                ixiVar.O.setLayerType(1, null);
            }
            ixi ixiVar2 = (ixi) this.b;
            if (ixiVar2 != null) {
                ixiVar2.K.setLayerType(1, null);
            }
        }
        r1();
        op5.a.getClass();
        String str = this.F0;
        op5.c = str;
        boolean zA1 = a1();
        B b2 = this.b;
        if (zA1) {
            ixi ixiVar3 = (ixi) b2;
            if (ixiVar3 != null && (binding9 = ixiVar3.L.getBinding()) != null) {
                binding9.z.setVisibility(4);
            }
            ixi ixiVar4 = (ixi) this.b;
            if (ixiVar4 != null && (binding8 = ixiVar4.L.getBinding()) != null) {
                binding8.y.setVisibility(4);
            }
            ixi ixiVar5 = (ixi) this.b;
            if (ixiVar5 != null) {
                ixiVar5.Y.setVisibility(4);
            }
        } else {
            ixi ixiVar6 = (ixi) b2;
            if (ixiVar6 != null && (binding = ixiVar6.L.getBinding()) != null) {
                gr60.a(binding.y, new i010());
            }
        }
        N0().b.f(getViewLifecycleOwner(), new l(new pk(this, 1)));
        Q0().b.f(getViewLifecycleOwner(), new l(new Function1() { // from class: i410
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                PromotionGiftsResponse promotionGiftsResponse;
                List<GiftItem> entityList;
                List<DetailResponse> gameDetailsResponseList;
                DetailResponse detailResponse;
                ixi ixiVar7;
                DetailResponse detailResponse2;
                ixi ixiVar8;
                ixi ixiVar9;
                ixi ixiVar10;
                ixi ixiVar11;
                ixi ixiVar12;
                ixi ixiVar13;
                e activity2;
                Context applicationContext;
                v720 binding10;
                v720 binding11;
                LoadingState loadingState = (LoadingState) obj;
                int i3 = m410.b.a[loadingState.getStatus().ordinal()];
                m410 m410Var = this.a;
                int i4 = 1;
                if (i3 == 1) {
                    m410Var.Z0 = true;
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    m410Var.w0 = hTTPResponse != null ? (PromotionGiftsResponse) hTTPResponse.getData() : null;
                    if (m410Var.M && (((ixiVar9 = (ixi) m410Var.b) == null || ixiVar9.Q.getVisibility() != 0) && (((ixiVar10 = (ixi) m410Var.b) == null || (binding11 = ixiVar10.b.getBinding()) == null || binding11.B.getVisibility() != 0) && (((ixiVar11 = (ixi) m410Var.b) == null || (binding10 = ixiVar11.c.getBinding()) == null || binding10.B.getVisibility() != 0) && (((ixiVar12 = (ixi) m410Var.b) == null || !ixiVar12.b.getBetPlacedV2()) && ((ixiVar13 = (ixi) m410Var.b) == null || !ixiVar13.c.getBetPlacedV2())))))) {
                        try {
                            new brr();
                            GameDetails gameDetails = m410Var.r1;
                            if (gameDetails != null) {
                                gameDetails.getDisplayName();
                            }
                            SharedPreferences sharedPreferences = m410Var.V;
                            if (sharedPreferences != null && !sharedPreferences.getBoolean("PING_PONG_ONE_TAP", false)) {
                                Context context = m410Var.getContext();
                                String string = (context == null || (applicationContext = context.getApplicationContext()) == null) ? null : applicationContext.getString(R.string.one_tap_choice_label);
                                if (string != null) {
                                    m410Var.F0();
                                    Context context2 = m410Var.getContext();
                                    if (context2 != null && (activity2 = m410Var.getActivity()) != null) {
                                        FragmentManager supportFragmentManager = activity2.getSupportFragmentManager();
                                        m410Var.s0 = supportFragmentManager;
                                        if (supportFragmentManager != null) {
                                            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                                            op5 op5Var = op5.a;
                                            String string2 = m410Var.getString(R.string.otb_dialog_msg_cms);
                                            string2.getClass();
                                            op5Var.getClass();
                                            String strB = op5.b(string2, string, null);
                                            String string3 = m410Var.getString(R.string.yes_btn_cms);
                                            string3.getClass();
                                            String string4 = m410Var.getString(R.string.yes_bet);
                                            string4.getClass();
                                            String strB2 = op5.b(string3, string4, null);
                                            String string5 = m410Var.getString(R.string.no_btn_cms);
                                            string5.getClass();
                                            String string6 = m410Var.getString(R.string.no_bet);
                                            string6.getClass();
                                            aVar.f(R.id.flContent, com.sportygames.pingpong.components.a.C0444a.a("Ping Pong", strB, "", strB2, op5.b(string5, string6, null), new cai(m410Var, i4), new n110(0), context2.getColor(R.color.redblack_confirm_dialog_left_button), context2.getColor(R.color.redblack_confirm_dialog_right_button)), null);
                                            aVar.c("");
                                            aVar.d();
                                        }
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    if (m410Var.w != null && (promotionGiftsResponse = m410Var.w0) != null && (entityList = promotionGiftsResponse.getEntityList()) != null) {
                        ArrayList<GiftItem> arrayList = (ArrayList) entityList;
                        m410Var.C0 = arrayList;
                        if (arrayList.size() > 0) {
                            m410Var.S0();
                            if (!m410Var.X0) {
                                m410Var.X0 = true;
                                ArrayList<GiftItem> arrayList2 = m410Var.C0;
                                arrayList2.getClass();
                                int size = arrayList2.size();
                                double curBal = 0.0d;
                                int i5 = 0;
                                while (i5 < size) {
                                    GiftItem giftItem = arrayList2.get(i5);
                                    i5++;
                                    curBal += giftItem.getCurBal();
                                }
                                ArrayList<GiftItem> arrayList3 = m410Var.C0;
                                op5 op5Var2 = op5.a;
                                String currency = arrayList3.get(0).getCurrency();
                                op5Var2.getClass();
                                String strI = op5.i(currency);
                                ixi ixiVar14 = (ixi) m410Var.b;
                                if (ixiVar14 != null) {
                                    GiftToast.setToastText$default(ixiVar14.J, strI, curBal, null, 4, null);
                                }
                                ixi ixiVar15 = (ixi) m410Var.b;
                                if (ixiVar15 != null) {
                                    ixiVar15.J.setClickable(true);
                                }
                                jbh.a.j(new FbgData(true, Double.valueOf(curBal), strI));
                                ixi ixiVar16 = (ixi) m410Var.b;
                                if (ixiVar16 != null) {
                                    ixiVar16.J.setVisibility(0);
                                }
                                ixi ixiVar17 = (ixi) m410Var.b;
                                if (ixiVar17 != null) {
                                    ixiVar17.J.startAnimation(AnimationUtils.loadAnimation(m410Var.getContext(), R.anim.fade_in_fade_out_toast));
                                }
                            }
                            ej5.c(ebs.a(m410Var.getLifecycle()), null, null, new r410(m410Var, null), 3);
                            m410Var.Y0 = true;
                        } else {
                            m410Var.Y0 = false;
                            ixi ixiVar18 = (ixi) m410Var.b;
                            if (ixiVar18 != null) {
                                ixiVar18.b.setFbgAvailable(false);
                            }
                            ixi ixiVar19 = (ixi) m410Var.b;
                            if (ixiVar19 != null) {
                                ixiVar19.c.setFbgAvailable(false);
                            }
                            DetailResponseData detailResponseData = m410Var.w;
                            if (detailResponseData != null) {
                                List<DetailResponse> gameDetailsResponseList2 = detailResponseData.getGameDetailsResponseList();
                                if (gameDetailsResponseList2 != null && (detailResponse2 = gameDetailsResponseList2.get(0)) != null && (ixiVar8 = (ixi) m410Var.b) != null) {
                                    ixiVar8.b.setBetModel(detailResponse2);
                                }
                                DetailResponseData detailResponseData2 = m410Var.w;
                                if (detailResponseData2 != null && (gameDetailsResponseList = detailResponseData2.getGameDetailsResponseList()) != null && (detailResponse = gameDetailsResponseList.get(1)) != null && (ixiVar7 = (ixi) m410Var.b) != null) {
                                    ixiVar7.c.setBetModel(detailResponse);
                                }
                            }
                        }
                        m410Var.M = false;
                    }
                } else if (i3 == 3) {
                    m410Var.Z0 = false;
                    m410Var.Y0 = false;
                }
                return Unit.a;
            }
        }));
        Q0().c.f(getViewLifecycleOwner(), new l(new Function1() { // from class: j410
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                v720 binding10;
                v720 binding11;
                List<DetailResponse> gameDetailsResponseList;
                DetailResponse detailResponse;
                ixi ixiVar7;
                DetailResponse detailResponse2;
                ixi ixiVar8;
                List<DetailResponse> gameDetailsResponseList2;
                DetailResponse detailResponse3;
                ixi ixiVar9;
                DetailResponse detailResponse4;
                ixi ixiVar10;
                LoadingState loadingState = (LoadingState) obj;
                int i3 = m410.b.a[loadingState.getStatus().ordinal()];
                m410 m410Var = this.a;
                if (i3 == 1) {
                    m410Var.Z0 = true;
                    ixi ixiVar11 = (ixi) m410Var.b;
                    if (ixiVar11 != null) {
                        ixiVar11.U.P();
                    }
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    PromotionGiftsResponse promotionGiftsResponse = hTTPResponse != null ? (PromotionGiftsResponse) hTTPResponse.getData() : null;
                    m410Var.w0 = promotionGiftsResponse;
                    List<GiftItem> entityList = promotionGiftsResponse != null ? promotionGiftsResponse.getEntityList() : null;
                    if (entityList == null || entityList.isEmpty()) {
                        ixi ixiVar12 = (ixi) m410Var.b;
                        if (ixiVar12 != null) {
                            ixiVar12.b.setFbgAvailable(false);
                        }
                        ixi ixiVar13 = (ixi) m410Var.b;
                        if (ixiVar13 != null) {
                            ixiVar13.c.setFbgAvailable(false);
                        }
                    } else {
                        ixi ixiVar14 = (ixi) m410Var.b;
                        if (ixiVar14 != null) {
                            ixiVar14.b.setFbgAvailable(true);
                        }
                        ixi ixiVar15 = (ixi) m410Var.b;
                        if (ixiVar15 != null) {
                            ixiVar15.c.setFbgAvailable(true);
                        }
                    }
                    DetailResponseData detailResponseData = m410Var.w;
                    if (detailResponseData != null) {
                        List<DetailResponse> gameDetailsResponseList3 = detailResponseData.getGameDetailsResponseList();
                        if (gameDetailsResponseList3 != null && (detailResponse2 = gameDetailsResponseList3.get(0)) != null && (ixiVar8 = (ixi) m410Var.b) != null) {
                            ixiVar8.b.setBetModel(detailResponse2);
                        }
                        DetailResponseData detailResponseData2 = m410Var.w;
                        if (detailResponseData2 != null && (gameDetailsResponseList = detailResponseData2.getGameDetailsResponseList()) != null && (detailResponse = gameDetailsResponseList.get(1)) != null && (ixiVar7 = (ixi) m410Var.b) != null) {
                            ixiVar7.c.setBetModel(detailResponse);
                        }
                    }
                    PromotionGiftsResponse promotionGiftsResponse2 = m410Var.w0;
                    List<GiftItem> entityList2 = promotionGiftsResponse2 != null ? promotionGiftsResponse2.getEntityList() : null;
                    if (entityList2 == null || entityList2.isEmpty()) {
                        m410Var.Y0 = false;
                        ixi ixiVar16 = (ixi) m410Var.b;
                        if (ixiVar16 != null && (binding11 = ixiVar16.b.getBinding()) != null) {
                            binding11.G.setAlpha(1.0f);
                        }
                        ixi ixiVar17 = (ixi) m410Var.b;
                        if (ixiVar17 != null && (binding10 = ixiVar17.c.getBinding()) != null) {
                            binding10.G.setAlpha(1.0f);
                        }
                    } else {
                        m410Var.Y0 = true;
                        m410Var.S0();
                    }
                } else if (i3 == 3) {
                    ixi ixiVar18 = (ixi) m410Var.b;
                    if (ixiVar18 != null) {
                        ixiVar18.U.P();
                    }
                    m410Var.Y0 = false;
                    ixi ixiVar19 = (ixi) m410Var.b;
                    if (ixiVar19 != null) {
                        ixiVar19.b.setFbgAvailable(false);
                    }
                    ixi ixiVar20 = (ixi) m410Var.b;
                    if (ixiVar20 != null) {
                        ixiVar20.c.setFbgAvailable(false);
                    }
                    DetailResponseData detailResponseData3 = m410Var.w;
                    if (detailResponseData3 != null) {
                        List<DetailResponse> gameDetailsResponseList4 = detailResponseData3.getGameDetailsResponseList();
                        if (gameDetailsResponseList4 != null && (detailResponse4 = gameDetailsResponseList4.get(0)) != null && (ixiVar10 = (ixi) m410Var.b) != null) {
                            ixiVar10.b.setBetModel(detailResponse4);
                        }
                        DetailResponseData detailResponseData4 = m410Var.w;
                        if (detailResponseData4 != null && (gameDetailsResponseList2 = detailResponseData4.getGameDetailsResponseList()) != null && (detailResponse3 = gameDetailsResponseList2.get(1)) != null && (ixiVar9 = (ixi) m410Var.b) != null) {
                            ixiVar9.c.setBetModel(detailResponse3);
                        }
                    }
                }
                return Unit.a;
            }
        }));
        if (getContext() != null) {
            ixi ixiVar7 = (ixi) this.b;
            this.s1 = new ImageView[]{ixiVar7 != null ? ixiVar7.A : null, ixiVar7 != null ? ixiVar7.B : null, ixiVar7 != null ? ixiVar7.C : null, ixiVar7 != null ? ixiVar7.D : null, ixiVar7 != null ? ixiVar7.E : null, ixiVar7 != null ? ixiVar7.F : null, ixiVar7 != null ? ixiVar7.G : null, ixiVar7 != null ? ixiVar7.H : null};
        }
        NetworkStateManager.INSTANCE.observeNetworkState().f(getViewLifecycleOwner(), new l(new Function1() { // from class: z010
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                m410 m410Var = this.a;
                int i3 = 0;
                if (!zBooleanValue) {
                    m410Var.D1();
                    m410Var.t0 = false;
                    m410Var.r0 = true;
                    goa0 goa0Var = (goa0) m410Var.a;
                    if (goa0Var != null) {
                        goa0Var.B.clear();
                        goa0Var.C.clear();
                    }
                    Context context = m410Var.getContext();
                    if (context != null) {
                        vs80 vs80Var = vs80.b;
                        ResultWrapper.GenericError genericError = new ResultWrapper.GenericError(-11, null);
                        v010 v010Var = new v010(m410Var, i3);
                        w010 w010Var = new w010();
                        g7i g7iVar = new g7i(m410Var, 1);
                        context.getColor(R.color.sh_error_btn_color);
                        vs80Var.c(context, genericError, v010Var, w010Var, g7iVar, 0, (640 & 128) != 0 ? new mm60() : null, (640 & 512) != 0 ? new xvj(2) : null);
                    }
                }
                if (bool.booleanValue() && m410Var.r0) {
                    m410Var.t0 = false;
                    km60 km60Var = vs80.b.a;
                    if (km60Var != null) {
                        km60Var.dismiss();
                    }
                    m410Var.z0();
                    m410Var.m1();
                    SharedPreferences sharedPreferences = m410Var.V;
                    Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("PING_PONG_MUSIC", true)) : null;
                    ixi ixiVar8 = (ixi) m410Var.b;
                    if (ixiVar8 != null) {
                        ProgressMeterComponent progressMeterComponent = ixiVar8.U;
                        ypa0 ypa0Var = m410Var.v;
                        if (ypa0Var == null) {
                            Intrinsics.n("soundViewModel");
                            throw null;
                        }
                        String string = m410Var.getString(R.string.bg_music);
                        string.getClass();
                        progressMeterComponent.K(ypa0Var, boolValueOf, string);
                    }
                    pfd pfdVar = fse.a;
                    ej5.c(w5b.a(gku.a), null, null, m410Var.new g(null), 3);
                }
                return Unit.a;
            }
        }));
        ixi ixiVar8 = (ixi) this.b;
        if (ixiVar8 != null) {
            ComposeView composeView = ixiVar8.y;
            composeView.setViewCompositionStrategy(u6i0.c.a);
            composeView.setContent(new op8(-1657807199, new d210(this), true));
        }
        androidx.fragment.app.e activity2 = getActivity();
        if (activity2 != null) {
            y720 y720VarN0 = N0();
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            ty50Var = new ty50(activity2);
            ty50Var.a = activity2;
            ty50Var.b = y720VarN0;
            ty50Var.c = viewLifecycleOwner;
            ty50Var.v = new ArrayList();
            ty50Var.setCancelable(true);
        } else {
            ty50Var = null;
        }
        this.P = ty50Var;
        if (ty50Var != null) {
            ty50Var.setCanceledOnTouchOutside(true);
        }
        ty50 ty50Var2 = this.P;
        if (ty50Var2 != null) {
            ty50Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l210
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    i820 binding10;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate;
                    ViewPropertyAnimator viewPropertyAnimatorRotation;
                    ixi ixiVar9 = (ixi) this.a.b;
                    if (ixiVar9 == null || (binding10 = ixiVar9.T.getBinding()) == null || (viewPropertyAnimatorAnimate = binding10.b.animate()) == null || (viewPropertyAnimatorRotation = viewPropertyAnimatorAnimate.rotation(180.0f)) == null) {
                        return;
                    }
                    viewPropertyAnimatorRotation.start();
                }
            });
        }
        androidx.fragment.app.e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        v8i0 viewModelStore = eVarRequireActivity.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = eVarRequireActivity.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, sd7.a(eVarRequireActivity, viewModelStore, defaultViewModelProviderFactory));
        dq7 dq7VarA = jq40.a(ypa0.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.v = (ypa0) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        SportyGamesManager.getInstance().addAccountUpdatedListener(this);
        jn1 jn1VarL0 = L0();
        GameDetails gameDetails = this.r1;
        if (gameDetails == null || (name = gameDetails.getName()) == null) {
            name = "";
        }
        ej5.c(o8i0.d(jn1VarL0), null, null, new zm1(jn1VarL0, name, null), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new y410(this, null), 3);
        goa0 goa0Var = (goa0) this.a;
        if (goa0Var != null && (sswVar7 = goa0Var.c) != null) {
            sswVar7.f(getViewLifecycleOwner(), new l(new j9(this, i2)));
        }
        goa0 goa0Var2 = (goa0) this.a;
        if (goa0Var2 != null && (sswVar6 = goa0Var2.v) != null) {
            sswVar6.f(getViewLifecycleOwner(), new l(new Function1() { // from class: q010
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str2 = (String) obj;
                    if (str2 == null || str2.length() == 0) {
                        return Unit.a;
                    }
                    this.a.J = ((RoundInfoResponse) q97.a(RoundInfoResponse.class, str2)).getRoundId();
                    return Unit.a;
                }
            }));
        }
        goa0 goa0Var3 = (goa0) this.a;
        if (goa0Var3 != null && (sswVar5 = goa0Var3.i) != null) {
            sswVar5.f(getViewLifecycleOwner(), new l(new Function1() { // from class: f410
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    eal ealVar = new eal();
                    String strA = y54.a(Base64.decode((String) obj, 0));
                    if (strA == null || strA.length() == 0) {
                        return Unit.a;
                    }
                    Object objE = ealVar.e(strA, RoundBetResponse.class);
                    objE.getClass();
                    RoundBetResponse roundBetResponse = (RoundBetResponse) objE;
                    ixi ixiVar9 = (ixi) this.a.b;
                    if (ixiVar9 != null) {
                        ixiVar9.V.setBets(roundBetResponse);
                    }
                    return Unit.a;
                }
            }));
        }
        int i3 = 0;
        L0().i.f(getViewLifecycleOwner(), new l(new y010(this, i3)));
        L0().f.f(getViewLifecycleOwner(), new l(new tq4(this, i2)));
        L0().e.f(getViewLifecycleOwner(), new l(new p4s(this, i2)));
        L0().v.f(getViewLifecycleOwner(), new l(new Function1() { // from class: c310
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List<TopBets> list;
                ixi ixiVar9;
                LoadingState loadingState = (LoadingState) obj;
                int i4 = m410.b.a[loadingState.getStatus().ordinal()];
                m410 m410Var = this.a;
                if (i4 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (list = (List) hTTPResponse.getData()) != null) {
                        ixi ixiVar10 = (ixi) m410Var.b;
                        if (ixiVar10 != null) {
                            ixiVar10.U.P();
                        }
                        ArrayList arrayList = new ArrayList();
                        for (TopBets topBets : list) {
                            MultiplierResponse multiplierResponse = m410Var.U;
                            if (multiplierResponse == null) {
                                m410Var.o0.add(topBets);
                            } else if (multiplierResponse.getRoundId() == topBets.getRoundId()) {
                                arrayList.add(topBets);
                            } else {
                                long roundId = topBets.getRoundId();
                                MultiplierResponse multiplierResponse2 = m410Var.U;
                                if (multiplierResponse2 == null) {
                                    Intrinsics.n("multiplierResponse");
                                    throw null;
                                }
                                if (roundId > multiplierResponse2.getRoundId()) {
                                    m410Var.n0.add(topBets);
                                }
                            }
                        }
                        if (!arrayList.isEmpty() && (ixiVar9 = (ixi) m410Var.b) != null) {
                            ixiVar9.V.setBets(new RoundBetResponse(((TopBets) arrayList.get(0)).getRoundId(), ((HTTPResponse) loadingState.getData()).getTotal(), y8h0.b(arrayList), "", 0L, null));
                        }
                    }
                } else if (i4 != 2) {
                    if (i4 != 3) {
                        uhc.a();
                        return null;
                    }
                    ixi ixiVar11 = (ixi) m410Var.b;
                    if (ixiVar11 != null) {
                        ixiVar11.U.P();
                    }
                }
                return Unit.a;
            }
        }));
        L0().c.f(getViewLifecycleOwner(), new l(new Function1() { // from class: g410
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String chatRoomId;
                ixi ixiVar9;
                io80 binding10;
                ChatRoomResponse chatRoomResponse;
                String botUserId;
                ChatRoomResponse chatRoomResponse2;
                ixi ixiVar10;
                LoadingState loadingState = (LoadingState) obj;
                int i4 = m410.b.a[loadingState.getStatus().ordinal()];
                m410 m410Var = this.a;
                if (i4 == 1) {
                    ixi ixiVar11 = (ixi) m410Var.b;
                    if (ixiVar11 != null) {
                        ixiVar11.U.P();
                    }
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    String str2 = "";
                    if (hTTPResponse == null || (chatRoomResponse2 = (ChatRoomResponse) hTTPResponse.getData()) == null || (chatRoomId = chatRoomResponse2.getChatRoomId()) == null) {
                        chatRoomId = "";
                    }
                    m410Var.B = chatRoomId;
                    HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse2 != null && (chatRoomResponse = (ChatRoomResponse) hTTPResponse2.getData()) != null && (botUserId = chatRoomResponse.getBotUserId()) != null) {
                        str2 = botUserId;
                    }
                    m410Var.C = str2;
                    if (m410Var.B.length() > 0 && (ixiVar9 = (ixi) m410Var.b) != null && (binding10 = ixiVar9.L.getBinding()) != null) {
                        binding10.d.setVisibility(0);
                    }
                    FragmentManager parentFragmentManager = m410Var.getParentFragmentManager();
                    parentFragmentManager.getClass();
                    Fragment fragmentH = parentFragmentManager.H("Chat");
                    if (fragmentH != null) {
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
                        aVar.p(fragmentH);
                        aVar.d();
                    }
                } else if (i4 == 3 && (ixiVar10 = (ixi) m410Var.b) != null) {
                    ixiVar10.U.P();
                }
                return Unit.a;
            }
        }));
        L0().y.f(getViewLifecycleOwner(), new l(new tgi(this, 1)));
        goa0 goa0Var4 = (goa0) this.a;
        int i4 = 2;
        if (goa0Var4 != null && (sswVar4 = goa0Var4.e) != null) {
            sswVar4.f(getViewLifecycleOwner(), new l(new mgi(this, i4)));
        }
        L0().b.f(getViewLifecycleOwner(), new l(new rq4(this, i4)));
        goa0 goa0Var5 = (goa0) this.a;
        if (goa0Var5 != null && (sswVar3 = goa0Var5.f) != null) {
            sswVar3.f(getViewLifecycleOwner(), new l(new t6i(this, i2)));
        }
        hic.a.getClass();
        hic.l.f(getViewLifecycleOwner(), new l(new Function1() { // from class: j010
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ssw<String> sswVar8;
                goa0 goa0Var6;
                ssw<String> sswVar9;
                String str2 = (String) obj;
                str2.getClass();
                if (str2.length() == 0) {
                    return Unit.a;
                }
                boolean zM = StringsKt.M(str2, "user-name:", false);
                m410 m410Var = this.a;
                if (!zM) {
                    goa0 goa0Var7 = (goa0) m410Var.a;
                    if (goa0Var7 != null) {
                        goa0Var7.y = false;
                    }
                    if (goa0Var7 != null && (sswVar8 = goa0Var7.z) != null) {
                        sswVar8.j(str2);
                    }
                } else if (hic.a.d() && (goa0Var6 = (goa0) m410Var.a) != null && (sswVar9 = goa0Var6.z) != null) {
                    sswVar9.j(str2);
                }
                return Unit.a;
            }
        }));
        tb5 tb5VarB = d77.b(2, 6, null);
        nas nasVarA = ebs.a(getLifecycle());
        pfd pfdVar = fse.a;
        ej5.c(nasVarA, gku.a, null, new k(tb5VarB, null), 2);
        this.q0 = tb5VarB;
        this.M = true;
        androidx.fragment.app.e activity3 = getActivity();
        if (activity3 != null) {
            ixi ixiVar9 = (ixi) this.b;
            if (ixiVar9 != null && (binding7 = ixiVar9.b.getBinding()) != null) {
                binding7.d.setOnOffColor(activity3);
            }
            ixi ixiVar10 = (ixi) this.b;
            if (ixiVar10 != null && (binding6 = ixiVar10.c.getBinding()) != null) {
                binding6.d.setOnOffColor(activity3);
            }
        }
        try {
            androidx.fragment.app.e activity4 = getActivity();
            if (activity4 != null) {
                String str2 = ((db6) this.f1.getValue()).c;
                if (str2 == null) {
                    str2 = "Ongoing";
                }
                this.c1 = new z66(activity4, str2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.g0 = true;
        Context context = getContext();
        if (context != null) {
            this.V = un20.a(context);
        }
        SharedPreferences sharedPreferences = this.V;
        this.W = sharedPreferences != null ? sharedPreferences.edit() : null;
        this.m0 = new f();
        ixi ixiVar11 = (ixi) this.b;
        if (ixiVar11 != null) {
            ixiVar11.U.setVisibility(0);
        }
        ixi ixiVar12 = (ixi) this.b;
        if (ixiVar12 != null) {
            ixiVar12.U.setProgressForApi(11);
        }
        ixi ixiVar13 = (ixi) this.b;
        if (ixiVar13 != null) {
            ixiVar13.U.setCurrentProgress(1);
        }
        ixi ixiVar14 = (ixi) this.b;
        if (ixiVar14 != null && (liveData = ixiVar14.U.getLiveData()) != null) {
            liveData.f(getViewLifecycleOwner(), new lfy() { // from class: u010
                @Override // defpackage.lfy
                public final void u1(Object obj) {
                    Integer num = (Integer) obj;
                    if (num != null && num.intValue() == 100) {
                        pfd pfdVar2 = fse.a;
                        ej5.c(w5b.a(gku.a), null, null, new i510(this.a, null), 3);
                    }
                }
            });
        }
        androidx.fragment.app.e activity5 = getActivity();
        if (activity5 != null) {
            if (this.v == null) {
                Intrinsics.n("soundViewModel");
                throw null;
            }
            this.c0 = new xbg(activity5, "Ping Pong");
        }
        ixi ixiVar15 = (ixi) this.b;
        q8i0 q8i0Var = this.y;
        if (ixiVar15 != null) {
            ixiVar15.U.E((fq5) q8i0Var.getValue(), this.I0, str, this.i1);
        }
        V0();
        boolean zA2 = a1();
        B b3 = this.b;
        if (zA2) {
            ixi ixiVar16 = (ixi) b3;
            if (ixiVar16 != null && (binding5 = ixiVar16.L.getBinding()) != null) {
                binding5.z.setVisibility(4);
            }
        } else {
            ixi ixiVar17 = (ixi) b3;
            if (ixiVar17 != null && (binding2 = ixiVar17.L.getBinding()) != null) {
                binding2.z.setVisibility(0);
            }
        }
        ixi ixiVar18 = (ixi) this.b;
        if (ixiVar18 != null) {
            ixiVar18.b.setOnBetChipSelectedListener(new Function1() { // from class: s210
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ixi ixiVar19;
                    ixi ixiVar20;
                    ixi ixiVar21;
                    v720 binding10;
                    int iIntValue = ((Integer) obj).intValue();
                    m410 m410Var = this.a;
                    if (m410Var.Y0 && iIntValue == 0) {
                        ixi ixiVar22 = (ixi) m410Var.b;
                        if (!Intrinsics.e((ixiVar22 == null || (binding10 = ixiVar22.b.getBinding()) == null) ? null : Float.valueOf(binding10.G.getAlpha()), 1.0f)) {
                            return Unit.a;
                        }
                    }
                    ixi ixiVar23 = (ixi) m410Var.b;
                    if (ixiVar23 == null || ixiVar23.b.getFbgRoundId() != 0 || (((ixiVar19 = (ixi) m410Var.b) != null && ixiVar19.b.getBetPlaced()) || (((ixiVar20 = (ixi) m410Var.b) != null && ixiVar20.b.getBetPlacedV2()) || ((ixiVar21 = (ixi) m410Var.b) != null && ixiVar21.b.getAutoBetPlace())))) {
                        return Unit.a;
                    }
                    ixi ixiVar24 = (ixi) m410Var.b;
                    if (ixiVar24 != null) {
                        ixiVar24.b.a();
                    }
                    ixi ixiVar25 = (ixi) m410Var.b;
                    if (ixiVar25 != null) {
                        ixiVar25.c.a();
                    }
                    ixi ixiVar26 = (ixi) m410Var.b;
                    if (ixiVar26 != null) {
                        ixiVar26.b.e(iIntValue);
                    }
                    return Unit.a;
                }
            });
        }
        ixi ixiVar19 = (ixi) this.b;
        if (ixiVar19 != null) {
            ixiVar19.c.setOnBetChipSelectedListener(new Function1() { // from class: t210
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ixi ixiVar20;
                    ixi ixiVar21;
                    ixi ixiVar22;
                    v720 binding10;
                    int iIntValue = ((Integer) obj).intValue();
                    m410 m410Var = this.a;
                    if (m410Var.Y0 && iIntValue == 0) {
                        ixi ixiVar23 = (ixi) m410Var.b;
                        if (!Intrinsics.e((ixiVar23 == null || (binding10 = ixiVar23.c.getBinding()) == null) ? null : Float.valueOf(binding10.G.getAlpha()), 1.0f)) {
                            return Unit.a;
                        }
                    }
                    ixi ixiVar24 = (ixi) m410Var.b;
                    if (ixiVar24 == null || ixiVar24.c.getFbgRoundId() != 0 || (((ixiVar20 = (ixi) m410Var.b) != null && ixiVar20.c.getBetPlaced()) || (((ixiVar21 = (ixi) m410Var.b) != null && ixiVar21.c.getBetPlacedV2()) || ((ixiVar22 = (ixi) m410Var.b) != null && ixiVar22.c.getAutoBetPlace())))) {
                        return Unit.a;
                    }
                    ixi ixiVar25 = (ixi) m410Var.b;
                    if (ixiVar25 != null) {
                        ixiVar25.b.a();
                    }
                    ixi ixiVar26 = (ixi) m410Var.b;
                    if (ixiVar26 != null) {
                        ixiVar26.c.a();
                    }
                    ixi ixiVar27 = (ixi) m410Var.b;
                    if (ixiVar27 != null) {
                        ixiVar27.c.e(iIntValue);
                    }
                    return Unit.a;
                }
            });
        }
        ixi ixiVar20 = (ixi) this.b;
        if (ixiVar20 != null) {
            ixiVar20.b.setFbgClickListener(new Function1() { // from class: u210
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    m410 m410Var = this.a;
                    if (!m410Var.X0 || m410Var.W0) {
                        return Unit.a;
                    }
                    if (!m410Var.Y0() && m410Var.x0 == null) {
                        if (zBooleanValue) {
                            m410Var.W0 = true;
                            m410Var.h1(0);
                        }
                        return Unit.a;
                    }
                    m410Var.W0 = false;
                    op5 op5Var = op5.a;
                    String string = m410Var.getString(R.string.fbg_one_gift_usage_allowed_msg_cms);
                    string.getClass();
                    String string2 = m410Var.getString(R.string.one_gift_allowed);
                    string2.getClass();
                    op5Var.getClass();
                    String strB = op5.b(string, string2, null);
                    ixi ixiVar21 = (ixi) m410Var.b;
                    if (ixiVar21 != null) {
                        ixiVar21.X.k(ebs.a(m410Var.getLifecycle()), strB, 1800L);
                    }
                    return Unit.a;
                }
            });
        }
        ixi ixiVar21 = (ixi) this.b;
        if (ixiVar21 != null) {
            ixiVar21.c.setFbgClickListener(new Function1() { // from class: v210
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    m410 m410Var = this.a;
                    if (!m410Var.X0 || m410Var.W0) {
                        return Unit.a;
                    }
                    if (!m410Var.Y0() && m410Var.x0 == null) {
                        if (zBooleanValue) {
                            m410Var.W0 = true;
                            m410Var.h1(1);
                        }
                        return Unit.a;
                    }
                    m410Var.W0 = false;
                    op5 op5Var = op5.a;
                    String string = m410Var.getString(R.string.fbg_one_gift_usage_allowed_msg_cms);
                    string.getClass();
                    String string2 = m410Var.getString(R.string.one_gift_allowed);
                    string2.getClass();
                    op5Var.getClass();
                    String strB = op5.b(string, string2, null);
                    ixi ixiVar22 = (ixi) m410Var.b;
                    if (ixiVar22 != null) {
                        ixiVar22.X.k(ebs.a(m410Var.getLifecycle()), strB, 1800L);
                    }
                    return Unit.a;
                }
            });
        }
        ixi ixiVar22 = (ixi) this.b;
        if (ixiVar22 != null && (binding4 = ixiVar22.T.getBinding()) != null) {
            binding4.c.setOnClickListener(new View.OnClickListener() { // from class: w210
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    i820 binding10;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate;
                    ViewPropertyAnimator viewPropertyAnimatorRotation;
                    m410 m410Var = this.a;
                    if (m410Var.isAdded()) {
                        e activity6 = m410Var.getActivity();
                        if (activity6 == null || !activity6.isFinishing()) {
                            e activity7 = m410Var.getActivity();
                            if (activity7 == null || !activity7.isDestroyed()) {
                                ixi ixiVar23 = (ixi) m410Var.b;
                                if (ixiVar23 != null && (binding10 = ixiVar23.T.getBinding()) != null && (viewPropertyAnimatorAnimate = binding10.b.animate()) != null && (viewPropertyAnimatorRotation = viewPropertyAnimatorAnimate.rotation(0.0f)) != null) {
                                    viewPropertyAnimatorRotation.start();
                                }
                                ty50 ty50Var3 = m410Var.P;
                                if (ty50Var3 != null) {
                                    e eVar = ty50Var3.a;
                                    if (!eVar.isFinishing() && !eVar.isDestroyed()) {
                                        try {
                                            Window window2 = ty50Var3.getWindow();
                                            WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
                                            if (attributes != null) {
                                                attributes.flags &= -5;
                                            }
                                            Window window3 = ty50Var3.getWindow();
                                            if (window3 != null) {
                                                window3.setAttributes(attributes);
                                            }
                                            Window window4 = ty50Var3.getWindow();
                                            if (window4 != null) {
                                                window4.setBackgroundDrawableResource(R.color.trans_black_45);
                                            }
                                            ty50Var3.show();
                                            Window window5 = ty50Var3.getWindow();
                                            if (window5 != null) {
                                                window5.setLayout(-1, -1);
                                            }
                                        } catch (Exception unused) {
                                        }
                                    }
                                }
                                GameDetails gameDetails2 = m410Var.r1;
                                wz.a("RoundHistoryClicked", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
                            }
                        }
                    }
                }
            });
        }
        ixi ixiVar23 = (ixi) this.b;
        if (ixiVar23 != null) {
            ixiVar23.L.setNavigationListener(new x210(this, 0));
        }
        ixi ixiVar24 = (ixi) this.b;
        if (ixiVar24 != null && (binding3 = ixiVar24.L.getBinding()) != null) {
            binding3.d.setOnClickListener(new View.OnClickListener() { // from class: b210
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    m410 m410Var = this.a;
                    try {
                        if (!m410Var.a1()) {
                            m410Var.g1();
                        } else {
                            m410Var.z0 = m410.a.b;
                            m410Var.i1();
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
        ixi ixiVar25 = (ixi) this.b;
        if (ixiVar25 != null) {
            ixiVar25.b.setAutoCashoutAmount(new j210(this, i3));
        }
        ixi ixiVar26 = (ixi) this.b;
        if (ixiVar26 != null) {
            ixiVar26.b.setbetAmount(new Function0() { // from class: q210
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    v720 binding10;
                    v720 binding11;
                    v720 binding12;
                    ixi ixiVar27;
                    v720 binding13;
                    List<DetailResponse> gameDetailsResponseList;
                    DetailResponse detailResponse;
                    v720 binding14;
                    CharSequence text;
                    v720 binding15;
                    CharSequence text2;
                    ixi ixiVar28;
                    v720 binding16;
                    v720 binding17;
                    CharSequence text3;
                    ixi ixiVar29;
                    v720 binding18;
                    m410 m410Var = this.a;
                    ixi ixiVar30 = (ixi) m410Var.b;
                    if (ixiVar30 != null && ixiVar30.M.getVisibility() == 0) {
                        ixi ixiVar31 = (ixi) m410Var.b;
                        if (ixiVar31 != null && (binding17 = ixiVar31.c.getBinding()) != null && (text3 = binding17.z.getText()) != null && text3.equals("0") && (ixiVar29 = (ixi) m410Var.b) != null && (binding18 = ixiVar29.c.getBinding()) != null) {
                            binding18.z.setText("1.01");
                        }
                        ixi ixiVar32 = (ixi) m410Var.b;
                        if (ixiVar32 != null && (binding15 = ixiVar32.b.getBinding()) != null && (text2 = binding15.z.getText()) != null && text2.equals("0") && (ixiVar28 = (ixi) m410Var.b) != null && (binding16 = ixiVar28.b.getBinding()) != null) {
                            binding16.z.setText("1.01");
                        }
                        ixi ixiVar33 = (ixi) m410Var.b;
                        if (ixiVar33 != null) {
                            ixiVar33.c.setBetDone();
                        }
                        ixi ixiVar34 = (ixi) m410Var.b;
                        Double dValueOf = null;
                        if (c.l((ixiVar34 == null || (binding14 = ixiVar34.c.getBinding()) == null || (text = binding14.b.getText()) == null) ? null : text.toString(), "0", false) && (ixiVar27 = (ixi) m410Var.b) != null && (binding13 = ixiVar27.c.getBinding()) != null) {
                            TextView textView = binding13.b;
                            DetailResponseData detailResponseData = m410Var.w;
                            if (detailResponseData != null && (gameDetailsResponseList = detailResponseData.getGameDetailsResponseList()) != null && (detailResponse = gameDetailsResponseList.get(1)) != null) {
                                dValueOf = Double.valueOf(detailResponse.getMinAmount());
                            }
                            textView.setText(String.valueOf(dValueOf));
                        }
                        ixi ixiVar35 = (ixi) m410Var.b;
                        if (ixiVar35 != null && (binding12 = ixiVar35.c.getBinding()) != null) {
                            binding12.i.setEnabled(false);
                        }
                        ixi ixiVar36 = (ixi) m410Var.b;
                        if (ixiVar36 != null && (binding11 = ixiVar36.c.getBinding()) != null) {
                            binding11.A.setEnabled(false);
                        }
                        ixi ixiVar37 = (ixi) m410Var.b;
                        if (ixiVar37 != null && (binding10 = ixiVar37.b.getBinding()) != null) {
                            binding10.A.setEnabled(false);
                        }
                    }
                    m410Var.R0 = m410Var.S0;
                    m410Var.q1(false);
                    ixi ixiVar38 = (ixi) m410Var.b;
                    if (ixiVar38 != null) {
                        ixiVar38.M.setVisibility(0);
                    }
                    return Unit.a;
                }
            });
        }
        ixi ixiVar27 = (ixi) this.b;
        if (ixiVar27 != null) {
            ixiVar27.c.setAutoCashoutAmount(new sdi(this, i2));
        }
        ixi ixiVar28 = (ixi) this.b;
        if (ixiVar28 != null) {
            ixiVar28.c.setbetAmount(new to4(this, i4));
        }
        ixi ixiVar29 = (ixi) this.b;
        if (ixiVar29 != null) {
            ixiVar29.c.setautoBetListener(new Function1() { // from class: l310
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ixi ixiVar30;
                    v720 binding10;
                    j820 binding11;
                    v720 binding12;
                    v720 binding13;
                    v720 binding14;
                    v720 binding15;
                    v720 binding16;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    m410 m410Var = this.a;
                    m410Var.H = zBooleanValue;
                    m410Var.G = 0;
                    m410Var.U0();
                    wz.a("AutoBet", "Ping Pong", "2", m410Var.H ? "On" : "Off");
                    ixi ixiVar31 = (ixi) m410Var.b;
                    if (ixiVar31 != null && (binding12 = ixiVar31.c.getBinding()) != null && binding12.Y.getVisibility() == 0) {
                        ixi ixiVar32 = (ixi) m410Var.b;
                        if (ixiVar32 != null && (binding16 = ixiVar32.c.getBinding()) != null) {
                            binding16.Y.setVisibility(8);
                        }
                        ixi ixiVar33 = (ixi) m410Var.b;
                        if (ixiVar33 != null && (binding15 = ixiVar33.c.getBinding()) != null) {
                            binding15.D.setVisibility(8);
                        }
                        ixi ixiVar34 = (ixi) m410Var.b;
                        if (ixiVar34 != null && (binding14 = ixiVar34.c.getBinding()) != null) {
                            binding14.a0.setVisibility(8);
                        }
                        ixi ixiVar35 = (ixi) m410Var.b;
                        if (ixiVar35 != null && (binding13 = ixiVar35.c.getBinding()) != null) {
                            binding13.q0.setVisibility(0);
                        }
                        m410Var.O = false;
                    }
                    if (!m410Var.H && (ixiVar30 = (ixi) m410Var.b) != null && (binding10 = ixiVar30.c.getBinding()) != null && (binding11 = binding10.d.getBinding()) != null) {
                        binding11.d.setText("");
                    }
                    return Unit.a;
                }
            }, new Function1() { // from class: t310
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    v720 binding10;
                    ((Boolean) obj).getClass();
                    m410 m410Var = this.a;
                    ((x5a0) m410Var.m1).setValue(Boolean.TRUE);
                    ixi ixiVar30 = (ixi) m410Var.b;
                    if (ixiVar30 != null && (binding10 = ixiVar30.c.getBinding()) != null) {
                        binding10.d.setStatus(false);
                    }
                    return Unit.a;
                }
            }, new Function0() { // from class: d410
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(this.a.a1());
                }
            }, new Function0() { // from class: l410
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    this.a.i1();
                    return Unit.a;
                }
            });
        }
        ixi ixiVar30 = (ixi) this.b;
        if (ixiVar30 != null) {
            ixiVar30.b.setautoBetListener(new r010(this, i3), new axr(this, i2), new gen(this, 1), new uk4(this, 1));
        }
        ixi ixiVar31 = (ixi) this.b;
        if (ixiVar31 != null) {
            ixiVar31.L.setBackListener(new ykw(this, 1));
        }
        ixi ixiVar32 = (ixi) this.b;
        if (ixiVar32 != null) {
            ixiVar32.b.setFBGRemoveListener(new dzr(this, 1));
        }
        ixi ixiVar33 = (ixi) this.b;
        if (ixiVar33 != null) {
            ixiVar33.c.setFBGRemoveListener(new y110(this, 0));
        }
        ixi ixiVar34 = (ixi) this.b;
        if (ixiVar34 != null) {
            ixiVar34.b.setBetListener(new Function1() { // from class: z110
                /* JADX WARN: Code duplicated, block: B:101:0x0171  */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ixi ixiVar35;
                    Double dValueOf;
                    List<DetailResponse> gameDetailsResponseList;
                    PlaceBetRequest placeBetRequest;
                    List<DetailResponse> gameDetailsResponseList2;
                    DetailResponse detailResponse;
                    List<DetailResponse> gameDetailsResponseList3;
                    DetailResponse detailResponse2;
                    DetailResponseData detailResponseData;
                    List<DetailResponse> gameDetailsResponseList4;
                    DetailResponse detailResponse3;
                    List<DetailResponse> gameDetailsResponseList5;
                    DetailResponse detailResponse4;
                    GiftItem giftItem;
                    v720 binding10;
                    CharSequence text;
                    String string;
                    v720 binding11;
                    v720 binding12;
                    v720 binding13;
                    v720 binding14;
                    v720 binding15;
                    v720 binding16;
                    v720 binding17;
                    String str3 = (String) obj;
                    str3.getClass();
                    final m410 m410Var = this.a;
                    SharedPreferences sharedPreferences2 = m410Var.V;
                    if (sharedPreferences2 == null || sharedPreferences2.getBoolean("PING_PONG_ONE_TAP", false)) {
                        ixi ixiVar36 = (ixi) m410Var.b;
                        if (ixiVar36 != null && !ixiVar36.b.getBetPlaced() && (ixiVar35 = (ixi) m410Var.b) != null && !ixiVar35.b.getBetInProgress()) {
                            ixi ixiVar37 = (ixi) m410Var.b;
                            if (ixiVar37 != null && (binding12 = ixiVar37.b.getBinding()) != null) {
                                binding12.v.setClickable(false);
                            }
                            ixi ixiVar38 = (ixi) m410Var.b;
                            if (ixiVar38 != null && (binding11 = ixiVar38.b.getBinding()) != null) {
                                binding11.v.setAlpha(0.65f);
                            }
                            if (m410Var.E) {
                                ixi ixiVar39 = (ixi) m410Var.b;
                                dValueOf = (ixiVar39 == null || (binding10 = ixiVar39.b.getBinding()) == null || (text = binding10.z.getText()) == null || (string = text.toString()) == null) ? null : Double.valueOf(Double.parseDouble(string));
                            } else {
                                dValueOf = null;
                            }
                            DetailResponseData detailResponseData2 = m410Var.w;
                            if (detailResponseData2 != null && (gameDetailsResponseList = detailResponseData2.getGameDetailsResponseList()) != null && (!gameDetailsResponseList.isEmpty())) {
                                DetailResponseData detailResponseData3 = m410Var.w;
                                if (detailResponseData3 == null || (gameDetailsResponseList3 = detailResponseData3.getGameDetailsResponseList()) == null || (detailResponse2 = gameDetailsResponseList3.get(0)) == null || (detailResponseData = m410Var.w) == null || (gameDetailsResponseList4 = detailResponseData.getGameDetailsResponseList()) == null || (detailResponse3 = gameDetailsResponseList4.get(0)) == null) {
                                    placeBetRequest = null;
                                } else {
                                    int betIndex = detailResponse3.getBetIndex();
                                    DetailResponseData detailResponseData4 = m410Var.w;
                                    if (detailResponseData4 == null || (gameDetailsResponseList5 = detailResponseData4.getGameDetailsResponseList()) == null || (detailResponse4 = gameDetailsResponseList5.get(0)) == null) {
                                        placeBetRequest = null;
                                    } else {
                                        int betCategoryType = detailResponse4.getBetCategoryType();
                                        String currency = detailResponse2.getCurrency();
                                        if (currency != null) {
                                            long j2 = m410Var.J;
                                            ixi ixiVar40 = (ixi) m410Var.b;
                                            String giftId = (ixiVar40 == null || (giftItem = ixiVar40.b.getGiftItem()) == null) ? null : giftItem.getGiftId();
                                            ixi ixiVar41 = (ixi) m410Var.b;
                                            placeBetRequest = new PlaceBetRequest(str3, betCategoryType, betIndex, currency, j2, giftId, ixiVar41 != null ? ixiVar41.b.getGiftAmount() : null, dValueOf, m410Var.d1);
                                        } else {
                                            placeBetRequest = null;
                                        }
                                    }
                                }
                                final String strJ = new eal().j(placeBetRequest);
                                goa0 goa0Var6 = (goa0) m410Var.a;
                                if (goa0Var6 != null) {
                                    long j3 = m410Var.J;
                                    DetailResponseData detailResponseData5 = m410Var.w;
                                    goa0Var6.I1(strJ, j3, (detailResponseData5 == null || (gameDetailsResponseList2 = detailResponseData5.getGameDetailsResponseList()) == null || (detailResponse = gameDetailsResponseList2.get(0)) == null) ? null : Integer.valueOf(detailResponse.getBetIndex()), new Function0() { // from class: x010
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            m410 m410Var2 = m410Var;
                                            cgb.a(m410Var2.P0(), m410Var2.F0, "placeBet", strJ);
                                            return Unit.a;
                                        }
                                    });
                                }
                                ixi ixiVar42 = (ixi) m410Var.b;
                                if (ixiVar42 != null) {
                                    ixiVar42.b.setBetPlacedV2(true);
                                }
                                ixi ixiVar43 = (ixi) m410Var.b;
                                if (ixiVar43 != null) {
                                    ixiVar43.b.setBetInProgress(true);
                                }
                                m410Var.I0();
                                SharedPreferences sharedPreferences3 = m410Var.V;
                                if (sharedPreferences3 != null && sharedPreferences3.getBoolean("PING_PONG_SOUND", true)) {
                                    ypa0 ypa0Var = m410Var.v;
                                    if (ypa0Var == null) {
                                        Intrinsics.n("soundViewModel");
                                        throw null;
                                    }
                                    String string2 = m410Var.getString(R.string.place_bet);
                                    string2.getClass();
                                    ypa0Var.A1(0L, string2);
                                }
                            }
                            m410Var.I0();
                            GameDetails gameDetails2 = m410Var.r1;
                            wz.a("BetPlaced", gameDetails2 != null ? gameDetails2.getName() : null, "1", "On");
                            m410Var.c1("1", true);
                        }
                    } else {
                        ixi ixiVar44 = (ixi) m410Var.b;
                        if (ixiVar44 != null && (binding17 = ixiVar44.b.getBinding()) != null) {
                            binding17.D.setVisibility(0);
                        }
                        ixi ixiVar45 = (ixi) m410Var.b;
                        if (ixiVar45 != null && (binding16 = ixiVar45.b.getBinding()) != null) {
                            binding16.Y.setVisibility(0);
                        }
                        ixi ixiVar46 = (ixi) m410Var.b;
                        if (ixiVar46 != null && (binding15 = ixiVar46.b.getBinding()) != null) {
                            binding15.a0.setVisibility(0);
                        }
                        ixi ixiVar47 = (ixi) m410Var.b;
                        if (ixiVar47 != null && (binding14 = ixiVar47.b.getBinding()) != null) {
                            binding14.v.setVisibility(8);
                        }
                        ixi ixiVar48 = (ixi) m410Var.b;
                        if (ixiVar48 != null && (binding13 = ixiVar48.b.getBinding()) != null) {
                            binding13.q0.setVisibility(8);
                        }
                        m410Var.N = true;
                    }
                    m410Var.l1();
                    m410Var.U0();
                    return Unit.a;
                }
            }, new a210(this, 0), new c210(this, 0));
        }
        ixi ixiVar35 = (ixi) this.b;
        if (ixiVar35 != null) {
            ixiVar35.b.setCashoutListener(new p8d(this, i4));
        }
        ixi ixiVar36 = (ixi) this.b;
        if (ixiVar36 != null) {
            ixiVar36.b.setConfirmBetListener(new zbi(this, i2));
        }
        ixi ixiVar37 = (ixi) this.b;
        if (ixiVar37 != null) {
            ixiVar37.b.setCancelBetListener(new e210(this, i3));
        }
        ixi ixiVar38 = (ixi) this.b;
        if (ixiVar38 != null) {
            ixiVar38.c.setCancelBetListener(new Function1() { // from class: f210
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    v720 binding10;
                    v720 binding11;
                    v720 binding12;
                    v720 binding13;
                    v720 binding14;
                    ((String) obj).getClass();
                    m410 m410Var = this.a;
                    ixi ixiVar39 = (ixi) m410Var.b;
                    if (ixiVar39 != null && (binding14 = ixiVar39.c.getBinding()) != null) {
                        binding14.D.setVisibility(8);
                    }
                    ixi ixiVar40 = (ixi) m410Var.b;
                    if (ixiVar40 != null && (binding13 = ixiVar40.c.getBinding()) != null) {
                        binding13.Y.setVisibility(8);
                    }
                    ixi ixiVar41 = (ixi) m410Var.b;
                    if (ixiVar41 != null && (binding12 = ixiVar41.c.getBinding()) != null) {
                        binding12.a0.setVisibility(8);
                    }
                    ixi ixiVar42 = (ixi) m410Var.b;
                    if (ixiVar42 != null && (binding11 = ixiVar42.c.getBinding()) != null) {
                        binding11.v.setVisibility(0);
                    }
                    ixi ixiVar43 = (ixi) m410Var.b;
                    if (ixiVar43 != null && (binding10 = ixiVar43.c.getBinding()) != null) {
                        binding10.q0.setVisibility(8);
                    }
                    m410Var.O = false;
                    GameDetails gameDetails2 = m410Var.r1;
                    wz.a("BetCancelled", gameDetails2 != null ? gameDetails2.getName() : null, "2");
                    return Unit.a;
                }
            });
        }
        ixi ixiVar39 = (ixi) this.b;
        if (ixiVar39 != null) {
            ixiVar39.c.setConfirmBetListener(new Function1() { // from class: g210
                /* JADX WARN: Code duplicated, block: B:91:0x0151  */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ixi ixiVar40;
                    ixi ixiVar41;
                    Double dValueOf;
                    PlaceBetRequest placeBetRequest;
                    List<DetailResponse> gameDetailsResponseList;
                    DetailResponse detailResponse;
                    List<DetailResponse> gameDetailsResponseList2;
                    DetailResponse detailResponse2;
                    List<DetailResponse> gameDetailsResponseList3;
                    DetailResponse detailResponse3;
                    List<DetailResponse> gameDetailsResponseList4;
                    DetailResponse detailResponse4;
                    String currency;
                    GiftItem giftItem;
                    v720 binding10;
                    v720 binding11;
                    v720 binding12;
                    v720 binding13;
                    v720 binding14;
                    v720 binding15;
                    v720 binding16;
                    String str3 = (String) obj;
                    str3.getClass();
                    m410 m410Var = this.a;
                    if (m410Var.a1()) {
                        m410Var.i1();
                    } else {
                        DetailResponseData detailResponseData = m410Var.w;
                        if (detailResponseData != null && detailResponseData.getGameDetailsResponseList() != null && (ixiVar40 = (ixi) m410Var.b) != null && !ixiVar40.c.getBetPlaced() && (ixiVar41 = (ixi) m410Var.b) != null && !ixiVar41.c.getBetInProgress()) {
                            m410Var.O = false;
                            ixi ixiVar42 = (ixi) m410Var.b;
                            if (ixiVar42 != null && (binding16 = ixiVar42.c.getBinding()) != null) {
                                binding16.v.setClickable(false);
                            }
                            ixi ixiVar43 = (ixi) m410Var.b;
                            if (ixiVar43 != null && (binding15 = ixiVar43.c.getBinding()) != null) {
                                binding15.v.setAlpha(0.65f);
                            }
                            ixi ixiVar44 = (ixi) m410Var.b;
                            if (ixiVar44 != null && (binding14 = ixiVar44.c.getBinding()) != null) {
                                binding14.D.setVisibility(8);
                            }
                            ixi ixiVar45 = (ixi) m410Var.b;
                            if (ixiVar45 != null && (binding13 = ixiVar45.c.getBinding()) != null) {
                                binding13.Y.setVisibility(8);
                            }
                            ixi ixiVar46 = (ixi) m410Var.b;
                            if (ixiVar46 != null && (binding12 = ixiVar46.c.getBinding()) != null) {
                                binding12.a0.setVisibility(8);
                            }
                            ixi ixiVar47 = (ixi) m410Var.b;
                            if (ixiVar47 != null && (binding11 = ixiVar47.c.getBinding()) != null) {
                                binding11.v.setVisibility(0);
                            }
                            ixi ixiVar48 = (ixi) m410Var.b;
                            if (ixiVar48 != null && (binding10 = ixiVar48.c.getBinding()) != null) {
                                binding10.q0.setVisibility(8);
                            }
                            if (m410Var.I) {
                                ixi ixiVar49 = (ixi) m410Var.b;
                                dValueOf = ixiVar49 != null ? Double.valueOf(ixiVar49.c.getCashoutCoeff()) : null;
                            } else {
                                dValueOf = null;
                            }
                            DetailResponseData detailResponseData2 = m410Var.w;
                            if (detailResponseData2 == null || (gameDetailsResponseList2 = detailResponseData2.getGameDetailsResponseList()) == null || (detailResponse2 = gameDetailsResponseList2.get(1)) == null) {
                                placeBetRequest = null;
                            } else {
                                int betCategoryType = detailResponse2.getBetCategoryType();
                                DetailResponseData detailResponseData3 = m410Var.w;
                                if (detailResponseData3 == null || (gameDetailsResponseList3 = detailResponseData3.getGameDetailsResponseList()) == null || (detailResponse3 = gameDetailsResponseList3.get(1)) == null) {
                                    placeBetRequest = null;
                                } else {
                                    int betIndex = detailResponse3.getBetIndex();
                                    DetailResponseData detailResponseData4 = m410Var.w;
                                    if (detailResponseData4 == null || (gameDetailsResponseList4 = detailResponseData4.getGameDetailsResponseList()) == null || (detailResponse4 = gameDetailsResponseList4.get(1)) == null || (currency = detailResponse4.getCurrency()) == null) {
                                        placeBetRequest = null;
                                    } else {
                                        long j2 = m410Var.J;
                                        ixi ixiVar50 = (ixi) m410Var.b;
                                        String giftId = (ixiVar50 == null || (giftItem = ixiVar50.c.getGiftItem()) == null) ? null : giftItem.getGiftId();
                                        ixi ixiVar51 = (ixi) m410Var.b;
                                        placeBetRequest = new PlaceBetRequest(str3, betCategoryType, betIndex, currency, j2, giftId, ixiVar51 != null ? ixiVar51.c.getGiftAmount() : null, dValueOf, m410Var.d1);
                                    }
                                }
                            }
                            String strJ = new eal().j(placeBetRequest);
                            goa0 goa0Var6 = (goa0) m410Var.a;
                            if (goa0Var6 != null) {
                                long j3 = m410Var.J;
                                DetailResponseData detailResponseData5 = m410Var.w;
                                goa0Var6.I1(strJ, j3, (detailResponseData5 == null || (gameDetailsResponseList = detailResponseData5.getGameDetailsResponseList()) == null || (detailResponse = gameDetailsResponseList.get(1)) == null) ? null : Integer.valueOf(detailResponse.getBetIndex()), new h410(0, m410Var, strJ));
                            }
                            ixi ixiVar52 = (ixi) m410Var.b;
                            if (ixiVar52 != null) {
                                ixiVar52.c.setBetPlacedV2(true);
                            }
                            ixi ixiVar53 = (ixi) m410Var.b;
                            if (ixiVar53 != null) {
                                ixiVar53.c.setBetInProgress(true);
                            }
                            m410Var.I0();
                            SharedPreferences sharedPreferences2 = m410Var.V;
                            if (sharedPreferences2 != null && sharedPreferences2.getBoolean("PING_PONG_SOUND", true)) {
                                ypa0 ypa0Var = m410Var.v;
                                if (ypa0Var == null) {
                                    Intrinsics.n("soundViewModel");
                                    throw null;
                                }
                                String string = m410Var.getString(R.string.place_bet);
                                string.getClass();
                                ypa0Var.A1(0L, string);
                            }
                            m410Var.I0();
                        }
                        m410Var.U0();
                        GameDetails gameDetails2 = m410Var.r1;
                        wz.a("BetConfirmed", gameDetails2 != null ? gameDetails2.getName() : null, "2");
                        GameDetails gameDetails3 = m410Var.r1;
                        wz.a("BetPlaced", gameDetails3 != null ? gameDetails3.getName() : null, "2", "Off");
                        m410Var.c1("2", true);
                    }
                    return Unit.a;
                }
            });
        }
        ixi ixiVar40 = (ixi) this.b;
        if (ixiVar40 != null) {
            ixiVar40.c.setBetListener(new ehn(this, i2), new Function0() { // from class: h210
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(this.a.a1());
                }
            }, new i210(this, 0));
        }
        ixi ixiVar41 = (ixi) this.b;
        if (ixiVar41 != null) {
            ixiVar41.c.setCashoutListener(new Function1() { // from class: k210
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((String) obj).getClass();
                    m410 m410Var = this.a;
                    m410Var.t0();
                    ixi ixiVar42 = (ixi) m410Var.b;
                    if (ixiVar42 != null) {
                        ixiVar42.c.setBetPlacedV2(false);
                    }
                    return Unit.a;
                }
            });
        }
        ixi ixiVar42 = (ixi) this.b;
        if (ixiVar42 != null) {
            ixiVar42.M.setNumberClick(new gg(this, i4));
        }
        ixi ixiVar43 = (ixi) this.b;
        if (ixiVar43 != null) {
            ixiVar43.M.setDoneClick(new ig(this, i2));
        }
        ixi ixiVar44 = (ixi) this.b;
        if (ixiVar44 != null) {
            ixiVar44.M.setClearClick(new kg(this, i4));
        }
        ixi ixiVar45 = (ixi) this.b;
        if (ixiVar45 != null) {
            ixiVar45.M.setCrossClick(new lg(this, i4));
        }
        ixi ixiVar46 = (ixi) this.b;
        if (ixiVar46 != null) {
            ixiVar46.M.setDoubleZeroClick(new m210(this, i3));
        }
        ixi ixiVar47 = (ixi) this.b;
        if (ixiVar47 != null) {
            ixiVar47.M.setPointClick(new n210(this, i3));
        }
        ixi ixiVar48 = (ixi) this.b;
        if (ixiVar48 != null) {
            ixiVar48.V.setTotalWinListener(new Function0() { // from class: o210
                /* JADX WARN: Type inference failed for: r6v0, types: [k010] */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    final m410 m410Var = this.a;
                    e activity6 = m410Var.getActivity();
                    if (activity6 != null) {
                        y720 y720VarN1 = m410Var.N0();
                        ibs viewLifecycleOwner2 = m410Var.getViewLifecycleOwner();
                        viewLifecycleOwner2.getClass();
                        String str3 = m410Var.C;
                        String str4 = m410Var.B;
                        ?? r6 = new Function0() { // from class: k010
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(m410Var.a1());
                            }
                        };
                        l010 l010Var = new l010(m410Var, 0);
                        str3.getClass();
                        str4.getClass();
                        n2g0 n2g0Var = new n2g0(activity6);
                        n2g0Var.a = activity6;
                        n2g0Var.b = y720VarN1;
                        n2g0Var.c = viewLifecycleOwner2;
                        n2g0Var.d = str3;
                        n2g0Var.e = str4;
                        n2g0Var.f = r6;
                        n2g0Var.i = l010Var;
                        String string = activity6.getString(R.string.payout_amount);
                        string.getClass();
                        n2g0Var.w = string;
                        String string2 = activity6.getString(R.string.daily);
                        string2.getClass();
                        n2g0Var.y = string2;
                        n2g0Var.setCancelable(true);
                        n2g0Var.setCanceledOnTouchOutside(false);
                        m410Var.T = n2g0Var;
                        Window window2 = n2g0Var.getWindow();
                        WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
                        if (attributes != null) {
                            attributes.gravity = 17;
                        }
                        if (attributes != null) {
                            attributes.flags &= -5;
                        }
                        Window window3 = n2g0Var.getWindow();
                        if (window3 != null) {
                            window3.setAttributes(attributes);
                        }
                        Window window4 = n2g0Var.getWindow();
                        if (window4 != null) {
                            window4.setBackgroundDrawableResource(R.color.trans_black_45);
                        }
                        n2g0Var.show();
                        Window window5 = n2g0Var.getWindow();
                        if (window5 != null) {
                            window5.setLayout(-1, -1);
                        }
                        GameDetails gameDetails2 = m410Var.r1;
                        wz.a("TopWinsClicked", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
                    }
                    return Unit.a;
                }
            });
        }
        ixi ixiVar49 = (ixi) this.b;
        if (ixiVar49 != null) {
            ixiVar49.b.setautoCashoutListener(new gaj() { // from class: p210
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ixi ixiVar50;
                    v720 binding10;
                    v720 binding11;
                    v720 binding12;
                    v720 binding13;
                    v720 binding14;
                    v720 binding15;
                    v720 binding16;
                    ixi ixiVar51;
                    v720 binding17;
                    CharSequence text;
                    m410 m410Var = this.a;
                    int i5 = m410Var.U0;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    String str3 = (String) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (str3 == null || str3.length() == 0 || str3.length() <= 0) {
                        if (zBooleanValue) {
                            ixi ixiVar52 = (ixi) m410Var.b;
                            if (ixiVar52 != null && ixiVar52.M.getVisibility() == 0) {
                                ixi ixiVar53 = (ixi) m410Var.b;
                                if (ixiVar53 != null) {
                                    ixiVar53.b.setBetDone();
                                }
                                ixi ixiVar54 = (ixi) m410Var.b;
                                if (ixiVar54 != null) {
                                    ixiVar54.c.setBetDone();
                                }
                                ixi ixiVar55 = (ixi) m410Var.b;
                                if (ixiVar55 != null && (binding16 = ixiVar55.c.getBinding()) != null) {
                                    binding16.i.setEnabled(false);
                                }
                                ixi ixiVar56 = (ixi) m410Var.b;
                                if (ixiVar56 != null && (binding15 = ixiVar56.b.getBinding()) != null) {
                                    binding15.i.setEnabled(false);
                                }
                                ixi ixiVar57 = (ixi) m410Var.b;
                                if (ixiVar57 != null && (binding14 = ixiVar57.c.getBinding()) != null) {
                                    binding14.A.setEnabled(false);
                                }
                            }
                            m410Var.d0 = true;
                            ixi ixiVar58 = (ixi) m410Var.b;
                            if (ixiVar58 != null) {
                                ixiVar58.M.setVisibility(0);
                            }
                            m410Var.R0 = i5;
                            ixi ixiVar59 = (ixi) m410Var.b;
                            if (ixiVar59 != null && (binding13 = ixiVar59.c.getBinding()) != null) {
                                binding13.i.setEnabled(false);
                            }
                            ixi ixiVar60 = (ixi) m410Var.b;
                            if (ixiVar60 != null && (binding12 = ixiVar60.b.getBinding()) != null) {
                                binding12.i.setEnabled(false);
                            }
                            ixi ixiVar61 = (ixi) m410Var.b;
                            if (ixiVar61 != null && (binding11 = ixiVar61.b.getBinding()) != null) {
                                binding11.A.setEnabled(true);
                            }
                            ixi ixiVar62 = (ixi) m410Var.b;
                            if (ixiVar62 != null && (binding10 = ixiVar62.c.getBinding()) != null) {
                                binding10.A.setEnabled(false);
                            }
                            m410Var.p1(m410Var.R0);
                        } else if (m410Var.R0 == i5 && (ixiVar50 = (ixi) m410Var.b) != null) {
                            ixiVar50.M.setVisibility(8);
                        }
                        m410Var.E = zBooleanValue;
                        wz.a("AutoCashout", "Ping Pong", "1", zBooleanValue ? "On" : "Off");
                    } else {
                        ixi ixiVar63 = (ixi) m410Var.b;
                        if (ixiVar63 != null && ixiVar63.X.getVisibility() == 8) {
                            ixi ixiVar64 = (ixi) m410Var.b;
                            if (ixiVar64 != null) {
                                ixiVar64.X.setVisibility(0);
                            }
                            ixi ixiVar65 = (ixi) m410Var.b;
                            if (ixiVar65 != null) {
                                ixiVar65.X.setMessageandBG(iIntValue, str3);
                            }
                            nas nasVarA2 = ebs.a(m410Var.getLifecycle());
                            pfd pfdVar2 = fse.a;
                            ej5.c(nasVarA2, gku.a, null, m410Var.new h(null), 2);
                        }
                    }
                    if (!m410Var.E && (ixiVar51 = (ixi) m410Var.b) != null && (binding17 = ixiVar51.b.getBinding()) != null && (text = binding17.z.getText()) != null && text.length() == 0) {
                        ixi ixiVar66 = (ixi) m410Var.b;
                        if (ixiVar66 != null) {
                            ixiVar66.b.setCashoutAmount(Double.parseDouble("5"));
                        }
                        ixi ixiVar67 = (ixi) m410Var.b;
                        if (ixiVar67 != null) {
                            ixiVar67.b.f();
                        }
                    }
                    m410Var.l1();
                    return Unit.a;
                }
            });
        }
        ixi ixiVar50 = (ixi) this.b;
        if (ixiVar50 != null) {
            ixiVar50.b.setBetStepListener(new nin(1));
        }
        ixi ixiVar51 = (ixi) this.b;
        if (ixiVar51 != null) {
            ixiVar51.c.setBetStepListener(new oin(1));
        }
        ixi ixiVar52 = (ixi) this.b;
        if (ixiVar52 != null) {
            ixiVar52.c.setautoCashoutListener(new gaj() { // from class: r210
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ixi ixiVar53;
                    v720 binding10;
                    v720 binding11;
                    v720 binding12;
                    v720 binding13;
                    v720 binding14;
                    v720 binding15;
                    v720 binding16;
                    ixi ixiVar54;
                    v720 binding17;
                    CharSequence text;
                    m410 m410Var = this.a;
                    int i5 = m410Var.V0;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    String str3 = (String) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (str3 == null || str3.length() == 0 || str3.length() <= 0) {
                        if (zBooleanValue) {
                            ixi ixiVar55 = (ixi) m410Var.b;
                            if (ixiVar55 != null && ixiVar55.M.getVisibility() == 0) {
                                ixi ixiVar56 = (ixi) m410Var.b;
                                if (ixiVar56 != null) {
                                    ixiVar56.b.setBetDone();
                                }
                                ixi ixiVar57 = (ixi) m410Var.b;
                                if (ixiVar57 != null) {
                                    ixiVar57.c.setBetDone();
                                }
                                ixi ixiVar58 = (ixi) m410Var.b;
                                if (ixiVar58 != null && (binding16 = ixiVar58.c.getBinding()) != null) {
                                    binding16.i.setEnabled(false);
                                }
                                ixi ixiVar59 = (ixi) m410Var.b;
                                if (ixiVar59 != null && (binding15 = ixiVar59.b.getBinding()) != null) {
                                    binding15.i.setEnabled(false);
                                }
                                ixi ixiVar60 = (ixi) m410Var.b;
                                if (ixiVar60 != null && (binding14 = ixiVar60.b.getBinding()) != null) {
                                    binding14.A.setEnabled(false);
                                }
                            }
                            m410Var.d0 = false;
                            ixi ixiVar61 = (ixi) m410Var.b;
                            if (ixiVar61 != null) {
                                ixiVar61.M.setVisibility(0);
                            }
                            m410Var.R0 = i5;
                            ixi ixiVar62 = (ixi) m410Var.b;
                            if (ixiVar62 != null && (binding13 = ixiVar62.c.getBinding()) != null) {
                                binding13.i.setEnabled(false);
                            }
                            ixi ixiVar63 = (ixi) m410Var.b;
                            if (ixiVar63 != null && (binding12 = ixiVar63.b.getBinding()) != null) {
                                binding12.i.setEnabled(false);
                            }
                            ixi ixiVar64 = (ixi) m410Var.b;
                            if (ixiVar64 != null && (binding11 = ixiVar64.c.getBinding()) != null) {
                                binding11.A.setEnabled(true);
                            }
                            ixi ixiVar65 = (ixi) m410Var.b;
                            if (ixiVar65 != null && (binding10 = ixiVar65.b.getBinding()) != null) {
                                binding10.A.setEnabled(false);
                            }
                            m410Var.p1(m410Var.R0);
                        } else if (m410Var.R0 == i5 && (ixiVar53 = (ixi) m410Var.b) != null) {
                            ixiVar53.M.setVisibility(8);
                        }
                        m410Var.I = zBooleanValue;
                        wz.a("AutoBet", "Ping Pong", "2", zBooleanValue ? "On" : "Off");
                    } else {
                        ixi ixiVar66 = (ixi) m410Var.b;
                        if (ixiVar66 != null && ixiVar66.X.getVisibility() == 8) {
                            ixi ixiVar67 = (ixi) m410Var.b;
                            if (ixiVar67 != null) {
                                ixiVar67.X.setVisibility(0);
                            }
                            ixi ixiVar68 = (ixi) m410Var.b;
                            if (ixiVar68 != null) {
                                ixiVar68.X.setMessageandBG(iIntValue, str3);
                            }
                            nas nasVarA2 = ebs.a(m410Var.getLifecycle());
                            pfd pfdVar2 = fse.a;
                            ej5.c(nasVarA2, gku.a, null, m410Var.new i(null), 2);
                        }
                    }
                    if (!m410Var.I && (ixiVar54 = (ixi) m410Var.b) != null && (binding17 = ixiVar54.c.getBinding()) != null && (text = binding17.z.getText()) != null && text.length() == 0) {
                        ixi ixiVar69 = (ixi) m410Var.b;
                        if (ixiVar69 != null) {
                            ixiVar69.c.setCashoutAmount(Double.parseDouble(dLRYz.WXyjkj));
                        }
                        ixi ixiVar70 = (ixi) m410Var.b;
                        if (ixiVar70 != null) {
                            ixiVar70.c.f();
                        }
                    }
                    m410Var.l1();
                    return Unit.a;
                }
            });
        }
        tb5 tb5VarB2 = d77.b(2, 6, null);
        ej5.c(ebs.a(getLifecycle()), gku.a, null, new j(tb5VarB2, null), 2);
        this.p0 = tb5VarB2;
        try {
            L0().d.f(getViewLifecycleOwner(), new l(new Function1() { // from class: e410
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    io80 binding10;
                    ixi ixiVar53;
                    io80 binding11;
                    WalletInfo walletInfo;
                    WalletInfo walletInfo2;
                    Double balance;
                    io80 binding12;
                    io80 binding13;
                    io80 binding14;
                    WalletInfo walletInfo3;
                    WalletInfo walletInfo4;
                    ixi ixiVar54;
                    WalletInfo walletInfo5;
                    ResultWrapper.GenericError error;
                    Context context2;
                    Integer code;
                    LoadingState loadingState = (LoadingState) obj;
                    int i5 = m410.b.a[loadingState.getStatus().ordinal()];
                    int i6 = 2;
                    final m410 m410Var = this.a;
                    Double balance2 = null;
                    if (i5 == 1) {
                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                        String currency = (hTTPResponse == null || (walletInfo5 = (WalletInfo) hTTPResponse.getData()) == null) ? null : walletInfo5.getCurrency();
                        if (currency != null && !StringsKt.U(currency)) {
                            m410Var.L0 = 0;
                        } else {
                            if (m410Var.L0 < 3) {
                                m410Var.L0().y1();
                                m410Var.L0++;
                                return Unit.a;
                            }
                            m410Var.D1();
                            e activity6 = m410Var.getActivity();
                            if (activity6 != null) {
                                activity6.finish();
                            }
                        }
                        if (!m410Var.J0 && (ixiVar54 = (ixi) m410Var.b) != null) {
                            ixiVar54.U.P();
                        }
                        ixi ixiVar55 = (ixi) m410Var.b;
                        if (ixiVar55 != null) {
                            ShHeaderContainer shHeaderContainer = ixiVar55.L;
                            HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                            String strValueOf = String.valueOf((hTTPResponse2 == null || (walletInfo4 = (WalletInfo) hTTPResponse2.getData()) == null) ? null : walletInfo4.getBalance());
                            op5 op5Var = op5.a;
                            HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
                            String strValueOf2 = String.valueOf((hTTPResponse3 == null || (walletInfo3 = (WalletInfo) hTTPResponse3.getData()) == null) ? null : walletInfo3.getCurrency());
                            op5Var.getClass();
                            shHeaderContainer.setAmount(strValueOf, op5.i(strValueOf2));
                        }
                        ixi ixiVar56 = (ixi) m410Var.b;
                        if (ixiVar56 != null && (binding14 = ixiVar56.L.getBinding()) != null) {
                            binding14.b.setVisibility(0);
                        }
                        ixi ixiVar57 = (ixi) m410Var.b;
                        if (ixiVar57 != null && (binding13 = ixiVar57.L.getBinding()) != null) {
                            binding13.f.setVisibility(0);
                        }
                        ixi ixiVar58 = (ixi) m410Var.b;
                        if (ixiVar58 != null && (binding12 = ixiVar58.L.getBinding()) != null) {
                            binding12.i.setVisibility(4);
                        }
                        zp40 zp40Var = new zp40();
                        Double d2 = m410Var.f0;
                        if (d2 != null) {
                            double dDoubleValue = d2.doubleValue();
                            HTTPResponse hTTPResponse4 = (HTTPResponse) loadingState.getData();
                            if (hTTPResponse4 != null && (walletInfo2 = (WalletInfo) hTTPResponse4.getData()) != null && (balance = walletInfo2.getBalance()) != null) {
                                zp40Var.a = dDoubleValue - balance.doubleValue();
                            }
                        }
                        double d3 = zp40Var.a;
                        if (d3 < 0.0d) {
                            nas nasVarA2 = ebs.a(m410Var.getLifecycle());
                            pfd pfdVar2 = fse.a;
                            ej5.c(nasVarA2, gku.a, null, new b510(m410Var, zp40Var, null), 2);
                        } else if (d3 > 0.0d) {
                            nas nasVarA3 = ebs.a(m410Var.getLifecycle());
                            pfd pfdVar3 = fse.a;
                            ej5.c(nasVarA3, gku.a, null, new c510(m410Var, zp40Var, null), 2);
                        }
                        HTTPResponse hTTPResponse5 = (HTTPResponse) loadingState.getData();
                        if (hTTPResponse5 != null && (walletInfo = (WalletInfo) hTTPResponse5.getData()) != null) {
                            balance2 = walletInfo.getBalance();
                        }
                        m410Var.f0 = balance2;
                        if ((balance2 != null ? balance2.doubleValue() : 0.0d) < m410Var.e0 * 2.0d) {
                            if (m410Var.Z0() && (ixiVar53 = (ixi) m410Var.b) != null && (binding11 = ixiVar53.L.getBinding()) != null) {
                                binding11.e.setVisibility(0);
                            }
                            ixi ixiVar59 = (ixi) m410Var.b;
                            if (ixiVar59 != null) {
                                ixiVar59.K.F(R.drawable.hamberger_add_more_red);
                            }
                        } else {
                            ixi ixiVar60 = (ixi) m410Var.b;
                            if (ixiVar60 != null && (binding10 = ixiVar60.L.getBinding()) != null) {
                                binding10.e.setVisibility(8);
                            }
                            ixi ixiVar61 = (ixi) m410Var.b;
                            if (ixiVar61 != null) {
                                ixiVar61.K.F(R.drawable.hamberger_add_more_bg);
                            }
                        }
                        if (m410Var.Z0()) {
                            new SportyGamesManager().fetchFirstDepositState(ebs.a(m410Var.getLifecycle()), new d510(m410Var));
                        }
                    } else if (i5 != 2) {
                        if (i5 != 3) {
                            uhc.a();
                            return null;
                        }
                        if (m410Var.L0 < 3) {
                            m410Var.L0().y1();
                            m410Var.L0++;
                            return Unit.a;
                        }
                        m410Var.D1();
                        e activity7 = m410Var.getActivity();
                        if (activity7 != null && ((error = loadingState.getError()) == null || (code = error.getCode()) == null || code.intValue() != 403)) {
                            xbg xbgVar = m410Var.c0;
                            if (xbgVar == null) {
                                Intrinsics.n("errorDialog");
                                throw null;
                            }
                            if (!xbgVar.isShowing() && !m410Var.l0 && (context2 = m410Var.getContext()) != null) {
                                vs80 vs80Var = vs80.b;
                                ResultWrapper.GenericError error2 = loadingState.getError();
                                o7i o7iVar = new o7i(m410Var, i6);
                                e110 e110Var = new e110(0);
                                fj4 fj4Var = new fj4(m410Var, i6);
                                context2.getColor(R.color.sh_error_btn_color);
                                vs80Var.c(activity7, error2, o7iVar, e110Var, fj4Var, 0, (640 & 128) != 0 ? new mm60() : null, (640 & 512) != 0 ? new xvj(2) : new Function1() { // from class: f110
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        String str3 = (String) obj2;
                                        str3.getClass();
                                        m410Var.K0(str3);
                                        return Unit.a;
                                    }
                                });
                            }
                        }
                    }
                    return Unit.a;
                }
            }));
        } catch (Exception unused) {
        }
        goa0 goa0Var6 = (goa0) this.a;
        if (goa0Var6 != null && (sswVar2 = goa0Var6.w) != null) {
            sswVar2.f(getViewLifecycleOwner(), new l(new p010(this, 0)));
        }
        goa0 goa0Var7 = (goa0) this.a;
        if (goa0Var7 != null && (sswVar = goa0Var7.d) != null) {
            sswVar.f(getViewLifecycleOwner(), new l(new d7i(this, i4)));
        }
        ((fq5) q8i0Var.getValue()).c.f(getViewLifecycleOwner(), new l(new wdi(this, i2)));
        ypa0 ypa0Var = this.v;
        if (ypa0Var == null) {
            Intrinsics.n("soundViewModel");
            throw null;
        }
        GameDetails gameDetails2 = this.r1;
        String name2 = gameDetails2 != null ? gameDetails2.getName() : null;
        ypa0Var.e = name2 != null ? name2 : "";
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void p0() {
        goa0 goa0Var = (goa0) this.a;
        int i2 = 1;
        if (goa0Var != null && !goa0Var.y) {
            goa0Var.a = new ema();
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
                hic.a.getClass();
                ua.naiksoftware.stomp.a aVar = hic.j;
                aVar.e = 15000;
                aVar.d = 15000;
                r2i<bbs> r2iVarI = hic.i.i(qt1.b);
                final hu10 hu10Var = new hu10(goa0Var, 2);
                u2i u2iVar = new u2i(r2iVarI, new pya() { // from class: ika0
                    @Override // defpackage.pya
                    public final void accept(Object obj) {
                        hu10Var.invoke(obj);
                    }
                });
                final ela0 ela0Var = new ela0(goa0Var);
                pya pyaVar = new pya() { // from class: ama0
                    @Override // defpackage.pya
                    public final void accept(Object obj) {
                        ela0Var.invoke(obj);
                    }
                };
                new i560(1);
                slr slrVar = new slr(pyaVar, new mna0(), new vq4());
                u2iVar.h(slrVar);
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    e1e0 e1e0Var = (e1e0) obj;
                    linkedHashMap.put(e1e0Var.a, e1e0Var.b);
                }
                hic hicVar = hic.a;
                if (!hicVar.d() && !hicVar.d()) {
                    fmy fmyVar = new fmy(yk10.a(SportyGamesManager.getInstance().getBaseUrlSocket(), "games/ping-pong/v1/game"), linkedHashMap, new OkHttpClient());
                    hicVar.getClass();
                    hic.k = fmyVar;
                    ucy<String> ucyVarF = fmyVar.f();
                    gic gicVar = new gic();
                    ucyVarF.getClass();
                    idy idyVar = new idy(new tdy(ucyVarF, gicVar), new zfc(new wfc()));
                    final bgc bgcVar = new bgc();
                    cdy cdyVar = new cdy(idyVar, new pya() { // from class: dgc
                        @Override // defpackage.pya
                        public final void accept(Object obj2) {
                            bgcVar.invoke(obj2);
                        }
                    });
                    final fgc fgcVar = new fgc();
                    idy idyVar2 = new idy(cdyVar, new nm20() { // from class: hgc
                        @Override // defpackage.nm20
                        public final boolean test(Object obj2) {
                            obj2.getClass();
                            return ((Boolean) fgcVar.invoke(obj2)).booleanValue();
                        }
                    });
                    final as8 as8Var = new as8(i2);
                    pya pyaVar2 = new pya() { // from class: kgc
                        @Override // defpackage.pya
                        public final void accept(Object obj2) {
                            as8Var.invoke(obj2);
                        }
                    };
                    aic aicVar = new aic();
                    taj.d dVar = taj.c;
                    rlr rlrVar = new rlr(pyaVar2, aicVar, dVar);
                    idyVar2.a(rlrVar);
                    hic.h = rlrVar;
                    x2 x2Var = hic.k;
                    if (x2Var == null) {
                        Intrinsics.n("connectionProvider");
                        throw null;
                    }
                    l830<bbs> l830Var = x2Var.a;
                    final cic cicVar = new cic(arrayList);
                    pya pyaVar3 = new pya() { // from class: eic
                        @Override // defpackage.pya
                        public final void accept(Object obj2) {
                            cicVar.invoke(obj2);
                        }
                    };
                    l830Var.getClass();
                    rlr rlrVar2 = new rlr(pyaVar3, taj.e, dVar);
                    l830Var.a(rlrVar2);
                    hic.g = rlrVar2;
                }
                ema emaVar = goa0Var.a;
                if (emaVar != null) {
                    emaVar.b(slrVar);
                }
            }
        }
        this.g0 = true;
        ixi ixiVar = (ixi) this.b;
        if (ixiVar != null) {
            ixiVar.b.setBetPlaced(false);
        }
        ixi ixiVar2 = (ixi) this.b;
        if (ixiVar2 != null) {
            ixiVar2.c.setBetPlaced(false);
        }
        ixi ixiVar3 = (ixi) this.b;
        if (ixiVar3 != null) {
            ixiVar3.c.setBetInProgress(false);
        }
        ixi ixiVar4 = (ixi) this.b;
        if (ixiVar4 != null) {
            ixiVar4.b.setBetInProgress(false);
        }
        this.n0.clear();
        ixi ixiVar5 = (ixi) this.b;
        if (ixiVar5 != null) {
            ixiVar5.V.a();
        }
    }

    public final void p1(int i2) {
        v720 binding;
        v720 binding2;
        v720 binding3;
        v720 binding4;
        B b2 = this.b;
        if (i2 == this.U0) {
            ixi ixiVar = (ixi) b2;
            if (ixiVar != null && (binding4 = ixiVar.b.getBinding()) != null) {
                binding4.A.setBackgroundResource(R.drawable.pp_cashout_amount);
            }
            ixi ixiVar2 = (ixi) this.b;
            if (ixiVar2 == null || (binding3 = ixiVar2.c.getBinding()) == null) {
                return;
            }
            binding3.A.setBackgroundResource(R.drawable.pp_cashout_amount_disabled);
            return;
        }
        ixi ixiVar3 = (ixi) b2;
        if (ixiVar3 != null && (binding2 = ixiVar3.b.getBinding()) != null) {
            binding2.A.setBackgroundResource(R.drawable.pp_cashout_amount_disabled);
        }
        ixi ixiVar4 = (ixi) this.b;
        if (ixiVar4 == null || (binding = ixiVar4.c.getBinding()) == null) {
            return;
        }
        binding.A.setBackgroundResource(R.drawable.pp_cashout_amount);
    }

    public final void q0() {
        if (!Z0() || this.N0) {
            return;
        }
        ej5.c(this.B0, null, null, new c(null), 3);
    }

    public final void q1(boolean z2) {
        ConstraintLayout constraintLayout;
        ixi ixiVar = (ixi) this.b;
        ViewGroup.LayoutParams layoutParams = ixiVar != null ? ixiVar.w.getLayoutParams() : null;
        layoutParams.getClass();
        DrawerLayout.LayoutParams layoutParams2 = (DrawerLayout.LayoutParams) layoutParams;
        if (z2) {
            ixi ixiVar2 = (ixi) this.b;
            layoutParams2.setMargins(0, 0, 0, (int) (((double) ((ixiVar2 == null || (constraintLayout = ixiVar2.R) == null) ? 1 : constraintLayout.getHeight())) / 9.3d));
        } else {
            layoutParams2.setMargins(0, 0, 0, 0);
        }
        ixi ixiVar3 = (ixi) this.b;
        if (ixiVar3 != null) {
            ixiVar3.w.setLayoutParams(layoutParams2);
        }
    }

    public final Object r0(TextView textView, double d2, String str, tje0 tje0Var) {
        tb5 tb5Var = this.q0;
        if (tb5Var == null) {
            return Unit.a;
        }
        nas nasVarA = ebs.a(getLifecycle());
        pfd pfdVar = fse.a;
        Object objJ = tb5Var.j(tje0Var, ej5.b(nasVarA, gku.a, a6b.b, new n410(d2, textView, str, this, null)));
        return objJ == y5b.a ? objJ : Unit.a;
    }

    public final void r1() {
        LobbyMetaInfo metaInfo;
        Long minimumCMSVersionSupported;
        try {
            long versionCode = SportyGamesManager.getInstance().getVersionCode();
            GameDetails gameDetails = this.r1;
            if (versionCode < ((gameDetails == null || (metaInfo = gameDetails.getMetaInfo()) == null || (minimumCMSVersionSupported = metaInfo.getMinimumCMSVersionSupported()) == null) ? 0L : minimumCMSVersionSupported.longValue())) {
                this.i1 = "en";
            }
            Map<String, ArrayList<String>> map = vlr.a;
            ArrayList<String> arrayList = vlr.a.get("ping-pong");
            if (arrayList == null || !arrayList.contains(SportyGamesManager.getInstance().getLanguageCode())) {
                return;
            }
            String languageCode = SportyGamesManager.getInstance().getLanguageCode();
            languageCode.getClass();
            this.i1 = languageCode;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void s0() {
        v720 binding;
        this.Z = true;
        ixi ixiVar = (ixi) this.b;
        if (ixiVar == null || (binding = ixiVar.c.getBinding()) == null || binding.B.getVisibility() != 0) {
            return;
        }
        t0();
    }

    public final void s1() {
        ixi ixiVar = (ixi) this.b;
        if (ixiVar != null) {
            ixiVar.V.setVisibility(0);
        }
        ixi ixiVar2 = (ixi) this.b;
        if (ixiVar2 != null) {
            ixiVar2.d.setVisibility(0);
        }
        ixi ixiVar3 = (ixi) this.b;
        if (ixiVar3 != null) {
            ixiVar3.S.setVisibility(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    public final void t0() {
        CashoutRequest cashoutRequest;
        v720 binding;
        v720 binding2;
        U0();
        MultiplierResponse multiplierResponse = this.U;
        if (multiplierResponse == null || multiplierResponse.getMultiplier() == null) {
            return;
        }
        MultiplierResponse multiplierResponse2 = this.U;
        if (multiplierResponse2 == null) {
            Intrinsics.n("multiplierResponse");
            throw null;
        }
        if (multiplierResponse2.getMultiplier().length() > 0) {
            ixi ixiVar = (ixi) this.b;
            if (ixiVar != null) {
                long betId = ixiVar.c.getBetId();
                ixi ixiVar2 = (ixi) this.b;
                if (ixiVar2 != null) {
                    long roundId = ixiVar2.c.getRoundId();
                    MultiplierResponse multiplierResponse3 = this.U;
                    if (multiplierResponse3 == null) {
                        Intrinsics.n("multiplierResponse");
                        throw null;
                    }
                    String multiplier = multiplierResponse3.getMultiplier();
                    if (multiplier == null) {
                        multiplier = "";
                    }
                    cashoutRequest = new CashoutRequest(betId, roundId, multiplier, Boolean.FALSE, String.valueOf(System.currentTimeMillis()), this.d1);
                } else {
                    cashoutRequest = null;
                }
            } else {
                cashoutRequest = null;
            }
            ixi ixiVar3 = (ixi) this.b;
            if (ixiVar3 != null && (binding2 = ixiVar3.c.getBinding()) != null) {
                binding2.B.setClickable(false);
            }
            ixi ixiVar4 = (ixi) this.b;
            if (ixiVar4 != null) {
                ixiVar4.c.setCashoutInProgress(true);
            }
            if (cashoutRequest != null) {
                ixi ixiVar5 = (ixi) this.b;
                if (ixiVar5 != null && (binding = ixiVar5.c.getBinding()) != null) {
                    binding.B.setAlpha(0.65f);
                }
                final String strJ = new eal().j(cashoutRequest);
                goa0 goa0Var = (goa0) this.a;
                if (goa0Var != null) {
                    ixi ixiVar6 = (ixi) this.b;
                    Long lValueOf = ixiVar6 != null ? Long.valueOf(ixiVar6.c.getRoundId()) : null;
                    ixi ixiVar7 = (ixi) this.b;
                    goa0.H1(goa0Var, strJ, lValueOf, ixiVar7 != null ? Long.valueOf(ixiVar7.c.getBetId()) : null, new Function0() { // from class: n310
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            m410 m410Var = this.a;
                            cgb.a(m410Var.P0(), m410Var.F0, "cashout", strJ);
                            return Unit.a;
                        }
                    });
                }
                GameDetails gameDetails = this.r1;
                wz.a("Cashout", gameDetails != null ? gameDetails.getName() : null, "2", "Off", "No");
                b1("2", true);
            }
        }
    }

    public final void t1() {
        ixi ixiVar = (ixi) this.b;
        if (ixiVar != null) {
            SHToastContainer sHToastContainer = ixiVar.X;
            nas nasVarA = ebs.a(getLifecycle());
            op5 op5Var = op5.a;
            String string = getString(R.string.sg_campaign_navigation_disabled_key);
            string.getClass();
            sHToastContainer.k(nasVarA, op5.c(op5Var, string, "You have active bets. Cashout and try again."), 1800L);
        }
    }

    public final void u0() {
        v720 binding;
        this.Y = true;
        ixi ixiVar = (ixi) this.b;
        if (ixiVar == null || (binding = ixiVar.b.getBinding()) == null || binding.B.getVisibility() != 0) {
            return;
        }
        v0();
    }

    /* JADX WARN: Code duplicated, block: B:177:0x034a  */
    /* JADX WARN: Code duplicated, block: B:179:0x034e  */
    /* JADX WARN: Code duplicated, block: B:181:0x0354  */
    /* JADX WARN: Code duplicated, block: B:207:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:209:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:211:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:214:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:258:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:260:0x04af  */
    /* JADX WARN: Code duplicated, block: B:287:0x0525  */
    /* JADX WARN: Code duplicated, block: B:295:0x053a  */
    /* JADX WARN: Code duplicated, block: B:297:0x0544  */
    /* JADX WARN: Code duplicated, block: B:307:0x056a  */
    /* JADX WARN: Code duplicated, block: B:309:0x0570  */
    /* JADX WARN: Code duplicated, block: B:311:0x0574  */
    /* JADX WARN: Code duplicated, block: B:315:0x058e  */
    /* JADX WARN: Code duplicated, block: B:317:0x0594  */
    /* JADX WARN: Code duplicated, block: B:320:0x059f  */
    /* JADX WARN: Code duplicated, block: B:325:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:330:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:335:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:338:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:341:0x0600  */
    /* JADX WARN: Code duplicated, block: B:346:0x0613  */
    /* JADX WARN: Code duplicated, block: B:351:0x062b  */
    /* JADX WARN: Code duplicated, block: B:357:0x0643  */
    /* JADX WARN: Code duplicated, block: B:423:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:425:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:427:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:430:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:435:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:440:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:445:0x0812  */
    /* JADX WARN: Code duplicated, block: B:450:0x0827  */
    /* JADX WARN: Code duplicated, block: B:453:0x0838  */
    /* JADX WARN: Code duplicated, block: B:455:0x083e  */
    /* JADX WARN: Code duplicated, block: B:457:0x0842  */
    /* JADX WARN: Code duplicated, block: B:460:0x085a  */
    /* JADX WARN: Code duplicated, block: B:463:0x0867  */
    /* JADX WARN: Code duplicated, block: B:468:0x087c  */
    /* JADX WARN: Code duplicated, block: B:473:0x0891  */
    /* JADX WARN: Code duplicated, block: B:478:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:483:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:488:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:491:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:494:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:500:0x0905  */
    /* JADX WARN: Code duplicated, block: B:511:0x092c  */
    /* JADX WARN: Code duplicated, block: B:527:0x0964  */
    /* JADX WARN: Code duplicated, block: B:528:0x096b  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:530:0x096e  */
    /* JADX WARN: Code duplicated, block: B:532:0x0974  */
    /* JADX WARN: Code duplicated, block: B:534:0x097c  */
    /* JADX WARN: Code duplicated, block: B:537:0x0985  */
    /* JADX WARN: Code duplicated, block: B:539:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:71:0x0124  */
    /* JADX WARN: Code duplicated, block: B:77:0x013c  */
    public final void u1(MultiplierResponse multiplierResponse) {
        Context context;
        ixi ixiVar;
        ixi ixiVar2;
        ixi ixiVar3;
        ixi ixiVar4;
        ixi ixiVar5;
        ixi ixiVar6;
        ixi ixiVar7;
        ixi ixiVar8;
        v720 binding;
        v720 binding2;
        v720 binding3;
        v720 binding4;
        v720 binding5;
        v720 binding6;
        v720 binding7;
        ixi ixiVar9;
        v720 binding8;
        ixi ixiVar10;
        ixi ixiVar11;
        ixi ixiVar12;
        ixi ixiVar13;
        ixi ixiVar14;
        ixi ixiVar15;
        v720 binding9;
        v720 binding10;
        v720 binding11;
        v720 binding12;
        v720 binding13;
        ixi ixiVar16;
        ixi ixiVar17;
        boolean z2;
        v720 binding14;
        v720 binding15;
        v720 binding16;
        v720 binding17;
        ixi ixiVar18;
        v720 binding18;
        ixi ixiVar19;
        v720 binding19;
        v720 binding20;
        v720 binding21;
        ixi ixiVar20;
        ixi ixiVar21;
        Context context2;
        Context context3;
        ixi ixiVar22;
        ixi ixiVar23;
        ixi ixiVar24;
        ixi ixiVar25;
        ixi ixiVar26;
        TextView textView;
        ixi ixiVar27;
        ixi ixiVar28;
        v720 binding22;
        v720 binding23;
        v720 binding24;
        v720 binding25;
        v720 binding26;
        v720 binding27;
        boolean z3;
        B b2;
        ixi ixiVar29;
        ixi ixiVar30;
        Context context4;
        ixi ixiVar31;
        ixi ixiVar32;
        ixi ixiVar33;
        ixi ixiVar34;
        ixi ixiVar35;
        ixi ixiVar36;
        ixi ixiVar37;
        boolean z4;
        ixi ixiVar38;
        v720 binding28;
        v720 binding29;
        v720 binding30;
        v720 binding31;
        v720 binding32;
        v720 binding33;
        v720 binding34;
        ixi ixiVar39;
        ixi ixiVar40;
        ixi ixiVar41;
        ixi ixiVar42;
        ixi ixiVar43;
        ixi ixiVar44;
        v720 binding35;
        v720 binding36;
        v720 binding37;
        v720 binding38;
        v720 binding39;
        ixi ixiVar45;
        ixi ixiVar46;
        boolean z5;
        v720 binding40;
        v720 binding41;
        v720 binding42;
        v720 binding43;
        ixi ixiVar47;
        v720 binding44;
        v720 binding45;
        v720 binding46;
        ixi ixiVar48;
        ixi ixiVar49;
        Context context5;
        Context context6;
        ixi ixiVar50;
        ixi ixiVar51;
        ixi ixiVar52;
        ixi ixiVar53;
        ixi ixiVar54;
        TextView textView2;
        ixi ixiVar55;
        ixi ixiVar56;
        v720 binding47;
        v720 binding48;
        v720 binding49;
        v720 binding50;
        v720 binding51;
        v720 binding52;
        ixi ixiVar57;
        ixi ixiVar58;
        v720 binding53;
        ixi ixiVar59;
        v720 binding54;
        ixi ixiVar60;
        GiftItem giftItem;
        ixi ixiVar61;
        v720 binding55;
        ixi ixiVar62;
        v720 binding56;
        ixi ixiVar63;
        ixi ixiVar64;
        ixi ixiVar65;
        ixi ixiVar66;
        ixi ixiVar67;
        ixi ixiVar68;
        v720 binding57;
        v720 binding58;
        v720 binding59;
        v720 binding60;
        v720 binding61;
        v720 binding62;
        v720 binding63;
        v720 binding64;
        v720 binding65;
        v720 binding66;
        boolean z6 = this.N;
        B b3 = this.b;
        if (!z6) {
            ixi ixiVar69 = (ixi) b3;
            if (ixiVar69 == null || ixiVar69.b.getBetPlaced() || this.D || this.N) {
                if (Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT") && (ixiVar20 = (ixi) this.b) != null && ixiVar20.b.getBetPlaced() && !this.D && (ixiVar21 = (ixi) this.b) != null) {
                    if (multiplierResponse.getRoundId() == ixiVar21.b.getRoundId()) {
                        context2 = getContext();
                        if (context2 != null) {
                            ixiVar22 = (ixi) this.b;
                            if (ixiVar22 != null && (binding27 = ixiVar22.b.getBinding()) != null) {
                                binding27.v.setVisibility(0);
                            }
                            ixiVar23 = (ixi) this.b;
                            if (ixiVar23 != null && (binding26 = ixiVar23.b.getBinding()) != null) {
                                binding26.B.setVisibility(8);
                            }
                            ixiVar24 = (ixi) this.b;
                            if (ixiVar24 != null && (binding25 = ixiVar24.b.getBinding()) != null) {
                                binding25.v.setBackground(context2.getDrawable(R.drawable.bet_button_pp));
                            }
                            ixiVar25 = (ixi) this.b;
                            if (ixiVar25 != null) {
                                ixiVar25.b.setEnableContainer();
                            }
                            op5 op5Var = op5.a;
                            ixiVar26 = (ixi) this.b;
                            if (ixiVar26 != null || (binding24 = ixiVar26.b.getBinding()) == null) {
                                textView = null;
                            } else {
                                textView = binding24.w;
                            }
                            op5.r(op5Var, kotlin.collections.b.f(textView), null, 4);
                            ixiVar27 = (ixi) this.b;
                            if (ixiVar27 != null && (binding23 = ixiVar27.b.getBinding()) != null) {
                                binding23.q0.setVisibility(8);
                            }
                            ixiVar28 = (ixi) this.b;
                            if (ixiVar28 != null && (binding22 = ixiVar28.b.getBinding()) != null) {
                                binding22.y.setBackground(context2.getDrawable(R.drawable.pp_card_bet));
                            }
                        }
                        if (!this.D0 && this.C0.size() > 0) {
                            Y0();
                        }
                        if (this.h0 && (context3 = getContext()) != null) {
                            Intent intent = new Intent("custom-event-name");
                            intent.putExtra(EventKeys.ERROR_MESSAGE, "");
                            intent.putExtra("betIndex", 1);
                            fdt.a(context3).c(intent);
                        }
                        I0();
                        Unit unit = Unit.a;
                    }
                }
                ixi ixiVar70 = (ixi) this.b;
                if (ixiVar70 == null || !ixiVar70.b.getBetPlaced() || !Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_ONGOING") || Float.parseFloat(multiplierResponse.getMultiplier()) <= 1.0f || (ixiVar16 = (ixi) this.b) == null) {
                    if (this.N) {
                        ixiVar10 = (ixi) this.b;
                        if (ixiVar10 != null) {
                            ixiVar10.b.setEnableContainer();
                            Unit unit2 = Unit.a;
                        }
                        ixiVar11 = (ixi) this.b;
                        if (ixiVar11 != null && (binding13 = ixiVar11.b.getBinding()) != null) {
                            binding13.D.setVisibility(0);
                            Unit unit3 = Unit.a;
                        }
                        ixiVar12 = (ixi) this.b;
                        if (ixiVar12 != null && (binding12 = ixiVar12.b.getBinding()) != null) {
                            binding12.Y.setVisibility(0);
                            Unit unit4 = Unit.a;
                        }
                        ixiVar13 = (ixi) this.b;
                        if (ixiVar13 != null && (binding11 = ixiVar13.b.getBinding()) != null) {
                            binding11.a0.setVisibility(0);
                            Unit unit5 = Unit.a;
                        }
                        ixiVar14 = (ixi) this.b;
                        if (ixiVar14 != null && (binding10 = ixiVar14.b.getBinding()) != null) {
                            binding10.v.setVisibility(8);
                            Unit unit6 = Unit.a;
                        }
                        ixiVar15 = (ixi) this.b;
                        if (ixiVar15 != null && (binding9 = ixiVar15.b.getBinding()) != null) {
                            binding9.q0.setVisibility(8);
                            Unit unit7 = Unit.a;
                        }
                    } else {
                        context = getContext();
                        if (context != null) {
                            ixiVar = (ixi) this.b;
                            if (ixiVar != null) {
                                ixiVar.b.setDisableContainer();
                                Unit unit8 = Unit.a;
                            }
                            if (this.h0) {
                                Intent intent2 = new Intent("custom-event-name");
                                intent2.putExtra(EventKeys.ERROR_MESSAGE, "");
                                intent2.putExtra("betIndex", 1);
                                fdt.a(context).c(intent2);
                                ixiVar9 = (ixi) this.b;
                                if (ixiVar9 != null && (binding8 = ixiVar9.b.getBinding()) != null) {
                                    binding8.v.setVisibility(8);
                                    Unit unit9 = Unit.a;
                                }
                            }
                            ixiVar2 = (ixi) this.b;
                            if (ixiVar2 != null && (binding7 = ixiVar2.b.getBinding()) != null) {
                                binding7.q0.setVisibility(0);
                                Unit unit10 = Unit.a;
                            }
                            ixiVar3 = (ixi) this.b;
                            if (ixiVar3 != null && (binding6 = ixiVar3.b.getBinding()) != null) {
                                binding6.v.setVisibility(8);
                                Unit unit11 = Unit.a;
                            }
                            ixiVar4 = (ixi) this.b;
                            if (ixiVar4 != null && (binding5 = ixiVar4.b.getBinding()) != null) {
                                binding5.B.setVisibility(8);
                                Unit unit12 = Unit.a;
                            }
                            ixiVar5 = (ixi) this.b;
                            if (ixiVar5 != null && (binding4 = ixiVar5.b.getBinding()) != null) {
                                binding4.D.setVisibility(8);
                                Unit unit13 = Unit.a;
                            }
                            ixiVar6 = (ixi) this.b;
                            if (ixiVar6 != null && (binding3 = ixiVar6.b.getBinding()) != null) {
                                binding3.Y.setVisibility(8);
                                Unit unit14 = Unit.a;
                            }
                            ixiVar7 = (ixi) this.b;
                            if (ixiVar7 != null && (binding2 = ixiVar7.b.getBinding()) != null) {
                                binding2.a0.setVisibility(8);
                                Unit unit15 = Unit.a;
                            }
                            ixiVar8 = (ixi) this.b;
                            if (ixiVar8 != null && (binding = ixiVar8.b.getBinding()) != null) {
                                binding.y.setBackground(context.getDrawable(R.drawable.pp_card_waiting));
                                Unit unit16 = Unit.a;
                            }
                            Unit unit17 = Unit.a;
                        }
                    }
                } else if (multiplierResponse.getRoundId() == ixiVar16.b.getRoundId() && (ixiVar17 = (ixi) this.b) != null && !ixiVar17.b.getCashoutDone()) {
                    ixi ixiVar71 = (ixi) this.b;
                    if (ixiVar71 != null) {
                        ixiVar71.b.setDisableContainer();
                        Unit unit18 = Unit.a;
                    }
                    ixi ixiVar72 = (ixi) this.b;
                    if (ixiVar72 != null && (binding21 = ixiVar72.b.getBinding()) != null) {
                        binding21.B.setTextSize(12.0f);
                        Unit unit19 = Unit.a;
                    }
                    Context context7 = getContext();
                    if (context7 != null) {
                        ixi ixiVar73 = (ixi) this.b;
                        if (ixiVar73 != null && (binding20 = ixiVar73.b.getBinding()) != null) {
                            binding20.B.setBackground(context7.getDrawable(R.drawable.cashout_button_sh));
                            Unit unit20 = Unit.a;
                        }
                        Unit unit21 = Unit.a;
                    }
                    if (Build.VERSION.SDK_INT <= 25 && (ixiVar19 = (ixi) this.b) != null && (binding19 = ixiVar19.b.getBinding()) != null) {
                        binding19.B.setTextSize(12.0f);
                        Unit unit22 = Unit.a;
                    }
                    double d2 = Double.parseDouble(multiplierResponse.getMultiplier());
                    ixi ixiVar74 = (ixi) this.b;
                    BigDecimal bigDecimalW0 = w0(d2, ixiVar74 != null ? ixiVar74.b.getBetAmount() : 0.0d);
                    op5 op5Var2 = op5.a;
                    String string = getString(R.string.cash_out_upper_case_cms);
                    string.getClass();
                    String string2 = getString(R.string.cashout_text);
                    string2.getClass();
                    op5Var2.getClass();
                    String strB = op5.b(string, string2, null);
                    ixi ixiVar75 = (ixi) this.b;
                    if (ixiVar75 != null && !ixiVar75.b.getCashoutInProgress() && (ixiVar18 = (ixi) this.b) != null && (binding18 = ixiVar18.b.getBinding()) != null) {
                        binding18.B.setText(strB + "\n" + bigDecimalW0);
                        Unit unit23 = Unit.a;
                    }
                    Context context8 = getContext();
                    if (context8 != null) {
                        if (this.h0) {
                            Intent intent3 = new Intent("custom-event-name");
                            intent3.putExtra(EventKeys.ERROR_MESSAGE, strB + "\n" + bigDecimalW0);
                            intent3.putExtra("betIndex", 1);
                            fdt.a(context8).c(intent3);
                        }
                        ixi ixiVar76 = (ixi) this.b;
                        if (ixiVar76 != null && (binding17 = ixiVar76.b.getBinding()) != null) {
                            binding17.q0.setVisibility(8);
                            Unit unit24 = Unit.a;
                        }
                        ixi ixiVar77 = (ixi) this.b;
                        if (ixiVar77 != null && (binding16 = ixiVar77.b.getBinding()) != null) {
                            binding16.v.setVisibility(8);
                            Unit unit25 = Unit.a;
                        }
                        ixi ixiVar78 = (ixi) this.b;
                        if (ixiVar78 != null && (binding15 = ixiVar78.b.getBinding()) != null) {
                            binding15.B.setVisibility(0);
                            Unit unit26 = Unit.a;
                        }
                        ixi ixiVar79 = (ixi) this.b;
                        if (ixiVar79 != null && (binding14 = ixiVar79.b.getBinding()) != null) {
                            binding14.y.setBackground(context8.getDrawable(R.drawable.pp_card_cashout));
                            Unit unit27 = Unit.a;
                        }
                        Unit unit28 = Unit.a;
                        z2 = true;
                    }
                } else if (this.N) {
                    ixiVar10 = (ixi) this.b;
                    if (ixiVar10 != null) {
                        ixiVar10.b.setEnableContainer();
                        Unit unit29 = Unit.a;
                    }
                    ixiVar11 = (ixi) this.b;
                    if (ixiVar11 != null) {
                        binding13.D.setVisibility(0);
                        Unit unit30 = Unit.a;
                    }
                    ixiVar12 = (ixi) this.b;
                    if (ixiVar12 != null) {
                        binding12.Y.setVisibility(0);
                        Unit unit31 = Unit.a;
                    }
                    ixiVar13 = (ixi) this.b;
                    if (ixiVar13 != null) {
                        binding11.a0.setVisibility(0);
                        Unit unit32 = Unit.a;
                    }
                    ixiVar14 = (ixi) this.b;
                    if (ixiVar14 != null) {
                        binding10.v.setVisibility(8);
                        Unit unit33 = Unit.a;
                    }
                    ixiVar15 = (ixi) this.b;
                    if (ixiVar15 != null) {
                        binding9.q0.setVisibility(8);
                        Unit unit34 = Unit.a;
                    }
                } else {
                    context = getContext();
                    if (context != null) {
                        ixiVar = (ixi) this.b;
                        if (ixiVar != null) {
                            ixiVar.b.setDisableContainer();
                            Unit unit35 = Unit.a;
                        }
                        if (this.h0) {
                            Intent intent4 = new Intent("custom-event-name");
                            intent4.putExtra(EventKeys.ERROR_MESSAGE, "");
                            intent4.putExtra("betIndex", 1);
                            fdt.a(context).c(intent4);
                            ixiVar9 = (ixi) this.b;
                            if (ixiVar9 != null) {
                                binding8.v.setVisibility(8);
                                Unit unit36 = Unit.a;
                            }
                        }
                        ixiVar2 = (ixi) this.b;
                        if (ixiVar2 != null) {
                            binding7.q0.setVisibility(0);
                            Unit unit110 = Unit.a;
                        }
                        ixiVar3 = (ixi) this.b;
                        if (ixiVar3 != null) {
                            binding6.v.setVisibility(8);
                            Unit unit111 = Unit.a;
                        }
                        ixiVar4 = (ixi) this.b;
                        if (ixiVar4 != null) {
                            binding5.B.setVisibility(8);
                            Unit unit112 = Unit.a;
                        }
                        ixiVar5 = (ixi) this.b;
                        if (ixiVar5 != null) {
                            binding4.D.setVisibility(8);
                            Unit unit113 = Unit.a;
                        }
                        ixiVar6 = (ixi) this.b;
                        if (ixiVar6 != null) {
                            binding3.Y.setVisibility(8);
                            Unit unit114 = Unit.a;
                        }
                        ixiVar7 = (ixi) this.b;
                        if (ixiVar7 != null) {
                            binding2.a0.setVisibility(8);
                            Unit unit115 = Unit.a;
                        }
                        ixiVar8 = (ixi) this.b;
                        if (ixiVar8 != null) {
                            binding.y.setBackground(context.getDrawable(R.drawable.pp_card_waiting));
                            Unit unit116 = Unit.a;
                        }
                        Unit unit117 = Unit.a;
                    }
                }
            } else {
                context2 = getContext();
                if (context2 != null) {
                    ixiVar22 = (ixi) this.b;
                    if (ixiVar22 != null) {
                        binding27.v.setVisibility(0);
                    }
                    ixiVar23 = (ixi) this.b;
                    if (ixiVar23 != null) {
                        binding26.B.setVisibility(8);
                    }
                    ixiVar24 = (ixi) this.b;
                    if (ixiVar24 != null) {
                        binding25.v.setBackground(context2.getDrawable(R.drawable.bet_button_pp));
                    }
                    ixiVar25 = (ixi) this.b;
                    if (ixiVar25 != null) {
                        ixiVar25.b.setEnableContainer();
                    }
                    op5 op5Var3 = op5.a;
                    ixiVar26 = (ixi) this.b;
                    if (ixiVar26 != null) {
                        textView = null;
                    } else {
                        textView = null;
                    }
                    op5.r(op5Var3, kotlin.collections.b.f(textView), null, 4);
                    ixiVar27 = (ixi) this.b;
                    if (ixiVar27 != null) {
                        binding23.q0.setVisibility(8);
                    }
                    ixiVar28 = (ixi) this.b;
                    if (ixiVar28 != null) {
                        binding22.y.setBackground(context2.getDrawable(R.drawable.pp_card_bet));
                    }
                }
                if (!this.D0) {
                    Y0();
                }
                if (this.h0) {
                    Intent intent5 = new Intent("custom-event-name");
                    intent5.putExtra(EventKeys.ERROR_MESSAGE, "");
                    intent5.putExtra("betIndex", 1);
                    fdt.a(context3).c(intent5);
                }
                I0();
                Unit unit37 = Unit.a;
            }
            z3 = this.O;
            b2 = this.b;
            if (z3) {
                ixiVar29 = (ixi) b2;
                if (ixiVar29 != null || ixiVar29.c.getBetPlaced() || this.H || this.O) {
                    if (Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT") && (ixiVar48 = (ixi) this.b) != null && ixiVar48.c.getBetPlaced() && !this.H && (ixiVar49 = (ixi) this.b) != null) {
                        if (multiplierResponse.getRoundId() == ixiVar49.c.getRoundId()) {
                            context5 = getContext();
                            if (context5 != null) {
                                if (this.h0) {
                                    Intent intent6 = new Intent("custom-event-name");
                                    intent6.putExtra(EventKeys.ERROR_MESSAGE, "");
                                    intent6.putExtra("betIndex", 2);
                                    fdt.a(context5).c(intent6);
                                }
                                Unit unit38 = Unit.a;
                            }
                            context6 = getContext();
                            if (context6 != null) {
                                ixiVar50 = (ixi) this.b;
                                if (ixiVar50 != null) {
                                    ixiVar50.c.setEnableContainer();
                                }
                                ixiVar51 = (ixi) this.b;
                                if (ixiVar51 != null && (binding52 = ixiVar51.c.getBinding()) != null) {
                                    binding52.v.setVisibility(0);
                                }
                                ixiVar52 = (ixi) this.b;
                                if (ixiVar52 != null && (binding51 = ixiVar52.c.getBinding()) != null) {
                                    binding51.B.setVisibility(8);
                                }
                                ixiVar53 = (ixi) this.b;
                                if (ixiVar53 != null && (binding50 = ixiVar53.c.getBinding()) != null) {
                                    binding50.v.setBackground(context6.getDrawable(R.drawable.bet_button_pp));
                                }
                                op5 op5Var4 = op5.a;
                                ixiVar54 = (ixi) this.b;
                                if (ixiVar54 != null || (binding49 = ixiVar54.c.getBinding()) == null) {
                                    textView2 = null;
                                } else {
                                    textView2 = binding49.w;
                                }
                                op5.r(op5Var4, kotlin.collections.b.f(textView2), null, 4);
                                ixiVar55 = (ixi) this.b;
                                if (ixiVar55 != null && (binding48 = ixiVar55.c.getBinding()) != null) {
                                    binding48.q0.setVisibility(8);
                                }
                                ixiVar56 = (ixi) this.b;
                                if (ixiVar56 != null && (binding47 = ixiVar56.c.getBinding()) != null) {
                                    binding47.y.setBackground(context6.getDrawable(R.drawable.pp_card_bet));
                                }
                                if (!this.D0 && this.C0.size() > 0) {
                                    Y0();
                                }
                            }
                            I0();
                            Unit unit39 = Unit.a;
                        }
                    }
                    ixiVar30 = (ixi) this.b;
                    if (ixiVar30 == null && ixiVar30.c.getBetPlaced() && Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_ONGOING") && Float.parseFloat(multiplierResponse.getMultiplier()) > 1.0f && (ixiVar45 = (ixi) this.b) != null) {
                        if (multiplierResponse.getRoundId() == ixiVar45.c.getRoundId() && (ixiVar46 = (ixi) this.b) != null && !ixiVar46.c.getCashoutDone()) {
                            Context context9 = getContext();
                            if (context9 != null) {
                                ixi ixiVar80 = (ixi) this.b;
                                if (ixiVar80 != null) {
                                    ixiVar80.c.setDisableContainer();
                                    Unit unit40 = Unit.a;
                                }
                                ixi ixiVar81 = (ixi) this.b;
                                if (ixiVar81 != null && (binding46 = ixiVar81.c.getBinding()) != null) {
                                    binding46.B.setTextSize(12.0f);
                                    Unit unit41 = Unit.a;
                                }
                                ixi ixiVar82 = (ixi) this.b;
                                if (ixiVar82 != null && (binding45 = ixiVar82.c.getBinding()) != null) {
                                    binding45.B.setBackground(context9.getDrawable(R.drawable.cashout_button_sh));
                                    Unit unit42 = Unit.a;
                                }
                                double d3 = Double.parseDouble(multiplierResponse.getMultiplier());
                                ixi ixiVar83 = (ixi) this.b;
                                BigDecimal bigDecimalW1 = w0(d3, ixiVar83 != null ? ixiVar83.c.getBetAmount() : 0.0d);
                                op5 op5Var5 = op5.a;
                                String string3 = getString(R.string.cash_out_upper_case_cms);
                                string3.getClass();
                                String string4 = getString(R.string.cashout_text);
                                string4.getClass();
                                op5Var5.getClass();
                                String strB2 = op5.b(string3, string4, null);
                                ixi ixiVar84 = (ixi) this.b;
                                if (ixiVar84 != null && !ixiVar84.c.getCashoutInProgress() && (ixiVar47 = (ixi) this.b) != null && (binding44 = ixiVar47.c.getBinding()) != null) {
                                    binding44.B.setText(strB2 + "\n" + bigDecimalW1);
                                    Unit unit43 = Unit.a;
                                }
                                if (this.h0) {
                                    Intent intent7 = new Intent("custom-event-name");
                                    intent7.putExtra(EventKeys.ERROR_MESSAGE, strB2 + "\n" + bigDecimalW1);
                                    intent7.putExtra("betIndex", 2);
                                    fdt.a(context9).c(intent7);
                                }
                                ixi ixiVar85 = (ixi) this.b;
                                if (ixiVar85 != null && (binding43 = ixiVar85.c.getBinding()) != null) {
                                    binding43.q0.setVisibility(8);
                                    Unit unit44 = Unit.a;
                                }
                                ixi ixiVar86 = (ixi) this.b;
                                if (ixiVar86 != null && (binding42 = ixiVar86.c.getBinding()) != null) {
                                    binding42.v.setVisibility(8);
                                    Unit unit45 = Unit.a;
                                }
                                ixi ixiVar87 = (ixi) this.b;
                                if (ixiVar87 != null && (binding41 = ixiVar87.c.getBinding()) != null) {
                                    binding41.B.setVisibility(0);
                                    Unit unit46 = Unit.a;
                                }
                                ixi ixiVar88 = (ixi) this.b;
                                if (ixiVar88 != null && (binding40 = ixiVar88.c.getBinding()) != null) {
                                    binding40.y.setBackground(context9.getDrawable(R.drawable.pp_card_cashout));
                                    Unit unit47 = Unit.a;
                                }
                                Unit unit48 = Unit.a;
                                z5 = true;
                            }
                        } else if (this.O) {
                            ixiVar39 = (ixi) this.b;
                            if (ixiVar39 != null) {
                                ixiVar39.c.setEnableContainer();
                                Unit unit49 = Unit.a;
                            }
                            ixiVar40 = (ixi) this.b;
                            if (ixiVar40 != null) {
                                binding39.D.setVisibility(0);
                                Unit unit50 = Unit.a;
                            }
                            ixiVar41 = (ixi) this.b;
                            if (ixiVar41 != null) {
                                binding38.Y.setVisibility(0);
                                Unit unit51 = Unit.a;
                            }
                            ixiVar42 = (ixi) this.b;
                            if (ixiVar42 != null) {
                                binding37.a0.setVisibility(0);
                                Unit unit52 = Unit.a;
                            }
                            ixiVar43 = (ixi) this.b;
                            if (ixiVar43 != null) {
                                binding36.v.setVisibility(8);
                                Unit unit53 = Unit.a;
                            }
                            ixiVar44 = (ixi) this.b;
                            if (ixiVar44 != null) {
                                binding35.q0.setVisibility(8);
                                Unit unit54 = Unit.a;
                            }
                        } else {
                            context4 = getContext();
                            if (context4 != null) {
                                if (this.h0) {
                                    Intent intent8 = new Intent("custom-event-name");
                                    intent8.putExtra(EventKeys.ERROR_MESSAGE, "");
                                    intent8.putExtra("betIndex", 2);
                                    fdt.a(context4).c(intent8);
                                }
                                ixiVar31 = (ixi) this.b;
                                if (ixiVar31 != null) {
                                    ixiVar31.c.setDisableContainer();
                                    Unit unit55 = Unit.a;
                                }
                                ixiVar32 = (ixi) this.b;
                                if (ixiVar32 != null) {
                                    binding34.D.setVisibility(8);
                                    Unit unit56 = Unit.a;
                                }
                                ixiVar33 = (ixi) this.b;
                                if (ixiVar33 != null) {
                                    binding33.Y.setVisibility(8);
                                    Unit unit57 = Unit.a;
                                }
                                ixiVar34 = (ixi) this.b;
                                if (ixiVar34 != null) {
                                    binding32.a0.setVisibility(8);
                                    Unit unit58 = Unit.a;
                                }
                                ixiVar35 = (ixi) this.b;
                                if (ixiVar35 != null) {
                                    binding31.v.setVisibility(8);
                                    Unit unit59 = Unit.a;
                                }
                                ixiVar36 = (ixi) this.b;
                                if (ixiVar36 != null) {
                                    binding30.B.setVisibility(8);
                                    Unit unit60 = Unit.a;
                                }
                                ixiVar37 = (ixi) this.b;
                                if (ixiVar37 != null) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                ixiVar38 = (ixi) this.b;
                                if (ixiVar38 != null) {
                                    binding28.y.setBackground(context4.getDrawable(R.drawable.pp_card_waiting));
                                    Unit unit61 = Unit.a;
                                }
                            }
                            z5 = z4;
                        }
                    } else if (this.O) {
                        ixiVar39 = (ixi) this.b;
                        if (ixiVar39 != null) {
                            ixiVar39.c.setEnableContainer();
                            Unit unit410 = Unit.a;
                        }
                        ixiVar40 = (ixi) this.b;
                        if (ixiVar40 != null && (binding39 = ixiVar40.c.getBinding()) != null) {
                            binding39.D.setVisibility(0);
                            Unit unit510 = Unit.a;
                        }
                        ixiVar41 = (ixi) this.b;
                        if (ixiVar41 != null && (binding38 = ixiVar41.c.getBinding()) != null) {
                            binding38.Y.setVisibility(0);
                            Unit unit511 = Unit.a;
                        }
                        ixiVar42 = (ixi) this.b;
                        if (ixiVar42 != null && (binding37 = ixiVar42.c.getBinding()) != null) {
                            binding37.a0.setVisibility(0);
                            Unit unit512 = Unit.a;
                        }
                        ixiVar43 = (ixi) this.b;
                        if (ixiVar43 != null && (binding36 = ixiVar43.c.getBinding()) != null) {
                            binding36.v.setVisibility(8);
                            Unit unit513 = Unit.a;
                        }
                        ixiVar44 = (ixi) this.b;
                        if (ixiVar44 != null && (binding35 = ixiVar44.c.getBinding()) != null) {
                            binding35.q0.setVisibility(8);
                            Unit unit514 = Unit.a;
                        }
                    } else {
                        context4 = getContext();
                        if (context4 != null) {
                            if (this.h0) {
                                Intent intent9 = new Intent("custom-event-name");
                                intent9.putExtra(EventKeys.ERROR_MESSAGE, "");
                                intent9.putExtra("betIndex", 2);
                                fdt.a(context4).c(intent9);
                            }
                            ixiVar31 = (ixi) this.b;
                            if (ixiVar31 != null) {
                                ixiVar31.c.setDisableContainer();
                                Unit unit515 = Unit.a;
                            }
                            ixiVar32 = (ixi) this.b;
                            if (ixiVar32 != null && (binding34 = ixiVar32.c.getBinding()) != null) {
                                binding34.D.setVisibility(8);
                                Unit unit516 = Unit.a;
                            }
                            ixiVar33 = (ixi) this.b;
                            if (ixiVar33 != null && (binding33 = ixiVar33.c.getBinding()) != null) {
                                binding33.Y.setVisibility(8);
                                Unit unit517 = Unit.a;
                            }
                            ixiVar34 = (ixi) this.b;
                            if (ixiVar34 != null && (binding32 = ixiVar34.c.getBinding()) != null) {
                                binding32.a0.setVisibility(8);
                                Unit unit518 = Unit.a;
                            }
                            ixiVar35 = (ixi) this.b;
                            if (ixiVar35 != null && (binding31 = ixiVar35.c.getBinding()) != null) {
                                binding31.v.setVisibility(8);
                                Unit unit519 = Unit.a;
                            }
                            ixiVar36 = (ixi) this.b;
                            if (ixiVar36 != null && (binding30 = ixiVar36.c.getBinding()) != null) {
                                binding30.B.setVisibility(8);
                                Unit unit62 = Unit.a;
                            }
                            ixiVar37 = (ixi) this.b;
                            if (ixiVar37 != null || (binding29 = ixiVar37.c.getBinding()) == null) {
                                z4 = false;
                            } else {
                                z4 = false;
                                binding29.q0.setVisibility(0);
                                Unit unit63 = Unit.a;
                            }
                            ixiVar38 = (ixi) this.b;
                            if (ixiVar38 != null && (binding28 = ixiVar38.c.getBinding()) != null) {
                                binding28.y.setBackground(context4.getDrawable(R.drawable.pp_card_waiting));
                                Unit unit64 = Unit.a;
                            }
                        }
                        z5 = z4;
                    }
                } else {
                    context5 = getContext();
                    if (context5 != null) {
                        if (this.h0) {
                            Intent intent10 = new Intent("custom-event-name");
                            intent10.putExtra(EventKeys.ERROR_MESSAGE, "");
                            intent10.putExtra("betIndex", 2);
                            fdt.a(context5).c(intent10);
                        }
                        Unit unit310 = Unit.a;
                    }
                    context6 = getContext();
                    if (context6 != null) {
                        ixiVar50 = (ixi) this.b;
                        if (ixiVar50 != null) {
                            ixiVar50.c.setEnableContainer();
                        }
                        ixiVar51 = (ixi) this.b;
                        if (ixiVar51 != null) {
                            binding52.v.setVisibility(0);
                        }
                        ixiVar52 = (ixi) this.b;
                        if (ixiVar52 != null) {
                            binding51.B.setVisibility(8);
                        }
                        ixiVar53 = (ixi) this.b;
                        if (ixiVar53 != null) {
                            binding50.v.setBackground(context6.getDrawable(R.drawable.bet_button_pp));
                        }
                        op5 op5Var6 = op5.a;
                        ixiVar54 = (ixi) this.b;
                        if (ixiVar54 != null) {
                            textView2 = null;
                        } else {
                            textView2 = null;
                        }
                        op5.r(op5Var6, kotlin.collections.b.f(textView2), null, 4);
                        ixiVar55 = (ixi) this.b;
                        if (ixiVar55 != null) {
                            binding48.q0.setVisibility(8);
                        }
                        ixiVar56 = (ixi) this.b;
                        if (ixiVar56 != null) {
                            binding47.y.setBackground(context6.getDrawable(R.drawable.pp_card_bet));
                        }
                        if (!this.D0) {
                            Y0();
                        }
                    }
                    I0();
                    Unit unit311 = Unit.a;
                }
                ixiVar57 = (ixi) this.b;
                if (((ixiVar57 == null && (binding55 = ixiVar57.b.getBinding()) != null && binding55.q0.getVisibility() == 0 && (ixiVar62 = (ixi) this.b) != null && (binding56 = ixiVar62.c.getBinding()) != null && binding56.q0.getVisibility() == 0) || ((ixiVar58 = (ixi) this.b) != null && (binding53 = ixiVar58.b.getBinding()) != null && binding53.B.getVisibility() == 0 && (ixiVar59 = (ixi) this.b) != null && (binding54 = ixiVar59.c.getBinding()) != null && binding54.B.getVisibility() == 0)) && this.Q0 == this.P0) {
                    ixiVar60 = (ixi) this.b;
                    if (ixiVar60 != null) {
                        giftItem = ixiVar60.b.getGiftItem();
                    } else {
                        giftItem = null;
                    }
                    if (giftItem != null) {
                        E0();
                    } else {
                        ixiVar61 = (ixi) this.b;
                        if ((ixiVar61 != null ? ixiVar61.c.getGiftItem() : null) != null) {
                            E0();
                        }
                    }
                }
                if (isRemoving()) {
                }
                X0(this, z2, z5, 1);
            }
            ixiVar63 = (ixi) b2;
            if (ixiVar63 != null) {
                ixiVar63.c.setEnableContainer();
                Unit unit65 = Unit.a;
            }
            ixiVar64 = (ixi) this.b;
            if (ixiVar64 != null && (binding61 = ixiVar64.c.getBinding()) != null) {
                binding61.D.setVisibility(0);
                Unit unit66 = Unit.a;
            }
            ixiVar65 = (ixi) this.b;
            if (ixiVar65 != null && (binding60 = ixiVar65.c.getBinding()) != null) {
                binding60.Y.setVisibility(0);
                Unit unit67 = Unit.a;
            }
            ixiVar66 = (ixi) this.b;
            if (ixiVar66 != null && (binding59 = ixiVar66.c.getBinding()) != null) {
                binding59.a0.setVisibility(0);
                Unit unit68 = Unit.a;
            }
            ixiVar67 = (ixi) this.b;
            if (ixiVar67 != null && (binding58 = ixiVar67.c.getBinding()) != null) {
                binding58.v.setVisibility(8);
                Unit unit69 = Unit.a;
            }
            ixiVar68 = (ixi) this.b;
            if (ixiVar68 != null && (binding57 = ixiVar68.c.getBinding()) != null) {
                binding57.q0.setVisibility(8);
                Unit unit70 = Unit.a;
            }
            z4 = false;
            z5 = z4;
            ixiVar57 = (ixi) this.b;
            if (ixiVar57 == null) {
                ixiVar60 = (ixi) this.b;
                if (ixiVar60 != null) {
                    giftItem = ixiVar60.b.getGiftItem();
                } else {
                    giftItem = null;
                }
                if (giftItem != null) {
                    E0();
                } else {
                    ixiVar61 = (ixi) this.b;
                    if ((ixiVar61 != null ? ixiVar61.c.getGiftItem() : null) != null) {
                        E0();
                    }
                }
            } else {
                ixiVar60 = (ixi) this.b;
                if (ixiVar60 != null) {
                    giftItem = ixiVar60.b.getGiftItem();
                } else {
                    giftItem = null;
                }
                if (giftItem != null) {
                    E0();
                } else {
                    ixiVar61 = (ixi) this.b;
                    if ((ixiVar61 != null ? ixiVar61.c.getGiftItem() : null) != null) {
                        E0();
                    }
                }
            }
            if (isRemoving()) {
                X0(this, z2, z5, 1);
            }
        }
        ixi ixiVar89 = (ixi) b3;
        if (ixiVar89 != null) {
            ixiVar89.b.setEnableContainer();
            Unit unit71 = Unit.a;
        }
        ixi ixiVar90 = (ixi) this.b;
        if (ixiVar90 != null && (binding66 = ixiVar90.b.getBinding()) != null) {
            binding66.D.setVisibility(0);
            Unit unit72 = Unit.a;
        }
        ixi ixiVar91 = (ixi) this.b;
        if (ixiVar91 != null && (binding65 = ixiVar91.b.getBinding()) != null) {
            binding65.Y.setVisibility(0);
            Unit unit73 = Unit.a;
        }
        ixi ixiVar92 = (ixi) this.b;
        if (ixiVar92 != null && (binding64 = ixiVar92.b.getBinding()) != null) {
            binding64.a0.setVisibility(0);
            Unit unit74 = Unit.a;
        }
        ixi ixiVar93 = (ixi) this.b;
        if (ixiVar93 != null && (binding63 = ixiVar93.b.getBinding()) != null) {
            binding63.v.setVisibility(8);
            Unit unit75 = Unit.a;
        }
        ixi ixiVar94 = (ixi) this.b;
        if (ixiVar94 != null && (binding62 = ixiVar94.b.getBinding()) != null) {
            binding62.q0.setVisibility(8);
            Unit unit76 = Unit.a;
        }
        z2 = false;
        z3 = this.O;
        b2 = this.b;
        if (z3) {
            ixiVar29 = (ixi) b2;
            if (ixiVar29 != null) {
                if (Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT")) {
                    if (multiplierResponse.getRoundId() == ixiVar49.c.getRoundId()) {
                        context5 = getContext();
                        if (context5 != null) {
                            if (this.h0) {
                                Intent intent11 = new Intent("custom-event-name");
                                intent11.putExtra(EventKeys.ERROR_MESSAGE, "");
                                intent11.putExtra("betIndex", 2);
                                fdt.a(context5).c(intent11);
                            }
                            Unit unit312 = Unit.a;
                        }
                        context6 = getContext();
                        if (context6 != null) {
                            ixiVar50 = (ixi) this.b;
                            if (ixiVar50 != null) {
                                ixiVar50.c.setEnableContainer();
                            }
                            ixiVar51 = (ixi) this.b;
                            if (ixiVar51 != null) {
                                binding52.v.setVisibility(0);
                            }
                            ixiVar52 = (ixi) this.b;
                            if (ixiVar52 != null) {
                                binding51.B.setVisibility(8);
                            }
                            ixiVar53 = (ixi) this.b;
                            if (ixiVar53 != null) {
                                binding50.v.setBackground(context6.getDrawable(R.drawable.bet_button_pp));
                            }
                            op5 op5Var7 = op5.a;
                            ixiVar54 = (ixi) this.b;
                            if (ixiVar54 != null) {
                                textView2 = null;
                            } else {
                                textView2 = null;
                            }
                            op5.r(op5Var7, kotlin.collections.b.f(textView2), null, 4);
                            ixiVar55 = (ixi) this.b;
                            if (ixiVar55 != null) {
                                binding48.q0.setVisibility(8);
                            }
                            ixiVar56 = (ixi) this.b;
                            if (ixiVar56 != null) {
                                binding47.y.setBackground(context6.getDrawable(R.drawable.pp_card_bet));
                            }
                            if (!this.D0) {
                                Y0();
                            }
                        }
                        I0();
                        Unit unit313 = Unit.a;
                    }
                }
                ixiVar30 = (ixi) this.b;
                if (ixiVar30 == null) {
                    if (this.O) {
                        ixiVar39 = (ixi) this.b;
                        if (ixiVar39 != null) {
                            ixiVar39.c.setEnableContainer();
                            Unit unit411 = Unit.a;
                        }
                        ixiVar40 = (ixi) this.b;
                        if (ixiVar40 != null) {
                            binding39.D.setVisibility(0);
                            Unit unit5110 = Unit.a;
                        }
                        ixiVar41 = (ixi) this.b;
                        if (ixiVar41 != null) {
                            binding38.Y.setVisibility(0);
                            Unit unit5111 = Unit.a;
                        }
                        ixiVar42 = (ixi) this.b;
                        if (ixiVar42 != null) {
                            binding37.a0.setVisibility(0);
                            Unit unit5112 = Unit.a;
                        }
                        ixiVar43 = (ixi) this.b;
                        if (ixiVar43 != null) {
                            binding36.v.setVisibility(8);
                            Unit unit5113 = Unit.a;
                        }
                        ixiVar44 = (ixi) this.b;
                        if (ixiVar44 != null) {
                            binding35.q0.setVisibility(8);
                            Unit unit5114 = Unit.a;
                        }
                    } else {
                        context4 = getContext();
                        if (context4 != null) {
                            if (this.h0) {
                                Intent intent12 = new Intent("custom-event-name");
                                intent12.putExtra(EventKeys.ERROR_MESSAGE, "");
                                intent12.putExtra("betIndex", 2);
                                fdt.a(context4).c(intent12);
                            }
                            ixiVar31 = (ixi) this.b;
                            if (ixiVar31 != null) {
                                ixiVar31.c.setDisableContainer();
                                Unit unit5115 = Unit.a;
                            }
                            ixiVar32 = (ixi) this.b;
                            if (ixiVar32 != null) {
                                binding34.D.setVisibility(8);
                                Unit unit5116 = Unit.a;
                            }
                            ixiVar33 = (ixi) this.b;
                            if (ixiVar33 != null) {
                                binding33.Y.setVisibility(8);
                                Unit unit5117 = Unit.a;
                            }
                            ixiVar34 = (ixi) this.b;
                            if (ixiVar34 != null) {
                                binding32.a0.setVisibility(8);
                                Unit unit5118 = Unit.a;
                            }
                            ixiVar35 = (ixi) this.b;
                            if (ixiVar35 != null) {
                                binding31.v.setVisibility(8);
                                Unit unit5119 = Unit.a;
                            }
                            ixiVar36 = (ixi) this.b;
                            if (ixiVar36 != null) {
                                binding30.B.setVisibility(8);
                                Unit unit610 = Unit.a;
                            }
                            ixiVar37 = (ixi) this.b;
                            if (ixiVar37 != null) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            ixiVar38 = (ixi) this.b;
                            if (ixiVar38 != null) {
                                binding28.y.setBackground(context4.getDrawable(R.drawable.pp_card_waiting));
                                Unit unit611 = Unit.a;
                            }
                        }
                        z5 = z4;
                    }
                } else if (this.O) {
                    ixiVar39 = (ixi) this.b;
                    if (ixiVar39 != null) {
                        ixiVar39.c.setEnableContainer();
                        Unit unit412 = Unit.a;
                    }
                    ixiVar40 = (ixi) this.b;
                    if (ixiVar40 != null) {
                        binding39.D.setVisibility(0);
                        Unit unit51110 = Unit.a;
                    }
                    ixiVar41 = (ixi) this.b;
                    if (ixiVar41 != null) {
                        binding38.Y.setVisibility(0);
                        Unit unit51111 = Unit.a;
                    }
                    ixiVar42 = (ixi) this.b;
                    if (ixiVar42 != null) {
                        binding37.a0.setVisibility(0);
                        Unit unit51112 = Unit.a;
                    }
                    ixiVar43 = (ixi) this.b;
                    if (ixiVar43 != null) {
                        binding36.v.setVisibility(8);
                        Unit unit51113 = Unit.a;
                    }
                    ixiVar44 = (ixi) this.b;
                    if (ixiVar44 != null) {
                        binding35.q0.setVisibility(8);
                        Unit unit51114 = Unit.a;
                    }
                } else {
                    context4 = getContext();
                    if (context4 != null) {
                        if (this.h0) {
                            Intent intent13 = new Intent("custom-event-name");
                            intent13.putExtra(EventKeys.ERROR_MESSAGE, "");
                            intent13.putExtra("betIndex", 2);
                            fdt.a(context4).c(intent13);
                        }
                        ixiVar31 = (ixi) this.b;
                        if (ixiVar31 != null) {
                            ixiVar31.c.setDisableContainer();
                            Unit unit51115 = Unit.a;
                        }
                        ixiVar32 = (ixi) this.b;
                        if (ixiVar32 != null) {
                            binding34.D.setVisibility(8);
                            Unit unit51116 = Unit.a;
                        }
                        ixiVar33 = (ixi) this.b;
                        if (ixiVar33 != null) {
                            binding33.Y.setVisibility(8);
                            Unit unit51117 = Unit.a;
                        }
                        ixiVar34 = (ixi) this.b;
                        if (ixiVar34 != null) {
                            binding32.a0.setVisibility(8);
                            Unit unit51118 = Unit.a;
                        }
                        ixiVar35 = (ixi) this.b;
                        if (ixiVar35 != null) {
                            binding31.v.setVisibility(8);
                            Unit unit51119 = Unit.a;
                        }
                        ixiVar36 = (ixi) this.b;
                        if (ixiVar36 != null) {
                            binding30.B.setVisibility(8);
                            Unit unit612 = Unit.a;
                        }
                        ixiVar37 = (ixi) this.b;
                        if (ixiVar37 != null) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        ixiVar38 = (ixi) this.b;
                        if (ixiVar38 != null) {
                            binding28.y.setBackground(context4.getDrawable(R.drawable.pp_card_waiting));
                            Unit unit613 = Unit.a;
                        }
                    }
                    z5 = z4;
                }
            } else {
                if (Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT")) {
                    if (multiplierResponse.getRoundId() == ixiVar49.c.getRoundId()) {
                        context5 = getContext();
                        if (context5 != null) {
                            if (this.h0) {
                                Intent intent14 = new Intent("custom-event-name");
                                intent14.putExtra(EventKeys.ERROR_MESSAGE, "");
                                intent14.putExtra("betIndex", 2);
                                fdt.a(context5).c(intent14);
                            }
                            Unit unit314 = Unit.a;
                        }
                        context6 = getContext();
                        if (context6 != null) {
                            ixiVar50 = (ixi) this.b;
                            if (ixiVar50 != null) {
                                ixiVar50.c.setEnableContainer();
                            }
                            ixiVar51 = (ixi) this.b;
                            if (ixiVar51 != null) {
                                binding52.v.setVisibility(0);
                            }
                            ixiVar52 = (ixi) this.b;
                            if (ixiVar52 != null) {
                                binding51.B.setVisibility(8);
                            }
                            ixiVar53 = (ixi) this.b;
                            if (ixiVar53 != null) {
                                binding50.v.setBackground(context6.getDrawable(R.drawable.bet_button_pp));
                            }
                            op5 op5Var8 = op5.a;
                            ixiVar54 = (ixi) this.b;
                            if (ixiVar54 != null) {
                                textView2 = null;
                            } else {
                                textView2 = null;
                            }
                            op5.r(op5Var8, kotlin.collections.b.f(textView2), null, 4);
                            ixiVar55 = (ixi) this.b;
                            if (ixiVar55 != null) {
                                binding48.q0.setVisibility(8);
                            }
                            ixiVar56 = (ixi) this.b;
                            if (ixiVar56 != null) {
                                binding47.y.setBackground(context6.getDrawable(R.drawable.pp_card_bet));
                            }
                            if (!this.D0) {
                                Y0();
                            }
                        }
                        I0();
                        Unit unit315 = Unit.a;
                    }
                }
                ixiVar30 = (ixi) this.b;
                if (ixiVar30 == null) {
                    if (this.O) {
                        ixiVar39 = (ixi) this.b;
                        if (ixiVar39 != null) {
                            ixiVar39.c.setEnableContainer();
                            Unit unit413 = Unit.a;
                        }
                        ixiVar40 = (ixi) this.b;
                        if (ixiVar40 != null) {
                            binding39.D.setVisibility(0);
                            Unit unit511110 = Unit.a;
                        }
                        ixiVar41 = (ixi) this.b;
                        if (ixiVar41 != null) {
                            binding38.Y.setVisibility(0);
                            Unit unit511111 = Unit.a;
                        }
                        ixiVar42 = (ixi) this.b;
                        if (ixiVar42 != null) {
                            binding37.a0.setVisibility(0);
                            Unit unit511112 = Unit.a;
                        }
                        ixiVar43 = (ixi) this.b;
                        if (ixiVar43 != null) {
                            binding36.v.setVisibility(8);
                            Unit unit511113 = Unit.a;
                        }
                        ixiVar44 = (ixi) this.b;
                        if (ixiVar44 != null) {
                            binding35.q0.setVisibility(8);
                            Unit unit511114 = Unit.a;
                        }
                    } else {
                        context4 = getContext();
                        if (context4 != null) {
                            if (this.h0) {
                                Intent intent15 = new Intent("custom-event-name");
                                intent15.putExtra(EventKeys.ERROR_MESSAGE, "");
                                intent15.putExtra("betIndex", 2);
                                fdt.a(context4).c(intent15);
                            }
                            ixiVar31 = (ixi) this.b;
                            if (ixiVar31 != null) {
                                ixiVar31.c.setDisableContainer();
                                Unit unit511115 = Unit.a;
                            }
                            ixiVar32 = (ixi) this.b;
                            if (ixiVar32 != null) {
                                binding34.D.setVisibility(8);
                                Unit unit511116 = Unit.a;
                            }
                            ixiVar33 = (ixi) this.b;
                            if (ixiVar33 != null) {
                                binding33.Y.setVisibility(8);
                                Unit unit511117 = Unit.a;
                            }
                            ixiVar34 = (ixi) this.b;
                            if (ixiVar34 != null) {
                                binding32.a0.setVisibility(8);
                                Unit unit511118 = Unit.a;
                            }
                            ixiVar35 = (ixi) this.b;
                            if (ixiVar35 != null) {
                                binding31.v.setVisibility(8);
                                Unit unit511119 = Unit.a;
                            }
                            ixiVar36 = (ixi) this.b;
                            if (ixiVar36 != null) {
                                binding30.B.setVisibility(8);
                                Unit unit614 = Unit.a;
                            }
                            ixiVar37 = (ixi) this.b;
                            if (ixiVar37 != null) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            ixiVar38 = (ixi) this.b;
                            if (ixiVar38 != null) {
                                binding28.y.setBackground(context4.getDrawable(R.drawable.pp_card_waiting));
                                Unit unit615 = Unit.a;
                            }
                        }
                        z5 = z4;
                    }
                } else if (this.O) {
                    ixiVar39 = (ixi) this.b;
                    if (ixiVar39 != null) {
                        ixiVar39.c.setEnableContainer();
                        Unit unit414 = Unit.a;
                    }
                    ixiVar40 = (ixi) this.b;
                    if (ixiVar40 != null) {
                        binding39.D.setVisibility(0);
                        Unit unit5111110 = Unit.a;
                    }
                    ixiVar41 = (ixi) this.b;
                    if (ixiVar41 != null) {
                        binding38.Y.setVisibility(0);
                        Unit unit5111111 = Unit.a;
                    }
                    ixiVar42 = (ixi) this.b;
                    if (ixiVar42 != null) {
                        binding37.a0.setVisibility(0);
                        Unit unit5111112 = Unit.a;
                    }
                    ixiVar43 = (ixi) this.b;
                    if (ixiVar43 != null) {
                        binding36.v.setVisibility(8);
                        Unit unit5111113 = Unit.a;
                    }
                    ixiVar44 = (ixi) this.b;
                    if (ixiVar44 != null) {
                        binding35.q0.setVisibility(8);
                        Unit unit5111114 = Unit.a;
                    }
                } else {
                    context4 = getContext();
                    if (context4 != null) {
                        if (this.h0) {
                            Intent intent16 = new Intent("custom-event-name");
                            intent16.putExtra(EventKeys.ERROR_MESSAGE, "");
                            intent16.putExtra("betIndex", 2);
                            fdt.a(context4).c(intent16);
                        }
                        ixiVar31 = (ixi) this.b;
                        if (ixiVar31 != null) {
                            ixiVar31.c.setDisableContainer();
                            Unit unit5111115 = Unit.a;
                        }
                        ixiVar32 = (ixi) this.b;
                        if (ixiVar32 != null) {
                            binding34.D.setVisibility(8);
                            Unit unit5111116 = Unit.a;
                        }
                        ixiVar33 = (ixi) this.b;
                        if (ixiVar33 != null) {
                            binding33.Y.setVisibility(8);
                            Unit unit5111117 = Unit.a;
                        }
                        ixiVar34 = (ixi) this.b;
                        if (ixiVar34 != null) {
                            binding32.a0.setVisibility(8);
                            Unit unit5111118 = Unit.a;
                        }
                        ixiVar35 = (ixi) this.b;
                        if (ixiVar35 != null) {
                            binding31.v.setVisibility(8);
                            Unit unit5111119 = Unit.a;
                        }
                        ixiVar36 = (ixi) this.b;
                        if (ixiVar36 != null) {
                            binding30.B.setVisibility(8);
                            Unit unit616 = Unit.a;
                        }
                        ixiVar37 = (ixi) this.b;
                        if (ixiVar37 != null) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        ixiVar38 = (ixi) this.b;
                        if (ixiVar38 != null) {
                            binding28.y.setBackground(context4.getDrawable(R.drawable.pp_card_waiting));
                            Unit unit617 = Unit.a;
                        }
                    }
                    z5 = z4;
                }
            }
            ixiVar57 = (ixi) this.b;
            if (ixiVar57 == null) {
                ixiVar60 = (ixi) this.b;
                if (ixiVar60 != null) {
                    giftItem = ixiVar60.b.getGiftItem();
                } else {
                    giftItem = null;
                }
                if (giftItem != null) {
                    E0();
                } else {
                    ixiVar61 = (ixi) this.b;
                    if ((ixiVar61 != null ? ixiVar61.c.getGiftItem() : null) != null) {
                        E0();
                    }
                }
            } else {
                ixiVar60 = (ixi) this.b;
                if (ixiVar60 != null) {
                    giftItem = ixiVar60.b.getGiftItem();
                } else {
                    giftItem = null;
                }
                if (giftItem != null) {
                    E0();
                } else {
                    ixiVar61 = (ixi) this.b;
                    if ((ixiVar61 != null ? ixiVar61.c.getGiftItem() : null) != null) {
                        E0();
                    }
                }
            }
            if (isRemoving()) {
                X0(this, z2, z5, 1);
            }
        }
        ixiVar63 = (ixi) b2;
        if (ixiVar63 != null) {
            ixiVar63.c.setEnableContainer();
            Unit unit618 = Unit.a;
        }
        ixiVar64 = (ixi) this.b;
        if (ixiVar64 != null) {
            binding61.D.setVisibility(0);
            Unit unit619 = Unit.a;
        }
        ixiVar65 = (ixi) this.b;
        if (ixiVar65 != null) {
            binding60.Y.setVisibility(0);
            Unit unit620 = Unit.a;
        }
        ixiVar66 = (ixi) this.b;
        if (ixiVar66 != null) {
            binding59.a0.setVisibility(0);
            Unit unit621 = Unit.a;
        }
        ixiVar67 = (ixi) this.b;
        if (ixiVar67 != null) {
            binding58.v.setVisibility(8);
            Unit unit622 = Unit.a;
        }
        ixiVar68 = (ixi) this.b;
        if (ixiVar68 != null) {
            binding57.q0.setVisibility(8);
            Unit unit77 = Unit.a;
        }
        z4 = false;
        z5 = z4;
        ixiVar57 = (ixi) this.b;
        if (ixiVar57 == null) {
            ixiVar60 = (ixi) this.b;
            if (ixiVar60 != null) {
                giftItem = ixiVar60.b.getGiftItem();
            } else {
                giftItem = null;
            }
            if (giftItem != null) {
                E0();
            } else {
                ixiVar61 = (ixi) this.b;
                if ((ixiVar61 != null ? ixiVar61.c.getGiftItem() : null) != null) {
                    E0();
                }
            }
        } else {
            ixiVar60 = (ixi) this.b;
            if (ixiVar60 != null) {
                giftItem = ixiVar60.b.getGiftItem();
            } else {
                giftItem = null;
            }
            if (giftItem != null) {
                E0();
            } else {
                ixiVar61 = (ixi) this.b;
                if ((ixiVar61 != null ? ixiVar61.c.getGiftItem() : null) != null) {
                    E0();
                }
            }
        }
        if (isRemoving()) {
            X0(this, z2, z5, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    public final void v0() {
        CashoutRequest cashoutRequest;
        v720 binding;
        v720 binding2;
        MultiplierResponse multiplierResponse = this.U;
        if (multiplierResponse == null || multiplierResponse.getMultiplier() == null) {
            return;
        }
        U0();
        ixi ixiVar = (ixi) this.b;
        if (ixiVar != null) {
            long betId = ixiVar.b.getBetId();
            ixi ixiVar2 = (ixi) this.b;
            if (ixiVar2 != null) {
                long roundId = ixiVar2.b.getRoundId();
                MultiplierResponse multiplierResponse2 = this.U;
                if (multiplierResponse2 == null) {
                    Intrinsics.n("multiplierResponse");
                    throw null;
                }
                String multiplier = multiplierResponse2.getMultiplier();
                if (multiplier == null) {
                    multiplier = "";
                }
                cashoutRequest = new CashoutRequest(betId, roundId, multiplier, Boolean.FALSE, String.valueOf(System.currentTimeMillis()), this.d1);
            } else {
                cashoutRequest = null;
            }
        } else {
            cashoutRequest = null;
        }
        ixi ixiVar3 = (ixi) this.b;
        if (ixiVar3 != null && (binding2 = ixiVar3.b.getBinding()) != null) {
            binding2.B.setClickable(false);
        }
        ixi ixiVar4 = (ixi) this.b;
        if (ixiVar4 != null && (binding = ixiVar4.b.getBinding()) != null) {
            binding.B.setAlpha(0.65f);
        }
        ixi ixiVar5 = (ixi) this.b;
        if (ixiVar5 != null) {
            ixiVar5.b.setCashoutInProgress(true);
        }
        if (cashoutRequest != null) {
            final String strJ = new eal().j(cashoutRequest);
            goa0 goa0Var = (goa0) this.a;
            if (goa0Var != null) {
                ixi ixiVar6 = (ixi) this.b;
                Long lValueOf = ixiVar6 != null ? Long.valueOf(ixiVar6.b.getRoundId()) : null;
                ixi ixiVar7 = (ixi) this.b;
                goa0.H1(goa0Var, strJ, lValueOf, ixiVar7 != null ? Long.valueOf(ixiVar7.b.getBetId()) : null, new Function0() { // from class: k410
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        m410 m410Var = this.a;
                        cgb.a(m410Var.P0(), m410Var.F0, "cashout", strJ);
                        return Unit.a;
                    }
                });
            }
            GameDetails gameDetails = this.r1;
            wz.a("Cashout", gameDetails != null ? gameDetails.getName() : null, "1", "Off", "No");
            b1("1", true);
        }
    }

    public final void v1() {
        pl60 pl60Var = this.b0;
        if (pl60Var == null || !pl60Var.isShowing()) {
            if (!M0().b.e()) {
                M0().b.f(getViewLifecycleOwner(), new l(new Function1() { // from class: p110
                    /* JADX WARN: Code duplicated, block: B:65:0x00f3  */
                    /* JADX WARN: Code duplicated, block: B:67:0x00f7  */
                    /* JADX WARN: Code duplicated, block: B:69:0x00fb  */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        pl60 pl60Var2;
                        LinearLayoutCompat linearLayoutCompat;
                        PagingFetchType type;
                        pl60.a aVar;
                        pl60.a aVar2;
                        pl60 pl60Var3;
                        RelativeLayout relativeLayout;
                        RelativeLayout relativeLayout2;
                        Context context;
                        e activity;
                        Context context2;
                        LoadingState loadingState = (LoadingState) obj;
                        int i2 = m410.b.a[loadingState.getStatus().ordinal()];
                        final m410 m410Var = this.a;
                        int i3 = 1;
                        if (i2 != 1) {
                            int i4 = 2;
                            if (i2 == 2) {
                                pl60 pl60Var4 = m410Var.b0;
                                if (pl60Var4 != null && (relativeLayout2 = pl60Var4.v) != null && pl60Var4.E < 0) {
                                    relativeLayout2.setVisibility(0);
                                }
                            } else {
                                if (i2 != 3) {
                                    uhc.a();
                                    return null;
                                }
                                xbg xbgVar = m410Var.c0;
                                if (xbgVar == null) {
                                    Intrinsics.n("errorDialog");
                                    throw null;
                                }
                                if (!xbgVar.isShowing() && (context = m410Var.getContext()) != null && context.getApplicationContext() != null && (activity = m410Var.getActivity()) != null && (context2 = m410Var.getContext()) != null) {
                                    pl60 pl60Var5 = m410Var.b0;
                                    if (pl60Var5 != null) {
                                        pl60Var5.dismiss();
                                    }
                                    vs80 vs80Var = vs80.b;
                                    ResultWrapper.GenericError error = loadingState.getError();
                                    wk4 wk4Var = new wk4(m410Var, i3);
                                    Function0 function0 = new Function0() { // from class: s110
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            m410Var.v1();
                                            return Unit.a;
                                        }
                                    };
                                    jfn jfnVar = new jfn(1);
                                    context2.getColor(R.color.sh_error_btn_color);
                                    vs80Var.c(activity, error, wk4Var, function0, jfnVar, 0, (640 & 128) != 0 ? new mm60() : null, (640 & 512) != 0 ? new xvj(2) : new nfn(m410Var, i4));
                                }
                            }
                        } else if (loadingState.getData() != null) {
                            pl60 pl60Var6 = m410Var.b0;
                            if (pl60Var6 != null && (relativeLayout = pl60Var6.v) != null && pl60Var6.E < 0) {
                                relativeLayout.setVisibility(8);
                            }
                            List list = (List) ((HTTPResponse) loadingState.getData()).getData();
                            if ((list != null ? list.size() : 0) > 0) {
                                pl60Var2 = m410Var.b0;
                                if (pl60Var2 != null) {
                                    linearLayoutCompat = pl60Var2.w;
                                    if (linearLayoutCompat != null) {
                                        linearLayoutCompat.setVisibility(8);
                                    }
                                    pl60Var2.b().setVisibility(0);
                                }
                            } else {
                                Integer total = ((HTTPResponse) loadingState.getData()).getTotal();
                                if ((total != null ? total.intValue() : 0) > 0 || (pl60Var3 = m410Var.b0) == null || pl60Var3.b().getChildCount() != 0) {
                                    pl60Var2 = m410Var.b0;
                                    if (pl60Var2 != null) {
                                        linearLayoutCompat = pl60Var2.w;
                                        if (linearLayoutCompat != null) {
                                            linearLayoutCompat.setVisibility(8);
                                        }
                                        pl60Var2.b().setVisibility(0);
                                    }
                                } else {
                                    pl60 pl60Var7 = m410Var.b0;
                                    if (pl60Var7 != null) {
                                        LinearLayoutCompat linearLayoutCompat2 = pl60Var7.w;
                                        if (linearLayoutCompat2 != null) {
                                            linearLayoutCompat2.setVisibility(0);
                                        }
                                        pl60Var7.b().setVisibility(0);
                                    }
                                }
                            }
                            pl60 pl60Var8 = m410Var.b0;
                            if (pl60Var8 != null) {
                                Object data = ((HTTPResponse) loadingState.getData()).getData();
                                ArrayList arrayList = data instanceof ArrayList ? (ArrayList) data : null;
                                Integer total2 = ((HTTPResponse) loadingState.getData()).getTotal();
                                PagingState pagingStateD = m410Var.M0().c.d();
                                int offset = pagingStateD != null ? pagingStateD.getOffset() : 0;
                                PagingState pagingStateD2 = m410Var.M0().c.d();
                                int limit = pagingStateD2 != null ? pagingStateD2.getLimit() : 0;
                                PagingState pagingStateD3 = m410Var.M0().c.d();
                                if (pagingStateD3 == null || (type = pagingStateD3.getType()) == null) {
                                    type = PagingFetchType.VIEW_MORE;
                                }
                                ArrayList arrayList2 = pl60Var8.A;
                                ArrayList arrayList3 = pl60Var8.z;
                                type.getClass();
                                if (arrayList != null) {
                                    arrayList3.addAll(arrayList);
                                    arrayList2.addAll(arrayList);
                                }
                                pl60Var8.E = offset;
                                pl60Var8.D = limit;
                                int size = arrayList != null ? arrayList.size() : 0;
                                if (type == PagingFetchType.VIEW_MORE && ((aVar2 = pl60Var8.F) == pl60.a.a || aVar2 == pl60.a.b)) {
                                    pl60.a aVar3 = (total2 == null || total2.intValue() <= arrayList3.size()) ? pl60.a.c : pl60.a.b;
                                    pl60Var8.F = aVar3;
                                    pl60Var8.y = arrayList3.size();
                                }
                                if (type == PagingFetchType.ARCHIVE_MORE && ((aVar = pl60Var8.F) == pl60.a.a || aVar == pl60.a.b)) {
                                    pl60.a aVar4 = pl60.a.c;
                                    pl60Var8.F = aVar4;
                                    if (total2 != null && size >= 15) {
                                        aVar4 = pl60.a.b;
                                    }
                                    pl60Var8.G = aVar4;
                                    int size2 = arrayList3.size();
                                    int i5 = pl60Var8.D;
                                    pl60Var8.y = size2 - i5;
                                    pl60Var8.E = i5 - 15;
                                    pl60Var8.D = 15;
                                }
                                pl60.a aVar5 = pl60Var8.F;
                                pl60.a aVar6 = pl60.a.c;
                                if (aVar5 == aVar6) {
                                    pl60.a aVar7 = pl60Var8.G;
                                    pl60.a aVar8 = pl60.a.b;
                                    if (aVar7 == aVar8) {
                                        if (total2 == null || total2.intValue() <= arrayList3.size() - pl60Var8.y) {
                                            aVar8 = aVar6;
                                        }
                                        pl60Var8.G = aVar8;
                                    }
                                }
                                if (pl60Var8.F == aVar6 && pl60Var8.G == pl60.a.a) {
                                    pl60Var8.E = -15;
                                    pl60Var8.D = 15;
                                    pl60Var8.G = pl60.a.b;
                                }
                                if (arrayList != null) {
                                    RecyclerView.f adapter = pl60Var8.b().getAdapter();
                                    adapter.getClass();
                                    wo2 wo2Var = (wo2) adapter;
                                    ArrayList arrayListC0 = CollectionsKt.C0(arrayList2);
                                    pl60.a aVar9 = pl60Var8.F;
                                    pl60.a aVar10 = pl60.a.b;
                                    ej5.c(wo2Var.d, null, null, new hp2(arrayListC0, aVar9 == aVar10, pl60Var8.G == aVar10, wo2Var, null), 3);
                                }
                                RecyclerView.f adapter2 = pl60Var8.b().getAdapter();
                                if (adapter2 != null) {
                                    adapter2.notifyDataSetChanged();
                                }
                                if (arrayList != null) {
                                    arrayList.clear();
                                }
                            }
                        }
                        return Unit.a;
                    }
                }));
            }
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                pl60 pl60Var2 = new pl60(activity);
                pl60Var2.B = new m010(this, 0);
                pl60Var2.C = new n010(this, 0);
                Window window = pl60Var2.getWindow();
                WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                if (attributes != null) {
                    attributes.gravity = 17;
                }
                if (attributes != null) {
                    attributes.flags &= -5;
                }
                Window window2 = pl60Var2.getWindow();
                if (window2 != null) {
                    window2.setAttributes(attributes);
                }
                Window window3 = pl60Var2.getWindow();
                if (window3 != null) {
                    window3.setBackgroundDrawableResource(R.color.trans_black_45);
                }
                pl60Var2.show();
                Window window4 = pl60Var2.getWindow();
                if (window4 != null) {
                    window4.setLayout(-1, -1);
                }
                y720 y720VarN0 = N0();
                ibs viewLifecycleOwner = getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                wo2 wo2Var = new wo2(activity, y720VarN0, viewLifecycleOwner, this.C, this.B);
                RecyclerView recyclerViewB = pl60Var2.b();
                pl60Var2.getContext();
                recyclerViewB.setLayoutManager(new LinearLayoutManager());
                bn6 bn6Var = new bn6(pl60Var2, 2);
                rra rraVar = new rra(pl60Var2, 1);
                wo2Var.b = bn6Var;
                wo2Var.c = rraVar;
                pl60Var2.b().setAdapter(wo2Var);
                op5 op5Var = op5.a;
                TextView textView = pl60Var2.c;
                if (textView == null) {
                    Intrinsics.n("time");
                    throw null;
                }
                TextView textView2 = pl60Var2.d;
                if (textView2 == null) {
                    Intrinsics.n("stake");
                    throw null;
                }
                TextView textView3 = pl60Var2.e;
                if (textView3 == null) {
                    Intrinsics.n(AnalyticsParam.EVENT_STATUS);
                    throw null;
                }
                TextView textView4 = pl60Var2.f;
                if (textView4 == null) {
                    Intrinsics.n("coeff");
                    throw null;
                }
                TextView textView5 = pl60Var2.i;
                if (textView5 == null) {
                    Intrinsics.n("noRecordText");
                    throw null;
                }
                op5.r(op5Var, kotlin.collections.b.f(textView, textView2, textView3, textView4, textView5), null, 4);
                m010 m010Var = pl60Var2.B;
                if (m010Var == null) {
                    Intrinsics.n("betHistoryFetchManager");
                    throw null;
                }
                m010Var.invoke(Integer.valueOf(pl60Var2.E + pl60Var2.D), Integer.valueOf(pl60Var2.D));
                this.b0 = pl60Var2;
            }
            pl60 pl60Var3 = this.b0;
            if (pl60Var3 != null) {
                pl60Var3.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o010
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        pl60 pl60Var4 = this.a.b0;
                        if (pl60Var4 != null) {
                            pl60Var4.a();
                        }
                    }
                });
            }
        }
    }

    public final void w1() {
        boolean z2;
        try {
            z2 = this.u1 != 0 && System.currentTimeMillis() - this.u1 < 30000;
            this.u1 = System.currentTimeMillis();
        } catch (Exception e2) {
            e2.printStackTrace();
            z2 = false;
        }
        if (z2) {
            return;
        }
        try {
            ixi ixiVar = (ixi) this.b;
            if (ixiVar != null) {
                ixiVar.J.setCampaignCompletedText();
            }
            ixi ixiVar2 = (ixi) this.b;
            if (ixiVar2 != null) {
                ixiVar2.J.setVisibility(0);
            }
            ixi ixiVar3 = (ixi) this.b;
            if (ixiVar3 != null) {
                ixiVar3.J.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_fade_out_toast));
            }
            ej5.c(ebs.a(getLifecycle()), null, null, new k510(this, null), 3);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public final Object x1(int i2, double d2, UserInfoResponseSocket userInfoResponseSocket, tje0 tje0Var) {
        tb5 tb5Var = this.p0;
        if (tb5Var == null) {
            return Unit.a;
        }
        nas nasVarA = ebs.a(getLifecycle());
        pfd pfdVar = fse.a;
        Object objJ = tb5Var.j(tje0Var, ej5.b(nasVarA, gku.a, a6b.b, new l510(d2, i2, null, this, userInfoResponseSocket)));
        return objJ == y5b.a ? objJ : Unit.a;
    }

    public final void y0() {
        v720 binding;
        v720 binding2;
        v720 binding3;
        v720 binding4;
        v720 binding5;
        v720 binding6;
        v720 binding7;
        v720 binding8;
        v720 binding9;
        v720 binding10;
        v720 binding11;
        v720 binding12;
        ixi ixiVar = (ixi) this.b;
        if (ixiVar != null) {
            ShBetContainer shBetContainer = ixiVar.b;
            shBetContainer.userInputAmount = 0.0d;
            shBetContainer.b = false;
            shBetContainer.c = false;
            shBetContainer.d = false;
            shBetContainer.e = false;
            shBetContainer.a();
        }
        ixi ixiVar2 = (ixi) this.b;
        if (ixiVar2 != null) {
            ShBetContainer shBetContainer2 = ixiVar2.c;
            shBetContainer2.userInputAmount = 0.0d;
            shBetContainer2.b = false;
            shBetContainer2.c = false;
            shBetContainer2.d = false;
            shBetContainer2.e = false;
            shBetContainer2.a();
        }
        ixi ixiVar3 = (ixi) this.b;
        if (ixiVar3 != null && (binding7 = ixiVar3.b.getBinding()) != null && binding7.D.getVisibility() == 0) {
            ixi ixiVar4 = (ixi) this.b;
            if (ixiVar4 != null && (binding12 = ixiVar4.b.getBinding()) != null) {
                binding12.D.setVisibility(8);
            }
            ixi ixiVar5 = (ixi) this.b;
            if (ixiVar5 != null && (binding11 = ixiVar5.b.getBinding()) != null) {
                binding11.Y.setVisibility(8);
            }
            ixi ixiVar6 = (ixi) this.b;
            if (ixiVar6 != null && (binding10 = ixiVar6.b.getBinding()) != null) {
                binding10.a0.setVisibility(8);
            }
            ixi ixiVar7 = (ixi) this.b;
            if (ixiVar7 != null && (binding9 = ixiVar7.b.getBinding()) != null) {
                binding9.v.setVisibility(0);
            }
            ixi ixiVar8 = (ixi) this.b;
            if (ixiVar8 != null && (binding8 = ixiVar8.b.getBinding()) != null) {
                binding8.q0.setVisibility(8);
            }
        }
        this.N = false;
        ixi ixiVar9 = (ixi) this.b;
        if (ixiVar9 != null && (binding = ixiVar9.c.getBinding()) != null && binding.D.getVisibility() == 0) {
            ixi ixiVar10 = (ixi) this.b;
            if (ixiVar10 != null && (binding6 = ixiVar10.c.getBinding()) != null) {
                binding6.D.setVisibility(8);
            }
            ixi ixiVar11 = (ixi) this.b;
            if (ixiVar11 != null && (binding5 = ixiVar11.c.getBinding()) != null) {
                binding5.Y.setVisibility(8);
            }
            ixi ixiVar12 = (ixi) this.b;
            if (ixiVar12 != null && (binding4 = ixiVar12.c.getBinding()) != null) {
                binding4.a0.setVisibility(8);
            }
            ixi ixiVar13 = (ixi) this.b;
            if (ixiVar13 != null && (binding3 = ixiVar13.c.getBinding()) != null) {
                binding3.v.setVisibility(0);
            }
            ixi ixiVar14 = (ixi) this.b;
            if (ixiVar14 != null && (binding2 = ixiVar14.c.getBinding()) != null) {
                binding2.q0.setVisibility(8);
            }
        }
        this.O = false;
    }

    public final void y1(boolean z2, Function0<Unit> function0) {
        Context context = getContext();
        if (context != null) {
            tj60 tj60Var = new tj60(context, yju.a("br"), function0);
            this.Q = tj60Var;
            tj60Var.show();
            GameDetails gameDetails = this.r1;
            if (z2) {
                wz.a("PaytableCheck", gameDetails != null ? gameDetails.getName() : null, new String[0]);
            } else {
                wz.a("HTPClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
            }
        }
    }

    public final void z0() {
        FragmentManager supportFragmentManager;
        TranslateAnimation translateAnimation;
        AlphaAnimation alphaAnimation;
        TranslateAnimation translateAnimation2;
        v720 binding;
        v720 binding2;
        v720 binding3;
        v720 binding4;
        tj60 tj60Var;
        dt80 dt80Var;
        v720 binding5;
        v720 binding6;
        v720 binding7;
        v720 binding8;
        v720 binding9;
        v720 binding10;
        v720 binding11;
        v720 binding12;
        v720 binding13;
        v720 binding14;
        v720 binding15;
        v720 binding16;
        j820 binding17;
        v720 binding18;
        j820 binding19;
        v720 binding20;
        ema emaVar;
        ssw<String> sswVar;
        try {
            if (!this.h0) {
                this.X0 = false;
                ixi ixiVar = (ixi) this.b;
                if (ixiVar != null) {
                    ixiVar.O.setIsListenerAttached(false);
                }
                goa0 goa0Var = (goa0) this.a;
                if (goa0Var != null && (sswVar = goa0Var.b) != null) {
                    sswVar.l(getViewLifecycleOwner());
                }
                goa0 goa0Var2 = (goa0) this.a;
                if (goa0Var2 != null) {
                    goa0Var2.z1();
                }
                goa0 goa0Var3 = (goa0) this.a;
                if (goa0Var3 != null && (emaVar = goa0Var3.a) != null) {
                    emaVar.dispose();
                }
                this.t0 = false;
                this.E = false;
                ixi ixiVar2 = (ixi) this.b;
                if (ixiVar2 != null && (binding20 = ixiVar2.b.getBinding()) != null) {
                    binding20.f.setStatus(false);
                }
                ixi ixiVar3 = (ixi) this.b;
                if (ixiVar3 != null && (binding18 = ixiVar3.b.getBinding()) != null && (binding19 = binding18.d.getBinding()) != null) {
                    binding19.d.setText("");
                }
                ixi ixiVar4 = (ixi) this.b;
                if (ixiVar4 != null && (binding16 = ixiVar4.c.getBinding()) != null && (binding17 = binding16.d.getBinding()) != null) {
                    binding17.d.setText("");
                }
                ixi ixiVar5 = (ixi) this.b;
                if (ixiVar5 != null && (binding15 = ixiVar5.b.getBinding()) != null) {
                    binding15.C.setVisibility(8);
                }
                ixi ixiVar6 = (ixi) this.b;
                if (ixiVar6 != null && (binding14 = ixiVar6.b.getBinding()) != null) {
                    binding14.z.setText("5");
                }
                ixi ixiVar7 = (ixi) this.b;
                if (ixiVar7 != null && (binding13 = ixiVar7.c.getBinding()) != null) {
                    binding13.z.setText("5");
                }
                this.I = false;
                ixi ixiVar8 = (ixi) this.b;
                if (ixiVar8 != null && (binding12 = ixiVar8.c.getBinding()) != null) {
                    binding12.f.setStatus(false);
                }
                ixi ixiVar9 = (ixi) this.b;
                if (ixiVar9 != null && (binding11 = ixiVar9.c.getBinding()) != null) {
                    binding11.C.setVisibility(8);
                }
                this.H = false;
                ixi ixiVar10 = (ixi) this.b;
                if (ixiVar10 != null && (binding10 = ixiVar10.c.getBinding()) != null) {
                    binding10.d.setStatus(false);
                }
                ixi ixiVar11 = (ixi) this.b;
                if (ixiVar11 != null) {
                    ixiVar11.c.setAutoBetPlace(false);
                }
                this.F = 0;
                this.G = 0;
                this.D = false;
                ixi ixiVar12 = (ixi) this.b;
                if (ixiVar12 != null && (binding9 = ixiVar12.b.getBinding()) != null) {
                    binding9.d.setStatus(false);
                }
                ixi ixiVar13 = (ixi) this.b;
                if (ixiVar13 != null) {
                    ixiVar13.b.setAutoBetPlace(false);
                }
                ixi ixiVar14 = (ixi) this.b;
                if (ixiVar14 != null) {
                    ixiVar14.b.setGiftItem(null);
                }
                ixi ixiVar15 = (ixi) this.b;
                if (ixiVar15 != null) {
                    ixiVar15.c.setGiftItem(null);
                }
                ixi ixiVar16 = (ixi) this.b;
                if (ixiVar16 != null) {
                    ixiVar16.b.c();
                }
                ixi ixiVar17 = (ixi) this.b;
                if (ixiVar17 != null) {
                    ixiVar17.c.c();
                }
                ixi ixiVar18 = (ixi) this.b;
                if (ixiVar18 != null) {
                    ixiVar18.S.setVisibility(8);
                }
                ixi ixiVar19 = (ixi) this.b;
                if (ixiVar19 != null) {
                    ixiVar19.d.setVisibility(8);
                }
                ixi ixiVar20 = (ixi) this.b;
                if (ixiVar20 != null && (binding8 = ixiVar20.b.getBinding()) != null) {
                    binding8.v.setAlpha(1.0f);
                }
                ixi ixiVar21 = (ixi) this.b;
                if (ixiVar21 != null && (binding7 = ixiVar21.c.getBinding()) != null) {
                    binding7.v.setAlpha(1.0f);
                }
                ixi ixiVar22 = (ixi) this.b;
                if (ixiVar22 != null && (binding6 = ixiVar22.b.getBinding()) != null) {
                    binding6.B.setAlpha(1.0f);
                }
                ixi ixiVar23 = (ixi) this.b;
                if (ixiVar23 != null && (binding5 = ixiVar23.c.getBinding()) != null) {
                    binding5.B.setAlpha(1.0f);
                }
                ixi ixiVar24 = (ixi) this.b;
                if (ixiVar24 != null) {
                    ixiVar24.z.d();
                }
                km60 km60Var = vs80.b.a;
                if (km60Var != null) {
                    km60Var.dismiss();
                }
                ixi ixiVar25 = (ixi) this.b;
                if (ixiVar25 != null) {
                    ixiVar25.V.setVisibility(8);
                }
                ixi ixiVar26 = (ixi) this.b;
                if (ixiVar26 != null) {
                    ixiVar26.T.setVisibility(4);
                }
                ixi ixiVar27 = (ixi) this.b;
                if (ixiVar27 != null) {
                    ixiVar27.M.setVisibility(8);
                }
                ypa0 ypa0Var = this.v;
                if (ypa0Var == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                ypa0Var.I1();
                ty50 ty50Var = this.P;
                if (ty50Var != null) {
                    ty50Var.dismiss();
                }
                n2g0 n2g0Var = this.T;
                if (n2g0Var != null && (dt80Var = n2g0Var.z) != null) {
                    dt80Var.dismiss();
                }
                n2g0 n2g0Var2 = this.T;
                if (n2g0Var2 != null) {
                    n2g0Var2.dismiss();
                }
                ty50 ty50Var2 = this.P;
                if (ty50Var2 != null) {
                    try {
                        if (ty50Var2.y != null) {
                            try {
                                dt80 dt80Var2 = ty50Var2.a().f;
                                if (dt80Var2 != null) {
                                    dt80Var2.dismiss();
                                }
                            } catch (Exception unused) {
                            }
                            ty50Var2.a().dismiss();
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (!"br".equalsIgnoreCase(new SportyGamesManager().getSubCountry()) && (tj60Var = this.Q) != null) {
                    tj60Var.dismiss();
                }
                nv80 nv80Var = this.S;
                if (nv80Var != null) {
                    nv80Var.dismiss();
                }
                ixi ixiVar28 = (ixi) this.b;
                if (ixiVar28 != null && (binding4 = ixiVar28.c.getBinding()) != null) {
                    binding4.i.setEnabled(false);
                }
                ixi ixiVar29 = (ixi) this.b;
                if (ixiVar29 != null && (binding3 = ixiVar29.b.getBinding()) != null) {
                    binding3.i.setEnabled(false);
                }
                ixi ixiVar30 = (ixi) this.b;
                if (ixiVar30 != null && (binding2 = ixiVar30.c.getBinding()) != null) {
                    binding2.A.setEnabled(false);
                }
                ixi ixiVar31 = (ixi) this.b;
                if (ixiVar31 != null && (binding = ixiVar31.b.getBinding()) != null) {
                    binding.A.setEnabled(false);
                }
                q1(false);
                mj60 mj60Var = this.a0;
                if (mj60Var != null) {
                    mj60Var.dismiss();
                }
                pl60 pl60Var = this.b0;
                if (pl60Var != null) {
                    pl60Var.dismiss();
                }
                try {
                    ixi ixiVar32 = (ixi) this.b;
                    if (ixiVar32 != null) {
                        ixiVar32.z.d();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                this.k0 = true;
                goa0 goa0Var4 = (goa0) this.a;
                if (goa0Var4 != null) {
                    goa0Var4.b = new ssw<>();
                }
                ixi ixiVar33 = (ixi) this.b;
                if (ixiVar33 != null && (translateAnimation = ixiVar33.O.getTranslateAnimation()) != null && translateAnimation.isInitialized()) {
                    ixi ixiVar34 = (ixi) this.b;
                    if ((ixiVar34 != null ? ixiVar34.O.getTranslateAnimation() : null) != null) {
                        ixi ixiVar35 = (ixi) this.b;
                        if (ixiVar35 != null && (translateAnimation2 = ixiVar35.O.getTranslateAnimation()) != null) {
                            translateAnimation2.cancel();
                        }
                        ixi ixiVar36 = (ixi) this.b;
                        if (ixiVar36 != null && (alphaAnimation = ixiVar36.O.getAlphaAnimation()) != null) {
                            alphaAnimation.cancel();
                        }
                    }
                }
                goa0 goa0Var5 = (goa0) this.a;
                if (goa0Var5 != null) {
                    goa0Var5.B.clear();
                    goa0Var5.C.clear();
                }
                y0();
                ixi ixiVar37 = (ixi) this.b;
                if (ixiVar37 != null) {
                    ixiVar37.Y.setVisibility(8);
                }
            }
            ypa0 ypa0Var2 = this.v;
            if (ypa0Var2 == null) {
                Intrinsics.n("soundViewModel");
                throw null;
            }
            ypa0Var2.I1();
            androidx.fragment.app.e activity = getActivity();
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                return;
            }
            supportFragmentManager.a0();
        } catch (Exception unused3) {
        }
    }

    public final void z1() {
        MultiplierResponse multiplierResponse = this.U;
        if (multiplierResponse == null || this.O0 <= 0 || !Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_ONGOING")) {
            return;
        }
        if ((this.O0 - System.currentTimeMillis()) / 1000 > 2 && !this.k0) {
            ixi ixiVar = (ixi) this.b;
            if (ixiVar != null) {
                SHToastContainer sHToastContainer = ixiVar.P;
                op5 op5Var = op5.a;
                String string = getString(R.string.no_internet_msg_cms);
                string.getClass();
                String string2 = getString(R.string.your_connection_is_unstable_might_affect_bet_and_cash_out);
                string2.getClass();
                sHToastContainer.setNetworkErrorToastData(R.color.network_toast, op5.c(op5Var, string, string2), R.color.white);
            }
            ixi ixiVar2 = (ixi) this.b;
            if (ixiVar2 != null) {
                ixiVar2.P.setVisibility(0);
            }
            nas nasVarA = ebs.a(getLifecycle());
            pfd pfdVar = fse.a;
            ej5.c(nasVarA, gku.a, null, new m510(this, null), 2);
        }
        this.k0 = false;
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void I() {
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void d0() {
    }
}
