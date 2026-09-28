package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballDefaultDisplayAnTestHelper$reportConversion$1", f = "ScheduledFootballDefaultDisplayAnTestHelper.kt", l = {48}, m = "invokeSuspend", v = 2)
public final class u370 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ x370 b;
    public final /* synthetic */ int c;

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballDefaultDisplayAnTestHelper$reportConversion$1$1", f = "ScheduledFootballDefaultDisplayAnTestHelper.kt", l = {62}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ x370 c;
        public final /* synthetic */ int d;

        /* JADX INFO: renamed from: u370$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballDefaultDisplayAnTestHelper$reportConversion$1$1$reportBetConversionRateDeferred$1", f = "ScheduledFootballDefaultDisplayAnTestHelper.kt", l = {50}, m = "invokeSuspend", v = 2)
        public static final class C1160a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ x370 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1160a(x370 x370Var, v1b<? super C1160a> v1bVar) {
                super(2, v1bVar);
                this.b = x370Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1160a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1160a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    yqm yqmVar = this.b.a;
                    x66<y370> x66Var = z76.A;
                    String str = x66Var.a;
                    String str2 = x66Var.b.get(0);
                    this.a = 1;
                    if (yqmVar.c(str, str2, null, this) == y5bVar) {
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

        @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballDefaultDisplayAnTestHelper$reportConversion$1$1$reportBetsPerUserDeferred$1", f = "ScheduledFootballDefaultDisplayAnTestHelper.kt", l = {56}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ x370 b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(x370 x370Var, int i, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.b = x370Var;
                this.c = i;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.b, this.c, v1bVar);
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
                    yqm yqmVar = this.b.a;
                    x66<y370> x66Var = z76.A;
                    String str = x66Var.a;
                    String str2 = x66Var.b.get(1);
                    String strValueOf = String.valueOf(this.c);
                    this.a = 1;
                    if (yqmVar.c(str, str2, strValueOf, this) == y5bVar) {
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
        public a(x370 x370Var, int i, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = x370Var;
            this.d = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                x370 x370Var = this.c;
                ojd[] ojdVarArr = {ej5.a(v5bVar, null, new C1160a(x370Var, null), 3), ej5.a(v5bVar, null, new b(x370Var, this.d, null), 3)};
                this.b = null;
                this.a = 1;
                if (up1.b(ojdVarArr, this) == y5bVar) {
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
    public u370(x370 x370Var, int i, v1b<? super u370> v1bVar) {
        super(2, v1bVar);
        this.b = x370Var;
        this.c = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new u370(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((u370) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            x370 x370Var = this.b;
            odd oddVar = x370Var.b;
            a aVar = new a(x370Var, this.c, null);
            this.a = 1;
            if (ej5.d(oddVar, aVar, this) == y5bVar) {
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
