package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class m9l0 implements Runnable {
    public final /* synthetic */ zzbg a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ ual0 c;

    public m9l0(ual0 ual0Var, zzbg zzbgVar, zzr zzrVar) {
        this.a = zzbgVar;
        this.b = zzrVar;
        this.c = ual0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbe zzbeVar;
        iol0 iol0Var = this.c.a;
        zzbg zzbgVar = this.a;
        if ("_cmp".equals(zzbgVar.a) && (zzbeVar = zzbgVar.b) != null) {
            Bundle bundle = zzbeVar.a;
            if (bundle.size() != 0) {
                String string = bundle.getString("_cis");
                if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                    iol0Var.a().l.b(zzbgVar.toString(), "Event has been filtered ");
                    zzbgVar = new zzbg("_cmpx", zzbeVar, zzbgVar.c, zzbgVar.d);
                }
            }
        }
        String str = zzbgVar.a;
        e7l0 e7l0Var = iol0Var.a;
        pol0 pol0Var = iol0Var.g;
        iol0.U(e7l0Var);
        zzr zzrVar = this.b;
        String str2 = zzrVar.a;
        muk0 muk0Var = TextUtils.isEmpty(str2) ? null : (muk0) e7l0Var.j.b(str2);
        if (muk0Var == null) {
            iol0Var.a().n.b(zzrVar.a, "EES not loaded for");
            iol0Var.B();
            iol0Var.j(zzbgVar, zzrVar);
            return;
        }
        try {
            wmk0 wmk0Var = muk0Var.c;
            iol0.U(pol0Var);
            HashMap mapR = pol0.R(zzbgVar.b.b1(), true);
            String strB = ggl0.b(str, lbl0.c, lbl0.a);
            if (strB == null) {
                strB = str;
            }
            if (muk0Var.a(new qmk0(strB, zzbgVar.d, mapR))) {
                if (wmk0Var.b.equals(wmk0Var.a)) {
                    iol0Var.B();
                    iol0Var.j(zzbgVar, zzrVar);
                } else {
                    iol0Var.a().n.b(str, "EES edited event");
                    iol0.U(pol0Var);
                    zzbg zzbgVarK = pol0.k(wmk0Var.b);
                    iol0Var.B();
                    iol0Var.j(zzbgVarK, zzrVar);
                }
                if (wmk0Var.c.isEmpty()) {
                    return;
                }
                ArrayList arrayList = wmk0Var.c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    qmk0 qmk0Var = (qmk0) obj;
                    iol0Var.a().n.b(qmk0Var.a, "EES logging created event");
                    iol0.U(pol0Var);
                    zzbg zzbgVarK2 = pol0.k(qmk0Var);
                    iol0Var.B();
                    iol0Var.j(zzbgVarK2, zzrVar);
                }
                return;
            }
        } catch (wwk0 unused) {
            iol0Var.a().f.c(zzrVar.b, "EES error. appId, eventName", str);
        }
        iol0Var.a().n.b(str, "EES was not applied to event");
        iol0Var.B();
        iol0Var.j(zzbgVar, zzrVar);
    }
}
