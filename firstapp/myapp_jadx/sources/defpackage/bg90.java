package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class bg90 extends x1b {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ yf90.k.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg90(yf90.k.c cVar, v1b v1bVar) {
        super(v1bVar);
        this.c = cVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.c(this);
    }
}
