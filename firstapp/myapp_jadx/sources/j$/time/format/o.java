package j$.time.format;

import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends i {
    public static final LocalDate h = LocalDate.of(2000, 1, 1);
    public final ChronoLocalDate g;

    public o(j$.time.temporal.n nVar, int i, int i2, ChronoLocalDate chronoLocalDate, int i3) {
        super(nVar, i, i2, c0.NOT_NEGATIVE, i3);
        this.g = chronoLocalDate;
    }

    @Override // j$.time.format.i
    public final long a(w wVar, long j) {
        long jAbs = Math.abs(j);
        ChronoLocalDate chronoLocalDate = this.g;
        long jH = chronoLocalDate != null ? Chronology.s(wVar.a).J(chronoLocalDate).h(this.a) : 0;
        long[] jArr = i.f;
        if (j >= jH) {
            long j2 = jArr[this.b];
            if (j < jH + j2) {
                return jAbs % j2;
            }
        }
        return jAbs % jArr[this.c];
    }

    @Override // j$.time.format.i
    public final boolean b(u uVar) {
        if (uVar.c) {
            return super.b(uVar);
        }
        return false;
    }

    @Override // j$.time.format.i
    public final int c(final u uVar, long j, final int i, final int i2) {
        final o oVar;
        u uVar2;
        final long j2;
        int iH;
        long j3;
        ChronoLocalDate chronoLocalDate = this.g;
        if (chronoLocalDate != null) {
            Chronology chronology = uVar.c().c;
            if (chronology == null && (chronology = uVar.a.e) == null) {
                chronology = j$.time.chrono.p.d;
            }
            iH = chronology.J(chronoLocalDate).h(this.a);
            oVar = this;
            j2 = j;
            Consumer consumer = new Consumer() { // from class: j$.time.format.n
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.a.c(uVar, j2, i, i2);
                }
            };
            uVar2 = uVar;
            ArrayList arrayList = uVar2.e;
            if (arrayList == null) {
                arrayList = new ArrayList();
                uVar2.e = arrayList;
            }
            arrayList.add(consumer);
        } else {
            oVar = this;
            uVar2 = uVar;
            j2 = j;
            iH = 0;
        }
        int i3 = i2 - i;
        int i4 = oVar.b;
        if (i3 != i4 || j2 < 0) {
            j3 = j2;
        } else {
            long j4 = i.f[i4];
            long j5 = iH;
            long j6 = j5 - (j5 % j4);
            long j7 = iH > 0 ? j6 + j2 : j6 - j2;
            j3 = j7 < j5 ? j4 + j7 : j7;
        }
        return uVar2.f(oVar.a, j3, i, i2);
    }

    @Override // j$.time.format.i
    public final i d() {
        if (this.e == -1) {
            return this;
        }
        return new o(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.i
    public final i e(int i) {
        return new o(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.i
    public final String toString() {
        ChronoLocalDate chronoLocalDate = this.g;
        return "ReducedValue(" + this.a + "," + this.b + "," + this.c + "," + (chronoLocalDate != null ? chronoLocalDate : 0) + ")";
    }
}
