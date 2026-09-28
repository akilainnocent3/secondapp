package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ifg implements pya, faj {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ ifg(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.pya
    public void accept(Object obj) {
        ((fgg.e) this.a).invoke(obj);
    }

    @Override // defpackage.faj
    public Object apply(Object obj) {
        o5l o5lVar = (o5l) this.a;
        obj.getClass();
        o5lVar.invoke(obj);
        return Boolean.TRUE;
    }
}
