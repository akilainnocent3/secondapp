package com.yandex.div.storage;

import com.yandex.div.json.ParsingException;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DivDataRepositoryException extends Exception {

    @m
    private final String cardId;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class JsonParsingException extends DivDataRepositoryException {
        public /* synthetic */ JsonParsingException(String str, ParsingException parsingException, String str2, int i10, x xVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : parsingException, str2);
        }

        public JsonParsingException(@m String str, @m ParsingException parsingException, @l String str2) {
            super(str, parsingException, str2, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class StorageException extends DivDataRepositoryException {
        public StorageException(@l com.yandex.div.storage.database.StorageException storageException) {
            super(storageException.getMessage(), storageException, storageException.getCardId(), null);
        }
    }

    public /* synthetic */ DivDataRepositoryException(String str, Throwable th2, String str2, x xVar) {
        this(str, th2, str2);
    }

    @m
    public final String getCardId() {
        return this.cardId;
    }

    public /* synthetic */ DivDataRepositoryException(String str, Throwable th2, String str2, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : th2, (i10 & 4) != 0 ? null : str2, null);
    }

    private DivDataRepositoryException(String str, Throwable th2, String str2) {
        super(str, th2);
        this.cardId = str2;
    }
}
