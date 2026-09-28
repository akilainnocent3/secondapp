package com.sporty.android.chat.data;

import com.appsflyer.internal.l;
import com.google.gson.annotations.SerializedName;
import defpackage.f87;
import defpackage.g41;
import defpackage.gmf0;
import defpackage.uqe0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0014\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010%\u001a\u00020\u0005HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R%\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R%\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R%\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R%\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014¨\u0006&"}, d2 = {"Lcom/sporty/android/chat/data/DefaultCommand;", "", "msgType", "", "userId", "", "messageNo", "", "previousMessageNo", "jsonBody", "createTime", "<init>", "(ILjava/lang/String;JJLjava/lang/String;J)V", "getMsgType", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getUserId", "()Ljava/lang/String;", "getMessageNo", "()J", "getPreviousMessageNo", "getJsonBody", "getCreateTime", "getMessageType", "Lcom/sporty/android/chat/data/MsgType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "sportychat"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DefaultCommand {

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("jsonBody")
    private final String jsonBody;

    @SerializedName("messageNo")
    private final long messageNo;

    @SerializedName("msgType")
    private final int msgType;

    @SerializedName("previousMessageNo")
    private final long previousMessageNo;

    @SerializedName("userId")
    private final String userId;

    public DefaultCommand(int i, String str, long j, long j2, String str2, long j3) {
        str.getClass();
        str2.getClass();
        this.msgType = i;
        this.userId = str;
        this.messageNo = j;
        this.previousMessageNo = j2;
        this.jsonBody = str2;
        this.createTime = j3;
    }

    public static /* synthetic */ DefaultCommand copy$default(DefaultCommand defaultCommand, int i, String str, long j, long j2, String str2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = defaultCommand.msgType;
        }
        if ((i2 & 2) != 0) {
            str = defaultCommand.userId;
        }
        if ((i2 & 4) != 0) {
            j = defaultCommand.messageNo;
        }
        if ((i2 & 8) != 0) {
            j2 = defaultCommand.previousMessageNo;
        }
        if ((i2 & 16) != 0) {
            str2 = defaultCommand.jsonBody;
        }
        if ((i2 & 32) != 0) {
            j3 = defaultCommand.createTime;
        }
        String str3 = str2;
        long j4 = j2;
        long j5 = j;
        return defaultCommand.copy(i, str, j5, j4, str3, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMsgType() {
        return this.msgType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getMessageNo() {
        return this.messageNo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPreviousMessageNo() {
        return this.previousMessageNo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getJsonBody() {
        return this.jsonBody;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final DefaultCommand copy(int msgType, String userId, long messageNo, long previousMessageNo, String jsonBody, long createTime) {
        userId.getClass();
        jsonBody.getClass();
        return new DefaultCommand(msgType, userId, messageNo, previousMessageNo, jsonBody, createTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultCommand)) {
            return false;
        }
        DefaultCommand defaultCommand = (DefaultCommand) other;
        return this.msgType == defaultCommand.msgType && Intrinsics.g(this.userId, defaultCommand.userId) && this.messageNo == defaultCommand.messageNo && this.previousMessageNo == defaultCommand.previousMessageNo && Intrinsics.g(this.jsonBody, defaultCommand.jsonBody) && this.createTime == defaultCommand.createTime;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getJsonBody() {
        return this.jsonBody;
    }

    public final long getMessageNo() {
        return this.messageNo;
    }

    public final MsgType getMessageType() {
        return MsgType.INSTANCE.fromType(this.msgType);
    }

    public final int getMsgType() {
        return this.msgType;
    }

    public final long getPreviousMessageNo() {
        return this.previousMessageNo;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Long.hashCode(this.createTime) + gmf0.a(f87.a(f87.a(gmf0.a(Integer.hashCode(this.msgType) * 31, 31, this.userId), this.messageNo, 31), this.previousMessageNo, 31), 31, this.jsonBody);
    }

    public String toString() {
        int i = this.msgType;
        String str = this.userId;
        long j = this.messageNo;
        long j2 = this.previousMessageNo;
        String str2 = this.jsonBody;
        long j3 = this.createTime;
        StringBuilder sbA = uqe0.a(i, "DefaultCommand(msgType=", ", userId=", str, ", messageNo=");
        sbA.append(j);
        g41.a(j2, ", previousMessageNo=", ", jsonBody=", sbA);
        l.a(j3, str2, ", createTime=", sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
