package com.google.android.gms.cast;

import a0.j;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.cast.zzdx;
import com.google.android.gms.internal.cast.zzdy;
import com.google.android.gms.internal.cast.zzed;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import r7.h1;
import r7.i1;
import x4.r0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@TargetApi(19)
@Deprecated
public abstract class CastRemoteDisplayLocalService extends Service {
    private static final Logger zza = new Logger("CastRDLocalService");
    private static final int zzb = R.id.cast_notification_id;
    private static final Object zzc = new Object();
    private static final AtomicBoolean zzd = new AtomicBoolean(false);

    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    private static CastRemoteDisplayLocalService zze;

    @Nullable
    private String zzf;
    private WeakReference zzg;
    private zzar zzh;
    private NotificationSettings zzi;

    @Nullable
    private Notification zzj;
    private boolean zzk;
    private PendingIntent zzl;
    private CastDevice zzm;

    @Nullable
    private Display zzn;

    @Nullable
    private Context zzo;

    @Nullable
    private ServiceConnection zzp;
    private Handler zzq;
    private i1 zzr;
    private CastRemoteDisplayClient zzt;
    private boolean zzs = false;
    private final i1.a zzu = new zzag(this);
    private final IBinder zzv = new zzao(this);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface Callbacks {
        void onRemoteDisplayMuteStateChanged(boolean z10);

        void onRemoteDisplaySessionEnded(@NonNull CastRemoteDisplayLocalService castRemoteDisplayLocalService);

        void onRemoteDisplaySessionError(@NonNull Status status);

        void onRemoteDisplaySessionStarted(@NonNull CastRemoteDisplayLocalService castRemoteDisplayLocalService);

        void onServiceCreated(@NonNull CastRemoteDisplayLocalService castRemoteDisplayLocalService);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class NotificationSettings {
        private Notification zza;
        private PendingIntent zzb;
        private String zzc;
        private String zzd;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Builder {
            private final NotificationSettings zza = new NotificationSettings(null);

            @NonNull
            public NotificationSettings build() {
                if (this.zza.zza != null) {
                    if (!TextUtils.isEmpty(this.zza.zzc)) {
                        throw new IllegalArgumentException("notificationTitle requires using the default notification");
                    }
                    if (!TextUtils.isEmpty(this.zza.zzd)) {
                        throw new IllegalArgumentException("notificationText requires using the default notification");
                    }
                    if (this.zza.zzb != null) {
                        throw new IllegalArgumentException("notificationPendingIntent requires using the default notification");
                    }
                } else if (TextUtils.isEmpty(this.zza.zzc) && TextUtils.isEmpty(this.zza.zzd) && this.zza.zzb == null) {
                    throw new IllegalArgumentException("At least an argument must be provided");
                }
                return this.zza;
            }

            @NonNull
            public Builder setNotification(@NonNull Notification notification) {
                this.zza.zza = notification;
                return this;
            }

            @NonNull
            public Builder setNotificationPendingIntent(@NonNull PendingIntent pendingIntent) {
                this.zza.zzb = pendingIntent;
                return this;
            }

            @NonNull
            public Builder setNotificationText(@NonNull String str) {
                this.zza.zzd = str;
                return this;
            }

            @NonNull
            public Builder setNotificationTitle(@NonNull String str) {
                this.zza.zzc = str;
                return this;
            }
        }

        private NotificationSettings() {
        }

        public /* synthetic */ NotificationSettings(zzap zzapVar) {
        }

        public /* synthetic */ NotificationSettings(NotificationSettings notificationSettings, zzap zzapVar) {
            this.zza = notificationSettings.zza;
            this.zzb = notificationSettings.zzb;
            this.zzc = notificationSettings.zzc;
            this.zzd = notificationSettings.zzd;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Options {

        @CastRemoteDisplay.Configuration
        int zza = 2;

        @CastRemoteDisplay.Configuration
        public int getConfigPreset() {
            return this.zza;
        }

        public void setConfigPreset(@CastRemoteDisplay.Configuration int i10) {
            this.zza = i10;
        }
    }

    @Nullable
    public static CastRemoteDisplayLocalService getInstance() {
        CastRemoteDisplayLocalService castRemoteDisplayLocalService;
        synchronized (zzc) {
            castRemoteDisplayLocalService = zze;
        }
        return castRemoteDisplayLocalService;
    }

    public static void setDebugEnabled() {
        zza.zzb(true);
    }

    public static void startService(@NonNull Context context, @NonNull Class<? extends CastRemoteDisplayLocalService> cls, @NonNull String str, @NonNull CastDevice castDevice, @NonNull NotificationSettings notificationSettings, @NonNull Callbacks callbacks) {
        startServiceWithOptions(context, cls, str, castDevice, new Options(), notificationSettings, callbacks);
    }

    public static void startServiceWithOptions(@NonNull Context context, @NonNull Class<? extends CastRemoteDisplayLocalService> cls, @NonNull String str, @NonNull CastDevice castDevice, @NonNull Options options, @NonNull NotificationSettings notificationSettings, @NonNull Callbacks callbacks) {
        Logger logger = zza;
        logger.d("Starting Service", new Object[0]);
        synchronized (zzc) {
            try {
                if (zze != null) {
                    logger.w("An existing service had not been stopped before starting one", new Object[0]);
                    zzw(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            ServiceInfo serviceInfo = context.getPackageManager().getServiceInfo(new ComponentName(context, cls), 128);
            if (serviceInfo != null && serviceInfo.exported) {
                throw new IllegalStateException("The service must not be exported, verify the manifest configuration");
            }
            Preconditions.checkNotNull(context, "activityContext is required.");
            Preconditions.checkNotNull(cls, "serviceClass is required.");
            Preconditions.checkNotNull(str, "applicationId is required.");
            Preconditions.checkNotNull(castDevice, "device is required.");
            Preconditions.checkNotNull(options, "options is required.");
            Preconditions.checkNotNull(notificationSettings, "notificationSettings is required.");
            Preconditions.checkNotNull(callbacks, "callbacks is required.");
            if (notificationSettings.zza == null && notificationSettings.zzb == null) {
                throw new IllegalArgumentException("notificationSettings: Either the notification or the notificationPendingIntent must be provided");
            }
            if (zzd.getAndSet(true)) {
                logger.e("Service is already being started, startService has been called twice", new Object[0]);
                return;
            }
            Intent intent = new Intent(context, cls);
            context.startService(intent);
            ConnectionTracker.getInstance().bindService(context, intent, new zzai(str, castDevice, options, notificationSettings, context, callbacks), 64);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalStateException("Service not found, did you forget to configure it in the manifest?", e10);
        }
    }

    public static void stopService() {
        zzw(false);
    }

    public static /* bridge */ /* synthetic */ void zzl(CastRemoteDisplayLocalService castRemoteDisplayLocalService, Display display) {
        if (display == null) {
            zza.e("Cast Remote Display session created without display", new Object[0]);
            return;
        }
        castRemoteDisplayLocalService.zzn = display;
        if (castRemoteDisplayLocalService.zzk) {
            Notification notificationZzu = castRemoteDisplayLocalService.zzu(true);
            castRemoteDisplayLocalService.zzj = notificationZzu;
            castRemoteDisplayLocalService.startForeground(zzb, notificationZzu);
        }
        Callbacks callbacks = (Callbacks) castRemoteDisplayLocalService.zzg.get();
        if (callbacks != null) {
            callbacks.onRemoteDisplaySessionStarted(castRemoteDisplayLocalService);
        }
        Preconditions.checkNotNull(castRemoteDisplayLocalService.zzn, "display is required.");
        castRemoteDisplayLocalService.onCreatePresentation(castRemoteDisplayLocalService.zzn);
    }

    public static /* bridge */ /* synthetic */ void zzo(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
        Callbacks callbacks = (Callbacks) castRemoteDisplayLocalService.zzg.get();
        if (callbacks != null) {
            callbacks.onRemoteDisplaySessionError(new Status(2200));
        }
        stopService();
    }

    public static /* bridge */ /* synthetic */ void zzq(CastRemoteDisplayLocalService castRemoteDisplayLocalService, NotificationSettings notificationSettings) {
        Preconditions.checkMainThread("updateNotificationSettingsInternal must be called on the main thread");
        if (castRemoteDisplayLocalService.zzi == null) {
            throw new IllegalStateException("No current notification settings to update");
        }
        if (!castRemoteDisplayLocalService.zzk) {
            Preconditions.checkNotNull(notificationSettings.zza, "notification is required.");
            Notification notification = notificationSettings.zza;
            castRemoteDisplayLocalService.zzj = notification;
            castRemoteDisplayLocalService.zzi.zza = notification;
        } else {
            if (notificationSettings.zza != null) {
                throw new IllegalStateException("Current mode is default notification, notification attribute must not be provided");
            }
            if (notificationSettings.zzb != null) {
                castRemoteDisplayLocalService.zzi.zzb = notificationSettings.zzb;
            }
            if (!TextUtils.isEmpty(notificationSettings.zzc)) {
                castRemoteDisplayLocalService.zzi.zzc = notificationSettings.zzc;
            }
            if (!TextUtils.isEmpty(notificationSettings.zzd)) {
                castRemoteDisplayLocalService.zzi.zzd = notificationSettings.zzd;
            }
            castRemoteDisplayLocalService.zzj = castRemoteDisplayLocalService.zzu(true);
        }
        castRemoteDisplayLocalService.startForeground(zzb, castRemoteDisplayLocalService.zzj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ boolean zzt(CastRemoteDisplayLocalService castRemoteDisplayLocalService, String str, CastDevice castDevice, Options options, NotificationSettings notificationSettings, Context context, ServiceConnection serviceConnection, Callbacks callbacks) {
        castRemoteDisplayLocalService.zzv("startRemoteDisplaySession");
        Preconditions.checkMainThread("Starting the Cast Remote Display must be done on the main thread");
        synchronized (zzc) {
            try {
                if (zze != null) {
                    zza.w("An existing service had not been stopped before starting one", new Object[0]);
                    return false;
                }
                zze = castRemoteDisplayLocalService;
                castRemoteDisplayLocalService.zzg = new WeakReference(callbacks);
                castRemoteDisplayLocalService.zzf = str;
                castRemoteDisplayLocalService.zzm = castDevice;
                castRemoteDisplayLocalService.zzo = context;
                castRemoteDisplayLocalService.zzp = serviceConnection;
                if (castRemoteDisplayLocalService.zzr == null) {
                    castRemoteDisplayLocalService.zzr = i1.l(castRemoteDisplayLocalService.getApplicationContext());
                }
                Preconditions.checkNotNull(castRemoteDisplayLocalService.zzf, "applicationId is required.");
                h1 h1VarD = new h1.a().b(CastMediaControlIntent.categoryForCast(castRemoteDisplayLocalService.zzf)).d();
                castRemoteDisplayLocalService.zzv("addMediaRouterCallback");
                castRemoteDisplayLocalService.zzr.b(h1VarD, castRemoteDisplayLocalService.zzu, 4);
                castRemoteDisplayLocalService.zzj = notificationSettings.zza;
                Object[] objArr = 0;
                castRemoteDisplayLocalService.zzh = new zzar(null);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT");
                intentFilter.addAction("com.google.android.gms.cast.remote_display.ACTION_SESSION_ENDED");
                if (PlatformVersion.isAtLeastT()) {
                    castRemoteDisplayLocalService.registerReceiver(castRemoteDisplayLocalService.zzh, intentFilter, 4);
                } else {
                    zzdx.zza(castRemoteDisplayLocalService, castRemoteDisplayLocalService.zzh, intentFilter);
                }
                NotificationSettings notificationSettings2 = new NotificationSettings(notificationSettings, objArr == true ? 1 : 0);
                castRemoteDisplayLocalService.zzi = notificationSettings2;
                if (notificationSettings2.zza == null) {
                    castRemoteDisplayLocalService.zzk = true;
                    castRemoteDisplayLocalService.zzj = castRemoteDisplayLocalService.zzu(false);
                } else {
                    castRemoteDisplayLocalService.zzk = false;
                    castRemoteDisplayLocalService.zzj = castRemoteDisplayLocalService.zzi.zza;
                }
                castRemoteDisplayLocalService.startForeground(zzb, castRemoteDisplayLocalService.zzj);
                castRemoteDisplayLocalService.zzv("startRemoteDisplay");
                Intent intent = new Intent("com.google.android.gms.cast.remote_display.ACTION_SESSION_ENDED");
                Preconditions.checkNotNull(castRemoteDisplayLocalService.zzo, "activityContext is required.");
                intent.setPackage(castRemoteDisplayLocalService.zzo.getPackageName());
                PendingIntent broadcast = PendingIntent.getBroadcast(castRemoteDisplayLocalService, 0, intent, zzdy.zza);
                zzal zzalVar = new zzal(castRemoteDisplayLocalService);
                Preconditions.checkNotNull(castRemoteDisplayLocalService.zzf, "applicationId is required.");
                castRemoteDisplayLocalService.zzt.zze(castDevice, castRemoteDisplayLocalService.zzf, options.getConfigPreset(), broadcast, zzalVar).addOnCompleteListener(new zzam(castRemoteDisplayLocalService));
                Callbacks callbacks2 = (Callbacks) castRemoteDisplayLocalService.zzg.get();
                if (callbacks2 == null) {
                    return true;
                }
                callbacks2.onServiceCreated(castRemoteDisplayLocalService);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final Notification zzu(boolean z10) {
        int i10;
        int i11;
        zzv("createDefaultNotification");
        String str = this.zzi.zzc;
        String string = this.zzi.zzd;
        if (z10) {
            i10 = R.string.cast_notification_connected_message;
            i11 = R.drawable.cast_ic_notification_on;
        } else {
            i10 = R.string.cast_notification_connecting_message;
            i11 = R.drawable.cast_ic_notification_connecting;
        }
        if (TextUtils.isEmpty(str)) {
            str = (String) getPackageManager().getApplicationLabel(getApplicationInfo());
        }
        if (TextUtils.isEmpty(string)) {
            string = getString(i10, this.zzm.getFriendlyName());
        }
        NotificationCompat.n nVarI0 = new NotificationCompat.n(this, "cast_remote_display_local_service").O(str).N(string).M(this.zzi.zzb).t0(i11).i0(true);
        String string2 = getString(R.string.cast_notification_disconnect);
        if (this.zzl == null) {
            Preconditions.checkNotNull(this.zzo, "activityContext is required.");
            Intent intent = new Intent("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT");
            intent.setPackage(this.zzo.getPackageName());
            this.zzl = PendingIntent.getBroadcast(this, 0, intent, zzdy.zza | 134217728);
        }
        return nVarI0.a(android.R.drawable.ic_menu_close_clear_cancel, string2, this.zzl).h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str) {
        zza.d("[Instance: %s] %s", this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzw(boolean z10) {
        Logger logger = zza;
        logger.d("Stopping Service", new Object[0]);
        zzd.set(false);
        synchronized (zzc) {
            try {
                CastRemoteDisplayLocalService castRemoteDisplayLocalService = zze;
                if (castRemoteDisplayLocalService == null) {
                    logger.e("Service is already being stopped", new Object[0]);
                    return;
                }
                zze = null;
                if (castRemoteDisplayLocalService.zzq != null) {
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        castRemoteDisplayLocalService.zzq.post(new zzaj(castRemoteDisplayLocalService, z10));
                    } else {
                        castRemoteDisplayLocalService.zzx(z10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzx(boolean z10) {
        zzv("Stopping Service");
        Preconditions.checkMainThread("stopServiceInstanceInternal must be called on the main thread");
        if (!z10 && this.zzr != null) {
            zzv("Setting default route");
            i1 i1Var = this.zzr;
            i1Var.A(i1Var.i());
        }
        if (this.zzh != null) {
            zzv("Unregistering notification receiver");
            unregisterReceiver(this.zzh);
        }
        zzv("stopRemoteDisplaySession");
        zzv("stopRemoteDisplay");
        this.zzt.stopRemoteDisplay().addOnCompleteListener(new zzan(this));
        Callbacks callbacks = (Callbacks) this.zzg.get();
        if (callbacks != null) {
            callbacks.onRemoteDisplaySessionEnded(this);
        }
        onDismissPresentation();
        zzv("Stopping the remote display Service");
        stopForeground(true);
        stopSelf();
        if (this.zzr != null) {
            Preconditions.checkMainThread("CastRemoteDisplayLocalService calls must be done on the main thread");
            zzv("removeMediaRouterCallback");
            this.zzr.v(this.zzu);
        }
        Context context = this.zzo;
        ServiceConnection serviceConnection = this.zzp;
        if (context != null && serviceConnection != null) {
            try {
                ConnectionTracker.getInstance().unbindService(context, serviceConnection);
            } catch (IllegalArgumentException unused) {
                zzv("No need to unbind service, already unbound");
            }
        }
        this.zzp = null;
        this.zzo = null;
        this.zzf = null;
        this.zzj = null;
        this.zzn = null;
    }

    @Nullable
    public Display getCastRemoteDisplay() {
        return this.zzn;
    }

    @Override // android.app.Service
    @NonNull
    public IBinder onBind(@NonNull Intent intent) {
        zzv("onBind");
        return this.zzv;
    }

    @Override // android.app.Service
    public void onCreate() {
        zzv("onCreate");
        super.onCreate();
        zzed zzedVar = new zzed(getMainLooper());
        this.zzq = zzedVar;
        zzedVar.postDelayed(new zzah(this), 100L);
        if (this.zzt == null) {
            this.zzt = CastRemoteDisplay.getClient(this);
        }
        if (PlatformVersion.isAtLeastO()) {
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            r0.a();
            NotificationChannel notificationChannelA = j.a("cast_remote_display_local_service", getString(R.string.cast_notification_default_channel_name), 2);
            notificationChannelA.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannelA);
        }
    }

    public abstract void onCreatePresentation(@NonNull Display display);

    public abstract void onDismissPresentation();

    @Override // android.app.Service
    public int onStartCommand(@NonNull Intent intent, int i10, int i11) {
        zzv("onStartCommand");
        this.zzs = true;
        return 2;
    }

    @Deprecated
    public void updateNotificationSettings(@NonNull NotificationSettings notificationSettings) {
        if (PlatformVersion.isAtLeastS()) {
            return;
        }
        Preconditions.checkNotNull(notificationSettings, "notificationSettings is required.");
        Preconditions.checkNotNull(this.zzq, "Service is not ready yet.");
        this.zzq.post(new zzak(this, notificationSettings));
    }
}
