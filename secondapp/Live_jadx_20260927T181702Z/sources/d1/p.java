package d1;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class p extends Service {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f77602i = "JobIntentService";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f77603j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f77604k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashMap<ComponentName, h> f77605l = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f77606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f77607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f77608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f77609e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f77610f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f77611g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList<d> f77612h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e eVarA = p.this.a();
                if (eVarA == null) {
                    return null;
                }
                p.this.h(eVarA.getIntent());
                eVarA.l();
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r10) {
            p.this.j();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r10) {
            p.this.j();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        IBinder a();

        e b();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Context f77614d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final PowerManager.WakeLock f77615e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final PowerManager.WakeLock f77616f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f77617g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f77618h;

        public c(Context context, ComponentName componentName) {
            super(componentName);
            this.f77614d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f77615e = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f77616f = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // d1.p.h
        public void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f77631a);
            if (this.f77614d.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.f77617g) {
                            this.f77617g = true;
                            if (!this.f77618h) {
                                this.f77615e.acquire(60000L);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        @Override // d1.p.h
        public void c() {
            synchronized (this) {
                try {
                    if (this.f77618h) {
                        if (this.f77617g) {
                            this.f77615e.acquire(60000L);
                        }
                        this.f77618h = false;
                        this.f77616f.release();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // d1.p.h
        public void d() {
            synchronized (this) {
                try {
                    if (!this.f77618h) {
                        this.f77618h = true;
                        this.f77616f.acquire(600000L);
                        this.f77615e.release();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // d1.p.h
        public void e() {
            synchronized (this) {
                this.f77617g = false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class d implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f77619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f77620b;

        public d(Intent intent, int i10) {
            this.f77619a = intent;
            this.f77620b = i10;
        }

        @Override // d1.p.e
        public Intent getIntent() {
            return this.f77619a;
        }

        @Override // d1.p.e
        public void l() {
            p.this.stopSelf(this.f77620b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface e {
        Intent getIntent();

        void l();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(26)
    public static final class f extends JobServiceEngine implements b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f77622d = "JobServiceEngineImpl";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final boolean f77623e = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f77624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f77625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public JobParameters f77626c;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public final class a implements e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final JobWorkItem f77627a;

            public a(JobWorkItem jobWorkItem) {
                this.f77627a = jobWorkItem;
            }

            @Override // d1.p.e
            public Intent getIntent() {
                return this.f77627a.getIntent();
            }

            @Override // d1.p.e
            public void l() {
                synchronized (f.this.f77625b) {
                    try {
                        JobParameters jobParameters = f.this.f77626c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f77627a);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public f(p pVar) {
            super(pVar);
            this.f77625b = new Object();
            this.f77624a = pVar;
        }

        @Override // d1.p.b
        public IBinder a() {
            return getBinder();
        }

        @Override // d1.p.b
        public e b() {
            synchronized (this.f77625b) {
                try {
                    JobParameters jobParameters = this.f77626c;
                    if (jobParameters == null) {
                        return null;
                    }
                    JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f77624a.getClassLoader());
                    return new a(jobWorkItemDequeueWork);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f77626c = jobParameters;
            this.f77624a.e(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean zB = this.f77624a.b();
            synchronized (this.f77625b) {
                this.f77626c = null;
            }
            return zB;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(26)
    public static final class g extends h {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final JobInfo f77629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final JobScheduler f77630e;

        public g(Context context, ComponentName componentName, int i10) {
            super(componentName);
            b(i10);
            this.f77629d = new JobInfo.Builder(i10, this.f77631a).setOverrideDeadline(0L).build();
            this.f77630e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // d1.p.h
        public void a(Intent intent) {
            this.f77630e.enqueue(this.f77629d, v.a(intent));
        }
    }

    public p() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f77612h = null;
        } else {
            this.f77612h = new ArrayList<>();
        }
    }

    public static void c(@NonNull Context context, @NonNull ComponentName componentName, int i10, @NonNull Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f77604k) {
            h hVarF = f(context, componentName, true, i10);
            hVarF.b(i10);
            hVarF.a(intent);
        }
    }

    public static void d(@NonNull Context context, @NonNull Class<?> cls, int i10, @NonNull Intent intent) {
        c(context, new ComponentName(context, cls), i10, intent);
    }

    public static h f(Context context, ComponentName componentName, boolean z10, int i10) {
        h cVar;
        HashMap<ComponentName, h> map = f77605l;
        h hVar = map.get(componentName);
        if (hVar != null) {
            return hVar;
        }
        if (Build.VERSION.SDK_INT < 26) {
            cVar = new c(context, componentName);
        } else {
            if (!z10) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            cVar = new g(context, componentName, i10);
        }
        map.put(componentName, cVar);
        return cVar;
    }

    public e a() {
        b bVar = this.f77606b;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.f77612h) {
            try {
                if (this.f77612h.size() <= 0) {
                    return null;
                }
                return this.f77612h.remove(0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean b() {
        a aVar = this.f77608d;
        if (aVar != null) {
            aVar.cancel(this.f77609e);
        }
        this.f77610f = true;
        return i();
    }

    public void e(boolean z10) {
        if (this.f77608d == null) {
            this.f77608d = new a();
            h hVar = this.f77607c;
            if (hVar != null && z10) {
                hVar.d();
            }
            this.f77608d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean g() {
        return this.f77610f;
    }

    public abstract void h(@NonNull Intent intent);

    public boolean i() {
        return true;
    }

    public void j() {
        ArrayList<d> arrayList = this.f77612h;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f77608d = null;
                    ArrayList<d> arrayList2 = this.f77612h;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        e(false);
                    } else if (!this.f77611g) {
                        this.f77607c.c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void k(boolean z10) {
        this.f77609e = z10;
    }

    @Override // android.app.Service
    public IBinder onBind(@NonNull Intent intent) {
        b bVar = this.f77606b;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f77606b = new f(this);
            this.f77607c = null;
        } else {
            this.f77606b = null;
            this.f77607c = f(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.f77612h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f77611g = true;
                this.f77607c.c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i10, int i11) {
        if (this.f77612h == null) {
            return 2;
        }
        this.f77607c.e();
        synchronized (this.f77612h) {
            ArrayList<d> arrayList = this.f77612h;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i11));
            e(true);
        }
        return 3;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f77631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f77632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f77633c;

        public h(ComponentName componentName) {
            this.f77631a = componentName;
        }

        public abstract void a(Intent intent);

        public void b(int i10) {
            if (!this.f77632b) {
                this.f77632b = true;
                this.f77633c = i10;
            } else {
                if (this.f77633c == i10) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i10 + " is different than previous " + this.f77633c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }
}
