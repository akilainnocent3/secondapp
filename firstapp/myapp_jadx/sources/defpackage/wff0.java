package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wff0 implements Function1<ddv, Unit> {
    public final /* synthetic */ urr a;

    public wff0(urr urrVar) {
        this.a = urrVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ddv ddvVar) {
        float[] fArr = ddvVar.a;
        urr urrVar = this.a;
        if (urrVar.e()) {
            eb9.c(urrVar).C(urrVar, fArr);
        }
        return Unit.a;
    }
}
