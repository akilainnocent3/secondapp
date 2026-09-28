package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class r1z {
    public final int a;
    public final int b;

    public static final class a extends r1z {
        public static final a c = new a(1, 0, 2);

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            hVar.a(aVar.a(0));
        }
    }

    public static final class a0 extends r1z {
        public static final a0 c;

        static {
            int i = 1;
            c = new a0(0, i, i);
        }

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            a350Var.g.b((Function0) aVar.b(0));
        }
    }

    public static final class b extends r1z {
        public static final b c = new b(0, 2, 1);

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            l00 l00Var = (l00) aVar.b(0);
            Object objB = aVar.b(1);
            if (objB instanceof k350) {
                a350Var.h((k350) objB);
            }
            if (hVar.n != 0) {
                androidx.compose.runtime.c.b("Can only append a slot if not current inserting");
            }
            int i = hVar.i;
            int i2 = hVar.j;
            int iC = hVar.c(l00Var);
            int iF = hVar.f(hVar.b, hVar.q(iC + 1));
            hVar.i = iF;
            hVar.j = iF;
            hVar.v(1, iC);
            if (i >= iF) {
                i++;
                i2++;
            }
            hVar.c[iF] = objB;
            hVar.i = i;
            hVar.j = i2;
        }
    }

    public static final class b0 extends r1z {
        public static final b0 c;

        static {
            int i = 0;
            c = new b0(i, i, 3);
        }

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            hVar.M();
        }
    }

    public static final class c extends r1z {
        public static final c c = new c(0, 2, 1);

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            qwo qwoVar = (qwo) aVar.b(1);
            int i = qwoVar != null ? qwoVar.a : 0;
            o47 o47Var = (o47) aVar.b(0);
            if (i > 0) {
                fv0Var = new hly(fv0Var, i);
            }
            o47Var.X(fv0Var, hVar, a350Var, u1zVar != null ? new y1z(u1zVar, hVar) : null);
        }
    }

    public static final class c0 extends r1z {
        public static final c0 c;

        static {
            int i = 1;
            c = new c0(0, i, i);
        }

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            androidx.compose.runtime.e eVar = (androidx.compose.runtime.e) aVar.b(0);
            rtw<androidx.compose.runtime.e, nzz> rtwVar = a350Var.i;
            nzz nzzVarD = rtwVar != null ? rtwVar.d(eVar) : null;
            if (nzzVarD != null) {
                ArrayList arrayList = a350Var.j;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    a350Var.j = arrayList;
                }
                arrayList.add(a350Var.e);
                a350Var.e = nzzVarD.b;
            }
        }
    }

    public static final class d extends r1z {
        public static final d c = new d(0, 2, 1);

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            int i = ((qwo) aVar.b(0)).a;
            List list = (List) aVar.b(1);
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = list.get(i2);
                int i3 = i + i2;
                fv0Var.g(i3, obj);
                fv0Var.e(i3, obj);
            }
        }
    }

    public static final class d0 extends r1z {
        public static final d0 c = new d0(1, 0, 2);

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            int iA = aVar.a(0);
            int i = hVar.v;
            int iN = hVar.N(hVar.b, hVar.q(i));
            int iF = hVar.f(hVar.b, hVar.q(i + 1));
            for (int iMax = Math.max(iN, iF - iA); iMax < iF; iMax++) {
                Object obj = hVar.c[hVar.g(iMax)];
                if (obj instanceof k350) {
                    a350Var.e((k350) obj);
                } else if (obj instanceof androidx.compose.runtime.e) {
                    ((androidx.compose.runtime.e) obj).c();
                }
            }
            if (iA <= 0) {
                androidx.compose.runtime.c.b("Check failed");
            }
            int i2 = hVar.v;
            int iN2 = hVar.N(hVar.b, hVar.q(i2));
            int iF2 = hVar.f(hVar.b, hVar.q(i2 + 1)) - iA;
            if (iF2 < iN2) {
                androidx.compose.runtime.c.b("Check failed");
            }
            hVar.J(iF2, iA, i2);
            int i3 = hVar.i;
            if (i3 >= iN2) {
                hVar.i = i3 - iA;
            }
        }
    }

    public static final class e extends r1z {
        public static final e c = new e(0, 4, 1);

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            z6w z6wVar = (z6w) aVar.b(2);
            z6w z6wVar2 = (z6w) aVar.b(3);
            mma mmaVar = (mma) aVar.b(1);
            y6w y6wVarN = (y6w) aVar.b(0);
            if (y6wVarN == null && (y6wVarN = mmaVar.n(z6wVar)) == null) {
                androidx.compose.runtime.c.c("Could not resolve state for movable content");
                fkd.a();
                return;
            }
            androidx.compose.runtime.g gVar = y6wVarN.a;
            if (hVar.n > 0 || hVar.s(hVar.t + 1) != 1) {
                androidx.compose.runtime.c.b("Check failed");
            }
            int i = hVar.t;
            int i2 = hVar.i;
            int i3 = hVar.j;
            hVar.a(1);
            hVar.P();
            hVar.d();
            androidx.compose.runtime.h hVarE = gVar.e();
            try {
                List listA = androidx.compose.runtime.h.a.a(hVarE, 2, hVar, false, true, true);
                hVarE.e(true);
                hVar.j();
                hVar.i();
                hVar.t = i;
                hVar.i = i2;
                hVar.j = i3;
                androidx.compose.runtime.e.a.a(hVar, listA, (rj40) z6wVar2.c);
            } catch (Throwable th) {
                hVarE.e(false);
                throw th;
            }
        }
    }

    public static final class e0 extends r1z {
        public static final e0 c = new e0(1, 2);

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            Object objB = aVar.b(0);
            l00 l00Var = (l00) aVar.b(1);
            int iA = aVar.a(0);
            if (objB instanceof k350) {
                a350Var.h((k350) objB);
            }
            Object objK = hVar.K(hVar.c(l00Var), iA, objB);
            if (objK instanceof k350) {
                a350Var.e((k350) objK);
            } else if (objK instanceof androidx.compose.runtime.e) {
                ((androidx.compose.runtime.e) objK).c();
            }
        }
    }

    public static final class f extends r1z {
        public static final f c;

        static {
            int i = 0;
            c = new f(i, i, 3);
        }

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            hVar.m(hVar.t, new cma(a350Var, hVar));
        }
    }

    public static final class f0 extends r1z {
        public static final f0 c;

        static {
            int i = 1;
            c = new f0(0, i, i);
        }

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            hVar.T(aVar.b(0));
        }
    }

    public static final class g extends r1z {
        public static final g c = new g(0, 2, 1);

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            int i;
            qwo qwoVar = (qwo) aVar.b(0);
            int iC = hVar.c((l00) aVar.b(1));
            if (hVar.t >= iC) {
                androidx.compose.runtime.c.b("Check failed");
            }
            iok.b(hVar, fv0Var, iC);
            int i2 = hVar.t;
            int iE = hVar.v;
            while (iE >= 0 && !hVar.w(iE)) {
                iE = hVar.E(hVar.b, iE);
            }
            int iS = iE + 1;
            int iL = 0;
            while (iS < i2) {
                if (hVar.t(i2, iS)) {
                    if (hVar.w(iS)) {
                        iL = 0;
                    }
                    iS++;
                } else {
                    iL += hVar.w(iS) ? 1 : hVar.D(iS);
                    iS += hVar.s(iS);
                }
            }
            while (true) {
                i = hVar.t;
                if (i >= iC) {
                    break;
                }
                if (hVar.t(iC, i)) {
                    int i3 = hVar.t;
                    if (i3 < hVar.u && (hVar.b[(hVar.q(i3) * 5) + 1] & 1073741824) != 0) {
                        fv0Var.h(hVar.C(hVar.t));
                        iL = 0;
                    }
                    hVar.P();
                } else {
                    iL += hVar.L();
                }
            }
            if (i != iC) {
                androidx.compose.runtime.c.b("Check failed");
            }
            qwoVar.a = iL;
        }
    }

    public static final class g0 extends r1z {
        public static final g0 c = new g0(0, 2, 1);

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            fv0Var.a(aVar.b(0), (Function2) aVar.b(1));
        }
    }

    public static final class h extends r1z {
        public static final h c;

        static {
            int i = 1;
            c = new h(0, i, i);
        }

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            for (Object obj : (Object[]) aVar.b(0)) {
                fv0Var.h(obj);
            }
        }
    }

    public static final class h0 extends r1z {
        public static final h0 c = new h0(1, 1);

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            Object objB = aVar.b(0);
            int iA = aVar.a(0);
            if (objB instanceof k350) {
                a350Var.h((k350) objB);
            }
            Object objK = hVar.K(hVar.t, iA, objB);
            if (objK instanceof k350) {
                a350Var.e((k350) objK);
            } else if (objK instanceof androidx.compose.runtime.e) {
                ((androidx.compose.runtime.e) objK).c();
            }
        }
    }

    public static final class i extends r1z {
        public static final i c = new i(0, 2, 1);

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            ((Function1) aVar.b(0)).invoke((lma) aVar.b(1));
        }
    }

    public static final class i0 extends r1z {
        public static final i0 c = new i0(1, 0, 2);

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            int iA = aVar.a(0);
            for (int i = 0; i < iA; i++) {
                fv0Var.j();
            }
        }
    }

    public static final class j extends r1z {
        public static final j c;

        static {
            int i = 0;
            c = new j(i, i, 3);
        }

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            hVar.i();
        }
    }

    public static final class j0 extends r1z {
        public static final j0 c;

        static {
            int i = 0;
            c = new j0(i, i, 3);
        }

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            fv0Var.i();
        }
    }

    public static final class k extends r1z {
        public static final k c;

        static {
            int i = 0;
            c = new k(i, i, 3);
        }

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            iok.b(hVar, fv0Var, 0);
            hVar.i();
        }
    }

    public static final class l extends r1z {
        public static final l c;

        static {
            int i = 1;
            c = new l(0, i, i);
        }

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            duw<k350> duwVar;
            androidx.compose.runtime.e eVar = (androidx.compose.runtime.e) aVar.b(0);
            rtw<androidx.compose.runtime.e, nzz> rtwVar = a350Var.i;
            if (rtwVar == null || rtwVar.d(eVar) == null) {
                return;
            }
            ArrayList arrayList = a350Var.j;
            if (arrayList != null && (duwVar = (duw) arrayList.remove(arrayList.size() - 1)) != null) {
                a350Var.e = duwVar;
            }
            rtwVar.k(eVar);
        }
    }

    public static final class m extends r1z {
        public static final m c;

        static {
            int i = 1;
            c = new m(0, i, i);
        }

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            l00 l00Var = (l00) aVar.b(0);
            l00Var.getClass();
            hVar.k(hVar.c(l00Var));
        }
    }

    public static final class n extends r1z {
        public static final n c;

        static {
            int i = 0;
            c = new n(i, i, 3);
        }

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            hVar.k(0);
        }
    }

    public static final class o extends r1z {
        public static final o c = new o(1, 2);

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            Object objInvoke = ((Function0) aVar.b(0)).invoke();
            l00 l00Var = (l00) aVar.b(1);
            int iA = aVar.a(0);
            l00Var.getClass();
            hVar.V(hVar.c(l00Var), objInvoke);
            fv0Var.e(iA, objInvoke);
            fv0Var.h(objInvoke);
        }

        @Override // defpackage.r1z
        public final l00 b(f2z.a aVar) {
            return (l00) aVar.b(1);
        }
    }

    public static final class p extends r1z {
        public static final p c = new p(0, 2, 1);

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            androidx.compose.runtime.g gVar = (androidx.compose.runtime.g) aVar.b(1);
            l00 l00Var = (l00) aVar.b(0);
            hVar.d();
            l00Var.getClass();
            hVar.y(gVar, gVar.b(l00Var));
            hVar.j();
        }
    }

    public static final class q extends r1z {
        public static final q c = new q(0, 3, 1);

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            y1z y1zVar;
            androidx.compose.runtime.g gVar = (androidx.compose.runtime.g) aVar.b(1);
            l00 l00Var = (l00) aVar.b(0);
            yth ythVar = (yth) aVar.b(2);
            androidx.compose.runtime.h hVarE = gVar.e();
            if (u1zVar != null) {
                try {
                    y1zVar = new y1z(u1zVar, hVar);
                } catch (Throwable th) {
                    hVarE.e(false);
                    throw th;
                }
            } else {
                y1zVar = null;
            }
            if (!ythVar.d.isEmpty()) {
                androidx.compose.runtime.c.b("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
            }
            ythVar.c.X(fv0Var, hVarE, a350Var, y1zVar);
            Unit unit = Unit.a;
            hVarE.e(true);
            hVar.d();
            l00Var.getClass();
            hVar.y(gVar, gVar.b(l00Var));
            hVar.j();
        }
    }

    public static final class r extends r1z {
        public static final r c = new r(1, 0, 2);

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            int[] iArr;
            l00 l00Var;
            int iC;
            int iA = aVar.a(0);
            if (hVar.n != 0) {
                androidx.compose.runtime.c.b("Cannot move a group while inserting");
            }
            if (iA < 0) {
                androidx.compose.runtime.c.b("Parameter offset is out of bounds");
            }
            if (iA == 0) {
                return;
            }
            int i = hVar.t;
            int i2 = hVar.v;
            int i3 = hVar.u;
            int i4 = i;
            while (true) {
                iArr = hVar.b;
                if (iA <= 0) {
                    break;
                }
                i4 += iArr[(hVar.q(i4) * 5) + 3];
                if (i4 > i3) {
                    androidx.compose.runtime.c.b("Parameter offset is out of bounds");
                }
                iA--;
            }
            int i5 = iArr[(hVar.q(i4) * 5) + 3];
            int iF = hVar.f(hVar.b, hVar.q(hVar.t));
            int iF2 = hVar.f(hVar.b, hVar.q(i4));
            int i6 = i4 + i5;
            int iF3 = hVar.f(hVar.b, hVar.q(i6));
            int i7 = iF3 - iF2;
            hVar.v(i7, Math.max(hVar.t - 1, 0));
            hVar.u(i5);
            int[] iArr2 = hVar.b;
            int iQ = hVar.q(i6) * 5;
            xx0.d(hVar.q(i) * 5, iQ, (i5 * 5) + iQ, iArr2, iArr2);
            if (i7 > 0) {
                Object[] objArr = hVar.c;
                int iG = hVar.g(iF2 + i7);
                System.arraycopy(objArr, iG, objArr, iF, hVar.g(iF3 + i7) - iG);
            }
            int i8 = iF2 + i7;
            int i9 = i8 - iF;
            int i10 = hVar.k;
            int i11 = hVar.l;
            int length = hVar.c.length;
            int i12 = hVar.m;
            int i13 = i + i5;
            int i14 = i;
            while (i14 < i13) {
                int iQ2 = hVar.q(i14);
                int i15 = i9;
                int[] iArr3 = iArr2;
                iArr3[(iQ2 * 5) + 4] = androidx.compose.runtime.h.h(androidx.compose.runtime.h.h(hVar.f(iArr2, iQ2) - i15, i12 < iQ2 ? 0 : i10, i11, length), hVar.k, hVar.l, hVar.c.length);
                i14++;
                i9 = i15;
                iArr2 = iArr3;
                i10 = i10;
            }
            int i16 = i6 + i5;
            int iO = hVar.o();
            int iA2 = j1a0.a(hVar.d, i6, iO);
            ArrayList arrayList = new ArrayList();
            if (iA2 >= 0) {
                while (iA2 < hVar.d.size() && (iC = hVar.c((l00Var = hVar.d.get(iA2)))) >= i6 && iC < i16) {
                    arrayList.add(l00Var);
                    hVar.d.remove(iA2);
                }
            }
            int i17 = i - i6;
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                l00 l00Var2 = (l00) arrayList.get(i18);
                int iC2 = hVar.c(l00Var2) + i17;
                if (iC2 >= hVar.g) {
                    l00Var2.a = -(iO - iC2);
                } else {
                    l00Var2.a = iC2;
                }
                hVar.d.add(j1a0.a(hVar.d, iC2, iO), l00Var2);
            }
            if (hVar.I(i6, i5)) {
                androidx.compose.runtime.c.b("Unexpectedly removed anchors");
            }
            hVar.l(i2, hVar.u, i);
            if (i7 > 0) {
                hVar.J(i8, i7, i6 - 1);
            }
        }
    }

    public static final class s extends r1z {
        public static final s c = new s(3, 0, 2);

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            fv0Var.c(aVar.a(0), aVar.a(1), aVar.a(2));
        }
    }

    public static final class t extends r1z {
        public static final t c = new t(1, 1);

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            l00 l00Var = (l00) aVar.b(0);
            int iA = aVar.a(0);
            fv0Var.j();
            l00Var.getClass();
            fv0Var.g(iA, hVar.C(hVar.c(l00Var)));
        }

        @Override // defpackage.r1z
        public final l00 b(f2z.a aVar) {
            return (l00) aVar.b(0);
        }
    }

    public static final class u extends r1z {
        public static final u c = new u(0, 3, 1);

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            t2b t2bVar = (t2b) aVar.b(0);
            z6w z6wVar = (z6w) aVar.b(2);
            ((mma) aVar.b(1)).m(z6wVar, androidx.compose.runtime.c.d(t2bVar, z6wVar, hVar, null), fv0Var);
        }
    }

    public static final class v extends r1z {
        public static final v c;

        static {
            int i = 1;
            c = new v(0, i, i);
        }

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            a350Var.h((k350) aVar.b(0));
        }
    }

    public static final class w extends r1z {
        public static final w c;

        static {
            int i = 1;
            c = new w(0, i, i);
        }

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            androidx.compose.runtime.e eVar = (androidx.compose.runtime.e) aVar.b(0);
            Set<j350> set = a350Var.a;
            if (set == null) {
                return;
            }
            nzz nzzVar = new nzz(set);
            rtw<androidx.compose.runtime.e, nzz> rtwVarB = a350Var.i;
            if (rtwVarB == null) {
                rtwVarB = fz60.b();
                a350Var.i = rtwVarB;
            }
            rtwVarB.m(eVar, nzzVar);
            a350Var.e.b(new k350(nzzVar, null));
        }
    }

    public static final class x extends r1z {
        public static final x c;

        static {
            int i = 0;
            c = new x(i, i, 3);
        }

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            hVar.m(hVar.t, new bma(a350Var));
            hVar.H();
        }
    }

    public static final class y extends r1z {
        public static final y c;

        static {
            int i = 2;
            c = new y(i, 0, i);
        }

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            fv0Var.d(aVar.a(0), aVar.a(1));
        }
    }

    public static final class z extends r1z {
        public static final z c;

        static {
            int i = 0;
            c = new z(i, i, 3);
        }

        @Override // defpackage.r1z
        public final void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar) {
            if (hVar.n != 0) {
                androidx.compose.runtime.c.b("Cannot reset when inserting");
            }
            hVar.G();
            hVar.t = 0;
            hVar.u = hVar.n() - hVar.h;
            hVar.i = 0;
            hVar.j = 0;
            hVar.o = 0;
        }
    }

    public /* synthetic */ r1z(int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3);
    }

    public abstract void a(f2z.a aVar, fv0 fv0Var, androidx.compose.runtime.h hVar, a350 a350Var, u1z u1zVar);

    public l00 b(f2z.a aVar) {
        return null;
    }

    public final String toString() {
        String strK = jq40.a(getClass()).k();
        return strK == null ? "" : strK;
    }

    public r1z(int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }
}
