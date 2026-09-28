package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vid implements do8 {
    @Override // defpackage.do8
    public final Object a(hi50 hi50Var) {
        Set setE = hi50Var.e(bb30.a(o9s.class));
        p1l p1lVar = p1l.b;
        if (p1lVar == null) {
            synchronized (p1l.class) {
                try {
                    p1lVar = p1l.b;
                    if (p1lVar == null) {
                        p1lVar = new p1l();
                        p1l.b = p1lVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new wid(setE, p1lVar);
    }
}
