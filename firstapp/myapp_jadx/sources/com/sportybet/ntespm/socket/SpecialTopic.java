package com.sportybet.ntespm.socket;

import defpackage.d830;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u00020\u0003H\u0096\u0080\u0004Ê\u0001\f\b\b\u0012\b\b\t\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0007"}, d2 = {"Lcom/sportybet/ntespm/socket/SpecialTopic;", "Lcom/sportybet/ntespm/socket/Topic;", "topic", "", "<init>", "(Ljava/lang/String;)V", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SpecialTopic extends Topic {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecialTopic(String str) {
        super(str, 2);
        str.getClass();
    }

    @Override // com.sportybet.ntespm.socket.Topic
    public String toString() {
        return d830.a(this.type, "SpecialTopic{topic='", this.topic, "', type=", "}");
    }
}
