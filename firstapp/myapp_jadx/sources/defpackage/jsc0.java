package defpackage;

import android.view.LayoutInflater;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.sportynews.data.CategoryItem;
import com.sporty.android.sportynews.ui.SportyNewsListFragment;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.ui.SportyNewsListFragment$collectData$1", f = "SportyNewsListFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jsc0 extends tje0 implements Function2<ot6, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ SportyNewsListFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsc0(SportyNewsListFragment sportyNewsListFragment, v1b<? super jsc0> v1bVar) {
        super(2, v1bVar);
        this.b = sportyNewsListFragment;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jsc0 jsc0Var = new jsc0(this.b, v1bVar);
        jsc0Var.a = obj;
        return jsc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ot6 ot6Var, v1b<? super Unit> v1bVar) {
        return ((jsc0) create(ot6Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        ot6 ot6Var = (ot6) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = ot6Var instanceof ot6.b;
        SportyNewsListFragment sportyNewsListFragment = this.b;
        if (z) {
            ohp<Object>[] ohpVarArr = SportyNewsListFragment.R;
            sportyNewsListFragment.s0("", false, false);
            List<CategoryItem> categories = ((ot6.b) ot6Var).a.getCategories();
            if (categories == null) {
                categories = m2g.a;
            }
            TabLayout tabLayout = sportyNewsListFragment.o0().c;
            tabLayout.n();
            tabLayout.a(new psc0(sportyNewsListFragment));
            if (sportyNewsListFragment.B == null) {
                Integer num = sportyNewsListFragment.H;
                iIntValue = num != null ? num.intValue() : 0;
            } else {
                iIntValue = -1;
            }
            int i = 0;
            for (Object obj2 : categories) {
                int i2 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                CategoryItem categoryItem = (CategoryItem) obj2;
                krc0 krc0VarA = krc0.a(LayoutInflater.from(sportyNewsListFragment.requireContext()));
                TextView textView = krc0VarA.c;
                textView.setText(categoryItem.getName());
                textView.setTextColor(sportyNewsListFragment.requireContext().getColor(R.color.text_type1_tertiary));
                krc0VarA.b.setVisibility(Intrinsics.g(categoryItem.getName(), "Livescore") ? 0 : 8);
                TabLayout.g gVarL = tabLayout.l();
                gVarL.c(krc0VarA.a);
                gVarL.a = categoryItem.getId();
                tabLayout.d(gVarL, i == iIntValue);
                i = i2;
            }
        } else if (ot6Var instanceof ot6.c) {
            String strD = sn5.d(sportyNewsListFragment, R.string.sporty_news__no_articles_found, new Object[0]);
            ohp<Object>[] ohpVarArr2 = SportyNewsListFragment.R;
            sportyNewsListFragment.s0(strD, true, true);
        } else if (ot6Var instanceof ot6.d) {
            String strD2 = sn5.d(sportyNewsListFragment, R.string.sporty_news__no_articles_found, new Object[0]);
            ohp<Object>[] ohpVarArr3 = SportyNewsListFragment.R;
            sportyNewsListFragment.s0(strD2, true, true);
        }
        return Unit.a;
    }
}
