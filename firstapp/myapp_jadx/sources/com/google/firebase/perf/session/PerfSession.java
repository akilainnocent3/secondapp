package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.Timer;
import defpackage.bpa;
import defpackage.k2z;
import defpackage.qd00;
import defpackage.ts7;
import defpackage.wpa;
import defpackage.zpa;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new a();
    public final String a;
    public final Timer b;
    public boolean c;

    public class a implements Parcelable.Creator<PerfSession> {
        @Override // android.os.Parcelable.Creator
        public final PerfSession createFromParcel(Parcel parcel) {
            return new PerfSession(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PerfSession[] newArray(int i) {
            return new PerfSession[i];
        }
    }

    public PerfSession(Parcel parcel) {
        this.c = false;
        this.a = parcel.readString();
        this.c = parcel.readByte() != 0;
        this.b = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }

    public static qd00[] e(List<PerfSession> list) {
        if (list.isEmpty()) {
            return null;
        }
        qd00[] qd00VarArr = new qd00[list.size()];
        qd00 qd00VarA = list.get(0).a();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            qd00 qd00VarA2 = list.get(i).a();
            if (z || !list.get(i).c) {
                qd00VarArr[i] = qd00VarA2;
            } else {
                qd00VarArr[0] = qd00VarA2;
                qd00VarArr[i] = qd00VarA;
                z = true;
            }
        }
        if (!z) {
            qd00VarArr[0] = qd00VarA;
        }
        return qd00VarArr;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x008c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    public static PerfSession g(String str) {
        boolean z;
        zpa zpaVar;
        k2z<Double> k2zVar;
        k2z<Double> k2zVarB;
        double dDoubleValue;
        PerfSession perfSession = new PerfSession(str.replace("-", ""), new ts7());
        bpa bpaVarE = bpa.e();
        if (bpaVarE.o()) {
            double dRandom = Math.random();
            synchronized (zpa.class) {
                zpaVar = zpa.b;
                if (zpaVar == null) {
                    zpaVar = new zpa();
                    zpa.b = zpaVar;
                }
            }
            k2z<Double> k2zVarI = bpaVarE.i(zpaVar);
            if (k2zVarI.b()) {
                dDoubleValue = k2zVarI.a().doubleValue() / 100.0d;
                if (!bpa.p(dDoubleValue)) {
                    k2zVar = bpaVarE.a.getDouble("fpr_vc_session_sampling_rate");
                    if (k2zVar.b() || !bpa.p(k2zVar.a().doubleValue())) {
                        k2zVarB = bpaVarE.b(zpaVar);
                        if (!k2zVarB.b() && bpa.p(k2zVarB.a().doubleValue())) {
                            dDoubleValue = k2zVarB.a().doubleValue();
                        } else if (bpaVarE.a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else {
                        bpaVarE.c.d(k2zVar.a().doubleValue(), "com.google.firebase.perf.SessionSamplingRate");
                        dDoubleValue = k2zVar.a().doubleValue();
                    }
                }
            } else {
                k2zVar = bpaVarE.a.getDouble("fpr_vc_session_sampling_rate");
                if (k2zVar.b()) {
                    k2zVarB = bpaVarE.b(zpaVar);
                    if (!k2zVarB.b()) {
                        if (bpaVarE.a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else if (bpaVarE.a.isLastFetchFailed()) {
                        dDoubleValue = 1.0E-5d;
                    } else {
                        dDoubleValue = 0.01d;
                    }
                } else {
                    k2zVarB = bpaVarE.b(zpaVar);
                    if (!k2zVarB.b()) {
                        if (bpaVarE.a.isLastFetchFailed()) {
                            dDoubleValue = 1.0E-5d;
                        } else {
                            dDoubleValue = 0.01d;
                        }
                    } else if (bpaVarE.a.isLastFetchFailed()) {
                        dDoubleValue = 1.0E-5d;
                    } else {
                        dDoubleValue = 0.01d;
                    }
                }
            }
            if (dRandom < dDoubleValue) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        perfSession.c = z;
        return perfSession;
    }

    public final qd00 a() {
        qd00.c cVarK = qd00.k();
        cVarK.h(this.a);
        if (this.c) {
            cVarK.g();
        }
        return cVarK.build();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean h() {
        wpa wpaVar;
        long jLongValue;
        long jA = this.b.a() / 60000000;
        bpa bpaVarE = bpa.e();
        bpaVarE.getClass();
        synchronized (wpa.class) {
            wpaVar = wpa.b;
            if (wpaVar == null) {
                wpaVar = new wpa();
                wpa.b = wpaVar;
            }
        }
        k2z<Long> k2zVarJ = bpaVarE.j(wpaVar);
        if (!k2zVarJ.b() || k2zVarJ.a().longValue() <= 0) {
            k2z<Long> k2zVar = bpaVarE.a.getLong("fpr_session_max_duration_min");
            if (!k2zVar.b() || k2zVar.a().longValue() <= 0) {
                k2z<Long> k2zVarC = bpaVarE.c(wpaVar);
                jLongValue = (!k2zVarC.b() || k2zVarC.a().longValue() <= 0) ? 240L : k2zVarC.a().longValue();
            } else {
                bpaVarE.c.e(k2zVar.a().longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                jLongValue = k2zVar.a().longValue();
            }
        } else {
            jLongValue = k2zVarJ.a().longValue();
        }
        return jA > jLongValue;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.b, 0);
    }

    public PerfSession(String str, ts7 ts7Var) {
        this.c = false;
        this.a = str;
        this.b = new Timer();
    }
}
