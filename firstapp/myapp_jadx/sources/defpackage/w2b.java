package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.domain.usecase.ConvertCodeUseCase", f = "ConvertCodeUseCase.kt", l = {51, 87, DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invoke", v = 2)
public final class w2b extends x1b {
    public String a;
    public BOConfigParam b;
    public Boolean c;
    public boolean d;
    public /* synthetic */ Object e;
    public final /* synthetic */ x2b f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2b(x2b x2bVar, x1b x1bVar) {
        super(x1bVar);
        this.f = x2bVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
