package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.appsflyer.internal.u;
import com.google.android.material.snackbar.Snackbar;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sporty.android.core.model.config.tax.TaxConfig;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.model.InstantWinGiftApplicabilityContext;
import com.sportybet.android.instantwin.newtork.model.request.TicketParameter;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource;
import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import com.sportybet.android.instantwin.presentation.widget.NextButtonLayout;
import com.sportybet.android.instantwin.router.instantwin.InstantWinInput;
import com.sportybet.android.virtual.presentation.adapter.BetslipAdapter;
import com.sportybet.android.virtual.presentation.widget.InstantWinFooterLayout;
import com.sportybet.android.virtual.presentation.widget.StakeItemLayout;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ljp3;", "Landroidx/fragment/app/Fragment;", "", "Lcom/sportybet/android/virtual/presentation/widget/InstantWinFooterLayout$a;", "Leeo$a;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jp3 extends tml implements InstantWinFooterLayout.a, eeo.a {
    public Handler A;
    public y03 B;
    public final q8i0 C;
    public TaxConfig D;
    public final q8i0 E;
    public ee<fqk> F;
    public jlo G;
    public ji2 H;
    public JsonSerializeService I;
    public n4p J;
    public uqm K;
    public uy0 L;
    public rdd0 M;
    public ex4 N;
    public nzm O;
    public azm P;
    public i5s Q;
    public gbn R;
    public u0v S;
    public cmo T;
    public grm U;
    public int V;
    public int W;
    public int X;
    public final String Y;
    public final ep3 Z;
    public boolean a0;
    public eeo b0;
    public BigDecimal i;
    public String v;
    public BetslipAdapter w;
    public o4p z;
    public static final /* synthetic */ ohp<Object>[] d0 = {new d630(0, jp3.class, "binding", oLsIjJCWb.PXtthYoPnEEtKHH)};
    public static final a c0 = new a();
    public final i6i0 f = g5e.a(b.a);
    public final ArrayList y = new ArrayList();

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final /* synthetic */ class b extends saj implements Function1<View, r4p> {
        public static final b a = new b(1, r4p.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/IwqkLayoutBetslipBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final r4p invoke(View view) {
            View view2 = view;
            view2.getClass();
            int i = R.id.bet_list;
            RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.bet_list, view2);
            if (recyclerView != null) {
                i = R.id.button_place_bet;
                NextButtonLayout nextButtonLayout = (NextButtonLayout) h5e.a(R.id.button_place_bet, view2);
                if (nextButtonLayout != null) {
                    i = R.id.composeview_recommendation;
                    ComposeView composeView = (ComposeView) h5e.a(R.id.composeview_recommendation, view2);
                    if (composeView != null) {
                        i = R.id.instant_win_footer;
                        InstantWinFooterLayout instantWinFooterLayout = (InstantWinFooterLayout) h5e.a(R.id.instant_win_footer, view2);
                        if (instantWinFooterLayout != null) {
                            i = R.id.nested_scroll_view;
                            NestedScrollView nestedScrollView = (NestedScrollView) h5e.a(R.id.nested_scroll_view, view2);
                            if (nestedScrollView != null) {
                                return new r4p((ConstraintLayout) view2, recyclerView, nextButtonLayout, composeView, instantWinFooterLayout, nestedScrollView);
                            }
                        }
                    }
                }
            }
            bmy.a("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
            return null;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class c implements lfy, paj {
        public final /* synthetic */ bp3 a;

        public c(bp3 bp3Var) {
            this.a = bp3Var;
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

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.android.virtual.presentation.fragment.BetslipFragment$setListData$1$1", f = "BetslipFragment.kt", l = {641, 643, 648}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public Map a;
        public int b;
        public final /* synthetic */ o4p d;
        public final /* synthetic */ r4p e;

        @c0d(c = "com.sportybet.android.virtual.presentation.fragment.BetslipFragment$setListData$1$1$1", f = "BetslipFragment.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ jp3 a;
            public final /* synthetic */ o4p b;
            public final /* synthetic */ r4p c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(jp3 jp3Var, o4p o4pVar, r4p r4pVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.a = jp3Var;
                this.b = o4pVar;
                this.c = r4pVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.a, this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:19:0x003e A[PHI: r0
              0x003e: PHI (r0v5 java.lang.String) = 
              (r0v3 java.lang.String)
              (r0v9 java.lang.String)
              (r0v17 java.lang.String)
              (r0v19 java.lang.String)
              (r0v26 java.lang.String)
              (r0v28 java.lang.String)
             binds: [B:48:0x0094, B:43:0x0089, B:37:0x0073, B:32:0x0065, B:24:0x004a, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:25:0x004c  */
            /* JADX WARN: Code duplicated, block: B:45:0x008c  */
            /* JADX WARN: Code duplicated, block: B:47:0x0090  */
            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                BigDecimal bigDecimal;
                String plainString;
                String str;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                jp3 jp3Var = this.a;
                String str2 = jp3Var.v;
                if (str2 == null) {
                    bigDecimal = jp3Var.i;
                    if (bigDecimal != null || (plainString = bigDecimal.toPlainString()) == null) {
                        str = "";
                    } else {
                        str = plainString;
                    }
                } else {
                    int iHashCode = str2.hashCode();
                    if (iHashCode != -902265784) {
                        if (iHashCode != -887328209) {
                            if (iHashCode == 653829648 && str2.equals(SimulateBetConsts.BetslipType.MULTIPLE)) {
                                BigDecimal bigDecimal2 = ((n4p) jp3Var.s0()).z;
                                if (bigDecimal2 == null || (plainString = bigDecimal2.toString()) == null) {
                                    BigDecimal bigDecimal3 = jp3Var.i;
                                    plainString = bigDecimal3 != null ? bigDecimal3.toPlainString() : null;
                                    if (plainString == null) {
                                        str = "";
                                    }
                                }
                                str = plainString;
                            } else {
                                bigDecimal = jp3Var.i;
                                if (bigDecimal != null) {
                                }
                                str = "";
                            }
                        } else if (str2.equals("system")) {
                            BigDecimal bigDecimal4 = ((n4p) jp3Var.s0()).y;
                            if (bigDecimal4 == null || (plainString = bigDecimal4.toString()) == null) {
                                BigDecimal bigDecimal5 = this.b.n;
                                plainString = bigDecimal5 != null ? bigDecimal5.toPlainString() : "";
                                if (plainString == null) {
                                    str = "";
                                }
                            }
                            str = plainString;
                        } else {
                            bigDecimal = jp3Var.i;
                            if (bigDecimal != null) {
                            }
                            str = "";
                        }
                    } else if (str2.equals(SimulateBetConsts.BetslipType.SINGLE)) {
                        plainString = ((n4p) jp3Var.s0()).B();
                        if (plainString == null) {
                            str = "";
                        } else {
                            str = plainString;
                        }
                    } else {
                        bigDecimal = jp3Var.i;
                        if (bigDecimal != null) {
                        }
                        str = "";
                    }
                }
                o4p o4pVar = jp3Var.z;
                if (o4pVar == null) {
                    return null;
                }
                r4p r4pVar = this.c;
                r4pVar.e.s(o4pVar, str, 0, jp3Var.D, jp3Var.t0());
                jp3Var.O0();
                r4pVar.e.g(o4pVar.a, o4pVar.n, new BigDecimal(String.valueOf(((n4p) jp3Var.s0()).j)), true);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(o4p o4pVar, r4p r4pVar, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.d = o4pVar;
            this.e = r4pVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return jp3.this.new d(this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
        
            if (r9 == r0) goto L27;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r8.b
                r2 = 3
                r3 = 2
                r4 = 1
                jp3 r5 = defpackage.jp3.this
                o4p r6 = r8.d
                r7 = 0
                if (r1 == 0) goto L28
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L18
                defpackage.uj50.b(r9)     // Catch: java.lang.Exception -> L81
                goto L7e
            L18:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r7
            L1e:
                java.util.Map r1 = r8.a
                defpackage.uj50.b(r9)     // Catch: java.lang.Exception -> L81
                goto L59
            L24:
                defpackage.uj50.b(r9)     // Catch: java.lang.Exception -> L81
                goto L36
            L28:
                defpackage.uj50.b(r9)
                java.util.ArrayList r9 = r5.y     // Catch: java.lang.Exception -> L81
                r8.b = r4     // Catch: java.lang.Exception -> L81
                java.lang.Object r9 = r5.n0(r9, r8)     // Catch: java.lang.Exception -> L81
                if (r9 != r0) goto L36
                goto L7d
            L36:
                r1 = r9
                java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L81
                java.lang.String r9 = "ONE_CUT"
                java.lang.Object r9 = r1.get(r9)     // Catch: java.lang.Exception -> L81
                java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L81
                if (r9 != 0) goto L45
                java.lang.String r9 = "0"
            L45:
                r8.a = r1     // Catch: java.lang.Exception -> L81
                r8.b = r3     // Catch: java.lang.Exception -> L81
                jp3$a r3 = defpackage.jp3.c0     // Catch: java.lang.Exception -> L81
                pfd r3 = defpackage.fse.a     // Catch: java.lang.Exception -> L81
                kp3 r4 = new kp3     // Catch: java.lang.Exception -> L81
                r4.<init>(r5, r6, r9, r7)     // Catch: java.lang.Exception -> L81
                java.lang.Object r9 = defpackage.ej5.d(r3, r4, r8)     // Catch: java.lang.Exception -> L81
                if (r9 != r0) goto L59
                goto L7d
            L59:
                java.util.Map r9 = (java.util.Map) r9     // Catch: java.lang.Exception -> L81
                r6.getClass()     // Catch: java.lang.Exception -> L81
                r1.getClass()     // Catch: java.lang.Exception -> L81
                r6.p = r1     // Catch: java.lang.Exception -> L81
                r9.getClass()     // Catch: java.lang.Exception -> L81
                r6.q = r9     // Catch: java.lang.Exception -> L81
                pfd r9 = defpackage.fse.a     // Catch: java.lang.Exception -> L81
                wcl r9 = defpackage.gku.a     // Catch: java.lang.Exception -> L81
                jp3$d$a r1 = new jp3$d$a     // Catch: java.lang.Exception -> L81
                r4p r3 = r8.e     // Catch: java.lang.Exception -> L81
                r1.<init>(r5, r6, r3, r7)     // Catch: java.lang.Exception -> L81
                r8.a = r7     // Catch: java.lang.Exception -> L81
                r8.b = r2     // Catch: java.lang.Exception -> L81
                java.lang.Object r9 = defpackage.ej5.d(r9, r1, r8)     // Catch: java.lang.Exception -> L81
                if (r9 != r0) goto L7e
            L7d:
                return r0
            L7e:
                kotlin.Unit r9 = (kotlin.Unit) r9     // Catch: java.lang.Exception -> L81
                goto L99
            L81:
                r8 = move-exception
                itf0$a r9 = defpackage.itf0.a
                java.lang.String r0 = "SB_COMMON"
                r9.q(r0)
                java.lang.String r8 = r8.getMessage()
                java.lang.String r0 = "Error calculating Flex Odds: "
                java.lang.String r8 = defpackage.inm.a(r0, r8)
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r9.d(r8, r0)
            L99:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: jp3.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class e extends qlr implements Function0<v8i0> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return jp3.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class f extends qlr implements Function0<cyb> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return jp3.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class g extends qlr implements Function0<r8i0.c> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return jp3.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class h extends qlr implements Function0<Fragment> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return jp3.this;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class i extends qlr implements Function0<w8i0> {
        public final /* synthetic */ h a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.a = hVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class j extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class k extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ttr ttrVar) {
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

    /* JADX INFO: loaded from: classes6.dex */
    public static final class l extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? jp3.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public jp3() {
        ttr ttrVarA = hwr.a(a1s.c, new i(new h()));
        this.C = new q8i0(jq40.a(mdo.class), new j(ttrVarA), new l(ttrVarA), new k(ttrVarA));
        this.D = TaxConfig.INSTANCE.getDefault();
        this.E = new q8i0(jq40.a(wdo.class), new e(), new g(), new f());
        this.V = 2;
        this.W = 2;
        this.X = -1;
        String strD = a8b.d();
        strD.getClass();
        int length = strD.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean z2 = strD.charAt(!z ? i2 : length) <= ' ';
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i2++;
            } else {
                z = true;
            }
        }
        this.Y = strD.subSequence(i2, length + 1).toString();
        this.Z = new ep3();
    }

    public final void D0() {
        try {
            Collection collectionValues = ((n4p) s0()).d.values();
            if (collectionValues == null || collectionValues.isEmpty()) {
                p0();
            }
            E0();
            I0();
            O0();
            if (u0() != null) {
                N0();
            }
            P0();
            H0();
            G0();
            if (rvi.b(this)) {
                return;
            }
            q0().a.post(new dp3(this));
        } catch (Exception unused) {
            J0();
        }
    }

    public final void E0() {
        String str;
        r4p r4pVarQ0 = q0();
        Collection collectionValues = ((n4p) s0()).d.values();
        if (collectionValues == null || collectionValues.isEmpty()) {
            this.z = null;
            return;
        }
        o4p o4pVarE = this.z;
        if (o4pVarE == null) {
            o4pVarE = ((n4p) s0()).E(this.v);
        }
        o4p o4pVar = o4pVarE;
        if ((o4pVar == null || (str = o4pVar.c) == null) && (str = ((n4p) s0()).t) == null) {
            return;
        }
        o4p o4pVarA = sqo.a(this.v, str, this.i, ((n4p) s0()).d.values(), s0());
        if (o4pVarA == null) {
            this.z = null;
            return;
        }
        if (TextUtils.equals(o4pVarA.a, SimulateBetConsts.BetslipType.SINGLE) || !o4pVarA.o) {
            if (o4pVar != null) {
                if (TextUtils.equals(o4pVarA.a, SimulateBetConsts.BetslipType.SINGLE)) {
                    ArrayList arrayList = o4pVarA.d;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        int i3 = i2 + 1;
                        ArrayList arrayList2 = ((o4p.a) arrayList.get(i2)).b;
                        int size2 = arrayList2.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            int i5 = i4 + 1;
                            o4p.b bVar = (o4p.b) arrayList2.get(i4);
                            BigDecimal bigDecimalC = this.i;
                            try {
                                bigDecimalC = o4pVar.c(bVar.b);
                            } catch (Exception e2) {
                                itf0.a aVar = itf0.a;
                                aVar.q(MyLog.TAG_INSTANT_WIN);
                                aVar.p(e2, "unable to get stake", new Object[0]);
                            }
                            o4pVarA.h(bigDecimalC, bVar.b);
                            i4 = i5;
                            arrayList = arrayList;
                            size = size;
                        }
                        i2 = i3;
                    }
                } else if (TextUtils.equals(o4pVarA.a, SimulateBetConsts.BetslipType.MULTIPLE)) {
                    o4pVarA.f(o4pVarA.f, o4pVar.b(o4pVar.f));
                } else if (TextUtils.equals(o4pVarA.a, "system")) {
                    SparseIntArray sparseIntArray = o4pVarA.e;
                    int size3 = sparseIntArray.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        BigDecimal bigDecimalB = this.i;
                        try {
                            bigDecimalB = o4pVar.b(sparseIntArray.keyAt(i6));
                        } catch (Exception e3) {
                            itf0.a aVar2 = itf0.a;
                            aVar2.q(MyLog.TAG_INSTANT_WIN);
                            aVar2.p(e3, "unable to get stake from ticketData.getStake", new Object[0]);
                        }
                        o4pVarA.f(sparseIntArray.keyAt(i6), bigDecimalB);
                    }
                }
            }
            this.z = o4pVarA;
            ((n4p) s0()).M(this.v, o4pVarA);
            InstantWinFooterLayout instantWinFooterLayout = r4pVarQ0.e;
            BigDecimal bigDecimal = o4pVarA.n;
            instantWinFooterLayout.setupFooter(o4pVarA, bigDecimal != null ? bigDecimal.toPlainString() : "", this, this.D, this.V, this.W, t0());
        }
    }

    @Override // com.sportybet.android.virtual.presentation.widget.InstantWinFooterLayout.a
    public final void F() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_show_flex_bet_info", this.V == 0);
        bundle.putBoolean("key_show_cut_bet_info", this.W == 0);
        gvo gvoVar = new gvo();
        gvoVar.setArguments(bundle);
        gvoVar.setCancelable(true);
        gvoVar.show(getChildFragmentManager(), "InsureInfoFragment");
    }

    public final void F0(String str) {
        rdd0 rdd0Var = this.M;
        if (rdd0Var != null) {
            rdd0Var.a(new a5o.g0("instant_virtual", (Map<String, ? extends Object>) u.a(AnalyticsParam.CONTENT_TYPE, str)), k00.b, k00.a, k00.c);
        } else {
            Intrinsics.n("sportyTrackingUseCase");
            throw null;
        }
    }

    public final void G0() {
        if (this.z == null || !TextUtils.equals(this.v, SimulateBetConsts.BetslipType.MULTIPLE)) {
            return;
        }
        BigDecimal bigDecimal = ((n4p) s0()).z;
        if (bigDecimal != null) {
            T(0, bigDecimal.toPlainString(), false);
            return;
        }
        BigDecimal bigDecimal2 = this.i;
        bigDecimal2.getClass();
        T(0, bigDecimal2.toPlainString(), false);
    }

    public final void H0() {
        String plainString;
        if (this.z == null || !TextUtils.equals(this.v, "system")) {
            return;
        }
        if (((n4p) s0()).x.size() == 0) {
            if (((n4p) s0()).y != null) {
                plainString = ((n4p) s0()).y.toString();
            } else {
                BigDecimal bigDecimal = this.i;
                if (bigDecimal == null || (plainString = bigDecimal.toPlainString()) == null) {
                    plainString = "";
                }
            }
            plainString.getClass();
            if (!TextUtils.isEmpty(plainString)) {
                o4p o4pVar = this.z;
                o4pVar.getClass();
                int i2 = o4pVar.f;
                o4p o4pVar2 = this.z;
                o4pVar2.getClass();
                int i3 = o4pVar2.g;
                if (i2 <= i3) {
                    while (true) {
                        T(i2, plainString, true);
                        if (i2 == i3) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            T(0, plainString, true);
            return;
        }
        tlo tloVarS0 = s0();
        o4p o4pVar3 = this.z;
        o4pVar3.getClass();
        String strY = ((n4p) tloVarS0).y(o4pVar3.f);
        HashMap map = new HashMap();
        o4p o4pVar4 = this.z;
        o4pVar4.getClass();
        int i4 = o4pVar4.f;
        o4p o4pVar5 = this.z;
        o4pVar5.getClass();
        int i5 = o4pVar5.g;
        boolean z = true;
        if (i4 <= i5) {
            while (true) {
                String strY2 = ((n4p) s0()).y(i4);
                if (!Intrinsics.g(strY, strY2) && z) {
                    z = false;
                }
                if (!TextUtils.isEmpty(strY2)) {
                    map.put(Integer.valueOf(i4), strY2);
                }
                if (i4 == i5) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        if (z && strY != null) {
            T(0, strY, true);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            T(((Number) entry.getKey()).intValue(), (String) entry.getValue(), true);
        }
        o4p o4pVar6 = this.z;
        if (o4pVar6 != null) {
            q0().e.s(o4pVar6, "", 0, this.D, t0());
        }
    }

    public final void I0() {
        r4p r4pVarQ0 = q0();
        o4p o4pVar = this.z;
        ArrayList arrayList = this.y;
        if (o4pVar == null) {
            p0();
            r4pVarQ0.f.setDescendantFocusability(393216);
            arrayList.clear();
            BetslipAdapter betslipAdapter = this.w;
            if (betslipAdapter != null) {
                betslipAdapter.setList(arrayList);
            }
            r4pVarQ0.f.setDescendantFocusability(262144);
        } else {
            arrayList.clear();
            Iterator it = ((n4p) s0()).d.values().iterator();
            while (true) {
                String plainString = null;
                if (!it.hasNext()) {
                    break;
                }
                BetSlipData betSlipData = (BetSlipData) it.next();
                if (TextUtils.equals(o4pVar.a, SimulateBetConsts.BetslipType.SINGLE)) {
                    BigDecimal bigDecimal = sqo.a;
                    BigDecimal bigDecimalD = ((n4p) s0()).D(sqo.b(betSlipData.eventId, betSlipData.marketId, betSlipData.outcomeId));
                    if (bigDecimalD != null || (bigDecimalD = this.i) != null) {
                        plainString = bigDecimalD.toPlainString();
                    }
                } else {
                    plainString = "0";
                }
                String str = o4pVar.a;
                String str2 = betSlipData.eventId;
                String str3 = betSlipData.marketId;
                String str4 = betSlipData.outcomeId;
                String str5 = betSlipData.marketTitle;
                String str6 = betSlipData.homeTeamName;
                String str7 = betSlipData.awayTeamName;
                String str8 = betSlipData.odds;
                Iterator it2 = it;
                String str9 = betSlipData.outComeDesc;
                r4p r4pVar = r4pVarQ0;
                String str10 = betSlipData.probability;
                o4p o4pVar2 = o4pVar;
                boolean z = betSlipData.isHighlighted;
                bq3 bq3Var = new bq3();
                bq3Var.a = str;
                bq3Var.b = str2;
                bq3Var.c = str3;
                bq3Var.d = str4;
                bq3Var.j = str5;
                bq3Var.e = str6;
                bq3Var.f = str7;
                bq3Var.g = plainString;
                bq3Var.h = str8;
                bq3Var.i = str9;
                bq3Var.l = str10;
                bq3Var.n = z;
                bq3Var.o = this;
                betSlipData.setHighlighted(false);
                arrayList.add(bq3Var);
                Q0(bq3Var);
                it = it2;
                r4pVarQ0 = r4pVar;
                o4pVar = o4pVar2;
            }
            r4p r4pVar2 = r4pVarQ0;
            BetslipAdapter betslipAdapter2 = this.w;
            betslipAdapter2.getClass();
            betslipAdapter2.setList(arrayList);
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new d(o4pVar, r4pVar2, null), 3);
        }
        if (((n4p) s0()).H) {
            ((n4p) s0()).H = false;
            ConstraintLayout constraintLayout = q0().a;
            Context contextRequireContext = requireContext();
            LayoutInflater layoutInflater = getLayoutInflater();
            String strD = sn5.d(this, R.string.page_instant_virtual__selection_reload, new Object[0]);
            BigDecimal bigDecimal2 = sqo.a;
            final Snackbar snackbarH = Snackbar.h(constraintLayout, "", -1);
            ViewGroup viewGroup = (Snackbar.SnackbarLayout) snackbarH.i;
            viewGroup.removeAllViews();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
            int dimensionPixelSize = contextRequireContext.getResources().getDimensionPixelSize(R.dimen.twelve);
            marginLayoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, dimensionPixelSize);
            viewGroup.setLayoutParams(marginLayoutParams);
            Drawable drawable = contextRequireContext.getDrawable(R.drawable.bg_snackbar);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            viewGroup.setBackground(drawable);
            View viewInflate = layoutInflater.inflate(R.layout.iwqk_snack_bar, viewGroup, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.snack_bar_title);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.snack_bar_close);
            textView.setText(strD);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: mqo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    snackbarH.b(3);
                }
            });
            viewGroup.addView(viewInflate, 0);
            snackbarH.j();
        }
    }

    @Override // com.sportybet.android.virtual.presentation.widget.InstantWinFooterLayout.a
    public final void J(int i2) {
        seo seoVar = q0().e.c;
        if (i2 > 0) {
            seoVar.S.b(true);
        }
        int childCount = seoVar.T.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = seoVar.T.getChildAt(i3);
            childAt.getClass();
            StakeItemLayout stakeItemLayout = (StakeItemLayout) childAt;
            if (i3 != i2 - 1) {
                stakeItemLayout.b(true);
            } else {
                stakeItemLayout.v.N(stakeItemLayout.A);
                stakeItemLayout.v.L(stakeItemLayout.i, 3);
            }
        }
        BetslipAdapter betslipAdapter = this.w;
        if (betslipAdapter == null) {
            betslipAdapter = null;
        }
        if (betslipAdapter == null || betslipAdapter.getData().isEmpty()) {
            return;
        }
        v0(betslipAdapter);
    }

    public final void J0() {
        sqo.j(getActivity(), new DialogInterface.OnClickListener() { // from class: uo3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                jp3.a aVar = jp3.c0;
                this.a.z0();
            }
        });
    }

    public final void K0(Context context) {
        androidx.appcompat.app.b.a title = new androidx.appcompat.app.b.a(context).setTitle(sn5.d(this, R.string.common_functions__note, new Object[0]));
        Double d2 = ((n4p) s0()).E;
        d2.getClass();
        title.a.f = sn5.d(this, R.string.component_betslip__flexibet_feature_cannot_be_applied_tip, new BigDecimal(d2.doubleValue()).setScale(2, RoundingMode.HALF_UP).toString());
        title.c(sn5.d(this, R.string.common_functions__ok, new Object[0]), new cp3());
        androidx.appcompat.app.b bVarCreate = title.create();
        bVarCreate.getClass();
        bVarCreate.setCanceledOnTouchOutside(false);
        bVarCreate.show();
    }

    public final void L0(boolean z) {
        if (getActivity() != null) {
            eeo eeoVar = (eeo) getParentFragmentManager().H("tag_confirm_dialog");
            this.b0 = eeoVar;
            if (!z) {
                if (eeoVar != null) {
                    eeoVar.v = null;
                    eeoVar.dismissAllowingStateLoss();
                    return;
                }
                return;
            }
            if (eeoVar == null) {
                String str = this.v;
                TaxConfig taxConfig = this.D;
                Bundle bundle = new Bundle();
                bundle.putString("ARG_BETSLIP_TYPE", str);
                bundle.putParcelable("ARG_VIRTUAL_TAX_CONFIG", taxConfig);
                eeo eeoVar2 = new eeo();
                eeoVar2.setArguments(bundle);
                this.b0 = eeoVar2;
                eeoVar2.v = this;
                FragmentManager parentFragmentManager = getParentFragmentManager();
                parentFragmentManager.getClass();
                eeoVar2.show(parentFragmentManager, "tag_confirm_dialog");
            }
        }
    }

    public final void M0(boolean z) {
        androidx.fragment.app.e activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        Fragment fragmentH = parentFragmentManager.H("tag_submitting_dialog");
        bde0 bde0Var = fragmentH instanceof bde0 ? (bde0) fragmentH : null;
        if (z) {
            if ((bde0Var != null && bde0Var.isAdded()) || parentFragmentManager.K || parentFragmentManager.V()) {
                return;
            }
            new bde0().show(parentFragmentManager, "tag_submitting_dialog");
            return;
        }
        if (bde0Var != null) {
            bde0 bde0Var2 = bde0Var.isAdded() ? bde0Var : null;
            if (bde0Var2 != null) {
                bde0Var2.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00e6  */
    public final void N0() {
        BigDecimal exciseTax;
        o4p o4pVar;
        r4p r4pVarQ0 = q0();
        j7g j7gVar = new j7g("");
        ConstraintLayout constraintLayout = r4pVarQ0.a;
        InstantWinFooterLayout instantWinFooterLayout = r4pVarQ0.e;
        int color = constraintLayout.getContext().getColor(R.color.text_type1_primary);
        ConstraintLayout constraintLayout2 = r4pVarQ0.a;
        int color2 = constraintLayout2.getContext().getColor(R.color.brand_secondary);
        int size = r0().b.p1().getValue().size();
        if (size > 0) {
            j7gVar.e(color, sn5.d(this, R.string.component_coupon__use_gifts_with_num, String.valueOf(size)));
        }
        m780 m780VarT0 = t0();
        if (m780VarT0 != null && (o4pVar = this.z) != null) {
            String strValueOf = String.valueOf(o4pVar.j);
            int kind = m780VarT0.b.getKind();
            String str = m780VarT0.a;
            String strB = m780VarT0.b();
            String strP = kotlin.text.c.p(strValueOf, ",", "", false);
            String strP2 = kotlin.text.c.p(str, ",", "", false);
            if (strP.length() > 0 && Double.parseDouble(strP2) > Double.parseDouble(strP)) {
                strP2 = strValueOf;
            }
            String strA = pvf.a(constraintLayout2.getContext(), kind);
            String strA2 = oxc.a(this.Y, " -", String.format(Locale.US, "%,.2f", Arrays.copyOf(new Object[]{Double.valueOf(Double.parseDouble(strP2))}, 1)));
            if (strA != null && strA.length() != 0) {
                strA2 = tug.a(strA, ", ", strA2);
            }
            j7gVar.clear();
            j7gVar.e(color2, strA2);
            if (kind == 2 && strValueOf.length() > 0 && strB.length() > 0 && Double.parseDouble(strValueOf) < Double.parseDouble(strB)) {
                if (size > 0) {
                    String strD = sn5.d(this, R.string.component_coupon__use_gifts_with_num, String.valueOf(size));
                    j7gVar.clear();
                    j7gVar.e(color, strD);
                }
            }
        } else if (size > 0) {
            String strD2 = sn5.d(this, R.string.component_coupon__use_gifts_with_num, String.valueOf(size));
            j7gVar.clear();
            j7gVar.e(color, strD2);
        }
        o4p o4pVar2 = this.z;
        if (o4pVar2 != null) {
            if (m780VarT0 == null || ((n4p) s0()).C) {
                TaxConfig taxConfig = this.D;
                BigDecimal bigDecimal = o4pVar2.j;
                bigDecimal.getClass();
                exciseTax = taxConfig.getExciseTax(bigDecimal);
            } else {
                BigDecimal bigDecimal2 = new BigDecimal(kotlin.text.c.p(m780VarT0.a, ",", "", false));
                BigDecimal bigDecimalSubtract = o4pVar2.j.compareTo(bigDecimal2) > 0 ? o4pVar2.j.subtract(bigDecimal2) : BigDecimal.ZERO;
                TaxConfig taxConfig2 = this.D;
                bigDecimalSubtract.getClass();
                exciseTax = taxConfig2.getExciseTax(bigDecimalSubtract);
            }
            instantWinFooterLayout.setShowExciseTax(this.D.hasExciseTaxRate(), bjb0.L(exciseTax, Locale.US), o4pVar2.a);
        }
        seo seoVar = instantWinFooterLayout.c;
        if (j7gVar.length() == 0 || !instantWinFooterLayout.getGiftManager().a0()) {
            seoVar.D.setVisibility(8);
            return;
        }
        if (!seoVar.H.isChecked()) {
            seoVar.D.setVisibility(0);
        }
        seoVar.C.setText(j7gVar);
    }

    public final void O0() {
        r4p r4pVarQ0 = q0();
        r4pVarQ0.c.setEnabled(w0());
        BigDecimal bigDecimalO0 = o0();
        NextButtonLayout nextButtonLayout = r4pVarQ0.c;
        String strD = sn5.d(this, R.string.component_betslip__about_to_pay_vamount, bjb0.L(bigDecimalO0, Locale.US));
        boolean zIsEmpty = TextUtils.isEmpty(strD);
        TextView textView = nextButtonLayout.b;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            nextButtonLayout.b.setText(strD);
        }
    }

    public final void P0() {
        BigDecimal bigDecimalC;
        if (TextUtils.equals(this.v, SimulateBetConsts.BetslipType.SINGLE)) {
            BetslipAdapter betslipAdapter = this.w;
            betslipAdapter.getClass();
            List<bq3> data = betslipAdapter.getData();
            if (data.size() == 0) {
                return;
            }
            bq3 bq3Var = data.get(0);
            BigDecimal bigDecimal = sqo.a;
            String strB = sqo.b(bq3Var.b, bq3Var.c, bq3Var.d);
            o4p o4pVar = this.z;
            ((n4p) s0()).L(new Pair<>(strB, (o4pVar == null || (bigDecimalC = o4pVar.c(strB)) == null) ? null : bigDecimalC.toPlainString()));
        }
    }

    public final void Q0(bq3 bq3Var) {
        o4p o4pVar;
        o4p o4pVar2 = this.z;
        if (o4pVar2 == null || !TextUtils.equals(o4pVar2.a, SimulateBetConsts.BetslipType.SINGLE) || (o4pVar = this.z) == null) {
            return;
        }
        BigDecimal bigDecimal = sqo.a;
        o4pVar.h(new BigDecimal(bq3Var.g), sqo.b(bq3Var.b, bq3Var.c, bq3Var.d));
    }

    @Override // com.sportybet.android.virtual.presentation.widget.InstantWinFooterLayout.a
    public final void T(int i2, String str, boolean z) {
        BigDecimal bigDecimalG;
        BigDecimal bigDecimal;
        BigDecimal bigDecimalG2;
        BigDecimal bigDecimalG3;
        BigDecimal bigDecimalG4;
        BigDecimal bigDecimalG5;
        String str2;
        BigDecimal bigDecimalG6;
        BigDecimal bigDecimalG7;
        BigDecimal bigDecimalG8;
        r4p r4pVarQ0 = q0();
        if (str == null || (bigDecimalG = kotlin.text.b.g(str)) == null) {
            bigDecimalG = BigDecimal.ZERO;
            bigDecimalG.getClass();
        }
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimalG.compareTo(bigDecimal2) == 0) {
            bigDecimal2.getClass();
            bigDecimal = bigDecimal2;
        } else {
            bigDecimal = bigDecimalG;
        }
        if (TextUtils.equals(this.v, SimulateBetConsts.BetslipType.SINGLE)) {
            o4p o4pVar = this.z;
            o4pVar.getClass();
            ArrayList arrayList = o4pVar.d;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ArrayList arrayList2 = ((o4p.a) obj).b;
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    o4p o4pVar2 = this.z;
                    o4pVar2.getClass();
                    String str3 = ((o4p.b) obj2).b;
                    if (str == null || (bigDecimalG8 = kotlin.text.b.g(str)) == null) {
                        bigDecimalG8 = BigDecimal.ZERO;
                        bigDecimalG8.getClass();
                    }
                    o4pVar2.h(bigDecimalG8, str3);
                }
            }
        } else if (TextUtils.equals(this.v, SimulateBetConsts.BetslipType.MULTIPLE)) {
            o4p o4pVar3 = this.z;
            o4pVar3.getClass();
            o4p o4pVar4 = this.z;
            o4pVar4.getClass();
            int i5 = o4pVar4.f;
            if (str == null || (bigDecimalG5 = kotlin.text.b.g(str)) == null) {
                bigDecimal2.getClass();
            } else {
                bigDecimal2 = bigDecimalG5;
            }
            o4pVar3.f(i5, bigDecimal2);
        } else if (TextUtils.equals(this.v, "system")) {
            o4p o4pVar5 = this.z;
            if (i2 == 0) {
                o4pVar5.getClass();
                int i6 = o4pVar5.f;
                o4p o4pVar6 = this.z;
                o4pVar6.getClass();
                int i7 = o4pVar6.g;
                if (i6 <= i7) {
                    while (true) {
                        o4p o4pVar7 = this.z;
                        o4pVar7.getClass();
                        if (str == null || (bigDecimalG4 = kotlin.text.b.g(str)) == null) {
                            bigDecimalG4 = BigDecimal.ZERO;
                            bigDecimalG4.getClass();
                        }
                        o4pVar7.f(i6, bigDecimalG4);
                        if (i6 == i7) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
                tlo tloVarS0 = s0();
                if (str == null || (bigDecimalG3 = kotlin.text.b.g(str)) == null) {
                    bigDecimalG3 = BigDecimal.ZERO;
                    bigDecimalG3.getClass();
                }
                ((n4p) tloVarS0).y = bigDecimalG3;
            } else {
                o4pVar5.getClass();
                if (str == null || (bigDecimalG2 = kotlin.text.b.g(str)) == null) {
                    bigDecimal2.getClass();
                } else {
                    bigDecimal2 = bigDecimalG2;
                }
                o4pVar5.f(i2, bigDecimal2);
            }
        }
        o4p o4pVar8 = this.z;
        if (o4pVar8 != null) {
            str2 = str;
            r4pVarQ0.e.s(o4pVar8, str2, i2, this.D, t0());
        } else {
            str2 = str;
        }
        O0();
        String plainString = bigDecimal.toPlainString();
        BetslipAdapter betslipAdapter = this.w;
        if (betslipAdapter != null) {
            List<bq3> data = betslipAdapter.getData();
            boolean z2 = false;
            for (bq3 bq3Var : data) {
                if (plainString != null && !Intrinsics.g(bq3Var.g, plainString)) {
                    bq3Var.g = plainString;
                    z2 = true;
                }
                bq3Var.m = true;
            }
            if (z2) {
                betslipAdapter.notifyItemRangeChanged(0, data.size(), BetslipAdapter.PAYLOAD_AMOUNT);
            }
        }
        if (!z && TextUtils.equals(this.v, "system")) {
            if (i2 == 0) {
                tlo tloVarS1 = s0();
                if (str2 == null || (bigDecimalG7 = kotlin.text.b.g(str2)) == null) {
                    bigDecimalG7 = BigDecimal.ZERO;
                    bigDecimalG7.getClass();
                }
                ((n4p) tloVarS1).y = bigDecimalG7;
                if (str2 != null && str2.length() != 0) {
                    o4p o4pVar9 = this.z;
                    o4pVar9.getClass();
                    int i8 = o4pVar9.f;
                    o4p o4pVar10 = this.z;
                    o4pVar10.getClass();
                    int i9 = o4pVar10.g;
                    if (i8 <= i9) {
                        while (true) {
                            ((n4p) s0()).K(i8, str2);
                            if (i8 == i9) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                    }
                }
            } else {
                ((n4p) s0()).K(i2, str2);
            }
        }
        if (TextUtils.equals(this.v, SimulateBetConsts.BetslipType.MULTIPLE)) {
            if (TextUtils.isEmpty(str2)) {
                ((n4p) s0()).z = null;
            } else {
                tlo tloVarS2 = s0();
                if (str2 == null || (bigDecimalG6 = kotlin.text.b.g(str2)) == null) {
                    bigDecimalG6 = BigDecimal.ZERO;
                    bigDecimalG6.getClass();
                }
                ((n4p) tloVarS2).z = bigDecimalG6;
            }
        }
        P0();
        if (u0() != null) {
            N0();
        }
    }

    @Override // eeo.a
    public final void b() {
        L0(false);
        if (((n4p) s0()).N()) {
            sqo.i(requireActivity(), ((n4p) s0()).s, ((n4p) s0()).F());
            return;
        }
        if (getAccountHelper().getAccount() == null) {
            y03 y03Var = this.B;
            if (y03Var != null) {
                y03Var.X();
            }
        } else {
            this.a0 = true;
            y0(false);
            M0(true);
            o4p o4pVar = ((n4p) s0()).f;
            if (o4pVar == null) {
                hb5.a("no ticket data to place bet");
                return;
            }
            String strC = ((n4p) s0()).c();
            String str = ((n4p) s0()).t;
            str.getClass();
            TicketParameter ticketParameterB = sqf0.b(strC, str, o4pVar, ((n4p) s0()).B, ((n4p) s0()).C, ((n4p) s0()).A, ((n4p) s0()).l, ((n4p) s0()).G, ((n4p) s0()).q, ((n4p) s0()).r, t0());
            mdo mdoVarR0 = r0();
            BigDecimal bigDecimal = o4pVar.j;
            bigDecimal.getClass();
            mdoVarR0.x1(ticketParameterB, bigDecimal, InstantWinBetSource.BETSLIP);
            y0(true);
            ((n4p) s0()).B = false;
            ((n4p) s0()).C = false;
            ((n4p) s0()).A.h = 0;
        }
        F0("bet_and_kick_off_confirm");
    }

    @Override // eeo.a
    public final void d() {
        L0(false);
        F0("cancel_bet_confirm");
    }

    public final uqm getAccountHelper() {
        uqm uqmVar = this.K;
        if (uqmVar != null) {
            return uqmVar;
        }
        Intrinsics.n("accountHelper");
        throw null;
    }

    @Override // com.sportybet.android.virtual.presentation.widget.InstantWinFooterLayout.a
    public final void h0() {
        D0();
        O0();
    }

    @Override // com.sportybet.android.virtual.presentation.widget.InstantWinFooterLayout.a
    public final void m() {
        final WeakReference weakReference = new WeakReference(getActivity());
        getAccountHelper().setRegisterStatus(false);
        getAccountHelper().demandAccount(getActivity(), new tit() { // from class: ap3
            @Override // defpackage.tit
            public final void w(Account account, boolean z) {
                Integer numA;
                jp3.a aVar = jp3.c0;
                if (account == null) {
                    return;
                }
                jp3 jp3Var = this.a;
                if (jp3Var.getAccountHelper().getRegisterStatus()) {
                    jp3Var.getAccountHelper().setRegisterStatus(false);
                    return;
                }
                o4p o4pVar = jp3Var.z;
                if (o4pVar == null || (numA = vcj.a(((n4p) jp3Var.s0()).c())) == null) {
                    return;
                }
                int iIntValue = numA.intValue();
                boolean z2 = ((n4p) jp3Var.s0()).B;
                boolean z3 = ((n4p) jp3Var.s0()).C;
                ji2 ji2Var = jp3Var.H;
                if (ji2Var == null) {
                    Intrinsics.n("betBuilderUtil");
                    throw null;
                }
                InstantWinGiftApplicabilityContext instantWinGiftApplicabilityContextA = sqf0.a(o4pVar, z2, z3, ji2Var, null);
                if (instantWinGiftApplicabilityContextA == null) {
                    return;
                }
                Activity activity = (Activity) weakReference.get();
                activity.getClass();
                if (activity.isFinishing()) {
                    return;
                }
                fqk fqkVar = new fqk(iIntValue, instantWinGiftApplicabilityContextA, jp3Var.t0());
                ee<fqk> eeVar = jp3Var.F;
                if (eeVar != null) {
                    eeVar.b(fqkVar);
                }
            }
        });
    }

    public final int m0(int i2) {
        if (rvi.b(this)) {
            return bqe.a(88.0f) * i2;
        }
        int dimension = q0().c.getVisibility() == 0 ? (int) bqe.b.getDimension(R.dimen.iwqk_betslip_place_bet_button_height_63_dp) : 0;
        int height = q0().d.getVisibility() == 0 ? q0().d.getHeight() : 0;
        return (bqe.a(88.0f) * i2) + dimension + height + (q0().e.getVisibility() == 0 ? q0().e.getHeight() : 0);
    }

    @Override // com.sportybet.android.virtual.presentation.widget.InstantWinFooterLayout.a
    public final void n() {
        m780 m780VarT0;
        N0();
        o4p o4pVar = this.z;
        if (o4pVar == null || (m780VarT0 = t0()) == null) {
            return;
        }
        boolean z = ((n4p) s0()).B;
        boolean z2 = ((n4p) s0()).C;
        ji2 ji2Var = this.H;
        if (ji2Var == null) {
            Intrinsics.n("betBuilderUtil");
            throw null;
        }
        InstantWinGiftApplicabilityContext instantWinGiftApplicabilityContextA = sqf0.a(o4pVar, z, z2, ji2Var, null);
        if (instantWinGiftApplicabilityContextA == null || gfo.a(m780VarT0.b, instantWinGiftApplicabilityContextA.a)) {
            return;
        }
        r0().E(this.v);
    }

    public final Object n0(ArrayList arrayList, d dVar) {
        if (!arrayList.isEmpty()) {
            o4p o4pVar = this.z;
            if (Intrinsics.g(o4pVar != null ? o4pVar.a : null, SimulateBetConsts.BetslipType.MULTIPLE)) {
                ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    arrayList2.add(((bq3) obj).l);
                }
                zuh zuhVar = zuh.a;
                String str = ((n4p) s0()).D;
                if (str == null) {
                    str = "";
                }
                return ej5.d(zuh.b, new suh(arrayList2, str, null), dVar);
            }
        }
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        return o2gVar;
    }

    public final BigDecimal o0() {
        BigDecimal bigDecimal;
        try {
            o4p o4pVar = this.z;
            if (o4pVar == null || (bigDecimal = o4pVar.j) == null) {
                bigDecimal = BigDecimal.ZERO;
            }
            m780 m780VarT0 = t0();
            if (m780VarT0 != null && !((n4p) s0()).C) {
                int kind = m780VarT0.b.getKind();
                String str = m780VarT0.a;
                String strB = m780VarT0.b();
                BigDecimal bigDecimalSubtract = bigDecimal.subtract(new BigDecimal(str));
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                if (bigDecimalSubtract.compareTo(bigDecimal2) < 0) {
                    bigDecimalSubtract = bigDecimal2;
                }
                if (kind != 2 || strB.length() <= 0 || bigDecimal.compareTo(new BigDecimal(strB)) >= 0) {
                    bigDecimal = bigDecimalSubtract;
                }
            }
            bigDecimal.getClass();
            return bigDecimal;
        } catch (Exception unused) {
            BigDecimal bigDecimal3 = BigDecimal.ZERO;
            bigDecimal3.getClass();
            return bigDecimal3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tml, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.B = (y03) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(context + " must implement OnRemoveItemListener");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        BigDecimal bigDecimal;
        super.onCreate(bundle);
        if (getArguments() == null) {
            hb5.a("no arguments was found");
            return;
        }
        this.v = requireArguments().getString("ARG_BETSLIP_TYPE");
        this.z = ((n4p) s0()).E(this.v);
        if (((n4p) s0()).F()) {
            grm grmVar = this.U;
            if (grmVar == null) {
                Intrinsics.n("iBDefaultStakeAnTestHelper");
                throw null;
            }
            bigDecimal = grmVar.a();
        } else {
            nzm nzmVar = this.O;
            if (nzmVar == null) {
                Intrinsics.n("stakeConfigAgent");
                throw null;
            }
            bigDecimal = new BigDecimal(nzmVar.j());
        }
        this.i = bigDecimal;
        this.A = new Handler();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ((n4p) s0()).M(this.v, this.z);
        r0().R(((n4p) s0()).c(), ((n4p) s0()).t, ((n4p) s0()).d.values());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        BigDecimal bigDecimal;
        super.onResume();
        if (this.z != null) {
            if (((n4p) s0()).F()) {
                grm grmVar = this.U;
                if (grmVar == null) {
                    Intrinsics.n("iBDefaultStakeAnTestHelper");
                    throw null;
                }
                bigDecimal = grmVar.a();
            } else {
                nzm nzmVar = this.O;
                if (nzmVar == null) {
                    Intrinsics.n("stakeConfigAgent");
                    throw null;
                }
                bigDecimal = new BigDecimal(nzmVar.j());
            }
            if (Intrinsics.g(this.i, bigDecimal)) {
                return;
            }
            this.i = bigDecimal;
            T(0, bigDecimal != null ? bigDecimal.toPlainString() : null, true);
        }
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [fp3] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        jlo jloVar = this.G;
        if (jloVar == null) {
            Intrinsics.n("instantWinRouter");
            throw null;
        }
        this.F = registerForActivityResult(jloVar.a(), new qp3(this));
        r4p r4pVarQ0 = q0();
        NextButtonLayout nextButtonLayout = r4pVarQ0.c;
        RecyclerView recyclerView = r4pVarQ0.b;
        int i2 = 0;
        nextButtonLayout.setData(sn5.d(this, getAccountHelper().isLogin() ? R.string.component_betslip__place_bet : R.string.component_betslip__login_to_place_bet, new Object[0]), sn5.d(this, R.string.component_betslip__about_to_pay_vamount, bjb0.P("0", Locale.US)), new lp3(this, r4pVarQ0));
        recyclerView.setItemAnimator(null);
        ji2 ji2Var = this.H;
        if (ji2Var == null) {
            Intrinsics.n("betBuilderUtil");
            throw null;
        }
        tlo tloVarS0 = s0();
        uy0 uy0Var = this.L;
        if (uy0Var == null) {
            Intrinsics.n("assetsInfoRepository");
            throw null;
        }
        jpk jpkVar = r0().b;
        cmo cmoVar = this.T;
        if (cmoVar == null) {
            Intrinsics.n("instantWinSportRepo");
            throw null;
        }
        BetslipAdapter betslipAdapter = new BetslipAdapter(ji2Var, tloVarS0, uy0Var, jpkVar, cmoVar);
        this.w = betslipAdapter;
        recyclerView.setAdapter(betslipAdapter);
        q8i0 q8i0Var = this.E;
        udo udoVar = new udo((wdo) q8i0Var.getValue(), null);
        kotlin.coroutines.e eVar = kotlin.coroutines.e.a;
        this.V = ((Number) dj5.a(eVar, udoVar)).intValue();
        this.W = ((Number) dj5.a(eVar, new vdo((wdo) q8i0Var.getValue(), null))).intValue();
        ex4 ex4Var = this.N;
        if (ex4Var == null) {
            Intrinsics.n("bookConfigRepository");
            throw null;
        }
        g1i g1iVar = new g1i(ex4Var.p(), new np3(this, null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        mdo mdoVarR0 = r0();
        String strC = ((n4p) s0()).c();
        mdoVarR0.f.y0(strC, false);
        mdoVarR0.e.a(o8i0.d(mdoVarR0), strC);
        r0().y.f(getViewLifecycleOwner(), new c(new bp3(this, i2)));
        uwd0<List<GiftDetails>> uwd0VarP1 = r0().b.p1();
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new op3(viewLifecycleOwner, uwd0VarP1, null, this), 3);
        lyh<m780> lyhVarG0 = r0().b.G0(this.v);
        ibs viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        ej5.c(ebs.a(viewLifecycleOwner2.getLifecycle()), null, null, new pp3(viewLifecycleOwner2, lyhVarG0, null, this), 3);
        q0().d.setVisibility(((n4p) s0()).s() ? 0 : 8);
        if (((n4p) s0()).s()) {
            Collection collectionValues = ((n4p) s0()).d.values();
            collectionValues.getClass();
            boolean zIsEmpty = collectionValues.isEmpty();
            q0().e.setVisibility(!zIsEmpty ? 0 : 8);
            q0().c.setVisibility(zIsEmpty ? 8 : 0);
            q0().d.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: zo3
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                    y03 y03Var;
                    jp3.a aVar = jp3.c0;
                    if (i6 - i4 != i10 - i8) {
                        jp3 jp3Var = this.a;
                        if (rvi.b(jp3Var) || (y03Var = jp3Var.B) == null) {
                            return;
                        }
                        y03Var.M0(jp3Var.m0(((n4p) jp3Var.s0()).d.size()), jp3Var.v);
                    }
                }
            });
            ComposeView composeView = q0().d;
            final uwd0<lt3> uwd0VarY = r0().f.y();
            final ?? r2 = new Function0() { // from class: fp3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    jp3.a aVar = jp3.c0;
                    this.a.r0().p0();
                    return Unit.a;
                }
            };
            final gp3 gp3Var = new gp3(this, 0);
            uwd0VarY.getClass();
            composeView.setContent(new op8(-1517477549, new Function2() { // from class: is3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final ytw ytwVarC = wyh.c(uwd0VarY, aVar, 0, 7);
                        final fp3 fp3Var = r2;
                        final gp3 gp3Var2 = gp3Var;
                        o0z.a(null, null, null, null, null, pp8.b(-661716094, new Function2() { // from class: js3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar2 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    rs3.a((lt3) ytwVarC.getValue(), fp3Var, gp3Var2, aVar2, 0);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, aVar), aVar, 196608);
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
            uwd0<lt3> uwd0VarY2 = r0().f.y();
            ibs viewLifecycleOwner3 = getViewLifecycleOwner();
            viewLifecycleOwner3.getClass();
            ej5.c(ebs.a(viewLifecycleOwner3.getLifecycle()), null, null, new sp3(viewLifecycleOwner3, uwd0VarY2, null, this), 3);
        }
    }

    public final void p0() {
        View currentFocus;
        if (rvi.b(this)) {
            return;
        }
        BetslipAdapter betslipAdapter = this.w;
        if (betslipAdapter == null) {
            betslipAdapter = null;
        }
        if (betslipAdapter != null) {
            v0(betslipAdapter);
        }
        q0().e.c.S.b(true);
        View viewFindFocus = q0().f.findFocus();
        if (viewFindFocus != null) {
            viewFindFocus.clearFocus();
        }
        q0().f.clearFocus();
        View viewFindFocus2 = q0().a.findFocus();
        if (viewFindFocus2 != null) {
            viewFindFocus2.clearFocus();
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity == null || (currentFocus = activity.getCurrentFocus()) == null) {
            return;
        }
        currentFocus.clearFocus();
    }

    public final r4p q0() {
        return (r4p) this.f.a(this, d0[0]);
    }

    public final mdo r0() {
        return (mdo) this.C.getValue();
    }

    public final tlo s0() {
        n4p n4pVar = this.J;
        if (n4pVar != null) {
            return n4pVar;
        }
        Intrinsics.n("instantWinSharedData");
        throw null;
    }

    public final m780 t0() {
        mdo mdoVarR0 = r0();
        return mdoVarR0.b.t0(this.v);
    }

    public final String u0() {
        m780 m780VarT0;
        o4p o4pVar = this.z;
        if (o4pVar == null || (m780VarT0 = t0()) == null) {
            return null;
        }
        String string = o4pVar.j.toString();
        string.getClass();
        int kind = m780VarT0.b.getKind();
        String strB = m780VarT0.b();
        if (kind != 2 || string.length() <= 0 || strB.length() <= 0 || Double.parseDouble(string) >= Double.parseDouble(strB)) {
            return m780VarT0.a;
        }
        return null;
    }

    @Override // com.sportybet.android.virtual.presentation.widget.InstantWinFooterLayout.a
    public final boolean v() {
        return t0() != null;
    }

    public final void v0(BetslipAdapter betslipAdapter) {
        List<bq3> data = betslipAdapter.getData();
        int size = data.size();
        int i2 = this.X;
        if (i2 >= 0 && i2 < size) {
            bq3 bq3Var = data.get(i2);
            if (bq3Var.k) {
                bq3Var.k = false;
                betslipAdapter.notifyItemChanged(this.X, BetslipAdapter.PAYLOAD_KEYBOARD);
            }
        }
        this.X = -1;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x010e  */
    public final boolean w0() {
        o4p o4pVar;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        uy0 uy0Var;
        AssetsInfo assetsInfoC;
        o4p o4pVar2;
        ArrayList arrayList;
        int size;
        int i2;
        o4p.a aVar;
        BigDecimal bigDecimal3;
        InstantWinFooterLayout instantWinFooterLayout = q0().e;
        o4p o4pVar3 = this.z;
        String str = o4pVar3 != null ? o4pVar3.a : null;
        BigDecimal bigDecimal4 = o4pVar3 != null ? o4pVar3.n : null;
        if (Intrinsics.g(str, SimulateBetConsts.BetslipType.MULTIPLE) && instantWinFooterLayout.getSharedData().k()) {
            spi spiVarF = instantWinFooterLayout.getSharedData().f();
            fqy fqyVar = spiVarF != null ? spiVarF.g : null;
            if ((fqyVar != null ? fqyVar.f.longValue() : 0L) <= (fqyVar != null ? fqyVar.e.longValue() : 0L)) {
                long jLongValue = fqyVar != null ? fqyVar.f.longValue() : 0L;
                long jLongValue2 = fqyVar != null ? fqyVar.e.longValue() : 0L;
                if ((bigDecimal4 == null || bigDecimal4.compareTo(BigDecimal.ZERO) != 0 || jLongValue != jLongValue2) && !instantWinFooterLayout.h(fqyVar)) {
                    o4pVar = this.z;
                    if (o4pVar != null && (bigDecimal = o4pVar.j) != null) {
                        if (bigDecimal == null) {
                            bigDecimal = BigDecimal.ZERO;
                        }
                        bigDecimal2 = BigDecimal.ZERO;
                        if (bigDecimal.compareTo(bigDecimal2) > 0) {
                            uy0Var = this.L;
                            if (uy0Var != null) {
                                Intrinsics.n("assetsInfoRepository");
                                throw null;
                            }
                            assetsInfoC = uy0Var.c();
                            if (assetsInfoC != null) {
                                o4pVar2 = this.z;
                                if (o4pVar2 != null && (bigDecimal3 = o4pVar2.j) != null) {
                                    bigDecimal2 = bigDecimal3;
                                }
                                if (bigDecimal2.compareTo(BigDecimal.valueOf(((n4p) s0()).k)) <= 0) {
                                    if (o0().compareTo(BigDecimal.valueOf(assetsInfoC.balance).divide(geo.a)) <= 0) {
                                        o4p o4pVar4 = this.z;
                                        o4pVar4.getClass();
                                        arrayList = o4pVar4.d;
                                        size = arrayList.size();
                                        i2 = 0;
                                        while (i2 < size) {
                                            Object obj = arrayList.get(i2);
                                            i2++;
                                            aVar = (o4p.a) obj;
                                            if (aVar.a.compareTo(BigDecimal.ZERO) > 0 || aVar.a.compareTo(BigDecimal.valueOf(((n4p) s0()).j)) >= 0) {
                                            }
                                        }
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            o4pVar = this.z;
            if (o4pVar != null) {
                if (bigDecimal == null) {
                    bigDecimal = BigDecimal.ZERO;
                }
                bigDecimal2 = BigDecimal.ZERO;
                if (bigDecimal.compareTo(bigDecimal2) > 0) {
                    uy0Var = this.L;
                    if (uy0Var != null) {
                        Intrinsics.n("assetsInfoRepository");
                        throw null;
                    }
                    assetsInfoC = uy0Var.c();
                    if (assetsInfoC != null) {
                        o4pVar2 = this.z;
                        if (o4pVar2 != null) {
                            bigDecimal2 = bigDecimal3;
                        }
                        if (bigDecimal2.compareTo(BigDecimal.valueOf(((n4p) s0()).k)) <= 0) {
                            if (o0().compareTo(BigDecimal.valueOf(assetsInfoC.balance).divide(geo.a)) <= 0) {
                                o4p o4pVar5 = this.z;
                                o4pVar5.getClass();
                                arrayList = o4pVar5.d;
                                size = arrayList.size();
                                i2 = 0;
                                while (i2 < size) {
                                    Object obj2 = arrayList.get(i2);
                                    i2++;
                                    aVar = (o4p.a) obj2;
                                    if (aVar.a.compareTo(BigDecimal.ZERO) > 0) {
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void y0(boolean z) {
        Handler handler;
        Handler handler2 = this.A;
        ep3 ep3Var = this.Z;
        if (handler2 != null) {
            handler2.removeCallbacks(ep3Var);
        }
        if (!z || (handler = this.A) == null) {
            return;
        }
        handler.postDelayed(ep3Var, 30000L);
    }

    public final void z0() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        String strC = ((n4p) s0()).c();
        InstantWinInput instantWinInput = new InstantWinInput(strC, null, null, r0().i.B(strC));
        jlo jloVar = this.G;
        if (jloVar == null) {
            Intrinsics.n("instantWinRouter");
            throw null;
        }
        Intent intentL = jloVar.l(context, instantWinInput);
        intentL.addFlags(65536);
        startActivity(intentL);
    }

    public static final jp3 C0(String str) {
        c0.getClass();
        jp3 jp3Var = new jp3();
        jp3Var.setArguments(vj5.a(new kotlin.Pair(lobGSRIlnSGJY.OKkqAiekD, str)));
        return jp3Var;
    }
}
