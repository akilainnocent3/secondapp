package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class j1f0 extends d.c implements psr {
    public twd0<? extends List<z1f0>> D;
    public int E;
    public boolean F;
    public goh<g7f> G;
    public wd0<g7f, ij0> H;
    public wd0<g7f, ij0> I;
    public g7f J;
    public g7f K;

    @c0d(c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$2", f = "TabRow.kt", l = {715}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wd0<g7f, ij0> b;
        public final /* synthetic */ float c;
        public final /* synthetic */ j1f0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wd0<g7f, ij0> wd0Var, float f, j1f0 j1f0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = f;
            this.d = j1f0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
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
                g7f g7fVar = new g7f(this.c);
                goh<g7f> gohVar = this.d.G;
                this.a = 1;
                if (wd0.a(this.b, g7fVar, gohVar, null, null, this, 12) == y5bVar) {
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

    @c0d(c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$3", f = "TabRow.kt", l = {731}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wd0<g7f, ij0> b;
        public final /* synthetic */ float c;
        public final /* synthetic */ j1f0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wd0<g7f, ij0> wd0Var, float f, j1f0 j1f0Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = f;
            this.d = j1f0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                g7f g7fVar = new g7f(this.c);
                goh<g7f> gohVar = this.d.G;
                this.a = 1;
                if (wd0.a(this.b, g7fVar, gohVar, null, null, this, 12) == y5bVar) {
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

    public j1f0() {
        throw null;
    }

    @Override // defpackage.psr
    public final biv e(final t tVar, vhv vhvVar, long j) {
        g0h0 g0h0Var = gjs.d;
        if (((List) ((x5a0) this.D).getValue()).isEmpty()) {
            return t.z1(tVar, 0, 0, new e6u(1));
        }
        boolean z = this.F;
        twd0<? extends List<z1f0>> twd0Var = this.D;
        float f = z ? ((z1f0) ((List) ((x5a0) twd0Var).getValue()).get(this.E)).c : ((z1f0) ((List) ((x5a0) twd0Var).getValue()).get(this.E)).b;
        g7f g7fVar = this.K;
        if (g7fVar != null) {
            wd0<g7f, ij0> wd0Var = this.I;
            if (wd0Var == null) {
                wd0Var = new wd0<>(g7fVar, g0h0Var, null, 12);
                this.I = wd0Var;
            }
            if (!g7f.b(f, ((g7f) ((x5a0) wd0Var.e).getValue()).a)) {
                ej5.c(d2(), null, null, new a(wd0Var, f, this, null), 3);
            }
        } else {
            this.K = new g7f(f);
        }
        final float f2 = ((z1f0) ((List) ((x5a0) this.D).getValue()).get(this.E)).a;
        g7f g7fVar2 = this.J;
        if (g7fVar2 != null) {
            wd0<g7f, ij0> wd0Var2 = this.H;
            if (wd0Var2 == null) {
                wd0Var2 = new wd0<>(g7fVar2, g0h0Var, null, 12);
                this.H = wd0Var2;
            }
            if (!g7f.b(f2, ((g7f) ((x5a0) wd0Var2.e).getValue()).a)) {
                ej5.c(d2(), null, null, new b(wd0Var2, f2, this, null), 3);
            }
        } else {
            this.J = new g7f(f2);
        }
        asr layoutDirection = tVar.getLayoutDirection();
        asr asrVar = asr.a;
        wd0<g7f, ij0> wd0Var3 = this.H;
        if (layoutDirection != asrVar) {
            if (wd0Var3 != null) {
                f2 = wd0Var3.d().a;
            }
            f2 = -f2;
        } else if (wd0Var3 != null) {
            f2 = wd0Var3.d().a;
        }
        wd0<g7f, ij0> wd0Var4 = this.I;
        if (wd0Var4 != null) {
            f = wd0Var4.d().a;
        }
        final y yVarD0 = vhvVar.d0(kxa.b(tVar.y0(f), tVar.y0(f), 0, 0, 12, j));
        return t.z1(tVar, yVarD0.a, yVarD0.b, new Function1() { // from class: i1f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((y.a) obj).s(yVarD0, tVar.y0(f2), 0, 0.0f);
                return Unit.a;
            }
        });
    }
}
