package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.Set;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.oneuppromo.attribution.OneUpPromoAttributionDataStore", f = "OneUpPromoAttributionDataStore.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING, DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "consume", v = 2)
public final class usy extends x1b {
    public Set a;
    public quw b;
    public yp40 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ysy e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usy(ysy ysyVar, x1b x1bVar) {
        super(x1bVar);
        this.e = ysyVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
