package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.homeshortcut.HomeShortcutViewModel$special$$inlined$flatMapLatest$1", f = "HomeShortcutViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class phm extends tje0 implements gaj<myh<? super nhm>, lyh<? extends nhm>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super nhm> myhVar, lyh<? extends nhm> lyhVar, v1b<? super Unit> v1bVar) {
        phm phmVar = new phm(3, v1bVar);
        phmVar.b = myhVar;
        phmVar.c = lyhVar;
        return phmVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            lyh lyhVar = (lyh) this.c;
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, lyhVar, this) == y5bVar) {
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
