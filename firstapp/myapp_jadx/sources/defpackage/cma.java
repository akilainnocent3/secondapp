package defpackage;

import androidx.compose.runtime.c;
import androidx.compose.runtime.e;
import androidx.compose.runtime.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cma implements Function2 {
    public final /* synthetic */ a350 a;
    public final /* synthetic */ h b;

    public /* synthetic */ cma(a350 a350Var, h hVar) {
        this.a = a350Var;
        this.b = hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        boolean z = obj2 instanceof uga;
        a350 a350Var = this.a;
        if (z) {
            a350Var.f.b((uga) obj2);
        } else {
            boolean z2 = obj2 instanceof k350;
            h hVar = this.b;
            if (z2) {
                k350 k350Var = (k350) obj2;
                if (!(k350Var.a instanceof oo50)) {
                    c.g(hVar, iIntValue, obj2);
                    a350Var.e(k350Var);
                }
            } else if (obj2 instanceof e) {
                c.g(hVar, iIntValue, obj2);
                ((e) obj2).c();
            }
        }
        return Unit.a;
    }
}
