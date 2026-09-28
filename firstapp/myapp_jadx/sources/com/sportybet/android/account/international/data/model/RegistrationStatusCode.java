package com.sportybet.android.account.international.data.model;

import com.twilio.voice.EventKeys;
import defpackage.om2;
import defpackage.tag;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/sportybet/android/account/international/data/model/RegistrationStatusCode;", "", EventKeys.ERROR_CODE, "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "UNREGISTERED", "PENDING_EMAIL_VERIFICATION", "PENDING_PHONE_VERIFICATION", "PENDING_FACIAL_RECOGNITION", "EMAIL_REGISTERED", "CPF_REGISTERED", "EMAIL_UPDATED", "UNKNOWN", "Companion", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum RegistrationStatusCode {
    UNREGISTERED(1),
    PENDING_EMAIL_VERIFICATION(2),
    PENDING_PHONE_VERIFICATION(3),
    PENDING_FACIAL_RECOGNITION(4),
    EMAIL_REGISTERED(5),
    CPF_REGISTERED(6),
    EMAIL_UPDATED(7),
    UNKNOWN(Integer.MIN_VALUE);

    private final int code;
    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/sportybet/android/account/international/data/model/RegistrationStatusCode$Companion;", "", "<init>", "()V", "fromCode", "Lcom/sportybet/android/account/international/data/model/RegistrationStatusCode;", EventKeys.ERROR_CODE, "", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RegistrationStatusCode fromCode(int code) {
            RegistrationStatusCode next;
            Iterator<RegistrationStatusCode> it = RegistrationStatusCode.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.getCode() != code);
            RegistrationStatusCode registrationStatusCode = next;
            return registrationStatusCode == null ? RegistrationStatusCode.UNKNOWN : registrationStatusCode;
        }

        private Companion() {
        }
    }

    RegistrationStatusCode(int i) {
        this.code = i;
    }

    public static tag<RegistrationStatusCode> getEntries() {
        return $ENTRIES;
    }

    public final int getCode() {
        return this.code;
    }
}
