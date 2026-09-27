package com.unity3d.ads.core.domain.billing;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ProductDetailsResult {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Failure extends ProductDetailsResult {

        @l
        private final BillingResultBridge billingResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(@l BillingResultBridge billingResult) {
            super(null);
            m0.p(billingResult, "billingResult");
            this.billingResult = billingResult;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, BillingResultBridge billingResultBridge, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                billingResultBridge = failure.billingResult;
            }
            return failure.copy(billingResultBridge);
        }

        @l
        public final BillingResultBridge component1() {
            return this.billingResult;
        }

        @l
        public final Failure copy(@l BillingResultBridge billingResult) {
            m0.p(billingResult, "billingResult");
            return new Failure(billingResult);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && m0.g(this.billingResult, ((Failure) obj).billingResult);
        }

        @l
        public final BillingResultBridge getBillingResult() {
            return this.billingResult;
        }

        public int hashCode() {
            return this.billingResult.hashCode();
        }

        @l
        public String toString() {
            return "Failure(billingResult=" + this.billingResult + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class NotFound extends ProductDetailsResult {

        @l
        public static final NotFound INSTANCE = new NotFound();

        private NotFound() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Success extends ProductDetailsResult {

        @l
        private final String productDetailsJson;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@l String productDetailsJson) {
            super(null);
            m0.p(productDetailsJson, "productDetailsJson");
            this.productDetailsJson = productDetailsJson;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = success.productDetailsJson;
            }
            return success.copy(str);
        }

        @l
        public final String component1() {
            return this.productDetailsJson;
        }

        @l
        public final Success copy(@l String productDetailsJson) {
            m0.p(productDetailsJson, "productDetailsJson");
            return new Success(productDetailsJson);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && m0.g(this.productDetailsJson, ((Success) obj).productDetailsJson);
        }

        @l
        public final String getProductDetailsJson() {
            return this.productDetailsJson;
        }

        public int hashCode() {
            return this.productDetailsJson.hashCode();
        }

        @l
        public String toString() {
            return "Success(productDetailsJson=" + this.productDetailsJson + ')';
        }
    }

    public /* synthetic */ ProductDetailsResult(x xVar) {
        this();
    }

    private ProductDetailsResult() {
    }
}
