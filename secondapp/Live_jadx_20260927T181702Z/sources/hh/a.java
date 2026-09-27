package hh;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import yd.b;
import yd.c;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: hh.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class AbstractBinderC0883a extends b implements a {

        /* JADX INFO: renamed from: hh.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static class C0884a extends yd.a implements a {
            public C0884a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // hh.a
            public final Bundle M(Bundle bundle) throws RemoteException {
                Parcel parcelN2 = N2();
                c.b(parcelN2, bundle);
                Parcel parcelO2 = O2(parcelN2);
                Bundle bundle2 = (Bundle) c.a(parcelO2, Bundle.CREATOR);
                parcelO2.recycle();
                return bundle2;
            }
        }

        public static a O2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C0884a(iBinder);
        }

        @Override // yd.b
        public final boolean N2(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i10 != 1) {
                return false;
            }
            Bundle bundleM = M((Bundle) c.a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            c.c(parcel2, bundleM);
            return true;
        }
    }

    Bundle M(Bundle bundle) throws RemoteException;
}
