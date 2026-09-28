package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i6f {
    public final jrm a;

    public i6f(jrm jrmVar) {
        jrmVar.getClass();
        this.a = jrmVar;
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Selection selection = (Selection) obj;
            if (qvy.c(selection) && !selection.n()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean b(Selection selection, Selection selection2) {
        if (Intrinsics.g(selection, selection2)) {
            return true;
        }
        return qvy.a(selection, selection2) && Intrinsics.g(selection.b.id, selection2.b.id);
    }
}
