package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.repo.BoostInfoRepoImpl", f = "BoostInfoRepoImpl.kt", l = {59, DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "fetchApi", v = 2)
public final class o25 extends x1b {
    public boolean a;
    public quw b;
    public /* synthetic */ Object c;
    public final /* synthetic */ s25 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o25(s25 s25Var, x1b x1bVar) {
        super(x1bVar);
        this.d = s25Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(false, this);
    }
}
