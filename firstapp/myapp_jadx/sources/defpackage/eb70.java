package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class eb70 {

    public static final class a implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public a(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class b implements iaj<gwr, Integer, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ List a;
        public final /* synthetic */ Function1 b;
        public final /* synthetic */ Function0 c;

        public b(List list, Function1 function1, Function0 function0) {
            this.a = list;
            this.b = function1;
            this.c = function0;
        }

        @Override // defpackage.iaj
        public final Unit d(gwr gwrVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            gwr gwrVar2 = gwrVar;
            int iIntValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= aVar2.d(iIntValue) ? 32 : 16;
            }
            if (aVar2.q(i & 1, (i & 147) != 146)) {
                ua70 ua70Var = (ua70) this.a.get(iIntValue);
                aVar2.N(711898513);
                ta70.c(ua70Var, this.b, this.c, aVar2, 8);
                ty0.a(aVar2, j.i(d.a.b, 8.0f));
                aVar2.H();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final void a(final qcn<ua70> qcnVar, final boolean z, final Function1<? super String, Unit> function1, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVar;
        qcnVar.getClass();
        function1.getClass();
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-711192003);
        int i2 = (bVarI.A(qcnVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d dVarH = h.h(j.e(d.a.b, 1.0f), 12.0f, 0.0f, 2);
            boolean z2 = ((i2 & 14) == 4 || bVarI.A(qcnVar)) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objY = bVarI.y();
            if (z2 || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: cb70
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        szr szrVar = (szr) obj;
                        szrVar.getClass();
                        qcn qcnVar2 = qcnVar;
                        szrVar.d(qcnVar2.size(), null, new eb70.a(qcnVar2), new op8(802480018, new eb70.b(qcnVar2, function1, function0), true));
                        if (z) {
                            szr.h(szrVar, null, fo9.a, 3);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            bVar = bVarI;
            aur.a(dVarH, null, null, false, null, null, null, false, null, (Function1) objY, bVar, 6, 510);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: db70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    eb70.a(qcnVar, z, function1, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
