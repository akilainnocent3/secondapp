package com.sportybet.plugin.realsports.sportsmenu;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.book.domain.entity.Sport;
import com.sporty.android.book.domain.entity.SportsMenuData;
import com.sporty.android.book.domain.entity.Tournament;
import com.sporty.android.book.domain.entity.UIState;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.SimpleActionBar;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.data.OrderedSportItem;
import com.sportybet.plugin.realsports.data.OrderedSportItemHelper;
import com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity;
import defpackage.bb40;
import defpackage.bmy;
import defpackage.cgb0;
import defpackage.cyb;
import defpackage.dgb0;
import defpackage.dvy;
import defpackage.ebs;
import defpackage.egb0;
import defpackage.ej5;
import defpackage.f00;
import defpackage.f72;
import defpackage.fgb0;
import defpackage.fgd0;
import defpackage.fvy;
import defpackage.g1i;
import defpackage.gy9;
import defpackage.h5e;
import defpackage.h7u;
import defpackage.i6k;
import defpackage.i72;
import defpackage.iab;
import defpackage.ij90;
import defpackage.itf0;
import defpackage.jfb0;
import defpackage.jq40;
import defpackage.jx9;
import defpackage.kab;
import defpackage.kfb0;
import defpackage.kzh;
import defpackage.lfb0;
import defpackage.mfb0;
import defpackage.o8i0;
import defpackage.op8;
import defpackage.ozh;
import defpackage.pe4;
import defpackage.py1;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.sn5;
import defpackage.t72;
import defpackage.v8i0;
import defpackage.vgb0;
import defpackage.wwd0;
import defpackage.xw9;
import defpackage.yfb0;
import defpackage.yk10;
import defpackage.yzh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sportybet/plugin/realsports/sportsmenu/SportsMenuActivity;", "Lpy1;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$f;", "Lcom/google/android/material/tabs/TabLayout$d;", "Lbb40;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportsMenuActivity extends py1 implements SwipeRefreshLayout.f, TabLayout.d, bb40 {
    public static final /* synthetic */ int i = 0;
    public fgd0 a;
    public int c;
    public boolean e;
    public Toast f;
    public final q8i0 b = new q8i0(jq40.a(dgb0.class), new b(), new a(), new c());
    public final ArrayList d = new ArrayList();

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return SportsMenuActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return SportsMenuActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return SportsMenuActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
        gVar.getClass();
    }

    public final void A1() {
        fgd0 fgd0Var = this.a;
        if (fgd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ComposeView composeView = fgd0Var.b;
        final String cMSString = getCMSString(R.string.common_functions__clear, new Object[0]);
        int i2 = 1;
        final boolean z = (((Collection) B1().G.a.getValue()).isEmpty() && B1().C.a.getValue() == null) ? false : true;
        final f72 f72Var = new f72(this, 2);
        cMSString.getClass();
        composeView.setContent(new op8(-466210839, new Function2() { // from class: t280
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w280.a(0, 9, aVar, null, cMSString, f72Var, z, false);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        dgb0 dgb0VarB1 = B1();
        wwd0 wwd0Var = dgb0VarB1.f;
        wwd0 wwd0Var2 = dgb0VarB1.F;
        wwd0 wwd0Var3 = dgb0VarB1.v;
        int eventSize = -1;
        if (((UIState) wwd0Var3.getValue()).getData() != null) {
            if (!((Collection) wwd0Var2.getValue()).isEmpty()) {
                Iterable<String> iterable = (Iterable) wwd0Var2.getValue();
                ArrayList arrayList = new ArrayList();
                for (String str : iterable) {
                    Object data = ((UIState) wwd0Var3.getValue()).getData();
                    data.getClass();
                    Tournament tournamentFindTournament = ((SportsMenuData) data).findTournament((String) wwd0Var.getValue(), str);
                    if (tournamentFindTournament != null) {
                        arrayList.add(tournamentFindTournament);
                    }
                }
                int size = arrayList.size();
                int i3 = 0;
                eventSize = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    eventSize += ((Tournament) obj).getEventSize();
                }
            } else if (dgb0VarB1.B.getValue() != null) {
                Object data2 = ((UIState) wwd0Var3.getValue()).getData();
                data2.getClass();
                Sport sport = ((SportsMenuData) data2).getSportMap().get(wwd0Var.getValue());
                eventSize = sport != null ? sport.getEventSize() : 0;
            }
        }
        fgd0 fgd0Var2 = this.a;
        if (fgd0Var2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ComposeView composeView2 = fgd0Var2.d;
        final String strA = yk10.a(getCMSString(R.string.common_functions__view, new Object[0]), eventSize >= 0 ? pe4.b(eventSize, " (", ")") : "");
        final boolean z2 = eventSize > 0;
        final kab kabVar = new kab(this, i2);
        composeView2.setContent(new op8(548939753, new Function2() { // from class: er20
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    hr20.a(null, null, strA, z2, false, false, kabVar, aVar, 0, 51);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    public final dgb0 B1() {
        return (dgb0) this.b.getValue();
    }

    public final void C1(boolean z) {
        this.e = z;
        B1().y1(false);
        dgb0 dgb0VarB1 = B1();
        if (dgb0VarB1.d.isLogin()) {
            i6k i6kVar = dgb0VarB1.b;
            kzh.d(new yzh(new g1i(ozh.c(i6kVar.a.j(), i6kVar.b), new egb0(dgb0VarB1, null)), new fgb0(dgb0VarB1, null)), o8i0.d(dgb0VarB1));
        }
    }

    public final void D1(SportsMenuData sportsMenuData) {
        int measuredHeight = 0;
        if (this.e) {
            fgd0 fgd0Var = this.a;
            if (fgd0Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            fgd0Var.v.setRefreshing(false);
        }
        fgd0 fgd0Var2 = this.a;
        if (fgd0Var2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        LoadingView loadingView = fgd0Var2.f;
        boolean zHasEvent = sportsMenuData.hasEvent((String) B1().i.a.getValue());
        boolean zHasEventCount = sportsMenuData.hasEventCount((String) B1().i.a.getValue());
        if (zHasEvent) {
            loadingView.E();
            return;
        }
        ViewGroup.LayoutParams layoutParams = loadingView.getLayoutParams();
        if (layoutParams == null) {
            bmy.a("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        if (zHasEventCount) {
            fgd0 fgd0Var3 = this.a;
            if (fgd0Var3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            measuredHeight = fgd0Var3.i.getMeasuredHeight();
        }
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = measuredHeight;
        loadingView.setLayoutParams(layoutParams2);
        loadingView.G(R.string.az_menu__no_data);
    }

    public final void E1(String str) {
        if ("sr:sport:1".equals(B1().i.a.getValue())) {
            f00 f00Var = vgb0.a;
            vgb0.a(str);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        gVar.getClass();
        this.c = gVar.e;
        B1().B1(((SportsMenuTabItem) this.d.get(this.c)).getId());
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
        gVar.getClass();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void i() {
        fgd0 fgd0Var = this.a;
        if (fgd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        if (fgd0Var.f.isShown()) {
            return;
        }
        C1(true);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x01e3  */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        int i2;
        Object obj;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.spr_activity_sports_menu, (ViewGroup) null, false);
        int i3 = R.id.action_bar_container;
        View viewA = h5e.a(R.id.action_bar_container, viewInflate);
        if (viewA != null) {
            ij90 ij90VarA = ij90.a(viewA);
            i3 = R.id.button_clear;
            ComposeView composeView = (ComposeView) h5e.a(R.id.button_clear, viewInflate);
            if (composeView != null) {
                i3 = R.id.button_container;
                if (((LinearLayout) h5e.a(R.id.button_container, viewInflate)) != null) {
                    i3 = R.id.button_container_divider;
                    View viewA2 = h5e.a(R.id.button_container_divider, viewInflate);
                    if (viewA2 != null) {
                        i3 = R.id.button_view;
                        ComposeView composeView2 = (ComposeView) h5e.a(R.id.button_view, viewInflate);
                        if (composeView2 != null) {
                            i3 = R.id.favorites_hint;
                            BubbleView bubbleView = (BubbleView) h5e.a(R.id.favorites_hint, viewInflate);
                            if (bubbleView != null) {
                                i3 = R.id.loading_view;
                                LoadingView loadingView = (LoadingView) h5e.a(R.id.loading_view, viewInflate);
                                if (loadingView != null) {
                                    i3 = R.id.quick_actions_grid_view;
                                    ComposeView composeView3 = (ComposeView) h5e.a(R.id.quick_actions_grid_view, viewInflate);
                                    if (composeView3 != null) {
                                        i3 = R.id.refresh_layout;
                                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) h5e.a(R.id.refresh_layout, viewInflate);
                                        if (swipeRefreshLayout != null) {
                                            i3 = R.id.scroll_view;
                                            if (((ConsecutiveScrollerLayout) h5e.a(R.id.scroll_view, viewInflate)) != null) {
                                                i3 = R.id.sports_tab;
                                                TabLayout tabLayout = (TabLayout) h5e.a(R.id.sports_tab, viewInflate);
                                                if (tabLayout != null) {
                                                    i3 = R.id.sports_tab_divider;
                                                    View viewA3 = h5e.a(R.id.sports_tab_divider, viewInflate);
                                                    if (viewA3 != null) {
                                                        i3 = R.id.time_picker_view;
                                                        ComposeView composeView4 = (ComposeView) h5e.a(R.id.time_picker_view, viewInflate);
                                                        if (composeView4 != null) {
                                                            i3 = R.id.tournament_picker_view;
                                                            ComposeView composeView5 = (ComposeView) h5e.a(R.id.tournament_picker_view, viewInflate);
                                                            if (composeView5 != null) {
                                                                i3 = R.id.tournament_tab_view;
                                                                ComposeView composeView6 = (ComposeView) h5e.a(R.id.tournament_tab_view, viewInflate);
                                                                if (composeView6 != null) {
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                    fgd0 fgd0Var = new fgd0(constraintLayout, ij90VarA, composeView, viewA2, composeView2, bubbleView, loadingView, composeView3, swipeRefreshLayout, tabLayout, viewA3, composeView4, composeView5, composeView6);
                                                                    setContentView(constraintLayout);
                                                                    this.a = fgd0Var;
                                                                    SimpleActionBar simpleActionBar = ij90VarA.a;
                                                                    simpleActionBar.setTitle(sn5.c(simpleActionBar, R.string.common_functions__sports, new Object[0]));
                                                                    simpleActionBar.setBackButton(new View.OnClickListener() { // from class: xfb0
                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i4 = SportsMenuActivity.i;
                                                                            this.a.finish();
                                                                        }
                                                                    });
                                                                    simpleActionBar.setHomeButton(new yfb0());
                                                                    simpleActionBar.setSearchActionButton(new View.OnClickListener() { // from class: zfb0
                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i4 = SportsMenuActivity.i;
                                                                            yrh0.k(this.a);
                                                                        }
                                                                    });
                                                                    dgb0 dgb0VarB1 = B1();
                                                                    String stringExtra = getIntent().getStringExtra("key_sport_id");
                                                                    if (stringExtra == null) {
                                                                        stringExtra = "sr:sport:1";
                                                                    }
                                                                    dgb0VarB1.B1(stringExtra);
                                                                    HashMap map = new HashMap();
                                                                    String[] strArr = (String[]) lfb0.d().d.keySet().toArray(new String[0]);
                                                                    UiText[] uiTextArr = (UiText[]) lfb0.d().d.values().stream().map(new jfb0()).toArray(new kfb0());
                                                                    int length = strArr.length;
                                                                    for (int i4 = 0; i4 < length; i4++) {
                                                                        String str = strArr[i4];
                                                                        UiText uiText = uiTextArr[i4];
                                                                        uiText.getClass();
                                                                        String string = uiText.e(this).toString();
                                                                        str.getClass();
                                                                        map.put(str, new SportsMenuTabItem(str, string));
                                                                    }
                                                                    Iterator<OrderedSportItem> it = OrderedSportItemHelper.getFromStorage(3).iterator();
                                                                    while (true) {
                                                                        boolean zHasNext = it.hasNext();
                                                                        arrayList = this.d;
                                                                        if (!zHasNext) {
                                                                            break;
                                                                        }
                                                                        SportsMenuTabItem sportsMenuTabItem = (SportsMenuTabItem) map.get(it.next().id);
                                                                        if (sportsMenuTabItem != null) {
                                                                            arrayList.add(sportsMenuTabItem);
                                                                        }
                                                                    }
                                                                    if (arrayList.isEmpty()) {
                                                                        itf0.a aVar = itf0.a;
                                                                        aVar.q(MyLog.TAG_COMMON);
                                                                        aVar.n("no tab sports", new Object[0]);
                                                                        finish();
                                                                        return;
                                                                    }
                                                                    if (TextUtils.isEmpty((CharSequence) B1().i.a.getValue())) {
                                                                        B1().B1(((SportsMenuTabItem) arrayList.get(0)).getId());
                                                                    } else {
                                                                        int size = arrayList.size();
                                                                        int i5 = 0;
                                                                        do {
                                                                            if (i5 >= size) {
                                                                                obj = null;
                                                                                break;
                                                                            } else {
                                                                                obj = arrayList.get(i5);
                                                                                i5++;
                                                                            }
                                                                        } while (!TextUtils.equals(((SportsMenuTabItem) obj).getId(), (CharSequence) B1().i.a.getValue()));
                                                                        if (obj == null) {
                                                                            B1().B1(((SportsMenuTabItem) arrayList.get(0)).getId());
                                                                        }
                                                                    }
                                                                    fgd0 fgd0Var2 = this.a;
                                                                    if (fgd0Var2 == null) {
                                                                        Intrinsics.n("binding");
                                                                        throw null;
                                                                    }
                                                                    final TabLayout tabLayout2 = fgd0Var2.w;
                                                                    int size2 = arrayList.size();
                                                                    int i6 = 0;
                                                                    while (true) {
                                                                        i2 = 1;
                                                                        if (i6 >= size2) {
                                                                            break;
                                                                        }
                                                                        SportsMenuTabItem sportsMenuTabItem2 = (SportsMenuTabItem) arrayList.get(i6);
                                                                        if (TextUtils.equals((CharSequence) B1().i.a.getValue(), sportsMenuTabItem2.getId())) {
                                                                            this.c = i6;
                                                                            TabLayout.g gVarL = tabLayout2.l();
                                                                            gVarL.f = z1(sportsMenuTabItem2);
                                                                            gVarL.f();
                                                                            tabLayout2.d(gVarL, true);
                                                                        } else {
                                                                            TabLayout.g gVarL2 = tabLayout2.l();
                                                                            gVarL2.f = z1(sportsMenuTabItem2);
                                                                            gVarL2.f();
                                                                            tabLayout2.d(gVarL2, false);
                                                                        }
                                                                        i6++;
                                                                    }
                                                                    tabLayout2.a(this);
                                                                    tabLayout2.setTabMode(0);
                                                                    tabLayout2.post(new Runnable() { // from class: agb0
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            tabLayout2.setScrollPosition(this.c, 0.0f, true);
                                                                        }
                                                                    });
                                                                    fgd0 fgd0Var3 = this.a;
                                                                    if (fgd0Var3 == null) {
                                                                        Intrinsics.n("binding");
                                                                        throw null;
                                                                    }
                                                                    LoadingView loadingView2 = fgd0Var3.f;
                                                                    loadingView2.L(null);
                                                                    loadingView2.setOnClickListener(new View.OnClickListener() { // from class: bgb0
                                                                        @Override // android.view.View.OnClickListener
                                                                        public final void onClick(View view) {
                                                                            int i7 = SportsMenuActivity.i;
                                                                            this.a.C1(false);
                                                                        }
                                                                    });
                                                                    fgd0 fgd0Var4 = this.a;
                                                                    if (fgd0Var4 == null) {
                                                                        Intrinsics.n("binding");
                                                                        throw null;
                                                                    }
                                                                    fgd0Var4.v.setOnRefreshListener(this);
                                                                    fgd0 fgd0Var5 = this.a;
                                                                    if (fgd0Var5 == null) {
                                                                        Intrinsics.n("binding");
                                                                        throw null;
                                                                    }
                                                                    ComposeView composeView7 = fgd0Var5.i;
                                                                    final h7u h7uVar = new h7u(this, 2);
                                                                    final dvy dvyVar = new dvy(this, i2);
                                                                    final t72 t72Var = new t72(this, i2);
                                                                    final fvy fvyVar = new fvy(this, i2);
                                                                    final iab iabVar = new iab(this, 2);
                                                                    composeView7.setContent(new op8(404223377, new Function2() { // from class: sb30
                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public final Object invoke(Object obj2, Object obj3) {
                                                                            a aVar2 = (a) obj2;
                                                                            int iIntValue = ((Integer) obj3).intValue();
                                                                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                                                final h7u h7uVar2 = h7uVar;
                                                                                final dvy dvyVar2 = dvyVar;
                                                                                final t72 t72Var2 = t72Var;
                                                                                final fvy fvyVar2 = fvyVar;
                                                                                final iab iabVar2 = iabVar;
                                                                                scv.b(null, null, null, pp8.b(-986434203, new Function2() { // from class: tb30
                                                                                    @Override // kotlin.jvm.functions.Function2
                                                                                    public final Object invoke(Object obj4, Object obj5) {
                                                                                        a aVar3 = (a) obj4;
                                                                                        int iIntValue2 = ((Integer) obj5).intValue();
                                                                                        if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                                                            xb30.a(h7uVar2, dvyVar2, t72Var2, fvyVar2, iabVar2, aVar3, 0);
                                                                                        } else {
                                                                                            aVar3.G();
                                                                                        }
                                                                                        return Unit.a;
                                                                                    }
                                                                                }, aVar2), aVar2, 3072, 7);
                                                                            } else {
                                                                                aVar2.G();
                                                                            }
                                                                            return Unit.a;
                                                                        }
                                                                    }, true));
                                                                    fgd0 fgd0Var6 = this.a;
                                                                    if (fgd0Var6 == null) {
                                                                        Intrinsics.n("binding");
                                                                        throw null;
                                                                    }
                                                                    fgd0Var6.z.setContent(xw9.b);
                                                                    fgd0 fgd0Var7 = this.a;
                                                                    if (fgd0Var7 == null) {
                                                                        Intrinsics.n("binding");
                                                                        throw null;
                                                                    }
                                                                    fgd0Var7.B.setContent(gy9.b);
                                                                    fgd0 fgd0Var8 = this.a;
                                                                    if (fgd0Var8 == null) {
                                                                        Intrinsics.n("binding");
                                                                        throw null;
                                                                    }
                                                                    fgd0Var8.A.setContent(jx9.b);
                                                                    fgd0 fgd0Var9 = this.a;
                                                                    if (fgd0Var9 == null) {
                                                                        Intrinsics.n("binding");
                                                                        throw null;
                                                                    }
                                                                    fgd0Var9.e.setOnClickedClose(new i72(this, 2));
                                                                    ej5.c(ebs.a(getLifecycle()), null, null, new cgb0(this, null), 3);
                                                                    C1(false);
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
    }

    public final ConstraintLayout z1(SportsMenuTabItem sportsMenuTabItem) {
        mfb0 mfb0VarE = lfb0.d().e(sportsMenuTabItem.getId());
        Drawable drawable = null;
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.spr_sports_menu_tab_view, (ViewGroup) null, false);
        int i2 = R.id.new_flag;
        if (((TextView) h5e.a(R.id.new_flag, viewInflate)) != null) {
            i2 = R.id.tab_icon;
            ImageView imageView = (ImageView) h5e.a(R.id.tab_icon, viewInflate);
            if (imageView != null) {
                i2 = R.id.tab_name;
                TextView textView = (TextView) h5e.a(R.id.tab_name, viewInflate);
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    textView.setText(sportsMenuTabItem.getTitle());
                    constraintLayout.getContext();
                    Drawable drawableD = mfb0VarE != null ? mfb0VarE.d() : null;
                    int color = constraintLayout.getContext().getColor(R.color.text_type1_tertiary);
                    if (drawableD != null) {
                        try {
                            drawableD.mutate();
                            drawableD.setTint(color);
                            drawable = drawableD;
                        } catch (Exception unused) {
                        }
                    }
                    imageView.setImageDrawable(drawable);
                    return constraintLayout;
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }
}
