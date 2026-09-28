package defpackage;

import com.sporty.android.core.model.welcomereward.DepositFloatingIconPage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.DepositToUnlockBtManagerImpl", f = "DepositToUnlockBtManagerImpl.kt", l = {137}, m = "isFeatureEnabled", v = 2)
public final class l7e extends x1b {
    public DepositFloatingIconPage a;
    public /* synthetic */ Object b;
    public final /* synthetic */ j7e c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7e(j7e j7eVar, x1b x1bVar) {
        super(x1bVar);
        this.c = j7eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
