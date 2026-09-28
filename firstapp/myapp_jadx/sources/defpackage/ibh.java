package defpackage;

import android.os.Build;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.remote.models.UpdateFavouriteRequest;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ibh extends snz<Integer, GameDetails> {
    public final et7 c;
    public final uxi0 d;
    public final UpdateFavouriteRequest e;
    public final int f;
    public final ssw<LoadingState<List<GameDetails>>> g;
    public int h;

    public ibh(et7 et7Var, uxi0 uxi0Var, UpdateFavouriteRequest updateFavouriteRequest) {
        uxi0Var.getClass();
        this.c = et7Var;
        this.d = uxi0Var;
        this.e = updateFavouriteRequest;
        this.f = Build.VERSION.SDK_INT;
        this.g = new ssw<>();
        this.h = -1;
    }

    @Override // defpackage.snz
    public final void c(snz.d dVar, tnz tnzVar) {
        ej5.c(this.c, null, null, new gbh(dVar, this, tnzVar, null), 3);
    }

    @Override // defpackage.snz
    public final void e(snz.c cVar, unz unzVar) {
        ej5.c(this.c, null, null, new hbh(this, unzVar, null), 3);
    }

    @Override // defpackage.snz
    public final void d(snz.d dVar, tnz tnzVar) {
    }
}
