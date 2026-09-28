package defpackage;

import com.sportybet.plugin.realsports.betslip.domain.model.SelectionId;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ci30 implements SelectionId<ci30> {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public ci30() {
        throw null;
    }

    public ci30(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    @Override // com.sportybet.plugin.realsports.betslip.domain.model.SelectionId
    public final List<ci30> getChildSelections() {
        return null;
    }

    @Override // com.sportybet.plugin.realsports.betslip.domain.model.SelectionId
    public final String getEventId() {
        return this.a;
    }

    @Override // com.sportybet.plugin.realsports.betslip.domain.model.SelectionId
    public final String getMarketId() {
        return this.b;
    }

    @Override // com.sportybet.plugin.realsports.betslip.domain.model.SelectionId
    public final String getOutcomeId() {
        return this.c;
    }

    @Override // com.sportybet.plugin.realsports.betslip.domain.model.SelectionId
    public final String getSpecifier() {
        return this.d;
    }
}
