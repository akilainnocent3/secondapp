package defpackage;

import androidx.emoji2.text.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fib implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iOffsetByCodePoints;
        switch (this.a) {
            case 0:
                ((Integer) obj).getClass();
                return Unit.a;
            default:
                nhf0 nhf0Var = (nhf0) obj;
                String str = nhf0Var.g.b;
                long j = nhf0Var.f;
                int i = ulf0.c;
                int i2 = (int) (j & 4294967295L);
                if (i2 > 0) {
                    d dVarD = j020.d();
                    if (dVarD != null) {
                        int iB = dVarD.b(i2 - 1, str);
                        if (iB >= 0) {
                            iOffsetByCodePoints = iB;
                        } else if (i2 <= 0) {
                            iOffsetByCodePoints = -1;
                        } else {
                            iOffsetByCodePoints = Character.offsetByCodePoints(str, i2, -1);
                        }
                    } else if (i2 <= 0) {
                        iOffsetByCodePoints = -1;
                    } else {
                        iOffsetByCodePoints = Character.offsetByCodePoints(str, i2, -1);
                    }
                } else {
                    iOffsetByCodePoints = -1;
                }
                if (iOffsetByCodePoints == -1) {
                    return null;
                }
                return new dmd(((int) (nhf0Var.f & 4294967295L)) - iOffsetByCodePoints, 0);
        }
    }
}
