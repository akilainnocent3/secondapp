package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public interface kjf0 {

    public static final class a implements kjf0 {
        public static final a a = new a();

        @Override // defpackage.kjf0
        public final float a() {
            return Float.NaN;
        }

        @Override // defpackage.kjf0
        public final long d() {
            int i = j58.n;
            return j58.m;
        }

        @Override // defpackage.kjf0
        public final ya5 e() {
            return null;
        }
    }

    float a();

    default kjf0 b(Function0<? extends kjf0> function0) {
        return !equals(a.a) ? this : function0.invoke();
    }

    default kjf0 c(kjf0 kjf0Var) {
        boolean z = kjf0Var instanceof ab5;
        if (!z || !(this instanceof ab5)) {
            if (!z || (this instanceof ab5)) {
                return (z || !(this instanceof ab5)) ? kjf0Var.b(new Function0() { // from class: jjf0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.a;
                    }
                }) : this;
            }
            return kjf0Var;
        }
        ab5 ab5Var = (ab5) kjf0Var;
        dx80 dx80Var = ab5Var.a;
        float f = ab5Var.b;
        if (Float.isNaN(f)) {
            f = ((ab5) this).b;
        }
        return new ab5(dx80Var, f);
    }

    long d();

    ya5 e();
}
