package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class fx0 {

    public static final class a {
        public int a;
        public long b;
        public Object c;
        public final r3h d;

        public a(r3h r3hVar) {
            r3hVar.getClass();
            this.d = r3hVar;
        }
    }

    public static int a(byte[] bArr, int i, a aVar) throws f0p {
        int i2 = i(bArr, i, aVar);
        int i3 = aVar.a;
        if (i3 < 0) {
            throw f0p.e();
        }
        if (i3 > bArr.length - i2) {
            throw f0p.g();
        }
        if (i3 == 0) {
            aVar.c = ql5.b;
            return i2;
        }
        aVar.c = ql5.c(bArr, i2, i3);
        return i2 + i3;
    }

    public static int b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long c(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int d(an70<?> an70Var, int i, byte[] bArr, int i2, int i3, gyo.c<?> cVar, a aVar) throws f0p {
        Object objNewInstance = an70Var.newInstance();
        an70<?> an70Var2 = an70Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        a aVar2 = aVar;
        int iL = l(objNewInstance, an70Var2, bArr2, i2, i4, aVar2);
        an70Var2.makeImmutable(objNewInstance);
        aVar2.c = objNewInstance;
        cVar.add(objNewInstance);
        while (iL < i4) {
            a aVar3 = aVar2;
            int i5 = i4;
            int i6 = i(bArr2, iL, aVar3);
            if (i != aVar3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            an70<?> an70Var3 = an70Var2;
            Object objNewInstance2 = an70Var3.newInstance();
            iL = l(objNewInstance2, an70Var3, bArr3, i6, i5, aVar3);
            an70Var2 = an70Var3;
            bArr2 = bArr3;
            i4 = i5;
            aVar2 = aVar3;
            an70Var2.makeImmutable(objNewInstance2);
            aVar2.c = objNewInstance2;
            cVar.add(objNewInstance2);
        }
        return iL;
    }

    public static int e(byte[] bArr, int i, a aVar) throws f0p {
        int i2 = i(bArr, i, aVar);
        int i3 = aVar.a;
        if (i3 < 0) {
            throw f0p.e();
        }
        if (i3 == 0) {
            aVar.c = "";
            return i2;
        }
        aVar.c = new String(bArr, i2, i3, gyo.a);
        return i2 + i3;
    }

    public static int f(byte[] bArr, int i, a aVar) throws f0p {
        int i2 = i(bArr, i, aVar);
        int i3 = aVar.a;
        if (i3 < 0) {
            throw f0p.e();
        }
        if (i3 == 0) {
            aVar.c = "";
            return i2;
        }
        aVar.c = yqh0.a.a(bArr, i2, i3);
        return i2 + i3;
    }

    public static int g(int i, byte[] bArr, int i2, int i3, cgh0 cgh0Var, a aVar) throws f0p {
        if ((i >>> 3) == 0) {
            throw f0p.a();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iK = k(bArr, i2, aVar);
            cgh0Var.c(i, Long.valueOf(aVar.b));
            return iK;
        }
        if (i4 == 1) {
            cgh0Var.c(i, Long.valueOf(c(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int i5 = i(bArr, i2, aVar);
            int i6 = aVar.a;
            if (i6 < 0) {
                throw f0p.e();
            }
            if (i6 > bArr.length - i5) {
                throw f0p.g();
            }
            if (i6 == 0) {
                cgh0Var.c(i, ql5.b);
            } else {
                cgh0Var.c(i, ql5.c(bArr, i5, i6));
            }
            return i5 + i6;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw f0p.a();
            }
            cgh0Var.c(i, Integer.valueOf(b(bArr, i2)));
            return i2 + 4;
        }
        cgh0 cgh0Var2 = new cgh0();
        int i7 = (i & (-8)) | 4;
        int i8 = 0;
        while (i2 < i3) {
            int i9 = i(bArr, i2, aVar);
            i8 = aVar.a;
            if (i8 == i7) {
                i2 = i9;
                break;
            }
            i2 = g(i8, bArr, i9, i3, cgh0Var2, aVar);
        }
        if (i2 > i3 || i8 != i7) {
            throw f0p.f();
        }
        cgh0Var.c(i, cgh0Var2);
        return i2;
    }

    public static int h(int i, byte[] bArr, int i2, a aVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            aVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            aVar.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            aVar.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            aVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                aVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int i(byte[] bArr, int i, a aVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return h(b, bArr, i2, aVar);
        }
        aVar.a = b;
        return i2;
    }

    public static int j(int i, byte[] bArr, int i2, int i3, gyo.c<?> cVar, a aVar) {
        rvo rvoVar = (rvo) cVar;
        int i4 = i(bArr, i2, aVar);
        rvoVar.addInt(aVar.a);
        while (i4 < i3) {
            int i5 = i(bArr, i4, aVar);
            if (i != aVar.a) {
                break;
            }
            i4 = i(bArr, i5, aVar);
            rvoVar.addInt(aVar.a);
        }
        return i4;
    }

    public static int k(byte[] bArr, int i, a aVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            aVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        aVar.b = j2;
        return i3;
    }

    public static int l(Object obj, an70 an70Var, byte[] bArr, int i, int i2, a aVar) throws f0p {
        int iH = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iH = h(i3, bArr, iH, aVar);
            i3 = aVar.a;
        }
        int i4 = iH;
        if (i3 < 0 || i3 > i2 - i4) {
            throw f0p.g();
        }
        int i5 = i4 + i3;
        an70Var.f(obj, bArr, i4, i5, aVar);
        aVar.c = obj;
        return i5;
    }

    public static int m(int i, byte[] bArr, int i2, int i3, a aVar) throws f0p {
        if ((i >>> 3) == 0) {
            throw f0p.a();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return k(bArr, i2, aVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return i(bArr, i2, aVar) + aVar.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw f0p.a();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = i(bArr, i2, aVar);
            i6 = aVar.a;
            if (i6 == i5) {
                break;
            }
            i2 = m(i6, bArr, i2, i3, aVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw f0p.f();
        }
        return i2;
    }
}
