package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager", f = "TextFieldSelectionManager.kt", l = {783}, m = "notifyPlatformSelectionBehaviorsOnShowContextMenu")
public final class jif0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ iif0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jif0(iif0 iif0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = iif0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.m(this);
    }
}
