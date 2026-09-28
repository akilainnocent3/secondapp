package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class w9u {
    public static final void a(Function0<Unit> function0, Function0<Unit> function1, a aVar, int i) {
        Function0<Unit> function2;
        b bVarA = v2g.a(function0, function1, aVar, -596730244);
        int i2 = (bVarA.A(function0) ? 4 : 2) | i | (bVarA.A(function1) ? 32 : 16);
        if (bVarA.q(i2 & 1, (i2 & 19) != 18)) {
            function2 = function1;
            u60.a(function2, null, pp8.b(-1004001517, new ia2(function0, function1), bVarA), bVarA, ((i2 >> 3) & 14) | 384, 2);
        } else {
            function2 = function1;
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new ja2(i, function0, function2);
        }
    }
}
