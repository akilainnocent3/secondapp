package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.LocationResult;

/* JADX INFO: loaded from: classes4.dex */
public abstract class etl0 extends irk0 implements ktl0 {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.irk0
    public final boolean a(Parcel parcel, int i) {
        if (i == 1) {
            LocationResult locationResult = (LocationResult) luk0.a(parcel, LocationResult.CREATOR);
            luk0.b(parcel);
            yis yisVarZza = ((pyk0) this).b.zza();
            iyk0 iyk0Var = new iyk0(locationResult);
            yisVarZza.getClass();
            yisVarZza.a.execute(new ygk0(yisVarZza, iyk0Var));
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            ((pyk0) this).b();
            return true;
        }
        luk0.b(parcel);
        yis yisVarZza2 = ((pyk0) this).b.zza();
        kyk0 kyk0Var = new kyk0();
        yisVarZza2.getClass();
        yisVarZza2.a.execute(new ygk0(yisVarZza2, kyk0Var));
        return true;
    }
}
