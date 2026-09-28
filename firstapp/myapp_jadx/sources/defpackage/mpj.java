package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class mpj {
    public final double a;
    public final String b;
    public final int c;
    public final int d;
    public final Map<Long, up10> e;

    public mpj(double d, String str, int i, int i2, Map<Long, up10> map) {
        map.getClass();
        this.a = d;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpj)) {
            return false;
        }
        mpj mpjVar = (mpj) obj;
        return Double.compare(this.a, mpjVar.a) == 0 && Intrinsics.g(this.b, mpjVar.b) && this.c == mpjVar.c && this.d == mpjVar.d && Intrinsics.g(this.e, mpjVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + gpp.a(this.d, gpp.a(this.c, gmf0.a(Double.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        return "GameplayInitData(prizePoolAmount=" + this.a + ", currency=" + this.b + ", totalTimeInSeconds=" + this.c + ", totalHammers=" + this.d + ", players=" + this.e + ')';
    }

    public mpj() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mpj(int i) {
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this(0.0d, "", 0, 0, o2gVar);
    }
}
