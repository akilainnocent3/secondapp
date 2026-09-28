package com.sporty.android.core.model;

import defpackage.om2;
import defpackage.tag;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/sporty/android/core/model/OrderBetType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ALL", "SINGLE", "MULTIPLE", "SYSTEM", "FLEX", "ONE_CUT", "ANY_WIN", "Companion", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum OrderBetType {
    ALL(0),
    SINGLE(1),
    MULTIPLE(2),
    SYSTEM(3),
    FLEX(4),
    ONE_CUT(5),
    ANY_WIN(6);

    private final int value;
    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007b\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sporty/android/core/model/OrderBetType$Companion;", "", "<init>", "()V", "fromValue", "Lcom/sporty/android/core/model/OrderBetType;", "value", "", "Lkotlin/jvm/JvmStatic;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OrderBetType fromValue(int value) {
            OrderBetType next;
            Iterator<OrderBetType> it = OrderBetType.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (next.getValue() == value) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        private Companion() {
        }
    }

    OrderBetType(int i) {
        this.value = i;
    }

    public static final OrderBetType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static tag<OrderBetType> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
