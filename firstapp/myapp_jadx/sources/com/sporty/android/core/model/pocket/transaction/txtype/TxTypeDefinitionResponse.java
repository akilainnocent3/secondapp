package com.sporty.android.core.model.pocket.transaction.txtype;

import com.appsflyer.internal.p;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bÊ\u0001\u0002\b\u0018¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/pocket/transaction/txtype/TxTypeDefinitionResponse;", "", "definitions", "", "Lcom/sporty/android/core/model/pocket/transaction/txtype/TxTypeDefinitionMap;", "<init>", "(Ljava/util/List;)V", "getDefinitions", "()Ljava/util/List;", "tradeCodeDefinition", "getTradeCodeDefinition", "()Lcom/sporty/android/core/model/pocket/transaction/txtype/TxTypeDefinitionMap;", "bizTypeDefinition", "getBizTypeDefinition", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TxTypeDefinitionResponse {
    private final List<TxTypeDefinitionMap> definitions;

    public TxTypeDefinitionResponse(List<TxTypeDefinitionMap> list) {
        list.getClass();
        this.definitions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TxTypeDefinitionResponse copy$default(TxTypeDefinitionResponse txTypeDefinitionResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = txTypeDefinitionResponse.definitions;
        }
        return txTypeDefinitionResponse.copy(list);
    }

    public final List<TxTypeDefinitionMap> component1() {
        return this.definitions;
    }

    public final TxTypeDefinitionResponse copy(List<TxTypeDefinitionMap> definitions) {
        definitions.getClass();
        return new TxTypeDefinitionResponse(definitions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TxTypeDefinitionResponse) && Intrinsics.g(this.definitions, ((TxTypeDefinitionResponse) other).definitions);
    }

    public final TxTypeDefinitionMap getBizTypeDefinition() {
        Object next;
        Iterator<T> it = this.definitions.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((TxTypeDefinitionMap) next).getName() == TxTypeDefinitionType.BIZ_TYPE) {
                return (TxTypeDefinitionMap) next;
            }
        }
        next = null;
        return (TxTypeDefinitionMap) next;
    }

    public final List<TxTypeDefinitionMap> getDefinitions() {
        return this.definitions;
    }

    public final TxTypeDefinitionMap getTradeCodeDefinition() {
        Object next;
        Iterator<T> it = this.definitions.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((TxTypeDefinitionMap) next).getName() == TxTypeDefinitionType.TRADE_CODE) {
                return (TxTypeDefinitionMap) next;
            }
        }
        next = null;
        return (TxTypeDefinitionMap) next;
    }

    public int hashCode() {
        return this.definitions.hashCode();
    }

    public String toString() {
        return p.a("TxTypeDefinitionResponse(definitions=", ")", this.definitions);
    }
}
