package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.feature.recap.data.remote.dto.NetworkRecapData;
import com.sportybet.feature.recap.data.remote.dto.NetworkRecapMarketItem;
import com.sportybet.feature.recap.data.remote.dto.NetworkRecapPlayedSports;
import com.sportybet.feature.recap.data.remote.dto.NetworkRecapTicketStats;
import com.sportybet.feature.recap.data.remote.dto.NetworkRecapTopMarkets;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.recap.data.repository.RecapRepositoryImpl$getRecapData$2", f = "RecapRepositoryImpl.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class ie40 extends tje0 implements Function2<v5b, v1b<? super gd40>, Object> {
    public int a;
    public final /* synthetic */ me40 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie40(me40 me40Var, int i, v1b<? super ie40> v1bVar) {
        super(2, v1bVar);
        this.b = me40Var;
        this.c = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ie40(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super gd40> v1bVar) {
        return ((ie40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [m2g] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [m2g] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3, types: [m2g] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        t1g0 t1g0Var;
        equ equVar;
        Integer value;
        qqf0 qqf0Var;
        String valueType;
        ro10 ro10Var;
        y5b y5bVar = y5b.a;
        int i = this.a;
        List list = null;
        if (i == 0) {
            uj50.b(obj);
            t840 t840Var = this.b.a;
            this.a = 1;
            obj = t840Var.a(this.c, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        NetworkRecapData networkRecapData = (NetworkRecapData) n52.b((BaseResponse) obj);
        networkRecapData.getClass();
        List<NetworkRecapPlayedSports> playedSports = networkRecapData.getPlayedSports();
        if (playedSports != null) {
            arrayList = new ArrayList();
            for (NetworkRecapPlayedSports networkRecapPlayedSports : playedSports) {
                networkRecapPlayedSports.getClass();
                String desc = networkRecapPlayedSports.getDesc();
                if (desc == null || (valueType = networkRecapPlayedSports.getValueType()) == null) {
                    ro10Var = null;
                } else {
                    String title = networkRecapPlayedSports.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    List<String> values = networkRecapPlayedSports.getValues();
                    if (values == null) {
                        values = m2g.a;
                    }
                    ro10Var = new ro10(desc, title, valueType, values);
                }
                if (ro10Var != null) {
                    arrayList.add(ro10Var);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = m2g.a;
        }
        List<NetworkRecapTicketStats> ticketStats = networkRecapData.getTicketStats();
        if (ticketStats != null) {
            arrayList2 = new ArrayList();
            for (NetworkRecapTicketStats networkRecapTicketStats : ticketStats) {
                networkRecapTicketStats.getClass();
                String title2 = networkRecapTicketStats.getTitle();
                if (title2 == null || (value = networkRecapTicketStats.getValue()) == null) {
                    qqf0Var = null;
                } else {
                    int iIntValue = value.intValue();
                    String desc2 = networkRecapTicketStats.getDesc();
                    if (desc2 == null) {
                        desc2 = "";
                    }
                    Integer valueType2 = networkRecapTicketStats.getValueType();
                    qqf0Var = new qqf0(desc2, title2, iIntValue, valueType2 != null ? valueType2.intValue() : 0);
                }
                if (qqf0Var != null) {
                    arrayList2.add(qqf0Var);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = m2g.a;
        }
        List<NetworkRecapTopMarkets> topMarkets = networkRecapData.getTopMarkets();
        if (topMarkets != null) {
            ArrayList arrayList4 = new ArrayList();
            for (NetworkRecapTopMarkets networkRecapTopMarkets : topMarkets) {
                networkRecapTopMarkets.getClass();
                String title3 = networkRecapTopMarkets.getTitle();
                if (title3 == null) {
                    t1g0Var = null;
                } else {
                    String desc3 = networkRecapTopMarkets.getDesc();
                    if (desc3 == null) {
                        desc3 = "";
                    }
                    List<NetworkRecapMarketItem> items = networkRecapTopMarkets.getItems();
                    if (items != null) {
                        arrayList3 = new ArrayList();
                        for (NetworkRecapMarketItem networkRecapMarketItem : items) {
                            networkRecapMarketItem.getClass();
                            String category = networkRecapMarketItem.getCategory();
                            if (category == null) {
                                equVar = null;
                            } else {
                                String subCategory = networkRecapMarketItem.getSubCategory();
                                if (subCategory == null) {
                                    subCategory = "";
                                }
                                equVar = new equ(category, subCategory);
                            }
                            if (equVar != null) {
                                arrayList3.add(equVar);
                            }
                        }
                    } else {
                        arrayList3 = 0;
                    }
                    if (arrayList3 == 0) {
                        arrayList3 = m2g.a;
                    }
                    t1g0Var = new t1g0(desc3, title3, arrayList3);
                }
                if (t1g0Var != null) {
                    arrayList4.add(t1g0Var);
                }
            }
            list = arrayList4;
        }
        if (list == null) {
            list = m2g.a;
        }
        Boolean hasRecap = networkRecapData.getHasRecap();
        return new gd40(hasRecap != null ? hasRecap.booleanValue() : false, arrayList, arrayList2, list);
    }
}
