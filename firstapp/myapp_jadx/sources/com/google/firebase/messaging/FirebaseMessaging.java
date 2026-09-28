package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import defpackage.a4l;
import defpackage.a830;
import defpackage.aee0;
import defpackage.ank0;
import defpackage.boh0;
import defpackage.g160;
import defpackage.gpg;
import defpackage.hm20;
import defpackage.ka50;
import defpackage.lil;
import defpackage.n730;
import defpackage.pov;
import defpackage.pug0;
import defpackage.r3g0;
import defpackage.sph;
import defpackage.tbh;
import defpackage.tex;
import defpackage.vov;
import defpackage.vph;
import defpackage.wph;
import defpackage.xoe0;
import defpackage.xtl0;
import defpackage.yoh;
import defpackage.ysl0;
import defpackage.yz;
import defpackage.zsl0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseMessaging {
    public static com.google.firebase.messaging.a l;
    public static n730<pug0> m = new wph();
    public static ScheduledThreadPoolExecutor n;
    public final yoh a;
    public final vph b;
    public final Context c;
    public final a4l d;
    public final ka50 e;
    public final a f;
    public final ScheduledThreadPoolExecutor g;
    public final ThreadPoolExecutor h;
    public final Task<r3g0> i;
    public final vov j;
    public boolean k;

    public class a {
        public final aee0 a;
        public boolean b;
        public Boolean c;

        public a(aee0 aee0Var) {
            this.a = aee0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [fqh] */
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
        public final synchronized boolean a() {
            try {
                synchronized (this) {
                    try {
                        if (!this.b) {
                            Boolean boolB = b();
                            this.c = boolB;
                            if (boolB == null) {
                                this.a.a(new gpg() { // from class: fqh
                                    @Override // defpackage.gpg
                                    public final void a(thg thgVar) {
                                        FirebaseMessaging.a aVar = this.a;
                                        if (aVar.a()) {
                                            FirebaseMessaging.this.h();
                                        }
                                    }
                                });
                            }
                            this.b = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return bool != null ? bool.booleanValue() : FirebaseMessaging.this.a.g();
            } catch (Throwable th2) {
                throw th2;
            }
            Boolean bool = this.c;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.a.g();
        }

        public final Boolean b() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            yoh yohVar = FirebaseMessaging.this.a;
            yohVar.a();
            Context context = yohVar.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging() {
        throw null;
    }

    public FirebaseMessaging(yoh yohVar, vph vphVar, n730<boh0> n730Var, n730<lil> n730Var2, sph sphVar, n730<pug0> n730Var3, aee0 aee0Var) {
        yohVar.a();
        Context context = yohVar.a;
        final vov vovVar = new vov(context);
        final a4l a4lVar = new a4l(yohVar, vovVar, n730Var, n730Var2, sphVar);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new tex("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new tex("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new tex("Firebase-Messaging-File-Io"));
        this.k = false;
        m = n730Var3;
        this.a = yohVar;
        this.b = vphVar;
        this.f = new a(aee0Var);
        yohVar.a();
        final Context context2 = yohVar.a;
        this.c = context2;
        tbh tbhVar = new tbh();
        this.j = vovVar;
        this.d = a4lVar;
        this.e = new ka50(executorServiceNewSingleThreadExecutor);
        this.g = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        yohVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(tbhVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (vphVar != null) {
            vphVar.a();
        }
        scheduledThreadPoolExecutor.execute(new Runnable() { // from class: xph
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging firebaseMessaging = this.a;
                if (firebaseMessaging.f.a()) {
                    firebaseMessaging.h();
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new tex("Firebase-Messaging-Topics-Io"));
        Task<r3g0> taskCall = Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: q3g0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                p3g0 p3g0Var;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                vov vovVar2 = vovVar;
                a4l a4lVar2 = a4lVar;
                synchronized (p3g0.class) {
                    try {
                        WeakReference<p3g0> weakReference = p3g0.b;
                        p3g0 p3g0Var2 = weakReference != null ? weakReference.get() : null;
                        if (p3g0Var2 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            p3g0Var = new p3g0();
                            synchronized (p3g0Var) {
                                p3g0Var.a = t390.a(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            p3g0.b = new WeakReference<>(p3g0Var);
                        } else {
                            p3g0Var = p3g0Var2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new r3g0(firebaseMessaging, vovVar2, p3g0Var, a4lVar2, context3, scheduledThreadPoolExecutor3);
            }
        });
        this.i = taskCall;
        taskCall.addOnSuccessListener(scheduledThreadPoolExecutor, new OnSuccessListener() { // from class: yph
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                r3g0 r3g0Var = (r3g0) obj;
                if (this.a.f.a()) {
                    r3g0Var.e();
                }
            }
        });
        scheduledThreadPoolExecutor.execute(new Runnable() { // from class: zph
            @Override // java.lang.Runnable
            public final void run() {
                Task taskForException;
                int i;
                FirebaseMessaging firebaseMessaging = this.a;
                final Context context3 = firebaseMessaging.c;
                a830.a(context3);
                a4l a4lVar2 = firebaseMessaging.d;
                final boolean zG = firebaseMessaging.g();
                if (Build.VERSION.SDK_INT >= 29) {
                    SharedPreferences sharedPreferencesA = c830.a(context3);
                    if (!sharedPreferencesA.contains("proxy_retention") || sharedPreferencesA.getBoolean("proxy_retention", false) != zG) {
                        g160 g160Var = a4lVar2.c;
                        if (g160Var.c.a() >= 241100000) {
                            Bundle bundleA = x6.a("proxy_retention", zG);
                            zsl0 zsl0VarA = zsl0.a(g160Var.b);
                            synchronized (zsl0VarA) {
                                i = zsl0VarA.d;
                                zsl0VarA.d = i + 1;
                            }
                            taskForException = zsl0VarA.b(new crl0(i, 4, bundleA));
                        } else {
                            taskForException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                        }
                        taskForException.addOnSuccessListener(new liv(), new OnSuccessListener() { // from class: b830
                            @Override // com.google.android.gms.tasks.OnSuccessListener
                            public final void onSuccess(Object obj) {
                                SharedPreferences.Editor editorEdit = c830.a(context3).edit();
                                editorEdit.putBoolean("proxy_retention", zG);
                                editorEdit.apply();
                            }
                        });
                    }
                }
                if (firebaseMessaging.g()) {
                    firebaseMessaging.f();
                }
            }
        });
    }

    public static void b(long j, Runnable runnable) {
        synchronized (FirebaseMessaging.class) {
            try {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = n;
                if (scheduledThreadPoolExecutor == null) {
                    scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new tex("TAG"));
                    n = scheduledThreadPoolExecutor;
                }
                scheduledThreadPoolExecutor.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized FirebaseMessaging c() {
        return getInstance(yoh.c());
    }

    public static synchronized com.google.firebase.messaging.a d(Context context) {
        com.google.firebase.messaging.a aVar;
        aVar = l;
        if (aVar == null) {
            aVar = new com.google.firebase.messaging.a(context);
            l = aVar;
        }
        return aVar;
    }

    public static synchronized FirebaseMessaging getInstance(yoh yohVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) yohVar.b(FirebaseMessaging.class);
        hm20.i(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a() {
        Task taskContinueWithTask;
        vph vphVar = this.b;
        if (vphVar != null) {
            try {
                return (String) Tasks.await(vphVar.b());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        final com.google.firebase.messaging.a.C0198a c0198aE = e();
        if (!j(c0198aE)) {
            return c0198aE.a;
        }
        final String strB = vov.b(this.a);
        final ka50 ka50Var = this.e;
        synchronized (ka50Var) {
            taskContinueWithTask = (Task) ka50Var.b.get(strB);
            if (taskContinueWithTask == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strB);
                }
                a4l a4lVar = this.d;
                taskContinueWithTask = a4lVar.a(a4lVar.c(vov.b(a4lVar.a), "*", new Bundle())).onSuccessTask(this.h, new SuccessContinuation() { // from class: dqh
                    @Override // com.google.android.gms.tasks.SuccessContinuation
                    public final Task then(Object obj) {
                        FirebaseMessaging firebaseMessaging = this.a;
                        String str = strB;
                        a.C0198a c0198a = c0198aE;
                        String str2 = (String) obj;
                        a aVarD = FirebaseMessaging.d(firebaseMessaging.c);
                        yoh yohVar = firebaseMessaging.a;
                        yohVar.a();
                        String strD = "[DEFAULT]".equals(yohVar.b) ? "" : yohVar.d();
                        String strA = firebaseMessaging.j.a();
                        synchronized (aVarD) {
                            String strA2 = a.C0198a.a(System.currentTimeMillis(), str2, strA);
                            if (strA2 != null) {
                                SharedPreferences.Editor editorEdit = aVarD.a.edit();
                                editorEdit.putString(strD + "|T|" + str + "|*", strA2);
                                editorEdit.commit();
                            }
                        }
                        if (c0198a == null || !str2.equals(c0198a.a)) {
                            yoh yohVar2 = firebaseMessaging.a;
                            yohVar2.a();
                            if ("[DEFAULT]".equals(yohVar2.b)) {
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                                    yohVar2.a();
                                    sb.append(yohVar2.b);
                                    Log.d("FirebaseMessaging", sb.toString());
                                }
                                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                                intent.putExtra("token", str2);
                                new rbh(firebaseMessaging.c).b(intent);
                            }
                        }
                        return Tasks.forResult(str2);
                    }
                }).continueWithTask(ka50Var.a, new Continuation() { // from class: ja50
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        ka50 ka50Var2 = ka50Var;
                        String str = strB;
                        synchronized (ka50Var2) {
                            ka50Var2.b.remove(str);
                        }
                        return task;
                    }
                });
                ka50Var.b.put(strB, taskContinueWithTask);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strB);
            }
        }
        try {
            return (String) Tasks.await(taskContinueWithTask);
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    public final com.google.firebase.messaging.a.C0198a e() {
        com.google.firebase.messaging.a.C0198a c0198aB;
        com.google.firebase.messaging.a aVarD = d(this.c);
        yoh yohVar = this.a;
        yohVar.a();
        String strD = "[DEFAULT]".equals(yohVar.b) ? "" : yohVar.d();
        String strB = vov.b(this.a);
        synchronized (aVarD) {
            c0198aB = com.google.firebase.messaging.a.C0198a.b(aVarD.a.getString(strD + "|T|" + strB + "|*", null));
        }
        return c0198aB;
    }

    public final void f() {
        Task taskForException;
        int i;
        g160 g160Var = this.d.c;
        if (g160Var.c.a() >= 241100000) {
            zsl0 zsl0VarA = zsl0.a(g160Var.b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (zsl0VarA) {
                i = zsl0VarA.d;
                zsl0VarA.d = i + 1;
            }
            taskForException = zsl0VarA.b(new ysl0(i, 5, bundle)).continueWith(xtl0.a, ank0.a);
        } else {
            taskForException = Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        taskForException.addOnSuccessListener(this.g, new OnSuccessListener() { // from class: aqh
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                CloudMessage cloudMessage = (CloudMessage) obj;
                if (cloudMessage != null) {
                    pov.b(cloudMessage.a);
                    this.a.f();
                }
            }
        });
    }

    public final boolean g() {
        Context context = this.c;
        a830.a(context);
        if (!a830.b(context)) {
            return false;
        }
        if (this.a.b(yz.class) != null) {
            return true;
        }
        return pov.a() && m != null;
    }

    public final void h() {
        vph vphVar = this.b;
        if (vphVar != null) {
            vphVar.getToken();
        } else if (j(e())) {
            synchronized (this) {
                if (!this.k) {
                    i(0L);
                }
            }
        }
    }

    public final synchronized void i(long j) {
        b(j, new xoe0(this, Math.min(Math.max(30L, 2 * j), 28800L)));
        this.k = true;
    }

    public final boolean j(com.google.firebase.messaging.a.C0198a c0198a) {
        if (c0198a != null) {
            return System.currentTimeMillis() > c0198a.c + 604800000 || !this.j.a().equals(c0198a.b);
        }
        return true;
    }
}
