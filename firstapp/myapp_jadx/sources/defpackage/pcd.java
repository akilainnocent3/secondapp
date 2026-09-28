package defpackage;

import androidx.compose.foundation.gestures.b;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pcd implements rq70 {
    public h4d<Float> a;
    public final b.a b;

    @c0d(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {981}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Float>, Object> {
        public aq40 a;
        public aj0 b;
        public int c;
        public final /* synthetic */ float d;
        public final /* synthetic */ pcd e;
        public final /* synthetic */ tp70 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, pcd pcdVar, tp70 tp70Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = f;
            this.e = pcdVar;
            this.f = tp70Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Float> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            float f;
            aj0 aj0Var;
            aq40 aq40Var;
            y5b y5bVar = y5b.a;
            int i = this.c;
            if (i == 0) {
                uj50.b(obj);
                f = this.d;
                if (Math.abs(f) > 1.0f) {
                    final aq40 aq40Var2 = new aq40();
                    aq40Var2.a = f;
                    final aq40 aq40Var3 = new aq40();
                    aj0 aj0VarA = cj0.a(28, 0.0f, f);
                    try {
                        final pcd pcdVar = this.e;
                        h4d<Float> h4dVar = pcdVar.a;
                        final tp70 tp70Var = this.f;
                        Function1 function1 = new Function1(tp70Var, aq40Var2, pcdVar) { // from class: ocd
                            public final /* synthetic */ tp70 b;
                            public final /* synthetic */ aq40 c;

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                vi0 vi0Var = (vi0) obj2;
                                float fFloatValue = ((Number) ((x5a0) vi0Var.e).getValue()).floatValue();
                                aq40 aq40Var4 = this.a;
                                float f2 = fFloatValue - aq40Var4.a;
                                float fE = this.b.e(f2);
                                aq40Var4.a = ((Number) ((x5a0) vi0Var.e).getValue()).floatValue();
                                this.c.a = ((Number) vi0Var.b()).floatValue();
                                if (Math.abs(f2 - fE) > 0.5f) {
                                    vi0Var.a();
                                }
                                return Unit.a;
                            }
                        };
                        this.a = aq40Var2;
                        this.b = aj0VarA;
                        this.c = 1;
                        if (sje0.d(aj0VarA, h4dVar, false, function1, this) == y5bVar) {
                            return y5bVar;
                        }
                        aq40Var = aq40Var2;
                        f = aq40Var.a;
                    } catch (CancellationException unused) {
                        aj0Var = aj0VarA;
                        aq40Var = aq40Var2;
                        aq40Var.a = ((Number) aj0Var.b()).floatValue();
                    }
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aj0Var = this.b;
                aq40Var = this.a;
                try {
                    uj50.b(obj);
                } catch (CancellationException unused2) {
                    aq40Var.a = ((Number) aj0Var.b()).floatValue();
                }
                f = aq40Var.a;
            }
            return new Float(f);
        }
    }

    public pcd() {
        throw null;
    }

    public pcd(h4d h4dVar) {
        b.a aVar = b.c;
        this.a = h4dVar;
        this.b = aVar;
    }

    @Override // defpackage.svh
    public final Object a(tp70 tp70Var, float f, v1b<? super Float> v1bVar) {
        return ej5.d(this.b, new a(f, this, tp70Var, null), v1bVar);
    }
}
