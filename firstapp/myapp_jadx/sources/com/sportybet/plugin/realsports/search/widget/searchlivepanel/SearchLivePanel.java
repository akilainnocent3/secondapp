package com.sportybet.plugin.realsports.search.widget.searchlivepanel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.search.widget.searchlivepanel.SearchLivePanel;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;
import defpackage.bmy;
import defpackage.cw70;
import defpackage.eru;
import defpackage.fpy;
import defpackage.gid0;
import defpackage.h5e;
import defpackage.hkf;
import defpackage.hwr;
import defpackage.ljd0;
import defpackage.mfb0;
import defpackage.mpe0;
import defpackage.qub;
import defpackage.rub;
import defpackage.rus;
import defpackage.sw70;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010'\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0011\u0010@\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010D\u001a\u00020A8F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lcom/sportybet/plugin/realsports/search/widget/searchlivepanel/SearchLivePanel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/google/android/material/tabs/TabLayout;", "sportTabLayout", "", "setSportTabLayout", "(Lcom/google/android/material/tabs/TabLayout;)V", "marketTabLayout", "setMarketTabLayout", "Lgid0;", "marketTitleBinding", "setMarketTitle", "(Lgid0;)V", "Lcom/sportybet/plugin/realsports/type/RegularMarketRule;", "getMarketRule", "()Lcom/sportybet/plugin/realsports/type/RegularMarketRule;", "Lmfb0;", "getSportRule", "()Lmfb0;", "Lhkf;", "H", "Lhkf;", "getEarlyPayoutMarketResolver", "()Lhkf;", "setEarlyPayoutMarketResolver", "(Lhkf;)V", "earlyPayoutMarketResolver", "J", "Lttr;", "getBgColor", "()I", "bgColor", "Leru;", "N", "getSpinnerAdapter", "()Leru;", "spinnerAdapter", "Lrus;", "O", "Lrus;", "getTabClickListener", "()Lrus;", "setTabClickListener", "(Lrus;)V", "tabClickListener", "Lsw70;", "P", "Lsw70;", "getCallBack", "()Lsw70;", "setCallBack", "(Lsw70;)V", "callBack", "Landroidx/recyclerview/widget/RecyclerView;", "getRecycler", "()Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Lcom/sportybet/android/widget/LoadingView;", "getLoading", "()Lcom/sportybet/android/widget/LoadingView;", "loading", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SearchLivePanel extends Hilt_SearchLivePanel {
    public static final /* synthetic */ int S = 0;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public hkf earlyPayoutMarketResolver;
    public final ljd0 I;
    public final mpe0 J;
    public TabLayout K;
    public TabLayout L;
    public gid0 M;
    public final mpe0 N;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public rus tabClickListener;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public sw70 callBack;
    public int Q;
    public int R;

    public static final class a implements TabLayout.d {
        public a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void A0(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void G(TabLayout.g gVar) {
            SearchLivePanel searchLivePanel = SearchLivePanel.this;
            if (gVar == null || searchLivePanel.R != gVar.e) {
                Object obj = gVar != null ? gVar.a : null;
                RegularMarketRule regularMarketRule = obj instanceof RegularMarketRule ? (RegularMarketRule) obj : null;
                if (regularMarketRule != null) {
                    cw70.f.clear();
                    searchLivePanel.getTabClickListener().c(regularMarketRule);
                    searchLivePanel.E(regularMarketRule);
                }
                if (gVar != null) {
                    searchLivePanel.R = gVar.e;
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void g0(TabLayout.g gVar) {
        }
    }

    public static final class b implements TabLayout.d {
        public b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void A0(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void G(TabLayout.g gVar) {
            SearchLivePanel searchLivePanel = SearchLivePanel.this;
            if (gVar == null || searchLivePanel.Q != gVar.e) {
                Object obj = gVar != null ? gVar.a : null;
                mfb0 mfb0Var = obj instanceof mfb0 ? (mfb0) obj : null;
                if (mfb0Var != null) {
                    searchLivePanel.getTabClickListener().b(mfb0Var);
                }
                if (gVar != null) {
                    searchLivePanel.Q = gVar.e;
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void g0(TabLayout.g gVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchLivePanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.spr_search_live_panel, this);
        int i2 = R.id.loading;
        LoadingView loadingView = (LoadingView) h5e.a(R.id.loading, this);
        if (loadingView != null) {
            i2 = R.id.recycler;
            RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recycler, this);
            if (recyclerView != null) {
                this.I = new ljd0(this, loadingView, recyclerView);
                this.J = hwr.b(new qub(context, 2));
                this.N = hwr.b(new rub(this, 1));
                getLoading().getEmptyView().setTextColor(-1);
                getLoading().getErrorView().getTitle().setTextColor(-1);
                getRecycler().setItemAnimator(null);
                setBackgroundColor(getBgColor());
                return;
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final int getBgColor() {
        return ((Number) this.J.getValue()).intValue();
    }

    private final eru getSpinnerAdapter() {
        return (eru) this.N.getValue();
    }

    public final void E(final RegularMarketRule regularMarketRule) {
        gid0 gid0Var = this.M;
        if (gid0Var == null) {
            Intrinsics.n("marketTitleBinding");
            throw null;
        }
        ListenableSpinner listenableSpinner = gid0Var.b;
        if (regularMarketRule != null) {
            List listK = kotlin.collections.b.k(gid0Var.c, gid0Var.d, gid0Var.e, gid0Var.f);
            String[] strArr = regularMarketRule.d;
            strArr.getClass();
            int size = listK.size();
            int i = 0;
            while (true) {
                int i2 = 8;
                if (i >= size) {
                    break;
                }
                if (i < strArr.length) {
                    ((TextView) listK.get(i)).setText(strArr[i]);
                }
                Object obj = listK.get(i);
                obj.getClass();
                View view = (View) obj;
                if (i < strArr.length) {
                    i2 = 0;
                }
                view.setVisibility(i2);
                i++;
            }
            if (!regularMarketRule.c) {
                listenableSpinner.setVisibility(8);
                return;
            }
            listenableSpinner.setVisibility(0);
            listenableSpinner.setOnItemSelectedListener(null);
            getSpinnerAdapter().clear();
            getSpinnerAdapter().addAll(getCallBack().c());
            sw70 callBack = getCallBack();
            String str = regularMarketRule.a;
            str.getClass();
            listenableSpinner.setSelection(callBack.b(str));
            listenableSpinner.setOnItemSelectedListener(new fpy() { // from class: ew70
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onItemSelected(AdapterView adapterView, View view2, int i3, long j) {
                    int i4 = SearchLivePanel.S;
                    sw70 callBack2 = this.a.getCallBack();
                    String str2 = regularMarketRule.a;
                    str2.getClass();
                    callBack2.a(i3, str2);
                }
            });
        }
    }

    public final sw70 getCallBack() {
        sw70 sw70Var = this.callBack;
        if (sw70Var != null) {
            return sw70Var;
        }
        Intrinsics.n("callBack");
        throw null;
    }

    public final hkf getEarlyPayoutMarketResolver() {
        hkf hkfVar = this.earlyPayoutMarketResolver;
        if (hkfVar != null) {
            return hkfVar;
        }
        Intrinsics.n("earlyPayoutMarketResolver");
        throw null;
    }

    public final LoadingView getLoading() {
        return this.I.b;
    }

    public final RegularMarketRule getMarketRule() {
        TabLayout tabLayout = this.L;
        if (tabLayout == null) {
            Intrinsics.n("marketTabLayout");
            throw null;
        }
        TabLayout.g gVarK = tabLayout.k(tabLayout.getSelectedTabPosition());
        Object obj = gVarK != null ? gVarK.a : null;
        if (obj instanceof RegularMarketRule) {
            return (RegularMarketRule) obj;
        }
        return null;
    }

    public final RecyclerView getRecycler() {
        return this.I.c;
    }

    public final mfb0 getSportRule() {
        TabLayout tabLayout = this.K;
        if (tabLayout == null) {
            Intrinsics.n("sportTabLayout");
            throw null;
        }
        TabLayout.g gVarK = tabLayout.k(tabLayout.getSelectedTabPosition());
        Object obj = gVarK != null ? gVarK.a : null;
        if (obj instanceof mfb0) {
            return (mfb0) obj;
        }
        return null;
    }

    public final rus getTabClickListener() {
        rus rusVar = this.tabClickListener;
        if (rusVar != null) {
            return rusVar;
        }
        Intrinsics.n("tabClickListener");
        throw null;
    }

    public final void setCallBack(sw70 sw70Var) {
        sw70Var.getClass();
        this.callBack = sw70Var;
    }

    public final void setEarlyPayoutMarketResolver(hkf hkfVar) {
        hkfVar.getClass();
        this.earlyPayoutMarketResolver = hkfVar;
    }

    public final void setMarketTabLayout(TabLayout marketTabLayout) {
        marketTabLayout.getClass();
        this.L = marketTabLayout;
        marketTabLayout.a(new a());
    }

    public final void setMarketTitle(gid0 marketTitleBinding) {
        marketTitleBinding.getClass();
        this.M = marketTitleBinding;
        marketTitleBinding.b.setAdapter((SpinnerAdapter) getSpinnerAdapter());
    }

    public final void setSportTabLayout(TabLayout sportTabLayout) {
        sportTabLayout.getClass();
        this.K = sportTabLayout;
        sportTabLayout.a(new b());
    }

    public final void setTabClickListener(rus rusVar) {
        rusVar.getClass();
        this.tabClickListener = rusVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchLivePanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchLivePanel(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ SearchLivePanel(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
