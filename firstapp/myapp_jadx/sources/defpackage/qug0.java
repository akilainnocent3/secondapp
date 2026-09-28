package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class qug0 implements pug0 {
    public final Set<j4g> a;
    public final ml1 b;
    public final dvg0 c;

    public qug0(Set set, ml1 ml1Var, dvg0 dvg0Var) {
        this.a = set;
        this.b = ml1Var;
        this.c = dvg0Var;
    }

    @Override // defpackage.pug0
    public final rug0 a(String str, j4g j4gVar, xsg0 xsg0Var) {
        Set<j4g> set = this.a;
        if (set.contains(j4gVar)) {
            return new rug0(this.b, str, j4gVar, xsg0Var, this.c);
        }
        ljh.a("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{j4gVar, set});
        return null;
    }
}
