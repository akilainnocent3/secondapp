package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.payday.presentation.PaydayGiftViewModel$startCountdown$1", f = "PaydayGiftViewModel.kt", l = {90}, m = "invokeSuspend", v = 2)
public final class l500 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ j500 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l500(long j, j500 j500Var, v1b<? super l500> v1bVar) {
        super(2, v1bVar);
        this.b = j;
        this.c = j500Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new l500(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((l500) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        x250 x250Var;
        long j;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0 && i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        do {
            long jCurrentTimeMillis = this.b - System.currentTimeMillis();
            int i2 = (int) ((jCurrentTimeMillis < 0 ? 0L : jCurrentTimeMillis) / 86400000);
            int i3 = (int) (((jCurrentTimeMillis < 0 ? 0L : jCurrentTimeMillis) / 3600000) % 24);
            int i4 = (int) (((jCurrentTimeMillis < 0 ? 0L : jCurrentTimeMillis) / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) % 60);
            if (jCurrentTimeMillis < 0) {
                jCurrentTimeMillis = 0;
            }
            x250 x250Var2 = new x250(jCurrentTimeMillis <= 0, i2, i3, i4, (int) ((jCurrentTimeMillis / 1000) % 60));
            j500 j500Var = this.c;
            wwd0 wwd0Var = j500Var.b;
            do {
                value = wwd0Var.getValue();
                x250Var = x250Var2;
                x250Var2 = x250Var;
            } while (!wwd0Var.g(value, i500.a((i500) value, x250Var, null, null, null, null, null, 62)));
            if (x250Var2.e) {
                j500Var.x1(h500.b.a);
                return Unit.a;
            }
            j = j500.f;
            this.a = 1;
        } while (hkd.c(j, this) != y5bVar);
        return y5bVar;
    }
}
