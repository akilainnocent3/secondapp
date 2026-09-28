package com.sporty.android.core.model.service;

import com.twilio.voice.EventKeys;
import defpackage.hb5;
import defpackage.inm;
import defpackage.om2;
import defpackage.tag;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0086\u0081\u0002\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001#B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\"\u001a\u00020\u0003H\u0096\u0080\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0010\b\b\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000bj\u0010\b\f\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\rj\u0010\b\u000e\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000fj\u0010\b\u0010\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011j\u0010\b\u0012\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0013j\u0010\b\u0014\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0015j\u0010\b\u0016\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0017j\u0010\b\u0018\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0019j\u0010\b\u001a\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u001bj\u0010\b\u001c\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u001dj\u0010\b\u001e\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u001fj\u0010\b \u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(!¨\u0006$"}, d2 = {"Lcom/sporty/android/core/model/service/CountryCodeName;", "", EventKeys.ERROR_CODE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "KENYA", "Lcom/google/gson/annotations/SerializedName;", "value", "ke", "NIGERIA", "ng", "GHANA", "gh", "ZAMBIA", "zm", "TANZANIA", "tz", "UGANDA", "ug", "SOUTH_AFRICA", "za", "INTERNATIONAL", "int", "BRAZIL", "br", "MEXICO", "mx", "CAMEROON", "cm", "MOZAMBIQUE", "mz", "toString", "Companion", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum CountryCodeName {
    KENYA("ke"),
    NIGERIA("ng"),
    GHANA("gh"),
    ZAMBIA("zm"),
    TANZANIA("tz"),
    UGANDA("ug"),
    SOUTH_AFRICA("za"),
    INTERNATIONAL("int"),
    BRAZIL("br"),
    MEXICO("mx"),
    CAMEROON("cm"),
    MOZAMBIQUE("mz");

    private final String code;
    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007b\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sporty/android/core/model/service/CountryCodeName$Companion;", "", "<init>", "()V", "fromCode", "Lcom/sporty/android/core/model/service/CountryCodeName;", EventKeys.ERROR_CODE, "", "fromCodeNullable", "Lkotlin/jvm/JvmStatic;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CountryCodeName fromCode(String code) {
            code.getClass();
            CountryCodeName countryCodeNameFromCodeNullable = fromCodeNullable(code);
            if (countryCodeNameFromCodeNullable != null) {
                return countryCodeNameFromCodeNullable;
            }
            hb5.a(inm.a("Unknown country code: ", code));
            return null;
        }

        public final CountryCodeName fromCodeNullable(String code) {
            CountryCodeName next;
            code.getClass();
            Iterator<CountryCodeName> it = CountryCodeName.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (c.l(next.getCode(), code, true)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        private Companion() {
        }
    }

    CountryCodeName(String str) {
        this.code = str;
    }

    public static final CountryCodeName fromCodeNullable(String str) {
        return INSTANCE.fromCodeNullable(str);
    }

    public static tag<CountryCodeName> getEntries() {
        return $ENTRIES;
    }

    public final String getCode() {
        return this.code;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.code;
    }
}
