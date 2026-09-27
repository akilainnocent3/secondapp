package com.unity3d.ads.core.domain.events;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import or.f;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface GetTransactionRequest {
    @m
    Object invoke(@l List<TransactionEventRequestOuterClass.TransactionData> list, @l String str, @l TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, @l f<? super TransactionEventRequestOuterClass.TransactionEventRequest> fVar);
}
