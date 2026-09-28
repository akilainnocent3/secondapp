package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballDefaultDisplayAnTestHelper$shouldCollapseTargetMatchday$2", f = "ScheduledFootballDefaultDisplayAnTestHelper.kt", l = {41}, m = "invokeSuspend", v = 2)
public final class w370 extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
    public int a;
    public final /* synthetic */ x370 b;

    public static final class a implements lyh<Boolean> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: w370$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballDefaultDisplayAnTestHelper$shouldCollapseTargetMatchday$2$invokeSuspend$$inlined$mapNotNull$1", f = "ScheduledFootballDefaultDisplayAnTestHelper.kt", l = {109}, m = "collect", v = 2)
        public static final class C1235a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1235a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: w370$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballDefaultDisplayAnTestHelper$shouldCollapseTargetMatchday$2$invokeSuspend$$inlined$mapNotNull$1$2", f = "ScheduledFootballDefaultDisplayAnTestHelper.kt", l = {56}, m = "emit", v = 2)
            public static final class C1236a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1236a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1236a c1236a;
                if (v1bVar instanceof C1236a) {
                    c1236a = (C1236a) v1bVar;
                    int i = c1236a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1236a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1236a = new C1236a(v1bVar);
                    }
                } else {
                    c1236a = new C1236a(v1bVar);
                }
                Object obj2 = c1236a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1236a.b;
                Boolean boolValueOf = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    lk50 lk50Var = (lk50) obj;
                    if (lk50Var instanceof lk50.c) {
                        boolValueOf = Boolean.valueOf(((lk50.c) lk50Var).a == y370.TEST);
                    } else if (lk50Var instanceof lk50.a) {
                        boolValueOf = Boolean.FALSE;
                    } else if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    if (boolValueOf != null) {
                        c1236a.b = 1;
                        if (this.a.emit(boolValueOf, c1236a) == y5bVar) {
                            return y5bVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public a(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
            C1235a c1235a;
            if (v1bVar instanceof C1235a) {
                c1235a = (C1235a) v1bVar;
                int i = c1235a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1235a.b = i - Integer.MIN_VALUE;
                } else {
                    c1235a = new C1235a(v1bVar);
                }
            } else {
                c1235a = new C1235a(v1bVar);
            }
            Object obj = c1235a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1235a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c1235a.b = 1;
                if (this.a.collect(bVar, c1235a) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w370(x370 x370Var, v1b<? super w370> v1bVar) {
        super(2, v1bVar);
        this.b = x370Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new w370(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
        return ((w370) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        a aVar = new a(this.b.a.j(z76.A));
        this.a = 1;
        Object objA = s0i.a(aVar, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
