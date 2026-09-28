package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hfs extends dx80 {
    public final List<j58> d;
    public final List<Float> e;
    public final long f;
    public final long g;
    public final int h;

    public hfs(List list, ArrayList arrayList, long j, long j2, int i) {
        this.d = list;
        this.e = arrayList;
        this.f = j;
        this.g = j2;
        this.h = i;
    }

    @Override // defpackage.dx80
    public final Shader b(long j) {
        long j2 = this.f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j2 >> 32)) == Float.POSITIVE_INFINITY ? j >> 32 : j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j2 & 4294967295L)) == Float.POSITIVE_INFINITY ? j & 4294967295L : j2 & 4294967295L));
        long j3 = this.g;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j3 >> 32)) == Float.POSITIVE_INFINITY ? j >> 32 : j3 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j3 & 4294967295L)) == Float.POSITIVE_INFINITY ? j & 4294967295L : j3 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List<j58> list = this.d;
        List<Float> list2 = this.e;
        ib0.d(list, list2);
        int iA = ib0.a(list);
        return new LinearGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)), ib0.b(iA, list), ib0.c(iA, list2, list), qc0.a(this.h));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfs)) {
            return false;
        }
        hfs hfsVar = (hfs) obj;
        return Intrinsics.g(this.d, hfsVar.d) && Intrinsics.g(this.e, hfsVar.e) && gly.c(this.f, hfsVar.f) && gly.c(this.g, hfsVar.g) && this.h == hfsVar.h;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        List<Float> list = this.e;
        return Integer.hashCode(this.h) + f87.a(f87.a((iHashCode + (list != null ? list.hashCode() : 0)) * 31, this.f, 31), this.g, 31);
    }

    public final String toString() {
        String str;
        long j = this.f;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) gly.h(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.g;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) gly.h(j2)) + ", ";
        }
        StringBuilder sb = new StringBuilder("LinearGradient(colors=");
        sb.append(this.d);
        sb.append(", stops=");
        gfs.a(", ", str, str2, sb, this.e);
        sb.append("tileMode=");
        sb.append((Object) csb.a(this.h));
        sb.append(')');
        return sb.toString();
    }
}
