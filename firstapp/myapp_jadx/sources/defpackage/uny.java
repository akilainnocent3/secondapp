package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.domain.usecase.matchmaking.OnConfirmJoinRoomUseCase", f = "OnConfirmJoinRoomUseCase.kt", l = {30, DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "downloadSpineData", v = 1)
public final class uny extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ xny b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uny(xny xnyVar, x1b x1bVar) {
        super(x1bVar);
        this.b = xnyVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
