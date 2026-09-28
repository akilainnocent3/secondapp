package defpackage;

import java.util.function.Consumer;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class zom implements Consumer {
    public final /* synthetic */ apm a;
    public final /* synthetic */ rm8 b;
    public final /* synthetic */ w0h.a c;

    public /* synthetic */ zom(apm apmVar, rm8 rm8Var, w0h.a aVar) {
        this.a = apmVar;
        this.b = rm8Var;
        this.c = aVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        String name = th.getClass().getName();
        w0h.a aVar = this.c;
        x0h.a aVar2 = aVar.a;
        Long l = aVar.b;
        vw0 vw0VarC = l != null ? m21.c(la80.d, l) : vw0.d;
        if (aVar2.a) {
            ib5.a("Recording already ended");
            return;
        }
        aVar2.a = true;
        if (name.isEmpty()) {
            hb5.a("The export failed but no failure reason was provided");
            return;
        }
        aVar2.a(name, vw0VarC);
        apm apmVar = this.a;
        apmVar.a.a(Level.SEVERE, "Failed to export " + apmVar.c + "s. The request could not be executed. Full error message: " + th.getMessage(), th);
        int i = c9h.a;
        this.b.a(new c9h.a(null, th));
    }
}
