package com.sportybet.android.globalpay.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/sportybet/android/globalpay/data/CPFStatus;", "", "<init>", "(Ljava/lang/String;I)V", "VALID", "INVALID", "Companion", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum CPFStatus {
    VALID,
    INVALID;

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\n"}, d2 = {"Lcom/sportybet/android/globalpay/data/CPFStatus$Companion;", "", "<init>", "()V", "from", "Lcom/sportybet/android/globalpay/data/CPFStatus;", AnalyticsParam.EVENT_STATUS, "", "isValid", "", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CPFStatus.values().length];
                try {
                    iArr[CPFStatus.VALID.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CPFStatus from(String status) {
            if (Intrinsics.g(status, "VALID")) {
                return CPFStatus.VALID;
            }
            return Intrinsics.g(status, "INVALID") ? CPFStatus.INVALID : CPFStatus.INVALID;
        }

        public final boolean isValid(String status) {
            return WhenMappings.$EnumSwitchMapping$0[from(status).ordinal()] == 1;
        }

        private Companion() {
        }
    }

    public static tag<CPFStatus> getEntries() {
        return $ENTRIES;
    }
}
