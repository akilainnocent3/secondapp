package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.goldmine.collections.data.repository.CollectionsRepository", f = "CollectionsRepository.kt", l = {21}, m = "getCollectionData", v = 1)
public final class z48 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ b58 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z48(b58 b58Var, x1b x1bVar) {
        super(x1bVar);
        this.b = b58Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
