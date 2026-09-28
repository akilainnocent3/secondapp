package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cb80 {
    public final sa80 a;
    public final nsw b;

    public cb80(bb80 bb80Var, gwo<eb80> gwoVar) {
        this.a = bb80Var.d;
        this.b = new nsw(bb80.j(4, bb80Var).size());
        List listJ = bb80.j(4, bb80Var);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            bb80 bb80Var2 = (bb80) listJ.get(i);
            if (gwoVar.a(bb80Var2.g)) {
                this.b.a(bb80Var2.g);
            }
        }
    }
}
