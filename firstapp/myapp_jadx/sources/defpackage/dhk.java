package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.worldcuptournament.domain.usecase.GetWorldCupSpecialsUseCase", f = "GetWorldCupSpecialsUseCase.kt", l = {18, DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invoke-BWLJW6A", v = 2)
public final class dhk extends x1b {
    public String a;
    public String b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ehk e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhk(ehk ehkVar, x1b x1bVar) {
        super(x1bVar);
        this.e = ehkVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        Object objA = this.e.a(0, this, null, null);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
