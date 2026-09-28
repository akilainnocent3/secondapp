package defpackage;

import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes8.dex */
public final class hgo {
    public static final /* synthetic */ int a = 0;

    public static final int a(pd80 pd80Var, pd80[] pd80VarArr) {
        pd80VarArr.getClass();
        int iHashCode = (pd80Var.h().hashCode() * 31) + Arrays.hashCode(pd80VarArr);
        int iD = pd80Var.d();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iD > 0)) {
                break;
            }
            int i2 = iD - 1;
            int i3 = i * 31;
            String strH = pd80Var.g(pd80Var.d() - iD).h();
            if (strH != null) {
                iHashCode2 = strH.hashCode();
            }
            i = i3 + iHashCode2;
            iD = i2;
        }
        int iD2 = pd80Var.d();
        int iHashCode3 = 1;
        while (true) {
            if (!(iD2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iD2 - 1;
            int i5 = iHashCode3 * 31;
            yd80 kind = pd80Var.g(pd80Var.d() - iD2).getKind();
            iHashCode3 = i5 + (kind != null ? kind.hashCode() : 0);
            iD2 = i4;
        }
    }

    public static final String b(final pd80 pd80Var) {
        return CollectionsKt.a0(f.n(0, pd80Var.d()), ", ", pd80Var.h() + '(', ")", new Function1() { // from class: lr10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iIntValue = ((Integer) obj).intValue();
                StringBuilder sb = new StringBuilder();
                pd80 pd80Var2 = pd80Var;
                sb.append(pd80Var2.e(iIntValue));
                sb.append(": ");
                sb.append(pd80Var2.g(iIntValue).h());
                return sb.toString();
            }
        }, 24);
    }
}
