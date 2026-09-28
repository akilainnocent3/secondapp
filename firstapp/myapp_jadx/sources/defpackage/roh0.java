package defpackage;

import androidx.media3.common.a;
import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class roh0 {
    public final List<a> a;
    public final njg0[] b;
    public final g850 c;

    public roh0(List list) {
        this.a = list;
        this.b = new njg0[list.size()];
        g850 g850Var = new g850(new g850.b() { // from class: qoh0
            @Override // g850.b
            public final void a(long j, nsz nszVar) {
                zu6.b(j, nszVar, this.a.b);
            }
        });
        this.c = g850Var;
        g850Var.c(3);
    }

    public final void a(long j, nsz nszVar) {
        if (nszVar.a() < 9) {
            return;
        }
        int iJ = nszVar.j();
        int iJ2 = nszVar.j();
        int iW = nszVar.w();
        if (iJ == 434 && iJ2 == 1195456820 && iW == 3) {
            this.c.a(j, nszVar);
        }
    }

    public final void b(m4h m4hVar, wxg0.c cVar) {
        int i = 0;
        while (true) {
            njg0[] njg0VarArr = this.b;
            if (i >= njg0VarArr.length) {
                return;
            }
            cVar.a();
            cVar.b();
            njg0 njg0VarR = m4hVar.r(cVar.d, 3);
            a aVar = this.a.get(i);
            String str = aVar.n;
            ly0.a(tYcQsJyaojE.kLJJnRRndpEz + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            a.C0062a c0062a = new a.C0062a();
            cVar.b();
            c0062a.a = cVar.e;
            c0062a.l = gqv.m("video/mp2t");
            c0062a.m = gqv.m(str);
            c0062a.e = aVar.e;
            c0062a.d = aVar.d;
            c0062a.J = aVar.K;
            c0062a.p = aVar.q;
            p0j0.a(c0062a, njg0VarR);
            njg0VarArr[i] = njg0VarR;
            i++;
        }
    }
}
