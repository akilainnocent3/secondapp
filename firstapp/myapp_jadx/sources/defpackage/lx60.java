package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class lx60 implements rv60<Object, Object> {
    public final /* synthetic */ Function2<wv60, Object, Object> a;
    public final /* synthetic */ Function1<Object, Object> b;

    public lx60(Function1 function1, Function2 function2) {
        this.a = function2;
        this.b = function1;
    }

    @Override // defpackage.rv60
    public final Object a(wv60 wv60Var, Object obj) {
        return this.a.invoke(wv60Var, obj);
    }

    @Override // defpackage.rv60
    public final Object b(Object obj) {
        return this.b.invoke(obj);
    }
}
