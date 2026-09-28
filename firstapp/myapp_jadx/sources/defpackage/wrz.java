package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class wrz {
    public final List<Object> a;
    public int b;

    public wrz(int i, ArrayList arrayList) {
        this.a = (i & 1) != 0 ? new ArrayList() : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0047 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0048 A[RETURN] */
    public Object a(dq7 dq7Var) {
        List<Object> list = this.a;
        if (list.isEmpty()) {
            return null;
        }
        Object obj = list.get(this.b);
        if (!dq7Var.h(obj)) {
            obj = null;
        }
        if (obj == null) {
            obj = null;
        }
        if (obj != null && this.b < list.size() - 1) {
            this.b++;
        }
        if (obj != null) {
            return obj;
        }
        for (Object obj2 : list) {
            if (dq7Var.h(obj2)) {
                if (obj2 == null) {
                    return null;
                }
                return obj2;
            }
        }
        obj2 = null;
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wrz) {
            return Intrinsics.g(this.a, ((wrz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "DefinitionParameters" + CollectionsKt.A0(this.a);
    }

    public wrz() {
        this(3, null);
    }
}
