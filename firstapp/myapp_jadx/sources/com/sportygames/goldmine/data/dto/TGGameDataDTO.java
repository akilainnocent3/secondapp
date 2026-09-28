package com.sportygames.goldmine.data.dto;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sportygames/goldmine/data/dto/TGGameDataDTO;", "", "showCollection", "", "caveAvailabilities", "", "<init>", "(ZLjava/util/List;)V", "getShowCollection", "()Z", "getCaveAvailabilities", "()Ljava/util/List;", "game-goldmine_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TGGameDataDTO {
    public static final int $stable = 8;
    private final List<Boolean> caveAvailabilities;
    private final boolean showCollection;

    public TGGameDataDTO(boolean z, List<Boolean> list) {
        list.getClass();
        this.showCollection = z;
        this.caveAvailabilities = list;
    }

    public final List<Boolean> getCaveAvailabilities() {
        return this.caveAvailabilities;
    }

    public final boolean getShowCollection() {
        return this.showCollection;
    }
}
