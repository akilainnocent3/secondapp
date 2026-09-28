package defpackage;

import android.os.Build;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class nah extends snz<Integer, GameDetails> {
    public final et7 c;
    public final uxi0 d;
    public final Integer e;
    public final int f;
    public final ssw<LoadingState<List<GameDetails>>> g;
    public int h;

    public nah(et7 et7Var, uxi0 uxi0Var, Integer num) {
        uxi0Var.getClass();
        this.c = et7Var;
        this.d = uxi0Var;
        this.e = num;
        this.f = Build.VERSION.SDK_INT;
        this.g = new ssw<>();
        this.h = -1;
    }

    @Override // defpackage.snz
    public final void c(snz.d dVar, tnz tnzVar) {
        ej5.c(this.c, null, null, new lah(dVar, this, tnzVar, null), 3);
    }

    @Override // defpackage.snz
    public final void e(snz.c cVar, unz unzVar) {
        ej5.c(this.c, null, null, new mah(this, unzVar, null), 3);
    }

    @Override // defpackage.snz
    public final void d(snz.d dVar, tnz tnzVar) {
    }
}
