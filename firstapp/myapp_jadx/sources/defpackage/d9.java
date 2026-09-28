package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.patron.DocumentAuditStatus;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.auth.SportyAccountManagerLegacyHelper;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.user.SelfExclusionDialogActivity;
import com.sportybet.feature.playTimeControlDialog.PlayTimeControlDialogActivity;
import com.sportybet.ntespm.socket.MultiTopic;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.plugin.webcontainer.activities.WebViewActivity;
import com.sportybet.plugin.webcontainer.utils.WebViewActivityUtils;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class d9 implements Subscriber, qti, i8 {
    public MultiTopic a;
    public AlertDialog b;
    public final uqm d;
    public final psm e;
    public final str<xxz> f;
    public final mgb0 i;
    public final k650 w;
    public final str<tta> y;
    public Timer c = null;
    public final Handler v = new Handler(Looper.getMainLooper());

    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_ACCOUNT);
            aVar.a("run AccountLockedTimer", new Object[0]);
            d9 d9Var = d9.this;
            if (d9Var.d.getAccount() == null) {
                aVar.q(MyLog.TAG_ACCOUNT);
                aVar.a("no login", new Object[0]);
            } else {
                aVar.q(MyLog.TAG_ACCOUNT);
                aVar.l("checkAccountLocked()", new Object[0]);
                d9Var.f.get().U0().G(new c9(d9Var));
            }
        }
    }

    public d9(uqm uqmVar, psm psmVar, str<xxz> strVar, mgb0 mgb0Var, k650 k650Var, str<tta> strVar2) {
        this.d = uqmVar;
        this.e = psmVar;
        this.f = strVar;
        this.i = mgb0Var;
        this.y = strVar2;
        this.w = k650Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Activity activity) {
        boolean z;
        boolean z2 = false;
        psm psmVar = this.e;
        if (activity != 0 && !activity.isFinishing()) {
            uqm uqmVar = this.d;
            if (uqmVar.isLogin() && oti.c().c) {
                if (psmVar.W() && uqmVar.isSelfExclusionTimeOut()) {
                    z = activity instanceof cw;
                } else if (activity instanceof pwx) {
                    z = true;
                } else {
                    if (activity instanceof WebViewActivity) {
                        String url = ((WebViewActivity) activity).getUrl();
                        if (!TextUtils.isEmpty(url) && (url.contains("/m/help#/how-to-play/others/how-to-withdraw") || url.contains(WebViewActivityUtils.URL_HOW_TO_PLAY_TRANSACTIONS_HISTORY) || url.contains("/m/help#/how-to-play/others/how-to-withdraw") || url.contains("/m/wv/kyc_collect"))) {
                            z = true;
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (psmVar.W() && (activity instanceof fb90)) {
                        z2 = !((fb90) activity).J0();
                    }
                    if (z2) {
                        ((fb90) activity).F(true);
                        c();
                        return;
                    }
                }
                if (!z && (yrh0.m() || this.i.getCachedSelfExclusionType().contains("ops"))) {
                    c();
                    return;
                }
                if (!(activity instanceof r1k) || psmVar.r() || (activity instanceof zux)) {
                    return;
                }
                if (activity instanceof WebViewActivity) {
                    String url2 = ((WebViewActivity) activity).getUrl();
                    if (!TextUtils.isEmpty(url2) && (url2.contains("/m/help#/how-to-play/others/how-to-withdraw") || url2.contains(WebViewActivityUtils.URL_HOW_TO_PLAY_TRANSACTIONS_HISTORY) || url2.contains("/m/help#/how-to-play/others/how-to-withdraw") || url2.contains("/m/wv/kyc_collect"))) {
                        return;
                    }
                }
                e(activity);
                return;
            }
        }
        if (psmVar.W() && (activity instanceof fb90)) {
            ((fb90) activity).F(false);
        }
    }

    public final AlertDialog b(final Activity activity) {
        return new AlertDialog.Builder(activity).setCancelable(false).setTitle(sn5.b(activity, R.string.pc_home__account_locked, new Object[0])).setMessage(sn5.b(activity, R.string.pc_home__your_account_is_currently_not_accessible, new Object[0])).setPositiveButton(sn5.b(activity, R.string.common_functions__ok, new Object[0]), new DialogInterface.OnClickListener() { // from class: z8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                d9 d9Var = this.a;
                AlertDialog alertDialog = d9Var.b;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                    d9Var.b = null;
                }
                activity.finishAffinity();
            }
        }).create();
    }

    public final void c() {
        if (this.e.W() && !this.i.getCachedSelfExclusionType().isEmpty()) {
            yrh0.s(hp0.A, new Intent(hp0.A, (Class<?>) PlayTimeControlDialogActivity.class), true);
        } else {
            Intent intent = new Intent(hp0.A, (Class<?>) SelfExclusionDialogActivity.class);
            intent.putExtra("self_exclusion_type", this.i.getCachedSelfExclusionType());
            yrh0.s(hp0.A, intent, true);
        }
    }

    public final void d() {
        try {
            this.d.logout();
            Activity activityE = oti.c().e();
            if (activityE == null || (activityE instanceof xux)) {
                return;
            }
            AlertDialog alertDialogB = b(activityE);
            this.b = alertDialogB;
            alertDialogB.show();
        } catch (Exception unused) {
        }
    }

    public final void e(final Activity activity) {
        int documentAuditStatus;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_ACCOUNT);
        aVar.a("%s check annoying dialog", activity.getClass().getSimpleName());
        AccountHelperEntryPointImpl accountHelperEntryPointImpl = yta.a;
        int userCertStatus = accountHelperEntryPointImpl.getAccountHelper().getUserCertStatus();
        psm psmVar = this.e;
        if (userCertStatus == 370) {
            psm psmVar2 = yta.b;
            if ((psmVar2.x() || psmVar2.a0()) && ((!psmVar.x() || ((documentAuditStatus = SportyAccountManagerLegacyHelper.getDocumentAuditStatus(this.i)) != DocumentAuditStatus.SUBMITTED.getValue() && documentAuditStatus != DocumentAuditStatus.APPROVED.getValue())) && !activity.isFinishing())) {
                aVar.q(MyLog.TAG_ACCOUNT);
                aVar.a("%s show ReConfirmAccount annoying dialog", activity.getClass().getSimpleName());
                final a9 a9Var = new a9(this, activity);
                if (!(activity instanceof e)) {
                    activity = null;
                }
                e eVar = (e) activity;
                if (eVar == null) {
                    return;
                }
                FragmentManager supportFragmentManager = eVar.getSupportFragmentManager();
                supportFragmentManager.getClass();
                if (supportFragmentManager.H("IdReVerificationDialog") != null) {
                    return;
                }
                supportFragmentManager.n0("IdReVerificationDialogFragment - request", eVar, new qxi() { // from class: b7n
                    @Override // defpackage.qxi
                    public final void a(String str, Bundle bundle) {
                        bundle.getClass();
                        if (str.equals("IdReVerificationDialogFragment - request") && bundle.getBoolean("key - result submit")) {
                            a9Var.invoke();
                        }
                    }
                });
                cr0.a(new c7n(), supportFragmentManager, "IdReVerificationDialog");
                return;
            }
        }
        int userCertStatus2 = accountHelperEntryPointImpl.getAccountHelper().getUserCertStatus();
        if ((userCertStatus2 == 320 || userCertStatus2 == 310) && !activity.isFinishing() && !psmVar.x() && (activity instanceof e)) {
            int userCertStatus3 = this.d.getUserCertStatus();
            psm psmVar3 = yta.b;
            final int i = 2000;
            if (!psmVar3.x() && !psmVar3.a0() && userCertStatus3 == 310) {
                i = 1000;
            }
            aVar.q(MyLog.TAG_ACCOUNT);
            aVar.a("%s show ConfirmAccount annoying dialog", activity.getClass().getSimpleName());
            this.y.get().b((e) activity, new Function0() { // from class: b9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Activity activity2 = activity;
                    if (activity2.isFinishing()) {
                        return Unit.a;
                    }
                    f00 f00Var = vgb0.a;
                    Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(AnalyticsParam.EVENT_PARAM_STEP, "complete_account_info_click")};
                    HashMap map = new HashMap(1);
                    Map.Entry entry = entryArr[0];
                    Object key = entry.getKey();
                    if (w1k.a(key, entry, map, key) != null) {
                        hb5.a(wga.a(key, "duplicate key: "));
                        return null;
                    }
                    vgb0.c(AnalyticsEvent.DEPOSIT_CONFIRM_NAME, Collections.unmodifiableMap(map), true);
                    ble.a(activity2, this.a.e, i);
                    return Unit.a;
                }
            });
        }
    }

    @Override // defpackage.i8
    public final void onAccountChange(Account account) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_ACCOUNT);
        aVar.a("AccountLockedManager, onAccountChange", new Object[0]);
        if (account == null) {
            ComponentCallbacks2 componentCallbacks2E = oti.c().e();
            if (componentCallbacks2E instanceof fb90) {
                ((fb90) componentCallbacks2E).F(false);
            }
            if (this.a != null) {
                SocketPushManager.getInstance().unsubscribeTopic(this.a, this);
                this.a = null;
                return;
            }
            return;
        }
        String userId = this.d.getUserId();
        MultiTopic multiTopic = this.a;
        if (multiTopic == null || !multiTopic.getAccountId().equals(account.name)) {
            if (this.a != null) {
                SocketPushManager.getInstance().unsubscribeTopic(this.a, this);
            }
            if (TextUtils.isEmpty(userId)) {
                return;
            }
            this.a = new MultiTopic("personal_topic", userId);
            if (oti.c().c) {
                SocketPushManager.getInstance().subscribeTopic(this.a, this);
            }
        }
    }

    @Override // defpackage.qti
    public final void onActivityDestroyed(Activity activity) {
        AlertDialog alertDialog = this.b;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.b.dismiss();
            this.b = null;
        }
        this.v.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.qti
    public final void onActivityResumed(Activity activity) {
        if (activity.isFinishing()) {
            return;
        }
        a(activity);
    }

    @Override // defpackage.qti
    public final void onBecameBackground() {
        if (this.a != null) {
            SocketPushManager.getInstance().unsubscribeTopic(this.a, this);
        }
    }

    @Override // defpackage.qti
    public final void onBecameForeground() {
        if (this.a != null) {
            SocketPushManager.getInstance().subscribeTopic(this.a, this);
        }
    }

    @Override // com.sportybet.ntespm.socket.Subscriber
    public final void onReceive(String str) {
        mgb0 mgb0Var = this.i;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_ACCOUNT);
        aVar.a("AccountLockedManager, onReceive =%s", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            String string = jSONObject2.getString("selfExclusionType");
            String str2 = "0";
            long jLongValue = 0;
            try {
                String strOptString = jSONObject2.optString("selfExclusionStartDate", "0");
                if (strOptString != null) {
                    str2 = strOptString;
                }
                if (!StringsKt.U(str2)) {
                    jLongValue = new BigDecimal(str2).longValue();
                }
            } catch (Exception e) {
                itf0.a.n(inm.a("Failed to getLong for key=selfExclusionStartDate, error=", e.getMessage()), new Object[0]);
            }
            mgb0Var.setSelfExclusionType(string);
            boolean zContains = string.contains("ops");
            if ("user_forbidden".equals(jSONObject.getString("type"))) {
                if (!zContains) {
                    d();
                } else if (mgb0Var.getLoginTime() > jLongValue) {
                    mgb0Var.setSelfExclusionType("");
                } else {
                    a(oti.c().e());
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // defpackage.qti
    public final void onActivityCreated(Activity activity) {
    }
}
