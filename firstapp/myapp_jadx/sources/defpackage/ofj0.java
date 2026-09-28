package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.d;
import com.sporty.android.core.model.MyLog;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class ofj0 {
    public final d a;
    public final File b;
    public volatile boolean c;

    public ofj0(Context context, ys60 ys60Var) {
        ys60Var.getClass();
        d dVarA = new ExoPlayer.b(context).a();
        this.a = dVarA;
        this.b = ys60Var.a();
        dVarA.V(0);
        dVarA.H0(new r21(1, 1));
        b();
    }

    public final void a() {
        if (this.c) {
            return;
        }
        int iP = this.a.P();
        d dVar = this.a;
        if (iP == 1) {
            dVar.a();
        } else {
            dVar.a();
            this.a.n0(5, 0L);
        }
    }

    public final void b() {
        File file = this.b;
        if (!file.exists() || file.length() <= 0) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_WINNING_POPUP);
            aVar.n("WinningPopupSound: prepare skip (missing/empty)", new Object[0]);
            return;
        }
        njv njvVarA = njv.a(Uri.fromFile(file));
        d dVar = this.a;
        dVar.getClass();
        c150 c150VarN = pcn.n(njvVarA);
        dVar.S0();
        dVar.J0(dVar.t0(c150VarN), true);
        itf0.a aVar2 = itf0.a;
        aVar2.q(MyLog.TAG_WINNING_POPUP);
        aVar2.a("WinningPopupSound: preparing state=" + dVar.P() + " item=" + (dVar.g0() != null), new Object[0]);
        dVar.d();
    }
}
