package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.FootballFamilySpeedControllerRepoImpl", f = "FootballFamilySpeedControllerRepoImpl.kt", l = {35, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "recordRedDotDismissed", v = 2)
public final class mhi extends x1b {
    public String a;
    public wm20 b;
    public qhi c;
    public /* synthetic */ Object d;
    public final /* synthetic */ qhi e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhi(qhi qhiVar, x1b x1bVar) {
        super(x1bVar);
        this.e = qhiVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}
