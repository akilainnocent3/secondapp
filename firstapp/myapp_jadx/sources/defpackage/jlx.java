package defpackage;

import android.view.View;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jlx implements flx {
    public final View a;
    public final qlx b;
    public final int[] c;

    public jlx(View view) {
        this.a = view;
        qlx qlxVar = new qlx(view);
        qlxVar.g(true);
        this.b = qlxVar;
        this.c = new int[2];
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.d.m(view, true);
    }

    @Override // defpackage.flx
    public final Object X1(long j, long j2, v1b<? super exh0> v1bVar) {
        qlx qlxVar = this.b;
        if (qlxVar.f(0)) {
            qlxVar.i(0);
        }
        if (qlxVar.f(1)) {
            qlxVar.i(1);
        }
        return new exh0(0L);
    }

    @Override // defpackage.flx
    public final long h0(int i, long j) {
        int iB = klx.b(j);
        int i2 = i == 1 ? 1 : 0;
        qlx qlxVar = this.b;
        if (!qlxVar.h(iB, i2 ^ 1)) {
            return 0L;
        }
        int[] iArr = this.c;
        Arrays.fill(iArr, 0, iArr.length, 0);
        qlxVar.c(klx.a(Float.intBitsToFloat((int) (j >> 32))), klx.a(Float.intBitsToFloat((int) (4294967295L & j))), (i == 1 ? 1 : 0) ^ 1, iArr, null);
        return klx.d(iArr, j);
    }

    @Override // defpackage.flx
    public final Object k1(long j, v1b<? super exh0> v1bVar) {
        float fB = exh0.b(j) * (-1.0f);
        float fC = exh0.c(j) * (-1.0f);
        qlx qlxVar = this.b;
        if (!qlxVar.b(fB, fC) && !qlxVar.a(exh0.b(j) * (-1.0f), exh0.c(j) * (-1.0f), true)) {
            j = 0;
        }
        return new exh0(j);
    }

    @Override // defpackage.flx
    public final long w0(int i, long j, long j2) {
        int iB = klx.b(j2);
        int i2 = i == 1 ? 1 : 0;
        qlx qlxVar = this.b;
        if (!qlxVar.h(iB, i2 ^ 1)) {
            return 0L;
        }
        int[] iArr = this.c;
        Arrays.fill(iArr, 0, iArr.length, 0);
        qlxVar.d(klx.a(Float.intBitsToFloat((int) (j >> 32))), klx.a(Float.intBitsToFloat((int) (j & 4294967295L))), klx.a(Float.intBitsToFloat((int) (j2 >> 32))), klx.a(Float.intBitsToFloat((int) (4294967295L & j2))), null, (i == 1 ? 1 : 0) ^ 1, iArr);
        return klx.d(iArr, j2);
    }
}
