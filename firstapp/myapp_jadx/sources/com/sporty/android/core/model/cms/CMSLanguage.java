package com.sporty.android.core.model.cms;

import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import com.twilio.voice.EventKeys;
import defpackage.om2;
import defpackage.tag;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/cms/CMSLanguage;", "", "languageCode", "", "cmsApiLanguageCode", "betRadarLanguageCode", "socketSuffixLanguageCode", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLanguageCode", "()Ljava/lang/String;", "getCmsApiLanguageCode", "getBetRadarLanguageCode", "getSocketSuffixLanguageCode", "ENGLISH", "PORTUGUESE_BRAZIL", "PORTUGUESE_MOZAMBIQUE", "SW", "SPANISH_MX", "FR", "Companion", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum CMSLanguage {
    ENGLISH("en", "en", "en", null),
    PORTUGUESE_BRAZIL("pt-br", oLsIjJCWb.rDQnpson, "br", "br"),
    PORTUGUESE_MOZAMBIQUE("pt-mz", "pt-MZ", "en", "pt-mz"),
    SW("sw", "sw", "en", null),
    SPANISH_MX("es-mx", "es-MX", "es", "mx"),
    FR("fr-cm", "fr-CM", "fr", "fr-cm");

    private final String betRadarLanguageCode;
    private final String cmsApiLanguageCode;
    private final String languageCode;
    private final String socketSuffixLanguageCode;
    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005H\u0007b\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sporty/android/core/model/cms/CMSLanguage$Companion;", "", "<init>", "()V", "fromCode", "Lcom/sporty/android/core/model/cms/CMSLanguage;", EventKeys.ERROR_CODE, "", "default", "Lkotlin/jvm/JvmStatic;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CMSLanguage fromCode$default(Companion companion, String str, CMSLanguage cMSLanguage, int i, Object obj) {
            if ((i & 2) != 0) {
                cMSLanguage = CMSLanguage.ENGLISH;
            }
            return companion.fromCode(str, cMSLanguage);
        }

        public final CMSLanguage fromCode(String code, CMSLanguage cMSLanguage) {
            CMSLanguage next;
            code.getClass();
            cMSLanguage.getClass();
            Iterator<CMSLanguage> it = CMSLanguage.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!c.l(next.getLanguageCode(), code, true));
            CMSLanguage cMSLanguage2 = next;
            return cMSLanguage2 == null ? cMSLanguage : cMSLanguage2;
        }

        private Companion() {
        }
    }

    CMSLanguage(String str, String str2, String str3, String str4) {
        this.languageCode = str;
        this.cmsApiLanguageCode = str2;
        this.betRadarLanguageCode = str3;
        this.socketSuffixLanguageCode = str4;
    }

    public static final CMSLanguage fromCode(String str, CMSLanguage cMSLanguage) {
        return INSTANCE.fromCode(str, cMSLanguage);
    }

    public static tag<CMSLanguage> getEntries() {
        return $ENTRIES;
    }

    public final String getBetRadarLanguageCode() {
        return this.betRadarLanguageCode;
    }

    public final String getCmsApiLanguageCode() {
        return this.cmsApiLanguageCode;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final String getSocketSuffixLanguageCode() {
        return this.socketSuffixLanguageCode;
    }
}
