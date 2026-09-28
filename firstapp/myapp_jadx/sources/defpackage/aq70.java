package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class aq70 extends RecyclerView.s {
    public final Function0<LinearLayoutManager> a;
    public final Function1<String, Unit> b;
    public final List<Integer> c = b.k(25, 50, 75, 100);
    public final LinkedHashSet d = new LinkedHashSet();

    /* JADX WARN: Multi-variable type inference failed */
    public aq70(Function0<? extends LinearLayoutManager> function0, Function1<? super String, Unit> function1) {
        this.a = function0;
        this.b = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void b(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManagerInvoke = this.a.invoke();
        int iA = linearLayoutManagerInvoke.a();
        if (iA == 0) {
            return;
        }
        int iC1 = linearLayoutManagerInvoke.c1();
        int iG1 = linearLayoutManagerInvoke.g1();
        if (iC1 == -1 || iG1 == -1) {
            return;
        }
        if (i2 > 0) {
            iC1 = iG1;
        }
        int i3 = ((iC1 + 1) * 100) / iA;
        Iterator<Integer> it = this.c.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            String str = AnalyticsParam.REACH_25;
            Function1<String, Unit> function1 = this.b;
            LinkedHashSet linkedHashSet = this.d;
            if (i3 >= iIntValue && !linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                linkedHashSet.add(Integer.valueOf(iIntValue));
                if (iIntValue != 25) {
                    if (iIntValue != 50) {
                        str = iIntValue != 75 ? AnalyticsParam.REACH_BOTTOM : AnalyticsParam.REACH_75;
                    } else {
                        str = AnalyticsParam.REACH_50;
                    }
                }
                function1.invoke(str);
            } else if (i3 < iIntValue && linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                linkedHashSet.remove(Integer.valueOf(iIntValue));
                if (iIntValue != 100) {
                    if (iIntValue != 25) {
                        if (iIntValue != 50) {
                            str = iIntValue != 75 ? AnalyticsParam.REACH_BOTTOM : AnalyticsParam.REACH_75;
                        } else {
                            str = AnalyticsParam.REACH_50;
                        }
                    }
                    function1.invoke(str);
                }
            }
        }
    }
}
