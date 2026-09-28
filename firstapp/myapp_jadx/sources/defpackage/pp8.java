package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class pp8 {
    public static final int a(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final op8 b(int i, haj hajVar, a aVar) {
        Object objY = aVar.y();
        if (objY == a.C0041a.a) {
            objY = new op8(i, hajVar, true);
            aVar.r(objY);
        }
        op8 op8Var = (op8) objY;
        if (!Intrinsics.g(op8Var.c, hajVar)) {
            boolean z = op8Var.c == null;
            op8Var.c = hajVar;
            if (!z && op8Var.b) {
                oj40 oj40Var = op8Var.d;
                if (oj40Var != null) {
                    oj40Var.invalidate();
                    op8Var.d = null;
                }
                ArrayList arrayList = op8Var.e;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((oj40) arrayList.get(i2)).invalidate();
                    }
                    arrayList.clear();
                }
            }
        }
        return op8Var;
    }

    public static final boolean c(oj40 oj40Var, oj40 oj40Var2) {
        if (oj40Var == null) {
            return true;
        }
        if (!(oj40Var instanceof e) || !(oj40Var2 instanceof e)) {
            return false;
        }
        e eVar = (e) oj40Var;
        return !eVar.a() || oj40Var == oj40Var2 || Intrinsics.g(eVar.c, ((e) oj40Var2).c);
    }
}
