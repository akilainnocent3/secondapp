package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.environment.UrlConfigDataSource", f = "UrlConfigDataSource.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "getUrlConfig", v = 2)
public final class umh0 extends x1b {
    public tmh0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zmh0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public umh0(zmh0 zmh0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = zmh0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, null, this);
    }
}
