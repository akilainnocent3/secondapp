package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class y4n {
    public static final void a(final d dVar, final f3n f3nVar, final Function1 function1, final Function1 function2, a aVar, final int i) {
        boolean z;
        f3n.h hVar = f3nVar.h;
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(591336055);
        int i2 = i | (bVarI.A(f3nVar) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zM = bVarI.M(hVar.b);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                qcn<a4n> qcnVar = hVar.b;
                ArrayList arrayList = new ArrayList();
                for (a4n a4nVar : qcnVar) {
                    if (a4nVar instanceof a4n.b) {
                        arrayList.add(a4nVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    z = true;
                    break;
                }
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        z = true;
                        break;
                    }
                    Object obj = arrayList.get(i3);
                    i3++;
                    if (!((a4n.b) obj).h) {
                        z = false;
                        break;
                    }
                }
                objY = Boolean.valueOf(z);
                bVarI.r(objY);
            }
            final boolean zBooleanValue = ((Boolean) objY).booleanValue();
            boolean zB = ((i2 & 112) == 32 || bVarI.A(f3nVar)) | bVarI.b(zBooleanValue) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objY2 = bVarI.y();
            if (zB || objY2 == c0042a) {
                objY2 = new Function1() { // from class: t4n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        szr szrVar = (szr) obj2;
                        szrVar.getClass();
                        f3n f3nVar2 = f3nVar;
                        qcn<a4n> qcnVar2 = f3nVar2.h.b;
                        szrVar.d(qcnVar2.size(), null, new w4n(qcnVar2), new op8(2039820996, new x4n(qcnVar2, zBooleanValue, function2, f3nVar2, function1), true));
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            aur.a(dVar, null, null, false, null, null, null, false, null, (Function1) objY2, bVarI, 6, 510);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f3nVar, function1, function2, i) { // from class: u4n
                public final /* synthetic */ f3n b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(71);
                    y4n.a(this.a, this.b, this.c, this.d, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }
}
