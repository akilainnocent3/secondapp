package defpackage;

import android.content.Context;
import android.net.Uri;
import com.appsflyer.internal.a0;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
public final class ebn implements ee00 {
    public final /* synthetic */ List<Uri> a;
    public final /* synthetic */ Context b;

    public ebn(Context context, List list) {
        this.a = list;
        this.b = context;
    }

    @Override // defpackage.ee00
    public final void onDenied() {
        zyf0.a(R.string.common_functions__permission_denied);
    }

    @Override // defpackage.ee00
    public final void onGranted() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (Object obj : this.a) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            Uri uri = (Uri) obj;
            if (uri != null) {
                String string = uri.toString();
                string.getClass();
                Uri uri2 = string.length() > 0 ? uri : null;
                if (uri2 != null) {
                    StringBuilder sbA = a0.a("share_image_", "_", i2, jCurrentTimeMillis);
                    sbA.append(".jpeg");
                    if (xs60.b(this.b, uri2, sbA.toString(), "image/jpeg")) {
                        i++;
                    } else {
                        i3++;
                    }
                }
            }
            i2 = i4;
        }
        zyf0.b((i <= 0 || i3 != 0) ? R.string.common_feedback__save_failed : R.string.common_feedback__successfully_saved, 1);
    }
}
