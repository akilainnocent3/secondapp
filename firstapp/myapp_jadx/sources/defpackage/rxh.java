package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", l = {739}, m = "snapElevation")
public final class rxh extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ sxh b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxh(sxh sxhVar, x1b x1bVar) {
        super(x1bVar);
        this.b = sxhVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
