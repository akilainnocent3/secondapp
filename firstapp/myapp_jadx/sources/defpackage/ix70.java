package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import com.sportybet.plugin.realsports.searchv2.domain.model.SearchFeatureConfig;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.searchv2.data.repository.SearchRepositoryImpl", f = "SearchRepositoryImpl.kt", l = {RuntimeVersion.MINOR, DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "getSearchResults-gIAlu-s", v = 2)
public final class ix70 extends x1b {
    public String a;
    public SearchFeatureConfig b;
    public /* synthetic */ Object c;
    public final /* synthetic */ lx70 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix70(lx70 lx70Var, x1b x1bVar) {
        super(x1bVar);
        this.d = lx70Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        Object objB = this.d.b(null, this);
        return objB == y5b.a ? objB : new zi50(objB);
    }
}
