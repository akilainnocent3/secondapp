package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class gw implements oug {
    public static final gw b = new gw();
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ int a = 0;

    public static qgd c(a aVar) {
        long jA = c68.a(R.color.brand_quaternary, aVar);
        long jA2 = c68.a(R.color.brand_quaternary, aVar);
        long jA3 = c68.a(R.color.text_type2_tertiary, aVar);
        long jA4 = c68.a(R.color.text_type2_tertiary, aVar);
        long jC = j58.c(1.0f, jA);
        qyd0 qyd0Var = g68.a;
        long jH = r58.h(jC, ((d68) aVar.O(qyd0Var)).p);
        long jH2 = r58.h(j58.c(0.12f, jA2), ((d68) aVar.O(qyd0Var)).p);
        return new qgd(jA, j58.c(0.5f, jA2), jA3, j58.c(0.38f, jA4), jH, j58.c(0.5f, jH2), r58.h(j58.c(0.38f, jA3), ((d68) aVar.O(qyd0Var)).p), j58.c(0.38f, r58.h(j58.c(0.12f, jA4), ((d68) aVar.O(qyd0Var)).p)));
    }

    @Override // defpackage.oug
    public boolean a(m0b m0bVar) {
        return false;
    }

    @Override // defpackage.oug
    public boolean b(m0b m0bVar) {
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "AlwaysOffExemplarFilter";
            default:
                return super.toString();
        }
    }
}
