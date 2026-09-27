package com.yandex.div.storage;

import com.yandex.div.storage.database.StorageException;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class RawJsonRepositoryException extends Exception {

    @m
    private final String jsonId;

    public RawJsonRepositoryException(@l StorageException storageException) {
        super(storageException.getMessage(), storageException);
        this.jsonId = storageException.getCardId();
    }

    @m
    public final String getJsonId() {
        return this.jsonId;
    }
}
