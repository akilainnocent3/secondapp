package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kx5 implements nv5.c, pya {
    public final /* synthetic */ Object a;

    public /* synthetic */ kx5(Object obj) {
        this.a = obj;
    }

    @Override // nv5.c
    public Object a(final nv5.a aVar) {
        final qx5 qx5Var = (qx5) this.a;
        qx5Var.c.execute(new Runnable() { // from class: bx5
            @Override // java.lang.Runnable
            public final void run() {
                qx5.e.a aVar2;
                qx5 qx5Var2 = qx5Var;
                nv5.a aVar3 = aVar;
                qx5.f fVar = qx5.f.b;
                qis qisVar = qx5Var2.D;
                boolean z = true;
                qis qisVar2 = qisVar;
                if (qisVar == null) {
                    if (qx5Var2.e != qx5.f.a) {
                        nv5.a<Void> aVar4 = new nv5.a<>();
                        nv5.d<T> dVar = new nv5.d<>(aVar4);
                        aVar4.b = dVar;
                        aVar4.a = ew5.class;
                        try {
                            km20.g("Camera can only be released once, so release completer should be null on creation.", qx5Var2.E == null);
                            qx5Var2.E = aVar4;
                            aVar4.a = "Release[camera=" + qx5Var2 + "]";
                        } catch (Exception e) {
                            dVar.a(e);
                        }
                        qx5Var2.D = dVar;
                        qisVar2 = dVar;
                    } else {
                        qis qisVar3 = fcn.c.b;
                        qx5Var2.D = qisVar3;
                        qisVar2 = qisVar3;
                    }
                }
                switch (qx5Var2.e.ordinal()) {
                    case 1:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        if (!qx5Var2.w.a() && ((aVar2 = qx5Var2.b0.a) == null || aVar2.b.get())) {
                            z = false;
                        }
                        qx5Var2.b0.a();
                        qx5Var2.F(fVar);
                        if (z) {
                            km20.g(null, qx5Var2.F.isEmpty());
                            qx5Var2.t();
                        }
                        break;
                    case 2:
                    case 3:
                    case 4:
                        km20.g(null, qx5Var2.z == null);
                        qx5Var2.F(fVar);
                        km20.g(null, qx5Var2.F.isEmpty());
                        qx5Var2.t();
                        break;
                    case 9:
                    case 10:
                        qx5Var2.F(fVar);
                        qx5Var2.s();
                        break;
                    default:
                        qx5Var2.v("release() ignored due to being in state: " + qx5Var2.e, null);
                        break;
                }
                obj.e(qisVar2, aVar3);
            }
        });
        return "Release[request=" + qx5Var.C.getAndIncrement() + "]";
    }

    @Override // defpackage.pya
    public void accept(Object obj) {
        ((j8j) this.a).invoke(obj);
    }
}
