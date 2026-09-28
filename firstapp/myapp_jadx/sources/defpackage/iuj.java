package defpackage;

import android.os.Build;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class iuj extends snz<Integer, GameDetails> {
    public final et7 c;
    public final uxi0 d;
    public final Integer e;
    public final Integer f;
    public final int g;
    public final ssw<LoadingState<List<GameDetails>>> h;

    public iuj(et7 et7Var, uxi0 uxi0Var, Integer num, Integer num2) {
        uxi0Var.getClass();
        this.c = et7Var;
        this.d = uxi0Var;
        this.e = num;
        this.f = num2;
        this.g = Build.VERSION.SDK_INT;
        this.h = new ssw<>();
    }

    @Override // defpackage.snz
    public final void c(snz.d dVar, tnz tnzVar) {
        ej5.c(this.c, null, null, new guj(this, dVar, tnzVar, null), 3);
    }

    @Override // defpackage.snz
    public final void e(snz.c cVar, unz unzVar) {
        ej5.c(this.c, null, null, new huj(this, unzVar, null), 3);
    }

    @Override // defpackage.snz
    public final void d(snz.d dVar, tnz tnzVar) {
    }
}
