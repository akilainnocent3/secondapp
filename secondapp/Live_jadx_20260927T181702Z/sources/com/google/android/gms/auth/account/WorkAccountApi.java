package com.google.android.gms.auth.account;

import android.accounts.Account;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface WorkAccountApi {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Deprecated
    public interface AddAccountResult extends Result {
        @NonNull
        Account getAccount();
    }

    @NonNull
    @Deprecated
    PendingResult<AddAccountResult> addWorkAccount(@NonNull GoogleApiClient googleApiClient, @NonNull String str);

    @NonNull
    @Deprecated
    PendingResult<Result> removeWorkAccount(@NonNull GoogleApiClient googleApiClient, @NonNull Account account);

    @Deprecated
    void setWorkAuthenticatorEnabled(@NonNull GoogleApiClient googleApiClient, boolean z10);

    @NonNull
    @Deprecated
    PendingResult<Result> setWorkAuthenticatorEnabledWithResult(@NonNull GoogleApiClient googleApiClient, boolean z10);
}
