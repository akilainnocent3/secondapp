package defpackage;

import com.sportygames.common.business.CommonGameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class xw4 extends j8i0 {
    public final xs0 a;
    public final wrm b;
    public final mpe0 c;
    public final wwd0 d;
    public final wwd0 e;
    public CommonGameDetails f;
    public Integer i;
    public Integer v;
    public final wwd0 w;
    public final a390<nw4> y;
    public nt4 z;

    @c0d(c = "com.sportygames.compose.campaign.vault.BonusVaultViewModel$closeBonusVaultToast$1", f = "BonusVaultViewModel.kt", l = {92}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return xw4.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wrm wrmVar = xw4.this.b;
                this.a = 1;
                if (wrmVar.b(this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.compose.campaign.vault.BonusVaultViewModel$selectBonusGame$1", f = "BonusVaultViewModel.kt", l = {62, 65, 71, 75, 77}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public int b;
        public boolean c;
        public int d;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return xw4.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x008d  */
        /* JADX WARN: Code duplicated, block: B:40:0x009e  */
        /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00b2, code lost:
        
            if (kotlin.Unit.a == r2) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00c7, code lost:
        
            if (kotlin.Unit.a == r2) goto L46;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: xw4.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public xw4(xs0 xs0Var, wrm wrmVar) {
        wrmVar.getClass();
        this.a = xs0Var;
        this.b = wrmVar;
        this.c = hwr.b(new ww4(this, 0));
        Boolean bool = Boolean.FALSE;
        this.d = xwd0.a(bool);
        this.e = xwd0.a(bool);
        this.w = xwd0.a(cnj.a);
        this.y = wrmVar.c();
    }

    public final void A1() {
        Boolean bool = Boolean.TRUE;
        wwd0 wwd0Var = this.d;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
    }

    public final void x1() {
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    public final void y1() {
        cnj cnjVar = cnj.a;
        wwd0 wwd0Var = this.w;
        wwd0Var.getClass();
        wwd0Var.k(null, cnjVar);
        this.z = null;
        this.i = null;
        this.v = null;
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0Var2 = this.e;
        wwd0Var2.getClass();
        wwd0Var2.k(null, bool);
    }

    public final void z1() {
        ej5.c(o8i0.d(this), null, null, new b(null), 3);
    }
}
