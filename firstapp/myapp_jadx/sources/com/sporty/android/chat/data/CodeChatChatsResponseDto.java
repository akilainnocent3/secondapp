package com.sporty.android.chat.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003JD\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\u0002\b\u001f¨\u0006\u001e"}, d2 = {"Lcom/sporty/android/chat/data/CodeChatChatsResponseDto;", "", AnalyticsParam.MINI_GAMES_PAGE, "", "pageSize", "total", "items", "", "Lcom/sporty/android/chat/data/CodeChatChatItemDto;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPageSize", "getTotal", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/sporty/android/chat/data/CodeChatChatsResponseDto;", "equals", "", "other", "hashCode", "toString", "", "sportychat", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CodeChatChatsResponseDto {
    private final List<CodeChatChatItemDto> items;
    private final Integer page;
    private final Integer pageSize;
    private final Integer total;

    public /* synthetic */ CodeChatChatsResponseDto(Integer num, Integer num2, Integer num3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CodeChatChatsResponseDto copy$default(CodeChatChatsResponseDto codeChatChatsResponseDto, Integer num, Integer num2, Integer num3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = codeChatChatsResponseDto.page;
        }
        if ((i & 2) != 0) {
            num2 = codeChatChatsResponseDto.pageSize;
        }
        if ((i & 4) != 0) {
            num3 = codeChatChatsResponseDto.total;
        }
        if ((i & 8) != 0) {
            list = codeChatChatsResponseDto.items;
        }
        return codeChatChatsResponseDto.copy(num, num2, num3, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getPage() {
        return this.page;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTotal() {
        return this.total;
    }

    public final List<CodeChatChatItemDto> component4() {
        return this.items;
    }

    public final CodeChatChatsResponseDto copy(Integer page, Integer pageSize, Integer total, List<CodeChatChatItemDto> items) {
        return new CodeChatChatsResponseDto(page, pageSize, total, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CodeChatChatsResponseDto)) {
            return false;
        }
        CodeChatChatsResponseDto codeChatChatsResponseDto = (CodeChatChatsResponseDto) other;
        return Intrinsics.g(this.page, codeChatChatsResponseDto.page) && Intrinsics.g(this.pageSize, codeChatChatsResponseDto.pageSize) && Intrinsics.g(this.total, codeChatChatsResponseDto.total) && Intrinsics.g(this.items, codeChatChatsResponseDto.items);
    }

    public final List<CodeChatChatItemDto> getItems() {
        return this.items;
    }

    public final Integer getPage() {
        return this.page;
    }

    public final Integer getPageSize() {
        return this.pageSize;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public int hashCode() {
        Integer num = this.page;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.pageSize;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.total;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<CodeChatChatItemDto> list = this.items;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "CodeChatChatsResponseDto(page=" + this.page + ", pageSize=" + this.pageSize + ", total=" + this.total + ", items=" + this.items + ")";
    }

    public CodeChatChatsResponseDto(Integer num, Integer num2, Integer num3, List<CodeChatChatItemDto> list) {
        this.page = num;
        this.pageSize = num2;
        this.total = num3;
        this.items = list;
    }

    public CodeChatChatsResponseDto() {
        this(null, null, null, null, 15, null);
    }
}
