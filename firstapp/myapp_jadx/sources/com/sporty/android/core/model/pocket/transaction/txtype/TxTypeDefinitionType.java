package com.sporty.android.core.model.pocket.transaction.txtype;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fj\u0010\b\u0006\u0012\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\tj\u0010\b\n\u0012\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000bÊ\u0001\u0002\b\u0011¨\u0006\u0010"}, d2 = {"Lcom/sporty/android/core/model/pocket/transaction/txtype/TxTypeDefinitionType;", "", "name", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "TRADE_CODE", "Lcom/google/gson/annotations/SerializedName;", "value", "tradeCode", "BIZ_TYPE", "bizType", "wrapper", "Lcom/sporty/android/core/model/pocket/transaction/txtype/TxTypeDefinitionTypeWrapper;", "getWrapper", "()Lcom/sporty/android/core/model/pocket/transaction/txtype/TxTypeDefinitionTypeWrapper;", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum TxTypeDefinitionType {
    TRADE_CODE("tradeCode"),
    BIZ_TYPE("bizType");

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    TxTypeDefinitionType(String str) {
    }

    public static tag<TxTypeDefinitionType> getEntries() {
        return $ENTRIES;
    }

    public final TxTypeDefinitionTypeWrapper getWrapper() {
        return new TxTypeDefinitionTypeWrapper(this);
    }
}
