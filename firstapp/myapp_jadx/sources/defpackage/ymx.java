package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {138, 153}, m = "writeToDiskCache")
public final class ymx extends x1b {
    public ere.c a;
    public iox b;
    public iox c;
    public ere.b d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vmx f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymx(vmx vmxVar, x1b x1bVar) {
        super(x1bVar);
        this.f = vmxVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.i(null, null, null, null, this);
    }
}
