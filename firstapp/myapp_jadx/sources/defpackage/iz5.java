package defpackage;

import android.content.Context;
import android.media.CamcorderProfile;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class iz5 implements b26 {
    public final Object a;
    public final HashMap b;
    public final a c;
    public final q26 d;
    public final Context e;

    public class a implements uv5 {
        @Override // defpackage.uv5
        public final CamcorderProfile a(int i, int i2) {
            return CamcorderProfile.get(i, i2);
        }

        @Override // defpackage.uv5
        public final boolean b(int i, int i2) {
            return CamcorderProfile.hasProfile(i, i2);
        }
    }

    public iz5(Context context, Object obj, Set<String> set) throws r36 {
        a aVar = new a();
        this.a = new Object();
        this.b = new HashMap();
        this.c = aVar;
        this.e = context;
        if (obj instanceof q26) {
            this.d = (q26) obj;
        } else {
            this.d = q26.a(context, lku.a());
        }
        try {
            a(new ArrayList(set));
        } catch (s36 e) {
            if (!(e.getCause() instanceof r36)) {
                throw new r36(e);
            }
            throw ((r36) e.getCause());
        }
    }

    @Override // defpackage.pyo
    public final void a(List<String> list) throws s36 {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, b(str));
            }
            synchronized (this.a) {
                try {
                    HashMap map2 = new HashMap();
                    ArrayList arrayList = (ArrayList) list;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        String str2 = (String) obj;
                        if (this.b.containsKey(str2)) {
                            map2.put(str2, (tge0) this.b.get(str2));
                        } else {
                            map2.put(str2, (tge0) map.get(str2));
                        }
                    }
                    this.b.clear();
                    this.b.putAll(map2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (RuntimeException | r36 e) {
            throw new s36("Failed to create SupportedSurfaceCombination", e);
        }
    }

    public final tge0 b(String str) {
        return new tge0(this.e, str, this.d, this.c, Build.VERSION.SDK_INT >= 35 ? new gch(this.e, str, this.d) : vbh.a);
    }
}
