package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.dedicatedteampage.article.presentation.viewmodel.AllNewsViewModel$onLoadMore$2", f = "AllNewsViewModel.kt", l = {70}, m = "invokeSuspend", v = 2)
public final class hu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ iu b;
    public final /* synthetic */ eu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(iu iuVar, eu euVar, v1b<? super hu> v1bVar) {
        super(2, v1bVar);
        this.b = iuVar;
        this.c = euVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hu(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object value;
        Object value2;
        eu euVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        iu iuVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            lfk lfkVar = iuVar.a;
            String str = iuVar.c;
            String str2 = this.c.c.b;
            this.a = 1;
            objB = lfk.b(lfkVar, str, str2, this, 2);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objB = ((zi50) obj).a;
        }
        if (zi50.a(objB) == null) {
            hqz hqzVar = (hqz) objB;
            wwd0 wwd0Var = iuVar.e;
            do {
                value2 = wwd0Var.getValue();
                euVar = (eu) value2;
            } while (!wwd0Var.g(value2, eu.a(euVar, null, false, new grx(CollectionsKt.i0(hqzVar.a, euVar.c.a), hqzVar.b, hqzVar.c), 1)));
        } else {
            wwd0 wwd0Var2 = iuVar.e;
            do {
                value = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value, eu.a((eu) value, null, false, null, 5)));
        }
        return Unit.a;
    }
}
