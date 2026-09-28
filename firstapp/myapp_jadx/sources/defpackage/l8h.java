package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.repository.factscenterRepo.FactsCenterRepoImpl", f = "FactsCenterRepoImpl.kt", l = {276}, m = "getLiveMatchThumbnail", v = 2)
public final class l8h extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ g8h b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8h(g8h g8hVar, x1b x1bVar) {
        super(x1bVar);
        this.b = g8hVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(null, this);
    }
}
