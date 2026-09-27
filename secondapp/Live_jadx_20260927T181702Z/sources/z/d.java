package z;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f160067d = "CustomTabsClient";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.b f160068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ComponentName f160069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f160070c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends c.a.b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Handler f160072m = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ z.c f160073n;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Bundle f160075b;

            public a(Bundle bundle) {
                this.f160075b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f160073n.onUnminimized(this.f160075b);
            }
        }

        /* JADX INFO: renamed from: z.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class RunnableC1566b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f160077b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f160078c;

            public RunnableC1566b(int i10, Bundle bundle) {
                this.f160077b = i10;
                this.f160078c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f160073n.onNavigationEvent(this.f160077b, this.f160078c);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class c implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f160080b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f160081c;

            public c(String str, Bundle bundle) {
                this.f160080b = str;
                this.f160081c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f160073n.extraCallback(this.f160080b, this.f160081c);
            }
        }

        /* JADX INFO: renamed from: z.d$b$d, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class RunnableC1567d implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Bundle f160083b;

            public RunnableC1567d(Bundle bundle) {
                this.f160083b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f160073n.onMessageChannelReady(this.f160083b);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class e implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f160085b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Bundle f160086c;

            public e(String str, Bundle bundle) {
                this.f160085b = str;
                this.f160086c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f160073n.onPostMessage(this.f160085b, this.f160086c);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class f implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f160088b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Uri f160089c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ boolean f160090d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Bundle f160091e;

            public f(int i10, Uri uri, boolean z10, Bundle bundle) {
                this.f160088b = i10;
                this.f160089c = uri;
                this.f160090d = z10;
                this.f160091e = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f160073n.onRelationshipValidationResult(this.f160088b, this.f160089c, this.f160090d, this.f160091e);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class g implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f160093b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f160094c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Bundle f160095d;

            public g(int i10, int i11, Bundle bundle) {
                this.f160093b = i10;
                this.f160094c = i11;
                this.f160095d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f160073n.onActivityResized(this.f160093b, this.f160094c, this.f160095d);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class h implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Bundle f160097b;

            public h(Bundle bundle) {
                this.f160097b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f160073n.onWarmupCompleted(this.f160097b);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class i implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f160099b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f160100c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f160101d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f160102e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ int f160103f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Bundle f160104g;

            public i(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
                this.f160099b = i10;
                this.f160100c = i11;
                this.f160101d = i12;
                this.f160102e = i13;
                this.f160103f = i14;
                this.f160104g = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f160073n.onActivityLayout(this.f160099b, this.f160100c, this.f160101d, this.f160102e, this.f160103f, this.f160104g);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class j implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Bundle f160106b;

            public j(Bundle bundle) {
                this.f160106b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f160073n.onMinimized(this.f160106b);
            }
        }

        public b(z.c cVar) {
            this.f160073n = cVar;
        }

        @Override // c.a
        public void D1(@NonNull Bundle bundle) throws RemoteException {
            if (this.f160073n == null) {
                return;
            }
            this.f160072m.post(new h(bundle));
        }

        @Override // c.a
        public void E(int i10, int i11, int i12, int i13, int i14, @NonNull Bundle bundle) throws RemoteException {
            if (this.f160073n == null) {
                return;
            }
            this.f160072m.post(new i(i10, i11, i12, i13, i14, bundle));
        }

        @Override // c.a
        public void E2(Bundle bundle) throws RemoteException {
            if (this.f160073n == null) {
                return;
            }
            this.f160072m.post(new RunnableC1567d(bundle));
        }

        @Override // c.a
        public void F0(int i10, int i11, @Nullable Bundle bundle) throws RemoteException {
            if (this.f160073n == null) {
                return;
            }
            this.f160072m.post(new g(i10, i11, bundle));
        }

        @Override // c.a
        public void G2(int i10, Uri uri, boolean z10, @Nullable Bundle bundle) throws RemoteException {
            if (this.f160073n == null) {
                return;
            }
            this.f160072m.post(new f(i10, uri, z10, bundle));
        }

        @Override // c.a
        public Bundle K(@NonNull String str, @Nullable Bundle bundle) throws RemoteException {
            z.c cVar = this.f160073n;
            if (cVar == null) {
                return null;
            }
            return cVar.extraCallbackWithResult(str, bundle);
        }

        @Override // c.a
        public void M0(int i10, Bundle bundle) {
            if (this.f160073n == null) {
                return;
            }
            this.f160072m.post(new RunnableC1566b(i10, bundle));
        }

        @Override // c.a
        public void n2(@NonNull Bundle bundle) throws RemoteException {
            if (this.f160073n == null) {
                return;
            }
            this.f160072m.post(new j(bundle));
        }

        @Override // c.a
        public void p2(@NonNull Bundle bundle) throws RemoteException {
            if (this.f160073n == null) {
                return;
            }
            this.f160072m.post(new a(bundle));
        }

        @Override // c.a
        public void u(String str, Bundle bundle) throws RemoteException {
            if (this.f160073n == null) {
                return;
            }
            this.f160072m.post(new e(str, bundle));
        }

        @Override // c.a
        public void z1(String str, Bundle bundle) throws RemoteException {
            if (this.f160073n == null) {
                return;
            }
            this.f160072m.post(new c(str, bundle));
        }
    }

    public d(c.b bVar, ComponentName componentName, Context context) {
        this.f160068a = bVar;
        this.f160069b = componentName;
        this.f160070c = context;
    }

    public static boolean b(@NonNull Context context, @Nullable String str, @NonNull i iVar) {
        iVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent(h.f160173d);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, iVar, 33);
    }

    public static boolean c(@NonNull Context context, @Nullable String str, @NonNull i iVar) {
        iVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent(h.f160173d);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, iVar, 1);
    }

    public static boolean d(@NonNull Context context, @NonNull String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return b(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static PendingIntent f(Context context, int i10) {
        return PendingIntent.getActivity(context, i10, new Intent(), 67108864);
    }

    @Nullable
    public static String h(@NonNull Context context, @Nullable List<String> list) {
        return i(context, list, false);
    }

    @Nullable
    public static String i(@NonNull Context context, @Nullable List<String> list, boolean z10) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z10 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent(h.f160173d);
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w(f160067d, "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    @NonNull
    @y0({y0.a.LIBRARY})
    public static m.d j(@NonNull Context context, @Nullable c cVar, int i10) {
        return new m.d(cVar, f(context, i10));
    }

    @Nullable
    @y0({y0.a.LIBRARY})
    public m a(@NonNull m.d dVar) {
        return m(dVar.a(), dVar.b());
    }

    public final c.a.b e(@Nullable c cVar) {
        return new b(cVar);
    }

    @Nullable
    public Bundle g(@NonNull String str, @Nullable Bundle bundle) {
        try {
            return this.f160068a.h1(str, bundle);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Nullable
    public m k(@Nullable c cVar) {
        return m(cVar, null);
    }

    @Nullable
    public m l(@Nullable c cVar, int i10) {
        return m(cVar, f(this.f160070c, i10));
    }

    @Nullable
    public final m m(@Nullable c cVar, @Nullable PendingIntent pendingIntent) {
        boolean zF1;
        c.a.b bVarE = e(cVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(f.f160115e, pendingIntent);
                zF1 = this.f160068a.a1(bVarE, bundle);
            } else {
                zF1 = this.f160068a.f1(bVarE);
            }
            if (zF1) {
                return new m(this.f160068a, bVarE, this.f160069b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean n(long j10) {
        try {
            return this.f160068a.A0(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f160071b;

        public a(Context context) {
            this.f160071b = context;
        }

        @Override // z.i
        public final void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull d dVar) {
            dVar.n(0L);
            this.f160071b.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
