package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wgc implements nm20, faj {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ wgc(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.faj
    public Object apply(Object obj) {
        wah wahVar = (wah) this.a;
        obj.getClass();
        return (Boolean) wahVar.invoke(obj);
    }

    @Override // defpackage.nm20
    public boolean test(Object obj) {
        gp3 gp3Var = (gp3) this.a;
        obj.getClass();
        return ((Boolean) gp3Var.invoke(obj)).booleanValue();
    }
}
