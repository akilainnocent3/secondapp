package com.sportybet.android.auth;

import defpackage.c0d;
import defpackage.ib5;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.y5b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv5b;", "", "<anonymous>", "(Lv5b;)V"}, k = 3, mv = {2, 4, 0})
@c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl$documentAuditStatus$1", f = "SportyAccountManagerImpl.kt", l = {122}, m = "invokeSuspend", v = 2)
public final class SportyAccountManagerImpl$documentAuditStatus$1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    final /* synthetic */ int $value;
    int label;
    final /* synthetic */ SportyAccountManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportyAccountManagerImpl$documentAuditStatus$1(SportyAccountManagerImpl sportyAccountManagerImpl, int i, v1b<? super SportyAccountManagerImpl$documentAuditStatus$1> v1bVar) {
        super(2, v1bVar);
        this.this$0 = sportyAccountManagerImpl;
        this.$value = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new SportyAccountManagerImpl$documentAuditStatus$1(this.this$0, this.$value, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((SportyAccountManagerImpl$documentAuditStatus$1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.label;
        if (i == 0) {
            uj50.b(obj);
            SportyAccountManagerImpl sportyAccountManagerImpl = this.this$0;
            int i2 = this.$value;
            this.label = 1;
            if (sportyAccountManagerImpl.setDocumentAuditStatus(i2, this) == y5bVar) {
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
