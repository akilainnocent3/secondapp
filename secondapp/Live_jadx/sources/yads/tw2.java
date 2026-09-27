package yads;

import com.ironsource.C4235d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xw2 f156111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xw2 f156112b;

    public tw2(xw2 xw2Var) {
        this(xw2Var, xw2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tw2.class == obj.getClass()) {
            tw2 tw2Var = (tw2) obj;
            if (this.f156111a.equals(tw2Var.f156111a) && this.f156112b.equals(tw2Var.f156112b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f156112b.hashCode() + (this.f156111a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder(C4235d4.j.f61460d);
        sb2.append(this.f156111a);
        if (this.f156111a.equals(this.f156112b)) {
            str = "";
        } else {
            str = ", " + this.f156112b;
        }
        sb2.append(str);
        sb2.append(C4235d4.j.f61462e);
        return sb2.toString();
    }

    public tw2(xw2 xw2Var, xw2 xw2Var2) {
        this.f156111a = (xw2) ni.a(xw2Var);
        this.f156112b = (xw2) ni.a(xw2Var2);
    }
}
