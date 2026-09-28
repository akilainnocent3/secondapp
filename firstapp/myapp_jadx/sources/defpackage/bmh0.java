package defpackage;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class bmh0 {
    public final Context a;
    public final gs1 b;
    public final erg c;
    public final mwj0 d;
    public final Executor e;
    public final zoe0 f;
    public final ss7 g;
    public final ss7 h;
    public final bs7 i;

    public bmh0(Context context, gs1 gs1Var, erg ergVar, mwj0 mwj0Var, Executor executor, zoe0 zoe0Var, ss7 ss7Var, ss7 ss7Var2, bs7 bs7Var) {
        this.a = context;
        this.b = gs1Var;
        this.c = ergVar;
        this.d = mwj0Var;
        this.e = executor;
        this.f = zoe0Var;
        this.g = ss7Var;
        this.h = ss7Var2;
        this.i = bs7Var;
    }

    public final void a(final ml1 ml1Var, int i) {
        kg1 kg1VarB;
        nug0 nug0VarD = this.b.d(ml1Var.a);
        hs1.a aVar = hs1.a.a;
        new kg1(aVar, 0L);
        final long j = 0;
        while (true) {
            zoe0.a aVar2 = new zoe0.a() { // from class: vlh0
                @Override // zoe0.a
                public final Object execute() {
                    return Boolean.valueOf(this.a.c.Q0(ml1Var));
                }
            };
            zoe0 zoe0Var = this.f;
            if (!((Boolean) zoe0Var.f(aVar2)).booleanValue()) {
                final bmh0 bmh0Var = this;
                final ml1 ml1Var2 = ml1Var;
                zoe0Var.f(new zoe0.a() { // from class: amh0
                    @Override // zoe0.a
                    public final Object execute() {
                        bmh0 bmh0Var2 = this.a;
                        bmh0Var2.c.x0(bmh0Var2.g.b() + j, ml1Var2);
                        return null;
                    }
                });
                return;
            }
            final Iterable iterable = (Iterable) zoe0Var.f(new zoe0.a() { // from class: wlh0
                @Override // zoe0.a
                public final Object execute() {
                    return this.a.c.z1(ml1Var);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (nug0VarD == null) {
                tgt.a(ml1Var, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                kg1VarB = new kg1(hs1.a.c, -1L);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((je00) it.next()).a());
                }
                if (ml1Var.b() != null) {
                    final bs7 bs7Var = this.i;
                    Objects.requireNonNull(bs7Var);
                    ds7 ds7Var = (ds7) zoe0Var.f(new zoe0.a() { // from class: slh0
                        @Override // zoe0.a
                        public final Object execute() {
                            return bs7Var.g();
                        }
                    });
                    fi1.a aVar3 = new fi1.a();
                    aVar3.f = new HashMap();
                    aVar3.d = Long.valueOf(this.g.b());
                    aVar3.e = Long.valueOf(this.h.b());
                    aVar3.a = "GDT_CLIENT_METRICS";
                    j4g j4gVar = new j4g("proto");
                    ds7Var.getClass();
                    c730 c730Var = l630.a;
                    c730Var.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        c730Var.a(ds7Var, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    aVar3.c = new d4g(j4gVar, byteArrayOutputStream.toByteArray());
                    arrayList.add(nug0VarD.a(aVar3.b()));
                }
                kg1VarB = nug0VarD.b(new jg1(arrayList, ml1Var.b));
            }
            hs1.a aVar4 = kg1VarB.a;
            if (aVar4 == hs1.a.b) {
                final bmh0 bmh0Var2 = this;
                final ml1 ml1Var3 = ml1Var;
                zoe0Var.f(new zoe0.a() { // from class: xlh0
                    @Override // zoe0.a
                    public final Object execute() {
                        bmh0 bmh0Var3 = this.a;
                        erg ergVar = bmh0Var3.c;
                        ergVar.p0(iterable);
                        ergVar.x0(bmh0Var3.g.b() + j, ml1Var3);
                        return null;
                    }
                });
                bmh0Var2.d.b(ml1Var3, i + 1, true);
                return;
            }
            final bmh0 bmh0Var3 = this;
            ml1 ml1Var4 = ml1Var;
            zoe0Var.f(new zoe0.a() { // from class: ylh0
                @Override // zoe0.a
                public final Object execute() {
                    this.a.c.x(iterable);
                    return null;
                }
            });
            if (aVar4 == aVar) {
                long jMax = Math.max(j, kg1VarB.b);
                if (ml1Var4.b() != null) {
                    zoe0Var.f(new e650(bmh0Var3));
                }
                j = jMax;
            } else if (aVar4 == hs1.a.d) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strK = ((je00) it2.next()).a().k();
                    if (map.containsKey(strK)) {
                        map.put(strK, Integer.valueOf(((Integer) map.get(strK)).intValue() + 1));
                    } else {
                        map.put(strK, 1);
                    }
                }
                zoe0Var.f(new zoe0.a() { // from class: zlh0
                    @Override // zoe0.a
                    public final Object execute() {
                        for (Map.Entry entry : map.entrySet()) {
                            this.a.i.l(((Integer) entry.getValue()).intValue(), hft.a.INVALID_PAYLOD, (String) entry.getKey());
                        }
                        return null;
                    }
                });
            }
            this = bmh0Var3;
            ml1Var = ml1Var4;
        }
    }
}
