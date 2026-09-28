package defpackage;

import com.sporty.android.book.domain.entity.SimpleMarket;
import com.sporty.android.core.model.MyLog;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.roomcache.cacheio.EventCacheIO$insertCacheBetBuilderMarkets$2", f = "EventCacheIO.kt", l = {86}, m = "invokeSuspend", v = 2)
public final class dmg extends tje0 implements Function2<v5b, v1b<? super zi50<? extends Unit>>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kmg c;
    public final /* synthetic */ String d;
    public final /* synthetic */ List<SimpleMarket> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmg(kmg kmgVar, String str, List<SimpleMarket> list, v1b<? super dmg> v1bVar) {
        super(2, v1bVar);
        this.c = kmgVar;
        this.d = str;
        this.e = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dmg dmgVar = new dmg(this.c, this.d, this.e, v1bVar);
        dmgVar.b = obj;
        return dmgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends Unit>> v1bVar) {
        return ((dmg) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
                List<SimpleMarket> list = this.e;
                zi50.a aVar = zi50.b;
                dlg dlgVarF = kmgVar.f();
                er5 er5Var = new er5(str, list);
                this.b = null;
                this.a = 1;
                if (dlgVarF.b(er5Var, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            bVar = Unit.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar4 = itf0.a;
            aVar4.a(e40.a(aVar4, MyLog.TAG_CACHE_DB, "insert cache bet builder markets failed: ", thA), new Object[0]);
        }
        return new zi50(bVar);
    }
}
