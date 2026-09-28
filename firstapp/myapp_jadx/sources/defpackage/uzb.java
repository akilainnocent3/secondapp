package defpackage;

import com.sportybet.android.social.data.local.CreatorCreditHistoryEntity;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CreatorCreditHistoryViewModel$getCreatorCreditHistory$$inlined$flatMapLatest$1", f = "CreatorCreditHistoryViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class uzb extends tje0 implements gaj<myh<? super kqz<CreatorCreditHistoryEntity>>, String, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yzb d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzb(v1b v1bVar, yzb yzbVar, boolean z) {
        super(3, v1bVar);
        this.d = yzbVar;
        this.e = z;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super kqz<CreatorCreditHistoryEntity>> myhVar, String str, v1b<? super Unit> v1bVar) {
        uzb uzbVar = new uzb(v1bVar, this.d, this.e);
        uzbVar.b = myhVar;
        uzbVar.c = str;
        return uzbVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            lyh<kqz<CreatorCreditHistoryEntity>> lyhVarD = this.d.d.d((String) this.c, this.e);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, lyhVarD, this) == y5bVar) {
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
