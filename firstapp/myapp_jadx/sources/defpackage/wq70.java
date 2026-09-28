package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wq70 implements flx {
    public final wr70 a;
    public boolean b;

    @c0d(c = "androidx.compose.foundation.gestures.ScrollableNestedScrollConnection", f = "Scrollable.kt", l = {924}, m = "onPostFling-RZ2iAVY")
    public static final class a extends x1b {
        public long a;
        public /* synthetic */ Object b;
        public int d;

        public a(x1b x1bVar) {
            super(x1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return wq70.this.X1(0L, 0L, this);
        }
    }

    public wq70(wr70 wr70Var, boolean z) {
        this.a = wr70Var;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.flx
    public final Object X1(long j, long j2, v1b<? super exh0> v1bVar) {
        a aVar;
        long jD;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((x1b) v1bVar);
            }
        } else {
            aVar = new a((x1b) v1bVar);
        }
        Object objA = aVar.b;
        y5b y5bVar = y5b.a;
        int i2 = aVar.d;
        if (i2 == 0) {
            uj50.b(objA);
            jD = 0;
            if (this.b) {
                wr70 wr70Var = this.a;
                if (!wr70Var.i) {
                    aVar.a = j2;
                    aVar.d = 1;
                    objA = wr70Var.a(j2, aVar);
                    if (objA == y5bVar) {
                        return y5bVar;
                    }
                }
                jD = exh0.d(j2, jD);
            }
            return new exh0(jD);
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = aVar.a;
        uj50.b(objA);
        jD = ((exh0) objA).a;
        jD = exh0.d(j2, jD);
        return new exh0(jD);
    }

    @Override // defpackage.flx
    public final long w0(int i, long j, long j2) {
        if (!this.b) {
            return 0L;
        }
        wr70 wr70Var = this.a;
        if (wr70Var.a.c()) {
            return 0L;
        }
        return wr70Var.h(wr70Var.d(wr70Var.a.a(wr70Var.d(wr70Var.g(j2)))));
    }
}
