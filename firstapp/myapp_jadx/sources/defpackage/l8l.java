package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l8l {
    static {
        new fhf();
        new nui();
        w5i0.a aVar = w5i0.a.a;
        new w5i0();
        new z8n();
    }

    public l8l() {
        hwr.b(new Function0() { // from class: k8l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i;
                int iOrdinal = this.a.a().ordinal();
                if (iOrdinal != 0) {
                    i = 1;
                    if (iOrdinal != 1) {
                        i = 2;
                        if (iOrdinal != 2) {
                            i = 3;
                            if (iOrdinal != 3) {
                                uhc.a();
                                return null;
                            }
                        }
                    }
                } else {
                    i = 0;
                }
                return Integer.valueOf(i);
            }
        });
    }

    public abstract kch a();

    public boolean b(m26 m26Var, e6s e6sVar) {
        m26Var.getClass();
        return true;
    }
}
