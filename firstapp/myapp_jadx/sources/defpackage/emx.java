package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.data.repository.error.NetworkCallsHandler", f = "NetworkCallsHandler.kt", l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, 30, 40}, m = "safeApiCall", v = 1)
public final class emx<T> extends x1b {
    public gox a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ylx d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emx(ylx ylxVar, x1b x1bVar) {
        super(x1bVar);
        this.d = ylxVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(null, null, this);
    }
}
