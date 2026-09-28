package defpackage;

import android.text.TextUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.fragment.MyTeamFragment;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pjs implements lfy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pjs(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lfy
    public final void u1(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ytw) obj2).setValue(obj);
                break;
            default:
                MyTeamFragment myTeamFragment = (MyTeamFragment) obj2;
                hqc hqcVar = (hqc) obj;
                if (hqcVar instanceof nqc) {
                    h2x h2xVar = (h2x) ((nqc) hqcVar).a;
                    ArrayList arrayList = h2xVar.c;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        j2x j2xVar = (j2x) obj3;
                        if (j2xVar.f == null) {
                            j2xVar.f = myTeamFragment;
                        }
                    }
                    myTeamFragment.A.setList(arrayList);
                    ArrayList arrayList2 = h2xVar.a;
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj4 = arrayList2.get(i3);
                        i3++;
                        rww rwwVar = (rww) obj4;
                        if (rwwVar.g == null) {
                            rwwVar.g = myTeamFragment;
                        }
                    }
                    myTeamFragment.z.setList(arrayList2);
                    if (!TextUtils.equals(myTeamFragment.F, h2xVar.e)) {
                        ((LinearLayoutManager) myTeamFragment.y.getLayoutManager()).w1(0, 0);
                    }
                    myTeamFragment.F = h2xVar.e;
                    if (!h2xVar.g) {
                        myTeamFragment.D.a();
                        myTeamFragment.m0();
                    }
                } else if (!(hqcVar instanceof jqc)) {
                    boolean z = hqcVar instanceof lqc;
                    LoadingViewNew loadingViewNew = myTeamFragment.D;
                    if (z) {
                        loadingViewNew.d();
                    } else if (!(hqcVar instanceof kqc)) {
                        loadingViewNew.a();
                        myTeamFragment.m0();
                        zyf0.a(R.string.common_feedback__sorry_something_went_wrong);
                    } else {
                        loadingViewNew.a();
                        myTeamFragment.m0();
                        zyf0.a(R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you);
                    }
                } else {
                    myTeamFragment.D.a();
                    myTeamFragment.m0();
                }
                break;
        }
    }
}
