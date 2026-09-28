package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.goldmine.ui.animationpanel.TGAnimationViewModel", f = "TGAnimationViewModel.kt", l = {173, 176}, m = "handleRequestEvent", v = 1)
public final class ese0 extends x1b {
    public na50 a;
    public Iterable b;
    public Iterator c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ise0 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ese0(ise0 ise0Var, x1b x1bVar) {
        super(x1bVar);
        this.i = ise0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.y1(null, this);
    }
}
