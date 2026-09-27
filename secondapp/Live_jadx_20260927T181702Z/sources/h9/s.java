package h9;

import fr.r0;
import java.util.ArrayList;
import k.y0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@s1({"SMAP\nStatementUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatementUtil.kt\nandroidx/room/util/SQLiteStatementUtil__StatementUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final /* synthetic */ class s {
    public static final int a(@oy.l l9.i iVar, @oy.l String name) {
        m0.p(iVar, "<this>");
        m0.p(name, "name");
        if (iVar instanceof k) {
            return ((k) iVar).getColumnIndex(name);
        }
        int columnCount = iVar.getColumnCount();
        for (int i10 = 0; i10 < columnCount; i10++) {
            if (m0.g(name, iVar.getColumnName(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public static final int b(@oy.l l9.i stmt, @oy.l String name) {
        m0.p(stmt, "stmt");
        m0.p(name, "name");
        return r.a(stmt, name);
    }

    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public static final int c(@oy.l l9.i stmt, @oy.l String name) {
        m0.p(stmt, "stmt");
        m0.p(name, "name");
        int iA = r.a(stmt, name);
        if (iA >= 0) {
            return iA;
        }
        int columnCount = stmt.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i10 = 0; i10 < columnCount; i10++) {
            arrayList.add(stmt.getColumnName(i10));
        }
        throw new IllegalArgumentException("Column '" + name + "' does not exist. Available columns: [" + r0.r3(arrayList, null, null, null, 0, null, null, 63, null) + fw.b.f85385l);
    }

    @oy.l
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public static final l9.i d(@oy.l l9.i statement, @oy.l String[] columnNames, @oy.l int[] mapping) {
        m0.p(statement, "statement");
        m0.p(columnNames, "columnNames");
        m0.p(mapping, "mapping");
        return new k(statement, columnNames, mapping);
    }
}
