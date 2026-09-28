package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z880 {
    public static final lk40 a(urr urrVar) {
        lk40 lk40VarB = eb9.b(urrVar);
        long jD = urrVar.D(lk40VarB.e());
        float f = lk40VarB.c;
        float f2 = lk40VarB.d;
        long jD2 = urrVar.D((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
        return new lk40(Float.intBitsToFloat((int) (jD >> 32)), Float.intBitsToFloat((int) (jD & 4294967295L)), Float.intBitsToFloat((int) (jD2 >> 32)), Float.intBitsToFloat((int) (jD2 & 4294967295L)));
    }
}
