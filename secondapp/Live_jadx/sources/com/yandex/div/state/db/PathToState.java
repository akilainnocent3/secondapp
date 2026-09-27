package com.yandex.div.state.db;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class PathToState {

    @l
    private final String path;

    @l
    private final String stateId;

    public PathToState(@l String str, @l String str2) {
        this.path = str;
        this.stateId = str2;
    }

    public static /* synthetic */ PathToState copy$default(PathToState pathToState, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pathToState.path;
        }
        if ((i10 & 2) != 0) {
            str2 = pathToState.stateId;
        }
        return pathToState.copy(str, str2);
    }

    @l
    public final String component1() {
        return this.path;
    }

    @l
    public final String component2() {
        return this.stateId;
    }

    @l
    public final PathToState copy(@l String str, @l String str2) {
        return new PathToState(str, str2);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PathToState)) {
            return false;
        }
        PathToState pathToState = (PathToState) obj;
        return m0.g(this.path, pathToState.path) && m0.g(this.stateId, pathToState.stateId);
    }

    @l
    public final String getPath() {
        return this.path;
    }

    @l
    public final String getStateId() {
        return this.stateId;
    }

    public int hashCode() {
        return (this.path.hashCode() * 31) + this.stateId.hashCode();
    }

    @l
    public String toString() {
        return "PathToState(path=" + this.path + ", stateId=" + this.stateId + ')';
    }
}
