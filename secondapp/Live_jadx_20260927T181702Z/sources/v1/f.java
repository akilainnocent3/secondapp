package v1;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import k.h1;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator<byte[]> f139852a = new Comparator() { // from class: v1.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return f.a((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f139853a;

        public b(Context context, Uri uri) {
            this.f139853a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // v1.f.a
        public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f139853a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e10) {
                Log.w("FontsProvider", "Unable to query the content provider", e10);
                return null;
            }
        }

        @Override // v1.f.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f139853a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(24)
    public static class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f139854a;

        public c(Context context, Uri uri) {
            this.f139854a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // v1.f.a
        public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f139854a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e10) {
                Log.w("FontsProvider", "Unable to query the content provider", e10);
                return null;
            }
        }

        @Override // v1.f.a
        public void close() throws Exception {
            ContentProviderClient contentProviderClient = this.f139854a;
            if (contentProviderClient != null) {
                g.a(contentProviderClient);
            }
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    public static List<byte[]> b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static List<List<byte[]>> d(j jVar, Resources resources) {
        return jVar.b() != null ? jVar.b() : h1.f.c(resources, jVar.c());
    }

    @NonNull
    public static l.b e(@NonNull Context context, @NonNull j jVar, @Nullable CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoF = f(context.getPackageManager(), jVar, context.getResources());
        return providerInfoF == null ? l.b.a(1, null) : l.b.a(0, g(context, jVar, providerInfoF.authority, cancellationSignal));
    }

    @Nullable
    @h1
    public static ProviderInfo f(@NonNull PackageManager packageManager, @NonNull j jVar, @Nullable Resources resources) throws PackageManager.NameNotFoundException {
        String strF = jVar.f();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strF, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strF);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(jVar.g())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strF + ", but package was not " + jVar.g());
        }
        List<byte[]> listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listB, f139852a);
        List<List<byte[]>> listD = d(jVar, resources);
        for (int i10 = 0; i10 < listD.size(); i10++) {
            ArrayList arrayList = new ArrayList(listD.get(i10));
            Collections.sort(arrayList, f139852a);
            if (c(listB, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d3  */
    @NonNull
    @h1
    public static l.c[] g(Context context, j jVar, String str, CancellationSignal cancellationSignal) throws Throwable {
        a aVar;
        a aVar2;
        Uri uriWithAppendedId;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath(C4235d4.i.f61404b).build();
        a aVarA = e.a(context, uriBuild);
        Cursor cursorA = null;
        try {
            cursorA = aVarA.a(uriBuild, new String[]{eq.c.f81516f, l.a.f139880a, l.a.f139881b, l.a.f139882c, l.a.f139883d, l.a.f139884e, l.a.f139885f}, "query = ?", new String[]{jVar.h()}, null, cancellationSignal);
            if (cursorA == null || cursorA.getCount() <= 0) {
                aVar2 = aVarA;
            } else {
                int columnIndex = cursorA.getColumnIndex(l.a.f139885f);
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursorA.getColumnIndex(eq.c.f81516f);
                int columnIndex3 = cursorA.getColumnIndex(l.a.f139880a);
                int columnIndex4 = cursorA.getColumnIndex(l.a.f139881b);
                int columnIndex5 = cursorA.getColumnIndex(l.a.f139883d);
                int columnIndex6 = cursorA.getColumnIndex(l.a.f139884e);
                while (cursorA.moveToNext()) {
                    int i10 = columnIndex != -1 ? cursorA.getInt(columnIndex) : 0;
                    int i11 = columnIndex4 != -1 ? cursorA.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        aVar = aVarA;
                        try {
                            uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorA.getLong(columnIndex2));
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursorA != null) {
                                cursorA.close();
                            }
                            aVar.close();
                            throw th;
                        }
                    } else {
                        aVar = aVarA;
                        uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorA.getLong(columnIndex3));
                    }
                    int i12 = columnIndex5 != -1 ? cursorA.getInt(columnIndex5) : 400;
                    if (columnIndex6 != -1) {
                        z10 = true;
                        if (cursorA.getInt(columnIndex6) != 1) {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    arrayList2.add(l.c.a(uriWithAppendedId, i11, i12, z10, i10));
                    aVarA = aVar;
                }
                aVar2 = aVarA;
                arrayList = arrayList2;
            }
            if (cursorA != null) {
                cursorA.close();
            }
            aVar2.close();
            return (l.c[]) arrayList.toArray(new l.c[0]);
        } catch (Throwable th3) {
            th = th3;
            aVar = aVarA;
        }
    }
}
