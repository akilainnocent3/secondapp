package defpackage;

import android.content.Context;
import com.sporty.android.core.model.patron.KycSource;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.kyc.navigation.KycEntryNavigator", f = "KycEntryNavigator.kt", l = {55}, m = "verifyFailedIntentOrNull", v = 2)
public final class nsp extends x1b {
    public Context a;
    public KycSource b;
    public /* synthetic */ Object c;
    public final /* synthetic */ lsp d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsp(lsp lspVar, x1b x1bVar) {
        super(x1bVar);
        this.d = lspVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, null, this);
    }
}
