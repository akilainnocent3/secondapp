package defpackage;

import android.content.Context;
import android.os.Handler;
import android.widget.ImageView;
import androidx.media3.exoplayer.d;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xls {
    public final Context a;
    public final ems b;
    public final bms c;
    public final yls d;
    public final Handler e;
    public d f;
    public ImageView g;
    public float h;
    public yxi0 i;
    public String j;
    public boolean k;
    public int l;
    public final wls m;
    public final vls n;

    public xls(Context context, ems emsVar, bms bmsVar, yls ylsVar, Handler handler) {
        context.getClass();
        emsVar.getClass();
        handler.getClass();
        this.a = context;
        this.b = emsVar;
        this.c = bmsVar;
        this.d = ylsVar;
        this.e = handler;
        this.h = 1.0f;
        this.k = true;
        this.m = new wls(this);
        this.n = new vls();
    }

    public final void a() {
        d dVar = this.f;
        if (dVar != null) {
            dVar.S0();
            if (dVar.c0 <= 0.0f) {
                dVar.L(this.h);
                ImageView imageView = this.g;
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.spm_ic_volume_on);
                    return;
                } else {
                    Intrinsics.n("volumeIcon");
                    throw null;
                }
            }
            dVar.S0();
            this.h = dVar.c0;
            dVar.L(0.0f);
            ImageView imageView2 = this.g;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.spm_ic_volume_off);
            } else {
                Intrinsics.n("volumeIcon");
                throw null;
            }
        }
    }
}
