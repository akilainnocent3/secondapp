package com.sportygames.commons.models;

import defpackage.gpp;
import defpackage.ml5;
import defpackage.zk1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/sportygames/commons/models/ErrorToastCommonModel;", "", "text", "", "textColor", "", "bgColor", "<init>", "(Ljava/lang/String;II)V", "getText", "()Ljava/lang/String;", "getTextColor", "()I", "getBgColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ErrorToastCommonModel {
    public static final int $stable = 0;
    private final int bgColor;
    private final String text;
    private final int textColor;

    public ErrorToastCommonModel(String str, int i, int i2) {
        str.getClass();
        this.text = str;
        this.textColor = i;
        this.bgColor = i2;
    }

    public static /* synthetic */ ErrorToastCommonModel copy$default(ErrorToastCommonModel errorToastCommonModel, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = errorToastCommonModel.text;
        }
        if ((i3 & 2) != 0) {
            i = errorToastCommonModel.textColor;
        }
        if ((i3 & 4) != 0) {
            i2 = errorToastCommonModel.bgColor;
        }
        return errorToastCommonModel.copy(str, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBgColor() {
        return this.bgColor;
    }

    public final ErrorToastCommonModel copy(String text, int textColor, int bgColor) {
        text.getClass();
        return new ErrorToastCommonModel(text, textColor, bgColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorToastCommonModel)) {
            return false;
        }
        ErrorToastCommonModel errorToastCommonModel = (ErrorToastCommonModel) other;
        return Intrinsics.g(this.text, errorToastCommonModel.text) && this.textColor == errorToastCommonModel.textColor && this.bgColor == errorToastCommonModel.bgColor;
    }

    public final int getBgColor() {
        return this.bgColor;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return Integer.hashCode(this.bgColor) + gpp.a(this.textColor, this.text.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.text;
        return zk1.a(this.bgColor, ")", ml5.a(this.textColor, "ErrorToastCommonModel(text=", str, ", textColor=", ", bgColor="));
    }
}
