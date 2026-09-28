package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.devicemanagement.impl.data.PatronDeviceRepositoryImpl", f = "PatronDeviceRepositoryImpl.kt", l = {56}, m = "checkShouldShowTooltip", v = 2)
public final class cyz extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ hyz b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyz(hyz hyzVar, x1b x1bVar) {
        super(x1bVar);
        this.b = hyzVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, this);
    }
}
