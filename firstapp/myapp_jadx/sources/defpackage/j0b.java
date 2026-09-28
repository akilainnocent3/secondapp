package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j0b implements uih {
    public final kmh0 a;
    public final u2z b;

    public static final class a implements uih.a<kmh0> {
        @Override // uih.a
        public final uih a(Object obj, u2z u2zVar, a840 a840Var) {
            kmh0 kmh0Var = (kmh0) obj;
            if (Intrinsics.g(kmh0Var.c, "content")) {
                return new j0b(kmh0Var, u2zVar);
            }
            return null;
        }
    }

    public j0b(kmh0 kmh0Var, u2z u2zVar) {
        this.a = kmh0Var;
        this.b = u2zVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    @Override // defpackage.uih
    public final Object a(v1b<? super sih> v1bVar) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        List listD;
        int size;
        Bundle bundle;
        kmh0 kmh0Var = this.a;
        Uri uri = Uri.parse(kmh0Var.a);
        u2z u2zVar = this.b;
        ContentResolver contentResolver = u2zVar.a.getContentResolver();
        String str = kmh0Var.d;
        if (Intrinsics.g(str, "com.android.contacts") && Intrinsics.g(CollectionsKt.d0(tl9.d(kmh0Var)), "display_photo")) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                i0b.b(uri, "Unable to find a contact photo associated with '", "'.");
                return null;
            }
        } else if (Build.VERSION.SDK_INT >= 29 && Intrinsics.g(str, AnalyticsParam.SOCIAL_ACTION_TYPE_MEDIA) && (size = (listD = tl9.d(kmh0Var)).size()) >= 3 && Intrinsics.g(listD.get(size - 3), "audio") && Intrinsics.g(listD.get(size - 2), "albums")) {
            ww90 ww90Var = u2zVar.b;
            dqe dqeVar = ww90Var.a;
            dqe.a aVar = dqeVar instanceof dqe.a ? (dqe.a) dqeVar : null;
            if (aVar != null) {
                int i = aVar.a;
                dqe dqeVar2 = ww90Var.b;
                dqe.a aVar2 = dqeVar2 instanceof dqe.a ? (dqe.a) dqeVar2 : null;
                if (aVar2 != null) {
                    int i2 = aVar2.a;
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
                } else {
                    bundle = null;
                }
            } else {
                bundle = null;
            }
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                i0b.b(uri, "Unable to find a music thumbnail associated with '", "'.");
                return null;
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                i0b.b(uri, "Unable to open '", "'.");
                return null;
            }
        }
        return new aqa0(new dqa0(new y740(tmy.c(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), u2zVar.f, new wza(assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), bqc.c);
    }
}
