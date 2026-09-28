package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public final class nml0 extends o {
    @Override // defpackage.o
    public final void g0(Object obj, long j, byte b) {
        if (rml0.g) {
            rml0.c(obj, j, b);
        } else {
            rml0.d(obj, j, b);
        }
    }

    @Override // defpackage.o
    public final boolean h0(Object obj, long j) {
        return rml0.g ? rml0.k(obj, j) : rml0.l(obj, j);
    }

    @Override // defpackage.o
    public final void i0(Object obj, long j, boolean z) {
        if (rml0.g) {
            rml0.c(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            rml0.d(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.o
    public final float j0(Object obj, long j) {
        return Float.intBitsToFloat(((Unsafe) this.a).getInt(obj, j));
    }

    @Override // defpackage.o
    public final void k0(Object obj, long j, float f) {
        ((Unsafe) this.a).putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.o
    public final double l0(Object obj, long j) {
        return Double.longBitsToDouble(((Unsafe) this.a).getLong(obj, j));
    }

    @Override // defpackage.o
    public final void m0(Object obj, long j, double d) {
        ((Unsafe) this.a).putLong(obj, j, Double.doubleToLongBits(d));
    }
}
