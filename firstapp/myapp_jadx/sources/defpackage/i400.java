package defpackage;

import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class i400 {
    public static final /* synthetic */ i400[] a = {new i400("INIT", 0), new i400("PROCESSING", 1), new i400(PBBetHistoryItemDTO.STATUS_PENDING, 2), new i400("PAY_SUCC", 3), new i400(ACKxwYRsuWyGz.vcCYQpjgZ, 4), new i400("PAY_AUDIT_FAIL", 5), new i400("PAY_RISK_FAIL", 6), new i400("PAY_MANUAL_FAIL", 7), new i400("PAY_UNKNOWN", 8)};

    /* JADX INFO: Fake field, exist only in values array */
    i400 EF5;

    public static i400 valueOf(String str) {
        return (i400) Enum.valueOf(i400.class, str);
    }

    public static i400[] values() {
        return (i400[]) a.clone();
    }
}
