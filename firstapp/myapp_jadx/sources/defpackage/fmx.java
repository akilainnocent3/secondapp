package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.data.repository.error.NetworkCallsHandler", f = "NetworkCallsHandler.kt", l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, 29, 41}, m = "safeApiCall", v = 1)
public final class fmx<T> extends x1b {
    public hox a;
    public /* synthetic */ Object b;
    public final /* synthetic */ zlx c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmx(zlx zlxVar, x1b x1bVar) {
        super(x1bVar);
        this.c = zlxVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(null, null, this);
    }
}
