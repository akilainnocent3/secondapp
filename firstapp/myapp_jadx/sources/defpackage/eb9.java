package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eb9 {
    public static final op8 a = new op8(1904994610, new db9(), false);

    public static final lk40 a(urr urrVar) {
        urr urrVarE0 = urrVar.e0();
        return urrVarE0 != null ? urrVarE0.P(urrVar, true) : new lk40(0.0f, 0.0f, (int) (urrVar.a() >> 32), (int) (urrVar.a() & 4294967295L));
    }

    public static final lk40 b(urr urrVar) {
        urr urrVarC = c(urrVar);
        float fA = (int) (urrVarC.a() >> 32);
        float fA2 = (int) (urrVarC.a() & 4294967295L);
        lk40 lk40VarP = urrVarC.P(urrVar, true);
        float f = lk40VarP.a;
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > fA) {
            f = fA;
        }
        float f2 = lk40VarP.b;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > fA2) {
            f2 = fA2;
        }
        float f3 = lk40VarP.c;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 <= fA) {
            fA = f3;
        }
        float f4 = lk40VarP.d;
        float f5 = f4 >= 0.0f ? f4 : 0.0f;
        if (f5 <= fA2) {
            fA2 = f5;
        }
        if (f == fA || f2 == fA2) {
            return lk40.e;
        }
        long jT = urrVarC.T((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        long jT2 = urrVarC.T((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fA)) << 32));
        long jT3 = urrVarC.T((((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA2)) & 4294967295L));
        long jT4 = urrVarC.T((((long) Float.floatToRawIntBits(fA2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jT >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jT2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jT4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jT3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jT & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jT2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jT4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jT3 & 4294967295L));
        return new lk40(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final urr c(urr urrVar) {
        urr urrVar2;
        urr urrVarE0 = urrVar.e0();
        while (true) {
            urr urrVar3 = urrVarE0;
            urrVar2 = urrVar;
            urrVar = urrVar3;
            if (urrVar == null) {
                break;
            }
            urrVarE0 = urrVar.e0();
        }
        ywx ywxVar = urrVar2 instanceof ywx ? (ywx) urrVar2 : null;
        if (ywxVar == null) {
            return urrVar2;
        }
        ywx ywxVar2 = ywxVar.I;
        while (true) {
            ywx ywxVar3 = ywxVar2;
            ywx ywxVar4 = ywxVar;
            ywxVar = ywxVar3;
            if (ywxVar == null) {
                return ywxVar4;
            }
            ywxVar2 = ywxVar.I;
        }
    }

    public static final long d(urr urrVar) {
        urr urrVarE0 = urrVar.e0();
        if (urrVarE0 != null) {
            return urrVarE0.M(urrVar, 0L);
        }
        return 0L;
    }
}
