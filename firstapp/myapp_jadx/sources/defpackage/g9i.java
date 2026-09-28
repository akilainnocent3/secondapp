package defpackage;

import androidx.recyclerview.widget.r;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class g9i {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile esa0<f9i> b = new esa0<>(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.d(115, new h9i(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.d(130, new h9i(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.d(150, new h9i(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.d(180, new h9i(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.d(r.d.DEFAULT_DRAG_ANIMATION_DURATION, new h9i(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            Unit unit = Unit.a;
        }
        if ((b.c(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        ykn.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static f9i a(float f) {
        float fC;
        f9i f9iVarF;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        esa0<f9i> esa0Var = b;
        int i = (int) (f * 100.0f);
        esa0Var.getClass();
        f9i f9iVar = (f9i) fsa0.a(esa0Var, i);
        if (f9iVar != null) {
            return f9iVar;
        }
        esa0<f9i> esa0Var2 = b;
        if (esa0Var2.a) {
            fsa0.b(esa0Var2);
        }
        int iA = bza.a(esa0Var2.d, i, esa0Var2.b);
        if (iA >= 0) {
            return b.f(iA);
        }
        int i2 = -(iA + 1);
        int i3 = i2 - 1;
        if (i2 >= b.e()) {
            h9i h9iVar = new h9i(new float[]{1.0f}, new float[]{f});
            b(f, h9iVar);
            return h9iVar;
        }
        if (i3 < 0) {
            f9iVarF = new h9i(fArr, fArr);
            fC = 1.0f;
        } else {
            fC = b.c(i3) / 100.0f;
            f9iVarF = b.f(i3);
        }
        float fC2 = b.c(i2) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fC == fC2 ? 0.0f : (f - fC) / (fC2 - fC))) * 1.0f) + 0.0f;
        f9i f9iVarF2 = b.f(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            float fB = f9iVarF.b(f2);
            fArr2[i4] = ((f9iVarF2.b(f2) - fB) * fMax) + fB;
        }
        h9i h9iVar2 = new h9i(fArr, fArr2);
        b(f, h9iVar2);
        return h9iVar2;
    }

    public static void b(float f, h9i h9iVar) {
        synchronized (c) {
            esa0<f9i> esa0VarClone = b.clone();
            esa0VarClone.d((int) (f * 100.0f), h9iVar);
            b = esa0VarClone;
            Unit unit = Unit.a;
        }
    }
}
