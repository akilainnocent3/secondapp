package androidx.media3.session.legacy;

import android.os.Binder;
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
public interface a extends IInterface {
    void B1(@Nullable PlaybackStateCompat playbackStateCompat) throws RemoteException;

    void c() throws RemoteException;

    void onRepeatModeChanged(int i10) throws RemoteException;

    void p(int i10) throws RemoteException;

    void t(boolean z10) throws RemoteException;

    /* JADX INFO: renamed from: androidx.media3.session.legacy.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class AbstractBinderC0120a extends Binder implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f15897b = "android.support.v4.media.session.IMediaControllerCallback";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f15898c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f15899d = 9;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f15900e = 11;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f15901f = 12;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f15902g = 13;

        /* JADX INFO: renamed from: androidx.media3.session.legacy.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class C0121a implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public static a f15903c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f15904b;

            public C0121a(IBinder iBinder) {
                this.f15904b = iBinder;
            }

            @Override // androidx.media3.session.legacy.a
            public void B1(@Nullable PlaybackStateCompat playbackStateCompat) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        parcelObtain.writeInt(1);
                        playbackStateCompat.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.f15904b.transact(3, parcelObtain, null, 1) || AbstractBinderC0120a.O2() == null) {
                        return;
                    }
                    ((a) l0.E(AbstractBinderC0120a.O2())).B1(playbackStateCompat);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String N2() {
                return "android.support.v4.media.session.IMediaControllerCallback";
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f15904b;
            }

            @Override // androidx.media3.session.legacy.a
            public void c() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (this.f15904b.transact(13, parcelObtain, null, 1) || AbstractBinderC0120a.O2() == null) {
                        return;
                    }
                    ((a) l0.E(AbstractBinderC0120a.O2())).c();
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.a
            public void onRepeatModeChanged(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeInt(i10);
                    if (this.f15904b.transact(9, parcelObtain, null, 1) || AbstractBinderC0120a.O2() == null) {
                        return;
                    }
                    ((a) l0.E(AbstractBinderC0120a.O2())).onRepeatModeChanged(i10);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.a
            public void p(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeInt(i10);
                    if (this.f15904b.transact(12, parcelObtain, null, 1) || AbstractBinderC0120a.O2() == null) {
                        return;
                    }
                    ((a) l0.E(AbstractBinderC0120a.O2())).p(i10);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // androidx.media3.session.legacy.a
            public void t(boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    if (this.f15904b.transact(11, parcelObtain, null, 1) || AbstractBinderC0120a.O2() == null) {
                        return;
                    }
                    ((a) l0.E(AbstractBinderC0120a.O2())).t(z10);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0120a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        @Nullable
        public static a N2(@Nullable IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0121a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Nullable
        public static a O2() {
            return C0121a.f15903c;
        }

        public static boolean P2(a aVar) {
            if (C0121a.f15903c != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (aVar == null) {
                return false;
            }
            C0121a.f15903c = aVar;
            return true;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, @Nullable Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 3) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                B1(parcel.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (i10 == 9) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                onRepeatModeChanged(parcel.readInt());
                return true;
            }
            if (i10 == 1598968902) {
                ((Parcel) l0.E(parcel2)).writeString("android.support.v4.media.session.IMediaControllerCallback");
                return true;
            }
            switch (i10) {
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    t(parcel.readInt() != 0);
                    return true;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    p(parcel.readInt());
                    return true;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    c();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
