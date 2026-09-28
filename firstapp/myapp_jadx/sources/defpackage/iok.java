package defpackage;

import androidx.compose.runtime.h;
import com.sportybet.core.domain.model.a;
import com.sportybet.core.domain.model.b;
import com.sportybet.core.domain.model.c;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class iok {
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0055 A[EDGE_INSN: B:35:0x0055->B:27:0x0055 BREAK  A[LOOP:0: B:6:0x000f->B:30:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:? A[LOOP:2: B:21:0x0044->B:36:?, LOOP_END, SYNTHETIC] */
    public static final boolean a(eik eikVar) {
        int size;
        int i;
        Object obj;
        ArrayList arrayList = eikVar.k;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                if (((c04) obj2) instanceof a) {
                    if (arrayList.isEmpty()) {
                        if (arrayList.isEmpty()) {
                            return true;
                        }
                        size = arrayList.size();
                        i = 0;
                        while (i < size) {
                            obj = arrayList.get(i);
                            i++;
                            if (((c04) obj) instanceof c) {
                                break;
                            }
                        }
                        return true;
                    }
                    int size3 = arrayList.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        if (((c04) obj3) instanceof b) {
                            break;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return true;
                    }
                    size = arrayList.size();
                    i = 0;
                    while (i < size) {
                        obj = arrayList.get(i);
                        i++;
                        if (((c04) obj) instanceof c) {
                            break;
                            break;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static final void b(h hVar, fv0 fv0Var, int i) {
        while (true) {
            int i2 = hVar.v;
            if (i > i2 && i < hVar.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            hVar.M();
            if (hVar.w(hVar.v)) {
                fv0Var.j();
            }
            hVar.i();
        }
    }
}
