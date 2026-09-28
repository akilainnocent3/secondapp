package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.plugin.myfavorite.datastore.MyFavouritesDataStoreImpl", f = "MyFavouritesDataStoreImpl.kt", l = {DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER}, m = "disableAddMoreSettings", v = 2)
public final class jzw extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ mzw b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzw(mzw mzwVar, x1b x1bVar) {
        super(x1bVar);
        this.b = mzwVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
