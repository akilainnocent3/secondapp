package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class kof0 {
    public static final void a(final int i, final op8 op8Var, a aVar, final boolean z) {
        b bVarI = aVar.i(787794543);
        int i2 = i | 2;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                z = doc.a(bVarI);
            } else {
                bVarI.G();
            }
            bVarI.Y();
            hna.a(sh60.a.a(z ? p58.g : p58.h), pp8.b(-60891345, new Function2() { // from class: hof0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d68 d68Var = (d68) aVar2.O(g68.a);
                        eah0 eah0Var = li60.a;
                        imf0 imf0Var = eah0Var.a;
                        t9i t9iVar = t9i.E;
                        long jB = ash0.b(R.dimen._15ssp, 48, aVar2);
                        long j = omf0.c;
                        imf0 imf0VarB = imf0.b(imf0Var, 0L, jB, t9iVar, null, null, 0L, null, null, null, 0, j, null, null, 16646137);
                        imf0 imf0VarB2 = imf0.b(eah0Var.b, 0L, ash0.b(R.dimen._11ssp, 48, aVar2), t9i.C, null, null, 0L, null, null, null, 0, j, null, null, 16646137);
                        imf0 imf0VarB3 = imf0.b(eah0Var.c, 0L, ash0.b(R.dimen._7ssp, 48, aVar2), null, null, null, 0L, null, null, null, 0, j, null, null, 16646141);
                        imf0 imf0Var2 = eah0Var.d;
                        t9i t9iVar2 = t9i.G;
                        scv.b(d68Var, null, new eah0(imf0VarB, imf0VarB2, imf0VarB3, imf0.b(imf0Var2, 0L, ash0.b(R.dimen._15ssp, 48, aVar2), t9iVar2, null, null, 0L, null, null, null, 0, j, null, null, 16646137), eah0Var.f, imf0.b(eah0Var.g, 0L, ash0.b(R.dimen._15ssp, 48, aVar2), t9iVar2, null, null, 0L, null, null, null, 0, j, null, null, 16646137), imf0.b(eah0Var.h, 0L, ash0.b(R.dimen._13ssp, 48, aVar2), t9iVar, null, null, 0L, null, null, null, 0, j, null, null, 16646137), 32528), op8Var, aVar2, 0, 2);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 56);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, op8Var, z) { // from class: jof0
                public final /* synthetic */ boolean a;
                public final /* synthetic */ op8 b;

                {
                    this.a = z;
                    this.b = op8Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kof0.a(qj40.a(49), this.b, (a) obj, this.a);
                    return Unit.a;
                }
            };
        }
    }
}
