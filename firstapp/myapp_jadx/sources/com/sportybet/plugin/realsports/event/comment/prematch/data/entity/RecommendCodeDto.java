package com.sportybet.plugin.realsports.event.comment.prematch.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.sportybet.plugin.realsports.data.Event;
import defpackage.nf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010Ê\u0001\u0002\b\"Ê\u0001\u0002\b#Ê\u0001\f\b$\u0012\b\b%\u0012\u0004\b\u0003\u0010\u0000¨\u0006!"}, d2 = {"Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/RecommendCodeDto;", "Landroid/os/Parcelable;", "shareCode", "", "outcomes", "", "Lcom/sportybet/plugin/realsports/data/Event;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getShareCode", "()Ljava/lang/String;", "setShareCode", "(Ljava/lang/String;)V", "getOutcomes", "()Ljava/util/List;", "setOutcomes", "(Ljava/util/List;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "africa-bet-android", "Landroidx/annotation/Keep;", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RecommendCodeDto implements Parcelable {
    private List<? extends Event> outcomes;
    private String shareCode;
    public static final Parcelable.Creator<RecommendCodeDto> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RecommendCodeDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendCodeDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(parcel.readParcelable(RecommendCodeDto.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new RecommendCodeDto(string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendCodeDto[] newArray(int i) {
            return new RecommendCodeDto[i];
        }
    }

    public /* synthetic */ RecommendCodeDto(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendCodeDto copy$default(RecommendCodeDto recommendCodeDto, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recommendCodeDto.shareCode;
        }
        if ((i & 2) != 0) {
            list = recommendCodeDto.outcomes;
        }
        return recommendCodeDto.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShareCode() {
        return this.shareCode;
    }

    public final List<Event> component2() {
        return this.outcomes;
    }

    public final RecommendCodeDto copy(String shareCode, List<? extends Event> outcomes) {
        return new RecommendCodeDto(shareCode, outcomes);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendCodeDto)) {
            return false;
        }
        RecommendCodeDto recommendCodeDto = (RecommendCodeDto) other;
        return Intrinsics.g(this.shareCode, recommendCodeDto.shareCode) && Intrinsics.g(this.outcomes, recommendCodeDto.outcomes);
    }

    public final List<Event> getOutcomes() {
        return this.outcomes;
    }

    public final String getShareCode() {
        return this.shareCode;
    }

    public int hashCode() {
        String str = this.shareCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<? extends Event> list = this.outcomes;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setOutcomes(List<? extends Event> list) {
        this.outcomes = list;
    }

    public final void setShareCode(String str) {
        this.shareCode = str;
    }

    public String toString() {
        return nf.b("RecommendCodeDto(shareCode=", this.shareCode, ", outcomes=", ")", this.outcomes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.shareCode);
        List<? extends Event> list = this.outcomes;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<? extends Event> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
    }

    public RecommendCodeDto(String str, List<? extends Event> list) {
        this.shareCode = str;
        this.outcomes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendCodeDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
