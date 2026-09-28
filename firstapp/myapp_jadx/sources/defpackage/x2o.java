package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.InstantRacingRepoImpl", f = "InstantRacingRepoImpl.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "getEventInfo-BWLJW6A", v = 2)
public final class x2o extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ e3o b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2o(e3o e3oVar, x1b x1bVar) {
        super(x1bVar);
        this.b = e3oVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(null, null, false, this);
        return objB == y5b.a ? objB : new zi50(objB);
    }
}
