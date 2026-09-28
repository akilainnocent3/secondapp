package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@ae80
public final class xr50 {
    public static final b Companion = new b();
    public final long a;
    public final boolean b;

    @fae
    public static final /* synthetic */ class a implements o1k<xr50> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sporty.android.platform.features.welcomereward.RewardRewardCacheData", aVar, 2);
            kr10Var.j("lastRecordTime", true);
            kr10Var.j("isClickedOrViewed", false);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            return new php[]{okt.a, x15.a};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            long jR = 0;
            boolean z = true;
            int i = 0;
            boolean zE = false;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else if (iV == 0) {
                    jR = dmaVarC.r(pd80Var, 0);
                    i |= 1;
                } else {
                    if (iV != 1) {
                        jtf0.a(iV);
                        return null;
                    }
                    zE = dmaVarC.E(pd80Var, 1);
                    i |= 2;
                }
            }
            dmaVarC.b(pd80Var);
            return new xr50(i, jR, zE);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            xr50 xr50Var = (xr50) obj;
            xr50Var.getClass();
            long j = xr50Var.a;
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            if (fmaVarC.a(pd80Var) || j != 0) {
                fmaVarC.f(pd80Var, 0, j);
            }
            fmaVarC.i(pd80Var, 1, xr50Var.b);
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<xr50> serializer() {
            return a.a;
        }
    }

    public /* synthetic */ xr50(int i, long j, boolean z) {
        if (2 != (i & 2)) {
            cgo.a(i, 2, a.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = 0L;
        } else {
            this.a = j;
        }
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr50)) {
            return false;
        }
        xr50 xr50Var = (xr50) obj;
        return this.a == xr50Var.a && this.b == xr50Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RewardRewardCacheData(lastRecordTime=" + this.a + ", isClickedOrViewed=" + this.b + ")";
    }

    public xr50(long j, boolean z) {
        this.a = j;
        this.b = z;
    }
}
