package defpackage;

import com.sportybet.plugin.realsports.data.SocketEventMessage;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.live.livetournament.LiveTournamentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.live.livetournament.LiveTournamentActivity$observeData$1$2", f = "LiveTournamentActivity.kt", l = {271}, m = "invokeSuspend", v = 2)
public final class zus extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ LiveTournamentActivity b;

    @c0d(c = "com.sportybet.plugin.realsports.live.livetournament.LiveTournamentActivity$observeData$1$2$1", f = "LiveTournamentActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ LiveTournamentActivity b;

        /* JADX INFO: renamed from: zus$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.plugin.realsports.live.livetournament.LiveTournamentActivity$observeData$1$2$1$1", f = "LiveTournamentActivity.kt", l = {273}, m = "invokeSuspend", v = 2)
        public static final class C1425a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ LiveTournamentActivity b;

            /* JADX INFO: renamed from: zus$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.plugin.realsports.live.livetournament.LiveTournamentActivity$observeData$1$2$1$1$1", f = "LiveTournamentActivity.kt", l = {}, m = "invokeSuspend", v = 2)
            public static final class C1426a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
                public /* synthetic */ Object a;
                public final /* synthetic */ LiveTournamentActivity b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1426a(LiveTournamentActivity liveTournamentActivity, v1b<? super C1426a> v1bVar) {
                    super(2, v1bVar);
                    this.b = liveTournamentActivity;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    C1426a c1426a = new C1426a(this.b, v1bVar);
                    c1426a.a = obj;
                    return c1426a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, v1b<? super Unit> v1bVar) {
                    return ((C1426a) create(str, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    String str = (String) this.a;
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    xss xssVar = this.b.F;
                    if (xssVar != null) {
                        xssVar.x(str);
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1425a(LiveTournamentActivity liveTournamentActivity, v1b<? super C1425a> v1bVar) {
                super(2, v1bVar);
                this.b = liveTournamentActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1425a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C1425a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    int i2 = LiveTournamentActivity.I;
                    LiveTournamentActivity liveTournamentActivity = this.b;
                    v340 v340Var = liveTournamentActivity.D1().F;
                    C1426a c1426a = new C1426a(liveTournamentActivity, null);
                    this.a = 1;
                    if (kzh.b(v340Var, c1426a, this) == y5bVar) {
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

        @c0d(c = "com.sportybet.plugin.realsports.live.livetournament.LiveTournamentActivity$observeData$1$2$1$2", f = "LiveTournamentActivity.kt", l = {278}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ LiveTournamentActivity b;

            /* JADX INFO: renamed from: zus$a$b$a, reason: collision with other inner class name */
            public static final class C1427a<T> implements myh {
                public final /* synthetic */ LiveTournamentActivity a;

                public C1427a(LiveTournamentActivity liveTournamentActivity) {
                    this.a = liveTournamentActivity;
                }

                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    SocketMarketMessage socketMarketMessage = (SocketMarketMessage) obj;
                    xss xssVar = this.a.F;
                    if (xssVar != null) {
                        xssVar.t(socketMarketMessage);
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(LiveTournamentActivity liveTournamentActivity, v1b<? super b> v1bVar) {
                super(2, v1bVar);
                this.b = liveTournamentActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new b(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
                ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                return y5b.a;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) throws Throwable {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        throw l80.a(obj);
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                int i2 = LiveTournamentActivity.I;
                LiveTournamentActivity liveTournamentActivity = this.b;
                b390 b390Var = liveTournamentActivity.D1().v;
                C1427a c1427a = new C1427a(liveTournamentActivity);
                this.a = 1;
                b390Var.getClass();
                b390.m(b390Var, c1427a, this);
                return y5bVar;
            }
        }

        @c0d(c = "com.sportybet.plugin.realsports.live.livetournament.LiveTournamentActivity$observeData$1$2$1$3", f = "LiveTournamentActivity.kt", l = {283}, m = "invokeSuspend", v = 2)
        public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ LiveTournamentActivity b;

            /* JADX INFO: renamed from: zus$a$c$a, reason: collision with other inner class name */
            public static final class C1428a<T> implements myh {
                public final /* synthetic */ LiveTournamentActivity a;

                public C1428a(LiveTournamentActivity liveTournamentActivity) {
                    this.a = liveTournamentActivity;
                }

                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    SocketEventMessage socketEventMessage = (SocketEventMessage) obj;
                    xss xssVar = this.a.F;
                    if (xssVar != null) {
                        xssVar.s(socketEventMessage, false);
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(LiveTournamentActivity liveTournamentActivity, v1b<? super c> v1bVar) {
                super(2, v1bVar);
                this.b = liveTournamentActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new c(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
                ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                return y5b.a;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) throws Throwable {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        throw l80.a(obj);
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                int i2 = LiveTournamentActivity.I;
                LiveTournamentActivity liveTournamentActivity = this.b;
                b390 b390Var = liveTournamentActivity.D1().y;
                C1428a c1428a = new C1428a(liveTournamentActivity);
                this.a = 1;
                b390Var.getClass();
                b390.m(b390Var, c1428a, this);
                return y5bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LiveTournamentActivity liveTournamentActivity, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = liveTournamentActivity;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            LiveTournamentActivity liveTournamentActivity = this.b;
            ej5.c(v5bVar, null, null, new C1425a(liveTournamentActivity, null), 3);
            ej5.c(v5bVar, null, null, new b(liveTournamentActivity, null), 3);
            ej5.c(v5bVar, null, null, new c(liveTournamentActivity, null), 3);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zus(LiveTournamentActivity liveTournamentActivity, v1b<? super zus> v1bVar) {
        super(2, v1bVar);
        this.b = liveTournamentActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zus(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zus) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s.b bVar = s9s.b.d;
            LiveTournamentActivity liveTournamentActivity = this.b;
            a aVar = new a(liveTournamentActivity, null);
            this.a = 1;
            if (m850.b(liveTournamentActivity, bVar, aVar, this) == y5bVar) {
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
