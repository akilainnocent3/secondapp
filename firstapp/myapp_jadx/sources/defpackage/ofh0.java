package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ofh0 {
    public static final void a(final d dVar, final qcn qcnVar, final Function1 function1, a aVar, final int i) {
        b bVarI = aVar.i(-1074877240);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.M(qcnVar) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new l0s(1, qcnVar, function1);
                bVarI.r(objY);
            }
            aur.a(dVar, null, null, false, null, null, null, false, null, (Function1) objY, bVarI, i2 & 14, 510);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(qcnVar, function1, i) { // from class: jfh0
                public final /* synthetic */ qcn b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ofh0.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final int i, final qcn qcnVar, a aVar, final Function0 function0, final Function1 function1) {
        b bVar;
        qcnVar.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1564005513);
        int i2 = (bVarI.M(qcnVar) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            dnn dnnVarC = r8j0.c(q8j0.a.a(bVarI).k, bVarI);
            final float f = ((mla.f((int) (((a8j0) bVarI.O(kna.t)).a() & 4294967295L), bVarI) - dnnVarC.d()) - dnnVarC.a()) * 0.5f;
            bVar = bVarI;
            v1w.a(function0, v8j0.b(g3w.c(d.a.b)), v1w.g(true, null, bVarI, 6, 2), 0.0f, false, zk40.a, ((lib0) bVarI.O(oib0.a)).i0, 0L, 0L, null, null, null, pp8.b(-1115889323, new gaj() { // from class: hfh0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        ofh0.a(j.k(d.a.b, 0.0f, f, 1), qcnVar, function1, aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, ((i2 >> 3) & 14) | 196608, 3078, 7064);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, qcnVar, function0, function1) { // from class: ifh0
                public final /* synthetic */ qcn a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function1 c;

                {
                    this.a = qcnVar;
                    this.b = function0;
                    this.c = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ofh0.b(qj40.a(1), this.a, (a) obj, this.b, this.c);
                    return Unit.a;
                }
            };
        }
    }
}
