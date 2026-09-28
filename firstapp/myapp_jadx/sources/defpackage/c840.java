package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.a;

/* JADX INFO: loaded from: classes.dex */
public final class c840 extends a implements l5b {
    public final /* synthetic */ kgt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c840(kgt kgtVar) {
        super(l5b.a.a);
        this.a = kgtVar;
    }

    @Override // defpackage.l5b
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        kgt kgtVar = this.a;
        if (kgtVar != null) {
            kgt.a aVarA = kgtVar.a();
            kgt.a aVar = kgt.a.e;
            if (aVarA.compareTo(aVar) <= 0) {
                kgtVar.b("RealImageLoader", aVar, null, th);
            }
        }
    }
}
