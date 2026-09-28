package defpackage;

import androidx.compose.runtime.m;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.ToastCommonModel;
import com.sportygames.crashInitiated.model.request.BetData;
import java.util.Currency;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkoj;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class koj extends j8i0 {
    public final ytw<String> A;
    public final ytw<BetData> B;
    public final ytw<j58> C;
    public final ytw<j58> D;
    public final ytw<Boolean> E;
    public final ytw<Integer> F;
    public final ytw<String> G;
    public final ytw<String> H;
    public final ytw<Boolean> I;
    public final ytw<String> J;
    public final ytw<String> K;
    public final ytw<String> L;
    public final ytw<mz1> M;
    public final ytw<cj5> N;
    public final ytw<Boolean> O;
    public final ytw<Boolean> P;
    public final ytw<String> Q;
    public final ytw<Boolean> R;
    public final ytw<Boolean> S;
    public final ytw<Boolean> T;
    public final ytw<ToastCommonModel> U;
    public ytw<String> a = m.b("");
    public ytw<String> b = m.b("");
    public final ytw<String> c = m.b("game_title_webp");
    public ytw<String> d = m.b("");
    public final ytw<String[]> e = m.b(new String[]{""});
    public ytw<Integer> f = m.b(0);
    public ytw<String> i = m.b("");
    public final ytw<Boolean> v;
    public int w;
    public int y;
    public final ytw<String> z;

    public koj() {
        Boolean bool = Boolean.FALSE;
        this.v = m.b(bool);
        this.z = m.b("");
        this.A = m.b("");
        this.B = m.b(new BetData(null, null, null, null, new doj(), new foj(), 15, null));
        long j = j58.f;
        this.C = m.b(new j58(j));
        this.D = m.b(new j58(j));
        this.E = m.b(bool);
        this.F = m.b(0);
        this.G = m.b("");
        this.H = m.b("");
        this.I = m.b(bool);
        this.J = m.b("");
        this.K = m.b("");
        this.L = m.b("");
        this.M = m.b(new mz1());
        this.N = m.b(new cj5());
        this.O = m.b(bool);
        this.P = m.b(bool);
        this.Q = m.b("");
        this.R = m.b(Boolean.TRUE);
        this.S = m.b(bool);
        this.T = m.b(bool);
        new tl2();
        String symbol = Currency.getInstance("INR").getSymbol();
        symbol.getClass();
        this.U = m.b(new ToastCommonModel("", symbol, "", "", R.color.sg_rush_toast_color, "", "", 0.0d, 128, null));
    }

    public final void x1(boolean z) {
        ((x5a0) this.T).setValue(Boolean.valueOf(z));
    }
}
