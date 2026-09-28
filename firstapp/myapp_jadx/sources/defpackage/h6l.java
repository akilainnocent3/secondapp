package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h6l extends dpp<f6l> {
    public final f6l i;

    public h6l(List<cpp<f6l>> list) {
        super(list);
        int iMax = 0;
        for (int i = 0; i < list.size(); i++) {
            f6l f6lVar = list.get(i).b;
            if (f6lVar != null) {
                iMax = Math.max(iMax, f6lVar.b.length);
            }
        }
        this.i = new f6l(new float[iMax], new int[iMax]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.u12
    public final Object f(cpp cppVar, float f) {
        f6l f6lVar = (f6l) cppVar.b;
        f6l f6lVar2 = (f6l) cppVar.c;
        f6l f6lVar3 = this.i;
        int[] iArr = f6lVar3.b;
        float[] fArr = f6lVar3.a;
        boolean zEquals = f6lVar.equals(f6lVar2);
        int[] iArr2 = f6lVar.b;
        if (zEquals) {
            f6lVar3.a(f6lVar);
            return f6lVar3;
        }
        if (f <= 0.0f) {
            f6lVar3.a(f6lVar);
            return f6lVar3;
        }
        if (f >= 1.0f) {
            f6lVar3.a(f6lVar2);
            return f6lVar3;
        }
        int length = iArr2.length;
        int[] iArr3 = f6lVar2.b;
        if (length != iArr3.length) {
            StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb.append(iArr2.length);
            sb.append(" vs ");
            hb5.a(zk1.a(iArr3.length, ")", sb));
            return null;
        }
        for (int i = 0; i < iArr2.length; i++) {
            fArr[i] = rqv.f(f6lVar.a[i], f6lVar2.a[i], f);
            iArr[i] = fyj.c(f, iArr2[i], iArr3[i]);
        }
        for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
            fArr[length2] = fArr[iArr2.length - 1];
            iArr[length2] = iArr[iArr2.length - 1];
        }
        return f6lVar3;
    }
}
