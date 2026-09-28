package defpackage;

import androidx.recyclerview.widget.r;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventUseCase", f = "EventUseCase.kt", l = {r.d.DEFAULT_DRAG_ANIMATION_DURATION}, m = "insertCacheEvent-0E7RQCE", v = 2)
public final class asg extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ csg b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asg(csg csgVar, x1b x1bVar) {
        super(x1bVar);
        this.b = csgVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objB = this.b.b(null, 0, this);
        return objB == y5b.a ? objB : new zi50(objB);
    }
}
