package defpackage;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsf40;", "Lj8i0;", "recap"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class sf40 extends j8i0 {
    public final qck a;
    public final ure b;
    public final tre c;
    public final rdd0 d;
    public final boolean e;
    public final wwd0 f;
    public final v340 i;
    public final b390 v;
    public final t340 w;

    @c0d(c = "com.sportybet.feature.recap.presentation.RecapViewModel$handleAction$1", f = "RecapViewModel.kt", l = {123}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return sf40.this.new a(v1bVar);
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
                b390 b390Var = sf40.this.v;
                of40.a aVar = of40.a.a;
                this.a = 1;
                if (b390Var.emit(aVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.recap.presentation.RecapViewModel$handleAction$2", f = "RecapViewModel.kt", l = {130}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return sf40.this.new b(v1bVar);
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
                b390 b390Var = sf40.this.v;
                of40.b bVar = of40.b.a;
                this.a = 1;
                if (b390Var.emit(bVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.recap.presentation.RecapViewModel$handleAction$3", f = "RecapViewModel.kt", l = {136}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return sf40.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                b390 b390Var = sf40.this.v;
                of40.d dVar = of40.d.a;
                this.a = 1;
                if (b390Var.emit(dVar, this) == y5bVar) {
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

    public sf40(qck qckVar, ure ureVar, tre treVar, rdd0 rdd0Var, eel eelVar) {
        rdd0Var.getClass();
        this.a = qckVar;
        this.b = ureVar;
        this.c = treVar;
        this.d = rdd0Var;
        this.e = eelVar.a.b();
        wwd0 wwd0VarA = xwd0.a(new pf40(0));
        this.f = wwd0VarA;
        this.i = e1i.b(wwd0VarA);
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.v = b390VarB;
        this.w = e1i.a(b390VarB);
        ej5.c(o8i0.d(this), null, null, new tf40(this, null), 3);
        ej5.c(o8i0.d(this), null, null, new qf40(this, null), 3);
    }

    public final void x1(nc40 nc40Var) {
        if (nc40Var.equals(nc40.a.a)) {
            ej5.c(o8i0.d(this), null, null, new a(null), 3);
            return;
        }
        if (nc40Var.equals(nc40.g.a) || nc40Var.equals(nc40.c.a)) {
            ej5.c(o8i0.d(this), null, null, new b(null), 3);
            return;
        }
        if (nc40Var.equals(nc40.d.a)) {
            ej5.c(o8i0.d(this), null, null, new c(null), 3);
            return;
        }
        if (nc40Var.equals(nc40.b.a)) {
            ej5.c(o8i0.d(this), null, null, new rf40(this, null), 3);
            return;
        }
        if (nc40Var.equals(nc40.e.a)) {
            ej5.c(o8i0.d(this), null, null, new tf40(this, null), 3);
            return;
        }
        if (!(nc40Var instanceof nc40.f)) {
            uhc.a();
            return;
        }
        nc40.f fVar = (nc40.f) nc40Var;
        kf40 kf40Var = fVar.a;
        k00[] k00VarArr = (k00[]) fVar.b.toArray(new k00[0]);
        this.d.a(kf40Var, (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length));
    }
}
