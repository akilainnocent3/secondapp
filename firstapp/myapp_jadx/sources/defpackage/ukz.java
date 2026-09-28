package defpackage;

import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PBBetHistoryViewModel", f = "PBBetHistoryViewModel.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING}, m = "updateNotEmpty", v = 1)
public final class ukz extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ pkz b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ukz(pkz pkzVar, x1b x1bVar) {
        super(x1bVar);
        this.b = pkzVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.y1(null, null, this);
    }
}
