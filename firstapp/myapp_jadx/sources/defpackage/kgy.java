package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.liveoddsboost.data.OddsBoostRepositoryImpl", f = "OddsBoostRepositoryImpl.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "getOddsBoostLfbConfig", v = 2)
public final class kgy extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ mgy b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgy(mgy mgyVar, x1b x1bVar) {
        super(x1bVar);
        this.b = mgyVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
