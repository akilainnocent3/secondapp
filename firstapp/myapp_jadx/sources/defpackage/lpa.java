package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class lpa extends bjb0 {
    public static lpa b;

    public static synchronized lpa h0() {
        lpa lpaVar;
        lpaVar = b;
        if (lpaVar == null) {
            lpaVar = new lpa();
            b = lpaVar;
        }
        return lpaVar;
    }

    @Override // defpackage.bjb0
    public final String Q() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // defpackage.bjb0
    public final String R() {
        return "experiment_app_start_ttid";
    }
}
