package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "coil3.compose.AsyncImagePreviewHandler$Companion$Default$1", f = "LocalAsyncImagePreviewHandler.kt", l = {38}, m = "handle")
public final class e01 extends x1b {
    public nan a;
    public /* synthetic */ Object b;
    public final /* synthetic */ f01.a c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e01(f01.a aVar, x1b x1bVar) {
        super(x1bVar);
        this.c = aVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
