package defpackage;

import com.sporty.android.core.model.OrderBetType;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class vi90 implements ui90 {
    public final zqk a;
    public final ln90 b;
    public final j1b c;
    public jvd0 d;
    public jvd0 e;
    public final wwd0 f;
    public final wwd0 g;
    public final v340 h;
    public final v340 i;

    @c0d(c = "com.sportybet.android.instantwin.manager.gift.SimGiftManagerImpl$fetchGifts$1", f = "SimGiftManagerImpl.kt", l = {59}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: vi90$a$a, reason: collision with other inner class name */
        public static final class C1214a<T> implements myh {
            public final /* synthetic */ vi90 a;

            public C1214a(vi90 vi90Var) {
                this.a = vi90Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                Object value;
                lk50 lk50Var = (lk50) obj;
                wwd0 wwd0Var = this.a.f;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, lk50Var));
                return Unit.a;
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return vi90.this.new a(v1bVar);
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
                vi90 vi90Var = vi90.this;
                yzh yzhVarA = bm50.a(vi90Var.a.a(114, new Integer(OrderBetType.ALL.getValue())));
                C1214a c1214a = new C1214a(vi90Var);
                this.a = 1;
                if (yzhVarA.collect(c1214a, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.instantwin.manager.gift.SimGiftManagerImpl$fetchSimulationConfig$1", f = "SimGiftManagerImpl.kt", l = {43}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return vi90.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objC;
            Object value;
            y5b y5bVar = y5b.a;
            int i = this.a;
            vi90 vi90Var = vi90.this;
            if (i == 0) {
                uj50.b(obj);
                ln90 ln90Var = vi90Var.b;
                this.a = 1;
                objC = ln90Var.c(this);
                if (objC == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objC = ((zi50) obj).a;
            }
            zi50.a aVar = zi50.b;
            if (!(objC instanceof zi50.b)) {
                tm90 tm90Var = (tm90) objC;
                wwd0 wwd0Var = vi90Var.g;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, tm90Var));
            }
            return Unit.a;
        }
    }

    public vi90(zqk zqkVar, ln90 ln90Var, j1b j1bVar) {
        this.a = zqkVar;
        this.b = ln90Var;
        this.c = j1bVar;
        lk50.b bVar = lk50.b.a;
        wwd0 wwd0VarA = xwd0.a(bVar);
        this.f = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.g = wwd0VarA2;
        this.h = e1i.e(wwd0VarA, j1bVar, new mwd0(0L, Long.MAX_VALUE), bVar);
        this.i = e1i.b(wwd0VarA2);
    }

    @Override // defpackage.ui90
    public final v340 a() {
        return this.i;
    }

    @Override // defpackage.ui90
    public final void b() {
        jvd0 jvd0Var = this.e;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.e = ej5.c(this.c, null, null, new b(null), 3);
    }

    @Override // defpackage.ui90
    public final void c() {
        jvd0 jvd0Var = this.d;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.f.setValue(lk50.b.a);
        this.d = ej5.c(this.c, null, null, new a(null), 3);
    }

    @Override // defpackage.ui90
    public final v340 d() {
        return this.h;
    }
}
