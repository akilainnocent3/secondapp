package com.sportygames.commons.models;

import defpackage.j58;
import defpackage.nbh0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/sportygames/commons/models/ComposeCoeffModel;", "", "", "coefficientText", "Lj58;", "textColor", "<init>", "(Ljava/lang/String;Lj58;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2-QN2ZGVo", "()Lj58;", "component2", "copy-0Yiz4hI", "(Ljava/lang/String;Lj58;)Lcom/sportygames/commons/models/ComposeCoeffModel;", "copy", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCoefficientText", "Lj58;", "getTextColor-QN2ZGVo", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ComposeCoeffModel {
    public static final int $stable = 0;
    private final String coefficientText;
    private final j58 textColor;

    private ComposeCoeffModel(String str, j58 j58Var) {
        this.coefficientText = str;
        this.textColor = j58Var;
    }

    /* JADX INFO: renamed from: copy-0Yiz4hI$default, reason: not valid java name */
    public static /* synthetic */ ComposeCoeffModel m50copy0Yiz4hI$default(ComposeCoeffModel composeCoeffModel, String str, j58 j58Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = composeCoeffModel.coefficientText;
        }
        if ((i & 2) != 0) {
            j58Var = composeCoeffModel.textColor;
        }
        return composeCoeffModel.m52copy0Yiz4hI(str, j58Var);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCoefficientText() {
        return this.coefficientText;
    }

    /* JADX INFO: renamed from: component2-QN2ZGVo, reason: not valid java name and from getter */
    public final j58 getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: copy-0Yiz4hI, reason: not valid java name */
    public final ComposeCoeffModel m52copy0Yiz4hI(String coefficientText, j58 textColor) {
        return new ComposeCoeffModel(coefficientText, textColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComposeCoeffModel)) {
            return false;
        }
        ComposeCoeffModel composeCoeffModel = (ComposeCoeffModel) other;
        return Intrinsics.g(this.coefficientText, composeCoeffModel.coefficientText) && Intrinsics.g(this.textColor, composeCoeffModel.textColor);
    }

    public final String getCoefficientText() {
        return this.coefficientText;
    }

    /* JADX INFO: renamed from: getTextColor-QN2ZGVo, reason: not valid java name */
    public final j58 m53getTextColorQN2ZGVo() {
        return this.textColor;
    }

    public int hashCode() {
        String str = this.coefficientText;
        int iHashCode = 0;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        j58 j58Var = this.textColor;
        if (j58Var != null) {
            long j = j58Var.a;
            nbh0.a aVar = nbh0.b;
            iHashCode = Long.hashCode(j);
        }
        return iHashCode2 + iHashCode;
    }

    public String toString() {
        return "ComposeCoeffModel(coefficientText=" + this.coefficientText + ", textColor=" + this.textColor + ")";
    }

    public /* synthetic */ ComposeCoeffModel(String str, j58 j58Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j58Var);
    }
}
