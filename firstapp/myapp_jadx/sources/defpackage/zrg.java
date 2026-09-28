package defpackage;

import com.sporty.android.book.domain.entity.MarketGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventUseCase$fetchRemoteMarketGroups$1", f = "EventUseCase.kt", l = {176}, m = "invokeSuspend", v = 2)
public final class zrg extends tje0 implements Function2<List<? extends MarketGroup>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ csg c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zrg(csg csgVar, String str, int i, v1b<? super zrg> v1bVar) {
        super(2, v1bVar);
        this.c = csgVar;
        this.d = str;
        this.e = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zrg zrgVar = new zrg(this.c, this.d, this.e, v1bVar);
        zrgVar.b = obj;
        return zrgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends MarketGroup> list, v1b<? super Unit> v1bVar) {
        return ((zrg) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            kmg kmgVar = this.c.d;
            this.b = null;
            this.a = 1;
            if (kmgVar.j(this.d, this.e, list, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            Object obj2 = ((zi50) obj).a;
        }
        return Unit.a;
    }
}
