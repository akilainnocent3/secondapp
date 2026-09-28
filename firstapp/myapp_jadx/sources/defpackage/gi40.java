package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.searchv2.data.local.RecentSearchQueriesDataStore", f = "RecentSearchQueriesDataStore.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "removeRecentQuery", v = 2)
public final class gi40 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ci40 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi40(ci40 ci40Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ci40Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
