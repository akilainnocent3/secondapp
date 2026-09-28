package com.sporty.android.core.model.bookingcode;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bÊ\u0001\u0002\b\u0017¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/bookingcode/EventSourceDto;", "", "preMatchSource", "Lcom/sporty/android/core/model/bookingcode/SourceDto;", "liveSource", "<init>", "(Lcom/sporty/android/core/model/bookingcode/SourceDto;Lcom/sporty/android/core/model/bookingcode/SourceDto;)V", "getPreMatchSource", "()Lcom/sporty/android/core/model/bookingcode/SourceDto;", "Lcom/google/gson/annotations/SerializedName;", "value", "getLiveSource", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EventSourceDto {

    @SerializedName("liveSource")
    private final SourceDto liveSource;

    @SerializedName("preMatchSource")
    private final SourceDto preMatchSource;

    public /* synthetic */ EventSourceDto(SourceDto sourceDto, SourceDto sourceDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sourceDto, (i & 2) != 0 ? null : sourceDto2);
    }

    public static /* synthetic */ EventSourceDto copy$default(EventSourceDto eventSourceDto, SourceDto sourceDto, SourceDto sourceDto2, int i, Object obj) {
        if ((i & 1) != 0) {
            sourceDto = eventSourceDto.preMatchSource;
        }
        if ((i & 2) != 0) {
            sourceDto2 = eventSourceDto.liveSource;
        }
        return eventSourceDto.copy(sourceDto, sourceDto2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SourceDto getPreMatchSource() {
        return this.preMatchSource;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SourceDto getLiveSource() {
        return this.liveSource;
    }

    public final EventSourceDto copy(SourceDto preMatchSource, SourceDto liveSource) {
        return new EventSourceDto(preMatchSource, liveSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventSourceDto)) {
            return false;
        }
        EventSourceDto eventSourceDto = (EventSourceDto) other;
        return Intrinsics.g(this.preMatchSource, eventSourceDto.preMatchSource) && Intrinsics.g(this.liveSource, eventSourceDto.liveSource);
    }

    public final SourceDto getLiveSource() {
        return this.liveSource;
    }

    public final SourceDto getPreMatchSource() {
        return this.preMatchSource;
    }

    public int hashCode() {
        SourceDto sourceDto = this.preMatchSource;
        int iHashCode = (sourceDto == null ? 0 : sourceDto.hashCode()) * 31;
        SourceDto sourceDto2 = this.liveSource;
        return iHashCode + (sourceDto2 != null ? sourceDto2.hashCode() : 0);
    }

    public String toString() {
        return "EventSourceDto(preMatchSource=" + this.preMatchSource + ", liveSource=" + this.liveSource + ")";
    }

    public EventSourceDto(SourceDto sourceDto, SourceDto sourceDto2) {
        this.preMatchSource = sourceDto;
        this.liveSource = sourceDto2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventSourceDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
