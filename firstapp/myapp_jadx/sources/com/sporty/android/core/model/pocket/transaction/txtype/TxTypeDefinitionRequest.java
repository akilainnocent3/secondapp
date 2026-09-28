package com.sporty.android.core.model.pocket.transaction.txtype;

import com.appsflyer.internal.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bÊ\u0001\u0002\b\u0014¨\u0006\u0013"}, d2 = {"Lcom/sporty/android/core/model/pocket/transaction/txtype/TxTypeDefinitionRequest;", "", "definitions", "", "Lcom/sporty/android/core/model/pocket/transaction/txtype/TxTypeDefinitionTypeWrapper;", "<init>", "(Ljava/util/List;)V", "getDefinitions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TxTypeDefinitionRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final TxTypeDefinitionRequest allType = new TxTypeDefinitionRequest(b.k(TxTypeDefinitionType.TRADE_CODE.getWrapper(), TxTypeDefinitionType.BIZ_TYPE.getWrapper()));
    private final List<TxTypeDefinitionTypeWrapper> definitions;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/core/model/pocket/transaction/txtype/TxTypeDefinitionRequest$Companion;", "", "<init>", "()V", "allType", "Lcom/sporty/android/core/model/pocket/transaction/txtype/TxTypeDefinitionRequest;", "getAllType", "()Lcom/sporty/android/core/model/pocket/transaction/txtype/TxTypeDefinitionRequest;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TxTypeDefinitionRequest getAllType() {
            return TxTypeDefinitionRequest.allType;
        }

        private Companion() {
        }
    }

    public TxTypeDefinitionRequest(List<TxTypeDefinitionTypeWrapper> list) {
        list.getClass();
        this.definitions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TxTypeDefinitionRequest copy$default(TxTypeDefinitionRequest txTypeDefinitionRequest, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = txTypeDefinitionRequest.definitions;
        }
        return txTypeDefinitionRequest.copy(list);
    }

    public final List<TxTypeDefinitionTypeWrapper> component1() {
        return this.definitions;
    }

    public final TxTypeDefinitionRequest copy(List<TxTypeDefinitionTypeWrapper> definitions) {
        definitions.getClass();
        return new TxTypeDefinitionRequest(definitions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TxTypeDefinitionRequest) && Intrinsics.g(this.definitions, ((TxTypeDefinitionRequest) other).definitions);
    }

    public final List<TxTypeDefinitionTypeWrapper> getDefinitions() {
        return this.definitions;
    }

    public int hashCode() {
        return this.definitions.hashCode();
    }

    public String toString() {
        return p.a("TxTypeDefinitionRequest(definitions=", ")", this.definitions);
    }
}
