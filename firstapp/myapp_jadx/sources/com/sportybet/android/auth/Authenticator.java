package com.sportybet.android.auth;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.sportybet.android.account.international.INTAuthActivity;
import defpackage.c8b;
import defpackage.hp0;
import defpackage.hwr;
import defpackage.psm;

/* JADX INFO: loaded from: classes5.dex */
public class Authenticator extends AbstractAccountAuthenticator {
    private static final psm countryManager = (psm) hwr.b(new c8b(0)).getValue();

    public Authenticator() {
        super(hp0.A.getApplicationContext());
    }

    private Context getContext() {
        return hp0.A.getApplicationContext();
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        Intent intent = new Intent(getContext(), (Class<?>) (countryManager.b0() ? INTAuthActivity.class : AuthActivity.class));
        intent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
        intent.putExtra(AuthActivity.KEY_IS_SIGN_UP, bundle.getBoolean(AuthActivity.KEY_IS_SIGN_UP));
        intent.putExtra("KEY_RETURN_TO_CALLER_AFTER_REGISTER", bundle.getBoolean("KEY_RETURN_TO_CALLER_AFTER_REGISTER", false));
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("intent", intent);
        return bundle2;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        String strPeekAuthToken = AccountManager.get(getContext()).peekAuthToken(account, str);
        if (TextUtils.isEmpty(strPeekAuthToken)) {
            Intent intent = new Intent(getContext(), (Class<?>) (countryManager.b0() ? INTAuthActivity.class : AuthActivity.class));
            intent.putExtra("accountAuthenticatorResponse", accountAuthenticatorResponse);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("intent", intent);
            return bundle2;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putString("authAccount", account.name);
        bundle3.putString("accountType", account.type);
        bundle3.putString("authtoken", strPeekAuthToken);
        return bundle3;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public String getAuthTokenLabel(String str) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
        return null;
    }

    @Override // android.accounts.AbstractAccountAuthenticator
    public Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        return null;
    }
}
