package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class iw2 {
    public static final int a() {
        k53 k53VarC = iu2.c();
        List<Selection> listD = iu2.d();
        k53VarC.getClass();
        listD.getClass();
        if (k53VarC != k53.EDIT) {
            return ((ArrayList) listD).size();
        }
        ArrayList arrayList = (ArrayList) listD;
        int i = 0;
        if (arrayList.isEmpty()) {
            return 0;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Selection selection = (Selection) obj;
            if (!selection.i && selection.b.status != 3 && (i = i + 1) < 0) {
                b.p();
                throw null;
            }
        }
        return i;
    }

    public static final boolean b() {
        k53 k53VarC = iu2.c();
        k53VarC.getClass();
        return a.c(k53.EDIT).contains(k53VarC);
    }

    public static final boolean c() {
        k53 k53VarC = iu2.c();
        k53VarC.getClass();
        return b.k(k53.REAL, k53.SIM).contains(k53VarC);
    }

    public static final boolean d() {
        k53 k53VarC = iu2.c();
        k53VarC.getClass();
        return b.k(k53.REAL, k53.SIM).contains(k53VarC);
    }

    public static final boolean e() {
        return iu2.k() && a() == 0;
    }

    public static final boolean f() {
        k53 k53VarC = iu2.c();
        k53VarC.getClass();
        return b.k(k53.REAL, k53.SIM).contains(k53VarC);
    }

    public static final boolean g() {
        k53 k53VarC = iu2.c();
        k53VarC.getClass();
        return a.c(k53.REAL).contains(k53VarC);
    }
}
