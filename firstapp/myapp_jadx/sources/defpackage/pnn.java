package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.google.firebase.sessions.InstallationId$Companion", f = "InstallationId.kt", l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "create")
public final class pnn extends x1b {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qnn.a c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnn(qnn.a aVar, x1b x1bVar) {
        super(x1bVar);
        this.c = aVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
