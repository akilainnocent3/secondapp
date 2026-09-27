package com.mbridge.msdk.foundation.tools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f67364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f67365b;

        public b(String str, boolean z10) {
            this.f67364a = str;
            this.f67365b = z10;
        }

        public String a() {
            return this.f67364a;
        }

        public boolean b() {
            return this.f67365b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class d implements IInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IBinder f67370a;

        public d(IBinder iBinder) {
            this.f67370a = iBinder;
        }

        public boolean a(boolean z10) throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(com.tiktok.appevents.e0.d.f76070c);
                parcelObtain.writeInt(z10 ? 1 : 0);
                this.f67370a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                boolean z11 = parcelObtain2.readInt() != 0;
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return z11;
            } catch (Throwable th2) {
                try {
                    q0.b("AdvertisingIdClient", th2.getMessage());
                    return false;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f67370a;
        }

        public String getId() throws RemoteException {
            String string;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken(com.tiktok.appevents.e0.d.f76070c);
                this.f67370a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
            } catch (Throwable th2) {
                try {
                    q0.b("AdvertisingIdClient", th2.getMessage());
                    string = null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
            return string;
        }
    }

    public b a(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        ServiceConnectionC0639c serviceConnectionC0639c = new ServiceConnectionC0639c();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (!context.bindService(intent, serviceConnectionC0639c, 1)) {
            throw new IOException("Google Play connection failed");
        }
        try {
            try {
                d dVar = new d(serviceConnectionC0639c.a());
                b bVar = new b(dVar.getId(), dVar.a(true));
                context.unbindService(serviceConnectionC0639c);
                return bVar;
            } catch (Exception e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            context.unbindService(serviceConnectionC0639c);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class ServiceConnectionC0639c implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f67367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f67368b;

        private ServiceConnectionC0639c() {
            this.f67367a = new LinkedBlockingQueue<>(1);
            this.f67368b = false;
        }

        public IBinder a() throws InterruptedException {
            if (this.f67368b) {
                throw new IllegalStateException();
            }
            this.f67368b = true;
            return this.f67367a.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f67367a.put(iBinder);
            } catch (InterruptedException e10) {
                q0.b("AdvertisingIdClient", e10.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
