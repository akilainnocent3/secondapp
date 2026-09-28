package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import kotlin.Unit;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class b5s {
    public final m80.a.b a;
    public final cmn b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public ijf0 j;
    public ukf0 k;
    public mly l;
    public lk40 m;
    public lk40 n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = ddv.a();
    public final Matrix q = new Matrix();

    public b5s(m80.a.b bVar, cmn cmnVar) {
        this.a = bVar;
        this.b = cmnVar;
    }

    public final void a() {
        cmn cmnVar = this.b;
        InputMethodManager inputMethodManagerA = cmnVar.a();
        View view = cmnVar.a;
        if (!inputMethodManagerA.isActive(view) || this.j == null || this.l == null || this.k == null || this.m == null || this.n == null) {
            return;
        }
        float[] fArr = this.p;
        ddv.d(fArr);
        urr urrVarQ = this.a.a.Q();
        if (urrVarQ != null) {
            if (!urrVarQ.e()) {
                urrVarQ = null;
            }
            if (urrVarQ != null) {
                urrVarQ.W(fArr);
            }
        }
        Unit unit = Unit.a;
        lk40 lk40Var = this.n;
        lk40Var.getClass();
        float f = -lk40Var.a;
        lk40 lk40Var2 = this.n;
        lk40Var2.getClass();
        ddv.h(fArr, f, -lk40Var2.b);
        Matrix matrix = this.q;
        t80.a(matrix, fArr);
        ijf0 ijf0Var = this.j;
        ijf0Var.getClass();
        long j = ijf0Var.b;
        mly mlyVar = this.l;
        mlyVar.getClass();
        ukf0 ukf0Var = this.k;
        ukf0Var.getClass();
        lk40 lk40Var3 = this.m;
        lk40Var3.getClass();
        lk40 lk40Var4 = this.n;
        lk40Var4.getClass();
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        boolean z4 = this.i;
        CursorAnchorInfo.Builder builder = this.o;
        builder.reset();
        builder.setMatrix(matrix);
        ulf0 ulf0Var = ijf0Var.c;
        int iF = ulf0.f(j);
        builder.setSelectionRange(iF, ulf0.e(j));
        if (z && iF >= 0) {
            int iB = mlyVar.b(iF);
            lk40 lk40VarC = ukf0Var.c(iB);
            float fD = f.d(lk40VarC.a, 0.0f, (int) (ukf0Var.c >> 32));
            boolean zA = a5s.a(lk40Var3, fD, lk40VarC.b);
            boolean zA2 = a5s.a(lk40Var3, fD, lk40VarC.d);
            boolean z5 = ukf0Var.a(iB) == lg50.b;
            int i = (zA || zA2) ? 1 : 0;
            if (!zA || !zA2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            int i2 = i;
            float f2 = lk40VarC.b;
            float f3 = lk40VarC.d;
            builder.setInsertionMarkerLocation(fD, f2, f3, f3, i2);
        }
        if (z2) {
            int iF2 = ulf0Var != null ? ulf0.f(ulf0Var.a) : -1;
            int iE = ulf0Var != null ? ulf0.e(ulf0Var.a) : -1;
            if (iF2 >= 0 && iF2 < iE) {
                builder.setComposingText(iF2, ijf0Var.a.b.subSequence(iF2, iE));
                int iB2 = mlyVar.b(iF2);
                int iB3 = mlyVar.b(iE);
                float[] fArr2 = new float[(iB3 - iB2) * 4];
                ukf0Var.b.a(fArr2, vlf0.a(iB2, iB3));
                int i3 = iF2;
                while (i3 < iE) {
                    int iB4 = mlyVar.b(i3);
                    int i4 = (iB4 - iB2) * 4;
                    float f4 = fArr2[i4];
                    int i5 = iE;
                    float f5 = fArr2[i4 + 1];
                    int i6 = iB2;
                    float f6 = fArr2[i4 + 2];
                    float f7 = fArr2[i4 + 3];
                    int i7 = i3;
                    int i8 = (lk40Var3.a < f6 ? 1 : 0) & (f4 < lk40Var3.c ? 1 : 0) & (lk40Var3.b < f7 ? 1 : 0) & (f5 < lk40Var3.d ? 1 : 0);
                    if (!a5s.a(lk40Var3, f4, f5) || !a5s.a(lk40Var3, f6, f7)) {
                        i8 |= 2;
                    }
                    if (ukf0Var.a(iB4) == lg50.b) {
                        i8 |= 4;
                    }
                    builder.addCharacterBounds(i7, f4, f5, f6, f7, i8);
                    i3 = i7 + 1;
                    iE = i5;
                    iB2 = i6;
                }
            }
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33 && z3) {
            g5c.a(builder, lk40Var4);
        }
        if (i9 >= 34 && z4) {
            i5c.a(builder, ukf0Var, lk40Var3);
        }
        cmnVar.a().updateCursorAnchorInfo(view, builder.build());
        this.e = false;
    }
}
