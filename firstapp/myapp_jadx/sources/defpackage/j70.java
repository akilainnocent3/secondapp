package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {55, 57}, m = "awaitLoad")
public final class j70 extends x1b {
    public dh50 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ k70 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j70(k70 k70Var, x1b x1bVar) {
        super(x1bVar);
        this.c = k70Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
