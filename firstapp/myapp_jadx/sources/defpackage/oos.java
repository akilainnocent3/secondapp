package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.book.presentation.eventsorting.EventSortDirection;
import com.sporty.android.book.presentation.eventsorting.EventSortType;
import com.sporty.android.book.presentation.eventsorting.EventStreamType;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.plugin.realsports.data.QuickMarketHelper;
import com.sportybet.plugin.realsports.live.data.LiveEventData;
import com.sportybet.plugin.realsports.live.data.LiveHeaderData;
import com.sportybet.plugin.realsports.live.data.LiveTournamentData;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import com.sportybet.plugin.realsports.quickmarket.DarkQuickMenuOptionActivity;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class oos extends com.cruxlab.sectionedrecyclerview.lib.a.AbstractC0185a {
    public final aos b;
    public final hkf c;
    public final Drawable d;
    public final Drawable e;
    public final pps f;
    public final ats g;
    public final qps h;
    public final eqs i;
    public final Context j;
    public final mpe0 k;
    public String l;
    public boolean m;
    public final mpe0 n;

    public static final class a implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ oos b;

        public a(cq40 cq40Var, oos oosVar) {
            this.a = cq40Var;
            this.b = oosVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 350) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            qps qpsVar = this.b.h;
            if (qpsVar != null) {
                LivePageActivity livePageActivity = qpsVar.a;
                ee<Intent> eeVar = livePageActivity.a0;
                Intent intent = new Intent();
                mfb0 mfb0Var = livePageActivity.G1().B;
                intent.putExtra("SELECT_SPORT_ID", mfb0Var != null ? mfb0Var.getId() : null);
                RegularMarketRule regularMarketRule = livePageActivity.G1().C;
                intent.putExtra("SELECT_MARKET_ID", regularMarketRule != null ? regularMarketRule.a : null);
                intent.setClass(livePageActivity, DarkQuickMenuOptionActivity.class);
                eeVar.b(intent);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public oos(final aos aosVar, hkf hkfVar, Drawable drawable, Drawable drawable2, pps ppsVar, ats atsVar, qps qpsVar, eqs eqsVar) {
        hkfVar.getClass();
        ConstraintLayout constraintLayout = aosVar.a;
        super(constraintLayout);
        this.b = aosVar;
        this.c = hkfVar;
        this.d = drawable;
        this.e = drawable2;
        this.f = ppsVar;
        this.g = atsVar;
        this.h = qpsVar;
        this.i = eqsVar;
        Context context = constraintLayout.getContext();
        context.getClass();
        this.j = context;
        this.k = hwr.b(new Function0() { // from class: hos
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                gid0 gid0Var = this.a.b.v;
                return b.k(gid0Var.c, gid0Var.d, gid0Var.e, gid0Var.f);
            }
        });
        mpe0 mpe0VarB = hwr.b(new e0e(this, 2));
        this.n = mpe0VarB;
        aosVar.v.b.setAdapter((SpinnerAdapter) mpe0VarB.getValue());
        aosVar.i.a(new mos(this));
        AppCompatCheckBox appCompatCheckBox = aosVar.b;
        appCompatCheckBox.setButtonDrawable(drawable2);
        appCompatCheckBox.setOnClickListener(new View.OnClickListener() { // from class: ios
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ats atsVar2 = this.a.g;
                boolean zIsChecked = aosVar.b.isChecked();
                xss xssVar = atsVar2.a;
                ArrayList arrayList = xssVar.t;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (obj instanceof LiveTournamentData) {
                        arrayList2.add(obj);
                    }
                }
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    LiveTournamentData liveTournamentData = (LiveTournamentData) obj2;
                    LinkedHashSet linkedHashSet = xssVar.w;
                    if (zIsChecked) {
                        String str = liveTournamentData.getTournament().id;
                        str.getClass();
                        linkedHashSet.add(str);
                    } else {
                        linkedHashSet.remove(liveTournamentData.getTournament().id);
                    }
                }
                k48.a(xssVar.u, xssVar.o());
                xssVar.I = true;
                xssVar.v();
                xssVar.c();
                jts jtsVar = xssVar.z;
                if (jtsVar != null) {
                    jtsVar.h(false);
                }
            }
        });
        aosVar.w.setOnStateChangedListener(new nos(this));
        aosVar.y.setOnStateChangedListener(new OUEarlyGoalsSwitch.b() { // from class: jos
            @Override // com.sportybet.android.widget.OUEarlyGoalsSwitch.b
            public final void onStateChanged(boolean z) {
                RegularMarketRule regularMarketRule;
                eqs eqsVar2 = this.a.i;
                if (eqsVar2 != null) {
                    xss xssVar = eqsVar2.b;
                    LivePageActivity livePageActivity = eqsVar2.a;
                    int i = LivePageActivity.b0;
                    mfb0 mfb0Var = livePageActivity.G1().B;
                    if (mfb0Var == null || (regularMarketRule = livePageActivity.G1().C) == null) {
                        return;
                    }
                    xssVar.D = z;
                    djh0 djh0Var = livePageActivity.R;
                    if (djh0Var != null) {
                        sih0 sih0Var = djh0Var.u;
                        OUEarlyGoalsSwitch oUEarlyGoalsSwitch = sih0Var != null ? sih0Var.z : null;
                        if (oUEarlyGoalsSwitch != null) {
                            oUEarlyGoalsSwitch.setState(z, false, false);
                        }
                    }
                    djh0 djh0Var2 = livePageActivity.R;
                    if (djh0Var2 != null) {
                        djh0Var2.h();
                    }
                    hkf hkfVarF1 = livePageActivity.F1();
                    ckf ckfVar = ckf.a;
                    RegularMarketRule regularMarketRuleA = hkfVarF1.a(mfb0Var.getId(), regularMarketRule, z, true);
                    if (regularMarketRuleA == null) {
                        return;
                    }
                    livePageActivity.z1().e.post(new dqs(xssVar, regularMarketRule, regularMarketRuleA, livePageActivity));
                    ((ijf) livePageActivity.M.getValue()).B1(lkf.b, zjf.a, z ? pkf.a : pkf.b);
                }
            }
        });
        BubbleView bubbleView = aosVar.f;
        bubbleView.setOnClickedClose(new kos(this, 0));
        gby.a(bubbleView.getDescriptionView(), new los(this, 0));
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [bos] */
    /* JADX WARN: Type inference failed for: r9v0, types: [eos] */
    public final void a(RegularMarketRule regularMarketRule, final LiveHeaderData liveHeaderData, float f) {
        regularMarketRule.getClass();
        liveHeaderData.getClass();
        aos aosVar = this.b;
        ComposeView composeView = aosVar.c;
        final EventSortType sortType = liveHeaderData.getSortType();
        final EventSortDirection sortDirection = liveHeaderData.getSortDirection();
        final Set<EventStreamType> selectedStreamTypes = liveHeaderData.getSelectedStreamTypes();
        final int sportyTvCount = liveHeaderData.getSportyTvCount();
        final int sportyFmCount = liveHeaderData.getSportyFmCount();
        final ?? r8 = new Function2() { // from class: bos
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                EventSortType eventSortType = (EventSortType) obj;
                EventSortDirection eventSortDirection = (EventSortDirection) obj2;
                eventSortType.getClass();
                eventSortDirection.getClass();
                xss xssVar = this.a.g.a;
                xssVar.s = LiveHeaderData.copy$default(xssVar.s, false, false, eventSortType, eventSortDirection, null, 0, 0, 115, null);
                k48.a(xssVar.u, xssVar.o());
                xssVar.I = true;
                xssVar.v();
                xssVar.c();
                jts jtsVar = xssVar.z;
                if (jtsVar != null) {
                    jtsVar.h(true);
                }
                return Unit.a;
            }
        };
        final ?? r9 = new Function1() { // from class: eos
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Set<? extends EventStreamType> set = (Set) obj;
                set.getClass();
                this.a.g.a(set);
                return Unit.a;
            }
        };
        sortType.getClass();
        sortDirection.getClass();
        selectedStreamTypes.getClass();
        composeView.setContent(new op8(-808016725, new Function2() { // from class: pqg
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    arg.a(sortType, sortDirection, selectedStreamTypes, sportyTvCount, sportyFmCount, r8, r9, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        ComposeView composeView2 = aosVar.d;
        Set<EventStreamType> selectedStreamTypes2 = liveHeaderData.getSelectedStreamTypes();
        Function1 function1 = new Function1() { // from class: fos
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                EventStreamType eventStreamType = (EventStreamType) obj;
                eventStreamType.getClass();
                this.a.g.a(yi80.c(liveHeaderData.getSelectedStreamTypes(), eventStreamType));
                return Unit.a;
            }
        };
        selectedStreamTypes2.getClass();
        composeView2.setContent(new op8(814884910, new hrg(0, function1, selectedStreamTypes2), true));
        AppCompatCheckBox appCompatCheckBox = aosVar.b;
        boolean zL = this.g.a.l();
        appCompatCheckBox.setChecked(zL);
        appCompatCheckBox.setButtonDrawable(zL ? this.d : this.e);
        appCompatCheckBox.setText(sn5.b(this.j, zL ? R.string.common_functions__expand_all : R.string.common_functions__collapse_all, new Object[0]));
        boolean hideQuickMarketTabs = liveHeaderData.getHideQuickMarketTabs();
        boolean zIsLoadingOrEmpty = liveHeaderData.isLoadingOrEmpty();
        this.m = hideQuickMarketTabs;
        TabLayout tabLayout = aosVar.i;
        ComposeView composeView3 = aosVar.c;
        tabLayout.setVisibility((zIsLoadingOrEmpty || hideQuickMarketTabs) ? 8 : 0);
        if (zIsLoadingOrEmpty) {
            b(regularMarketRule, false);
            appCompatCheckBox.setVisibility(8);
            composeView3.setVisibility(8);
            composeView2.setVisibility(8);
            aosVar.z.setVisibility(8);
            return;
        }
        b(regularMarketRule, true);
        appCompatCheckBox.setVisibility(0);
        composeView3.setVisibility(0);
        composeView2.setVisibility(0);
        c(f, this.l);
    }

    public final void b(final RegularMarketRule regularMarketRule, boolean z) {
        gid0 gid0Var = this.b.v;
        ListenableSpinner listenableSpinner = gid0Var.b;
        String[] strArr = regularMarketRule.d;
        strArr.getClass();
        int length = strArr.length;
        View view = gid0Var.i;
        mpe0 mpe0Var = this.k;
        if (!z) {
            view.setVisibility(8);
            for (TextView textView : (List) mpe0Var.getValue()) {
                textView.getClass();
                textView.setVisibility(8);
            }
            listenableSpinner.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        int size = ((List) mpe0Var.getValue()).size();
        int i = 0;
        while (i < size) {
            if (i < length) {
                ((TextView) ((List) mpe0Var.getValue()).get(i)).setText(strArr[i]);
            }
            Object obj = ((List) mpe0Var.getValue()).get(i);
            obj.getClass();
            ((View) obj).setVisibility(i < length ? 0 : 8);
            i++;
        }
        if (!regularMarketRule.c) {
            listenableSpinner.setVisibility(8);
            return;
        }
        listenableSpinner.setVisibility(0);
        listenableSpinner.setOnItemSelectedListener(null);
        mpe0 mpe0Var2 = this.n;
        ((eru) mpe0Var2.getValue()).clear();
        eru eruVar = (eru) mpe0Var2.getValue();
        ats atsVar = this.g;
        eruVar.addAll(atsVar.a.e.g());
        String str = regularMarketRule.a;
        str.getClass();
        listenableSpinner.setSelection(atsVar.a.e.f(str));
        listenableSpinner.setOnItemSelectedListener(new fpy() { // from class: dos
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView adapterView, View view2, int i2, long j) {
                ats atsVar2 = this.a.g;
                final String str2 = regularMarketRule.a;
                str2.getClass();
                atsVar2.getClass();
                final xss xssVar = atsVar2.a;
                xssVar.e.h(i2, str2, new Function1() { // from class: zss
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        xss xssVar2 = xssVar;
                        vfh0 vfh0Var = xssVar2.e;
                        String str3 = (String) obj2;
                        ArrayList arrayList = xssVar2.t;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = arrayList.size();
                        int i3 = 0;
                        int i4 = 0;
                        while (i4 < size2) {
                            Object obj3 = arrayList.get(i4);
                            i4++;
                            if (obj3 instanceof LiveEventData) {
                                arrayList2.add(obj3);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(l48.r(arrayList2, 10));
                        int size3 = arrayList2.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            Object obj4 = arrayList2.get(i5);
                            i5++;
                            arrayList3.add(((LiveEventData) obj4).getEvent());
                        }
                        String str4 = str2;
                        str4.getClass();
                        vfh0Var.getClass();
                        vfh0.a(str4, str3, arrayList3);
                        ArrayList arrayList4 = xssVar2.u;
                        ArrayList arrayList5 = new ArrayList();
                        int size4 = arrayList4.size();
                        int i6 = 0;
                        while (i6 < size4) {
                            Object obj5 = arrayList4.get(i6);
                            i6++;
                            if (obj5 instanceof LiveEventData) {
                                arrayList5.add(obj5);
                            }
                        }
                        ArrayList arrayList6 = new ArrayList(l48.r(arrayList5, 10));
                        int size5 = arrayList5.size();
                        while (i3 < size5) {
                            Object obj6 = arrayList5.get(i3);
                            i3++;
                            arrayList6.add(((LiveEventData) obj6).getEvent());
                        }
                        vfh0Var.getClass();
                        vfh0.a(str4, str3, arrayList6);
                        xssVar2.c();
                        return Unit.a;
                    }
                });
            }
        });
    }

    public final void c(float f, String str) {
        AppCompatImageView appCompatImageView = this.b.z;
        if (!QuickMarketHelper.supportMarketMenu(str, Float.valueOf(f)) || this.m) {
            appCompatImageView.setVisibility(8);
        } else {
            appCompatImageView.setVisibility(0);
            appCompatImageView.setOnClickListener(new a(new cq40(), this));
        }
    }
}
