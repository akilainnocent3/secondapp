package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.extensions.SemaphoreExtKt", f = "SemaphoreExt.kt", l = {6, 8}, m = "withPermit", v = 2)
public final class zb80<T> extends x1b {
    public bc80 a;
    public vuh.a.C1227a b;
    public /* synthetic */ Object c;
    public int d;

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return ac80.a(null, null, this);
    }
}
