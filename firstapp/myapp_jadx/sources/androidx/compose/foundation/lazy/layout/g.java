package androidx.compose.foundation.lazy.layout;

import defpackage.dtw;
import defpackage.duw;
import defpackage.efe0;
import defpackage.ixr;
import defpackage.jzo;
import defpackage.kzo;
import defpackage.rsw;
import defpackage.zby;
import defpackage.zkn;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class g implements ixr {
    public final dtw a;
    public final Object[] b;
    public final int c;

    public g(IntRange intRange, b<?> bVar) {
        rsw rswVarJ = bVar.j();
        final int i = intRange.a;
        if (i < 0) {
            zkn.c("negative nearestRange.first");
        }
        final int iMin = Math.min(intRange.b, rswVarJ.b - 1);
        if (iMin < i) {
            dtw<Object> dtwVar = zby.a;
            dtwVar.getClass();
            this.a = dtwVar;
            this.b = new Object[0];
            this.c = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.b = new Object[i2];
        this.c = i;
        final dtw dtwVar2 = new dtw(i2);
        Function1 function1 = new Function1() { // from class: androidx.compose.foundation.lazy.layout.f
            /* JADX WARN: Code duplicated, block: B:7:0x002b  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object defaultLazyKey;
                jzo jzoVar = (jzo) obj;
                Function1<Integer, Object> key = jzoVar.c.getKey();
                int i3 = jzoVar.a;
                int iMax = Math.max(i, i3);
                int iMin2 = Math.min(iMin, (jzoVar.b + i3) - 1);
                if (iMax <= iMin2) {
                    while (true) {
                        if (key == null) {
                            defaultLazyKey = new DefaultLazyKey(iMax);
                        } else {
                            defaultLazyKey = key.invoke(Integer.valueOf(iMax - i3));
                            if (defaultLazyKey == null) {
                                defaultLazyKey = new DefaultLazyKey(iMax);
                            }
                        }
                        dtwVar2.h(iMax, defaultLazyKey);
                        g gVar = this;
                        gVar.b[iMax - gVar.c] = defaultLazyKey;
                        if (iMax == iMin2) {
                            break;
                        }
                        iMax++;
                    }
                }
                return Unit.a;
            }
        };
        duw<jzo<T>> duwVar = rswVarJ.a;
        if (i < 0 || i >= rswVarJ.b) {
            StringBuilder sbA = efe0.a(i, "Index ", ", size ");
            sbA.append(rswVarJ.b);
            zkn.e(sbA.toString());
        }
        if (iMin < 0 || iMin >= rswVarJ.b) {
            StringBuilder sbA2 = efe0.a(iMin, "Index ", ", size ");
            sbA2.append(rswVarJ.b);
            zkn.e(sbA2.toString());
        }
        if (iMin < i) {
            zkn.a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        int iA = kzo.a(i, duwVar);
        int i3 = ((jzo) duwVar.a[iA]).a;
        while (i3 <= iMin) {
            jzo jzoVar = (jzo) duwVar.a[iA];
            function1.invoke(jzoVar);
            i3 += jzoVar.b;
            iA++;
        }
        this.a = dtwVar2;
    }

    public final Object a(int i) {
        int i2 = i - this.c;
        if (i2 < 0) {
            return null;
        }
        Object[] objArr = this.b;
        if (i2 < objArr.length) {
            return objArr[i2];
        }
        return null;
    }

    @Override // defpackage.ixr
    public final int c(Object obj) {
        dtw dtwVar = this.a;
        int iD = dtwVar.d(obj);
        if (iD >= 0) {
            return dtwVar.c[iD];
        }
        return -1;
    }
}
