package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import com.google.android.flexbox.FlexboxLayout;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common.uievent.e;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.CashOutLoadingButton;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.cashout.AutoCashOut;
import com.sporty.android.core.model.cashout.CashOutFallbackData;
import com.sporty.android.core.model.cashout.CashOutInfo;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sporty.android.core.model.cashout.UnCashableReason;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.cashoutphase3.widget.CashoutLiveEventControlsHeaderView;
import com.sportybet.android.cashoutphase3.widget.LiveMatchTrackerView;
import com.sportybet.android.cashoutphase3.widget.STVPlayerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.model.cashOut.STVPlayerDataSource;
import com.sportybet.plugin.event.view.LiveEventMatchWebView;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.BetSelection;
import com.sportybet.plugin.realsports.data.BoreDrawConfig;
import com.sportybet.plugin.realsports.data.CashOut;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class xh6 extends RecyclerView.f<gi6> {
    public static final zsb Q = new zsb();
    public final ArrayList A;
    public pl6 B;
    public BoreDrawConfig C;
    public int D;
    public int E;
    public boolean F;
    public yyy G;
    public final d<pl6> H;
    public final HashMap<String, qq6> I;
    public final HashMap<String, a> J;
    public final HashSet K;
    public final ema L;
    public String M;
    public pl6 N;
    public Integer O;
    public final mpe0 P;
    public final yo6 a;
    public final String b;
    public final psm c;
    public final ek6 d;
    public final fk6 e;
    public final ck6 f;
    public final gk6 i;
    public final mj6 v;
    public final rq6 w;
    public final nas y;
    public final rdd0 z;

    public static final class a {
        public final ils a;
        public final STVPlayerDataSource b;

        public a(ils ilsVar, STVPlayerDataSource sTVPlayerDataSource) {
            ilsVar.getClass();
            this.a = ilsVar;
            this.b = sTVPlayerDataSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            STVPlayerDataSource sTVPlayerDataSource = this.b;
            return iHashCode + (sTVPlayerDataSource == null ? 0 : sTVPlayerDataSource.hashCode());
        }

        public final String toString() {
            return "LiveEventStateCache(liveEventState=" + this.a + ", streamData=" + this.b + ")";
        }
    }

    @c0d(c = "com.sportybet.android.cashoutphase3.CashOutAdapter$cashOut$1", f = "CashOutAdapter.kt", l = {984}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ pl6 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(pl6 pl6Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = pl6Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return xh6.this.new b(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                zsb zsbVar = xh6.Q;
                if (xh6.this.k(this.c, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public xh6(yo6 yo6Var, String str, l830 l830Var, psm psmVar, ek6 ek6Var, fk6 fk6Var, ck6 ck6Var, gk6 gk6Var, mj6 mj6Var, fr6 fr6Var, nas nasVar, rdd0 rdd0Var) {
        ExecutorService executorServiceNewFixedThreadPool;
        l830Var.getClass();
        fr6Var.getClass();
        this.a = yo6Var;
        this.b = str;
        this.c = psmVar;
        this.d = ek6Var;
        this.e = fk6Var;
        this.f = ck6Var;
        this.i = gk6Var;
        this.v = mj6Var;
        this.w = fr6Var;
        this.y = nasVar;
        this.z = rdd0Var;
        this.A = new ArrayList();
        this.C = new BoreDrawConfig(null);
        this.D = 1;
        this.E = 1;
        ki6 ki6Var = new ki6();
        androidx.recyclerview.widget.b bVar = new androidx.recyclerview.widget.b(this);
        synchronized (c.a.a) {
            try {
                executorServiceNewFixedThreadPool = c.a.b;
                if (executorServiceNewFixedThreadPool == null) {
                    executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
                    c.a.b = executorServiceNewFixedThreadPool;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.H = new d<>(bVar, new c(executorServiceNewFixedThreadPool, ki6Var));
        this.I = new HashMap<>();
        this.J = new HashMap<>();
        this.K = new HashSet();
        ema emaVar = new ema();
        this.L = emaVar;
        di6 di6Var = new di6(this);
        l830Var.a(di6Var);
        emaVar.b(di6Var);
        this.P = hwr.b(new sh6(this, 0));
    }

    public static boolean n(pl6 pl6Var, pl6 pl6Var2) {
        if (pl6Var.c != pl6Var2.c) {
            return false;
        }
        Bet bet = pl6Var.a;
        String str = bet != null ? bet.id : null;
        Bet bet2 = pl6Var2.a;
        return Intrinsics.g(str, bet2 != null ? bet2.id : null) && pl6Var.d == pl6Var2.d;
    }

    public static void t(xh6 xh6Var, String str, CashOutInfo cashOutInfo, Bet bet, int i) {
        if ((i & 2) != 0) {
            cashOutInfo = null;
        }
        if ((i & 4) != 0) {
            bet = null;
        }
        ek6 ek6Var = xh6Var.d;
        ArrayList arrayList = xh6Var.A;
        if (str == null || str.equals(xh6Var.M)) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            pl6 pl6Var = (pl6) arrayList.get(i2);
            Bet bet2 = pl6Var.a;
            if (bet2 != null && Intrinsics.g(bet2.id, str)) {
                xh6Var.u(pl6Var, cashOutInfo, bet);
                if (ek6Var.t()) {
                    ek6Var.v(pl6Var);
                }
                int i3 = pl6Var.c;
                if (i3 == 4 || i3 == 9 || i3 == 1) {
                    ((pl6) arrayList.get(i2)).w = true;
                    xh6Var.p();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.H.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        List<pl6> list = this.H.f;
        list.getClass();
        pl6 pl6Var = (pl6) CollectionsKt.V(i, list);
        if (pl6Var != null) {
            return pl6Var.c;
        }
        return 7;
    }

    public final void i(pl6 pl6Var, boolean z) {
        Bet bet = pl6Var.a;
        bet.shouldShowRefreshButton = false;
        if (bet.isHugeCombo) {
            pl6 pl6VarClone = pl6Var.clone();
            Bet bet2 = pl6VarClone.a;
            CashOut cashOut = new CashOut();
            cashOut.update(pl6Var.a.cashOut);
            cashOut.maxCount = pl6Var.a.cashOut.maxCount;
            bet2.cashOut = cashOut;
            pl6Var = pl6VarClone;
        }
        com.sportybet.android.cashoutphase3.b bVar = this.d.a;
        bVar.I0(pl6Var, z ? 1 : 0, false);
        gym.a(bVar.E0(), new iyy(pl6Var.a.isFallbackCashOut ? AnalyticsParam.DATA_FALLBACK : AnalyticsParam.DATA_NORMAL));
        Bet bet3 = pl6Var.a;
        if (!bet3.isCalcByFE || bet3.isCashoutAmountNotAcquired) {
            ej5.c(this.y, null, null, new b(pl6Var, null), 3);
        }
    }

    public final void j(Bet bet) {
        boolean zT = this.d.t();
        bet.cashOut.clear(null);
        bet.maxCashOutAmount = null;
        int i = 0;
        bet.isCalcByFE = false;
        bet.isCashAbleJS = false;
        bet.isJsCalcFailed = true;
        bet.shouldShowRefreshButton = zT;
        bet.isCashoutAmountNotAcquired = false;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.A;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            Bet bet2 = ((pl6) obj).a;
            if (Intrinsics.g(bet2 != null ? bet2.id : null, bet.id)) {
                arrayList.add(obj);
            }
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            ((pl6) obj2).getClass();
        }
        pl6 pl6Var = this.B;
        if (pl6Var != null) {
            Bet bet3 = pl6Var.a;
            if (!Intrinsics.g(bet3 != null ? bet3.id : null, bet.id)) {
            }
        }
        pl6 pl6Var2 = this.N;
        if (pl6Var2 != null) {
            Bet bet4 = pl6Var2.a;
            Intrinsics.g(bet4 != null ? bet4.id : null, bet.id);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(pl6 pl6Var, x1b x1bVar) {
        yh6 yh6Var;
        Object bVar;
        if (x1bVar instanceof yh6) {
            yh6Var = (yh6) x1bVar;
            int i = yh6Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yh6Var.d = i - Integer.MIN_VALUE;
            } else {
                yh6Var = new yh6(this, x1bVar);
            }
        } else {
            yh6Var = new yh6(this, x1bVar);
        }
        Object objA = yh6Var.b;
        y5b y5bVar = y5b.a;
        int i2 = yh6Var.d;
        ek6 ek6Var = this.d;
        try {
            if (i2 == 0) {
                uj50.b(objA);
                ek6Var.u(true);
                zi50.a aVar = zi50.b;
                rq6 rq6Var = this.w;
                String str = pl6Var.a.id;
                str.getClass();
                yh6Var.a = pl6Var;
                yh6Var.d = 1;
                objA = rq6Var.a(str, yh6Var);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pl6Var = yh6Var.a;
                uj50.b(objA);
            }
            bVar = (Bet) objA;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (!(bVar instanceof zi50.b)) {
            Bet bet = (Bet) bVar;
            t(this, pl6Var.a.id, null, bet, 2);
            u(pl6Var, null, bet);
            if (ek6Var.t()) {
                ek6Var.v(pl6Var);
            }
        }
        if (zi50.a(bVar) != null) {
            this.z.a(sxy.a, k00.d);
            t(this, pl6Var.a.id, null, null, 6);
            u(pl6Var, null, null);
            if (ek6Var.t()) {
                ek6Var.v(pl6Var);
            }
        }
        ek6Var.u(false);
        return Boolean.TRUE;
    }

    public final void l(pl6 pl6Var) {
        ek6 ek6Var;
        List<BetSelection> list;
        ils ilsVar;
        String str;
        int i;
        s();
        List<BetSelection> list2 = pl6Var.a.selections;
        list2.getClass();
        Iterator<T> it = list2.iterator();
        do {
            boolean zHasNext = it.hasNext();
            ek6Var = this.d;
            if (!zHasNext) {
                Bet bet = pl6Var.a;
                LinkedList<pl6> linkedList = pl6Var.y;
                ArrayList arrayList = this.A;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        i2 = -1;
                        break;
                    }
                    pl6 pl6Var2 = (pl6) arrayList.get(i2);
                    Bet bet2 = pl6Var2.a;
                    if (bet2 != null && (str = bet2.id) != null && str.equals(bet.id) && ((i = pl6Var2.c) == 2 || i == 9)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 == -1) {
                    return;
                }
                arrayList.remove(i2);
                int size2 = bet.selections.size();
                int i3 = 0;
                while (true) {
                    list = bet.selections;
                    if (i3 >= size2) {
                        break;
                    }
                    list.get(i3).ogOrderNum = i3;
                    i3++;
                }
                list.getClass();
                bet.selections = xi6.c(list);
                HashSet hashSet = new HashSet();
                int size3 = bet.selections.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    String str2 = bet.selections.get(i4).id;
                    if (!hashSet.contains(str2)) {
                        pl6 pl6Var3 = new pl6(pl6Var.a, pl6Var.b, 5, null);
                        pl6Var3.d = i4;
                        String str3 = pl6Var3.c().id;
                        HashMap<String, a> map = this.J;
                        a aVar = map.get(str3);
                        if (aVar == null || (ilsVar = aVar.a) == null) {
                            ilsVar = ils.NONE;
                        }
                        pl6Var3.i = ilsVar;
                        a aVar2 = map.get(pl6Var3.c().id);
                        pl6Var3.A = aVar2 != null ? aVar2.b : null;
                        linkedList.add(pl6Var3);
                        BetSelection betSelectionC = pl6Var3.c();
                        if (betSelectionC != null && ek6Var.m() && betSelectionC.eventStatus == 1) {
                            String str4 = betSelectionC.matchStatus;
                            str4.getClass();
                            this.z.a(new nqv.c(str4, oqv.OPEN_BETS), k00.d, k00.c);
                        }
                        hashSet.add(str2);
                    }
                }
                this.B = pl6Var;
                if (this.G == yyy.LIST_MODE) {
                    pl6 pl6Var4 = new pl6(bet, pl6Var.b, 3, null);
                    pl6Var4.z = true;
                    Unit unit = Unit.a;
                    arrayList.add(i2, pl6Var4);
                    pl6 pl6Var5 = new pl6(bet, pl6Var.b, 4, this.I.get(pl6Var.a.id));
                    qq6 qq6Var = pl6Var.B;
                    qq6Var.getClass();
                    ql6.a(pl6Var5, qq6Var);
                    arrayList.add(i2 + 1, pl6Var5);
                    linkedList.getClass();
                    arrayList.addAll(i2, linkedList);
                } else {
                    linkedList.getClass();
                    arrayList.addAll(i2, linkedList);
                }
                p();
                return;
            }
        } while (lfb0.d().e(((BetSelection) it.next()).sportId) != null);
        ek6Var.u(false);
        final com.sportybet.android.cashoutphase3.b bVar = ek6Var.a;
        e eVarV0 = bVar.v0();
        StringUiText stringUiText = vch0.a;
        com.sporty.android.common.uievent.a.h hVar = new com.sporty.android.common.uievent.a.h(new ResourceUiText(R.string.cashout__cur_ver_not_support), new ResourceUiText(R.string.common_functions__check_update), new ResourceUiText(R.string.common_functions__cancel), new Function1() { // from class: pj6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
                alertDialogCallbackType.getClass();
                if (alertDialogCallbackType instanceof AlertDialogCallbackType.Positive) {
                    bVar.F0().e(o7d.a(wae.ME));
                }
                return Unit.a;
            }
        }, 195);
        shd0 shd0Var = bVar.b0;
        eVarV0.d(hVar, bVar, shd0Var != null ? shd0Var.a : null, null);
    }

    public final int m(int i, String str) {
        int i2;
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            pl6 pl6Var = (pl6) arrayList.get(i3);
            Bet bet = pl6Var.a;
            if (bet != null && TextUtils.equals(bet.id, str) && ((i2 = pl6Var.c) == i || i2 == 4 || i2 == 9)) {
                return i3;
            }
        }
        return -1;
    }

    public final void o(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            pl6 pl6Var = (pl6) obj;
            Bet bet = pl6Var.a;
            if (Intrinsics.g(bet != null ? bet.id : null, str)) {
                pl6Var.v = true;
            }
        }
        p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i, List list) {
        gi6 gi6Var = (gi6) d0Var;
        gi6Var.getClass();
        list.getClass();
        if (list.isEmpty()) {
            onBindViewHolder(gi6Var, i);
            return;
        }
        List<pl6> list2 = this.H.f;
        list2.getClass();
        pl6 pl6Var = (pl6) CollectionsKt.V(i, list2);
        if (pl6Var == null) {
            return;
        }
        pl6 pl6Var2 = (pl6) CollectionsKt.V(i, this.A);
        if (pl6Var2 == null || !n(pl6Var2, pl6Var)) {
            gi6Var.itemView.post(new th6(gi6Var, i, this));
            return;
        }
        pl6Var2.z = false;
        if (gi6Var instanceof wnz) {
            ((wnz) gi6Var).c(this.E, this.D, this.F);
            return;
        }
        if (gi6Var instanceof u6v) {
            ((u6v) gi6Var).c(i, this.C);
        } else if (!(gi6Var instanceof mjh0)) {
            gi6Var.a(i);
        } else {
            mjh0 mjh0Var = (mjh0) gi6Var;
            mjh0Var.b.b.setContent(new op8(2007052176, new pgi(mjh0Var, 1), true));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        ek6 ek6Var = this.d;
        yo6 yo6Var = this.a;
        ArrayList arrayList = this.A;
        int i2 = 0;
        switch (i) {
            case 1:
                View viewA = dzc.a(viewGroup, R.layout.spr_cash_out_header, viewGroup, false);
                int i3 = R.id.desc;
                AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.desc, viewA);
                if (appCompatTextView != null) {
                    i3 = R.id.divide_line;
                    View viewA2 = h5e.a(R.id.divide_line, viewA);
                    if (viewA2 != null) {
                        i3 = R.id.divide_line_2;
                        View viewA3 = h5e.a(R.id.divide_line_2, viewA);
                        if (viewA3 != null) {
                            i3 = R.id.edit_bet;
                            TextView textView = (TextView) h5e.a(R.id.edit_bet, viewA);
                            if (textView != null) {
                                i3 = R.id.group_edit_bet;
                                Group group = (Group) h5e.a(R.id.group_edit_bet, viewA);
                                if (group != null) {
                                    i3 = R.id.ic_pending_event;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.ic_pending_event, viewA);
                                    if (appCompatImageView != null) {
                                        i3 = R.id.import_sim_container;
                                        LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.import_sim_container, viewA);
                                        if (linearLayout != null) {
                                            i3 = R.id.live;
                                            TextView textView2 = (TextView) h5e.a(R.id.live, viewA);
                                            if (textView2 != null) {
                                                i3 = R.id.outcome_desc;
                                                LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.outcome_desc, viewA);
                                                if (linearLayout2 != null) {
                                                    i3 = R.id.rebet_btn_container;
                                                    LinearLayout linearLayout3 = (LinearLayout) h5e.a(R.id.rebet_btn_container, viewA);
                                                    if (linearLayout3 != null) {
                                                        i3 = R.id.rebet_ic_img_view;
                                                        if (((AppCompatImageView) h5e.a(R.id.rebet_ic_img_view, viewA)) != null) {
                                                            i3 = R.id.share;
                                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.share, viewA);
                                                            if (appCompatImageView2 != null) {
                                                                i3 = R.id.title;
                                                                TextView textView3 = (TextView) h5e.a(R.id.title, viewA);
                                                                if (textView3 != null) {
                                                                    return new qhl(new tgd0((ConstraintLayout) viewA, appCompatTextView, viewA2, viewA3, textView, group, appCompatImageView, linearLayout, textView2, linearLayout2, linearLayout3, appCompatImageView2, textView3), this.d, arrayList, this.v, new uh6(this, i2));
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
                bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i3)));
                return null;
            case 2:
                View viewA4 = dzc.a(viewGroup, R.layout.spr_cash_out_match_shorthand, viewGroup, false);
                int i4 = R.id.cash_out_match;
                LinearLayout linearLayout4 = (LinearLayout) h5e.a(R.id.cash_out_match, viewA4);
                if (linearLayout4 != null) {
                    i4 = R.id.expand;
                    TextView textView4 = (TextView) h5e.a(R.id.expand, viewA4);
                    if (textView4 != null) {
                        i4 = R.id.more;
                        TextView textView5 = (TextView) h5e.a(R.id.more, viewA4);
                        if (textView5 != null) {
                            return new m7v(new ghd0((RelativeLayout) viewA4, linearLayout4, textView4, textView5), arrayList, new vh6(this, 0));
                        }
                    }
                }
                bmy.a("Missing required view with ID: ".concat(viewA4.getResources().getResourceName(i4)));
                return null;
            case 3:
                View viewA5 = dzc.a(viewGroup, R.layout.spr_cash_out_stake, viewGroup, false);
                int i5 = R.id.cashout_note;
                TextView textView6 = (TextView) h5e.a(R.id.cashout_note, viewA5);
                if (textView6 != null) {
                    i5 = R.id.guide;
                    if (((Guideline) h5e.a(R.id.guide, viewA5)) != null) {
                        i5 = R.id.one_cut_win;
                        TextView textView7 = (TextView) h5e.a(R.id.one_cut_win, viewA5);
                        if (textView7 != null) {
                            i5 = R.id.one_cut_win_group;
                            Group group2 = (Group) h5e.a(R.id.one_cut_win_group, viewA5);
                            if (group2 != null) {
                                i5 = R.id.one_cut_win_label;
                                TextView textView8 = (TextView) h5e.a(R.id.one_cut_win_label, viewA5);
                                if (textView8 != null) {
                                    i5 = R.id.stake;
                                    TextView textView9 = (TextView) h5e.a(R.id.stake, viewA5);
                                    if (textView9 != null) {
                                        i5 = R.id.stake_label;
                                        TextView textView10 = (TextView) h5e.a(R.id.stake_label, viewA5);
                                        if (textView10 != null) {
                                            i5 = R.id.win;
                                            TextView textView11 = (TextView) h5e.a(R.id.win, viewA5);
                                            if (textView11 != null) {
                                                i5 = R.id.win_label;
                                                TextView textView12 = (TextView) h5e.a(R.id.win_label, viewA5);
                                                if (textView12 != null) {
                                                    return new hvd0(new ihd0((ConstraintLayout) viewA5, textView6, textView7, group2, textView8, textView9, textView10, textView11, textView12), yo6Var.d().p.getRealSportTaxConfig(), arrayList);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                bmy.a("Missing required view with ID: ".concat(viewA5.getResources().getResourceName(i5)));
                return null;
            case 4:
                View viewA6 = dzc.a(viewGroup, R.layout.spr_cash_out_expand_phase_3, viewGroup, false);
                int i6 = R.id.auto_cashout_bg;
                View viewA7 = h5e.a(R.id.auto_cashout_bg, viewA6);
                if (viewA7 != null) {
                    i6 = R.id.auto_cashout_info_group;
                    Group group3 = (Group) h5e.a(R.id.auto_cashout_info_group, viewA6);
                    if (group3 != null) {
                        i6 = R.id.auto_cashout_status;
                        TextView textView13 = (TextView) h5e.a(R.id.auto_cashout_status, viewA6);
                        if (textView13 != null) {
                            i6 = R.id.auto_cashout_status_icon;
                            ImageView imageView = (ImageView) h5e.a(R.id.auto_cashout_status_icon, viewA6);
                            if (imageView != null) {
                                i6 = R.id.btn_auto_cashout_detail;
                                TextView textView14 = (TextView) h5e.a(R.id.btn_auto_cashout_detail, viewA6);
                                if (textView14 != null) {
                                    i6 = R.id.cash_out;
                                    CashOutLoadingButton cashOutLoadingButton = (CashOutLoadingButton) h5e.a(R.id.cash_out, viewA6);
                                    if (cashOutLoadingButton != null) {
                                        i6 = R.id.cashout_state_action_button;
                                        ImageView imageView2 = (ImageView) h5e.a(R.id.cashout_state_action_button, viewA6);
                                        if (imageView2 != null) {
                                            i6 = R.id.cashout_state_available_text;
                                            TextView textView15 = (TextView) h5e.a(R.id.cashout_state_available_text, viewA6);
                                            if (textView15 != null) {
                                                i6 = R.id.cashout_state_bullet_points;
                                                ImageView imageView3 = (ImageView) h5e.a(R.id.cashout_state_bullet_points, viewA6);
                                                if (imageView3 != null) {
                                                    i6 = R.id.cashout_state_icon;
                                                    ImageView imageView4 = (ImageView) h5e.a(R.id.cashout_state_icon, viewA6);
                                                    if (imageView4 != null) {
                                                        i6 = R.id.cashout_state_panel;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.cashout_state_panel, viewA6);
                                                        if (constraintLayout != null) {
                                                            i6 = R.id.cashout_state_title;
                                                            TextView textView16 = (TextView) h5e.a(R.id.cashout_state_title, viewA6);
                                                            if (textView16 != null) {
                                                                i6 = R.id.cashout_state_unavailable_main_text;
                                                                TextView textView17 = (TextView) h5e.a(R.id.cashout_state_unavailable_main_text, viewA6);
                                                                if (textView17 != null) {
                                                                    i6 = R.id.cashout_state_unavailable_sub_text;
                                                                    TextView textView18 = (TextView) h5e.a(R.id.cashout_state_unavailable_sub_text, viewA6);
                                                                    if (textView18 != null) {
                                                                        i6 = R.id.divider;
                                                                        View viewA8 = h5e.a(R.id.divider, viewA6);
                                                                        if (viewA8 != null) {
                                                                            i6 = R.id.fallback_text;
                                                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.fallback_text, viewA6);
                                                                            if (appCompatTextView2 != null) {
                                                                                i6 = R.id.fallback_tip_mark;
                                                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.fallback_tip_mark, viewA6);
                                                                                if (appCompatImageView3 != null) {
                                                                                    i6 = R.id.no_cashout_reason;
                                                                                    TextView textView19 = (TextView) h5e.a(R.id.no_cashout_reason, viewA6);
                                                                                    if (textView19 != null) {
                                                                                        i6 = R.id.view_edit_history;
                                                                                        TextView textView20 = (TextView) h5e.a(R.id.view_edit_history, viewA6);
                                                                                        if (textView20 != null) {
                                                                                            return new uyg(new sgd0((ConstraintLayout) viewA6, viewA7, group3, textView13, imageView, textView14, cashOutLoadingButton, imageView2, textView15, imageView3, imageView4, constraintLayout, textView16, textView17, textView18, viewA8, appCompatTextView2, appCompatImageView3, textView19, textView20), this.d, arrayList, new zh6(this), yo6Var.d());
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
                bmy.a("Missing required view with ID: ".concat(viewA6.getResources().getResourceName(i6)));
                return null;
            case 5:
                View viewA9 = dzc.a(viewGroup, R.layout.spr_cash_out_match_full, viewGroup, false);
                int i7 = R.id.arrow;
                ImageView imageView5 = (ImageView) h5e.a(R.id.arrow, viewA9);
                if (imageView5 != null) {
                    i7 = R.id.barrier;
                    if (((Barrier) h5e.a(R.id.barrier, viewA9)) != null) {
                        i7 = R.id.bb_selections;
                        TextView textView21 = (TextView) h5e.a(R.id.bb_selections, viewA9);
                        if (textView21 != null) {
                            i7 = R.id.bb_selections_line;
                            ImageView imageView6 = (ImageView) h5e.a(R.id.bb_selections_line, viewA9);
                            if (imageView6 != null) {
                                i7 = R.id.bo_message_container;
                                ComposeView composeView = (ComposeView) h5e.a(R.id.bo_message_container, viewA9);
                                if (composeView != null) {
                                    i7 = R.id.cash_out_bore_draw_label;
                                    View viewA10 = h5e.a(R.id.cash_out_bore_draw_label, viewA9);
                                    if (viewA10 != null) {
                                        nrr nrrVarA = nrr.a(viewA10);
                                        i7 = R.id.center_guideline;
                                        if (((Guideline) h5e.a(R.id.center_guideline, viewA9)) != null) {
                                            i7 = R.id.delayed_settle_icon;
                                            ImageView imageView7 = (ImageView) h5e.a(R.id.delayed_settle_icon, viewA9);
                                            if (imageView7 != null) {
                                                i7 = R.id.header_controls;
                                                CashoutLiveEventControlsHeaderView cashoutLiveEventControlsHeaderView = (CashoutLiveEventControlsHeaderView) h5e.a(R.id.header_controls, viewA9);
                                                if (cashoutLiveEventControlsHeaderView != null) {
                                                    i7 = R.id.hide_detail;
                                                    TextView textView22 = (TextView) h5e.a(R.id.hide_detail, viewA9);
                                                    if (textView22 != null) {
                                                        i7 = R.id.hide_live_event;
                                                        View viewA11 = h5e.a(R.id.hide_live_event, viewA9);
                                                        if (viewA11 != null) {
                                                            int i8 = R.id.hide_image;
                                                            if (((ImageView) h5e.a(R.id.hide_image, viewA11)) != null) {
                                                                i8 = R.id.hide_txt;
                                                                if (((TextView) h5e.a(R.id.hide_txt, viewA11)) != null) {
                                                                    tp6 tp6Var = new tp6((ConstraintLayout) viewA11);
                                                                    int i9 = R.id.live_games_view;
                                                                    LiveEventMatchWebView liveEventMatchWebView = (LiveEventMatchWebView) h5e.a(R.id.live_games_view, viewA9);
                                                                    if (liveEventMatchWebView != null) {
                                                                        i9 = R.id.live_match_tracker_view;
                                                                        LiveMatchTrackerView liveMatchTrackerView = (LiveMatchTrackerView) h5e.a(R.id.live_match_tracker_view, viewA9);
                                                                        if (liveMatchTrackerView != null) {
                                                                            i9 = R.id.live_odd_container;
                                                                            LinearLayout linearLayout5 = (LinearLayout) h5e.a(R.id.live_odd_container, viewA9);
                                                                            if (linearLayout5 != null) {
                                                                                i9 = R.id.live_odds;
                                                                                TextView textView23 = (TextView) h5e.a(R.id.live_odds, viewA9);
                                                                                if (textView23 != null) {
                                                                                    i9 = R.id.live_odds_label;
                                                                                    TextView textView24 = (TextView) h5e.a(R.id.live_odds_label, viewA9);
                                                                                    if (textView24 != null) {
                                                                                        i9 = R.id.market;
                                                                                        TextView textView25 = (TextView) h5e.a(R.id.market, viewA9);
                                                                                        if (textView25 != null) {
                                                                                            i9 = R.id.note_container;
                                                                                            ComposeView composeView2 = (ComposeView) h5e.a(R.id.note_container, viewA9);
                                                                                            if (composeView2 != null) {
                                                                                                i9 = R.id.outcome;
                                                                                                TextView textView26 = (TextView) h5e.a(R.id.outcome, viewA9);
                                                                                                if (textView26 != null) {
                                                                                                    i9 = R.id.outcome_container;
                                                                                                    if (((FlexboxLayout) h5e.a(R.id.outcome_container, viewA9)) != null) {
                                                                                                        i9 = R.id.outcome_description;
                                                                                                        TextView textView27 = (TextView) h5e.a(R.id.outcome_description, viewA9);
                                                                                                        if (textView27 != null) {
                                                                                                            i9 = R.id.sport_icon;
                                                                                                            ImageView imageView8 = (ImageView) h5e.a(R.id.sport_icon, viewA9);
                                                                                                            if (imageView8 != null) {
                                                                                                                i9 = R.id.status_icon;
                                                                                                                ImageView imageView9 = (ImageView) h5e.a(R.id.status_icon, viewA9);
                                                                                                                if (imageView9 != null) {
                                                                                                                    i9 = R.id.stv_player_view;
                                                                                                                    STVPlayerView sTVPlayerView = (STVPlayerView) h5e.a(R.id.stv_player_view, viewA9);
                                                                                                                    if (sTVPlayerView != null) {
                                                                                                                        i9 = R.id.team;
                                                                                                                        TextView textView28 = (TextView) h5e.a(R.id.team, viewA9);
                                                                                                                        if (textView28 != null) {
                                                                                                                            i9 = R.id.time_score_info;
                                                                                                                            TextView textView29 = (TextView) h5e.a(R.id.time_score_info, viewA9);
                                                                                                                            if (textView29 != null) {
                                                                                                                                return new u6v(new fhd0((ConstraintLayout) viewA9, imageView5, textView21, imageView6, composeView, nrrVarA, imageView7, cashoutLiveEventControlsHeaderView, textView22, tp6Var, liveEventMatchWebView, liveMatchTrackerView, linearLayout5, textView23, textView24, textView25, composeView2, textView26, textView27, imageView8, imageView9, sTVPlayerView, textView28, textView29), arrayList, this.d, yo6Var.c(), new ai6(this), new wh6(this));
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
                                                                    i7 = i9;
                                                                }
                                                            }
                                                            bmy.a("Missing required view with ID: ".concat(viewA11.getResources().getResourceName(i8)));
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
                bmy.a("Missing required view with ID: ".concat(viewA9.getResources().getResourceName(i7)));
                return null;
            case 6:
            default:
                return new wnz(hhd0.a(LayoutInflater.from(viewGroup.getContext()), viewGroup), ek6Var);
            case 7:
                return new wnz(hhd0.a(LayoutInflater.from(viewGroup.getContext()), viewGroup), ek6Var);
            case 8:
                ConstraintLayout constraintLayout2 = ugd0.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spr_cash_out_how_to_play, viewGroup, false)).a;
                constraintLayout2.getClass();
                final ck6 ck6Var = this.f;
                ck6Var.getClass();
                ymm ymmVar = new ymm(constraintLayout2, null);
                ugd0 ugd0VarA = ugd0.a(constraintLayout2);
                AppCompatTextView appCompatTextView3 = ugd0VarA.c;
                Spanned spannedA = cnm.a(0, 7, sn5.c(constraintLayout2, R.string.cashout__set_a_rule_to_auto_cashout_your_bet, new Object[0]));
                int length = spannedA.length();
                while (length > 0 && CharsKt.b(spannedA.charAt(length - 1))) {
                    length--;
                }
                appCompatTextView3.setText(spannedA.subSequence(0, length));
                ugd0VarA.b.setOnClickListener(new wmm(ck6Var, i2));
                ugd0VarA.d.setOnClickListener(new View.OnClickListener() { // from class: xmm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ku90<a> ku90Var = ck6Var.a.s0().d0;
                        StringUiText stringUiText = vch0.a;
                        b.e(ku90Var, new ResourceUiText(R.string.cashout__auto_cashout), null, new ResourceUiText(R.string.cashout__auto_cashout_info), null, null, null, null, 506);
                    }
                });
                return ymmVar;
            case 9:
                Context context = viewGroup.getContext();
                context.getClass();
                return new gwu(new ComposeView(context, null, 6, 0), arrayList, yo6Var.d(), new bi6(this));
            case 10:
                View viewA12 = dzc.a(viewGroup, R.layout.spr_cash_out_debug, viewGroup, false);
                int i10 = R.id.debug_info;
                TextView textView30 = (TextView) h5e.a(R.id.debug_info, viewA12);
                if (textView30 != null) {
                    i10 = R.id.lite_amount;
                    TextView textView31 = (TextView) h5e.a(R.id.lite_amount, viewA12);
                    if (textView31 != null) {
                        i10 = R.id.toggle_btn;
                        TextView textView32 = (TextView) h5e.a(R.id.toggle_btn, viewA12);
                        if (textView32 != null) {
                            return new ji6(new rgd0((ConstraintLayout) viewA12, textView30, textView31, textView32), arrayList);
                        }
                    }
                }
                bmy.a("Missing required view with ID: ".concat(viewA12.getResources().getResourceName(i10)));
                return null;
            case 11:
                View viewA13 = dzc.a(viewGroup, R.layout.spr_cashout_update_app_item, viewGroup, false);
                ComposeView composeView3 = (ComposeView) h5e.a(R.id.update_app_compose_view, viewA13);
                if (composeView3 != null) {
                    return new mjh0(new khd0((ConstraintLayout) viewA13, composeView3), this.i);
                }
                bmy.a("Missing required view with ID: ".concat(viewA13.getResources().getResourceName(R.id.update_app_compose_view)));
                return null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onViewRecycled(RecyclerView.d0 d0Var) {
        gi6 gi6Var = (gi6) d0Var;
        gi6Var.getClass();
        super.onViewRecycled(gi6Var);
        if (gi6Var instanceof u6v) {
            fhd0 fhd0Var = ((u6v) gi6Var).b;
            fhd0Var.A.b();
            fhd0Var.K.g();
        }
    }

    public final void p() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.A;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            pl6 pl6VarClone = ((pl6) obj).clone();
            pl6VarClone.getClass();
            arrayList.add(pl6VarClone);
        }
        this.H.b(arrayList, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(gi6 gi6Var, int i) {
        gi6Var.getClass();
        List<pl6> list = this.H.f;
        list.getClass();
        pl6 pl6Var = (pl6) CollectionsKt.V(i, list);
        if (pl6Var == null) {
            return;
        }
        pl6 pl6Var2 = (pl6) CollectionsKt.V(i, this.A);
        if (pl6Var2 == null || !n(pl6Var2, pl6Var)) {
            gi6Var.itemView.post(new th6(gi6Var, i, this));
            return;
        }
        pl6Var2.z = false;
        if (gi6Var instanceof wnz) {
            ((wnz) gi6Var).c(this.E, this.D, this.F);
            return;
        }
        if (gi6Var instanceof u6v) {
            ((u6v) gi6Var).c(i, this.C);
        } else if (!(gi6Var instanceof mjh0)) {
            gi6Var.a(i);
        } else {
            mjh0 mjh0Var = (mjh0) gi6Var;
            mjh0Var.b.b.setContent(new op8(2007052176, new pgi(mjh0Var, 1), true));
        }
    }

    public final void r(List<? extends Bet> list, List<? extends AutoCashOut> list2, int i, int i2, boolean z, boolean z2, yyy yyyVar, String str, BoreDrawConfig boreDrawConfig, boolean z3, CashOutFallbackData cashOutFallbackData, boolean z4, boolean z5) {
        int i3;
        String str2;
        String str3;
        String str4;
        this.N = null;
        this.O = null;
        this.G = yyyVar;
        int i4 = 10;
        int i5 = 9;
        if (z2) {
            this.D = -1;
            this.E = i2;
        } else {
            int i6 = (i + 9) / 10;
            this.D = i6;
            this.E = (int) Math.min(i2, i6);
        }
        this.F = z;
        this.B = null;
        ArrayList arrayList = this.A;
        arrayList.clear();
        this.J.clear();
        this.K.clear();
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list2 != null) {
            for (AutoCashOut autoCashOut : list2) {
                linkedHashMap.put(autoCashOut.betId, autoCashOut);
            }
        }
        if (z5) {
            arrayList.add(new pl6(null, null, 11, null));
        }
        if (z3 && ((str4 = this.b) == null || str4.length() == 0)) {
            arrayList.add(new pl6(null, null, 8, null));
        }
        int i7 = 1;
        if (list != null) {
            for (Bet bet : list) {
                AutoCashOut autoCashOut2 = (AutoCashOut) linkedHashMap.get(bet.id);
                qq6 qq6Var = this.I.get(bet.id);
                arrayList.add(new pl6(bet, autoCashOut2, i7, qq6Var));
                if (yyyVar == yyy.LIST_MODE) {
                    arrayList.add(new pl6(bet, autoCashOut2, i5, qq6Var));
                } else {
                    arrayList.add(new pl6(bet, autoCashOut2, 2, qq6Var));
                    arrayList.add(new pl6(bet, autoCashOut2, 3, qq6Var));
                    arrayList.add(new pl6(bet, autoCashOut2, 4, qq6Var));
                }
                if (z4) {
                    arrayList.add(new pl6(bet, autoCashOut2, i4, qq6Var));
                }
                List<BetSelection> list3 = bet.selections;
                list3.getClass();
                for (BetSelection betSelection : list3) {
                    if (!hashSet.contains(betSelection.id) && ((str2 = betSelection.sportId) == null || str2.length() == 0 || (str3 = betSelection.categoryId) == null || str3.length() == 0)) {
                        itf0.a aVar = itf0.a;
                        aVar.q(MyLog.TAG_API);
                        aVar.n("Incorrect data: %s", betSelection.toString());
                        String str5 = TextUtils.isEmpty(betSelection.sportId) ? "sportId is empty" : TextUtils.isEmpty(betSelection.categoryId) ? "categoryId is empty" : "";
                        IllegalStateException illegalStateException = new IllegalStateException("realSportsGame/openbets: incorrect data");
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new Pair("TraceId", str));
                        arrayList2.add(new Pair("Country", this.c.getCountryCode().getCode()));
                        arrayList2.add(new Pair("Bet", bet.toString()));
                        arrayList2.add(new Pair("BetSelection", betSelection.toString()));
                        Q.c().g("Incorrect data", str5, illegalStateException, arrayList2);
                    }
                    i4 = 10;
                    i7 = 1;
                }
                i5 = 9;
            }
        }
        if (this.D > 1 || (((i3 = this.E) == 1 && z) || i3 > 1)) {
            arrayList.add(new pl6(null, null, 7, null));
        }
        if (boreDrawConfig != null) {
            this.C = boreDrawConfig;
        }
        p();
    }

    public final void s() {
        pl6 pl6Var = this.N;
        if (pl6Var != null) {
            pl6Var.i = ils.NONE;
        }
        this.N = null;
        this.O = null;
        pl6 pl6Var2 = this.B;
        if (pl6Var2 != null) {
            LinkedList<pl6> linkedList = pl6Var2.y;
            pl6 first = linkedList.getFirst();
            ArrayList arrayList = this.A;
            int iIndexOf = arrayList.indexOf(first);
            if (iIndexOf < 0) {
                return;
            }
            for (pl6 pl6Var3 : linkedList) {
                String str = pl6Var3.c().id;
                ils ilsVar = pl6Var3.i;
                ilsVar.getClass();
                this.J.put(str, new a(ilsVar, pl6Var3.A));
            }
            arrayList.removeAll(linkedList);
            linkedList.clear();
            qq6 qq6Var = this.I.get(pl6Var2.a.id);
            if (this.G == yyy.LIST_MODE) {
                for (int i = 0; i < 2; i++) {
                    arrayList.remove(iIndexOf);
                }
                pl6 pl6Var4 = new pl6(pl6Var2.a, pl6Var2.b, 9, qq6Var);
                qq6 qq6Var2 = pl6Var2.B;
                qq6Var2.getClass();
                ql6.a(pl6Var4, qq6Var2);
                arrayList.add(iIndexOf, pl6Var4);
            } else {
                pl6 pl6Var5 = new pl6(pl6Var2.a, pl6Var2.b, 2, qq6Var);
                qq6 qq6Var3 = pl6Var2.B;
                qq6Var3.getClass();
                ql6.a(pl6Var5, qq6Var3);
                arrayList.add(iIndexOf, pl6Var5);
            }
            this.B = null;
            p();
        }
    }

    public final void u(pl6 pl6Var, CashOutInfo cashOutInfo, Bet bet) {
        ResourceUiText resourceUiText;
        UiText uiText;
        ResourceUiText resourceUiText2;
        Object next;
        HashMap<String, qq6> map = this.I;
        ek6 ek6Var = this.d;
        if (cashOutInfo != null) {
            Bet bet2 = pl6Var.a;
            Boolean boolIsCalcByJS = cashOutInfo.isCalcByJS();
            Boolean bool = Boolean.TRUE;
            bet2.isCalcByFE = Intrinsics.g(boolIsCalcByJS, bool);
            pl6Var.a.shouldShowRefreshButton = ek6Var.t() && (pl6Var.a.shouldShowRefreshButton || !Intrinsics.g(cashOutInfo.isCalcByJS(), bool));
            Bet bet3 = pl6Var.a;
            bet3.isCashoutAmountNotAcquired = false;
            bet3.isCashAbleJS = cashOutInfo.isCashAbleJs();
            pl6Var.a.maxCashOutAmount = cashOutInfo.maxCashOutAmount();
            pl6Var.a.isJsCalcFailed = cashOutInfo.isJsCalcFailed();
            pl6Var.a.cashOut.coefficient = cashOutInfo.coefficient();
            pl6Var.a.cashOut.isSupportPartial = cashOutInfo.isSupportPartial();
            pl6Var.a.cashOut.maxCashOutAmount = cashOutInfo.maxCashOutAmount();
            pl6Var.a.cashOut.availableStake = cashOutInfo.availableStake();
            UnCashableReason unCashableReason = cashOutInfo.getUnCashableReason();
            if (unCashableReason != null) {
                UiText stringUiText = pl6Var.B.d;
                String code = unCashableReason.getCode();
                ss6[] ss6VarArr = ss6.a;
                if (Intrinsics.g(code, CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS)) {
                    StringUiText stringUiText2 = vch0.a;
                    resourceUiText = new ResourceUiText(R.string.cashout__cashout_unavailable_reason_00);
                } else if (Intrinsics.g(code, "01")) {
                    StringUiText stringUiText3 = vch0.a;
                    resourceUiText = new ResourceUiText(R.string.cashout__cashout_unavailable_reason_01);
                } else if (Intrinsics.g(code, "02")) {
                    StringUiText stringUiText4 = vch0.a;
                    ResourceUiText resourceUiText3 = new ResourceUiText(R.string.cashout__cashout_unavailable_reason_00);
                    String selectionId = unCashableReason.getSelectionId();
                    if (selectionId != null) {
                        List<BetSelection> list = pl6Var.a.selections;
                        list.getClass();
                        Iterator<T> it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.g(((BetSelection) next).id, selectionId));
                        BetSelection betSelection = (BetSelection) next;
                        if (betSelection != null) {
                            resourceUiText = new ResourceUiText(R.string.cashout__cashout_unavailable_reason_02);
                            stringUiText = new StringUiText(dz2.d(betSelection));
                        } else {
                            resourceUiText = resourceUiText3;
                        }
                    } else {
                        uiText = stringUiText;
                        resourceUiText2 = resourceUiText3;
                    }
                    qq6 qq6Var = pl6Var.B;
                    qq6Var.getClass();
                    pl6Var.B = qq6.a(qq6Var, false, false, resourceUiText2, uiText, 3);
                } else if (Intrinsics.g(code, "03")) {
                    StringUiText stringUiText5 = vch0.a;
                    resourceUiText = new ResourceUiText(R.string.cashout__cashout_unavailable_reason_03);
                } else if (Intrinsics.g(code, "04")) {
                    StringUiText stringUiText6 = vch0.a;
                    resourceUiText = new ResourceUiText(R.string.cashout__cashout_unavailable_reason_04);
                } else {
                    StringUiText stringUiText7 = vch0.a;
                    resourceUiText = new ResourceUiText(R.string.cashout__cashout_unavailable_reason_00);
                }
                resourceUiText2 = resourceUiText;
                uiText = stringUiText;
                qq6 qq6Var2 = pl6Var.B;
                qq6Var2.getClass();
                pl6Var.B = qq6.a(qq6Var2, false, false, resourceUiText2, uiText, 3);
            }
            pl6Var.a.isFallbackCashOut = cashOutInfo.isFallbackCashOut();
            qq6 qq6Var3 = pl6Var.B;
            qq6 qq6Var4 = new qq6(qq6Var3.a, qq6Var3.b, qq6Var3.c, qq6Var3.d);
            if (!cashOutInfo.isCashAble()) {
                qq6Var4 = qq6.a(qq6Var4, true, true, null, null, 12);
            }
            map.put(cashOutInfo.betId(), qq6Var4);
            pl6Var.B = qq6Var4;
        }
        if (bet != null) {
            pl6Var.a.update(bet);
            Bet bet4 = pl6Var.a;
            bet4.isCalcByFE = false;
            bet4.shouldShowRefreshButton = ek6Var.t();
            Bet bet5 = pl6Var.a;
            bet5.isJsCalcFailed = false;
            bet5.isCashoutAmountNotAcquired = false;
            bet5.isCashAbleJS = false;
            CashOut cashOut = bet.cashOut;
            bet5.maxCashOutAmount = cashOut.maxCashOutAmount;
            bet5.isFallbackCashOut = cashOut.isFallbackCashOut;
            qq6 qq6Var5 = pl6Var.B;
            qq6 qq6Var6 = new qq6(qq6Var5.a, qq6Var5.b, qq6Var5.c, qq6Var5.d);
            if (!bet.isCashable) {
                qq6Var6 = qq6.a(qq6Var6, true, true, null, null, 12);
            }
            map.put(bet.id, qq6Var6);
            pl6Var.B = qq6Var6;
        }
        if (cashOutInfo == null && bet == null) {
            pl6Var.a.shouldShowRefreshButton = ek6Var.t();
            pl6Var.a.isCashoutAmountNotAcquired = true;
        }
    }
}
