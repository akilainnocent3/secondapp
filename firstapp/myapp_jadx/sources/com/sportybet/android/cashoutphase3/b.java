package com.sportybet.android.cashoutphase3;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.cashout.AutoCashOut;
import com.sporty.android.core.model.cashout.CashOutFallbackData;
import com.sporty.android.core.model.cashout.CashOutInfo;
import com.sporty.android.core.model.cashout.CashoutJsData;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sporty.android.core.model.cashout.CashoutSuspendDeactivateAllowConfigs;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.cashoutphase3.CashoutFloatView;
import com.sportybet.android.cashoutphase3.b;
import com.sportybet.android.cashoutphase3.model.CashOutCalcParams;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import com.sportybet.android.social.presentation.SocialActivity;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.model.cashOut.CashOutData;
import com.sportybet.plugin.realsports.betorder.RecyclerView.CustomLinearLayoutManager;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.BoreDrawConfig;
import com.sportybet.plugin.realsports.data.CashOut;
import com.sportybet.plugin.realsports.data.CashOutBetJs;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.Share;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.data.local.BetSlipDataStore;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import com.sportybet.plugin.realsports.widget.DancingNumber2;
import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import defpackage.a1s;
import defpackage.aj40;
import defpackage.ak6;
import defpackage.al6;
import defpackage.am6;
import defpackage.arr;
import defpackage.b190;
import defpackage.b1z;
import defpackage.bj6;
import defpackage.bk6;
import defpackage.bmy;
import defpackage.bnh0;
import defpackage.c0d;
import defpackage.c190;
import defpackage.c8i0;
import defpackage.ci6;
import defpackage.ck6;
import defpackage.cl6;
import defpackage.co6;
import defpackage.cyb;
import defpackage.d1z;
import defpackage.dn6;
import defpackage.dq40;
import defpackage.e1i;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.eja0;
import defpackage.ek6;
import defpackage.ema;
import defpackage.eqh0;
import defpackage.exi;
import defpackage.ez80;
import defpackage.f0z;
import defpackage.f1i;
import defpackage.f7f;
import defpackage.fbh0;
import defpackage.fdt;
import defpackage.fk50;
import defpackage.fk6;
import defpackage.fl6;
import defpackage.fr6;
import defpackage.ft7;
import defpackage.fug0;
import defpackage.g08;
import defpackage.g1i;
import defpackage.g650;
import defpackage.g880;
import defpackage.gc8;
import defpackage.gj6;
import defpackage.gk6;
import defpackage.gr0;
import defpackage.gym;
import defpackage.h1f0;
import defpackage.h330;
import defpackage.h5e;
import defpackage.haj;
import defpackage.hc40;
import defpackage.hj6;
import defpackage.hk6;
import defpackage.hp0;
import defpackage.hug0;
import defpackage.hwr;
import defpackage.i8;
import defpackage.ib5;
import defpackage.ibs;
import defpackage.iel;
import defpackage.ij6;
import defpackage.ik6;
import defpackage.inm;
import defpackage.itf0;
import defpackage.iym;
import defpackage.j9f;
import defpackage.j9j;
import defpackage.jk6;
import defpackage.jq40;
import defpackage.jrm;
import defpackage.jvd0;
import defpackage.jyy;
import defpackage.k00;
import defpackage.k650;
import defpackage.kkh0;
import defpackage.kl6;
import defpackage.ku90;
import defpackage.kyy;
import defpackage.kzh;
import defpackage.l830;
import defpackage.lfy;
import defpackage.lk6;
import defpackage.ll6;
import defpackage.lo6;
import defpackage.lrm;
import defpackage.lws;
import defpackage.m2g;
import defpackage.mj6;
import defpackage.mk6;
import defpackage.ml6;
import defpackage.mo6;
import defpackage.mpe0;
import defpackage.n0z;
import defpackage.n1i;
import defpackage.nas;
import defpackage.nk6;
import defpackage.nl6;
import defpackage.no6;
import defpackage.nzm;
import defpackage.o7d;
import defpackage.o8i0;
import defpackage.oj6;
import defpackage.ok6;
import defpackage.p0z;
import defpackage.paj;
import defpackage.pe4;
import defpackage.pk6;
import defpackage.pl6;
import defpackage.psm;
import defpackage.q8i0;
import defpackage.qag;
import defpackage.qj6;
import defpackage.qk6;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rdd0;
import defpackage.rk6;
import defpackage.rm2;
import defpackage.rnl;
import defpackage.rvi;
import defpackage.rws;
import defpackage.rxy;
import defpackage.s9s;
import defpackage.sch;
import defpackage.sh8;
import defpackage.shd0;
import defpackage.sn5;
import defpackage.svj;
import defpackage.t090;
import defpackage.t340;
import defpackage.tch;
import defpackage.tje0;
import defpackage.tk6;
import defpackage.ttr;
import defpackage.u350;
import defpackage.uj50;
import defpackage.uj6;
import defpackage.uqm;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.vch0;
import defpackage.vgd0;
import defpackage.vj5;
import defpackage.vj6;
import defpackage.vn20;
import defpackage.w8i0;
import defpackage.w950;
import defpackage.wae;
import defpackage.wae0;
import defpackage.wk6;
import defpackage.wo6;
import defpackage.wp6;
import defpackage.wq3;
import defpackage.wsm;
import defpackage.x1b;
import defpackage.xh6;
import defpackage.xid0;
import defpackage.xk6;
import defpackage.xz80;
import defpackage.y1i0;
import defpackage.y5b;
import defpackage.y8j;
import defpackage.ycv;
import defpackage.yid0;
import defpackage.yk10;
import defpackage.yk6;
import defpackage.yo6;
import defpackage.yyy;
import defpackage.yzh;
import defpackage.zha0;
import defpackage.zi50;
import defpackage.zi6;
import defpackage.zk6;
import defpackage.zyy;
import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
import kotlin.text.c;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/sportybet/android/cashoutphase3/b;", "Landroidx/fragment/app/Fragment;", "Li8;", "Lexi;", "Lj9j;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class b extends rnl implements i8, exi, j9j {
    public com.sporty.android.common.uievent.e A;
    public jvd0 A0;
    public xz80 B;
    public jvd0 B0;
    public lrm C;
    public y8j D;
    public iym E;
    public wsm F;
    public wp6 G;
    public bnh0 H;
    public yo6 I;
    public jrm J;
    public kkh0 K;
    public fbh0 L;
    public rdd0 M;
    public fr6 N;
    public eqh0 O;
    public b1z P;
    public svj Q;
    public wq3 R;
    public nzm S;
    public k650 T;
    public u350 U;
    public final q8i0 W;
    public final q8i0 X;
    public final q8i0 Y;
    public final q8i0 Z;
    public final q8i0 a0;
    public shd0 b0;
    public xh6 c0;
    public String d0;
    public boolean e0;
    public final l830<CashOutInfo> f0;
    public WebView g0;
    public final ema h0;
    public uqm i;
    public ez80 i0;
    public boolean j0;
    public f0z k0;
    public int l0;
    public int m0;
    public String n0;
    public boolean o0;
    public String p0;
    public boolean q0;
    public boolean r0;
    public final mpe0 s0;
    public final mpe0 t0;
    public final boolean u0;
    public BetSlipDataStore v;
    public h330 v0;
    public hc40 w;
    public long w0;
    public cl6 x0;
    public t090 y;
    public jvd0 y0;
    public psm z;
    public jvd0 z0;
    public final String f = "CashoutFragment";
    public final q8i0 V = new q8i0(jq40.a(n0z.class), new h(), new j(), new i());

    public static final class a extends Exception {
    }

    public static final class a0 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? b.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.cashoutphase3.b$b, reason: collision with other inner class name */
    @c0d(c = "com.sportybet.android.cashoutphase3.CashOutFragment$loadShareCode$1", f = "CashOutFragment.kt", l = {2247}, m = "invokeSuspend", v = 2)
    public static final class C0225b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ String e;
        public final /* synthetic */ g08 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0225b(String str, boolean z, String str2, g08 g08Var, v1b<? super C0225b> v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = z;
            this.e = str2;
            this.f = g08Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return b.this.new C0225b(this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((C0225b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            b bVar = b.this;
            if (i == 0) {
                uj50.b(obj);
                hc40 hc40Var = bVar.w;
                if (hc40Var == null) {
                    Intrinsics.n("rebetRemixCombineAnTestHelper");
                    throw null;
                }
                nas nasVarA = ebs.a(bVar.getLifecycle());
                this.a = 1;
                obj = hc40Var.e(nasVarA, this.c, this.d, this);
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
            rws.y1(bVar.C0(), this.e, this.f, ((Boolean) obj).booleanValue() ? lws.a : lws.c, 12);
            return Unit.a;
        }
    }

    public static final class b0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ u a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(u uVar) {
            super(0);
            this.a = uVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
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

    public static final class d implements TabLayout.d {
        public final /* synthetic */ pl6 b;

        public d(pl6 pl6Var) {
            this.b = pl6Var;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void A0(TabLayout.g gVar) {
            gVar.getClass();
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void G(TabLayout.g gVar) {
            gVar.getClass();
            b.this.G0(this.b, gVar.e);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void g0(TabLayout.g gVar) {
            gVar.getClass();
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

    /* JADX INFO: loaded from: classes2.dex */
    public static final class e implements InstantCashoutView.a {
        public final /* synthetic */ CashoutFloatView b;
        public final /* synthetic */ boolean c;

        public e(CashoutFloatView cashoutFloatView, boolean z) {
            this.b = cashoutFloatView;
            this.c = z;
        }

        @Override // com.sportybet.android.cashoutphase3.InstantCashoutView.a
        public final void b() {
            b bVar = b.this;
            if (bVar.r0) {
                ej5.c(ebs.a(bVar.getLifecycle()), null, null, new fl6(bVar, null), 3);
            }
        }

        @Override // com.sportybet.android.cashoutphase3.InstantCashoutView.a
        public final void c(String str) {
            b.this.s0().D1(str);
        }

        @Override // com.sportybet.android.cashoutphase3.InstantCashoutView.a
        public final void d(int i) {
            b.this.l0 = i;
        }

        @Override // com.sportybet.android.cashoutphase3.InstantCashoutView.a
        public final void e(pl6 pl6Var) {
            xh6 xh6Var = b.this.c0;
            if (xh6Var != null) {
                ej5.c(xh6Var.y, null, null, new ci6(xh6Var, pl6Var, null), 3);
            } else {
                Intrinsics.n("adapter");
                throw null;
            }
        }

        @Override // com.sportybet.android.cashoutphase3.InstantCashoutView.a
        public final void a(pl6 pl6Var, boolean z) {
            Object bVar;
            InstantCashoutView instantCashoutView;
            TextView confirmButton;
            Object bVar2;
            b bVar3 = b.this;
            xh6 xh6Var = bVar3.c0;
            String str = null;
            str = null;
            str = null;
            str = null;
            str = null;
            str = null;
            if (xh6Var == null) {
                Intrinsics.n("adapter");
                throw null;
            }
            Bet bet = pl6Var.a;
            xh6Var.M = bet.id;
            try {
                zi50.a aVar = zi50.b;
                bVar = bet.cashOut.getInstantCashOutAmount(bVar3.l0);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            Throwable thA = zi50.a(bVar);
            Object obj = bVar;
            if (thA != null) {
                obj = BigDecimal.ONE;
            }
            BigDecimal bigDecimal = (BigDecimal) obj;
            k650 k650Var = bVar3.T;
            if (k650Var == null) {
                Intrinsics.n("remoteConfigRepository");
                throw null;
            }
            boolean zB = k650Var.b("cashout_amount_snapshot_enabled");
            nzm nzmVar = bVar3.S;
            if (nzmVar == null) {
                Intrinsics.n(lobGSRIlnSGJY.VwSgOQg);
                throw null;
            }
            if (Intrinsics.g(bigDecimal, nzmVar.k()) && zB && (instantCashoutView = this.b.b) != null && (confirmButton = instantCashoutView.getConfirmButton()) != null) {
                try {
                    int width = confirmButton.getWidth();
                    Integer numValueOf = Integer.valueOf(width);
                    if (width <= 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        int height = confirmButton.getHeight();
                        Integer numValueOf2 = Integer.valueOf(height);
                        if (height <= 0) {
                            numValueOf2 = null;
                        }
                        if (numValueOf2 != null) {
                            int iIntValue2 = numValueOf2.intValue();
                            confirmButton.measure(View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824), View.MeasureSpec.makeMeasureSpec(iIntValue2, 1073741824));
                            confirmButton.layout(confirmButton.getLeft(), confirmButton.getTop(), confirmButton.getLeft() + iIntValue, confirmButton.getTop() + iIntValue2);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, Bitmap.Config.RGB_565);
                            bitmapCreateBitmap.getClass();
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            canvas.drawColor(-1);
                            confirmButton.draw(canvas);
                            int iB = ycv.b(confirmButton.getResources().getDisplayMetrics().density * 120.0f);
                            int iB2 = ycv.b(40.0f * confirmButton.getResources().getDisplayMetrics().density);
                            int iB3 = ycv.b(12.0f * confirmButton.getResources().getDisplayMetrics().density);
                            int iE = kotlin.ranges.f.e(iB, 0, bitmapCreateBitmap.getWidth() - 1);
                            int iE2 = kotlin.ranges.f.e(iB2, 0, (bitmapCreateBitmap.getWidth() - iE) - 1);
                            int iE3 = kotlin.ranges.f.e(iB3, 0, (bitmapCreateBitmap.getHeight() - 1) / 2);
                            int width2 = (bitmapCreateBitmap.getWidth() - iE) - iE2;
                            if (width2 < 1) {
                                width2 = 1;
                            }
                            int height2 = bitmapCreateBitmap.getHeight() - (iE3 * 2);
                            if (height2 < 1) {
                                height2 = 1;
                            }
                            if (iE != 0 || iE3 != 0 || width2 != bitmapCreateBitmap.getWidth() || height2 != bitmapCreateBitmap.getHeight()) {
                                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, iE, iE3, width2, height2);
                                bitmapCreateBitmap2.getClass();
                                bitmapCreateBitmap.recycle();
                                bitmapCreateBitmap = bitmapCreateBitmap2;
                            }
                            float width3 = 120.0f / bitmapCreateBitmap.getWidth();
                            if (width3 > 1.0f) {
                                width3 = 1.0f;
                            }
                            if (width3 < 1.0f) {
                                int iB4 = ycv.b(bitmapCreateBitmap.getWidth() * width3);
                                if (iB4 < 1) {
                                    iB4 = 1;
                                }
                                int iB5 = ycv.b(bitmapCreateBitmap.getHeight() * width3);
                                if (iB5 < 1) {
                                    iB5 = 1;
                                }
                                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, iB4, iB5, true);
                                bitmapCreateScaledBitmap.getClass();
                                bitmapCreateBitmap.recycle();
                                bitmapCreateBitmap = bitmapCreateScaledBitmap;
                            }
                            Bitmap bitmapA = wo6.a(bitmapCreateBitmap);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                bitmapA.compress(Bitmap.CompressFormat.JPEG, 20, byteArrayOutputStream);
                                bVar2 = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                                byteArrayOutputStream.close();
                                bitmapA.recycle();
                                bVar2.getClass();
                                Throwable thA2 = zi50.a(bVar2);
                                if (thA2 != null) {
                                    itf0.a aVar3 = itf0.a;
                                    aVar3.q(MyLog.TAG_CASHOUT);
                                    aVar3.p(thA2, "Failed to capture cashout confirm amount button", new Object[0]);
                                }
                                str = (String) (bVar2 instanceof zi50.b ? null : bVar2);
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    ft7.a(byteArrayOutputStream, th2);
                                    throw th3;
                                }
                            }
                        }
                    }
                } catch (Throwable th4) {
                    zi50.a aVar4 = zi50.b;
                    bVar2 = new zi50.b(th4);
                }
            }
            AutoCashOut autoCashOut = pl6Var.b;
            if (autoCashOut == null || !autoCashOut.isAutoCashoutCreated()) {
                bVar3.p0(pl6Var, z);
            } else {
                String strD = sn5.d(bVar3, R.string.cashout__instant_cashout_now, new Object[0]);
                String strD2 = sn5.d(bVar3, R.string.cashout__instant_cashout_warning, new Object[0]);
                String strD3 = sn5.d(bVar3, R.string.common_functions__ok, new Object[0]);
                oj6 oj6Var = new oj6(bVar3, pl6Var, z);
                String strD4 = sn5.d(bVar3, R.string.common_functions__cancel, new Object[0]);
                gc8 gc8Var = new gc8();
                gc8Var.a = strD;
                gc8Var.b = strD2;
                gc8Var.c = strD3;
                gc8Var.d = oj6Var;
                gc8Var.e = strD4;
                gc8Var.show(bVar3.getChildFragmentManager(), "InstantCashoutConfirmDialog");
            }
            iym iymVarE0 = bVar3.E0();
            String str2 = this.c ? AnalyticsParam.DATA_FALLBACK : AnalyticsParam.DATA_NORMAL;
            String str3 = pl6Var.a.id;
            str3.getClass();
            gym.a(iymVarE0, new jyy(str2, str3, str));
            bVar3.w0 = System.currentTimeMillis();
        }
    }

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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? b.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class f implements AutoCashoutSettingView.e {
        public final /* synthetic */ pl6 b;

        public f(pl6 pl6Var) {
            this.b = pl6Var;
        }

        @Override // com.sportybet.android.cashoutphase3.AutoCashoutSettingView.e
        public final void a(pl6 pl6Var, boolean z) {
            b bVar = b.this;
            h330 h330Var = bVar.v0;
            if (h330Var == null) {
                Intrinsics.n("progressDialogManager");
                throw null;
            }
            h330Var.b();
            try {
                bVar.s0().y1(pl6Var, bVar.m0, z);
            } catch (Exception e) {
                h330 h330Var2 = bVar.v0;
                if (h330Var2 == null) {
                    Intrinsics.n("progressDialogManager");
                    throw null;
                }
                h330Var2.a();
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_CASHOUT);
                aVar.n(e.getMessage(), "Failed to create parameter: %s");
            }
        }

        @Override // com.sportybet.android.cashoutphase3.AutoCashoutSettingView.e
        public final void b() {
            ku90<com.sporty.android.common.uievent.a> ku90Var = b.this.s0().d0;
            StringUiText stringUiText = vch0.a;
            com.sporty.android.common.uievent.b.e(ku90Var, new ResourceUiText(R.string.cashout__auto_cashout), null, new ResourceUiText(R.string.cashout__auto_cashout_info), null, null, null, null, 506);
        }

        @Override // com.sportybet.android.cashoutphase3.AutoCashoutSettingView.e
        public final void d(int i) {
            b bVar = b.this;
            bVar.m0 = i;
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CASHOUT);
            pl6 pl6Var = this.b;
            aVar.a("CashOut item: %s", pl6Var.a.cashOut);
            aVar.q(MyLog.TAG_CASHOUT);
            aVar.a("getCashoutAmount (instant): %s", pl6Var.a.cashOut.getInstantCashOutAmount(bVar.m0));
            aVar.q(MyLog.TAG_CASHOUT);
            aVar.a("usedStake: %s", pl6Var.a.cashOut.getAutoCashoutUsedStake(bVar.m0));
            aVar.q(MyLog.TAG_CASHOUT);
            aVar.a("triggerAmount: %s", pl6Var.a.cashOut.getAutoCashOutAmount(bVar.m0));
            aVar.q(MyLog.TAG_CASHOUT);
            aVar.a("fullTriggerAmount: %s", pl6Var.a.cashOut.getAutoCashOutMaxAmount());
        }
    }

    public static final class f0 extends qlr implements Function0<Fragment> {
        public f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return b.this;
        }
    }

    public static final class g implements AutoCashoutResultView.b {
        public final /* synthetic */ CashoutFloatView b;

        public g(CashoutFloatView cashoutFloatView) {
            this.b = cashoutFloatView;
        }

        @Override // com.sportybet.android.cashoutphase3.AutoCashoutResultView.b
        public final void a(pl6 pl6Var) {
            b bVar = b.this;
            bVar.m0 = CashOut.BIG_NUMBER;
            h330 h330Var = bVar.v0;
            if (h330Var == null) {
                Intrinsics.n("progressDialogManager");
                throw null;
            }
            h330Var.b();
            h330 h330Var2 = bVar.v0;
            if (h330Var2 == null) {
                Intrinsics.n("progressDialogManager");
                throw null;
            }
            h330Var2.b();
            com.sportybet.android.cashoutphase3.h hVarS0 = bVar.s0();
            am6 am6Var = hVarS0.f;
            String str = pl6Var.a.id;
            str.getClass();
            kzh.d(new g1i(am6Var.a(str), new com.sportybet.android.cashoutphase3.i(hVarS0, pl6Var, null)), o8i0.d(hVarS0));
        }

        @Override // com.sportybet.android.cashoutphase3.AutoCashoutResultView.b
        public final void b(pl6 pl6Var) {
            CashoutFloatView cashoutFloatView = this.b;
            cashoutFloatView.d.setVisibility(8);
            cashoutFloatView.c.setVisibility(0);
        }
    }

    public static final class g0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ f0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(f0 f0Var) {
            super(0);
            this.a = f0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class h extends qlr implements Function0<v8i0> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return b.this.requireActivity().getViewModelStore();
        }
    }

    public static final class h0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class i extends qlr implements Function0<cyb> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return b.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class i0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(ttr ttrVar) {
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

    public static final class j extends qlr implements Function0<r8i0.c> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return b.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class k extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? b.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class l extends qlr implements Function0<Fragment> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return b.this;
        }
    }

    public static final class m extends qlr implements Function0<w8i0> {
        public final /* synthetic */ l a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(l lVar) {
            super(0);
            this.a = lVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class n extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class o extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ttr ttrVar) {
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

    public static final class p extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? b.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class q extends qlr implements Function0<Fragment> {
        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return b.this;
        }
    }

    public static final class r extends qlr implements Function0<w8i0> {
        public final /* synthetic */ q a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(q qVar) {
            super(0);
            this.a = qVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class s extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class t extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ttr ttrVar) {
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

    public static final class u extends qlr implements Function0<Fragment> {
        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return b.this;
        }
    }

    public static final class v extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? b.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class w extends qlr implements Function0<Fragment> {
        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return b.this;
        }
    }

    public static final class x extends qlr implements Function0<w8i0> {
        public final /* synthetic */ w a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(w wVar) {
            super(0);
            this.a = wVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class y extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class z extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ttr ttrVar) {
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

    public b() {
        u uVar = new u();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new b0(uVar));
        this.W = new q8i0(jq40.a(com.sportybet.android.cashoutphase3.h.class), new c0(ttrVarA), new e0(ttrVarA), new d0(ttrVarA));
        ttr ttrVarA2 = hwr.a(a1sVar, new g0(new f0()));
        this.X = new q8i0(jq40.a(eja0.class), new h0(ttrVarA2), new k(ttrVarA2), new i0(ttrVarA2));
        ttr ttrVarA3 = hwr.a(a1sVar, new m(new l()));
        this.Y = new q8i0(jq40.a(tch.class), new n(ttrVarA3), new p(ttrVarA3), new o(ttrVarA3));
        ttr ttrVarA4 = hwr.a(a1sVar, new r(new q()));
        this.Z = new q8i0(jq40.a(rws.class), new s(ttrVarA4), new v(ttrVarA4), new t(ttrVarA4));
        ttr ttrVarA5 = hwr.a(a1sVar, new x(new w()));
        this.a0 = new q8i0(jq40.a(y1i0.class), new y(ttrVarA5), new a0(ttrVarA5), new z(ttrVarA5));
        this.d0 = "";
        this.e0 = true;
        this.f0 = new l830<>();
        this.h0 = new ema();
        this.l0 = CashOut.BIG_NUMBER;
        this.m0 = CashOut.BIG_NUMBER;
        this.n0 = "";
        this.s0 = hwr.b(new Function0() { // from class: rj6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                final b bVar = this.a;
                if (bVar.getActivity() == null) {
                    return null;
                }
                View viewFindViewById = bVar.requireActivity().findViewById(android.R.id.content);
                viewFindViewById.getClass();
                FrameLayout frameLayout = (FrameLayout) viewFindViewById;
                View viewInflate = bVar.getLayoutInflater().inflate(R.layout.spr_cash_out_button_phase_3, (ViewGroup) frameLayout, false);
                frameLayout.addView(viewInflate);
                int i2 = R.id.auto_cash_out_result;
                View viewA = h5e.a(R.id.auto_cash_out_result, viewInflate);
                if (viewA != null) {
                    int i3 = R.id.action_btn;
                    if (((TextView) h5e.a(R.id.action_btn, viewA)) != null) {
                        i3 = R.id.description;
                        if (((TextView) h5e.a(R.id.description, viewA)) != null) {
                            i3 = R.id.description2;
                            if (((TextView) h5e.a(R.id.description2, viewA)) != null) {
                                i3 = R.id.description_msg;
                                if (((TextView) h5e.a(R.id.description_msg, viewA)) != null) {
                                    i3 = R.id.no_action_message;
                                    if (((TextView) h5e.a(R.id.no_action_message, viewA)) != null) {
                                        i3 = R.id.spr_cash_out_auto_result_divider_line;
                                        if (h5e.a(R.id.spr_cash_out_auto_result_divider_line, viewA) != null) {
                                            i3 = R.id.spr_cash_out_auto_result_info_container;
                                            if (((LinearLayout) h5e.a(R.id.spr_cash_out_auto_result_info_container, viewA)) != null) {
                                                i3 = R.id.spr_cash_out_auto_result_title;
                                                if (((TextView) h5e.a(R.id.spr_cash_out_auto_result_title, viewA)) != null) {
                                                    i2 = R.id.auto_cash_out_setting;
                                                    View viewA2 = h5e.a(R.id.auto_cash_out_setting, viewInflate);
                                                    if (viewA2 != null) {
                                                        int i4 = R.id.amount_edit_text;
                                                        if (((EditText) h5e.a(R.id.amount_edit_text, viewA2)) != null) {
                                                            i4 = R.id.auto_cashout_tip_icon;
                                                            if (((AppCompatImageView) h5e.a(R.id.auto_cashout_tip_icon, viewA2)) != null) {
                                                                i4 = R.id.content;
                                                                if (((LinearLayout) h5e.a(R.id.content, viewA2)) != null) {
                                                                    i4 = R.id.current_reach_value;
                                                                    if (((TextView) h5e.a(R.id.current_reach_value, viewA2)) != null) {
                                                                        i4 = R.id.custom_number_keyboard;
                                                                        if (((KeyboardView) h5e.a(R.id.custom_number_keyboard, viewA2)) != null) {
                                                                            i4 = R.id.error_msg;
                                                                            if (((TextView) h5e.a(R.id.error_msg, viewA2)) != null) {
                                                                                i4 = R.id.keyboard_container;
                                                                                if (((FrameLayout) h5e.a(R.id.keyboard_container, viewA2)) != null) {
                                                                                    i4 = R.id.spr_cash_ot_auto_divider_line;
                                                                                    if (h5e.a(R.id.spr_cash_ot_auto_divider_line, viewA2) != null) {
                                                                                        i4 = R.id.spr_cash_out_auto_cash_out;
                                                                                        if (((TextView) h5e.a(R.id.spr_cash_out_auto_cash_out, viewA2)) != null) {
                                                                                            i4 = R.id.spr_cash_out_auto_info_container;
                                                                                            if (((ConstraintLayout) h5e.a(R.id.spr_cash_out_auto_info_container, viewA2)) != null) {
                                                                                                i4 = R.id.spr_cash_out_auto_max;
                                                                                                if (((TextView) h5e.a(R.id.spr_cash_out_auto_max, viewA2)) != null) {
                                                                                                    i4 = R.id.spr_cash_out_auto_middle;
                                                                                                    if (((DancingNumber2) h5e.a(R.id.spr_cash_out_auto_middle, viewA2)) != null) {
                                                                                                        i4 = R.id.spr_cash_out_auto_min;
                                                                                                        if (((TextView) h5e.a(R.id.spr_cash_out_auto_min, viewA2)) != null) {
                                                                                                            i4 = R.id.spr_cash_out_auto_no_p_why;
                                                                                                            if (((TextView) h5e.a(R.id.spr_cash_out_auto_no_p_why, viewA2)) != null) {
                                                                                                                i4 = R.id.spr_cash_out_auto_seek;
                                                                                                                if (((SeekBar) h5e.a(R.id.spr_cash_out_auto_seek, viewA2)) != null) {
                                                                                                                    i4 = R.id.spr_cash_out_auto_seek_container;
                                                                                                                    if (((RelativeLayout) h5e.a(R.id.spr_cash_out_auto_seek_container, viewA2)) != null) {
                                                                                                                        i4 = R.id.spr_cash_out_auto_title;
                                                                                                                        if (((TextView) h5e.a(R.id.spr_cash_out_auto_title, viewA2)) != null) {
                                                                                                                            i4 = R.id.tax_msg;
                                                                                                                            if (((AppCompatTextView) h5e.a(R.id.tax_msg, viewA2)) != null) {
                                                                                                                                i2 = R.id.cashout_content_container;
                                                                                                                                if (((FrameLayout) h5e.a(R.id.cashout_content_container, viewInflate)) != null) {
                                                                                                                                    i2 = R.id.close;
                                                                                                                                    if (((ImageView) h5e.a(R.id.close, viewInflate)) != null) {
                                                                                                                                        i2 = R.id.rc;
                                                                                                                                        View viewA3 = h5e.a(R.id.rc, viewInflate);
                                                                                                                                        if (viewA3 != null) {
                                                                                                                                            vgd0.a(viewA3);
                                                                                                                                            i2 = R.id.tab;
                                                                                                                                            if (((TabLayout) h5e.a(R.id.tab, viewInflate)) != null) {
                                                                                                                                                i2 = R.id.tab_container;
                                                                                                                                                if (((FrameLayout) h5e.a(R.id.tab_container, viewInflate)) != null) {
                                                                                                                                                    CashoutFloatView cashoutFloatView = (CashoutFloatView) viewInflate;
                                                                                                                                                    cashoutFloatView.setOnClickListener(new View.OnClickListener() { // from class: lj6
                                                                                                                                                        @Override // android.view.View.OnClickListener
                                                                                                                                                        public final void onClick(View view) {
                                                                                                                                                            b bVar2 = bVar;
                                                                                                                                                            CashoutFloatView cashoutFloatViewU0 = bVar2.u0();
                                                                                                                                                            if (cashoutFloatViewU0 != null) {
                                                                                                                                                                cashoutFloatViewU0.setVisibility(8);
                                                                                                                                                            }
                                                                                                                                                            xh6 xh6Var = bVar2.c0;
                                                                                                                                                            if (xh6Var == null) {
                                                                                                                                                                Intrinsics.n("adapter");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            xh6Var.M = null;
                                                                                                                                                            bVar2.l0 = CashOut.BIG_NUMBER;
                                                                                                                                                            bVar2.m0 = CashOut.BIG_NUMBER;
                                                                                                                                                            xh6Var.p();
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    cashoutFloatView.setVisibility(8);
                                                                                                                                                    return cashoutFloatView;
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
                                                        bmy.a("Missing required view with ID: ".concat(viewA2.getResources().getResourceName(i4)));
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
                    bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i3)));
                    return null;
                }
                bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
                return null;
            }
        });
        this.t0 = hwr.b(new Function0() { // from class: sj6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                e eVarRequireActivity = this.a.requireActivity();
                eVarRequireActivity.getClass();
                xec.a aVar = new xec.a(eVarRequireActivity);
                xec xecVar = aVar.a;
                xecVar.e = R.layout.layout_selection_status_popup;
                xecVar.f = null;
                xecVar.d = false;
                return aVar.a();
            }
        });
        hp0 hp0Var = hp0.A;
        hp0Var.getClass();
        this.u0 = ((g650) qag.a(hp0Var, g650.class)).Q().b("cashout_js_formula_error_log_enable");
    }

    public static String K0(int i2, String str) {
        String strReplace = kotlin.text.c.q(str, '\n', ' ').replace('\r', ' ');
        strReplace.getClass();
        String strReplace2 = strReplace.replace('\t', ' ');
        strReplace2.getClass();
        if (strReplace2.length() <= i2) {
            return strReplace2;
        }
        String strB = pe4.b(strReplace2.length(), "...(truncated,length=", ")");
        int length = i2 - strB.length();
        return length > 0 ? wae0.K(length, strReplace2).concat(strB) : wae0.K(i2, strB);
    }

    public static final CashOutInfo n0(Bet bet, CashOut cashOut, String str) {
        return new CashOutInfo(bet.id, cashOut.availableStake, cashOut.coefficient, cashOut.isSupportPartial, cashOut.maxCashOutAmount, true, "", false, Boolean.FALSE, false, null, str, null, false, null, null, null, null, null, null, true, 1045504, null);
    }

    @Override // defpackage.exi
    public final void B(boolean z2) {
        if (rvi.b(this) || z2) {
            return;
        }
        wp6 wp6Var = this.G;
        if (wp6Var != null) {
            wp6Var.d(false);
        } else {
            Intrinsics.n("cashoutMetricsManager");
            throw null;
        }
    }

    public final rws C0() {
        return (rws) this.Z.getValue();
    }

    public final b1z D0() {
        b1z b1zVar = this.P;
        if (b1zVar != null) {
            return b1zVar;
        }
        Intrinsics.n("openBetsEventTrackingManager");
        throw null;
    }

    public final iym E0() {
        iym iymVar = this.E;
        if (iymVar != null) {
            return iymVar;
        }
        Intrinsics.n("openTelemetryLogger");
        throw null;
    }

    public final fbh0 F0() {
        fbh0 fbh0Var = this.L;
        if (fbh0Var != null) {
            return fbh0Var;
        }
        Intrinsics.n("uiRouterManager");
        throw null;
    }

    public final void G0(pl6 pl6Var, int i2) {
        CashoutFloatView cashoutFloatViewU0 = u0();
        if (cashoutFloatViewU0 == null) {
            return;
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_CASHOUT);
        aVar.a("handleTabSelected, tabIndex: " + i2 + ", item: " + pl6Var, new Object[0]);
        InstantCashoutView instantCashoutView = cashoutFloatViewU0.b;
        if (i2 == 0) {
            instantCashoutView.setVisibility(0);
            cashoutFloatViewU0.c.setVisibility(8);
            cashoutFloatViewU0.d.setVisibility(8);
            return;
        }
        instantCashoutView.setVisibility(8);
        boolean z2 = pl6Var.b != null;
        AutoCashoutSettingView autoCashoutSettingView = cashoutFloatViewU0.c;
        autoCashoutSettingView.getClass();
        c8i0.o(autoCashoutSettingView, !z2);
        AutoCashoutResultView autoCashoutResultView = cashoutFloatViewU0.d;
        autoCashoutResultView.getClass();
        c8i0.o(autoCashoutResultView, z2);
    }

    public final void H0(String str, g08 g08Var) {
        String userId = getAccountHelper().getUserId();
        if (userId == null) {
            userId = "";
        }
        ej5.c(ebs.a(getLifecycle()), null, null, new C0225b(userId, !q0().U().isEmpty(), str, g08Var, null), 3);
    }

    public final void I0(pl6 pl6Var, int i2, boolean z2) {
        h1f0 h1f0Var;
        CashoutFloatView cashoutFloatViewU0 = u0();
        if (cashoutFloatViewU0 == null) {
            return;
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_CASHOUT);
        aVar.a("showCashoutFloatView, tabIndex: " + i2 + ", item: " + pl6Var, new Object[0]);
        AutoCashOut autoCashOut = pl6Var.b;
        h1f0 h1f0Var2 = h1f0.a;
        if (autoCashOut == null || !autoCashOut.isAutoCashoutCreated()) {
            h1f0Var = vn20.c("open_bets", "show_auto_tab_new_icon", true) ? h1f0.b : h1f0Var2;
        } else {
            h1f0Var = h1f0.c;
        }
        cashoutFloatViewU0.a.e0.clear();
        cashoutFloatViewU0.a.n();
        TabLayout tabLayout = cashoutFloatViewU0.a;
        tabLayout.getClass();
        tabLayout.b(o0(tabLayout, R.string.cashout__instant, h1f0Var2));
        TabLayout tabLayout2 = cashoutFloatViewU0.a;
        tabLayout2.getClass();
        tabLayout2.b(o0(tabLayout2, R.string.cashout__auto, h1f0Var));
        cashoutFloatViewU0.a.a(new d(pl6Var));
        TabLayout.g gVarK = cashoutFloatViewU0.a.k(i2);
        if (gVarK != null) {
            gVarK.b();
        }
        G0(pl6Var, i2);
        cashoutFloatViewU0.setVisibility(0);
        boolean z3 = pl6Var.a.isFallbackCashOut;
        iym iymVarE0 = E0();
        String str = z3 ? AnalyticsParam.DATA_FALLBACK : AnalyticsParam.DATA_NORMAL;
        String str2 = pl6Var.a.id;
        str2.getClass();
        gym.a(iymVarE0, new kyy(str, str2));
        z0().c(cashoutFloatViewU0, z3 ? AnalyticsEvent.OPEN_BETS_REDUCED_CASHOUT_CONFIRM : AnalyticsEvent.OPEN_BETS_CASHOUT_CONFIRM);
        int i3 = this.l0;
        cashoutFloatViewU0.b.setup(pl6Var, new e(cashoutFloatViewU0, z3), t0().d().p.getRealSportTaxConfig(), z2, this.r0);
        if (i3 != 1000000) {
            InstantCashoutView instantCashoutView = cashoutFloatViewU0.b;
            instantCashoutView.A = i3;
            vgd0 vgd0Var = instantCashoutView.f;
            if (vgd0Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            vgd0Var.D.setProgress(i3);
            Bet bet = instantCashoutView.w;
            if (bet == null) {
                Intrinsics.n("betItem");
                throw null;
            }
            CashOut cashOut = bet.cashOut;
            cashOut.getClass();
            instantCashoutView.b(cashOut, false);
            this.l0 = i3;
        }
        cashoutFloatViewU0.c.setup(pl6Var, new f(pl6Var), t0().d().p.getRealSportTaxConfig(), z2);
        cashoutFloatViewU0.d.setup(pl6Var, new g(cashoutFloatViewU0));
        Bet bet2 = pl6Var.a;
        bet2.getClass();
        if (rm2.g(bet2, t0().d())) {
            Bet bet3 = pl6Var.a;
            bet3.getClass();
            m0(bet3);
        }
    }

    public final void J0(String str, String str2, String str3, int i2, boolean z2) {
        String strD;
        String strD2;
        if (i2 < 0) {
            strD = sn5.d(this, R.string.cashout__cashout_succeeded, new Object[0]);
            strD2 = null;
        } else {
            strD = sn5.d(this, R.string.cashout__partial_cashout_succeeded, new Object[0]);
            strD2 = sn5.d(this, R.string.live__vcount_vchance_left_to_do_partial_cashout, String.valueOf(i2), i2 > 1 ? sn5.d(this, R.string.live__l_chances, new Object[0]) : sn5.d(this, R.string.live__l_chance, new Object[0]));
            this.n0 = "";
        }
        boolean z3 = str3 != null;
        boolean z4 = z2 && str3 != null;
        str2.getClass();
        dn6 dn6Var = new dn6();
        dn6Var.setArguments(vj5.a(new Pair("arg_amount", str2), new Pair("arg_partial_left", Integer.valueOf(i2)), new Pair("arg_success_text", strD), new Pair("arg_partial_left_text", strD2), new Pair("arg_show_rebet_option", Boolean.valueOf(z3)), new Pair("arg_show_sim_rebet_option", Boolean.valueOf(z4))));
        dn6Var.v = new gj6(this, str, i2);
        dn6Var.w = new hj6(this, str, i2, str3);
        dn6Var.y = new ij6(this, str, i2, str3);
        dn6Var.show(getChildFragmentManager(), "CashOutSuccessBottomSheetDialog");
    }

    public final String L0(Throwable th) {
        UiText text;
        fk50 fk50Var = th instanceof fk50 ? (fk50) th : null;
        if (fk50Var != null && (text = fk50Var.getText()) != null) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            String string = text.e(contextRequireContext).toString();
            if (string != null) {
                String str = string.length() > 0 ? string : null;
                if (str != null) {
                    return str;
                }
            }
        }
        String string2 = getString(R.string.common_feedback__something_went_wrong_please_try_again_later);
        string2.getClass();
        return string2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object M0(ez80 ez80Var, zha0 zha0Var, x1b x1bVar) {
        nl6 nl6Var;
        ArrayList arrayListA;
        int i2;
        boolean z2;
        Object objA;
        Event event;
        ez80 ez80Var2 = ez80Var;
        zha0 zha0Var2 = zha0Var;
        if (x1bVar instanceof nl6) {
            nl6Var = (nl6) x1bVar;
            int i3 = nl6Var.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nl6Var.i = i3 - Integer.MIN_VALUE;
            } else {
                nl6Var = new nl6(this, x1bVar);
            }
        } else {
            nl6Var = new nl6(this, x1bVar);
        }
        Object obj = nl6Var.e;
        y5b y5bVar = y5b.a;
        int i4 = nl6Var.i;
        if (i4 == 0) {
            arrayListA = j9f.a(obj);
            ArrayList arrayList = ez80Var2.e;
            String str = ez80Var2.a;
            int size = arrayList.size();
            i2 = 0;
            int i5 = 0;
            while (i5 < size) {
                Object obj2 = arrayList.get(i5);
                i5++;
                ez80.a aVar = (ez80.a) obj2;
                Tournament tournament = new Tournament();
                tournament.id = aVar.d;
                tournament.name = aVar.e;
                Category category = new Category();
                category.id = aVar.c;
                category.tournament = tournament;
                Sport sport = new Sport();
                sport.id = aVar.a;
                sport.category = category;
                Event event2 = new Event();
                event2.eventId = aVar.b;
                event2.homeTeamName = aVar.f;
                event2.awayTeamName = aVar.g;
                event2.sport = sport;
                Market market = new Market();
                market.id = aVar.h;
                market.desc = aVar.i;
                market.specifier = aVar.j;
                Long l2 = aVar.o;
                if (l2 == null) {
                    event = event2;
                } else {
                    event = event2;
                    if (((int) l2.longValue()) != 3 && i2 == 0) {
                        i2 = 1;
                    }
                }
                Outcome outcome = new Outcome();
                outcome.id = aVar.k;
                outcome.desc = aVar.l;
                outcome.odds = aVar.m;
                arrayListA.add(new Selection(event, market, outcome));
            }
            lrm lrmVar = this.C;
            if (lrmVar == null) {
                Intrinsics.n("betStore");
                throw null;
            }
            lrmVar.w(new Share(str, ez80Var2.b));
            String str2 = zha0Var2.d;
            t090 t090Var = this.y;
            if (t090Var == null) {
                Intrinsics.n("shareImageProvider");
                throw null;
            }
            if (str == null) {
                str = "";
            }
            b190 b190Var = new b190(arrayListA, null, str2, str);
            nl6Var.a = ez80Var2;
            nl6Var.b = zha0Var2;
            nl6Var.c = arrayListA;
            nl6Var.d = i2;
            z2 = true;
            nl6Var.i = 1;
            objA = t090Var.a(b190Var, nl6Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = nl6Var.d;
            ArrayList arrayList2 = nl6Var.c;
            zha0 zha0Var3 = nl6Var.b;
            ez80 ez80Var3 = nl6Var.a;
            uj50.b(obj);
            i2 = i6;
            ez80Var2 = ez80Var3;
            z2 = true;
            objA = obj;
            arrayListA = arrayList2;
            zha0Var2 = zha0Var3;
        }
        c190 c190Var = (c190) objA;
        String str3 = c190Var.a;
        String str4 = c190Var.b;
        zha0Var2.c = Boolean.valueOf(i2 != 0 ? z2 : false);
        String strA = o7d.a(wae.SHARE);
        StringBuilder sb = new StringBuilder(inm.a("?imageUri=", str3));
        sb.append("&imageWithUserUri=" + str4);
        sb.append("&linkUrl=" + ez80Var2.b);
        sb.append("&isSingleBetBuilder=" + g880.x(arrayListA));
        sb.append("&shareCode=" + ez80Var2.a);
        sb.append(zha0Var2.a());
        sb.append("&source=open_bet_page");
        String str5 = ez80Var2.c;
        if (str5 != null) {
            sb.append("&userNote=".concat(str5));
        }
        String str6 = ez80Var2.d;
        if (str6 != null) {
            sb.append("&orderId=".concat(str6));
        }
        F0().e(yk10.a(strA, sb.toString()));
        return Unit.a;
    }

    public final void N0() {
        CashoutFloatView cashoutFloatViewU0 = u0();
        if (cashoutFloatViewU0 != null ? cashoutFloatViewU0.isShown() : false) {
            CashoutFloatView cashoutFloatViewU1 = u0();
            if (cashoutFloatViewU1 != null) {
                cashoutFloatViewU1.b.d();
                AutoCashoutSettingView autoCashoutSettingView = cashoutFloatViewU1.c;
                if (autoCashoutSettingView.d != null) {
                    autoCashoutSettingView.f();
                }
            }
            xh6 xh6Var = this.c0;
            if (xh6Var != null) {
                xh6Var.p();
            } else {
                Intrinsics.n("adapter");
                throw null;
            }
        }
    }

    public final void O0(boolean z2) {
        shd0 shd0Var = this.b0;
        shd0Var.getClass();
        c8i0.o(shd0Var.w, z2);
        shd0 shd0Var2 = this.b0;
        shd0Var2.getClass();
        AppCompatImageView appCompatImageView = shd0Var2.i;
        boolean z3 = false;
        if (z2) {
            Boolean bool = s0().P;
            if (bool != null ? bool.booleanValue() : false) {
                z3 = true;
            }
        }
        c8i0.o(appCompatImageView, z3);
    }

    public final void P0(p0z p0zVar) {
        if (isAdded()) {
            shd0 shd0Var = this.b0;
            shd0Var.getClass();
            shd0Var.b.setSelected(false);
            shd0 shd0Var2 = this.b0;
            shd0Var2.getClass();
            shd0Var2.c.setSelected(false);
            shd0 shd0Var3 = this.b0;
            shd0Var3.getClass();
            shd0Var3.y.setSelected(false);
            int iOrdinal = p0zVar.ordinal();
            if (iOrdinal == 1) {
                shd0 shd0Var4 = this.b0;
                shd0Var4.getClass();
                shd0Var4.b.setSelected(true);
            } else if (iOrdinal == 2) {
                shd0 shd0Var5 = this.b0;
                shd0Var5.getClass();
                shd0Var5.c.setSelected(true);
            } else if (iOrdinal == 3) {
                shd0 shd0Var6 = this.b0;
                shd0Var6.getClass();
                shd0Var6.y.setSelected(true);
            }
            if (p0zVar == s0().M) {
                return;
            }
            com.sportybet.android.cashoutphase3.h hVarS0 = s0();
            hVarS0.J.s(d1z.a(p0zVar));
            hVarS0.M = p0zVar;
            if (p0zVar != p0z.a) {
                hVarS0.v.d(false);
            }
            hVarS0.B1(zyy.a);
        }
    }

    public final uqm getAccountHelper() {
        uqm uqmVar = this.i;
        if (uqmVar != null) {
            return uqmVar;
        }
        Intrinsics.n("accountHelper");
        throw null;
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF() {
        return this.f;
    }

    public final void m0(Bet bet) {
        final b bVar;
        final Bet bet2;
        final CashOut cashOut = bet.cashOut;
        if (!t0().h()) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CASHOUT_CALC);
            aVar.n("Skip JS cashout calc because some of cashout necessary configs are null.", new Object[0]);
            return;
        }
        WebView webView = this.g0;
        l830<CashOutInfo> l830Var = this.f0;
        if (webView == null || !this.j0) {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_CASHOUT_CALC);
            aVar2.n("Skip JS cashout calc because WebView is not ready.", new Object[0]);
            l830Var.onNext(n0(bet, cashOut, CashoutMetricsPayload.Metric.KeyValueMap.WEBVIEW_UNFUNCTIONAL));
            return;
        }
        try {
            final String str = "window.formula['v1.0'].calc(" + JSONObject.quote(sh8.b().toJson(r0(bet))) + ")";
            final dq40 dq40Var = new dq40();
            dq40Var.a = "";
            bVar = this;
            bet2 = bet;
            try {
                webView.evaluateJavascript(str, new ValueCallback() { // from class: tj6
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r8v1, types: [T, java.lang.CharSequence, java.lang.Object, java.lang.String] */
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String message;
                        CashOutInfo isCashAbleJs;
                        CashOutInfo cashOutInfoCopy$default;
                        dq40 dq40Var2 = dq40Var;
                        b bVar2 = bVar;
                        l830<CashOutInfo> l830Var2 = bVar2.f0;
                        Bet bet3 = bet2;
                        CashOut cashOut2 = cashOut;
                        ?? r8 = (String) obj;
                        String str2 = rarBonoqWB.okMiaXkwu;
                        r8.getClass();
                        try {
                            dq40Var2.a = r8;
                            int iT = StringsKt.T(r8, "{", 0, false, 6);
                            String string = iT == -1 ? r8 : StringsKt.e0(r8, 0, iT, "").toString();
                            int iV = StringsKt.V(6, string, "}");
                            Object objFromJson = sh8.b().fromJson(qae0.c(c.p(iV == -1 ? string : StringsKt.e0(string, iV + 1, string.length(), "").toString(), "\\", "", false)), (Class<Object>) CashOutInfo.class);
                            if (objFromJson == null) {
                                l830Var2.onNext(b.n0(bet3, cashOut2, str2));
                                return;
                            }
                            if (((CashOutInfo) objFromJson).isError()) {
                                throw new b.a(((CashOutInfo) objFromJson).getMessage());
                            }
                            if (((CashOutInfo) objFromJson).isCashAble()) {
                                String str3 = bet3.id;
                                str3.getClass();
                                isCashAbleJs = ((CashOutInfo) objFromJson).setBetId(str3).setIsCashAbleJs(true);
                            } else {
                                String metrics = ((CashOutInfo) objFromJson).getMetrics();
                                if (metrics == null) {
                                    metrics = CashoutMetricsPayload.Metric.KeyValueMap.FE_FORMULA_UNKNOWN;
                                }
                                isCashAbleJs = new CashOutInfo(bet3.id, cashOut2.availableStake, cashOut2.coefficient, cashOut2.isSupportPartial, cashOut2.maxCashOutAmount, false, "", false, Boolean.TRUE, false, ((CashOutInfo) objFromJson).getUnCashableReason(), metrics, ((CashOutInfo) objFromJson).getMetricsInfo(), false, null, null, null, null, null, null, false, 2088960, null);
                            }
                            CashOutInfo cashOutInfo = isCashAbleJs;
                            l830Var2.onNext(cashOutInfo);
                            if (rm2.c(bet3, bVar2.t0().d()) != null && (cashOutInfoCopy$default = CashOutInfo.copy$default(cashOutInfo, null, null, null, false, null, false, null, false, null, false, null, CashoutMetricsPayload.Metric.KeyValueMap.INACTIVE_OUTCOME, null, false, null, null, null, null, null, null, false, 2095103, null)) != null) {
                                cashOutInfo = cashOutInfoCopy$default;
                            }
                            bVar2.s0().E1(cashOutInfo);
                            bVar2.s0().H1(cashOutInfo);
                        } catch (Throwable th) {
                            itf0.a aVar3 = itf0.a;
                            aVar3.q(MyLog.TAG_CASHOUT_CALC);
                            aVar3.a("JS calc response: %s  \nfailed: %s", r8, th.getMessage());
                            l830Var2.onNext(b.n0(bet3, cashOut2, str2));
                            if (bVar2.u0) {
                                HashMap map = new HashMap();
                                map.put(AnalyticsParam.EVENT_PARAM_VERSION_SDK, Integer.valueOf(Build.VERSION.SDK_INT));
                                map.put(AnalyticsParam.EVENT_PARAM_USER_ID, bVar2.getAccountHelper().getUserId());
                                psm psmVar = bVar2.z;
                                if (psmVar == null) {
                                    Intrinsics.n("countryManager");
                                    throw null;
                                }
                                map.put("country", psmVar.getCountryCode());
                                map.put("bet_id", bet3.id);
                                if (th instanceof b.a) {
                                    message = th.getMessage();
                                    if (message == null || message.length() == 0) {
                                        message = "JS calc error";
                                    }
                                } else {
                                    message = th.getMessage();
                                }
                                map.put(AnalyticsParam.EVENT_PARAM_EXCEPTION, message);
                                f00 f00Var = vgb0.a;
                                vgb0.c("android_cashout_js_formula_error", map, false);
                            }
                            String str4 = (String) dq40Var2.a;
                            ArrayList arrayList = new ArrayList();
                            String str5 = bet3.id;
                            str5.getClass();
                            if (str5.length() > 0) {
                                arrayList.add(new android.util.Pair("Bet Id", bet3.id));
                            }
                            arrayList.add(new android.util.Pair("Exception Type", th.getClass().getName()));
                            String message2 = th.getMessage();
                            arrayList.add(new android.util.Pair("Exception Message", b.K0(256, message2 != null ? message2 : "")));
                            String str6 = str;
                            arrayList.add(new android.util.Pair("CashOut Formula Length", String.valueOf(str6.length())));
                            arrayList.add(new android.util.Pair("CashOut Formula Sample", b.K0(1024, str6)));
                            arrayList.add(new android.util.Pair("WebView Value Length", String.valueOf(str4.length())));
                            arrayList.add(new android.util.Pair("WebView Value Sample", b.K0(1024, str4)));
                            w950.a("CashOutFragment", "calc", new Exception("CashOutJsFormulaFailed", th), arrayList);
                            rdd0 rdd0Var = bVar2.M;
                            if (rdd0Var == null) {
                                Intrinsics.n(DZsoPoBl.jJd);
                                throw null;
                            }
                            String str7 = bet3.id;
                            str7.getClass();
                            rdd0Var.a(new rxy(str7.length() > 0 ? str7 : null), k00.d);
                        }
                    }
                });
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                itf0.a aVar3 = itf0.a;
                aVar3.q(MyLog.TAG_CASHOUT_CALC);
                aVar3.a("CashOutCalcParams create failed: %s", th2.toString());
                l830Var.onNext(n0(bet2, cashOut, CashoutMetricsPayload.Metric.KeyValueMap.PLATFORM_UNKNOWN));
                w950.a("CashOutFragment", "CashOutCalcParamsCreate", th2, new ArrayList());
                rdd0 rdd0Var = bVar.M;
                if (rdd0Var == null) {
                    Intrinsics.n("sportyTrackingUseCase");
                    throw null;
                }
                String str2 = bet2.id;
                str2.getClass();
                rdd0Var.a(new rxy(str2.length() > 0 ? str2 : null), k00.d);
            }
        } catch (Throwable th3) {
            th = th3;
            bVar = this;
            bet2 = bet;
        }
    }

    public final TabLayout.g o0(TabLayout tabLayout, int i2, h1f0 h1f0Var) {
        int i3;
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R.layout.spr_cash_out_button_tab, (ViewGroup) null, false);
        int i4 = R.id.checked_icon;
        ImageView imageView = (ImageView) h5e.a(R.id.checked_icon, viewInflate);
        if (imageView != null) {
            i4 = R.id.new_icon;
            ImageView imageView2 = (ImageView) h5e.a(R.id.new_icon, viewInflate);
            if (imageView2 != null) {
                i4 = R.id.title;
                TextView textView = (TextView) h5e.a(R.id.title, viewInflate);
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    sn5.f(textView, i2, new Object[0]);
                    textView.setTextColor(requireContext().getColor(R.color.text_type1_primary));
                    Context contextRequireContext = requireContext();
                    contextRequireContext.getClass();
                    int iA = fug0.a(hug0.a, contextRequireContext);
                    if (iA == 2) {
                        i3 = R.drawable.ic_new_es_mx;
                    } else if (iA == 3) {
                        i3 = 2131232154;
                    } else if (iA != 4) {
                        i3 = iA != 5 ? R.drawable.ic_new : R.drawable.ic_new_fr_fr;
                    } else {
                        i3 = R.drawable.ic_new_pt_mz;
                    }
                    imageView2.setImageDrawable(gr0.a(contextRequireContext, i3));
                    if (h1f0.b == h1f0Var) {
                        imageView2.setVisibility(0);
                    } else if (h1f0.c == h1f0Var) {
                        textView.setTextColor(requireContext().getColor(R.color.brand_secondary));
                        imageView.setVisibility(0);
                    }
                    TabLayout.g gVarL = tabLayout.l();
                    gVarL.c(constraintLayout);
                    return gVarL;
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
        return null;
    }

    @Override // defpackage.i8
    public final void onAccountChange(Account account) {
        if (account != null) {
            P0(p0z.b);
            String userId = getAccountHelper().getUserId();
            if (userId == null || userId.length() == 0) {
                return;
            }
            com.sportybet.android.cashoutphase3.h hVarS0 = s0();
            ej5.c(o8i0.d(hVarS0), null, null, new no6(hVarS0, null), 3);
            if (getLifecycle().b().compareTo(s9s.b.d) >= 0) {
                s0().J1(true, false);
            }
            eqh0 eqh0Var = this.O;
            if (eqh0Var != null) {
                eqh0Var.setUserId(userId);
                return;
            } else {
                Intrinsics.n("userSelectionStatusManager");
                throw null;
            }
        }
        com.sportybet.android.cashoutphase3.h hVarS1 = s0();
        p0z p0zVar = p0z.a;
        hVarS1.J.s(d1z.a(p0zVar));
        hVarS1.M = p0zVar;
        s0().J1(false, true);
        s0().F1(false, true);
        Context contextRequireContext = requireContext();
        yyy yyyVar = yyy.LIST_MODE;
        contextRequireContext.getSharedPreferences("sportybet", 0).edit().putString("KEY_DISPLAY_MODE", "LIST_MODE").commit();
        shd0 shd0Var = this.b0;
        shd0Var.getClass();
        shd0Var.D.setSelected(w0() == yyyVar);
        eqh0 eqh0Var2 = this.O;
        if (eqh0Var2 != null) {
            eqh0Var2.setUserId(null);
        } else {
            Intrinsics.n("userSelectionStatusManager");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID)) != null) {
            s0().O = string;
        }
        String userId = getAccountHelper().getUserId();
        eqh0 eqh0Var = this.O;
        if (eqh0Var == null) {
            Intrinsics.n("userSelectionStatusManager");
            throw null;
        }
        eqh0Var.setUserId(userId);
        if (s0().O.length() > 0) {
            this.e0 = false;
        }
        bnh0 bnh0Var = this.H;
        if (bnh0Var == null) {
            Intrinsics.n("urlCreator");
            throw null;
        }
        this.d0 = bnh0.d(bnh0Var, new String[]{"/cash-out-formula"}, null, 6);
        getAccountHelper().addAccountChangeListener(this);
        com.sportybet.android.cashoutphase3.h hVarS0 = s0();
        ej5.c(o8i0.d(hVarS0), null, null, new co6(hVarS0, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x013b A[PHI: r2
      0x013b: PHI (r2v2 int) = 
      (r2v1 int)
      (r2v4 int)
      (r2v5 int)
      (r2v6 int)
      (r2v7 int)
      (r2v8 int)
      (r2v9 int)
      (r2v10 int)
      (r2v11 int)
      (r2v12 int)
      (r2v13 int)
      (r2v14 int)
      (r2v15 int)
      (r2v16 int)
     binds: [B:3:0x001d, B:5:0x0029, B:7:0x0035, B:9:0x0041, B:11:0x004d, B:13:0x0059, B:15:0x0064, B:17:0x0070, B:19:0x007c, B:21:0x0087, B:23:0x0093, B:25:0x009f, B:27:0x00ac, B:29:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        int i2;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.spr_fragment_cash_out, viewGroup, false);
        int i3 = R.id.all;
        TextView textView = (TextView) h5e.a(R.id.all, viewInflate);
        if (textView != null) {
            i3 = R.id.cashout_available;
            TextView textView2 = (TextView) h5e.a(R.id.cashout_available, viewInflate);
            if (textView2 != null) {
                i3 = R.id.cashout_hint;
                TextView textView3 = (TextView) h5e.a(R.id.cashout_hint, viewInflate);
                if (textView3 != null) {
                    i3 = R.id.cashout_loading;
                    LoadingView loadingView = (LoadingView) h5e.a(R.id.cashout_loading, viewInflate);
                    if (loadingView != null) {
                        i3 = R.id.cashout_recycler_view;
                        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.cashout_recycler_view, viewInflate);
                        if (recyclerView != null) {
                            i3 = R.id.codeChat;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.codeChat, viewInflate);
                            if (appCompatImageView != null) {
                                i3 = R.id.filter_scroll_container;
                                if (((HorizontalScrollView) h5e.a(R.id.filter_scroll_container, viewInflate)) != null) {
                                    i3 = R.id.group_empty_hint;
                                    Group group = (Group) h5e.a(R.id.group_empty_hint, viewInflate);
                                    if (group != null) {
                                        i3 = R.id.group_filter_btn;
                                        Group group2 = (Group) h5e.a(R.id.group_filter_btn, viewInflate);
                                        if (group2 != null) {
                                            i3 = R.id.ic_info;
                                            if (((ImageView) h5e.a(R.id.ic_info, viewInflate)) != null) {
                                                i3 = R.id.live_games;
                                                TextView textView4 = (TextView) h5e.a(R.id.live_games, viewInflate);
                                                if (textView4 != null) {
                                                    i3 = R.id.no_bet_hint;
                                                    TextView textView5 = (TextView) h5e.a(R.id.no_bet_hint, viewInflate);
                                                    if (textView5 != null) {
                                                        i3 = R.id.recommended_code_recycler_view;
                                                        RecyclerView recyclerView2 = (RecyclerView) h5e.a(R.id.recommended_code_recycler_view, viewInflate);
                                                        if (recyclerView2 != null) {
                                                            i3 = R.id.spr_open_bet_recommended_hide_no_data_view;
                                                            View viewA = h5e.a(R.id.spr_open_bet_recommended_hide_no_data_view, viewInflate);
                                                            if (viewA != null) {
                                                                ComposeView composeView = (ComposeView) h5e.a(R.id.compose_recommended_header_view, viewA);
                                                                if (composeView != null) {
                                                                    view = null;
                                                                    View viewA2 = h5e.a(R.id.spr_open_bet_no_data_view, viewA);
                                                                    if (viewA2 != null) {
                                                                        yid0 yid0Var = new yid0((ConstraintLayout) viewA, composeView, xid0.a(viewA2));
                                                                        i3 = R.id.swipe;
                                                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipe, viewInflate);
                                                                        if (swipeRefreshLayout != null) {
                                                                            i3 = R.id.toggle;
                                                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.toggle, viewInflate);
                                                                            if (appCompatImageView2 != null) {
                                                                                this.b0 = new shd0((ConstraintLayout) viewInflate, textView, textView2, textView3, loadingView, recyclerView, appCompatImageView, group, group2, textView4, textView5, recyclerView2, yid0Var, swipeRefreshLayout, appCompatImageView2);
                                                                                Context contextRequireContext = requireContext();
                                                                                contextRequireContext.getClass();
                                                                                this.v0 = new h330(contextRequireContext);
                                                                                shd0 shd0Var = this.b0;
                                                                                shd0Var.getClass();
                                                                                ConstraintLayout constraintLayout = shd0Var.a;
                                                                                constraintLayout.getClass();
                                                                                return constraintLayout;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        i2 = R.id.spr_open_bet_no_data_view;
                                                                    }
                                                                } else {
                                                                    view = null;
                                                                    i2 = R.id.compose_recommended_header_view;
                                                                }
                                                                bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
                                                                return view;
                                                            }
                                                            view = null;
                                                        } else {
                                                            view = null;
                                                        }
                                                    } else {
                                                        view = null;
                                                    }
                                                } else {
                                                    view = null;
                                                }
                                            } else {
                                                view = null;
                                            }
                                        } else {
                                            view = null;
                                        }
                                    } else {
                                        view = null;
                                    }
                                } else {
                                    view = null;
                                }
                            } else {
                                view = null;
                            }
                        } else {
                            view = null;
                        }
                    } else {
                        view = null;
                    }
                } else {
                    view = null;
                }
            } else {
                view = null;
            }
        } else {
            view = null;
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() throws Throwable {
        getAccountHelper().removeAccountChangeListener(this);
        WebView webView = this.g0;
        if (webView != null) {
            webView.destroy();
        }
        this.g0 = null;
        s0().J1(false, true);
        s0().F1(false, true);
        wp6 wp6Var = this.G;
        if (wp6Var == null) {
            Intrinsics.n("cashoutMetricsManager");
            throw null;
        }
        wp6Var.d(false);
        this.h0.d();
        v0().a();
        s0().K1();
        s0().x1();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        jvd0 jvd0Var = this.B0;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        jvd0 jvd0Var2 = this.y0;
        if (jvd0Var2 != null) {
            jvd0Var2.cancel((CancellationException) null);
        }
        jvd0 jvd0Var3 = this.z0;
        if (jvd0Var3 != null) {
            jvd0Var3.cancel((CancellationException) null);
        }
        jvd0 jvd0Var4 = this.A0;
        if (jvd0Var4 != null) {
            jvd0Var4.cancel((CancellationException) null);
        }
        shd0 shd0Var = this.b0;
        shd0Var.getClass();
        shd0Var.f.setAdapter(null);
        shd0 shd0Var2 = this.b0;
        shd0Var2.getClass();
        shd0Var2.A.setAdapter(null);
        xh6 xh6Var = this.c0;
        if (xh6Var == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        xh6Var.L.d();
        xh6 xh6Var2 = this.c0;
        if (xh6Var2 == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        xh6Var2.I.clear();
        this.b0 = null;
        super.onDestroyView();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    @Override // androidx.fragment.app.Fragment
    public final void onResume() throws Throwable {
        boolean z2;
        super.onResume();
        com.sportybet.android.cashoutphase3.h hVarS0 = s0();
        Long lastDisconnectedTimestamp = hVarS0.C.c.getLastDisconnectedTimestamp();
        boolean z3 = true;
        if (lastDisconnectedTimestamp != null) {
            long jLongValue = lastDisconnectedTimestamp.longValue();
            Long l2 = hVarS0.x0;
            if (l2 != null && jLongValue == l2.longValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (lastDisconnectedTimestamp != null) {
            hVarS0.x0 = lastDisconnectedTimestamp;
        }
        if (!hVarS0.v0 && !z2) {
            z3 = false;
        }
        hVarS0.v0 = false;
        if (z3) {
            s0().B1(zyy.c);
            s0().K1();
        }
        if (this.o0) {
            this.o0 = false;
            String str = this.p0;
            if (str != null) {
                s0().L1(str, this.q0);
            }
            this.p0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        cl6 cl6Var = new cl6(this);
        this.x0 = cl6Var;
        fdt.a(requireContext()).b(cl6Var, new IntentFilter("com.sportybet.action.JS_EVENT"));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        cl6 cl6Var = this.x0;
        if (cl6Var != null) {
            fdt.a(requireContext()).d(cl6Var);
        }
        this.x0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        com.sportybet.android.cashoutphase3.h hVarS0 = s0();
        if (hVarS0.P == null) {
            ej5.c(o8i0.d(hVarS0), null, null, new lo6(hVarS0, null), 3);
        }
        if (!this.e0) {
            shd0 shd0Var = this.b0;
            shd0Var.getClass();
            shd0Var.a.setBackgroundColor(requireContext().getColor(R.color.background_type2_secondary));
        }
        shd0 shd0Var2 = this.b0;
        shd0Var2.getClass();
        final LoadingView loadingView = shd0Var2.e;
        loadingView.getErrorView().getTitle().setTextColor(requireContext().getColor(R.color.text_type1_secondary));
        loadingView.getEmptyView().setTextColor(requireContext().getColor(R.color.cmn_cool_grey));
        loadingView.getEmptyView().setTextSize(16.0f);
        loadingView.setOnClickListener(new View.OnClickListener() { // from class: wj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                loadingView.L(null);
                b bVar = this;
                bVar.D0().o();
                bVar.s0().B1(zyy.c);
            }
        });
        shd0 shd0Var3 = this.b0;
        shd0Var3.getClass();
        final SwipeRefreshLayout swipeRefreshLayout = shd0Var3.C;
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: xj6
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void i() throws Throwable {
                b bVar = this.a;
                bVar.D0().i();
                swipeRefreshLayout.setRefreshing(false);
                bVar.s0().B1(zyy.c);
                bVar.s0().K1();
            }
        });
        ek6 ek6Var = new ek6(this);
        fk6 fk6Var = new fk6(this);
        ck6 ck6Var = new ck6(this);
        gk6 gk6Var = new gk6(this);
        yo6 yo6VarT0 = t0();
        String str = s0().O;
        psm psmVar = this.z;
        if (psmVar == null) {
            Intrinsics.n("countryManager");
            throw null;
        }
        int i2 = 0;
        mj6 mj6Var = new mj6(this, i2);
        fr6 fr6Var = this.N;
        if (fr6Var == null) {
            Intrinsics.n("cashoutRepository");
            throw null;
        }
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        nas nasVarA = ebs.a(viewLifecycleOwner.getLifecycle());
        rdd0 rdd0Var = this.M;
        if (rdd0Var == null) {
            Intrinsics.n("sportyTrackingUseCase");
            throw null;
        }
        this.c0 = new xh6(yo6VarT0, str, this.f0, psmVar, ek6Var, fk6Var, ck6Var, gk6Var, mj6Var, fr6Var, nasVarA, rdd0Var);
        f0z f0zVar = new f0z();
        this.k0 = f0zVar;
        f0zVar.b = new ak6(this);
        f0zVar.c = new bk6(this);
        shd0 shd0Var4 = this.b0;
        shd0Var4.getClass();
        RecyclerView recyclerView = shd0Var4.f;
        requireContext();
        recyclerView.setLayoutManager(new CustomLinearLayoutManager());
        xh6 xh6Var = this.c0;
        if (xh6Var == null) {
            Intrinsics.n("adapter");
            throw null;
        }
        recyclerView.setAdapter(xh6Var);
        recyclerView.setItemAnimator(null);
        shd0 shd0Var5 = this.b0;
        shd0Var5.getClass();
        RecyclerView recyclerView2 = shd0Var5.A;
        f0z f0zVar2 = this.k0;
        if (f0zVar2 == null) {
            Intrinsics.n("openBetRecommendedCodeAdapter");
            throw null;
        }
        recyclerView2.setAdapter(f0zVar2);
        recyclerView2.setItemAnimator(null);
        shd0 shd0Var6 = this.b0;
        shd0Var6.getClass();
        shd0Var6.b.setOnClickListener(new View.OnClickListener() { // from class: aj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b bVar = this.a;
                bVar.D0().q();
                bVar.P0(p0z.b);
            }
        });
        shd0 shd0Var7 = this.b0;
        shd0Var7.getClass();
        shd0Var7.c.setOnClickListener(new bj6(this, i2));
        shd0 shd0Var8 = this.b0;
        shd0Var8.getClass();
        shd0Var8.y.setOnClickListener(new View.OnClickListener() { // from class: cj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b bVar = this.a;
                bVar.D0().q();
                bVar.P0(p0z.d);
            }
        });
        shd0 shd0Var9 = this.b0;
        shd0Var9.getClass();
        final AppCompatImageView appCompatImageView = shd0Var9.D;
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: dj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AppCompatImageView appCompatImageView2 = appCompatImageView;
                yyy yyyVar = appCompatImageView2.isSelected() ? yyy.CARD_MODE : yyy.LIST_MODE;
                b bVar = this;
                bVar.requireContext().getSharedPreferences("sportybet", 0).edit().putString("KEY_DISPLAY_MODE", yyyVar.a).commit();
                appCompatImageView2.setSelected(!appCompatImageView2.isSelected());
                xyy xyyVar = (xyy) bVar.s0().z0.a.getValue();
                CashOutData cashOutData = xyyVar.a.a;
                BoreDrawConfig boreDrawConfig = xyyVar.b;
                boolean zB = vn20.b(appCompatImageView2.getContext(), "open_bets", "SP_GUIDE_FIRST", true);
                xh6 xh6Var2 = bVar.c0;
                if (xh6Var2 != null) {
                    xh6Var2.r(cashOutData.getCashAbleBets(), cashOutData.getAutoCashOuts(), cashOutData.getTotalNum(), ((Number) bVar.s0().B.g().a.getValue()).intValue(), cashOutData.getMoreBets(), cashOutData.isFilter(), yyyVar, bVar.s0().N, boreDrawConfig, zB, cashOutData.getCashOutFallbackData(), ((Boolean) bVar.s0().j0.a.getValue()).booleanValue(), bVar.r0);
                } else {
                    Intrinsics.n("adapter");
                    throw null;
                }
            }
        });
        appCompatImageView.setSelected(w0() == yyy.LIST_MODE);
        shd0 shd0Var10 = this.b0;
        shd0Var10.getClass();
        AppCompatImageView appCompatImageView2 = shd0Var10.B.c.b;
        sh8.a().g(appCompatImageView2, f7f.a(81.0f, appCompatImageView2.getContext()), f7f.a(80.0f, appCompatImageView2.getContext()));
        shd0 shd0Var11 = this.b0;
        shd0Var11.getClass();
        shd0Var11.d.setOnClickListener(new View.OnClickListener() { // from class: ej6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b bVar = this.a;
                bVar.startActivity(new Intent(bVar.getContext(), (Class<?>) LivePageActivity.class).putExtra("key_sport_id", "sr:sport:1"));
            }
        });
        shd0 shd0Var12 = this.b0;
        shd0Var12.getClass();
        shd0Var12.i.setOnClickListener(new View.OnClickListener() { // from class: fj6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = SocialActivity.b;
                b bVar = this.a;
                e eVarRequireActivity = bVar.requireActivity();
                eVarRequireActivity.getClass();
                String lastNickName = bVar.getAccountHelper().getLastNickName();
                if (lastNickName == null) {
                    lastNickName = "";
                }
                bVar.startActivity(SocialActivity.a.a(eVarRequireActivity, lastNickName, !bVar.getAccountHelper().getNickNameVerified(), null, false, false, "CODE_CHAT"));
            }
        });
        g1i g1iVar = new g1i(s0().z0, new xk6(this, null));
        s9s lifecycle = getViewLifecycleOwner().getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        g1i g1iVar2 = new g1i(s0().u0, new yk6(this, null));
        s9s lifecycle2 = getViewLifecycleOwner().getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
        s0().U.f(getViewLifecycleOwner(), new c(new uj6(this, i2)));
        q8i0 q8i0Var = this.V;
        ((n0z) q8i0Var.getValue()).K.f(getViewLifecycleOwner(), new c(new qj6(this, i2)));
        ((n0z) q8i0Var.getValue()).I.f(getViewLifecycleOwner(), new c(new vj6(this, i2)));
        s0().a0.f(getViewLifecycleOwner(), new c(new zi6(this, i2)));
        ((eja0) this.X.getValue()).i.f(getViewLifecycleOwner(), new c(new Function1() { // from class: kj6
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                jox joxVar = (jox) obj;
                boolean z2 = joxVar instanceof jox.a;
                b bVar2 = this.a;
                if (z2) {
                    h330 h330Var = bVar2.v0;
                    if (h330Var == null) {
                        Intrinsics.n("progressDialogManager");
                        throw null;
                    }
                    h330Var.a();
                    zha0 zha0Var = (zha0) ((jox.a) joxVar).a;
                    ez80 ez80Var = bVar2.i0;
                    if (ez80Var != null && zha0Var != null) {
                        ej5.c(ebs.a(bVar2.getLifecycle()), null, null, new bl6(bVar2, ez80Var, zha0Var, null), 3);
                    }
                } else if (joxVar instanceof jox.c) {
                    h330 h330Var2 = bVar2.v0;
                    if (h330Var2 == null) {
                        Intrinsics.n("progressDialogManager");
                        throw null;
                    }
                    h330Var2.a();
                    zyf0.c(1, ((jox.c) joxVar).a.getMessage());
                } else if (joxVar instanceof jox.e) {
                    h330 h330Var3 = bVar2.v0;
                    if (h330Var3 == null) {
                        Intrinsics.n("progressDialogManager");
                        throw null;
                    }
                    h330Var3.b();
                }
                return Unit.a;
            }
        }));
        g1i g1iVar3 = new g1i(y0().w, new hk6(this, null));
        s9s lifecycle3 = getViewLifecycleOwner().getLifecycle();
        lifecycle3.getClass();
        arr.a(g1iVar3, lifecycle3, bVar);
        g1i g1iVar4 = new g1i(y0().z, new ik6(this, null));
        s9s lifecycle4 = getViewLifecycleOwner().getLifecycle();
        lifecycle4.getClass();
        arr.a(g1iVar4, lifecycle4, bVar);
        g1i g1iVar5 = new g1i(y0().B, new jk6(this, null));
        s9s lifecycle5 = getViewLifecycleOwner().getLifecycle();
        lifecycle5.getClass();
        arr.a(g1iVar5, lifecycle5, bVar);
        n1i n1iVar = new n1i(s0().z0, y0().U, new lk6(this, null));
        s9s lifecycle6 = getViewLifecycleOwner().getLifecycle();
        lifecycle6.getClass();
        arr.a(n1iVar, lifecycle6, bVar);
        n1i n1iVar2 = new n1i(y0().V, y0().U, new mk6(this, null));
        s9s lifecycle7 = getViewLifecycleOwner().getLifecycle();
        lifecycle7.getClass();
        arr.a(n1iVar2, lifecycle7, bVar);
        y0().A1(new aj40.a(Integer.valueOf(R.drawable.spr_ic_related_bets), true), sch.b, true, false, "recommended_code_when_empty");
        y0().x1();
        yzh yzhVar = new yzh(new g1i(s0().W, new com.sportybet.android.cashoutphase3.c(this, null)), new tk6(this, null));
        s9s lifecycle8 = getLifecycle();
        lifecycle8.getClass();
        arr.a(yzhVar, lifecycle8, bVar);
        yzh yzhVar2 = new yzh(new g1i(s0().Y, new zk6(this, null)), new al6(3, null));
        s9s lifecycle9 = getLifecycle();
        lifecycle9.getClass();
        arr.a(yzhVar2, lifecycle9, bVar);
        t340 t340VarA = e1i.a(s0().d0);
        ibs viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        ej5.c(ebs.a(viewLifecycleOwner2.getLifecycle()), null, null, new wk6(viewLifecycleOwner2, t340VarA, null, this), 3);
        jvd0 jvd0Var = this.y0;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        g1i g1iVar6 = new g1i(s0().g0, new ll6(this, null));
        ibs viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        this.y0 = kzh.d(g1iVar6, ebs.a(viewLifecycleOwner3.getLifecycle()));
        jvd0 jvd0Var2 = this.A0;
        if (jvd0Var2 != null) {
            jvd0Var2.cancel((CancellationException) null);
        }
        g1i g1iVar7 = new g1i(s0().o0, new kl6(this, null));
        s9s lifecycle10 = getViewLifecycleOwner().getLifecycle();
        lifecycle10.getClass();
        this.A0 = arr.a(g1iVar7, lifecycle10, bVar);
        g1i g1iVar8 = new g1i(C0().e, new nk6(this, null));
        s9s lifecycle11 = getLifecycle();
        lifecycle11.getClass();
        arr.a(g1iVar8, lifecycle11, bVar);
        g1i g1iVar9 = new g1i(C0().i, new ok6(this, null));
        s9s lifecycle12 = getLifecycle();
        lifecycle12.getClass();
        arr.a(g1iVar9, lifecycle12, bVar);
        g1i g1iVar10 = new g1i(C0().w, new pk6(this, null));
        s9s lifecycle13 = getLifecycle();
        lifecycle13.getClass();
        arr.a(g1iVar10, lifecycle13, bVar);
        g1i g1iVar11 = new g1i(new f1i(C0().z), new qk6(this, null));
        s9s lifecycle14 = getLifecycle();
        lifecycle14.getClass();
        arr.a(g1iVar11, lifecycle14, bVar);
        com.sportybet.android.cashoutphase3.h hVarS1 = s0();
        ej5.c(o8i0.d(hVarS1), null, null, new mo6(hVarS1, null), 3);
        eqh0 eqh0Var = this.O;
        if (eqh0Var == null) {
            Intrinsics.n("userSelectionStatusManager");
            throw null;
        }
        g1i g1iVar12 = new g1i(eqh0Var.a(), new ml6(this, null));
        s9s lifecycle15 = getViewLifecycleOwner().getLifecycle();
        lifecycle15.getClass();
        arr.a(g1iVar12, lifecycle15, bVar);
        ibs viewLifecycleOwner4 = getViewLifecycleOwner();
        viewLifecycleOwner4.getClass();
        ej5.c(ebs.a(viewLifecycleOwner4.getLifecycle()), null, null, new rk6(this, null), 3);
    }

    public final void p0(pl6 pl6Var, boolean z2) {
        if (TextUtils.equals(pl6Var.a.id, this.n0)) {
            return;
        }
        pl6Var.b = null;
        if (!z2) {
            this.l0 = CashOut.BIG_NUMBER;
        }
        h330 h330Var = this.v0;
        if (h330Var == null) {
            Intrinsics.n("progressDialogManager");
            throw null;
        }
        h330Var.b();
        CashoutFloatView cashoutFloatViewU0 = u0();
        if (cashoutFloatViewU0 == null) {
            return;
        }
        cashoutFloatViewU0.e = true;
        cashoutFloatViewU0.b.getConfirmProgressBtn().setEnableProgress2(true);
        cashoutFloatViewU0.b.getConfirmProgressBtn().setVisibility(0);
        cashoutFloatViewU0.b.getConfirmProgressBtn().setLoading(true);
        String str = pl6Var.a.id;
        str.getClass();
        this.n0 = str;
        com.sportybet.android.cashoutphase3.h hVarS0 = s0();
        int i2 = this.l0;
        Bet bet = pl6Var.a;
        String str2 = bet.id;
        try {
            String string = bet.cashOut.getInstantCashoutUsedStake(i2).toString();
            string.getClass();
            String string2 = pl6Var.a.cashOut.getInstantCashOutAmount(i2).toString();
            string2.getClass();
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CASHOUT_FALLBACK);
            aVar.a("[doInstantCashout] usedStake: " + string + ", amount: " + string2 + ", instantSeekBarPosition: " + i2, new Object[0]);
            am6 am6Var = hVarS0.f;
            str2.getClass();
            kzh.d(new g1i(am6Var.c(str2, string, string2, z2, pl6Var.a.isCalcByFE), new com.sportybet.android.cashoutphase3.j(i2, pl6Var, hVarS0, string2, str2, null)), o8i0.d(hVarS0));
        } catch (Exception e2) {
            StringUiText stringUiText = vch0.a;
            hVarS0.A1(new com.sportybet.android.cashoutphase3.a.c.g(e2, new StringUiText("")));
        }
    }

    public final jrm q0() {
        jrm jrmVar = this.J;
        if (jrmVar != null) {
            return jrmVar;
        }
        Intrinsics.n("betItem");
        throw null;
    }

    public final CashOutCalcParams r0(Bet bet) throws Exception {
        CashoutJsData cashoutJsDataA = t0().a();
        if (cashoutJsDataA == null) {
            com.appsflyer.internal.y.a("bonusConfig or apiConfig is null");
            return null;
        }
        CashoutSuspendDeactivateAllowConfigs cashoutSuspendDeactivateAllowConfigs = s0().A.d().g;
        int i2 = bet.giftKind;
        Integer numValueOf = i2 == 0 ? null : Integer.valueOf(i2);
        CashOut cashOut = bet.cashOut;
        CashOutCalcParams.CashOutParams cashOutParams = new CashOutCalcParams.CashOutParams(cashOut.maxCount, cashOut.remainCount);
        List<CashOutBetJs> cashOutJs = bet.getCashOutJs();
        cashOutJs.getClass();
        List list = bet.subBets;
        if (list == null) {
            list = m2g.a;
        }
        List list2 = list;
        int i3 = bet.type;
        String str = bet.orderType;
        str.getClass();
        String str2 = bet.stake;
        str2.getClass();
        String str3 = bet.originStake;
        str3.getClass();
        String str4 = bet.currency;
        str4.getClass();
        int i4 = bet.minToWin;
        String str5 = bet.id;
        str5.getClass();
        CashOutCalcParams.BetParams betParams = new CashOutCalcParams.BetParams(cashOutJs, list2, i3, str, str2, str3, str4, i4, str5, numValueOf, bet.giftAmount, bet.featureTags, cashOutParams);
        Object value = s0().r0.a.getValue();
        Map<String, Double> betaSettings = ((CashOutFallbackData) value).getBetaSettings();
        boolean z2 = t0().d().n;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_CASHOUT_FALLBACK);
        aVar.g("getCashOutCalcParams(" + bet.id + "): betaSettings=" + betaSettings + ", cashoutFallbackEnabled=" + z2, new Object[0]);
        if (betaSettings == null || betaSettings.isEmpty() || !z2) {
            value = null;
        }
        return new CashOutCalcParams((String) s0().s0.a.getValue(), betParams, cashoutJsDataA, cashoutSuspendDeactivateAllowConfigs, String.valueOf(t0().d().h), t0().d().m, (CashOutFallbackData) value, t0().d().t);
    }

    public final com.sportybet.android.cashoutphase3.h s0() {
        return (com.sportybet.android.cashoutphase3.h) this.W.getValue();
    }

    public final yo6 t0() {
        yo6 yo6Var = this.I;
        if (yo6Var != null) {
            return yo6Var;
        }
        Intrinsics.n("cashoutConfigManager");
        throw null;
    }

    public final CashoutFloatView u0() {
        return (CashoutFloatView) this.s0.getValue();
    }

    public final com.sporty.android.common.uievent.e v0() {
        com.sporty.android.common.uievent.e eVar = this.A;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.n("commonUiEventProcessor");
        throw null;
    }

    public final yyy w0() {
        yyy yyyVar;
        if (this.e0) {
            Context contextRequireContext = requireContext();
            yyyVar = yyy.LIST_MODE;
            String string = contextRequireContext.getSharedPreferences("sportybet", 0).getString("KEY_DISPLAY_MODE", "LIST_MODE");
            yyy yyyVar2 = yyy.CARD_MODE;
            if (Intrinsics.g(string, "CARD_MODE")) {
                yyyVar = yyyVar2;
            }
        } else {
            yyyVar = yyy.CARD_MODE;
        }
        D0().t(yyyVar);
        return yyyVar;
    }

    public final tch y0() {
        return (tch) this.Y.getValue();
    }

    public final y8j z0() {
        y8j y8jVar = this.D;
        if (y8jVar != null) {
            return y8jVar;
        }
        Intrinsics.n("fullStoryCommonManager");
        throw null;
    }
}
