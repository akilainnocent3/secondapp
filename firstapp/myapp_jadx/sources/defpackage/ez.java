package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.repositories.AnTestRepository", f = "AnTestRepository.kt", l = {19}, m = "sendVisitInfo", v = 1)
public final class ez extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ gz b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez(gz gzVar, x1b x1bVar) {
        super(x1bVar);
        this.b = gzVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(0, 0, this);
    }
}
