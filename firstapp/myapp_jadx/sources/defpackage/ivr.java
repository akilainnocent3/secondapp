package defpackage;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class ivr {
    public final int a;
    public final hvr[] b;
    public final nvr c;
    public final List<s7l> d;
    public final int e;
    public final int f;
    public final int g;

    public ivr(int i, hvr[] hvrVarArr, nvr nvrVar, List list, int i2) {
        this.a = i;
        this.b = hvrVarArr;
        this.c = nvrVar;
        this.d = list;
        this.e = i2;
        int iMax = 0;
        for (hvr hvrVar : hvrVarArr) {
            iMax = Math.max(iMax, hvrVar.n);
        }
        this.f = iMax;
        int i3 = iMax + this.e;
        this.g = i3 >= 0 ? i3 : 0;
    }

    public final hvr[] a(int i, int i2, int i3) {
        hvr[] hvrVarArr = this.b;
        int length = hvrVarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            hvr hvrVar = hvrVarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) this.d.get(i5).a;
            int i9 = i;
            hvrVar.q(i9, this.c.b[i6], i2, i3, this.a, i6);
            Unit unit = Unit.a;
            i6 += i8;
            i4++;
            i = i9;
            i5 = i7;
        }
        return hvrVarArr;
    }
}
