package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n020 {
    public final qkt<a> a = new qkt<>((Object) null);

    public static final class a {
        public final long a;
        public final long b;
        public final boolean c;

        public a(boolean z, long j, long j2) {
            this.a = j;
            this.b = j2;
            this.c = z;
        }
    }

    public final czo a(o020 o020Var, AndroidComposeView androidComposeView) {
        long jO;
        long j;
        boolean z;
        ArrayList arrayList = o020Var.a;
        qkt qktVar = new qkt(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            p020 p020Var = (p020) arrayList.get(i);
            long j2 = p020Var.a;
            qkt<a> qktVar2 = this.a;
            a aVarB = qktVar2.b(j2);
            if (aVarB == null) {
                j = p020Var.b;
                jO = p020Var.d;
                z = false;
            } else {
                long j3 = aVarB.a;
                boolean z2 = aVarB.c;
                jO = androidComposeView.o(aVarB.b);
                j = j3;
                z = z2;
            }
            long j4 = p020Var.a;
            ArrayList arrayList2 = arrayList;
            int i2 = size;
            qktVar.f(new m020(j4, p020Var.b, p020Var.d, p020Var.e, p020Var.f, j, jO, z, p020Var.g, p020Var.i, p020Var.j, p020Var.k), j4);
            boolean z3 = p020Var.e;
            if (z3) {
                qktVar2.f(new a(z3, p020Var.b, p020Var.c), j2);
            } else {
                qktVar2.g(j2);
            }
            i++;
            arrayList = arrayList2;
            size = i2;
        }
        return new czo(qktVar, o020Var);
    }
}
