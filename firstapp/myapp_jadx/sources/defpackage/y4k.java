package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.goldmine.collections.domain.usecase.GetCollectionsUseCase", f = "GetCollectionsUseCase.kt", l = {17, 18}, m = "invoke", v = 1)
public final class y4k extends x1b {
    public g48 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ z4k c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4k(z4k z4kVar, x1b x1bVar) {
        super(x1bVar);
        this.c = z4kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
