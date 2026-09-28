package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ood extends ViewPager2.g {
    public final /* synthetic */ nod a;

    public ood(nod nodVar) {
        this.a = nodVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void c(int i) {
        List<y200> list;
        y200 y200Var;
        ohp<Object>[] ohpVarArr = nod.d;
        nod nodVar = this.a;
        z200 z200Var = (z200) nodVar.m0().e.getValue();
        if (z200Var == null || (list = z200Var.a) == null || (y200Var = list.get(i)) == null) {
            return;
        }
        wwd0 wwd0Var = nodVar.m0().f;
        wwd0Var.getClass();
        wwd0Var.k(null, y200Var);
    }
}
