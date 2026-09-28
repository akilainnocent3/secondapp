package com.sporty.android.core.model.orders;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR)\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0004\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/orders/UserNoteDto;", "", "note", "", "isPublic", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getNote", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/sporty/android/core/model/orders/UserNoteDto;", "equals", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UserNoteDto {

    @SerializedName("isPublic")
    private final Boolean isPublic;

    @SerializedName("note")
    private final String note;

    public /* synthetic */ UserNoteDto(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
    }

    public static /* synthetic */ UserNoteDto copy$default(UserNoteDto userNoteDto, String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userNoteDto.note;
        }
        if ((i & 2) != 0) {
            bool = userNoteDto.isPublic;
        }
        return userNoteDto.copy(str, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsPublic() {
        return this.isPublic;
    }

    public final UserNoteDto copy(String note, Boolean isPublic) {
        return new UserNoteDto(note, isPublic);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserNoteDto)) {
            return false;
        }
        UserNoteDto userNoteDto = (UserNoteDto) other;
        return Intrinsics.g(this.note, userNoteDto.note) && Intrinsics.g(this.isPublic, userNoteDto.isPublic);
    }

    public final String getNote() {
        return this.note;
    }

    public int hashCode() {
        String str = this.note;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isPublic;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isPublic() {
        return this.isPublic;
    }

    public String toString() {
        return "UserNoteDto(note=" + this.note + ", isPublic=" + this.isPublic + ")";
    }

    public UserNoteDto(String str, Boolean bool) {
        this.note = str;
        this.isPublic = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserNoteDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
