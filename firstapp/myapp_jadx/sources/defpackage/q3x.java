package defpackage;

import com.sportybet.android.data.NCResponse;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.notificationcenter.pager.NCRemoteMediator", f = "NCRemoteMediator.kt", l = {50, 56, 61}, m = "fetchMoreBackwards", v = 2)
public final class q3x extends x1b {
    public int a;
    public boolean b;
    public u2x c;
    public NCResponse d;
    public /* synthetic */ Object e;
    public final /* synthetic */ s3x f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3x(s3x s3xVar, x1b x1bVar) {
        super(x1bVar);
        this.f = s3xVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.c(0, false, this);
    }
}
