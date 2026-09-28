package com.sportygames.commons.models;

import defpackage.f78;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ux5;
import defpackage.wd7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J]\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\bHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/sportygames/commons/models/ToastCommonModel;", "", "text", "", "currency", "at", "coeff", "bgColor", "", "giftAmount", "actualUsedAmount", "giftVal", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;D)V", "getText", "()Ljava/lang/String;", "getCurrency", "getAt", "getCoeff", "getBgColor", "()I", "getGiftAmount", "getActualUsedAmount", "getGiftVal", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ToastCommonModel {
    public static final int $stable = 0;
    private final String actualUsedAmount;
    private final String at;
    private final int bgColor;
    private final String coeff;
    private final String currency;
    private final String giftAmount;
    private final double giftVal;
    private final String text;

    public ToastCommonModel(String str, String str2, String str3, String str4, int i, String str5, String str6, double d) {
        wd7.a(str, str2, str3, str4);
        this.text = str;
        this.currency = str2;
        this.at = str3;
        this.coeff = str4;
        this.bgColor = i;
        this.giftAmount = str5;
        this.actualUsedAmount = str6;
        this.giftVal = d;
    }

    public static /* synthetic */ ToastCommonModel copy$default(ToastCommonModel toastCommonModel, String str, String str2, String str3, String str4, int i, String str5, String str6, double d, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = toastCommonModel.text;
        }
        if ((i2 & 2) != 0) {
            str2 = toastCommonModel.currency;
        }
        if ((i2 & 4) != 0) {
            str3 = toastCommonModel.at;
        }
        if ((i2 & 8) != 0) {
            str4 = toastCommonModel.coeff;
        }
        if ((i2 & 16) != 0) {
            i = toastCommonModel.bgColor;
        }
        if ((i2 & 32) != 0) {
            str5 = toastCommonModel.giftAmount;
        }
        if ((i2 & 64) != 0) {
            str6 = toastCommonModel.actualUsedAmount;
        }
        if ((i2 & 128) != 0) {
            d = toastCommonModel.giftVal;
        }
        double d2 = d;
        String str7 = str5;
        String str8 = str6;
        int i3 = i;
        String str9 = str3;
        return toastCommonModel.copy(str, str2, str9, str4, i3, str7, str8, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAt() {
        return this.at;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCoeff() {
        return this.coeff;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBgColor() {
        return this.bgColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getGiftAmount() {
        return this.giftAmount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getActualUsedAmount() {
        return this.actualUsedAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getGiftVal() {
        return this.giftVal;
    }

    public final ToastCommonModel copy(String text, String currency, String at, String coeff, int bgColor, String giftAmount, String actualUsedAmount, double giftVal) {
        text.getClass();
        currency.getClass();
        at.getClass();
        coeff.getClass();
        return new ToastCommonModel(text, currency, at, coeff, bgColor, giftAmount, actualUsedAmount, giftVal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToastCommonModel)) {
            return false;
        }
        ToastCommonModel toastCommonModel = (ToastCommonModel) other;
        return Intrinsics.g(this.text, toastCommonModel.text) && Intrinsics.g(this.currency, toastCommonModel.currency) && Intrinsics.g(this.at, toastCommonModel.at) && Intrinsics.g(this.coeff, toastCommonModel.coeff) && this.bgColor == toastCommonModel.bgColor && Intrinsics.g(this.giftAmount, toastCommonModel.giftAmount) && Intrinsics.g(this.actualUsedAmount, toastCommonModel.actualUsedAmount) && Double.compare(this.giftVal, toastCommonModel.giftVal) == 0;
    }

    public final String getActualUsedAmount() {
        return this.actualUsedAmount;
    }

    public final String getAt() {
        return this.at;
    }

    public final int getBgColor() {
        return this.bgColor;
    }

    public final String getCoeff() {
        return this.coeff;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getGiftAmount() {
        return this.giftAmount;
    }

    public final double getGiftVal() {
        return this.giftVal;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iA = gpp.a(this.bgColor, gmf0.a(gmf0.a(gmf0.a(this.text.hashCode() * 31, 31, this.currency), 31, this.at), 31, this.coeff), 31);
        String str = this.giftAmount;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.actualUsedAmount;
        return Double.hashCode(this.giftVal) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.text;
        String str2 = this.currency;
        String str3 = this.at;
        String str4 = this.coeff;
        int i = this.bgColor;
        String str5 = this.giftAmount;
        String str6 = this.actualUsedAmount;
        double d = this.giftVal;
        StringBuilder sbA = ux5.a("ToastCommonModel(text=", str, ", currency=", str2, ", at=");
        hxa.c(sbA, str3, ", coeff=", str4, ", bgColor=");
        f78.b(i, ", giftAmount=", str5, ", actualUsedAmount=", sbA);
        sbA.append(str6);
        sbA.append(", giftVal=");
        sbA.append(d);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ ToastCommonModel(String str, String str2, String str3, String str4, int i, String str5, String str6, double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? 0.0d : d);
    }
}
