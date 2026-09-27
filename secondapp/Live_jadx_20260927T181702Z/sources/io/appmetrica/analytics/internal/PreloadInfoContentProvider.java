package io.appmetrica.analytics.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.AbstractC5077gj;
import io.appmetrica.analytics.impl.B5;
import io.appmetrica.analytics.impl.C5;
import io.appmetrica.analytics.impl.C5042fa;
import io.appmetrica.analytics.impl.C5099hf;
import io.appmetrica.analytics.impl.C5315q3;
import io.appmetrica.analytics.impl.C5339r3;
import io.appmetrica.analytics.impl.Cif;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f98740a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UriMatcher f98741b = new UriMatcher(-1);

    private void a(C5 c10, ContentValues contentValues) {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            try {
                Object objInvoke = c10.f95668a.invoke(contentValues);
                if (objInvoke != null) {
                    c10.f95670c.b(applicationContext);
                    if (((Boolean) c10.f95669b.invoke(objInvoke)).booleanValue()) {
                        AbstractC5077gj.a("Successfully saved " + c10.f95671d, new Object[0]);
                    } else {
                        AbstractC5077gj.a("Did not save " + c10.f95671d + " because data is already present", new Object[0]);
                    }
                }
            } catch (Throwable th2) {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format("Unexpected error occurred", new Object[0]) + IOUtils.LINE_SEPARATOR_UNIX + StringUtils.throwableToString(th2), new Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        AbstractC5077gj.a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f98740a = true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.f98740a) {
                    return null;
                }
                if (contentValues != null) {
                    int iMatch = this.f98741b.match(uri);
                    if (iMatch == 1) {
                        a(new C5(new C5099hf(), new Cif(), C5042fa.f97361d, "preload info"), contentValues);
                    } else if (iMatch != 2) {
                        AbstractC5077gj.a("Bad content provider uri.", new Object[0]);
                    } else {
                        a(new C5(new C5315q3(), new C5339r3(), C5042fa.f97361d, "clids"), contentValues);
                    }
                }
                CountDownLatch countDownLatch = B5.f95593a;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        String str = (applicationContext != null ? applicationContext.getPackageName() : "") + ".appmetrica.preloadinfo.retail";
        this.f98741b.addURI(str, "preloadinfo", 1);
        this.f98741b.addURI(str, "clids", 2);
        B5.f95593a = new CountDownLatch(1);
        B5.f95594b = this;
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        AbstractC5077gj.a("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        AbstractC5077gj.a("Updating is not supported", new Object[0]);
        return -1;
    }
}
