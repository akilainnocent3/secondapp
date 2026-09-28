package com.sportygames.pingpong.remote.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0002\u0010\tR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sportygames/pingpong/remote/models/DetailResponseData;", "", "isManualSeedAllowed", "", "gameDetailsResponseList", "", "Lcom/sportygames/pingpong/remote/models/DetailResponse;", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getGameDetailsResponseList", "()Ljava/util/List;", "setGameDetailsResponseList", "(Ljava/util/List;)V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DetailResponseData {
    public static final int $stable = 8;
    private List<DetailResponse> gameDetailsResponseList;
    private final Boolean isManualSeedAllowed;

    public DetailResponseData(Boolean bool, List<DetailResponse> list) {
        list.getClass();
        this.isManualSeedAllowed = bool;
        this.gameDetailsResponseList = list;
    }

    public final List<DetailResponse> getGameDetailsResponseList() {
        return this.gameDetailsResponseList;
    }

    /* JADX INFO: renamed from: isManualSeedAllowed, reason: from getter */
    public final Boolean getIsManualSeedAllowed() {
        return this.isManualSeedAllowed;
    }

    public final void setGameDetailsResponseList(List<DetailResponse> list) {
        list.getClass();
        this.gameDetailsResponseList = list;
    }

    public /* synthetic */ DetailResponseData(Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, list);
    }
}
