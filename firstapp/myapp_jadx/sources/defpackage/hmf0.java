package defpackage;

import android.os.Trace;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hmf0 extends d.c implements psr, qcf, ya80 {
    public String D;
    public imf0 E;
    public f8i.a F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public HashMap K;
    public orz L;
    public tlb M;
    public a N;

    public static final class a {
        public final String a;
        public String b;
        public boolean c = false;
        public orz d = null;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b) && this.c == aVar.c && Intrinsics.g(this.d, aVar.d);
        }

        public final int hashCode() {
            int iA = mtg0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            orz orzVar = this.d;
            return iA + (orzVar == null ? 0 : orzVar.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
            sb.append(this.d);
            sb.append(", isShowingSubstitution=");
            return ruw.a(sb, this.c, ')');
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0016  */
    @Override // defpackage.qcf
    public final void A(wsr wsrVar) {
        orz orzVarP2;
        if (this.C) {
            a aVar = this.N;
            if (aVar == null) {
                orzVarP2 = p2();
            } else {
                if (!aVar.c) {
                    aVar = null;
                }
                if (aVar == null || (orzVarP2 = aVar.d) == null) {
                    orzVarP2 = p2();
                }
            }
            e90 e90Var = orzVarP2.j;
            if (e90Var == null) {
                zkn.b("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this.L + ", textSubstitution=" + this.N + ')');
                fkd.a();
                return;
            }
            lc6 lc6VarA = wsrVar.a.b.a();
            boolean z = orzVarP2.k;
            if (z) {
                long j = orzVarP2.l;
                lc6VarA.p();
                lc6VarA.d(0.0f, 0.0f, (int) (j >> 32), (int) (j & 4294967295L), 1);
            }
            try {
                ora0 ora0Var = this.E.a;
                yef0 yef0Var = ora0Var.m;
                if (yef0Var == null) {
                    yef0Var = yef0.b;
                }
                yef0 yef0Var2 = yef0Var;
                ix80 ix80Var = ora0Var.n;
                if (ix80Var == null) {
                    ix80Var = ix80.d;
                }
                ix80 ix80Var2 = ix80Var;
                wcf wcfVar = ora0Var.p;
                if (wcfVar == null) {
                    wcfVar = rlh.a;
                }
                wcf wcfVar2 = wcfVar;
                ya5 ya5VarE = ora0Var.a.e();
                if (ya5VarE != null) {
                    e90Var.k(lc6VarA, ya5VarE, this.E.a.a.a(), ix80Var2, yef0Var2, wcfVar2);
                } else {
                    long jC = j58.m;
                    if (jC == 16) {
                        jC = this.E.c() != 16 ? this.E.c() : j58.b;
                    }
                    e90Var.j(lc6VarA, jC, ix80Var2, yef0Var2, wcfVar2);
                }
            } finally {
                if (z) {
                    lc6VarA.f();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.psr
    public final int C(xkt xktVar, mzo mzoVar, int i) {
        orz orzVarP2;
        a aVar = this.N;
        if (aVar == null) {
            orzVarP2 = p2();
        } else {
            if (!aVar.c) {
                aVar = null;
            }
            if (aVar == null || (orzVarP2 = aVar.d) == null) {
                orzVarP2 = p2();
            }
        }
        orzVarP2.d(xktVar);
        return cff0.a(orzVarP2.e(xktVar.getLayoutDirection()).b());
    }

    @Override // defpackage.ya80
    public final void G0(pb80 pb80Var) {
        tlb tlbVar = this.M;
        if (tlbVar == null) {
            tlbVar = new tlb(this, 2);
            this.M = tlbVar;
        }
        nk0 nk0Var = new nk0(this.D);
        ohp<Object>[] ohpVarArr = lb80.a;
        pb80Var.b(hb80.A, kotlin.collections.a.c(nk0Var));
        a aVar = this.N;
        if (aVar != null) {
            boolean z = aVar.c;
            ob80<Boolean> ob80Var = hb80.C;
            ohp<Object>[] ohpVarArr2 = lb80.a;
            ohp<Object> ohpVar = ohpVarArr2[16];
            pb80Var.b(ob80Var, Boolean.valueOf(z));
            nk0 nk0Var2 = new nk0(aVar.b);
            ob80<nk0> ob80Var2 = hb80.B;
            ohp<Object> ohpVar2 = ohpVarArr2[15];
            pb80Var.b(ob80Var2, nk0Var2);
        }
        pb80Var.b(ra80.k, new c6(null, new Function1() { // from class: emf0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str = ((nk0) obj).b;
                hmf0 hmf0Var = this.a;
                hmf0.a aVar2 = hmf0Var.N;
                if (aVar2 == null) {
                    hmf0.a aVar3 = new hmf0.a(hmf0Var.D, str);
                    orz orzVar = new orz(str, hmf0Var.E, hmf0Var.F, hmf0Var.G, hmf0Var.H, hmf0Var.I, hmf0Var.J);
                    orzVar.d(hmf0Var.p2().i);
                    aVar3.d = orzVar;
                    hmf0Var.N = aVar3;
                } else if (!Intrinsics.g(str, aVar2.b)) {
                    aVar2.b = str;
                    orz orzVar2 = aVar2.d;
                    if (orzVar2 != null) {
                        imf0 imf0Var = hmf0Var.E;
                        f8i.a aVar4 = hmf0Var.F;
                        int i = hmf0Var.G;
                        boolean z2 = hmf0Var.H;
                        int i2 = hmf0Var.I;
                        int i3 = hmf0Var.J;
                        orzVar2.a = str;
                        orzVar2.b = imf0Var;
                        orzVar2.c = aVar4;
                        orzVar2.d = i;
                        orzVar2.e = z2;
                        orzVar2.f = i2;
                        orzVar2.g = i3;
                        orzVar2.s = (orzVar2.s << 2) | 2;
                        orzVar2.c();
                    }
                }
                pkd.f(hmf0Var).R();
                pkd.f(hmf0Var).P();
                rcf.a(hmf0Var);
                return Boolean.TRUE;
            }
        }));
        pb80Var.b(ra80.l, new c6(null, new or7(this, 3)));
        pb80Var.b(ra80.m, new c6(null, new Function0() { // from class: fmf0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                hmf0 hmf0Var = this.a;
                hmf0Var.N = null;
                pkd.f(hmf0Var).R();
                pkd.f(hmf0Var).P();
                rcf.a(hmf0Var);
                return Boolean.TRUE;
            }
        }));
        lb80.a(pb80Var, tlbVar);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:3:0x0005, B:5:0x0009, B:10:0x0011, B:13:0x0019, B:15:0x0028, B:16:0x002b, B:18:0x0036, B:20:0x0042, B:21:0x0049, B:22:0x006b, B:12:0x0015), top: B:28:0x0005 }] */
    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        orz orzVarP2;
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            a aVar = this.N;
            if (aVar == null) {
                orzVarP2 = p2();
            } else {
                if (!aVar.c) {
                    aVar = null;
                }
                if (aVar == null || (orzVarP2 = aVar.d) == null) {
                    orzVarP2 = p2();
                }
            }
            orzVarP2.d(tVar);
            boolean zB = orzVarP2.b(j, tVar.getLayoutDirection());
            lrz lrzVar = orzVarP2.n;
            if (lrzVar != null) {
                lrzVar.a();
            }
            Unit unit = Unit.a;
            e90 e90Var = orzVarP2.j;
            e90Var.getClass();
            long j2 = orzVarP2.l;
            if (zB) {
                pkd.d(this, 2).Y1();
                HashMap map = this.K;
                if (map == null) {
                    map = new HashMap(2);
                    this.K = map;
                }
                map.put(mt.a, Integer.valueOf(Math.round(e90Var.c())));
                map.put(mt.b, Integer.valueOf(Math.round(e90Var.f())));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            y yVarD0 = vhvVar.d0(kxa.a.b(i, i, i2, i2));
            HashMap map2 = this.K;
            map2.getClass();
            return tVar.e1(i, i2, map2, new udg(yVarD0, 1));
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.d.c
    public final boolean e2() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.psr
    public final int o(xkt xktVar, mzo mzoVar, int i) {
        orz orzVarP2;
        a aVar = this.N;
        if (aVar == null) {
            orzVarP2 = p2();
        } else {
            if (!aVar.c) {
                aVar = null;
            }
            if (aVar == null || (orzVarP2 = aVar.d) == null) {
                orzVarP2 = p2();
            }
        }
        orzVarP2.d(xktVar);
        return cff0.a(orzVarP2.e(xktVar.getLayoutDirection()).c());
    }

    public final orz p2() {
        orz orzVar = this.L;
        if (orzVar == null) {
            orz orzVar2 = new orz(this.D, this.E, this.F, this.G, this.H, this.I, this.J);
            this.L = orzVar2;
            orzVar = orzVar2;
        }
        orzVar.getClass();
        return orzVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.psr
    public final int s(xkt xktVar, mzo mzoVar, int i) {
        orz orzVarP2;
        a aVar = this.N;
        if (aVar == null) {
            orzVarP2 = p2();
        } else {
            if (!aVar.c) {
                aVar = null;
            }
            if (aVar == null || (orzVarP2 = aVar.d) == null) {
                orzVarP2 = p2();
            }
        }
        orzVarP2.d(xktVar);
        return orzVarP2.a(i, xktVar.getLayoutDirection());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    @Override // defpackage.psr
    public final int w(xkt xktVar, mzo mzoVar, int i) {
        orz orzVarP2;
        a aVar = this.N;
        if (aVar == null) {
            orzVarP2 = p2();
        } else {
            if (!aVar.c) {
                aVar = null;
            }
            if (aVar == null || (orzVarP2 = aVar.d) == null) {
                orzVarP2 = p2();
            }
        }
        orzVarP2.d(xktVar);
        return orzVarP2.a(i, xktVar.getLayoutDirection());
    }
}
