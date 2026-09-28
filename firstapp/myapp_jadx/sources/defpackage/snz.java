package defpackage;

/* JADX INFO: loaded from: classes.dex */
@fae
public abstract class snz<Key, Value> extends aqc<Key, Value> {

    public static abstract class a<Key, Value> {
    }

    public static abstract class b<Key, Value> {
    }

    public static class c<Key> {
    }

    public static class d<Key> {
        public final Key a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Object obj) {
            obj.getClass();
            this.a = obj;
        }
    }

    public snz() {
        super(aqc.f.b);
    }

    @Override // defpackage.aqc
    public final Key a(Value value) {
        throw new IllegalStateException("Cannot get key by item in pageKeyedDataSource");
    }

    @Override // defpackage.aqc
    public final Object b(aqc.g gVar, w5s w5sVar) throws Throwable {
        kxs kxsVar = gVar.a;
        if (kxsVar == kxs.a) {
            c cVar = new c();
            bc6 bc6Var = new bc6(1, yzo.b(w5sVar));
            bc6Var.q();
            e(cVar, new unz(bc6Var));
            Object objO = bc6Var.o();
            y5b y5bVar = y5b.a;
            return objO;
        }
        K k = gVar.b;
        if (k == 0) {
            return new aqc.c(m2g.a, null, null, 0, 0);
        }
        if (kxsVar == kxs.b) {
            d dVar = new d(k);
            bc6 bc6Var2 = new bc6(1, yzo.b(w5sVar));
            bc6Var2.q();
            d(dVar, new tnz(bc6Var2, false));
            Object objO2 = bc6Var2.o();
            y5b y5bVar2 = y5b.a;
            return objO2;
        }
        if (kxsVar != kxs.c) {
            z9l.a(kxsVar, "Unsupported type ");
            return null;
        }
        d dVar2 = new d(k);
        bc6 bc6Var3 = new bc6(1, yzo.b(w5sVar));
        bc6Var3.q();
        c(dVar2, new tnz(bc6Var3, true));
        Object objO3 = bc6Var3.o();
        y5b y5bVar3 = y5b.a;
        return objO3;
    }

    public abstract void c(d dVar, tnz tnzVar);

    public abstract void d(d dVar, tnz tnzVar);

    public abstract void e(c cVar, unz unzVar);
}
