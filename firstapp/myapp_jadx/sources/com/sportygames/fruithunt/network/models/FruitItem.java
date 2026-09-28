package com.sportygames.fruithunt.network.models;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0014JD\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\t\u0010\u0014¨\u0006\""}, d2 = {"Lcom/sportygames/fruithunt/network/models/FruitItem;", "", "messageType", "", "timeStamp", "", "topicRecordVO", "", "Lcom/sportygames/fruithunt/network/models/FruitItem$FruitRecord;", "isBlocked", "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Boolean;)V", "getMessageType", "()Ljava/lang/String;", "getTimeStamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTopicRecordVO", "()Ljava/util/List;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Boolean;)Lcom/sportygames/fruithunt/network/models/FruitItem;", "equals", "other", "hashCode", "", "toString", "FruitRecord", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FruitItem {
    public static final int $stable = 8;
    private final Boolean isBlocked;
    private final String messageType;
    private final Long timeStamp;
    private final List<FruitRecord> topicRecordVO;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/sportygames/fruithunt/network/models/FruitItem$FruitRecord;", "", AnalyticsParam.EVENT_PARAM_ID, "", "fruitObj", "", "fruitSeconds", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFruitObj", "()Ljava/lang/String;", "getFruitSeconds", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)Lcom/sportygames/fruithunt/network/models/FruitItem$FruitRecord;", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FruitRecord {
        public static final int $stable = 0;
        private final String fruitObj;
        private final Long fruitSeconds;
        private final Long id;

        public FruitRecord(Long l, String str, Long l2) {
            this.id = l;
            this.fruitObj = str;
            this.fruitSeconds = l2;
        }

        public static /* synthetic */ FruitRecord copy$default(FruitRecord fruitRecord, Long l, String str, Long l2, int i, Object obj) {
            if ((i & 1) != 0) {
                l = fruitRecord.id;
            }
            if ((i & 2) != 0) {
                str = fruitRecord.fruitObj;
            }
            if ((i & 4) != 0) {
                l2 = fruitRecord.fruitSeconds;
            }
            return fruitRecord.copy(l, str, l2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Long getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFruitObj() {
            return this.fruitObj;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Long getFruitSeconds() {
            return this.fruitSeconds;
        }

        public final FruitRecord copy(Long id, String fruitObj, Long fruitSeconds) {
            return new FruitRecord(id, fruitObj, fruitSeconds);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FruitRecord)) {
                return false;
            }
            FruitRecord fruitRecord = (FruitRecord) other;
            return Intrinsics.g(this.id, fruitRecord.id) && Intrinsics.g(this.fruitObj, fruitRecord.fruitObj) && Intrinsics.g(this.fruitSeconds, fruitRecord.fruitSeconds);
        }

        public final String getFruitObj() {
            return this.fruitObj;
        }

        public final Long getFruitSeconds() {
            return this.fruitSeconds;
        }

        public final Long getId() {
            return this.id;
        }

        public int hashCode() {
            Long l = this.id;
            int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
            String str = this.fruitObj;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l2 = this.fruitSeconds;
            return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
        }

        public String toString() {
            return "FruitRecord(id=" + this.id + ", fruitObj=" + this.fruitObj + ", fruitSeconds=" + this.fruitSeconds + ")";
        }
    }

    public FruitItem(String str, Long l, List<FruitRecord> list, Boolean bool) {
        this.messageType = str;
        this.timeStamp = l;
        this.topicRecordVO = list;
        this.isBlocked = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FruitItem copy$default(FruitItem fruitItem, String str, Long l, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fruitItem.messageType;
        }
        if ((i & 2) != 0) {
            l = fruitItem.timeStamp;
        }
        if ((i & 4) != 0) {
            list = fruitItem.topicRecordVO;
        }
        if ((i & 8) != 0) {
            bool = fruitItem.isBlocked;
        }
        return fruitItem.copy(str, l, list, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    public final List<FruitRecord> component3() {
        return this.topicRecordVO;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsBlocked() {
        return this.isBlocked;
    }

    public final FruitItem copy(String messageType, Long timeStamp, List<FruitRecord> topicRecordVO, Boolean isBlocked) {
        return new FruitItem(messageType, timeStamp, topicRecordVO, isBlocked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FruitItem)) {
            return false;
        }
        FruitItem fruitItem = (FruitItem) other;
        return Intrinsics.g(this.messageType, fruitItem.messageType) && Intrinsics.g(this.timeStamp, fruitItem.timeStamp) && Intrinsics.g(this.topicRecordVO, fruitItem.topicRecordVO) && Intrinsics.g(this.isBlocked, fruitItem.isBlocked);
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    public final List<FruitRecord> getTopicRecordVO() {
        return this.topicRecordVO;
    }

    public int hashCode() {
        String str = this.messageType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.timeStamp;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        List<FruitRecord> list = this.topicRecordVO;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isBlocked;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isBlocked() {
        return this.isBlocked;
    }

    public String toString() {
        return "FruitItem(messageType=" + this.messageType + ", timeStamp=" + this.timeStamp + ", topicRecordVO=" + this.topicRecordVO + dLRYz.CQDc + this.isBlocked + ")";
    }
}
