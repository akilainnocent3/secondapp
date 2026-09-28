package defpackage;

import androidx.compose.runtime.m;
import com.sportygames.crash.models.header.CrashHeaderState;
import com.sportygames.crash.models.history.CrashRoundHistoryState;
import com.sportygames.crash.remote.models.Coefficients;
import com.sportygames.crash.remote.models.PreviousMultiplierResponse;
import com.sportygames.crashInitiated.model.response.CrashInitiatedCoeffListResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lip8;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ip8 extends j8i0 {
    public final wwd0 A;
    public final ytw<PreviousMultiplierResponse> B;
    public final ytw<List<CrashInitiatedCoeffListResponse>> C;
    public final ytw<CrashInitiatedCoeffListResponse> D;
    public final ytw<Coefficients> E;
    public final ytw<Boolean> a;
    public final ytw<Boolean> b;
    public final ytw<Boolean> c;
    public final ytw<Boolean> d;
    public final ytw<Boolean> e;
    public final ytw<Boolean> f;
    public final ytw<Boolean> i;
    public final ytw<String> v;
    public final ytw<String> w;
    public final ytw<Boolean> y;
    public final wwd0 z;

    public ip8() {
        Boolean bool = Boolean.FALSE;
        this.a = m.b(bool);
        this.b = m.b(bool);
        this.c = m.b(Boolean.TRUE);
        this.d = m.b(bool);
        this.e = m.b(bool);
        this.f = m.b(bool);
        this.i = m.b(bool);
        this.v = m.b("");
        this.w = m.b("");
        this.y = m.b(bool);
        this.z = xwd0.a(new CrashRoundHistoryState(null, null, 3, null));
        this.A = xwd0.a(new CrashHeaderState(null, null, false, false, false, false, 63, null));
        this.B = m.b(new PreviousMultiplierResponse(0, new ArrayList()));
        this.C = m.b(m2g.a);
        this.D = m.b(new CrashInitiatedCoeffListResponse(24.0d, false, false));
        long j = j58.i;
        long j2 = j58.j;
        this.E = m.b(new Coefficients(1, 0.0d, "", j, j2, j2, false, null));
    }

    public final void A1(boolean z) {
        wwd0 wwd0Var = this.A;
        wwd0Var.setValue(CrashHeaderState.copy$default((CrashHeaderState) wwd0Var.getValue(), null, null, false, false, z, false, 47, null));
    }

    public final void B1(PreviousMultiplierResponse previousMultiplierResponse) {
        wwd0 wwd0Var = this.z;
        wwd0Var.setValue(CrashRoundHistoryState.copy$default((CrashRoundHistoryState) wwd0Var.getValue(), previousMultiplierResponse, null, 2, null));
    }

    public final void C1(boolean z) {
        wwd0 wwd0Var = this.A;
        wwd0Var.setValue(CrashHeaderState.copy$default((CrashHeaderState) wwd0Var.getValue(), null, null, false, z, false, false, 55, null));
    }

    public final void x1(Coefficients coefficients) {
        coefficients.getClass();
        ((CrashRoundHistoryState) this.z.getValue()).getPreviousRoundsList().getCoefficients().add(0, coefficients);
    }

    public final void y1(Coefficients coefficients) {
        coefficients.getClass();
        wwd0 wwd0Var = this.z;
        wwd0Var.setValue(CrashRoundHistoryState.copy$default((CrashRoundHistoryState) wwd0Var.getValue(), null, coefficients, 1, null));
    }

    public final void z1(String str, String str2) {
        str2.getClass();
        wwd0 wwd0Var = this.A;
        wwd0Var.setValue(CrashHeaderState.copy$default((CrashHeaderState) wwd0Var.getValue(), str, str2, false, false, false, false, 60, null));
    }
}
