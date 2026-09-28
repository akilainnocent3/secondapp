package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class uyr extends d.c implements ya80 {
    public Function0<? extends c> D;
    public nyr E;
    public i3z F;
    public boolean G;
    public boolean H;
    public vo70 I;
    public final nfn J = new nfn(this, 1);
    public syr K;

    @c0d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", f = "LazyLayoutSemantics.kt", l = {213}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return uyr.this.new a(this.c, v1bVar);
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
                nyr nyrVar = uyr.this.E;
                this.a = 1;
                if (nyrVar.f(this.c, this) == y5bVar) {
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

    public uyr(Function0<? extends c> function0, nyr nyrVar, i3z i3zVar, boolean z, boolean z2) {
        this.D = function0;
        this.E = nyrVar;
        this.F = i3zVar;
        this.G = z;
        this.H = z2;
        p2();
    }

    @Override // defpackage.ya80
    public final void G0(pb80 pb80Var) {
        ohp<Object>[] ohpVarArr;
        lb80.j(pb80Var);
        pb80Var.b(hb80.L, this.J);
        i3z i3zVar = this.F;
        i3z i3zVar2 = i3z.a;
        vo70 vo70Var = this.I;
        if (i3zVar == i3zVar2) {
            if (vo70Var == null) {
                Intrinsics.n("scrollAxisRange");
                throw null;
            }
            ob80<vo70> ob80Var = hb80.u;
            ohpVarArr = lb80.a;
            ohp<Object> ohpVar = ohpVarArr[12];
            pb80Var.b(ob80Var, vo70Var);
        } else {
            if (vo70Var == null) {
                Intrinsics.n("scrollAxisRange");
                throw null;
            }
            ob80<vo70> ob80Var2 = hb80.t;
            ohpVarArr = lb80.a;
            ohp<Object> ohpVar2 = ohpVarArr[11];
            pb80Var.b(ob80Var2, vo70Var);
        }
        syr syrVar = this.K;
        if (syrVar != null) {
            pb80Var.b(ra80.f, new c6(null, syrVar));
        }
        pb80Var.b(ra80.B, new c6(null, new kb80(new tyr(this))));
        u38 u38VarC = this.E.c();
        ob80<u38> ob80Var3 = hb80.f;
        ohp<Object> ohpVar3 = ohpVarArr[22];
        pb80Var.b(ob80Var3, u38VarC);
    }

    @Override // androidx.compose.ui.d.c
    public final boolean e2() {
        return false;
    }

    public final void p2() {
        this.I = new vo70(new qyr(this, 0), new ryr(this, 0), this.H);
        this.K = this.G ? new syr(this, 0) : null;
    }
}
