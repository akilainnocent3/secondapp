package defpackage;

import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class o0a0 implements Function1<cmp, Boolean> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Function1<Float, Unit> b;
    public final /* synthetic */ ht7<Float> c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Function0<Unit> i;

    public o0a0(boolean z, Function1 function1, gt7 gt7Var, int i, boolean z2, float f, Function0 function0) {
        this.a = z;
        this.b = function1;
        this.c = gt7Var;
        this.d = i;
        this.e = z2;
        this.f = f;
        this.i = function0;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(cmp cmpVar) {
        KeyEvent keyEvent = cmpVar.a;
        if (!this.a) {
            return Boolean.FALSE;
        }
        Function1<Float, Unit> function1 = this.b;
        if (function1 == 0) {
            return Boolean.FALSE;
        }
        int iB = emp.b(keyEvent);
        boolean z = false;
        if (iB == 2) {
            ht7<Float> ht7Var = this.c;
            float fAbs = Math.abs(ht7Var.d().floatValue() - ht7Var.getStart().floatValue());
            int i = this.d;
            int i2 = i > 0 ? i + 1 : 100;
            float f = fAbs / i2;
            int i3 = this.e ? -1 : 1;
            long jB = qnp.b(keyEvent.getKeyCode());
            boolean zA = olp.a(jB, olp.d);
            float f2 = this.f;
            if (zA) {
                function1.invoke((Float) f.h(Float.valueOf((i3 * f) + f2), ht7Var));
            } else if (olp.a(jB, olp.e)) {
                function1.invoke((Float) f.h(Float.valueOf(f2 - (i3 * f)), ht7Var));
            } else if (olp.a(jB, olp.g)) {
                function1.invoke((Float) f.h(Float.valueOf((i3 * f) + f2), ht7Var));
            } else if (olp.a(jB, olp.f)) {
                function1.invoke((Float) f.h(Float.valueOf(f2 - (i3 * f)), ht7Var));
            } else if (olp.a(jB, olp.m)) {
                function1.invoke(ht7Var.getStart());
            } else if (olp.a(jB, olp.n)) {
                function1.invoke(ht7Var.d());
            } else if (olp.a(jB, olp.o)) {
                function1.invoke((Float) f.h(Float.valueOf(f2 - (f.e(i2 / 10, 1, 10) * f)), ht7Var));
            } else if (olp.a(jB, olp.p)) {
                function1.invoke((Float) f.h(Float.valueOf((f.e(i2 / 10, 1, 10) * f) + f2), ht7Var));
            }
            z = true;
        } else if (iB == 1) {
            long jB2 = qnp.b(keyEvent.getKeyCode());
            if (olp.a(jB2, olp.d) || olp.a(jB2, olp.e) || olp.a(jB2, olp.g) || olp.a(jB2, olp.f) || olp.a(jB2, olp.m) || olp.a(jB2, olp.n) || olp.a(jB2, olp.o) || olp.a(jB2, olp.p)) {
                Function0<Unit> function0 = this.i;
                if (function0 != null) {
                    function0.invoke();
                }
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
