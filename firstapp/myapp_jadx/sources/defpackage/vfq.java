package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.chip.ChipGroup;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.HotKeywordData;
import com.sportybet.plugin.realsports.search.SearchFragment;
import com.sportybet.plugin.realsports.search.SearchResultLoadingView;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vfq implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vfq(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                qcn qcnVar = (qcn) obj3;
                szr szrVar = (szr) obj;
                szrVar.getClass();
                szrVar.d(qcnVar.size(), new jgq(new bgq(), qcnVar), new kgq(qcnVar), new op8(802480018, new lgq(qcnVar, (Function1) obj2), true));
                return Unit.a;
            default:
                final SearchFragment searchFragment = (SearchFragment) obj3;
                uhd0 uhd0Var = (uhd0) obj2;
                SearchResultLoadingView searchResultLoadingView = uhd0Var.L;
                lk50 lk50Var = (lk50) obj;
                if (lk50Var instanceof lk50.c) {
                    if (!searchFragment.O) {
                        searchResultLoadingView.setVisibility(8);
                    }
                    for (final HotKeywordData hotKeywordData : (Iterable) ((lk50.c) lk50Var).a) {
                        ChipGroup chipGroup = uhd0Var.e;
                        View viewInflate = LayoutInflater.from(searchFragment.getContext()).inflate(R.layout.spr_hot_search_tag, (ViewGroup) null, false);
                        if (viewInflate == null) {
                            bmy.a("rootView");
                            return null;
                        }
                        TextView textView = (TextView) viewInflate;
                        textView.setTag(hotKeywordData);
                        textView.setText(hotKeywordData.getName());
                        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                        textView.setId(View.generateViewId());
                        textView.setOnClickListener(new View.OnClickListener() { // from class: uu70
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ohp<Object>[] ohpVarArr = SearchFragment.V;
                                searchFragment.z0(hotKeywordData.getName());
                            }
                        });
                        chipGroup.addView(textView);
                    }
                } else if (lk50Var instanceof lk50.a) {
                    if (!searchFragment.O) {
                        searchResultLoadingView.setVisibility(8);
                    }
                    zyf0.b(R.string.common_feedback__sorry_something_went_wrong, 0);
                    itf0.a.b(((lk50.a) lk50Var).a);
                } else {
                    ohp<Object>[] ohpVarArr = SearchFragment.V;
                }
                return Unit.a;
        }
    }
}
