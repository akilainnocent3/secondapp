package defpackage;

import com.esotericsoftware.spine.android.b;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class wmb0 implements zi0.b {
    public final /* synthetic */ bq40 a;
    public final /* synthetic */ List<String> b;
    public final /* synthetic */ tx90 c;
    public final /* synthetic */ b d;

    public wmb0(bq40 bq40Var, List<String> list, tx90 tx90Var, b bVar) {
        this.a = bq40Var;
        this.b = list;
        this.c = tx90Var;
        this.d = bVar;
    }

    @Override // zi0.b
    public final void b(zi0.e eVar) {
        bq40 bq40Var = this.a;
        int i = bq40Var.a + 1;
        List<String> list = this.b;
        int size = i % list.size();
        bq40Var.a = size;
        String str = list.get(size);
        if (this.c.a(str) == null) {
            return;
        }
        this.d.a().m(0, str, false);
    }

    @Override // zi0.b
    public final void c(zi0.e eVar) {
    }

    @Override // zi0.b
    public final void a(zi0.e eVar, whg whgVar) {
    }
}
