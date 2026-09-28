package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.spindabottle.remote.models.DetailResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ve0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ve0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DetailResponse detailResponse;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((l67) obj2).c(obj);
                break;
            default:
                u6j u6jVar = (u6j) obj;
                HTTPResponse hTTPResponse = (HTTPResponse) ((LoadingState) obj2).getData();
                if (hTTPResponse != null && (detailResponse = (DetailResponse) hTTPResponse.getData()) != null) {
                    ArrayList<mk2> arrayList = u6jVar.X;
                    u6jVar.a0 = detailResponse.getDefaultAmount();
                    if (((Number) u6jVar.t0().I.a.getValue()).doubleValue() == 0.0d) {
                        o8j o8jVarT0 = u6jVar.t0();
                        double defaultAmount = detailResponse.getDefaultAmount();
                        wwd0 wwd0Var = o8jVarT0.G;
                        Double dValueOf = Double.valueOf(defaultAmount);
                        wwd0Var.getClass();
                        wwd0Var.k(null, dValueOf);
                    }
                    ArrayList<Double> betChipList = detailResponse.getBetChipList();
                    u6jVar.Z = betChipList;
                    betChipList.getClass();
                    Collections.reverse(betChipList);
                    detailResponse.getMinAmount();
                    detailResponse.getMaxAmount();
                    Map mapF = kpu.f(new Pair(Double.valueOf(0.0d), "yellow"), new Pair(Double.valueOf(0.1d), "yellow"), new Pair(Double.valueOf(0.2d), "american-brown"), new Pair(Double.valueOf(0.5d), "light-green"), new Pair(Double.valueOf(1.0d), "red"), new Pair(Double.valueOf(2.0d), "bright-pink"), new Pair(Double.valueOf(2.5d), "dark-pale"), new Pair(Double.valueOf(3.0d), "dark-pale"), new Pair(Double.valueOf(5.0d), "light-purple"), new Pair(Double.valueOf(7.0d), "light-purple"), new Pair(Double.valueOf(10.0d), "sea-green"), new Pair(Double.valueOf(11.0d), "sea-green"), new Pair(Double.valueOf(20.0d), "dark-sea-green"), new Pair(Double.valueOf(25.0d), "blue"), new Pair(Double.valueOf(50.0d), "green"), new Pair(Double.valueOf(100.0d), "purple"), new Pair(Double.valueOf(200.0d), "light-brown"), new Pair(Double.valueOf(250.0d), "bottle-green"), new Pair(Double.valueOf(500.0d), "brown"), new Pair(Double.valueOf(1000.0d), "navy-blue"), new Pair(Double.valueOf(2000.0d), "dark-orange"), new Pair(Double.valueOf(2500.0d), "parrot-green"), new Pair(Double.valueOf(5000.0d), "grey"), new Pair(Double.valueOf(10000.0d), "pink"), new Pair(Double.valueOf(15000.0d), "pink"), new Pair(Double.valueOf(20000.0d), "dark-red"), new Pair(Double.valueOf(25000.0d), "light-sea-green"), new Pair(Double.valueOf(35000.0d), "light-sea-green"), new Pair(Double.valueOf(50000.0d), "fade-brown"), new Pair(Double.valueOf(100000.0d), "dark-navy-blue"), new Pair(Double.valueOf(200000.0d), "very-light-purple"), new Pair(Double.valueOf(250000.0d), "dark-yellow"), new Pair(Double.valueOf(500000.0d), "pale"), new Pair(Double.valueOf(1000000.0d), "dark-brown"));
                    int i2 = R.drawable.yellow;
                    Pair pair = new Pair("yellow", Integer.valueOf(R.drawable.yellow));
                    Pair pair2 = new Pair("american-brown", Integer.valueOf(R.drawable.american_brown));
                    Pair pair3 = new Pair("light-green", Integer.valueOf(R.drawable.light_green));
                    Pair pair4 = new Pair("red", Integer.valueOf(R.drawable.red));
                    Pair pair5 = new Pair("bright-pink", Integer.valueOf(R.drawable.bright_pink));
                    Pair pair6 = new Pair("dark-pale", Integer.valueOf(R.drawable.dark_pale));
                    Pair pair7 = new Pair("light-purple", Integer.valueOf(R.drawable.light_purple));
                    Integer numValueOf = Integer.valueOf(R.drawable.sea_green);
                    Map mapF2 = kpu.f(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("sea-green", numValueOf), new Pair("dark-sea-green", numValueOf), new Pair("blue", Integer.valueOf(R.drawable.blue)), new Pair("green", Integer.valueOf(R.drawable.green)), new Pair("purple", Integer.valueOf(R.drawable.purple)), new Pair("light-brown", Integer.valueOf(R.drawable.light_brown)), new Pair("bottle-green", Integer.valueOf(R.drawable.bottle_green)), new Pair("brown", Integer.valueOf(R.drawable.brown)), new Pair("navy-blue", Integer.valueOf(R.drawable.navy_blue)), new Pair("dark-orange", Integer.valueOf(R.drawable.dark_orange)), new Pair("parrot-green", Integer.valueOf(R.drawable.parrot_green)), new Pair("grey", Integer.valueOf(R.drawable.grey)), new Pair("pink", Integer.valueOf(R.drawable.pink)), new Pair("dark-red", Integer.valueOf(R.drawable.dark_red)), new Pair("light-sea-green", Integer.valueOf(R.drawable.light_sea_green)), new Pair("fade-brown", Integer.valueOf(R.drawable.fade_brown)), new Pair("dark-navy-blue", Integer.valueOf(R.drawable.dark_navy_blue)), new Pair("very-light-purple", Integer.valueOf(R.drawable.very_light_purple)), new Pair("dark-yellow", Integer.valueOf(R.drawable.dark_yellow)), new Pair("pale", Integer.valueOf(R.drawable.pale)), new Pair("dark-brown", Integer.valueOf(R.drawable.dark_brown)), new Pair("light-blue", Integer.valueOf(R.drawable.light_blue)), new Pair("sky-blue", Integer.valueOf(R.drawable.sky_blue)), new Pair("light-grey", Integer.valueOf(R.drawable.light_grey)), new Pair("orange", Integer.valueOf(R.drawable.orange)));
                    arrayList.clear();
                    Iterator<Double> it = u6jVar.Z.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        Double next = it.next();
                        next.getClass();
                        double dDoubleValue = next.doubleValue();
                        Integer num = (Integer) mapF2.get(mapF.get(Double.valueOf(dDoubleValue)));
                        int iIntValue = num != null ? num.intValue() : i2;
                        arrayList.add(new mk2(iIntValue, dDoubleValue));
                        i2 = iIntValue;
                    }
                    o8j o8jVarT1 = u6jVar.t0();
                    uf00 uf00VarF = a4h.f(CollectionsKt.m0(arrayList));
                    double minAmount = detailResponse.getMinAmount();
                    double maxAmount = detailResponse.getMaxAmount();
                    double defaultAmount2 = detailResponse.getDefaultAmount();
                    uf00VarF.getClass();
                    ej5.c(o8i0.d(o8jVarT1), null, null, new r8j(o8jVarT1, uf00VarF, minAmount, maxAmount, defaultAmount2, null), 3);
                }
                break;
        }
        return Unit.a;
    }
}
