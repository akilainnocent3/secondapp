package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class pw20 {
    public int a;
    public y01[] b;

    public final void a(y01 y01Var, int i) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            y01 y01Var2 = this.b[i2];
            y01Var2.getClass();
            if (Intrinsics.i(0L, y01Var.getTimeoutAt() - y01Var2.getTimeoutAt()) <= 0) {
                break;
            }
            y01Var2.index = i;
            this.b[i] = y01Var2;
            i = i2;
        }
        this.b[i] = y01Var;
        y01Var.index = i;
    }

    public final void b(y01 y01Var) {
        y01 y01Var2;
        int i = y01Var.index;
        if (i == -1) {
            hb5.a("Failed requirement.");
            return;
        }
        int i2 = this.a;
        y01 y01Var3 = this.b[i2];
        y01Var3.getClass();
        y01Var.index = -1;
        this.b[i2] = null;
        this.a = i2 - 1;
        if (y01Var == y01Var3) {
            return;
        }
        int i3 = Intrinsics.i(0L, y01Var3.getTimeoutAt() - y01Var.getTimeoutAt());
        if (i3 == 0) {
            this.b[i] = y01Var3;
            y01Var3.index = i;
            return;
        }
        if (i3 >= 0) {
            a(y01Var3, i);
            return;
        }
        while (true) {
            int i4 = i << 1;
            int i5 = i4 + 1;
            int i6 = this.a;
            if (i5 > i6) {
                if (i4 > i6) {
                    break;
                }
                y01Var2 = this.b[i4];
                y01Var2.getClass();
            } else {
                y01Var2 = this.b[i4];
                y01Var2.getClass();
                y01 y01Var4 = this.b[i5];
                y01Var4.getClass();
                if (Intrinsics.i(0L, y01Var4.getTimeoutAt() - y01Var2.getTimeoutAt()) >= 0) {
                    y01Var2 = y01Var4;
                }
            }
            if (Intrinsics.i(0L, y01Var2.getTimeoutAt() - y01Var3.getTimeoutAt()) <= 0) {
                break;
            }
            int i7 = y01Var2.index;
            y01Var2.index = i;
            this.b[i] = y01Var2;
            i = i7;
        }
        this.b[i] = y01Var3;
        y01Var3.index = i;
    }
}
