package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class svf {
    public static final long a(long j, long j2) {
        int iD;
        int iF = ulf0.f(j);
        int iE = ulf0.e(j);
        if ((ulf0.f(j2) < ulf0.e(j)) && (ulf0.f(j) < ulf0.e(j2))) {
            if ((ulf0.f(j2) <= ulf0.f(j)) && (ulf0.e(j) <= ulf0.e(j2))) {
                iF = ulf0.f(j2);
                iE = iF;
            } else {
                if ((ulf0.f(j) <= ulf0.f(j2)) && (ulf0.e(j2) <= ulf0.e(j))) {
                    iD = ulf0.d(j2);
                } else {
                    int iF2 = ulf0.f(j2);
                    if (iF >= ulf0.e(j2) || iF2 > iF) {
                        iE = ulf0.f(j2);
                    } else {
                        iF = ulf0.f(j2);
                        iD = ulf0.d(j2);
                    }
                }
                iE -= iD;
            }
        } else if (iE > ulf0.f(j2)) {
            iF -= ulf0.d(j2);
            iD = ulf0.d(j2);
            iE -= iD;
        }
        return vlf0.a(iF, iE);
    }
}
