package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.update.SportyAppUpdateManager", f = "SportyAppUpdateManager.kt", l = {280, 291}, m = "checkVersionSilently", v = 2)
public final class xgb0 extends x1b {
    public ResourceUiText a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fhb0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xgb0(fhb0 fhb0Var, x1b x1bVar) {
        super(x1bVar);
        this.d = fhb0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
