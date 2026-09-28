package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.pairip.VMRunner;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.appupdate.AppDownloadAction;
import com.sportybet.android.gp.tz.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import okhttp3.Call;

/* JADX INFO: loaded from: classes2.dex */
public final class fob0 extends BroadcastReceiver {
    public static final /* synthetic */ int j = 0;
    public final Context a;
    public final String b;
    public final String c;
    public Call d;
    public final mpe0 e;
    public final mpe0 f;
    public ygb0.a g;
    public int h;
    public boolean i;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        public static void a(File file) {
            if (file.exists()) {
                try {
                    boolean zDelete = file.delete();
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_DOWNLOAD);
                    aVar.l("remove " + file + ": " + zDelete, new Object[0]);
                } catch (Exception e) {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_DOWNLOAD);
                    aVar2.p(e, "Failed to remove downloaded file " + file, new Object[0]);
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final /* synthetic */ b[] e;

        static {
            b bVar = new b("SUCCESS", 0);
            a = bVar;
            b bVar2 = new b("FAILED_USER_CANCELLED", 1);
            b = bVar2;
            b bVar3 = new b("FAILED_NO_DISK_SPACE", 2);
            c = bVar3;
            b bVar4 = new b("FAILED", 3);
            d = bVar4;
            e = new b[]{bVar, bVar2, bVar3, bVar4};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class c {
        public static final c a;
        public static final /* synthetic */ c[] b;

        static {
            c cVar = new c("APK", 0);
            a = cVar;
            b = new c[]{cVar, new c("FILE", 1)};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) b.clone();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                c cVar = c.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.android.update.SportyDownloadManager$onDownloadResult$4$1", f = "SportyDownloadManager.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ hob0 a;
        public final /* synthetic */ b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(hob0 hob0Var, b bVar, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.a = hob0Var;
            this.b = bVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.a(this.b);
            return Unit.a;
        }
    }

    public fob0(Context context, String str, String str2) {
        c cVar = c.a;
        this.a = context;
        this.b = str;
        this.c = str2;
        this.e = hwr.b(new dob0());
        this.f = hwr.b(new eob0());
    }

    public final b a(File file, String str) {
        String strD;
        c cVar = c.a;
        if (d.a[0] != 1) {
            return (file.exists() && file.canRead() && file.length() > 0) ? b.a : b.d;
        }
        if (str != null && !StringsKt.U(str)) {
            if (file.exists() && file.canRead() && file.length() > 0) {
                String str2 = "";
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        MappedByteBuffer map = fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length());
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                            messageDigest.update(map);
                            strD = uel.d(messageDigest.digest());
                        } catch (Exception unused) {
                            strD = "";
                        }
                        fileInputStream.close();
                        str2 = strD;
                        if (str.equalsIgnoreCase(str2)) {
                            Context context = this.a;
                            PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 1);
                            if (packageArchiveInfo != null ? TextUtils.equals(context.getPackageName(), packageArchiveInfo.packageName) : false) {
                                if (file.exists()) {
                                    try {
                                        String strA = ms60.a(file);
                                        boolean z = (context.getApplicationInfo().flags & 2) != 0;
                                        if (strA == null) {
                                            file.delete();
                                        } else {
                                            if (z || "a82bacbceda4547975805facce1cebf5|".equals(strA) || "922d299ab019e5f6fcf2e1d3fd7ab177|".equals(strA)) {
                                                return b.a;
                                            }
                                            file.delete();
                                        }
                                    } catch (IOException unused2) {
                                    }
                                }
                                zyf0.a(R.string.app_common__toast_apk_verify_failed);
                            } else {
                                zyf0.a(R.string.app_common__toast_apk_modified_by_malicious);
                            }
                        } else {
                            zyf0.a(R.string.app_common__toast_apk_modified_by_malicious);
                        }
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (FileNotFoundException | IOException unused3) {
                }
            } else {
                zyf0.a(R.string.app_common__toast_apk_modified_by_malicious);
            }
        }
        return b.d;
    }

    public final synchronized void b(b bVar, File file) {
        ygb0.a aVar;
        ygb0.a aVar2;
        try {
            if (this.i) {
                return;
            }
            this.i = true;
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_DOWNLOAD);
            aVar3.a("download result: " + bVar, new Object[0]);
            try {
                this.a.unregisterReceiver(this);
            } catch (Exception unused) {
            }
            if (b.c == bVar) {
                zyf0.a(R.string.app_common__toast_disk_space_not_enough);
            } else if (b.b == bVar) {
                Call call = this.d;
                if (call != null) {
                    call.cancel();
                }
                this.d = null;
            }
            b bVar2 = b.a;
            Intent intentF = (bVar2 != bVar || file == null || (aVar2 = this.g) == null) ? null : yrh0.f(aVar2.a.a, file);
            if (intentF != null) {
                Context context = this.a;
                c cVar = c.a;
                ((q6f) this.e.getValue()).a.e(this.a, sn5.b(context, R.string.app_common__notification_tap_to_install, new Object[0]), intentF);
            } else {
                itf0.a aVar4 = itf0.a;
                aVar4.q(MyLog.TAG_DOWNLOAD);
                aVar4.a("no NotificationClickAction, hide download notification", new Object[0]);
                ((q6f) this.e.getValue()).a.f(this.a);
            }
            Intent intentF2 = (bVar2 != bVar || file == null || (aVar = this.g) == null) ? null : yrh0.f(aVar.a.a, file);
            if (intentF2 != null) {
                yrh0.s(this.a, intentF2, true);
            }
            ygb0.a aVar5 = this.g;
            if (aVar5 != null) {
                ej5.c((v5b) this.f.getValue(), null, null, new e(aVar5, bVar, null), 3);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void c(long j2, long j3) {
        if (j3 > 0) {
            int iMax = Math.max(Math.min(j2 == j3 ? 100 : (int) ((100 * j2) / j3), 100), 0);
            if (iMax - this.h >= 10 || iMax == 100) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_DOWNLOAD);
                aVar.l("onDownloading, %s/%s - %s", Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(iMax));
                this.h = iMax;
                ((q6f) this.e.getValue()).a.a(this.a, iMax, j2, j3);
                ygb0.a aVar2 = this.g;
                if (aVar2 != null) {
                    wwd0 wwd0Var = aVar2.a.n;
                    AppDownloadAction.ApkDownloading apkDownloading = new AppDownloadAction.ApkDownloading(iMax);
                    wwd0Var.getClass();
                    wwd0Var.k(null, apkDownloading);
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("kMODUU5ZmDfhT2fn", new Object[]{this, context, intent});
    }
}
