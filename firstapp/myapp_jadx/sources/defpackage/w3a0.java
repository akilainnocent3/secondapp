package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", l = {428, 431}, m = "showSnackbar")
public final class w3a0 extends x1b {
    public n4a0 a;
    public quw b;
    public /* synthetic */ Object c;
    public final /* synthetic */ v3a0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3a0(v3a0 v3a0Var, v1b<? super w3a0> v1bVar) {
        super(v1bVar);
        this.d = v3a0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
