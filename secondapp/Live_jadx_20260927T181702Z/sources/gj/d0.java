package gj;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class d0 extends l0 implements Serializable, b0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f86778k = 7249069246863182397L;

    @Override // gj.b0
    public void add(long x10) {
        int length;
        l0.b bVar;
        l0.b[] bVarArr = this.f86883b;
        if (bVarArr == null) {
            long j10 = this.f86884c;
            if (h(j10, j10 + x10)) {
                return;
            }
        }
        int[] iArr = l0.f86877e.get();
        boolean zA = true;
        if (iArr != null && bVarArr != null && (length = bVarArr.length) >= 1 && (bVar = bVarArr[(length - 1) & iArr[0]]) != null) {
            long j11 = bVar.f86895h;
            zA = bVar.a(j11, j11 + x10);
            if (zA) {
                return;
            }
        }
        m(x10, iArr, zA);
    }

    @Override // gj.b0
    public void d() {
        add(1L);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return sum();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return sum();
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) sum();
    }

    @Override // gj.l0
    public final long j(long v10, long x10) {
        return v10 + x10;
    }

    @Override // java.lang.Number
    public long longValue() {
        return sum();
    }

    public void n() {
        add(-1L);
    }

    public final void o(ObjectInputStream s10) throws ClassNotFoundException, IOException {
        s10.defaultReadObject();
        this.f86885d = 0;
        this.f86883b = null;
        this.f86884c = s10.readLong();
    }

    public void p() {
        l(0L);
    }

    public long q() {
        long j10 = this.f86884c;
        l0.b[] bVarArr = this.f86883b;
        this.f86884c = 0L;
        if (bVarArr != null) {
            for (l0.b bVar : bVarArr) {
                if (bVar != null) {
                    j10 += bVar.f86895h;
                    bVar.f86895h = 0L;
                }
            }
        }
        return j10;
    }

    public final void r(ObjectOutputStream s10) throws IOException {
        s10.defaultWriteObject();
        s10.writeLong(sum());
    }

    @Override // gj.b0
    public long sum() {
        long j10 = this.f86884c;
        l0.b[] bVarArr = this.f86883b;
        if (bVarArr != null) {
            for (l0.b bVar : bVarArr) {
                if (bVar != null) {
                    j10 += bVar.f86895h;
                }
            }
        }
        return j10;
    }

    public String toString() {
        return Long.toString(sum());
    }
}
