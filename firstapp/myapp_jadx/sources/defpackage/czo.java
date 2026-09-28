package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class czo {
    public final qkt<m020> a;
    public final o020 b;
    public boolean c;

    public czo(qkt<m020> qktVar, o020 o020Var) {
        this.a = qktVar;
        this.b = o020Var;
    }

    public final boolean a(long j) {
        Object obj;
        ArrayList arrayList = this.b.a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (k020.a(((p020) obj).a, j)) {
                break;
            }
            i++;
        }
        p020 p020Var = (p020) obj;
        if (p020Var != null) {
            return p020Var.h;
        }
        return false;
    }
}
