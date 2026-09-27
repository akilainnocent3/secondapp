package pa;

import androidx.annotation.NonNull;
import androidx.work.e0;
import androidx.work.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class m {
    public static void a(@NonNull StringBuilder builder, int count) {
        if (count <= 0) {
            return;
        }
        builder.append("?");
        for (int i10 = 1; i10 < count; i10++) {
            builder.append(",");
            builder.append("?");
        }
    }

    @NonNull
    public static m9.h b(@NonNull g0 querySpec) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder("SELECT * FROM workspec");
        List<e0.a> listB = querySpec.b();
        String str = " AND";
        String str2 = " WHERE";
        if (!listB.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(listB.size());
            Iterator<e0.a> it = listB.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(oa.x.j(it.next())));
            }
            sb2.append(" WHERE");
            sb2.append(" state IN (");
            a(sb2, arrayList2.size());
            sb2.append(gi.j.f86771d);
            arrayList.addAll(arrayList2);
            str2 = " AND";
        }
        List<UUID> listA = querySpec.a();
        if (!listA.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(listA.size());
            Iterator<UUID> it2 = listA.iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().toString());
            }
            sb2.append(str2);
            sb2.append(" id IN (");
            a(sb2, listA.size());
            sb2.append(gi.j.f86771d);
            arrayList.addAll(arrayList3);
            str2 = " AND";
        }
        List<String> listC = querySpec.c();
        if (listC.isEmpty()) {
            str = str2;
        } else {
            sb2.append(str2);
            sb2.append(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            a(sb2, listC.size());
            sb2.append("))");
            arrayList.addAll(listC);
        }
        List<String> listD = querySpec.d();
        if (!listD.isEmpty()) {
            sb2.append(str);
            sb2.append(" id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            a(sb2, listD.size());
            sb2.append("))");
            arrayList.addAll(listD);
        }
        sb2.append(";");
        return new m9.b(sb2.toString(), arrayList.toArray());
    }
}
