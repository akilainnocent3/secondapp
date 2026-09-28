package com.sportybet.ntespm.socket;

import android.text.TextUtils;
import defpackage.rr1;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Topic {
    public static final int TYPE_GROUP = 1;
    public static final int TYPE_MULTI = 3;
    public static final int TYPE_SPECIAL = 2;
    protected final String topic;
    private final String[] topicParts;
    protected final int type;

    public Topic(String str, int i) {
        this.topic = str;
        this.type = i;
        this.topicParts = str.split("\\^");
    }

    private boolean compareArray(String[] strArr, String[] strArr2) {
        if (strArr.length != strArr2.length) {
            return false;
        }
        for (int length = strArr.length - 1; length >= 0; length--) {
            if (!"~".equals(strArr[length]) && !"~".equals(strArr2[length]) && !strArr[length].equals(strArr2[length])) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Topic) {
            Topic topic = (Topic) obj;
            if (TextUtils.equals(this.topic, topic.topic) && this.type == topic.type) {
                return true;
            }
        }
        return false;
    }

    public String getTopic() {
        return this.topic;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.topic;
        return (this.type * 31) ^ (str == null ? 17 : str.hashCode());
    }

    public boolean match(Topic topic) {
        return topic != null && this.type == topic.type && compareArray(this.topicParts, topic.topicParts);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Topic{topic='");
        sb.append(this.topic);
        sb.append("', type=");
        return rr1.b(sb, this.type, '}');
    }
}
