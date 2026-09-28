package com.sportybet.plugin.realsports.data;

import defpackage.d830;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/sportybet/plugin/realsports/data/SelectionResult;", "", "type", "", "data", "Lcom/sportybet/plugin/realsports/data/SelectionResult$SelectionResultData;", "<init>", "(Ljava/lang/String;Lcom/sportybet/plugin/realsports/data/SelectionResult$SelectionResultData;)V", "getType", "()Ljava/lang/String;", "getData", "()Lcom/sportybet/plugin/realsports/data/SelectionResult$SelectionResultData;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "SelectionResultData", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SelectionResult {
    public static final int $stable = 0;
    private final SelectionResultData data;
    private final String type;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0014"}, d2 = {"Lcom/sportybet/plugin/realsports/data/SelectionResult$SelectionResultData;", "", "selectionId", "", "selectionStatus", "", "<init>", "(Ljava/lang/String;I)V", "getSelectionId", "()Ljava/lang/String;", "getSelectionStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class SelectionResultData {
        public static final int $stable = 0;
        private final String selectionId;
        private final int selectionStatus;

        public SelectionResultData(String str, int i) {
            str.getClass();
            this.selectionId = str;
            this.selectionStatus = i;
        }

        public static /* synthetic */ SelectionResultData copy$default(SelectionResultData selectionResultData, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = selectionResultData.selectionId;
            }
            if ((i2 & 2) != 0) {
                i = selectionResultData.selectionStatus;
            }
            return selectionResultData.copy(str, i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSelectionId() {
            return this.selectionId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getSelectionStatus() {
            return this.selectionStatus;
        }

        public final SelectionResultData copy(String selectionId, int selectionStatus) {
            selectionId.getClass();
            return new SelectionResultData(selectionId, selectionStatus);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectionResultData)) {
                return false;
            }
            SelectionResultData selectionResultData = (SelectionResultData) other;
            return Intrinsics.g(this.selectionId, selectionResultData.selectionId) && this.selectionStatus == selectionResultData.selectionStatus;
        }

        public final String getSelectionId() {
            return this.selectionId;
        }

        public final int getSelectionStatus() {
            return this.selectionStatus;
        }

        public int hashCode() {
            return Integer.hashCode(this.selectionStatus) + (this.selectionId.hashCode() * 31);
        }

        public String toString() {
            return d830.a(this.selectionStatus, "SelectionResultData(selectionId=", this.selectionId, ", selectionStatus=", ")");
        }
    }

    public SelectionResult(String str, SelectionResultData selectionResultData) {
        str.getClass();
        selectionResultData.getClass();
        this.type = str;
        this.data = selectionResultData;
    }

    public static /* synthetic */ SelectionResult copy$default(SelectionResult selectionResult, String str, SelectionResultData selectionResultData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = selectionResult.type;
        }
        if ((i & 2) != 0) {
            selectionResultData = selectionResult.data;
        }
        return selectionResult.copy(str, selectionResultData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SelectionResultData getData() {
        return this.data;
    }

    public final SelectionResult copy(String type, SelectionResultData data) {
        type.getClass();
        data.getClass();
        return new SelectionResult(type, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionResult)) {
            return false;
        }
        SelectionResult selectionResult = (SelectionResult) other;
        return Intrinsics.g(this.type, selectionResult.type) && Intrinsics.g(this.data, selectionResult.data);
    }

    public final SelectionResultData getData() {
        return this.data;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.data.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        return "SelectionResult(type=" + this.type + ", data=" + this.data + ")";
    }
}
