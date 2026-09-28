package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class rkl {
    public static final Range<Integer> e = new Range<>(120, 120);
    public final e16 a;
    public final mpe0 b;
    public final mpe0 c;
    public final mpe0 d;

    public rkl(e16 e16Var) {
        e16Var.getClass();
        this.a = e16Var;
        this.b = hwr.b(new okl(this, 0));
        this.c = hwr.b(new pkl(this, 0));
        this.d = hwr.b(new Function0() { // from class: qkl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Size[] highSpeedVideoSizes = this.a.a.c().a.a.getHighSpeedVideoSizes();
                return highSpeedVideoSizes != null ? ay0.v(highSpeedVideoSizes) : m2g.a;
            }
        });
    }

    public static List a(List list) {
        if (list.isEmpty()) {
            return m2g.a;
        }
        ArrayList arrayListC0 = CollectionsKt.C0((Collection) CollectionsKt.T(list));
        Iterator it = CollectionsKt.O(list, 1).iterator();
        while (it.hasNext()) {
            arrayListC0.retainAll((List) it.next());
        }
        return arrayListC0;
    }

    public final Range<Integer>[] b(List<Size> list) {
        list.getClass();
        int size = list.size();
        if (1 <= size && size < 3 && CollectionsKt.A0(CollectionsKt.D0(list)).size() == 1) {
            List<Range<Integer>> listC = c(list.get(0));
            if (listC.isEmpty()) {
                listC = null;
            }
            if (listC != null) {
                if (list.size() == 2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listC) {
                        Range range = (Range) obj;
                        if (Intrinsics.g(range.getLower(), range.getUpper())) {
                            arrayList.add(obj);
                        }
                    }
                    listC = arrayList;
                }
                return (Range[]) listC.toArray(new Range[0]);
            }
        }
        return null;
    }

    public final List<Range<Integer>> c(Size size) {
        Object bVar;
        List<Range<Integer>> listA0;
        try {
            zi50.a aVar = zi50.b;
            bVar = this.a.c().a.a.getHighSpeedVideoFpsRangesFor(size);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        Range[] rangeArr = (Range[]) bVar;
        return (rangeArr == null || (listA0 = CollectionsKt.A0(ay0.v(rangeArr))) == null) ? m2g.a : listA0;
    }
}
