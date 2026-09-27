package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ei1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m00 f148717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o3 f148718b = new o3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q3 f148719c = new q3();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yh1 f148720d;

    public ei1(Context context, iu3 iu3Var, m00 m00Var) {
        this.f148717a = m00Var;
        this.f148720d = new yh1(context, iu3Var, m00Var);
    }

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(fr.i0.d0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o00 o00Var = (o00) it.next();
            yh1 yh1Var = this.f148720d;
            arrayList.add(new xh1(yh1Var.f158318b, yh1Var.f158317a, o00Var, yh1Var.f158319c));
        }
        return arrayList;
    }
}
