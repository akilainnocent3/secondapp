package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.plugin.common.gift.GiftViewModel", f = "GiftViewModel.kt", l = {534, 338, 347, 351, 355}, m = "parseGiftDataAndGetFirstInternal", v = 2)
public final class zyk extends x1b {
    public boolean a;
    public quw b;
    public yyk c;
    public /* synthetic */ Object d;
    public final /* synthetic */ yyk e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyk(yyk yykVar, x1b x1bVar) {
        super(x1bVar);
        this.e = yykVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.G1(false, this);
    }
}
