package com.sportybet.android.firebase;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.messaging.RemoteMessage;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.home.SplashActivity;
import defpackage.avp;
import defpackage.b5y;
import defpackage.bvp;
import defpackage.cbg;
import defpackage.ce7;
import defpackage.f00;
import defpackage.f1y;
import defpackage.g1y;
import defpackage.itf0;
import defpackage.k00;
import defpackage.kks;
import defpackage.la30;
import defpackage.na30;
import defpackage.ouc0;
import defpackage.ox0;
import defpackage.psm;
import defpackage.rdd0;
import defpackage.sh8;
import defpackage.soh;
import defpackage.tbe0;
import defpackage.u2y;
import defpackage.vgb0;
import defpackage.vn20;
import defpackage.wwl;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/firebase/MessageService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MessageService extends wwl {
    public bvp d;
    public na30 e;
    public tbe0 f;
    public ouc0 i;
    public psm v;
    public rdd0 w;
    public cbg y;

    @Override // com.google.firebase.messaging.FirebaseMessagingService, defpackage.g7g
    public final void handleIntent(Intent intent) {
        intent.getClass();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_FIREBASE);
        aVar.l("handleIntent: " + intent + ", extras: " + intent.getExtras(), new Object[0]);
        if (intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            extras.getClass();
            if ("live_event".equals(extras.getString("source"))) {
                kks kksVar = kks.b;
                Context applicationContext = getApplicationContext();
                applicationContext.getClass();
                kksVar.getClass();
                if (!kksVar.a(applicationContext) || !vn20.b(applicationContext, "live_event", kksVar.b("liveEventNotificationEnabled"), true)) {
                    return;
                }
            }
        }
        super.handleIntent(intent);
        f00 f00Var = vgb0.a;
        vgb0.d(getApplicationContext(), "received_fcm");
    }

    @Override // defpackage.wwl, android.app.Service
    public final void onCreate() {
        super.onCreate();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_FIREBASE);
        aVar.l("onCreate", new Object[0]);
        bvp bvpVar = new bvp();
        bvpVar.a = 20001;
        this.d = bvpVar;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onDeletedMessages() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onMessageReceived(RemoteMessage remoteMessage) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        bvp bvpVar;
        remoteMessage.getClass();
        super.onMessageReceived(remoteMessage);
        ox0 ox0Var = remoteMessage.b;
        Bundle bundle = remoteMessage.a;
        if (ox0Var == null) {
            ox0Var = new ox0();
            for (String str6 : bundle.keySet()) {
                Object obj = bundle.get(str6);
                if (obj instanceof String) {
                    String str7 = (String) obj;
                    if (!str6.startsWith("google.") && !str6.startsWith("gcm.") && !str6.equals("from") && !str6.equals("message_type") && !str6.equals("collapse_key")) {
                        ox0Var.put(str6, str7);
                    }
                }
            }
            remoteMessage.b = ox0Var;
        }
        if (remoteMessage.c == null && u2y.k(bundle)) {
            remoteMessage.c = new RemoteMessage.a(new u2y(bundle));
        }
        RemoteMessage.a aVar = remoteMessage.c;
        String str8 = (String) ox0Var.get("purposeId");
        if (str8 == null) {
            str8 = "";
        }
        String str9 = (String) ox0Var.get("purpose");
        String str10 = str9 != null ? str9 : "";
        rdd0 rdd0Var = this.w;
        if (rdd0Var == null) {
            Intrinsics.n("sportyTrackingUseCase");
            throw null;
        }
        rdd0Var.a(new la30(str8, str10), k00.d);
        for (Map.Entry entry : (ox0.a) ox0Var.entrySet()) {
            String str11 = (String) entry.getKey();
            String str12 = (String) entry.getValue();
            itf0.a aVar2 = itf0.a;
            StringBuilder sbA = ce7.a(aVar2, MyLog.TAG_FIREBASE, "Key: ", str11, ", Value: ");
            sbA.append(str12);
            aVar2.a(sbA.toString(), new Object[0]);
        }
        String str13 = (String) ox0Var.get("source");
        itf0.a aVar3 = itf0.a;
        aVar3.q(MyLog.TAG_FIREBASE);
        aVar3.l("onMessageReceived source: %s", str13);
        if (str13 == null || str13.length() == 0) {
            if (aVar != null) {
                str2 = aVar.a;
                str3 = aVar.b;
                str = null;
                str4 = null;
            } else {
                String str14 = (String) ox0Var.get("title");
                String str15 = (String) ox0Var.get("body");
                str = (String) ox0Var.get("purposeId");
                str2 = str14;
                str3 = str15;
                str4 = (String) ox0Var.get("purpose");
            }
            String str16 = (String) ox0Var.get("url");
            String str17 = (String) ox0Var.get("anTestCopyCode");
            String str18 = (String) ox0Var.get("anTestCopyVariantName");
            String string = (String) ox0Var.get("picUrl");
            if (string != null) {
                str5 = string;
            } else {
                if (aVar != null) {
                    String str19 = aVar.c;
                    Uri uri = str19 != null ? Uri.parse(str19) : null;
                    if (uri != null) {
                        string = uri.toString();
                        str5 = string;
                    }
                }
                str5 = null;
            }
            if (str5 != null && str5.length() != 0) {
                na30 na30Var = this.e;
                if (na30Var != null) {
                    na30Var.c(this, str2, str3, str16, str5, str4, str, str17, str18);
                    return;
                } else {
                    Intrinsics.n("pushNotificationManager");
                    throw null;
                }
            }
            String str20 = str2;
            String str21 = str3;
            String str22 = str4;
            na30 na30Var2 = this.e;
            if (na30Var2 != null) {
                na30Var2.d(this, str20, str21, str16, str22, str, str17, str18);
                return;
            } else {
                Intrinsics.n("pushNotificationManager");
                throw null;
            }
        }
        psm psmVar = this.v;
        if (psmVar == null) {
            Intrinsics.n("countryManager");
            throw null;
        }
        CountryCodeName countryCode = psmVar.getCountryCode();
        cbg cbgVar = this.y;
        if (cbgVar == null) {
            Intrinsics.n("environmentManager");
            throw null;
        }
        String str23 = cbgVar.b().b;
        int iHashCode = str13.hashCode();
        if (iHashCode == -697357182) {
            if (str13.equals("sporty_bet:sporty_tv_favorite")) {
                tbe0 tbe0Var = this.f;
                if (tbe0Var == null) {
                    Intrinsics.n("stvNotificationManager");
                    throw null;
                }
                Context applicationContext = getApplicationContext();
                applicationContext.getClass();
                tbe0Var.a(applicationContext, ox0Var, countryCode, str23);
                return;
            }
            return;
        }
        if (iHashCode != 1200629127) {
            if (iHashCode == 2056139954 && str13.equals("nin_re_verify_reminder_notification")) {
                ouc0 ouc0Var = this.i;
                if (ouc0Var == null) {
                    Intrinsics.n("ninNotificationManager");
                    throw null;
                }
                Context applicationContext2 = getApplicationContext();
                applicationContext2.getClass();
                ouc0Var.a(applicationContext2, ox0Var, aVar, str23);
                return;
            }
            return;
        }
        if (str13.equals("live_event")) {
            kks kksVar = kks.b;
            Context applicationContext3 = getApplicationContext();
            applicationContext3.getClass();
            kksVar.getClass();
            if (kksVar.a(applicationContext3) && vn20.b(applicationContext3, "live_event", kksVar.b("liveEventNotificationEnabled"), true) && (bvpVar = this.d) != null) {
                Context applicationContext4 = getApplicationContext();
                aVar.getClass();
                String str24 = (String) ox0Var.get("title");
                if (str24 == null) {
                    str24 = aVar.a;
                }
                String str25 = str24;
                String str26 = (String) ox0Var.get("body");
                if (str26 == null) {
                    str26 = aVar.b;
                }
                String str27 = str26;
                String str28 = (String) ox0Var.get("url");
                String str29 = (String) ox0Var.get("picUrl");
                if (applicationContext4 != null) {
                    if (TextUtils.isEmpty(str25) && TextUtils.isEmpty(str27)) {
                        return;
                    }
                    Intent intent = new Intent(applicationContext4, (Class<?>) SplashActivity.class);
                    intent.putExtra("url", str28);
                    PendingIntent activity = PendingIntent.getActivity(applicationContext4, bvpVar.a, intent, Build.VERSION.SDK_INT >= 31 ? 1140850688 : 1073741824);
                    g1y g1yVarB = b5y.b(applicationContext4, "FCM_LCP");
                    g1yVarB.e = g1y.b(str25);
                    g1yVarB.f = g1y.b(str27);
                    g1yVarB.g = activity;
                    g1yVarB.d(16, true);
                    f1y f1yVar = new f1y();
                    f1yVar.e = g1y.b(str27);
                    f1yVar.b = g1y.b(str25);
                    g1yVarB.f(f1yVar);
                    if (TextUtils.isEmpty(str29)) {
                        bvpVar.i(g1yVarB, str27, str25, applicationContext4);
                    } else {
                        sh8.a().c(str29, new avp(g1yVarB, str25, str27, applicationContext4, bvpVar));
                    }
                    f00 f00Var = vgb0.a;
                    vgb0.d(null, "show_lcp_notification");
                }
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) {
        str.getClass();
        super.onNewToken(str);
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_FIREBASE);
        aVar.l("onNewToken", new Object[0]);
        soh.c.c(str);
    }
}
