package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.win.PopupDisplayCoordinator", f = "PopupDisplayCoordinator.kt", l = {242}, m = "displayPopup", v = 2)
public final class j420 extends x1b {
    public m420 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i420 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j420(i420 i420Var, x1b x1bVar) {
        super(x1bVar);
        this.c = i420Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        AtomicBoolean atomicBoolean = i420.F;
        return this.c.a(null, null, this);
    }
}
