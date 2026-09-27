package com.yandex.div.storage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class RawJsonRepositoryRemoveResult {

    @l
    private final List<RawJsonRepositoryException> errors;

    @l
    private final Set<String> ids;

    public RawJsonRepositoryRemoveResult(@l Set<String> set, @l List<RawJsonRepositoryException> list) {
        this.ids = set;
        this.errors = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RawJsonRepositoryRemoveResult copy$default(RawJsonRepositoryRemoveResult rawJsonRepositoryRemoveResult, Set set, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            set = rawJsonRepositoryRemoveResult.ids;
        }
        if ((i10 & 2) != 0) {
            list = rawJsonRepositoryRemoveResult.errors;
        }
        return rawJsonRepositoryRemoveResult.copy(set, list);
    }

    @l
    public final Set<String> component1() {
        return this.ids;
    }

    @l
    public final List<RawJsonRepositoryException> component2() {
        return this.errors;
    }

    @l
    public final RawJsonRepositoryRemoveResult copy(@l Set<String> set, @l List<RawJsonRepositoryException> list) {
        return new RawJsonRepositoryRemoveResult(set, list);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RawJsonRepositoryRemoveResult)) {
            return false;
        }
        RawJsonRepositoryRemoveResult rawJsonRepositoryRemoveResult = (RawJsonRepositoryRemoveResult) obj;
        return m0.g(this.ids, rawJsonRepositoryRemoveResult.ids) && m0.g(this.errors, rawJsonRepositoryRemoveResult.errors);
    }

    @l
    public final List<RawJsonRepositoryException> getErrors() {
        return this.errors;
    }

    @l
    public final Set<String> getIds() {
        return this.ids;
    }

    public int hashCode() {
        return (this.ids.hashCode() * 31) + this.errors.hashCode();
    }

    @l
    public String toString() {
        return "RawJsonRepositoryRemoveResult(ids=" + this.ids + ", errors=" + this.errors + ')';
    }
}
