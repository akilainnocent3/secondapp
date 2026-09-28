package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class kjt extends vv20<long[]> {
    public long[] a;
    public int b;

    @Override // defpackage.vv20
    public final long[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.vv20
    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            int length = jArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(jArr, i);
        }
    }

    @Override // defpackage.vv20
    public final int d() {
        return this.b;
    }
}
