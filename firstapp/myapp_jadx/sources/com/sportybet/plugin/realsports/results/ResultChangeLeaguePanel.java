package com.sportybet.plugin.realsports.results;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.ResultsActivity;
import com.sportybet.plugin.realsports.data.Categories;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournaments;
import com.sportybet.plugin.realsports.results.ResultChangeLeaguePanel;
import defpackage.ap0;
import defpackage.bi50;
import defpackage.dl50;
import defpackage.ej50;
import defpackage.gks;
import defpackage.gv5;
import defpackage.hks;
import defpackage.ij50;
import defpackage.iks;
import defpackage.kgb0;
import defpackage.lfb0;
import defpackage.mfb0;
import defpackage.psm;
import defpackage.su5;
import defpackage.vch0;
import defpackage.wj50;
import defpackage.xm50;
import defpackage.z680;
import defpackage.z7h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/sportybet/plugin/realsports/results/ResultChangeLeaguePanel;", "Landroid/widget/RelativeLayout;", "Lpsm;", "f", "Lpsm;", "getCountryManager", "()Lpsm;", "setCountryManager", "(Lpsm;)V", "countryManager", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ResultChangeLeaguePanel extends Hilt_ResultChangeLeaguePanel {
    public static final /* synthetic */ int E = 0;
    public final ArrayList A;
    public final z680 B;
    public z680 C;
    public boolean D;
    public final ResultsActivity c;
    public final long d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public psm countryManager;
    public final z7h i;
    public final RecyclerView v;
    public final ResultsLoadingView w;
    public final TextView y;
    public final wj50 z;

    public static final class a implements gv5<BaseResponse<List<? extends Sport>>> {
        public a() {
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<List<? extends Sport>>> su5Var, Throwable th) {
            th.getClass();
            ResultChangeLeaguePanel resultChangeLeaguePanel = ResultChangeLeaguePanel.this;
            if (resultChangeLeaguePanel.D) {
                return;
            }
            ResultsLoadingView resultsLoadingView = resultChangeLeaguePanel.w;
            if (resultsLoadingView != null) {
                resultsLoadingView.c();
            } else {
                Intrinsics.n("loadingView");
                throw null;
            }
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<List<? extends Sport>>> su5Var, bi50<BaseResponse<List<? extends Sport>>> bi50Var) {
            List<? extends Sport> list;
            final ResultChangeLeaguePanel resultChangeLeaguePanel = ResultChangeLeaguePanel.this;
            z680 z680Var = resultChangeLeaguePanel.B;
            ArrayList arrayList = resultChangeLeaguePanel.A;
            if (resultChangeLeaguePanel.D) {
                return;
            }
            Response response = bi50Var.a;
            BaseResponse<List<? extends Sport>> baseResponse = bi50Var.b;
            if (!response.getIsSuccessful() || baseResponse == null || (list = baseResponse.data) == null) {
                ResultsLoadingView resultsLoadingView = resultChangeLeaguePanel.w;
                if (resultsLoadingView != null) {
                    resultsLoadingView.c();
                    return;
                } else {
                    Intrinsics.n("loadingView");
                    throw null;
                }
            }
            List<? extends Sport> list2 = list;
            if (list2 == null || !(!list2.isEmpty())) {
                ResultsLoadingView resultsLoadingView2 = resultChangeLeaguePanel.w;
                if (resultsLoadingView2 != null) {
                    resultsLoadingView2.b();
                    return;
                } else {
                    Intrinsics.n("loadingView");
                    throw null;
                }
            }
            ResultsLoadingView resultsLoadingView3 = resultChangeLeaguePanel.w;
            if (resultsLoadingView3 == null) {
                Intrinsics.n("loadingView");
                throw null;
            }
            resultsLoadingView3.setVisibility(8);
            Function function = new Function() { // from class: hj50
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    UiText uiText = (UiText) obj;
                    Context context = resultChangeLeaguePanel.getContext();
                    context.getClass();
                    uiText.getClass();
                    return uiText.e(context).toString();
                }
            };
            ArrayList arrayList2 = kgb0.a;
            ArrayList arrayList3 = new ArrayList();
            xm50 xm50Var = new xm50();
            xm50Var.b = 0;
            if (TextUtils.isEmpty(z680Var.a)) {
                StringUiText stringUiText = vch0.a;
                xm50Var.a = (String) function.apply(new ResourceUiText(R.string.common_sports__football));
            } else {
                xm50Var.a = z680Var.b;
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayListC = lfb0.d().c();
            int size = arrayListC.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListC.get(i);
                i++;
                mfb0 mfb0Var = (mfb0) obj;
                dl50 dl50Var = new dl50();
                dl50Var.a = mfb0Var.getId();
                dl50Var.b = (String) function.apply(mfb0Var.c());
                dl50Var.c = 0;
                arrayList4.add(dl50Var);
                xm50Var.e.put(dl50Var.a, arrayList4);
            }
            arrayList3.add(xm50Var);
            xm50 xm50Var2 = new xm50();
            xm50Var2.b = 1;
            if (TextUtils.isEmpty(z680Var.c)) {
                StringUiText stringUiText2 = vch0.a;
                xm50Var2.a = (String) function.apply(new ResourceUiText(R.string.common_functions__select_category));
                function.apply(new ResourceUiText(R.string.common_feedback__no_categories_available));
            } else {
                xm50Var2.a = z680Var.d;
            }
            for (Sport sport : list2) {
                ArrayList arrayList5 = new ArrayList();
                List<Categories> list3 = sport.categories;
                if (list3 != null && list3.size() > 0) {
                    for (Categories categories : list3) {
                        dl50 dl50Var2 = new dl50();
                        dl50Var2.c = 1;
                        dl50Var2.a = categories.id;
                        dl50Var2.b = categories.name;
                        arrayList5.add(dl50Var2);
                    }
                }
                xm50Var2.f.put(sport.id, arrayList5);
            }
            arrayList3.add(xm50Var2);
            xm50 xm50Var3 = new xm50();
            xm50Var3.b = 2;
            if (TextUtils.isEmpty(z680Var.e)) {
                StringUiText stringUiText3 = vch0.a;
                xm50Var3.a = (String) function.apply(new ResourceUiText(R.string.common_functions__select_tournament));
            } else {
                xm50Var3.a = z680Var.f;
            }
            Iterator<? extends Sport> it = list2.iterator();
            while (it.hasNext()) {
                List<Categories> list4 = it.next().categories;
                if (list4 != null && list4.size() > 0) {
                    for (Categories categories2 : list4) {
                        List<Tournaments> list5 = categories2.tournaments;
                        if (list5 != null && list5.size() > 0) {
                            ArrayList arrayList6 = new ArrayList();
                            for (Tournaments tournaments : list5) {
                                dl50 dl50Var3 = new dl50();
                                dl50Var3.c = 2;
                                dl50Var3.a = tournaments.id;
                                dl50Var3.b = tournaments.name;
                                arrayList6.add(dl50Var3);
                            }
                            xm50Var3.i.put(categories2.id, arrayList6);
                        }
                    }
                }
            }
            StringUiText stringUiText4 = vch0.a;
            function.apply(new ResourceUiText(R.string.common_feedback__no_leagues_available));
            arrayList3.add(xm50Var3);
            arrayList.clear();
            arrayList.addAll(arrayList3);
            wj50 wj50Var = resultChangeLeaguePanel.z;
            if (wj50Var == null) {
                Intrinsics.n("recyclerAdapter");
                throw null;
            }
            wj50Var.a = arrayList;
            wj50Var.c = (z680) z680Var.clone();
            wj50Var.notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultChangeLeaguePanel(ResultsActivity resultsActivity, z680 z680Var, long j, long j2) {
        super(resultsActivity);
        z680Var.getClass();
        int i = 1;
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((ij50) generatedComponent()).c(this);
        }
        this.c = resultsActivity;
        this.d = j;
        this.e = j2;
        this.i = ap0.b();
        ArrayList arrayList = new ArrayList();
        this.A = arrayList;
        z680 z680Var2 = (z680) z680Var.clone();
        this.B = z680Var2;
        LayoutInflater.from(getContext()).inflate(R.layout.spr_results_match_list, this);
        View viewFindViewById = findViewById(R.id.results_match_recycler_view);
        viewFindViewById.getClass();
        this.v = (RecyclerView) viewFindViewById;
        String string = getCountryManager().O() ? getContext().getString(R.string.common_sports__football__ZA) : getContext().getString(R.string.common_sports__football);
        string.getClass();
        Context context = getContext();
        wj50 wj50Var = new wj50();
        wj50Var.a = arrayList;
        wj50Var.d = context;
        wj50Var.c = (z680) z680Var2.clone();
        wj50Var.e = string;
        wj50Var.b = new ej50(this);
        this.z = wj50Var;
        RecyclerView recyclerView = this.v;
        if (recyclerView == null) {
            Intrinsics.n("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager());
        wj50 wj50Var2 = this.z;
        if (wj50Var2 == null) {
            Intrinsics.n("recyclerAdapter");
            throw null;
        }
        recyclerView.setAdapter(wj50Var2);
        RecyclerView.l itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f = 0L;
        }
        View viewFindViewById2 = findViewById(R.id.loading);
        viewFindViewById2.getClass();
        this.w = (ResultsLoadingView) viewFindViewById2;
        findViewById(R.id.apply_button).setOnClickListener(new gks(this, i));
        View viewFindViewById3 = findViewById(R.id.reset_button);
        viewFindViewById3.getClass();
        TextView textView = (TextView) viewFindViewById3;
        this.y = textView;
        textView.setOnClickListener(new hks(this, i));
        findViewById(R.id.header_container).setOnClickListener(new iks(this, i));
        ResultsLoadingView resultsLoadingView = this.w;
        if (resultsLoadingView == null) {
            Intrinsics.n("loadingView");
            throw null;
        }
        resultsLoadingView.setOnClickListener(new View.OnClickListener() { // from class: fj50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = ResultChangeLeaguePanel.E;
                this.a.a();
            }
        });
        b(z680Var);
    }

    public final void a() {
        if (this.A.isEmpty()) {
            ResultsLoadingView resultsLoadingView = this.w;
            if (resultsLoadingView == null) {
                Intrinsics.n("loadingView");
                throw null;
            }
            resultsLoadingView.d();
            this.i.t(null, this.d, this.e).G(new a());
        }
    }

    public final void b(z680 z680Var) {
        boolean z = (TextUtils.isEmpty(z680Var.c) && TextUtils.isEmpty(z680Var.e) && "sr:sport:1".equals(z680Var.a)) ? false : true;
        TextView textView = this.y;
        if (textView == null) {
            Intrinsics.n("resetBtn");
            throw null;
        }
        textView.setEnabled(z);
        int i = z ? R.color.brand_secondary : R.color.text_disable_type1_primary;
        if (textView != null) {
            textView.setTextColor(getContext().getColor(i));
        } else {
            Intrinsics.n("resetBtn");
            throw null;
        }
    }

    public final psm getCountryManager() {
        psm psmVar = this.countryManager;
        if (psmVar != null) {
            return psmVar;
        }
        Intrinsics.n("countryManager");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D = true;
    }

    public final void setCountryManager(psm psmVar) {
        psmVar.getClass();
        this.countryManager = psmVar;
    }
}
