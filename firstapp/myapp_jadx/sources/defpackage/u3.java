package defpackage;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.sportynews.ui.SportyNewsArticleDetailFragment;
import com.sportybet.android.gp.tz.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                v3 v3Var = (v3) obj2;
                Map.Entry entry = (Map.Entry) obj;
                v3.Companion companion = v3.INSTANCE;
                entry.getClass();
                Object key = entry.getKey();
                StringBuilder sb = new StringBuilder(key == v3Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != v3Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            default:
                SportyNewsArticleDetailFragment sportyNewsArticleDetailFragment = (SportyNewsArticleDetailFragment) obj2;
                TabLayout.g gVar = (TabLayout.g) obj;
                if (sportyNewsArticleDetailFragment.L) {
                    sportyNewsArticleDetailFragment.L = false;
                    return Unit.a;
                }
                ((tsc0) sportyNewsArticleDetailFragment.v.getValue()).D.a(Integer.valueOf(gVar != null ? gVar.e : 0));
                Fragment fragmentG = sportyNewsArticleDetailFragment.requireActivity().getSupportFragmentManager().G(R.id.nav_host_fragment);
                if (fragmentG != null) {
                    int iL = fragmentG.getChildFragmentManager().L();
                    for (int i2 = 0; i2 < iL; i2++) {
                        NavHostFragment.a.a(sportyNewsArticleDetailFragment).k();
                    }
                }
                return Unit.a;
        }
    }
}
