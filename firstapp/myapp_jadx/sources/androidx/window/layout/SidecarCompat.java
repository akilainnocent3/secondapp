package androidx.window.layout;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import defpackage.b9j0;
import defpackage.bi90;
import defpackage.ci90;
import defpackage.m2g;
import defpackage.n3h;
import defpackage.w1i0;
import defpackage.wh90;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SidecarCompat implements n3h {
    public final SidecarInterface a;
    public final wh90 b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public b e;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctSidecarElementCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", "token", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {
        public final SidecarInterface.SidecarCallback a;
        public SidecarDeviceState c;
        public final ReentrantLock b = new ReentrantLock();
        public final WeakHashMap<IBinder, SidecarWindowLayoutInfo> d = new WeakHashMap<>();

        public DistinctSidecarElementCallback(wh90 wh90Var, SidecarInterface.SidecarCallback sidecarCallback) {
            this.a = sidecarCallback;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
        
            if (wh90.a.b(r1) == wh90.a.b(r4)) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState r4) {
            /*
                r3 = this;
                r4.getClass()
                java.util.concurrent.locks.ReentrantLock r0 = r3.b
                r0.lock()
                androidx.window.sidecar.SidecarDeviceState r1 = r3.c     // Catch: java.lang.Throwable -> L2f
                boolean r2 = kotlin.jvm.internal.Intrinsics.g(r1, r4)     // Catch: java.lang.Throwable -> L2f
                if (r2 == 0) goto L11
                goto L1e
            L11:
                if (r1 != 0) goto L14
                goto L22
            L14:
                int r1 = wh90.a.b(r1)     // Catch: java.lang.Throwable -> L2f
                int r2 = wh90.a.b(r4)     // Catch: java.lang.Throwable -> L2f
                if (r1 != r2) goto L22
            L1e:
                r0.unlock()
                return
            L22:
                r3.c = r4     // Catch: java.lang.Throwable -> L2f
                androidx.window.sidecar.SidecarInterface$SidecarCallback r3 = r3.a     // Catch: java.lang.Throwable -> L2f
                r3.onDeviceStateChanged(r4)     // Catch: java.lang.Throwable -> L2f
                kotlin.Unit r3 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L2f
                r0.unlock()
                return
            L2f:
                r3 = move-exception
                r0.unlock()
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.DistinctSidecarElementCallback.onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState):void");
        }

        public void onWindowLayoutChanged(IBinder token, SidecarWindowLayoutInfo newLayout) {
            boolean zB;
            token.getClass();
            newLayout.getClass();
            synchronized (this.b) {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = this.d.get(token);
                if (Intrinsics.g(sidecarWindowLayoutInfo, newLayout)) {
                    zB = true;
                } else {
                    zB = sidecarWindowLayoutInfo == null ? false : wh90.b(wh90.a.c(sidecarWindowLayoutInfo), wh90.a.c(newLayout));
                }
                if (zB) {
                    return;
                }
                this.d.put(token, newLayout);
                this.a.onWindowLayoutChanged(token, newLayout);
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/window/layout/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
            Window window;
            WindowManager.LayoutParams attributes;
            SidecarInterface sidecarInterface;
            newDeviceState.getClass();
            Collection<Activity> collectionValues = SidecarCompat.this.c.values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : collectionValues) {
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (iBinder != null && (sidecarInterface = sidecarCompat.a) != null) {
                    windowLayoutInfo = sidecarInterface.getWindowLayoutInfo(iBinder);
                }
                b bVar = sidecarCompat.e;
                if (bVar != null) {
                    bVar.a(activity, sidecarCompat.b.c(windowLayoutInfo, newDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
            windowToken.getClass();
            newLayout.getClass();
            Activity activity = (Activity) SidecarCompat.this.c.get(windowToken);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            SidecarCompat sidecarCompat = SidecarCompat.this;
            wh90 wh90Var = sidecarCompat.b;
            SidecarInterface sidecarInterface = sidecarCompat.a;
            SidecarDeviceState deviceState = sidecarInterface == null ? null : sidecarInterface.getDeviceState();
            if (deviceState == null) {
                deviceState = new SidecarDeviceState();
            }
            b9j0 b9j0VarC = wh90Var.c(newLayout, deviceState);
            b bVar = SidecarCompat.this.e;
            if (bVar == null) {
                return;
            }
            bVar.a(activity, b9j0VarC);
        }
    }

    public static final class a {
        public static SidecarInterface a(Context context) {
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public static w1i0 b() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                w1i0 w1i0Var = w1i0.f;
                return w1i0.a.a(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    public static final class b {
        public final ci90.a a;
        public final ReentrantLock b = new ReentrantLock();
        public final WeakHashMap<Activity, b9j0> c = new WeakHashMap<>();

        public b(ci90.a aVar) {
            this.a = aVar;
        }

        public final void a(Activity activity, b9j0 b9j0Var) {
            WeakHashMap<Activity, b9j0> weakHashMap = this.c;
            activity.getClass();
            ReentrantLock reentrantLock = this.b;
            reentrantLock.lock();
            try {
                if (b9j0Var.equals(weakHashMap.get(activity))) {
                    reentrantLock.unlock();
                    return;
                }
                weakHashMap.put(activity, b9j0Var);
                reentrantLock.unlock();
                for (ci90.b bVar : ci90.this.b) {
                    if (bVar.a.equals(activity)) {
                        bVar.c = b9j0Var;
                        bVar.b.accept(b9j0Var);
                    }
                }
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public static final class c implements View.OnAttachStateChangeListener {
        public final SidecarCompat a;
        public final WeakReference<Activity> b;

        public c(SidecarCompat sidecarCompat, Activity activity) {
            this.a = sidecarCompat;
            this.b = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            Window window;
            WindowManager.LayoutParams attributes;
            view.getClass();
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.b.get();
            IBinder iBinder = null;
            if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                iBinder = attributes.token;
            }
            if (activity == null || iBinder == null) {
                return;
            }
            this.a.d(iBinder, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            view.getClass();
        }
    }

    public SidecarCompat(Context context) {
        SidecarInterface sidecarInterfaceA = a.a(context);
        wh90 wh90Var = new wh90(0);
        this.a = sidecarInterfaceA;
        this.b = wh90Var;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    @Override // defpackage.n3h
    public final void a(Activity activity) {
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder != null) {
            d(iBinder, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
        }
    }

    @Override // defpackage.n3h
    public final void b(Activity activity) {
        SidecarInterface sidecarInterface;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
        }
        LinkedHashMap linkedHashMap = this.d;
        activity.unregisterComponentCallbacks((ComponentCallbacks) linkedHashMap.get(activity));
        linkedHashMap.remove(activity);
        LinkedHashMap linkedHashMap2 = this.c;
        boolean z = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinder);
        if (!z || (sidecarInterface = this.a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    public final b9j0 c(Activity activity) {
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return new b9j0(m2g.a);
        }
        SidecarInterface sidecarInterface = this.a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(iBinder);
        SidecarInterface sidecarInterface2 = this.a;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return this.b.c(windowLayoutInfo, deviceState);
    }

    public final void d(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(activity, c(activity));
        }
        LinkedHashMap linkedHashMap2 = this.d;
        if (linkedHashMap2.get(activity) == null) {
            bi90 bi90Var = new bi90(this, activity);
            linkedHashMap2.put(activity, bi90Var);
            activity.registerComponentCallbacks(bi90Var);
        }
    }

    public final void e(ci90.a aVar) {
        this.e = new b(aVar);
        SidecarInterface sidecarInterface = this.a;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.b, new TranslatingCallback()));
    }

    public final boolean f() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.a;
            Method method = (sidecarInterface == null || (cls = sidecarInterface.getClass()) == null) ? null : cls.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method == null ? null : method.getReturnType();
            Class cls5 = Void.TYPE;
            if (!Intrinsics.g(returnType, cls5)) {
                throw new NoSuchMethodException(Intrinsics.k(returnType, "Illegal return type for 'setSidecarCallback': "));
            }
            SidecarInterface sidecarInterface2 = this.a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.a;
            Method method2 = (sidecarInterface4 == null || (cls2 = sidecarInterface4.getClass()) == null) ? null : cls2.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 == null ? null : method2.getReturnType();
            if (!Intrinsics.g(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException(Intrinsics.k(returnType2, "Illegal return type for 'getWindowLayoutInfo': "));
            }
            SidecarInterface sidecarInterface5 = this.a;
            Method method3 = (sidecarInterface5 == null || (cls3 = sidecarInterface5.getClass()) == null) ? null : cls3.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 == null ? null : method3.getReturnType();
            if (!Intrinsics.g(returnType3, cls5)) {
                throw new NoSuchMethodException(Intrinsics.k(returnType3, "Illegal return type for 'onWindowLayoutChangeListenerAdded': "));
            }
            SidecarInterface sidecarInterface6 = this.a;
            Method method4 = (sidecarInterface6 == null || (cls4 = sidecarInterface6.getClass()) == null) ? null : cls4.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 == null ? null : method4.getReturnType();
            if (!Intrinsics.g(returnType4, cls5)) {
                throw new NoSuchMethodException(Intrinsics.k(returnType4, "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "));
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            rect.getClass();
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
                if (arrayList.equals((List) objInvoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }
}
