package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager", f = "TextFieldSelectionManager.kt", l = {777}, m = "updateClipboardEntry$foundation_release")
public final class lif0 extends x1b {
    public iif0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ iif0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lif0(iif0 iif0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = iif0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.s(this);
    }
}
