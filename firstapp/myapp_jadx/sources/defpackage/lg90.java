package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.domain.usecase.sidepanel.SidePanelSettingsUseCase", f = "SidePanelSettingsUseCase.kt", l = {35, DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER, DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 46}, m = "onSwitchClick", v = 1)
public final class lg90 extends x1b {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ og90 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg90(og90 og90Var, x1b x1bVar) {
        super(x1bVar);
        this.c = og90Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
