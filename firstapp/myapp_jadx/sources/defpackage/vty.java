package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.oneuppromo.attribution.OneUpSelectionAttributionObserver", f = "OneUpSelectionAttributionObserver.kt", l = {48, 21}, m = "onSelectionChanged", v = 2)
public final class vty extends x1b {
    public yty a;
    public quw b;
    public Iterator c;
    public /* synthetic */ Object d;
    public final /* synthetic */ wty e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vty(wty wtyVar, x1b x1bVar) {
        super(x1bVar);
        this.e = wtyVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
