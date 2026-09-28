package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.patron.KYCBannerItem;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.facialrecognition.domain.GetFacialRecognitionStatusUseCase", f = "GetFacialRecognitionStatusUseCase.kt", l = {KYCBannerItem.STATUS_DEPRECATE, DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "invoke", v = 2)
public final class h6k extends x1b {
    public String a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ g6k e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6k(g6k g6kVar, x1b x1bVar) {
        super(x1bVar);
        this.e = g6kVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(0, this, null);
    }
}
