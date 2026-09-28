package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.oneuppromo.attribution.OneUpSelectionAttributionObserver", f = "OneUpSelectionAttributionObserver.kt", l = {48, 33}, m = "clear", v = 2)
public final class uty extends x1b {
    public quw a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wty d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uty(wty wtyVar, x1b x1bVar) {
        super(x1bVar);
        this.d = wtyVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
