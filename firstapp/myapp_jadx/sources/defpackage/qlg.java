package defpackage;

import androidx.camera.core.impl.utils.TP.sgwpmp;
import com.sporty.android.book.domain.entity.MarketGroup;
import com.sporty.android.book.domain.entity.SimpleMarket;
import com.sporty.android.core.model.MyLog;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class qlg implements dlg {
    public final lv50 a;
    public final eng c = new eng();
    public final a b = new a();
    public final b d = new b();
    public final c e = new c();
    public final d f = new d();

    public static final class a extends y3l {
        public a() {
        }

        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            or5 or5Var = (or5) obj;
            hq60Var.getClass();
            or5Var.getClass();
            hq60Var.L(1, or5Var.a);
            hq60Var.q(2, or5Var.b);
            hq60Var.L(3, or5Var.c);
            eng engVar = qlg.this.c;
            Event event = or5Var.d;
            engVar.getClass();
            String json = null;
            if (event != null) {
                try {
                    zi50.a aVar = zi50.b;
                    json = engVar.d().toJson(event);
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    if (zi50.a(new zi50.b(th)) != null) {
                        itf0.a aVar3 = itf0.a;
                        aVar3.q(MyLog.TAG_CACHE_DB);
                        aVar3.a("Event Convert to JS string failed", new Object[0]);
                    }
                }
            }
            if (json == null) {
                hq60Var.r(4);
            } else {
                hq60Var.L(4, json);
            }
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT OR REPLACE INTO `CacheEvent` (`eventId`,`productType`,`language`,`event`) VALUES (?,?,?,?)";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class b extends y3l {
        public b() {
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT OR REPLACE INTO `CacheMarketGroup` (`eventId`,`productType`,`language`,`marketGroups`) VALUES (?,?,?,?)";
        }

        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            ur5 ur5Var = (ur5) obj;
            hq60Var.getClass();
            ur5Var.getClass();
            hq60Var.L(1, ur5Var.a);
            hq60Var.q(2, ur5Var.b);
            hq60Var.L(3, ur5Var.c);
            eng engVar = qlg.this.c;
            List<MarketGroup> list = ur5Var.d;
            engVar.getClass();
            String json = null;
            if (list != null) {
                try {
                    zi50.a aVar = zi50.b;
                    json = engVar.d().toJson(list);
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    if (zi50.a(new zi50.b(th)) != null) {
                        itf0.a aVar3 = itf0.a;
                        aVar3.q(dqvOSm.VnHzIWiSGV);
                        aVar3.a("MarketGroup Convert to JS string failed", new Object[0]);
                    }
                }
            }
            if (json == null) {
                hq60Var.r(4);
            } else {
                hq60Var.L(4, json);
            }
        }
    }

    public static final class c extends y3l {
        public c() {
        }

        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            er5 er5Var = (er5) obj;
            hq60Var.getClass();
            er5Var.getClass();
            hq60Var.L(1, er5Var.a);
            eng engVar = qlg.this.c;
            List<SimpleMarket> list = er5Var.b;
            engVar.getClass();
            String json = null;
            if (list != null) {
                try {
                    zi50.a aVar = zi50.b;
                    json = engVar.d().toJson(list);
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    if (zi50.a(new zi50.b(th)) != null) {
                        itf0.a aVar3 = itf0.a;
                        aVar3.q(MyLog.TAG_CACHE_DB);
                        aVar3.a("AvailableMarkets Convert to JS string failed", new Object[0]);
                    }
                }
            }
            if (json == null) {
                hq60Var.r(2);
            } else {
                hq60Var.L(2, json);
            }
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT OR REPLACE INTO `CacheBetBuilderMarkets` (`sportId`,`availableMarkets`) VALUES (?,?)";
        }
    }

    public static final class d extends y3l {
        public d() {
        }

        @Override // defpackage.y3l
        public final void a(hq60 hq60Var, Object obj) {
            pr5 pr5Var = (pr5) obj;
            hq60Var.getClass();
            pr5Var.getClass();
            hq60Var.L(1, pr5Var.a);
            hq60Var.q(2, pr5Var.b);
            eng engVar = qlg.this.c;
            List<Integer> list = pr5Var.c;
            engVar.getClass();
            String json = null;
            if (list != null) {
                try {
                    zi50.a aVar = zi50.b;
                    json = engVar.d().toJson(list);
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    if (zi50.a(new zi50.b(th)) != null) {
                        itf0.a aVar3 = itf0.a;
                        aVar3.q(MyLog.TAG_CACHE_DB);
                        aVar3.a("FavoriteMarketIds Convert to JS string failed", new Object[0]);
                    }
                }
            }
            if (json == null) {
                hq60Var.r(3);
            } else {
                hq60Var.L(3, json);
            }
        }

        @Override // defpackage.y3l
        public final String b() {
            return "INSERT OR REPLACE INTO `CacheFavoriteMarketIds` (`sportId`,`productType`,`favoriteMarketIds`) VALUES (?,?,?)";
        }
    }

    public qlg(lv50 lv50Var) {
        this.a = lv50Var;
    }

    @Override // defpackage.dlg
    public final Object a(vlg.b bVar) {
        Object objC = qlc.c(bVar, this.a, new ilg(), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.dlg
    public final Object b(final er5 er5Var, dmg dmgVar) {
        Object objC = qlc.c(dmgVar, this.a, new Function1() { // from class: olg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                this.a.e.m(vp60Var, er5Var);
                return Unit.a;
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.dlg
    public final Object c(final String str, xlg xlgVar) {
        return qlc.c(xlgVar, this.a, new Function1() { // from class: glg
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                String str2 = str;
                qlg qlgVar = this;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("SELECT * FROM CacheBetBuilderMarkets WHERE sportId = ?");
                try {
                    hq60VarH1.L(1, str2);
                    int iB = l0b.b(hq60VarH1, "sportId");
                    int iB2 = l0b.b(hq60VarH1, "availableMarkets");
                    er5 er5Var = null;
                    String strK1 = null;
                    if (hq60VarH1.D1()) {
                        String strK2 = hq60VarH1.k1(iB);
                        if (!hq60VarH1.isNull(iB2)) {
                            strK1 = hq60VarH1.k1(iB2);
                        }
                        List<SimpleMarket> listA = qlgVar.c.a(strK1);
                        if (listA == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.sporty.android.book.domain.entity.SimpleMarket>', but it was NULL.");
                        }
                        er5Var = new er5(strK2, listA);
                    }
                    hq60VarH1.close();
                    return er5Var;
                } catch (Throwable th) {
                    hq60VarH1.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // defpackage.dlg
    public final Object d(vlg.a aVar) {
        Object objC = qlc.c(aVar, this.a, new hlg(), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.dlg
    public final Object e(final String str, final int i, bmg bmgVar) {
        return qlc.c(bmgVar, this.a, new Function1() { // from class: flg
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                String str2 = str;
                int i2 = i;
                qlg qlgVar = this;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("SELECT * FROM CacheFavoriteMarketIds WHERE sportId = ? AND productType = ?");
                try {
                    hq60VarH1.L(1, str2);
                    hq60VarH1.q(2, i2);
                    int iB = l0b.b(hq60VarH1, sgwpmp.aWhY);
                    int iB2 = l0b.b(hq60VarH1, "productType");
                    int iB3 = l0b.b(hq60VarH1, "favoriteMarketIds");
                    pr5 pr5Var = null;
                    String strK1 = null;
                    if (hq60VarH1.D1()) {
                        String strK2 = hq60VarH1.k1(iB);
                        int i3 = (int) hq60VarH1.getLong(iB2);
                        if (!hq60VarH1.isNull(iB3)) {
                            strK1 = hq60VarH1.k1(iB3);
                        }
                        List<Integer> listC = qlgVar.c.c(strK1);
                        if (listC == null) {
                            throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<kotlin.Int>', but it was NULL.");
                        }
                        pr5Var = new pr5(strK2, i3, listC);
                    }
                    hq60VarH1.close();
                    return pr5Var;
                } catch (Throwable th) {
                    hq60VarH1.close();
                    throw th;
                }
            }
        }, true, false);
    }

    @Override // defpackage.dlg
    public final Object f(final pr5 pr5Var, hmg hmgVar) {
        Object objC = qlc.c(hmgVar, this.a, new Function1() { // from class: nlg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                this.a.f.m(vp60Var, pr5Var);
                return Unit.a;
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.dlg
    public final Object g(final String str, final String str2, final int i, final String str3, zlg zlgVar) {
        return qlc.c(zlgVar, this.a, new Function1() { // from class: plg
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Exception {
                String str4 = str2;
                int i2 = i;
                String str5 = str3;
                String str6 = str;
                qlg qlgVar = this;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("SELECT CacheEvent.event as event, CacheMarketGroup.marketGroups as marketGroups, CacheFavoriteMarketIds.favoriteMarketIds as favoriteMarketIds, CacheBetBuilderMarkets.availableMarkets as betBuilderMarkets FROM CacheEvent LEFT JOIN CacheMarketGroup ON CacheMarketGroup.eventId = ? AND CacheMarketGroup.productType = ? AND CacheMarketGroup.language = ? LEFT JOIN CacheBetBuilderMarkets ON CacheBetBuilderMarkets.sportId = ? LEFT JOIN CacheFavoriteMarketIds ON CacheFavoriteMarketIds.sportId = ? AND CacheFavoriteMarketIds.productType = ? WHERE CacheEvent.eventId = ? AND CacheEvent.productType = ? AND CacheEvent.language = ? LIMIT 1");
                try {
                    hq60VarH1.L(1, str4);
                    long j = i2;
                    hq60VarH1.q(2, j);
                    hq60VarH1.L(3, str5);
                    hq60VarH1.L(4, str6);
                    hq60VarH1.L(5, str6);
                    hq60VarH1.q(6, j);
                    hq60VarH1.L(7, str4);
                    hq60VarH1.q(8, j);
                    hq60VarH1.L(9, str5);
                    aqg aqgVar = null;
                    String strK1 = null;
                    if (hq60VarH1.D1()) {
                        String strK2 = hq60VarH1.isNull(0) ? null : hq60VarH1.k1(0);
                        eng engVar = qlgVar.c;
                        Event eventB = engVar.b(strK2);
                        List<MarketGroup> listE = engVar.e(hq60VarH1.isNull(1) ? null : hq60VarH1.k1(1));
                        List<Integer> listC = engVar.c(hq60VarH1.isNull(2) ? null : hq60VarH1.k1(2));
                        if (!hq60VarH1.isNull(3)) {
                            strK1 = hq60VarH1.k1(3);
                        }
                        aqgVar = new aqg(eventB, listE, listC, engVar.a(strK1));
                    }
                    return aqgVar;
                } finally {
                    hq60VarH1.close();
                }
            }
        }, true, false);
    }

    @Override // defpackage.dlg
    public final Object h(final or5 or5Var, fmg fmgVar) {
        Object objC = qlc.c(fmgVar, this.a, new Function1() { // from class: llg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                this.a.b.m(vp60Var, or5Var);
                return Unit.a;
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.dlg
    public final Object i(vlg.d dVar) {
        Object objC = qlc.c(dVar, this.a, new jlg(0), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.dlg
    public final Object j(vlg.c cVar) {
        Object objC = qlc.c(cVar, this.a, new elg(), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.dlg
    public final Object k(String str, tlg tlgVar) {
        Object objC = qlc.c(tlgVar, this.a, new klg(str, 0), false, true);
        return objC == y5b.a ? objC : Unit.a;
    }

    @Override // defpackage.dlg
    public final Object l(final ur5 ur5Var, jmg jmgVar) {
        Object objC = qlc.c(jmgVar, this.a, new Function1() { // from class: mlg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                this.a.d.m(vp60Var, ur5Var);
                return Unit.a;
            }
        }, false, true);
        return objC == y5b.a ? objC : Unit.a;
    }
}
