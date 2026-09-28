package defpackage;

import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import java.lang.reflect.Array;
import java.util.AbstractList;

/* JADX INFO: loaded from: classes8.dex */
public final class bhf extends AbstractList<Long> {
    public final int a;
    public long[][] b;
    public int c;
    public int d;

    public bhf(int i) {
        if (i <= 0) {
            hb5.a("Subarray capacity must be positive");
            throw null;
        }
        this.a = i;
        this.b = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 0, i);
        this.d = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        a(i);
        long[][] jArr = this.b;
        int i2 = this.a;
        return Long.valueOf(jArr[i / i2][i % i2]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a(i);
        long[][] jArr = this.b;
        int i2 = this.a;
        long[] jArr2 = jArr[i / i2];
        int i3 = i % i2;
        long j = jArr2[i3];
        jArr2[i3] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    public final void a(int i) {
        if (i < 0 || i >= this.c) {
            ks40.a(this.c, efe0.a(i, "Index: ", gvQvkPPtA.qrofkckxbmpm));
        }
    }
}
