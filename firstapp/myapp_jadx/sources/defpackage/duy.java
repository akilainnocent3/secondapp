package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.oneuppromo.attribution.OneUpTagAttributionRecorder", f = "OneUpTagAttributionRecorder.kt", l = {20, 24}, m = "onSelectionChanged", v = 2)
public final class duy extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ euy b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duy(euy euyVar, x1b x1bVar) {
        super(x1bVar);
        this.b = euyVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
