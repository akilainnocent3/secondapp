package defpackage;

import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class no3 {
    public final bnh0 a;

    public no3(bnh0 bnh0Var) {
        bnh0Var.getClass();
        this.a = bnh0Var;
    }

    public static Integer a(oo3.c cVar) {
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            return Integer.valueOf(R.string.page_loyalty__unlock);
        }
        if (iOrdinal == 1) {
            return Integer.valueOf(R.string.common_functions__apply);
        }
        if (iOrdinal == 2) {
            return Integer.valueOf(R.string.common_functions__applied);
        }
        if (iOrdinal == 3) {
            return null;
        }
        uhc.a();
        return null;
    }
}
