package androidx.compose.material3.internal;

import androidx.compose.ui.d;
import defpackage.c20;
import defpackage.i10;
import defpackage.i3z;
import defpackage.ib5;
import defpackage.k10;
import defpackage.q00;
import defpackage.uj50;
import defpackage.w5b;
import defpackage.x1b;
import defpackage.y5b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final d a(d dVar, c20 c20Var, Function2 function2) {
        i3z i3zVar = i3z.a;
        return dVar.n(new DraggableAnchorsElement(c20Var, function2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(Function0 function0, Function2 function2, x1b x1bVar) {
        i10 i10Var;
        if (x1bVar instanceof i10) {
            i10Var = (i10) x1bVar;
            int i = i10Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                i10Var.b = i - Integer.MIN_VALUE;
            } else {
                i10Var = new i10(x1bVar);
            }
        } else {
            i10Var = new i10(x1bVar);
        }
        Object obj = i10Var.a;
        y5b y5bVar = y5b.a;
        int i2 = i10Var.b;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                k10 k10Var = new k10(function0, function2, null);
                i10Var.b = 1;
                if (w5b.d(k10Var, i10Var) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
        } catch (q00 unused) {
        }
        return Unit.a;
    }
}
