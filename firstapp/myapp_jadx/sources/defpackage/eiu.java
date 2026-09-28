package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.network.metadata.MaidMetadataProvider", f = "MaidMetadataProvider.kt", l = {33, DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER}, m = "collectMaidMetadata", v = 2)
public final class eiu extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ diu c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eiu(diu diuVar, x1b x1bVar) {
        super(x1bVar);
        this.c = diuVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
