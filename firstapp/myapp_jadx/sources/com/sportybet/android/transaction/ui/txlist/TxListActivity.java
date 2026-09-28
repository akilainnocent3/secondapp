package com.sportybet.android.transaction.ui.txlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.widgets.DropdownEntry;
import com.sporty.android.core.model.patron.KYCReminder;
import com.sporty.android.core.model.patron.UserCertConstants;
import com.sportybet.android.account.confirm.activity.NameBvnActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.transaction.domain.model.LastDayRangeOption;
import com.sportybet.android.transaction.domain.model.LastDayRangeSetting;
import com.sportybet.android.transaction.ui.calendar.TxCalendarActivity;
import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import com.sportybet.android.transaction.ui.txlist.model.TxListItem;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.feature.kyc.confirmAccountInfo.ConfirmAccountInfoActivity;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxFixStatusActivity;
import com.sportybet.plugin.realsports.activities.TransactionSearchActivity;
import com.sportybet.plugin.realsports.widget.LoadingViewWithHint;
import com.sportybet.plugin.webcontainer.utils.WebViewActivityUtils;
import defpackage.a3h0;
import defpackage.a7h0;
import defpackage.agw;
import defpackage.aqg0;
import defpackage.arr;
import defpackage.b1h0;
import defpackage.bag;
import defpackage.bb40;
import defpackage.bd90;
import defpackage.bjb0;
import defpackage.bmy;
import defpackage.c1h0;
import defpackage.c7h0;
import defpackage.ce;
import defpackage.cny;
import defpackage.cyb;
import defpackage.d9;
import defpackage.e7h0;
import defpackage.ebs;
import defpackage.ee;
import defpackage.ej5;
import defpackage.f7h0;
import defpackage.g0e0;
import defpackage.g1i;
import defpackage.g7h0;
import defpackage.g8l;
import defpackage.gsa;
import defpackage.gym;
import defpackage.h5e;
import defpackage.h7h0;
import defpackage.i7h0;
import defpackage.iny;
import defpackage.iym;
import defpackage.j7h0;
import defpackage.jq40;
import defpackage.k6m;
import defpackage.k7h0;
import defpackage.k7l;
import defpackage.kzh;
import defpackage.lfy;
import defpackage.lsp;
import defpackage.m2g;
import defpackage.mie0;
import defpackage.n7h0;
import defpackage.ngs;
import defpackage.o7d;
import defpackage.o7h0;
import defpackage.o8i0;
import defpackage.psm;
import defpackage.pu0;
import defpackage.pwx;
import defpackage.q8i0;
import defpackage.q900;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s7h0;
import defpackage.s9s;
import defpackage.sh8;
import defpackage.su5;
import defpackage.t7h0;
import defpackage.tj5;
import defpackage.ud;
import defpackage.uy0;
import defpackage.v8i0;
import defpackage.vym;
import defpackage.wae;
import defpackage.wh7;
import defpackage.xpg0;
import defpackage.xxz;
import defpackage.xym;
import defpackage.y6h0;
import defpackage.yec;
import defpackage.yie0;
import defpackage.yrh0;
import defpackage.z6h0;
import defpackage.zch0;
import defpackage.ze;
import defpackage.zsp;
import defpackage.zux;
import defpackage.zyh;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sportybet/android/transaction/ui/txlist/TxListActivity;", "Lpy1;", "Lpwx;", "Landroid/view/View$OnClickListener;", "Lvym;", "Lzux;", "Lbb40;", "Lxym;", "<init>", "()V", "Landroid/view/View;", "v", "", "onClick", "(Landroid/view/View;)V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TxListActivity extends k6m implements pwx, View.OnClickListener, vym, zux, bb40, xym {
    public static final /* synthetic */ int K = 0;
    public final ee<Intent> A;
    public yec B;
    public xxz C;
    public iym D;
    public d9 E;
    public q900 F;
    public lsp G;
    public zsp H;
    public boolean I;
    public su5<BaseResponse<KYCReminder>> J;
    public uy0 b;
    public k7l c;
    public ze d;
    public boolean e;
    public final q8i0 f = new q8i0(jq40.a(com.sportybet.feature.kyc.confirmAccountInfo.f.class), new c(), new b(), new d());
    public final q8i0 i = new q8i0(jq40.a(o7h0.class), new f(), new e(), new g());
    public final n7h0 v;
    public final ee<TxCalendarActivity.b> w;
    public final ee y;
    public final ee<a3h0> z;

    public static final class a extends cny {
        public a(boolean z) {
            super(z);
        }

        @Override // defpackage.cny
        public final void b() {
            TxListActivity txListActivity = TxListActivity.this;
            uy0 uy0Var = txListActivity.b;
            if (uy0Var == null) {
                Intrinsics.n("assetsInfoRepository");
                throw null;
            }
            uy0Var.g();
            f(false);
            txListActivity.getOnBackPressedDispatcher().d();
        }
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TxListActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TxListActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TxListActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return TxListActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class f extends qlr implements Function0<v8i0> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return TxListActivity.this.getViewModelStore();
        }
    }

    public static final class g extends qlr implements Function0<cyb> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return TxListActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public TxListActivity() {
        n7h0 n7h0Var = new n7h0();
        n7h0Var.a = m2g.a;
        n7h0Var.b = new bd90(this, 1);
        this.v = n7h0Var;
        this.w = registerForActivityResult(new TxCalendarActivity.a(), new ud() { // from class: u6h0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ud
            public final void a(Object obj) {
                LastDayRangeSetting lastDayRangeSetting;
                LastDayRangeOption lastDayRangeOption;
                bxg0 bxg0Var = (bxg0) obj;
                int i = TxListActivity.K;
                if (bxg0Var == null) {
                    return;
                }
                long jLongValue = ((Number) bxg0Var.a).longValue();
                long jLongValue2 = ((Number) bxg0Var.b).longValue();
                xpg0.e.a aVar = (xpg0.e.a) bxg0Var.c;
                if (jLongValue == 0 || jLongValue2 == 0) {
                    return;
                }
                TxListActivity txListActivity = this.a;
                o7h0 o7h0VarA1 = txListActivity.A1();
                o7h0.a aVar2 = (o7h0.a) o7h0VarA1.z.a.getValue();
                if (aVar2 != null && (lastDayRangeSetting = aVar2.a) != null && (lastDayRangeOption = lastDayRangeSetting.a) != null) {
                    wwd0 wwd0Var = o7h0VarA1.C;
                    b1h0 b1h0VarA1 = o7h0VarA1.A1(lastDayRangeOption, jLongValue, jLongValue2);
                    wwd0Var.getClass();
                    wwd0Var.k(null, b1h0VarA1);
                    o7h0VarA1.z1();
                }
                if (aVar != null) {
                    gym.a(txListActivity.z1(), new xpg0.e(tj5.a(txListActivity.getIntent()), aVar));
                }
            }
        });
        this.y = registerForActivityResult(TxFixStatusActivity.i, new ud() { // from class: i6h0
            @Override // defpackage.ud
            public final void a(Object obj) {
                p5h0 p5h0Var = (p5h0) obj;
                int i = TxListActivity.K;
                p5h0Var.getClass();
                if (p5h0Var instanceof p5h0.b) {
                    this.a.A1().y1(aqg0.e.c);
                }
            }
        });
        this.z = registerForActivityResult(c1h0.b, new ud() { // from class: j6h0
            @Override // defpackage.ud
            public final void a(Object obj) {
                p5h0 p5h0Var = (p5h0) obj;
                int i = TxListActivity.K;
                p5h0Var.getClass();
                if (p5h0Var instanceof p5h0.c) {
                    p5h0.c cVar = (p5h0.c) p5h0Var;
                    String str = cVar.a;
                    Integer num = cVar.b;
                    Integer num2 = cVar.c;
                    if (str == null || num == null || num2 == null) {
                        return;
                    }
                    int iIntValue = num2.intValue();
                    int iIntValue2 = num.intValue();
                    wwd0 wwd0Var = this.a.A1().J;
                    Object value = wwd0Var.getValue();
                    v8h0.f fVar = value instanceof v8h0.f ? (v8h0.f) value : null;
                    if (fVar == null) {
                        return;
                    }
                    List<TxListItem> list = fVar.a;
                    ArrayList arrayList = new ArrayList(l48.r(list, 10));
                    for (TxListItem bVar : list) {
                        if (bVar instanceof TxListItem.b) {
                            brg0 brg0Var = ((TxListItem.b) bVar).a;
                            if (Intrinsics.g(brg0Var.a, str)) {
                                bVar = new TxListItem.b(brg0.a(brg0Var, iIntValue2, Integer.valueOf(iIntValue), null, 2037));
                            }
                        }
                        arrayList.add(bVar);
                    }
                    wwd0Var.k(null, v8h0.f.a(fVar, arrayList));
                }
            }
        });
        this.A = registerForActivityResult(new ce(), new ud() { // from class: k6h0
            @Override // defpackage.ud
            public final void a(Object obj) {
                int i = TxListActivity.K;
                ((ActivityResult) obj).getClass();
                this.a.A1().x1();
            }
        });
        this.H = new zsp(null, 7);
    }

    public final o7h0 A1() {
        return (o7h0) this.i.getValue();
    }

    public final void B1(boolean z) {
        zsp.a aVar;
        if (!z || (aVar = this.H.a) == zsp.a.b || aVar == zsp.a.d) {
            ze zeVar = this.d;
            if (zeVar != null) {
                zeVar.v.setVisibility(8);
                return;
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
        ze zeVar2 = this.d;
        if (zeVar2 != null) {
            zeVar2.v.setVisibility(0);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        LastDayRangeSetting lastDayRangeSetting;
        v.getClass();
        int id = v.getId();
        if (id == R.id.manual_hint_btn) {
            this.y.b(null);
            return;
        }
        if (id == R.id.goback) {
            getOnBackPressedDispatcher().d();
            return;
        }
        if (id == R.id.help) {
            sh8.c().e(bjb0.S(WebViewActivityUtils.URL_HOW_TO_PLAY_TRANSACTIONS_HISTORY));
            gym.a(z1(), new xpg0.i(tj5.a(getIntent())));
            return;
        }
        if (id == R.id.search) {
            yrh0.t(this, TransactionSearchActivity.class, true);
            gym.a(z1(), new xpg0.j(tj5.a(getIntent())));
            return;
        }
        if (id == R.id.home) {
            sh8.c().e(o7d.a(wae.HOME));
            gym.a(z1(), new xpg0.g(tj5.a(getIntent())));
            return;
        }
        if (id == R.id.typeDropdownEntry) {
            ze zeVar = this.d;
            if (zeVar == null) {
                Intrinsics.n("binding");
                throw null;
            }
            zeVar.E.setSelected(true);
            o7h0 o7h0VarA1 = A1();
            ej5.c(o8i0.d(o7h0VarA1), null, null, new t7h0(null, o7h0VarA1), 3);
            return;
        }
        if (id == R.id.dateRangeDropdownEntry) {
            o7h0 o7h0VarA2 = A1();
            o7h0.a aVar = (o7h0.a) o7h0VarA2.z.a.getValue();
            if (aVar != null && (lastDayRangeSetting = aVar.a) != null) {
                ej5.c(o8i0.d(o7h0VarA2), null, null, new s7h0(o7h0VarA2, (b1h0) o7h0VarA2.C.getValue(), lastDayRangeSetting, null), 3);
            }
            gym.a(z1(), new xpg0.f(tj5.a(getIntent())));
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0153  */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        aqg0 aqg0Var;
        Object next;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_transaction, (ViewGroup) null, false);
        int i = R.id.dateRangeDropdownEntry;
        DropdownEntry dropdownEntry = (DropdownEntry) h5e.a(R.id.dateRangeDropdownEntry, viewInflate);
        if (dropdownEntry != null) {
            i = R.id.frame;
            if (((ConstraintLayout) h5e.a(R.id.frame, viewInflate)) != null) {
                i = R.id.goback;
                ImageButton imageButton = (ImageButton) h5e.a(R.id.goback, viewInflate);
                if (imageButton != null) {
                    i = R.id.help;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.help, viewInflate);
                    if (appCompatImageView != null) {
                        i = R.id.home;
                        ImageButton imageButton2 = (ImageButton) h5e.a(R.id.home, viewInflate);
                        if (imageButton2 != null) {
                            i = R.id.kyc_reminder_hint;
                            TextView textView = (TextView) h5e.a(R.id.kyc_reminder_hint, viewInflate);
                            if (textView != null) {
                                i = R.id.loading;
                                LoadingViewWithHint loadingViewWithHint = (LoadingViewWithHint) h5e.a(R.id.loading, viewInflate);
                                if (loadingViewWithHint != null) {
                                    i = R.id.manual_hint;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.manual_hint, viewInflate);
                                    if (constraintLayout != null) {
                                        i = R.id.manual_hint_btn;
                                        TextView textView2 = (TextView) h5e.a(R.id.manual_hint_btn, viewInflate);
                                        if (textView2 != null) {
                                            i = R.id.manual_hint_text;
                                            if (((TextView) h5e.a(R.id.manual_hint_text, viewInflate)) != null) {
                                                i = R.id.newFeatureAlertView;
                                                BubbleView bubbleView = (BubbleView) h5e.a(R.id.newFeatureAlertView, viewInflate);
                                                if (bubbleView != null) {
                                                    i = R.id.recyclerView;
                                                    RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recyclerView, viewInflate);
                                                    if (recyclerView != null) {
                                                        i = R.id.search;
                                                        ImageView imageView = (ImageView) h5e.a(R.id.search, viewInflate);
                                                        if (imageView != null) {
                                                            i = R.id.swipeRefreshLayout;
                                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.swipeRefreshLayout, viewInflate);
                                                            if (swipeRefreshLayout != null) {
                                                                i = R.id.title;
                                                                TextView textView3 = (TextView) h5e.a(R.id.title, viewInflate);
                                                                if (textView3 != null) {
                                                                    i = R.id.title_container;
                                                                    if (((RelativeLayout) h5e.a(R.id.title_container, viewInflate)) != null) {
                                                                        i = R.id.trans_grey_container;
                                                                        View viewA = h5e.a(R.id.trans_grey_container, viewInflate);
                                                                        if (viewA != null) {
                                                                            wh7 wh7VarA = wh7.a(viewA);
                                                                            i = R.id.typeDropdownEntry;
                                                                            DropdownEntry dropdownEntry2 = (DropdownEntry) h5e.a(R.id.typeDropdownEntry, viewInflate);
                                                                            if (dropdownEntry2 != null) {
                                                                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                                                this.d = new ze(linearLayout, dropdownEntry, imageButton, appCompatImageView, imageButton2, textView, loadingViewWithHint, constraintLayout, textView2, bubbleView, recyclerView, imageView, swipeRefreshLayout, textView3, wh7VarA, dropdownEntry2);
                                                                                setContentView(linearLayout);
                                                                                Intent intent = getIntent();
                                                                                if (intent != null) {
                                                                                    intent.getBooleanExtra("parameter", false);
                                                                                }
                                                                                this.e = true;
                                                                                iny onBackPressedDispatcher = getOnBackPressedDispatcher();
                                                                                cny aVar = new a(this.e);
                                                                                onBackPressedDispatcher.getClass();
                                                                                onBackPressedDispatcher.b(aVar);
                                                                                Intent intent2 = getIntent();
                                                                                if (intent2 != null) {
                                                                                    int intExtra = intent2.getIntExtra("key_param_tx_category", aqg0.a.c.a);
                                                                                    psm countryManager = getCountryManager();
                                                                                    countryManager.getClass();
                                                                                    ListIterator listIterator = aqg0.c.a(countryManager).listIterator(0);
                                                                                    do {
                                                                                        ngs.c cVar = (ngs.c) listIterator;
                                                                                        if (!cVar.hasNext()) {
                                                                                            next = null;
                                                                                            break;
                                                                                        }
                                                                                        next = cVar.next();
                                                                                    } while (((aqg0) next).a != intExtra);
                                                                                    aqg0Var = (aqg0) next;
                                                                                    if (aqg0Var == null) {
                                                                                        aqg0Var = aqg0.a.c;
                                                                                    }
                                                                                } else {
                                                                                    aqg0Var = aqg0.a.c;
                                                                                }
                                                                                bag bagVarA = tj5.a(getIntent());
                                                                                if (bagVarA != null) {
                                                                                    gym.a(z1(), new xpg0.k(bagVarA));
                                                                                }
                                                                                ze zeVar = this.d;
                                                                                if (zeVar == null) {
                                                                                    Intrinsics.n("binding");
                                                                                    throw null;
                                                                                }
                                                                                zeVar.E.setOnClickListener(this);
                                                                                zeVar.b.setOnClickListener(this);
                                                                                zeVar.c.setOnClickListener(this);
                                                                                zeVar.A.setOnClickListener(this);
                                                                                zeVar.d.setOnClickListener(this);
                                                                                zeVar.e.setOnClickListener(this);
                                                                                zeVar.w.setOnClickListener(this);
                                                                                zeVar.C.setOnClickListener(this);
                                                                                zeVar.i.setOnClickListener(new View.OnClickListener() { // from class: p6h0
                                                                                    @Override // android.view.View.OnClickListener
                                                                                    public final void onClick(View view) {
                                                                                        int i2 = TxListActivity.K;
                                                                                        this.a.A1().z1();
                                                                                    }
                                                                                });
                                                                                zeVar.y.setOnClickedClose(new agw(this, 3));
                                                                                ((com.sportybet.feature.kyc.confirmAccountInfo.f) this.f.getValue()).A.f(this, new lfy() { // from class: q6h0
                                                                                    @Override // defpackage.lfy
                                                                                    public final void u1(Object obj) {
                                                                                        Integer num = (Integer) obj;
                                                                                        int i2 = TxListActivity.K;
                                                                                        final TxListActivity txListActivity = this.a;
                                                                                        if (txListActivity.isFinishing() || num == null) {
                                                                                            return;
                                                                                        }
                                                                                        if (!txListActivity.getCountryManager().n()) {
                                                                                            if (txListActivity.getCountryManager().x()) {
                                                                                                d9 d9Var = txListActivity.E;
                                                                                                if (d9Var != null) {
                                                                                                    d9Var.e(txListActivity);
                                                                                                    return;
                                                                                                } else {
                                                                                                    Intrinsics.n("accountLockedManager");
                                                                                                    throw null;
                                                                                                }
                                                                                            }
                                                                                            return;
                                                                                        }
                                                                                        if (num.intValue() == 310) {
                                                                                            final int i3 = 1000;
                                                                                            txListActivity.getConfirmNameDialogLauncher().b(txListActivity, new Function0() { // from class: n6h0
                                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                                public final Object invoke() {
                                                                                                    int i4 = TxListActivity.K;
                                                                                                    int i5 = i3;
                                                                                                    TxListActivity txListActivity2 = txListActivity;
                                                                                                    Intent intent3 = i5 == 1000 ? new Intent(txListActivity2, (Class<?>) NameBvnActivity.class) : new Intent(txListActivity2, (Class<?>) ConfirmAccountInfoActivity.class);
                                                                                                    intent3.putExtra(UserCertConstants.EXTRA_SOURCE, 1000);
                                                                                                    pcx.a aVar2 = pcx.b;
                                                                                                    intent3.putExtra(UserCertConstants.EXTRA_TRIGGER, "annoying");
                                                                                                    yrh0.s(txListActivity2, intent3, true);
                                                                                                    return Unit.a;
                                                                                                }
                                                                                            });
                                                                                        } else if (num.intValue() == 320) {
                                                                                            final int i4 = 2000;
                                                                                            txListActivity.getConfirmNameDialogLauncher().b(txListActivity, new Function0() { // from class: n6h0
                                                                                                @Override // kotlin.jvm.functions.Function0
                                                                                                public final Object invoke() {
                                                                                                    int i5 = TxListActivity.K;
                                                                                                    int i6 = i4;
                                                                                                    TxListActivity txListActivity2 = txListActivity;
                                                                                                    Intent intent3 = i6 == 1000 ? new Intent(txListActivity2, (Class<?>) NameBvnActivity.class) : new Intent(txListActivity2, (Class<?>) ConfirmAccountInfoActivity.class);
                                                                                                    intent3.putExtra(UserCertConstants.EXTRA_SOURCE, 1000);
                                                                                                    pcx.a aVar2 = pcx.b;
                                                                                                    intent3.putExtra(UserCertConstants.EXTRA_TRIGGER, "annoying");
                                                                                                    yrh0.s(txListActivity2, intent3, true);
                                                                                                    return Unit.a;
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    }
                                                                                });
                                                                                o7h0 o7h0VarA1 = A1();
                                                                                o7h0VarA1.y1(aqg0Var);
                                                                                o7h0VarA1.x1();
                                                                                ej5.c(ebs.a(getLifecycle()), null, null, new a7h0(null, o7h0VarA1, this), 3);
                                                                                ej5.c(ebs.a(getLifecycle()), null, null, new c7h0(null, o7h0VarA1, this), 3);
                                                                                g1i g1iVar = new g1i(o7h0VarA1.O, new e7h0(this, null));
                                                                                s9s lifecycle = getLifecycle();
                                                                                lifecycle.getClass();
                                                                                s9s.b bVar = s9s.b.d;
                                                                                arr.a(g1iVar, lifecycle, bVar);
                                                                                ej5.c(ebs.a(getLifecycle()), null, null, new f7h0(null, o7h0VarA1, this), 3);
                                                                                kzh.d(new g1i(zyh.a(o7h0VarA1.K, getLifecycle(), bVar), new g7h0(this, null)), ebs.a(getLifecycle()));
                                                                                kzh.d(new g1i(zyh.a(o7h0VarA1.D, getLifecycle(), bVar), new h7h0(this, null)), ebs.a(getLifecycle()));
                                                                                kzh.d(new g1i(zyh.a(o7h0VarA1.B, getLifecycle(), bVar), new i7h0(this, null)), ebs.a(getLifecycle()));
                                                                                kzh.d(new g1i(zyh.a(o7h0VarA1.I, getLifecycle(), bVar), new j7h0(this, null)), ebs.a(getLifecycle()));
                                                                                kzh.d(new g1i(zyh.a(o7h0VarA1.i.a(), getLifecycle(), bVar), new k7h0(this, null)), ebs.a(getLifecycle()));
                                                                                ze zeVar2 = this.d;
                                                                                if (zeVar2 == null) {
                                                                                    Intrinsics.n("binding");
                                                                                    throw null;
                                                                                }
                                                                                SwipeRefreshLayout swipeRefreshLayout2 = zeVar2.B;
                                                                                RecyclerView recyclerView2 = zeVar2.z;
                                                                                swipeRefreshLayout2.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: h6h0
                                                                                    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
                                                                                    public final void i() {
                                                                                        int i2 = TxListActivity.K;
                                                                                        o7h0 o7h0VarA2 = this.a.A1();
                                                                                        wwd0 wwd0Var = o7h0VarA2.J;
                                                                                        wwd0Var.getClass();
                                                                                        wwd0Var.k(null, v8h0.e.a);
                                                                                        jvd0 jvd0Var = o7h0VarA2.Q;
                                                                                        if (jvd0Var != null) {
                                                                                            jvd0Var.cancel((CancellationException) null);
                                                                                        }
                                                                                        o7h0VarA2.Q = null;
                                                                                        ej5.c(o8i0.d(o7h0VarA2), null, null, new y7h0(null, o7h0VarA2), 3);
                                                                                        o7h0VarA2.Q = ej5.c(o8i0.d(o7h0VarA2), null, null, new w7h0(null, o7h0VarA2), 3);
                                                                                        o7h0VarA2.x1();
                                                                                    }
                                                                                });
                                                                                recyclerView2.k(new z6h0(this));
                                                                                float f2 = swipeRefreshLayout2.getResources().getDisplayMetrics().density;
                                                                                int color = getColor(R.color.background_type1_secondary);
                                                                                int color2 = getColor(R.color.text_type1_primary);
                                                                                g0e0 g0e0Var = g0e0.a.a(new g8l() { // from class: o6h0
                                                                                    @Override // defpackage.g8l
                                                                                    public final String a(int i2) {
                                                                                        Object objV = CollectionsKt.V(i2, this.a.v.a);
                                                                                        TxListItem.b bVar2 = objV instanceof TxListItem.b ? (TxListItem.b) objV : null;
                                                                                        if (bVar2 == null) {
                                                                                            return null;
                                                                                        }
                                                                                        return bVar2.c;
                                                                                    }
                                                                                }).a;
                                                                                g0e0Var.a = color;
                                                                                g0e0Var.i.setColor(color);
                                                                                g0e0Var.b = zch0.a(recyclerView2.getContext(), 32);
                                                                                g0e0Var.d = color2;
                                                                                g0e0Var.h.setColor(color2);
                                                                                int i2 = (int) ((14.0f * recyclerView2.getContext().getResources().getDisplayMetrics().scaledDensity) + 0.5f);
                                                                                g0e0Var.f = i2;
                                                                                g0e0Var.h.setTextSize(i2);
                                                                                g0e0Var.e = zch0.a(recyclerView2.getContext(), ((double) f2) == 1.0d ? 10 : 20);
                                                                                g0e0Var.c = true;
                                                                                recyclerView2.i(g0e0Var);
                                                                                recyclerView2.setAdapter(this.v);
                                                                                if (getCountryManager().r()) {
                                                                                    int color3 = getColor(R.color.spr_btn_gray);
                                                                                    su5<BaseResponse<KYCReminder>> su5Var = this.J;
                                                                                    if (su5Var != null) {
                                                                                        su5Var.cancel();
                                                                                    }
                                                                                    xxz xxzVar = this.C;
                                                                                    if (xxzVar == null) {
                                                                                        Intrinsics.n("patronApiService");
                                                                                        throw null;
                                                                                    }
                                                                                    su5<BaseResponse<KYCReminder>> su5VarS = xxzVar.s();
                                                                                    this.J = su5VarS;
                                                                                    if (su5VarS != null) {
                                                                                        su5VarS.G(new y6h0(color3, this));
                                                                                    }
                                                                                }
                                                                                yie0.a(this, mie0.e);
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.rn8, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        recreate();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        getWindow().setFlags(8192, 8192);
        su5<BaseResponse<KYCReminder>> su5Var = this.J;
        if (su5Var != null) {
            su5Var.cancel();
        }
        this.J = null;
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        getWindow().clearFlags(8192);
        com.sportybet.feature.kyc.confirmAccountInfo.f fVar = (com.sportybet.feature.kyc.confirmAccountInfo.f) this.f.getValue();
        kzh.d(new gsa(fVar.a.j0(pu0.c.a), fVar), o8i0.d(fVar));
    }

    public final iym z1() {
        iym iymVar = this.D;
        if (iymVar != null) {
            return iymVar;
        }
        Intrinsics.n("openTelemetryLogger");
        throw null;
    }
}
