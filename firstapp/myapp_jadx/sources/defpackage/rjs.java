package defpackage;

import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.myfavorite.fragment.MyTeamSearchFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rjs implements lfy {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rjs(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.lfy
    public final void u1(Object obj) {
        HashMap map;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                xjs xjsVar = (xjs) obj2;
                final xjs.a aVar = (xjs.a) obj;
                synchronized (xjsVar.b) {
                    map = new HashMap(xjsVar.b);
                    break;
                }
                for (final Map.Entry entry : map.entrySet()) {
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: sjs
                        @Override // java.lang.Runnable
                        public final void run() {
                            tcy.a aVar2 = (tcy.a) entry.getKey();
                            xjs.a aVar3 = aVar;
                            aVar3.getClass();
                            aVar2.a(aVar3.a);
                        }
                    });
                }
                return;
            default:
                MyTeamSearchFragment myTeamSearchFragment = (MyTeamSearchFragment) obj2;
                hqc hqcVar = (hqc) obj;
                if (hqcVar instanceof nqc) {
                    myTeamSearchFragment.C.a();
                    View view = myTeamSearchFragment.getView();
                    if (myTeamSearchFragment.D == null || view == null) {
                        return;
                    }
                    lop.b(view, Boolean.FALSE);
                    myTeamSearchFragment.D.Z();
                    return;
                }
                if (hqcVar instanceof kqc) {
                    myTeamSearchFragment.C.a();
                    List<rww> data = myTeamSearchFragment.A.getData();
                    data.clear();
                    myTeamSearchFragment.A.setList(data);
                    zyf0.a(R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you);
                    return;
                }
                if (hqcVar instanceof jqc) {
                    myTeamSearchFragment.C.a();
                    return;
                } else {
                    if (hqcVar instanceof lqc) {
                        myTeamSearchFragment.C.d();
                        return;
                    }
                    return;
                }
        }
    }
}
