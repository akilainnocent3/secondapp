package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c9z {
    public static final void a(j90 j90Var, b9z b9zVar) {
        if (b9zVar instanceof b9z.b) {
            bxz.o(j90Var, ((b9z.b) b9zVar).a);
            return;
        }
        if (b9zVar instanceof b9z.c) {
            bxz.s(j90Var, ((b9z.c) b9zVar).a);
        } else if (b9zVar instanceof b9z.a) {
            bxz.r(j90Var, ((b9z.a) b9zVar).a);
        } else {
            uhc.a();
        }
    }

    public static void b(tcf tcfVar, b9z b9zVar, long j) {
        rlh rlhVar = rlh.a;
        if (b9zVar instanceof b9z.b) {
            lk40 lk40Var = ((b9z.b) b9zVar).a;
            float f = lk40Var.a;
            tcfVar.O1(j, (((long) Float.floatToRawIntBits(lk40Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), c(lk40Var), 1.0f, rlhVar, null, 3);
            return;
        }
        if (!(b9zVar instanceof b9z.c)) {
            if (b9zVar instanceof b9z.a) {
                tcfVar.H(((b9z.a) b9zVar).a, j, 1.0f, rlhVar);
                return;
            } else {
                uhc.a();
                return;
            }
        }
        b9z.c cVar = (b9z.c) b9zVar;
        j90 j90Var = cVar.b;
        if (j90Var != null) {
            tcfVar.H(j90Var, j, 1.0f, rlhVar);
            return;
        }
        lz50 lz50Var = cVar.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (lz50Var.h >> 32));
        float f2 = lz50Var.a;
        tcfVar.B1(j, (((long) Float.floatToRawIntBits(lz50Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), (((long) Float.floatToRawIntBits(lz50Var.b())) << 32) | (((long) Float.floatToRawIntBits(lz50Var.a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), rlhVar, 1.0f);
    }

    public static final long c(lk40 lk40Var) {
        float f = lk40Var.c - lk40Var.a;
        return (((long) Float.floatToRawIntBits(lk40Var.d - lk40Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }
}
