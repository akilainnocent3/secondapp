package defpackage;

import androidx.media3.common.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u580 {
    public final List<a> a;
    public final njg0[] b;
    public final g850 c = new g850(new g850.b() { // from class: t580
        @Override // g850.b
        public final void a(long j, nsz nszVar) {
            zu6.a(j, nszVar, this.a.b);
        }
    });

    public u580(List list) {
        this.a = list;
        this.b = new njg0[list.size()];
    }

    public final void a(m4h m4hVar, wxg0.c cVar) {
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
            ly0.a("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = aVar.a;
            if (str2 == null) {
                cVar.b();
                str2 = cVar.e;
            }
            a.C0062a c0062a = new a.C0062a();
            c0062a.a = str2;
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
