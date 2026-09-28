package com.sporty.android.core.model.patron;

import defpackage.om2;
import defpackage.tag;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/sporty/android/core/model/patron/DocumentAuditStatus;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DRAFT", "SUBMITTED", "APPROVED", "REJECTED", "Companion", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum DocumentAuditStatus {
    DRAFT(10),
    SUBMITTED(20),
    APPROVED(30),
    REJECTED(40);

    private final int value;
    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007b\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sporty/android/core/model/patron/DocumentAuditStatus$Companion;", "", "<init>", "()V", "fromValue", "Lcom/sporty/android/core/model/patron/DocumentAuditStatus;", "value", "", "Lkotlin/jvm/JvmStatic;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DocumentAuditStatus fromValue(int value) {
            DocumentAuditStatus next;
            Iterator<DocumentAuditStatus> it = DocumentAuditStatus.getEntries().iterator();
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

    DocumentAuditStatus(int i) {
        this.value = i;
    }

    public static final DocumentAuditStatus fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static tag<DocumentAuditStatus> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
