package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.repositories.AnTestRepository", f = "AnTestRepository.kt", l = {12}, m = "getParticipateInfo", v = 1)
public final class az extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ gz b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az(gz gzVar, x1b x1bVar) {
        super(x1bVar);
        this.b = gzVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
