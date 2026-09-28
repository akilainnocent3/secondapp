package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.ScheduledFootballRepoImpl$openBetsCountInfoFlow$1", f = "ScheduledFootballRepoImpl.kt", l = {301}, m = "invokeSuspend", v = 2)
public final class fg70 extends tje0 implements Function2<ez20<? super String>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ mg70 d;

    public static final class a implements amo {
        public final /* synthetic */ ez20<String> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ez20<? super String> ez20Var) {
            this.a = ez20Var;
        }

        @Override // defpackage.amo
        public final void onReceive(String str) {
            this.a.c(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg70(String str, mg70 mg70Var, v1b<? super fg70> v1bVar) {
        super(2, v1bVar);
        this.c = str;
        this.d = mg70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fg70 fg70Var = new fg70(this.c, this.d, v1bVar);
        fg70Var.b = obj;
        return fg70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super String> ez20Var, v1b<? super Unit> v1bVar) {
        return ((fg70) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ez20 ez20Var = (ez20) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            final zlo.b bVar = new zlo.b("sf_open_bet_count_topic", this.c);
            final a aVar = new a(ez20Var);
            final mg70 mg70Var = this.d;
            mg70Var.c.a(bVar, aVar);
            Function0 function0 = new Function0() { // from class: eg70
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    mg70Var.c.b(bVar, aVar);
                    return Unit.a;
                }
            };
            this.b = null;
            this.a = 1;
            if (az20.a(ez20Var, function0, this) == y5bVar) {
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
