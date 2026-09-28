package defpackage;

import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.roomcache.cacheio.EventCacheIO$getCacheBetBuilderMarkets$2", f = "EventCacheIO.kt", l = {95}, m = "invokeSuspend", v = 2)
public final class xlg extends tje0 implements Function2<v5b, v1b<? super zi50<? extends er5>>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kmg c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xlg(kmg kmgVar, String str, v1b<? super xlg> v1bVar) {
        super(2, v1bVar);
        this.c = kmgVar;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xlg xlgVar = new xlg(this.c, this.d, v1bVar);
        xlgVar.b = obj;
        return xlgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends er5>> v1bVar) {
        return ((xlg) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
                zi50.a aVar = zi50.b;
                dlg dlgVarF = kmgVar.f();
                this.b = null;
                this.a = 1;
                obj = dlgVarF.c(str, this);
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
            bVar = (er5) obj;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar4 = itf0.a;
            aVar4.a(e40.a(aVar4, MyLog.TAG_CACHE_DB, "get cache bet builder markets failed: ", thA), new Object[0]);
        }
        return new zi50(bVar);
    }
}
