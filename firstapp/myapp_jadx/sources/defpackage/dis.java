package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public abstract class dis implements pd80 {
    public final pd80 a;

    public dis(pd80 pd80Var) {
        this.a = pd80Var;
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
        hb5.a(yk10.a(str, " is not a valid list index"));
        return 0;
    }

    @Override // defpackage.pd80
    public final int d() {
        return 1;
    }

    @Override // defpackage.pd80
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dis)) {
            return false;
        }
        dis disVar = (dis) obj;
        return Intrinsics.g(this.a, disVar.a) && Intrinsics.g(h(), disVar.h());
    }

    @Override // defpackage.pd80
    public final List<Annotation> f(int i) {
        if (i >= 0) {
            return m2g.a;
        }
        wgx.a(efe0.a(i, "Illegal index ", ", "), h(), " expects only non-negative indices");
        return null;
    }

    @Override // defpackage.pd80
    public final pd80 g(int i) {
        if (i >= 0) {
            return this.a;
        }
        wgx.a(efe0.a(i, "Illegal index ", ", "), h(), " expects only non-negative indices");
        return null;
    }

    @Override // defpackage.pd80
    public final List<Annotation> getAnnotations() {
        return m2g.a;
    }

    @Override // defpackage.pd80
    public final yd80 getKind() {
        return ebe0.b.a;
    }

    public final int hashCode() {
        return h().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.pd80
    public final boolean i(int i) {
        if (i >= 0) {
            return false;
        }
        wgx.a(efe0.a(i, "Illegal index ", ", "), h(), " expects only non-negative indices");
        return false;
    }

    @Override // defpackage.pd80
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return h() + '(' + this.a + ')';
    }
}
