package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.google.protobuf.Reader;
import java.io.FileNotFoundException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class r8u {
    public static final void a(final d dVar, final k9u k9uVar, final Function1 function1, a aVar, final int i) throws FileNotFoundException {
        int i2;
        b bVar;
        fmt fmtVar;
        k9uVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(939273823);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.d(k9uVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            ont ontVarC = i350.c(new pnt.a("wheel_lights_random.json"), bVarI, 6);
            ont ontVarC2 = i350.c(new pnt.a("wheel_lights_on.json"), bVarI, 6);
            ont ontVarC3 = i350.c(new pnt.a("wheel_lights_circle_around.json"), bVarI, 6);
            fmt fmtVarA = lmt.a(bVarI);
            Object[] objArr = {k9uVar, ontVarC.getValue(), ontVarC2.getValue(), ontVarC3.getValue()};
            boolean zM = ((i3 & 112) == 32) | bVarI.M(ontVarC) | bVarI.M(fmtVarA) | bVarI.M(ontVarC2) | ((i3 & 896) == 256) | bVarI.M(ontVarC3);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                fmtVar = fmtVarA;
                q8u q8uVar = new q8u(k9uVar, function1, fmtVar, ontVarC, ontVarC2, ontVarC3, null);
                bVarI.r(q8uVar);
                objY = q8uVar;
            } else {
                fmtVar = fmtVarA;
            }
            xvf.h(objArr, (Function2) objY, bVarI);
            xmt xmtVarE = fmtVar.E();
            boolean zM2 = bVarI.M(fmtVar);
            Object objY2 = bVarI.y();
            if (zM2 || objY2 == c0042a) {
                objY2 = new dbb(fmtVar, 1);
                bVarI.r(objY2);
            }
            bVar = bVarI;
            mmt.b(xmtVarE, (Function0) objY2, dVar, false, false, false, false, null, false, null, null, null, false, false, null, null, false, bVar, (i3 << 6) & 896, 0, 131064);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: p8u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws FileNotFoundException {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    r8u.a(dVar, k9uVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final Object b(ont ontVar, fmt fmtVar, q8u q8uVar) {
        Object objA;
        xmt value = ontVar.getValue();
        return (value == null || (objA = fmt.a.a(fmtVar, value, Reader.READ_DONE, false, 0.0f, null, 0.0f, q8uVar, 1914)) != y5b.a) ? Unit.a : objA;
    }
}
