package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yn70 {
    public static final void a(rtw rtwVar, Object obj, Object obj2) {
        int i = rtwVar.i(obj);
        boolean z = i < 0;
        Object obj3 = z ? null : rtwVar.c[i];
        if (obj3 != null) {
            if (obj3 instanceof stw) {
                ((stw) obj3).d(obj2);
            } else if (obj3 != obj2) {
                stw stwVar = new stw((Object) null);
                stwVar.d(obj3);
                stwVar.d(obj2);
                obj2 = stwVar;
            }
            obj2 = obj3;
        }
        if (!z) {
            rtwVar.c[i] = obj2;
            return;
        }
        int i2 = ~i;
        rtwVar.b[i2] = obj;
        rtwVar.c[i2] = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean b(rtw rtwVar, Object obj, Object obj2) {
        V vD = rtwVar.d(obj);
        if (vD == 0) {
            return false;
        }
        if (!(vD instanceof stw)) {
            if (!vD.equals(obj2)) {
                return false;
            }
            rtwVar.k(obj);
            return true;
        }
        stw stwVar = (stw) vD;
        boolean zL = stwVar.l(obj2);
        if (zL && stwVar.b()) {
            rtwVar.k(obj);
        }
        return zL;
    }

    public static final void c(rtw rtwVar, Object obj) {
        boolean zB;
        long[] jArr = rtwVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = rtwVar.b[i4];
                        Object obj3 = rtwVar.c[i4];
                        if (obj3 instanceof stw) {
                            stw stwVar = (stw) obj3;
                            stwVar.l(obj);
                            zB = stwVar.b();
                        } else {
                            zB = obj3 == obj;
                        }
                        if (zB) {
                            rtwVar.l(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static String d(int i) {
        if (i == 1) {
            return "Clip";
        }
        if (i == 2) {
            return "Ellipsis";
        }
        if (i == 5) {
            return "MiddleEllipsis";
        }
        if (i == 3) {
            return "Visible";
        }
        return i == 4 ? "StartEllipsis" : "Invalid";
    }
}
