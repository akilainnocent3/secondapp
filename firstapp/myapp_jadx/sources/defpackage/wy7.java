package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wy7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wy7(d dVar, int i) {
        this.a = 1;
        this.b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Pair pair;
        Function1 function1;
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                az7 az7Var = (az7) obj4;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                az7Var.u = cz7.c;
                az7Var.w.getClass();
                az7Var.w = new oy7(iIntValue, iIntValue2);
                boolean z = iIntValue == iIntValue2;
                ArrayList arrayList = az7Var.p;
                int size = arrayList.size();
                int i2 = 0;
                do {
                    if (i2 < size) {
                        obj3 = arrayList.get(i2);
                        i2++;
                    } else {
                        obj3 = null;
                    }
                    pair = (Pair) obj3;
                    if (pair != null && (function1 = (Function1) pair.b) != null) {
                        function1.invoke(Boolean.FALSE);
                    }
                    az7Var.a(true, false);
                    az7Var.b(false);
                    az7Var.m.invoke(Boolean.valueOf(!z));
                    lop.b(az7Var.b.a, Boolean.FALSE);
                    return Unit.a;
                } while (!jy7.b((iy7) ((Pair) obj3).a, az7Var.q));
                pair = (Pair) obj3;
                if (pair != null) {
                    function1.invoke(Boolean.FALSE);
                }
                az7Var.a(true, false);
                az7Var.b(false);
                az7Var.m.invoke(Boolean.valueOf(!z));
                lop.b(az7Var.b.a, Boolean.FALSE);
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                v9l.b((d) obj4, (a) obj, qj40.a(1));
                return Unit.a;
            default:
                return new iwo(((ht) obj4).a(0L, ((jxo) obj).a, (asr) obj2));
        }
    }

    public /* synthetic */ wy7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
