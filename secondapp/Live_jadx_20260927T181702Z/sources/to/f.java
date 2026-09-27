package to;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public so.c f137114a;

    public f(@oy.l so.c dialogListener) {
        m0.p(dialogListener, "dialogListener");
        this.f137114a = dialogListener;
    }

    public static final void f(f fVar, String str, DialogInterface dialogInterface, int i10) {
        fVar.f137114a.u(str);
    }

    public static final void g(f fVar, String str, DialogInterface dialogInterface, int i10) {
        fVar.f137114a.n0(str);
    }

    @oy.l
    public final so.c c() {
        return this.f137114a;
    }

    public final void d(@oy.l so.c cVar) {
        m0.p(cVar, "<set-?>");
        this.f137114a = cVar;
    }

    public final void e(@oy.m Context context, @oy.m String str, @oy.m String str2, @oy.m String str3, @oy.m String str4, @oy.l final String key) {
        m0.p(key, "key");
        if (context != null) {
            try {
                new androidx.appcompat.app.c.a(context).e(R.drawable.ic_dialog_alert).setTitle(str).l(str2).y(str3, new DialogInterface.OnClickListener() { // from class: to.d
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        f.f(this.f137110b, key, dialogInterface, i10);
                    }
                }).p(str4, new DialogInterface.OnClickListener() { // from class: to.e
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        f.g(this.f137112b, key, dialogInterface, i10);
                    }
                }).I();
            } catch (Exception e10) {
                Log.d("Exception", NotificationCompat.CATEGORY_MESSAGE + e10.getMessage());
            }
        }
    }
}
