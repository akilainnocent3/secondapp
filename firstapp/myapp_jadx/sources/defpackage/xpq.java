package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$handleAction$3", f = "LNLobbyViewModel.kt", l = {415}, m = "invokeSuspend", v = 2)
public final class xpq extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ spq b;
    public final /* synthetic */ jmq c;

    @c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$handleAction$3$1", f = "LNLobbyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public final /* synthetic */ spq a;
        public final /* synthetic */ jmq b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(spq spqVar, jmq jmqVar, v1b<? super a> v1bVar) {
            super(1, v1bVar);
            this.a = spqVar;
            this.b = jmqVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            j7q j7qVar = this.a.b;
            jmq.p pVar = (jmq.p) this.b;
            String str = pVar.a;
            boolean z = pVar.b;
            j7qVar.getClass();
            str.getClass();
            j7qVar.f.a(new j7q.b(str, z));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpq(spq spqVar, jmq jmqVar, v1b<? super xpq> v1bVar) {
        super(2, v1bVar);
        this.b = spqVar;
        this.c = jmqVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xpq(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xpq) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            spq spqVar = this.b;
            drq drqVar = spqVar.e;
            a aVar = new a(spqVar, this.c, null);
            this.a = 1;
            if (drqVar.a(aVar, this) == y5bVar) {
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
