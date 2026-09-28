package defpackage;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public class os70 extends h3 implements tkt {
    public final x7k0 b;

    public static class a implements ukt {
        public final jso a;

        public a(qs70 qs70Var, String str) {
            this.a = new jso(str, lso.b, mso.a, qs70Var);
        }

        @Override // defpackage.ukt
        public final ukt a(String str) {
            this.a.f = str;
            return this;
        }

        @Override // defpackage.ukt
        public final ukt b(String str) {
            this.a.g = str;
            return this;
        }

        @Override // defpackage.ukt
        public tkt build() {
            return (tkt) this.a.b(new de30());
        }

        @Override // defpackage.ukt
        public final sdy c(Consumer<rdy> consumer) {
            return this.a.a(lso.d, consumer);
        }

        public final String toString() {
            return this.a.d(getClass().getSimpleName());
        }
    }

    public os70(bj1 bj1Var, x7k0 x7k0Var) {
        super(bj1Var);
        this.b = x7k0Var;
    }

    @Override // defpackage.tkt
    public final void a(long j, m21 m21Var) {
        this.b.b(j, m21Var, m0b.current());
    }
}
