package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportygames.newcms.c;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class dwg implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dwg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                zi40 zi40Var = (zi40) obj4;
                e160 e160Var = (e160) obj;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                e160Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= aVar.M(e160Var) ? 4 : 2;
                }
                if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    lkf0.b(c.d(zi40Var.l(), "Stay", aVar), h.h(e160Var.b(d.a.b, ht.a.k), 0.0f, 8.0f, 1), j58.f, d2l.f(18), null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, aVar, 200064, 0, 131024);
                } else {
                    aVar.G();
                }
                break;
            default:
                List list = (List) obj;
                ((Integer) obj3).getClass();
                list.getClass();
                i2f0.a.c(j.i(i2f0.d((z1f0) list.get(((osw) obj4).D())), 1.5f), 0.0f, b6g0.a, (a) obj2, 384, 2);
                break;
        }
        return Unit.a;
    }
}
