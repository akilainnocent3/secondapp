package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
@fae
public final class m5c {
    public final AndroidComposeView a;
    public final bmn b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public ijf0 j;
    public ukf0 k;
    public mly l;
    public lk40 n;
    public lk40 o;
    public final Object c = new Object();
    public Function1<? super ddv, Unit> m = l5c.a;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = ddv.a();
    public final Matrix r = new Matrix();

    public m5c(AndroidComposeView androidComposeView, bmn bmnVar) {
        this.a = androidComposeView;
        this.b = bmnVar;
    }

    public final void a() {
        bmn bmnVar = this.b;
        ttr ttrVar = bmnVar.b;
        InputMethodManager inputMethodManager = (InputMethodManager) ttrVar.getValue();
        View view = bmnVar.a;
        if (inputMethodManager.isActive(view)) {
            Function1<? super ddv, Unit> function1 = this.m;
            float[] fArr = this.q;
            function1.invoke(new ddv(fArr));
            this.a.i(fArr);
            Matrix matrix = this.r;
            t80.a(matrix, fArr);
            ijf0 ijf0Var = this.j;
            ijf0Var.getClass();
            long j = ijf0Var.b;
            mly mlyVar = this.l;
            mlyVar.getClass();
            ukf0 ukf0Var = this.k;
            ukf0Var.getClass();
            lk40 lk40Var = this.n;
            lk40Var.getClass();
            lk40 lk40Var2 = this.o;
            lk40Var2.getClass();
            boolean z = this.f;
            boolean z2 = this.g;
            boolean z3 = this.h;
            boolean z4 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
            builder.reset();
            builder.setMatrix(matrix);
            ulf0 ulf0Var = ijf0Var.c;
            int iF = ulf0.f(j);
            builder.setSelectionRange(iF, ulf0.e(j));
            if (z && iF >= 0) {
                int iB = mlyVar.b(iF);
                lk40 lk40VarC = ukf0Var.c(iB);
                float fD = f.d(lk40VarC.a, 0.0f, (int) (ukf0Var.c >> 32));
                boolean zA = j5c.a(lk40Var, fD, lk40VarC.b);
                boolean zA2 = j5c.a(lk40Var, fD, lk40VarC.d);
                boolean z5 = ukf0Var.a(iB) == lg50.b;
                int i = (zA || zA2) ? 1 : 0;
                if (!zA || !zA2) {
                    i |= 2;
                }
                if (z5) {
                    i |= 4;
                }
                int i2 = i;
                float f = lk40VarC.b;
                float f2 = lk40VarC.d;
                builder.setInsertionMarkerLocation(fD, f, f2, f2, i2);
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
                        float f3 = fArr2[i4];
                        int i5 = iE;
                        float f4 = fArr2[i4 + 1];
                        int i6 = iB2;
                        float f5 = fArr2[i4 + 2];
                        float f6 = fArr2[i4 + 3];
                        int i7 = i3;
                        int i8 = (lk40Var.a < f5 ? 1 : 0) & (f3 < lk40Var.c ? 1 : 0) & (lk40Var.b < f6 ? 1 : 0) & (f4 < lk40Var.d ? 1 : 0);
                        if (!j5c.a(lk40Var, f3, f4) || !j5c.a(lk40Var, f5, f6)) {
                            i8 |= 2;
                        }
                        if (ukf0Var.a(iB4) == lg50.b) {
                            i8 |= 4;
                        }
                        builder.addCharacterBounds(i7, f3, f4, f5, f6, i8);
                        i3 = i7 + 1;
                        iE = i5;
                        iB2 = i6;
                    }
                }
            }
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 33 && z3) {
                f5c.a(builder, lk40Var2);
            }
            if (i9 >= 34 && z4) {
                h5c.a(builder, ukf0Var, lk40Var);
            }
            ((InputMethodManager) ttrVar.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.e = false;
        }
    }
}
