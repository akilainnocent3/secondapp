package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jfy {
    public final wwd0 a;

    public jfy(int i) {
        this.a = xwd0.a(new int[i]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void a(pwg0.b bVar, x1b x1bVar) {
        ify ifyVar;
        if (x1bVar instanceof ify) {
            ifyVar = (ify) x1bVar;
            int i = ifyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ifyVar.c = i - Integer.MIN_VALUE;
            } else {
                ifyVar = new ify(this, x1bVar);
            }
        } else {
            ifyVar = new ify(this, x1bVar);
        }
        Object obj = ifyVar.a;
        y5b y5bVar = y5b.a;
        int i2 = ifyVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                throw l80.a(obj);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
        } else {
            uj50.b(obj);
            ifyVar.c = 1;
            this.a.collect(bVar, ifyVar);
        }
    }
}
