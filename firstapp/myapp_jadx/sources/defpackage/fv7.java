package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.codeChat.domain.CodeChatListDataSource", f = "CodeChatListDataSource.kt", l = {21}, m = "load", v = 2)
public final class fv7 extends x1b {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gv7 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv7(gv7 gv7Var, x1b x1bVar) {
        super(x1bVar);
        this.c = gv7Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(null, this);
    }
}
