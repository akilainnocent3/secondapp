package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import com.google.protobuf.Reader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yd extends vd<qt00, List<Uri>> {
    public final int a = 10;

    public static final class a {
        public static int a() {
            int i = Build.VERSION.SDK_INT;
            return (i < 33 && (i < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Reader.READ_DONE : MediaStore.getPickImagesMaxLimit();
        }
    }

    @Override // defpackage.vd
    public final Intent a(Object obj, Context context) {
        qt00 qt00Var = (qt00) obj;
        qt00Var.getClass();
        boolean zC = zd.a.c();
        int i = this.a;
        if (zC) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(zd.a.b(qt00Var.a));
            int iMin = Math.min(i, qt00Var.b);
            if (iMin <= 1 || iMin > MediaStore.getPickImagesMaxLimit()) {
                hb5.a("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
                return null;
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", iMin);
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", qt00Var.c.a());
            intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", false);
            return intent;
        }
        if (zd.a.a(context) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(zd.a.b(qt00Var.a));
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoA = zd.a.a(context);
        if (resolveInfoA == null) {
            ib5.a("Required value was null.");
            return null;
        }
        ActivityInfo activityInfo = resolveInfoA.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(zd.a.b(qt00Var.a));
        int iMin2 = Math.min(i, qt00Var.b);
        if (iMin2 <= 1) {
            hb5.a("Max items must be greater than 1");
            return null;
        }
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", iMin2);
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", qt00Var.c.a());
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", false);
        return intent3;
    }

    @Override // defpackage.vd
    public final vd.a b(Object obj, Context context) {
        ((qt00) obj).getClass();
        return null;
    }

    @Override // defpackage.vd
    public final Object c(Intent intent, int i) {
        Object arrayList;
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                arrayList = m2g.a;
            } else {
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        Uri uri = clipData.getItemAt(i2).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                arrayList = new ArrayList(linkedHashSet);
            }
            if (arrayList != null) {
                return arrayList;
            }
        }
        return m2g.a;
    }
}
