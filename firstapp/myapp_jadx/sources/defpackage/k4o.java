package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.ticketdetail.handler.InstantRacingTicketDetailHandlerImpl$init$1", f = "InstantRacingTicketDetailHandlerImpl.kt", l = {58}, m = "invokeSuspend", v = 2)
public final class k4o extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ i4o b;
    public final /* synthetic */ String c;

    public static final class a<T> implements myh {
        public final /* synthetic */ i4o a;
        public final /* synthetic */ String b;

        public a(i4o i4oVar, String str) {
            this.a = i4oVar;
            this.b = str;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            return this.a.i(this.b, v1bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4o(i4o i4oVar, String str, v1b<? super k4o> v1bVar) {
        super(2, v1bVar);
        this.b = i4oVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k4o(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
        ((k4o) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        i4o i4oVar = this.b;
        b390 b390Var = i4oVar.d;
        a aVar = new a(i4oVar, this.c);
        this.a = 1;
        b390Var.collect(aVar, this);
        return y5bVar;
    }
}
