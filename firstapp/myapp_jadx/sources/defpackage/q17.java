package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.loyalty.impl.challenge.presentation.model.ChallengeCardStatus;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q17 extends saj implements Function1<rw6, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(rw6 rw6Var) {
        iz6 next;
        g07 next2;
        Object value;
        Object value2;
        uf00<iz6> uf00VarX1;
        Object value3;
        Object value4;
        Object value5;
        iz6 next3;
        Object value6;
        Object value7;
        i37 i37Var;
        boolean z;
        Object value8;
        dua duaVar;
        rw6 rw6Var2 = rw6Var;
        rw6Var2.getClass();
        o37 o37Var = (o37) this.receiver;
        mgb0 mgb0Var = o37Var.e;
        wwd0 wwd0Var = o37Var.y;
        if (rw6Var2 instanceof rw6.b) {
            o37Var.z1(i37.a.a);
            if (mgb0Var.isLogin()) {
                ej5.c(o8i0.d(o37Var), null, null, new s37(o37Var, ((rw6.b) rw6Var2).a, null), 3);
            } else {
                o37Var.y1(xz6.b.a);
            }
        } else {
            boolean z2 = false;
            if (rw6Var2.equals(rw6.c.a)) {
                o37Var.z1(i37.o.a);
                uf00<iz6> uf00Var = o37Var.v;
                if (uf00Var != null && uf00Var.isEmpty()) {
                    z = false;
                    break;
                }
                Iterator<iz6> it = uf00Var.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (it.next().l == ChallengeCardStatus.Available) {
                        z = true;
                        break;
                    }
                }
                uf00<iz6> uf00Var2 = o37Var.v;
                if (uf00Var2 == null || !uf00Var2.isEmpty()) {
                    Iterator<iz6> it2 = uf00Var2.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().l == ChallengeCardStatus.Ongoing) {
                            z2 = true;
                            break;
                        }
                    }
                }
                if (!z || z2) {
                    o37Var.y1(xz6.a.a);
                } else {
                    do {
                        value8 = wwd0Var.getValue();
                        duaVar = dua.a;
                        StringUiText stringUiText = vch0.a;
                    } while (!wwd0Var.g(value8, r17.a((r17) value8, null, null, new mx6.a(0L, duaVar, new ResourceUiText(R.string.page_loyalty__challenge_sheet_dismiss_title), new ResourceUiText(R.string.page_loyalty__challenge_sheet_dismiss_body), new ResourceUiText(R.string.page_loyalty__challenge_sheet_dismiss_stay), new ResourceUiText(R.string.page_loyalty__challenge_sheet_dismiss_leave), uxs.ENABLE), null, 11)));
                    o37Var.z1(i37.r.a);
                    o37Var.z1(i37.t.a);
                }
            } else if (rw6Var2 instanceof rw6.i) {
                rw6.i iVar = (rw6.i) rw6Var2;
                int iOrdinal = iVar.b.ordinal();
                if (iOrdinal == 0) {
                    i37Var = i37.e.a;
                } else if (iOrdinal == 1) {
                    i37Var = i37.u.a;
                } else {
                    if (iOrdinal != 2) {
                        uhc.a();
                        return null;
                    }
                    i37Var = i37.w.a;
                }
                o37Var.z1(i37Var);
                if (mgb0Var.isLogin()) {
                    String str = iVar.a;
                    if (str != null) {
                        o37Var.y1(new xz6.c(str));
                    }
                } else {
                    o37Var.y1(xz6.b.a);
                }
            } else if (rw6Var2 instanceof rw6.d) {
                long j = ((rw6.d) rw6Var2).a;
                while (true) {
                    Object value9 = wwd0Var.getValue();
                    dua duaVar2 = dua.b;
                    StringUiText stringUiText2 = vch0.a;
                    long j2 = j;
                    if (wwd0Var.g(value9, r17.a((r17) value9, null, null, new mx6.a(j, duaVar2, new ResourceUiText(R.string.page_loyalty__challenge_sheet_cancel_title), new ResourceUiText(R.string.page_loyalty__challenge_sheet_cancel_body), new ResourceUiText(R.string.page_loyalty__challenge_sheet_cancel_confirm), new ResourceUiText(R.string.page_loyalty__challenge_sheet_cancel_back), uxs.ENABLE), null, 11))) {
                        break;
                    }
                    j = j2;
                }
                o37Var.z1(i37.h.a);
                o37Var.z1(i37.d.a);
            } else if (rw6Var2.equals(rw6.e.a)) {
                do {
                    value7 = wwd0Var.getValue();
                } while (!wwd0Var.g(value7, r17.a((r17) value7, null, null, mx6.d.a, null, 11)));
            } else if (rw6Var2 instanceof rw6.f) {
                long j3 = ((rw6.f) rw6Var2).a;
                Iterator<iz6> it3 = o37Var.v.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (next3.a != j3);
                iz6 iz6Var = next3;
                if (iz6Var != null) {
                    Object obj = ((r17) wwd0Var.getValue()).a;
                    if (((tz6.c) (obj instanceof tz6.c ? obj : null)) != null) {
                        if (iz6Var.o) {
                            o37Var.z1(i37.y.a);
                            long j4 = iz6Var.a;
                            String str2 = iz6Var.g;
                            int i = iz6Var.r;
                            Long l = iz6Var.d;
                            o37Var.y1(new xz6.d(j4, str2, i, l != null ? l.longValue() : 0L, iz6Var.e, iz6Var.h, iz6Var.l, iz6Var.m, iz6Var.i));
                        } else {
                            do {
                                value6 = wwd0Var.getValue();
                            } while (!wwd0Var.g(value6, r17.a((r17) value6, null, null, new mx6.b(iz6Var.p), null, 11)));
                            o37Var.z1(i37.x.a);
                        }
                    }
                }
            } else if (rw6Var2.equals(rw6.g.a)) {
                mx6 mx6Var = ((r17) wwd0Var.getValue()).c;
                mx6.a aVar = mx6Var instanceof mx6.a ? (mx6.a) mx6Var : null;
                if (aVar != null) {
                    int iOrdinal2 = aVar.b.ordinal();
                    if (iOrdinal2 == 0) {
                        o37Var.z1(i37.q.a);
                        do {
                            value5 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value5, r17.a((r17) value5, null, null, mx6.c.a, null, 11)));
                    } else {
                        if (iOrdinal2 != 1) {
                            uhc.a();
                            return null;
                        }
                        o37Var.z1(i37.g.a);
                        ej5.c(o8i0.d(o37Var), null, null, new p37(o37Var, aVar.a, null), 3);
                    }
                }
            } else if (rw6Var2.equals(rw6.a.a)) {
                mx6 mx6Var2 = ((r17) wwd0Var.getValue()).c;
                if (!(mx6Var2 instanceof mx6.a)) {
                    mx6Var2 = null;
                }
                mx6.a aVar2 = (mx6.a) mx6Var2;
                dua duaVar3 = aVar2 != null ? aVar2.b : null;
                int i2 = duaVar3 == null ? -1 : o37.c.b[duaVar3.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1) {
                        o37Var.z1(i37.s.a);
                    } else {
                        if (i2 != 2) {
                            uhc.a();
                            return null;
                        }
                        o37Var.z1(i37.c.a);
                    }
                }
                do {
                    value4 = wwd0Var.getValue();
                } while (!wwd0Var.g(value4, r17.a((r17) value4, null, null, mx6.c.a, null, 11)));
                if ((aVar2 != null ? aVar2.b : null) == dua.a) {
                    o37Var.y1(xz6.a.a);
                }
            } else if (rw6Var2.equals(rw6.h.a)) {
                vz6 vz6Var = ((r17) wwd0Var.getValue()).b;
                vz6.a aVar3 = vz6Var instanceof vz6.a ? (vz6.a) vz6Var : null;
                boolean z3 = aVar3 != null && aVar3.b;
                do {
                    value3 = wwd0Var.getValue();
                } while (!wwd0Var.g(value3, r17.a((r17) value3, null, vz6.b.a, mx6.c.a, null, 9)));
                if (z3) {
                    ej5.c(o8i0.d(o37Var), null, null, new r37(o37Var, null, null), 3);
                }
            } else if (rw6Var2 instanceof rw6.k) {
                f07 f07Var = ((rw6.k) rw6Var2).a;
                Object obj2 = ((r17) wwd0Var.getValue()).a;
                tz6.c cVar = (tz6.c) (obj2 instanceof tz6.c ? obj2 : null);
                if (cVar != null) {
                    uf00<g07> uf00Var3 = cVar.b;
                    ArrayList arrayList = new ArrayList(l48.r(uf00Var3, 10));
                    for (g07 g07Var : uf00Var3) {
                        arrayList.add(g07.a(g07Var, g07Var.a == f07Var));
                    }
                    uf00 uf00VarF = a4h.f(arrayList);
                    do {
                        value2 = wwd0Var.getValue();
                        uf00VarX1 = o37Var.x1(f07Var);
                        o37Var.d.getClass();
                    } while (!wwd0Var.g(value2, r17.a((r17) value2, tz6.c.a(cVar, uf00VarF, uf00VarX1, j37.e(f07Var), 17), null, null, null, 14)));
                }
            } else {
                if (!(rw6Var2 instanceof rw6.l)) {
                    uhc.a();
                    return null;
                }
                o37Var.z1(i37.i.a);
                long j5 = ((rw6.l) rw6Var2).a;
                tz6 tz6Var = ((r17) wwd0Var.getValue()).a;
                if (!(tz6Var instanceof tz6.c)) {
                    tz6Var = null;
                }
                tz6.c cVar2 = (tz6.c) tz6Var;
                if (cVar2 != null) {
                    Iterator<iz6> it4 = o37Var.v.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                    } while (next.a != j5);
                    iz6 iz6Var2 = next;
                    if (iz6Var2 != null && iz6Var2.n) {
                        z2 = true;
                    }
                    uf00<iz6> uf00Var4 = o37Var.v;
                    ArrayList arrayList2 = new ArrayList(l48.r(uf00Var4, 10));
                    for (iz6 iz6VarA : uf00Var4) {
                        if (iz6VarA.a == j5) {
                            iz6VarA = iz6.a(iz6VarA, null, null, null, !iz6VarA.n, false, 516095);
                        }
                        arrayList2.add(iz6VarA);
                    }
                    o37Var.v = a4h.f(arrayList2);
                    Iterator<g07> it5 = cVar2.b.iterator();
                    do {
                        if (!it5.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it5.next();
                    } while (!next2.d);
                    g07 g07Var2 = next2;
                    uf00<iz6> uf00VarX2 = o37Var.x1(g07Var2 != null ? g07Var2.a : f07.a);
                    do {
                        value = wwd0Var.getValue();
                    } while (!wwd0Var.g(value, r17.a((r17) value, tz6.c.a(cVar2, null, uf00VarX2, null, 27), null, null, null, 14)));
                    if (!z2) {
                        o37Var.z1(i37.v.a);
                    }
                }
            }
        }
        return Unit.a;
    }
}
