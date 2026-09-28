package defpackage;

import androidx.compose.runtime.i;
import androidx.compose.runtime.k;
import androidx.compose.runtime.l;
import androidx.compose.runtime.m;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.crash.remote.models.DetailResponse;
import com.sportygames.crash.remote.models.MultiplierResponse;
import com.sportygames.crash.remote.models.TopBets;
import java.io.File;
import java.util.HashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lul2;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ul2 extends j8i0 {
    public final ytw<File> A;
    public final ytw<File> B;
    public final ytw<File> C;
    public final ytw<File> D;
    public final ytw<File> E;
    public final ytw<File> F;
    public final ytw<File> G;
    public final ytw<File> H;
    public final ytw<File> I;
    public final ytw<File> J;
    public final ytw<File> K;
    public final xsw L;
    public final osw M;
    public final ytw<String> N;
    public final fsw O;
    public final fsw P;
    public final xsw Q;
    public final ytw<Boolean> R;
    public final ytw<Boolean> S;
    public final ytw<z83> T;
    public final ytw U;
    public final wwd0 a = xwd0.a(new BetContainerState(false, null, 0, false, 0, null, null, false, false, false, 0, false, 0, false, null, false, false, false, false, false, false, false, false, 8388607, null));
    public final ytw<MultiplierResponse> b = m.b(new MultiplierResponse(0, "", false, 0, 0, "", 0));
    public final ytw<Boolean> c;
    public final ytw<HashMap<Long, Boolean>> d;
    public final ytw<File> e;
    public final ytw<File> f;
    public final ytw<File> i;
    public final ytw<File> v;
    public final ytw<File> w;
    public final ytw<File> y;
    public final ytw<File> z;

    public ul2() {
        Boolean bool = Boolean.FALSE;
        this.c = m.b(bool);
        this.d = m.b(new HashMap());
        this.e = m.b(null);
        this.f = m.b(null);
        this.i = m.b(null);
        this.v = m.b(null);
        this.w = m.b(null);
        this.y = m.b(null);
        this.z = m.b(null);
        this.A = m.b(null);
        this.B = m.b(null);
        this.C = m.b(null);
        this.D = m.b(null);
        this.E = m.b(null);
        this.F = m.b(null);
        this.G = m.b(null);
        this.H = m.b(null);
        this.I = m.b(null);
        this.J = m.b(null);
        this.K = m.b(null);
        this.L = l.a(0L);
        this.M = k.a(0);
        this.N = m.b("5");
        this.O = i.a(0.0d);
        this.P = i.a(0.0d);
        this.Q = l.a(0L);
        this.R = m.b(bool);
        this.S = m.b(bool);
        this.T = m.b(z83.a);
        this.U = m.b(bool);
    }

    public final void A1(boolean z) {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, BetContainerState.copy$default((BetContainerState) value, false, null, 0L, false, 0, null, null, false, false, false, 0, false, 0, false, null, false, false, false, false, false, false, z, false, 6291455, null)));
    }

    public final void B1(long j) {
        wwd0 wwd0Var;
        Object value;
        BetContainerState betContainerStateCopy$default;
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
            betContainerStateCopy$default = (BetContainerState) value;
            if (betContainerStateCopy$default.isStakeSafeBet() && betContainerStateCopy$default.getRoundId() > 0 && betContainerStateCopy$default.getRoundId() == j) {
                betContainerStateCopy$default = BetContainerState.copy$default(betContainerStateCopy$default, false, null, 0L, false, 0, null, null, false, false, false, 0, false, 0, false, null, false, false, false, false, false, false, false, false, 7340031, null);
            }
        } while (!wwd0Var.g(value, betContainerStateCopy$default));
    }

    public final void C1(boolean z) {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, BetContainerState.copy$default((BetContainerState) value, false, null, 0L, false, 0, null, null, false, false, false, 0, false, 0, false, null, false, false, false, false, false, z, false, false, 7340031, null)));
    }

    public final void D1(boolean z) {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, BetContainerState.copy$default((BetContainerState) value, false, null, 0L, false, 0, null, null, false, false, false, 0, false, 0, false, null, false, false, false, false, false, false, false, z, 4194303, null)));
    }

    public final void E1(long j) {
        wwd0 wwd0Var;
        Object value;
        BetContainerState betContainerStateCopy$default;
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
            betContainerStateCopy$default = (BetContainerState) value;
            if (betContainerStateCopy$default.isTurboBet() && betContainerStateCopy$default.getRoundId() > 0 && betContainerStateCopy$default.getRoundId() == j) {
                betContainerStateCopy$default = BetContainerState.copy$default(betContainerStateCopy$default, false, null, 0L, false, 0, null, null, false, false, false, 0, false, 0, false, null, false, false, false, false, false, false, false, false, 7864319, null);
            }
        } while (!wwd0Var.g(value, betContainerStateCopy$default));
    }

    public final void F1(boolean z) {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.a;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, BetContainerState.copy$default((BetContainerState) value, false, null, 0L, false, 0, null, null, false, false, false, 0, false, 0, false, null, false, false, false, false, z, false, false, false, 7864319, null)));
    }

    public final void G1(boolean z) {
        wwd0 wwd0Var = this.a;
        wwd0Var.setValue(BetContainerState.copy$default((BetContainerState) wwd0Var.getValue(), false, null, 0L, false, 0, null, null, false, false, false, 0, false, 0, false, null, false, false, z, false, false, false, false, false, 8257535, null));
    }

    public final void H1(boolean z) {
        wwd0 wwd0Var = this.a;
        wwd0Var.setValue(BetContainerState.copy$default((BetContainerState) wwd0Var.getValue(), false, null, 0L, false, 0, null, null, false, false, false, 0, false, 0, false, null, false, false, false, z, false, false, false, false, 8126463, null));
    }

    public final void I1(boolean z) {
        wwd0 wwd0Var = this.a;
        wwd0Var.setValue(BetContainerState.copy$default((BetContainerState) wwd0Var.getValue(), false, null, 0L, false, 0, null, null, false, z, false, 0, false, 0, false, null, false, false, false, false, false, false, false, false, 8388351, null));
    }

    public final void J1(boolean z) {
        wwd0 wwd0Var = this.a;
        wwd0Var.setValue(BetContainerState.copy$default((BetContainerState) wwd0Var.getValue(), false, null, 0L, false, 0, null, null, z, false, false, 0, false, 0, false, null, false, false, false, false, false, false, false, false, 8388479, null));
    }

    public final void K1(boolean z) {
        wwd0 wwd0Var = this.a;
        wwd0Var.setValue(BetContainerState.copy$default((BetContainerState) wwd0Var.getValue(), false, null, 0L, false, 0, null, null, false, false, z, 0, false, 0, false, null, false, false, false, false, false, false, false, false, 8388095, null));
    }

    public final void L1(DetailResponse detailResponse) {
        detailResponse.getClass();
        wwd0 wwd0Var = this.a;
        wwd0Var.setValue(BetContainerState.copy$default((BetContainerState) wwd0Var.getValue(), false, detailResponse, 0L, false, 0, null, null, false, false, false, 0, false, 0, false, null, false, false, false, false, false, false, false, false, 8388605, null));
    }

    public final void M1(boolean z) {
        wwd0 wwd0Var = this.a;
        wwd0Var.setValue(BetContainerState.copy$default((BetContainerState) wwd0Var.getValue(), false, null, 0L, false, 0, null, null, false, false, false, 0, false, 0, z, null, false, false, false, false, false, false, false, false, 8380415, null));
    }

    public final void N1(boolean z) {
        wwd0 wwd0Var = this.a;
        wwd0Var.setValue(BetContainerState.copy$default((BetContainerState) wwd0Var.getValue(), false, null, 0L, false, 0, null, null, false, false, false, 0, z, 0, false, null, false, false, false, false, false, false, false, false, 8386559, null));
    }

    public final void O1(GiftItem giftItem) {
        giftItem.getClass();
        wwd0 wwd0Var = this.a;
        wwd0Var.setValue(BetContainerState.copy$default((BetContainerState) wwd0Var.getValue(), false, null, 0L, false, 0, giftItem, null, false, false, false, 0, false, 0, false, null, false, false, false, false, false, false, false, false, 8388575, null));
    }

    public final void P1(int i) {
        wwd0 wwd0Var = this.a;
        wwd0Var.setValue(BetContainerState.copy$default((BetContainerState) wwd0Var.getValue(), false, null, 0L, false, 0, null, null, false, false, false, i, false, 0, false, null, false, false, false, false, false, false, false, false, 8387583, null));
    }

    public final void Q1(int i) {
        wwd0 wwd0Var = this.a;
        wwd0Var.setValue(BetContainerState.copy$default((BetContainerState) wwd0Var.getValue(), false, null, 0L, false, 0, null, null, false, false, false, 0, false, i, false, null, false, false, false, false, false, false, false, false, 8384511, null));
    }

    public final void R1(boolean z) {
        wwd0 wwd0Var = this.a;
        wwd0Var.setValue(BetContainerState.copy$default((BetContainerState) wwd0Var.getValue(), false, null, 0L, false, 0, null, null, false, false, false, 0, false, 0, false, null, false, z, false, false, false, false, false, false, 8323071, null));
    }

    public final void S1(boolean z) {
        wwd0 wwd0Var = this.a;
        wwd0Var.setValue(BetContainerState.copy$default((BetContainerState) wwd0Var.getValue(), false, null, 0L, z, 0, null, null, false, false, false, 0, false, 0, false, null, false, false, false, false, false, false, false, false, 8388599, null));
    }

    public final void T1(boolean z) {
        wwd0 wwd0Var = this.a;
        wwd0Var.setValue(BetContainerState.copy$default((BetContainerState) wwd0Var.getValue(), false, null, 0L, false, 0, null, null, false, false, false, 0, false, 0, false, null, z, false, false, false, false, false, false, false, 8355839, null));
    }

    public final void U1(boolean z) {
        wwd0 wwd0Var = this.a;
        wwd0Var.setValue(BetContainerState.copy$default((BetContainerState) wwd0Var.getValue(), z, null, 0L, false, 0, null, null, false, false, false, 0, false, 0, false, null, false, false, false, false, false, false, false, false, 8388606, null));
    }

    public final void V1(long j) {
        wwd0 wwd0Var = this.a;
        wwd0Var.setValue(BetContainerState.copy$default((BetContainerState) wwd0Var.getValue(), false, null, j, false, 0, null, null, false, false, false, 0, false, 0, false, null, false, false, false, false, false, false, false, false, 8388603, null));
    }

    public final void W1(TopBets topBets) {
        topBets.getClass();
        wwd0 wwd0Var = this.a;
        wwd0Var.setValue(BetContainerState.copy$default((BetContainerState) wwd0Var.getValue(), false, null, 0L, false, 0, null, null, false, false, false, 0, false, 0, false, topBets, false, false, false, false, false, false, false, false, 8372223, null));
    }

    /* JADX INFO: renamed from: x1, reason: from getter */
    public final wwd0 getA() {
        return this.a;
    }

    public final DetailResponse y1() {
        return ((BetContainerState) this.a.getValue()).getDetailResponse();
    }

    public final boolean z1() {
        return ((Boolean) ((x5a0) this.U).getValue()).booleanValue();
    }
}
