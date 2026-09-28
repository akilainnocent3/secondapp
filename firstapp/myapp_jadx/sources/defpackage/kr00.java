package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import com.sporty.android.core.model.dateofbirth.DobVerificationReminderData;
import com.sporty.android.platform.features.account.addemailprompt.AddEmailPromptBottomSheetActivity;
import com.sporty.android.platform.features.security.newdevicelogin.loginalert.LoginAlertActivity;
import com.sportybet.android.auth.AuthNavigatorImpl;
import com.sportybet.android.gp.tz.R;
import com.sportybet.core.domain.model.a;
import com.sportybet.core.domain.model.b;
import com.sportybet.core.domain.model.c;
import com.sportybet.feature.devicemanagement.impl.ui.deviceblockingdialog.DeviceBlockingAlertDialogActivity;
import com.sportybet.ntespm.socket.MultiTopic;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.SpecialTopic;
import com.sportybet.ntespm.socket.Subscriber;
import com.twilio.voice.EventKeys;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class kr00 implements Subscriber, qti, i8, nym {
    public Boolean A;
    public Boolean B;
    public MultiTopic C;
    public MultiTopic D;
    public SpecialTopic E;
    public boolean G;
    public final u2u a;
    public final ysm b;
    public final psm c;
    public final AuthNavigatorImpl d;
    public final mq00 e;
    public final uqm f;
    public final rym i;
    public final mkr v;
    public final fh w;
    public Boolean z;
    public final ConcurrentHashMap<mr00, JSONObject> y = new ConcurrentHashMap<>();
    public final Handler F = new Handler(Looper.getMainLooper());
    public final Set<mr00> H = ay0.V(new mr00[]{mr00.NewDeviceLogin, mr00.VerifyIdentityOtp, mr00.NinDobReverify, mr00.DeviceBlocking});
    public final br00 I = new Runnable() { // from class: br00
        @Override // java.lang.Runnable
        public final void run() {
            kr00 kr00Var = this.a;
            AuthNavigatorImpl authNavigatorImpl = kr00Var.d;
            mq00 mq00Var = kr00Var.e;
            ConcurrentHashMap<mr00, JSONObject> concurrentHashMap = kr00Var.y;
            Activity activityE = oti.c().e();
            if (activityE == null || activityE.isFinishing()) {
                return;
            }
            Boolean bool = kr00Var.z;
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.g(bool, bool2) && (activityE instanceof py1)) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_PERSONAL_TOPIC);
                aVar.a("show 2FA prompt on: %s", activityE.getClass().getName());
                FragmentManager supportFragmentManager = ((py1) activityE).getSupportFragmentManager();
                supportFragmentManager.getClass();
                new vzg0().show(supportFragmentManager, "TwoFAPrompt");
                kr00Var.z = null;
                mr00 mr00Var = mr00.NewDeviceLogin;
                mq00Var.d("show_two_fa_prompt");
                return;
            }
            int i = 0;
            if (Intrinsics.g(kr00Var.B, bool2) && (activityE instanceof py1)) {
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_PERSONAL_TOPIC);
                aVar2.a("show 2FA success snackbar on: %s", activityE.getClass().getName());
                m4a0.b(activityE, ((py1) activityE).getCMSString(R.string.component_two_fa__setup_two_fa_success_message, new Object[0]), 96);
                kr00Var.B = null;
                mr00 mr00Var2 = mr00.NewDeviceLogin;
                mq00Var.d("show_two_fa_success_snackbar");
                return;
            }
            if (Intrinsics.g(kr00Var.A, bool2) && (activityE instanceof py1)) {
                itf0.a aVar3 = itf0.a;
                aVar3.q(MyLog.TAG_PERSONAL_TOPIC);
                aVar3.a("show add email prompt on: %s", activityE.getClass().getName());
                int i2 = AddEmailPromptBottomSheetActivity.c;
                ((py1) activityE).startActivity(new Intent(activityE, (Class<?>) AddEmailPromptBottomSheetActivity.class));
                kr00Var.A = null;
                mr00 mr00Var3 = mr00.NewDeviceLogin;
                mq00Var.d("show_add_email_prompt");
                return;
            }
            JSONObject jSONObject = concurrentHashMap.get(mr00.NewDeviceLogin);
            JSONObject jSONObject2 = concurrentHashMap.get(mr00.VerifyIdentityOtp);
            JSONObject jSONObject3 = concurrentHashMap.get(mr00.NinDobReverify);
            JSONObject jSONObject4 = concurrentHashMap.get(mr00.DeviceBlocking);
            if (jSONObject != null) {
                itf0.a aVar4 = itf0.a;
                aVar4.q(MyLog.TAG_PERSONAL_TOPIC);
                aVar4.a("new device login dialog: %s", activityE.getClass().getName());
                try {
                    if (!Intrinsics.g(kr00Var.b.a().a, jSONObject.getJSONObject("data").getString("deviceId"))) {
                        LastLoginDeviceInfo lastLoginDeviceInfoMapJSONObjectToLastDeviceInfo = LastLoginDeviceInfo.INSTANCE.mapJSONObjectToLastDeviceInfo(jSONObject);
                        int i3 = LoginAlertActivity.c;
                        if (lastLoginDeviceInfoMapJSONObjectToLastDeviceInfo != null) {
                            Intent intent = new Intent(activityE, (Class<?>) LoginAlertActivity.class);
                            intent.putExtra("device_info", lastLoginDeviceInfoMapJSONObjectToLastDeviceInfo);
                            activityE.startActivity(intent);
                        }
                    }
                } catch (JSONException e) {
                    itf0.a aVar5 = itf0.a;
                    aVar5.q(MyLog.TAG_PERSONAL_TOPIC);
                    aVar5.o(e);
                }
                concurrentHashMap.remove(mr00.NewDeviceLogin);
            } else if (jSONObject2 != null) {
                itf0.a aVar6 = itf0.a;
                aVar6.q(MyLog.TAG_PERSONAL_TOPIC);
                aVar6.a("show IdentityVerifyActivity on: %s", activityE.getClass().getName());
                try {
                    if (kr00Var.c.b0()) {
                        authNavigatorImpl.launchINTAuthActivity(activityE, true);
                    } else {
                        authNavigatorImpl.launchAuthActivity(activityE, kr00Var.f.getAccountInfo().getPhone(), true);
                    }
                } catch (Exception e2) {
                    itf0.a aVar7 = itf0.a;
                    aVar7.q(MyLog.TAG_PERSONAL_TOPIC);
                    aVar7.o(e2);
                }
                concurrentHashMap.remove(mr00.VerifyIdentityOtp);
            } else if (jSONObject3 != null) {
                itf0.a aVar8 = itf0.a;
                aVar8.q(MyLog.TAG_PERSONAL_TOPIC);
                aVar8.a("show DobVerificationReminderActivity on: %s", activityE.getClass().getName());
                try {
                    mq00Var.c(jSONObject3, DobVerificationReminderData.class, new gr00(activityE, i));
                } catch (Exception e3) {
                    itf0.a aVar9 = itf0.a;
                    aVar9.q(MyLog.TAG_PERSONAL_TOPIC);
                    aVar9.e(e3);
                }
                concurrentHashMap.remove(mr00.NinDobReverify);
            } else if (jSONObject4 != null) {
                itf0.a aVar10 = itf0.a;
                aVar10.q(MyLog.TAG_PERSONAL_TOPIC);
                aVar10.a("show DeviceBlockingDialogActivity on: %s", activityE.getClass().getName());
                try {
                    String strA = kfp.a(EventKeys.ERROR_MESSAGE, jSONObject4);
                    if (strA.length() > 0) {
                        int i4 = DeviceBlockingAlertDialogActivity.c;
                        Intent intent2 = new Intent(activityE, (Class<?>) DeviceBlockingAlertDialogActivity.class);
                        intent2.putExtra("alert_message", strA);
                        yrh0.s(activityE, intent2, true);
                    }
                } catch (Exception e4) {
                    itf0.a aVar11 = itf0.a;
                    aVar11.q(MyLog.TAG_PERSONAL_TOPIC);
                    aVar11.e(e4);
                }
                concurrentHashMap.remove(mr00.DeviceBlocking);
            }
            Iterator<T> it = kr00Var.H.iterator();
            while (it.hasNext()) {
                ej5.c(zu7.a(), null, null, new uq00(mq00Var, ((mr00) it.next()).a, null), 3);
            }
        }
    };

    /* JADX WARN: Type inference failed for: r1v6, types: [br00] */
    public kr00(u2u u2uVar, ysm ysmVar, psm psmVar, AuthNavigatorImpl authNavigatorImpl, mq00 mq00Var, uqm uqmVar, rym rymVar, mkr mkrVar, fh fhVar) {
        this.a = u2uVar;
        this.b = ysmVar;
        this.c = psmVar;
        this.d = authNavigatorImpl;
        this.e = mq00Var;
        this.f = uqmVar;
        this.i = rymVar;
        this.v = mkrVar;
        this.w = fhVar;
    }

    @Override // defpackage.nym
    public final void a() {
        c();
    }

    @Override // defpackage.nym
    public final void b() {
        if (this.G) {
            return;
        }
        this.G = true;
        uqm uqmVar = this.f;
        uqmVar.addAccountChangeListener(this);
        onAccountChange(uqmVar.getAccount());
        uqmVar.addOnRefreshTokenListener(new hr00(this));
        oti.c().a(this);
        Iterator<T> it = this.H.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            mq00 mq00Var = this.e;
            if (!zHasNext) {
                mr00 mr00Var = mr00.NewDeviceLogin;
                mq00Var.a("show_two_fa_prompt", new Function1() { // from class: dr00
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        this.a.z = bool;
                        return Unit.a;
                    }
                });
                mq00Var.a("show_two_fa_success_snackbar", new er00(this, 0));
                mq00Var.a("show_add_email_prompt", new Function1() { // from class: fr00
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        this.a.A = bool;
                        return Unit.a;
                    }
                });
                SocketPushManager.getInstance().addOnSubscribedListener(new ir00(this));
                SocketPushManager.getInstance().addOnUnsubscribedListener(new jr00(this));
                return;
            }
            mr00 mr00Var2 = (mr00) it.next();
            String str = mr00Var2.a;
            cr00 cr00Var = new cr00(this, mr00Var2);
            xq00 xq00Var = mq00Var.b;
            zu7.a aVar = zu7.a;
            v5b v5bVarA = zu7.a();
            oq00 oq00Var = new oq00(cr00Var, mq00Var, str);
            xq00Var.getClass();
            v5bVarA.getClass();
            xq00Var.a.c(str, "", oq00Var, v5bVarA);
        }
    }

    public final void c() {
        this.F.removeCallbacks(this.I);
        mr00 mr00Var = mr00.NewDeviceLogin;
        int i = 1;
        svc svcVar = new svc(this, i);
        mq00 mq00Var = this.e;
        mq00Var.a("show_two_fa_prompt", svcVar);
        mq00Var.a("show_two_fa_success_snackbar", new uvc(this, i));
        mq00Var.a("show_add_email_prompt", new vvc(this, i));
    }

    public final void d(mr00 mr00Var, JSONObject jSONObject) {
        this.y.put(mr00Var, jSONObject);
        String str = mr00Var.a;
        String string = jSONObject.toString();
        string.getClass();
        ej5.c(zu7.a(), null, null, new sq00(this.e, str, string, null), 3);
    }

    public final void e() {
        SocketPushManager socketPushManager = SocketPushManager.getInstance();
        MultiTopic multiTopic = this.C;
        if (multiTopic != null) {
            socketPushManager.unsubscribeTopic(multiTopic, this);
        }
        MultiTopic multiTopic2 = this.D;
        if (multiTopic2 != null) {
            socketPushManager.unsubscribeTopic(multiTopic2, this);
        }
        SpecialTopic specialTopic = this.E;
        if (specialTopic != null) {
            socketPushManager.unsubscribeTopic(specialTopic, this);
        }
    }

    @Override // defpackage.i8
    public final void onAccountChange(Account account) {
        mq00 mq00Var = this.e;
        wwd0 wwd0Var = mq00Var.h;
        if (account == null) {
            e();
            this.C = null;
            this.D = null;
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_PERSON_SOCKET_USE_CASE);
            aVar.a(inm.a("onLogout ", Thread.currentThread().getName()), new Object[0]);
            wwd0Var.setValue(mq00.b.C0875b.a);
            this.i.h();
            fh fhVar = this.w;
            ej5.c(fhVar.d, null, null, new dh(fhVar, null), 3);
            return;
        }
        String userId = this.f.getUserId();
        MultiTopic multiTopic = this.C;
        if (multiTopic == null || !Intrinsics.g(multiTopic.getAccountId(), account.name)) {
            MultiTopic multiTopic2 = this.D;
            if (multiTopic2 == null || !Intrinsics.g(multiTopic2.getAccountId(), account.name)) {
                e();
                if (userId == null || userId.length() == 0) {
                    return;
                }
                this.C = new MultiTopic("personal_topic", userId);
                this.D = new MultiTopic("bingowin_award_topic", userId);
                this.E = new SpecialTopic("personal_topic");
                if (oti.c().c) {
                    SocketPushManager socketPushManager = SocketPushManager.getInstance();
                    MultiTopic multiTopic3 = this.C;
                    if (multiTopic3 != null) {
                        socketPushManager.subscribeTopic(multiTopic3, this);
                    }
                    MultiTopic multiTopic4 = this.D;
                    if (multiTopic4 != null) {
                        socketPushManager.subscribeTopic(multiTopic4, this);
                    }
                    SpecialTopic specialTopic = this.E;
                    if (specialTopic != null) {
                        socketPushManager.subscribeTopic(specialTopic, this);
                    }
                }
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_PERSON_SOCKET_USE_CASE);
                aVar2.a(wga.a(wwd0Var.getValue(), "onLogin previous state "), new Object[0]);
                Object value = wwd0Var.getValue();
                mq00.b.a aVar3 = mq00.b.a.a;
                boolean zG = Intrinsics.g(value, aVar3);
                wwd0 wwd0Var2 = mq00Var.j;
                if (zG) {
                    Boolean bool = Boolean.FALSE;
                    wwd0Var2.getClass();
                    wwd0Var2.k(null, bool);
                } else {
                    Boolean bool2 = Boolean.TRUE;
                    wwd0Var2.getClass();
                    wwd0Var2.k(null, bool2);
                }
                aVar2.q(MyLog.TAG_PERSON_SOCKET_USE_CASE);
                aVar2.a(wga.a(wwd0Var2.getValue(), "isForcePromote "), new Object[0]);
                wwd0Var.setValue(aVar3);
            }
        }
    }

    @Override // defpackage.qti
    public final void onActivityCreated(Activity activity) {
        activity.getClass();
    }

    @Override // defpackage.qti
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qti
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        this.i.d(activity instanceof v420 ? ((v420) activity).E() : u420.i.a);
        c();
    }

    @Override // defpackage.qti
    public final void onBecameBackground() {
        e();
    }

    @Override // defpackage.qti
    public final void onBecameForeground() {
        SocketPushManager socketPushManager = SocketPushManager.getInstance();
        MultiTopic multiTopic = this.C;
        if (multiTopic != null) {
            socketPushManager.subscribeTopic(multiTopic, this);
        }
        MultiTopic multiTopic2 = this.D;
        if (multiTopic2 != null) {
            socketPushManager.subscribeTopic(multiTopic2, this);
        }
        SpecialTopic specialTopic = this.E;
        if (specialTopic != null) {
            socketPushManager.subscribeTopic(specialTopic, this);
        }
        c();
        fh fhVar = this.w;
        ej5.c(fhVar.d, null, null, new eh(fhVar, null), 3);
    }

    @Override // com.sportybet.ntespm.socket.Subscriber
    public final void onReceive(final String str) {
        str.getClass();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_PERSONAL_TOPIC);
        aVar.a("onReceive s = %s", str);
        mq00.b(new Function0() { // from class: ar00
            /* JADX WARN: Code duplicated, block: B:46:0x00f1  */
            /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
            /* JADX WARN: Code duplicated, block: B:50:0x0103  */
            /* JADX WARN: Code duplicated, block: B:51:0x0111  */
            /* JADX WARN: Code duplicated, block: B:52:0x011f  */
            /* JADX WARN: Code duplicated, block: B:53:0x012d  */
            /* JADX WARN: Code duplicated, block: B:54:0x0134  */
            /* JADX WARN: Code duplicated, block: B:55:0x0142  */
            /* JADX WARN: Code duplicated, block: B:56:0x0149  */
            /* JADX WARN: Code duplicated, block: B:57:0x0150  */
            /* JADX WARN: Code duplicated, block: B:58:0x0157  */
            /* JADX WARN: Code duplicated, block: B:59:0x0165  */
            /* JADX WARN: Code duplicated, block: B:60:0x0188  */
            /* JADX WARN: Code duplicated, block: B:61:0x0196  */
            /* JADX WARN: Code duplicated, block: B:62:0x01a4  */
            /* JADX WARN: Code duplicated, block: B:63:0x01b2  */
            /* JADX WARN: Code duplicated, block: B:64:0x01c0  */
            /* JADX WARN: Code duplicated, block: B:65:0x01ce  */
            /* JADX WARN: Code duplicated, block: B:67:0x01db  */
            /* JADX WARN: Code duplicated, block: B:68:0x01e2  */
            /* JADX WARN: Code duplicated, block: B:70:0x01f0  */
            /* JADX WARN: Code duplicated, block: B:72:0x01fd  */
            /* JADX WARN: Code duplicated, block: B:73:0x0204  */
            /* JADX WARN: Code duplicated, block: B:75:0x0211  */
            /* JADX WARN: Code duplicated, block: B:77:0x0219  */
            /* JADX WARN: Code duplicated, block: B:79:0x021c  */
            /* JADX WARN: Code duplicated, block: B:80:0x021f  */
            /* JADX WARN: Code duplicated, block: B:81:0x0222  */
            /* JADX WARN: Code duplicated, block: B:83:0x0231 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:84:0x0233  */
            /* JADX WARN: Code duplicated, block: B:86:0x0242  */
            /* JADX WARN: Code duplicated, block: B:89:0x0253  */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                JSONObject jSONObject;
                Object next;
                int iOptInt;
                rym rymVar;
                lkr lkrVarA;
                int iOptInt2;
                h620 h620Var;
                String strOptString;
                String strConcat;
                String strOptString2;
                String strConcat2;
                String str2 = str;
                str2.getClass();
                try {
                    jSONObject = new JSONObject(str2);
                } catch (Exception e) {
                    itf0.a.d(lx5.a("Invalid JSON: ", str2, ", error=", e.getMessage()), new Object[0]);
                    jSONObject = null;
                }
                kr00 kr00Var = this.a;
                if (jSONObject == null) {
                    itf0.a.d("Invalid JSON received: %s", str2);
                } else {
                    String strA = kfp.a("type", jSONObject);
                    if (strA.length() == 0) {
                        itf0.a.d("Missing JSON_KEY_TYPE in received JSON: %s", str2);
                    } else {
                        lr00.b.getClass();
                        Iterator<T> it = lr00.f.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!((lr00) next).a.equals(strA));
                        lr00 lr00Var = (lr00) next;
                        if (lr00Var == null) {
                            itf0.a.n("Unhandled socket type: %s", strA);
                        } else {
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                            if (jSONObjectOptJSONObject != null) {
                                try {
                                    iOptInt = jSONObjectOptJSONObject.optInt("bizType", -1);
                                } catch (Exception e2) {
                                    itf0.a.n(inm.a("Failed to getInt for key=bizType, error=", e2.getMessage()), new Object[0]);
                                    iOptInt = -1;
                                }
                                if ((lr00Var == lr00.Winning || lr00Var == lr00.GiftUsable) && iOptInt != -1) {
                                    b.b.getClass();
                                    if (b.a.a(iOptInt) == b.None) {
                                        c.b.getClass();
                                        if (c.a.a(iOptInt) == c.None) {
                                            a.b.getClass();
                                            if (a.C0358a.a(iOptInt) != a.None || 162 == iOptInt) {
                                                rymVar = kr00Var.i;
                                                switch (lr00Var.ordinal()) {
                                                    case 0:
                                                        if (iOptInt == 162) {
                                                            rymVar.i(new m420(h620.c, "Winning", jSONObject));
                                                        } else {
                                                            mkr mkrVar = kr00Var.v;
                                                            String string = jSONObject.toString();
                                                            string.getClass();
                                                            lkrVarA = mkrVar.a(string);
                                                            if (lkrVarA != null && lkrVarA.e) {
                                                                rymVar.i(new m420(h620.d, "LuckyNumber", jSONObject));
                                                            }
                                                        }
                                                        break;
                                                    case 1:
                                                        iOptInt2 = jSONObjectOptJSONObject.optInt("giftPurposeType", 0);
                                                        if (iOptInt2 != 1) {
                                                            h620Var = h620.f;
                                                        } else if (iOptInt2 != 2) {
                                                            h620Var = h620.i;
                                                        } else {
                                                            h620Var = h620.e;
                                                        }
                                                        rymVar.i(new m420(h620Var, h620Var.name(), jSONObject));
                                                        break;
                                                    case 2:
                                                        strOptString = jSONObjectOptJSONObject.optString("missionId", "");
                                                        strOptString.getClass();
                                                        if (strOptString.length() > 0) {
                                                            strConcat = "LoyaltyMission_".concat(strOptString);
                                                        } else {
                                                            strConcat = "LoyaltyMissionInvitation";
                                                        }
                                                        rymVar.i(new m420(h620.z, strConcat, jSONObject));
                                                        break;
                                                    case 3:
                                                        strOptString2 = jSONObjectOptJSONObject.optString("missionId", "");
                                                        strOptString2.getClass();
                                                        if (strOptString2.length() > 0) {
                                                            strConcat2 = "LoyaltyMissionComplete_".concat(strOptString2);
                                                        } else {
                                                            strConcat2 = "LoyaltyMissionComplete";
                                                        }
                                                        rymVar.i(new m420(h620.A, strConcat2, jSONObject));
                                                        break;
                                                    case 4:
                                                        rymVar.i(new m420(h620.E, "ChallengeStartNotify", jSONObject));
                                                        break;
                                                    case 5:
                                                        rymVar.i(new m420(h620.F, "ChallengeWinNotify", jSONObject));
                                                        break;
                                                    case 6:
                                                        rymVar.i(new m420(h620.v, "LuckyWheel", jSONObject));
                                                        break;
                                                    case 7:
                                                        rymVar.i(new m420(h620.J, "NameVerifySuccess", jSONObject));
                                                        break;
                                                    case 8:
                                                        rymVar.i(new m420(h620.G, "LoyaltyProgramClaimable", jSONObject));
                                                        break;
                                                    case 9:
                                                        lyh<lk50<AccountInfo>> lyhVarA = kr00Var.a.i.a(pu0.c.a);
                                                        zu7.a aVar2 = zu7.a;
                                                        kzh.d(lyhVarA, zu7.b(zu7.f));
                                                        rymVar.i(new m420(h620.H, "LoyaltyTierUpgradeNotify", jSONObject));
                                                        break;
                                                    case 10:
                                                        rymVar.i(new m420(h620.I, "LoyaltyTierDowngradeNotify", jSONObject));
                                                        break;
                                                    case 11:
                                                        kr00Var.d(mr00.NewDeviceLogin, jSONObject);
                                                        break;
                                                    case 12:
                                                        kr00Var.d(mr00.VerifyIdentityOtp, jSONObject);
                                                        break;
                                                    case 13:
                                                        kr00Var.d(mr00.NinDobReverify, jSONObjectOptJSONObject);
                                                        break;
                                                    case 14:
                                                        rymVar.i(new m420(h620.L, "LoyaltyBettingStreakUpgrade", jSONObjectOptJSONObject));
                                                        break;
                                                    case 15:
                                                        kr00Var.d(mr00.DeviceBlocking, jSONObjectOptJSONObject);
                                                        break;
                                                    case 16:
                                                        rymVar.i(new m420(h620.K, "AutoBetOrderResult", jSONObjectOptJSONObject));
                                                        break;
                                                    case 17:
                                                        rymVar.i(new m420(h620.y, "BoostGift", jSONObject));
                                                        break;
                                                    case 18:
                                                        rymVar.i(new m420(h620.D, "BettingStreakMission", jSONObjectOptJSONObject));
                                                        break;
                                                    default:
                                                        uhc.a();
                                                        return null;
                                                }
                                            } else {
                                                itf0.a aVar3 = itf0.a;
                                                aVar3.q(MyLog.TAG_PERSONAL_TOPIC);
                                                aVar3.g("skip winning dialog, bizType: %s", Integer.valueOf(iOptInt));
                                            }
                                        } else {
                                            rymVar = kr00Var.i;
                                            switch (lr00Var.ordinal()) {
                                                case 0:
                                                    if (iOptInt == 162) {
                                                        rymVar.i(new m420(h620.c, "Winning", jSONObject));
                                                    } else {
                                                        mkr mkrVar2 = kr00Var.v;
                                                        String string2 = jSONObject.toString();
                                                        string2.getClass();
                                                        lkrVarA = mkrVar2.a(string2);
                                                        if (lkrVarA != null) {
                                                            rymVar.i(new m420(h620.d, "LuckyNumber", jSONObject));
                                                        }
                                                    }
                                                    break;
                                                case 1:
                                                    iOptInt2 = jSONObjectOptJSONObject.optInt("giftPurposeType", 0);
                                                    if (iOptInt2 != 1) {
                                                        h620Var = h620.f;
                                                    } else if (iOptInt2 != 2) {
                                                        h620Var = h620.i;
                                                    } else {
                                                        h620Var = h620.e;
                                                    }
                                                    rymVar.i(new m420(h620Var, h620Var.name(), jSONObject));
                                                    break;
                                                case 2:
                                                    strOptString = jSONObjectOptJSONObject.optString("missionId", "");
                                                    strOptString.getClass();
                                                    if (strOptString.length() > 0) {
                                                        strConcat = "LoyaltyMission_".concat(strOptString);
                                                    } else {
                                                        strConcat = "LoyaltyMissionInvitation";
                                                    }
                                                    rymVar.i(new m420(h620.z, strConcat, jSONObject));
                                                    break;
                                                case 3:
                                                    strOptString2 = jSONObjectOptJSONObject.optString("missionId", "");
                                                    strOptString2.getClass();
                                                    if (strOptString2.length() > 0) {
                                                        strConcat2 = "LoyaltyMissionComplete_".concat(strOptString2);
                                                    } else {
                                                        strConcat2 = "LoyaltyMissionComplete";
                                                    }
                                                    rymVar.i(new m420(h620.A, strConcat2, jSONObject));
                                                    break;
                                                case 4:
                                                    rymVar.i(new m420(h620.E, "ChallengeStartNotify", jSONObject));
                                                    break;
                                                case 5:
                                                    rymVar.i(new m420(h620.F, "ChallengeWinNotify", jSONObject));
                                                    break;
                                                case 6:
                                                    rymVar.i(new m420(h620.v, "LuckyWheel", jSONObject));
                                                    break;
                                                case 7:
                                                    rymVar.i(new m420(h620.J, "NameVerifySuccess", jSONObject));
                                                    break;
                                                case 8:
                                                    rymVar.i(new m420(h620.G, "LoyaltyProgramClaimable", jSONObject));
                                                    break;
                                                case 9:
                                                    lyh<lk50<AccountInfo>> lyhVarA2 = kr00Var.a.i.a(pu0.c.a);
                                                    zu7.a aVar4 = zu7.a;
                                                    kzh.d(lyhVarA2, zu7.b(zu7.f));
                                                    rymVar.i(new m420(h620.H, "LoyaltyTierUpgradeNotify", jSONObject));
                                                    break;
                                                case 10:
                                                    rymVar.i(new m420(h620.I, "LoyaltyTierDowngradeNotify", jSONObject));
                                                    break;
                                                case 11:
                                                    kr00Var.d(mr00.NewDeviceLogin, jSONObject);
                                                    break;
                                                case 12:
                                                    kr00Var.d(mr00.VerifyIdentityOtp, jSONObject);
                                                    break;
                                                case 13:
                                                    kr00Var.d(mr00.NinDobReverify, jSONObjectOptJSONObject);
                                                    break;
                                                case 14:
                                                    rymVar.i(new m420(h620.L, "LoyaltyBettingStreakUpgrade", jSONObjectOptJSONObject));
                                                    break;
                                                case 15:
                                                    kr00Var.d(mr00.DeviceBlocking, jSONObjectOptJSONObject);
                                                    break;
                                                case 16:
                                                    rymVar.i(new m420(h620.K, "AutoBetOrderResult", jSONObjectOptJSONObject));
                                                    break;
                                                case 17:
                                                    rymVar.i(new m420(h620.y, "BoostGift", jSONObject));
                                                    break;
                                                case 18:
                                                    rymVar.i(new m420(h620.D, "BettingStreakMission", jSONObjectOptJSONObject));
                                                    break;
                                                default:
                                                    uhc.a();
                                                    return null;
                                            }
                                        }
                                    } else {
                                        rymVar = kr00Var.i;
                                        switch (lr00Var.ordinal()) {
                                            case 0:
                                                if (iOptInt == 162) {
                                                    rymVar.i(new m420(h620.c, "Winning", jSONObject));
                                                } else {
                                                    mkr mkrVar3 = kr00Var.v;
                                                    String string3 = jSONObject.toString();
                                                    string3.getClass();
                                                    lkrVarA = mkrVar3.a(string3);
                                                    if (lkrVarA != null) {
                                                        rymVar.i(new m420(h620.d, "LuckyNumber", jSONObject));
                                                    }
                                                }
                                                break;
                                            case 1:
                                                iOptInt2 = jSONObjectOptJSONObject.optInt("giftPurposeType", 0);
                                                if (iOptInt2 != 1) {
                                                    h620Var = h620.f;
                                                } else if (iOptInt2 != 2) {
                                                    h620Var = h620.i;
                                                } else {
                                                    h620Var = h620.e;
                                                }
                                                rymVar.i(new m420(h620Var, h620Var.name(), jSONObject));
                                                break;
                                            case 2:
                                                strOptString = jSONObjectOptJSONObject.optString("missionId", "");
                                                strOptString.getClass();
                                                if (strOptString.length() > 0) {
                                                    strConcat = "LoyaltyMission_".concat(strOptString);
                                                } else {
                                                    strConcat = "LoyaltyMissionInvitation";
                                                }
                                                rymVar.i(new m420(h620.z, strConcat, jSONObject));
                                                break;
                                            case 3:
                                                strOptString2 = jSONObjectOptJSONObject.optString("missionId", "");
                                                strOptString2.getClass();
                                                if (strOptString2.length() > 0) {
                                                    strConcat2 = "LoyaltyMissionComplete_".concat(strOptString2);
                                                } else {
                                                    strConcat2 = "LoyaltyMissionComplete";
                                                }
                                                rymVar.i(new m420(h620.A, strConcat2, jSONObject));
                                                break;
                                            case 4:
                                                rymVar.i(new m420(h620.E, "ChallengeStartNotify", jSONObject));
                                                break;
                                            case 5:
                                                rymVar.i(new m420(h620.F, "ChallengeWinNotify", jSONObject));
                                                break;
                                            case 6:
                                                rymVar.i(new m420(h620.v, "LuckyWheel", jSONObject));
                                                break;
                                            case 7:
                                                rymVar.i(new m420(h620.J, "NameVerifySuccess", jSONObject));
                                                break;
                                            case 8:
                                                rymVar.i(new m420(h620.G, "LoyaltyProgramClaimable", jSONObject));
                                                break;
                                            case 9:
                                                lyh<lk50<AccountInfo>> lyhVarA3 = kr00Var.a.i.a(pu0.c.a);
                                                zu7.a aVar5 = zu7.a;
                                                kzh.d(lyhVarA3, zu7.b(zu7.f));
                                                rymVar.i(new m420(h620.H, "LoyaltyTierUpgradeNotify", jSONObject));
                                                break;
                                            case 10:
                                                rymVar.i(new m420(h620.I, "LoyaltyTierDowngradeNotify", jSONObject));
                                                break;
                                            case 11:
                                                kr00Var.d(mr00.NewDeviceLogin, jSONObject);
                                                break;
                                            case 12:
                                                kr00Var.d(mr00.VerifyIdentityOtp, jSONObject);
                                                break;
                                            case 13:
                                                kr00Var.d(mr00.NinDobReverify, jSONObjectOptJSONObject);
                                                break;
                                            case 14:
                                                rymVar.i(new m420(h620.L, "LoyaltyBettingStreakUpgrade", jSONObjectOptJSONObject));
                                                break;
                                            case 15:
                                                kr00Var.d(mr00.DeviceBlocking, jSONObjectOptJSONObject);
                                                break;
                                            case 16:
                                                rymVar.i(new m420(h620.K, "AutoBetOrderResult", jSONObjectOptJSONObject));
                                                break;
                                            case 17:
                                                rymVar.i(new m420(h620.y, "BoostGift", jSONObject));
                                                break;
                                            case 18:
                                                rymVar.i(new m420(h620.D, "BettingStreakMission", jSONObjectOptJSONObject));
                                                break;
                                            default:
                                                uhc.a();
                                                return null;
                                        }
                                    }
                                } else {
                                    rymVar = kr00Var.i;
                                    switch (lr00Var.ordinal()) {
                                        case 0:
                                            if (iOptInt == 162) {
                                                rymVar.i(new m420(h620.c, "Winning", jSONObject));
                                            } else {
                                                mkr mkrVar4 = kr00Var.v;
                                                String string4 = jSONObject.toString();
                                                string4.getClass();
                                                lkrVarA = mkrVar4.a(string4);
                                                if (lkrVarA != null) {
                                                    rymVar.i(new m420(h620.d, "LuckyNumber", jSONObject));
                                                }
                                            }
                                            break;
                                        case 1:
                                            iOptInt2 = jSONObjectOptJSONObject.optInt("giftPurposeType", 0);
                                            if (iOptInt2 != 1) {
                                                h620Var = h620.f;
                                            } else if (iOptInt2 != 2) {
                                                h620Var = h620.i;
                                            } else {
                                                h620Var = h620.e;
                                            }
                                            rymVar.i(new m420(h620Var, h620Var.name(), jSONObject));
                                            break;
                                        case 2:
                                            strOptString = jSONObjectOptJSONObject.optString("missionId", "");
                                            strOptString.getClass();
                                            if (strOptString.length() > 0) {
                                                strConcat = "LoyaltyMission_".concat(strOptString);
                                            } else {
                                                strConcat = "LoyaltyMissionInvitation";
                                            }
                                            rymVar.i(new m420(h620.z, strConcat, jSONObject));
                                            break;
                                        case 3:
                                            strOptString2 = jSONObjectOptJSONObject.optString("missionId", "");
                                            strOptString2.getClass();
                                            if (strOptString2.length() > 0) {
                                                strConcat2 = "LoyaltyMissionComplete_".concat(strOptString2);
                                            } else {
                                                strConcat2 = "LoyaltyMissionComplete";
                                            }
                                            rymVar.i(new m420(h620.A, strConcat2, jSONObject));
                                            break;
                                        case 4:
                                            rymVar.i(new m420(h620.E, "ChallengeStartNotify", jSONObject));
                                            break;
                                        case 5:
                                            rymVar.i(new m420(h620.F, "ChallengeWinNotify", jSONObject));
                                            break;
                                        case 6:
                                            rymVar.i(new m420(h620.v, "LuckyWheel", jSONObject));
                                            break;
                                        case 7:
                                            rymVar.i(new m420(h620.J, "NameVerifySuccess", jSONObject));
                                            break;
                                        case 8:
                                            rymVar.i(new m420(h620.G, "LoyaltyProgramClaimable", jSONObject));
                                            break;
                                        case 9:
                                            lyh<lk50<AccountInfo>> lyhVarA4 = kr00Var.a.i.a(pu0.c.a);
                                            zu7.a aVar6 = zu7.a;
                                            kzh.d(lyhVarA4, zu7.b(zu7.f));
                                            rymVar.i(new m420(h620.H, "LoyaltyTierUpgradeNotify", jSONObject));
                                            break;
                                        case 10:
                                            rymVar.i(new m420(h620.I, "LoyaltyTierDowngradeNotify", jSONObject));
                                            break;
                                        case 11:
                                            kr00Var.d(mr00.NewDeviceLogin, jSONObject);
                                            break;
                                        case 12:
                                            kr00Var.d(mr00.VerifyIdentityOtp, jSONObject);
                                            break;
                                        case 13:
                                            kr00Var.d(mr00.NinDobReverify, jSONObjectOptJSONObject);
                                            break;
                                        case 14:
                                            rymVar.i(new m420(h620.L, "LoyaltyBettingStreakUpgrade", jSONObjectOptJSONObject));
                                            break;
                                        case 15:
                                            kr00Var.d(mr00.DeviceBlocking, jSONObjectOptJSONObject);
                                            break;
                                        case 16:
                                            rymVar.i(new m420(h620.K, "AutoBetOrderResult", jSONObjectOptJSONObject));
                                            break;
                                        case 17:
                                            rymVar.i(new m420(h620.y, "BoostGift", jSONObject));
                                            break;
                                        case 18:
                                            rymVar.i(new m420(h620.D, "BettingStreakMission", jSONObjectOptJSONObject));
                                            break;
                                        default:
                                            uhc.a();
                                            return null;
                                    }
                                }
                            }
                        }
                    }
                }
                kr00Var.c();
                return Unit.a;
            }
        });
    }
}
