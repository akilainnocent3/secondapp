package androidx.compose.ui.platform;

import android.view.View;
import com.sportybet.android.gp.tz.R;
import defpackage.dhp;
import defpackage.hna;
import defpackage.jhp;
import defpackage.jnn;
import defpackage.op8;
import defpackage.pp8;
import defpackage.qlr;
import defpackage.xvf;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class h extends qlr implements Function2<androidx.compose.runtime.a, Integer, Unit> {
    public final /* synthetic */ i a;
    public final /* synthetic */ op8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, op8 op8Var) {
        super(2);
        this.a = iVar;
        this.b = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            i iVar = this.a;
            AndroidComposeView androidComposeView = iVar.a;
            Object tag = androidComposeView.getTag(R.id.inspection_slot_table_set);
            Set set = (!(tag instanceof Set) || ((tag instanceof dhp) && !(tag instanceof jhp))) ? null : (Set) tag;
            if (set == null) {
                Object parent = androidComposeView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof dhp) && !(tag2 instanceof jhp))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(aVar2.z());
                aVar2.u();
            }
            boolean zA = aVar2.A(iVar);
            Object objY = aVar2.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new e(iVar, null);
                aVar2.r(objY);
            }
            xvf.e(aVar2, androidComposeView, (Function2) objY);
            boolean zA2 = aVar2.A(iVar);
            Object objY2 = aVar2.y();
            if (zA2 || objY2 == c0042a) {
                objY2 = new f(iVar, null);
                aVar2.r(objY2);
            }
            xvf.e(aVar2, androidComposeView, (Function2) objY2);
            hna.a(jnn.a.a(set), pp8.b(-280240369, new g(iVar, this.b), aVar2), aVar2, 56);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
