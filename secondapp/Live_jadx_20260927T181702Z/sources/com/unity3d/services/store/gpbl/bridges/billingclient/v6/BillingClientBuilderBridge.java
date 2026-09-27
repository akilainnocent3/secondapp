package com.unity3d.services.store.gpbl.bridges.billingclient.v6;

import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import dr.v1;
import fr.n1;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nBillingClientBuilderBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillingClientBuilderBridge.kt\ncom/unity3d/services/store/gpbl/bridges/billingclient/v6/BillingClientBuilderBridge\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,31:1\n26#2:32\n*S KotlinDebug\n*F\n+ 1 BillingClientBuilderBridge.kt\ncom/unity3d/services/store/gpbl/bridges/billingclient/v6/BillingClientBuilderBridge\n*L\n9#1:32\n*E\n"})
public final class BillingClientBuilderBridge extends BillingClientBuilderBridgeCommon {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    public static final String ENABLE_PENDING_PURCHASES_METHOD = "enablePendingPurchases";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    public BillingClientBuilderBridge(@m Object obj) {
        super(obj, n1.M(v1.a("enablePendingPurchases", new Class[0])));
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    @l
    public IBillingClientBuilderBridge enablePendingPurchases() {
        this._billingClientBuilderInternalInstance = callNonVoidMethod("enablePendingPurchases", this._billingClientBuilderInternalInstance, new Object[0]);
        return this;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge
    @l
    public BillingClientBridgeCommon build() throws ClassNotFoundException {
        return new BillingClientBridge(callNonVoidMethod("build", this._billingClientBuilderInternalInstance, new Object[0]));
    }
}
