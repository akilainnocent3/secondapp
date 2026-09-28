package com.sportygames.multilevel.common.model;

import com.appsflyer.internal.p;
import com.google.gson.annotations.SerializedName;
import defpackage.m2g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/sportygames/multilevel/common/model/MultiBonusWin;", "", "bonusWins", "", "Lcom/sportygames/multilevel/common/model/TopBonusWinsDto;", "<init>", "(Ljava/util/List;)V", "getBonusWins", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultiBonusWin {
    public static final int $stable = 8;

    @SerializedName("bonusWins")
    private final List<TopBonusWinsDto> bonusWins;

    public MultiBonusWin(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? m2g.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiBonusWin copy$default(MultiBonusWin multiBonusWin, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = multiBonusWin.bonusWins;
        }
        return multiBonusWin.copy(list);
    }

    public final List<TopBonusWinsDto> component1() {
        return this.bonusWins;
    }

    public final MultiBonusWin copy(List<TopBonusWinsDto> bonusWins) {
        bonusWins.getClass();
        return new MultiBonusWin(bonusWins);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MultiBonusWin) && Intrinsics.g(this.bonusWins, ((MultiBonusWin) other).bonusWins);
    }

    public final List<TopBonusWinsDto> getBonusWins() {
        return this.bonusWins;
    }

    public int hashCode() {
        return this.bonusWins.hashCode();
    }

    public String toString() {
        return p.a("MultiBonusWin(bonusWins=", ")", this.bonusWins);
    }

    public MultiBonusWin(List<TopBonusWinsDto> list) {
        list.getClass();
        this.bonusWins = list;
    }

    public MultiBonusWin() {
        this(null, 1, null);
    }
}
