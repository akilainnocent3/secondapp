package com.startapp.sdk.common.advertisingid;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.sdk.adsbase.remoteconfig.AdvertisingIdResolverMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.k0;
import com.startapp.sdk.internal.l0;
import com.startapp.sdk.internal.l3;
import com.startapp.sdk.internal.p0;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.u5;
import com.tiktok.appevents.e0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f74446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u5 f74447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l3 f74448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ReentrantLock f74449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Condition f74450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f74451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f74452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile int f74453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f74454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f74455j;

    public b(Context context, u5 u5Var, l3 l3Var) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f74449d = reentrantLock;
        this.f74450e = reentrantLock.newCondition();
        this.f74451f = new AtomicReference();
        this.f74452g = true;
        this.f74453h = 0;
        this.f74454i = ((Random) si.f75517d.a()).nextDouble();
        this.f74446a = context;
        this.f74447b = u5Var;
        this.f74448c = l3Var;
    }

    public final boolean a(int i10) {
        this.f74448c.getClass();
        AdvertisingIdResolverMetadata advertisingIdResolverMetadataG = MetaData.E().g();
        if (advertisingIdResolverMetadataG == null || !advertisingIdResolverMetadataG.c()) {
            advertisingIdResolverMetadataG = null;
        }
        return advertisingIdResolverMetadataG != null && this.f74454i < advertisingIdResolverMetadataG.b() && (advertisingIdResolverMetadataG.a() & i10) == i10;
    }

    public final void b(int i10) {
        if (a(i10)) {
            int i11 = this.f74455j;
            if ((i11 & i10) == i10) {
                return;
            }
            this.f74455j = i11 | i10;
            d9 d9Var = new d9(e9.f74722e);
            d9Var.f74675d = "AIR";
            d9Var.f74676e = String.valueOf(i10);
            d9Var.a();
        }
    }

    public final void a(boolean z10) {
        boolean z11 = false;
        try {
            if (this.f74449d.tryLock()) {
                z11 = true;
                this.f74452g = z10;
                if (z10 && this.f74453h == 0) {
                    this.f74447b.newThread(new a(this)).start();
                    this.f74453h = 1;
                }
                this.f74449d.unlock();
            }
        } catch (Throwable th2) {
            try {
                if (a(16)) {
                    d9.a(th2);
                }
            } finally {
                if (z11) {
                    this.f74449d.unlock();
                }
            }
        }
    }

    public static k0 b(Context context) throws Throwable {
        l0 l0Var;
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            l0Var = new l0();
            try {
                if (context.bindService(intent, l0Var, 1)) {
                    if (!l0Var.f75106b) {
                        IBinder iBinder = (IBinder) l0Var.f75105a.take();
                        if (iBinder != null) {
                            l0Var.f75106b = true;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken(e0.d.f76070c);
                                iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                String string = parcelObtain2.readString();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                if (string != null) {
                                    Parcel parcelObtain3 = Parcel.obtain();
                                    Parcel parcelObtain4 = Parcel.obtain();
                                    try {
                                        parcelObtain3.writeInterfaceToken(e0.d.f76070c);
                                        parcelObtain3.writeInt(1);
                                        iBinder.transact(2, parcelObtain3, parcelObtain4, 0);
                                        parcelObtain4.readException();
                                        boolean z10 = parcelObtain4.readInt() != 0;
                                        parcelObtain4.recycle();
                                        parcelObtain3.recycle();
                                        k0 k0Var = new k0(string, "DEVICE", z10);
                                        int i10 = p0.f75355a;
                                        try {
                                            context.unbindService(l0Var);
                                        } catch (Throwable unused) {
                                        }
                                        return k0Var;
                                    } catch (Throwable th2) {
                                        parcelObtain4.recycle();
                                        parcelObtain3.recycle();
                                        throw th2;
                                    }
                                }
                                throw new RemoteException();
                            } catch (Throwable th3) {
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th3;
                            }
                        }
                        throw new IllegalStateException();
                    }
                    throw new IllegalStateException();
                }
                throw new AdvertisingIdResolver$InternalException(2048);
            } catch (Throwable th4) {
                th = th4;
                int i11 = p0.f75355a;
                if (l0Var != null) {
                    try {
                        context.unbindService(l0Var);
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            l0Var = null;
        }
    }

    public final k0 a() {
        k0 k0Var;
        ReentrantLock reentrantLock;
        k0 k0Var2 = (k0) this.f74451f.get();
        if (k0Var2 != null) {
            return k0Var2;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            b(1);
            return k0.f75069d;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f74449d.tryLock(1000L, TimeUnit.MILLISECONDS)) {
                try {
                    if (!this.f74452g) {
                        k0Var = k0.f75069d;
                        reentrantLock = this.f74449d;
                    } else {
                        if (this.f74453h == 0) {
                            this.f74447b.newThread(new a(this)).start();
                            this.f74453h = 1;
                        }
                        while (this.f74453h != 2) {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            if (jElapsedRealtime2 > 1000) {
                                b(2);
                                k0Var = k0.f75069d;
                                reentrantLock = this.f74449d;
                            } else {
                                this.f74450e.await(1000 - jElapsedRealtime2, TimeUnit.MILLISECONDS);
                            }
                        }
                        k0 k0Var3 = (k0) this.f74451f.get();
                        if (k0Var3 == null) {
                            b(4);
                            k0Var3 = k0.f75069d;
                        } else if ("00000000-0000-0000-0000-000000000000".equals(k0Var3.f75070a) && Build.VERSION.SDK_INT >= 31) {
                            try {
                                if (this.f74446a.checkSelfPermission("com.google.android.gms.permission.AD_ID") != 0) {
                                    b(4096);
                                }
                            } catch (Throwable th2) {
                                if (a(8192)) {
                                    d9.a(th2);
                                }
                            }
                        }
                        this.f74449d.unlock();
                        return k0Var3;
                    }
                    reentrantLock.unlock();
                    return k0Var;
                } catch (Throwable th3) {
                    this.f74449d.unlock();
                    throw th3;
                }
            }
            b(8);
            return k0.f75069d;
        } catch (Throwable th4) {
            if (a(32)) {
                d9.a(th4);
            }
            return k0.f75069d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c A[EDGE_INSN: B:27:0x007c->B:28:0x007d BREAK  A[LOOP:1: B:18:0x0055->B:26:0x0079]] */
    public static k0 a(Context context) throws IllegalAccessException, AdvertisingIdResolver$InternalException, InvocationTargetException {
        Object objInvoke;
        Class<?> cls = Boolean.TYPE;
        String str = null;
        try {
            objInvoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
        } catch (NoSuchMethodException unused) {
            Class<?>[] declaredClasses = AdvertisingIdClient.class.getDeclaredClasses();
            if (declaredClasses.length != 1) {
                objInvoke = null;
                break;
            }
            Field[] declaredFields = declaredClasses[0].getDeclaredFields();
            if (declaredFields.length != 2 || ((declaredFields[0].getType() != String.class || declaredFields[1].getType() != cls) && (declaredFields[0].getType() != cls || declaredFields[1].getType() != String.class))) {
                objInvoke = null;
                break;
            }
            Method[] declaredMethods = AdvertisingIdClient.class.getDeclaredMethods();
            int length = declaredMethods.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    objInvoke = null;
                    break;
                }
                Method method = declaredMethods[i10];
                if (method.getReturnType() == declaredClasses[0] && method.getParameterTypes().length == 1 && method.getParameterTypes()[0] == Context.class) {
                    objInvoke = method.invoke(null, context);
                    break;
                }
                i10++;
            }
        }
        if (objInvoke != null) {
            Field[] declaredFields2 = objInvoke.getClass().getDeclaredFields();
            if (declaredFields2.length == 2) {
                Boolean bool = null;
                for (Field field : declaredFields2) {
                    field.setAccessible(true);
                    if (field.getType() == String.class) {
                        str = (String) field.get(objInvoke);
                    } else if (field.getType() == cls) {
                        bool = (Boolean) field.get(objInvoke);
                    }
                }
                if (str != null && !str.isEmpty()) {
                    return new k0(str, IronSourceConstants.APP_EVENT_TYPE, Boolean.TRUE.equals(bool));
                }
                throw new AdvertisingIdResolver$InternalException(1024);
            }
            throw new AdvertisingIdResolver$InternalException(512);
        }
        throw new AdvertisingIdResolver$InternalException(512);
    }
}
