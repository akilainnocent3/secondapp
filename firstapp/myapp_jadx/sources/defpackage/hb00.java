package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hb00 {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final msw<e8l> e;
    public final mpe0 f;

    public hb00(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i < 0) {
            lm20.a("Invalid start index");
        }
        this.d = new ArrayList();
        msw<e8l> mswVar = new msw<>();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            hmp hmpVar = (hmp) this.a.get(i3);
            int i4 = hmpVar.c;
            int i5 = hmpVar.d;
            mswVar.h(i4, new e8l(i3, i2, i5));
            i2 += i5;
        }
        this.e = mswVar;
        this.f = hwr.b(new gb00(this));
    }

    public final boolean a(int i, int i2) {
        e8l e8lVar;
        int i3;
        int i4;
        msw<e8l> mswVar = this.e;
        e8l e8lVarB = mswVar.b(i);
        if (e8lVarB == null) {
            return false;
        }
        int i5 = e8lVarB.b;
        int i6 = i2 - e8lVarB.c;
        e8lVarB.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = mswVar.c;
        long[] jArr = mswVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j) < 128 && (i3 = (e8lVar = (e8l) objArr[(i7 << 3) + i9]).b) >= i5 && e8lVar != e8lVarB && (i4 = i3 + i6) >= 0) {
                        e8lVar.b = i4;
                    }
                    j >>= 8;
                }
                if (i8 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }
}
