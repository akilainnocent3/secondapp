package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@ae80
public final class ktf0 {
    public static final b Companion = new b();
    public final long a;
    public final long b;
    public final long c;

    @fae
    public /* synthetic */ class a implements o1k<ktf0> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.google.firebase.sessions.Time", aVar, 3);
            kr10Var.j("ms", false);
            kr10Var.j("us", true);
            kr10Var.j("seconds", true);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            okt oktVar = okt.a;
            return new php[]{oktVar, oktVar, oktVar};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            int i = 0;
            long jR = 0;
            long jR2 = 0;
            long jR3 = 0;
            boolean z = true;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else if (iV == 0) {
                    jR = dmaVarC.r(pd80Var, 0);
                    i |= 1;
                } else if (iV == 1) {
                    jR2 = dmaVarC.r(pd80Var, 1);
                    i |= 2;
                } else {
                    if (iV != 2) {
                        jtf0.a(iV);
                        return null;
                    }
                    jR3 = dmaVarC.r(pd80Var, 2);
                    i |= 4;
                }
            }
            dmaVarC.b(pd80Var);
            return new ktf0(jR, jR2, jR3, i);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            ktf0 ktf0Var = (ktf0) obj;
            ktf0Var.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            long j = ktf0Var.a;
            long j2 = ktf0Var.c;
            long j3 = ktf0Var.b;
            fmaVarC.f(pd80Var, 0, j);
            if (fmaVarC.a(pd80Var) || j3 != j * 1000) {
                fmaVarC.f(pd80Var, 1, j3);
            }
            if (fmaVarC.a(pd80Var) || j2 != j / 1000) {
                fmaVarC.f(pd80Var, 2, j2);
            }
            fmaVarC.b(pd80Var);
        }

        @Override // defpackage.o1k
        public final php<?>[] typeParametersSerializers() {
            return mr10.a;
        }
    }

    public static final class b {
        public final php<ktf0> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ ktf0(long j, long j2, long j3, int i) {
        if (1 != (i & 1)) {
            cgo.a(i, 1, a.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = (i & 2) == 0 ? j * 1000 : j2;
        if ((i & 4) == 0) {
            this.c = j / 1000;
        } else {
            this.c = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ktf0) && this.a == ((ktf0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return uvh.a(new StringBuilder("Time(ms="), this.a, ')');
    }

    public ktf0(long j) {
        this.a = j;
        this.b = j * 1000;
        this.c = j / 1000;
    }
}
