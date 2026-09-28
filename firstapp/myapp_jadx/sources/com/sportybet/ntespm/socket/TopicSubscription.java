package com.sportybet.ntespm.socket;

import defpackage.gpp;
import defpackage.ml5;
import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nÊ\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0018"}, d2 = {"Lcom/sportybet/ntespm/socket/TopicSubscription;", "", "topic", "", "type", "", "accountId", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTopic", "()Ljava/lang/String;", "getType", "()I", "getAccountId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TopicSubscription {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String accountId;
    private final String topic;
    private final int type;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/sportybet/ntespm/socket/TopicSubscription$Companion;", "", "<init>", "()V", "from", "Lcom/sportybet/ntespm/socket/TopicSubscription;", "topic", "Lcom/sportybet/ntespm/socket/Topic;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TopicSubscription from(Topic topic) {
            topic.getClass();
            String str = topic.topic;
            str.getClass();
            int i = topic.type;
            MultiTopic multiTopic = topic instanceof MultiTopic ? (MultiTopic) topic : null;
            return new TopicSubscription(str, i, multiTopic != null ? multiTopic.getAccountId() : null);
        }

        private Companion() {
        }
    }

    public TopicSubscription(String str, int i, String str2) {
        str.getClass();
        this.topic = str;
        this.type = i;
        this.accountId = str2;
    }

    public static /* synthetic */ TopicSubscription copy$default(TopicSubscription topicSubscription, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = topicSubscription.topic;
        }
        if ((i2 & 2) != 0) {
            i = topicSubscription.type;
        }
        if ((i2 & 4) != 0) {
            str2 = topicSubscription.accountId;
        }
        return topicSubscription.copy(str, i, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    public final TopicSubscription copy(String topic, int type, String accountId) {
        topic.getClass();
        return new TopicSubscription(topic, type, accountId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopicSubscription)) {
            return false;
        }
        TopicSubscription topicSubscription = (TopicSubscription) other;
        return Intrinsics.g(this.topic, topicSubscription.topic) && this.type == topicSubscription.type && Intrinsics.g(this.accountId, topicSubscription.accountId);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getTopic() {
        return this.topic;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iA = gpp.a(this.type, this.topic.hashCode() * 31, 31);
        String str = this.accountId;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.topic;
        int i = this.type;
        return uf80.a(ml5.a(i, "TopicSubscription(topic=", str, ", type=", ", accountId="), this.accountId, ")");
    }

    public /* synthetic */ TopicSubscription(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? null : str2);
    }
}
