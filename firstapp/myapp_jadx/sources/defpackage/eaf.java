package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class eaf implements tse {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ ytw b;
    public final /* synthetic */ ytw c;
    public final /* synthetic */ v5b d;
    public final /* synthetic */ psw e;

    public eaf(v5b v5bVar, psw pswVar, ytw ytwVar, ytw ytwVar2, Function0 function0) {
        this.a = function0;
        this.b = ytwVar;
        this.c = ytwVar2;
        this.d = v5bVar;
        this.e = pswVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tse
    public final void dispose() {
        ytw ytwVar = this.b;
        if (((Boolean) ytwVar.getValue()).booleanValue()) {
            i9f.b bVar = (i9f.b) this.c.getValue();
            if (bVar != null) {
                ej5.c(this.d, null, null, new z9f(this.e, bVar, null), 3);
            }
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                this.a.invoke();
            }
            ytwVar.setValue(Boolean.FALSE);
        }
    }
}
