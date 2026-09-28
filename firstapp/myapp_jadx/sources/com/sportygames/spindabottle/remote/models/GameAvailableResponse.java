package com.sportygames.spindabottle.remote.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u0002\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/sportygames/spindabottle/remote/models/GameAvailableResponse;", "", "isAvailable", "", "themes", "", "Lcom/sportygames/spindabottle/remote/models/GameTheme;", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getThemes", "()Ljava/util/List;", "specialThemeAvailable", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/util/List;)Lcom/sportygames/spindabottle/remote/models/GameAvailableResponse;", "equals", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GameAvailableResponse {
    public static final int $stable = 8;
    private final Boolean isAvailable;
    private final List<GameTheme> themes;

    public GameAvailableResponse(Boolean bool, List<GameTheme> list) {
        this.isAvailable = bool;
        this.themes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GameAvailableResponse copy$default(GameAvailableResponse gameAvailableResponse, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = gameAvailableResponse.isAvailable;
        }
        if ((i & 2) != 0) {
            list = gameAvailableResponse.themes;
        }
        return gameAvailableResponse.copy(bool, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsAvailable() {
        return this.isAvailable;
    }

    public final List<GameTheme> component2() {
        return this.themes;
    }

    public final GameAvailableResponse copy(Boolean isAvailable, List<GameTheme> themes) {
        return new GameAvailableResponse(isAvailable, themes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameAvailableResponse)) {
            return false;
        }
        GameAvailableResponse gameAvailableResponse = (GameAvailableResponse) other;
        return Intrinsics.g(this.isAvailable, gameAvailableResponse.isAvailable) && Intrinsics.g(this.themes, gameAvailableResponse.themes);
    }

    public final List<GameTheme> getThemes() {
        return this.themes;
    }

    public int hashCode() {
        Boolean bool = this.isAvailable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<GameTheme> list = this.themes;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final Boolean isAvailable() {
        return this.isAvailable;
    }

    public final boolean specialThemeAvailable() {
        List<GameTheme> list = this.themes;
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (GameTheme gameTheme : list) {
            if (Intrinsics.g(gameTheme.getName(), "Special Theme") && gameTheme.getEnabled()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "GameAvailableResponse(isAvailable=" + this.isAvailable + ", themes=" + this.themes + ")";
    }
}
