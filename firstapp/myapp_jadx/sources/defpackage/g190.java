package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sportybet.android.bookingcode.presentation.activity.PreviewCodeActivity;
import com.sportybet.plugin.realsports.activities.ZoomImageActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class g190 implements f190 {
    public final Context a;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[i190.values().length];
            try {
                i190 i190Var = i190.a;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public g190(Context context) {
        this.a = context;
    }

    @Override // defpackage.f190
    public final void a(String str, i190 i190Var) {
        boolean z = i190Var == i190.b;
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) ZoomImageActivity.class);
        intent.setFlags(268435456);
        if (a.a[i190Var.ordinal()] == 1) {
            intent.putExtra("param_fetch_uri", str);
            intent.putExtra("param_booking_code", "");
            intent.putExtra("param_country_code", "");
        } else {
            intent.putExtra("param_image_uri", str);
            intent.putExtra("param_show_close_bg", z);
        }
        yrh0.s(context, intent, true);
    }

    @Override // defpackage.f190
    public final void b(String str, String str2, boolean z) {
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) PreviewCodeActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("imageUri", str);
        intent.putExtra("shareCode", str2);
        intent.putExtra("openFromShare", true);
        intent.putExtra("openFromCustom", z);
        yrh0.s(context, intent, true);
    }
}
