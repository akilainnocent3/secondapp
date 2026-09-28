package defpackage;

import com.sportybet.plugin.realsports.prematch.data.LiveEventDataInPreMatch;
import com.sportybet.plugin.realsports.prematch.data.PreMatchEventData;
import com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData;
import com.sportybet.plugin.realsports.prematch.data.TournamentTitleData;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sf20 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PreMatchSectionData preMatchSectionData = (PreMatchSectionData) obj;
        preMatchSectionData.getClass();
        if (preMatchSectionData instanceof TournamentTitleData) {
            return ((TournamentTitleData) preMatchSectionData).getSportId();
        }
        if (preMatchSectionData instanceof LiveEventDataInPreMatch) {
            return ((LiveEventDataInPreMatch) preMatchSectionData).getSportId();
        }
        if (preMatchSectionData instanceof PreMatchEventData) {
            return ((PreMatchEventData) preMatchSectionData).getSportId();
        }
        return null;
    }
}
