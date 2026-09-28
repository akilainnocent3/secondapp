package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class r15 extends vv20<boolean[]> {
    public boolean[] a;
    public int b;

    @Override // defpackage.vv20
    public final boolean[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.vv20
    public final void b(int i) {
        boolean[] zArr = this.a;
        if (zArr.length < i) {
            int length = zArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(zArr, i);
        }
    }

    @Override // defpackage.vv20
    public final int d() {
        return this.b;
    }
}
