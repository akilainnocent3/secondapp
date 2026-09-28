package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.domain.FetchIntBackofficeKeyUseCase", f = "FetchIntBackofficeKeyUseCase.kt", l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invoke", v = 2)
public final class kih extends x1b {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lih c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kih(lih lihVar, x1b x1bVar) {
        super(x1bVar);
        this.c = lihVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0, this, null);
    }
}
