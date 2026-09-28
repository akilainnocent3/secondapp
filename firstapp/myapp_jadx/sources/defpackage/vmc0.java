package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vmc0 extends pf implements gaj<pjc0, rmc0, v1b<? super bnc0>, Object> {
    @Override // defpackage.gaj
    public final Object invoke(pjc0 pjc0Var, rmc0 rmc0Var, v1b<? super bnc0> v1bVar) {
        mcc0 mcc0Var;
        float f;
        jmc0 jmc0Var;
        jmc0 jmc0Var2;
        jmc0 jmc0Var3;
        List<icc0> list;
        rmc0 rmc0Var2 = rmc0Var;
        ((xmc0) this.a).getClass();
        hcc0 hcc0Var = pjc0Var.c;
        icc0 icc0Var = (hcc0Var == null || (list = hcc0Var.b) == null) ? null : (icc0) CollectionsKt.firstOrNull(list);
        if (hcc0Var == null || (jmc0Var3 = hcc0Var.c) == null) {
            mcc0Var = null;
        } else {
            cnc0 cnc0Var = jmc0Var3.a;
            int i = cnc0Var.g;
            int i2 = cnc0Var.f;
            int i3 = cnc0Var.e;
            cnc0 cnc0Var2 = jmc0Var3.b;
            mcc0Var = new mcc0(new q2s(i, i2, i3, cnc0Var2.f, cnc0Var2.e), new hp1(new ip1(cnc0Var.k, cnc0Var.i, cnc0Var.j, R.color.icon_brand_main), new ip1(cnc0Var2.k, cnc0Var2.i, cnc0Var2.j, R.color.icon_info_secondary), R.color.text_type2_secondary), new s7j0(new t7j0(R.color.text_type2_primary, cnc0Var.d, cnc0Var.b, R.color.icon_brand_main, cnc0Var.c), new t7j0(R.color.text_type2_primary, cnc0Var2.d, cnc0Var2.b, R.color.icon_info_secondary, cnc0Var2.c), (100 - cnc0Var.d) - cnc0Var2.d, R.color.line_type2_secondary));
        }
        cnc0 cnc0Var3 = (hcc0Var == null || (jmc0Var2 = hcc0Var.c) == null) ? null : jmc0Var2.a;
        cnc0 cnc0Var4 = (hcc0Var == null || (jmc0Var = hcc0Var.c) == null) ? null : jmc0Var.b;
        dnc0.a aVar = dnc0.a.a;
        String str = icc0Var != null ? icc0Var.b.a : null;
        if (str == null) {
            str = "";
        }
        String str2 = icc0Var != null ? icc0Var.b.b : null;
        if (str2 == null) {
            str2 = "";
        }
        smc0 smc0VarA = xmc0.a(aVar, new knc0(str, str2), cnc0Var3);
        dnc0.a aVar2 = dnc0.a.b;
        String str3 = icc0Var != null ? icc0Var.c.a : null;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = icc0Var != null ? icc0Var.c.b : null;
        smc0 smc0VarA2 = xmc0.a(aVar2, new knc0(str3, str4 != null ? str4 : ""), cnc0Var4);
        if (mcc0Var == null) {
            rmc0Var2 = rmc0.a;
        }
        rmc0 rmc0Var3 = rmc0Var2;
        rmc0Var3.getClass();
        int iOrdinal = rmc0Var3.ordinal();
        if (iOrdinal == 0) {
            f = 48.0f;
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return null;
            }
            f = 212.0f;
        }
        return new bnc0(smc0VarA, smc0VarA2, mcc0Var, rmc0Var3, f);
    }
}
