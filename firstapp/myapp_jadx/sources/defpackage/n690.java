package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class n690 implements h690 {
    public final lv50 a;
    public final a b = new a();
    public final b c = new b();

    public static final class a extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            u690 u690Var = (u690) obj;
            hq60Var.getClass();
            u690Var.getClass();
            hq60Var.L(1, u690Var.a);
            hq60Var.q(2, u690Var.b);
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT OR REPLACE INTO `shortcut_record` (`shortcutId`,`lastModified`) VALUES (?,?)";
        }
    }

    public static final class b extends y3l {
        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            ygm ygmVar = (ygm) obj;
            hq60Var.getClass();
            ygmVar.getClass();
            hq60Var.L(1, ygmVar.a);
            hq60Var.q(2, ygmVar.b);
            hq60Var.q(3, ygmVar.c ? 1L : 0L);
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT OR REPLACE INTO `home_shortcut` (`shortcutId`,`createdAt`,`asDefault`) VALUES (?,?,?)";
        }
    }

    public n690(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.h690
    public final Object a(ArrayList arrayList, t790 t790Var) {
        Object objB = qlc.b(this.a, new o690(this, arrayList, null), t790Var);
        return objB == y5b.a ? objB : Unit.a;
    }

    @Override // defpackage.h690
    public final Object b(final ArrayList arrayList, n790 n790Var) {
        StringBuilder sbA = y4s.a("SELECT * FROM home_shortcut WHERE shortcutId IN (");
        d21.c(arrayList.size(), sbA);
        sbA.append(") ORDER BY createdAt ASC");
        final String string = sbA.toString();
        return qlc.c(n790Var, this.a, new Function1() { // from class: m690
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                ArrayList arrayList2 = arrayList;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1(string);
                try {
                    int size = arrayList2.size();
                    int i = 0;
                    int i2 = 1;
                    while (i < size) {
                        Object obj2 = arrayList2.get(i);
                        i++;
                        hq60VarH1.L(i2, (String) obj2);
                        i2++;
                    }
                    int iB = l0b.b(hq60VarH1, "shortcutId");
                    int iB2 = l0b.b(hq60VarH1, "createdAt");
                    int iB3 = l0b.b(hq60VarH1, "asDefault");
                    ArrayList arrayList3 = new ArrayList();
                    while (hq60VarH1.D1()) {
                        arrayList3.add(new ygm(hq60VarH1.k1(iB), hq60VarH1.getLong(iB2), ((int) hq60VarH1.getLong(iB3)) != 0));
                    }
                    return arrayList3;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, true, false);
    }

    @Override // defpackage.h690
    public final Object c(s790 s790Var) {
        Object objC = qlc.c(s790Var, this.a, new l690(), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.h690
    public final Object d(x1b x1bVar) {
        Object objC = qlc.c(x1bVar, this.a, new c2n(2), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.h690
    public final Object e(final ArrayList arrayList, z690 z690Var) {
        StringBuilder sbA = y4s.a("SELECT * FROM shortcut_record WHERE shortcutId IN (");
        d21.c(arrayList.size(), sbA);
        sbA.append(") order by lastModified desc");
        final String string = sbA.toString();
        return qlc.c(z690Var, this.a, new Function1() { // from class: i690
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                ArrayList arrayList2 = arrayList;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1(string);
                try {
                    int size = arrayList2.size();
                    int i = 1;
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        hq60VarH1.L(i, (String) obj2);
                        i++;
                    }
                    int iB = l0b.b(hq60VarH1, "shortcutId");
                    int iB2 = l0b.b(hq60VarH1, "lastModified");
                    ArrayList arrayList3 = new ArrayList();
                    while (hq60VarH1.D1()) {
                        arrayList3.add(new u690(hq60VarH1.k1(iB), hq60VarH1.getLong(iB2)));
                    }
                    return arrayList3;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, true, false);
    }

    @Override // defpackage.h690
    public final Object g(final ygm ygmVar, x1b x1bVar) {
        Object objC = qlc.c(x1bVar, this.a, new Function1() { // from class: k690
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                this.a.c.m(vp60Var, ygmVar);
                return Unit.a;
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.h690
    public final Object h(final u690 u690Var, q790 q790Var) {
        Object objC = qlc.c(q790Var, this.a, new Function1() { // from class: j690
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                this.a.b.m(vp60Var, u690Var);
                return Unit.a;
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }
}
