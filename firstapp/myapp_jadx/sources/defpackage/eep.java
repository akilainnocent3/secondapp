package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class eep extends p3 {
    public scp g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eep(wbp wbpVar, Function1<? super scp, Unit> function1) {
        super(wbpVar, function1);
        wbpVar.getClass();
        function1.getClass();
        ((ArrayList) this.a).add("primitive");
    }

    @Override // defpackage.p3
    public final scp n0() {
        scp scpVar = this.g;
        if (scpVar != null) {
            return scpVar;
        }
        hb5.a("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
        return null;
    }

    @Override // defpackage.p3
    public final void o0(scp scpVar, String str) {
        str.getClass();
        scpVar.getClass();
        if (str != "primitive") {
            hb5.a("This output can only consume primitives with 'primitive' tag");
        } else if (this.g != null) {
            hb5.a("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
        } else {
            this.g = scpVar;
            this.c.invoke(scpVar);
        }
    }
}
