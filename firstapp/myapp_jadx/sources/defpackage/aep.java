package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class aep {
    public Object[] a;
    public int[] b;
    public int c;

    public static final class a {
        public static final a a = new a();
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.c + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.a[i2];
            if (obj instanceof pd80) {
                pd80 pd80Var = (pd80) obj;
                boolean zG = Intrinsics.g(pd80Var.getKind(), ebe0.b.a);
                int[] iArr = this.b;
                if (!zG) {
                    int i3 = iArr[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(pd80Var.e(i3));
                    }
                } else if (iArr[i2] != -1) {
                    sb.append("[");
                    sb.append(this.b[i2]);
                    sb.append("]");
                }
            } else if (obj != a.a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public final void b() {
        int i = this.c * 2;
        this.a = Arrays.copyOf(this.a, i);
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        xx0.h(0, 0, 14, this.b, iArr);
        this.b = iArr;
    }

    public final String toString() {
        return a();
    }
}
