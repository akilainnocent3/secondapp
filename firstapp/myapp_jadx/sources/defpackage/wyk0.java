package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.identity.zzee;
import com.google.android.gms.internal.identity.zzeg;
import com.google.android.gms.internal.identity.zzei;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class wyk0 extends x3l {
    public final nj90 B;
    public final nj90 C;
    public final nj90 D;

    public wyk0(Context context, Looper looper, hs7 hs7Var, kgk0 kgk0Var, kgk0 kgk0Var2) {
        super(context, looper, 23, hs7Var, kgk0Var, kgk0Var2);
        this.B = new nj90();
        this.C = new nj90();
        this.D = new nj90();
        new nj90();
    }

    @Override // defpackage.r12
    public final boolean A() {
        return true;
    }

    public final boolean D(Feature feature) {
        Feature feature2;
        Feature[] featureArrM = m();
        if (featureArrM != null) {
            int i = 0;
            while (true) {
                if (i >= featureArrM.length) {
                    feature2 = null;
                    break;
                }
                feature2 = featureArrM[i];
                if (feature.a.equals(feature2.a)) {
                    break;
                }
                i++;
            }
            if (feature2 != null && feature2.G0() >= feature.G0()) {
                return true;
            }
        }
        return false;
    }

    public final void E(fyk0 fyk0Var, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) {
        pyk0 pyk0Var;
        yis yisVarZza = fyk0Var.zza();
        yis.a aVar = yisVarZza.c;
        Objects.requireNonNull(aVar);
        boolean zD = D(oll0.b);
        synchronized (this.C) {
            try {
                pyk0 pyk0Var2 = (pyk0) this.C.get(aVar);
                if (pyk0Var2 == null || zD) {
                    pyk0 pyk0Var3 = new pyk0(fyk0Var);
                    this.C.put(aVar, pyk0Var3);
                    pyk0Var = pyk0Var3;
                } else {
                    pyk0Var2.b.a(yisVarZza);
                    pyk0Var = pyk0Var2;
                    pyk0Var2 = null;
                }
                if (zD) {
                    ((ctl0) v()).j(new zzee(2, pyk0Var2 == null ? null : pyk0Var2, pyk0Var, null, aVar.b + "@" + System.identityHashCode(aVar.a)), locationRequest, new rxk0(null, taskCompletionSource));
                } else {
                    pyk0 pyk0Var4 = pyk0Var;
                    ((ctl0) v()).I(new zzei(1, new zzeg(locationRequest, null, false, false, false, false, Long.MAX_VALUE), null, pyk0Var4, null, new fxk0(taskCompletionSource, pyk0Var4), aVar.b + "@" + System.identityHashCode(aVar.a)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void F(yis.a aVar, boolean z, TaskCompletionSource taskCompletionSource) {
        synchronized (this.C) {
            try {
                pyk0 pyk0Var = (pyk0) this.C.remove(aVar);
                if (pyk0Var == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                yis yisVarZza = pyk0Var.b.zza();
                yisVarZza.b = null;
                yisVarZza.c = null;
                if (!z) {
                    taskCompletionSource.setResult(Boolean.TRUE);
                } else if (D(oll0.b)) {
                    ctl0 ctl0Var = (ctl0) v();
                    int iIdentityHashCode = System.identityHashCode(pyk0Var);
                    StringBuilder sb = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 18);
                    sb.append("ILocationCallback@");
                    sb.append(iIdentityHashCode);
                    ctl0Var.X(new zzee(2, null, pyk0Var, null, sb.toString()), new rxk0(Boolean.TRUE, taskCompletionSource));
                } else {
                    ((ctl0) v()).I(new zzei(2, null, null, pyk0Var, null, new ayk0(taskCompletionSource), null));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r12, sl0.f
    public final int l() {
        return 11717000;
    }

    @Override // defpackage.r12
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof ctl0 ? (ctl0) iInterfaceQueryLocalInterface : new rsl0(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // defpackage.r12
    public final Feature[] s() {
        return oll0.c;
    }

    @Override // defpackage.r12
    public final String w() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // defpackage.r12
    public final String x() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // defpackage.r12
    public final void z() {
        System.currentTimeMillis();
        synchronized (this.B) {
            this.B.clear();
        }
        synchronized (this.C) {
            this.C.clear();
        }
        synchronized (this.D) {
            this.D.clear();
        }
    }
}
