package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.plugin.myfavorite.datastore.MyFavouritesDataStoreImpl$disableAddMoreSettings$2", f = "MyFavouritesDataStoreImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kzw extends tje0 implements Function2<jtw, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kzw kzwVar = new kzw(2, v1bVar);
        kzwVar.a = obj;
        return kzwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jtw jtwVar, v1b<? super Unit> v1bVar) {
        return ((kzw) create(jtwVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jtw jtwVar = (jtw) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zn20.a<?> aVar = new zn20.a<>("PREF_ADD_MORE_SETTINGS");
        Boolean bool = Boolean.FALSE;
        jtwVar.getClass();
        jtwVar.h(aVar, bool);
        return Unit.a;
    }
}
