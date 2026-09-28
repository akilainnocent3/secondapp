package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {214, 118}, m = "writeScope")
public final class ukh extends x1b {
    public vkh a;
    public Object b;
    public Object c;
    public klh d;
    public /* synthetic */ Object e;
    public final /* synthetic */ vkh<Object> f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ukh(vkh vkhVar, x1b x1bVar) {
        super(x1bVar);
        this.f = vkhVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
