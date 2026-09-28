package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import com.google.protobuf.Reader;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vu30 extends dx80 {
    public final List<j58> d;
    public final List<Float> e;
    public final long f;
    public final float g;

    public vu30(List list, ArrayList arrayList, long j, float f) {
        this.d = list;
        this.e = arrayList;
        this.f = j;
        this.g = f;
    }

    @Override // defpackage.dx80
    public final Shader b(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.f;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long jA = wo9.a(j);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        float fC = this.g;
        if (fC == Float.POSITIVE_INFINITY) {
            fC = yw90.c(j) / 2.0f;
        }
        float f = fC;
        List<j58> list = this.d;
        List<Float> list2 = this.e;
        ib0.d(list, list2);
        int iA = ib0.a(list);
        return new RadialGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), f, ib0.b(iA, list), ib0.c(iA, list2, list), qc0.a(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu30)) {
            return false;
        }
        vu30 vu30Var = (vu30) obj;
        return Intrinsics.g(this.d, vu30Var.d) && Intrinsics.g(this.e, vu30Var.e) && gly.c(this.f, vu30Var.f) && this.g == vu30Var.g;
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        List<Float> list = this.e;
        return Integer.hashCode(0) + tvh.a(this.g, f87.a((iHashCode + (list != null ? list.hashCode() : 0)) * 31, this.f, 31), 31);
    }

    public final String toString() {
        String str;
        long j = this.f;
        long j2 = 9223372034707292159L & j;
        String str2 = dqvOSm.hAEaGoRlJMO;
        if (j2 != 9205357640488583168L) {
            str = "center=" + ((Object) gly.h(j)) + ", ";
        } else {
            str = str2;
        }
        float f = this.g;
        if ((Float.floatToRawIntBits(f) & Reader.READ_DONE) < 2139095040) {
            str2 = "radius=" + f + ", ";
        }
        StringBuilder sb = new StringBuilder("RadialGradient(colors=");
        sb.append(this.d);
        sb.append(", stops=");
        gfs.a(", ", str, str2, sb, this.e);
        sb.append("tileMode=");
        sb.append((Object) csb.a(0));
        sb.append(')');
        return sb.toString();
    }
}
