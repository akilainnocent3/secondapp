package defpackage;

import com.sportybet.android.widget.OneUpTwoUpCheckbox;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.betslip.Selection;

/* JADX INFO: loaded from: classes7.dex */
public final class gih0 {
    public final t880 a;
    public final zry b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[phh0.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                phh0 phh0Var = phh0.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[OneUpTwoUpSwitch.c.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OneUpTwoUpSwitch.c cVar = OneUpTwoUpSwitch.c.a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                OneUpTwoUpSwitch.c cVar2 = OneUpTwoUpSwitch.c.a;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[zuy.values().length];
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zuy zuyVar = zuy.a;
                iArr3[2] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                zuy zuyVar2 = zuy.a;
                iArr3[3] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                zuy zuyVar3 = zuy.a;
                iArr3[0] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[avy.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                avy avyVar = avy.a;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                avy avyVar2 = avy.a;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            a = iArr4;
        }
    }

    public gih0(t880 t880Var, zry zryVar) {
        t880Var.getClass();
        zryVar.getClass();
        this.a = t880Var;
        this.b = zryVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0027 A[RETURN] */
    public static boolean a(avy avyVar, phh0 phh0Var, dih0 dih0Var) {
        int i = avyVar == null ? -1 : a.a[avyVar.ordinal()];
        if (i == -1) {
            return dih0Var.e.contains(phh0Var);
        }
        if (i == 1) {
            if (phh0Var == phh0.a) {
                return true;
            }
            return false;
        }
        if (i != 2) {
            if (i != 3) {
                uhc.a();
                return false;
            }
        } else if (phh0Var == phh0.b) {
            return true;
        }
        return false;
    }

    public static final yuy b(gih0 gih0Var, boolean z, boolean z2, boolean z3, dih0 dih0Var, avy avyVar, Selection selection, phh0 phh0Var) {
        OneUpTwoUpCheckbox.a aVar;
        yuy.d dVar;
        boolean z4 = (z || !z2 || z3) && dih0Var.b.contains(phh0Var);
        if (!z4) {
            return yuy.a.a;
        }
        boolean zContains = dih0Var.c.contains(phh0Var);
        rhh0 rhh0Var = dih0Var.a;
        int iOrdinal = phh0Var.ordinal();
        if (iOrdinal == 0) {
            aVar = OneUpTwoUpCheckbox.a.a;
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return null;
            }
            aVar = OneUpTwoUpCheckbox.a.b;
        }
        boolean zA = a(avyVar, phh0Var, dih0Var);
        boolean z5 = !(z3 && selection.i) && dih0Var.d.contains(phh0Var) && avyVar == null;
        boolean z6 = gih0Var.a.a(o980.a(selection), t880.a.a) || avyVar != null;
        if (z4) {
            dVar = z6 ? yuy.d.a : yuy.d.b;
        } else {
            dVar = yuy.d.c;
        }
        return new yuy.b(aVar, zA, zContains, z4, z5, dVar, (zContains || rhh0Var == rhh0.a) ? false : true, !z || zContains || rhh0Var == rhh0.a, rhh0Var != rhh0.a ? !(!z4 || (z && !zContains)) : z4 && zContains);
    }
}
