package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.country.CountryManagerImpl$_countryConfig$2$countryCode$1", f = "CountryManagerImpl.kt", l = {WebSocketProtocol.B0_FLAG_RSV1}, m = "invokeSuspend", v = 2)
public final class g8b extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
    public int a;
    public final /* synthetic */ h8b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8b(h8b h8bVar, v1b<? super g8b> v1bVar) {
        super(2, v1bVar);
        this.b = h8bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g8b(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
        return ((g8b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        ga gaVar = this.b.a;
        wm20 wm20VarA = gaVar.h.a(gaVar, ga.s[6]);
        this.a = 1;
        Object objE = wm20VarA.e(this, "tz");
        return objE == y5bVar ? y5bVar : objE;
    }
}
