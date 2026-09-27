package com.yandex.div.storage.database;

import fr.h0;
import java.util.List;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class ExecutionResult {

    @l
    private final List<StorageException> errors;

    /* JADX WARN: Multi-variable type inference failed */
    public ExecutionResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @l
    public List<StorageException> getErrors() {
        return this.errors;
    }

    public boolean isSuccessful() {
        return getErrors().isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExecutionResult(@l List<? extends StorageException> list) {
        this.errors = list;
    }

    public /* synthetic */ ExecutionResult(List list, int i10, x xVar) {
        this((i10 & 1) != 0 ? h0.J() : list);
    }
}
