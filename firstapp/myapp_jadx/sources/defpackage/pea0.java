package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.search.SocialNetworkSearchViewModel$onQueryChanged$4$1$1", f = "SocialNetworkSearchViewModel.kt", l = {115}, m = "load", v = 2)
public final class pea0 extends x1b {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qea0.a c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pea0(qea0.a aVar, x1b x1bVar) {
        super(x1bVar);
        this.c = aVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, this);
    }
}
