package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lm9j;", "Lj8i0;", "Ld9j;", "compose-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class m9j extends j8i0 implements d9j {
    public final /* synthetic */ d9j a;

    public m9j(d9j d9jVar) {
        d9jVar.getClass();
        this.a = d9jVar;
    }

    @Override // defpackage.d9j
    public final d L0(d dVar) {
        return this.a.L0(dVar);
    }

    @Override // defpackage.d9j
    public final d Q(String str, String str2) {
        str2.getClass();
        return this.a.Q(str, str2);
    }

    @Override // defpackage.d9j
    public final void k0(final String str, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-1364412183);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(this) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            this.a.k0(str, bVarI, i2 & 14);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: l9j
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
