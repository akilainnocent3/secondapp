package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public abstract class tou implements pd80 {
    public final String a;
    public final pd80 b;
    public final pd80 c;

    public tou(String str, pd80 pd80Var, pd80 pd80Var2) {
        this.a = str;
        this.b = pd80Var;
        this.c = pd80Var2;
    }

    @Override // defpackage.pd80
    public final boolean b() {
        return false;
    }

    @Override // defpackage.pd80
    public final int c(String str) {
        str.getClass();
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        hb5.a(yk10.a(str, " is not a valid map index"));
        return 0;
    }

    @Override // defpackage.pd80
    public final int d() {
        return 2;
    }

    @Override // defpackage.pd80
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tou)) {
            return false;
        }
        tou touVar = (tou) obj;
        return this.a.equals(touVar.a) && this.b.equals(touVar.b) && this.c.equals(touVar.c);
    }

    @Override // defpackage.pd80
    public final List<Annotation> f(int i) {
        if (i >= 0) {
            return m2g.a;
        }
        kb5.a(uf80.a(efe0.a(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
        return null;
    }

    @Override // defpackage.pd80
    public final pd80 g(int i) {
        if (i < 0) {
            kb5.a(uf80.a(efe0.a(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.b;
        }
        if (i2 == 1) {
            return this.c;
        }
        ib5.a("Unreached");
        return null;
    }

    @Override // defpackage.pd80
    public final List<Annotation> getAnnotations() {
        return m2g.a;
    }

    @Override // defpackage.pd80
    public final yd80 getKind() {
        return ebe0.c.a;
    }

    @Override // defpackage.pd80
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.pd80
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        kb5.a(uf80.a(efe0.a(i, "Illegal index ", ", "), this.a, " expects only non-negative indices"));
        return false;
    }

    @Override // defpackage.pd80
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return this.a + '(' + this.b + ", " + this.c + ')';
    }
}
