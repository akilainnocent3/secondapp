package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class gwx implements d9j {
    @Override // defpackage.d9j
    public final d L0(d dVar) {
        return dVar;
    }

    @Override // defpackage.d9j
    public final d Q(String str, String str2) {
        str2.getClass();
        return d.a.b;
    }

    @Override // defpackage.d9j
    public final void k0(final String str, a aVar, final int i) {
        b bVarI = aVar.i(1307034148);
        int i2 = i & 1;
        if (!bVarI.q(i2, i2 != 0)) {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fwx
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    this.a.k0(str, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
