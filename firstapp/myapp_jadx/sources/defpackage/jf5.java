package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class jf5 implements ssd0 {
    public final /* synthetic */ dvd0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function1<String, Unit> c;
    public final /* synthetic */ ytw<Boolean> d;

    /* JADX WARN: Multi-variable type inference failed */
    public jf5(dvd0 dvd0Var, String str, Function1<? super String, Unit> function1, ytw<Boolean> ytwVar) {
        this.a = dvd0Var;
        this.b = str;
        this.c = function1;
        this.d = ytwVar;
    }

    @Override // defpackage.ssd0
    public final void a() {
        this.c.invoke("");
    }

    @Override // defpackage.ssd0
    public final void b() {
        String str = this.b;
        String strE = str != null ? wae0.E(str) : null;
        if (strE == null) {
            strE = "";
        }
        this.c.invoke(strE);
    }

    @Override // defpackage.ssd0
    public final void c(String str) {
        str.getClass();
        if (this.a.c) {
            return;
        }
        String str2 = this.b;
        if (str2 == null) {
            str2 = "";
        }
        this.c.invoke(kn5.a(str2, str));
    }

    @Override // defpackage.ssd0
    public final void d(boolean z) {
        this.d.setValue(Boolean.FALSE);
    }
}
