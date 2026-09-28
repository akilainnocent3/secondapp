package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sj40 implements Function1 {
    public final /* synthetic */ t2b a;
    public final /* synthetic */ stw b;

    public /* synthetic */ sj40(t2b t2bVar, stw stwVar) {
        this.a = t2bVar;
        this.b = stwVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.r(obj);
        stw stwVar = this.b;
        if (stwVar != null) {
            stwVar.d(obj);
        }
        return Unit.a;
    }
}
