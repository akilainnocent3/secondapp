package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h8l {
    public ArrayList<Object> a;

    public final boolean a(l00 l00Var) {
        ArrayList<Object> arrayList = this.a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                Object obj = arrayList.get(i);
                if (Intrinsics.g(obj, l00Var)) {
                    return true;
                }
                if ((obj instanceof h8l) && ((h8l) obj).a(l00Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final h8l b() {
        Object obj;
        ArrayList<Object> arrayList = this.a;
        if (arrayList == null) {
            obj = null;
            break;
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                obj = null;
                break;
            }
            obj = arrayList.get(size);
            if (obj instanceof h8l) {
                break;
            }
            size--;
        }
        h8l h8lVar = obj instanceof h8l ? (h8l) obj : null;
        return h8lVar != null ? h8lVar.b() : this;
    }

    public final boolean c(l00 l00Var) {
        ArrayList<Object> arrayList = this.a;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof l00) {
                    if (obj == l00Var) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof h8l) && !((h8l) obj).c(l00Var)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.a = null;
                return false;
            }
        }
        return true;
    }
}
