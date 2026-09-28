package defpackage;

import android.util.Range;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class xk1 extends k8e0 {
    public final Size b;
    public final Size c;
    public final dhf d;
    public final int e;
    public final Range<Integer> f;
    public final hoa g;
    public final boolean h;

    public static final class a extends k8e0.a {
        public Size a;
        public Size b;
        public dhf c;
        public Integer d;
        public Range<Integer> e;
        public hoa f;
        public Boolean g;

        public final xk1 a() {
            String strConcat = this.a == null ? " resolution" : "";
            if (this.b == null) {
                strConcat = strConcat.concat(" originalConfiguredResolution");
            }
            if (this.c == null) {
                strConcat = strConcat.concat(" dynamicRange");
            }
            if (this.d == null) {
                strConcat = strConcat.concat(" sessionType");
            }
            if (this.e == null) {
                strConcat = strConcat.concat(" expectedFrameRateRange");
            }
            if (this.g == null) {
                strConcat = strConcat.concat(" zslDisabled");
            }
            if (strConcat.isEmpty()) {
                return new xk1(this.a, this.b, this.c, this.d.intValue(), this.e, this.f, this.g.booleanValue());
            }
            ib5.a("Missing required properties:".concat(strConcat));
            return null;
        }
    }

    public xk1(Size size, Size size2, dhf dhfVar, int i, Range<Integer> range, hoa hoaVar, boolean z) {
        this.b = size;
        this.c = size2;
        this.d = dhfVar;
        this.e = i;
        this.f = range;
        this.g = hoaVar;
        this.h = z;
    }

    @Override // defpackage.k8e0
    public final dhf b() {
        return this.d;
    }

    @Override // defpackage.k8e0
    public final Range<Integer> c() {
        return this.f;
    }

    @Override // defpackage.k8e0
    public final hoa d() {
        return this.g;
    }

    @Override // defpackage.k8e0
    public final Size e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k8e0)) {
            return false;
        }
        k8e0 k8e0Var = (k8e0) obj;
        if (!this.b.equals(k8e0Var.f()) || !this.c.equals(k8e0Var.e()) || !this.d.equals(k8e0Var.b()) || this.e != k8e0Var.g() || !this.f.equals(k8e0Var.c())) {
            return false;
        }
        hoa hoaVar = this.g;
        if (hoaVar == null) {
            if (k8e0Var.d() != null) {
                return false;
            }
        } else if (!hoaVar.equals(k8e0Var.d())) {
            return false;
        }
        return this.h == k8e0Var.h();
    }

    @Override // defpackage.k8e0
    public final Size f() {
        return this.b;
    }

    @Override // defpackage.k8e0
    public final int g() {
        return this.e;
    }

    @Override // defpackage.k8e0
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003;
        hoa hoaVar = this.g;
        return (this.h ? 1231 : 1237) ^ ((iHashCode ^ (hoaVar == null ? 0 : hoaVar.hashCode())) * 1000003);
    }

    @Override // defpackage.k8e0
    public final a i() {
        a aVar = new a();
        aVar.a = this.b;
        aVar.b = this.c;
        aVar.c = this.d;
        aVar.d = Integer.valueOf(this.e);
        aVar.e = this.f;
        aVar.f = this.g;
        aVar.g = Boolean.valueOf(this.h);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.b);
        sb.append(", originalConfiguredResolution=");
        sb.append(this.c);
        sb.append(", dynamicRange=");
        sb.append(this.d);
        sb.append(", sessionType=");
        sb.append(this.e);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.f);
        sb.append(", implementationOptions=");
        sb.append(this.g);
        sb.append(", zslDisabled=");
        return mq0.a(sb, this.h, "}");
    }
}
