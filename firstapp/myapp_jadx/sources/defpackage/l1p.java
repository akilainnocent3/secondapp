package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.codehub.usecase.IsCodeHubWorldCupTabEnabledUseCase", f = "IsCodeHubWorldCupTabEnabledUseCase.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invoke", v = 2)
public final class l1p extends x1b {
    public BOConfigParam a;
    public Boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ m1p d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1p(m1p m1pVar, x1b x1bVar) {
        super(x1bVar);
        this.d = m1pVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
