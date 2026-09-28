package defpackage;

import kotlin.text.c;

/* JADX INFO: loaded from: classes8.dex */
public final class fyx implements klf0 {
    public static final fyx b = new fyx();
    public final /* synthetic */ int a = 0;

    public static final String b(String str) {
        str.getClass();
        if (str.length() == 0) {
            return "*****";
        }
        if (str.length() < 5) {
            return wae0.F(str) + c.o(str.length() - 1, "*");
        }
        return wae0.F(str) + "***" + wae0.I(str);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "NoopTextMapPropagator";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.klf0
    public void a(m0b m0bVar, Object obj, llf0 llf0Var) {
    }
}
