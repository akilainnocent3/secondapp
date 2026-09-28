package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "coil3.network.NetworkFetcher", f = "NetworkFetcher.kt", l = {245}, m = "toImageSource")
public final class xmx extends x1b {
    public lb5 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vmx c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmx(vmx vmxVar, x1b x1bVar) {
        super(x1bVar);
        this.c = vmxVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.g(null, this);
    }
}
