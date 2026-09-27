package com.monetization.ads.core.identifiers.ad.huawei;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface OpenDeviceIdentifierService extends IInterface {
    @m
    String getOaid() throws RemoteException;

    boolean getOaidTrackLimited() throws RemoteException;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class Stub extends Binder implements OpenDeviceIdentifierService {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f71781a = 0;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class Proxy implements OpenDeviceIdentifierService {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IBinder f71782a;

            public Proxy(@l IBinder iBinder) {
                this.f71782a = iBinder;
            }

            @Override // android.os.IInterface
            @l
            public IBinder asBinder() {
                return this.f71782a;
            }

            @Override // com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService
            @m
            public String getOaid() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    this.f71782a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService
            public boolean getOaidTrackLimited() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    this.f71782a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1) {
                parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                String oaid = getOaid();
                if (parcel2 != null) {
                    parcel2.writeNoException();
                }
                if (parcel2 != null) {
                    parcel2.writeString(oaid);
                }
            } else if (i10 == 2) {
                parcel.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                boolean oaidTrackLimited = getOaidTrackLimited();
                if (parcel2 != null) {
                    parcel2.writeNoException();
                }
                if (parcel2 != null) {
                    parcel2.writeInt(oaidTrackLimited ? 1 : 0);
                }
            } else {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                if (parcel2 != null) {
                    parcel2.writeString("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                }
            }
            return true;
        }

        @Override // android.os.IInterface
        @l
        public IBinder asBinder() {
            return this;
        }
    }
}
