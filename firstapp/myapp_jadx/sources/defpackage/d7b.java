package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.data.PreMatchEventData;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d7b implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d7b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00a0 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<T> list;
        Object obj2;
        PreMatchEventData preMatchEventData;
        ArrayList arrayListA;
        int size;
        int iIndexOf;
        Integer numValueOf;
        int iIntValue;
        tf20 tf20Var;
        Market market;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                ((osw) obj3).k((int) (urrVar.a() >> 32));
                break;
            default:
                PreMatchSportActivity preMatchSportActivity = (PreMatchSportActivity) obj3;
                e880 e880Var = (e880) obj;
                LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
                if (e880Var != null) {
                    ej20 ej20VarH1 = preMatchSportActivity.H1();
                    ej20VarH1.getClass();
                    Selection selection = e880Var.a;
                    String str = selection.a.eventId;
                    Market market2 = selection.b;
                    tf20 tf20Var2 = ej20VarH1.r;
                    if (tf20Var2 != null && (list = tf20Var2.a.f) != 0) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            if (obj4 instanceof PreMatchEventData) {
                                arrayList.add(obj4);
                            }
                        }
                        int size2 = arrayList.size();
                        int i2 = 0;
                        int i3 = 0;
                        do {
                            if (i3 < size2) {
                                obj2 = arrayList.get(i3);
                                i3++;
                            } else {
                                obj2 = null;
                            }
                            preMatchEventData = (PreMatchEventData) obj2;
                            if (preMatchEventData != null) {
                                List<Market> list2 = preMatchEventData.getEvent().markets;
                                arrayListA = kw5.a(list2);
                                for (Object obj5 : list2) {
                                    market = (Market) obj5;
                                    if (!Intrinsics.g(market.id, market2.id) && Intrinsics.g(market.specifier, market2.specifier)) {
                                        arrayListA.add(obj5);
                                    }
                                }
                                size = arrayListA.size();
                                while (i2 < size) {
                                    Object obj6 = arrayListA.get(i2);
                                    i2++;
                                    ((Market) obj6).update(e880Var.b);
                                    iIndexOf = list.indexOf(preMatchEventData);
                                    numValueOf = Integer.valueOf(iIndexOf);
                                    if (iIndexOf < 0) {
                                        numValueOf = null;
                                    }
                                    if (numValueOf != null) {
                                        iIntValue = numValueOf.intValue();
                                        tf20Var = ej20VarH1.r;
                                        if (tf20Var != null) {
                                            tf20Var.notifyItemChanged(iIntValue);
                                        }
                                    }
                                }
                            }
                        } while (!Intrinsics.g(str, ((PreMatchEventData) obj2).getEvent().eventId));
                        preMatchEventData = (PreMatchEventData) obj2;
                        if (preMatchEventData != null) {
                            List<Market> list3 = preMatchEventData.getEvent().markets;
                            arrayListA = kw5.a(list3);
                            while (r1.hasNext()) {
                                market = (Market) obj5;
                                if (!Intrinsics.g(market.id, market2.id)) {
                                }
                            }
                            size = arrayListA.size();
                            while (i2 < size) {
                                Object obj7 = arrayListA.get(i2);
                                i2++;
                                ((Market) obj7).update(e880Var.b);
                                iIndexOf = list.indexOf(preMatchEventData);
                                numValueOf = Integer.valueOf(iIndexOf);
                                if (iIndexOf < 0) {
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    iIntValue = numValueOf.intValue();
                                    tf20Var = ej20VarH1.r;
                                    if (tf20Var != null) {
                                        tf20Var.notifyItemChanged(iIntValue);
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
