package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f6002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public android.support.v4.os.a f6003d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResultReceiver[] newArray(int i10) {
            return new ResultReceiver[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends android.support.v4.os.a.b {
        public b() {
        }

        @Override // android.support.v4.os.a
        public void a(int i10, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f6002c;
            if (handler != null) {
                handler.post(resultReceiver.new c(i10, bundle));
            } else {
                resultReceiver.a(i10, bundle);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Bundle f6006c;

        public c(int i10, Bundle bundle) {
            this.f6005b = i10;
            this.f6006c = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.a(this.f6005b, this.f6006c);
        }
    }

    public ResultReceiver(Handler handler) {
        this.f6001b = true;
        this.f6002c = handler;
    }

    public void b(int i10, Bundle bundle) {
        if (this.f6001b) {
            Handler handler = this.f6002c;
            if (handler != null) {
                handler.post(new c(i10, bundle));
                return;
            } else {
                a(i10, bundle);
                return;
            }
        }
        android.support.v4.os.a aVar = this.f6003d;
        if (aVar != null) {
            try {
                aVar.a(i10, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f6003d == null) {
                    this.f6003d = new b();
                }
                parcel.writeStrongBinder(this.f6003d.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.f6001b = false;
        this.f6002c = null;
        this.f6003d = android.support.v4.os.a.b.N2(parcel.readStrongBinder());
    }

    public void a(int i10, Bundle bundle) {
    }
}
