package q4;

import android.content.Context;
import androidx.annotation.NonNull;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(21)
public class k extends q {
    public k(Context context) {
        super(context);
        this.f121512a = context;
    }

    @Override // q4.q, q4.j.a
    public boolean a(@NonNull j.c cVar) {
        return d(cVar) || super.a(cVar);
    }

    public final boolean d(@NonNull j.c cVar) {
        return getContext().checkPermission("android.permission.MEDIA_CONTENT_CONTROL", cVar.a(), cVar.getUid()) == 0;
    }
}
