package com.sporty.android.chat.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.cv7;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jt\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010*J\u0014\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010.\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 Ê\u0001\u0002\b1¨\u00060"}, d2 = {"Lcom/sporty/android/chat/data/CodeChatChatItemDto;", "", "orderId", "", "shareCode", AnalyticsParam.EVENT_STATUS, "", "participants", "createTime", "", "selections", "", "Lcom/sporty/android/chat/data/CodeChatSelectionDto;", "potentialWinnings", "codeChatSummary", "Lcom/sporty/android/chat/data/CodeChatSummaryDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Lcom/sporty/android/chat/data/CodeChatSummaryDto;)V", "getOrderId", "()Ljava/lang/String;", "getShareCode", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getParticipants", "getCreateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSelections", "()Ljava/util/List;", "getPotentialWinnings", "getCodeChatSummary", "()Lcom/sporty/android/chat/data/CodeChatSummaryDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;Lcom/sporty/android/chat/data/CodeChatSummaryDto;)Lcom/sporty/android/chat/data/CodeChatChatItemDto;", "equals", "", "other", "hashCode", "toString", "sportychat", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CodeChatChatItemDto {
    private final CodeChatSummaryDto codeChatSummary;
    private final Long createTime;
    private final String orderId;
    private final Integer participants;
    private final String potentialWinnings;
    private final List<CodeChatSelectionDto> selections;
    private final String shareCode;
    private final Integer status;

    public /* synthetic */ CodeChatChatItemDto(String str, String str2, Integer num, Integer num2, Long l, List list, String str3, CodeChatSummaryDto codeChatSummaryDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : codeChatSummaryDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CodeChatChatItemDto copy$default(CodeChatChatItemDto codeChatChatItemDto, String str, String str2, Integer num, Integer num2, Long l, List list, String str3, CodeChatSummaryDto codeChatSummaryDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeChatChatItemDto.orderId;
        }
        if ((i & 2) != 0) {
            str2 = codeChatChatItemDto.shareCode;
        }
        if ((i & 4) != 0) {
            num = codeChatChatItemDto.status;
        }
        if ((i & 8) != 0) {
            num2 = codeChatChatItemDto.participants;
        }
        if ((i & 16) != 0) {
            l = codeChatChatItemDto.createTime;
        }
        if ((i & 32) != 0) {
            list = codeChatChatItemDto.selections;
        }
        if ((i & 64) != 0) {
            str3 = codeChatChatItemDto.potentialWinnings;
        }
        if ((i & 128) != 0) {
            codeChatSummaryDto = codeChatChatItemDto.codeChatSummary;
        }
        String str4 = str3;
        CodeChatSummaryDto codeChatSummaryDto2 = codeChatSummaryDto;
        Long l2 = l;
        List list2 = list;
        return codeChatChatItemDto.copy(str, str2, num, num2, l2, list2, str4, codeChatSummaryDto2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShareCode() {
        return this.shareCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getParticipants() {
        return this.participants;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getCreateTime() {
        return this.createTime;
    }

    public final List<CodeChatSelectionDto> component6() {
        return this.selections;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPotentialWinnings() {
        return this.potentialWinnings;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final CodeChatSummaryDto getCodeChatSummary() {
        return this.codeChatSummary;
    }

    public final CodeChatChatItemDto copy(String orderId, String shareCode, Integer status, Integer participants, Long createTime, List<CodeChatSelectionDto> selections, String potentialWinnings, CodeChatSummaryDto codeChatSummary) {
        return new CodeChatChatItemDto(orderId, shareCode, status, participants, createTime, selections, potentialWinnings, codeChatSummary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeChatChatItemDto)) {
            return false;
        }
        CodeChatChatItemDto codeChatChatItemDto = (CodeChatChatItemDto) other;
        return Intrinsics.g(this.orderId, codeChatChatItemDto.orderId) && Intrinsics.g(this.shareCode, codeChatChatItemDto.shareCode) && Intrinsics.g(this.status, codeChatChatItemDto.status) && Intrinsics.g(this.participants, codeChatChatItemDto.participants) && Intrinsics.g(this.createTime, codeChatChatItemDto.createTime) && Intrinsics.g(this.selections, codeChatChatItemDto.selections) && Intrinsics.g(this.potentialWinnings, codeChatChatItemDto.potentialWinnings) && Intrinsics.g(this.codeChatSummary, codeChatChatItemDto.codeChatSummary);
    }

    public final CodeChatSummaryDto getCodeChatSummary() {
        return this.codeChatSummary;
    }

    public final Long getCreateTime() {
        return this.createTime;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final Integer getParticipants() {
        return this.participants;
    }

    public final String getPotentialWinnings() {
        return this.potentialWinnings;
    }

    public final List<CodeChatSelectionDto> getSelections() {
        return this.selections;
    }

    public final String getShareCode() {
        return this.shareCode;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.orderId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shareCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.status;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.participants;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.createTime;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        List<CodeChatSelectionDto> list = this.selections;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.potentialWinnings;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        CodeChatSummaryDto codeChatSummaryDto = this.codeChatSummary;
        return iHashCode7 + (codeChatSummaryDto != null ? codeChatSummaryDto.hashCode() : 0);
    }

    public String toString() {
        String str = this.orderId;
        String str2 = this.shareCode;
        Integer num = this.status;
        Integer num2 = this.participants;
        Long l = this.createTime;
        List<CodeChatSelectionDto> list = this.selections;
        String str3 = this.potentialWinnings;
        CodeChatSummaryDto codeChatSummaryDto = this.codeChatSummary;
        StringBuilder sbA = ux5.a("CodeChatChatItemDto(orderId=", str, ", shareCode=", str2, ", status=");
        cv7.a(sbA, num, ", participants=", num2, ", createTime=");
        sbA.append(l);
        sbA.append(", selections=");
        sbA.append(list);
        sbA.append(", potentialWinnings=");
        sbA.append(str3);
        sbA.append(", codeChatSummary=");
        sbA.append(codeChatSummaryDto);
        sbA.append(")");
        return sbA.toString();
    }

    public CodeChatChatItemDto(String str, String str2, Integer num, Integer num2, Long l, List<CodeChatSelectionDto> list, String str3, CodeChatSummaryDto codeChatSummaryDto) {
        this.orderId = str;
        this.shareCode = str2;
        this.status = num;
        this.participants = num2;
        this.createTime = l;
        this.selections = list;
        this.potentialWinnings = str3;
        this.codeChatSummary = codeChatSummaryDto;
    }

    public CodeChatChatItemDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
