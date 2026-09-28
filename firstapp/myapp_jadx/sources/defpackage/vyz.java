package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.patron.PatronRepositoryImpl", f = "PatronRepositoryImpl.kt", l = {755}, m = "preRegister", v = 2)
public final class vyz extends x1b {
    public ResourceUiText a;
    public /* synthetic */ Object b;
    public final /* synthetic */ nyz c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyz(nyz nyzVar, x1b x1bVar) {
        super(x1bVar);
        this.c = nyzVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.o0(null, null, null, null, this);
    }
}
