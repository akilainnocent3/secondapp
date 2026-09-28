package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rxo implements cvh0 {
    public static final rxo a = new rxo();
    public static final /* synthetic */ int b = 0;

    public static final void b(d dVar, Function1 function1, a aVar, int i) {
        int i2;
        b bVarI = aVar.i(-932836462);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        int i3 = 0;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            ty0.a(bVarI, androidx.compose.ui.draw.a.a(dVar, function1));
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new tc6(dVar, function1, i, i3);
        }
    }

    public static boolean c(String str) {
        str.getClass();
        if (str.length() == 18) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.cvh0
    public Object a(hep hepVar, float f) {
        return Integer.valueOf(Math.round(lfp.d(hepVar) * f));
    }
}
