package defpackage;

import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class gw20 implements pd80 {
    public final String a;
    public final bw20 b;

    public gw20(String str, bw20 bw20Var) {
        bw20Var.getClass();
        this.a = str;
        this.b = bw20Var;
    }

    @Override // defpackage.pd80
    public final boolean b() {
        return false;
    }

    @Override // defpackage.pd80
    public final int c(String str) {
        str.getClass();
        a();
        throw null;
    }

    @Override // defpackage.pd80
    public final int d() {
        return 0;
    }

    @Override // defpackage.pd80
    public final String e(int i) {
        a();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw20)) {
            return false;
        }
        gw20 gw20Var = (gw20) obj;
        return this.a.equals(gw20Var.a) && Intrinsics.g(this.b, gw20Var.b);
    }

    @Override // defpackage.pd80
    public final List<Annotation> f(int i) {
        a();
        throw null;
    }

    @Override // defpackage.pd80
    public final pd80 g(int i) {
        a();
        throw null;
    }

    @Override // defpackage.pd80
    public final List<Annotation> getAnnotations() {
        return m2g.a;
    }

    @Override // defpackage.pd80
    public final yd80 getKind() {
        return this.b;
    }

    @Override // defpackage.pd80
    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.pd80
    public final boolean i(int i) {
        a();
        throw null;
    }

    @Override // defpackage.pd80
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return j26.a(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }

    public final void a() {
        throw new IllegalStateException(uf80.a(new StringBuilder("Primitive descriptor "), this.a, jbkEboCkTqmGf.wdrAAVP));
    }
}
