package zj;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0<?> f161990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f161991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f161992c;

    public w(Class<?> cls, int i10, int i11) {
        this((k0<?>) k0.b(cls), i10, i11);
    }

    public static w a(Class<?> cls) {
        return new w(cls, 0, 2);
    }

    public static w b(k0<?> k0Var) {
        return new w(k0Var, 0, 2);
    }

    public static String c(int i10) {
        if (i10 == 0) {
            return DevicePublicKeyStringDef.DIRECT;
        }
        if (i10 == 1) {
            return IronSourceConstants.EVENTS_PROVIDER;
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    @Deprecated
    public static w i(Class<?> cls) {
        return new w(cls, 0, 0);
    }

    public static w j(Class<?> cls) {
        return new w(cls, 0, 1);
    }

    public static w k(k0<?> k0Var) {
        return new w(k0Var, 0, 1);
    }

    public static w l(Class<?> cls) {
        return new w(cls, 1, 0);
    }

    public static w m(k0<?> k0Var) {
        return new w(k0Var, 1, 0);
    }

    public static w n(Class<?> cls) {
        return new w(cls, 1, 1);
    }

    public static w o(k0<?> k0Var) {
        return new w(k0Var, 1, 1);
    }

    public static w p(Class<?> cls) {
        return new w(cls, 2, 0);
    }

    public static w q(k0<?> k0Var) {
        return new w(k0Var, 2, 0);
    }

    public static w r(Class<?> cls) {
        return new w(cls, 2, 1);
    }

    public static w s(k0<?> k0Var) {
        return new w(k0Var, 2, 1);
    }

    public k0<?> d() {
        return this.f161990a;
    }

    public boolean e() {
        return this.f161992c == 2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f161990a.equals(wVar.f161990a) && this.f161991b == wVar.f161991b && this.f161992c == wVar.f161992c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f161992c == 0;
    }

    public boolean g() {
        return this.f161991b == 1;
    }

    public boolean h() {
        return this.f161991b == 2;
    }

    public int hashCode() {
        return ((((this.f161990a.hashCode() ^ 1000003) * 1000003) ^ this.f161991b) * 1000003) ^ this.f161992c;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f161990a);
        sb2.append(", type=");
        int i10 = this.f161991b;
        if (i10 == 1) {
            str = "required";
        } else {
            str = i10 == 0 ? "optional" : "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        sb2.append(c(this.f161992c));
        sb2.append("}");
        return sb2.toString();
    }

    public w(k0<?> k0Var, int i10, int i11) {
        this.f161990a = (k0) j0.c(k0Var, "Null dependency anInterface.");
        this.f161991b = i10;
        this.f161992c = i11;
    }
}
