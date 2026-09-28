package defpackage;

import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.roomcache.cacheio.EventCacheIO$getCacheFavoriteMarketIds$2", f = "EventCacheIO.kt", l = {129}, m = "invokeSuspend", v = 2)
public final class bmg extends tje0 implements Function2<v5b, v1b<? super zi50<? extends pr5>>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kmg c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmg(kmg kmgVar, String str, int i, v1b<? super bmg> v1bVar) {
        super(2, v1bVar);
        this.c = kmgVar;
        this.d = str;
        this.e = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bmg bmgVar = new bmg(this.c, this.d, this.e, v1bVar);
        bmgVar.b = obj;
        return bmgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends pr5>> v1bVar) {
        return ((bmg) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                kmg kmgVar = this.c;
                String str = this.d;
                int i2 = this.e;
                zi50.a aVar = zi50.b;
                dlg dlgVarF = kmgVar.f();
                this.b = null;
                this.a = 1;
                obj = dlgVarF.e(str, i2, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            bVar = (pr5) obj;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar4 = itf0.a;
            aVar4.a(e40.a(aVar4, MyLog.TAG_CACHE_DB, "get cache favorite market ids failed: ", thA), new Object[0]);
        }
        return new zi50(bVar);
    }
}
