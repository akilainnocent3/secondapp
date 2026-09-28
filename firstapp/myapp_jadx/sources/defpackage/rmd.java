package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;

/* JADX INFO: loaded from: classes4.dex */
public final class rmd {
    public final bb30<?> a;
    public final int b;
    public final int c;

    public rmd(bb30<?> bb30Var, int i, int i2) {
        tmy.a(bb30Var, "Null dependency anInterface.");
        this.a = bb30Var;
        this.b = i;
        this.c = i2;
    }

    public static rmd a(Class<?> cls) {
        return new rmd(0, 1, cls);
    }

    public static rmd b(bb30<?> bb30Var) {
        return new rmd(bb30Var, 1, 0);
    }

    public static rmd c(Class<?> cls) {
        return new rmd(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rmd)) {
            return false;
        }
        rmd rmdVar = (rmd) obj;
        return this.a.equals(rmdVar.a) && this.b == rmdVar.b && this.c == rmdVar.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = AnalyticsParam.EVENT_STREAM_PROVIDER;
        } else {
            if (i2 != 2) {
                jb5.a(hce0.a(i2, "Unsupported injection: "));
                return null;
            }
            str2 = "deferred";
        }
        return uf80.a(sb, str2, "}");
    }

    public rmd(int i, int i2, Class cls) {
        this((bb30<?>) bb30.a(cls), i, i2);
    }
}
