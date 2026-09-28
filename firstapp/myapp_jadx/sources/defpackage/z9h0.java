package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface z9h0 extends twd0<Object> {

    public static final class a implements z9h0, twd0<Object> {
        public final vz0 a;

        public a(vz0 vz0Var) {
            this.a = vz0Var;
        }

        @Override // defpackage.twd0
        public final Object getValue() {
            return ((x5a0) this.a.f).getValue();
        }

        @Override // defpackage.z9h0
        public final boolean i() {
            return this.a.i;
        }
    }

    public static final class b implements z9h0 {
        public final Object a;
        public final boolean b;

        public b(Object obj, boolean z) {
            this.a = obj;
            this.b = z;
        }

        @Override // defpackage.twd0
        public final Object getValue() {
            return this.a;
        }

        @Override // defpackage.z9h0
        public final boolean i() {
            return this.b;
        }
    }

    boolean i();
}
