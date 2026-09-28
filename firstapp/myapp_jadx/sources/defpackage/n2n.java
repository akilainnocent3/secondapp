package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class n2n implements tse {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ ont b;
    public final /* synthetic */ isw c;
    public final /* synthetic */ ytw d;

    public n2n(Function0 function0, ont ontVar, isw iswVar, ytw ytwVar) {
        this.a = function0;
        this.b = ontVar;
        this.c = iswVar;
        this.d = ytwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tse
    public final void dispose() {
        Function0 function0;
        if (this.b.getValue() != null) {
            isw iswVar = this.c;
            if (iswVar.j() <= 0.0f || iswVar.j() >= 0.9f || ((Boolean) this.d.getValue()).booleanValue() || (function0 = this.a) == null) {
                return;
            }
            function0.invoke();
        }
    }
}
