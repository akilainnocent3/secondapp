package defpackage;

import com.google.protobuf.RuntimeVersion;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.InstantRacingRepoImpl", f = "InstantRacingRepoImpl.kt", l = {RuntimeVersion.MINOR}, m = "userCheck-gIAlu-s", v = 2)
public final class d3o extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ e3o b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3o(e3o e3oVar, x1b x1bVar) {
        super(x1bVar);
        this.b = e3oVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objG = this.b.g(null, this);
        return objG == y5b.a ? objG : new zi50(objG);
    }
}
