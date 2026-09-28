package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.sporty.android.core.model.MyLog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qoi {
    public final Context a;
    public final j800 b;
    public final bnh0 c;
    public final azm d;
    public final psm e;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[poi.values().length];
            try {
                poi poiVar = poi.TERMS;
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                poi poiVar2 = poi.TERMS;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                poi poiVar3 = poi.TERMS;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                poi poiVar4 = poi.TERMS;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                poi poiVar5 = poi.TERMS;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                poi poiVar6 = poi.TERMS;
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                poi poiVar7 = poi.TERMS;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            a = iArr;
        }
    }

    public qoi(Context context, j800 j800Var, bnh0 bnh0Var, azm azmVar, psm psmVar) {
        bnh0Var.getClass();
        azmVar.getClass();
        psmVar.getClass();
        this.a = context;
        this.b = j800Var;
        this.c = bnh0Var;
        this.d = azmVar;
        this.e = psmVar;
    }

    public final void a(String str) {
        ActivityInfo activityInfo;
        str.getClass();
        Uri uri = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addFlags(268435456);
        intent.addCategory("android.intent.category.BROWSABLE");
        boolean zG = Intrinsics.g(uri.getScheme(), "http");
        Context context = this.a;
        if (zG || Intrinsics.g(uri.getScheme(), "https")) {
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://")), 65536);
            if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null) {
                intent.setPackage(activityInfo.packageName);
            }
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            intent.setPackage(null);
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_COMMON);
                aVar.p(e, "No application can handle external URL", new Object[0]);
            }
        }
    }
}
