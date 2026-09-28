package defpackage;

import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class eze implements t0h {
    public final amv a;
    public int c;
    public zx1 d;
    public tf f;
    public tf b = new tf(0);
    public long e = 0;

    public eze(int i, amv amvVar) {
        this.a = amvVar;
        this.c = i;
        this.d = (zx1) zx1.c.computeIfAbsent(Integer.valueOf(i), new yx1());
    }

    public final void a(int i) {
        tf tfVar;
        if (i == 0) {
            return;
        }
        if (i < 0) {
            ib5.a(pe4.b(i, "Cannot downscale by negative amount. Was given ", "."));
            return;
        }
        tf tfVar2 = this.b;
        if (tfVar2.d != Integer.MIN_VALUE) {
            amv amvVar = amv.b;
            amv amvVar2 = this.a;
            if (amvVar2 == amvVar) {
                tfVar = new tf(tfVar2);
            } else {
                tfVar = this.f;
                if (tfVar == null) {
                    tfVar = new tf(tfVar2);
                    this.f = tfVar;
                }
            }
            uf ufVar = (uf) tfVar.e;
            int iOrdinal = ufVar.e.ordinal();
            if (iOrdinal == 0) {
                Arrays.fill(ufVar.a, (byte) 0);
            } else if (iOrdinal == 1) {
                Arrays.fill(ufVar.b, (short) 0);
            } else if (iOrdinal == 2) {
                Arrays.fill(ufVar.c, 0);
            } else if (iOrdinal == 3) {
                Arrays.fill(ufVar.d, 0L);
            }
            tfVar.d = Integer.MIN_VALUE;
            tfVar.b = Integer.MIN_VALUE;
            tfVar.c = Integer.MIN_VALUE;
            int i2 = this.b.c;
            while (true) {
                tf tfVar3 = this.b;
                if (i2 <= tfVar3.b) {
                    long jA = tfVar3.a(i2);
                    if (jA > 0 && !tfVar.b(i2 >> i, jA)) {
                        ib5.a("Failed to create new downscaled buckets.");
                        return;
                    }
                    i2++;
                } else if (amvVar2 == amv.a) {
                    this.b = tfVar;
                    this.f = tfVar3;
                } else {
                    this.b = tfVar;
                }
            }
        }
        int i3 = this.c - i;
        this.c = i3;
        this.d = (zx1) zx1.c.computeIfAbsent(Integer.valueOf(i3), new yx1());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eze)) {
            return false;
        }
        eze ezeVar = (eze) obj;
        if (this.c != ezeVar.c || this.e != ezeVar.e) {
            return false;
        }
        int iMin = Math.min(this.b.c, ezeVar.b.c);
        if (iMin == Integer.MIN_VALUE) {
            iMin = Math.max(this.b.c, ezeVar.b.c);
        }
        int iMax = Math.max(this.b.b, ezeVar.b.b);
        while (iMin <= iMax) {
            if (this.b.a(iMin) != ezeVar.b.a(iMin)) {
                return false;
            }
            iMin++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.b.c;
        int i2 = 1000003;
        while (true) {
            tf tfVar = this.b;
            if (i > tfVar.b) {
                return this.c ^ i2;
            }
            long jA = tfVar.a(i);
            if (jA != 0) {
                i2 = ((int) (((long) ((i2 ^ i) * 1000003)) ^ jA)) * 1000003;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DoubleExponentialHistogramBuckets{scale: ");
        sb.append(this.c);
        sb.append(", offset: ");
        tf tfVar = this.b;
        sb.append(tfVar.d == Integer.MIN_VALUE ? 0 : tfVar.c);
        sb.append(", counts: ");
        sb.append(this.b);
        sb.append(" }");
        return sb.toString();
    }

    public final boolean b(double d) {
        if (d == 0.0d) {
            ib5.a(dqvOSm.tIbzaKrx);
            return false;
        }
        boolean zB = this.b.b(this.d.a(d), 1L);
        if (zB) {
            this.e++;
        }
        return zB;
    }
}
