package com.yandex.div.storage;

import com.yandex.div.storage.database.StorageException;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivStorageErrorException extends StorageException {

    @l
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:6:0x001d  */
        public final String getMessage(String str, String str2) {
            String str3;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            if (str2 != null) {
                str3 = " Card id: " + str2;
                if (str3 == null) {
                    str3 = "";
                }
            } else {
                str3 = "";
            }
            sb2.append(str3);
            return sb2.toString();
        }

        private Companion() {
        }
    }

    public DivStorageErrorException() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ DivStorageErrorException(String str, Throwable th2, String str2, int i10, x xVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : th2, (i10 & 4) != 0 ? null : str2);
    }

    public DivStorageErrorException(@l String str, @m Throwable th2, @m String str2) {
        super(Companion.getMessage(str, str2), th2, str2);
    }
}
