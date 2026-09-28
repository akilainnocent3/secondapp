package defpackage;

import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class cih0 {
    public final jrm a;
    public final vhh0 b;
    public final qhh0 c;
    public final gih0 d;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[rhh0.values().length];
            try {
                rhh0 rhh0Var = rhh0.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                rhh0 rhh0Var2 = rhh0.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public cih0(jrm jrmVar, vhh0 vhh0Var, qhh0 qhh0Var, gih0 gih0Var) {
        jrmVar.getClass();
        this.a = jrmVar;
        this.b = vhh0Var;
        this.c = qhh0Var;
        this.d = gih0Var;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:153:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:158:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e0  */
    public final yuy a(Selection selection, boolean z, boolean z2, boolean z3) {
        boolean z4;
        zuy zuyVar;
        OneUpTwoUpSwitch.c cVar;
        Set<phh0> set;
        OneUpTwoUpSwitch.f fVar;
        OneUpTwoUpSwitch.f fVar2;
        boolean z5;
        yuy.d dVar;
        dih0 dih0VarB = this.b.b(selection);
        rhh0 rhh0Var = dih0VarB != null ? dih0VarB.a : null;
        int i = rhh0Var == null ? -1 : a.a[rhh0Var.ordinal()];
        if (i == -1) {
            z4 = false;
        } else if (i == 1) {
            z4 = z2;
        } else {
            if (i != 2) {
                uhc.a();
                return null;
            }
            z4 = z3;
        }
        if (!z4) {
            return yuy.a.a;
        }
        if (dih0VarB != null) {
            zuy zuyVarA = this.c.a(dih0VarB.a);
            zuyVar = zuy.c;
            boolean z6 = (zuyVarA == zuyVar || zuyVarA == zuy.b) && (zuyVarA == zuyVar || zuyVarA == zuy.b);
            zuy zuyVar2 = zuy.d;
            boolean z7 = (zuyVarA == zuyVar2 || zuyVarA == zuy.b) && (zuyVarA == zuyVar2 || zuyVarA == zuy.b);
            if (z6 && z7) {
                zuyVar = zuy.b;
            } else if (!z6) {
                zuyVar = z7 ? zuyVar2 : zuy.a;
            }
        } else {
            zuyVar = zuy.a;
        }
        jrm jrmVar = this.a;
        boolean zO1 = jrmVar.o1();
        zuy zuyVar3 = zuyVar;
        boolean zD = jrmVar.D();
        boolean zM0 = jrmVar.m0();
        if (selection == null || dih0VarB == null) {
            return yuy.a.a;
        }
        gih0 gih0Var = this.d;
        zry zryVar = gih0Var.b;
        zryVar.getClass();
        avy avyVar = (avy) ((Map) zryVar.a.getValue()).get(o980.a(selection));
        int iOrdinal = zuyVar3.ordinal();
        if (iOrdinal == 0) {
            return yuy.a.a;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return gih0.b(gih0Var, z, zO1, zD, dih0VarB, avyVar, selection, phh0.a);
            }
            if (iOrdinal == 3) {
                return gih0.b(gih0Var, z, zO1, zD, dih0VarB, avyVar, selection, phh0.b);
            }
            uhc.a();
            return null;
        }
        boolean z8 = z || !zO1 || zD;
        phh0 phh0Var = phh0.a;
        rhh0 rhh0Var2 = dih0VarB.a;
        Set<phh0> set2 = dih0VarB.b;
        boolean zContains = set2.contains(phh0Var);
        phh0 phh0Var2 = phh0.b;
        boolean zContains2 = set2.contains(phh0Var2);
        Set<phh0> set3 = dih0VarB.c;
        boolean zContains3 = set3.contains(phh0Var);
        boolean zContains4 = set3.contains(phh0Var2);
        Set<phh0> set4 = dih0VarB.d;
        boolean zContains5 = set4.contains(phh0Var);
        boolean zContains6 = set4.contains(phh0Var2);
        if (!z8 || (!zContains && !zContains2)) {
            return yuy.a.a;
        }
        if (zM0 && (!zContains5 || !zContains6)) {
            if (zContains5) {
                return gih0.b(gih0Var, z, zO1, zD, dih0VarB, avyVar, selection, phh0Var);
            }
            if (zContains6) {
                return gih0.b(gih0Var, z, zO1, zD, dih0VarB, avyVar, selection, phh0Var2);
            }
            if (zContains) {
                return gih0.b(gih0Var, z, zO1, zD, dih0VarB, avyVar, selection, phh0Var);
            }
            return zContains2 ? gih0.b(gih0Var, z, zO1, zD, dih0VarB, avyVar, selection, phh0Var2) : yuy.a.a;
        }
        if (zContains && zContains2 && zContains3 && zContains4) {
            cVar = OneUpTwoUpSwitch.c.a;
        } else if (zContains && zContains3) {
            cVar = OneUpTwoUpSwitch.c.b;
        } else if (zContains2 && zContains4) {
            cVar = OneUpTwoUpSwitch.c.c;
        } else if (!zContains || !zContains2 || zContains3 || zContains4) {
            cVar = zContains ? OneUpTwoUpSwitch.c.b : OneUpTwoUpSwitch.c.c;
        } else {
            cVar = OneUpTwoUpSwitch.c.a;
        }
        OneUpTwoUpSwitch.c cVar2 = cVar;
        int iOrdinal2 = cVar2.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                fVar = gih0.a(avyVar, phh0Var, dih0VarB) ? OneUpTwoUpSwitch.f.a.b.a : OneUpTwoUpSwitch.f.a.C0356a.a;
            } else {
                if (iOrdinal2 != 2) {
                    uhc.a();
                    return null;
                }
                fVar = gih0.a(avyVar, phh0Var2, dih0VarB) ? OneUpTwoUpSwitch.f.c.b.a : OneUpTwoUpSwitch.f.c.a.a;
            }
        } else if (avyVar == null) {
            set = dih0VarB.e;
            if (!set.contains(phh0Var) && set.contains(phh0Var2)) {
                fVar = OneUpTwoUpSwitch.f.b.a.a;
            } else if (set.contains(phh0Var)) {
                fVar = OneUpTwoUpSwitch.f.b.C0357b.a;
            } else if (set.contains(phh0Var2)) {
                fVar = OneUpTwoUpSwitch.f.b.c.a;
            } else {
                fVar = OneUpTwoUpSwitch.f.b.a.a;
            }
        } else {
            int iOrdinal3 = avyVar.ordinal();
            if (iOrdinal3 == 0) {
                fVar2 = OneUpTwoUpSwitch.f.b.C0357b.a;
            } else if (iOrdinal3 == 1) {
                fVar2 = OneUpTwoUpSwitch.f.b.c.a;
            } else {
                if (iOrdinal3 != 2) {
                    uhc.a();
                    return null;
                }
                fVar2 = OneUpTwoUpSwitch.f.b.a.a;
            }
            if (fVar2 == null) {
                set = dih0VarB.e;
                if (!set.contains(phh0Var)) {
                    if (set.contains(phh0Var)) {
                        fVar = OneUpTwoUpSwitch.f.b.C0357b.a;
                    } else if (set.contains(phh0Var2)) {
                        fVar = OneUpTwoUpSwitch.f.b.c.a;
                    } else {
                        fVar = OneUpTwoUpSwitch.f.b.a.a;
                    }
                } else if (set.contains(phh0Var)) {
                    fVar = OneUpTwoUpSwitch.f.b.C0357b.a;
                } else if (set.contains(phh0Var2)) {
                    fVar = OneUpTwoUpSwitch.f.b.c.a;
                } else {
                    fVar = OneUpTwoUpSwitch.f.b.a.a;
                }
            } else {
                fVar = fVar2;
            }
        }
        OneUpTwoUpSwitch.f fVar3 = fVar;
        int iOrdinal4 = cVar2.ordinal();
        if (iOrdinal4 == 0) {
            z5 = zContains3 || zContains4;
        } else if (iOrdinal4 == 1) {
            z5 = zContains3;
        } else {
            if (iOrdinal4 != 2) {
                uhc.a();
                return null;
            }
            z5 = zContains4;
        }
        boolean z9 = zContains || zContains2;
        boolean z10 = !(zD && selection.i) && (zContains5 || zContains6) && avyVar == null;
        boolean z11 = gih0Var.a.a(o980.a(selection), t880.a.a) || avyVar != null;
        if (z8) {
            dVar = z11 ? yuy.d.a : yuy.d.b;
        } else {
            dVar = yuy.d.c;
        }
        yuy.d dVar2 = dVar;
        boolean z12 = (z5 || rhh0Var2 == rhh0.a) ? false : true;
        boolean z13 = !z || z5 || rhh0Var2 == rhh0.a;
        boolean z14 = zContains || zContains2;
        return new yuy.c(cVar2, fVar3, z5, z9, z10, dVar2, z12, z13, rhh0Var2 != rhh0.a ? !(!z14 || (z && !z5)) : z14 && z5);
    }
}
