package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class te0 {
    public static ae0 a(hfp hfpVar, xmt xmtVar) {
        return new ae0(fpp.a(hfpVar, xmtVar, 1.0f, z58.a, false));
    }

    public static be0 b(hep hepVar, xmt xmtVar, boolean z) {
        return new be0(fpp.a(hepVar, xmtVar, z ? srh0.c() : 1.0f, exh.a, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ce0 c(hfp hfpVar, xmt xmtVar, int i) {
        i6l i6lVar = new i6l();
        i6lVar.a = i;
        ArrayList arrayListA = fpp.a(hfpVar, xmtVar, 1.0f, i6lVar, false);
        for (int i2 = 0; i2 < arrayListA.size(); i2++) {
            cpp cppVar = (cpp) arrayListA.get(i2);
            f6l f6lVar = (f6l) cppVar.b;
            f6l f6lVar2 = (f6l) cppVar.c;
            if (f6lVar != null && f6lVar2 != null) {
                float[] fArr = f6lVar.a;
                int length = fArr.length;
                float[] fArr2 = f6lVar2.a;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f = Float.NaN;
                    int i3 = 0;
                    for (int i4 = 0; i4 < length2; i4++) {
                        float f2 = fArr3[i4];
                        if (f2 != f) {
                            fArr3[i3] = f2;
                            i3++;
                            f = fArr3[i4];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i3);
                    cppVar = new cpp(f6lVar.b(fArrCopyOfRange), f6lVar2.b(fArrCopyOfRange));
                }
            }
            arrayListA.set(i2, cppVar);
        }
        return new ce0(arrayListA);
    }

    public static de0 d(hep hepVar, xmt xmtVar) {
        return new de0(fpp.a(hepVar, xmtVar, 1.0f, rxo.a, false));
    }

    public static he0 e(hfp hfpVar, xmt xmtVar) {
        return new he0(fpp.a(hfpVar, xmtVar, srh0.c(), yz10.a, true));
    }
}
