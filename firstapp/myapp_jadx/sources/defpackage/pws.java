package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.AliasBookingCode;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pws {
    public final x2b a;
    public final x4k b;
    public final li7 c;
    public final vg40 d;
    public final jrm e;
    public final lrm f;
    public vtw<a> g;
    public lws h;

    public pws(x2b x2bVar, x4k x4kVar, li7 li7Var, vg40 vg40Var, jrm jrmVar, lrm lrmVar) {
        vg40Var.getClass();
        jrmVar.getClass();
        lrmVar.getClass();
        this.a = x2bVar;
        this.b = x4kVar;
        this.c = li7Var;
        this.d = vg40Var;
        this.e = jrmVar;
        this.f = lrmVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ee A[PHI: r10 r11 r12 r13
      0x00ee: PHI (r10v11 boolean) = (r10v9 boolean), (r10v12 boolean) binds: [B:43:0x00b1, B:48:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00ee: PHI (r11v9 java.util.List) = (r11v7 java.util.List), (r11v10 java.util.List) binds: [B:43:0x00b1, B:48:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00ee: PHI (r12v8 v4k) = (r12v6 v4k), (r12v12 v4k) binds: [B:43:0x00b1, B:48:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00ee: PHI (r13v4 v2b) = (r13v3 v2b), (r13v5 v2b) binds: [B:43:0x00b1, B:48:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:61:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c3, code lost:
    
        if (r14 == r1) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.vtw r10, java.lang.String r11, boolean r12, defpackage.lws r13, defpackage.x1b r14) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pws.a(vtw, java.lang.String, boolean, lws, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:103:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:107:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:109:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:114:0x020a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0213 A[EDGE_INSN: B:115:0x0213->B:82:0x0213 BREAK  A[LOOP:0: B:75:0x0191->B:80:0x01f8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[LOOP:1: B:88:0x0229->B:118:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x0167  */
    /* JADX WARN: Code duplicated, block: B:77:0x0197  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f8 A[LOOP:0: B:75:0x0191->B:80:0x01f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x022b  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:93:0x023f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0283  */
    /* JADX WARN: Code duplicated, block: B:99:0x028f  */
    public final Object b(v2b v2bVar, List list, Integer num, x1b x1bVar) {
        ows owsVar;
        String str;
        int i;
        boolean zD;
        int i2;
        lws lwsVar;
        int i3;
        v2b v2bVar2;
        List list2;
        String str2;
        Integer num2;
        boolean z;
        Integer num3;
        String str3;
        lws lwsVar2;
        boolean z2;
        lws lwsVar3;
        ArrayList arrayList;
        Iterator it;
        y5b y5bVar;
        int i4;
        boolean z3;
        int i5;
        String str4;
        ArrayList arrayList2;
        int size;
        int i6;
        Object obj;
        vtw<a> vtwVar;
        Object objF;
        y5b y5bVar2;
        Integer num4;
        lws lwsVar4;
        Selection selection;
        jrm jrmVar;
        Event event;
        Market market;
        Outcome outcome;
        List<Selection> list3;
        String bookingCode;
        Iterator it2;
        v2b v2bVar3;
        vtw<a> vtwVar2;
        AlertDialogCallbackType alertDialogCallbackType;
        if (x1bVar instanceof ows) {
            owsVar = (ows) x1bVar;
            int i7 = owsVar.z;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                owsVar.z = i7 - Integer.MIN_VALUE;
            } else {
                owsVar = new ows(this, x1bVar);
            }
        } else {
            owsVar = new ows(this, x1bVar);
        }
        ows owsVar2 = owsVar;
        Object obj2 = owsVar2.w;
        y5b y5bVar3 = y5b.a;
        int i8 = owsVar2.z;
        String str5 = "commonUiEventFlow";
        if (i8 != 0) {
            if (i8 == 1) {
                int i9 = owsVar2.i;
                z2 = owsVar2.v;
                i = owsVar2.f;
                lwsVar2 = owsVar2.e;
                str3 = owsVar2.d;
                num3 = owsVar2.c;
                list2 = owsVar2.b;
                v2bVar2 = owsVar2.a;
                uj50.b(obj2);
                i3 = i9;
                z = true;
            } else {
                if (i8 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lwsVar4 = owsVar2.e;
                num4 = owsVar2.c;
                uj50.b(obj2);
                str4 = "commonUiEventFlow";
            }
            alertDialogCallbackType = (AlertDialogCallbackType) obj2;
            alertDialogCallbackType.getClass();
            if (alertDialogCallbackType instanceof AlertDialogCallbackType.Positive) {
                this.e.r0(k53.REAL);
                this.e.b1();
                if (((br3) mmc.a(hp0.A, br3.class)).U().I) {
                    ((br3) mmc.a(hp0.A, br3.class)).U().i(oti.c().e());
                }
            }
            lwsVar3 = lwsVar4;
            num2 = num4;
            if (this.e.U().isEmpty()) {
                vtwVar2 = this.g;
                if (vtwVar2 == null) {
                    Intrinsics.n(str4);
                    throw null;
                }
                StringUiText stringUiText = vch0.a;
                b.j(vtwVar2, new ResourceUiText(R.string.page_load_code__all_selections_in_the_betslip_have_become_unavailable));
            }
            return new kws.d(num2, lwsVar3);
        }
        uj50.b(obj2);
        String bookingCode2 = v2bVar.getBookingCode();
        if (bookingCode2 != null) {
            this.d.e(bookingCode2);
        }
        if (v2bVar instanceof v2b.a) {
            v2b.a aVar = (v2b.a) v2bVar;
            if (aVar.c) {
                this.f.k(new AliasBookingCode(aVar.b, aVar.a, null, 4, null));
                str = aVar.a;
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        boolean zIsEmpty = this.e.U().isEmpty();
        i = !zIsEmpty ? 1 : 0;
        zD = this.e.D();
        if (zD) {
            i2 = 1;
        } else {
            lws lwsVar5 = this.h;
            if (lwsVar5 == null) {
                Intrinsics.n("loadCodeStrategy");
                throw null;
            }
            if ((lwsVar5 == lws.b || lwsVar5 == lws.c) && !zIsEmpty) {
                i2 = 1;
            } else {
                i2 = 0;
            }
        }
        if (zIsEmpty) {
            lwsVar = null;
        } else {
            lwsVar = i2 != 0 ? lws.b : lws.a;
        }
        if (i2 != 0) {
            if (!zD) {
                lws lwsVar6 = this.h;
                if (lwsVar6 == null) {
                    Intrinsics.n("loadCodeStrategy");
                    throw null;
                }
                if (lwsVar6 != lws.b) {
                    list2 = list;
                    v2bVar2 = v2bVar;
                    z = true;
                    i3 = i2;
                    num3 = num;
                }
                this.e.G(z);
                if (zD) {
                    this.e.r0(k53.REAL);
                }
                Integer num5 = num3;
                str2 = str;
                num2 = num5;
            }
            vtw<a> vtwVar3 = this.g;
            if (vtwVar3 == null) {
                Intrinsics.n("commonUiEventFlow");
                throw null;
            }
            StringUiText stringUiText2 = vch0.a;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.component_betslip__already_has_item_in_betslip_popup_title);
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.component_betslip__already_has_item_in_betslip_popup_content);
            ResourceUiText resourceUiText3 = new ResourceUiText(R.string.common_functions__ok);
            ResourceUiText resourceUiText4 = new ResourceUiText(R.string.common_functions__cancel);
            owsVar2.a = v2bVar;
            owsVar2.b = list;
            owsVar2.c = num;
            owsVar2.d = str;
            owsVar2.e = lwsVar;
            owsVar2.f = i;
            owsVar2.v = zD;
            owsVar2.i = i2;
            z = true;
            owsVar2.z = 1;
            i3 = i2;
            lws lwsVar7 = lwsVar;
            Object objF2 = b.f(vtwVar3, resourceUiText, null, resourceUiText2, resourceUiText3, resourceUiText4, null, null, owsVar2, 226);
            if (objF2 == y5bVar3) {
                return y5bVar3;
            }
            v2bVar2 = v2bVar;
            list2 = list;
            num3 = num;
            str3 = str;
            obj2 = objF2;
            lwsVar2 = lwsVar7;
            i = i;
            z2 = zD;
        } else {
            i3 = i2;
            v2bVar2 = v2bVar;
            list2 = list;
            str2 = str;
            num2 = num;
        }
        lwsVar3 = lwsVar;
        arrayList = new ArrayList();
        it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                y5bVar = y5bVar3;
                i4 = i;
                z3 = zD;
                i5 = i3;
                str4 = str5;
                arrayList2 = arrayList;
                break;
            }
            selection = (Selection) it.next();
            this.e.N0(selection.a, selection.b, selection.c, true, (14336 & 16) != 0 ? false : false, (14336 & 32) != 0 ? null : selection.d, (14336 & 64) != 0 ? k980.DEFAULT : null, (14336 & 128) != 0 ? false : false, (14336 & 256) != 0 ? false : false, (14336 & 512) != 0 ? false : false, (14336 & 1024) != 0 ? null : null, (14336 & 2048) != 0 ? false : false, (14336 & 4096) != 0 ? false : false, false);
            ArrayList arrayList3 = arrayList;
            jrmVar = this.e;
            event = selection.a;
            market = selection.b;
            int i10 = i;
            outcome = selection.c;
            boolean z4 = zD;
            list3 = selection.d;
            bookingCode = v2bVar2.getBookingCode();
            it2 = it;
            v2bVar3 = v2bVar2;
            i5 = i3;
            i4 = i10;
            str4 = str5;
            arrayList2 = arrayList3;
            z3 = z4;
            y5bVar = y5bVar3;
            if (jrmVar.a1(event, market, outcome, list3, bookingCode, str2) == 3) {
                break;
            }
            arrayList2.add(selection);
            zD = z3;
            i = i4;
            arrayList = arrayList2;
            str5 = str4;
            y5bVar3 = y5bVar;
            v2bVar2 = v2bVar3;
            i3 = i5;
            it = it2;
        }
        if (this.e.m0() && !arrayList2.isEmpty()) {
            size = arrayList2.size();
            i6 = 0;
            while (true) {
                if (i6 < size) {
                    obj = arrayList2.get(i6);
                    i6++;
                    if (!this.e.u1((Selection) obj)) {
                        vtwVar = this.g;
                        if (vtwVar != null) {
                            Intrinsics.n(str4);
                            throw null;
                        }
                        StringUiText stringUiText3 = vch0.a;
                        ResourceUiText resourceUiText5 = new ResourceUiText(R.string.component_betslip__confirm_switch_real_title);
                        ResourceUiText resourceUiText6 = new ResourceUiText(R.string.component_betslip__confirm_switch_real_content);
                        ResourceUiText resourceUiText7 = new ResourceUiText(R.string.common_functions__yes);
                        ResourceUiText resourceUiText8 = new ResourceUiText(R.string.common_functions__no);
                        owsVar2.a = null;
                        owsVar2.b = null;
                        owsVar2.c = num2;
                        owsVar2.d = null;
                        owsVar2.e = lwsVar3;
                        owsVar2.f = i4;
                        owsVar2.v = z3;
                        owsVar2.i = i5;
                        owsVar2.z = 2;
                        objF = b.f(vtwVar, resourceUiText5, null, resourceUiText6, resourceUiText7, resourceUiText8, null, null, owsVar2, 226);
                        y5bVar2 = y5bVar;
                        if (objF == y5bVar2) {
                            return y5bVar2;
                        }
                        num4 = num2;
                        obj2 = objF;
                        lwsVar4 = lwsVar3;
                        alertDialogCallbackType = (AlertDialogCallbackType) obj2;
                        alertDialogCallbackType.getClass();
                        if (alertDialogCallbackType instanceof AlertDialogCallbackType.Positive) {
                            this.e.r0(k53.REAL);
                            this.e.b1();
                            if (((br3) mmc.a(hp0.A, br3.class)).U().I) {
                                ((br3) mmc.a(hp0.A, br3.class)).U().i(oti.c().e());
                            }
                        }
                        lwsVar3 = lwsVar4;
                        num2 = num4;
                    }
                }
            }
        }
        if (this.e.U().isEmpty()) {
            vtwVar2 = this.g;
            if (vtwVar2 == null) {
                Intrinsics.n(str4);
                throw null;
            }
            StringUiText stringUiText4 = vch0.a;
            b.j(vtwVar2, new ResourceUiText(R.string.page_load_code__all_selections_in_the_betslip_have_become_unavailable));
        }
        return new kws.d(num2, lwsVar3);
        AlertDialogCallbackType alertDialogCallbackType2 = (AlertDialogCallbackType) obj2;
        alertDialogCallbackType2.getClass();
        if (alertDialogCallbackType2 instanceof AlertDialogCallbackType.Negative) {
            return kws.a.a;
        }
        lws lwsVar8 = lwsVar2;
        zD = z2;
        lwsVar = lwsVar8;
        str = str3;
        this.e.G(z);
        if (zD) {
            this.e.r0(k53.REAL);
        }
        Integer num6 = num3;
        str2 = str;
        num2 = num6;
        lwsVar3 = lwsVar;
        arrayList = new ArrayList();
        it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                y5bVar = y5bVar3;
                i4 = i;
                z3 = zD;
                i5 = i3;
                str4 = str5;
                arrayList2 = arrayList;
                break;
            }
            selection = (Selection) it.next();
            this.e.N0(selection.a, selection.b, selection.c, true, (14336 & 16) != 0 ? false : false, (14336 & 32) != 0 ? null : selection.d, (14336 & 64) != 0 ? k980.DEFAULT : null, (14336 & 128) != 0 ? false : false, (14336 & 256) != 0 ? false : false, (14336 & 512) != 0 ? false : false, (14336 & 1024) != 0 ? null : null, (14336 & 2048) != 0 ? false : false, (14336 & 4096) != 0 ? false : false, false);
            ArrayList arrayList4 = arrayList;
            jrmVar = this.e;
            event = selection.a;
            market = selection.b;
            int i11 = i;
            outcome = selection.c;
            boolean z5 = zD;
            list3 = selection.d;
            bookingCode = v2bVar2.getBookingCode();
            it2 = it;
            v2bVar3 = v2bVar2;
            i5 = i3;
            i4 = i11;
            str4 = str5;
            arrayList2 = arrayList4;
            z3 = z5;
            y5bVar = y5bVar3;
            if (jrmVar.a1(event, market, outcome, list3, bookingCode, str2) == 3) {
                break;
                break;
            }
            arrayList2.add(selection);
            zD = z3;
            i = i4;
            arrayList = arrayList2;
            str5 = str4;
            y5bVar3 = y5bVar;
            v2bVar2 = v2bVar3;
            i3 = i5;
            it = it2;
        }
        if (this.e.m0()) {
            size = arrayList2.size();
            i6 = 0;
            while (true) {
                if (i6 < size) {
                    obj = arrayList2.get(i6);
                    i6++;
                    if (!this.e.u1((Selection) obj)) {
                        vtwVar = this.g;
                        if (vtwVar != null) {
                            Intrinsics.n(str4);
                            throw null;
                        }
                        StringUiText stringUiText5 = vch0.a;
                        ResourceUiText resourceUiText9 = new ResourceUiText(R.string.component_betslip__confirm_switch_real_title);
                        ResourceUiText resourceUiText10 = new ResourceUiText(R.string.component_betslip__confirm_switch_real_content);
                        ResourceUiText resourceUiText11 = new ResourceUiText(R.string.common_functions__yes);
                        ResourceUiText resourceUiText12 = new ResourceUiText(R.string.common_functions__no);
                        owsVar2.a = null;
                        owsVar2.b = null;
                        owsVar2.c = num2;
                        owsVar2.d = null;
                        owsVar2.e = lwsVar3;
                        owsVar2.f = i4;
                        owsVar2.v = z3;
                        owsVar2.i = i5;
                        owsVar2.z = 2;
                        objF = b.f(vtwVar, resourceUiText9, null, resourceUiText10, resourceUiText11, resourceUiText12, null, null, owsVar2, 226);
                        y5bVar2 = y5bVar;
                        if (objF == y5bVar2) {
                            return y5bVar2;
                        }
                        num4 = num2;
                        obj2 = objF;
                        lwsVar4 = lwsVar3;
                        alertDialogCallbackType = (AlertDialogCallbackType) obj2;
                        alertDialogCallbackType.getClass();
                        if (alertDialogCallbackType instanceof AlertDialogCallbackType.Positive) {
                            this.e.r0(k53.REAL);
                            this.e.b1();
                            if (((br3) mmc.a(hp0.A, br3.class)).U().I) {
                                ((br3) mmc.a(hp0.A, br3.class)).U().i(oti.c().e());
                            }
                        }
                        lwsVar3 = lwsVar4;
                        num2 = num4;
                    }
                }
            }
        }
        if (this.e.U().isEmpty()) {
            vtwVar2 = this.g;
            if (vtwVar2 == null) {
                Intrinsics.n(str4);
                throw null;
            }
            StringUiText stringUiText6 = vch0.a;
            b.j(vtwVar2, new ResourceUiText(R.string.page_load_code__all_selections_in_the_betslip_have_become_unavailable));
        }
        return new kws.d(num2, lwsVar3);
    }
}
