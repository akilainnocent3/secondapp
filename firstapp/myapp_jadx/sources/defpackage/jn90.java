package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.SimulationRepoImpl", f = "SimulationRepoImpl.kt", l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "getTicketDetail-gIAlu-s", v = 2)
public final class jn90 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ln90 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn90(ln90 ln90Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ln90Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objD = this.b.d(null, this);
        return objD == y5b.a ? objD : new zi50(objD);
    }
}
