package defpackage;

import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.utils.TP.sgwpmp;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ig1 extends a21 {
    public final vge0 a;
    public final int b;
    public final Size c;
    public final dhf d;
    public final List<tnh0.b> e;
    public final hoa f;
    public final int g;
    public final Range<Integer> h;
    public final boolean i;

    public ig1(vge0 vge0Var, int i, Size size, dhf dhfVar, List<tnh0.b> list, hoa hoaVar, int i2, Range<Integer> range, boolean z) {
        this.a = vge0Var;
        this.b = i;
        if (size == null) {
            bmy.a("Null size");
            throw null;
        }
        this.c = size;
        if (dhfVar == null) {
            bmy.a("Null dynamicRange");
            throw null;
        }
        this.d = dhfVar;
        if (list == null) {
            bmy.a("Null captureTypes");
            throw null;
        }
        this.e = list;
        this.f = hoaVar;
        this.g = i2;
        if (range == null) {
            bmy.a("Null targetFrameRate");
            throw null;
        }
        this.h = range;
        this.i = z;
    }

    @Override // defpackage.a21
    public final List<tnh0.b> a() {
        return this.e;
    }

    @Override // defpackage.a21
    public final dhf b() {
        return this.d;
    }

    @Override // defpackage.a21
    public final int c() {
        return this.b;
    }

    @Override // defpackage.a21
    public final hoa d() {
        return this.f;
    }

    @Override // defpackage.a21
    public final int e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a21)) {
            return false;
        }
        a21 a21Var = (a21) obj;
        if (!this.a.equals(a21Var.g()) || this.b != a21Var.c() || !this.c.equals(a21Var.f()) || !this.d.equals(a21Var.b()) || !this.e.equals(a21Var.a())) {
            return false;
        }
        hoa hoaVar = this.f;
        if (hoaVar == null) {
            if (a21Var.d() != null) {
                return false;
            }
        } else if (!hoaVar.equals(a21Var.d())) {
            return false;
        }
        return this.g == a21Var.e() && this.h.equals(a21Var.h()) && this.i == a21Var.i();
    }

    @Override // defpackage.a21
    public final Size f() {
        return this.c;
    }

    @Override // defpackage.a21
    public final vge0 g() {
        return this.a;
    }

    @Override // defpackage.a21
    public final Range<Integer> h() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        hoa hoaVar = this.f;
        return (this.i ? 1231 : 1237) ^ ((((((iHashCode ^ (hoaVar == null ? 0 : hoaVar.hashCode())) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003);
    }

    @Override // defpackage.a21
    public final boolean i() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachedSurfaceInfo{surfaceConfig=");
        sb.append(this.a);
        sb.append(", imageFormat=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(sgwpmp.dSRyhgOP);
        sb.append(this.d);
        sb.append(", captureTypes=");
        sb.append(this.e);
        sb.append(", implementationOptions=");
        sb.append(this.f);
        sb.append(", sessionType=");
        sb.append(this.g);
        sb.append(", targetFrameRate=");
        sb.append(this.h);
        sb.append(", strictFrameRateRequired=");
        return mq0.a(sb, this.i, "}");
    }
}
