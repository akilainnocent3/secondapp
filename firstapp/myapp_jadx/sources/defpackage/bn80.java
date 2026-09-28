package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class bn80 implements cbs {
    public final uy1 a;
    public final a b;
    public boolean c;
    public boolean d;
    public boolean e;
    public Long f;

    public interface a {
        void a(xc xcVar);
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s9s.a.values().length];
            try {
                iArr[s9s.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s9s.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s9s.a.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public bn80(uy1 uy1Var, a aVar) {
        this.a = uy1Var;
        this.b = aVar;
    }

    @Override // defpackage.cbs
    public final void F0(ibs ibsVar, s9s.a aVar) {
        if (this.e) {
            return;
        }
        int i = b.a[aVar.ordinal()];
        a aVar2 = this.b;
        boolean z = true;
        if (i == 1) {
            boolean z2 = this.c;
            this.c = true;
            boolean z3 = this.d;
            Long l = this.f;
            if (l != null) {
                z = System.currentTimeMillis() - l.longValue() >= 500;
            }
            if (!z2 && z3 && z) {
                aVar2.a(xc.a.a);
                return;
            }
            return;
        }
        uy1 uy1Var = this.a;
        if (i != 2) {
            if (i != 3) {
                return;
            }
            this.e = true;
            uy1Var.getLifecycle().d(this);
            return;
        }
        boolean z4 = (!this.c || uy1Var.isChangingConfigurations() || uy1Var.isFinishing()) ? false : true;
        this.c = false;
        if (z4) {
            this.d = true;
            this.f = Long.valueOf(System.currentTimeMillis());
            aVar2.a(xc.b.a);
        }
    }
}
