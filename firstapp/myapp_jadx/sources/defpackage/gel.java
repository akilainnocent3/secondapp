package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.domain.HasCompletedFTDForLiveStreamUseCase", f = "HasCompletedFTDForLiveStreamUseCase.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER, 24, RuntimeVersion.MINOR}, m = "invoke", v = 2)
public final class gel extends x1b {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hel c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gel(hel helVar, x1b x1bVar) {
        super(x1bVar);
        this.c = helVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
