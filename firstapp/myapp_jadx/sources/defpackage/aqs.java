package defpackage;

import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.live.livepage.LivePageActivity$collectSocketMessage$2", f = "LivePageActivity.kt", l = {1483}, m = "invokeSuspend", v = 2)
public final class aqs extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ LivePageActivity b;

    public static final class a<T> implements myh {
        public final /* synthetic */ LivePageActivity a;

        public a(LivePageActivity livePageActivity) {
            this.a = livePageActivity;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            SocketMarketMessage socketMarketMessage = (SocketMarketMessage) obj;
            xss xssVar = this.a.Q;
            if (xssVar != null) {
                xssVar.t(socketMarketMessage);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqs(LivePageActivity livePageActivity, v1b<? super aqs> v1bVar) {
        super(2, v1bVar);
        this.b = livePageActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new aqs(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
        ((aqs) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        int i2 = LivePageActivity.b0;
        LivePageActivity livePageActivity = this.b;
        b390 b390Var = livePageActivity.G1().v;
        a aVar = new a(livePageActivity);
        this.a = 1;
        b390Var.getClass();
        b390.m(b390Var, aVar, this);
        return y5bVar;
    }
}
