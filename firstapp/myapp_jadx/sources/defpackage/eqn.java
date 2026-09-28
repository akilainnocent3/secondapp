package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes5.dex */
public final class eqn {
    public final yqm a;
    public final mgb0 b;
    public jvd0 c;
    public jvd0 d;
    public final j1b e;
    public boolean f;
    public final wwd0 g;
    public final v340 h;
    public final wwd0 i;

    @c0d(c = "com.sportybet.android.instantwin.antest.InstantFootballKickOffVisibilityAnTestHelper$processKickOffConversion$1", f = "InstantFootballKickOffVisibilityAnTestHelper.kt", l = {127}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX INFO: renamed from: eqn$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.instantwin.antest.InstantFootballKickOffVisibilityAnTestHelper$processKickOffConversion$1$1", f = "InstantFootballKickOffVisibilityAnTestHelper.kt", l = {128}, m = "invokeSuspend", v = 2)
        public static final class C0535a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ eqn b;
            public final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0535a(eqn eqnVar, String str, v1b<? super C0535a> v1bVar) {
                super(2, v1bVar);
                this.b = eqnVar;
                this.c = str;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0535a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0535a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    yqm yqmVar = this.b.a;
                    String str = z76.m.a;
                    this.a = 1;
                    if (yqmVar.c(str, this.c, null, this) == y5bVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return eqn.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    b.a aVar = b.b;
                    long jH = c.h(10, rgf.SECONDS);
                    C0535a c0535a = new C0535a(eqn.this, this.c, null);
                    this.a = 1;
                    obj = vxf0.d(jH, c0535a, this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
            } catch (Throwable unused) {
            }
            return Unit.a;
        }
    }

    public eqn(yqm yqmVar, mgb0 mgb0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        yqmVar.getClass();
        mgb0Var.getClass();
        this.a = yqmVar;
        this.b = mgb0Var;
        this.e = w5b.a(oddVar.plus(lfe0.a()));
        wwd0 wwd0VarA = xwd0.a(gqn.c.a);
        this.g = wwd0VarA;
        this.h = e1i.b(wwd0VarA);
        this.i = xwd0.a(null);
    }

    public final void a(et7 et7Var, String str) {
        str.getClass();
        boolean zEquals = str.equals("sr:sport:1");
        this.f = zEquals;
        if (zEquals) {
            kzh.d(new g1i(r0i.f(this.b.getAccountInfoFlow(), new bqn(null, this)), new dqn(null, this)), et7Var);
        } else {
            this.g.setValue(gqn.c.a);
            this.i.setValue(null);
        }
    }

    public final void b() {
        ftm ftmVar;
        String str;
        if (this.f && (ftmVar = (ftm) this.i.getValue()) != null) {
            int iOrdinal = ftmVar.ordinal();
            if (iOrdinal == 0) {
                str = z76.m.b.get(0);
            } else if (iOrdinal == 1) {
                str = z76.m.b.get(1);
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return;
                }
                str = z76.m.b.get(2);
            }
            jvd0 jvd0Var = this.c;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            this.c = ej5.c(this.e, null, null, new a(str, null), 3);
        }
    }
}
