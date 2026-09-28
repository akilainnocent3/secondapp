package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xgc implements nm20, pya {
    public final /* synthetic */ Function1 a;

    @Override // defpackage.pya
    public void accept(Object obj) {
        ((bbh.d) this.a).invoke(obj);
    }

    @Override // defpackage.nm20
    public boolean test(Object obj) {
        vgc vgcVar = (vgc) this.a;
        obj.getClass();
        return ((Boolean) vgcVar.invoke(obj)).booleanValue();
    }
}
