package defpackage;

import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class tld0 {
    public final GameDetails a;
    public final Function0<Boolean> b;
    public final Function0<Unit> c;

    public /* synthetic */ tld0(GameDetails gameDetails) {
        this(gameDetails, new f38(), new sld0());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tld0)) {
            return false;
        }
        tld0 tld0Var = (tld0) obj;
        return Intrinsics.g(this.a, tld0Var.a) && Intrinsics.g(this.b, tld0Var.b) && Intrinsics.g(this.c, tld0Var.c);
    }

    public final int hashCode() {
        GameDetails gameDetails = this.a;
        return this.c.hashCode() + x7g.a((gameDetails == null ? 0 : gameDetails.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return "StackerCampaignInputs(gameDetails=" + this.a + ", isBetInProgress=" + this.b + ", showActiveBetsToast=" + this.c + ")";
    }

    public tld0(GameDetails gameDetails, Function0<Boolean> function0, Function0<Unit> function1) {
        this.a = gameDetails;
        this.b = function0;
        this.c = function1;
    }
}
