package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.book.domain.entity.Category;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.user.verifiedinfo.VerifiedInfoActivity;
import com.sportybet.android.widget.LoadingView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c3x implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c3x(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                bw50 bw50Var = (bw50) obj2;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1(bw50Var.a);
                bw50Var.b.invoke(hq60VarH1);
                try {
                    int iB = l0b.b(hq60VarH1, AnalyticsParam.EVENT_PARAM_ID);
                    int iB2 = l0b.b(hq60VarH1, "cursor");
                    int iB3 = l0b.b(hq60VarH1, Category.CATEGORY_ID);
                    int iB4 = l0b.b(hq60VarH1, "sendTime");
                    int iB5 = l0b.b(hq60VarH1, "title");
                    int iB6 = l0b.b(hq60VarH1, "content");
                    int iB7 = l0b.b(hq60VarH1, "bannerImageUrl");
                    int iB8 = l0b.b(hq60VarH1, "buttonText");
                    int iB9 = l0b.b(hq60VarH1, "buttonLink");
                    ArrayList arrayList = new ArrayList();
                    while (hq60VarH1.D1()) {
                        arrayList.add(new h3x((int) hq60VarH1.getLong(iB), hq60VarH1.k1(iB2), (int) hq60VarH1.getLong(iB3), hq60VarH1.k1(iB4), hq60VarH1.k1(iB5), hq60VarH1.k1(iB6), hq60VarH1.k1(iB7), hq60VarH1.k1(iB8), hq60VarH1.k1(iB9)));
                    }
                    hq60VarH1.close();
                    return arrayList;
                } catch (Throwable th) {
                    hq60VarH1.close();
                    throw th;
                }
            default:
                qxh0 qxh0Var = (qxh0) obj2;
                lk50 lk50Var = (lk50) obj;
                int i2 = VerifiedInfoActivity.d;
                LoadingView loadingView = qxh0Var.f;
                RecyclerView recyclerView = qxh0Var.i;
                loadingView.E();
                if (lk50Var instanceof lk50.c) {
                    List list = (List) ((lk50.c) lk50Var).a;
                    if (list.isEmpty()) {
                        qxh0Var.c.setVisibility(0);
                    } else {
                        RecyclerView.f adapter = recyclerView.getAdapter();
                        sxh0 sxh0Var = (sxh0) (adapter instanceof sxh0 ? adapter : null);
                        if (sxh0Var != null) {
                            sxh0Var.i(list);
                        }
                        recyclerView.setVisibility(0);
                    }
                } else if (lk50Var instanceof lk50.a) {
                    loadingView.I();
                } else {
                    if (!Intrinsics.g(lk50Var, lk50.b.a)) {
                        uhc.a();
                        return null;
                    }
                    loadingView.K();
                }
                return Unit.a;
        }
    }
}
