package com.sportybet.android.auth;

import defpackage.c0d;
import defpackage.eo20;
import defpackage.ga;
import defpackage.gaj;
import defpackage.ib5;
import defpackage.kzh;
import defpackage.lyh;
import defpackage.myh;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.y5b;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lmyh;", "it", "", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl$isShowingBalanceFlow$$inlined$flatMapLatest$1", f = "SportyAccountManagerImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class SportyAccountManagerImpl$isShowingBalanceFlow$$inlined$flatMapLatest$1 extends tje0 implements gaj<myh<? super Boolean>, String, v1b<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ SportyAccountManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportyAccountManagerImpl$isShowingBalanceFlow$$inlined$flatMapLatest$1(v1b v1bVar, SportyAccountManagerImpl sportyAccountManagerImpl) {
        super(3, v1bVar);
        this.this$0 = sportyAccountManagerImpl;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Boolean> myhVar, String str, v1b<? super Unit> v1bVar) {
        SportyAccountManagerImpl$isShowingBalanceFlow$$inlined$flatMapLatest$1 sportyAccountManagerImpl$isShowingBalanceFlow$$inlined$flatMapLatest$1 = new SportyAccountManagerImpl$isShowingBalanceFlow$$inlined$flatMapLatest$1(v1bVar, this.this$0);
        sportyAccountManagerImpl$isShowingBalanceFlow$$inlined$flatMapLatest$1.L$0 = myhVar;
        sportyAccountManagerImpl$isShowingBalanceFlow$$inlined$flatMapLatest$1.L$1 = str;
        return sportyAccountManagerImpl$isShowingBalanceFlow$$inlined$flatMapLatest$1.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.label;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = (myh) this.L$0;
            String str = (String) this.L$1;
            ga gaVar = this.this$0.preferenceDataStore;
            eo20[] eo20VarArr = eo20.a;
            gaVar.getClass();
            lyh<Boolean> booleanByFlow = gaVar.a.getBooleanByFlow("show_balance_" + str, true);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kzh.c(myhVar, booleanByFlow, this) == y5bVar) {
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
