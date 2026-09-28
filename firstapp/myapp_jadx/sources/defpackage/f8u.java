package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf8u;", "Lj8i0;", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class f8u extends j8i0 {
    public jvd0 A;
    public final b390 B;
    public final i6u a;
    public final wkh0 b;
    public final xjh0 c;
    public final fjr d;
    public final vdq e;
    public final qq40 f;
    public final j7q i;
    public final mgb0 v;
    public final drq w;
    public final odd y;
    public final ku90<f7q> z;

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberViewModel$handleAction$1", f = "LuckyNumberViewModel.kt", l = {123}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ nvp c;

        /* JADX INFO: renamed from: f8u$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberViewModel$handleAction$1$1", f = "LuckyNumberViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0550a extends tje0 implements Function1<v1b<? super Unit>, Object> {
            public final /* synthetic */ f8u a;
            public final /* synthetic */ nvp b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0550a(f8u f8uVar, nvp nvpVar, v1b<? super C0550a> v1bVar) {
                super(1, v1bVar);
                this.a = f8uVar;
                this.b = nvpVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(v1b<?> v1bVar) {
                return new C0550a(this.a, this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(v1b<? super Unit> v1bVar) {
                return ((C0550a) create(v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                this.a.z.a(new f7q.c(((nvp.c) this.b).a));
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nvp nvpVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = nvpVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return f8u.this.new a(this.c, v1bVar);
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
                f8u f8uVar = f8u.this;
                drq drqVar = f8uVar.w;
                C0550a c0550a = new C0550a(f8uVar, this.c, null);
                this.a = 1;
                if (drqVar.a(c0550a, this) == y5bVar) {
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

    public f8u(i6u i6uVar, wkh0 wkh0Var, xjh0 xjh0Var, fjr fjrVar, vdq vdqVar, qq40 qq40Var, j7q j7qVar, mgb0 mgb0Var, drq drqVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        i6uVar.getClass();
        fjrVar.getClass();
        vdqVar.getClass();
        j7qVar.getClass();
        mgb0Var.getClass();
        drqVar.getClass();
        this.a = i6uVar;
        this.b = wkh0Var;
        this.c = xjh0Var;
        this.d = fjrVar;
        this.e = vdqVar;
        this.f = qq40Var;
        this.i = j7qVar;
        this.v = mgb0Var;
        this.w = drqVar;
        this.y = oddVar;
        this.z = new ku90<>();
        this.B = d390.a(0, 1, pb5.b);
        ej5.c(o8i0.d(this), oddVar, null, new z7u(this, null), 2);
        ej5.c(o8i0.d(this), oddVar, null, new a8u(this, null), 2);
        ej5.c(o8i0.d(this), oddVar, null, new b8u(this, null), 2);
        ej5.c(o8i0.d(this), oddVar, null, new c8u(this, null), 2);
        ej5.c(o8i0.d(this), oddVar, null, new d8u(this, null), 2);
        ej5.c(o8i0.d(this), oddVar, null, new e8u(this, null), 2);
    }

    public final void x1(nvp nvpVar) {
        nvpVar.getClass();
        boolean zEquals = nvpVar.equals(nvp.k.a);
        odd oddVar = this.y;
        if (zEquals) {
            jvd0 jvd0Var = this.A;
            if (jvd0Var == null || !jvd0Var.isActive()) {
                this.A = ej5.c(o8i0.d(this), oddVar, null, new h8u(this, null), 2);
                return;
            }
            return;
        }
        boolean z = nvpVar instanceof nvp.c;
        b390 b390Var = this.B;
        ku90<f7q> ku90Var = this.z;
        if (z) {
            if (this.v.isLogin()) {
                kzh.d(ozh.c(new yzh(this.f.a(), new g8u(3, null)), oddVar), o8i0.d(this));
                kzh.d(ozh.c(new yzh(this.a.h.a(), new g8u(3, null)), oddVar), o8i0.d(this));
            }
            b390Var.a(Unit.a);
            Object obj = ((nvp.c) nvpVar).a;
            if (obj instanceof pit) {
                ej5.c(o8i0.d(this), oddVar, null, new a(nvpVar, null), 2);
                return;
            } else {
                ku90Var.a(new f7q.c(obj));
                return;
            }
        }
        if (nvpVar instanceof nvp.d) {
            nvp.d dVar = (nvp.d) nvpVar;
            ku90Var.a(new f7q.d(dVar.a, dVar.b));
            return;
        }
        if (nvpVar instanceof nvp.e) {
            nvp.e eVar = (nvp.e) nvpVar;
            ku90Var.a(new f7q.e(eVar.a, eVar.b));
            return;
        }
        if (nvpVar instanceof nvp.f) {
            b390Var.a(Unit.a);
            ku90Var.a(new f7q.f(((nvp.f) nvpVar).a));
            return;
        }
        if (nvpVar.equals(nvp.b.a)) {
            ku90Var.a(f7q.b.a);
            return;
        }
        if (nvpVar instanceof nvp.g) {
            ku90Var.a(new f7q.g(((nvp.g) nvpVar).a));
            return;
        }
        if (nvpVar instanceof nvp.h) {
            ku90Var.a(new f7q.h(((nvp.h) nvpVar).a));
            return;
        }
        if (nvpVar instanceof nvp.j) {
            nvp.j jVar = (nvp.j) nvpVar;
            ku90Var.a(new f7q.i(jVar.a, jVar.b));
        } else if (nvpVar.equals(nvp.a.a)) {
            ku90Var.a(f7q.a.a);
        } else if (!(nvpVar instanceof nvp.i)) {
            uhc.a();
        } else {
            this.e.c.setValue(((nvp.i) nvpVar).a);
        }
    }
}
