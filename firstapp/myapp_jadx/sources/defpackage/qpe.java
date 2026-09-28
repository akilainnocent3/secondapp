package defpackage;

import androidx.recyclerview.widget.n;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class qpe extends n.e<GameDetails> {
    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(GameDetails gameDetails, GameDetails gameDetails2) {
        GameDetails gameDetails3 = gameDetails;
        GameDetails gameDetails4 = gameDetails2;
        gameDetails3.getClass();
        gameDetails4.getClass();
        return Intrinsics.g(gameDetails3, gameDetails4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(GameDetails gameDetails, GameDetails gameDetails2) {
        GameDetails gameDetails3 = gameDetails;
        GameDetails gameDetails4 = gameDetails2;
        gameDetails3.getClass();
        gameDetails4.getClass();
        return Intrinsics.g(gameDetails3.getId(), gameDetails4.getId());
    }
}
