package yads;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class z52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mj0 f158626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f158627b = new ConcurrentHashMap();

    public z52(Context context) {
        this.f158626a = ih3.b(context.getApplicationContext());
    }

    public final void a(String str, zg3 zg3Var, String str2) {
        if (this.f158626a == null) {
            zg3Var.b();
            a();
            return;
        }
        Uri uri = Uri.parse(str);
        m51 m51Var = p51.f153747c;
        pj0 pj0Var = new pj0(str2, uri, null, sm2.f155489f, null, null, null);
        this.f158627b.put(str2, zg3Var);
        rn3 rn3Var = new rn3(str2, zg3Var);
        mj0 mj0Var = this.f158626a;
        mj0Var.getClass();
        mj0Var.f152466b.add(rn3Var);
        mj0 mj0Var2 = this.f158626a;
        mj0Var2.f152467c++;
        mj0Var2.f152465a.obtainMessage(6, 0, 0, pj0Var).sendToTarget();
        mj0 mj0Var3 = this.f158626a;
        if (mj0Var3.f152468d) {
            mj0Var3.f152468d = false;
            mj0Var3.f152467c++;
            mj0Var3.f152465a.obtainMessage(1, 0, 0).sendToTarget();
            boolean zA = mj0Var3.a();
            Iterator it = mj0Var3.f152466b.iterator();
            while (it.hasNext()) {
                ((kj0) it.next()).getClass();
            }
            if (zA) {
                Iterator it2 = mj0Var3.f152466b.iterator();
                while (it2.hasNext()) {
                    ((kj0) it2.next()).getClass();
                }
            }
        }
    }

    public final void a() {
        Iterator it = this.f158627b.entrySet().iterator();
        while (it.hasNext()) {
            String str = (String) ((Map.Entry) it.next()).getKey();
            mj0 mj0Var = this.f158626a;
            if (mj0Var != null) {
                mj0Var.f152467c++;
                mj0Var.f152465a.obtainMessage(7, str).sendToTarget();
            }
        }
        this.f158627b.clear();
    }
}
