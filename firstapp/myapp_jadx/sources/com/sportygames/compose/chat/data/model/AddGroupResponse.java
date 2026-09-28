package com.sportygames.compose.chat.data.model;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.gpp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JP\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/sportygames/compose/chat/data/model/AddGroupResponse;", "", AnalyticsParam.EVENT_PARAM_ID, "", "chatRoomId", "", "chatRoomType", "name", "lastMessageNo", "nickNameAvailable", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;)V", "getId", "()I", "getChatRoomId", "()Ljava/lang/String;", "getChatRoomType", "getName", "getLastMessageNo", "getNickNameAvailable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;)Lcom/sportygames/compose/chat/data/model/AddGroupResponse;", "equals", "other", "hashCode", "toString", "compose-chat_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddGroupResponse {
    public static final int $stable = 0;
    private final String chatRoomId;
    private final String chatRoomType;
    private final int id;
    private final int lastMessageNo;
    private final String name;
    private final Boolean nickNameAvailable;

    public AddGroupResponse(int i, String str, String str2, String str3, int i2, Boolean bool) {
        str2.getClass();
        this.id = i;
        this.chatRoomId = str;
        this.chatRoomType = str2;
        this.name = str3;
        this.lastMessageNo = i2;
        this.nickNameAvailable = bool;
    }

    public static /* synthetic */ AddGroupResponse copy$default(AddGroupResponse addGroupResponse, int i, String str, String str2, String str3, int i2, Boolean bool, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = addGroupResponse.id;
        }
        if ((i3 & 2) != 0) {
            str = addGroupResponse.chatRoomId;
        }
        if ((i3 & 4) != 0) {
            str2 = addGroupResponse.chatRoomType;
        }
        if ((i3 & 8) != 0) {
            str3 = addGroupResponse.name;
        }
        if ((i3 & 16) != 0) {
            i2 = addGroupResponse.lastMessageNo;
        }
        if ((i3 & 32) != 0) {
            bool = addGroupResponse.nickNameAvailable;
        }
        int i4 = i2;
        Boolean bool2 = bool;
        return addGroupResponse.copy(i, str, str2, str3, i4, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChatRoomType() {
        return this.chatRoomType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLastMessageNo() {
        return this.lastMessageNo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getNickNameAvailable() {
        return this.nickNameAvailable;
    }

    public final AddGroupResponse copy(int id, String chatRoomId, String chatRoomType, String name, int lastMessageNo, Boolean nickNameAvailable) {
        chatRoomType.getClass();
        return new AddGroupResponse(id, chatRoomId, chatRoomType, name, lastMessageNo, nickNameAvailable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddGroupResponse)) {
            return false;
        }
        AddGroupResponse addGroupResponse = (AddGroupResponse) other;
        return this.id == addGroupResponse.id && Intrinsics.g(this.chatRoomId, addGroupResponse.chatRoomId) && Intrinsics.g(this.chatRoomType, addGroupResponse.chatRoomType) && Intrinsics.g(this.name, addGroupResponse.name) && this.lastMessageNo == addGroupResponse.lastMessageNo && Intrinsics.g(this.nickNameAvailable, addGroupResponse.nickNameAvailable);
    }

    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    public final String getChatRoomType() {
        return this.chatRoomType;
    }

    public final int getId() {
        return this.id;
    }

    public final int getLastMessageNo() {
        return this.lastMessageNo;
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean getNickNameAvailable() {
        return this.nickNameAvailable;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.chatRoomId;
        int iA = gmf0.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.chatRoomType);
        String str2 = this.name;
        int iA2 = gpp.a(this.lastMessageNo, (iA + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Boolean bool = this.nickNameAvailable;
        return iA2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "AddGroupResponse(id=" + this.id + ", chatRoomId=" + this.chatRoomId + ", chatRoomType=" + this.chatRoomType + ", name=" + this.name + ", lastMessageNo=" + this.lastMessageNo + ", nickNameAvailable=" + this.nickNameAvailable + ')';
    }
}
