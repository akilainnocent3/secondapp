package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w8k {
    public final des a;

    public static final class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(10080) + gpp.a(1440, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return pe4.b(this.a, "Limits(minDaily=", ", maxDaily=1440, maxWeekly=10080)");
        }
    }

    public w8k(des desVar) {
        desVar.getClass();
        this.a = desVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        x8k x8kVar;
        if (x1bVar instanceof x8k) {
            x8kVar = (x8k) x1bVar;
            int i = x8kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x8kVar.c = i - Integer.MIN_VALUE;
            } else {
                x8kVar = new x8k(this, x1bVar);
            }
        } else {
            x8kVar = new x8k(this, x1bVar);
        }
        Object objP = x8kVar.a;
        y5b y5bVar = y5b.a;
        int i2 = x8kVar.c;
        if (i2 == 0) {
            uj50.b(objP);
            x8kVar.c = 1;
            objP = this.a.p(x8kVar);
            if (objP == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objP);
        }
        return new a(((Number) objP).intValue());
    }
}
