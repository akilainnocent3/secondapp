package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.auth.AccountHelperEntryPoint;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class soh implements AccountHelperEntryPoint, b8b {
    public static String f;
    public final /* synthetic */ AccountHelperEntryPointImpl a = new AccountHelperEntryPointImpl();
    public final /* synthetic */ d8b b = new d8b();
    public static final soh c = new soh();
    public static String d = "";
    public static String e = "";
    public static final j1b i = w5b.a(fse.a);
    public static final mpe0 v = hwr.b(new ioh());

    static {
        hwr.b(new joh());
    }

    public static final void b(Context context) {
        Task<String> task;
        Task taskForException;
        cmk0 cmk0Var;
        context.getClass();
        for (CountryCodeName countryCodeName : v7b.b) {
            if (countryCodeName == c.b.a().getCountryCode()) {
                FirebaseMessaging.c().i.onSuccessTask(new cqh(countryCodeName.getCode()));
            } else {
                FirebaseMessaging.c().i.onSuccessTask(new bqh(countryCodeName.getCode()));
            }
        }
        c.getClass();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_FIREBASE);
        aVar.l(inm.a("getInstanceId: ", d), new Object[0]);
        Object obj = rph.m;
        Task<String> id = ((rph) yoh.c().b(sph.class)).getId();
        final koh kohVar = new koh();
        id.addOnSuccessListener(new OnSuccessListener() { // from class: loh
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj2) {
                kohVar.invoke(obj2);
            }
        });
        aVar.q(MyLog.TAG_FIREBASE);
        aVar.l(inm.a("getFCMToken: ", e), new Object[0]);
        final FirebaseMessaging firebaseMessagingC = FirebaseMessaging.c();
        vph vphVar = firebaseMessagingC.b;
        if (vphVar != null) {
            task = vphVar.b();
        } else {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            firebaseMessagingC.g.execute(new Runnable() { // from class: eqh
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging firebaseMessaging = firebaseMessagingC;
                    TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                    try {
                        taskCompletionSource2.setResult(firebaseMessaging.a());
                    } catch (Exception e2) {
                        taskCompletionSource2.setException(e2);
                    }
                }
            });
            task = taskCompletionSource.getTask();
        }
        final moh mohVar = new moh();
        task.addOnSuccessListener(new OnSuccessListener() { // from class: noh
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj2) {
                mohVar.invoke(obj2);
            }
        });
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        FirebaseAnalytics.b bVar = FirebaseAnalytics.b.b;
        Map mapB = jpu.b(new Pair(bVar, FirebaseAnalytics.a.a));
        firebaseAnalytics.getClass();
        Bundle bundle = new Bundle();
        FirebaseAnalytics.a aVar2 = (FirebaseAnalytics.a) mapB.get(FirebaseAnalytics.b.a);
        if (aVar2 != null) {
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        FirebaseAnalytics.a aVar3 = (FirebaseAnalytics.a) mapB.get(bVar);
        if (aVar3 != null) {
            int iOrdinal2 = aVar3.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        FirebaseAnalytics.a aVar4 = (FirebaseAnalytics.a) mapB.get(FirebaseAnalytics.b.c);
        if (aVar4 != null) {
            int iOrdinal3 = aVar4.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        FirebaseAnalytics.a aVar5 = (FirebaseAnalytics.a) mapB.get(FirebaseAnalytics.b.d);
        if (aVar5 != null) {
            int iOrdinal4 = aVar5.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        p1l0 p1l0Var = firebaseAnalytics.a;
        p1l0Var.getClass();
        p1l0Var.c(new byk0(p1l0Var, bundle));
        try {
            synchronized (FirebaseAnalytics.class) {
                try {
                    cmk0Var = firebaseAnalytics.b;
                    if (cmk0Var == null) {
                        cmk0 cmk0Var2 = new cmk0(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                        firebaseAnalytics.b = cmk0Var2;
                        cmk0Var = cmk0Var2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            taskForException = Tasks.call(cmk0Var, new trk0(firebaseAnalytics));
        } catch (RuntimeException e2) {
            p1l0 p1l0Var2 = firebaseAnalytics.a;
            p1l0Var2.getClass();
            p1l0Var2.c(new rzk0(p1l0Var2, "Failed to schedule task for getAppInstanceId", null));
            taskForException = Tasks.forException(e2);
        }
        taskForException.getClass();
        final ooh oohVar = new ooh();
        taskForException.addOnSuccessListener(new OnSuccessListener() { // from class: poh
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj2) {
                oohVar.invoke(obj2);
            }
        });
    }

    @Override // defpackage.b8b
    public final psm a() {
        return this.b.a();
    }

    public final void c(String str) {
        str.getClass();
        if (Intrinsics.g(e, str)) {
            return;
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_FIREBASE);
        aVar.a("onFirebaseFCMTokenChanged: ".concat(str), new Object[0]);
        e = str;
        if (StringsKt.U(str)) {
            return;
        }
        aVar.q(MyLog.TAG_FIREBASE);
        aVar.a("bindFCMToken from onFirebaseFCMTokenChanged", new Object[0]);
        this.a.getAccountHelper().bindFCMToken();
    }

    @Override // com.sportybet.android.auth.AccountHelperEntryPoint
    public final uqm getAccountHelper() {
        return this.a.getAccountHelper();
    }
}
