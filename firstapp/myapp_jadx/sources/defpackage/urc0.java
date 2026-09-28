package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sporty.android.sportynews.data.CategoryItem;
import com.sporty.android.sportynews.ui.SportyNewsArticleDetailFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.ui.SportyNewsArticleDetailFragment$collectData$1", f = "SportyNewsArticleDetailFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class urc0 extends tje0 implements Function2<ot6, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ SportyNewsArticleDetailFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public urc0(SportyNewsArticleDetailFragment sportyNewsArticleDetailFragment, v1b<? super urc0> v1bVar) {
        super(2, v1bVar);
        this.b = sportyNewsArticleDetailFragment;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        urc0 urc0Var = new urc0(this.b, v1bVar);
        urc0Var.a = obj;
        return urc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ot6 ot6Var, v1b<? super Unit> v1bVar) {
        return ((urc0) create(ot6Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ot6 ot6Var = (ot6) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (ot6Var instanceof ot6.b) {
            SportyNewsArticleDetailFragment sportyNewsArticleDetailFragment = this.b;
            int i = 1;
            sportyNewsArticleDetailFragment.L = true;
            sportyNewsArticleDetailFragment.n0("", false);
            TabLayout tabLayout = sportyNewsArticleDetailFragment.m0().w;
            List<CategoryItem> categories = ((ot6.b) ot6Var).a.getCategories();
            if (categories == null) {
                categories = m2g.a;
            }
            ytc0.c(tabLayout, categories, sportyNewsArticleDetailFragment.K, ((Number) sportyNewsArticleDetailFragment.A.getValue()).intValue(), new u3(sportyNewsArticleDetailFragment, i));
        }
        return Unit.a;
    }
}
