package nj;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
@yi.c
@yi.d
public class y implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f117336c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient AtomicLongArray f117337b;

    public y(int length) {
        this.f117337b = new AtomicLongArray(length);
    }

    @qj.a
    public double a(int i10, double delta) {
        while (true) {
            long j10 = this.f117337b.get(i10);
            double dLongBitsToDouble = Double.longBitsToDouble(j10) + delta;
            int i11 = i10;
            if (this.f117337b.compareAndSet(i11, j10, Double.doubleToRawLongBits(dLongBitsToDouble))) {
                return dLongBitsToDouble;
            }
            i10 = i11;
        }
    }

    public final boolean b(int i10, double expect, double update) {
        return this.f117337b.compareAndSet(i10, Double.doubleToRawLongBits(expect), Double.doubleToRawLongBits(update));
    }

    public final double c(int i10) {
        return Double.longBitsToDouble(this.f117337b.get(i10));
    }

    @qj.a
    public final double d(int i10, double delta) {
        while (true) {
            long j10 = this.f117337b.get(i10);
            double dLongBitsToDouble = Double.longBitsToDouble(j10);
            int i11 = i10;
            if (this.f117337b.compareAndSet(i11, j10, Double.doubleToRawLongBits(dLongBitsToDouble + delta))) {
                return dLongBitsToDouble;
            }
            i10 = i11;
        }
    }

    public final double e(int i10, double newValue) {
        return Double.longBitsToDouble(this.f117337b.getAndSet(i10, Double.doubleToRawLongBits(newValue)));
    }

    public final void f(int i10, double newValue) {
        this.f117337b.lazySet(i10, Double.doubleToRawLongBits(newValue));
    }

    public final int g() {
        return this.f117337b.length();
    }

    public final void h(ObjectInputStream s10) throws ClassNotFoundException, IOException {
        s10.defaultReadObject();
        int i10 = s10.readInt();
        lj.k.c cVarH = lj.k.h();
        for (int i11 = 0; i11 < i10; i11++) {
            cVarH.a(Double.doubleToRawLongBits(s10.readDouble()));
        }
        this.f117337b = new AtomicLongArray(cVarH.f().D());
    }

    public final void i(int i10, double newValue) {
        this.f117337b.set(i10, Double.doubleToRawLongBits(newValue));
    }

    public final boolean j(int i10, double expect, double update) {
        return this.f117337b.weakCompareAndSet(i10, Double.doubleToRawLongBits(expect), Double.doubleToRawLongBits(update));
    }

    public final void k(ObjectOutputStream s10) throws IOException {
        s10.defaultWriteObject();
        int iG = g();
        s10.writeInt(iG);
        for (int i10 = 0; i10 < iG; i10++) {
            s10.writeDouble(c(i10));
        }
    }

    public String toString() {
        int iG = g();
        int i10 = iG - 1;
        if (i10 == -1) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(iG * 19);
        sb2.append(fw.b.f85384k);
        int i11 = 0;
        while (true) {
            sb2.append(Double.longBitsToDouble(this.f117337b.get(i11)));
            if (i11 == i10) {
                sb2.append(fw.b.f85385l);
                return sb2.toString();
            }
            sb2.append(fw.b.f85380g);
            sb2.append(' ');
            i11++;
        }
    }

    public y(double[] array) {
        int length = array.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = Double.doubleToRawLongBits(array[i10]);
        }
        this.f117337b = new AtomicLongArray(jArr);
    }
}
