package defpackage;

import com.bumptech.glide.load.data.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fxs<Data, ResourceType, Transcode> {
    public final b220<List<Throwable>> a;
    public final List<? extends v4d<Data, ResourceType, Transcode>> b;
    public final String c;

    public fxs(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<v4d<Data, ResourceType, Transcode>> list, b220<List<Throwable>> b220Var) {
        this.a = b220Var;
        if (list.isEmpty()) {
            hb5.a("Must not be empty.");
            throw null;
        }
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final qg50 a(int i, int i2, u4d.a aVar, s2z s2zVar, a aVar2) {
        b220<List<Throwable>> b220Var = this.a;
        List<Throwable> listB = b220Var.b();
        gm20.c(listB, "Argument must not be null");
        try {
            List<? extends v4d<Data, ResourceType, Transcode>> list = this.b;
            int size = list.size();
            qg50 qg50VarA = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    qg50VarA = list.get(i3).a(i, i2, aVar, s2zVar, aVar2);
                } catch (xzk e) {
                    listB.add(e);
                }
                if (qg50VarA != null) {
                    break;
                }
            }
            if (qg50VarA == null) {
                throw new xzk(this.c, new ArrayList(listB));
            }
            b220Var.a(listB);
            return qg50VarA;
        } catch (Throwable th) {
            b220Var.a(listB);
            throw th;
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
