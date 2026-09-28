package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class b930 implements flx {
    public final y830 a;
    public final z830 b;

    @c0d(c = "com.sporty.android.compose.ui.util.pullrefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", l = {98}, m = "onPreFling-QWom1Mo", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public a(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return b930.this.k1(0L, this);
        }
    }

    public b930(y830 y830Var, z830 z830Var) {
        this.a = y830Var;
        this.b = z830Var;
    }

    @Override // defpackage.flx
    public final long h0(int i, long j) {
        if (i != 1) {
            return 0L;
        }
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i2) >= 0.0f) {
            return 0L;
        }
        float fFloatValue = ((Number) this.a.invoke(Float.valueOf(Float.intBitsToFloat(i2)))).floatValue();
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue)) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.flx
    public final Object k1(long j, v1b<? super exh0> v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((x1b) v1bVar);
            }
        } else {
            aVar = new a((x1b) v1bVar);
        }
        Object objInvoke = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.c;
        if (i2 == 0) {
            uj50.b(objInvoke);
            Float f = new Float(exh0.c(j));
            aVar.c = 1;
            objInvoke = this.b.invoke(f, aVar);
            if (objInvoke == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objInvoke);
        }
        return new exh0(fxh0.a(0.0f, ((Number) objInvoke).floatValue()));
    }

    @Override // defpackage.flx
    public final long w0(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) <= 0.0f) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits(((Number) this.a.invoke(Float.valueOf(Float.intBitsToFloat(i2)))).floatValue())) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }
}
