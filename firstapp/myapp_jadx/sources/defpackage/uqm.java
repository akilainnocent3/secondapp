package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import com.sporty.android.core.model.account.AccountInfo;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
public interface uqm {

    public interface a {
        void a(boolean z);
    }

    void addAccountChangeListener(i8 i8Var);

    void addLoginEventListener(lit litVar);

    void addLogoutEventListener(fjt fjtVar);

    void addOnRefreshTokenListener(zoy zoyVar);

    void bindFCMToken();

    @Deprecated(since = "Deprecated, holds references to android activity. Use requestLogin from SportyAccountManager instead")
    void demandAccount(Activity activity, tit titVar);

    void demandAccount(Activity activity, tit titVar, Bundle bundle);

    void demandNewAccount(Activity activity, tit titVar);

    void demandNewAccount(Activity activity, tit titVar, Bundle bundle);

    void fetchMyFavorite();

    String fetchRefreshToken();

    String getAccessToken();

    Account getAccount();

    @Deprecated(since = "Leverage the account info flow from SportyAccountManager")
    AccountInfo getAccountInfo();

    @Deprecated(since = "Deprecated in favor of IAccountPreferencesStore")
    String getAvatarPath();

    String getAvatarUrl();

    @Deprecated(since = "Deprecated in favor of IAccountPreferencesStore")
    String getLanguageCode();

    String getLanguageCodeForBetRadar();

    String getLanguageName();

    String getLanguageSocketSuffix();

    String getLastAccessToken();

    @Deprecated(since = "Deprecated in favor of IAccountPreferencesStore")
    String getLastAccount();

    @Deprecated(since = "Deprecated in favor of IAccountPreferencesStore")
    String getLastNickName();

    @Deprecated(since = "Deprecated in favor of IAccountPreferencesStore")
    String getLastUserId();

    boolean getNickNameVerified();

    String getPhoneNumber();

    boolean getRegisterStatus();

    String getSelfExclusionType();

    @Deprecated(since = "Deprecated in favor of IAccountPreferencesStore")
    long getSelfExclusionUTCTimeStamp();

    @Deprecated(since = "Deprecated in favor of IAccountPreferencesStore")
    int getUserCertStatus();

    @Deprecated(since = "Deprecated in favor of IAccountPreferencesStore")
    String getUserId();

    boolean hasPersonalPage();

    boolean isLogin();

    boolean isSelfExclusionTimeOut();

    @Deprecated(since = "Replaced by SportyAccountManager.getAccountFlow")
    void loadAccountInfo(w8 w8Var);

    void logout();

    String refreshAccessToken();

    String refreshAccessToken(String str);

    void refreshMyFavoriteSelectedSports();

    void refreshMyFavoriteSelectedSports(gv5<?> gv5Var);

    void removeAccountChangeListener(i8 i8Var);

    void removeLoginEventListener(lit litVar);

    void removeLogoutEventListener(fjt fjtVar);

    @Deprecated(since = "Deprecated in favor of IAccountPreferencesStore")
    void saveNickName(String str);

    void saveToken(irm irmVar, vqm vqmVar);

    void saveToken(irm irmVar, vqm vqmVar, a aVar);

    void setCustomDefaultStake(BigDecimal bigDecimal);

    void setLanguage(String str);

    void setOnRefreshAssetListener(yoy yoyVar);

    void setRegisterStatus(boolean z);
}
