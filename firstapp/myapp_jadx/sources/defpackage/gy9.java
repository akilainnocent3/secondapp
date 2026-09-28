package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gy9 {
    public static final op8 a = new op8(-1900075098, new ey9(), false);
    public static final op8 b = new op8(-348882478, new fy9(), false);
    public static final /* synthetic */ int c = 0;

    public static final void a(zjw zjwVar, lc6 lc6Var, ya5 ya5Var, float f, ix80 ix80Var, yef0 yef0Var, wcf wcfVar) {
        lc6Var.p();
        ArrayList arrayList = zjwVar.h;
        if (arrayList.size() <= 1 || (ya5Var instanceof soa0)) {
            b(zjwVar, lc6Var, ya5Var, f, ix80Var, yef0Var, wcfVar);
        } else {
            if (!(ya5Var instanceof dx80)) {
                uhc.a();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float fD = 0.0f;
            for (int i = 0; i < size; i++) {
                jrz jrzVar = (jrz) arrayList.get(i);
                fD += jrzVar.a.d();
                fMax = Math.max(fMax, jrzVar.a.h());
            }
            Shader shaderB = ((dx80) ya5Var).b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fD)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                e90 e90Var = ((jrz) arrayList.get(i2)).a;
                e90Var.k(lc6Var, new za5(shaderB), f, ix80Var, yef0Var, wcfVar);
                lc6Var.e(0.0f, e90Var.d());
                matrix.setTranslate(0.0f, -e90Var.d());
                shaderB.setLocalMatrix(matrix);
            }
        }
        lc6Var.f();
    }

    public static final void b(zjw zjwVar, lc6 lc6Var, ya5 ya5Var, float f, ix80 ix80Var, yef0 yef0Var, wcf wcfVar) {
        ArrayList arrayList = zjwVar.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            jrz jrzVar = (jrz) arrayList.get(i);
            jrzVar.a.k(lc6Var, ya5Var, f, ix80Var, yef0Var, wcfVar);
            lc6Var.e(0.0f, jrzVar.a.d());
        }
    }
}
