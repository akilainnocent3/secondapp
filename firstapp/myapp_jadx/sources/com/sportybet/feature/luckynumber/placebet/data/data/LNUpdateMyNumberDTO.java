package com.sportybet.feature.luckynumber.placebet.data.data;

import defpackage.nf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\u0002\b\u0016Ê\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0015"}, d2 = {"Lcom/sportybet/feature/luckynumber/placebet/data/data/LNUpdateMyNumberDTO;", "", "title", "", "mainNumbers", "", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getMainNumbers", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNUpdateMyNumberDTO {
    public static final int $stable = 8;
    private final List<Integer> mainNumbers;
    private final String title;

    public LNUpdateMyNumberDTO(String str, List<Integer> list) {
        str.getClass();
        list.getClass();
        this.title = str;
        this.mainNumbers = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LNUpdateMyNumberDTO copy$default(LNUpdateMyNumberDTO lNUpdateMyNumberDTO, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lNUpdateMyNumberDTO.title;
        }
        if ((i & 2) != 0) {
            list = lNUpdateMyNumberDTO.mainNumbers;
        }
        return lNUpdateMyNumberDTO.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<Integer> component2() {
        return this.mainNumbers;
    }

    public final LNUpdateMyNumberDTO copy(String title, List<Integer> mainNumbers) {
        title.getClass();
        mainNumbers.getClass();
        return new LNUpdateMyNumberDTO(title, mainNumbers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNUpdateMyNumberDTO)) {
            return false;
        }
        LNUpdateMyNumberDTO lNUpdateMyNumberDTO = (LNUpdateMyNumberDTO) other;
        return Intrinsics.g(this.title, lNUpdateMyNumberDTO.title) && Intrinsics.g(this.mainNumbers, lNUpdateMyNumberDTO.mainNumbers);
    }

    public final List<Integer> getMainNumbers() {
        return this.mainNumbers;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.mainNumbers.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return nf.b("LNUpdateMyNumberDTO(title=", this.title, ", mainNumbers=", ")", this.mainNumbers);
    }
}
