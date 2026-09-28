package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class ha5 {
    public final duw<nza.a> a = new duw<>(new nza.a[16]);

    public final void a(CancellationException cancellationException) {
        duw<nza.a> duwVar = this.a;
        int i = duwVar.c;
        zb6[] zb6VarArr = new zb6[i];
        for (int i2 = 0; i2 < i; i2++) {
            zb6VarArr[i2] = duwVar.a[i2].b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            zb6VarArr[i3].cancel(cancellationException);
        }
        if (duwVar.c == 0) {
            return;
        }
        zkn.c("uncancelled requests present");
    }

    public final void b() {
        duw<nza.a> duwVar = this.a;
        IntRange intRangeN = f.n(0, duwVar.c);
        int i = intRangeN.a;
        int i2 = intRangeN.b;
        if (i <= i2) {
            while (true) {
                bc6 bc6Var = duwVar.a[i].b;
                Unit unit = Unit.a;
                zi50.a aVar = zi50.b;
                bc6Var.resumeWith(unit);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        duwVar.g();
    }
}
