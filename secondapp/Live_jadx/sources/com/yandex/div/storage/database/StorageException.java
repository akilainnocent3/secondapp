package com.yandex.div.storage.database;

import kotlin.jvm.internal.x;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class StorageException extends Exception {

    @m
    private final String cardId;

    public StorageException() {
        this(null, null, null, 7, null);
    }

    @m
    public final String getCardId() {
        return this.cardId;
    }

    public /* synthetic */ StorageException(String str, Throwable th2, String str2, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th2, (i10 & 4) != 0 ? null : str2);
    }

    public StorageException(@m String str, @m Throwable th2, @m String str2) {
        super(str, th2);
        this.cardId = str2;
    }
}
