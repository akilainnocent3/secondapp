package defpackage;

import com.sporty.android.common_ui.uitext.UiText;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.loyalty.domain.usecase.GetSportyTvLaunchUrlUseCase", f = "GetSportyTvLaunchUrlUseCase.kt", l = {28, 29}, m = "invoke", v = 2)
public final class iek extends x1b {
    public UiText a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ jek d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iek(jek jekVar, x1b x1bVar) {
        super(x1bVar);
        this.d = jekVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
