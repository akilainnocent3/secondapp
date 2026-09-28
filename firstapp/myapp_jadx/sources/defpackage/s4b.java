package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s4b implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s4b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        boolean z = true;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                t4b t4bVar = (t4b) obj4;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    iIntValue = t4bVar.L.a(iIntValue);
                }
                if (!zBooleanValue) {
                    iIntValue2 = t4bVar.L.a(iIntValue2);
                }
                if (t4bVar.J) {
                    long j = t4bVar.G.b;
                    int i2 = ulf0.c;
                    if (iIntValue == ((int) (j >> 32)) && iIntValue2 == ((int) (j & 4294967295L))) {
                        z = false;
                    } else if (Math.min(iIntValue, iIntValue2) < 0 || Math.max(iIntValue, iIntValue2) > t4bVar.G.a.b.length()) {
                        iif0 iif0Var = t4bVar.M;
                        iif0Var.t(false);
                        iif0Var.q(ocl.a);
                        z = false;
                    } else {
                        if (zBooleanValue || iIntValue == iIntValue2) {
                            iif0 iif0Var2 = t4bVar.M;
                            iif0Var2.t(false);
                            iif0Var2.q(ocl.a);
                        } else {
                            t4bVar.M.e(true);
                        }
                        t4bVar.H.v.invoke(new ijf0(t4bVar.G.a, vlf0.a(iIntValue, iIntValue2), (ulf0) null));
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                op8 op8Var = (op8) obj4;
                a aVar = (a) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if (aVar.q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    op8Var.invoke(aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }
}
