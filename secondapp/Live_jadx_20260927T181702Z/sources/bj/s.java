package bj;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b(emulated = true)
@i
public final class s extends b0 implements Serializable, q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f21737k = 7249069246863182397L;

    @Override // bj.q
    public void add(long x10) {
        int length;
        b0.b bVar;
        b0.b[] bVarArr = this.f21496b;
        if (bVarArr == null) {
            long j10 = this.f21497c;
            if (h(j10, j10 + x10)) {
                return;
            }
        }
        int[] iArr = b0.f21490e.get();
        boolean zA = true;
        if (iArr != null && bVarArr != null && (length = bVarArr.length) >= 1 && (bVar = bVarArr[(length - 1) & iArr[0]]) != null) {
            long j11 = bVar.f21508h;
            zA = bVar.a(j11, j11 + x10);
            if (zA) {
                return;
            }
        }
        m(x10, iArr, zA);
    }

    @Override // bj.q
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

    @Override // bj.b0
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
        this.f21498d = 0;
        this.f21496b = null;
        this.f21497c = s10.readLong();
    }

    public void p() {
        l(0L);
    }

    public long q() {
        long j10 = this.f21497c;
        b0.b[] bVarArr = this.f21496b;
        this.f21497c = 0L;
        if (bVarArr != null) {
            for (b0.b bVar : bVarArr) {
                if (bVar != null) {
                    j10 += bVar.f21508h;
                    bVar.f21508h = 0L;
                }
            }
        }
        return j10;
    }

    public final void r(ObjectOutputStream s10) throws IOException {
        s10.defaultWriteObject();
        s10.writeLong(sum());
    }

    @Override // bj.q
    public long sum() {
        long j10 = this.f21497c;
        b0.b[] bVarArr = this.f21496b;
        if (bVarArr != null) {
            for (b0.b bVar : bVarArr) {
                if (bVar != null) {
                    j10 += bVar.f21508h;
                }
            }
        }
        return j10;
    }

    public String toString() {
        return Long.toString(sum());
    }
}
