package defpackage;

import com.sportybet.android.social.data.remote.entity.CreatorCreditsData;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.data.repository.CreatorCreditsMediator", f = "CreatorCreditsMediator.kt", l = {41, 48, 53}, m = "loadMore", v = 2)
public final class q2c extends x1b {
    public xqz a;
    public CreatorCreditsData b;
    public boolean c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ s2c i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2c(s2c s2cVar, x1b x1bVar) {
        super(x1bVar);
        this.i = s2cVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.c(null, false, this);
    }
}
