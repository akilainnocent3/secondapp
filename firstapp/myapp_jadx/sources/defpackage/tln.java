package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.appcompat.widget.AppCompatEditText;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tln {
    public final /* synthetic */ AppCompatEditText a;

    public final boolean a(wln wlnVar, int i, Bundle bundle) {
        rza.b aVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                wlnVar.a.d();
                Parcelable parcelable = (Parcelable) wlnVar.a.b();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        wln.c cVar = wlnVar.a;
        ClipData clipData = new ClipData(cVar.a(), new ClipData.Item(cVar.c()));
        if (i2 >= 31) {
            aVar = new rza.a(clipData, 2);
        } else {
            rza.c cVar2 = new rza.c();
            cVar2.a = clipData;
            cVar2.b = 2;
            aVar = cVar2;
        }
        aVar.a(cVar.e());
        aVar.setExtras(bundle);
        return r6i0.l(this.a, aVar.build()) == null;
    }
}
