package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class shs implements nv5.c<List<Object>> {
    public final /* synthetic */ vhs a;

    public shs(vhs vhsVar) {
        this.a = vhsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nv5.c
    public final Object a(nv5.a<List<Object>> aVar) {
        vhs vhsVar = this.a;
        km20.g("The result can only set once!", vhsVar.f == null);
        vhsVar.f = aVar;
        return "ListFuture[" + this + "]";
    }
}
