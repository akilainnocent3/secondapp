package defpackage;

import com.sportygames.vip.data.EliteTopWinsThisWeekItem;
import com.sportygames.vip.data.UserTopCoeffResponse;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luqb0;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class uqb0 extends j8i0 {
    public final wwd0 a;
    public final wwd0 b;

    public uqb0() {
        wwd0 wwd0VarA = xwd0.a(new xqb0(0));
        this.a = wwd0VarA;
        this.b = wwd0VarA;
    }

    public final void x1(List list, boolean z) {
        list.getClass();
        wwd0 wwd0Var = this.a;
        xqb0 xqb0Var = (xqb0) wwd0Var.getValue();
        xqb0 xqb0Var2 = new xqb0(wqb0.a, z && !list.isEmpty() ? new vqb0.a(list) : vqb0.b.a, xqb0Var.c);
        wwd0Var.getClass();
        wwd0Var.k(null, xqb0Var2);
    }

    public final void y1(Integer num) {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, xqb0.a((xqb0) value, null, null, num, 3)));
    }

    public final void z1(UserTopCoeffResponse userTopCoeffResponse, List<EliteTopWinsThisWeekItem> list) {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, xqb0.a((xqb0) value, wqb0.d, new vqb0.c(userTopCoeffResponse, list), null, 4)));
    }
}
