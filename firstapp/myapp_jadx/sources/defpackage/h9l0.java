package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class h9l0 implements Runnable {
    public final /* synthetic */ zzr a;
    public final /* synthetic */ ual0 b;

    public h9l0(ual0 ual0Var, zzr zzrVar) {
        this.a = zzrVar;
        this.b = ual0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        iol0 iol0Var = this.b.a;
        iol0Var.B();
        if (iol0Var.y != null) {
            ArrayList arrayList = new ArrayList();
            iol0Var.z = arrayList;
            arrayList.addAll(iol0Var.y);
        }
        lqk0 lqk0Var = iol0Var.c;
        iol0.U(lqk0Var);
        k8l0 k8l0Var = lqk0Var.a;
        zzr zzrVar = this.a;
        String str = zzrVar.a;
        hm20.h(str);
        hm20.e(str);
        lqk0Var.g();
        lqk0Var.h();
        try {
            SQLiteDatabase sQLiteDatabaseV = lqk0Var.V();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseV.delete("apps", "app_id=?", strArr) + sQLiteDatabaseV.delete("events", "app_id=?", strArr) + sQLiteDatabaseV.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseV.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseV.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseV.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseV.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseV.delete("queue", "app_id=?", strArr) + sQLiteDatabaseV.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseV.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseV.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseV.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseV.delete("upload_queue", "app_id=?", strArr);
            if (k8l0Var.d.q(null, v2l0.h1)) {
                iDelete += sQLiteDatabaseV.delete("no_data_mode_events", "app_id=?", strArr);
            }
            if (iDelete > 0) {
                y4l0 y4l0Var = k8l0Var.f;
                k8l0.m(y4l0Var);
                y4l0Var.n.c(str, "Reset analytics data. app, records", Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            y4l0 y4l0Var2 = k8l0Var.f;
            k8l0.m(y4l0Var2);
            y4l0Var2.f.c(y4l0.k(str), "Error resetting analytics data. appId, error", e);
        }
        if (zzrVar.v) {
            iol0Var.Y(zzrVar);
        }
    }
}
