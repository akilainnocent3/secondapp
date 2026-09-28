package defpackage;

import androidx.compose.animation.a;
import androidx.compose.animation.d;
import androidx.compose.animation.f;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ngr implements Function1 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f0b f0bVarD;
        d dVar = (d) obj;
        dVar.getClass();
        final igr igrVar = ((hgr) dVar.a()).c;
        if (igrVar == igr.a) {
            f0bVarD = a.d(f.f(yi0.e(110, 0, null, 6), 2), f.g(yi0.e(110, 0, null, 6), 2));
        } else {
            f0bVarD = a.d(f.n(yi0.e(220, 0, null, 6), new Function1() { // from class: tgr
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    if (igrVar != igr.c) {
                        iIntValue = -iIntValue;
                    }
                    return Integer.valueOf(iIntValue);
                }
            }).b(f.f(yi0.e(220, 0, null, 6), 2)), f.r(yi0.e(220, 0, null, 6), new ugr(igrVar, 0)).b(f.g(yi0.e(220, 0, null, 6), 2)));
        }
        return dVar.b(f0bVarD, new jx90(true, new vgr()));
    }
}
