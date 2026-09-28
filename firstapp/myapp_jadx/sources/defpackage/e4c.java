package defpackage;

import java.util.Arrays;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public class e4c {
    public final float[] a;

    public e4c(float[] fArr) {
        this.a = fArr;
        if (fArr.length == 8) {
            return;
        }
        hb5.a("Points array size should be 8");
        throw null;
    }

    public final float a() {
        return this.a[6];
    }

    public final float b() {
        return this.a[7];
    }

    public final long c(float f) {
        float f2 = 1.0f - f;
        float[] fArr = this.a;
        float f3 = f2 * f2 * f2;
        float f4 = 3.0f * f;
        float f5 = f4 * f2 * f2;
        float f6 = f4 * f * f2;
        float f7 = (fArr[4] * f6) + (fArr[2] * f5) + (fArr[0] * f3);
        float f8 = f * f * f;
        return ywh.a((a() * f8) + f7, (b() * f8) + (fArr[5] * f6) + (fArr[3] * f5) + (fArr[1] * f3));
    }

    public final Pair<e4c, e4c> d(float f) {
        float f2 = 1.0f - f;
        long jC = c(f);
        float[] fArr = this.a;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f7 = f2 * f2;
        float f8 = 2.0f * f2 * f;
        float f9 = f * f;
        return new Pair<>(i4c.a(f3, f4, (f5 * f) + (f3 * f2), (f6 * f) + (f4 * f2), (fArr[4] * f9) + (f5 * f8) + (f3 * f7), (fArr[5] * f9) + (f6 * f8) + (f4 * f7), a020.d(jC), a020.e(jC)), i4c.a(a020.d(jC), a020.e(jC), (a() * f9) + (fArr[4] * f8) + (fArr[2] * f7), (b() * f9) + (fArr[5] * f8) + (fArr[3] * f7), (a() * f) + (fArr[4] * f2), (b() * f) + (fArr[5] * f2), a(), b()));
    }

    public final esw e(yy80.a aVar) {
        esw eswVar = new esw(0);
        float[] fArr = this.a;
        int length = fArr.length;
        fArr.getClass();
        float[] fArr2 = eswVar.a;
        fArr2.getClass();
        System.arraycopy(fArr, 0, fArr2, 0, length);
        eswVar.f(aVar, 0);
        eswVar.f(aVar, 2);
        eswVar.f(aVar, 4);
        eswVar.f(aVar, 6);
        return eswVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4c)) {
            return false;
        }
        return Arrays.equals(this.a, ((e4c) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("anchor0: (");
        float[] fArr = this.a;
        sb.append(fArr[0]);
        sb.append(", ");
        sb.append(fArr[1]);
        sb.append(") control0: (");
        sb.append(fArr[2]);
        sb.append(", ");
        sb.append(fArr[3]);
        sb.append("), control1: (");
        sb.append(fArr[4]);
        sb.append(", ");
        sb.append(fArr[5]);
        sb.append("), anchor1: (");
        sb.append(a());
        sb.append(", ");
        sb.append(b());
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ e4c(int i) {
        this(new float[8]);
    }

    public e4c() {
        this(0);
    }
}
