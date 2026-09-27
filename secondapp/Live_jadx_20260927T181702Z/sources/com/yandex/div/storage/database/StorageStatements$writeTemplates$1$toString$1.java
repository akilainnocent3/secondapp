package com.yandex.div.storage.database;

import com.yandex.div.storage.templates.Template;
import ds.l;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class StorageStatements$writeTemplates$1$toString$1 extends o0 implements l<Template, CharSequence> {
    public static final StorageStatements$writeTemplates$1$toString$1 INSTANCE = new StorageStatements$writeTemplates$1$toString$1();

    public StorageStatements$writeTemplates$1$toString$1() {
        super(1);
    }

    @Override // ds.l
    @oy.l
    public final CharSequence invoke(@oy.l Template template) {
        return template.getId() + '/' + template.getHash();
    }
}
