package com.sporty.android.chat.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/sporty/android/chat/data/SocketStatus;", "", "type", "Lcom/sporty/android/chat/data/SocketStatusTypeEnum;", AnalyticsParam.EVENT_PARAM_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Lcom/sporty/android/chat/data/SocketStatusTypeEnum;Ljava/lang/Exception;)V", "getType", "()Lcom/sporty/android/chat/data/SocketStatusTypeEnum;", "getException", "()Ljava/lang/Exception;", "sportychat"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SocketStatus {
    private final Exception exception;
    private final SocketStatusTypeEnum type;

    public SocketStatus(SocketStatusTypeEnum socketStatusTypeEnum, Exception exc) {
        socketStatusTypeEnum.getClass();
        this.type = socketStatusTypeEnum;
        this.exception = exc;
    }

    public final Exception getException() {
        return this.exception;
    }

    public final SocketStatusTypeEnum getType() {
        return this.type;
    }

    public /* synthetic */ SocketStatus(SocketStatusTypeEnum socketStatusTypeEnum, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(socketStatusTypeEnum, (i & 2) != 0 ? null : exc);
    }
}
