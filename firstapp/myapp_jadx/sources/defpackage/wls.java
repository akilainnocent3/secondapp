package defpackage;

import androidx.media3.exoplayer.d;
import androidx.media3.ui.PlayerView;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class wls implements so10.c {
    public final /* synthetic */ xls a;

    public wls(xls xlsVar) {
        this.a = xlsVar;
    }

    @Override // so10.c
    public final void i(bo10 bo10Var) {
        bo10Var.getClass();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SPORTY_TV);
        int i = bo10Var.a;
        aVar.a("onPlayerError: %s", Integer.valueOf(i));
        xls xlsVar = this.a;
        ems emsVar = xlsVar.b;
        if (i != 1002) {
            emsVar.z.setText(sn5.b(xlsVar.a, R.string.sporty_tv__live_streaming_is_unavailable, new Object[0]));
            emsVar.z.setVisibility(0);
            return;
        }
        d dVar = xlsVar.f;
        if (dVar != null) {
            dVar.j();
        }
        d dVar2 = xlsVar.f;
        if (dVar2 != null) {
            dVar2.d();
        }
        emsVar.z.setVisibility(8);
    }

    @Override // so10.c
    public final void q(int i) {
        ems emsVar = this.a.b;
        boolean z = false;
        emsVar.y.setUseController(i != 2);
        PlayerView playerView = emsVar.y;
        if (i != 1 && i != 4) {
            z = true;
        }
        playerView.setKeepScreenOn(z);
    }
}
