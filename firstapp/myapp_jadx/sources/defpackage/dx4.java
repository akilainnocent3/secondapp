package defpackage;

import com.sportybet.android.data.GetBonusResult;

/* JADX INFO: loaded from: classes7.dex */
@fae
public final class dx4 extends u4s {
    public final nzm b;
    public final ema c;
    public final l830<vr4> d;
    public GetBonusResult e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [faj, zw4] */
    public dx4(nzm nzmVar) throws Exception {
        ucy feyVar;
        super(0);
        this.b = nzmVar;
        ema emaVar = new ema();
        this.c = emaVar;
        l830<vr4> l830Var = new l830<>();
        this.d = l830Var;
        final yw4 yw4Var = new yw4(this, 0);
        ?? r0 = new faj() { // from class: zw4
            @Override // defpackage.faj
            public final Object apply(Object obj) {
                obj.getClass();
                return (dey) yw4Var.invoke(obj);
            }
        };
        int i = r2i.a;
        yby.c(i, "bufferSize");
        if (l830Var instanceof jy60) {
            T tCall = ((jy60) l830Var).call();
            feyVar = tCall == 0 ? gdy.a : new zdy.b(tCall, r0);
        } else {
            feyVar = new fey(l830Var, r0, i);
        }
        xdy xdyVarF = feyVar.f(va0.a());
        a aVar = new a();
        xdyVarF.a(aVar);
        emaVar.b(aVar);
    }

    @Override // defpackage.u4s
    public final hqc b() {
        return new nqc(this.e);
    }

    public final void f(int i, boolean z, boolean z2, int i2, long j, boolean z3) {
        this.d.onNext(new vr4(i, z, z2, i2, j, z3));
    }

    public static final class a extends zse<GetBonusResult> {
        public a() {
        }

        @Override // defpackage.kfy
        public final void onError(Throwable th) {
            th.getClass();
            dx4.this.c(new kqc());
        }

        @Override // defpackage.kfy
        public final void onNext(Object obj) {
            GetBonusResult getBonusResult = (GetBonusResult) obj;
            getBonusResult.getClass();
            dx4 dx4Var = dx4.this;
            dx4Var.e = getBonusResult;
            dx4Var.c(new mqc());
            dx4Var.c(new nqc(getBonusResult));
        }

        @Override // defpackage.kfy
        public final void onComplete() {
        }
    }
}
