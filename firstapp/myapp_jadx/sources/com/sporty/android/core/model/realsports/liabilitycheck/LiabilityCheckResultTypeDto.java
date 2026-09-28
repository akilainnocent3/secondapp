package com.sporty.android.core.model.realsports.liabilitycheck;

import defpackage.om2;
import defpackage.tag;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0010\b\b\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000bj\u0010\b\f\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\rj\u0010\b\u000e\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000fj\u0010\b\u0010\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/core/model/realsports/liabilitycheck/LiabilityCheckResultTypeDto;", "", "typeId", "", "<init>", "(Ljava/lang/String;II)V", "getTypeId", "()I", "ACCEPT", "Lcom/google/gson/annotations/SerializedName;", "value", "0", "REJECTED_BY_MARKET_LIABILITY", "1", "REJECTED_BY_BET_LIABILITY", "2", "REJECTED_BY_BOOKING_CODE_LIABILITY", "3", "UNKNOWN", "Companion", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum LiabilityCheckResultTypeDto {
    ACCEPT(0),
    REJECTED_BY_MARKET_LIABILITY(1),
    REJECTED_BY_BET_LIABILITY(2),
    REJECTED_BY_BOOKING_CODE_LIABILITY(3),
    UNKNOWN(-1);

    private final int typeId;
    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/sporty/android/core/model/realsports/liabilitycheck/LiabilityCheckResultTypeDto$Companion;", "", "<init>", "()V", "fromValue", "Lcom/sporty/android/core/model/realsports/liabilitycheck/LiabilityCheckResultTypeDto;", "value", "", "(Ljava/lang/Integer;)Lcom/sporty/android/core/model/realsports/liabilitycheck/LiabilityCheckResultTypeDto;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LiabilityCheckResultTypeDto fromValue(Integer value) {
            LiabilityCheckResultTypeDto next;
            Iterator<LiabilityCheckResultTypeDto> it = LiabilityCheckResultTypeDto.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int typeId = next.getTypeId();
                if (value != null && typeId == value.intValue()) {
                    break;
                }
            }
            LiabilityCheckResultTypeDto liabilityCheckResultTypeDto = next;
            return liabilityCheckResultTypeDto == null ? LiabilityCheckResultTypeDto.UNKNOWN : liabilityCheckResultTypeDto;
        }

        private Companion() {
        }
    }

    LiabilityCheckResultTypeDto(int i) {
        this.typeId = i;
    }

    public static tag<LiabilityCheckResultTypeDto> getEntries() {
        return $ENTRIES;
    }

    public final int getTypeId() {
        return this.typeId;
    }
}
