package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ae80
public final class yf80 {
    public static final b Companion = new b();
    public final Boolean a;
    public final Double b;
    public final Integer c;
    public final Integer d;
    public final Long e;

    @fae
    public /* synthetic */ class a implements o1k<yf80> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.google.firebase.sessions.settings.SessionConfigs", aVar, 5);
            kr10Var.j("sessionsEnabled", false);
            kr10Var.j("sessionSamplingRate", false);
            kr10Var.j("sessionTimeoutSeconds", false);
            kr10Var.j("cacheDurationSeconds", false);
            kr10Var.j("cacheUpdatedTimeSeconds", false);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            php<?> phpVarA = hj5.a(x15.a);
            php<?> phpVarA2 = hj5.a(z5f.a);
            hxo hxoVar = hxo.a;
            return new php[]{phpVarA, phpVarA2, hj5.a(hxoVar), hj5.a(hxoVar), hj5.a(okt.a)};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            boolean z = true;
            int i = 0;
            Boolean bool = null;
            Double d = null;
            Integer num = null;
            Integer num2 = null;
            Long l = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else if (iV == 0) {
                    bool = (Boolean) dmaVarC.n(pd80Var, 0, x15.a, bool);
                    i |= 1;
                } else if (iV == 1) {
                    d = (Double) dmaVarC.n(pd80Var, 1, z5f.a, d);
                    i |= 2;
                } else if (iV == 2) {
                    num = (Integer) dmaVarC.n(pd80Var, 2, hxo.a, num);
                    i |= 4;
                } else if (iV == 3) {
                    num2 = (Integer) dmaVarC.n(pd80Var, 3, hxo.a, num2);
                    i |= 8;
                } else {
                    if (iV != 4) {
                        jtf0.a(iV);
                        return null;
                    }
                    l = (Long) dmaVarC.n(pd80Var, 4, okt.a, l);
                    i |= 16;
                }
            }
            dmaVarC.b(pd80Var);
            return new yf80(i, bool, d, num, num2, l);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            yf80 yf80Var = (yf80) obj;
            yf80Var.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            fmaVarC.D(pd80Var, 0, x15.a, yf80Var.a);
            fmaVarC.D(pd80Var, 1, z5f.a, yf80Var.b);
            hxo hxoVar = hxo.a;
            fmaVarC.D(pd80Var, 2, hxoVar, yf80Var.c);
            fmaVarC.D(pd80Var, 3, hxoVar, yf80Var.d);
            fmaVarC.D(pd80Var, 4, okt.a, yf80Var.e);
            fmaVarC.b(pd80Var);
        }

        @Override // defpackage.o1k
        public final php<?>[] typeParametersSerializers() {
            return mr10.a;
        }
    }

    public static final class b {
        public final php<yf80> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ yf80(int i, Boolean bool, Double d, Integer num, Integer num2, Long l) {
        if (31 != (i & 31)) {
            cgo.a(i, 31, a.a.getDescriptor());
            throw null;
        }
        this.a = bool;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf80)) {
            return false;
        }
        yf80 yf80Var = (yf80) obj;
        return Intrinsics.g(this.a, yf80Var.a) && Intrinsics.g(this.b, yf80Var.b) && Intrinsics.g(this.c, yf80Var.c) && Intrinsics.g(this.d, yf80Var.d) && Intrinsics.g(this.e, yf80Var.e);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.e;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionsEnabled=" + this.a + ", sessionSamplingRate=" + this.b + ", sessionTimeoutSeconds=" + this.c + ", cacheDurationSeconds=" + this.d + ", cacheUpdatedTimeSeconds=" + this.e + ')';
    }

    public yf80(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.a = bool;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = l;
    }
}
