package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class caf implements Function0 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ ytw b;
    public final /* synthetic */ v5b c;
    public final /* synthetic */ psw d;
    public final /* synthetic */ ytw e;

    public /* synthetic */ caf(v5b v5bVar, psw pswVar, ytw ytwVar, ytw ytwVar2, Function0 function0) {
        this.a = function0;
        this.b = ytwVar;
        this.c = v5bVar;
        this.d = pswVar;
        this.e = ytwVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        i9f.b bVar = (i9f.b) this.b.getValue();
        if (bVar != null) {
            ej5.c(this.c, null, null, new daf.c(this.d, bVar, null), 3);
        }
        ytw ytwVar = this.e;
        if (((Boolean) ytwVar.getValue()).booleanValue()) {
            this.a.invoke();
        }
        ytwVar.setValue(Boolean.FALSE);
        return Unit.a;
    }
}
