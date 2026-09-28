package defpackage;

import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.campaign.vault.toast.BonusVaultToastResolver", f = "BonusVaultToastResolver.kt", l = {410, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "hideBonusVaultToast", v = 1)
public final class wv4 extends x1b {
    public quw a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ uv4 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv4(uv4 uv4Var, x1b x1bVar) {
        super(x1bVar);
        this.d = uv4Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
