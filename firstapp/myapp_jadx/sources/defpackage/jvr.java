package defpackage;

import com.google.protobuf.Reader;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public abstract class jvr {
    public final nvr a;
    public final int b;
    public final int c;
    public final yur d;
    public final rvr e;

    public jvr(nvr nvrVar, int i, int i2, yur yurVar, rvr rvrVar) {
        this.a = nvrVar;
        this.b = i;
        this.c = i2;
        this.d = yurVar;
        this.e = rvrVar;
    }

    public final long a(int i, int i2) {
        int i3;
        nvr nvrVar = this.a;
        int[] iArr = nvrVar.a;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = nvrVar.b;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 < 0) {
            ykn.a("width must be >= 0");
        }
        return oxa.h(i3, i3, 0, Reader.READ_DONE);
    }

    public abstract ivr b(int i, hvr[] hvrVarArr, List<s7l> list, int i2);

    public final ivr c(int i) {
        rvr.c cVarB = this.e.b(i);
        int i2 = cVarB.a;
        List<s7l> list = cVarB.b;
        int size = list.size();
        int i3 = (size == 0 || i2 + size == this.b) ? 0 : this.c;
        hvr[] hvrVarArr = new hvr[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = (int) list.get(i5).a;
            hvr hvrVarN0 = this.d.n0(i2 + i5, i4, i6, i3, a(i4, i6));
            i4 += i6;
            Unit unit = Unit.a;
            hvrVarArr[i5] = hvrVarN0;
        }
        return b(i, hvrVarArr, list, i3);
    }
}
