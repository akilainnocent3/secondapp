package com.sporty.android.core.model.security.sportypin;

import defpackage.om2;
import defpackage.tag;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/sporty/android/core/model/security/sportypin/SportyPinStatus;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Enabled", "Blocked", "Disabled", "Companion", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum SportyPinStatus {
    Enabled("ENABLED"),
    Blocked("BLOCKED"),
    Disabled("DISABLED");

    private final String value;
    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/core/model/security/sportypin/SportyPinStatus$Companion;", "", "<init>", "()V", "fromValue", "Lcom/sporty/android/core/model/security/sportypin/SportyPinStatus;", "value", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SportyPinStatus fromValue(String value) {
            SportyPinStatus next;
            value.getClass();
            Iterator<SportyPinStatus> it = SportyPinStatus.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(next.getValue(), value));
            SportyPinStatus sportyPinStatus = next;
            return sportyPinStatus == null ? SportyPinStatus.Disabled : sportyPinStatus;
        }

        private Companion() {
        }
    }

    SportyPinStatus(String str) {
        this.value = str;
    }

    public static tag<SportyPinStatus> getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
