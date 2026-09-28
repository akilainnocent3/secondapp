package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class kaf0 {
    public static final void a(final String str, final List list, final Function1 function1, final boolean z, d dVar, a aVar, final int i) {
        final d dVar2;
        str.getClass();
        list.getClass();
        function1.getClass();
        b bVarI = aVar.i(493109908);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(list) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.b(z) ? 2048 : 1024) | 24576;
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            String strA = cb40.a(R.string.common_functions__teams, new Object[0], bVarI);
            iaf0 iaf0Var = iaf0.b;
            jaf0 jaf0Var = jaf0.b;
            int i3 = i2 & 896;
            boolean z2 = ((i2 & 14) == 4) | (i3 == 256);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z2 || objY == c0042a) {
                objY = new Function1() { // from class: eaf0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        qz70 qz70Var = (qz70) obj;
                        qz70Var.getClass();
                        function1.invoke(new ot70.j(str, qz70Var.a, qz70Var.b));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            Function1 function2 = (Function1) objY;
            boolean z3 = i3 == 256;
            Object objY2 = bVarI.y();
            if (z3 || objY2 == c0042a) {
                objY2 = new Function0() { // from class: faf0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(new ot70.h(ny70.TEAM));
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            jzg.b(strA, R.drawable.ic_search_section_teams, list, iaf0Var, jaf0Var, function2, (Function0) objY2, z, new gaf0(), bVarI, ((i2 << 12) & 29360128) | ((i2 << 3) & 896) | 100663296, 0);
            dVar2 = d.a.b;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, list, function1, z, dVar2, i) { // from class: haf0
                public final /* synthetic */ String a;
                public final /* synthetic */ List b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ d e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    kaf0.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
