package com.sporty.android.core.model.pocket.transaction.txtype;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u000eHÖ\u0081\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\u0002\b\u0012¨\u0006\u0011"}, d2 = {"Lcom/sporty/android/core/model/pocket/transaction/txtype/TxTypeDefinitionTypeWrapper;", "", "name", "Lcom/sporty/android/core/model/pocket/transaction/txtype/TxTypeDefinitionType;", "<init>", "(Lcom/sporty/android/core/model/pocket/transaction/txtype/TxTypeDefinitionType;)V", "getName", "()Lcom/sporty/android/core/model/pocket/transaction/txtype/TxTypeDefinitionType;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TxTypeDefinitionTypeWrapper {
    private final TxTypeDefinitionType name;

    public TxTypeDefinitionTypeWrapper(TxTypeDefinitionType txTypeDefinitionType) {
        txTypeDefinitionType.getClass();
        this.name = txTypeDefinitionType;
    }

    public static /* synthetic */ TxTypeDefinitionTypeWrapper copy$default(TxTypeDefinitionTypeWrapper txTypeDefinitionTypeWrapper, TxTypeDefinitionType txTypeDefinitionType, int i, Object obj) {
        if ((i & 1) != 0) {
            txTypeDefinitionType = txTypeDefinitionTypeWrapper.name;
        }
        return txTypeDefinitionTypeWrapper.copy(txTypeDefinitionType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TxTypeDefinitionType getName() {
        return this.name;
    }

    public final TxTypeDefinitionTypeWrapper copy(TxTypeDefinitionType name) {
        name.getClass();
        return new TxTypeDefinitionTypeWrapper(name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TxTypeDefinitionTypeWrapper) && this.name == ((TxTypeDefinitionTypeWrapper) other).name;
    }

    public final TxTypeDefinitionType getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return "TxTypeDefinitionTypeWrapper(name=" + this.name + ")";
    }
}
