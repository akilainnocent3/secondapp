package nj;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@o0
public class x extends Number implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f117334c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient AtomicLong f117335b;

    public x(double initialValue) {
        this.f117335b = new AtomicLong(Double.doubleToRawLongBits(initialValue));
    }

    @qj.a
    public final double a(double delta) {
        long j10;
        double dLongBitsToDouble;
        do {
            j10 = this.f117335b.get();
            dLongBitsToDouble = Double.longBitsToDouble(j10) + delta;
        } while (!this.f117335b.compareAndSet(j10, Double.doubleToRawLongBits(dLongBitsToDouble)));
        return dLongBitsToDouble;
    }

    public final boolean b(double expect, double update) {
        return this.f117335b.compareAndSet(Double.doubleToRawLongBits(expect), Double.doubleToRawLongBits(update));
    }

    public final double d() {
        return Double.longBitsToDouble(this.f117335b.get());
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return d();
    }

    @qj.a
    public final double e(double delta) {
        long j10;
        double dLongBitsToDouble;
        do {
            j10 = this.f117335b.get();
            dLongBitsToDouble = Double.longBitsToDouble(j10);
        } while (!this.f117335b.compareAndSet(j10, Double.doubleToRawLongBits(dLongBitsToDouble + delta)));
        return dLongBitsToDouble;
    }

    public final double f(double newValue) {
        return Double.longBitsToDouble(this.f117335b.getAndSet(Double.doubleToRawLongBits(newValue)));
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) d();
    }

    public final void g(double newValue) {
        this.f117335b.lazySet(Double.doubleToRawLongBits(newValue));
    }

    public final void h(ObjectInputStream s10) throws ClassNotFoundException, IOException {
        s10.defaultReadObject();
        this.f117335b = new AtomicLong();
        i(s10.readDouble());
    }

    public final void i(double newValue) {
        this.f117335b.set(Double.doubleToRawLongBits(newValue));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) d();
    }

    public final boolean j(double expect, double update) {
        return this.f117335b.weakCompareAndSet(Double.doubleToRawLongBits(expect), Double.doubleToRawLongBits(update));
    }

    public final void k(ObjectOutputStream s10) throws IOException {
        s10.defaultWriteObject();
        s10.writeDouble(d());
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) d();
    }

    public String toString() {
        return Double.toString(d());
    }

    public x() {
        this(0.0d);
    }
}
