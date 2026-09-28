package defpackage;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.domain.manager.dialog.DialogManager", f = "DialogManager.kt", l = {52, 58}, m = "handleGameOver", v = 1)
public final class tle extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ule b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tle(ule uleVar, x1b x1bVar) {
        super(x1bVar);
        this.b = uleVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, this);
    }
}
