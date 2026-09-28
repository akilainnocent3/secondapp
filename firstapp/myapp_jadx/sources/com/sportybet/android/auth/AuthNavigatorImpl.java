package com.sportybet.android.auth;

import android.content.Context;
import android.content.Intent;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.account.international.INTAuthActivity;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000B\t\b\u0007¢\u0006\u0004\b\u0001\u0010\u0002J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0014J'\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/sportybet/android/auth/AuthNavigatorImpl;", "<init>", "()V", "Landroid/content/Context;", "context", "", "mobile", "token", AnalyticsEvent.BI_TRACKING_KIND_EVENT, "", "navigateToForgetPassword", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "navigateToForgetPasswordWithOTP", "(Landroid/content/Context;Ljava/lang/String;)V", "", "isSignUp", "isForgetPassword", "launchINTAuthActivity", "(Landroid/content/Context;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "isIdentityVerify", "(Landroid/content/Context;Z)V", "launchAuthActivity", "(Landroid/content/Context;Ljava/lang/String;Z)V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AuthNavigatorImpl {
    public static final int $stable = 0;

    public void launchAuthActivity(Context context, String mobile, boolean isIdentityVerify) {
        context.getClass();
        mobile.getClass();
        Intent intent = new Intent(context, (Class<?>) AuthActivity.class);
        intent.putExtra("mobile", mobile);
        intent.putExtra(AuthActivity.KEY_IS_IDENTITY_VERIFY, isIdentityVerify);
        context.startActivity(intent);
    }

    public void launchINTAuthActivity(Context context, Boolean isSignUp, Boolean isForgetPassword) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) INTAuthActivity.class);
        intent.putExtra(AuthActivity.KEY_IS_SIGN_UP, isSignUp);
        intent.putExtra(AuthActivity.KEY_IS_FORGET_PASSWORD, isForgetPassword);
        context.startActivity(intent);
    }

    public void navigateToForgetPassword(Context context, String mobile, String token, String event) {
        context.getClass();
        mobile.getClass();
        token.getClass();
        event.getClass();
        Intent intent = new Intent(context, (Class<?>) AuthActivity.class);
        intent.putExtra("mobile", mobile);
        intent.putExtra("token", token);
        intent.putExtra("triggered_event", event);
        context.startActivity(intent);
    }

    public void navigateToForgetPasswordWithOTP(Context context, String mobile) {
        context.getClass();
        mobile.getClass();
        Intent intent = new Intent(context, (Class<?>) AuthActivity.class);
        intent.putExtra("mobile", mobile);
        intent.putExtra(AuthActivity.KEY_IS_IDENTITY_VERIFY, true);
        context.startActivity(intent);
    }

    public void launchINTAuthActivity(Context context, boolean isIdentityVerify) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) INTAuthActivity.class);
        intent.putExtra(AuthActivity.KEY_IS_IDENTITY_VERIFY, isIdentityVerify);
        context.startActivity(intent);
    }
}
