package com.yandex.div.storage.database;

import dr.w2;
import ds.l;
import java.util.List;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class StorageStatements$replaceCards$2$execute$1$errorHandler$1 extends o0 implements l<Exception, w2> {
    final /* synthetic */ String $cardId;
    final /* synthetic */ List<String> $failedTransactions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageStatements$replaceCards$2$execute$1$errorHandler$1(List<String> list, String str) {
        super(1);
        this.$failedTransactions = list;
        this.$cardId = str;
    }

    @Override // ds.l
    public /* bridge */ /* synthetic */ w2 invoke(Exception exc) {
        invoke2(exc);
        return w2.f79517a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@oy.l Exception exc) {
        this.$failedTransactions.add(this.$cardId);
        exc.printStackTrace();
    }
}
