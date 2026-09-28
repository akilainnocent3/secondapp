package com.sporty.android.core.model.pocket.transaction.txtype;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\u0002\b\u0018¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/pocket/transaction/txtype/TxTypeDefinitionMap;", "", "name", "Lcom/sporty/android/core/model/pocket/transaction/txtype/TxTypeDefinitionType;", "enumerations", "", "Lcom/sporty/android/core/model/pocket/transaction/txtype/TxTypeDefinitionPair;", "<init>", "(Lcom/sporty/android/core/model/pocket/transaction/txtype/TxTypeDefinitionType;Ljava/util/List;)V", "getName", "()Lcom/sporty/android/core/model/pocket/transaction/txtype/TxTypeDefinitionType;", "getEnumerations", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TxTypeDefinitionMap {
    private final List<TxTypeDefinitionPair> enumerations;
    private final TxTypeDefinitionType name;

    public TxTypeDefinitionMap(TxTypeDefinitionType txTypeDefinitionType, List<TxTypeDefinitionPair> list) {
        txTypeDefinitionType.getClass();
        list.getClass();
        this.name = txTypeDefinitionType;
        this.enumerations = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TxTypeDefinitionMap copy$default(TxTypeDefinitionMap txTypeDefinitionMap, TxTypeDefinitionType txTypeDefinitionType, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            txTypeDefinitionType = txTypeDefinitionMap.name;
        }
        if ((i & 2) != 0) {
            list = txTypeDefinitionMap.enumerations;
        }
        return txTypeDefinitionMap.copy(txTypeDefinitionType, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TxTypeDefinitionType getName() {
        return this.name;
    }

    public final List<TxTypeDefinitionPair> component2() {
        return this.enumerations;
    }

    public final TxTypeDefinitionMap copy(TxTypeDefinitionType name, List<TxTypeDefinitionPair> enumerations) {
        name.getClass();
        enumerations.getClass();
        return new TxTypeDefinitionMap(name, enumerations);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TxTypeDefinitionMap)) {
            return false;
        }
        TxTypeDefinitionMap txTypeDefinitionMap = (TxTypeDefinitionMap) other;
        return this.name == txTypeDefinitionMap.name && Intrinsics.g(this.enumerations, txTypeDefinitionMap.enumerations);
    }

    public final List<TxTypeDefinitionPair> getEnumerations() {
        return this.enumerations;
    }

    public final TxTypeDefinitionType getName() {
        return this.name;
    }

    public int hashCode() {
        return this.enumerations.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return "TxTypeDefinitionMap(name=" + this.name + ", enumerations=" + this.enumerations + ")";
    }
}
