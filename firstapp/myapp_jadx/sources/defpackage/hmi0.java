package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.internal.u;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.config.BroadcastConfig;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.virtual.BannerItem;
import com.sporty.android.core.model.virtual.MainEntranceItem;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.router.virtuallobby.VirtualLobbyInput;
import com.sportybet.android.virtual.domain.entity.BannerEntity;
import com.sportybet.android.virtual.domain.entity.MainEntranceEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lhmi0;", "Lj8i0;", "", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hmi0 extends j8i0 {
    public final wwd0 A;
    public final wwd0 B;
    public final wwd0 C;
    public final v340 D;
    public final /* synthetic */ zhi0 a;
    public final arm b;
    public final bnh0 c;
    public final gki0 d;
    public final lji0 e;
    public final rdd0 f;
    public final yho i;
    public final jki0 v;
    public final v340 w;
    public final v340 y;
    public final ku90<lli0> z;

    public hmi0(vu60 vu60Var, lgi0 lgi0Var, hgi0 hgi0Var, eko ekoVar, arm armVar, zhi0 zhi0Var, kqo kqoVar, bnh0 bnh0Var, gki0 gki0Var, lji0 lji0Var, rdd0 rdd0Var, yho yhoVar, jki0 jki0Var, je5 je5Var) {
        wwd0 wwd0Var = zhi0Var.d;
        v340 v340Var = gki0Var.l;
        vu60Var.getClass();
        lgi0Var.getClass();
        hgi0Var.getClass();
        ekoVar.getClass();
        armVar.getClass();
        bnh0Var.getClass();
        lji0Var.getClass();
        rdd0Var.getClass();
        jki0Var.getClass();
        je5Var.getClass();
        this.a = zhi0Var;
        this.b = armVar;
        this.c = bnh0Var;
        this.d = gki0Var;
        this.e = lji0Var;
        this.f = rdd0Var;
        this.i = yhoVar;
        this.v = jki0Var;
        VirtualLobbyInput virtualLobbyInput = (VirtualLobbyInput) vu60Var.b("ARG_INPUT");
        wm20 wm20VarA = yhoVar.n.a(yhoVar, yho.o[13]);
        Boolean bool = Boolean.FALSE;
        cmi0 cmi0Var = new cmi0(wm20VarA.d(bool));
        jgi0 jgi0VarA = hgi0Var.a();
        et7 et7VarD = o8i0.d(this);
        lk50.b bVar = lk50.b.a;
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(jgi0VarA, et7VarD, kwd0Var, bVar);
        v340 v340VarE2 = e1i.e(lgi0Var.x(), o8i0.d(this), kwd0Var, bVar);
        this.w = v340VarE2;
        v340 v340VarE3 = e1i.e(lgi0Var.K(), o8i0.d(this), kwd0Var, bVar);
        this.y = v340VarE3;
        v340 v340VarE4 = e1i.e(lgi0Var.P(), o8i0.d(this), kwd0Var, bVar);
        v340 v340VarE5 = e1i.e(bm50.a(ekoVar.H()), o8i0.d(this), kwd0Var, bVar);
        this.z = new ku90<>();
        wwd0 wwd0VarA = xwd0.a(Intrinsics.g(virtualLobbyInput != null ? virtualLobbyInput.a : null, "mission") ? new vki0.b(false) : vki0.a.d);
        this.A = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(bool);
        this.B = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(null);
        this.C = wwd0VarA3;
        ami0 ami0Var = new ami0(new lyh[]{e1i.b(wwd0Var), kqoVar.d, wwd0VarA, gki0Var.l, gki0Var.n, lji0Var.c(), v340VarE4, je5Var.q(), je5Var.w(), wwd0VarA2, wwd0VarA3}, this);
        et7 et7VarD2 = o8i0.d(this);
        fqo.c.b bVar2 = fqo.c.b.a;
        fqo.a.C0579a c0579a = fqo.a.C0579a.a;
        StringUiText stringUiText = vch0.a;
        this.D = e1i.e(ami0Var, et7VarD2, kwd0Var, new mli0(new fqo(R.color.background_type2_primary, c0579a, new ResourceUiText(R.string.page_virtual__virtuals), bVar2), qgi0.b.a, null, false));
        lji0Var.a(o8i0.d(this));
        kzh.d(new g1i(r0i.f(jki0Var.b.getAccountInfoFlow(), new kki0(null, jki0Var)), new nki0(null, jki0Var)), o8i0.d(this));
        et7 et7VarD3 = o8i0.d(this);
        wwd0 wwd0VarB = lji0Var.b();
        wwd0VarB.getClass();
        kzh.d(new g1i(new xhi0(new lyh[]{v340VarE, v340VarE2, v340VarE3, v340VarE5, wwd0VarB, cmi0Var, zhi0Var.b.d}, zhi0Var), new yhi0(null, zhi0Var)), et7VarD3);
        kqoVar.a(o8i0.d(this), false);
        et7 et7VarD4 = o8i0.d(this);
        gki0Var.j = new nli0(null, this);
        kzh.d(new g1i(r1i.b(gki0Var.p, gki0Var.f, gki0Var.g, gki0Var.h, new yji0(null, gki0Var)), new zji0(null, gki0Var)), et7VarD4);
        kzh.d(new g1i(uzh.b(new cki0(new g1i(new n1i(uzh.b(new aki0(v340Var)), gki0Var.o, new dki0(3, null)), new eki0(null, gki0Var)))), new fki0(null, gki0Var)), et7VarD4);
        kzh.d(lgi0Var.a(pu0.c.a), o8i0.d(this));
        kzh.d(new g1i(new bmi0(wwd0VarA), new oli0(null, this)), o8i0.d(this));
        kzh.d(new g1i(uzh.b(new pli0(e1i.b(wwd0Var))), new qli0(null, this)), o8i0.d(this));
        kzh.d(new g1i(new dmi0(uzh.b(new fmi0(new emi0(v340Var)))), new gmi0(null, this)), o8i0.d(this));
    }

    public static boolean y1(fqo.c cVar) {
        fqo.c.C0581c c0581c = cVar instanceof fqo.c.C0581c ? (fqo.c.C0581c) cVar : null;
        return (c0581c != null ? c0581c.a : null) instanceof fqo.b.C0580b;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:293:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:93:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01cb  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void x1(kli0 kli0Var) {
        Set setE0;
        iki0 iki0Var;
        qcn<kwv> qcnVar;
        MainEntranceEntity mainEntranceEntity;
        List<MainEntranceItem> entityList;
        Object next;
        x66<rki0> x66Var;
        String updateRequiredAppVersion;
        String redirectUrl;
        BannerEntity bannerEntity;
        List<BannerItem> entityList2;
        Object next2;
        kli0Var.getClass();
        boolean z = kli0Var instanceof kli0.d;
        arm armVar = this.b;
        Boolean bool = null;
        if (z) {
            fgi0 fgi0Var = ((kli0.d) kli0Var).a;
            Object value = this.y.a.getValue();
            lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
            if (cVar == null || (bannerEntity = (BannerEntity) cVar.a) == null || (entityList2 = bannerEntity.getEntityList()) == null) {
                return;
            }
            Iterator<T> it = entityList2.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!Intrinsics.g(((BannerItem) next2).getItemName(), fgi0Var.a));
            BannerItem bannerItem = (BannerItem) next2;
            if (bannerItem == null) {
                return;
            }
            q0t q0tVar = q0t.a;
            String updateRequiredAppVersion2 = bannerItem.getUpdateRequiredAppVersion();
            armVar.getClass();
            q0tVar.getClass();
            if (!q0t.b(updateRequiredAppVersion2, "1.82.2")) {
                ej5.c(o8i0.d(this), null, null, new uli0(null, this), 3);
                return;
            }
            String redirectUrl2 = bannerItem.getRedirectUrl();
            if (redirectUrl2 != null) {
                if (redirectUrl2.length() == 0) {
                    redirectUrl2 = null;
                }
                if (redirectUrl2 == null) {
                    return;
                }
                ej5.c(o8i0.d(this), null, null, new vli0(this, redirectUrl2, null), 3);
                return;
            }
            return;
        }
        boolean z2 = kli0Var instanceof kli0.e;
        rdd0 rdd0Var = this.f;
        bnh0 bnh0Var = this.c;
        int i = 0;
        if (z2) {
            int i2 = ((kli0.e) kli0Var).a;
            if (i2 >= 0) {
                zhi0 zhi0Var = this.a;
                if (i2 < zhi0Var.d().size()) {
                    BroadcastConfig.Info info = zhi0Var.d().get(i2);
                    if (info.getDetail() == null) {
                        return;
                    }
                    q0t q0tVar2 = q0t.a;
                    BroadcastConfig.Info.Detail detail = info.getDetail();
                    String requireUpdateAndroidVersion = detail != null ? detail.getRequireUpdateAndroidVersion() : null;
                    armVar.getClass();
                    q0tVar2.getClass();
                    if (!q0t.b(requireUpdateAndroidVersion, "1.82.2")) {
                        ej5.c(o8i0.d(this), null, null, new wli0(null, this), 3);
                        return;
                    }
                    BroadcastConfig.Info.Detail detail2 = info.getDetail();
                    String redirectUrl3 = detail2 != null ? detail2.getRedirectUrl() : null;
                    if (redirectUrl3 == null) {
                        redirectUrl3 = "";
                    }
                    String strH = bnh0Var.h("/".concat(redirectUrl3));
                    sfi0 sfi0Var = new sfi0(0);
                    k00[] k00VarArr = (k00[]) a.c(k00.d).toArray(new k00[0]);
                    rdd0Var.a(sfi0Var, (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length));
                    ej5.c(o8i0.d(this), null, null, new xli0(this, strH, null), 3);
                    return;
                }
                return;
            }
            return;
        }
        if (kli0Var instanceof kli0.j) {
            chi0 chi0Var = ((kli0.j) kli0Var).a;
            Object value2 = this.w.a.getValue();
            lk50.c cVar2 = value2 instanceof lk50.c ? (lk50.c) value2 : null;
            if (cVar2 == null || (mainEntranceEntity = (MainEntranceEntity) cVar2.a) == null || (entityList = mainEntranceEntity.getEntityList()) == null) {
                return;
            }
            Iterator<T> it2 = entityList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Intrinsics.g(((MainEntranceItem) next).getItemName(), chi0Var.a));
            MainEntranceItem mainEntranceItem = (MainEntranceItem) next;
            if (mainEntranceItem == null) {
                return;
            }
            String entranceName = mainEntranceItem.getEntranceName();
            jki0 jki0Var = this.v;
            jki0Var.getClass();
            if (!Intrinsics.g(entranceName, "sporty_penalty")) {
                if (Intrinsics.g(entranceName, "sporty_legends")) {
                    x66Var = z76.y;
                }
                q0t q0tVar3 = q0t.a;
                updateRequiredAppVersion = mainEntranceItem.getUpdateRequiredAppVersion();
                armVar.getClass();
                q0tVar3.getClass();
                if (!q0t.b(updateRequiredAppVersion, "1.82.2")) {
                    ej5.c(o8i0.d(this), null, null, new yli0(null, this), 3);
                    return;
                }
                redirectUrl = mainEntranceItem.getRedirectUrl();
                if (redirectUrl != null) {
                    if (redirectUrl.length() == 0) {
                        redirectUrl = null;
                    }
                    if (redirectUrl == null) {
                        return;
                    }
                    tfi0 tfi0Var = new tfi0(chi0Var.b);
                    k00[] k00VarArr2 = (k00[]) a.c(k00.d).toArray(new k00[0]);
                    rdd0Var.a(tfi0Var, (k00[]) Arrays.copyOf(k00VarArr2, k00VarArr2.length));
                    rdd0Var.a(new a5o.g0(AnalyticsEvent.VIRTUAL_LOBBY_GAME_ENTRANCE, (Map<String, ? extends Object>) u.a("type", mainEntranceItem.getEntranceName())), k00.b, k00.a, k00.c);
                    ej5.c(o8i0.d(this), null, null, new zli0(this, redirectUrl, null), 3);
                    return;
                }
                return;
            }
            x66Var = z76.x;
            ej5.c(jki0Var.c, null, null, new oki0(jki0Var, x66Var, null), 3);
            q0t q0tVar4 = q0t.a;
            updateRequiredAppVersion = mainEntranceItem.getUpdateRequiredAppVersion();
            armVar.getClass();
            q0tVar4.getClass();
            if (!q0t.b(updateRequiredAppVersion, "1.82.2")) {
                ej5.c(o8i0.d(this), null, null, new yli0(null, this), 3);
                return;
            }
            redirectUrl = mainEntranceItem.getRedirectUrl();
            if (redirectUrl != null) {
                if (redirectUrl.length() == 0) {
                    redirectUrl = null;
                }
                if (redirectUrl == null) {
                    return;
                }
                tfi0 tfi0Var2 = new tfi0(chi0Var.b);
                k00[] k00VarArr3 = (k00[]) a.c(k00.d).toArray(new k00[0]);
                rdd0Var.a(tfi0Var2, (k00[]) Arrays.copyOf(k00VarArr3, k00VarArr3.length));
                rdd0Var.a(new a5o.g0(AnalyticsEvent.VIRTUAL_LOBBY_GAME_ENTRANCE, (Map<String, ? extends Object>) u.a("type", mainEntranceItem.getEntranceName())), k00.b, k00.a, k00.c);
                ej5.c(o8i0.d(this), null, null, new zli0(this, redirectUrl, null), 3);
                return;
            }
            return;
        }
        boolean z3 = kli0Var instanceof kli0.r;
        wwd0 wwd0Var = this.A;
        if (z3) {
            vki0 vki0Var = ((kli0.r) kli0Var).a;
            wwd0Var.getClass();
            wwd0Var.k(null, vki0Var);
            return;
        }
        boolean z4 = kli0Var instanceof kli0.c;
        lji0 lji0Var = this.e;
        if (z4) {
            kli0.c cVar3 = (kli0.c) kli0Var;
            if (!(cVar3 instanceof kli0.c.a)) {
                uhc.a();
                return;
            }
            kli0.c.a aVar = (kli0.c.a) cVar3;
            String str = aVar.a;
            if (StringsKt.U(str)) {
                return;
            }
            q0t q0tVar5 = q0t.a;
            String str2 = aVar.b;
            armVar.getClass();
            q0tVar5.getClass();
            if (!q0t.b(str2, "1.82.2")) {
                ej5.c(o8i0.d(this), null, null, new sli0(null, this), 3);
                return;
            }
            String strH2 = bnh0Var.h(str);
            lji0Var.e();
            ej5.c(o8i0.d(this), null, null, new tli0(this, strH2, null), 3);
            return;
        }
        if (kli0Var instanceof kli0.a) {
            kli0.a aVar2 = (kli0.a) kli0Var;
            if (aVar2.equals(kli0.a.b.a)) {
                lji0Var.d();
                ej5.c(o8i0.d(this), null, null, new rli0(null, this), 3);
                return;
            } else if (aVar2.equals(kli0.a.C0768a.a)) {
                lji0Var.e();
                return;
            } else {
                uhc.a();
                return;
            }
        }
        boolean zEquals = kli0Var.equals(kli0.b.a);
        ku90<lli0> ku90Var = this.z;
        if (zEquals) {
            ku90Var.a(lli0.a.a);
            return;
        }
        if (kli0Var.equals(kli0.u.a)) {
            ku90Var.a(lli0.i.a);
            return;
        }
        if (kli0Var.equals(kli0.q.a)) {
            ku90Var.a(lli0.d.a);
            return;
        }
        boolean zEquals2 = kli0Var.equals(kli0.s.a);
        v340 v340Var = this.D;
        if (zEquals2) {
            fqo.c cVar4 = ((mli0) v340Var.a.getValue()).a.d;
            fqo.c.C0581c c0581c = cVar4 instanceof fqo.c.C0581c ? (fqo.c.C0581c) cVar4 : null;
            if (c0581c != null) {
                fqo.b bVar = c0581c.a;
                fqo.b.C0580b c0580b = bVar instanceof fqo.b.C0580b ? (fqo.b.C0580b) bVar : null;
                Long lValueOf = c0580b != null ? Long.valueOf(c0580b.a) : null;
                if (lValueOf != null) {
                    ku90Var.a(new lli0.f(lValueOf.longValue()));
                    return;
                }
                return;
            }
            return;
        }
        boolean z5 = kli0Var instanceof kli0.n;
        gki0 gki0Var = this.d;
        if (z5) {
            gki0Var.b(new yqv.e(((kli0.n) kli0Var).a), o8i0.d(this));
            return;
        }
        if (kli0Var instanceof kli0.m) {
            gki0Var.b(new yqv.g(((kli0.m) kli0Var).a), o8i0.d(this));
            return;
        }
        if (kli0Var instanceof kli0.o) {
            kli0.o oVar = (kli0.o) kli0Var;
            String str3 = oVar.a;
            Bundle bundle = oVar.b;
            wae.a aVar3 = wae.b;
            Object bVar2 = (StringsKt.M(str3, "virtuals_lobby", false) || StringsKt.M(str3, "virtuals-lobby", false)) ? Intrinsics.g(Uri.parse(str3).getQueryParameter("tab"), "mission") ? new vki0.b(false) : vki0.a.d : null;
            if (bVar2 == null) {
                ku90Var.a(new lli0.g(str3, bundle));
                return;
            } else {
                if (y1(((mli0) v340Var.a.getValue()).a.d)) {
                    wwd0Var.getClass();
                    wwd0Var.k(null, bVar2);
                    return;
                }
                return;
            }
        }
        if (kli0Var instanceof kli0.l) {
            ku90Var.a(new lli0.b(((kli0.l) kli0Var).a));
            return;
        }
        if (kli0Var.equals(kli0.k.a)) {
            et7 et7VarD = o8i0.d(this);
            gki0Var.getClass();
            vji0 vji0Var = (vji0) gki0Var.k.getValue();
            vji0.d dVar = vji0Var instanceof vji0.d ? (vji0.d) vji0Var : null;
            if (dVar == null || (iki0Var = dVar.a) == null || (qcnVar = iki0Var.a) == null) {
                setE0 = null;
            } else {
                ArrayList arrayList = new ArrayList();
                for (kwv kwvVar : qcnVar) {
                    if (kwvVar.j) {
                        arrayList.add(kwvVar);
                    }
                }
                ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    arrayList2.add(Integer.valueOf(((kwv) obj).a));
                }
                setE0 = CollectionsKt.E0(arrayList2);
            }
            if (setE0 == null) {
                setE0 = t3g.a;
            }
            if (!setE0.isEmpty()) {
                ej5.c(et7VarD, null, null, new xji0(gki0Var, setE0, null), 3);
            }
            ku90Var.a(new lli0.b(wae.ME_GIFTS));
            return;
        }
        if (kli0Var.equals(kli0.t.a)) {
            ku90Var.a(lli0.c.a);
            return;
        }
        if (kli0Var.equals(kli0.p.a)) {
            z1();
            if (gki0Var.d.isLogin()) {
                gki0Var.i.a(Unit.a);
                return;
            }
            return;
        }
        boolean zEquals3 = kli0Var.equals(kli0.f.a);
        wwd0 wwd0Var2 = this.B;
        if (zEquals3) {
            qgi0 qgi0Var = ((mli0) v340Var.a.getValue()).b;
            qgi0.c cVar5 = qgi0Var instanceof qgi0.c ? (qgi0.c) qgi0Var : null;
            if (cVar5 == null) {
                return;
            }
            pgi0 pgi0Var = cVar5.a;
            if ((pgi0Var.a instanceof vki0.a) && pgi0Var.e) {
                Boolean bool2 = Boolean.TRUE;
                wwd0Var2.getClass();
                wwd0Var2.k(null, bool2);
                return;
            }
            return;
        }
        if (kli0Var.equals(kli0.h.a)) {
            Boolean bool3 = Boolean.TRUE;
            wwd0Var2.getClass();
            wwd0Var2.k(null, bool3);
            return;
        }
        if (kli0Var.equals(kli0.g.a)) {
            Boolean bool4 = Boolean.FALSE;
            wwd0Var2.getClass();
            wwd0Var2.k(null, bool4);
        } else {
            if (!(kli0Var instanceof kli0.i)) {
                uhc.a();
                return;
            }
            int iOrdinal = ((kli0.i) kli0Var).a.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    bool = Boolean.TRUE;
                } else {
                    if (iOrdinal != 2) {
                        uhc.a();
                        return;
                    }
                    bool = Boolean.FALSE;
                }
            }
            this.C.setValue(bool);
        }
    }

    public final void z1() {
        if (((mli0) this.D.a.getValue()).b instanceof qgi0.c) {
            vfi0 vfi0Var = new vfi0(0);
            k00[] k00VarArr = (k00[]) a.c(k00.d).toArray(new k00[0]);
            this.f.a(vfi0Var, (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length));
        }
    }
}
