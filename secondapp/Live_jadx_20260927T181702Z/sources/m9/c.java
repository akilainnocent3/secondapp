package m9;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import dr.o;
import java.io.File;
import java.util.List;
import k.t0;
import k.y0;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public final class c {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @o(message = "Kept for ABI compatibility reasons due to b/402796648 even though minSdk is greater than 16.")
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public static final a f107121a = new a();

        @cs.o
        @y0({y0.a.LIBRARY_GROUP_PREFIX})
        public static final void a(@l CancellationSignal cancellationSignal) {
            m0.p(cancellationSignal, "cancellationSignal");
            cancellationSignal.cancel();
        }

        @l
        @cs.o
        @y0({y0.a.LIBRARY_GROUP_PREFIX})
        public static final CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @o(message = "Kept for ABI compatibility reasons due to b/402796648 even though minSdk is greater than 19.")
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public static final b f107122a = new b();

        @l
        @cs.o
        @y0({y0.a.LIBRARY_GROUP_PREFIX})
        public static final Uri a(@l Cursor cursor) {
            m0.p(cursor, "cursor");
            Uri notificationUri = cursor.getNotificationUri();
            m0.o(notificationUri, "getNotificationUri(...)");
            return notificationUri;
        }

        @cs.o
        @y0({y0.a.LIBRARY_GROUP_PREFIX})
        public static final boolean b(@l ActivityManager activityManager) {
            m0.p(activityManager, "activityManager");
            return activityManager.isLowRamDevice();
        }
    }

    /* JADX INFO: renamed from: m9.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @y0({y0.a.LIBRARY_GROUP})
    public static final class C1003c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public static final C1003c f107123a = new C1003c();

        @l
        @cs.o
        @y0({y0.a.LIBRARY_GROUP})
        public static final File a(@l Context context) {
            m0.p(context, "context");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            m0.o(noBackupFilesDir, "getNoBackupFilesDir(...)");
            return noBackupFilesDir;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(23)
    @y0({y0.a.LIBRARY_GROUP})
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public static final d f107124a = new d();

        @cs.o
        @y0({y0.a.LIBRARY_GROUP})
        public static final void a(@l Cursor cursor, @l Bundle extras) {
            m0.p(cursor, "cursor");
            m0.p(extras, "extras");
            cursor.setExtras(extras);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(29)
    @y0({y0.a.LIBRARY_GROUP})
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @l
        public static final e f107125a = new e();

        @l
        @cs.o
        @y0({y0.a.LIBRARY_GROUP})
        public static final List<Uri> a(@l Cursor cursor) {
            m0.p(cursor, "cursor");
            List<Uri> notificationUris = cursor.getNotificationUris();
            m0.m(notificationUris);
            return notificationUris;
        }

        @cs.o
        @y0({y0.a.LIBRARY_GROUP})
        public static final void b(@l Cursor cursor, @l ContentResolver cr2, @l List<? extends Uri> uris) {
            m0.p(cursor, "cursor");
            m0.p(cr2, "cr");
            m0.p(uris, "uris");
            cursor.setNotificationUris(cr2, uris);
        }
    }
}
