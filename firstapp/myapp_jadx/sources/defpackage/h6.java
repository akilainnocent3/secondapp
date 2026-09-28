package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class h6 {
    public Object a;
    public Object b = new int[2];

    public abstract int[] a(int i);

    public int[] b(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public String c() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        Intrinsics.n("text");
        throw null;
    }

    public abstract int[] d(int i);
}
