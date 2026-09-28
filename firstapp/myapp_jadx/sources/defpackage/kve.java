package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.giftreceived.presentation.dobreceived.DobGiftReceivedViewModel", f = "DobGiftReceivedViewModel.kt", l = {80, 79}, m = "handleGiftHintTracking", v = 2)
public final class kve extends x1b {
    public String a;
    public oh80 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jve d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kve(jve jveVar, x1b x1bVar) {
        super(x1bVar);
        this.d = jveVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.x1(null, this);
    }
}
