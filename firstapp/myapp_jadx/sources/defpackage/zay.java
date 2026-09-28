package defpackage;

import com.sporty.android.core.model.realsports.EarlyPayoutMarketMapping;

/* JADX INFO: loaded from: classes7.dex */
public final class zay {
    public static final bby a(EarlyPayoutMarketMapping earlyPayoutMarketMapping, String str, String str2) {
        String str3;
        String str4;
        earlyPayoutMarketMapping.getClass();
        String sourceMarketId = earlyPayoutMarketMapping.getSourceMarketId();
        if (sourceMarketId == null) {
            sourceMarketId = "";
        }
        String sourceSpecifier = earlyPayoutMarketMapping.getSourceSpecifier();
        if (sourceSpecifier == null) {
            sourceSpecifier = "";
        }
        String mappedMarketId = earlyPayoutMarketMapping.getMappedMarketId();
        if (mappedMarketId == null) {
            mappedMarketId = "";
        }
        String mappedSpecifier = earlyPayoutMarketMapping.getMappedSpecifier();
        if (mappedSpecifier == null) {
            String str5 = mappedMarketId;
            str4 = "";
            str3 = str5;
        } else {
            str3 = mappedMarketId;
            str4 = mappedSpecifier;
        }
        return new bby(sourceMarketId, sourceSpecifier, str3, str4, str, str2);
    }
}
