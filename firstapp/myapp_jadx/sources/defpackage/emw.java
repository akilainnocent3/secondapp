package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class emw extends qlr implements Function0<xmz.b<Object>> {
    public final /* synthetic */ fmw<Object> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emw(fmw<Object> fmwVar) {
        super(0);
        this.a = fmwVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final xmz.b<Object> invoke() {
        xmz xmzVar = (xmz) CollectionsKt.firstOrNull(this.a.b.a.a.b());
        if (xmzVar == null || !(xmzVar instanceof xmz.b)) {
            return null;
        }
        xmz.b<Object> bVar = (xmz.b) xmzVar;
        if (bVar.a == kxs.a) {
            return bVar;
        }
        return null;
    }
}
