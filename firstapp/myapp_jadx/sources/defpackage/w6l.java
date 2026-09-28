package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.ui.graphics.layer.GraphicsLayer", f = "AndroidGraphicsLayer.android.kt", l = {869}, m = "toImageBitmap")
public final class w6l extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ v6l b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6l(v6l v6lVar, x1b x1bVar) {
        super(x1bVar);
        this.b = v6lVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(this);
    }
}
