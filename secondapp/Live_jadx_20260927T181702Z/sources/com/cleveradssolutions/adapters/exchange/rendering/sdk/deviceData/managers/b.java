package com.cleveradssolutions.adapters.exchange.rendering.sdk.deviceData.managers;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.WindowManager;
import com.cleveradssolutions.adapters.exchange.rendering.sdk.calendar.g;
import com.cleveradssolutions.adapters.exchange.rendering.sdk.e;
import com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.c;
import com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.j;
import com.cleveradssolutions.adapters.exchange.rendering.views.browser.AdBrowserActivity;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f42484a = b.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TelephonyManager f42485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WindowManager f42486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PackageManager f42487d;

    public b(Context context) {
        if (context != null) {
            this.f42485b = (TelephonyManager) context.getSystemService("phone");
            this.f42486c = (WindowManager) context.getSystemService("window");
            this.f42487d = context.getPackageManager();
        }
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.sdk.deviceData.managers.a
    public int a() {
        return j.c(this.f42486c);
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.sdk.deviceData.managers.a
    public boolean b(String str) {
        Context contextA = e.a();
        return contextA != null && contextA.checkCallingOrSelfPermission(str) == 0;
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.sdk.deviceData.managers.a
    public int c() {
        return j.u(this.f42486c);
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.sdk.deviceData.managers.a
    public int d() {
        Configuration configuration;
        Context contextA = e.a();
        if (contextA == null || (configuration = contextA.getResources().getConfiguration()) == null) {
            return 0;
        }
        return configuration.orientation;
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.sdk.deviceData.managers.a
    public boolean e() {
        PackageManager packageManager;
        if (this.f42485b == null || (packageManager = this.f42487d) == null) {
            return false;
        }
        return packageManager.hasSystemFeature("android.hardware.telephony");
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.sdk.deviceData.managers.a
    public boolean f() {
        return this.f42487d.hasSystemFeature("android.hardware.location.gps");
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.sdk.deviceData.managers.a
    public void g(g gVar) {
        Context contextA = e.a();
        if (gVar == null || contextA == null) {
            return;
        }
        com.cleveradssolutions.adapters.exchange.rendering.sdk.calendar.a.a().a(contextA, gVar);
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.sdk.deviceData.managers.a
    public void h(String str, Context context) {
        if (context == null) {
            Log.e(this.f42484a, "Can't play video as context is null");
            return;
        }
        try {
            Intent intent = new Intent(context, (Class<?>) AdBrowserActivity.class);
            intent.putExtra("EXTRA_IS_VIDEO", true);
            intent.putExtra("EXTRA_URL", str);
            c.a(context, intent);
        } catch (Exception e10) {
            Log.e(this.f42484a, "AdBrowserActivity failed", e10);
            try {
                c.d(context, str);
            } catch (Exception e11) {
                Log.e(this.f42484a, "startExternalVideoPlayer failed", e11);
            }
        }
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.sdk.deviceData.managers.a
    public boolean i(Context context) {
        if (context instanceof Activity) {
            int requestedOrientation = ((Activity) context).getRequestedOrientation();
            return requestedOrientation == 1 || requestedOrientation == 9 || requestedOrientation == 0 || requestedOrientation == 8;
        }
        com.cleveradssolutions.adapters.exchange.b.h(this.f42484a, "isScreenOrientationLocked() executed with non-activity context. Returning false.");
        return false;
    }

    public OutputStream j(String str) {
        return j.j() ? k(str, e.a()) : l(str);
    }

    public OutputStream k(String str, Context context) {
        String str2;
        String str3;
        if (context == null) {
            str2 = this.f42484a;
            str3 = "getOutPutStreamForQ: Failed. Context is null";
        } else {
            ContentResolver contentResolver = context.getContentResolver();
            ContentValues contentValues = new ContentValues();
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            contentValues.put("_display_name", str);
            Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.getContentUri("external"), contentValues);
            if (uriInsert != null) {
                return contentResolver.openOutputStream(uriInsert);
            }
            str2 = this.f42484a;
            str3 = "Could not save content uri";
        }
        com.cleveradssolutions.adapters.exchange.b.h(str2, str3);
        return null;
    }

    public OutputStream l(String str) {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        externalStoragePublicDirectory.mkdirs();
        return new FileOutputStream(new File(externalStoragePublicDirectory, str));
    }

    public final void m(OutputStream outputStream, InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        while (true) {
            try {
                int i10 = bufferedInputStream.read(bArr, 0, 1024);
                if (i10 == -1) {
                    bufferedOutputStream.write(byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.close();
                    bufferedInputStream.close();
                    bufferedOutputStream.close();
                    return;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th2) {
                byteArrayOutputStream.close();
                bufferedInputStream.close();
                bufferedOutputStream.close();
                throw th2;
            }
        }
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.sdk.deviceData.managers.a
    public void storePicture(String str) throws IOException {
        if (!j.o()) {
            com.cleveradssolutions.adapters.exchange.b.a(this.f42484a, "storePicture: Failed. External storage is not available");
            return;
        }
        String strQ = j.q(str);
        String strY = j.y(str);
        if (!TextUtils.isEmpty(strY)) {
            strQ = strQ + strY;
        }
        OutputStream outputStreamJ = j(strQ);
        if (outputStreamJ == null) {
            com.cleveradssolutions.adapters.exchange.b.a(this.f42484a, "Could not get Outputstream to write file to");
        } else {
            m(outputStreamJ, new URL(str).openConnection().getInputStream());
        }
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.sdk.deviceData.managers.a
    public boolean zz() {
        return true;
    }
}
