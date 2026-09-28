package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.facialrecognition.domain.GetFacialRecognitionSessionTokenUseCase", f = "GetFacialRecognitionSessionTokenUseCase.kt", l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, 46}, m = "invoke", v = 2)
public final class e6k extends x1b {
    public String a;
    public q7h b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ f6k f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6k(f6k f6kVar, x1b x1bVar) {
        super(x1bVar);
        this.f = f6kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.a(null, null, 0, this);
    }
}
