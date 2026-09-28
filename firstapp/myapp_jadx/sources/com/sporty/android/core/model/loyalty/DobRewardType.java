package com.sporty.android.core.model.loyalty;

import defpackage.om2;
import defpackage.tag;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/sporty/android/core/model/loyalty/DobRewardType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Unknown", "DobVerifiedGift", "BirthdayGift", "Companion", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum DobRewardType {
    Unknown(0),
    DobVerifiedGift(1),
    BirthdayGift(2);

    private final int value;
    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/sporty/android/core/model/loyalty/DobRewardType$Companion;", "", "<init>", "()V", "fromInt", "Lcom/sporty/android/core/model/loyalty/DobRewardType;", "value", "", "(Ljava/lang/Integer;)Lcom/sporty/android/core/model/loyalty/DobRewardType;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DobRewardType fromInt(Integer value) {
            DobRewardType next;
            Iterator<DobRewardType> it = DobRewardType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                int value2 = next.getValue();
                if (value != null && value2 == value.intValue()) {
                    break;
                }
            }
            DobRewardType dobRewardType = next;
            return dobRewardType == null ? DobRewardType.Unknown : dobRewardType;
        }

        private Companion() {
        }
    }

    DobRewardType(int i) {
        this.value = i;
    }

    public static tag<DobRewardType> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
