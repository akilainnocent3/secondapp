package com.sportygames.spindabottle.remote.models;

import defpackage.tzx;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/sportygames/spindabottle/remote/models/GameTheme;", "", "name", "", "enabled", "", "<init>", "(Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getEnabled", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GameTheme {
    public static final int $stable = 0;
    private final boolean enabled;
    private final String name;

    public GameTheme(String str, boolean z) {
        str.getClass();
        this.name = str;
        this.enabled = z;
    }

    public static /* synthetic */ GameTheme copy$default(GameTheme gameTheme, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gameTheme.name;
        }
        if ((i & 2) != 0) {
            z = gameTheme.enabled;
        }
        return gameTheme.copy(str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final GameTheme copy(String name, boolean enabled) {
        name.getClass();
        return new GameTheme(name, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameTheme)) {
            return false;
        }
        GameTheme gameTheme = (GameTheme) other;
        return Intrinsics.g(this.name, gameTheme.name) && this.enabled == gameTheme.enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled) + (this.name.hashCode() * 31);
    }

    public String toString() {
        return tzx.a("GameTheme(name=", this.name, ", enabled=", ")", this.enabled);
    }
}
