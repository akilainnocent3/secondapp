package com.yandex.div.storage;

import com.yandex.div.storage.db.TemplateUsageDaoImpl;
import kotlin.jvm.internal.o0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivDatabaseStorage$templateUsageDao$2 extends o0 implements ds.a<TemplateUsageDaoImpl> {
    final /* synthetic */ DivDatabaseStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivDatabaseStorage$templateUsageDao$2(DivDatabaseStorage divDatabaseStorage) {
        super(0);
        this.this$0 = divDatabaseStorage;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.a
    @l
    public final TemplateUsageDaoImpl invoke() {
        return new TemplateUsageDaoImpl(this.this$0.getDatabase());
    }
}
