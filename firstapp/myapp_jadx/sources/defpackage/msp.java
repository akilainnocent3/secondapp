package defpackage;

import com.sporty.android.core.model.patron.KycHintExtra;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.kyc.navigation.KycEntryNavigator", f = "KycEntryNavigator.kt", l = {67, 69, 70}, m = "currentKycHintState", v = 2)
public final class msp extends x1b {
    public KycHintExtra a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ lsp d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msp(lsp lspVar, x1b x1bVar) {
        super(x1bVar);
        this.d = lspVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
