package com.sportygames.fruithunt.utils.objects;

import android.animation.ObjectAnimator;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.fruithunt.network.models.FruitItem;
import defpackage.gpp;
import defpackage.nrz;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u0010/\u001a\u00020\rHÆ\u0003J^\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0005HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00068"}, d2 = {"Lcom/sportygames/fruithunt/utils/objects/FruitMap;", "", "fruitItem", "Lcom/sportygames/fruithunt/network/models/FruitItem$FruitRecord;", AnalyticsParam.EVENT_PATH, "", "rotator", "Landroid/animation/ObjectAnimator;", "pathMover", "colX", "", "colY", "time", "", "<init>", "(Lcom/sportygames/fruithunt/network/models/FruitItem$FruitRecord;ILandroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;Ljava/lang/Float;Ljava/lang/Float;J)V", "getFruitItem", "()Lcom/sportygames/fruithunt/network/models/FruitItem$FruitRecord;", "setFruitItem", "(Lcom/sportygames/fruithunt/network/models/FruitItem$FruitRecord;)V", "getPath", "()I", "setPath", "(I)V", "getRotator", "()Landroid/animation/ObjectAnimator;", "setRotator", "(Landroid/animation/ObjectAnimator;)V", "getPathMover", "setPathMover", "getColX", "()Ljava/lang/Float;", "setColX", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getColY", "setColY", "getTime", "()J", "setTime", "(J)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/sportygames/fruithunt/network/models/FruitItem$FruitRecord;ILandroid/animation/ObjectAnimator;Landroid/animation/ObjectAnimator;Ljava/lang/Float;Ljava/lang/Float;J)Lcom/sportygames/fruithunt/utils/objects/FruitMap;", "equals", "", "other", "hashCode", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FruitMap {
    public static final int $stable = 8;
    private Float colX;
    private Float colY;
    private FruitItem.FruitRecord fruitItem;
    private int path;
    private ObjectAnimator pathMover;
    private ObjectAnimator rotator;
    private long time;

    public /* synthetic */ FruitMap(FruitItem.FruitRecord fruitRecord, int i, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, Float f, Float f2, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fruitRecord, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : objectAnimator, (i2 & 8) != 0 ? null : objectAnimator2, (i2 & 16) != 0 ? null : f, (i2 & 32) == 0 ? f2 : null, (i2 & 64) != 0 ? 1000L : j);
    }

    public static /* synthetic */ FruitMap copy$default(FruitMap fruitMap, FruitItem.FruitRecord fruitRecord, int i, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, Float f, Float f2, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            fruitRecord = fruitMap.fruitItem;
        }
        if ((i2 & 2) != 0) {
            i = fruitMap.path;
        }
        if ((i2 & 4) != 0) {
            objectAnimator = fruitMap.rotator;
        }
        if ((i2 & 8) != 0) {
            objectAnimator2 = fruitMap.pathMover;
        }
        if ((i2 & 16) != 0) {
            f = fruitMap.colX;
        }
        if ((i2 & 32) != 0) {
            f2 = fruitMap.colY;
        }
        if ((i2 & 64) != 0) {
            j = fruitMap.time;
        }
        long j2 = j;
        Float f3 = f;
        Float f4 = f2;
        return fruitMap.copy(fruitRecord, i, objectAnimator, objectAnimator2, f3, f4, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FruitItem.FruitRecord getFruitItem() {
        return this.fruitItem;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPath() {
        return this.path;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ObjectAnimator getRotator() {
        return this.rotator;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ObjectAnimator getPathMover() {
        return this.pathMover;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Float getColX() {
        return this.colX;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Float getColY() {
        return this.colY;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    public final FruitMap copy(FruitItem.FruitRecord fruitItem, int path, ObjectAnimator rotator, ObjectAnimator pathMover, Float colX, Float colY, long time) {
        return new FruitMap(fruitItem, path, rotator, pathMover, colX, colY, time);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FruitMap)) {
            return false;
        }
        FruitMap fruitMap = (FruitMap) other;
        return Intrinsics.g(this.fruitItem, fruitMap.fruitItem) && this.path == fruitMap.path && Intrinsics.g(this.rotator, fruitMap.rotator) && Intrinsics.g(this.pathMover, fruitMap.pathMover) && Intrinsics.g(this.colX, fruitMap.colX) && Intrinsics.g(this.colY, fruitMap.colY) && this.time == fruitMap.time;
    }

    public final Float getColX() {
        return this.colX;
    }

    public final Float getColY() {
        return this.colY;
    }

    public final FruitItem.FruitRecord getFruitItem() {
        return this.fruitItem;
    }

    public final int getPath() {
        return this.path;
    }

    public final ObjectAnimator getPathMover() {
        return this.pathMover;
    }

    public final ObjectAnimator getRotator() {
        return this.rotator;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        FruitItem.FruitRecord fruitRecord = this.fruitItem;
        int iA = gpp.a(this.path, (fruitRecord == null ? 0 : fruitRecord.hashCode()) * 31, 31);
        ObjectAnimator objectAnimator = this.rotator;
        int iHashCode = (iA + (objectAnimator == null ? 0 : objectAnimator.hashCode())) * 31;
        ObjectAnimator objectAnimator2 = this.pathMover;
        int iHashCode2 = (iHashCode + (objectAnimator2 == null ? 0 : objectAnimator2.hashCode())) * 31;
        Float f = this.colX;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.colY;
        return Long.hashCode(this.time) + ((iHashCode3 + (f2 != null ? f2.hashCode() : 0)) * 31);
    }

    public final void setColX(Float f) {
        this.colX = f;
    }

    public final void setColY(Float f) {
        this.colY = f;
    }

    public final void setFruitItem(FruitItem.FruitRecord fruitRecord) {
        this.fruitItem = fruitRecord;
    }

    public final void setPath(int i) {
        this.path = i;
    }

    public final void setPathMover(ObjectAnimator objectAnimator) {
        this.pathMover = objectAnimator;
    }

    public final void setRotator(ObjectAnimator objectAnimator) {
        this.rotator = objectAnimator;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public String toString() {
        FruitItem.FruitRecord fruitRecord = this.fruitItem;
        int i = this.path;
        ObjectAnimator objectAnimator = this.rotator;
        ObjectAnimator objectAnimator2 = this.pathMover;
        Float f = this.colX;
        Float f2 = this.colY;
        long j = this.time;
        StringBuilder sb = new StringBuilder("FruitMap(fruitItem=");
        sb.append(fruitRecord);
        sb.append(", path=");
        sb.append(i);
        sb.append(", rotator=");
        sb.append(objectAnimator);
        sb.append(", pathMover=");
        sb.append(objectAnimator2);
        sb.append(", colX=");
        sb.append(f);
        sb.append(", colY=");
        sb.append(f2);
        sb.append(", time=");
        return nrz.a(j, ")", sb);
    }

    public FruitMap(FruitItem.FruitRecord fruitRecord, int i, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, Float f, Float f2, long j) {
        this.fruitItem = fruitRecord;
        this.path = i;
        this.rotator = objectAnimator;
        this.pathMover = objectAnimator2;
        this.colX = f;
        this.colY = f2;
        this.time = j;
    }
}
