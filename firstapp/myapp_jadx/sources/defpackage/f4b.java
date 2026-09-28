package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class f4b implements Function1<urr, Unit> {
    public final /* synthetic */ n6s a;

    public f4b(n6s n6sVar) {
        this.a = n6sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(urr urrVar) {
        urr urrVar2 = urrVar;
        vkf0 vkf0VarD = this.a.d();
        if (vkf0VarD != null) {
            vkf0VarD.c = urrVar2;
        }
        return Unit.a;
    }
}
