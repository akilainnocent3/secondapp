package androidx.core.widget;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.sportybet.android.gp.tz.R;
import defpackage.g750;
import defpackage.hmz;
import defpackage.ib5;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/core/widget/RemoteViewsCompatService;", "Landroid/widget/RemoteViewsService;", "<init>", "()V", "a", "b", "core-remoteviews_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RemoteViewsCompatService extends RemoteViewsService {

    public static final class a {
        public final byte[] a;
        public final String b;
        public final long c;

        /* JADX INFO: renamed from: androidx.core.widget.RemoteViewsCompatService$a$a, reason: collision with other inner class name */
        public static final class C0055a {
            public static Object a(byte[] bArr, Function1 function1) {
                bArr.getClass();
                function1.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.getClass();
                try {
                    parcelObtain.unmarshall(bArr, 0, bArr.length);
                    parcelObtain.setDataPosition(0);
                    return function1.invoke(parcelObtain);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a(Parcel parcel) {
            byte[] bArr = new byte[parcel.readInt()];
            this.a = bArr;
            parcel.readByteArray(bArr);
            String string = parcel.readString();
            string.getClass();
            this.b = string;
            this.c = parcel.readLong();
        }
    }

    public static final class b implements RemoteViewsService.RemoteViewsFactory {
        public static final g750 e = new g750(new long[0], new RemoteViews[0]);
        public final RemoteViewsCompatService a;
        public final int b;
        public final int c;
        public g750 d = e;

        public b(RemoteViewsCompatService remoteViewsCompatService, int i, int i2) {
            this.a = remoteViewsCompatService;
            this.b = i;
            this.c = i2;
        }

        public final void a() {
            Long lValueOf;
            RemoteViewsCompatService remoteViewsCompatService = this.a;
            SharedPreferences sharedPreferences = remoteViewsCompatService.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
            sharedPreferences.getClass();
            StringBuilder sb = new StringBuilder();
            int i = this.b;
            sb.append(i);
            sb.append(':');
            sb.append(this.c);
            g750 g750Var = null;
            String string = sharedPreferences.getString(sb.toString(), null);
            if (string == null) {
                Log.w("RemoteViewsCompatServic", "No collection items were stored for widget " + i);
            } else {
                androidx.core.widget.b bVar = androidx.core.widget.b.a;
                bVar.getClass();
                byte[] bArrDecode = Base64.decode(string, 0);
                bArrDecode.getClass();
                a aVar = (a) a.C0055a.a(bArrDecode, bVar);
                if (Intrinsics.g(Build.VERSION.INCREMENTAL, aVar.b)) {
                    try {
                        PackageInfo packageInfo = remoteViewsCompatService.getPackageManager().getPackageInfo(remoteViewsCompatService.getPackageName(), 0);
                        lValueOf = Long.valueOf(Build.VERSION.SDK_INT >= 28 ? hmz.a(packageInfo) : packageInfo.versionCode);
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.e("RemoteViewsCompatServic", "Couldn't retrieve version code for " + remoteViewsCompatService.getPackageManager(), e2);
                        lValueOf = null;
                    }
                    if (lValueOf == null) {
                        Log.w("RemoteViewsCompatServic", "Couldn't get version code, not using stored collection items for widget " + i);
                    } else {
                        if (lValueOf.longValue() != aVar.c) {
                            Log.w("RemoteViewsCompatServic", "App version code has changed, not using stored collection items for widget " + i);
                        } else {
                            try {
                                g750Var = (g750) a.C0055a.a(aVar.a, androidx.core.widget.a.a);
                            } catch (Throwable th) {
                                Log.e("RemoteViewsCompatServic", "Unable to deserialize stored collection items for widget " + i, th);
                            }
                        }
                    }
                } else {
                    Log.w("RemoteViewsCompatServic", "Android version code has changed, not using stored collection items for widget " + i);
                }
            }
            if (g750Var == null) {
                g750Var = e;
            }
            this.d = g750Var;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final int getCount() {
            return this.d.a.length;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final long getItemId(int i) {
            try {
                return this.d.a[i];
            } catch (ArrayIndexOutOfBoundsException unused) {
                return -1L;
            }
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final RemoteViews getLoadingView() {
            return null;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final RemoteViews getViewAt(int i) {
            try {
                return this.d.b[i];
            } catch (ArrayIndexOutOfBoundsException unused) {
                return new RemoteViews(this.a.getPackageName(), R.layout.invalid_list_item);
            }
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final int getViewTypeCount() {
            return this.d.d;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final boolean hasStableIds() {
            return this.d.c;
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final void onCreate() {
            a();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final void onDataSetChanged() {
            a();
        }

        @Override // android.widget.RemoteViewsService.RemoteViewsFactory
        public final void onDestroy() {
        }
    }

    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        intent.getClass();
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            ib5.a("No app widget id was present in the intent");
            return null;
        }
        int intExtra2 = intent.getIntExtra("androidx.core.widget.extra.view_id", -1);
        if (intExtra2 != -1) {
            return new b(this, intExtra, intExtra2);
        }
        ib5.a("No view id was present in the intent");
        return null;
    }
}
