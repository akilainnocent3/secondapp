package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.data.repository.SocialFollowerMediator", f = "SocialFollowerMediator.kt", l = {46, 54, 59, 65}, m = "loadMore", v = 2)
public final class r9a0 extends x1b {
    public xqz a;
    public String b;
    public List c;
    public boolean d;
    public int e;
    public int f;
    public /* synthetic */ Object i;
    public final /* synthetic */ t9a0 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9a0(t9a0 t9a0Var, x1b x1bVar) {
        super(x1bVar);
        this.v = t9a0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(null, false, this);
    }
}
