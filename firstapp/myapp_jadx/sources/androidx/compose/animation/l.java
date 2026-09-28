package androidx.compose.animation;

import defpackage.asr;
import defpackage.bxz;
import defpackage.d0b;
import defpackage.e490;
import defpackage.glt;
import defpackage.ht;
import defpackage.i060;
import defpackage.jh0;
import defpackage.lk40;
import defpackage.mmd;
import defpackage.n54;
import defpackage.rtw;
import defpackage.s9g;
import defpackage.ytw;

/* JADX INFO: loaded from: classes.dex */
public interface l extends glt {

    public interface a {
        bxz a(d dVar, lk40 lk40Var, asr asrVar, mmd mmdVar);
    }

    public interface b {
        public static final a a = a.a;

        public static final class a {
            public static final /* synthetic */ a a = new a();

            /* JADX INFO: renamed from: androidx.compose.animation.l$b$a$a, reason: collision with other inner class name */
            public static final class C0036a implements b {
                public static final C0036a b = new C0036a();

                @Override // androidx.compose.animation.l.b
                public final long a(long j, long j2) {
                    return j;
                }
            }
        }

        long a(long j, long j2);
    }

    public interface c {
        public static final a a = a.a;

        public static final class a {
            public static final /* synthetic */ a a = new a();
        }
    }

    public static final class d {
        public final String a;
        public final ytw b = androidx.compose.runtime.m.b(null);

        public d(String str) {
            this.a = str;
        }
    }

    static androidx.compose.ui.d C(l lVar, androidx.compose.ui.d dVar, d dVar2, jh0 jh0Var) {
        e490 e490Var = u.c;
        b.a.getClass();
        return lVar.w(dVar, dVar2, jh0Var, e490Var, u.b);
    }

    static androidx.compose.ui.d s(l lVar, androidx.compose.ui.d dVar, d dVar2, jh0 jh0Var, s9g s9gVar, g gVar, a aVar, int i) {
        i iVar;
        s9g s9gVarF = (i & 4) != 0 ? f.f(null, 3) : s9gVar;
        g gVarG = (i & 8) != 0 ? f.g(null, 3) : gVar;
        e490 e490Var = u.c;
        if ((i & 32) != 0) {
            c.a.getClass();
            rtw<d0b, rtw<ht, i>> rtwVar = u.d;
            d0b.a.d dVar3 = d0b.a.d;
            rtw<ht, i> rtwVarD = rtwVar.d(dVar3);
            if (rtwVarD == null) {
                rtwVarD = new rtw<>((Object) null);
                rtwVar.m(dVar3, rtwVarD);
            }
            rtw<ht, i> rtwVar2 = rtwVarD;
            n54 n54Var = ht.a.e;
            i iVarD = rtwVar2.d(n54Var);
            if (iVarD == null) {
                iVarD = new i();
                rtwVar2.m(n54Var, iVarD);
            }
            iVar = iVarD;
        } else {
            iVar = h.b;
        }
        c cVar = iVar;
        b.a.getClass();
        return lVar.A(dVar, dVar2, jh0Var, s9gVarF, gVarG, e490Var, cVar, (i & 512) != 0 ? u.b : aVar);
    }

    androidx.compose.ui.d A(androidx.compose.ui.d dVar, d dVar2, jh0 jh0Var, s9g s9gVar, g gVar, e490 e490Var, c cVar, a aVar);

    boolean i();

    d o(String str, androidx.compose.runtime.a aVar);

    androidx.compose.ui.d w(androidx.compose.ui.d dVar, d dVar2, jh0 jh0Var, e490 e490Var, u.a aVar);

    n.b x(i060 i060Var);
}
