package defpackage;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class nbs {
    public final HashMap a = new HashMap();

    public final class b implements za50 {
    }

    public nbs(ya50.b bVar) {
    }

    public final xa50 a(Context context, com.bumptech.glide.a aVar, s9s s9sVar, FragmentManager fragmentManager, boolean z) {
        erh0.a();
        erh0.a();
        HashMap map = this.a;
        xa50 xa50Var = (xa50) map.get(s9sVar);
        if (xa50Var != null) {
            return xa50Var;
        }
        fbs fbsVar = new fbs(s9sVar);
        xa50 xa50Var2 = new xa50(aVar, fbsVar, new b(), new kb50(), aVar.f, context);
        map.put(s9sVar, xa50Var2);
        fbsVar.a(new a(s9sVar));
        if (z) {
            xa50Var2.b();
        }
        return xa50Var2;
    }

    public class a implements gbs {
        public final /* synthetic */ s9s a;

        public a(s9s s9sVar) {
            this.a = s9sVar;
        }

        @Override // defpackage.gbs
        public final void onDestroy() {
            nbs.this.a.remove(this.a);
        }

        @Override // defpackage.gbs
        public final void b() {
        }

        @Override // defpackage.gbs
        public final void c() {
        }
    }
}
