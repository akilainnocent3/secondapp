package androidx.media3.session.legacy;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import k.y0;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY})
public interface b extends IInterface {
    void L2(@Nullable androidx.media3.session.legacy.a aVar) throws RemoteException;

    boolean g() throws RemoteException;

    @Nullable
    PlaybackStateCompat getPlaybackState() throws RemoteException;

    int getRepeatMode() throws RemoteException;

    @Nullable
    Bundle h() throws RemoteException;

    int i() throws RemoteException;

    void u2(@Nullable androidx.media3.session.legacy.a aVar) throws RemoteException;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f15905b = "android.support.v4.media.session.IMediaSession";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f15906c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f15907d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f15908e = 28;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f15909f = 45;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f15910g = 37;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f15911h = 47;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f15912i = 50;

        /* JADX INFO: renamed from: androidx.media3.session.legacy.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class C0122a implements b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public static b f15913c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f15914b;

            public C0122a(IBinder iBinder) {
                this.f15914b = iBinder;
            }

            @Override // androidx.media3.session.legacy.b
            public void L2(@Nullable androidx.media3.session.legacy.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f15914b.transact(3, parcelObtain, parcelObtain2, 0) || a.O2() == null) {
                        parcelObtain2.readException();
                    } else {
                        ((b) l0.E(a.O2())).L2(aVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String N2() {
                return "android.support.v4.media.session.IMediaSession";
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f15914b;
            }

            @Override // androidx.media3.session.legacy.b
            public boolean g() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f15914b.transact(45, parcelObtain, parcelObtain2, 0) && a.O2() != null) {
                        return ((b) l0.E(a.O2())).g();
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.b
            @Nullable
            public PlaybackStateCompat getPlaybackState() throws RemoteException {
                PlaybackStateCompat playbackStateCompatCreateFromParcel;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (this.f15914b.transact(28, parcelObtain, parcelObtain2, 0) || a.O2() == null) {
                        parcelObtain2.readException();
                        playbackStateCompatCreateFromParcel = parcelObtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcelObtain2) : null;
                    } else {
                        playbackStateCompatCreateFromParcel = ((b) l0.E(a.O2())).getPlaybackState();
                    }
                    return playbackStateCompatCreateFromParcel;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.b
            public int getRepeatMode() throws RemoteException {
                int repeatMode;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (this.f15914b.transact(37, parcelObtain, parcelObtain2, 0) || a.O2() == null) {
                        parcelObtain2.readException();
                        repeatMode = parcelObtain2.readInt();
                    } else {
                        repeatMode = ((b) l0.E(a.O2())).getRepeatMode();
                    }
                    return repeatMode;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.b
            @Nullable
            public Bundle h() throws RemoteException {
                Bundle bundleH;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (this.f15914b.transact(50, parcelObtain, parcelObtain2, 0) || a.O2() == null) {
                        parcelObtain2.readException();
                        bundleH = parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                    } else {
                        bundleH = ((b) l0.E(a.O2())).h();
                    }
                    return bundleH;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.b
            public int i() throws RemoteException {
                int i10;
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (this.f15914b.transact(47, parcelObtain, parcelObtain2, 0) || a.O2() == null) {
                        parcelObtain2.readException();
                        i10 = parcelObtain2.readInt();
                    } else {
                        i10 = ((b) l0.E(a.O2())).i();
                    }
                    return i10;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.b
            public void u2(@Nullable androidx.media3.session.legacy.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (this.f15914b.transact(4, parcelObtain, parcelObtain2, 0) || a.O2() == null) {
                        parcelObtain2.readException();
                    } else {
                        ((b) l0.E(a.O2())).u2(aVar);
                    }
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        public static b N2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0122a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Nullable
        public static b O2() {
            return C0122a.f15913c;
        }

        public static boolean P2(b bVar) {
            if (C0122a.f15913c != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (bVar == null) {
                return false;
            }
            C0122a.f15913c = bVar;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, @Nullable Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 3) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                L2(androidx.media3.session.legacy.a.AbstractBinderC0120a.N2(parcel.readStrongBinder()));
                ((Parcel) l0.E(parcel2)).writeNoException();
                return true;
            }
            if (i10 == 4) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                u2(androidx.media3.session.legacy.a.AbstractBinderC0120a.N2(parcel.readStrongBinder()));
                ((Parcel) l0.E(parcel2)).writeNoException();
                return true;
            }
            if (i10 == 28) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                PlaybackStateCompat playbackState = getPlaybackState();
                ((Parcel) l0.E(parcel2)).writeNoException();
                if (playbackState != null) {
                    ((Parcel) l0.E(parcel2)).writeInt(1);
                    playbackState.writeToParcel(parcel2, 1);
                } else {
                    ((Parcel) l0.E(parcel2)).writeInt(0);
                }
                return true;
            }
            if (i10 == 37) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int repeatMode = getRepeatMode();
                ((Parcel) l0.E(parcel2)).writeNoException();
                ((Parcel) l0.E(parcel2)).writeInt(repeatMode);
                return true;
            }
            if (i10 == 45) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                boolean zG = g();
                ((Parcel) l0.E(parcel2)).writeNoException();
                ((Parcel) l0.E(parcel2)).writeInt(zG ? 1 : 0);
                return true;
            }
            if (i10 == 47) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int i12 = i();
                ((Parcel) l0.E(parcel2)).writeNoException();
                ((Parcel) l0.E(parcel2)).writeInt(i12);
                return true;
            }
            if (i10 != 50) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                ((Parcel) l0.E(parcel2)).writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            Bundle bundleH = h();
            ((Parcel) l0.E(parcel2)).writeNoException();
            if (bundleH != null) {
                ((Parcel) l0.E(parcel2)).writeInt(1);
                bundleH.writeToParcel(parcel2, 1);
            } else {
                ((Parcel) l0.E(parcel2)).writeInt(0);
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
