package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class gzh implements lyh<Object> {
    public final /* synthetic */ Object a;

    public gzh(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super Object> myhVar, v1b<? super Unit> v1bVar) {
        Object objEmit = myhVar.emit(this.a, v1bVar);
        return objEmit == y5b.a ? objEmit : Unit.a;
    }
}
