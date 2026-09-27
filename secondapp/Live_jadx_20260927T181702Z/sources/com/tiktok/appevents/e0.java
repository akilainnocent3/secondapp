package com.tiktok.appevents;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f76065a = "com.tiktok.appevents.e0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kp.h f76066b = new kp.h(e0.class.getCanonicalName(), dp.c.s());

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f76069b;

        public String a() {
            return this.f76068a;
        }

        public boolean b() {
            return this.f76069b;
        }

        public c(String adId, boolean isAdTrackingEnabled) {
            this.f76068a = adId;
            this.f76069b = isAdTrackingEnabled;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d implements IInterface {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f76070c = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f76071d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f76072e = 2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final IBinder f76073b;

        public final String P2() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(f76070c);
                this.f76073b.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        }

        public final boolean Q2() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(f76070c);
                parcelObtain.writeInt(1);
                this.f76073b.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f76073b;
        }

        public d(IBinder binder) {
            this.f76073b = binder;
        }
    }

    public static c a(Context context) {
        String str = "";
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        } catch (PackageManager.NameNotFoundException unused) {
            f76066b.c("Google play service not installed", new Object[0]);
        }
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        b bVar = new b();
        boolean z10 = true;
        try {
            if (!context.bindService(intent, bVar, 1)) {
                f76066b.c("Failed to detect google play identifier service on this phone", new Object[0]);
                return new c(str, z10);
            }
            d dVar = new d(bVar.n());
            String strP2 = dVar.P2();
            boolean zQ2 = dVar.Q2();
            return TextUtils.isEmpty(strP2) ? new c(str, zQ2) : new c(strP2, zQ2);
        } catch (Exception e10) {
            f76066b.b(e10, "remote exception", new Object[0]);
            return new c(str, z10);
        } finally {
            context.unbindService(bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements ServiceConnection {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BlockingQueue<IBinder> f76067b;

        public b() {
            this.f76067b = new ArrayBlockingQueue(1);
        }

        public IBinder n() throws IllegalStateException {
            try {
                return this.f76067b.take();
            } catch (InterruptedException unused) {
                throw new IllegalStateException("Exception trying to retrieve GMS connection");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws IllegalStateException {
            try {
                this.f76067b.put(iBinder);
            } catch (InterruptedException unused) {
                throw new IllegalStateException("Exception trying to parse GMS connection");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
