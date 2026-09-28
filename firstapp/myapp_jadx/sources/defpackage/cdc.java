package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$replaceBookingCode$1", f = "CustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class cdc extends tje0 implements Function2<lk50<? extends Object>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bdc b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdc(bdc bdcVar, int i, v1b<? super cdc> v1bVar) {
        super(2, v1bVar);
        this.b = bdcVar;
        this.c = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cdc cdcVar = new cdc(this.b, this.c, v1bVar);
        cdcVar.a = obj;
        return cdcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Object> lk50Var, v1b<? super Unit> v1bVar) {
        return ((cdc) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        g8c aVar;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.c;
        bdc bdcVar = this.b;
        if (z) {
            bdcVar.I.a(h8c.d.a);
            bdcVar.y1(true);
        } else {
            boolean z2 = lk50Var instanceof lk50.a;
            int i = this.c;
            if (z2) {
                Throwable th = ((lk50.a) lk50Var).a;
                if (th instanceof SprThrowable) {
                    int d = ((SprThrowable) th).getD();
                    if (d == 4801) {
                        aVar = new g8c.a(th, false);
                    } else if (d != 19000) {
                        aVar = null;
                    } else {
                        aVar = new g8c.b(th);
                    }
                } else {
                    aVar = null;
                }
                wwd0 wwd0Var = bdcVar.y;
                wwd0 wwd0Var2 = bdcVar.y;
                jdc jdcVar = (jdc) wwd0Var.getValue();
                if (jdcVar instanceof jdc.a) {
                    jdc.a aVar2 = (jdc.a) jdcVar;
                    hdc hdcVar = aVar2.a;
                    List<gdc> list = hdcVar.a;
                    ArrayList arrayList = new ArrayList(l48.r(list, 10));
                    for (gdc gdcVarA : list) {
                        if (gdcVarA.a == i) {
                            gdcVarA = gdc.a(gdcVarA, false, false, aVar, 53247);
                        }
                        arrayList.add(gdcVarA);
                    }
                    jdc.a aVar3 = new jdc.a(hdc.a(hdcVar, arrayList, false, 30), aVar2.b);
                    wwd0Var2.getClass();
                    wwd0Var2.k(null, aVar3);
                } else if (jdcVar instanceof jdc.d) {
                    jdc.d dVar = (jdc.d) jdcVar;
                    hdc hdcVar2 = dVar.a;
                    List<gdc> list2 = hdcVar2.a;
                    ArrayList arrayList2 = new ArrayList(l48.r(list2, 10));
                    for (gdc gdcVarA2 : list2) {
                        if (gdcVarA2.a == i) {
                            gdcVarA2 = gdc.a(gdcVarA2, false, false, aVar, 53247);
                        }
                        arrayList2.add(gdcVarA2);
                    }
                    jdc.d dVar2 = new jdc.d(hdc.a(hdcVar2, arrayList2, false, 30), dVar.b);
                    wwd0Var2.getClass();
                    wwd0Var2.k(null, dVar2);
                }
            } else {
                if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                wwd0 wwd0Var3 = bdcVar.y;
                wwd0 wwd0Var4 = bdcVar.y;
                jdc jdcVar2 = (jdc) wwd0Var3.getValue();
                if (jdcVar2 instanceof jdc.a) {
                    jdc.a aVar4 = (jdc.a) jdcVar2;
                    hdc hdcVar3 = aVar4.a;
                    List<gdc> list3 = hdcVar3.a;
                    ArrayList arrayList3 = new ArrayList(l48.r(list3, 10));
                    for (gdc gdcVarA3 : list3) {
                        if (gdcVarA3.a == i) {
                            gdcVarA3 = gdc.a(gdcVarA3, false, true, null, 61439);
                        }
                        arrayList3.add(gdcVarA3);
                    }
                    jdc.a aVar5 = new jdc.a(hdc.a(hdcVar3, arrayList3, false, 30), aVar4.b);
                    wwd0Var4.getClass();
                    wwd0Var4.k(null, aVar5);
                } else if (jdcVar2 instanceof jdc.d) {
                    jdc.d dVar3 = (jdc.d) jdcVar2;
                    hdc hdcVar4 = dVar3.a;
                    List<gdc> list4 = hdcVar4.a;
                    ArrayList arrayList4 = new ArrayList(l48.r(list4, 10));
                    for (gdc gdcVarA4 : list4) {
                        if (gdcVarA4.a == i) {
                            gdcVarA4 = gdc.a(gdcVarA4, false, true, null, 61439);
                        }
                        arrayList4.add(gdcVarA4);
                    }
                    jdc.d dVar4 = new jdc.d(hdc.a(hdcVar4, arrayList4, false, 30), dVar3.b);
                    wwd0Var4.getClass();
                    wwd0Var4.k(null, dVar4);
                }
            }
        }
        return Unit.a;
    }
}
