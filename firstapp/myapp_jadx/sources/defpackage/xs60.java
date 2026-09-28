package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.sporty.android.core.model.MyLog;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xs60 {
    public static Uri a(Context context, String str, String str2) {
        Uri contentUri;
        Object next;
        if (Build.VERSION.SDK_INT > 28) {
            Set<String> externalVolumeNames = MediaStore.getExternalVolumeNames(context);
            externalVolumeNames.getClass();
            Iterator<T> it = externalVolumeNames.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g((String) next, "external_primary"));
            String str3 = (String) next;
            contentUri = str3 != null ? MediaStore.Images.Media.getContentUri(str3) : null;
        } else {
            contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        }
        if (contentUri != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put("mime_type", str2);
            contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
            if (Build.VERSION.SDK_INT >= 29) {
                contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            }
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver != null) {
                return contentResolver.insert(contentUri, contentValues);
            }
        }
        return null;
    }

    public static final boolean b(Context context, Uri uri, String str, String str2) throws IOException {
        Object bVar;
        Object bVar2;
        Object bVar3;
        context.getClass();
        str.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver != null) {
            try {
                zi50.a aVar = zi50.b;
                bVar = contentResolver.openInputStream(uri);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            InputStream inputStream = (InputStream) bVar;
            if (inputStream != null) {
                try {
                    bVar2 = a(context, str, str2);
                } catch (Throwable th2) {
                    zi50.a aVar3 = zi50.b;
                    bVar2 = new zi50.b(th2);
                }
                if (bVar2 instanceof zi50.b) {
                    bVar2 = null;
                }
                Uri uri2 = (Uri) bVar2;
                if (uri2 != null) {
                    try {
                        bVar3 = contentResolver.openOutputStream(uri2);
                    } catch (Throwable th3) {
                        zi50.a aVar4 = zi50.b;
                        bVar3 = new zi50.b(th3);
                    }
                    OutputStream outputStream = (OutputStream) (bVar3 instanceof zi50.b ? null : bVar3);
                    if (outputStream != null) {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            try {
                                try {
                                    int i = inputStream.read(bArr);
                                    if (i <= 0) {
                                        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                                        intent.setData(uri2);
                                        context.sendBroadcast(intent);
                                        inputStream.close();
                                        outputStream.close();
                                        return true;
                                    }
                                    outputStream.write(bArr, 0, i);
                                } catch (Exception e) {
                                    itf0.a aVar5 = itf0.a;
                                    aVar5.q(MyLog.TAG_COMMON);
                                    aVar5.p(e, "unable to save the file to Picture folder", new Object[0]);
                                    inputStream.close();
                                    outputStream.close();
                                    return false;
                                }
                            } catch (Throwable th4) {
                                inputStream.close();
                                outputStream.close();
                                throw th4;
                            }
                            inputStream.close();
                            outputStream.close();
                            throw th4;
                        }
                    }
                }
            }
        }
        return false;
    }
}
