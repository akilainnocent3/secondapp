package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tab implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tab(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                ComposeView composeView = (ComposeView) obj5;
                final fgb fgbVar = (fgb) obj4;
                LoadingState loadingState = (LoadingState) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = 1;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Context context = composeView.getContext();
                    if (context == null) {
                        aVar.N(-1649011373);
                        aVar.H();
                    } else {
                        aVar.N(-1649011372);
                        q8b q8bVar = q8b.d;
                        String str = (String) ((x5a0) fgbVar.c1().D).getValue();
                        ResultWrapper.GenericError error = loadingState.getError();
                        context.getColor(R.color.sh_error_btn_color);
                        cj5 cj5VarU0 = fgbVar.U0();
                        boolean zA = aVar.A(fgbVar);
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new qbb(fgbVar, i2);
                            aVar.r(objY);
                        }
                        Function0 function0 = (Function0) objY;
                        boolean zA2 = aVar.A(fgbVar);
                        Object objY2 = aVar.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new pa7(fgbVar, i3);
                            aVar.r(objY2);
                        }
                        Function0 function1 = (Function0) objY2;
                        Object objY3 = aVar.y();
                        if (objY3 == c0042a) {
                            objY3 = new ca2(1);
                            aVar.r(objY3);
                        }
                        Function0 function2 = (Function0) objY3;
                        Object objY4 = aVar.y();
                        if (objY4 == c0042a) {
                            objY4 = new rbb(0);
                            aVar.r(objY4);
                        }
                        Function1 function3 = (Function1) objY4;
                        boolean zA3 = aVar.A(fgbVar);
                        Object objY5 = aVar.y();
                        if (zA3 || objY5 == c0042a) {
                            objY5 = new Function1() { // from class: sbb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    String str2 = (String) obj6;
                                    str2.getClass();
                                    fgbVar.N0(str2);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY5);
                        }
                        Function1 function4 = (Function1) objY5;
                        Object objY6 = aVar.y();
                        if (objY6 == c0042a) {
                            objY6 = new tbb();
                            aVar.r(objY6);
                        }
                        q8bVar.a(context, str, error, function0, function1, function2, function3, function4, (Function1) objY6, cj5VarU0, aVar, 14352384);
                        ((x5a0) q8bVar.b).setValue(Boolean.TRUE);
                        aVar.H();
                    }
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                final Function2 function5 = (Function2) obj4;
                final op8 op8Var = (op8) obj3;
                final rce0 rce0Var = (rce0) obj;
                final kxa kxaVar = (kxa) obj2;
                final int i4 = kxa.i(kxaVar.a);
                List<vhv> listK = rce0Var.K(l3f0.a, (op8) obj5);
                int size = listK.size();
                final bq40 bq40Var = new bq40();
                if (size > 0) {
                    bq40Var.a = i4 / size;
                }
                Integer numValueOf = 0;
                int size2 = listK.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    numValueOf = Integer.valueOf(Math.max(listK.get(i5).x(bq40Var.a), numValueOf.intValue()));
                }
                final int iIntValue2 = numValueOf.intValue();
                final ArrayList arrayList = new ArrayList(listK.size());
                int i6 = 0;
                for (int size3 = listK.size(); i6 < size3; size3 = size3) {
                    vhv vhvVar = listK.get(i6);
                    int i7 = bq40Var.a;
                    arrayList.add(vhvVar.d0(kxa.a(i7, i7, iIntValue2, iIntValue2)));
                    i6++;
                }
                final ArrayList arrayList2 = new ArrayList(size);
                while (i2 < size) {
                    arrayList2.add(new z1f0(rce0Var.u1(bq40Var.a) * i2, rce0Var.u1(bq40Var.a), ((g7f) wl8.d(new g7f(rce0Var.u1(Math.min(listK.get(i2).b0(iIntValue2), bq40Var.a)) - (w1f0.b * 2.0f)), new g7f(24.0f))).a));
                    i2++;
                }
                return t.z1(rce0Var, i4, iIntValue2, new Function1() { // from class: g3f0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        int i8;
                        y.a aVar2 = (y.a) obj6;
                        ArrayList arrayList3 = arrayList;
                        int size4 = arrayList3.size();
                        for (int i9 = 0; i9 < size4; i9++) {
                            y.a.A(aVar2, (y) arrayList3.get(i9), bq40Var.a * i9, 0);
                        }
                        l3f0 l3f0Var = l3f0.b;
                        rce0 rce0Var2 = rce0Var;
                        List<vhv> listK2 = rce0Var2.K(l3f0Var, function5);
                        int size5 = listK2.size();
                        int i10 = 0;
                        while (true) {
                            i8 = iIntValue2;
                            if (i10 >= size5) {
                                break;
                            }
                            y yVarD0 = listK2.get(i10).d0(kxa.b(0, 0, 0, 0, 11, kxaVar.a));
                            y.a.A(aVar2, yVarD0, 0, i8 - yVarD0.b);
                            i10++;
                        }
                        List<vhv> listK3 = rce0Var2.K(l3f0.c, new op8(1918742627, new h3f0(op8Var, arrayList2), true));
                        int size6 = listK3.size();
                        for (int i11 = 0; i11 < size6; i11++) {
                            vhv vhvVar2 = listK3.get(i11);
                            int i12 = i4;
                            if (!((i12 >= 0) & (i8 >= 0))) {
                                ykn.a("width and height must be >= 0");
                            }
                            y.a.A(aVar2, vhvVar2.d0(oxa.h(i12, i12, i8, i8)), 0, 0);
                        }
                        return Unit.a;
                    }
                });
        }
    }
}
