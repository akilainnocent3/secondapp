package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballOverviewStatsHandlerImpl$init$7", f = "ScheduledFootballOverviewStatsHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class de70 extends tje0 implements Function2<Pair<? extends String, ? extends td70.a>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ td70 b;
    public final /* synthetic */ et7 c;
    public final /* synthetic */ String d;

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballOverviewStatsHandlerImpl$init$7$1", f = "ScheduledFootballOverviewStatsHandlerImpl.kt", l = {141}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ td70 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(td70 td70Var, String str, String str2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = td70Var;
            this.c = str;
            this.d = str2;
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
                this.a = 1;
                if (this.b.b(this.c, this.d, this) == y5bVar) {
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
    public de70(td70 td70Var, et7 et7Var, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.b = td70Var;
        this.c = et7Var;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        de70 de70Var = new de70(this.b, this.c, this.d, v1bVar);
        de70Var.a = obj;
        return de70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends String, ? extends td70.a> pair, v1b<? super Unit> v1bVar) {
        return ((de70) create(pair, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Pair pair = (Pair) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = (String) pair.a;
        td70.a aVar = (td70.a) pair.b;
        td70 td70Var = this.b;
        jvd0 jvd0Var = td70Var.h;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        td70Var.h = null;
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            td70Var.h = ej5.c(this.c, null, null, new a(td70Var, this.d, str, null), 3);
        } else {
            if (iOrdinal != 2) {
                uhc.a();
                return null;
            }
            wwd0 wwd0Var = td70Var.g;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, null));
        }
        return Unit.a;
    }
}
