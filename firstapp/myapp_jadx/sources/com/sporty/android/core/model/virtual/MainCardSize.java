package com.sporty.android.core.model.virtual;

import defpackage.om2;
import defpackage.tag;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\fj\u0002\b\bj\u0002\b\tÊ\u0001\u0002\b\u0010¨\u0006\u000f"}, d2 = {"Lcom/sporty/android/core/model/virtual/MainCardSize;", "", "size", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getSize", "()Ljava/lang/String;", "LARGE", "SMALL", "isLarge", "", "()Z", "isSmall", "Companion", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum MainCardSize {
    LARGE("Large"),
    SMALL("Small");

    private final String size;
    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0086\u0002¨\u0006\b"}, d2 = {"Lcom/sporty/android/core/model/virtual/MainCardSize$Companion;", "", "<init>", "()V", "invoke", "Lcom/sporty/android/core/model/virtual/MainCardSize;", "size", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MainCardSize invoke(String size) {
            MainCardSize next;
            Iterator<MainCardSize> it = MainCardSize.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!c.l(next.getSize(), size, true));
            MainCardSize mainCardSize = next;
            return mainCardSize == null ? MainCardSize.LARGE : mainCardSize;
        }

        private Companion() {
        }
    }

    MainCardSize(String str) {
        this.size = str;
    }

    public static tag<MainCardSize> getEntries() {
        return $ENTRIES;
    }

    public final String getSize() {
        return this.size;
    }

    public final boolean isLarge() {
        return this == LARGE;
    }

    public final boolean isSmall() {
        return this == SMALL;
    }
}
