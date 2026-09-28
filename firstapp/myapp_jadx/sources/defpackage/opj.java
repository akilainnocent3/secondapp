package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.domain.manager.gameplay.GameplayPayloadManager", f = "GameplayPayloadManager.kt", l = {203}, m = "getNickname", v = 1)
public final class opj extends x1b {
    public long a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rpj c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opj(rpj rpjVar, x1b x1bVar) {
        super(x1bVar);
        this.c = rpjVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(0L, this);
    }
}
