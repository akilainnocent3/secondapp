package defpackage;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.sportynews.data.CategoryItem;
import com.sporty.android.sportynews.ui.SportyNewsVideoDetailFragment;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.ui.SportyNewsVideoDetailFragment$collectData$1", f = "SportyNewsVideoDetailFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class huc0 extends tje0 implements Function2<ot6, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ SportyNewsVideoDetailFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public huc0(SportyNewsVideoDetailFragment sportyNewsVideoDetailFragment, v1b<? super huc0> v1bVar) {
        super(2, v1bVar);
        this.b = sportyNewsVideoDetailFragment;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        huc0 huc0Var = new huc0(this.b, v1bVar);
        huc0Var.a = obj;
        return huc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ot6 ot6Var, v1b<? super Unit> v1bVar) {
        return ((huc0) create(ot6Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ot6 ot6Var = (ot6) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (ot6Var instanceof ot6.b) {
            final SportyNewsVideoDetailFragment sportyNewsVideoDetailFragment = this.b;
            sportyNewsVideoDetailFragment.R = true;
            sportyNewsVideoDetailFragment.o0("", false);
            TabLayout tabLayout = sportyNewsVideoDetailFragment.n0().v;
            List<CategoryItem> categories = ((ot6.b) ot6Var).a.getCategories();
            if (categories == null) {
                categories = m2g.a;
            }
            ytc0.c(tabLayout, categories, sportyNewsVideoDetailFragment.Q, ((Number) sportyNewsVideoDetailFragment.A.getValue()).intValue(), new Function1() { // from class: guc0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    TabLayout.g gVar = (TabLayout.g) obj2;
                    SportyNewsVideoDetailFragment sportyNewsVideoDetailFragment2 = sportyNewsVideoDetailFragment;
                    if (sportyNewsVideoDetailFragment2.R) {
                        sportyNewsVideoDetailFragment2.R = false;
                        return Unit.a;
                    }
                    ((tsc0) sportyNewsVideoDetailFragment2.v.getValue()).D.a(Integer.valueOf(gVar != null ? gVar.e : 0));
                    Fragment fragmentG = sportyNewsVideoDetailFragment2.requireActivity().getSupportFragmentManager().G(R.id.nav_host_fragment);
                    if (fragmentG != null) {
                        int iL = fragmentG.getChildFragmentManager().L();
                        for (int i = 0; i < iL; i++) {
                            NavHostFragment.a.a(sportyNewsVideoDetailFragment2).k();
                        }
                    }
                    return Unit.a;
                }
            });
        }
        return Unit.a;
    }
}
