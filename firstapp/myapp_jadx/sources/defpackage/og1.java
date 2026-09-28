package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class og1 extends qx5.h {
    public final String a;
    public final Class<?> b;
    public final wf80 c;
    public final snh0<?> d;
    public final Size e;
    public final k8e0 f;
    public final List<tnh0.b> g;

    public og1(String str, Class cls, wf80 wf80Var, snh0 snh0Var, Size size, k8e0 k8e0Var, ArrayList arrayList) {
        this.a = str;
        this.b = cls;
        if (wf80Var == null) {
            bmy.a("Null sessionConfig");
            throw null;
        }
        this.c = wf80Var;
        if (snh0Var == null) {
            bmy.a("Null useCaseConfig");
            throw null;
        }
        this.d = snh0Var;
        this.e = size;
        this.f = k8e0Var;
        this.g = arrayList;
    }

    @Override // qx5.h
    public final List<tnh0.b> a() {
        return this.g;
    }

    @Override // qx5.h
    public final wf80 b() {
        return this.c;
    }

    @Override // qx5.h
    public final k8e0 c() {
        return this.f;
    }

    @Override // qx5.h
    public final Size d() {
        return this.e;
    }

    @Override // qx5.h
    public final snh0<?> e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qx5.h)) {
            return false;
        }
        qx5.h hVar = (qx5.h) obj;
        if (!this.a.equals(hVar.f()) || !this.b.equals(hVar.g()) || !this.c.equals(hVar.b()) || !this.d.equals(hVar.e())) {
            return false;
        }
        Size size = this.e;
        if (size == null) {
            if (hVar.d() != null) {
                return false;
            }
        } else if (!size.equals(hVar.d())) {
            return false;
        }
        k8e0 k8e0Var = this.f;
        if (k8e0Var == null) {
            if (hVar.c() != null) {
                return false;
            }
        } else if (!k8e0Var.equals(hVar.c())) {
            return false;
        }
        List<tnh0.b> list = this.g;
        if (list == null) {
            return hVar.a() == null;
        }
        return list.equals(hVar.a());
    }

    @Override // qx5.h
    public final String f() {
        return this.a;
    }

    @Override // qx5.h
    public final Class<?> g() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        Size size = this.e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        k8e0 k8e0Var = this.f;
        int iHashCode3 = (iHashCode2 ^ (k8e0Var == null ? 0 : k8e0Var.hashCode())) * 1000003;
        List<tnh0.b> list = this.g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UseCaseInfo{useCaseId=");
        sb.append(this.a);
        sb.append(", useCaseType=");
        sb.append(this.b);
        sb.append(", sessionConfig=");
        sb.append(this.c);
        sb.append(", useCaseConfig=");
        sb.append(this.d);
        sb.append(", surfaceResolution=");
        sb.append(this.e);
        sb.append(", streamSpec=");
        sb.append(this.f);
        sb.append(", captureTypes=");
        return ng1.a(sb, this.g, "}");
    }
}
