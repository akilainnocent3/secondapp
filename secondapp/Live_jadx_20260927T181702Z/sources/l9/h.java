package l9;

import java.util.ArrayList;
import java.util.List;
import k.e0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h {
    public static void a(i iVar, @e0(from = 1) int i10, boolean z10) {
        iVar.e(i10, z10 ? 1L : 0L);
    }

    public static void b(i iVar, @e0(from = 1) int i10, float f10) {
        iVar.j(i10, f10);
    }

    public static void c(i iVar, @e0(from = 1) int i10, int i11) {
        iVar.e(i10, i11);
    }

    public static boolean d(i iVar, @e0(from = 0) int i10) {
        return iVar.getLong(i10) != 0;
    }

    @l
    public static List e(i iVar) {
        int columnCount = iVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i10 = 0; i10 < columnCount; i10++) {
            arrayList.add(iVar.getColumnName(i10));
        }
        return arrayList;
    }

    public static float f(i iVar, @e0(from = 0) int i10) {
        return (float) iVar.getDouble(i10);
    }

    public static int g(i iVar, @e0(from = 0) int i10) {
        return (int) iVar.getLong(i10);
    }
}
