package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class het {
    public final iug0 a;

    public het(iug0 iug0Var) {
        this.a = iug0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        get getVar;
        if (x1bVar instanceof get) {
            getVar = (get) x1bVar;
            int i = getVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                getVar.c = i - Integer.MIN_VALUE;
            } else {
                getVar = new get(this, x1bVar);
            }
        } else {
            getVar = new get(this, x1bVar);
        }
        Object objA = getVar.a;
        Object obj = y5b.a;
        int i2 = getVar.c;
        if (i2 == 0) {
            uj50.b(objA);
            getVar.c = 1;
            objA = this.a.a();
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objA);
        }
        int iOrdinal = ((hug0) objA).ordinal();
        int i3 = R.drawable.available;
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                i3 = R.drawable.available_es_mx;
            } else if (iOrdinal == 3) {
                i3 = R.drawable.available_pt_br;
            } else if (iOrdinal == 4) {
                i3 = R.drawable.available_pt_mz;
            } else {
                if (iOrdinal != 5) {
                    uhc.a();
                    return null;
                }
                i3 = R.drawable.available_fr_fr;
            }
        }
        return new Integer(i3);
    }
}
