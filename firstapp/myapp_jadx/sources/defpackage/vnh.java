package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class vnh {
    public final jrm a;

    public vnh(jrm jrmVar) {
        jrmVar.getClass();
        this.a = jrmVar;
    }

    public final List<Selection> a() {
        ArrayList arrayListU = this.a.U();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet<Selection> linkedHashSet2 = new LinkedHashSet();
        int size = arrayListU.size();
        int i = 0;
        loop0: while (i < size) {
            Object obj = arrayListU.get(i);
            i++;
            Selection selection = (Selection) obj;
            if (yay.j(selection)) {
                if (!linkedHashSet2.isEmpty()) {
                    for (Selection selection2 : linkedHashSet2) {
                        if (Intrinsics.g(selection2, selection) || (yay.b(selection2, selection) && Intrinsics.g(selection2.b.id, selection.b.id) && Intrinsics.g(selection2.b.specifier, selection.b.specifier))) {
                            linkedHashSet.add(selection);
                            break loop0;
                        }
                    }
                }
                linkedHashSet2.add(selection);
            }
        }
        return CollectionsKt.A0(linkedHashSet);
    }
}
