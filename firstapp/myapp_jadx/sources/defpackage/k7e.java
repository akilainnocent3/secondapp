package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.DepositToUnlockBtManagerImpl", f = "DepositToUnlockBtManagerImpl.kt", l = {159}, m = "isClosedToday", v = 2)
public final class k7e extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ j7e b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7e(j7e j7eVar, x1b x1bVar) {
        super(x1bVar);
        this.b = j7eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
