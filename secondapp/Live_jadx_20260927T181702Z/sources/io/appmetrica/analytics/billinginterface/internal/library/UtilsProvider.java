package io.appmetrica.analytics.billinginterface.internal.library;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoSender;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface UtilsProvider {
    @NonNull
    BillingInfoManager getBillingInfoManager();

    @NonNull
    BillingInfoSender getBillingInfoSender();

    @NonNull
    Executor getUiExecutor();

    @NonNull
    UpdatePolicy getUpdatePolicy();

    @NonNull
    Executor getWorkerExecutor();
}
