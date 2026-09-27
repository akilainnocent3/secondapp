package com.yandex.div.storage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivDataRepositoryRemoveResult {

    @l
    private final List<DivDataRepositoryException> errors;

    @l
    private final Set<String> ids;

    /* JADX WARN: Multi-variable type inference failed */
    public DivDataRepositoryRemoveResult(@l Set<String> set, @l List<? extends DivDataRepositoryException> list) {
        this.ids = set;
        this.errors = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivDataRepositoryRemoveResult copy$default(DivDataRepositoryRemoveResult divDataRepositoryRemoveResult, Set set, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            set = divDataRepositoryRemoveResult.ids;
        }
        if ((i10 & 2) != 0) {
            list = divDataRepositoryRemoveResult.errors;
        }
        return divDataRepositoryRemoveResult.copy(set, list);
    }

    @l
    public final Set<String> component1() {
        return this.ids;
    }

    @l
    public final List<DivDataRepositoryException> component2() {
        return this.errors;
    }

    @l
    public final DivDataRepositoryRemoveResult copy(@l Set<String> set, @l List<? extends DivDataRepositoryException> list) {
        return new DivDataRepositoryRemoveResult(set, list);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivDataRepositoryRemoveResult)) {
            return false;
        }
        DivDataRepositoryRemoveResult divDataRepositoryRemoveResult = (DivDataRepositoryRemoveResult) obj;
        return m0.g(this.ids, divDataRepositoryRemoveResult.ids) && m0.g(this.errors, divDataRepositoryRemoveResult.errors);
    }

    @l
    public final List<DivDataRepositoryException> getErrors() {
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
        return "DivDataRepositoryRemoveResult(ids=" + this.ids + ", errors=" + this.errors + ')';
    }
}
