package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface i2w<Model, Data> {

    public static class a<Data> {
        public final nlp a;
        public final List<nlp> b;
        public final cpc<Data> c;

        public a() {
            throw null;
        }

        public a(nlp nlpVar, cpc<Data> cpcVar) {
            List<nlp> list = Collections.EMPTY_LIST;
            gm20.c(nlpVar, "Argument must not be null");
            this.a = nlpVar;
            gm20.c(list, "Argument must not be null");
            this.b = list;
            gm20.c(cpcVar, "Argument must not be null");
            this.c = cpcVar;
        }
    }

    a<Data> a(Model model, int i, int i2, s2z s2zVar);

    boolean b(Model model);
}
