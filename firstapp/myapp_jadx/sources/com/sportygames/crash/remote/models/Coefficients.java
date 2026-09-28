package com.sportygames.crash.remote.models;

import com.appsflyer.internal.w;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.j58;
import defpackage.nbh0;
import defpackage.nrg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJV\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0011J\u001a\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0015R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u00100R\"\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010-\u001a\u0004\b1\u0010\u0017\"\u0004\b2\u00100R\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010-\u001a\u0004\b3\u0010\u0017\"\u0004\b4\u00100R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00105\u001a\u0004\b\r\u0010\u001e\"\u0004\b6\u00107¨\u00068"}, d2 = {"Lcom/sportygames/crash/remote/models/Coefficients;", "", "", AnalyticsParam.EVENT_PARAM_ID, "", "houseCoefficient", "", "houseCoefficientStr", "Lj58;", "coeffColor", "bgColor", "roundHistoryChipColor", "", "isNew", "<init>", "(IDLjava/lang/String;JJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()I", "component2", "()D", "component3", "()Ljava/lang/String;", "component4-0d7_KjU", "()J", "component4", "component5-0d7_KjU", "component5", "component6-0d7_KjU", "component6", "component7", "()Z", "copy-BqC95S0", "(IDLjava/lang/String;JJJZ)Lcom/sportygames/crash/remote/models/Coefficients;", "copy", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "D", "getHouseCoefficient", "Ljava/lang/String;", "getHouseCoefficientStr", "J", "getCoeffColor-0d7_KjU", "setCoeffColor-8_81llA", "(J)V", "getBgColor-0d7_KjU", "setBgColor-8_81llA", "getRoundHistoryChipColor-0d7_KjU", "setRoundHistoryChipColor-8_81llA", "Z", "setNew", "(Z)V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Coefficients {
    public static final int $stable = 8;
    private long bgColor;
    private long coeffColor;
    private final double houseCoefficient;
    private final String houseCoefficientStr;
    private final int id;
    private boolean isNew;
    private long roundHistoryChipColor;

    /* JADX WARN: Illegal instructions before constructor call */
    public Coefficients(int i, double d, String str, long j, long j2, long j3, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        long j4;
        long j5;
        long j6;
        int i3 = (i2 & 1) != 0 ? 1 : i;
        double d2 = (i2 & 2) != 0 ? 0.0d : d;
        String str2 = (i2 & 4) != 0 ? "0x" : str;
        if ((i2 & 8) != 0) {
            int i4 = j58.n;
            j4 = j58.i;
        } else {
            j4 = j;
        }
        if ((i2 & 16) != 0) {
            int i5 = j58.n;
            j5 = j58.j;
        } else {
            j5 = j2;
        }
        if ((i2 & 32) != 0) {
            int i6 = j58.n;
            j6 = j58.j;
        } else {
            j6 = j3;
        }
        this(i3, d2, str2, j4, j5, j6, (i2 & 64) != 0 ? false : z, null);
    }

    /* JADX INFO: renamed from: copy-BqC95S0$default, reason: not valid java name */
    public static /* synthetic */ Coefficients m88copyBqC95S0$default(Coefficients coefficients, int i, double d, String str, long j, long j2, long j3, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = coefficients.id;
        }
        if ((i2 & 2) != 0) {
            d = coefficients.houseCoefficient;
        }
        if ((i2 & 4) != 0) {
            str = coefficients.houseCoefficientStr;
        }
        if ((i2 & 8) != 0) {
            j = coefficients.coeffColor;
        }
        if ((i2 & 16) != 0) {
            j2 = coefficients.bgColor;
        }
        if ((i2 & 32) != 0) {
            j3 = coefficients.roundHistoryChipColor;
        }
        if ((i2 & 64) != 0) {
            z = coefficients.isNew;
        }
        boolean z2 = z;
        long j4 = j3;
        String str2 = str;
        return coefficients.m92copyBqC95S0(i, d, str2, j, j2, j4, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHouseCoefficientStr() {
        return this.houseCoefficientStr;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getCoeffColor() {
        return this.coeffColor;
    }

    /* JADX INFO: renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getBgColor() {
        return this.bgColor;
    }

    /* JADX INFO: renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
    public final long getRoundHistoryChipColor() {
        return this.roundHistoryChipColor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    /* JADX INFO: renamed from: copy-BqC95S0, reason: not valid java name */
    public final Coefficients m92copyBqC95S0(int id, double houseCoefficient, String houseCoefficientStr, long coeffColor, long bgColor, long roundHistoryChipColor, boolean isNew) {
        houseCoefficientStr.getClass();
        return new Coefficients(id, houseCoefficient, houseCoefficientStr, coeffColor, bgColor, roundHistoryChipColor, isNew, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Coefficients)) {
            return false;
        }
        Coefficients coefficients = (Coefficients) other;
        if (this.id != coefficients.id || Double.compare(this.houseCoefficient, coefficients.houseCoefficient) != 0 || !Intrinsics.g(this.houseCoefficientStr, coefficients.houseCoefficientStr)) {
            return false;
        }
        long j = this.coeffColor;
        long j2 = coefficients.coeffColor;
        int i = j58.n;
        return nbh0.a(j, j2) && nbh0.a(this.bgColor, coefficients.bgColor) && nbh0.a(this.roundHistoryChipColor, coefficients.roundHistoryChipColor) && this.isNew == coefficients.isNew;
    }

    /* JADX INFO: renamed from: getBgColor-0d7_KjU, reason: not valid java name */
    public final long m93getBgColor0d7_KjU() {
        return this.bgColor;
    }

    /* JADX INFO: renamed from: getCoeffColor-0d7_KjU, reason: not valid java name */
    public final long m94getCoeffColor0d7_KjU() {
        return this.coeffColor;
    }

    public final double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    public final String getHouseCoefficientStr() {
        return this.houseCoefficientStr;
    }

    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: getRoundHistoryChipColor-0d7_KjU, reason: not valid java name */
    public final long m95getRoundHistoryChipColor0d7_KjU() {
        return this.roundHistoryChipColor;
    }

    public int hashCode() {
        int iA = gmf0.a(nrg0.a(Integer.hashCode(this.id) * 31, 31, this.houseCoefficient), 31, this.houseCoefficientStr);
        long j = this.coeffColor;
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Boolean.hashCode(this.isNew) + f87.a(f87.a(f87.a(iA, j, 31), this.bgColor, 31), this.roundHistoryChipColor, 31);
    }

    public final boolean isNew() {
        return this.isNew;
    }

    /* JADX INFO: renamed from: setBgColor-8_81llA, reason: not valid java name */
    public final void m96setBgColor8_81llA(long j) {
        this.bgColor = j;
    }

    /* JADX INFO: renamed from: setCoeffColor-8_81llA, reason: not valid java name */
    public final void m97setCoeffColor8_81llA(long j) {
        this.coeffColor = j;
    }

    public final void setNew(boolean z) {
        this.isNew = z;
    }

    /* JADX INFO: renamed from: setRoundHistoryChipColor-8_81llA, reason: not valid java name */
    public final void m98setRoundHistoryChipColor8_81llA(long j) {
        this.roundHistoryChipColor = j;
    }

    public String toString() {
        int i = this.id;
        double d = this.houseCoefficient;
        String str = this.houseCoefficientStr;
        String strI = j58.i(this.coeffColor);
        String strI2 = j58.i(this.bgColor);
        String strI3 = j58.i(this.roundHistoryChipColor);
        boolean z = this.isNew;
        StringBuilder sb = new StringBuilder("Coefficients(id=");
        sb.append(i);
        sb.append(", houseCoefficient=");
        sb.append(d);
        hxa.c(sb, ", houseCoefficientStr=", str, ", coeffColor=", strI);
        hxa.c(sb, ", bgColor=", strI2, ", roundHistoryChipColor=", strI3);
        return w.a(sb, ", isNew=", z, ")");
    }

    private Coefficients(int i, double d, String str, long j, long j2, long j3, boolean z) {
        str.getClass();
        this.id = i;
        this.houseCoefficient = d;
        this.houseCoefficientStr = str;
        this.coeffColor = j;
        this.bgColor = j2;
        this.roundHistoryChipColor = j3;
        this.isNew = z;
    }

    public /* synthetic */ Coefficients(int i, double d, String str, long j, long j2, long j3, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, d, str, j, j2, j3, z);
    }
}
