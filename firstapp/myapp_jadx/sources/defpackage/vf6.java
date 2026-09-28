package defpackage;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public interface vf6 {

    public static final class a implements vf6 {
        public final ue6 a;

        public a() {
            HashSet hashSet = new HashSet();
            ftw ftwVarV = ftw.V();
            ArrayList arrayList = new ArrayList();
            buw buwVarA = buw.a();
            ArrayList arrayList2 = new ArrayList(hashSet);
            w2z w2zVarU = w2z.U(ftwVarV);
            ArrayList arrayList3 = new ArrayList(arrayList);
            c4f0 c4f0Var = c4f0.b;
            ArrayMap arrayMap = new ArrayMap();
            ArrayMap arrayMap2 = buwVarA.a;
            for (String str : arrayMap2.keySet()) {
                arrayMap.put(str, arrayMap2.get(str));
            }
            this.a = new ue6(arrayList2, w2zVarU, -1, false, arrayList3, false, new c4f0(arrayMap), null);
        }

        @Override // defpackage.vf6
        public final ue6 a() {
            return this.a;
        }
    }

    ue6 a();
}
