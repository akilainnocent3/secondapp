package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.searchv2.data.repository.SearchRepositoryImpl", f = "SearchRepositoryImpl.kt", l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "getSuggestedQueries-IoAF18A", v = 2)
public final class jx70 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ lx70 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx70(lx70 lx70Var, x1b x1bVar) {
        super(x1bVar);
        this.b = lx70Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objC = this.b.c(this);
        return objC == y5b.a ? objC : new zi50(objC);
    }
}
