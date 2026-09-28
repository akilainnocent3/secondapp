package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class x2n {
    public final ztw<c4n> a;
    public final d4n b;

    public x2n(ztw ztwVar, b3n b3nVar, d4n d4nVar) {
        ztwVar.getClass();
        this.a = ztwVar;
        this.b = d4nVar;
    }

    public static void p(x2n x2nVar, ResourceUiText resourceUiText, ResourceUiText resourceUiText2, int i) {
        UiText uiText = resourceUiText2;
        if ((i & 2) != 0) {
            uiText = vch0.a;
        }
        x2nVar.o(resourceUiText, uiText, vch0.a);
    }

    public static a4n r(a4n a4nVar, ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            i3 += Integer.parseInt((String) obj);
        }
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            i4 += Integer.parseInt((String) obj2);
        }
        if (a4nVar instanceof a4n.b) {
            a4n.b bVar = (a4n.b) a4nVar;
            return a4n.b.a(bVar, bVar.h, i3, i4, arrayList, arrayList2, 3967);
        }
        if (!(a4nVar instanceof a4n.a)) {
            return a4nVar;
        }
        a4n.a aVar = (a4n.a) a4nVar;
        String str = aVar.a;
        String str2 = aVar.b;
        String str3 = aVar.c;
        String str4 = aVar.d;
        String str5 = aVar.e;
        String str6 = aVar.f;
        int i5 = aVar.g;
        List<String> list = aVar.h;
        List<String> list2 = aVar.i;
        qn4.b(str, str2, str3, str4, str5);
        str6.getClass();
        list.getClass();
        list2.getClass();
        return new a4n.a(str, str2, str3, str4, str5, str6, i5, list, list2, i3, i4, arrayList, arrayList2);
    }

    public final void a(int i, qcn<? extends a4n> qcnVar) {
        ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
        for (a4n a4nVarR : qcnVar) {
            if (a4nVarR instanceof a4n.b) {
                a4n.b bVar = (a4n.b) a4nVarR;
                List<String> list = bVar.j;
                List<String> list2 = bVar.k;
                if (list.size() > i) {
                    ArrayList arrayListC0 = CollectionsKt.C0(CollectionsKt.t0(list, i));
                    ArrayList arrayListC1 = CollectionsKt.C0(CollectionsKt.t0(list2, i));
                    if (arrayListC0.size() == i) {
                        arrayListC0.add("0");
                        arrayListC1.add("0");
                    }
                    a4nVarR = r(a4nVarR, arrayListC0, arrayListC1);
                }
            } else if (a4nVarR instanceof a4n.a) {
                a4n.a aVar = (a4n.a) a4nVarR;
                List<String> list3 = aVar.h;
                List<String> list4 = aVar.i;
                if (list3.size() > i) {
                    ArrayList arrayListC2 = CollectionsKt.C0(CollectionsKt.t0(list3, i));
                    ArrayList arrayListC3 = CollectionsKt.C0(CollectionsKt.t0(list4, i));
                    if (arrayListC2.size() == i) {
                        arrayListC2.add("0");
                        arrayListC3.add("0");
                    }
                    a4nVarR = r(a4nVarR, arrayListC2, arrayListC3);
                }
            }
            arrayList.add(a4nVarR);
        }
        s(a4h.b(arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) {
        p2n p2nVar;
        String str;
        UiText resourceUiText;
        UiText uiText;
        UiText uiText2;
        String str2;
        if (x1bVar instanceof p2n) {
            p2nVar = (p2n) x1bVar;
            int i = p2nVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                p2nVar.e = i - Integer.MIN_VALUE;
            } else {
                p2nVar = new p2n(this, x1bVar);
            }
        } else {
            p2nVar = new p2n(this, x1bVar);
        }
        Object obj = p2nVar.c;
        y5b y5bVar = y5b.a;
        int i2 = p2nVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                uiText = p2nVar.b;
                str = p2nVar.a;
                uj50.b(obj);
            } else {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uiText2 = p2nVar.b;
                str2 = p2nVar.a;
                uj50.b(obj);
            }
            m(uiText2, false);
            l(str2, false);
            return Unit.a;
        }
        uj50.b(obj);
        ztw<c4n> ztwVar = this.a;
        z2n z2nVar = ztwVar.getValue().b.k;
        d3n d3nVar = ztwVar.getValue().b.l;
        String str3 = ztwVar.getValue().b.g.a;
        str = z2nVar != null ? z2nVar.a : null;
        if (str == null) {
            str = "";
        }
        if (d3nVar != null) {
            int i3 = d3nVar.a;
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(i3, ay0.S(new Object[]{str3}));
        } else {
            resourceUiText = vch0.a;
        }
        l(str, true);
        p2nVar.a = str;
        p2nVar.b = resourceUiText;
        p2nVar.e = 1;
        if (hkd.b(4000L, p2nVar) != y5bVar) {
            uiText = resourceUiText;
        }
        return y5bVar;
        m(uiText, true);
        p2nVar.a = str;
        p2nVar.b = uiText;
        p2nVar.e = 2;
        if (hkd.b(2400L, p2nVar) != y5bVar) {
            uiText2 = uiText;
            str2 = str;
            m(uiText2, false);
            l(str2, false);
            return Unit.a;
        }
        return y5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:37:0x010e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x019b -> B:55:0x01a1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(int r29, int r30, defpackage.x1b r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x2n.c(int, int, x1b, java.lang.String, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(x1b x1bVar) {
        r2n r2nVar;
        x2n x2nVar;
        if (x1bVar instanceof r2n) {
            r2nVar = (r2n) x1bVar;
            int i = r2nVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r2nVar.c = i - Integer.MIN_VALUE;
            } else {
                r2nVar = new r2n(this, x1bVar);
            }
        } else {
            r2nVar = new r2n(this, x1bVar);
        }
        r2n r2nVar2 = r2nVar;
        Object obj = r2nVar2.a;
        y5b y5bVar = y5b.a;
        int i2 = r2nVar2.c;
        if (i2 == 0) {
            uj50.b(obj);
            n();
            t(true);
            r2nVar2.c = 1;
            x2nVar = this;
            if (x2nVar.i(400L, 750, 550, 1600L, r2nVar2) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            x2nVar = this;
        }
        x2nVar.t(false);
        x2nVar.b.invoke(y3n.b.a);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(ResourceUiText resourceUiText, x1b x1bVar) {
        s2n s2nVar;
        if (x1bVar instanceof s2n) {
            s2nVar = (s2n) x1bVar;
            int i = s2nVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                s2nVar.d = i - Integer.MIN_VALUE;
            } else {
                s2nVar = new s2n(this, x1bVar);
            }
        } else {
            s2nVar = new s2n(this, x1bVar);
        }
        Object obj = s2nVar.b;
        y5b y5bVar = y5b.a;
        int i2 = s2nVar.d;
        if (i2 == 0) {
            uj50.b(obj);
            q(resourceUiText, true);
            s2nVar.a = resourceUiText;
            s2nVar.d = 1;
            if (hkd.b(1200L, s2nVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            resourceUiText = s2nVar.a;
            uj50.b(obj);
        }
        q(resourceUiText, false);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object f(x1b x1bVar) {
        t2n t2nVar;
        x2n x2nVar;
        if (x1bVar instanceof t2n) {
            t2nVar = (t2n) x1bVar;
            int i = t2nVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t2nVar.c = i - Integer.MIN_VALUE;
            } else {
                t2nVar = new t2n(this, x1bVar);
            }
        } else {
            t2nVar = new t2n(this, x1bVar);
        }
        t2n t2nVar2 = t2nVar;
        Object obj = t2nVar2.a;
        y5b y5bVar = y5b.a;
        int i2 = t2nVar2.c;
        if (i2 == 0) {
            uj50.b(obj);
            StringUiText stringUiText = vch0.a;
            p(this, new ResourceUiText(R.string.page_instant_virtual__tip_off), null, 6);
            t(true);
            t2nVar2.c = 1;
            x2nVar = this;
            if (x2nVar.i(400L, 750, 550, 1600L, t2nVar2) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            x2nVar = this;
        }
        x2nVar.t(false);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ff A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(int i, int i2, int i3, qcn qcnVar, x1b x1bVar) {
        u2n u2nVar;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Object objB;
        int i9 = i3;
        qcn qcnVar2 = qcnVar;
        if (x1bVar instanceof u2n) {
            u2nVar = (u2n) x1bVar;
            int i10 = u2nVar.w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                u2nVar.w = i10 - Integer.MIN_VALUE;
            } else {
                u2nVar = new u2n(this, x1bVar);
            }
        } else {
            u2nVar = new u2n(this, x1bVar);
        }
        u2n u2nVar2 = u2nVar;
        Object obj = u2nVar2.i;
        y5b y5bVar = y5b.a;
        int i11 = u2nVar2.w;
        if (i11 == 0) {
            uj50.b(obj);
            int i12 = i - i2;
            u(i + 1);
            StringUiText stringUiText = vch0.a;
            p(this, new ResourceUiText(R.string.page_instant_virtual__playing), new ResourceUiText(R.string.page_instant_virtual__overtime), 4);
            int i13 = i12 < i9 ? 1 : 0;
            a(i, qcnVar2);
            if (i13 == 0) {
                return Unit.a;
            }
            u2nVar2.f = qcnVar2;
            u2nVar2.a = i;
            u2nVar2.b = i2;
            u2nVar2.c = i9;
            u2nVar2.d = i12;
            u2nVar2.e = i13;
            u2nVar2.w = 1;
            int i14 = i13;
            if (i(0L, 400, 400, 1000L, u2nVar2) != y5bVar) {
                i4 = i;
                i5 = i2;
                i6 = i12;
                i7 = i14;
            }
            return y5bVar;
        }
        if (i11 == 1) {
            i7 = u2nVar2.e;
            i6 = u2nVar2.d;
            int i15 = u2nVar2.c;
            i5 = u2nVar2.b;
            i4 = u2nVar2.a;
            qcn qcnVar3 = u2nVar2.f;
            uj50.b(obj);
            i9 = i15;
            qcnVar2 = qcnVar3;
        } else {
            if (i11 != 2) {
                if (i11 == 3) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i7 = u2nVar2.e;
            i6 = u2nVar2.d;
            i8 = u2nVar2.c;
            i5 = u2nVar2.b;
            i4 = u2nVar2.a;
            uj50.b(obj);
        }
        u2nVar2.f = null;
        u2nVar2.a = i4;
        u2nVar2.b = i5;
        u2nVar2.c = i8;
        u2nVar2.d = i6;
        u2nVar2.e = i7;
        u2nVar2.w = 3;
        objB = b(u2nVar2);
        if (objB != y5bVar) {
            return y5bVar;
        }
        return objB;
        j(i4, this.a.getValue().b.h.b);
        k(i4, qcnVar2);
        StringUiText stringUiText2 = vch0.a;
        ResourceUiText resourceUiText = new ResourceUiText(R.string.page_instant_virtual__overtime_highlight);
        u2nVar2.f = null;
        u2nVar2.a = i4;
        u2nVar2.b = i5;
        u2nVar2.c = i9;
        u2nVar2.d = i6;
        u2nVar2.e = i7;
        u2nVar2.w = 2;
        if (e(resourceUiText, u2nVar2) != y5bVar) {
            i8 = i9;
            u2nVar2.f = null;
            u2nVar2.a = i4;
            u2nVar2.b = i5;
            u2nVar2.c = i8;
            u2nVar2.d = i6;
            u2nVar2.e = i7;
            u2nVar2.w = 3;
            objB = b(u2nVar2);
            if (objB != y5bVar) {
                return objB;
            }
        }
        return y5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x01ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object h(int i, qcn qcnVar, x1b x1bVar) {
        v2n v2nVar;
        ResourceUiText resourceUiText;
        qcn<a4n> qcnVar2;
        int i2;
        ztw<c4n> ztwVar;
        c4n value;
        c4n c4nVar;
        f3n f3nVar;
        Object objB;
        if (x1bVar instanceof v2n) {
            v2nVar = (v2n) x1bVar;
            int i3 = v2nVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v2nVar.e = i3 - Integer.MIN_VALUE;
            } else {
                v2nVar = new v2n(this, x1bVar);
            }
        } else {
            v2nVar = new v2n(this, x1bVar);
        }
        v2n v2nVar2 = v2nVar;
        Object obj = v2nVar2.c;
        y5b y5bVar = y5b.a;
        int i4 = v2nVar2.e;
        if (i4 == 0) {
            uj50.b(obj);
            StringUiText stringUiText = vch0.a;
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.page_instant_virtual__playing);
            int i5 = i + 1;
            if (i5 == 1) {
                resourceUiText = new ResourceUiText(R.string.common_functions__1st);
            } else if (i5 == 2) {
                resourceUiText = new ResourceUiText(R.string.common_functions__2nd);
            } else {
                resourceUiText = (3 > i5 || i5 >= 5) ? new ResourceUiText(R.string.page_instant_virtual__overtime) : new ResourceUiText(R.string.common_functions__vth, ay0.S(new Object[]{Integer.valueOf(i5)}));
            }
            o(resourceUiText2, resourceUiText, new ResourceUiText(R.string.page_instant_virtual__quarter));
            u(i5);
            qcnVar2 = qcnVar;
            v2nVar2.b = qcnVar2;
            v2nVar2.a = i;
            v2nVar2.e = 1;
            if (i(0L, 400, 400, 1000L, v2nVar2) != y5bVar) {
                i2 = i;
            }
            return y5bVar;
        }
        if (i4 == 1) {
            i2 = v2nVar2.a;
            qcn qcnVar3 = v2nVar2.b;
            uj50.b(obj);
            qcnVar2 = qcnVar3;
        } else {
            if (i4 != 2) {
                if (i4 == 3) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = v2nVar2.a;
            uj50.b(obj);
        }
        v2nVar2.b = null;
        v2nVar2.a = i2;
        v2nVar2.e = 3;
        objB = b(v2nVar2);
        if (objB != y5bVar) {
            return y5bVar;
        }
        return objB;
        ArrayList arrayList = new ArrayList(l48.r(qcnVar2, 10));
        for (a4n a4nVarR : qcnVar2) {
            if (a4nVarR instanceof a4n.b) {
                a4n.b bVar = (a4n.b) a4nVarR;
                int i6 = i2 + 1;
                ArrayList arrayListC0 = CollectionsKt.C0(CollectionsKt.t0(bVar.j, i6));
                ArrayList arrayListC1 = CollectionsKt.C0(CollectionsKt.t0(bVar.k, i6));
                while (arrayListC0.size() < 4) {
                    arrayListC0.add("0");
                    arrayListC1.add("0");
                }
                a4nVarR = r(a4nVarR, arrayListC0, arrayListC1);
            } else if (a4nVarR instanceof a4n.a) {
                a4n.a aVar = (a4n.a) a4nVarR;
                int i7 = i2 + 1;
                ArrayList arrayListC2 = CollectionsKt.C0(CollectionsKt.t0(aVar.h, i7));
                ArrayList arrayListC3 = CollectionsKt.C0(CollectionsKt.t0(aVar.i, i7));
                while (arrayListC2.size() < 4) {
                    arrayListC2.add("0");
                    arrayListC3.add("0");
                }
                a4nVarR = r(a4nVarR, arrayListC2, arrayListC3);
            }
            arrayList.add(a4nVarR);
        }
        s(a4h.b(arrayList));
        do {
            ztwVar = this.a;
            value = ztwVar.getValue();
            c4nVar = value;
            f3nVar = c4nVar.b;
        } while (!ztwVar.g(value, new c4n(c4nVar.a, f3n.a(f3nVar, f3n.d.a(f3nVar.a, null, null, null, true, 23), null, null, null, null, null, null, null, null, null, null, null, null, null, 16382))));
        k(i2, qcnVar2);
        StringUiText stringUiText2 = vch0.a;
        ResourceUiText resourceUiText3 = new ResourceUiText(R.string.page_instant_virtual__quarter_highlight);
        v2nVar2.b = null;
        v2nVar2.a = i2;
        v2nVar2.e = 2;
        if (e(resourceUiText3, v2nVar2) != y5bVar) {
            v2nVar2.b = null;
            v2nVar2.a = i2;
            v2nVar2.e = 3;
            objB = b(v2nVar2);
            if (objB != y5bVar) {
                return objB;
            }
        }
        return y5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(long j, int i, int i2, long j2, x1b x1bVar) {
        w2n w2nVar;
        int i3;
        int i4;
        if (x1bVar instanceof w2n) {
            w2nVar = (w2n) x1bVar;
            int i5 = w2nVar.i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                w2nVar.i = i5 - Integer.MIN_VALUE;
            } else {
                w2nVar = new w2n(this, x1bVar);
            }
        } else {
            w2nVar = new w2n(this, x1bVar);
        }
        Object obj = w2nVar.e;
        y5b y5bVar = y5b.a;
        int i6 = w2nVar.i;
        if (i6 == 0) {
            uj50.b(obj);
            if (j > 0) {
                w2nVar.a = j;
                w2nVar.c = i;
                w2nVar.d = i2;
                w2nVar.b = j2;
                w2nVar.i = 1;
                if (hkd.b(j, w2nVar) != y5bVar) {
                }
            }
            return y5bVar;
        }
        if (i6 == 1) {
            j2 = w2nVar.b;
            i2 = w2nVar.d;
            i = w2nVar.c;
            j = w2nVar.a;
            uj50.b(obj);
        } else {
            if (i6 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i4 = w2nVar.d;
            i3 = w2nVar.c;
            uj50.b(obj);
        }
        v(i3, i4, false);
        return Unit.a;
        v(i, i2, true);
        w2nVar.a = j;
        w2nVar.c = i;
        w2nVar.d = i2;
        w2nVar.b = j2;
        w2nVar.i = 2;
        if (hkd.b(j2, w2nVar) != y5bVar) {
            i3 = i;
            i4 = i2;
            v(i3, i4, false);
            return Unit.a;
        }
        return y5bVar;
    }

    public final void j(int i, qcn<? extends a4n> qcnVar) {
        ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
        for (a4n a4nVarR : qcnVar) {
            if (a4nVarR instanceof a4n.b) {
                a4n.b bVar = (a4n.b) a4nVarR;
                List<String> list = bVar.j;
                List<String> list2 = bVar.k;
                if (list.size() > i) {
                    int i2 = i + 1;
                    a4nVarR = r(a4nVarR, CollectionsKt.C0(CollectionsKt.t0(list, i2)), CollectionsKt.C0(CollectionsKt.t0(list2, i2)));
                }
            } else if (a4nVarR instanceof a4n.a) {
                a4n.a aVar = (a4n.a) a4nVarR;
                List<String> list3 = aVar.h;
                List<String> list4 = aVar.i;
                if (list3.size() > i) {
                    int i3 = i + 1;
                    a4nVarR = r(a4nVarR, CollectionsKt.C0(CollectionsKt.t0(list3, i3)), CollectionsKt.C0(CollectionsKt.t0(list4, i3)));
                }
            }
            arrayList.add(a4nVarR);
        }
        s(a4h.b(arrayList));
    }

    public final void k(int i, qcn<? extends a4n> qcnVar) {
        n3n n3nVar;
        z2n z2nVar;
        d3n d3nVar;
        boolean zI;
        ArrayList arrayList = new ArrayList();
        for (a4n a4nVar : qcnVar) {
            if (a4nVar instanceof a4n.b) {
                arrayList.add(a4nVar);
            }
        }
        a4n.b bVar = (a4n.b) CollectionsKt.firstOrNull(arrayList);
        if (bVar == null) {
            return;
        }
        String str = bVar.e;
        String str2 = bVar.c;
        List<String> list = bVar.j;
        if (i < 0 || i >= list.size()) {
            n3nVar = null;
        } else {
            Integer intOrNull = StringsKt.toIntOrNull(list.get(i));
            int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
            Integer intOrNull2 = StringsKt.toIntOrNull(bVar.k.get(i));
            int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
            if (iIntValue > iIntValue2) {
                zI = true;
            } else if (iIntValue2 > iIntValue) {
                zI = false;
            } else {
                lx30.INSTANCE.getClass();
                zI = lx30.b.i();
            }
            String str3 = zI ? str2 : str;
            c3n c3nVar = zI ? c3n.a : c3n.b;
            if (!zI) {
                iIntValue = iIntValue2;
            }
            n3nVar = new n3n(str3, c3nVar, iIntValue);
        }
        if (n3nVar == null) {
            return;
        }
        c3n c3nVar2 = n3nVar.b;
        String str4 = n3nVar.a;
        int iMax = Math.max(0, list.size() - 4);
        int i2 = n3nVar.c;
        ztw<c4n> ztwVar = this.a;
        ucn<String> ucnVar = ztwVar.getValue().b.m;
        ucn<String> ucnVar2 = ztwVar.getValue().b.n;
        ucnVar.getClass();
        ucnVar2.getClass();
        k3n k3nVar = i < 2 ? k3n.a : i < 4 ? k3n.b : k3n.c;
        w3n w3nVar = i2 < 3 ? w3n.a : null;
        boolean z = k3nVar == k3n.c && iMax > 0;
        ArrayList arrayListA = (!z || (z && i == iMax + 3)) ? a3n.a(c3nVar2, k3nVar, w3nVar) : a3n.a(null, k3nVar, w3nVar);
        if (arrayListA.isEmpty()) {
            if (w3nVar == null) {
                w3nVar = w3n.a;
            }
            z2nVar = new z2n("", c3nVar2, w3nVar, k3nVar);
        } else {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayListA.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayListA.get(i3);
                i3++;
                if (!ucnVar.contains((String) ((z2n) obj).e.getValue())) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayListA = arrayList2;
            }
            z2nVar = (z2n) CollectionsKt.k0(arrayListA, lx30.INSTANCE);
        }
        w3n w3nVar2 = z2nVar.c;
        List<d3n> list2 = e3n.a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (((d3n) obj2).b == w3nVar2) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.isEmpty()) {
            d3nVar = null;
        } else {
            ArrayList arrayList4 = new ArrayList();
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj3 = arrayList3.get(i4);
                i4++;
                if (!ucnVar2.contains(((d3n) obj3).a())) {
                    arrayList4.add(obj3);
                }
            }
            if (!arrayList4.isEmpty()) {
                arrayList3 = arrayList4;
            }
            d3nVar = (d3n) CollectionsKt.k0(arrayList3, lx30.INSTANCE);
        }
        LinkedHashSet linkedHashSetF = yi80.f(ucnVar, (String) z2nVar.e.getValue());
        String strA = d3nVar != null ? d3nVar.a() : null;
        LinkedHashSet linkedHashSetF2 = yi80.f(ucnVar2, strA != null ? strA : "");
        c3n c3nVar3 = z2nVar.b;
        if (c3nVar2 != c3nVar3) {
            if (c3nVar3 != c3n.b) {
                str = null;
            }
            if (str != null) {
                str2 = str;
            }
            str4 = str2;
        }
        while (true) {
            c4n value = ztwVar.getValue();
            c4n c4nVar = value;
            f3n f3nVar = c4nVar.b;
            z2n z2nVar2 = z2nVar;
            if (ztwVar.g(value, new c4n(c4nVar.a, f3n.a(f3nVar, null, null, null, null, null, null, f3n.b.a(f3nVar.g, str4, null, false, 6), null, null, null, z2nVar2, d3nVar, a4h.e(linkedHashSetF), a4h.e(linkedHashSetF2), 959)))) {
                return;
            } else {
                z2nVar = z2nVar2;
            }
        }
    }

    public final void l(String str, boolean z) {
        ztw<c4n> ztwVar;
        c4n value;
        c4n c4nVar;
        f3n f3nVar;
        do {
            ztwVar = this.a;
            value = ztwVar.getValue();
            c4nVar = value;
            f3nVar = c4nVar.b;
            f3nVar.f.getClass();
            str.getClass();
        } while (!ztwVar.g(value, new c4n(c4nVar.a, f3n.a(f3nVar, null, null, null, null, null, new f3n.a(z, str), null, null, null, null, null, null, null, null, 16351))));
    }

    public final void m(UiText uiText, boolean z) {
        ztw<c4n> ztwVar;
        c4n value;
        c4n c4nVar;
        f3n f3nVar;
        do {
            ztwVar = this.a;
            value = ztwVar.getValue();
            c4nVar = value;
            f3nVar = c4nVar.b;
        } while (!ztwVar.g(value, new c4n(c4nVar.a, f3n.a(f3nVar, null, null, null, null, null, null, f3n.b.a(f3nVar.g, null, uiText, z, 1), null, null, null, null, null, null, null, 16319))));
    }

    public final void n() {
        ztw<c4n> ztwVar;
        c4n value;
        c4n c4nVar;
        f3n f3nVar;
        do {
            ztwVar = this.a;
            value = ztwVar.getValue();
            c4nVar = value;
            f3nVar = c4nVar.b;
            f3nVar.i.getClass();
        } while (!ztwVar.g(value, new c4n(c4nVar.a, f3n.a(f3nVar, null, null, null, null, null, null, null, null, new f3n.c(true), null, null, null, null, null, 16127))));
    }

    public final void o(ResourceUiText resourceUiText, UiText uiText, UiText uiText2) {
        ztw<c4n> ztwVar;
        c4n value;
        c4n c4nVar;
        f3n f3nVar;
        do {
            ztwVar = this.a;
            value = ztwVar.getValue();
            c4nVar = value;
            f3nVar = c4nVar.b;
        } while (!ztwVar.g(value, new c4n(c4nVar.a, f3n.a(f3nVar, f3n.d.a(f3nVar.a, resourceUiText, uiText, uiText2, false, 16), null, null, null, null, null, null, null, null, null, null, null, null, null, 16382))));
    }

    public final void q(UiText uiText, boolean z) {
        ztw<c4n> ztwVar;
        c4n value;
        c4n c4nVar;
        f3n f3nVar;
        do {
            ztwVar = this.a;
            value = ztwVar.getValue();
            c4nVar = value;
            f3nVar = c4nVar.b;
            f3nVar.e.getClass();
            uiText.getClass();
        } while (!ztwVar.g(value, new c4n(c4nVar.a, f3n.a(f3nVar, null, null, null, null, new f3n.e(uiText, z), null, null, null, null, null, null, null, null, null, 16367))));
    }

    public final void s(qcn<? extends a4n> qcnVar) {
        ztw<c4n> ztwVar;
        c4n value;
        c4n c4nVar;
        f3n f3nVar;
        do {
            ztwVar = this.a;
            value = ztwVar.getValue();
            c4nVar = value;
            f3nVar = c4nVar.b;
            f3nVar.h.getClass();
            qcnVar.getClass();
        } while (!ztwVar.g(value, new c4n(c4nVar.a, f3n.a(f3nVar, null, null, null, null, null, null, null, new f3n.h((qcn) qcnVar, true), null, null, null, null, null, null, 16255))));
    }

    public final void t(boolean z) {
        ztw<c4n> ztwVar;
        c4n value;
        c4n c4nVar;
        f3n f3nVar;
        do {
            ztwVar = this.a;
            value = ztwVar.getValue();
            c4nVar = value;
            f3nVar = c4nVar.b;
            f3nVar.b.getClass();
        } while (!ztwVar.g(value, new c4n(c4nVar.a, f3n.a(f3nVar, null, new f3n.f(z, "https://s.sporty.net/cms/ib_openning_3f52f30afe.json"), null, null, null, null, null, null, null, null, null, null, null, null, 16381))));
    }

    public final void u(int i) {
        ztw<c4n> ztwVar;
        c4n value;
        c4n c4nVar;
        f3n f3nVar;
        f3n.g gVar;
        k3n k3nVar;
        do {
            ztwVar = this.a;
            value = ztwVar.getValue();
            c4nVar = value;
            f3nVar = c4nVar.b;
            f3nVar.d.getClass();
            gVar = new f3n.g(i, 1000L);
            if (i <= 2) {
                k3nVar = k3n.a;
            } else {
                k3nVar = i <= 4 ? k3n.b : k3n.c;
            }
        } while (!ztwVar.g(value, new c4n(c4nVar.a, f3n.a(f3nVar, null, null, null, gVar, null, null, null, null, null, k3nVar, null, null, null, null, 15863))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v(int i, int i2, boolean z) {
        ztw<c4n> ztwVar;
        c4n value;
        c4n c4nVar;
        f3n.i iVar;
        String str;
        String str2;
        Pair pair;
        Integer numValueOf = Integer.valueOf(R.color.bg_brand_main_primary);
        Integer numValueOf2 = Integer.valueOf(R.color.bg_brand_sub_primary_d_base);
        do {
            ztwVar = this.a;
            value = ztwVar.getValue();
            c4nVar = value;
            f3n f3nVar = c4nVar.b;
            iVar = f3nVar.c;
            k3n k3nVar = f3nVar.j;
            k3nVar.getClass();
            boolean z2 = k3nVar == k3n.a;
            Pair pair2 = z2 ? new Pair(iVar.a, iVar.b) : new Pair(iVar.b, iVar.a);
            str = (String) pair2.a;
            str2 = (String) pair2.b;
            pair = z2 ? new Pair(numValueOf2, numValueOf) : new Pair(numValueOf, numValueOf2);
        } while (!ztwVar.g(value, new c4n(c4nVar.a, f3n.a(c4nVar.b, null, null, f3n.i.a(iVar, null, null, str, str2, ((Number) pair.a).intValue(), ((Number) pair.b).intValue(), i, i2, z, 3), null, null, null, null, null, null, null, null, null, null, null, 16379))));
    }
}
