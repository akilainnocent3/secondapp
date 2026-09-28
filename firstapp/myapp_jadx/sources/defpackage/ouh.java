package defpackage;

import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {287}, m = "record")
public final class ouh extends x1b {
    public puh a;
    public IndexedValue b;
    public tuw c;
    public /* synthetic */ Object d;
    public final /* synthetic */ puh<Object> e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ouh(puh puhVar, x1b x1bVar) {
        super(x1bVar);
        this.e = puhVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
